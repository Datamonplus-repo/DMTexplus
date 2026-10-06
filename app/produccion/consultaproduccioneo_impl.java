package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultaproduccioneo_impl extends GXWebComponent
{
   public consultaproduccioneo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultaproduccioneo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaproduccioneo_impl.class ));
   }

   public consultaproduccioneo_impl( int remoteHandle ,
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
      cmbavGridactiongroup1 = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "FilterEmprcod") ;
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
               AV70FilterEmprcod = httpContext.GetPar( "FilterEmprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70FilterEmprcod", AV70FilterEmprcod);
               AV45CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCodfrom), 6, 0));
               AV46CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CliCodto), 6, 0));
               AV15BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarDisNumfrom", AV15BarDisNumfrom);
               AV16BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarDisNumto", AV16BarDisNumto);
               AV23BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarFecGenfrom", localUtil.format(AV23BarFecGenfrom, "99/99/99"));
               AV24BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarFecGento", localUtil.format(AV24BarFecGento, "99/99/99"));
               AV34BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarSitfrom), 2, 0));
               AV35BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarSitto), 2, 0));
               AV19BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarFecClifrom", localUtil.format(AV19BarFecClifrom, "99/99/99"));
               AV20BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarFecClito", localUtil.format(AV20BarFecClito, "99/99/99"));
               AV21BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarFecFprfrom", localUtil.format(AV21BarFecFprfrom, "99/99/99"));
               AV22BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarFecFprto", localUtil.format(AV22BarFecFprto, "99/99/99"));
               AV25BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarFecSalfrom", localUtil.format(AV25BarFecSalfrom, "99/99/99"));
               AV26BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarFecSalto", localUtil.format(AV26BarFecSalto, "99/99/99"));
               AV32BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSerfrom", AV32BarSerfrom);
               AV33BarSerto = httpContext.GetPar( "BarSerto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSerto", AV33BarSerto);
               AV36BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarTipArtfrom), 4, 0));
               AV37BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipArtto), 4, 0));
               AV11BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarColNomfrom", AV11BarColNomfrom);
               AV12BarColNomto = httpContext.GetPar( "BarColNomto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarColNomto", AV12BarColNomto);
               AV13BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNumfrom), 6, 0));
               AV14BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumto), 6, 0));
               AV28BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarNomClifrom", AV28BarNomClifrom);
               AV29BarNomClito = httpContext.GetPar( "BarNomClito") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarNomClito", AV29BarNomClito);
               AV30BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarNumClifrom), 6, 0));
               AV31BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarNumClito), 6, 0));
               AV36BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarTipArtfrom), 4, 0));
               AV37BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipArtto), 4, 0));
               AV88muestras = httpContext.GetPar( "muestras") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88muestras", AV88muestras);
               AV5BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodfrom), 8, 0));
               AV10BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCodto), 8, 0));
               AV8BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodReofrom", GXutil.str( AV8BarCodReofrom, 1, 0));
               AV9BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCodReoto", GXutil.str( AV9BarCodReoto, 1, 0));
               AV6BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodParfrom", AV6BarCodParfrom);
               AV7BarCodParto = httpContext.GetPar( "BarCodParto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodParto", AV7BarCodParto);
               AV194Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV194Cod_idtx", AV194Cod_idtx);
               AV27BarGirar = httpContext.GetPar( "BarGirar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarGirar", AV27BarGirar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV70FilterEmprcod,Integer.valueOf(AV45CliCodfrom),Integer.valueOf(AV46CliCodto),AV15BarDisNumfrom,AV16BarDisNumto,AV23BarFecGenfrom,AV24BarFecGento,Byte.valueOf(AV34BarSitfrom),Byte.valueOf(AV35BarSitto),AV19BarFecClifrom,AV20BarFecClito,AV21BarFecFprfrom,AV22BarFecFprto,AV25BarFecSalfrom,AV26BarFecSalto,AV32BarSerfrom,AV33BarSerto,Short.valueOf(AV36BarTipArtfrom),Short.valueOf(AV37BarTipArtto),AV11BarColNomfrom,AV12BarColNomto,Integer.valueOf(AV13BarColNumfrom),Integer.valueOf(AV14BarColNumto),AV28BarNomClifrom,AV29BarNomClito,Integer.valueOf(AV30BarNumClifrom),Integer.valueOf(AV31BarNumClito),Short.valueOf(AV36BarTipArtfrom),Short.valueOf(AV37BarTipArtto),AV88muestras,Integer.valueOf(AV5BarCodfrom),Integer.valueOf(AV10BarCodto),Byte.valueOf(AV8BarCodReofrom),Byte.valueOf(AV9BarCodReoto),AV6BarCodParfrom,AV7BarCodParto,AV194Cod_idtx,AV27BarGirar});
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
               gxfirstwebparm = httpContext.GetFirstPar( "FilterEmprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "FilterEmprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdtconpros") == 0 )
            {
               gxnrgridsdtconpros_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdtconpros") == 0 )
            {
               gxgrgridsdtconpros_refresh_invoke( ) ;
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

   public void gxnrgridsdtconpros_newrow_invoke( )
   {
      nRC_GXsfl_64 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_64"))) ;
      nGXsfl_64_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_64_idx"))) ;
      sGXsfl_64_idx = httpContext.GetPar( "sGXsfl_64_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdtconpros_newrow( ) ;
      /* End function gxnrGridsdtconpros_newrow_invoke */
   }

   public void gxgrgridsdtconpros_refresh_invoke( )
   {
      subGridsdtconpros_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtconpros_Rows"))) ;
      AV197NumeroRegistros = GXutil.lval( httpContext.GetPar( "NumeroRegistros")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV96SDTCONPRO);
      AV216TotGridSDTCONPROs_CP_BARKGM = CommonUtil.decimalVal( httpContext.GetPar( "TotGridSDTCONPROs_CP_BARKGM"), ".") ;
      AV218TotGridSDTCONPROs_CP_BARMTR = CommonUtil.decimalVal( httpContext.GetPar( "TotGridSDTCONPROs_CP_BARMTR"), ".") ;
      AV220TotGridSDTCONPROs_CP_BARPIE = GXutil.lval( httpContext.GetPar( "TotGridSDTCONPROs_CP_BARPIE")) ;
      AV64Emprcod = httpContext.GetPar( "Emprcod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV86Messages);
      AV195TFBarPlf = httpContext.GetPar( "TFBarPlf") ;
      AV193Xml = httpContext.GetPar( "Xml") ;
      AV211CP_BARFECFPR = localUtil.parseDateParm( httpContext.GetPar( "CP_BARFECFPR")) ;
      AV87Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV214CP_BarColNom = httpContext.GetPar( "CP_BarColNom") ;
      AV215CP_BarColNum = CommonUtil.decimalVal( httpContext.GetPar( "CP_BarColNum"), ".") ;
      AV44Cantidad = CommonUtil.decimalVal( httpContext.GetPar( "Cantidad"), ".") ;
      AV180Total = httpContext.GetPar( "Total") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdtconpros_refresh( subGridsdtconpros_Rows, AV197NumeroRegistros, AV96SDTCONPRO, AV216TotGridSDTCONPROs_CP_BARKGM, AV218TotGridSDTCONPROs_CP_BARMTR, AV220TotGridSDTCONPROs_CP_BARPIE, AV64Emprcod, AV86Messages, AV195TFBarPlf, AV193Xml, AV211CP_BARFECFPR, AV87Moda21, AV214CP_BarColNom, AV215CP_BarColNum, AV44Cantidad, AV180Total, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdtconpros_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa26Z2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Consulta de Produccion", "")) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.consultaproduccioneo", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70FilterEmprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV45CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarDisNumfrom)),GXutil.URLEncode(GXutil.rtrim(AV16BarDisNumto)),GXutil.URLEncode(GXutil.formatDateParm(AV23BarFecGenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV24BarFecGento)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35BarSitto,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV19BarFecClifrom)),GXutil.URLEncode(GXutil.formatDateParm(AV20BarFecClito)),GXutil.URLEncode(GXutil.formatDateParm(AV21BarFecFprfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV22BarFecFprto)),GXutil.URLEncode(GXutil.formatDateParm(AV25BarFecSalfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV26BarFecSalto)),GXutil.URLEncode(GXutil.rtrim(AV32BarSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV33BarSerto)),GXutil.URLEncode(GXutil.ltrimstr(AV36BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarColNomfrom)),GXutil.URLEncode(GXutil.rtrim(AV12BarColNomto)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarColNumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarColNumto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV28BarNomClifrom)),GXutil.URLEncode(GXutil.rtrim(AV29BarNomClito)),GXutil.URLEncode(GXutil.ltrimstr(AV30BarNumClifrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31BarNumClito,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV88muestras)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReofrom,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReoto,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodParfrom)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodParto)),GXutil.URLEncode(GXutil.rtrim(AV194Cod_idtx)),GXutil.URLEncode(GXutil.rtrim(AV27BarGirar))}, new String[] {"FilterEmprcod","CliCodfrom","CliCodto","BarDisNumfrom","BarDisNumto","BarFecGenfrom","BarFecGento","BarSitfrom","BarSitto","BarFecClifrom","BarFecClito","BarFecFprfrom","BarFecFprto","BarFecSalfrom","BarFecSalto","BarSerfrom","BarSerto","BarTipArtfrom","BarTipArtto","BarColNomfrom","BarColNomto","BarColNumfrom","BarColNumto","BarNomClifrom","BarNomClito","BarNumClifrom","BarNumClito","BarTipArtfrom","BarTipArtto","muestras","BarCodfrom","BarCodto","BarCodReofrom","BarCodReoto","BarCodParfrom","BarCodParto","Cod_idtx","BarGirar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUMEROREGISTROS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV197NumeroRegistros), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV216TotGridSDTCONPROs_CP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV218TotGridSDTCONPROs_CP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV220TotGridSDTCONPROs_CP_BARPIE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMESSAGES", getSecureSignedToken( sPrefix, AV86Messages));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPLF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV195TFBarPlf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vXML", getSecureSignedToken( sPrefix, AV193Xml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCP_BARFECFPR", getSecureSignedToken( sPrefix, AV211CP_BARFECFPR));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV87Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCP_BARCOLNOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV214CP_BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCP_BARCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( AV215CP_BarColNum, "9.999")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaProduccionEO");
      forbiddenHiddens.add("Cantidad", localUtil.format( AV44Cantidad, "ZZZ,ZZ9.99"));
      forbiddenHiddens.add("Total", GXutil.rtrim( localUtil.format( AV180Total, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultaproduccioneo:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtconpro", AV96SDTCONPRO);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtconpro", AV96SDTCONPRO);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_64", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_64, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTCONPROSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV76GridSDTCONPROsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDSDTCONPROSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV77GridSDTCONPROsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70FilterEmprcod", GXutil.rtrim( wcpOAV70FilterEmprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45CliCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV45CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46CliCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV46CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15BarDisNumfrom", GXutil.rtrim( wcpOAV15BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16BarDisNumto", GXutil.rtrim( wcpOAV16BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23BarFecGenfrom", localUtil.dtoc( wcpOAV23BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24BarFecGento", localUtil.dtoc( wcpOAV24BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34BarSitfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV34BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35BarSitto", GXutil.ltrim( localUtil.ntoc( wcpOAV35BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19BarFecClifrom", localUtil.dtoc( wcpOAV19BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20BarFecClito", localUtil.dtoc( wcpOAV20BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21BarFecFprfrom", localUtil.dtoc( wcpOAV21BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22BarFecFprto", localUtil.dtoc( wcpOAV22BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25BarFecSalfrom", localUtil.dtoc( wcpOAV25BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26BarFecSalto", localUtil.dtoc( wcpOAV26BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32BarSerfrom", GXutil.rtrim( wcpOAV32BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33BarSerto", GXutil.rtrim( wcpOAV33BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36BarTipArtfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV36BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37BarTipArtto", GXutil.ltrim( localUtil.ntoc( wcpOAV37BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11BarColNomfrom", GXutil.rtrim( wcpOAV11BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12BarColNomto", GXutil.rtrim( wcpOAV12BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13BarColNumfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV13BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14BarColNumto", GXutil.ltrim( localUtil.ntoc( wcpOAV14BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28BarNomClifrom", GXutil.rtrim( wcpOAV28BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29BarNomClito", GXutil.rtrim( wcpOAV29BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30BarNumClifrom", GXutil.ltrim( localUtil.ntoc( wcpOAV30BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31BarNumClito", GXutil.ltrim( localUtil.ntoc( wcpOAV31BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV88muestras", GXutil.rtrim( wcpOAV88muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5BarCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV5BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10BarCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV10BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarCodReofrom", GXutil.ltrim( localUtil.ntoc( wcpOAV8BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9BarCodReoto", GXutil.ltrim( localUtil.ntoc( wcpOAV9BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6BarCodParfrom", GXutil.rtrim( wcpOAV6BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7BarCodParto", GXutil.rtrim( wcpOAV7BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV194Cod_idtx", GXutil.rtrim( wcpOAV194Cod_idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27BarGirar", GXutil.rtrim( wcpOAV27BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUMEROREGISTROS", GXutil.ltrim( localUtil.ntoc( AV197NumeroRegistros, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUMEROREGISTROS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV197NumeroRegistros), "ZZZZZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTCONPRO", AV96SDTCONPRO);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTCONPRO", AV96SDTCONPRO);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRIDSDTCONPROS_CP_BARKGM", GXutil.ltrim( localUtil.ntoc( AV216TotGridSDTCONPROs_CP_BARKGM, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV216TotGridSDTCONPROs_CP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRIDSDTCONPROS_CP_BARMTR", GXutil.ltrim( localUtil.ntoc( AV218TotGridSDTCONPROs_CP_BARMTR, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV218TotGridSDTCONPROs_CP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRIDSDTCONPROS_CP_BARPIE", GXutil.ltrim( localUtil.ntoc( AV220TotGridSDTCONPROs_CP_BARPIE, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV220TotGridSDTCONPROs_CP_BARPIE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV64Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64Emprcod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMESSAGES", AV86Messages);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMESSAGES", AV86Messages);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMESSAGES", getSecureSignedToken( sPrefix, AV86Messages));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPAGETOGO", GXutil.ltrim( localUtil.ntoc( AV94PageToGo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMFROM", GXutil.rtrim( AV15BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMTO", GXutil.rtrim( AV16BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV45CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV46CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV34BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV35BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENFROM", localUtil.dtoc( AV23BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENTO", localUtil.dtoc( AV24BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALFROM", localUtil.dtoc( AV25BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALTO", localUtil.dtoc( AV26BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLIFROM", localUtil.dtoc( AV19BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLITO", localUtil.dtoc( AV20BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRFROM", localUtil.dtoc( AV21BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRTO", localUtil.dtoc( AV22BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERFROM", GXutil.rtrim( AV32BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERTO", GXutil.rtrim( AV33BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMFROM", GXutil.rtrim( AV11BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMTO", GXutil.rtrim( AV12BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMFROM", GXutil.ltrim( localUtil.ntoc( AV13BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV14BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLIFROM", GXutil.rtrim( AV28BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLITO", GXutil.rtrim( AV29BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLIFROM", GXutil.ltrim( localUtil.ntoc( AV30BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLITO", GXutil.ltrim( localUtil.ntoc( AV31BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTFROM", GXutil.ltrim( localUtil.ntoc( AV36BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTTO", GXutil.ltrim( localUtil.ntoc( AV37BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODFROM", GXutil.ltrim( localUtil.ntoc( AV5BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODTO", GXutil.ltrim( localUtil.ntoc( AV10BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOFROM", GXutil.ltrim( localUtil.ntoc( AV8BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOTO", GXutil.ltrim( localUtil.ntoc( AV9BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARFROM", GXutil.rtrim( AV6BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARTO", GXutil.rtrim( AV7BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOD_IDTX", GXutil.rtrim( AV194Cod_idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPLF", GXutil.rtrim( AV195TFBarPlf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPLF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV195TFBarPlf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARGIRAR", GXutil.rtrim( AV27BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vXML", AV193Xml);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vXML", getSecureSignedToken( sPrefix, AV193Xml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vERRORMESSAGE", AV66ErrorMessage);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_EMPRCOD", GXutil.rtrim( AV198CP_EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARCOD", GXutil.ltrim( localUtil.ntoc( AV199CP_BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV200CP_BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARCODPAR", GXutil.rtrim( AV201CP_BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_CLICOD", GXutil.ltrim( localUtil.ntoc( AV202CP_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_CLINOM", AV203CP_CliNom);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARDISNUM", GXutil.rtrim( AV204CP_BARDISNUM));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARSER", GXutil.rtrim( AV205CP_Barser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARSERDSC", AV206CP_BARSERDSC);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARCOLO", GXutil.rtrim( AV207CP_Barcolo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARCOLU", GXutil.ltrim( localUtil.ntoc( AV208CP_Barcolu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARFECFPR", localUtil.dtoc( AV211CP_BARFECFPR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCP_BARFECFPR", getSecureSignedToken( sPrefix, AV211CP_BARFECFPR));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV87Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV87Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARKGM", GXutil.ltrim( localUtil.ntoc( AV209CP_BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARMTR", GXutil.ltrim( localUtil.ntoc( AV210CP_BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARCOLNOM", AV214CP_BarColNom);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCP_BARCOLNOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV214CP_BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV215CP_BarColNum, (byte)(5), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCP_BARCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( AV215CP_BarColNum, "9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFILTEREMPRCOD", GXutil.rtrim( AV70FilterEmprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMUESTRAS", GXutil.rtrim( AV88muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTCONPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTCONPROS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Class", GXutil.rtrim( Gridsdtconprospaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdtconprospaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdtconprospaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdtconprospaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdtconprospaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdtconprospaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdtconprospaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdtconprospaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdtconprospaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdtconprospaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtconprospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdtconprospaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdtconprospaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Next", GXutil.rtrim( Gridsdtconprospaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdtconprospaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdtconprospaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdtconprospaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Width", GXutil.rtrim( Dvpanel_panel_resultado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Autowidth", GXutil.booltostr( Dvpanel_panel_resultado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Autoheight", GXutil.booltostr( Dvpanel_panel_resultado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Cls", GXutil.rtrim( Dvpanel_panel_resultado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Title", GXutil.rtrim( Dvpanel_panel_resultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Collapsible", GXutil.booltostr( Dvpanel_panel_resultado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Collapsed", GXutil.booltostr( Dvpanel_panel_resultado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_resultado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Iconposition", GXutil.rtrim( Dvpanel_panel_resultado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANEL_RESULTADO_Autoscroll", GXutil.booltostr( Dvpanel_panel_resultado_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"SITUACIONFASES_MODAL_Width", GXutil.rtrim( Situacionfases_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"SITUACIONFASES_MODAL_Title", GXutil.rtrim( Situacionfases_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"SITUACIONFASES_MODAL_Confirmtype", GXutil.rtrim( Situacionfases_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"SITUACIONFASES_MODAL_Bodytype", GXutil.rtrim( Situacionfases_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CONSULTAALBARANSALIDA_MODAL_Width", GXutil.rtrim( Consultaalbaransalida_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CONSULTAALBARANSALIDA_MODAL_Title", GXutil.rtrim( Consultaalbaransalida_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CONSULTAALBARANSALIDA_MODAL_Confirmtype", GXutil.rtrim( Consultaalbaransalida_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CONSULTAALBARANSALIDA_MODAL_Bodytype", GXutil.rtrim( Consultaalbaransalida_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECETAS_MODAL_Width", GXutil.rtrim( Recetas_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECETAS_MODAL_Title", GXutil.rtrim( Recetas_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECETAS_MODAL_Confirmtype", GXutil.rtrim( Recetas_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECETAS_MODAL_Bodytype", GXutil.rtrim( Recetas_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PARTESPRODUCCION_MODAL_Width", GXutil.rtrim( Partesproduccion_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PARTESPRODUCCION_MODAL_Title", GXutil.rtrim( Partesproduccion_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PARTESPRODUCCION_MODAL_Confirmtype", GXutil.rtrim( Partesproduccion_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PARTESPRODUCCION_MODAL_Bodytype", GXutil.rtrim( Partesproduccion_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PACKINGLIST_MODAL_Width", GXutil.rtrim( Packinglist_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PACKINGLIST_MODAL_Title", GXutil.rtrim( Packinglist_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PACKINGLIST_MODAL_Confirmtype", GXutil.rtrim( Packinglist_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PACKINGLIST_MODAL_Bodytype", GXutil.rtrim( Packinglist_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PIEZAS_MODAL_Width", GXutil.rtrim( Piezas_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PIEZAS_MODAL_Title", GXutil.rtrim( Piezas_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PIEZAS_MODAL_Confirmtype", GXutil.rtrim( Piezas_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PIEZAS_MODAL_Bodytype", GXutil.rtrim( Piezas_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AGRUPADAS_MODAL_Width", GXutil.rtrim( Agrupadas_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AGRUPADAS_MODAL_Title", GXutil.rtrim( Agrupadas_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AGRUPADAS_MODAL_Confirmtype", GXutil.rtrim( Agrupadas_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AGRUPADAS_MODAL_Bodytype", GXutil.rtrim( Agrupadas_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdtconpros_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtconprospaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtconprospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtconprospaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtconprospaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm26Z2( )
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
         if ( ! ( WebComp_Wwpaux_wc == null ) )
         {
            WebComp_Wwpaux_wc.componentjscripts();
         }
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
      return "Produccion.ConsultaProduccionEO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Consulta de Produccion", "") ;
   }

   public void wb26Z0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.consultaproduccioneo");
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Table_ProgressBar", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultaProduccionEO.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", httpContext.getMessage( "csv", ""), bttBtncsv_Jsonclick, 7, httpContext.getMessage( "csv", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1126z1_client"+"'", TempTags, "", 2, "HLP_Produccion\\ConsultaProduccionEO.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, divUnnamedtable1_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPagina_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPagina_Internalname, httpContext.getMessage( "Pagina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_64_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPagina_Internalname, GXutil.ltrim( localUtil.ntoc( AV95Pagina, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPagina_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV95Pagina), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV95Pagina), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPagina_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPagina_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultaProduccionEO.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCantidad_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCantidad_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'" + sPrefix + "',false,'" + sGXsfl_64_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV44Cantidad, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCantidad_Enabled!=0) ? localUtil.format( AV44Cantidad, "ZZZ,ZZ9.99") : localUtil.format( AV44Cantidad, "ZZZ,ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,38);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantidad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCantidad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Cantidad", "right", false, "", "HLP_Produccion\\ConsultaProduccionEO.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotal_Internalname, httpContext.getMessage( "Total", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'" + sPrefix + "',false,'" + sGXsfl_64_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_Internalname, AV180Total, GXutil.rtrim( localUtil.format( AV180Total, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotal_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultaProduccionEO.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablegrid_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_resultado.setProperty("Width", Dvpanel_panel_resultado_Width);
         ucDvpanel_panel_resultado.setProperty("AutoWidth", Dvpanel_panel_resultado_Autowidth);
         ucDvpanel_panel_resultado.setProperty("AutoHeight", Dvpanel_panel_resultado_Autoheight);
         ucDvpanel_panel_resultado.setProperty("Cls", Dvpanel_panel_resultado_Cls);
         ucDvpanel_panel_resultado.setProperty("Title", Dvpanel_panel_resultado_Title);
         ucDvpanel_panel_resultado.setProperty("Collapsible", Dvpanel_panel_resultado_Collapsible);
         ucDvpanel_panel_resultado.setProperty("Collapsed", Dvpanel_panel_resultado_Collapsed);
         ucDvpanel_panel_resultado.setProperty("ShowCollapseIcon", Dvpanel_panel_resultado_Showcollapseicon);
         ucDvpanel_panel_resultado.setProperty("IconPosition", Dvpanel_panel_resultado_Iconposition);
         ucDvpanel_panel_resultado.setProperty("AutoScroll", Dvpanel_panel_resultado_Autoscroll);
         ucDvpanel_panel_resultado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_resultado_Internalname, sPrefix+"DVPANEL_PANEL_RESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_PANEL_RESULTADOContainer"+"Panel_Resultado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_resultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, sPrefix+"GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Resultado", ""), "", "", lblTab01_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ConsultaProduccionEO.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab01") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridsdtconprostablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdtconprosContainer.SetWrapped(nGXWrapped);
         startgridcontrol64( ) ;
      }
      if ( wbEnd == 64 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_64 = (int)(nGXsfl_64_idx-1) ;
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV225GXV1 = nGXsfl_64_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridsdtconprosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdtconpros", GridsdtconprosContainer, subGridsdtconpros_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtconprosContainerData", GridsdtconprosContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtconprosContainerData"+"V", GridsdtconprosContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdtconprosContainerData"+"V"+"\" value='"+GridsdtconprosContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_107_26Z2( true) ;
      }
      else
      {
         wb_table1_107_26Z2( false) ;
      }
      return  ;
   }

   public void wb_table1_107_26Z2e( boolean wbgen )
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
         ucGridsdtconprospaginationbar.setProperty("Class", Gridsdtconprospaginationbar_Class);
         ucGridsdtconprospaginationbar.setProperty("ShowFirst", Gridsdtconprospaginationbar_Showfirst);
         ucGridsdtconprospaginationbar.setProperty("ShowPrevious", Gridsdtconprospaginationbar_Showprevious);
         ucGridsdtconprospaginationbar.setProperty("ShowNext", Gridsdtconprospaginationbar_Shownext);
         ucGridsdtconprospaginationbar.setProperty("ShowLast", Gridsdtconprospaginationbar_Showlast);
         ucGridsdtconprospaginationbar.setProperty("PagesToShow", Gridsdtconprospaginationbar_Pagestoshow);
         ucGridsdtconprospaginationbar.setProperty("PagingButtonsPosition", Gridsdtconprospaginationbar_Pagingbuttonsposition);
         ucGridsdtconprospaginationbar.setProperty("PagingCaptionPosition", Gridsdtconprospaginationbar_Pagingcaptionposition);
         ucGridsdtconprospaginationbar.setProperty("EmptyGridClass", Gridsdtconprospaginationbar_Emptygridclass);
         ucGridsdtconprospaginationbar.setProperty("RowsPerPageSelector", Gridsdtconprospaginationbar_Rowsperpageselector);
         ucGridsdtconprospaginationbar.setProperty("RowsPerPageOptions", Gridsdtconprospaginationbar_Rowsperpageoptions);
         ucGridsdtconprospaginationbar.setProperty("Previous", Gridsdtconprospaginationbar_Previous);
         ucGridsdtconprospaginationbar.setProperty("Next", Gridsdtconprospaginationbar_Next);
         ucGridsdtconprospaginationbar.setProperty("Caption", Gridsdtconprospaginationbar_Caption);
         ucGridsdtconprospaginationbar.setProperty("EmptyGridCaption", Gridsdtconprospaginationbar_Emptygridcaption);
         ucGridsdtconprospaginationbar.setProperty("RowsPerPageCaption", Gridsdtconprospaginationbar_Rowsperpagecaption);
         ucGridsdtconprospaginationbar.setProperty("CurrentPage", AV76GridSDTCONPROsCurrentPage);
         ucGridsdtconprospaginationbar.setProperty("PageCount", AV77GridSDTCONPROsPageCount);
         ucGridsdtconprospaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdtconprospaginationbar_Internalname, sPrefix+"GRIDSDTCONPROSPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV265Pgmname), GXutil.rtrim( localUtil.format( AV265Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultaProduccionEO.htm");
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
         wb_table2_168_26Z2( true) ;
      }
      else
      {
         wb_table2_168_26Z2( false) ;
      }
      return  ;
   }

   public void wb_table2_168_26Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_173_26Z2( true) ;
      }
      else
      {
         wb_table3_173_26Z2( false) ;
      }
      return  ;
   }

   public void wb_table3_173_26Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_178_26Z2( true) ;
      }
      else
      {
         wb_table4_178_26Z2( false) ;
      }
      return  ;
   }

   public void wb_table4_178_26Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_183_26Z2( true) ;
      }
      else
      {
         wb_table5_183_26Z2( false) ;
      }
      return  ;
   }

   public void wb_table5_183_26Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_188_26Z2( true) ;
      }
      else
      {
         wb_table6_188_26Z2( false) ;
      }
      return  ;
   }

   public void wb_table6_188_26Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_193_26Z2( true) ;
      }
      else
      {
         wb_table7_193_26Z2( false) ;
      }
      return  ;
   }

   public void wb_table7_193_26Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table8_198_26Z2( true) ;
      }
      else
      {
         wb_table8_198_26Z2( false) ;
      }
      return  ;
   }

   public void wb_table8_198_26Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGridsdtconpros_empowerer.render(context, "wwp.gridempowerer", Gridsdtconpros_empowerer_Internalname, sPrefix+"GRIDSDTCONPROS_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0205"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0205"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_64_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0205"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 64 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridsdtconprosContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV225GXV1 = nGXsfl_64_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridsdtconprosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridsdtconpros", GridsdtconprosContainer, subGridsdtconpros_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtconprosContainerData", GridsdtconprosContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridsdtconprosContainerData"+"V", GridsdtconprosContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridsdtconprosContainerData"+"V"+"\" value='"+GridsdtconprosContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start26Z2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Consulta de Produccion", ""), (short)(0)) ;
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
            strup26Z0( ) ;
         }
      }
   }

   public void ws26Z2( )
   {
      start26Z2( ) ;
      evt26Z2( ) ;
   }

   public void evt26Z2( )
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
                              strup26Z0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTCONPROSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1226Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTCONPROSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1326Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXCEL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExcel' */
                                 e1426Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "GRIDSDTCONPROS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26Z0( ) ;
                           }
                           nGXsfl_64_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_642( ) ;
                           AV225GXV1 = (int)(nGXsfl_64_idx+GRIDSDTCONPROS_nFirstRecordOnPage) ;
                           if ( ( AV96SDTCONPRO.size() >= AV225GXV1 ) && ( AV225GXV1 > 0 ) )
                           {
                              AV96SDTCONPRO.currentItem( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)) );
                              cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                              cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                              AV73GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridActionGroup1), 4, 0));
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1526Z2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1626Z2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDTCONPROS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1726Z2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1826Z2 ();
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
                                    strup26Z0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 205 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0205") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0205", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we26Z2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm26Z2( ) ;
         }
      }
   }

   public void pa26Z2( )
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
            GX_FocusControl = edtavPagina_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridsdtconpros_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_642( ) ;
      while ( nGXsfl_64_idx <= nRC_GXsfl_64 )
      {
         sendrow_642( ) ;
         nGXsfl_64_idx = ((subGridsdtconpros_Islastpage==1)&&(nGXsfl_64_idx+1>subgridsdtconpros_fnc_recordsperpage( )) ? 1 : nGXsfl_64_idx+1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdtconprosContainer)) ;
      /* End function gxnrGridsdtconpros_newrow */
   }

   public void gxgrgridsdtconpros_refresh( int subGridsdtconpros_Rows ,
                                           long AV197NumeroRegistros ,
                                           GXBaseCollection<app.SdtSDTCONPRO_Registro> AV96SDTCONPRO ,
                                           java.math.BigDecimal AV216TotGridSDTCONPROs_CP_BARKGM ,
                                           java.math.BigDecimal AV218TotGridSDTCONPROs_CP_BARMTR ,
                                           long AV220TotGridSDTCONPROs_CP_BARPIE ,
                                           String AV64Emprcod ,
                                           GXBaseCollection<com.genexus.SdtMessages_Message> AV86Messages ,
                                           String AV195TFBarPlf ,
                                           String AV193Xml ,
                                           java.util.Date AV211CP_BARFECFPR ,
                                           short AV87Moda21 ,
                                           String AV214CP_BarColNom ,
                                           java.math.BigDecimal AV215CP_BarColNum ,
                                           java.math.BigDecimal AV44Cantidad ,
                                           String AV180Total ,
                                           String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GridsdtconprosState.saveGridState();
      /* Execute user event: Refresh */
      e1626Z2 ();
      GRIDSDTCONPROS_nCurrentRecord = 0 ;
      rf26Z2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaProduccionEO");
      forbiddenHiddens.add("Cantidad", localUtil.format( AV44Cantidad, "ZZZ,ZZ9.99"));
      forbiddenHiddens.add("Total", GXutil.rtrim( localUtil.format( AV180Total, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultaproduccioneo:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridsdtconpros_refresh */
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
      rf26Z2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV265Pgmname = "Produccion.ConsultaProduccionEO" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV265Pgmname", AV265Pgmname);
      Gx_err = (short)(0) ;
      edtavPagina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPagina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPagina_Enabled), 5, 0), true);
      edtavCantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidad_Enabled), 5, 0), true);
      edtavTotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotal_Enabled), 5, 0), true);
      edtavSdtconpro__cp_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_id_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_emprcod_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_clicod_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_clinom_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_bardisnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_bardisnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_bardisnum_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcod_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcodreo_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcodpar_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barfecfpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barfecfpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barfecfpr_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barnumcli_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barplf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barplf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barplf_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barsit_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barfecgen_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barfeccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barfeccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barfeccli_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barfecsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barfecsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barfecsal_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barser_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barserdsc_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcolo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcolo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcolo_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcolu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcolu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcolu_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barnomcli_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_bartipart_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_tartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_tartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_tartdsc_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_bargirar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_bargirar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_bargirar_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_baracaanh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_baracaanh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_baracaanh_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_desc_b_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_desc_b_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_desc_b_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_baragrest_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barext_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barext_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_disdes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_disdes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_disdes_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_discod_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barproper_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barproper_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barproper_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_dsc_bar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_dsc_bar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_dsc_bar_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barrencc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barrencc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barrencc_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barkgm_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barmtr_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barpie_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_baralbk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_baralbk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_baralbk_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_baralbm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_baralbm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_baralbm_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barenccli_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_disusrc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_disusrc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_disusrc_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavTotvaluegridsdtconpros_cp_barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegridsdtconpros_cp_barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdtconpros_cp_barkgm_Enabled), 5, 0), true);
      edtavTotvaluegridsdtconpros_cp_barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegridsdtconpros_cp_barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdtconpros_cp_barmtr_Enabled), 5, 0), true);
      edtavTotvaluegridsdtconpros_cp_barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegridsdtconpros_cp_barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdtconpros_cp_barpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26Z2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdtconprosContainer.ClearRows();
      }
      wbStart = (short)(64) ;
      /* Execute user event: Refresh */
      e1626Z2 ();
      nGXsfl_64_idx = 1 ;
      sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_642( ) ;
      bGXsfl_64_Refreshing = true ;
      GridsdtconprosContainer.AddObjectProperty("GridName", "Gridsdtconpros");
      GridsdtconprosContainer.AddObjectProperty("CmpContext", sPrefix);
      GridsdtconprosContainer.AddObjectProperty("InMasterPage", "false");
      GridsdtconprosContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
      GridsdtconprosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdtconprosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdtconprosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdtconprosContainer.setPageSize( subgridsdtconpros_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_642( ) ;
         e1726Z2 ();
         if ( ( GRIDSDTCONPROS_nCurrentRecord > 0 ) && ( GRIDSDTCONPROS_nGridOutOfScope == 0 ) && ( nGXsfl_64_idx == 1 ) )
         {
            GRIDSDTCONPROS_nCurrentRecord = 0 ;
            GRIDSDTCONPROS_nGridOutOfScope = 1 ;
            subgridsdtconpros_firstpage( ) ;
            e1726Z2 ();
         }
         wbEnd = (short)(64) ;
         wb26Z0( ) ;
      }
      bGXsfl_64_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26Z2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUMEROREGISTROS", GXutil.ltrim( localUtil.ntoc( AV197NumeroRegistros, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUMEROREGISTROS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV197NumeroRegistros), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRIDSDTCONPROS_CP_BARKGM", GXutil.ltrim( localUtil.ntoc( AV216TotGridSDTCONPROs_CP_BARKGM, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV216TotGridSDTCONPROs_CP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRIDSDTCONPROS_CP_BARMTR", GXutil.ltrim( localUtil.ntoc( AV218TotGridSDTCONPROs_CP_BARMTR, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV218TotGridSDTCONPROs_CP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTGRIDSDTCONPROS_CP_BARPIE", GXutil.ltrim( localUtil.ntoc( AV220TotGridSDTCONPROs_CP_BARPIE, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV220TotGridSDTCONPROs_CP_BARPIE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV64Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64Emprcod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMESSAGES", AV86Messages);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMESSAGES", AV86Messages);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMESSAGES", getSecureSignedToken( sPrefix, AV86Messages));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPLF", GXutil.rtrim( AV195TFBarPlf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPLF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV195TFBarPlf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vXML", AV193Xml);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vXML", getSecureSignedToken( sPrefix, AV193Xml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARFECFPR", localUtil.dtoc( AV211CP_BARFECFPR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCP_BARFECFPR", getSecureSignedToken( sPrefix, AV211CP_BARFECFPR));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV87Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV87Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARCOLNOM", AV214CP_BarColNom);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCP_BARCOLNOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV214CP_BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCP_BARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV215CP_BarColNum, (byte)(5), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCP_BARCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( AV215CP_BarColNum, "9.999")));
   }

   public int subgridsdtconpros_fnc_pagecount( )
   {
      GRIDSDTCONPROS_nRecordCount = subgridsdtconpros_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTCONPROS_nRecordCount) % (subgridsdtconpros_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTCONPROS_nRecordCount/ (double) (subgridsdtconpros_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTCONPROS_nRecordCount/ (double) (subgridsdtconpros_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdtconpros_fnc_recordcount( )
   {
      return AV96SDTCONPRO.size() ;
   }

   public int subgridsdtconpros_fnc_recordsperpage( )
   {
      if ( subGridsdtconpros_Rows > 0 )
      {
         return subGridsdtconpros_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdtconpros_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTCONPROS_nFirstRecordOnPage/ (double) (subgridsdtconpros_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdtconpros_firstpage( )
   {
      GRIDSDTCONPROS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTCONPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtconpros_refresh( subGridsdtconpros_Rows, AV197NumeroRegistros, AV96SDTCONPRO, AV216TotGridSDTCONPROs_CP_BARKGM, AV218TotGridSDTCONPROs_CP_BARMTR, AV220TotGridSDTCONPROs_CP_BARPIE, AV64Emprcod, AV86Messages, AV195TFBarPlf, AV193Xml, AV211CP_BARFECFPR, AV87Moda21, AV214CP_BarColNom, AV215CP_BarColNum, AV44Cantidad, AV180Total, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtconpros_nextpage( )
   {
      GRIDSDTCONPROS_nRecordCount = subgridsdtconpros_fnc_recordcount( ) ;
      if ( ( GRIDSDTCONPROS_nRecordCount >= subgridsdtconpros_fnc_recordsperpage( ) ) && ( GRIDSDTCONPROS_nEOF == 0 ) )
      {
         GRIDSDTCONPROS_nFirstRecordOnPage = (long)(GRIDSDTCONPROS_nFirstRecordOnPage+subgridsdtconpros_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTCONPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdtconprosContainer.AddObjectProperty("GRIDSDTCONPROS_nFirstRecordOnPage", GRIDSDTCONPROS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtconpros_refresh( subGridsdtconpros_Rows, AV197NumeroRegistros, AV96SDTCONPRO, AV216TotGridSDTCONPROs_CP_BARKGM, AV218TotGridSDTCONPROs_CP_BARMTR, AV220TotGridSDTCONPROs_CP_BARPIE, AV64Emprcod, AV86Messages, AV195TFBarPlf, AV193Xml, AV211CP_BARFECFPR, AV87Moda21, AV214CP_BarColNom, AV215CP_BarColNum, AV44Cantidad, AV180Total, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTCONPROS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdtconpros_previouspage( )
   {
      if ( GRIDSDTCONPROS_nFirstRecordOnPage >= subgridsdtconpros_fnc_recordsperpage( ) )
      {
         GRIDSDTCONPROS_nFirstRecordOnPage = (long)(GRIDSDTCONPROS_nFirstRecordOnPage-subgridsdtconpros_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTCONPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtconpros_refresh( subGridsdtconpros_Rows, AV197NumeroRegistros, AV96SDTCONPRO, AV216TotGridSDTCONPROs_CP_BARKGM, AV218TotGridSDTCONPROs_CP_BARMTR, AV220TotGridSDTCONPROs_CP_BARPIE, AV64Emprcod, AV86Messages, AV195TFBarPlf, AV193Xml, AV211CP_BARFECFPR, AV87Moda21, AV214CP_BarColNom, AV215CP_BarColNum, AV44Cantidad, AV180Total, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtconpros_lastpage( )
   {
      GRIDSDTCONPROS_nRecordCount = subgridsdtconpros_fnc_recordcount( ) ;
      if ( GRIDSDTCONPROS_nRecordCount > subgridsdtconpros_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTCONPROS_nRecordCount) % (subgridsdtconpros_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTCONPROS_nFirstRecordOnPage = (long)(GRIDSDTCONPROS_nRecordCount-subgridsdtconpros_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTCONPROS_nFirstRecordOnPage = (long)(GRIDSDTCONPROS_nRecordCount-((int)((GRIDSDTCONPROS_nRecordCount) % (subgridsdtconpros_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTCONPROS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTCONPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtconpros_refresh( subGridsdtconpros_Rows, AV197NumeroRegistros, AV96SDTCONPRO, AV216TotGridSDTCONPROs_CP_BARKGM, AV218TotGridSDTCONPROs_CP_BARMTR, AV220TotGridSDTCONPROs_CP_BARPIE, AV64Emprcod, AV86Messages, AV195TFBarPlf, AV193Xml, AV211CP_BARFECFPR, AV87Moda21, AV214CP_BarColNom, AV215CP_BarColNum, AV44Cantidad, AV180Total, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdtconpros_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTCONPROS_nFirstRecordOnPage = (long)(subgridsdtconpros_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTCONPROS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTCONPROS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtconpros_refresh( subGridsdtconpros_Rows, AV197NumeroRegistros, AV96SDTCONPRO, AV216TotGridSDTCONPROs_CP_BARKGM, AV218TotGridSDTCONPROs_CP_BARMTR, AV220TotGridSDTCONPROs_CP_BARPIE, AV64Emprcod, AV86Messages, AV195TFBarPlf, AV193Xml, AV211CP_BARFECFPR, AV87Moda21, AV214CP_BarColNom, AV215CP_BarColNum, AV44Cantidad, AV180Total, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void subgridsdtconpros_varsfromstate( )
   {
      if ( GridsdtconprosState.getCurrentpage() > 0 )
      {
         GridsdtconprosPageCount = subgridsdtconpros_fnc_pagecount( ) ;
         if ( ( GridsdtconprosPageCount > 0 ) && ( GridsdtconprosPageCount < GridsdtconprosState.getCurrentpage() ) )
         {
            subgridsdtconpros_gotopage( GridsdtconprosPageCount) ;
         }
         else
         {
            subgridsdtconpros_gotopage( ((GridsdtconprosPageCount<0) ? 0 : GridsdtconprosState.getCurrentpage())) ;
         }
      }
   }

   public void subgridsdtconpros_varstostate( )
   {
      GridsdtconprosState.setCurrentpage( subgridsdtconpros_fnc_currentpage( ) );
   }

   public void before_start_formulas( )
   {
      AV265Pgmname = "Produccion.ConsultaProduccionEO" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV265Pgmname", AV265Pgmname);
      Gx_err = (short)(0) ;
      edtavPagina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPagina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPagina_Enabled), 5, 0), true);
      edtavCantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidad_Enabled), 5, 0), true);
      edtavTotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotal_Enabled), 5, 0), true);
      edtavSdtconpro__cp_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_id_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_emprcod_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_clicod_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_clinom_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_bardisnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_bardisnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_bardisnum_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcod_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcodreo_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcodpar_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barfecfpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barfecfpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barfecfpr_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barnumcli_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barplf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barplf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barplf_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barsit_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barfecgen_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barfeccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barfeccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barfeccli_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barfecsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barfecsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barfecsal_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barser_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barserdsc_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcolo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcolo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcolo_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barcolu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barcolu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barcolu_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barnomcli_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_bartipart_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_tartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_tartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_tartdsc_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_bargirar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_bargirar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_bargirar_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_baracaanh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_baracaanh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_baracaanh_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_desc_b_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_desc_b_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_desc_b_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_baragrest_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barext_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barext_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_disdes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_disdes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_disdes_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_discod_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barproper_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barproper_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barproper_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_dsc_bar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_dsc_bar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_dsc_bar_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barrencc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barrencc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barrencc_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barkgm_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barmtr_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barpie_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_baralbk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_baralbk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_baralbk_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_baralbm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_baralbm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_baralbm_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_barenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_barenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_barenccli_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavSdtconpro__cp_disusrc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtconpro__cp_disusrc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtconpro__cp_disusrc_Enabled), 5, 0), !bGXsfl_64_Refreshing);
      edtavTotvaluegridsdtconpros_cp_barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegridsdtconpros_cp_barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdtconpros_cp_barkgm_Enabled), 5, 0), true);
      edtavTotvaluegridsdtconpros_cp_barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegridsdtconpros_cp_barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdtconpros_cp_barmtr_Enabled), 5, 0), true);
      edtavTotvaluegridsdtconpros_cp_barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluegridsdtconpros_cp_barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdtconpros_cp_barpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26Z0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1526Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      GridsdtconprosState.loadGridState();
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtconpro"), AV96SDTCONPRO);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTCONPRO"), AV96SDTCONPRO);
         /* Read saved values. */
         nRC_GXsfl_64 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_64"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV76GridSDTCONPROsCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTCONPROSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV77GridSDTCONPROsPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDSDTCONPROSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV70FilterEmprcod = httpContext.cgiGet( sPrefix+"wcpOAV70FilterEmprcod") ;
         wcpOAV45CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV46CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV15BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV15BarDisNumfrom") ;
         wcpOAV16BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV16BarDisNumto") ;
         wcpOAV23BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23BarFecGenfrom"), 0) ;
         wcpOAV24BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24BarFecGento"), 0) ;
         wcpOAV34BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV35BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV19BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV19BarFecClifrom"), 0) ;
         wcpOAV20BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20BarFecClito"), 0) ;
         wcpOAV21BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV21BarFecFprfrom"), 0) ;
         wcpOAV22BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV22BarFecFprto"), 0) ;
         wcpOAV25BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV25BarFecSalfrom"), 0) ;
         wcpOAV26BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26BarFecSalto"), 0) ;
         wcpOAV32BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV32BarSerfrom") ;
         wcpOAV33BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV33BarSerto") ;
         wcpOAV36BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV11BarColNomfrom") ;
         wcpOAV12BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV12BarColNomto") ;
         wcpOAV13BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV14BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV28BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV28BarNomClifrom") ;
         wcpOAV29BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV29BarNomClito") ;
         wcpOAV30BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV88muestras = httpContext.cgiGet( sPrefix+"wcpOAV88muestras") ;
         wcpOAV5BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV6BarCodParfrom") ;
         wcpOAV7BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV7BarCodParto") ;
         wcpOAV194Cod_idtx = httpContext.cgiGet( sPrefix+"wcpOAV194Cod_idtx") ;
         wcpOAV27BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV27BarGirar") ;
         AV208CP_Barcolu = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCP_BARCOLU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV207CP_Barcolo = httpContext.cgiGet( sPrefix+"vCP_BARCOLO") ;
         AV206CP_BARSERDSC = httpContext.cgiGet( sPrefix+"vCP_BARSERDSC") ;
         AV205CP_Barser = httpContext.cgiGet( sPrefix+"vCP_BARSER") ;
         AV204CP_BARDISNUM = httpContext.cgiGet( sPrefix+"vCP_BARDISNUM") ;
         AV203CP_CliNom = httpContext.cgiGet( sPrefix+"vCP_CLINOM") ;
         AV202CP_Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCP_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV201CP_BarCodPar = httpContext.cgiGet( sPrefix+"vCP_BARCODPAR") ;
         AV200CP_BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCP_BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV199CP_BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCP_BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV198CP_EmprCod = httpContext.cgiGet( sPrefix+"vCP_EMPRCOD") ;
         AV215CP_BarColNum = localUtil.ctond( httpContext.cgiGet( sPrefix+"vCP_BARCOLNUM")) ;
         AV214CP_BarColNom = httpContext.cgiGet( sPrefix+"vCP_BARCOLNOM") ;
         AV210CP_BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"vCP_BARMTR")) ;
         AV209CP_BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"vCP_BARKGM")) ;
         GRIDSDTCONPROS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTCONPROS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdtconpros_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Gridsdtconprospaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Class") ;
         Gridsdtconprospaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Showfirst")) ;
         Gridsdtconprospaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Showprevious")) ;
         Gridsdtconprospaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Shownext")) ;
         Gridsdtconprospaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Showlast")) ;
         Gridsdtconprospaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtconprospaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdtconprospaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdtconprospaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Emptygridclass") ;
         Gridsdtconprospaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdtconprospaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtconprospaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdtconprospaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Previous") ;
         Gridsdtconprospaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Next") ;
         Gridsdtconprospaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Caption") ;
         Gridsdtconprospaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Emptygridcaption") ;
         Gridsdtconprospaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpagecaption") ;
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Historymanagement")) ;
         Dvpanel_panel_resultado_Width = httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Width") ;
         Dvpanel_panel_resultado_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Autowidth")) ;
         Dvpanel_panel_resultado_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Autoheight")) ;
         Dvpanel_panel_resultado_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Cls") ;
         Dvpanel_panel_resultado_Title = httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Title") ;
         Dvpanel_panel_resultado_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Collapsible")) ;
         Dvpanel_panel_resultado_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Collapsed")) ;
         Dvpanel_panel_resultado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Showcollapseicon")) ;
         Dvpanel_panel_resultado_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Iconposition") ;
         Dvpanel_panel_resultado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANEL_RESULTADO_Autoscroll")) ;
         Situacionfases_modal_Width = httpContext.cgiGet( sPrefix+"SITUACIONFASES_MODAL_Width") ;
         Situacionfases_modal_Title = httpContext.cgiGet( sPrefix+"SITUACIONFASES_MODAL_Title") ;
         Situacionfases_modal_Confirmtype = httpContext.cgiGet( sPrefix+"SITUACIONFASES_MODAL_Confirmtype") ;
         Situacionfases_modal_Bodytype = httpContext.cgiGet( sPrefix+"SITUACIONFASES_MODAL_Bodytype") ;
         Consultaalbaransalida_modal_Width = httpContext.cgiGet( sPrefix+"CONSULTAALBARANSALIDA_MODAL_Width") ;
         Consultaalbaransalida_modal_Title = httpContext.cgiGet( sPrefix+"CONSULTAALBARANSALIDA_MODAL_Title") ;
         Consultaalbaransalida_modal_Confirmtype = httpContext.cgiGet( sPrefix+"CONSULTAALBARANSALIDA_MODAL_Confirmtype") ;
         Consultaalbaransalida_modal_Bodytype = httpContext.cgiGet( sPrefix+"CONSULTAALBARANSALIDA_MODAL_Bodytype") ;
         Recetas_modal_Width = httpContext.cgiGet( sPrefix+"RECETAS_MODAL_Width") ;
         Recetas_modal_Title = httpContext.cgiGet( sPrefix+"RECETAS_MODAL_Title") ;
         Recetas_modal_Confirmtype = httpContext.cgiGet( sPrefix+"RECETAS_MODAL_Confirmtype") ;
         Recetas_modal_Bodytype = httpContext.cgiGet( sPrefix+"RECETAS_MODAL_Bodytype") ;
         Partesproduccion_modal_Width = httpContext.cgiGet( sPrefix+"PARTESPRODUCCION_MODAL_Width") ;
         Partesproduccion_modal_Title = httpContext.cgiGet( sPrefix+"PARTESPRODUCCION_MODAL_Title") ;
         Partesproduccion_modal_Confirmtype = httpContext.cgiGet( sPrefix+"PARTESPRODUCCION_MODAL_Confirmtype") ;
         Partesproduccion_modal_Bodytype = httpContext.cgiGet( sPrefix+"PARTESPRODUCCION_MODAL_Bodytype") ;
         Packinglist_modal_Width = httpContext.cgiGet( sPrefix+"PACKINGLIST_MODAL_Width") ;
         Packinglist_modal_Title = httpContext.cgiGet( sPrefix+"PACKINGLIST_MODAL_Title") ;
         Packinglist_modal_Confirmtype = httpContext.cgiGet( sPrefix+"PACKINGLIST_MODAL_Confirmtype") ;
         Packinglist_modal_Bodytype = httpContext.cgiGet( sPrefix+"PACKINGLIST_MODAL_Bodytype") ;
         Piezas_modal_Width = httpContext.cgiGet( sPrefix+"PIEZAS_MODAL_Width") ;
         Piezas_modal_Title = httpContext.cgiGet( sPrefix+"PIEZAS_MODAL_Title") ;
         Piezas_modal_Confirmtype = httpContext.cgiGet( sPrefix+"PIEZAS_MODAL_Confirmtype") ;
         Piezas_modal_Bodytype = httpContext.cgiGet( sPrefix+"PIEZAS_MODAL_Bodytype") ;
         Agrupadas_modal_Width = httpContext.cgiGet( sPrefix+"AGRUPADAS_MODAL_Width") ;
         Agrupadas_modal_Title = httpContext.cgiGet( sPrefix+"AGRUPADAS_MODAL_Title") ;
         Agrupadas_modal_Confirmtype = httpContext.cgiGet( sPrefix+"AGRUPADAS_MODAL_Confirmtype") ;
         Agrupadas_modal_Bodytype = httpContext.cgiGet( sPrefix+"AGRUPADAS_MODAL_Bodytype") ;
         Gridsdtconpros_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROS_EMPOWERER_Gridinternalname") ;
         subGridsdtconpros_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridsdtconprospaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Selectedpage") ;
         Gridsdtconprospaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDSDTCONPROSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_64 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_64"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_64_fel_idx = 0 ;
         while ( nGXsfl_64_fel_idx < nRC_GXsfl_64 )
         {
            nGXsfl_64_fel_idx = ((subGridsdtconpros_Islastpage==1)&&(nGXsfl_64_fel_idx+1>subgridsdtconpros_fnc_recordsperpage( )) ? 1 : nGXsfl_64_fel_idx+1) ;
            sGXsfl_64_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_642( ) ;
            AV225GXV1 = (int)(nGXsfl_64_fel_idx+GRIDSDTCONPROS_nFirstRecordOnPage) ;
            if ( ( AV96SDTCONPRO.size() >= AV225GXV1 ) && ( AV225GXV1 > 0 ) )
            {
               AV96SDTCONPRO.currentItem( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)) );
               cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
               cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
               AV73GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            }
         }
         if ( nGXsfl_64_fel_idx == 0 )
         {
            nGXsfl_64_idx = 1 ;
            sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_642( ) ;
         }
         nGXsfl_64_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPagina_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPagina_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPAGINA");
            GX_FocusControl = edtavPagina_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV95Pagina = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pagina", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Pagina), 4, 0));
         }
         else
         {
            AV95Pagina = (short)(localUtil.ctol( httpContext.cgiGet( edtavPagina_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pagina", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Pagina), 4, 0));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDAD");
            GX_FocusControl = edtavCantidad_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44Cantidad = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Cantidad", GXutil.ltrimstr( AV44Cantidad, 9, 2));
         }
         else
         {
            AV44Cantidad = localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Cantidad", GXutil.ltrimstr( AV44Cantidad, 9, 2));
         }
         AV180Total = httpContext.cgiGet( edtavTotal_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Total", AV180Total);
         AV217TotValueGridSDTCONPROs_CP_BARKGM = httpContext.cgiGet( edtavTotvaluegridsdtconpros_cp_barkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV217TotValueGridSDTCONPROs_CP_BARKGM", AV217TotValueGridSDTCONPROs_CP_BARKGM);
         AV219TotValueGridSDTCONPROs_CP_BARMTR = httpContext.cgiGet( edtavTotvaluegridsdtconpros_cp_barmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV219TotValueGridSDTCONPROs_CP_BARMTR", AV219TotValueGridSDTCONPROs_CP_BARMTR);
         AV221TotValueGridSDTCONPROs_CP_BARPIE = httpContext.cgiGet( edtavTotvaluegridsdtconpros_cp_barpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV221TotValueGridSDTCONPROs_CP_BARPIE", AV221TotValueGridSDTCONPROs_CP_BARPIE);
         AV265Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV265Pgmname", AV265Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaProduccionEO");
         AV44Cantidad = localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Cantidad", GXutil.ltrimstr( AV44Cantidad, 9, 2));
         forbiddenHiddens.add("Cantidad", localUtil.format( AV44Cantidad, "ZZZ,ZZ9.99"));
         AV180Total = httpContext.cgiGet( edtavTotal_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Total", AV180Total);
         forbiddenHiddens.add("Total", GXutil.rtrim( localUtil.format( AV180Total, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\consultaproduccioneo:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1526Z2 ();
      if (returnInSub) return;
   }

   public void e1526Z2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV98Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultaproduccioneo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV98Station = GXt_char1 ;
      GXv_char2[0] = AV64Emprcod ;
      GXv_char3[0] = AV65EmprNom ;
      GXv_char4[0] = AV190UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV98Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultaproduccioneo_impl.this.AV64Emprcod = GXv_char2[0] ;
      consultaproduccioneo_impl.this.AV65EmprNom = GXv_char3[0] ;
      consultaproduccioneo_impl.this.AV190UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Emprcod", AV64Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64Emprcod, "@!"))));
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      Gridsdtconpros_empowerer_Gridinternalname = subGridsdtconpros_Internalname ;
      ucGridsdtconpros_empowerer.sendProperty(context, sPrefix, false, Gridsdtconpros_empowerer_Internalname, "GridInternalName", Gridsdtconpros_empowerer_Gridinternalname);
      subGridsdtconpros_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridsdtconprospaginationbar_Rowsperpageselectedvalue = subGridsdtconpros_Rows ;
      ucGridsdtconprospaginationbar.sendProperty(context, sPrefix, false, Gridsdtconprospaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtconprospaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int5 = (byte)(AV87Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV64Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      consultaproduccioneo_impl.this.GXt_int5 = GXv_int6[0] ;
      AV87Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV87Moda21), "ZZZ9")));
      AV95Pagina = (short)(1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pagina", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Pagina), 4, 0));
      AV44Cantidad = DecimalUtil.doubleToDec(10) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Cantidad", GXutil.ltrimstr( AV44Cantidad, 9, 2));
      AV180Total = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Total", AV180Total);
      /* Execute user subroutine: 'CONSULTARCONTROLPRODUCCION' */
      S122 ();
      if (returnInSub) return;
      AV197NumeroRegistros = GXutil.lval( AV180Total) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV197NumeroRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV197NumeroRegistros), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNUMEROREGISTROS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV197NumeroRegistros), "ZZZZZZZZZ9")));
   }

   public void e1626Z2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'INITIALIZETOTALIZERSGRIDSDTCONPROS' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERSGRIDSDTCONPROS' */
      S142 ();
      if (returnInSub) return;
      AV76GridSDTCONPROsCurrentPage = subgridsdtconpros_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76GridSDTCONPROsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76GridSDTCONPROsCurrentPage), 10, 0));
      AV77GridSDTCONPROsPageCount = subgridsdtconpros_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77GridSDTCONPROsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77GridSDTCONPROsPageCount), 10, 0));
      AV77GridSDTCONPROsPageCount = (long)(AV197NumeroRegistros/ (double) (subGridsdtconpros_Rows)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77GridSDTCONPROsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77GridSDTCONPROsPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e1726Z2( )
   {
      /* Gridsdtconpros_Load Routine */
      returnInSub = false ;
      AV225GXV1 = 1 ;
      while ( AV225GXV1 <= AV96SDTCONPRO.size() )
      {
         AV96SDTCONPRO.currentItem( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)) );
         cmbavGridactiongroup1.removeAllItems();
         cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Situacion Fases", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Consulta Albaran Salida", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Recetas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Partes Produccion", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Packing List", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Consulta Almacen Tejido", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV64Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
         consultaproduccioneo_impl.this.GXt_int5 = GXv_int6[0] ;
         AV99TempBoolean = (boolean)((GXt_int5==1)) ;
         if ( AV99TempBoolean )
         {
            cmbavGridactiongroup1.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Alterar Data Ent.", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactiongroup1.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Impresion HDR", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
         if ( GXutil.strcmp(((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_baragrest(), "S") == 0 )
         {
            cmbavGridactiongroup1.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Agrupadas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(64) ;
         }
         if ( ( subGridsdtconpros_Islastpage == 1 ) || ( subGridsdtconpros_Rows == 0 ) || ( ( GRIDSDTCONPROS_nCurrentRecord >= GRIDSDTCONPROS_nFirstRecordOnPage ) && ( GRIDSDTCONPROS_nCurrentRecord < GRIDSDTCONPROS_nFirstRecordOnPage + subgridsdtconpros_fnc_recordsperpage( ) ) ) )
         {
            sendrow_642( ) ;
            GRIDSDTCONPROS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTCONPROS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTCONPROS_nCurrentRecord + 1 >= subgridsdtconpros_fnc_recordcount( ) )
            {
               GRIDSDTCONPROS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTCONPROS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTCONPROS_nCurrentRecord = (long)(GRIDSDTCONPROS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_64_Refreshing )
         {
            httpContext.doAjaxLoad(64, GridsdtconprosRow);
         }
         AV225GXV1 = (int)(AV225GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV73GridActionGroup1, 4, 0)) );
   }

   public void e1226Z2( )
   {
      AV225GXV1 = (int)(nGXsfl_64_idx+GRIDSDTCONPROS_nFirstRecordOnPage) ;
      if ( ( AV225GXV1 > 0 ) && ( AV96SDTCONPRO.size() >= AV225GXV1 ) )
      {
         AV96SDTCONPRO.currentItem( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)) );
      }
      /* Gridsdtconprospaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdtconprospaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdtconpros_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdtconprospaginationbar_Selectedpage, "Next") == 0 )
      {
         AV94PageToGo = subgridsdtconpros_fnc_currentpage( ) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94PageToGo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94PageToGo), 6, 0));
         AV94PageToGo = (int)(AV94PageToGo+1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94PageToGo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94PageToGo), 6, 0));
         subgridsdtconpros_gotopage( AV94PageToGo) ;
      }
      else
      {
         AV94PageToGo = (int)(GXutil.lval( Gridsdtconprospaginationbar_Selectedpage)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94PageToGo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94PageToGo), 6, 0));
         subgridsdtconpros_gotopage( AV94PageToGo) ;
      }
      /* Execute user subroutine: 'CONSULTARCONTROLPRODUCCION' */
      S122 ();
      if (returnInSub) return;
      gxgrgridsdtconpros_refresh( subGridsdtconpros_Rows, AV197NumeroRegistros, AV96SDTCONPRO, AV216TotGridSDTCONPROs_CP_BARKGM, AV218TotGridSDTCONPROs_CP_BARMTR, AV220TotGridSDTCONPROs_CP_BARPIE, AV64Emprcod, AV86Messages, AV195TFBarPlf, AV193Xml, AV211CP_BARFECFPR, AV87Moda21, AV214CP_BarColNom, AV215CP_BarColNum, AV44Cantidad, AV180Total, sPrefix) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV96SDTCONPRO", AV96SDTCONPRO);
      nGXsfl_64_bak_idx = nGXsfl_64_idx ;
      gxgrgridsdtconpros_refresh( subGridsdtconpros_Rows, AV197NumeroRegistros, AV96SDTCONPRO, AV216TotGridSDTCONPROs_CP_BARKGM, AV218TotGridSDTCONPROs_CP_BARMTR, AV220TotGridSDTCONPROs_CP_BARPIE, AV64Emprcod, AV86Messages, AV195TFBarPlf, AV193Xml, AV211CP_BARFECFPR, AV87Moda21, AV214CP_BarColNom, AV215CP_BarColNum, AV44Cantidad, AV180Total, sPrefix) ;
      nGXsfl_64_idx = nGXsfl_64_bak_idx ;
      sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_642( ) ;
   }

   public void e1326Z2( )
   {
      /* Gridsdtconprospaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdtconpros_Rows = Gridsdtconprospaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDSDTCONPROS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdtconpros_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1826Z2( )
   {
      AV225GXV1 = (int)(nGXsfl_64_idx+GRIDSDTCONPROS_nFirstRecordOnPage) ;
      if ( ( AV225GXV1 > 0 ) && ( AV96SDTCONPRO.size() >= AV225GXV1 ) )
      {
         AV96SDTCONPRO.currentItem( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)) );
      }
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      AV198CP_EmprCod = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_emprcod() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV198CP_EmprCod", AV198CP_EmprCod);
      AV199CP_BarCod = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_barcod() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV199CP_BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV199CP_BarCod), 8, 0));
      AV200CP_BarCodReo = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_barcodreo() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV200CP_BarCodReo", GXutil.str( AV200CP_BarCodReo, 1, 0));
      AV201CP_BarCodPar = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_barcodpar() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV201CP_BarCodPar", AV201CP_BarCodPar);
      AV202CP_Clicod = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_clicod() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV202CP_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV202CP_Clicod), 6, 0));
      AV203CP_CliNom = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_clinom() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV203CP_CliNom", AV203CP_CliNom);
      AV204CP_BARDISNUM = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_bardisnum() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV204CP_BARDISNUM", AV204CP_BARDISNUM);
      AV205CP_Barser = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_barser() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV205CP_Barser", AV205CP_Barser);
      AV206CP_BARSERDSC = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_barserdsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV206CP_BARSERDSC", AV206CP_BARSERDSC);
      AV207CP_Barcolo = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_barcolo() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV207CP_Barcolo", AV207CP_Barcolo);
      AV208CP_Barcolu = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_barcolu() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV208CP_Barcolu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV208CP_Barcolu), 6, 0));
      AV209CP_BarKgm = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_barkgm() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV209CP_BarKgm", GXutil.ltrimstr( AV209CP_BarKgm, 9, 2));
      AV210CP_BarMtr = ((app.SdtSDTCONPRO_Registro)(AV96SDTCONPRO.currentItem())).getgxTv_SdtSDTCONPRO_Registro_Cp_barmtr() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV210CP_BarMtr", GXutil.ltrimstr( AV210CP_BarMtr, 9, 2));
      if ( AV73GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO SITUACIONFASES' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO CONSULTAALBARANSALIDA' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO RECETAS' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO PARTESPRODUCCION' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActionGroup1 == 5 )
      {
         /* Execute user subroutine: 'DO PACKINGLIST' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActionGroup1 == 6 )
      {
         /* Execute user subroutine: 'DO PIEZAS' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActionGroup1 == 7 )
      {
         /* Execute user subroutine: 'DO MODIFICARFECHAE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActionGroup1 == 8 )
      {
         /* Execute user subroutine: 'DO IMPRESIONHDR' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActionGroup1 == 9 )
      {
         /* Execute user subroutine: 'DO AGRUPADAS' */
         S232 ();
         if (returnInSub) return;
      }
      AV73GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV73GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e1426Z2( )
   {
      /* 'DoExcel' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV67ExcelFilename ;
      GXv_char3[0] = AV66ErrorMessage ;
      new app.produccion.consultaproduccioneo_excel(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consultaproduccioneo_impl.this.AV67ExcelFilename = GXv_char4[0] ;
      consultaproduccioneo_impl.this.AV66ErrorMessage = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66ErrorMessage", AV66ErrorMessage);
      if ( GXutil.strcmp(AV67ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV67ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV66ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'DO SITUACIONFASES' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "SITUACIONFASES_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S162( )
   {
      /* 'DO CONSULTAALBARANSALIDA' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "CONSULTAALBARANSALIDA_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S172( )
   {
      /* 'DO RECETAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "RECETAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'DO PARTESPRODUCCION' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "PARTESPRODUCCION_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S192( )
   {
      /* 'DO PACKINGLIST' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_packinglist", new String[] {GXutil.URLEncode(GXutil.rtrim(AV198CP_EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV199CP_BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV200CP_BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV201CP_BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV202CP_Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV203CP_CliNom)),GXutil.URLEncode(GXutil.rtrim(AV204CP_BARDISNUM)),GXutil.URLEncode(GXutil.rtrim(AV205CP_Barser)),GXutil.URLEncode(GXutil.rtrim(AV206CP_BARSERDSC)),GXutil.URLEncode(GXutil.rtrim(AV207CP_Barcolo)),GXutil.URLEncode(GXutil.ltrimstr(AV208CP_Barcolu,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) , new Object[] {});
   }

   public void S202( )
   {
      /* 'DO PIEZAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "PIEZAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S212( )
   {
      /* 'DO MODIFICARFECHAE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_modfecent", new String[] {GXutil.URLEncode(GXutil.rtrim(AV198CP_EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV199CP_BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV200CP_BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV201CP_BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV202CP_Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV203CP_CliNom)),GXutil.URLEncode(GXutil.rtrim(AV204CP_BARDISNUM)),GXutil.URLEncode(GXutil.rtrim(AV205CP_Barser)),GXutil.URLEncode(GXutil.rtrim(AV206CP_BARSERDSC)),GXutil.URLEncode(GXutil.rtrim(AV207CP_Barcolo)),GXutil.URLEncode(GXutil.ltrimstr(AV208CP_Barcolu,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV211CP_BARFECFPR))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum","BarFecFpr"}) , new Object[] {});
   }

   public void S222( )
   {
      /* 'DO IMPRESIONHDR' Routine */
      returnInSub = false ;
      if ( AV87Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.rhdrmod", new String[] {GXutil.URLEncode(GXutil.rtrim(AV198CP_EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV199CP_BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV200CP_BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV201CP_BarCodPar)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir el formato", ""));
      }
   }

   public void S232( )
   {
      /* 'DO AGRUPADAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "AGRUPADAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divUnnamedtable1_Visible = (((1==2)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Visible), 5, 0), true);
   }

   public void S132( )
   {
      /* 'INITIALIZETOTALIZERSGRIDSDTCONPROS' Routine */
      returnInSub = false ;
      AV216TotGridSDTCONPROs_CP_BARKGM = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV216TotGridSDTCONPROs_CP_BARKGM", GXutil.ltrimstr( AV216TotGridSDTCONPROs_CP_BARKGM, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV216TotGridSDTCONPROs_CP_BARKGM, "ZZZZZ9.99")));
      AV218TotGridSDTCONPROs_CP_BARMTR = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV218TotGridSDTCONPROs_CP_BARMTR", GXutil.ltrimstr( AV218TotGridSDTCONPROs_CP_BARMTR, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV218TotGridSDTCONPROs_CP_BARMTR, "ZZZZZ9.99")));
      AV220TotGridSDTCONPROs_CP_BARPIE = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220TotGridSDTCONPROs_CP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV220TotGridSDTCONPROs_CP_BARPIE), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV220TotGridSDTCONPROs_CP_BARPIE), "ZZZZZ9")));
   }

   public void S142( )
   {
      /* 'CALCULATETOTALIZERSGRIDSDTCONPROS' Routine */
      returnInSub = false ;
      AV266GXV41 = 1 ;
      while ( AV266GXV41 <= AV96SDTCONPRO.size() )
      {
         AV196SDTCONPROItem = (app.SdtSDTCONPRO_Registro)((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV266GXV41));
         AV216TotGridSDTCONPROs_CP_BARKGM = AV216TotGridSDTCONPROs_CP_BARKGM.add((AV196SDTCONPROItem.getgxTv_SdtSDTCONPRO_Registro_Cp_barkgm())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV216TotGridSDTCONPROs_CP_BARKGM", GXutil.ltrimstr( AV216TotGridSDTCONPROs_CP_BARKGM, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV216TotGridSDTCONPROs_CP_BARKGM, "ZZZZZ9.99")));
         AV218TotGridSDTCONPROs_CP_BARMTR = AV218TotGridSDTCONPROs_CP_BARMTR.add((AV196SDTCONPROItem.getgxTv_SdtSDTCONPRO_Registro_Cp_barmtr())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV218TotGridSDTCONPROs_CP_BARMTR", GXutil.ltrimstr( AV218TotGridSDTCONPROs_CP_BARMTR, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV218TotGridSDTCONPROs_CP_BARMTR, "ZZZZZ9.99")));
         AV220TotGridSDTCONPROs_CP_BARPIE = (long)(AV220TotGridSDTCONPROs_CP_BARPIE+(AV196SDTCONPROItem.getgxTv_SdtSDTCONPRO_Registro_Cp_barpie())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV220TotGridSDTCONPROs_CP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV220TotGridSDTCONPROs_CP_BARPIE), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTGRIDSDTCONPROS_CP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV220TotGridSDTCONPROs_CP_BARPIE), "ZZZZZ9")));
         AV266GXV41 = (int)(AV266GXV41+1) ;
      }
      AV217TotValueGridSDTCONPROs_CP_BARKGM = localUtil.format( AV216TotGridSDTCONPROs_CP_BARKGM, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV217TotValueGridSDTCONPROs_CP_BARKGM", AV217TotValueGridSDTCONPROs_CP_BARKGM);
      AV219TotValueGridSDTCONPROs_CP_BARMTR = localUtil.format( AV218TotGridSDTCONPROs_CP_BARMTR, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV219TotValueGridSDTCONPROs_CP_BARMTR", AV219TotValueGridSDTCONPROs_CP_BARMTR);
      AV221TotValueGridSDTCONPROs_CP_BARPIE = localUtil.format( DecimalUtil.doubleToDec(AV220TotGridSDTCONPROs_CP_BARPIE), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV221TotValueGridSDTCONPROs_CP_BARPIE", AV221TotValueGridSDTCONPROs_CP_BARPIE);
   }

   public void S122( )
   {
      /* 'CONSULTARCONTROLPRODUCCION' Routine */
      returnInSub = false ;
      if ( AV96SDTCONPRO.fromJSonString(AV191WebSession.getValue("GridStateConPro"), AV86Messages) )
      {
         System.out.println( GXutil.format( httpContext.getMessage( "Page %1 of %2 rows, total %3 ", ""), GXutil.str( AV95Pagina, 4, 0), GXutil.str( AV44Cantidad, 9, 2), AV180Total, "", "", "", "", "", "") );
      }
      else
      {
         AV95Pagina = (short)(((0==AV94PageToGo) ? AV95Pagina : AV94PageToGo)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pagina", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Pagina), 4, 0));
         /* User Code */
            try {
         Pagina_int10_0 = AV95Pagina ;
         Cantidad_int10_0 = (long)(DecimalUtil.decToDouble(AV44Cantidad)) ;
         Barserfrom_svchar40_0 = AV32BarSerfrom ;
         Barserto_svchar40_0 = AV33BarSerto ;
         Barcolnomfrom_svchar40_0 = AV11BarColNomfrom ;
         Barcolnomto_svchar40_0 = AV12BarColNomto ;
         Barcolnumfrom_int8_0 = AV13BarColNumfrom ;
         Barcolnumto_int8_0 = AV14BarColNumto ;
         Barnomclifrom_svchar40_0 = AV28BarNomClifrom ;
         Barnomclito_svchar40_0 = AV29BarNomClito ;
         Barnumclifrom_int8_0 = AV30BarNumClifrom ;
         Barnumclito_int8_0 = AV31BarNumClito ;
         Bartipartfrom_int8_0 = AV36BarTipArtfrom ;
         Bartipartto_int8_0 = AV37BarTipArtto ;
         Barcodreofrom_int8_0 = AV8BarCodReofrom ;
         Barcodreoto_int8_0 = AV9BarCodReoto ;
         Cod_idtx_svchar40_0 = AV194Cod_idtx ;
         Tfbarplf_svchar40_0 = AV195TFBarPlf ;
         Bargirar_svchar40_0 = AV27BarGirar ;
         Xml_vchar8388608_0 = "" ;
         /* Using cursor H026Z2 */
         pr_default.execute(0, new Object[] {AV64Emprcod, Long.valueOf(Pagina_int10_0), Long.valueOf(Cantidad_int10_0), AV15BarDisNumfrom, AV16BarDisNumto, Integer.valueOf(AV45CliCodfrom), Integer.valueOf(AV46CliCodto), Byte.valueOf(AV34BarSitfrom), Byte.valueOf(AV35BarSitto), AV23BarFecGenfrom, AV24BarFecGento, AV25BarFecSalfrom, AV26BarFecSalto, AV19BarFecClifrom, AV20BarFecClito, AV21BarFecFprfrom, AV22BarFecFprto, Barserfrom_svchar40_0, Barserto_svchar40_0, Barcolnomfrom_svchar40_0, Barcolnomto_svchar40_0, Integer.valueOf(Barcolnumfrom_int8_0), Integer.valueOf(Barcolnumto_int8_0), Barnomclifrom_svchar40_0, Barnomclito_svchar40_0, Integer.valueOf(Barnumclifrom_int8_0), Integer.valueOf(Barnumclito_int8_0), Integer.valueOf(Bartipartfrom_int8_0), Integer.valueOf(Bartipartto_int8_0), Integer.valueOf(AV5BarCodfrom), Integer.valueOf(AV10BarCodto), Integer.valueOf(Barcodreofrom_int8_0), Integer.valueOf(Barcodreoto_int8_0), AV6BarCodParfrom, AV7BarCodParto, Cod_idtx_svchar40_0, Tfbarplf_svchar40_0, Bargirar_svchar40_0, Xml_vchar8388608_0, AV180Total});
         Xml_vchar8388608_0 = H026Z2_AXml_vchar8388608_0[0] ;
         AV180Total = H026Z2_AV180Total[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV180Total", AV180Total);
         AV193Xml = Xml_vchar8388608_0 ;
         /* User Code */
           } catch (java.lang.Exception e) {
         /* User Code */
            AV66ErrorMessage =  e.getMessage();
         /* User Code */
            }
         if ( ! (GXutil.strcmp("", AV66ErrorMessage)==0) )
         {
            httpContext.GX_msglist.addItem(AV66ErrorMessage);
         }
         AV96SDTCONPRO = new GXBaseCollection<app.SdtSDTCONPRO_Registro>(app.SdtSDTCONPRO_Registro.class, "Registro", "", remoteHandle) ;
         gx_BV64 = true ;
         if ( AV96SDTCONPRO.fromxml(AV193Xml, AV86Messages, "CONPRO") )
         {
            AV191WebSession.setValue(AV96SDTCONPRO.toJSonString(false), "GridStateConPro");
         }
         else
         {
            AV267GXV42 = 1 ;
            while ( AV267GXV42 <= AV86Messages.size() )
            {
               AV85Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV86Messages.elementAt(-1+AV267GXV42));
               httpContext.GX_msglist.addItem(AV85Message.getgxTv_SdtMessages_Message_Description());
               AV267GXV42 = (int)(AV267GXV42+1) ;
            }
         }
      }
   }

   public void wb_table8_198_26Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTableagrupadas_modal_Internalname, tblTableagrupadas_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucAgrupadas_modal.setProperty("Width", Agrupadas_modal_Width);
         ucAgrupadas_modal.setProperty("Title", Agrupadas_modal_Title);
         ucAgrupadas_modal.setProperty("ConfirmType", Agrupadas_modal_Confirmtype);
         ucAgrupadas_modal.setProperty("BodyType", Agrupadas_modal_Bodytype);
         ucAgrupadas_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Agrupadas_modal_Internalname, sPrefix+"AGRUPADAS_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"AGRUPADAS_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_198_26Z2e( true) ;
      }
      else
      {
         wb_table8_198_26Z2e( false) ;
      }
   }

   public void wb_table7_193_26Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablepiezas_modal_Internalname, tblTablepiezas_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucPiezas_modal.setProperty("Width", Piezas_modal_Width);
         ucPiezas_modal.setProperty("Title", Piezas_modal_Title);
         ucPiezas_modal.setProperty("ConfirmType", Piezas_modal_Confirmtype);
         ucPiezas_modal.setProperty("BodyType", Piezas_modal_Bodytype);
         ucPiezas_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Piezas_modal_Internalname, sPrefix+"PIEZAS_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"PIEZAS_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_193_26Z2e( true) ;
      }
      else
      {
         wb_table7_193_26Z2e( false) ;
      }
   }

   public void wb_table6_188_26Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablepackinglist_modal_Internalname, tblTablepackinglist_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucPackinglist_modal.setProperty("Width", Packinglist_modal_Width);
         ucPackinglist_modal.setProperty("Title", Packinglist_modal_Title);
         ucPackinglist_modal.setProperty("ConfirmType", Packinglist_modal_Confirmtype);
         ucPackinglist_modal.setProperty("BodyType", Packinglist_modal_Bodytype);
         ucPackinglist_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Packinglist_modal_Internalname, sPrefix+"PACKINGLIST_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"PACKINGLIST_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_188_26Z2e( true) ;
      }
      else
      {
         wb_table6_188_26Z2e( false) ;
      }
   }

   public void wb_table5_183_26Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablepartesproduccion_modal_Internalname, tblTablepartesproduccion_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucPartesproduccion_modal.setProperty("Width", Partesproduccion_modal_Width);
         ucPartesproduccion_modal.setProperty("Title", Partesproduccion_modal_Title);
         ucPartesproduccion_modal.setProperty("ConfirmType", Partesproduccion_modal_Confirmtype);
         ucPartesproduccion_modal.setProperty("BodyType", Partesproduccion_modal_Bodytype);
         ucPartesproduccion_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Partesproduccion_modal_Internalname, sPrefix+"PARTESPRODUCCION_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"PARTESPRODUCCION_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_183_26Z2e( true) ;
      }
      else
      {
         wb_table5_183_26Z2e( false) ;
      }
   }

   public void wb_table4_178_26Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerecetas_modal_Internalname, tblTablerecetas_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucRecetas_modal.setProperty("Width", Recetas_modal_Width);
         ucRecetas_modal.setProperty("Title", Recetas_modal_Title);
         ucRecetas_modal.setProperty("ConfirmType", Recetas_modal_Confirmtype);
         ucRecetas_modal.setProperty("BodyType", Recetas_modal_Bodytype);
         ucRecetas_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Recetas_modal_Internalname, sPrefix+"RECETAS_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"RECETAS_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_178_26Z2e( true) ;
      }
      else
      {
         wb_table4_178_26Z2e( false) ;
      }
   }

   public void wb_table3_173_26Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTableconsultaalbaransalida_modal_Internalname, tblTableconsultaalbaransalida_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucConsultaalbaransalida_modal.setProperty("Width", Consultaalbaransalida_modal_Width);
         ucConsultaalbaransalida_modal.setProperty("Title", Consultaalbaransalida_modal_Title);
         ucConsultaalbaransalida_modal.setProperty("ConfirmType", Consultaalbaransalida_modal_Confirmtype);
         ucConsultaalbaransalida_modal.setProperty("BodyType", Consultaalbaransalida_modal_Bodytype);
         ucConsultaalbaransalida_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Consultaalbaransalida_modal_Internalname, sPrefix+"CONSULTAALBARANSALIDA_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"CONSULTAALBARANSALIDA_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_173_26Z2e( true) ;
      }
      else
      {
         wb_table3_173_26Z2e( false) ;
      }
   }

   public void wb_table2_168_26Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablesituacionfases_modal_Internalname, tblTablesituacionfases_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucSituacionfases_modal.setProperty("Width", Situacionfases_modal_Width);
         ucSituacionfases_modal.setProperty("Title", Situacionfases_modal_Title);
         ucSituacionfases_modal.setProperty("ConfirmType", Situacionfases_modal_Confirmtype);
         ucSituacionfases_modal.setProperty("BodyType", Situacionfases_modal_Bodytype);
         ucSituacionfases_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Situacionfases_modal_Internalname, sPrefix+"SITUACIONFASES_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"SITUACIONFASES_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_168_26Z2e( true) ;
      }
      else
      {
         wb_table2_168_26Z2e( false) ;
      }
   }

   public void wb_table1_107_26Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridsdtconprostabletotalizer_Internalname, tblGridsdtconprostabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluegridsdtconpros_cp_barkgm_Internalname, httpContext.getMessage( "Tot Value Grid SDTCONPROs_CP_BARKGM", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'" + sPrefix + "',false,'" + sGXsfl_64_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluegridsdtconpros_cp_barkgm_Internalname, AV217TotValueGridSDTCONPROs_CP_BARKGM, GXutil.rtrim( localUtil.format( AV217TotValueGridSDTCONPROs_CP_BARKGM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluegridsdtconpros_cp_barkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluegridsdtconpros_cp_barkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultaProduccionEO.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluegridsdtconpros_cp_barmtr_Internalname, httpContext.getMessage( "Tot Value Grid SDTCONPROs_CP_BARMTR", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'" + sPrefix + "',false,'" + sGXsfl_64_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluegridsdtconpros_cp_barmtr_Internalname, AV219TotValueGridSDTCONPROs_CP_BARMTR, GXutil.rtrim( localUtil.format( AV219TotValueGridSDTCONPROs_CP_BARMTR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,147);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluegridsdtconpros_cp_barmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluegridsdtconpros_cp_barmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultaProduccionEO.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluegridsdtconpros_cp_barpie_Internalname, httpContext.getMessage( "Tot Value Grid SDTCONPROs_CP_BARPIE", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'" + sPrefix + "',false,'" + sGXsfl_64_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluegridsdtconpros_cp_barpie_Internalname, AV221TotValueGridSDTCONPROs_CP_BARPIE, GXutil.rtrim( localUtil.format( AV221TotValueGridSDTCONPROs_CP_BARPIE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,150);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluegridsdtconpros_cp_barpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluegridsdtconpros_cp_barpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultaProduccionEO.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_107_26Z2e( true) ;
      }
      else
      {
         wb_table1_107_26Z2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV70FilterEmprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70FilterEmprcod", AV70FilterEmprcod);
      AV45CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCodfrom), 6, 0));
      AV46CliCodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CliCodto), 6, 0));
      AV15BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarDisNumfrom", AV15BarDisNumfrom);
      AV16BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarDisNumto", AV16BarDisNumto);
      AV23BarFecGenfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarFecGenfrom", localUtil.format(AV23BarFecGenfrom, "99/99/99"));
      AV24BarFecGento = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarFecGento", localUtil.format(AV24BarFecGento, "99/99/99"));
      AV34BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarSitfrom), 2, 0));
      AV35BarSitto = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarSitto), 2, 0));
      AV19BarFecClifrom = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarFecClifrom", localUtil.format(AV19BarFecClifrom, "99/99/99"));
      AV20BarFecClito = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarFecClito", localUtil.format(AV20BarFecClito, "99/99/99"));
      AV21BarFecFprfrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarFecFprfrom", localUtil.format(AV21BarFecFprfrom, "99/99/99"));
      AV22BarFecFprto = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarFecFprto", localUtil.format(AV22BarFecFprto, "99/99/99"));
      AV25BarFecSalfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarFecSalfrom", localUtil.format(AV25BarFecSalfrom, "99/99/99"));
      AV26BarFecSalto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarFecSalto", localUtil.format(AV26BarFecSalto, "99/99/99"));
      AV32BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSerfrom", AV32BarSerfrom);
      AV33BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSerto", AV33BarSerto);
      AV36BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarTipArtfrom), 4, 0));
      AV37BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipArtto), 4, 0));
      AV11BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarColNomfrom", AV11BarColNomfrom);
      AV12BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarColNomto", AV12BarColNomto);
      AV13BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNumfrom), 6, 0));
      AV14BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumto), 6, 0));
      AV28BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarNomClifrom", AV28BarNomClifrom);
      AV29BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarNomClito", AV29BarNomClito);
      AV30BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,25,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarNumClifrom), 6, 0));
      AV31BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,26,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarNumClito), 6, 0));
      AV36BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarTipArtfrom), 4, 0));
      AV37BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipArtto), 4, 0));
      AV88muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88muestras", AV88muestras);
      AV5BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,30,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodfrom), 8, 0));
      AV10BarCodto = ((Number) GXutil.testNumericType( getParm(obj,31,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCodto), 8, 0));
      AV8BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodReofrom", GXutil.str( AV8BarCodReofrom, 1, 0));
      AV9BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCodReoto", GXutil.str( AV9BarCodReoto, 1, 0));
      AV6BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodParfrom", AV6BarCodParfrom);
      AV7BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodParto", AV7BarCodParto);
      AV194Cod_idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV194Cod_idtx", AV194Cod_idtx);
      AV27BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarGirar", AV27BarGirar);
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
      pa26Z2( ) ;
      ws26Z2( ) ;
      we26Z2( ) ;
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
      sCtrlAV70FilterEmprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV45CliCodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV46CliCodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV15BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV16BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV23BarFecGenfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV24BarFecGento = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV34BarSitfrom = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV35BarSitto = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV19BarFecClifrom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV20BarFecClito = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV21BarFecFprfrom = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV22BarFecFprto = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV25BarFecSalfrom = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV26BarFecSalto = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV32BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV33BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV36BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV37BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV11BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV12BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV13BarColNumfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
      sCtrlAV14BarColNumto = (String)getParm(obj,22,TypeConstants.STRING) ;
      sCtrlAV28BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      sCtrlAV29BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      sCtrlAV30BarNumClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
      sCtrlAV31BarNumClito = (String)getParm(obj,26,TypeConstants.STRING) ;
      sCtrlAV36BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV37BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV88muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      sCtrlAV5BarCodfrom = (String)getParm(obj,30,TypeConstants.STRING) ;
      sCtrlAV10BarCodto = (String)getParm(obj,31,TypeConstants.STRING) ;
      sCtrlAV8BarCodReofrom = (String)getParm(obj,32,TypeConstants.STRING) ;
      sCtrlAV9BarCodReoto = (String)getParm(obj,33,TypeConstants.STRING) ;
      sCtrlAV6BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      sCtrlAV7BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      sCtrlAV194Cod_idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      sCtrlAV27BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa26Z2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\consultaproduccioneo", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa26Z2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV70FilterEmprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70FilterEmprcod", AV70FilterEmprcod);
         AV45CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCodfrom), 6, 0));
         AV46CliCodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CliCodto), 6, 0));
         AV15BarDisNumfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarDisNumfrom", AV15BarDisNumfrom);
         AV16BarDisNumto = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarDisNumto", AV16BarDisNumto);
         AV23BarFecGenfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarFecGenfrom", localUtil.format(AV23BarFecGenfrom, "99/99/99"));
         AV24BarFecGento = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarFecGento", localUtil.format(AV24BarFecGento, "99/99/99"));
         AV34BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarSitfrom), 2, 0));
         AV35BarSitto = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarSitto), 2, 0));
         AV19BarFecClifrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarFecClifrom", localUtil.format(AV19BarFecClifrom, "99/99/99"));
         AV20BarFecClito = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarFecClito", localUtil.format(AV20BarFecClito, "99/99/99"));
         AV21BarFecFprfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarFecFprfrom", localUtil.format(AV21BarFecFprfrom, "99/99/99"));
         AV22BarFecFprto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarFecFprto", localUtil.format(AV22BarFecFprto, "99/99/99"));
         AV25BarFecSalfrom = (java.util.Date)getParm(obj,15,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarFecSalfrom", localUtil.format(AV25BarFecSalfrom, "99/99/99"));
         AV26BarFecSalto = (java.util.Date)getParm(obj,16,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarFecSalto", localUtil.format(AV26BarFecSalto, "99/99/99"));
         AV32BarSerfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSerfrom", AV32BarSerfrom);
         AV33BarSerto = (String)getParm(obj,18,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSerto", AV33BarSerto);
         AV36BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarTipArtfrom), 4, 0));
         AV37BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipArtto), 4, 0));
         AV11BarColNomfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarColNomfrom", AV11BarColNomfrom);
         AV12BarColNomto = (String)getParm(obj,22,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarColNomto", AV12BarColNomto);
         AV13BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNumfrom), 6, 0));
         AV14BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,24,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumto), 6, 0));
         AV28BarNomClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarNomClifrom", AV28BarNomClifrom);
         AV29BarNomClito = (String)getParm(obj,26,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarNomClito", AV29BarNomClito);
         AV30BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,27,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarNumClifrom), 6, 0));
         AV31BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,28,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarNumClito), 6, 0));
         AV36BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarTipArtfrom), 4, 0));
         AV37BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipArtto), 4, 0));
         AV88muestras = (String)getParm(obj,31,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88muestras", AV88muestras);
         AV5BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodfrom), 8, 0));
         AV10BarCodto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCodto), 8, 0));
         AV8BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,34,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodReofrom", GXutil.str( AV8BarCodReofrom, 1, 0));
         AV9BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,35,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCodReoto", GXutil.str( AV9BarCodReoto, 1, 0));
         AV6BarCodParfrom = (String)getParm(obj,36,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodParfrom", AV6BarCodParfrom);
         AV7BarCodParto = (String)getParm(obj,37,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodParto", AV7BarCodParto);
         AV194Cod_idtx = (String)getParm(obj,38,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV194Cod_idtx", AV194Cod_idtx);
         AV27BarGirar = (String)getParm(obj,39,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarGirar", AV27BarGirar);
      }
      wcpOAV70FilterEmprcod = httpContext.cgiGet( sPrefix+"wcpOAV70FilterEmprcod") ;
      wcpOAV45CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV46CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV15BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV15BarDisNumfrom") ;
      wcpOAV16BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV16BarDisNumto") ;
      wcpOAV23BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23BarFecGenfrom"), 0) ;
      wcpOAV24BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24BarFecGento"), 0) ;
      wcpOAV34BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV19BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV19BarFecClifrom"), 0) ;
      wcpOAV20BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20BarFecClito"), 0) ;
      wcpOAV21BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV21BarFecFprfrom"), 0) ;
      wcpOAV22BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV22BarFecFprto"), 0) ;
      wcpOAV25BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV25BarFecSalfrom"), 0) ;
      wcpOAV26BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26BarFecSalto"), 0) ;
      wcpOAV32BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV32BarSerfrom") ;
      wcpOAV33BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV33BarSerto") ;
      wcpOAV36BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV11BarColNomfrom") ;
      wcpOAV12BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV12BarColNomto") ;
      wcpOAV13BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV14BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV28BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV28BarNomClifrom") ;
      wcpOAV29BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV29BarNomClito") ;
      wcpOAV30BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV88muestras = httpContext.cgiGet( sPrefix+"wcpOAV88muestras") ;
      wcpOAV5BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV6BarCodParfrom") ;
      wcpOAV7BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV7BarCodParto") ;
      wcpOAV194Cod_idtx = httpContext.cgiGet( sPrefix+"wcpOAV194Cod_idtx") ;
      wcpOAV27BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV27BarGirar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV70FilterEmprcod, wcpOAV70FilterEmprcod) != 0 ) || ( AV45CliCodfrom != wcpOAV45CliCodfrom ) || ( AV46CliCodto != wcpOAV46CliCodto ) || ( GXutil.strcmp(AV15BarDisNumfrom, wcpOAV15BarDisNumfrom) != 0 ) || ( GXutil.strcmp(AV16BarDisNumto, wcpOAV16BarDisNumto) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV23BarFecGenfrom), GXutil.resetTime(wcpOAV23BarFecGenfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV24BarFecGento), GXutil.resetTime(wcpOAV24BarFecGento)) ) || ( AV34BarSitfrom != wcpOAV34BarSitfrom ) || ( AV35BarSitto != wcpOAV35BarSitto ) || !( GXutil.dateCompare(GXutil.resetTime(AV19BarFecClifrom), GXutil.resetTime(wcpOAV19BarFecClifrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV20BarFecClito), GXutil.resetTime(wcpOAV20BarFecClito)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV21BarFecFprfrom), GXutil.resetTime(wcpOAV21BarFecFprfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV22BarFecFprto), GXutil.resetTime(wcpOAV22BarFecFprto)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV25BarFecSalfrom), GXutil.resetTime(wcpOAV25BarFecSalfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV26BarFecSalto), GXutil.resetTime(wcpOAV26BarFecSalto)) ) || ( GXutil.strcmp(AV32BarSerfrom, wcpOAV32BarSerfrom) != 0 ) || ( GXutil.strcmp(AV33BarSerto, wcpOAV33BarSerto) != 0 ) || ( AV36BarTipArtfrom != wcpOAV36BarTipArtfrom ) || ( AV37BarTipArtto != wcpOAV37BarTipArtto ) || ( GXutil.strcmp(AV11BarColNomfrom, wcpOAV11BarColNomfrom) != 0 ) || ( GXutil.strcmp(AV12BarColNomto, wcpOAV12BarColNomto) != 0 ) || ( AV13BarColNumfrom != wcpOAV13BarColNumfrom ) || ( AV14BarColNumto != wcpOAV14BarColNumto ) || ( GXutil.strcmp(AV28BarNomClifrom, wcpOAV28BarNomClifrom) != 0 ) || ( GXutil.strcmp(AV29BarNomClito, wcpOAV29BarNomClito) != 0 ) || ( AV30BarNumClifrom != wcpOAV30BarNumClifrom ) || ( AV31BarNumClito != wcpOAV31BarNumClito ) || ( GXutil.strcmp(AV88muestras, wcpOAV88muestras) != 0 ) || ( AV5BarCodfrom != wcpOAV5BarCodfrom ) || ( AV10BarCodto != wcpOAV10BarCodto ) || ( AV8BarCodReofrom != wcpOAV8BarCodReofrom ) || ( AV9BarCodReoto != wcpOAV9BarCodReoto ) || ( GXutil.strcmp(AV6BarCodParfrom, wcpOAV6BarCodParfrom) != 0 ) || ( GXutil.strcmp(AV7BarCodParto, wcpOAV7BarCodParto) != 0 ) || ( GXutil.strcmp(AV194Cod_idtx, wcpOAV194Cod_idtx) != 0 ) || ( GXutil.strcmp(AV27BarGirar, wcpOAV27BarGirar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV70FilterEmprcod = AV70FilterEmprcod ;
      wcpOAV45CliCodfrom = AV45CliCodfrom ;
      wcpOAV46CliCodto = AV46CliCodto ;
      wcpOAV15BarDisNumfrom = AV15BarDisNumfrom ;
      wcpOAV16BarDisNumto = AV16BarDisNumto ;
      wcpOAV23BarFecGenfrom = AV23BarFecGenfrom ;
      wcpOAV24BarFecGento = AV24BarFecGento ;
      wcpOAV34BarSitfrom = AV34BarSitfrom ;
      wcpOAV35BarSitto = AV35BarSitto ;
      wcpOAV19BarFecClifrom = AV19BarFecClifrom ;
      wcpOAV20BarFecClito = AV20BarFecClito ;
      wcpOAV21BarFecFprfrom = AV21BarFecFprfrom ;
      wcpOAV22BarFecFprto = AV22BarFecFprto ;
      wcpOAV25BarFecSalfrom = AV25BarFecSalfrom ;
      wcpOAV26BarFecSalto = AV26BarFecSalto ;
      wcpOAV32BarSerfrom = AV32BarSerfrom ;
      wcpOAV33BarSerto = AV33BarSerto ;
      wcpOAV36BarTipArtfrom = AV36BarTipArtfrom ;
      wcpOAV37BarTipArtto = AV37BarTipArtto ;
      wcpOAV11BarColNomfrom = AV11BarColNomfrom ;
      wcpOAV12BarColNomto = AV12BarColNomto ;
      wcpOAV13BarColNumfrom = AV13BarColNumfrom ;
      wcpOAV14BarColNumto = AV14BarColNumto ;
      wcpOAV28BarNomClifrom = AV28BarNomClifrom ;
      wcpOAV29BarNomClito = AV29BarNomClito ;
      wcpOAV30BarNumClifrom = AV30BarNumClifrom ;
      wcpOAV31BarNumClito = AV31BarNumClito ;
      wcpOAV88muestras = AV88muestras ;
      wcpOAV5BarCodfrom = AV5BarCodfrom ;
      wcpOAV10BarCodto = AV10BarCodto ;
      wcpOAV8BarCodReofrom = AV8BarCodReofrom ;
      wcpOAV9BarCodReoto = AV9BarCodReoto ;
      wcpOAV6BarCodParfrom = AV6BarCodParfrom ;
      wcpOAV7BarCodParto = AV7BarCodParto ;
      wcpOAV194Cod_idtx = AV194Cod_idtx ;
      wcpOAV27BarGirar = AV27BarGirar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV70FilterEmprcod = httpContext.cgiGet( sPrefix+"AV70FilterEmprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV70FilterEmprcod) > 0 )
      {
         AV70FilterEmprcod = httpContext.cgiGet( sCtrlAV70FilterEmprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70FilterEmprcod", AV70FilterEmprcod);
      }
      else
      {
         AV70FilterEmprcod = httpContext.cgiGet( sPrefix+"AV70FilterEmprcod_PARM") ;
      }
      sCtrlAV45CliCodfrom = httpContext.cgiGet( sPrefix+"AV45CliCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV45CliCodfrom) > 0 )
      {
         AV45CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV45CliCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCodfrom), 6, 0));
      }
      else
      {
         AV45CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV45CliCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV46CliCodto = httpContext.cgiGet( sPrefix+"AV46CliCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV46CliCodto) > 0 )
      {
         AV46CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV46CliCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CliCodto), 6, 0));
      }
      else
      {
         AV46CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV46CliCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV15BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV15BarDisNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV15BarDisNumfrom) > 0 )
      {
         AV15BarDisNumfrom = httpContext.cgiGet( sCtrlAV15BarDisNumfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarDisNumfrom", AV15BarDisNumfrom);
      }
      else
      {
         AV15BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV15BarDisNumfrom_PARM") ;
      }
      sCtrlAV16BarDisNumto = httpContext.cgiGet( sPrefix+"AV16BarDisNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV16BarDisNumto) > 0 )
      {
         AV16BarDisNumto = httpContext.cgiGet( sCtrlAV16BarDisNumto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarDisNumto", AV16BarDisNumto);
      }
      else
      {
         AV16BarDisNumto = httpContext.cgiGet( sPrefix+"AV16BarDisNumto_PARM") ;
      }
      sCtrlAV23BarFecGenfrom = httpContext.cgiGet( sPrefix+"AV23BarFecGenfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV23BarFecGenfrom) > 0 )
      {
         AV23BarFecGenfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV23BarFecGenfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarFecGenfrom", localUtil.format(AV23BarFecGenfrom, "99/99/99"));
      }
      else
      {
         AV23BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV23BarFecGenfrom_PARM"), 0) ;
      }
      sCtrlAV24BarFecGento = httpContext.cgiGet( sPrefix+"AV24BarFecGento_CTRL") ;
      if ( GXutil.len( sCtrlAV24BarFecGento) > 0 )
      {
         AV24BarFecGento = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV24BarFecGento), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarFecGento", localUtil.format(AV24BarFecGento, "99/99/99"));
      }
      else
      {
         AV24BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV24BarFecGento_PARM"), 0) ;
      }
      sCtrlAV34BarSitfrom = httpContext.cgiGet( sPrefix+"AV34BarSitfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV34BarSitfrom) > 0 )
      {
         AV34BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV34BarSitfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarSitfrom), 2, 0));
      }
      else
      {
         AV34BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34BarSitfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35BarSitto = httpContext.cgiGet( sPrefix+"AV35BarSitto_CTRL") ;
      if ( GXutil.len( sCtrlAV35BarSitto) > 0 )
      {
         AV35BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35BarSitto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarSitto), 2, 0));
      }
      else
      {
         AV35BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35BarSitto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV19BarFecClifrom = httpContext.cgiGet( sPrefix+"AV19BarFecClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV19BarFecClifrom) > 0 )
      {
         AV19BarFecClifrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV19BarFecClifrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarFecClifrom", localUtil.format(AV19BarFecClifrom, "99/99/99"));
      }
      else
      {
         AV19BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV19BarFecClifrom_PARM"), 0) ;
      }
      sCtrlAV20BarFecClito = httpContext.cgiGet( sPrefix+"AV20BarFecClito_CTRL") ;
      if ( GXutil.len( sCtrlAV20BarFecClito) > 0 )
      {
         AV20BarFecClito = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV20BarFecClito), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarFecClito", localUtil.format(AV20BarFecClito, "99/99/99"));
      }
      else
      {
         AV20BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV20BarFecClito_PARM"), 0) ;
      }
      sCtrlAV21BarFecFprfrom = httpContext.cgiGet( sPrefix+"AV21BarFecFprfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV21BarFecFprfrom) > 0 )
      {
         AV21BarFecFprfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV21BarFecFprfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarFecFprfrom", localUtil.format(AV21BarFecFprfrom, "99/99/99"));
      }
      else
      {
         AV21BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV21BarFecFprfrom_PARM"), 0) ;
      }
      sCtrlAV22BarFecFprto = httpContext.cgiGet( sPrefix+"AV22BarFecFprto_CTRL") ;
      if ( GXutil.len( sCtrlAV22BarFecFprto) > 0 )
      {
         AV22BarFecFprto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV22BarFecFprto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarFecFprto", localUtil.format(AV22BarFecFprto, "99/99/99"));
      }
      else
      {
         AV22BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV22BarFecFprto_PARM"), 0) ;
      }
      sCtrlAV25BarFecSalfrom = httpContext.cgiGet( sPrefix+"AV25BarFecSalfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV25BarFecSalfrom) > 0 )
      {
         AV25BarFecSalfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV25BarFecSalfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarFecSalfrom", localUtil.format(AV25BarFecSalfrom, "99/99/99"));
      }
      else
      {
         AV25BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV25BarFecSalfrom_PARM"), 0) ;
      }
      sCtrlAV26BarFecSalto = httpContext.cgiGet( sPrefix+"AV26BarFecSalto_CTRL") ;
      if ( GXutil.len( sCtrlAV26BarFecSalto) > 0 )
      {
         AV26BarFecSalto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV26BarFecSalto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarFecSalto", localUtil.format(AV26BarFecSalto, "99/99/99"));
      }
      else
      {
         AV26BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV26BarFecSalto_PARM"), 0) ;
      }
      sCtrlAV32BarSerfrom = httpContext.cgiGet( sPrefix+"AV32BarSerfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV32BarSerfrom) > 0 )
      {
         AV32BarSerfrom = httpContext.cgiGet( sCtrlAV32BarSerfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSerfrom", AV32BarSerfrom);
      }
      else
      {
         AV32BarSerfrom = httpContext.cgiGet( sPrefix+"AV32BarSerfrom_PARM") ;
      }
      sCtrlAV33BarSerto = httpContext.cgiGet( sPrefix+"AV33BarSerto_CTRL") ;
      if ( GXutil.len( sCtrlAV33BarSerto) > 0 )
      {
         AV33BarSerto = httpContext.cgiGet( sCtrlAV33BarSerto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSerto", AV33BarSerto);
      }
      else
      {
         AV33BarSerto = httpContext.cgiGet( sPrefix+"AV33BarSerto_PARM") ;
      }
      sCtrlAV36BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV36BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV36BarTipArtfrom) > 0 )
      {
         AV36BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarTipArtfrom), 4, 0));
      }
      else
      {
         AV36BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37BarTipArtto = httpContext.cgiGet( sPrefix+"AV37BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV37BarTipArtto) > 0 )
      {
         AV37BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipArtto), 4, 0));
      }
      else
      {
         AV37BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11BarColNomfrom = httpContext.cgiGet( sPrefix+"AV11BarColNomfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV11BarColNomfrom) > 0 )
      {
         AV11BarColNomfrom = httpContext.cgiGet( sCtrlAV11BarColNomfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarColNomfrom", AV11BarColNomfrom);
      }
      else
      {
         AV11BarColNomfrom = httpContext.cgiGet( sPrefix+"AV11BarColNomfrom_PARM") ;
      }
      sCtrlAV12BarColNomto = httpContext.cgiGet( sPrefix+"AV12BarColNomto_CTRL") ;
      if ( GXutil.len( sCtrlAV12BarColNomto) > 0 )
      {
         AV12BarColNomto = httpContext.cgiGet( sCtrlAV12BarColNomto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarColNomto", AV12BarColNomto);
      }
      else
      {
         AV12BarColNomto = httpContext.cgiGet( sPrefix+"AV12BarColNomto_PARM") ;
      }
      sCtrlAV13BarColNumfrom = httpContext.cgiGet( sPrefix+"AV13BarColNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV13BarColNumfrom) > 0 )
      {
         AV13BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13BarColNumfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNumfrom), 6, 0));
      }
      else
      {
         AV13BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13BarColNumfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV14BarColNumto = httpContext.cgiGet( sPrefix+"AV14BarColNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV14BarColNumto) > 0 )
      {
         AV14BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14BarColNumto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumto), 6, 0));
      }
      else
      {
         AV14BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14BarColNumto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV28BarNomClifrom = httpContext.cgiGet( sPrefix+"AV28BarNomClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV28BarNomClifrom) > 0 )
      {
         AV28BarNomClifrom = httpContext.cgiGet( sCtrlAV28BarNomClifrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarNomClifrom", AV28BarNomClifrom);
      }
      else
      {
         AV28BarNomClifrom = httpContext.cgiGet( sPrefix+"AV28BarNomClifrom_PARM") ;
      }
      sCtrlAV29BarNomClito = httpContext.cgiGet( sPrefix+"AV29BarNomClito_CTRL") ;
      if ( GXutil.len( sCtrlAV29BarNomClito) > 0 )
      {
         AV29BarNomClito = httpContext.cgiGet( sCtrlAV29BarNomClito) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarNomClito", AV29BarNomClito);
      }
      else
      {
         AV29BarNomClito = httpContext.cgiGet( sPrefix+"AV29BarNomClito_PARM") ;
      }
      sCtrlAV30BarNumClifrom = httpContext.cgiGet( sPrefix+"AV30BarNumClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV30BarNumClifrom) > 0 )
      {
         AV30BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30BarNumClifrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarNumClifrom), 6, 0));
      }
      else
      {
         AV30BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30BarNumClifrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31BarNumClito = httpContext.cgiGet( sPrefix+"AV31BarNumClito_CTRL") ;
      if ( GXutil.len( sCtrlAV31BarNumClito) > 0 )
      {
         AV31BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31BarNumClito), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarNumClito), 6, 0));
      }
      else
      {
         AV31BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31BarNumClito_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV36BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV36BarTipArtfrom) > 0 )
      {
         AV36BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarTipArtfrom), 4, 0));
      }
      else
      {
         AV36BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37BarTipArtto = httpContext.cgiGet( sPrefix+"AV37BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV37BarTipArtto) > 0 )
      {
         AV37BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipArtto), 4, 0));
      }
      else
      {
         AV37BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV88muestras = httpContext.cgiGet( sPrefix+"AV88muestras_CTRL") ;
      if ( GXutil.len( sCtrlAV88muestras) > 0 )
      {
         AV88muestras = httpContext.cgiGet( sCtrlAV88muestras) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88muestras", AV88muestras);
      }
      else
      {
         AV88muestras = httpContext.cgiGet( sPrefix+"AV88muestras_PARM") ;
      }
      sCtrlAV5BarCodfrom = httpContext.cgiGet( sPrefix+"AV5BarCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV5BarCodfrom) > 0 )
      {
         AV5BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5BarCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCodfrom), 8, 0));
      }
      else
      {
         AV5BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5BarCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10BarCodto = httpContext.cgiGet( sPrefix+"AV10BarCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV10BarCodto) > 0 )
      {
         AV10BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10BarCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCodto), 8, 0));
      }
      else
      {
         AV10BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10BarCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8BarCodReofrom = httpContext.cgiGet( sPrefix+"AV8BarCodReofrom_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarCodReofrom) > 0 )
      {
         AV8BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8BarCodReofrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodReofrom", GXutil.str( AV8BarCodReofrom, 1, 0));
      }
      else
      {
         AV8BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8BarCodReofrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9BarCodReoto = httpContext.cgiGet( sPrefix+"AV9BarCodReoto_CTRL") ;
      if ( GXutil.len( sCtrlAV9BarCodReoto) > 0 )
      {
         AV9BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9BarCodReoto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCodReoto", GXutil.str( AV9BarCodReoto, 1, 0));
      }
      else
      {
         AV9BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9BarCodReoto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6BarCodParfrom = httpContext.cgiGet( sPrefix+"AV6BarCodParfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV6BarCodParfrom) > 0 )
      {
         AV6BarCodParfrom = httpContext.cgiGet( sCtrlAV6BarCodParfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodParfrom", AV6BarCodParfrom);
      }
      else
      {
         AV6BarCodParfrom = httpContext.cgiGet( sPrefix+"AV6BarCodParfrom_PARM") ;
      }
      sCtrlAV7BarCodParto = httpContext.cgiGet( sPrefix+"AV7BarCodParto_CTRL") ;
      if ( GXutil.len( sCtrlAV7BarCodParto) > 0 )
      {
         AV7BarCodParto = httpContext.cgiGet( sCtrlAV7BarCodParto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodParto", AV7BarCodParto);
      }
      else
      {
         AV7BarCodParto = httpContext.cgiGet( sPrefix+"AV7BarCodParto_PARM") ;
      }
      sCtrlAV194Cod_idtx = httpContext.cgiGet( sPrefix+"AV194Cod_idtx_CTRL") ;
      if ( GXutil.len( sCtrlAV194Cod_idtx) > 0 )
      {
         AV194Cod_idtx = httpContext.cgiGet( sCtrlAV194Cod_idtx) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV194Cod_idtx", AV194Cod_idtx);
      }
      else
      {
         AV194Cod_idtx = httpContext.cgiGet( sPrefix+"AV194Cod_idtx_PARM") ;
      }
      sCtrlAV27BarGirar = httpContext.cgiGet( sPrefix+"AV27BarGirar_CTRL") ;
      if ( GXutil.len( sCtrlAV27BarGirar) > 0 )
      {
         AV27BarGirar = httpContext.cgiGet( sCtrlAV27BarGirar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarGirar", AV27BarGirar);
      }
      else
      {
         AV27BarGirar = httpContext.cgiGet( sPrefix+"AV27BarGirar_PARM") ;
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
      pa26Z2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws26Z2( ) ;
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
      ws26Z2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70FilterEmprcod_PARM", GXutil.rtrim( AV70FilterEmprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70FilterEmprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70FilterEmprcod_CTRL", GXutil.rtrim( sCtrlAV70FilterEmprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45CliCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV45CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45CliCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45CliCodfrom_CTRL", GXutil.rtrim( sCtrlAV45CliCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46CliCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV46CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46CliCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46CliCodto_CTRL", GXutil.rtrim( sCtrlAV46CliCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarDisNumfrom_PARM", GXutil.rtrim( AV15BarDisNumfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15BarDisNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarDisNumfrom_CTRL", GXutil.rtrim( sCtrlAV15BarDisNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16BarDisNumto_PARM", GXutil.rtrim( AV16BarDisNumto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16BarDisNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16BarDisNumto_CTRL", GXutil.rtrim( sCtrlAV16BarDisNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23BarFecGenfrom_PARM", localUtil.dtoc( AV23BarFecGenfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23BarFecGenfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23BarFecGenfrom_CTRL", GXutil.rtrim( sCtrlAV23BarFecGenfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24BarFecGento_PARM", localUtil.dtoc( AV24BarFecGento, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24BarFecGento)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24BarFecGento_CTRL", GXutil.rtrim( sCtrlAV24BarFecGento));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarSitfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV34BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34BarSitfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarSitfrom_CTRL", GXutil.rtrim( sCtrlAV34BarSitfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarSitto_PARM", GXutil.ltrim( localUtil.ntoc( AV35BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35BarSitto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarSitto_CTRL", GXutil.rtrim( sCtrlAV35BarSitto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19BarFecClifrom_PARM", localUtil.dtoc( AV19BarFecClifrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19BarFecClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19BarFecClifrom_CTRL", GXutil.rtrim( sCtrlAV19BarFecClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20BarFecClito_PARM", localUtil.dtoc( AV20BarFecClito, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20BarFecClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20BarFecClito_CTRL", GXutil.rtrim( sCtrlAV20BarFecClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21BarFecFprfrom_PARM", localUtil.dtoc( AV21BarFecFprfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21BarFecFprfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21BarFecFprfrom_CTRL", GXutil.rtrim( sCtrlAV21BarFecFprfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22BarFecFprto_PARM", localUtil.dtoc( AV22BarFecFprto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22BarFecFprto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22BarFecFprto_CTRL", GXutil.rtrim( sCtrlAV22BarFecFprto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25BarFecSalfrom_PARM", localUtil.dtoc( AV25BarFecSalfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25BarFecSalfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25BarFecSalfrom_CTRL", GXutil.rtrim( sCtrlAV25BarFecSalfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarFecSalto_PARM", localUtil.dtoc( AV26BarFecSalto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26BarFecSalto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarFecSalto_CTRL", GXutil.rtrim( sCtrlAV26BarFecSalto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarSerfrom_PARM", GXutil.rtrim( AV32BarSerfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32BarSerfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarSerfrom_CTRL", GXutil.rtrim( sCtrlAV32BarSerfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarSerto_PARM", GXutil.rtrim( AV33BarSerto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33BarSerto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarSerto_CTRL", GXutil.rtrim( sCtrlAV33BarSerto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV36BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV36BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV37BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV37BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarColNomfrom_PARM", GXutil.rtrim( AV11BarColNomfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11BarColNomfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarColNomfrom_CTRL", GXutil.rtrim( sCtrlAV11BarColNomfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarColNomto_PARM", GXutil.rtrim( AV12BarColNomto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12BarColNomto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarColNomto_CTRL", GXutil.rtrim( sCtrlAV12BarColNomto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarColNumfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV13BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13BarColNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarColNumfrom_CTRL", GXutil.rtrim( sCtrlAV13BarColNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14BarColNumto_PARM", GXutil.ltrim( localUtil.ntoc( AV14BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14BarColNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14BarColNumto_CTRL", GXutil.rtrim( sCtrlAV14BarColNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28BarNomClifrom_PARM", GXutil.rtrim( AV28BarNomClifrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28BarNomClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28BarNomClifrom_CTRL", GXutil.rtrim( sCtrlAV28BarNomClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarNomClito_PARM", GXutil.rtrim( AV29BarNomClito));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29BarNomClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarNomClito_CTRL", GXutil.rtrim( sCtrlAV29BarNomClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarNumClifrom_PARM", GXutil.ltrim( localUtil.ntoc( AV30BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30BarNumClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarNumClifrom_CTRL", GXutil.rtrim( sCtrlAV30BarNumClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarNumClito_PARM", GXutil.ltrim( localUtil.ntoc( AV31BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31BarNumClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarNumClito_CTRL", GXutil.rtrim( sCtrlAV31BarNumClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV36BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV36BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV37BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV37BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV88muestras_PARM", GXutil.rtrim( AV88muestras));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV88muestras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV88muestras_CTRL", GXutil.rtrim( sCtrlAV88muestras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5BarCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV5BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5BarCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5BarCodfrom_CTRL", GXutil.rtrim( sCtrlAV5BarCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV10BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10BarCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarCodto_CTRL", GXutil.rtrim( sCtrlAV10BarCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarCodReofrom_PARM", GXutil.ltrim( localUtil.ntoc( AV8BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarCodReofrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarCodReofrom_CTRL", GXutil.rtrim( sCtrlAV8BarCodReofrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarCodReoto_PARM", GXutil.ltrim( localUtil.ntoc( AV9BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9BarCodReoto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarCodReoto_CTRL", GXutil.rtrim( sCtrlAV9BarCodReoto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCodParfrom_PARM", GXutil.rtrim( AV6BarCodParfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6BarCodParfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCodParfrom_CTRL", GXutil.rtrim( sCtrlAV6BarCodParfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarCodParto_PARM", GXutil.rtrim( AV7BarCodParto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7BarCodParto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarCodParto_CTRL", GXutil.rtrim( sCtrlAV7BarCodParto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV194Cod_idtx_PARM", GXutil.rtrim( AV194Cod_idtx));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV194Cod_idtx)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV194Cod_idtx_CTRL", GXutil.rtrim( sCtrlAV194Cod_idtx));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27BarGirar_PARM", GXutil.rtrim( AV27BarGirar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27BarGirar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27BarGirar_CTRL", GXutil.rtrim( sCtrlAV27BarGirar));
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
      we26Z2( ) ;
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553196", true, true);
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
      httpContext.AddJavascriptSource("produccion/consultaproduccioneo.js", "?202682115553197", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_642( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_64_idx );
      edtavSdtconpro__cp_id_Internalname = sPrefix+"SDTCONPRO__CP_ID_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_emprcod_Internalname = sPrefix+"SDTCONPRO__CP_EMPRCOD_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_clicod_Internalname = sPrefix+"SDTCONPRO__CP_CLICOD_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_clinom_Internalname = sPrefix+"SDTCONPRO__CP_CLINOM_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_bardisnum_Internalname = sPrefix+"SDTCONPRO__CP_BARDISNUM_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barcod_Internalname = sPrefix+"SDTCONPRO__CP_BARCOD_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barcodreo_Internalname = sPrefix+"SDTCONPRO__CP_BARCODREO_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barcodpar_Internalname = sPrefix+"SDTCONPRO__CP_BARCODPAR_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barfecfpr_Internalname = sPrefix+"SDTCONPRO__CP_BARFECFPR_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barnumcli_Internalname = sPrefix+"SDTCONPRO__CP_BARNUMCLI_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barplf_Internalname = sPrefix+"SDTCONPRO__CP_BARPLF_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barsit_Internalname = sPrefix+"SDTCONPRO__CP_BARSIT_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barfecgen_Internalname = sPrefix+"SDTCONPRO__CP_BARFECGEN_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barfeccli_Internalname = sPrefix+"SDTCONPRO__CP_BARFECCLI_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barfecsal_Internalname = sPrefix+"SDTCONPRO__CP_BARFECSAL_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barser_Internalname = sPrefix+"SDTCONPRO__CP_BARSER_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barserdsc_Internalname = sPrefix+"SDTCONPRO__CP_BARSERDSC_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barcolo_Internalname = sPrefix+"SDTCONPRO__CP_BARCOLO_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barcolu_Internalname = sPrefix+"SDTCONPRO__CP_BARCOLU_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barnomcli_Internalname = sPrefix+"SDTCONPRO__CP_BARNOMCLI_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_bartipart_Internalname = sPrefix+"SDTCONPRO__CP_BARTIPART_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_tartdsc_Internalname = sPrefix+"SDTCONPRO__CP_TARTDSC_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_bargirar_Internalname = sPrefix+"SDTCONPRO__CP_BARGIRAR_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_baracaanh_Internalname = sPrefix+"SDTCONPRO__CP_BARACAANH_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_desc_b_Internalname = sPrefix+"SDTCONPRO__CP_DESC_B_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_baragrest_Internalname = sPrefix+"SDTCONPRO__CP_BARAGREST_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barext_Internalname = sPrefix+"SDTCONPRO__CP_BAREXT_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_disdes_Internalname = sPrefix+"SDTCONPRO__CP_DISDES_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_discod_Internalname = sPrefix+"SDTCONPRO__CP_DISCOD_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barproper_Internalname = sPrefix+"SDTCONPRO__CP_BARPROPER_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_dsc_bar_Internalname = sPrefix+"SDTCONPRO__CP_DSC_BAR_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barrencc_Internalname = sPrefix+"SDTCONPRO__CP_BARRENCC_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barkgm_Internalname = sPrefix+"SDTCONPRO__CP_BARKGM_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barmtr_Internalname = sPrefix+"SDTCONPRO__CP_BARMTR_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barpie_Internalname = sPrefix+"SDTCONPRO__CP_BARPIE_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_baralbk_Internalname = sPrefix+"SDTCONPRO__CP_BARALBK_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_baralbm_Internalname = sPrefix+"SDTCONPRO__CP_BARALBM_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_barenccli_Internalname = sPrefix+"SDTCONPRO__CP_BARENCCLI_"+sGXsfl_64_idx ;
      edtavSdtconpro__cp_disusrc_Internalname = sPrefix+"SDTCONPRO__CP_DISUSRC_"+sGXsfl_64_idx ;
   }

   public void subsflControlProps_fel_642( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_64_fel_idx );
      edtavSdtconpro__cp_id_Internalname = sPrefix+"SDTCONPRO__CP_ID_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_emprcod_Internalname = sPrefix+"SDTCONPRO__CP_EMPRCOD_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_clicod_Internalname = sPrefix+"SDTCONPRO__CP_CLICOD_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_clinom_Internalname = sPrefix+"SDTCONPRO__CP_CLINOM_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_bardisnum_Internalname = sPrefix+"SDTCONPRO__CP_BARDISNUM_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barcod_Internalname = sPrefix+"SDTCONPRO__CP_BARCOD_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barcodreo_Internalname = sPrefix+"SDTCONPRO__CP_BARCODREO_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barcodpar_Internalname = sPrefix+"SDTCONPRO__CP_BARCODPAR_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barfecfpr_Internalname = sPrefix+"SDTCONPRO__CP_BARFECFPR_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barnumcli_Internalname = sPrefix+"SDTCONPRO__CP_BARNUMCLI_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barplf_Internalname = sPrefix+"SDTCONPRO__CP_BARPLF_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barsit_Internalname = sPrefix+"SDTCONPRO__CP_BARSIT_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barfecgen_Internalname = sPrefix+"SDTCONPRO__CP_BARFECGEN_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barfeccli_Internalname = sPrefix+"SDTCONPRO__CP_BARFECCLI_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barfecsal_Internalname = sPrefix+"SDTCONPRO__CP_BARFECSAL_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barser_Internalname = sPrefix+"SDTCONPRO__CP_BARSER_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barserdsc_Internalname = sPrefix+"SDTCONPRO__CP_BARSERDSC_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barcolo_Internalname = sPrefix+"SDTCONPRO__CP_BARCOLO_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barcolu_Internalname = sPrefix+"SDTCONPRO__CP_BARCOLU_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barnomcli_Internalname = sPrefix+"SDTCONPRO__CP_BARNOMCLI_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_bartipart_Internalname = sPrefix+"SDTCONPRO__CP_BARTIPART_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_tartdsc_Internalname = sPrefix+"SDTCONPRO__CP_TARTDSC_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_bargirar_Internalname = sPrefix+"SDTCONPRO__CP_BARGIRAR_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_baracaanh_Internalname = sPrefix+"SDTCONPRO__CP_BARACAANH_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_desc_b_Internalname = sPrefix+"SDTCONPRO__CP_DESC_B_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_baragrest_Internalname = sPrefix+"SDTCONPRO__CP_BARAGREST_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barext_Internalname = sPrefix+"SDTCONPRO__CP_BAREXT_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_disdes_Internalname = sPrefix+"SDTCONPRO__CP_DISDES_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_discod_Internalname = sPrefix+"SDTCONPRO__CP_DISCOD_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barproper_Internalname = sPrefix+"SDTCONPRO__CP_BARPROPER_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_dsc_bar_Internalname = sPrefix+"SDTCONPRO__CP_DSC_BAR_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barrencc_Internalname = sPrefix+"SDTCONPRO__CP_BARRENCC_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barkgm_Internalname = sPrefix+"SDTCONPRO__CP_BARKGM_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barmtr_Internalname = sPrefix+"SDTCONPRO__CP_BARMTR_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barpie_Internalname = sPrefix+"SDTCONPRO__CP_BARPIE_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_baralbk_Internalname = sPrefix+"SDTCONPRO__CP_BARALBK_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_baralbm_Internalname = sPrefix+"SDTCONPRO__CP_BARALBM_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_barenccli_Internalname = sPrefix+"SDTCONPRO__CP_BARENCCLI_"+sGXsfl_64_fel_idx ;
      edtavSdtconpro__cp_disusrc_Internalname = sPrefix+"SDTCONPRO__CP_DISUSRC_"+sGXsfl_64_fel_idx ;
   }

   public void sendrow_642( )
   {
      subsflControlProps_642( ) ;
      wb26Z0( ) ;
      if ( ( subGridsdtconpros_Rows * 1 == 0 ) || ( nGXsfl_64_idx <= subgridsdtconpros_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdtconprosRow = GXWebRow.GetNew(context,GridsdtconprosContainer) ;
         if ( subGridsdtconpros_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdtconpros_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdtconpros_Class, "") != 0 )
            {
               subGridsdtconpros_Linesclass = subGridsdtconpros_Class+"Odd" ;
            }
         }
         else if ( subGridsdtconpros_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdtconpros_Backstyle = (byte)(0) ;
            subGridsdtconpros_Backcolor = subGridsdtconpros_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdtconpros_Class, "") != 0 )
            {
               subGridsdtconpros_Linesclass = subGridsdtconpros_Class+"Uniform" ;
            }
         }
         else if ( subGridsdtconpros_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdtconpros_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdtconpros_Class, "") != 0 )
            {
               subGridsdtconpros_Linesclass = subGridsdtconpros_Class+"Odd" ;
            }
            subGridsdtconpros_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdtconpros_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdtconpros_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_64_idx) % (2))) == 0 )
            {
               subGridsdtconpros_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtconpros_Class, "") != 0 )
               {
                  subGridsdtconpros_Linesclass = subGridsdtconpros_Class+"Even" ;
               }
            }
            else
            {
               subGridsdtconpros_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtconpros_Class, "") != 0 )
               {
                  subGridsdtconpros_Linesclass = subGridsdtconpros_Class+"Odd" ;
               }
            }
         }
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_64_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'"+sPrefix+"',false,'"+sGXsfl_64_idx+"',64)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_64_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               if ( ( AV225GXV1 > 0 ) && ( AV96SDTCONPRO.size() >= AV225GXV1 ) && (0==AV73GridActionGroup1) )
               {
                  AV73GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV73GridActionGroup1, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridActionGroup1), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridsdtconprosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV73GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_64_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,65);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV73GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_64_Refreshing);
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_id(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_id()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_id()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_id_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtconpro__cp_id_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_emprcod_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_emprcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtconpro__cp_emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_clinom_Internalname,((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_clinom(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(100),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_bardisnum_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_bardisnum()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_bardisnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_bardisnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtconpro__cp_barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtconpro__cp_barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barcodpar_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtconpro__cp_barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barfecfpr_Internalname,localUtil.format(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr(), "99/99/99"),localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barfecfpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barfecfpr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barnumcli_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barnumcli(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_barnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barnumcli()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barnumcli()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barnumcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barnumcli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barplf_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barplf()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barplf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barplf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barsit_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barsit(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_barsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barsit()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barsit()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barsit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barsit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barfecgen_Internalname,localUtil.format(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barfecgen(), "99/99/9999"),localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barfecgen(), "99/99/9999"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barfecgen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barfecgen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barfeccli_Internalname,localUtil.format(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barfeccli(), "99/99/99"),localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barfeccli(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barfeccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barfeccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barfecsal_Internalname,localUtil.format(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barfecsal(), "99/99/99"),localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barfecsal(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barfecsal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barfecsal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barser_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barserdsc_Internalname,((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barserdsc(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barcolo_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcolo()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barcolo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barcolo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barcolu_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcolu(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_barcolu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcolu()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barcolu()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barcolu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barcolu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barnomcli_Internalname,((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barnomcli(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_bartipart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_bartipart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_bartipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_bartipart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_bartipart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_bartipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_bartipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_tartdsc_Internalname,((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_tartdsc(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_tartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_tartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_bargirar_Internalname,((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_bargirar(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_bargirar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_bargirar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_baracaanh_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baracaanh(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_baracaanh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baracaanh()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baracaanh()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_baracaanh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_baracaanh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_desc_b_Internalname,((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_desc_b(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_desc_b_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_desc_b_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_baragrest_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baragrest()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_baragrest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_baragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barext_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barext(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_barext_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barext()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barext()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barext_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barext_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_disdes_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_disdes()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_disdes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_disdes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_discod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_discod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_discod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_discod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_discod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_discod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_discod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barproper_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barproper()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barproper_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barproper_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_dsc_bar_Internalname,((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_dsc_bar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_dsc_bar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barrencc_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barrencc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barrencc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barrencc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_barkgm_Enabled!=0) ? localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barkgm(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barkgm(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barmtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barmtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_barmtr_Enabled!=0) ? localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barmtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barmtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barpie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barpie(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_barpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barpie()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barpie()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_baralbk_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baralbk(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_baralbk_Enabled!=0) ? localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baralbk(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baralbk(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_baralbk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_baralbk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_baralbm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baralbm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtconpro__cp_baralbm_Enabled!=0) ? localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baralbm(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_baralbm(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_baralbm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_baralbm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_barenccli_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_barenccli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_barenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_barenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtconprosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtconprosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtconpro__cp_disusrc_Internalname,GXutil.rtrim( ((app.SdtSDTCONPRO_Registro)AV96SDTCONPRO.elementAt(-1+AV225GXV1)).getgxTv_SdtSDTCONPRO_Registro_Cp_disusrc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtconpro__cp_disusrc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtconpro__cp_disusrc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes26Z2( ) ;
         GridsdtconprosContainer.AddRow(GridsdtconprosRow);
         nGXsfl_64_idx = ((subGridsdtconpros_Islastpage==1)&&(nGXsfl_64_idx+1>subgridsdtconpros_fnc_recordsperpage( )) ? 1 : nGXsfl_64_idx+1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      /* End function sendrow_642 */
   }

   public void startgridcontrol64( )
   {
      if ( GridsdtconprosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridsdtconprosContainer"+"DivS\" data-gxgridid=\"64\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdtconpros_Internalname, subGridsdtconpros_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdtconpros_Backcolorstyle == 0 )
         {
            subGridsdtconpros_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdtconpros_Class) > 0 )
            {
               subGridsdtconpros_Linesclass = subGridsdtconpros_Class+"Title" ;
            }
         }
         else
         {
            subGridsdtconpros_Titlebackstyle = (byte)(1) ;
            if ( subGridsdtconpros_Backcolorstyle == 1 )
            {
               subGridsdtconpros_Titlebackcolor = subGridsdtconpros_Allbackcolor ;
               if ( GXutil.len( subGridsdtconpros_Class) > 0 )
               {
                  subGridsdtconpros_Linesclass = subGridsdtconpros_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdtconpros_Class) > 0 )
               {
                  subGridsdtconpros_Linesclass = subGridsdtconpros_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CP_ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrimstr( DecimalUtil.doubleToDec(100), 4, 0)+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped.  Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BARCOD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "REO", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PAR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ent Prev", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo, Valor S o N", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Art.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CP_TARTDSC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuardeno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuaderno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exterior", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desglose", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Disposicion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CTW", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Ctw", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Caderno encargos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilogramos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Salidos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disposicion Cliente Nueva", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usario que creó Dispo.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdtconprosContainer.AddObjectProperty("GridName", "Gridsdtconpros");
      }
      else
      {
         GridsdtconprosContainer.AddObjectProperty("GridName", "Gridsdtconpros");
         GridsdtconprosContainer.AddObjectProperty("Header", subGridsdtconpros_Header);
         GridsdtconprosContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridsdtconprosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddObjectProperty("CmpContext", sPrefix);
         GridsdtconprosContainer.AddObjectProperty("InMasterPage", "false");
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV73GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_id_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_bardisnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barfecfpr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barnumcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barplf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barsit_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barfecgen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barfeccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barfecsal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barcolo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barcolu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_bartipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_tartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_bargirar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_baracaanh_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_desc_b_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_baragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barext_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_disdes_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_discod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barproper_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_dsc_bar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barrencc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_baralbk_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_baralbm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_barenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtconprosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtconpro__cp_disusrc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddColumnProperties(GridsdtconprosColumn);
         GridsdtconprosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdtconprosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdtconpros_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnexcel_Internalname = sPrefix+"BTNEXCEL" ;
      bttBtncsv_Internalname = sPrefix+"BTNCSV" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      edtavPagina_Internalname = sPrefix+"vPAGINA" ;
      edtavCantidad_Internalname = sPrefix+"vCANTIDAD" ;
      edtavTotal_Internalname = sPrefix+"vTOTAL" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      lblTab01_title_Internalname = sPrefix+"TAB01_TITLE" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtavSdtconpro__cp_id_Internalname = sPrefix+"SDTCONPRO__CP_ID" ;
      edtavSdtconpro__cp_emprcod_Internalname = sPrefix+"SDTCONPRO__CP_EMPRCOD" ;
      edtavSdtconpro__cp_clicod_Internalname = sPrefix+"SDTCONPRO__CP_CLICOD" ;
      edtavSdtconpro__cp_clinom_Internalname = sPrefix+"SDTCONPRO__CP_CLINOM" ;
      edtavSdtconpro__cp_bardisnum_Internalname = sPrefix+"SDTCONPRO__CP_BARDISNUM" ;
      edtavSdtconpro__cp_barcod_Internalname = sPrefix+"SDTCONPRO__CP_BARCOD" ;
      edtavSdtconpro__cp_barcodreo_Internalname = sPrefix+"SDTCONPRO__CP_BARCODREO" ;
      edtavSdtconpro__cp_barcodpar_Internalname = sPrefix+"SDTCONPRO__CP_BARCODPAR" ;
      edtavSdtconpro__cp_barfecfpr_Internalname = sPrefix+"SDTCONPRO__CP_BARFECFPR" ;
      edtavSdtconpro__cp_barnumcli_Internalname = sPrefix+"SDTCONPRO__CP_BARNUMCLI" ;
      edtavSdtconpro__cp_barplf_Internalname = sPrefix+"SDTCONPRO__CP_BARPLF" ;
      edtavSdtconpro__cp_barsit_Internalname = sPrefix+"SDTCONPRO__CP_BARSIT" ;
      edtavSdtconpro__cp_barfecgen_Internalname = sPrefix+"SDTCONPRO__CP_BARFECGEN" ;
      edtavSdtconpro__cp_barfeccli_Internalname = sPrefix+"SDTCONPRO__CP_BARFECCLI" ;
      edtavSdtconpro__cp_barfecsal_Internalname = sPrefix+"SDTCONPRO__CP_BARFECSAL" ;
      edtavSdtconpro__cp_barser_Internalname = sPrefix+"SDTCONPRO__CP_BARSER" ;
      edtavSdtconpro__cp_barserdsc_Internalname = sPrefix+"SDTCONPRO__CP_BARSERDSC" ;
      edtavSdtconpro__cp_barcolo_Internalname = sPrefix+"SDTCONPRO__CP_BARCOLO" ;
      edtavSdtconpro__cp_barcolu_Internalname = sPrefix+"SDTCONPRO__CP_BARCOLU" ;
      edtavSdtconpro__cp_barnomcli_Internalname = sPrefix+"SDTCONPRO__CP_BARNOMCLI" ;
      edtavSdtconpro__cp_bartipart_Internalname = sPrefix+"SDTCONPRO__CP_BARTIPART" ;
      edtavSdtconpro__cp_tartdsc_Internalname = sPrefix+"SDTCONPRO__CP_TARTDSC" ;
      edtavSdtconpro__cp_bargirar_Internalname = sPrefix+"SDTCONPRO__CP_BARGIRAR" ;
      edtavSdtconpro__cp_baracaanh_Internalname = sPrefix+"SDTCONPRO__CP_BARACAANH" ;
      edtavSdtconpro__cp_desc_b_Internalname = sPrefix+"SDTCONPRO__CP_DESC_B" ;
      edtavSdtconpro__cp_baragrest_Internalname = sPrefix+"SDTCONPRO__CP_BARAGREST" ;
      edtavSdtconpro__cp_barext_Internalname = sPrefix+"SDTCONPRO__CP_BAREXT" ;
      edtavSdtconpro__cp_disdes_Internalname = sPrefix+"SDTCONPRO__CP_DISDES" ;
      edtavSdtconpro__cp_discod_Internalname = sPrefix+"SDTCONPRO__CP_DISCOD" ;
      edtavSdtconpro__cp_barproper_Internalname = sPrefix+"SDTCONPRO__CP_BARPROPER" ;
      edtavSdtconpro__cp_dsc_bar_Internalname = sPrefix+"SDTCONPRO__CP_DSC_BAR" ;
      edtavSdtconpro__cp_barrencc_Internalname = sPrefix+"SDTCONPRO__CP_BARRENCC" ;
      edtavSdtconpro__cp_barkgm_Internalname = sPrefix+"SDTCONPRO__CP_BARKGM" ;
      edtavSdtconpro__cp_barmtr_Internalname = sPrefix+"SDTCONPRO__CP_BARMTR" ;
      edtavSdtconpro__cp_barpie_Internalname = sPrefix+"SDTCONPRO__CP_BARPIE" ;
      edtavSdtconpro__cp_baralbk_Internalname = sPrefix+"SDTCONPRO__CP_BARALBK" ;
      edtavSdtconpro__cp_baralbm_Internalname = sPrefix+"SDTCONPRO__CP_BARALBM" ;
      edtavSdtconpro__cp_barenccli_Internalname = sPrefix+"SDTCONPRO__CP_BARENCCLI" ;
      edtavSdtconpro__cp_disusrc_Internalname = sPrefix+"SDTCONPRO__CP_DISUSRC" ;
      edtavTotvaluegridsdtconpros_cp_barkgm_Internalname = sPrefix+"vTOTVALUEGRIDSDTCONPROS_CP_BARKGM" ;
      edtavTotvaluegridsdtconpros_cp_barmtr_Internalname = sPrefix+"vTOTVALUEGRIDSDTCONPROS_CP_BARMTR" ;
      edtavTotvaluegridsdtconpros_cp_barpie_Internalname = sPrefix+"vTOTVALUEGRIDSDTCONPROS_CP_BARPIE" ;
      tblGridsdtconprostabletotalizer_Internalname = sPrefix+"GRIDSDTCONPROSTABLETOTALIZER" ;
      Gridsdtconprospaginationbar_Internalname = sPrefix+"GRIDSDTCONPROSPAGINATIONBAR" ;
      divGridsdtconprostablewithpaginationbar_Internalname = sPrefix+"GRIDSDTCONPROSTABLEWITHPAGINATIONBAR" ;
      divTableresultado1_Internalname = sPrefix+"TABLERESULTADO1" ;
      Gxuitabspanel_tabs_Internalname = sPrefix+"GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = sPrefix+"PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = sPrefix+"DVPANEL_PANEL_RESULTADO" ;
      divTablegrid_Internalname = sPrefix+"TABLEGRID" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Situacionfases_modal_Internalname = sPrefix+"SITUACIONFASES_MODAL" ;
      tblTablesituacionfases_modal_Internalname = sPrefix+"TABLESITUACIONFASES_MODAL" ;
      Consultaalbaransalida_modal_Internalname = sPrefix+"CONSULTAALBARANSALIDA_MODAL" ;
      tblTableconsultaalbaransalida_modal_Internalname = sPrefix+"TABLECONSULTAALBARANSALIDA_MODAL" ;
      Recetas_modal_Internalname = sPrefix+"RECETAS_MODAL" ;
      tblTablerecetas_modal_Internalname = sPrefix+"TABLERECETAS_MODAL" ;
      Partesproduccion_modal_Internalname = sPrefix+"PARTESPRODUCCION_MODAL" ;
      tblTablepartesproduccion_modal_Internalname = sPrefix+"TABLEPARTESPRODUCCION_MODAL" ;
      Packinglist_modal_Internalname = sPrefix+"PACKINGLIST_MODAL" ;
      tblTablepackinglist_modal_Internalname = sPrefix+"TABLEPACKINGLIST_MODAL" ;
      Piezas_modal_Internalname = sPrefix+"PIEZAS_MODAL" ;
      tblTablepiezas_modal_Internalname = sPrefix+"TABLEPIEZAS_MODAL" ;
      Agrupadas_modal_Internalname = sPrefix+"AGRUPADAS_MODAL" ;
      tblTableagrupadas_modal_Internalname = sPrefix+"TABLEAGRUPADAS_MODAL" ;
      Gridsdtconpros_empowerer_Internalname = sPrefix+"GRIDSDTCONPROS_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridsdtconpros_Internalname = sPrefix+"GRIDSDTCONPROS" ;
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
      subGridsdtconpros_Allowcollapsing = (byte)(0) ;
      subGridsdtconpros_Allowselection = (byte)(0) ;
      subGridsdtconpros_Header = "" ;
      edtavSdtconpro__cp_disusrc_Jsonclick = "" ;
      edtavSdtconpro__cp_disusrc_Enabled = 0 ;
      edtavSdtconpro__cp_barenccli_Jsonclick = "" ;
      edtavSdtconpro__cp_barenccli_Enabled = 0 ;
      edtavSdtconpro__cp_baralbm_Jsonclick = "" ;
      edtavSdtconpro__cp_baralbm_Enabled = 0 ;
      edtavSdtconpro__cp_baralbk_Jsonclick = "" ;
      edtavSdtconpro__cp_baralbk_Enabled = 0 ;
      edtavSdtconpro__cp_barpie_Jsonclick = "" ;
      edtavSdtconpro__cp_barpie_Enabled = 0 ;
      edtavSdtconpro__cp_barmtr_Jsonclick = "" ;
      edtavSdtconpro__cp_barmtr_Enabled = 0 ;
      edtavSdtconpro__cp_barkgm_Jsonclick = "" ;
      edtavSdtconpro__cp_barkgm_Enabled = 0 ;
      edtavSdtconpro__cp_barrencc_Jsonclick = "" ;
      edtavSdtconpro__cp_barrencc_Enabled = 0 ;
      edtavSdtconpro__cp_dsc_bar_Jsonclick = "" ;
      edtavSdtconpro__cp_dsc_bar_Enabled = 0 ;
      edtavSdtconpro__cp_barproper_Jsonclick = "" ;
      edtavSdtconpro__cp_barproper_Enabled = 0 ;
      edtavSdtconpro__cp_discod_Jsonclick = "" ;
      edtavSdtconpro__cp_discod_Enabled = 0 ;
      edtavSdtconpro__cp_disdes_Jsonclick = "" ;
      edtavSdtconpro__cp_disdes_Enabled = 0 ;
      edtavSdtconpro__cp_barext_Jsonclick = "" ;
      edtavSdtconpro__cp_barext_Enabled = 0 ;
      edtavSdtconpro__cp_baragrest_Jsonclick = "" ;
      edtavSdtconpro__cp_baragrest_Enabled = 0 ;
      edtavSdtconpro__cp_desc_b_Jsonclick = "" ;
      edtavSdtconpro__cp_desc_b_Enabled = 0 ;
      edtavSdtconpro__cp_baracaanh_Jsonclick = "" ;
      edtavSdtconpro__cp_baracaanh_Enabled = 0 ;
      edtavSdtconpro__cp_bargirar_Jsonclick = "" ;
      edtavSdtconpro__cp_bargirar_Enabled = 0 ;
      edtavSdtconpro__cp_tartdsc_Jsonclick = "" ;
      edtavSdtconpro__cp_tartdsc_Enabled = 0 ;
      edtavSdtconpro__cp_bartipart_Jsonclick = "" ;
      edtavSdtconpro__cp_bartipart_Enabled = 0 ;
      edtavSdtconpro__cp_barnomcli_Jsonclick = "" ;
      edtavSdtconpro__cp_barnomcli_Enabled = 0 ;
      edtavSdtconpro__cp_barcolu_Jsonclick = "" ;
      edtavSdtconpro__cp_barcolu_Enabled = 0 ;
      edtavSdtconpro__cp_barcolo_Jsonclick = "" ;
      edtavSdtconpro__cp_barcolo_Enabled = 0 ;
      edtavSdtconpro__cp_barserdsc_Jsonclick = "" ;
      edtavSdtconpro__cp_barserdsc_Enabled = 0 ;
      edtavSdtconpro__cp_barser_Jsonclick = "" ;
      edtavSdtconpro__cp_barser_Enabled = 0 ;
      edtavSdtconpro__cp_barfecsal_Jsonclick = "" ;
      edtavSdtconpro__cp_barfecsal_Enabled = 0 ;
      edtavSdtconpro__cp_barfeccli_Jsonclick = "" ;
      edtavSdtconpro__cp_barfeccli_Enabled = 0 ;
      edtavSdtconpro__cp_barfecgen_Jsonclick = "" ;
      edtavSdtconpro__cp_barfecgen_Enabled = 0 ;
      edtavSdtconpro__cp_barsit_Jsonclick = "" ;
      edtavSdtconpro__cp_barsit_Enabled = 0 ;
      edtavSdtconpro__cp_barplf_Jsonclick = "" ;
      edtavSdtconpro__cp_barplf_Enabled = 0 ;
      edtavSdtconpro__cp_barnumcli_Jsonclick = "" ;
      edtavSdtconpro__cp_barnumcli_Enabled = 0 ;
      edtavSdtconpro__cp_barfecfpr_Jsonclick = "" ;
      edtavSdtconpro__cp_barfecfpr_Enabled = 0 ;
      edtavSdtconpro__cp_barcodpar_Jsonclick = "" ;
      edtavSdtconpro__cp_barcodpar_Enabled = 0 ;
      edtavSdtconpro__cp_barcodreo_Jsonclick = "" ;
      edtavSdtconpro__cp_barcodreo_Enabled = 0 ;
      edtavSdtconpro__cp_barcod_Jsonclick = "" ;
      edtavSdtconpro__cp_barcod_Enabled = 0 ;
      edtavSdtconpro__cp_bardisnum_Jsonclick = "" ;
      edtavSdtconpro__cp_bardisnum_Enabled = 0 ;
      edtavSdtconpro__cp_clinom_Jsonclick = "" ;
      edtavSdtconpro__cp_clinom_Enabled = 0 ;
      edtavSdtconpro__cp_clicod_Jsonclick = "" ;
      edtavSdtconpro__cp_clicod_Enabled = 0 ;
      edtavSdtconpro__cp_emprcod_Jsonclick = "" ;
      edtavSdtconpro__cp_emprcod_Enabled = 0 ;
      edtavSdtconpro__cp_id_Jsonclick = "" ;
      edtavSdtconpro__cp_id_Enabled = 0 ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGridsdtconpros_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridsdtconpros_Backcolorstyle = (byte)(0) ;
      edtavTotvaluegridsdtconpros_cp_barpie_Jsonclick = "" ;
      edtavTotvaluegridsdtconpros_cp_barpie_Enabled = 1 ;
      edtavTotvaluegridsdtconpros_cp_barmtr_Jsonclick = "" ;
      edtavTotvaluegridsdtconpros_cp_barmtr_Enabled = 1 ;
      edtavTotvaluegridsdtconpros_cp_barkgm_Jsonclick = "" ;
      edtavTotvaluegridsdtconpros_cp_barkgm_Enabled = 1 ;
      edtavSdtconpro__cp_disusrc_Enabled = -1 ;
      edtavSdtconpro__cp_barenccli_Enabled = -1 ;
      edtavSdtconpro__cp_baralbm_Enabled = -1 ;
      edtavSdtconpro__cp_baralbk_Enabled = -1 ;
      edtavSdtconpro__cp_barpie_Enabled = -1 ;
      edtavSdtconpro__cp_barmtr_Enabled = -1 ;
      edtavSdtconpro__cp_barkgm_Enabled = -1 ;
      edtavSdtconpro__cp_barrencc_Enabled = -1 ;
      edtavSdtconpro__cp_dsc_bar_Enabled = -1 ;
      edtavSdtconpro__cp_barproper_Enabled = -1 ;
      edtavSdtconpro__cp_discod_Enabled = -1 ;
      edtavSdtconpro__cp_disdes_Enabled = -1 ;
      edtavSdtconpro__cp_barext_Enabled = -1 ;
      edtavSdtconpro__cp_baragrest_Enabled = -1 ;
      edtavSdtconpro__cp_desc_b_Enabled = -1 ;
      edtavSdtconpro__cp_baracaanh_Enabled = -1 ;
      edtavSdtconpro__cp_bargirar_Enabled = -1 ;
      edtavSdtconpro__cp_tartdsc_Enabled = -1 ;
      edtavSdtconpro__cp_bartipart_Enabled = -1 ;
      edtavSdtconpro__cp_barnomcli_Enabled = -1 ;
      edtavSdtconpro__cp_barcolu_Enabled = -1 ;
      edtavSdtconpro__cp_barcolo_Enabled = -1 ;
      edtavSdtconpro__cp_barserdsc_Enabled = -1 ;
      edtavSdtconpro__cp_barser_Enabled = -1 ;
      edtavSdtconpro__cp_barfecsal_Enabled = -1 ;
      edtavSdtconpro__cp_barfeccli_Enabled = -1 ;
      edtavSdtconpro__cp_barfecgen_Enabled = -1 ;
      edtavSdtconpro__cp_barsit_Enabled = -1 ;
      edtavSdtconpro__cp_barplf_Enabled = -1 ;
      edtavSdtconpro__cp_barnumcli_Enabled = -1 ;
      edtavSdtconpro__cp_barfecfpr_Enabled = -1 ;
      edtavSdtconpro__cp_barcodpar_Enabled = -1 ;
      edtavSdtconpro__cp_barcodreo_Enabled = -1 ;
      edtavSdtconpro__cp_barcod_Enabled = -1 ;
      edtavSdtconpro__cp_bardisnum_Enabled = -1 ;
      edtavSdtconpro__cp_clinom_Enabled = -1 ;
      edtavSdtconpro__cp_clicod_Enabled = -1 ;
      edtavSdtconpro__cp_emprcod_Enabled = -1 ;
      edtavSdtconpro__cp_id_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavTotal_Jsonclick = "" ;
      edtavTotal_Enabled = 1 ;
      edtavCantidad_Jsonclick = "" ;
      edtavCantidad_Enabled = 1 ;
      edtavPagina_Jsonclick = "" ;
      edtavPagina_Enabled = 1 ;
      divUnnamedtable1_Visible = 1 ;
      Agrupadas_modal_Bodytype = "WebComponent" ;
      Agrupadas_modal_Confirmtype = "" ;
      Agrupadas_modal_Title = httpContext.getMessage( "Producciones Agrupadas Tinte", "") ;
      Agrupadas_modal_Width = "1500" ;
      Piezas_modal_Bodytype = "WebComponent" ;
      Piezas_modal_Confirmtype = "" ;
      Piezas_modal_Title = httpContext.getMessage( "Detalle Entradas Almacen Tejido", "") ;
      Piezas_modal_Width = "1500" ;
      Packinglist_modal_Bodytype = "WebComponent" ;
      Packinglist_modal_Confirmtype = "" ;
      Packinglist_modal_Title = httpContext.getMessage( " Packing List", "") ;
      Packinglist_modal_Width = "1500" ;
      Partesproduccion_modal_Bodytype = "WebComponent" ;
      Partesproduccion_modal_Confirmtype = "" ;
      Partesproduccion_modal_Title = httpContext.getMessage( " Parte Produccion", "") ;
      Partesproduccion_modal_Width = "1500" ;
      Recetas_modal_Bodytype = "WebComponent" ;
      Recetas_modal_Confirmtype = "" ;
      Recetas_modal_Title = httpContext.getMessage( "Recetas", "") ;
      Recetas_modal_Width = "800" ;
      Consultaalbaransalida_modal_Bodytype = "WebComponent" ;
      Consultaalbaransalida_modal_Confirmtype = "" ;
      Consultaalbaransalida_modal_Title = httpContext.getMessage( "Albaran de Entrega", "") ;
      Consultaalbaransalida_modal_Width = "1500" ;
      Situacionfases_modal_Bodytype = "WebComponent" ;
      Situacionfases_modal_Confirmtype = "" ;
      Situacionfases_modal_Title = httpContext.getMessage( "Consulta de Fases Produccion", "") ;
      Situacionfases_modal_Width = "1500" ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 1 ;
      Gridsdtconprospaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdtconprospaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdtconprospaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdtconprospaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdtconprospaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdtconprospaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdtconprospaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdtconprospaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdtconprospaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdtconprospaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdtconprospaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdtconprospaginationbar_Pagestoshow = 5 ;
      Gridsdtconprospaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdtconprospaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdtconprospaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdtconprospaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdtconprospaginationbar_Class = "PaginationBar" ;
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
      subGridsdtconpros_Rows = 0 ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_64_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         if ( ( AV225GXV1 > 0 ) && ( AV96SDTCONPRO.size() >= AV225GXV1 ) && (0==AV73GridActionGroup1) )
         {
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDTCONPROS_nFirstRecordOnPage'},{av:'GRIDSDTCONPROS_nEOF'},{av:'sPrefix'},{av:'subGridsdtconpros_Rows',ctrl:'GRIDSDTCONPROS',prop:'Rows'},{av:'AV197NumeroRegistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV96SDTCONPRO',fld:'vSDTCONPRO',grid:64,pic:''},{av:'nGXsfl_64_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:64},{av:'nRC_GXsfl_64',ctrl:'GRIDSDTCONPROS',prop:'GridRC',grid:64},{av:'AV216TotGridSDTCONPROs_CP_BARKGM',fld:'vTOTGRIDSDTCONPROS_CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV218TotGridSDTCONPROs_CP_BARMTR',fld:'vTOTGRIDSDTCONPROS_CP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV220TotGridSDTCONPROs_CP_BARPIE',fld:'vTOTGRIDSDTCONPROS_CP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV86Messages',fld:'vMESSAGES',pic:'',hsh:true},{av:'AV195TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV193Xml',fld:'vXML',pic:'',hsh:true},{av:'AV211CP_BARFECFPR',fld:'vCP_BARFECFPR',pic:'',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV214CP_BarColNom',fld:'vCP_BARCOLNOM',pic:'',hsh:true},{av:'AV215CP_BarColNum',fld:'vCP_BARCOLNUM',pic:'9.999',hsh:true},{av:'AV44Cantidad',fld:'vCANTIDAD',pic:'ZZZ,ZZ9.99'},{av:'AV180Total',fld:'vTOTAL',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV76GridSDTCONPROsCurrentPage',fld:'vGRIDSDTCONPROSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridSDTCONPROsPageCount',fld:'vGRIDSDTCONPROSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV216TotGridSDTCONPROs_CP_BARKGM',fld:'vTOTGRIDSDTCONPROS_CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV218TotGridSDTCONPROs_CP_BARMTR',fld:'vTOTGRIDSDTCONPROS_CP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV220TotGridSDTCONPROs_CP_BARPIE',fld:'vTOTGRIDSDTCONPROS_CP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV217TotValueGridSDTCONPROs_CP_BARKGM',fld:'vTOTVALUEGRIDSDTCONPROS_CP_BARKGM',pic:''},{av:'AV219TotValueGridSDTCONPROs_CP_BARMTR',fld:'vTOTVALUEGRIDSDTCONPROS_CP_BARMTR',pic:''},{av:'AV221TotValueGridSDTCONPROs_CP_BARPIE',fld:'vTOTVALUEGRIDSDTCONPROS_CP_BARPIE',pic:''}]}");
      setEventMetadata("GRIDSDTCONPROS.LOAD","{handler:'e1726Z2',iparms:[{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV96SDTCONPRO',fld:'vSDTCONPRO',grid:64,pic:''},{av:'nGXsfl_64_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:64},{av:'GRIDSDTCONPROS_nFirstRecordOnPage'},{av:'nRC_GXsfl_64',ctrl:'GRIDSDTCONPROS',prop:'GridRC',grid:64}]");
      setEventMetadata("GRIDSDTCONPROS.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV73GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("GRIDSDTCONPROSPAGINATIONBAR.CHANGEPAGE","{handler:'e1226Z2',iparms:[{av:'GRIDSDTCONPROS_nFirstRecordOnPage'},{av:'GRIDSDTCONPROS_nEOF'},{av:'subGridsdtconpros_Rows',ctrl:'GRIDSDTCONPROS',prop:'Rows'},{av:'AV197NumeroRegistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV96SDTCONPRO',fld:'vSDTCONPRO',grid:64,pic:''},{av:'nGXsfl_64_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:64},{av:'nRC_GXsfl_64',ctrl:'GRIDSDTCONPROS',prop:'GridRC',grid:64},{av:'AV216TotGridSDTCONPROs_CP_BARKGM',fld:'vTOTGRIDSDTCONPROS_CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV218TotGridSDTCONPROs_CP_BARMTR',fld:'vTOTGRIDSDTCONPROS_CP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV220TotGridSDTCONPROs_CP_BARPIE',fld:'vTOTGRIDSDTCONPROS_CP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV86Messages',fld:'vMESSAGES',pic:'',hsh:true},{av:'AV195TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV193Xml',fld:'vXML',pic:'',hsh:true},{av:'AV211CP_BARFECFPR',fld:'vCP_BARFECFPR',pic:'',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV214CP_BarColNom',fld:'vCP_BARCOLNOM',pic:'',hsh:true},{av:'AV215CP_BarColNum',fld:'vCP_BARCOLNUM',pic:'9.999',hsh:true},{av:'AV44Cantidad',fld:'vCANTIDAD',pic:'ZZZ,ZZ9.99'},{av:'AV180Total',fld:'vTOTAL',pic:''},{av:'sPrefix'},{av:'Gridsdtconprospaginationbar_Selectedpage',ctrl:'GRIDSDTCONPROSPAGINATIONBAR',prop:'SelectedPage'},{av:'AV95Pagina',fld:'vPAGINA',pic:'ZZZ9'},{av:'AV94PageToGo',fld:'vPAGETOGO',pic:'ZZZZZ9'},{av:'AV15BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV16BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV34BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV35BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV23BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV24BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV25BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV26BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV19BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV20BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV21BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV22BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV33BarSerto',fld:'vBARSERTO',pic:''},{av:'AV11BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV12BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV13BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV14BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV28BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV29BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV30BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV31BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV36BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV37BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV5BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV10BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV8BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV9BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV6BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV7BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV194Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV27BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV66ErrorMessage',fld:'vERRORMESSAGE',pic:''}]");
      setEventMetadata("GRIDSDTCONPROSPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV94PageToGo',fld:'vPAGETOGO',pic:'ZZZZZ9'},{av:'AV95Pagina',fld:'vPAGINA',pic:'ZZZ9'},{av:'AV96SDTCONPRO',fld:'vSDTCONPRO',grid:64,pic:''},{av:'nGXsfl_64_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:64},{av:'GRIDSDTCONPROS_nFirstRecordOnPage'},{av:'nRC_GXsfl_64',ctrl:'GRIDSDTCONPROS',prop:'GridRC',grid:64},{av:'AV76GridSDTCONPROsCurrentPage',fld:'vGRIDSDTCONPROSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridSDTCONPROsPageCount',fld:'vGRIDSDTCONPROSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV216TotGridSDTCONPROs_CP_BARKGM',fld:'vTOTGRIDSDTCONPROS_CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV218TotGridSDTCONPROs_CP_BARMTR',fld:'vTOTGRIDSDTCONPROS_CP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV220TotGridSDTCONPROs_CP_BARPIE',fld:'vTOTGRIDSDTCONPROS_CP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV217TotValueGridSDTCONPROs_CP_BARKGM',fld:'vTOTVALUEGRIDSDTCONPROS_CP_BARKGM',pic:''},{av:'AV219TotValueGridSDTCONPROs_CP_BARMTR',fld:'vTOTVALUEGRIDSDTCONPROS_CP_BARMTR',pic:''},{av:'AV221TotValueGridSDTCONPROs_CP_BARPIE',fld:'vTOTVALUEGRIDSDTCONPROS_CP_BARPIE',pic:''}]}");
      setEventMetadata("GRIDSDTCONPROSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1326Z2',iparms:[{av:'GRIDSDTCONPROS_nFirstRecordOnPage'},{av:'GRIDSDTCONPROS_nEOF'},{av:'subGridsdtconpros_Rows',ctrl:'GRIDSDTCONPROS',prop:'Rows'},{av:'AV197NumeroRegistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV96SDTCONPRO',fld:'vSDTCONPRO',grid:64,pic:''},{av:'nGXsfl_64_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:64},{av:'nRC_GXsfl_64',ctrl:'GRIDSDTCONPROS',prop:'GridRC',grid:64},{av:'AV216TotGridSDTCONPROs_CP_BARKGM',fld:'vTOTGRIDSDTCONPROS_CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV218TotGridSDTCONPROs_CP_BARMTR',fld:'vTOTGRIDSDTCONPROS_CP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV220TotGridSDTCONPROs_CP_BARPIE',fld:'vTOTGRIDSDTCONPROS_CP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV64Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV86Messages',fld:'vMESSAGES',pic:'',hsh:true},{av:'AV195TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV193Xml',fld:'vXML',pic:'',hsh:true},{av:'AV211CP_BARFECFPR',fld:'vCP_BARFECFPR',pic:'',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV214CP_BarColNom',fld:'vCP_BARCOLNOM',pic:'',hsh:true},{av:'AV215CP_BarColNum',fld:'vCP_BARCOLNUM',pic:'9.999',hsh:true},{av:'AV44Cantidad',fld:'vCANTIDAD',pic:'ZZZ,ZZ9.99'},{av:'AV180Total',fld:'vTOTAL',pic:''},{av:'sPrefix'},{av:'Gridsdtconprospaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDTCONPROSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDTCONPROSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdtconpros_Rows',ctrl:'GRIDSDTCONPROS',prop:'Rows'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e1826Z2',iparms:[{av:'AV96SDTCONPRO',fld:'vSDTCONPRO',grid:64,pic:''},{av:'nGXsfl_64_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:64},{av:'GRIDSDTCONPROS_nFirstRecordOnPage'},{av:'nRC_GXsfl_64',ctrl:'GRIDSDTCONPROS',prop:'GridRC',grid:64},{av:'cmbavGridactiongroup1'},{av:'AV73GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV198CP_EmprCod',fld:'vCP_EMPRCOD',pic:''},{av:'AV199CP_BarCod',fld:'vCP_BARCOD',pic:'ZZZZZZZ9'},{av:'AV200CP_BarCodReo',fld:'vCP_BARCODREO',pic:'9'},{av:'AV201CP_BarCodPar',fld:'vCP_BARCODPAR',pic:''},{av:'AV202CP_Clicod',fld:'vCP_CLICOD',pic:'ZZZZZ9'},{av:'AV203CP_CliNom',fld:'vCP_CLINOM',pic:''},{av:'AV204CP_BARDISNUM',fld:'vCP_BARDISNUM',pic:''},{av:'AV205CP_Barser',fld:'vCP_BARSER',pic:''},{av:'AV206CP_BARSERDSC',fld:'vCP_BARSERDSC',pic:''},{av:'AV207CP_Barcolo',fld:'vCP_BARCOLO',pic:''},{av:'AV208CP_Barcolu',fld:'vCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV211CP_BARFECFPR',fld:'vCP_BARFECFPR',pic:'',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'AV198CP_EmprCod',fld:'vCP_EMPRCOD',pic:''},{av:'AV199CP_BarCod',fld:'vCP_BARCOD',pic:'ZZZZZZZ9'},{av:'AV200CP_BarCodReo',fld:'vCP_BARCODREO',pic:'9'},{av:'AV201CP_BarCodPar',fld:'vCP_BARCODPAR',pic:''},{av:'AV202CP_Clicod',fld:'vCP_CLICOD',pic:'ZZZZZ9'},{av:'AV203CP_CliNom',fld:'vCP_CLINOM',pic:''},{av:'AV204CP_BARDISNUM',fld:'vCP_BARDISNUM',pic:''},{av:'AV205CP_Barser',fld:'vCP_BARSER',pic:''},{av:'AV206CP_BARSERDSC',fld:'vCP_BARSERDSC',pic:''},{av:'AV207CP_Barcolo',fld:'vCP_BARCOLO',pic:''},{av:'AV208CP_Barcolu',fld:'vCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV209CP_BarKgm',fld:'vCP_BARKGM',pic:'ZZZZZ9.99'},{av:'AV210CP_BarMtr',fld:'vCP_BARMTR',pic:'ZZZZZ9.99'},{av:'cmbavGridactiongroup1'},{av:'AV73GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("'DOEXCEL'","{handler:'e1426Z2',iparms:[]");
      setEventMetadata("'DOEXCEL'",",oparms:[{av:'AV66ErrorMessage',fld:'vERRORMESSAGE',pic:''}]}");
      setEventMetadata("'DOCSV'","{handler:'e1126Z1',iparms:[]");
      setEventMetadata("'DOCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv40',iparms:[]");
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
      wcpOAV70FilterEmprcod = "" ;
      wcpOAV15BarDisNumfrom = "" ;
      wcpOAV16BarDisNumto = "" ;
      wcpOAV23BarFecGenfrom = GXutil.nullDate() ;
      wcpOAV24BarFecGento = GXutil.nullDate() ;
      wcpOAV19BarFecClifrom = GXutil.nullDate() ;
      wcpOAV20BarFecClito = GXutil.nullDate() ;
      wcpOAV21BarFecFprfrom = GXutil.nullDate() ;
      wcpOAV22BarFecFprto = GXutil.nullDate() ;
      wcpOAV25BarFecSalfrom = GXutil.nullDate() ;
      wcpOAV26BarFecSalto = GXutil.nullDate() ;
      wcpOAV32BarSerfrom = "" ;
      wcpOAV33BarSerto = "" ;
      wcpOAV11BarColNomfrom = "" ;
      wcpOAV12BarColNomto = "" ;
      wcpOAV28BarNomClifrom = "" ;
      wcpOAV29BarNomClito = "" ;
      wcpOAV88muestras = "" ;
      wcpOAV6BarCodParfrom = "" ;
      wcpOAV7BarCodParto = "" ;
      wcpOAV194Cod_idtx = "" ;
      wcpOAV27BarGirar = "" ;
      Gridsdtconprospaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV70FilterEmprcod = "" ;
      AV15BarDisNumfrom = "" ;
      AV16BarDisNumto = "" ;
      AV23BarFecGenfrom = GXutil.nullDate() ;
      AV24BarFecGento = GXutil.nullDate() ;
      AV19BarFecClifrom = GXutil.nullDate() ;
      AV20BarFecClito = GXutil.nullDate() ;
      AV21BarFecFprfrom = GXutil.nullDate() ;
      AV22BarFecFprto = GXutil.nullDate() ;
      AV25BarFecSalfrom = GXutil.nullDate() ;
      AV26BarFecSalto = GXutil.nullDate() ;
      AV32BarSerfrom = "" ;
      AV33BarSerto = "" ;
      AV11BarColNomfrom = "" ;
      AV12BarColNomto = "" ;
      AV28BarNomClifrom = "" ;
      AV29BarNomClito = "" ;
      AV88muestras = "" ;
      AV6BarCodParfrom = "" ;
      AV7BarCodParto = "" ;
      AV194Cod_idtx = "" ;
      AV27BarGirar = "" ;
      AV96SDTCONPRO = new GXBaseCollection<app.SdtSDTCONPRO_Registro>(app.SdtSDTCONPRO_Registro.class, "Registro", "", remoteHandle);
      AV216TotGridSDTCONPROs_CP_BARKGM = DecimalUtil.ZERO ;
      AV218TotGridSDTCONPROs_CP_BARMTR = DecimalUtil.ZERO ;
      AV64Emprcod = "" ;
      AV86Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV195TFBarPlf = "" ;
      AV193Xml = "" ;
      AV211CP_BARFECFPR = GXutil.nullDate() ;
      AV214CP_BarColNom = "" ;
      AV215CP_BarColNum = DecimalUtil.ZERO ;
      AV44Cantidad = DecimalUtil.ZERO ;
      AV180Total = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV66ErrorMessage = "" ;
      AV198CP_EmprCod = "" ;
      AV201CP_BarCodPar = "" ;
      AV203CP_CliNom = "" ;
      AV204CP_BARDISNUM = "" ;
      AV205CP_Barser = "" ;
      AV206CP_BARSERDSC = "" ;
      AV207CP_Barcolo = "" ;
      AV209CP_BarKgm = DecimalUtil.ZERO ;
      AV210CP_BarMtr = DecimalUtil.ZERO ;
      Gridsdtconpros_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnexcel_Jsonclick = "" ;
      bttBtncsv_Jsonclick = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      GridsdtconprosContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridsdtconprospaginationbar = new com.genexus.webpanels.GXUserControl();
      AV265Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGridsdtconpros_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GridsdtconprosState = new com.genexus.webpanels.gridstate.GXGridStateHandler(context,"Gridsdtconpros",getPgmname(),this,"subgridsdtconpros_varsfromstate","subgridsdtconpros_varstostate") ;
      AV217TotValueGridSDTCONPROs_CP_BARKGM = "" ;
      AV219TotValueGridSDTCONPROs_CP_BARMTR = "" ;
      AV221TotValueGridSDTCONPROs_CP_BARPIE = "" ;
      hsh = "" ;
      AV98Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV65EmprNom = "" ;
      AV190UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GridsdtconprosRow = new com.genexus.webpanels.GXWebRow();
      AV67ExcelFilename = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV196SDTCONPROItem = new app.SdtSDTCONPRO_Registro(remoteHandle, context);
      AV191WebSession = httpContext.getWebSession();
      Barserfrom_svchar40_0 = "" ;
      Barserto_svchar40_0 = "" ;
      Barcolnomfrom_svchar40_0 = "" ;
      Barcolnomto_svchar40_0 = "" ;
      Barnomclifrom_svchar40_0 = "" ;
      Barnomclito_svchar40_0 = "" ;
      Cod_idtx_svchar40_0 = "" ;
      Tfbarplf_svchar40_0 = "" ;
      Bargirar_svchar40_0 = "" ;
      Xml_vchar8388608_0 = "" ;
      H026Z2_AXml_vchar8388608_0 = new String[] {""} ;
      H026Z2_AV180Total = new String[] {""} ;
      H026Z2_AV64Emprcod = new String[] {""} ;
      H026Z2_APagina_int10_0 = new long[1] ;
      H026Z2_ACantidad_int10_0 = new long[1] ;
      H026Z2_AV15BarDisNumfrom = new String[] {""} ;
      H026Z2_AV16BarDisNumto = new String[] {""} ;
      H026Z2_AV45CliCodfrom = new int[1] ;
      H026Z2_AV46CliCodto = new int[1] ;
      H026Z2_AV34BarSitfrom = new byte[1] ;
      H026Z2_AV35BarSitto = new byte[1] ;
      H026Z2_AV23BarFecGenfrom = new java.util.Date[] {GXutil.nullDate()} ;
      H026Z2_AV24BarFecGento = new java.util.Date[] {GXutil.nullDate()} ;
      H026Z2_AV25BarFecSalfrom = new java.util.Date[] {GXutil.nullDate()} ;
      H026Z2_AV26BarFecSalto = new java.util.Date[] {GXutil.nullDate()} ;
      H026Z2_AV19BarFecClifrom = new java.util.Date[] {GXutil.nullDate()} ;
      H026Z2_AV20BarFecClito = new java.util.Date[] {GXutil.nullDate()} ;
      H026Z2_AV21BarFecFprfrom = new java.util.Date[] {GXutil.nullDate()} ;
      H026Z2_AV22BarFecFprto = new java.util.Date[] {GXutil.nullDate()} ;
      H026Z2_ABarserfrom_svchar40_0 = new String[] {""} ;
      H026Z2_ABarserto_svchar40_0 = new String[] {""} ;
      H026Z2_ABarcolnomfrom_svchar40_0 = new String[] {""} ;
      H026Z2_ABarcolnomto_svchar40_0 = new String[] {""} ;
      H026Z2_ABarcolnumfrom_int8_0 = new int[1] ;
      H026Z2_ABarcolnumto_int8_0 = new int[1] ;
      H026Z2_ABarnomclifrom_svchar40_0 = new String[] {""} ;
      H026Z2_ABarnomclito_svchar40_0 = new String[] {""} ;
      H026Z2_ABarnumclifrom_int8_0 = new int[1] ;
      H026Z2_ABarnumclito_int8_0 = new int[1] ;
      H026Z2_ABartipartfrom_int8_0 = new int[1] ;
      H026Z2_ABartipartto_int8_0 = new int[1] ;
      H026Z2_AV5BarCodfrom = new int[1] ;
      H026Z2_AV10BarCodto = new int[1] ;
      H026Z2_ABarcodreofrom_int8_0 = new int[1] ;
      H026Z2_ABarcodreoto_int8_0 = new int[1] ;
      H026Z2_AV6BarCodParfrom = new String[] {""} ;
      H026Z2_AV7BarCodParto = new String[] {""} ;
      H026Z2_ACod_idtx_svchar40_0 = new String[] {""} ;
      H026Z2_ATfbarplf_svchar40_0 = new String[] {""} ;
      H026Z2_ABargirar_svchar40_0 = new String[] {""} ;
      AV85Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      ucAgrupadas_modal = new com.genexus.webpanels.GXUserControl();
      ucPiezas_modal = new com.genexus.webpanels.GXUserControl();
      ucPackinglist_modal = new com.genexus.webpanels.GXUserControl();
      ucPartesproduccion_modal = new com.genexus.webpanels.GXUserControl();
      ucRecetas_modal = new com.genexus.webpanels.GXUserControl();
      ucConsultaalbaransalida_modal = new com.genexus.webpanels.GXUserControl();
      ucSituacionfases_modal = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV70FilterEmprcod = "" ;
      sCtrlAV45CliCodfrom = "" ;
      sCtrlAV46CliCodto = "" ;
      sCtrlAV15BarDisNumfrom = "" ;
      sCtrlAV16BarDisNumto = "" ;
      sCtrlAV23BarFecGenfrom = "" ;
      sCtrlAV24BarFecGento = "" ;
      sCtrlAV34BarSitfrom = "" ;
      sCtrlAV35BarSitto = "" ;
      sCtrlAV19BarFecClifrom = "" ;
      sCtrlAV20BarFecClito = "" ;
      sCtrlAV21BarFecFprfrom = "" ;
      sCtrlAV22BarFecFprto = "" ;
      sCtrlAV25BarFecSalfrom = "" ;
      sCtrlAV26BarFecSalto = "" ;
      sCtrlAV32BarSerfrom = "" ;
      sCtrlAV33BarSerto = "" ;
      sCtrlAV36BarTipArtfrom = "" ;
      sCtrlAV37BarTipArtto = "" ;
      sCtrlAV11BarColNomfrom = "" ;
      sCtrlAV12BarColNomto = "" ;
      sCtrlAV13BarColNumfrom = "" ;
      sCtrlAV14BarColNumto = "" ;
      sCtrlAV28BarNomClifrom = "" ;
      sCtrlAV29BarNomClito = "" ;
      sCtrlAV30BarNumClifrom = "" ;
      sCtrlAV31BarNumClito = "" ;
      sCtrlAV88muestras = "" ;
      sCtrlAV5BarCodfrom = "" ;
      sCtrlAV10BarCodto = "" ;
      sCtrlAV8BarCodReofrom = "" ;
      sCtrlAV9BarCodReoto = "" ;
      sCtrlAV6BarCodParfrom = "" ;
      sCtrlAV7BarCodParto = "" ;
      sCtrlAV194Cod_idtx = "" ;
      sCtrlAV27BarGirar = "" ;
      subGridsdtconpros_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridsdtconprosColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultaproduccioneo__default(),
         new Object[] {
             new Object[] {
            H026Z2_AV64Emprcod, H026Z2_APagina_int10_0, H026Z2_ACantidad_int10_0, H026Z2_AV15BarDisNumfrom, H026Z2_AV16BarDisNumto, H026Z2_AV45CliCodfrom, H026Z2_AV46CliCodto, H026Z2_AV34BarSitfrom, H026Z2_AV35BarSitto, H026Z2_AV23BarFecGenfrom,
            H026Z2_AV24BarFecGento, H026Z2_AV25BarFecSalfrom, H026Z2_AV26BarFecSalto, H026Z2_AV19BarFecClifrom, H026Z2_AV20BarFecClito, H026Z2_AV21BarFecFprfrom, H026Z2_AV22BarFecFprto, H026Z2_ABarserfrom_svchar40_0, H026Z2_ABarserto_svchar40_0, H026Z2_ABarcolnomfrom_svchar40_0,
            H026Z2_ABarcolnomto_svchar40_0, H026Z2_ABarcolnumfrom_int8_0, H026Z2_ABarcolnumto_int8_0, H026Z2_ABarnomclifrom_svchar40_0, H026Z2_ABarnomclito_svchar40_0, H026Z2_ABarnumclifrom_int8_0, H026Z2_ABarnumclito_int8_0, H026Z2_ABartipartfrom_int8_0, H026Z2_ABartipartto_int8_0, H026Z2_AV5BarCodfrom,
            H026Z2_AV10BarCodto, H026Z2_ABarcodreofrom_int8_0, H026Z2_ABarcodreoto_int8_0, H026Z2_AV6BarCodParfrom, H026Z2_AV7BarCodParto, H026Z2_ACod_idtx_svchar40_0, H026Z2_ATfbarplf_svchar40_0, H026Z2_ABargirar_svchar40_0, H026Z2_AXml_vchar8388608_0, H026Z2_AV180Total
            }
         }
      );
      AV265Pgmname = "Produccion.ConsultaProduccionEO" ;
      /* GeneXus formulas. */
      AV265Pgmname = "Produccion.ConsultaProduccionEO" ;
      Gx_err = (short)(0) ;
      edtavPagina_Enabled = 0 ;
      edtavCantidad_Enabled = 0 ;
      edtavTotal_Enabled = 0 ;
      edtavSdtconpro__cp_id_Enabled = 0 ;
      edtavSdtconpro__cp_emprcod_Enabled = 0 ;
      edtavSdtconpro__cp_clicod_Enabled = 0 ;
      edtavSdtconpro__cp_clinom_Enabled = 0 ;
      edtavSdtconpro__cp_bardisnum_Enabled = 0 ;
      edtavSdtconpro__cp_barcod_Enabled = 0 ;
      edtavSdtconpro__cp_barcodreo_Enabled = 0 ;
      edtavSdtconpro__cp_barcodpar_Enabled = 0 ;
      edtavSdtconpro__cp_barfecfpr_Enabled = 0 ;
      edtavSdtconpro__cp_barnumcli_Enabled = 0 ;
      edtavSdtconpro__cp_barplf_Enabled = 0 ;
      edtavSdtconpro__cp_barsit_Enabled = 0 ;
      edtavSdtconpro__cp_barfecgen_Enabled = 0 ;
      edtavSdtconpro__cp_barfeccli_Enabled = 0 ;
      edtavSdtconpro__cp_barfecsal_Enabled = 0 ;
      edtavSdtconpro__cp_barser_Enabled = 0 ;
      edtavSdtconpro__cp_barserdsc_Enabled = 0 ;
      edtavSdtconpro__cp_barcolo_Enabled = 0 ;
      edtavSdtconpro__cp_barcolu_Enabled = 0 ;
      edtavSdtconpro__cp_barnomcli_Enabled = 0 ;
      edtavSdtconpro__cp_bartipart_Enabled = 0 ;
      edtavSdtconpro__cp_tartdsc_Enabled = 0 ;
      edtavSdtconpro__cp_bargirar_Enabled = 0 ;
      edtavSdtconpro__cp_baracaanh_Enabled = 0 ;
      edtavSdtconpro__cp_desc_b_Enabled = 0 ;
      edtavSdtconpro__cp_baragrest_Enabled = 0 ;
      edtavSdtconpro__cp_barext_Enabled = 0 ;
      edtavSdtconpro__cp_disdes_Enabled = 0 ;
      edtavSdtconpro__cp_discod_Enabled = 0 ;
      edtavSdtconpro__cp_barproper_Enabled = 0 ;
      edtavSdtconpro__cp_dsc_bar_Enabled = 0 ;
      edtavSdtconpro__cp_barrencc_Enabled = 0 ;
      edtavSdtconpro__cp_barkgm_Enabled = 0 ;
      edtavSdtconpro__cp_barmtr_Enabled = 0 ;
      edtavSdtconpro__cp_barpie_Enabled = 0 ;
      edtavSdtconpro__cp_baralbk_Enabled = 0 ;
      edtavSdtconpro__cp_baralbm_Enabled = 0 ;
      edtavSdtconpro__cp_barenccli_Enabled = 0 ;
      edtavSdtconpro__cp_disusrc_Enabled = 0 ;
      edtavTotvaluegridsdtconpros_cp_barkgm_Enabled = 0 ;
      edtavTotvaluegridsdtconpros_cp_barmtr_Enabled = 0 ;
      edtavTotvaluegridsdtconpros_cp_barpie_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV34BarSitfrom ;
   private byte wcpOAV35BarSitto ;
   private byte wcpOAV8BarCodReofrom ;
   private byte wcpOAV9BarCodReoto ;
   private byte GRIDSDTCONPROS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV34BarSitfrom ;
   private byte AV35BarSitto ;
   private byte AV8BarCodReofrom ;
   private byte AV9BarCodReoto ;
   private byte AV200CP_BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGridsdtconpros_Backcolorstyle ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGridsdtconpros_Backstyle ;
   private byte subGridsdtconpros_Titlebackstyle ;
   private byte subGridsdtconpros_Allowselection ;
   private byte subGridsdtconpros_Allowhovering ;
   private byte subGridsdtconpros_Allowcollapsing ;
   private byte subGridsdtconpros_Collapsed ;
   private short wcpOAV36BarTipArtfrom ;
   private short wcpOAV37BarTipArtto ;
   private short AV36BarTipArtfrom ;
   private short AV37BarTipArtto ;
   private short AV87Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV95Pagina ;
   private short AV73GridActionGroup1 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV45CliCodfrom ;
   private int wcpOAV46CliCodto ;
   private int wcpOAV13BarColNumfrom ;
   private int wcpOAV14BarColNumto ;
   private int wcpOAV30BarNumClifrom ;
   private int wcpOAV31BarNumClito ;
   private int wcpOAV5BarCodfrom ;
   private int wcpOAV10BarCodto ;
   private int subGridsdtconpros_Rows ;
   private int Gridsdtconprospaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_64 ;
   private int AV45CliCodfrom ;
   private int AV46CliCodto ;
   private int AV13BarColNumfrom ;
   private int AV14BarColNumto ;
   private int AV30BarNumClifrom ;
   private int AV31BarNumClito ;
   private int AV5BarCodfrom ;
   private int AV10BarCodto ;
   private int nGXsfl_64_idx=1 ;
   private int AV94PageToGo ;
   private int AV199CP_BarCod ;
   private int AV202CP_Clicod ;
   private int AV208CP_Barcolu ;
   private int Gridsdtconprospaginationbar_Pagestoshow ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int divUnnamedtable1_Visible ;
   private int edtavPagina_Enabled ;
   private int edtavCantidad_Enabled ;
   private int edtavTotal_Enabled ;
   private int AV225GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGridsdtconpros_Islastpage ;
   private int edtavSdtconpro__cp_id_Enabled ;
   private int edtavSdtconpro__cp_emprcod_Enabled ;
   private int edtavSdtconpro__cp_clicod_Enabled ;
   private int edtavSdtconpro__cp_clinom_Enabled ;
   private int edtavSdtconpro__cp_bardisnum_Enabled ;
   private int edtavSdtconpro__cp_barcod_Enabled ;
   private int edtavSdtconpro__cp_barcodreo_Enabled ;
   private int edtavSdtconpro__cp_barcodpar_Enabled ;
   private int edtavSdtconpro__cp_barfecfpr_Enabled ;
   private int edtavSdtconpro__cp_barnumcli_Enabled ;
   private int edtavSdtconpro__cp_barplf_Enabled ;
   private int edtavSdtconpro__cp_barsit_Enabled ;
   private int edtavSdtconpro__cp_barfecgen_Enabled ;
   private int edtavSdtconpro__cp_barfeccli_Enabled ;
   private int edtavSdtconpro__cp_barfecsal_Enabled ;
   private int edtavSdtconpro__cp_barser_Enabled ;
   private int edtavSdtconpro__cp_barserdsc_Enabled ;
   private int edtavSdtconpro__cp_barcolo_Enabled ;
   private int edtavSdtconpro__cp_barcolu_Enabled ;
   private int edtavSdtconpro__cp_barnomcli_Enabled ;
   private int edtavSdtconpro__cp_bartipart_Enabled ;
   private int edtavSdtconpro__cp_tartdsc_Enabled ;
   private int edtavSdtconpro__cp_bargirar_Enabled ;
   private int edtavSdtconpro__cp_baracaanh_Enabled ;
   private int edtavSdtconpro__cp_desc_b_Enabled ;
   private int edtavSdtconpro__cp_baragrest_Enabled ;
   private int edtavSdtconpro__cp_barext_Enabled ;
   private int edtavSdtconpro__cp_disdes_Enabled ;
   private int edtavSdtconpro__cp_discod_Enabled ;
   private int edtavSdtconpro__cp_barproper_Enabled ;
   private int edtavSdtconpro__cp_dsc_bar_Enabled ;
   private int edtavSdtconpro__cp_barrencc_Enabled ;
   private int edtavSdtconpro__cp_barkgm_Enabled ;
   private int edtavSdtconpro__cp_barmtr_Enabled ;
   private int edtavSdtconpro__cp_barpie_Enabled ;
   private int edtavSdtconpro__cp_baralbk_Enabled ;
   private int edtavSdtconpro__cp_baralbm_Enabled ;
   private int edtavSdtconpro__cp_barenccli_Enabled ;
   private int edtavSdtconpro__cp_disusrc_Enabled ;
   private int edtavTotvaluegridsdtconpros_cp_barkgm_Enabled ;
   private int edtavTotvaluegridsdtconpros_cp_barmtr_Enabled ;
   private int edtavTotvaluegridsdtconpros_cp_barpie_Enabled ;
   private int GRIDSDTCONPROS_nGridOutOfScope ;
   private int GridsdtconprosPageCount ;
   private int nGXsfl_64_fel_idx=1 ;
   private int nGXsfl_64_bak_idx=1 ;
   private int AV266GXV41 ;
   private int Barcolnumfrom_int8_0 ;
   private int Barcolnumto_int8_0 ;
   private int Barnumclifrom_int8_0 ;
   private int Barnumclito_int8_0 ;
   private int Bartipartfrom_int8_0 ;
   private int Bartipartto_int8_0 ;
   private int Barcodreofrom_int8_0 ;
   private int Barcodreoto_int8_0 ;
   private int AV267GXV42 ;
   private int idxLst ;
   private int subGridsdtconpros_Backcolor ;
   private int subGridsdtconpros_Allbackcolor ;
   private int subGridsdtconpros_Titlebackcolor ;
   private int subGridsdtconpros_Selectedindex ;
   private int subGridsdtconpros_Selectioncolor ;
   private int subGridsdtconpros_Hoveringcolor ;
   private long GRIDSDTCONPROS_nFirstRecordOnPage ;
   private long AV197NumeroRegistros ;
   private long AV220TotGridSDTCONPROs_CP_BARPIE ;
   private long AV76GridSDTCONPROsCurrentPage ;
   private long AV77GridSDTCONPROsPageCount ;
   private long GRIDSDTCONPROS_nCurrentRecord ;
   private long GRIDSDTCONPROS_nRecordCount ;
   private long Pagina_int10_0 ;
   private long Cantidad_int10_0 ;
   private java.math.BigDecimal AV216TotGridSDTCONPROs_CP_BARKGM ;
   private java.math.BigDecimal AV218TotGridSDTCONPROs_CP_BARMTR ;
   private java.math.BigDecimal AV215CP_BarColNum ;
   private java.math.BigDecimal AV44Cantidad ;
   private java.math.BigDecimal AV209CP_BarKgm ;
   private java.math.BigDecimal AV210CP_BarMtr ;
   private String wcpOAV70FilterEmprcod ;
   private String wcpOAV15BarDisNumfrom ;
   private String wcpOAV16BarDisNumto ;
   private String wcpOAV32BarSerfrom ;
   private String wcpOAV33BarSerto ;
   private String wcpOAV11BarColNomfrom ;
   private String wcpOAV12BarColNomto ;
   private String wcpOAV28BarNomClifrom ;
   private String wcpOAV29BarNomClito ;
   private String wcpOAV88muestras ;
   private String wcpOAV6BarCodParfrom ;
   private String wcpOAV7BarCodParto ;
   private String wcpOAV194Cod_idtx ;
   private String wcpOAV27BarGirar ;
   private String Gridsdtconprospaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV70FilterEmprcod ;
   private String AV15BarDisNumfrom ;
   private String AV16BarDisNumto ;
   private String AV32BarSerfrom ;
   private String AV33BarSerto ;
   private String AV11BarColNomfrom ;
   private String AV12BarColNomto ;
   private String AV28BarNomClifrom ;
   private String AV29BarNomClito ;
   private String AV88muestras ;
   private String AV6BarCodParfrom ;
   private String AV7BarCodParto ;
   private String AV194Cod_idtx ;
   private String AV27BarGirar ;
   private String sGXsfl_64_idx="0001" ;
   private String AV64Emprcod ;
   private String AV195TFBarPlf ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV198CP_EmprCod ;
   private String AV201CP_BarCodPar ;
   private String AV204CP_BARDISNUM ;
   private String AV205CP_Barser ;
   private String AV207CP_Barcolo ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridsdtconprospaginationbar_Class ;
   private String Gridsdtconprospaginationbar_Pagingbuttonsposition ;
   private String Gridsdtconprospaginationbar_Pagingcaptionposition ;
   private String Gridsdtconprospaginationbar_Emptygridclass ;
   private String Gridsdtconprospaginationbar_Rowsperpageoptions ;
   private String Gridsdtconprospaginationbar_Previous ;
   private String Gridsdtconprospaginationbar_Next ;
   private String Gridsdtconprospaginationbar_Caption ;
   private String Gridsdtconprospaginationbar_Emptygridcaption ;
   private String Gridsdtconprospaginationbar_Rowsperpagecaption ;
   private String Gxuitabspanel_tabs_Class ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Situacionfases_modal_Width ;
   private String Situacionfases_modal_Title ;
   private String Situacionfases_modal_Confirmtype ;
   private String Situacionfases_modal_Bodytype ;
   private String Consultaalbaransalida_modal_Width ;
   private String Consultaalbaransalida_modal_Title ;
   private String Consultaalbaransalida_modal_Confirmtype ;
   private String Consultaalbaransalida_modal_Bodytype ;
   private String Recetas_modal_Width ;
   private String Recetas_modal_Title ;
   private String Recetas_modal_Confirmtype ;
   private String Recetas_modal_Bodytype ;
   private String Partesproduccion_modal_Width ;
   private String Partesproduccion_modal_Title ;
   private String Partesproduccion_modal_Confirmtype ;
   private String Partesproduccion_modal_Bodytype ;
   private String Packinglist_modal_Width ;
   private String Packinglist_modal_Title ;
   private String Packinglist_modal_Confirmtype ;
   private String Packinglist_modal_Bodytype ;
   private String Piezas_modal_Width ;
   private String Piezas_modal_Title ;
   private String Piezas_modal_Confirmtype ;
   private String Piezas_modal_Bodytype ;
   private String Agrupadas_modal_Width ;
   private String Agrupadas_modal_Title ;
   private String Agrupadas_modal_Confirmtype ;
   private String Agrupadas_modal_Bodytype ;
   private String Gridsdtconpros_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divTableactions_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String TempTags ;
   private String bttBtnexcel_Internalname ;
   private String bttBtnexcel_Jsonclick ;
   private String bttBtncsv_Internalname ;
   private String bttBtncsv_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavPagina_Internalname ;
   private String edtavPagina_Jsonclick ;
   private String edtavCantidad_Internalname ;
   private String edtavCantidad_Jsonclick ;
   private String edtavTotal_Internalname ;
   private String edtavTotal_Jsonclick ;
   private String divTablegrid_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String divGridsdtconprostablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridsdtconpros_Internalname ;
   private String Gridsdtconprospaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV265Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridsdtconpros_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtconpro__cp_id_Internalname ;
   private String edtavSdtconpro__cp_emprcod_Internalname ;
   private String edtavSdtconpro__cp_clicod_Internalname ;
   private String edtavSdtconpro__cp_clinom_Internalname ;
   private String edtavSdtconpro__cp_bardisnum_Internalname ;
   private String edtavSdtconpro__cp_barcod_Internalname ;
   private String edtavSdtconpro__cp_barcodreo_Internalname ;
   private String edtavSdtconpro__cp_barcodpar_Internalname ;
   private String edtavSdtconpro__cp_barfecfpr_Internalname ;
   private String edtavSdtconpro__cp_barnumcli_Internalname ;
   private String edtavSdtconpro__cp_barplf_Internalname ;
   private String edtavSdtconpro__cp_barsit_Internalname ;
   private String edtavSdtconpro__cp_barfecgen_Internalname ;
   private String edtavSdtconpro__cp_barfeccli_Internalname ;
   private String edtavSdtconpro__cp_barfecsal_Internalname ;
   private String edtavSdtconpro__cp_barser_Internalname ;
   private String edtavSdtconpro__cp_barserdsc_Internalname ;
   private String edtavSdtconpro__cp_barcolo_Internalname ;
   private String edtavSdtconpro__cp_barcolu_Internalname ;
   private String edtavSdtconpro__cp_barnomcli_Internalname ;
   private String edtavSdtconpro__cp_bartipart_Internalname ;
   private String edtavSdtconpro__cp_tartdsc_Internalname ;
   private String edtavSdtconpro__cp_bargirar_Internalname ;
   private String edtavSdtconpro__cp_baracaanh_Internalname ;
   private String edtavSdtconpro__cp_desc_b_Internalname ;
   private String edtavSdtconpro__cp_baragrest_Internalname ;
   private String edtavSdtconpro__cp_barext_Internalname ;
   private String edtavSdtconpro__cp_disdes_Internalname ;
   private String edtavSdtconpro__cp_discod_Internalname ;
   private String edtavSdtconpro__cp_barproper_Internalname ;
   private String edtavSdtconpro__cp_dsc_bar_Internalname ;
   private String edtavSdtconpro__cp_barrencc_Internalname ;
   private String edtavSdtconpro__cp_barkgm_Internalname ;
   private String edtavSdtconpro__cp_barmtr_Internalname ;
   private String edtavSdtconpro__cp_barpie_Internalname ;
   private String edtavSdtconpro__cp_baralbk_Internalname ;
   private String edtavSdtconpro__cp_baralbm_Internalname ;
   private String edtavSdtconpro__cp_barenccli_Internalname ;
   private String edtavSdtconpro__cp_disusrc_Internalname ;
   private String edtavTotvaluegridsdtconpros_cp_barkgm_Internalname ;
   private String edtavTotvaluegridsdtconpros_cp_barmtr_Internalname ;
   private String edtavTotvaluegridsdtconpros_cp_barpie_Internalname ;
   private String sGXsfl_64_fel_idx="0001" ;
   private String hsh ;
   private String AV98Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV65EmprNom ;
   private String AV190UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblTableagrupadas_modal_Internalname ;
   private String Agrupadas_modal_Internalname ;
   private String tblTablepiezas_modal_Internalname ;
   private String Piezas_modal_Internalname ;
   private String tblTablepackinglist_modal_Internalname ;
   private String Packinglist_modal_Internalname ;
   private String tblTablepartesproduccion_modal_Internalname ;
   private String Partesproduccion_modal_Internalname ;
   private String tblTablerecetas_modal_Internalname ;
   private String Recetas_modal_Internalname ;
   private String tblTableconsultaalbaransalida_modal_Internalname ;
   private String Consultaalbaransalida_modal_Internalname ;
   private String tblTablesituacionfases_modal_Internalname ;
   private String Situacionfases_modal_Internalname ;
   private String tblGridsdtconprostabletotalizer_Internalname ;
   private String edtavTotvaluegridsdtconpros_cp_barkgm_Jsonclick ;
   private String edtavTotvaluegridsdtconpros_cp_barmtr_Jsonclick ;
   private String edtavTotvaluegridsdtconpros_cp_barpie_Jsonclick ;
   private String sCtrlAV70FilterEmprcod ;
   private String sCtrlAV45CliCodfrom ;
   private String sCtrlAV46CliCodto ;
   private String sCtrlAV15BarDisNumfrom ;
   private String sCtrlAV16BarDisNumto ;
   private String sCtrlAV23BarFecGenfrom ;
   private String sCtrlAV24BarFecGento ;
   private String sCtrlAV34BarSitfrom ;
   private String sCtrlAV35BarSitto ;
   private String sCtrlAV19BarFecClifrom ;
   private String sCtrlAV20BarFecClito ;
   private String sCtrlAV21BarFecFprfrom ;
   private String sCtrlAV22BarFecFprto ;
   private String sCtrlAV25BarFecSalfrom ;
   private String sCtrlAV26BarFecSalto ;
   private String sCtrlAV32BarSerfrom ;
   private String sCtrlAV33BarSerto ;
   private String sCtrlAV36BarTipArtfrom ;
   private String sCtrlAV37BarTipArtto ;
   private String sCtrlAV11BarColNomfrom ;
   private String sCtrlAV12BarColNomto ;
   private String sCtrlAV13BarColNumfrom ;
   private String sCtrlAV14BarColNumto ;
   private String sCtrlAV28BarNomClifrom ;
   private String sCtrlAV29BarNomClito ;
   private String sCtrlAV30BarNumClifrom ;
   private String sCtrlAV31BarNumClito ;
   private String sCtrlAV88muestras ;
   private String sCtrlAV5BarCodfrom ;
   private String sCtrlAV10BarCodto ;
   private String sCtrlAV8BarCodReofrom ;
   private String sCtrlAV9BarCodReoto ;
   private String sCtrlAV6BarCodParfrom ;
   private String sCtrlAV7BarCodParto ;
   private String sCtrlAV194Cod_idtx ;
   private String sCtrlAV27BarGirar ;
   private String subGridsdtconpros_Class ;
   private String subGridsdtconpros_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavSdtconpro__cp_id_Jsonclick ;
   private String edtavSdtconpro__cp_emprcod_Jsonclick ;
   private String edtavSdtconpro__cp_clicod_Jsonclick ;
   private String edtavSdtconpro__cp_clinom_Jsonclick ;
   private String edtavSdtconpro__cp_bardisnum_Jsonclick ;
   private String edtavSdtconpro__cp_barcod_Jsonclick ;
   private String edtavSdtconpro__cp_barcodreo_Jsonclick ;
   private String edtavSdtconpro__cp_barcodpar_Jsonclick ;
   private String edtavSdtconpro__cp_barfecfpr_Jsonclick ;
   private String edtavSdtconpro__cp_barnumcli_Jsonclick ;
   private String edtavSdtconpro__cp_barplf_Jsonclick ;
   private String edtavSdtconpro__cp_barsit_Jsonclick ;
   private String edtavSdtconpro__cp_barfecgen_Jsonclick ;
   private String edtavSdtconpro__cp_barfeccli_Jsonclick ;
   private String edtavSdtconpro__cp_barfecsal_Jsonclick ;
   private String edtavSdtconpro__cp_barser_Jsonclick ;
   private String edtavSdtconpro__cp_barserdsc_Jsonclick ;
   private String edtavSdtconpro__cp_barcolo_Jsonclick ;
   private String edtavSdtconpro__cp_barcolu_Jsonclick ;
   private String edtavSdtconpro__cp_barnomcli_Jsonclick ;
   private String edtavSdtconpro__cp_bartipart_Jsonclick ;
   private String edtavSdtconpro__cp_tartdsc_Jsonclick ;
   private String edtavSdtconpro__cp_bargirar_Jsonclick ;
   private String edtavSdtconpro__cp_baracaanh_Jsonclick ;
   private String edtavSdtconpro__cp_desc_b_Jsonclick ;
   private String edtavSdtconpro__cp_baragrest_Jsonclick ;
   private String edtavSdtconpro__cp_barext_Jsonclick ;
   private String edtavSdtconpro__cp_disdes_Jsonclick ;
   private String edtavSdtconpro__cp_discod_Jsonclick ;
   private String edtavSdtconpro__cp_barproper_Jsonclick ;
   private String edtavSdtconpro__cp_dsc_bar_Jsonclick ;
   private String edtavSdtconpro__cp_barrencc_Jsonclick ;
   private String edtavSdtconpro__cp_barkgm_Jsonclick ;
   private String edtavSdtconpro__cp_barmtr_Jsonclick ;
   private String edtavSdtconpro__cp_barpie_Jsonclick ;
   private String edtavSdtconpro__cp_baralbk_Jsonclick ;
   private String edtavSdtconpro__cp_baralbm_Jsonclick ;
   private String edtavSdtconpro__cp_barenccli_Jsonclick ;
   private String edtavSdtconpro__cp_disusrc_Jsonclick ;
   private String subGridsdtconpros_Header ;
   private java.util.Date wcpOAV23BarFecGenfrom ;
   private java.util.Date wcpOAV24BarFecGento ;
   private java.util.Date wcpOAV19BarFecClifrom ;
   private java.util.Date wcpOAV20BarFecClito ;
   private java.util.Date wcpOAV21BarFecFprfrom ;
   private java.util.Date wcpOAV22BarFecFprto ;
   private java.util.Date wcpOAV25BarFecSalfrom ;
   private java.util.Date wcpOAV26BarFecSalto ;
   private java.util.Date AV23BarFecGenfrom ;
   private java.util.Date AV24BarFecGento ;
   private java.util.Date AV19BarFecClifrom ;
   private java.util.Date AV20BarFecClito ;
   private java.util.Date AV21BarFecFprfrom ;
   private java.util.Date AV22BarFecFprto ;
   private java.util.Date AV25BarFecSalfrom ;
   private java.util.Date AV26BarFecSalto ;
   private java.util.Date AV211CP_BARFECFPR ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridsdtconprospaginationbar_Showfirst ;
   private boolean Gridsdtconprospaginationbar_Showprevious ;
   private boolean Gridsdtconprospaginationbar_Shownext ;
   private boolean Gridsdtconprospaginationbar_Showlast ;
   private boolean Gridsdtconprospaginationbar_Rowsperpageselector ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean bGXsfl_64_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV99TempBoolean ;
   private boolean gx_BV64 ;
   private String AV193Xml ;
   private String Xml_vchar8388608_0 ;
   private String AV214CP_BarColNom ;
   private String AV180Total ;
   private String AV66ErrorMessage ;
   private String AV203CP_CliNom ;
   private String AV206CP_BARSERDSC ;
   private String AV217TotValueGridSDTCONPROs_CP_BARKGM ;
   private String AV219TotValueGridSDTCONPROs_CP_BARMTR ;
   private String AV221TotValueGridSDTCONPROs_CP_BARPIE ;
   private String AV67ExcelFilename ;
   private String Barserfrom_svchar40_0 ;
   private String Barserto_svchar40_0 ;
   private String Barcolnomfrom_svchar40_0 ;
   private String Barcolnomto_svchar40_0 ;
   private String Barnomclifrom_svchar40_0 ;
   private String Barnomclito_svchar40_0 ;
   private String Cod_idtx_svchar40_0 ;
   private String Tfbarplf_svchar40_0 ;
   private String Bargirar_svchar40_0 ;
   private com.genexus.webpanels.GXWebGrid GridsdtconprosContainer ;
   private com.genexus.webpanels.GXWebRow GridsdtconprosRow ;
   private com.genexus.webpanels.GXWebColumn GridsdtconprosColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.WebSession AV191WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucGridsdtconprospaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGridsdtconpros_empowerer ;
   private com.genexus.webpanels.GXUserControl ucAgrupadas_modal ;
   private com.genexus.webpanels.GXUserControl ucPiezas_modal ;
   private com.genexus.webpanels.GXUserControl ucPackinglist_modal ;
   private com.genexus.webpanels.GXUserControl ucPartesproduccion_modal ;
   private com.genexus.webpanels.GXUserControl ucRecetas_modal ;
   private com.genexus.webpanels.GXUserControl ucConsultaalbaransalida_modal ;
   private com.genexus.webpanels.GXUserControl ucSituacionfases_modal ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.gridstate.GXGridStateHandler GridsdtconprosState ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private String[] H026Z2_AXml_vchar8388608_0 ;
   private String[] H026Z2_AV180Total ;
   private String[] H026Z2_AV64Emprcod ;
   private long[] H026Z2_APagina_int10_0 ;
   private long[] H026Z2_ACantidad_int10_0 ;
   private String[] H026Z2_AV15BarDisNumfrom ;
   private String[] H026Z2_AV16BarDisNumto ;
   private int[] H026Z2_AV45CliCodfrom ;
   private int[] H026Z2_AV46CliCodto ;
   private byte[] H026Z2_AV34BarSitfrom ;
   private byte[] H026Z2_AV35BarSitto ;
   private java.util.Date[] H026Z2_AV23BarFecGenfrom ;
   private java.util.Date[] H026Z2_AV24BarFecGento ;
   private java.util.Date[] H026Z2_AV25BarFecSalfrom ;
   private java.util.Date[] H026Z2_AV26BarFecSalto ;
   private java.util.Date[] H026Z2_AV19BarFecClifrom ;
   private java.util.Date[] H026Z2_AV20BarFecClito ;
   private java.util.Date[] H026Z2_AV21BarFecFprfrom ;
   private java.util.Date[] H026Z2_AV22BarFecFprto ;
   private String[] H026Z2_ABarserfrom_svchar40_0 ;
   private String[] H026Z2_ABarserto_svchar40_0 ;
   private String[] H026Z2_ABarcolnomfrom_svchar40_0 ;
   private String[] H026Z2_ABarcolnomto_svchar40_0 ;
   private int[] H026Z2_ABarcolnumfrom_int8_0 ;
   private int[] H026Z2_ABarcolnumto_int8_0 ;
   private String[] H026Z2_ABarnomclifrom_svchar40_0 ;
   private String[] H026Z2_ABarnomclito_svchar40_0 ;
   private int[] H026Z2_ABarnumclifrom_int8_0 ;
   private int[] H026Z2_ABarnumclito_int8_0 ;
   private int[] H026Z2_ABartipartfrom_int8_0 ;
   private int[] H026Z2_ABartipartto_int8_0 ;
   private int[] H026Z2_AV5BarCodfrom ;
   private int[] H026Z2_AV10BarCodto ;
   private int[] H026Z2_ABarcodreofrom_int8_0 ;
   private int[] H026Z2_ABarcodreoto_int8_0 ;
   private String[] H026Z2_AV6BarCodParfrom ;
   private String[] H026Z2_AV7BarCodParto ;
   private String[] H026Z2_ACod_idtx_svchar40_0 ;
   private String[] H026Z2_ATfbarplf_svchar40_0 ;
   private String[] H026Z2_ABargirar_svchar40_0 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV86Messages ;
   private GXBaseCollection<app.SdtSDTCONPRO_Registro> AV96SDTCONPRO ;
   private com.genexus.SdtMessages_Message AV85Message ;
   private app.SdtSDTCONPRO_Registro AV196SDTCONPROItem ;
}

final  class consultaproduccioneo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new CallCursor("H026Z2", "{CALL pConsultaProduccion ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[38])[0] = rslt.getLongVarchar(39);
               ((String[]) buf[39])[0] = rslt.getVarchar(40);
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
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 39 , Types.CLOB );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 40 , Types.VARCHAR );
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setDate(14, (java.util.Date)parms[13]);
               stmt.setDate(15, (java.util.Date)parms[14]);
               stmt.setDate(16, (java.util.Date)parms[15]);
               stmt.setDate(17, (java.util.Date)parms[16]);
               stmt.setVarchar(18, (String)parms[17], 40);
               stmt.setVarchar(19, (String)parms[18], 40);
               stmt.setVarchar(20, (String)parms[19], 40);
               stmt.setVarchar(21, (String)parms[20], 40);
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setVarchar(24, (String)parms[23], 40);
               stmt.setVarchar(25, (String)parms[24], 40);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setInt(29, ((Number) parms[28]).intValue());
               stmt.setInt(30, ((Number) parms[29]).intValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setInt(33, ((Number) parms[32]).intValue());
               stmt.setString(34, (String)parms[33], 1);
               stmt.setString(35, (String)parms[34], 1);
               stmt.setVarchar(36, (String)parms[35], 40);
               stmt.setVarchar(37, (String)parms[36], 40);
               stmt.setVarchar(38, (String)parms[37], 40);
               return;
      }
   }

}

