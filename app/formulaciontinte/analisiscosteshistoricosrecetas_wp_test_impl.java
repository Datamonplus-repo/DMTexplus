package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisiscosteshistoricosrecetas_wp_test_impl extends GXWebPanel
{
   public analisiscosteshistoricosrecetas_wp_test_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public analisiscosteshistoricosrecetas_wp_test_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscosteshistoricosrecetas_wp_test_impl.class ));
   }

   public analisiscosteshistoricosrecetas_wp_test_impl( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridanalisiscosteshistoricosrecetas_sdts") == 0 )
         {
            gxnrgridanalisiscosteshistoricosrecetas_sdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridanalisiscosteshistoricosrecetas_sdts") == 0 )
         {
            gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh_invoke( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridanalisiscosteshistoricosrecetas_sdts_newrow_invoke( )
   {
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridanalisiscosteshistoricosrecetas_sdts_newrow( ) ;
      /* End function gxnrGridanalisiscosteshistoricosrecetas_sdts_newrow_invoke */
   }

   public void gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh_invoke( )
   {
      subGridanalisiscosteshistoricosrecetas_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridanalisiscosteshistoricosrecetas_sdts_Rows"))) ;
      AV48HreRacab = httpContext.GetPar( "HreRacab") ;
      AV30Calculo = (byte)(GXutil.lval( httpContext.GetPar( "Calculo"))) ;
      AV22ARtcod1 = httpContext.GetPar( "ARtcod1") ;
      AV23ARtcod3 = httpContext.GetPar( "ARtcod3") ;
      AV26Barcolnom1 = httpContext.GetPar( "Barcolnom1") ;
      AV27Barcolnom3 = httpContext.GetPar( "Barcolnom3") ;
      AV28Barcolnum1 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum1"))) ;
      AV29Barcolnum3 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum3"))) ;
      AV31Clicod1 = (int)(GXutil.lval( httpContext.GetPar( "Clicod1"))) ;
      AV32Clicod3 = (int)(GXutil.lval( httpContext.GetPar( "Clicod3"))) ;
      AV39Intcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod1"))) ;
      AV40Intcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod3"))) ;
      AV41TipArtCod1 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod1"))) ;
      AV42TipArtCod3 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod3"))) ;
      AV43Tipcolcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod1"))) ;
      AV44Tipcolcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod3"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh( subGridanalisiscosteshistoricosrecetas_sdts_Rows, AV48HreRacab, AV30Calculo, AV22ARtcod1, AV23ARtcod3, AV26Barcolnom1, AV27Barcolnom3, AV28Barcolnum1, AV29Barcolnum3, AV31Clicod1, AV32Clicod3, AV39Intcod1, AV40Intcod3, AV41TipArtCod1, AV42TipArtCod3, AV43Tipcolcod1, AV44Tipcolcod3) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridanalisiscosteshistoricosrecetas_sdts_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1M82( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1M82( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1M82( ) ;
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
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( httpContext.getMessage( "Analisis Costes Historicos Recetas (test SDT)", "")) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.analisiscosteshistoricosrecetas_wp_test", new String[] {}, new String[] {}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRERACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48HreRacab, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22ARtcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23ARtcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Barcolnom1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Barcolnom3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Barcolnum1), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Barcolnum3), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Clicod1), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32Clicod3), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Intcod1), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Intcod3), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPARTCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41TipArtCod1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPARTCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42TipArtCod3), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43Tipcolcod1), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44Tipcolcod3), "Z9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Analisiscosteshistoricosrecetas_sdts", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Analisiscosteshistoricosrecetas_sdts", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_65, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDANALISISCOSTESHISTORICOSRECETAS_SDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV16GridAnalisisCostesHistoricosRecetas_SDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV17GridAnalisisCostesHistoricosRecetas_SDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHRERACAB", GXutil.rtrim( AV48HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRERACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48HreRacab, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCULO", GXutil.ltrim( localUtil.ntoc( AV30Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD1", GXutil.rtrim( AV22ARtcod1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22ARtcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD3", GXutil.rtrim( AV23ARtcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23ARtcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM1", GXutil.rtrim( AV26Barcolnom1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Barcolnom1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM3", GXutil.rtrim( AV27Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Barcolnom3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM1", GXutil.ltrim( localUtil.ntoc( AV28Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Barcolnum1), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM3", GXutil.ltrim( localUtil.ntoc( AV29Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Barcolnum3), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD1", GXutil.ltrim( localUtil.ntoc( AV31Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Clicod1), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD3", GXutil.ltrim( localUtil.ntoc( AV32Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32Clicod3), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTCOD1", GXutil.ltrim( localUtil.ntoc( AV39Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Intcod1), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTCOD3", GXutil.ltrim( localUtil.ntoc( AV40Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Intcod3), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD1", GXutil.ltrim( localUtil.ntoc( AV41TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPARTCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41TipArtCod1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD3", GXutil.ltrim( localUtil.ntoc( AV42TipArtCod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPARTCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42TipArtCod3), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD1", GXutil.ltrim( localUtil.ntoc( AV43Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43Tipcolcod1), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD3", GXutil.ltrim( localUtil.ntoc( AV44Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44Tipcolcod3), "Z9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vANALISISCOSTESHISTORICOSRECETAS_SDTS", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vANALISISCOSTESHISTORICOSRECETAS_SDTS", AV13AnalisisCostesHistoricosRecetas_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Class", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Previous", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Next", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Caption", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1M82( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.AnalisisCostesHistoricosRecetas_WP_test" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Analisis Costes Historicos Recetas (test SDT)", "") ;
   }

   public void wb1M80( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV24barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24barcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24barcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV19barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19barcodreo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV19barcodreo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV25barcodpar), GXutil.rtrim( localUtil.format( AV25barcodpar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec1_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec1_Internalname, localUtil.format(AV36Fec1, "99/99/99"), localUtil.format( AV36Fec1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec2_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec2_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec2_Internalname, localUtil.format(AV37Fec2, "99/99/99"), localUtil.format( AV37Fec2, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec2_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec2_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
         httpContext.writeTextNL( "</div>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 65, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridanalisiscosteshistoricosrecetas_sdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol65( ) ;
      }
      if ( wbEnd == 65 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_65 = (int)(nGXsfl_65_idx-1) ;
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV51GXV1 = nGXsfl_65_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridanalisiscosteshistoricosrecetas_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridanalisiscosteshistoricosrecetas_sdts", Gridanalisiscosteshistoricosrecetas_sdtsContainer, subGridanalisiscosteshistoricosrecetas_sdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridanalisiscosteshistoricosrecetas_sdtsContainerData", Gridanalisiscosteshistoricosrecetas_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridanalisiscosteshistoricosrecetas_sdtsContainerData"+"V", Gridanalisiscosteshistoricosrecetas_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridanalisiscosteshistoricosrecetas_sdtsContainerData"+"V"+"\" value='"+Gridanalisiscosteshistoricosrecetas_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("Class", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Class);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("ShowFirst", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showfirst);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("ShowPrevious", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showprevious);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("ShowNext", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Shownext);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("ShowLast", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showlast);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("PagesToShow", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagestoshow);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("PagingButtonsPosition", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingbuttonsposition);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("PagingCaptionPosition", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingcaptionposition);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("EmptyGridClass", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridclass);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("RowsPerPageSelector", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselector);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("RowsPerPageOptions", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageoptions);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("Previous", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Previous);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("Next", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Next);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("Caption", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Caption);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("EmptyGridCaption", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridcaption);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("RowsPerPageCaption", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpagecaption);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("CurrentPage", AV16GridAnalisisCostesHistoricosRecetas_SDTsCurrentPage);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.setProperty("PageCount", AV17GridAnalisisCostesHistoricosRecetas_SDTsPageCount);
         ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Internalname, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBARContainer");
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
         /* User Defined Control */
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVartojson_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVartojson_Internalname, httpContext.getMessage( "tojson", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavVartojson_Internalname, AV11vartojson, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", (short)(0), 1, edtavVartojson_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "4000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVarxml_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVarxml_Internalname, httpContext.getMessage( "xml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavVarxml_Internalname, AV12varxml, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", (short)(0), 1, edtavVarxml_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_FormulacionTinte\\AnalisisCostesHistoricosRecetas_WP_test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridanalisiscosteshistoricosrecetas_sdts_empowerer.render(context, "wwp.gridempowerer", Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Internalname, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_EMPOWERERContainer");
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
            if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV51GXV1 = nGXsfl_65_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridanalisiscosteshistoricosrecetas_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridanalisiscosteshistoricosrecetas_sdts", Gridanalisiscosteshistoricosrecetas_sdtsContainer, subGridanalisiscosteshistoricosrecetas_sdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridanalisiscosteshistoricosrecetas_sdtsContainerData", Gridanalisiscosteshistoricosrecetas_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridanalisiscosteshistoricosrecetas_sdtsContainerData"+"V", Gridanalisiscosteshistoricosrecetas_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridanalisiscosteshistoricosrecetas_sdtsContainerData"+"V"+"\" value='"+Gridanalisiscosteshistoricosrecetas_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1M82( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Analisis Costes Historicos Recetas (test SDT)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1M80( ) ;
   }

   public void ws1M82( )
   {
      start1M82( ) ;
      evt1M82( ) ;
   }

   public void evt1M82( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
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
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR.CHANGEPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e111M82 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e121M82 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoConfirmar' */
                        e131M82 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        dynload_actions( ) ;
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 45), "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_65_idx = (int)(GXutil.lval( sEvtType)) ;
                        sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
                        subsflControlProps_652( ) ;
                        AV51GXV1 = (int)(nGXsfl_65_idx+GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage) ;
                        if ( ( AV13AnalisisCostesHistoricosRecetas_SDTs.size() >= AV51GXV1 ) && ( AV51GXV1 > 0 ) )
                        {
                           AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: Start */
                              e141M82 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: Refresh */
                              e151M82 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              e161M82 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 if ( ! Rfr0gs )
                                 {
                                 }
                                 dynload_actions( ) ;
                              }
                              /* No code required for Cancel button. It is implemented as the Reset button. */
                           }
                           else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
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

   public void we1M82( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1M82( ) ;
         }
      }
   }

   public void pa1M82( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridanalisiscosteshistoricosrecetas_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_652( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         sendrow_652( ) ;
         nGXsfl_65_idx = ((subGridanalisiscosteshistoricosrecetas_sdts_Islastpage==1)&&(nGXsfl_65_idx+1>subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_652( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridanalisiscosteshistoricosrecetas_sdtsContainer)) ;
      /* End function gxnrGridanalisiscosteshistoricosrecetas_sdts_newrow */
   }

   public void gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh( int subGridanalisiscosteshistoricosrecetas_sdts_Rows ,
                                                                     String AV48HreRacab ,
                                                                     byte AV30Calculo ,
                                                                     String AV22ARtcod1 ,
                                                                     String AV23ARtcod3 ,
                                                                     String AV26Barcolnom1 ,
                                                                     String AV27Barcolnom3 ,
                                                                     int AV28Barcolnum1 ,
                                                                     int AV29Barcolnum3 ,
                                                                     int AV31Clicod1 ,
                                                                     int AV32Clicod3 ,
                                                                     byte AV39Intcod1 ,
                                                                     byte AV40Intcod3 ,
                                                                     short AV41TipArtCod1 ,
                                                                     short AV42TipArtCod3 ,
                                                                     byte AV43Tipcolcod1 ,
                                                                     byte AV44Tipcolcod3 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e151M82 ();
      GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nCurrentRecord = 0 ;
      rf1M82( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridanalisiscosteshistoricosrecetas_sdts_refresh */
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
      rf1M82( ) ;
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
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavVartojson_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVartojson_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVartojson_Enabled), 5, 0), true);
      edtavVarxml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVarxml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVarxml_Enabled), 5, 0), true);
   }

   public void rf1M82( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.ClearRows();
      }
      wbStart = (short)(65) ;
      /* Execute user event: Refresh */
      e151M82 ();
      nGXsfl_65_idx = 1 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_652( ) ;
      bGXsfl_65_Refreshing = true ;
      Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("GridName", "Gridanalisiscosteshistoricosrecetas_sdts");
      Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("CmpContext", "");
      Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridanalisiscosteshistoricosrecetas_sdtsContainer.setPageSize( subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_652( ) ;
         e161M82 ();
         if ( ( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nCurrentRecord > 0 ) && ( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_65_idx == 1 ) )
         {
            GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nCurrentRecord = 0 ;
            GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nGridOutOfScope = 1 ;
            subgridanalisiscosteshistoricosrecetas_sdts_firstpage( ) ;
            e161M82 ();
         }
         wbEnd = (short)(65) ;
         wb1M80( ) ;
      }
      bGXsfl_65_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1M82( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vHRERACAB", GXutil.rtrim( AV48HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRERACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48HreRacab, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCULO", GXutil.ltrim( localUtil.ntoc( AV30Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD1", GXutil.rtrim( AV22ARtcod1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22ARtcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD3", GXutil.rtrim( AV23ARtcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23ARtcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM1", GXutil.rtrim( AV26Barcolnom1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Barcolnom1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM3", GXutil.rtrim( AV27Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Barcolnom3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM1", GXutil.ltrim( localUtil.ntoc( AV28Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Barcolnum1), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM3", GXutil.ltrim( localUtil.ntoc( AV29Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Barcolnum3), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD1", GXutil.ltrim( localUtil.ntoc( AV31Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Clicod1), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD3", GXutil.ltrim( localUtil.ntoc( AV32Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32Clicod3), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTCOD1", GXutil.ltrim( localUtil.ntoc( AV39Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Intcod1), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTCOD3", GXutil.ltrim( localUtil.ntoc( AV40Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Intcod3), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD1", GXutil.ltrim( localUtil.ntoc( AV41TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPARTCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41TipArtCod1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD3", GXutil.ltrim( localUtil.ntoc( AV42TipArtCod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPARTCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42TipArtCod3), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD1", GXutil.ltrim( localUtil.ntoc( AV43Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43Tipcolcod1), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD3", GXutil.ltrim( localUtil.ntoc( AV44Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44Tipcolcod3), "Z9")));
   }

   public int subgridanalisiscosteshistoricosrecetas_sdts_fnc_pagecount( )
   {
      GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount = subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount) % (subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount/ (double) (subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount/ (double) (subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordcount( )
   {
      return AV13AnalisisCostesHistoricosRecetas_SDTs.size() ;
   }

   public int subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )
   {
      if ( subGridanalisiscosteshistoricosrecetas_sdts_Rows > 0 )
      {
         return subGridanalisiscosteshistoricosrecetas_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridanalisiscosteshistoricosrecetas_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage/ (double) (subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridanalisiscosteshistoricosrecetas_sdts_firstpage( )
   {
      GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh( subGridanalisiscosteshistoricosrecetas_sdts_Rows, AV48HreRacab, AV30Calculo, AV22ARtcod1, AV23ARtcod3, AV26Barcolnom1, AV27Barcolnom3, AV28Barcolnum1, AV29Barcolnum3, AV31Clicod1, AV32Clicod3, AV39Intcod1, AV40Intcod3, AV41TipArtCod1, AV42TipArtCod3, AV43Tipcolcod1, AV44Tipcolcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridanalisiscosteshistoricosrecetas_sdts_nextpage( )
   {
      GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount = subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordcount( ) ;
      if ( ( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount >= subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( ) ) && ( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF == 0 ) )
      {
         GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage = (long)(GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage+subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage", GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh( subGridanalisiscosteshistoricosrecetas_sdts_Rows, AV48HreRacab, AV30Calculo, AV22ARtcod1, AV23ARtcod3, AV26Barcolnom1, AV27Barcolnom3, AV28Barcolnum1, AV29Barcolnum3, AV31Clicod1, AV32Clicod3, AV39Intcod1, AV40Intcod3, AV41TipArtCod1, AV42TipArtCod3, AV43Tipcolcod1, AV44Tipcolcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridanalisiscosteshistoricosrecetas_sdts_previouspage( )
   {
      if ( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage >= subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( ) )
      {
         GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage = (long)(GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage-subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh( subGridanalisiscosteshistoricosrecetas_sdts_Rows, AV48HreRacab, AV30Calculo, AV22ARtcod1, AV23ARtcod3, AV26Barcolnom1, AV27Barcolnom3, AV28Barcolnum1, AV29Barcolnum3, AV31Clicod1, AV32Clicod3, AV39Intcod1, AV40Intcod3, AV41TipArtCod1, AV42TipArtCod3, AV43Tipcolcod1, AV44Tipcolcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridanalisiscosteshistoricosrecetas_sdts_lastpage( )
   {
      GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount = subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordcount( ) ;
      if ( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount > subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount) % (subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage = (long)(GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount-subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage = (long)(GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount-((int)((GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount) % (subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh( subGridanalisiscosteshistoricosrecetas_sdts_Rows, AV48HreRacab, AV30Calculo, AV22ARtcod1, AV23ARtcod3, AV26Barcolnom1, AV27Barcolnom3, AV28Barcolnum1, AV29Barcolnum3, AV31Clicod1, AV32Clicod3, AV39Intcod1, AV40Intcod3, AV41TipArtCod1, AV42TipArtCod3, AV43Tipcolcod1, AV44Tipcolcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridanalisiscosteshistoricosrecetas_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage = (long)(subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh( subGridanalisiscosteshistoricosrecetas_sdts_Rows, AV48HreRacab, AV30Calculo, AV22ARtcod1, AV23ARtcod3, AV26Barcolnom1, AV27Barcolnom3, AV28Barcolnum1, AV29Barcolnum3, AV31Clicod1, AV32Clicod3, AV39Intcod1, AV40Intcod3, AV41TipArtCod1, AV42TipArtCod3, AV43Tipcolcod1, AV44Tipcolcod3) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtavVartojson_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVartojson_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVartojson_Enabled), 5, 0), true);
      edtavVarxml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVarxml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVarxml_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1M80( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141M82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Analisiscosteshistoricosrecetas_sdts"), AV13AnalisisCostesHistoricosRecetas_SDTs);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vANALISISCOSTESHISTORICOSRECETAS_SDTS"), AV13AnalisisCostesHistoricosRecetas_SDTs);
         /* Read saved values. */
         nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV16GridAnalisisCostesHistoricosRecetas_SDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDANALISISCOSTESHISTORICOSRECETAS_SDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV17GridAnalisisCostesHistoricosRecetas_SDTsPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridanalisiscosteshistoricosrecetas_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Class = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Class") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Showfirst")) ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Showprevious")) ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Shownext")) ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Showlast")) ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Emptygridclass") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Previous = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Previous") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Next = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Next") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Caption = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Caption") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Emptygridcaption") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
         Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_EMPOWERER_Gridinternalname") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Selectedpage = httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Selectedpage") ;
         Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_65_fel_idx = 0 ;
         while ( nGXsfl_65_fel_idx < nRC_GXsfl_65 )
         {
            nGXsfl_65_fel_idx = ((subGridanalisiscosteshistoricosrecetas_sdts_Islastpage==1)&&(nGXsfl_65_fel_idx+1>subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_65_fel_idx+1) ;
            sGXsfl_65_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_652( ) ;
            AV51GXV1 = (int)(nGXsfl_65_fel_idx+GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage) ;
            if ( ( AV13AnalisisCostesHistoricosRecetas_SDTs.size() >= AV51GXV1 ) && ( AV51GXV1 > 0 ) )
            {
               AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)) );
            }
         }
         if ( nGXsfl_65_fel_idx == 0 )
         {
            nGXsfl_65_idx = 1 ;
            sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_652( ) ;
         }
         nGXsfl_65_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24barcod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24barcod), 8, 0));
         }
         else
         {
            AV24barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24barcod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19barcodreo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19barcodreo", GXutil.str( AV19barcodreo, 1, 0));
         }
         else
         {
            AV19barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19barcodreo", GXutil.str( AV19barcodreo, 1, 0));
         }
         AV25barcodpar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25barcodpar", AV25barcodpar);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC1");
            GX_FocusControl = edtavFec1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36Fec1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Fec1", localUtil.format(AV36Fec1, "99/99/99"));
         }
         else
         {
            AV36Fec1 = localUtil.ctod( httpContext.cgiGet( edtavFec1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Fec1", localUtil.format(AV36Fec1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC2");
            GX_FocusControl = edtavFec2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37Fec2 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37Fec2", localUtil.format(AV37Fec2, "99/99/99"));
         }
         else
         {
            AV37Fec2 = localUtil.ctod( httpContext.cgiGet( edtavFec2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37Fec2", localUtil.format(AV37Fec2, "99/99/99"));
         }
         AV11vartojson = httpContext.cgiGet( edtavVartojson_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11vartojson", AV11vartojson);
         AV12varxml = httpContext.cgiGet( edtavVarxml_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12varxml", AV12varxml);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e141M82 ();
      if (returnInSub) return;
   }

   public void e141M82( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV82Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      analisiscosteshistoricosrecetas_wp_test_impl.this.GXt_char1 = GXv_char2[0] ;
      AV82Station = GXt_char1 ;
      GXv_char2[0] = AV47Emprcod ;
      GXv_char3[0] = AV83Emprnom ;
      GXv_char4[0] = AV84Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV82Station, GXv_char2, GXv_char3, GXv_char4) ;
      analisiscosteshistoricosrecetas_wp_test_impl.this.AV47Emprcod = GXv_char2[0] ;
      analisiscosteshistoricosrecetas_wp_test_impl.this.AV83Emprnom = GXv_char3[0] ;
      analisiscosteshistoricosrecetas_wp_test_impl.this.AV84Usurcod = GXv_char4[0] ;
      Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Gridinternalname = subGridanalisiscosteshistoricosrecetas_sdts_Internalname ;
      ucGridanalisiscosteshistoricosrecetas_sdts_empowerer.sendProperty(context, "", false, Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Internalname, "GridInternalName", Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Gridinternalname);
      subGridanalisiscosteshistoricosrecetas_sdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue = subGridanalisiscosteshistoricosrecetas_sdts_Rows ;
      ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar.sendProperty(context, "", false, Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e151M82( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV16GridAnalisisCostesHistoricosRecetas_SDTsCurrentPage = subgridanalisiscosteshistoricosrecetas_sdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16GridAnalisisCostesHistoricosRecetas_SDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridAnalisisCostesHistoricosRecetas_SDTsCurrentPage), 10, 0));
      AV17GridAnalisisCostesHistoricosRecetas_SDTsPageCount = subgridanalisiscosteshistoricosrecetas_sdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17GridAnalisisCostesHistoricosRecetas_SDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridAnalisisCostesHistoricosRecetas_SDTsPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e161M82( )
   {
      /* Gridanalisiscosteshistoricosrecetas_sdts_Load Routine */
      returnInSub = false ;
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV13AnalisisCostesHistoricosRecetas_SDTs.size() )
      {
         AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(65) ;
         }
         if ( ( subGridanalisiscosteshistoricosrecetas_sdts_Islastpage == 1 ) || ( subGridanalisiscosteshistoricosrecetas_sdts_Rows == 0 ) || ( ( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nCurrentRecord >= GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage ) && ( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nCurrentRecord < GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage + subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_652( ) ;
            GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nCurrentRecord + 1 >= subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordcount( ) )
            {
               GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nCurrentRecord = (long)(GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_65_Refreshing )
         {
            httpContext.doAjaxLoad(65, Gridanalisiscosteshistoricosrecetas_sdtsRow);
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void e111M82( )
   {
      /* Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridanalisiscosteshistoricosrecetas_sdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV15PageToGo = subgridanalisiscosteshistoricosrecetas_sdts_fnc_currentpage( ) ;
         AV15PageToGo = (int)(AV15PageToGo+1) ;
         subgridanalisiscosteshistoricosrecetas_sdts_gotopage( AV15PageToGo) ;
      }
      else
      {
         AV15PageToGo = (int)(GXutil.lval( Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Selectedpage)) ;
         subgridanalisiscosteshistoricosrecetas_sdts_gotopage( AV15PageToGo) ;
      }
   }

   public void e121M82( )
   {
      /* Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridanalisiscosteshistoricosrecetas_sdts_Rows = Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridanalisiscosteshistoricosrecetas_sdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131M82( )
   {
      AV51GXV1 = (int)(nGXsfl_65_idx+GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage) ;
      if ( ( AV51GXV1 > 0 ) && ( AV13AnalisisCostesHistoricosRecetas_SDTs.size() >= AV51GXV1 ) )
      {
         AV13AnalisisCostesHistoricosRecetas_SDTs.currentItem( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)) );
      }
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      AV47Emprcod = "001" ;
      AV45ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV45ProgressIndicator.showwithtitle(httpContext.getMessage( "Executing action", ""));
      AV45ProgressIndicator.setgxTv_SdtProgress_Value( 10 );
      AV45ProgressIndicator.setgxTv_SdtProgress_Value( 30 );
      AV45ProgressIndicator.setgxTv_SdtProgress_Value( 70 );
      GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT5 = AV13AnalisisCostesHistoricosRecetas_SDTs ;
      GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT6[0] = GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT5 ;
      new app.formulaciontinte.analisiscosteshistoricosrecetas_dp(remoteHandle, context).execute( AV47Emprcod, AV48HreRacab, AV36Fec1, AV37Fec2, AV30Calculo, AV24barcod, AV19barcodreo, AV25barcodpar, AV22ARtcod1, AV23ARtcod3, AV26Barcolnom1, AV27Barcolnom3, AV28Barcolnum1, AV29Barcolnum3, AV31Clicod1, AV32Clicod3, AV39Intcod1, AV40Intcod3, AV41TipArtCod1, AV42TipArtCod3, AV43Tipcolcod1, AV44Tipcolcod3, GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT6) ;
      GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT5 = GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT6[0] ;
      AV13AnalisisCostesHistoricosRecetas_SDTs = GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT5 ;
      gx_BV65 = true ;
      AV13AnalisisCostesHistoricosRecetas_SDTs.sort(httpContext.getMessage( "ItemOrderSDT", ""));
      gx_BV65 = true ;
      AV45ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV45ProgressIndicator.hide();
      AV11vartojson = AV13AnalisisCostesHistoricosRecetas_SDTs.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11vartojson", AV11vartojson);
      AV12varxml = AV13AnalisisCostesHistoricosRecetas_SDTs.toxml(false, true, "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDTCollection", "TexplusNET") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12varxml", AV12varxml);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45ProgressIndicator", AV45ProgressIndicator);
      if ( gx_BV65 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13AnalisisCostesHistoricosRecetas_SDTs", AV13AnalisisCostesHistoricosRecetas_SDTs);
         nGXsfl_65_bak_idx = nGXsfl_65_idx ;
         gxgrgridanalisiscosteshistoricosrecetas_sdts_refresh( subGridanalisiscosteshistoricosrecetas_sdts_Rows, AV48HreRacab, AV30Calculo, AV22ARtcod1, AV23ARtcod3, AV26Barcolnom1, AV27Barcolnom3, AV28Barcolnum1, AV29Barcolnum3, AV31Clicod1, AV32Clicod3, AV39Intcod1, AV40Intcod3, AV41TipArtCod1, AV42TipArtCod3, AV43Tipcolcod1, AV44Tipcolcod3) ;
         nGXsfl_65_idx = nGXsfl_65_bak_idx ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_652( ) ;
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
      pa1M82( ) ;
      ws1M82( ) ;
      we1M82( ) ;
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016434258", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("formulaciontinte/analisiscosteshistoricosrecetas_wp_test.js", "?202661016434258", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_652( )
   {
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__ITEMORDERSDT_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGRLOT_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSI_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSA_"+sGXsfl_65_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__TABLAA_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_652( )
   {
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__ITEMORDERSDT_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGRLOT_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSI_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSA_"+sGXsfl_65_fel_idx ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__TABLAA_"+sGXsfl_65_fel_idx ;
   }

   public void sendrow_652( )
   {
      subsflControlProps_652( ) ;
      wb1M80( ) ;
      if ( ( subGridanalisiscosteshistoricosrecetas_sdts_Rows * 1 == 0 ) || ( nGXsfl_65_idx <= subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridanalisiscosteshistoricosrecetas_sdtsRow = GXWebRow.GetNew(context,Gridanalisiscosteshistoricosrecetas_sdtsContainer) ;
         if ( subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridanalisiscosteshistoricosrecetas_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridanalisiscosteshistoricosrecetas_sdts_Class, "") != 0 )
            {
               subGridanalisiscosteshistoricosrecetas_sdts_Linesclass = subGridanalisiscosteshistoricosrecetas_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridanalisiscosteshistoricosrecetas_sdts_Backstyle = (byte)(0) ;
            subGridanalisiscosteshistoricosrecetas_sdts_Backcolor = subGridanalisiscosteshistoricosrecetas_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridanalisiscosteshistoricosrecetas_sdts_Class, "") != 0 )
            {
               subGridanalisiscosteshistoricosrecetas_sdts_Linesclass = subGridanalisiscosteshistoricosrecetas_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridanalisiscosteshistoricosrecetas_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridanalisiscosteshistoricosrecetas_sdts_Class, "") != 0 )
            {
               subGridanalisiscosteshistoricosrecetas_sdts_Linesclass = subGridanalisiscosteshistoricosrecetas_sdts_Class+"Odd" ;
            }
            subGridanalisiscosteshistoricosrecetas_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridanalisiscosteshistoricosrecetas_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
            {
               subGridanalisiscosteshistoricosrecetas_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridanalisiscosteshistoricosrecetas_sdts_Class, "") != 0 )
               {
                  subGridanalisiscosteshistoricosrecetas_sdts_Linesclass = subGridanalisiscosteshistoricosrecetas_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridanalisiscosteshistoricosrecetas_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridanalisiscosteshistoricosrecetas_sdts_Class, "") != 0 )
               {
                  subGridanalisiscosteshistoricosrecetas_sdts_Linesclass = subGridanalisiscosteshistoricosrecetas_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_65_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__toa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname,localUtil.format(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin(), "99/99/99"),localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__marca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest()),GXutil.rtrim( localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm(), "ZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm(), "ZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd(), (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd()), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd()), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb(), "ZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb(), "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costei_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__dif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc(), "ZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc(), "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__porc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costek_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridanalisiscosteshistoricosrecetas_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)AV13AnalisisCostesHistoricosRecetas_SDTs.elementAt(-1+AV51GXV1)).getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1M82( ) ;
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddRow(Gridanalisiscosteshistoricosrecetas_sdtsRow);
         nGXsfl_65_idx = ((subGridanalisiscosteshistoricosrecetas_sdts_Islastpage==1)&&(nGXsfl_65_idx+1>subgridanalisiscosteshistoricosrecetas_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_652( ) ;
      }
      /* End function sendrow_652 */
   }

   public void startgridcontrol65( )
   {
      if ( Gridanalisiscosteshistoricosrecetas_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridanalisiscosteshistoricosrecetas_sdtsContainer"+"DivS\" data-gxgridid=\"65\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridanalisiscosteshistoricosrecetas_sdts_Internalname, subGridanalisiscosteshistoricosrecetas_sdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle == 0 )
         {
            subGridanalisiscosteshistoricosrecetas_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridanalisiscosteshistoricosrecetas_sdts_Class) > 0 )
            {
               subGridanalisiscosteshistoricosrecetas_sdts_Linesclass = subGridanalisiscosteshistoricosrecetas_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridanalisiscosteshistoricosrecetas_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle == 1 )
            {
               subGridanalisiscosteshistoricosrecetas_sdts_Titlebackcolor = subGridanalisiscosteshistoricosrecetas_sdts_Allbackcolor ;
               if ( GXutil.len( subGridanalisiscosteshistoricosrecetas_sdts_Class) > 0 )
               {
                  subGridanalisiscosteshistoricosrecetas_sdts_Linesclass = subGridanalisiscosteshistoricosrecetas_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridanalisiscosteshistoricosrecetas_sdts_Class) > 0 )
               {
                  subGridanalisiscosteshistoricosrecetas_sdts_Linesclass = subGridanalisiscosteshistoricosrecetas_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Item Order SDT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ToA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Cierre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Marca", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Inicial", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste kg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo de Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costes Quimicos I", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costes Quimicos A", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tabla", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("GridName", "Gridanalisiscosteshistoricosrecetas_sdts");
      }
      else
      {
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("GridName", "Gridanalisiscosteshistoricosrecetas_sdts");
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Header", subGridanalisiscosteshistoricosrecetas_sdts_Header);
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("CmpContext", "");
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridanalisiscosteshistoricosrecetas_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddColumnProperties(Gridanalisiscosteshistoricosrecetas_sdtsColumn);
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridanalisiscosteshistoricosrecetas_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridanalisiscosteshistoricosrecetas_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavFec1_Internalname = "vFEC1" ;
      edtavFec2_Internalname = "vFEC2" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__ITEMORDERSDT" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__TOA" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREFECTIN" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__MARCA" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HDR" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGREST" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARKGM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETOTKGM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREMAQCOD" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREVOLPRD" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__RB" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEI" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTET" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__DIF" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__PORC" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTEK" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLICOD" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__CLINOM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARSER" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREBARDSC" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPARTD" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNOM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRECOLNUM" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HRETIPCOLN" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__HREINTDSC" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__ENCCLI" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__BARAGRLOT" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSI" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__COSTESQUIMICOSA" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname = "ANALISISCOSTESHISTORICOSRECETAS_SDTS__TABLAA" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Internalname = "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR" ;
      divGridanalisiscosteshistoricosrecetas_sdtstablewithpaginationbar_Internalname = "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      edtavVartojson_Internalname = "vVARTOJSON" ;
      edtavVarxml_Internalname = "vVARXML" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Internalname = "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridanalisiscosteshistoricosrecetas_sdts_Internalname = "GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subGridanalisiscosteshistoricosrecetas_sdts_Allowcollapsing = (byte)(0) ;
      subGridanalisiscosteshistoricosrecetas_sdts_Allowselection = (byte)(0) ;
      subGridanalisiscosteshistoricosrecetas_sdts_Header = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Jsonclick = "" ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = 0 ;
      subGridanalisiscosteshistoricosrecetas_sdts_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle = (byte)(0) ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = -1 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = -1 ;
      edtavVarxml_Enabled = 1 ;
      edtavVartojson_Enabled = 1 ;
      edtavFec2_Jsonclick = "" ;
      edtavFec2_Enabled = 1 ;
      edtavFec1_Jsonclick = "" ;
      edtavFec1_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "tojson_toxml", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingcaptionposition = "Left" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagestoshow = 5 ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Class = "PaginationBar" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      subGridanalisiscosteshistoricosrecetas_sdts_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage'},{av:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF'},{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:65,pic:''},{av:'nGXsfl_65_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:65},{av:'nRC_GXsfl_65',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'GridRC',grid:65},{av:'subGridanalisiscosteshistoricosrecetas_sdts_Rows',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'Rows'},{av:'AV48HreRacab',fld:'vHRERACAB',pic:'',hsh:true},{av:'AV30Calculo',fld:'vCALCULO',pic:'9',hsh:true},{av:'AV22ARtcod1',fld:'vARTCOD1',pic:'',hsh:true},{av:'AV23ARtcod3',fld:'vARTCOD3',pic:'',hsh:true},{av:'AV26Barcolnom1',fld:'vBARCOLNOM1',pic:'',hsh:true},{av:'AV27Barcolnom3',fld:'vBARCOLNOM3',pic:'',hsh:true},{av:'AV28Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9',hsh:true},{av:'AV29Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9',hsh:true},{av:'AV31Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9',hsh:true},{av:'AV32Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9',hsh:true},{av:'AV39Intcod1',fld:'vINTCOD1',pic:'Z9',hsh:true},{av:'AV40Intcod3',fld:'vINTCOD3',pic:'Z9',hsh:true},{av:'AV41TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9',hsh:true},{av:'AV42TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9',hsh:true},{av:'AV43Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9',hsh:true},{av:'AV44Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV16GridAnalisisCostesHistoricosRecetas_SDTsCurrentPage',fld:'vGRIDANALISISCOSTESHISTORICOSRECETAS_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridAnalisisCostesHistoricosRecetas_SDTsPageCount',fld:'vGRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS.LOAD","{handler:'e161M82',iparms:[]");
      setEventMetadata("GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e111M82',iparms:[{av:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage'},{av:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF'},{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:65,pic:''},{av:'nGXsfl_65_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:65},{av:'nRC_GXsfl_65',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'GridRC',grid:65},{av:'subGridanalisiscosteshistoricosrecetas_sdts_Rows',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'Rows'},{av:'AV48HreRacab',fld:'vHRERACAB',pic:'',hsh:true},{av:'AV30Calculo',fld:'vCALCULO',pic:'9',hsh:true},{av:'AV22ARtcod1',fld:'vARTCOD1',pic:'',hsh:true},{av:'AV23ARtcod3',fld:'vARTCOD3',pic:'',hsh:true},{av:'AV26Barcolnom1',fld:'vBARCOLNOM1',pic:'',hsh:true},{av:'AV27Barcolnom3',fld:'vBARCOLNOM3',pic:'',hsh:true},{av:'AV28Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9',hsh:true},{av:'AV29Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9',hsh:true},{av:'AV31Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9',hsh:true},{av:'AV32Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9',hsh:true},{av:'AV39Intcod1',fld:'vINTCOD1',pic:'Z9',hsh:true},{av:'AV40Intcod3',fld:'vINTCOD3',pic:'Z9',hsh:true},{av:'AV41TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9',hsh:true},{av:'AV42TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9',hsh:true},{av:'AV43Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9',hsh:true},{av:'AV44Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9',hsh:true},{av:'Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Selectedpage',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121M82',iparms:[{av:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage'},{av:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF'},{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:65,pic:''},{av:'nGXsfl_65_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:65},{av:'nRC_GXsfl_65',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'GridRC',grid:65},{av:'subGridanalisiscosteshistoricosrecetas_sdts_Rows',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'Rows'},{av:'AV48HreRacab',fld:'vHRERACAB',pic:'',hsh:true},{av:'AV30Calculo',fld:'vCALCULO',pic:'9',hsh:true},{av:'AV22ARtcod1',fld:'vARTCOD1',pic:'',hsh:true},{av:'AV23ARtcod3',fld:'vARTCOD3',pic:'',hsh:true},{av:'AV26Barcolnom1',fld:'vBARCOLNOM1',pic:'',hsh:true},{av:'AV27Barcolnom3',fld:'vBARCOLNOM3',pic:'',hsh:true},{av:'AV28Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9',hsh:true},{av:'AV29Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9',hsh:true},{av:'AV31Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9',hsh:true},{av:'AV32Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9',hsh:true},{av:'AV39Intcod1',fld:'vINTCOD1',pic:'Z9',hsh:true},{av:'AV40Intcod3',fld:'vINTCOD3',pic:'Z9',hsh:true},{av:'AV41TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9',hsh:true},{av:'AV42TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9',hsh:true},{av:'AV43Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9',hsh:true},{av:'AV44Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9',hsh:true},{av:'Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDANALISISCOSTESHISTORICOSRECETAS_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridanalisiscosteshistoricosrecetas_sdts_Rows',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'Rows'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e131M82',iparms:[{av:'AV48HreRacab',fld:'vHRERACAB',pic:'',hsh:true},{av:'AV36Fec1',fld:'vFEC1',pic:''},{av:'AV37Fec2',fld:'vFEC2',pic:''},{av:'AV30Calculo',fld:'vCALCULO',pic:'9',hsh:true},{av:'AV24barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV25barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV22ARtcod1',fld:'vARTCOD1',pic:'',hsh:true},{av:'AV23ARtcod3',fld:'vARTCOD3',pic:'',hsh:true},{av:'AV26Barcolnom1',fld:'vBARCOLNOM1',pic:'',hsh:true},{av:'AV27Barcolnom3',fld:'vBARCOLNOM3',pic:'',hsh:true},{av:'AV28Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9',hsh:true},{av:'AV29Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9',hsh:true},{av:'AV31Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9',hsh:true},{av:'AV32Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9',hsh:true},{av:'AV39Intcod1',fld:'vINTCOD1',pic:'Z9',hsh:true},{av:'AV40Intcod3',fld:'vINTCOD3',pic:'Z9',hsh:true},{av:'AV41TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9',hsh:true},{av:'AV42TipArtCod3',fld:'vTIPARTCOD3',pic:'ZZZ9',hsh:true},{av:'AV43Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9',hsh:true},{av:'AV44Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9',hsh:true},{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:65,pic:''},{av:'nGXsfl_65_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:65},{av:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_65',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'GridRC',grid:65},{av:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF'},{av:'subGridanalisiscosteshistoricosrecetas_sdts_Rows',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'Rows'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV13AnalisisCostesHistoricosRecetas_SDTs',fld:'vANALISISCOSTESHISTORICOSRECETAS_SDTS',grid:65,pic:''},{av:'nGXsfl_65_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:65},{av:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_65',ctrl:'GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS',prop:'GridRC',grid:65},{av:'AV11vartojson',fld:'vVARTOJSON',pic:''},{av:'AV12varxml',fld:'vVARXML',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv31',iparms:[]");
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
      Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV48HreRacab = "" ;
      AV22ARtcod1 = "" ;
      AV23ARtcod3 = "" ;
      AV26Barcolnom1 = "" ;
      AV27Barcolnom3 = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV13AnalisisCostesHistoricosRecetas_SDTs = new GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>(app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT.class, "AnalisisCostesHistoricosRecetas_SDT", "TexplusNET", remoteHandle);
      Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV25barcodpar = "" ;
      AV36Fec1 = GXutil.nullDate() ;
      AV37Fec2 = GXutil.nullDate() ;
      bttBtnconfirmar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      Gridanalisiscosteshistoricosrecetas_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      AV11vartojson = "" ;
      AV12varxml = "" ;
      ucGridanalisiscosteshistoricosrecetas_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV82Station = "" ;
      GXt_char1 = "" ;
      AV47Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV83Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV84Usurcod = "" ;
      GXv_char4 = new String[1] ;
      Gridanalisiscosteshistoricosrecetas_sdtsRow = new com.genexus.webpanels.GXWebRow();
      AV45ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT5 = new GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>(app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT.class, "AnalisisCostesHistoricosRecetas_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT6 = new GXBaseCollection[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridanalisiscosteshistoricosrecetas_sdts_Linesclass = "" ;
      ROClassString = "" ;
      Gridanalisiscosteshistoricosrecetas_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled = 0 ;
      edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled = 0 ;
      edtavVartojson_Enabled = 0 ;
      edtavVarxml_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nEOF ;
   private byte GxWebError ;
   private byte AV30Calculo ;
   private byte AV39Intcod1 ;
   private byte AV40Intcod3 ;
   private byte AV43Tipcolcod1 ;
   private byte AV44Tipcolcod3 ;
   private byte AV19barcodreo ;
   private byte nDonePA ;
   private byte subGridanalisiscosteshistoricosrecetas_sdts_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGridanalisiscosteshistoricosrecetas_sdts_Backstyle ;
   private byte subGridanalisiscosteshistoricosrecetas_sdts_Titlebackstyle ;
   private byte subGridanalisiscosteshistoricosrecetas_sdts_Allowselection ;
   private byte subGridanalisiscosteshistoricosrecetas_sdts_Allowhovering ;
   private byte subGridanalisiscosteshistoricosrecetas_sdts_Allowcollapsing ;
   private byte subGridanalisiscosteshistoricosrecetas_sdts_Collapsed ;
   private short AV41TipArtCod1 ;
   private short AV42TipArtCod3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_65 ;
   private int subGridanalisiscosteshistoricosrecetas_sdts_Rows ;
   private int nGXsfl_65_idx=1 ;
   private int AV28Barcolnum1 ;
   private int AV29Barcolnum3 ;
   private int AV31Clicod1 ;
   private int AV32Clicod3 ;
   private int Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagestoshow ;
   private int AV24barcod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavFec1_Enabled ;
   private int edtavFec2_Enabled ;
   private int AV51GXV1 ;
   private int edtavVartojson_Enabled ;
   private int edtavVarxml_Enabled ;
   private int subGridanalisiscosteshistoricosrecetas_sdts_Islastpage ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__toa_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__marca_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__rb_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costei_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costet_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__dif_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__porc_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costek_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Enabled ;
   private int edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Enabled ;
   private int GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nGridOutOfScope ;
   private int nGXsfl_65_fel_idx=1 ;
   private int AV15PageToGo ;
   private int nGXsfl_65_bak_idx=1 ;
   private int idxLst ;
   private int subGridanalisiscosteshistoricosrecetas_sdts_Backcolor ;
   private int subGridanalisiscosteshistoricosrecetas_sdts_Allbackcolor ;
   private int subGridanalisiscosteshistoricosrecetas_sdts_Titlebackcolor ;
   private int subGridanalisiscosteshistoricosrecetas_sdts_Selectedindex ;
   private int subGridanalisiscosteshistoricosrecetas_sdts_Selectioncolor ;
   private int subGridanalisiscosteshistoricosrecetas_sdts_Hoveringcolor ;
   private long GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nFirstRecordOnPage ;
   private long AV16GridAnalisisCostesHistoricosRecetas_SDTsCurrentPage ;
   private long AV17GridAnalisisCostesHistoricosRecetas_SDTsPageCount ;
   private long GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nCurrentRecord ;
   private long GRIDANALISISCOSTESHISTORICOSRECETAS_SDTS_nRecordCount ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_65_idx="0001" ;
   private String AV48HreRacab ;
   private String AV22ARtcod1 ;
   private String AV23ARtcod3 ;
   private String AV26Barcolnom1 ;
   private String AV27Barcolnom3 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Class ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingbuttonsposition ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Pagingcaptionposition ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridclass ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageoptions ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Previous ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Next ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Caption ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Emptygridcaption ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV25barcodpar ;
   private String edtavBarcodpar_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavFec1_Internalname ;
   private String edtavFec1_Jsonclick ;
   private String edtavFec2_Internalname ;
   private String edtavFec2_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divGridanalisiscosteshistoricosrecetas_sdtstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridanalisiscosteshistoricosrecetas_sdts_Internalname ;
   private String Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavVartojson_Internalname ;
   private String edtavVarxml_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridanalisiscosteshistoricosrecetas_sdts_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__toa_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__marca_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__rb_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costei_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costet_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__dif_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__porc_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costek_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Internalname ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Internalname ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String AV82Station ;
   private String GXt_char1 ;
   private String AV47Emprcod ;
   private String GXv_char2[] ;
   private String AV83Emprnom ;
   private String GXv_char3[] ;
   private String AV84Usurcod ;
   private String GXv_char4[] ;
   private String subGridanalisiscosteshistoricosrecetas_sdts_Class ;
   private String subGridanalisiscosteshistoricosrecetas_sdts_Linesclass ;
   private String ROClassString ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__itemordersdt_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__toa_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrefectin_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__marca_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hdr_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrest_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarkgm_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretotkgm_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hremaqcod_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrevolprd_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__rb_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costei_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costet_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__dif_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__porc_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costek_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clicod_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__clinom_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebarser_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrebardsc_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipartd_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnom_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hrecolnum_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hretipcoln_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__hreintdsc_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__enccli_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__baragrlot_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosi_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__costesquimicosa_Jsonclick ;
   private String edtavAnalisiscosteshistoricosrecetas_sdts__tablaa_Jsonclick ;
   private String subGridanalisiscosteshistoricosrecetas_sdts_Header ;
   private java.util.Date AV36Fec1 ;
   private java.util.Date AV37Fec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showfirst ;
   private boolean Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showprevious ;
   private boolean Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Shownext ;
   private boolean Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Showlast ;
   private boolean Gridanalisiscosteshistoricosrecetas_sdtspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV65 ;
   private String AV11vartojson ;
   private String AV12varxml ;
   private com.genexus.webpanels.GXWebGrid Gridanalisiscosteshistoricosrecetas_sdtsContainer ;
   private com.genexus.webpanels.GXWebRow Gridanalisiscosteshistoricosrecetas_sdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridanalisiscosteshistoricosrecetas_sdtsColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGridanalisiscosteshistoricosrecetas_sdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucGridanalisiscosteshistoricosrecetas_sdts_empowerer ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV45ProgressIndicator ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> AV13AnalisisCostesHistoricosRecetas_SDTs ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> GXt_objcol_SdtAnalisisCostesHistoricosRecetas_SDT5 ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> GXv_objcol_SdtAnalisisCostesHistoricosRecetas_SDT6[] ;
}

