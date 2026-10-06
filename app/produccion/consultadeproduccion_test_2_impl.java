package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_test_2_impl extends GXWebComponent
{
   public consultadeproduccion_test_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_test_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_test_2_impl.class ));
   }

   public consultadeproduccion_test_2_impl( int remoteHandle ,
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
               AV59Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
               AV56CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56CliCodfrom), 6, 0));
               AV57CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57CliCodto), 6, 0));
               AV35BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarDisNumfrom", AV35BarDisNumfrom);
               AV36BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarDisNumto", AV36BarDisNumto);
               AV41BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarFecGenfrom", localUtil.format(AV41BarFecGenfrom, "99/99/99"));
               AV42BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarFecGento", localUtil.format(AV42BarFecGento, "99/99/99"));
               AV52BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarSitfrom), 2, 0));
               AV53BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53BarSitto), 2, 0));
               AV37BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarFecClifrom", localUtil.format(AV37BarFecClifrom, "99/99/99"));
               AV38BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38BarFecClito", localUtil.format(AV38BarFecClito, "99/99/99"));
               AV39BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39BarFecFprfrom", localUtil.format(AV39BarFecFprfrom, "99/99/99"));
               AV40BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarFecFprto", localUtil.format(AV40BarFecFprto, "99/99/99"));
               AV43BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarFecSalfrom", localUtil.format(AV43BarFecSalfrom, "99/99/99"));
               AV44BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarFecSalto", localUtil.format(AV44BarFecSalto, "99/99/99"));
               AV50BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarSerfrom", AV50BarSerfrom);
               AV51BarSerto = httpContext.GetPar( "BarSerto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51BarSerto", AV51BarSerto);
               AV54BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarTipArtfrom), 4, 0));
               AV55BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarTipArtto), 4, 0));
               AV31BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarColNomfrom", AV31BarColNomfrom);
               AV32BarColNomto = httpContext.GetPar( "BarColNomto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarColNomto", AV32BarColNomto);
               AV33BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarColNumfrom), 6, 0));
               AV34BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarColNumto), 6, 0));
               AV46BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46BarNomClifrom", AV46BarNomClifrom);
               AV47BarNomClito = httpContext.GetPar( "BarNomClito") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarNomClito", AV47BarNomClito);
               AV48BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarNumClifrom), 6, 0));
               AV49BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarNumClito), 6, 0));
               AV54BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarTipArtfrom), 4, 0));
               AV55BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarTipArtto), 4, 0));
               AV61Muestras = CommonUtil.decimalVal( httpContext.GetPar( "Muestras"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Muestras", GXutil.ltrimstr( AV61Muestras, 10, 2));
               AV25BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCodfrom), 8, 0));
               AV30BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarCodto), 8, 0));
               AV28BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarCodReofrom", GXutil.str( AV28BarCodReofrom, 1, 0));
               AV29BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarCodReoto", GXutil.str( AV29BarCodReoto, 1, 0));
               AV26BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarCodParfrom", AV26BarCodParfrom);
               AV27BarCodParto = httpContext.GetPar( "BarCodParto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarCodParto", AV27BarCodParto);
               AV58Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Cod_Idtx", AV58Cod_Idtx);
               AV45BarGirar = httpContext.GetPar( "BarGirar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45BarGirar", AV45BarGirar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV59Emprcod,Integer.valueOf(AV56CliCodfrom),Integer.valueOf(AV57CliCodto),AV35BarDisNumfrom,AV36BarDisNumto,AV41BarFecGenfrom,AV42BarFecGento,Byte.valueOf(AV52BarSitfrom),Byte.valueOf(AV53BarSitto),AV37BarFecClifrom,AV38BarFecClito,AV39BarFecFprfrom,AV40BarFecFprto,AV43BarFecSalfrom,AV44BarFecSalto,AV50BarSerfrom,AV51BarSerto,Short.valueOf(AV54BarTipArtfrom),Short.valueOf(AV55BarTipArtto),AV31BarColNomfrom,AV32BarColNomto,Integer.valueOf(AV33BarColNumfrom),Integer.valueOf(AV34BarColNumto),AV46BarNomClifrom,AV47BarNomClito,Integer.valueOf(AV48BarNumClifrom),Integer.valueOf(AV49BarNumClito),Short.valueOf(AV54BarTipArtfrom),Short.valueOf(AV55BarTipArtto),AV61Muestras,Integer.valueOf(AV25BarCodfrom),Integer.valueOf(AV30BarCodto),Byte.valueOf(AV28BarCodReofrom),Byte.valueOf(AV29BarCodReoto),AV26BarCodParfrom,AV27BarCodParto,AV58Cod_Idtx,AV45BarGirar});
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
      nRC_GXsfl_37 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_37"))) ;
      nGXsfl_37_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_37_idx"))) ;
      sGXsfl_37_idx = httpContext.GetPar( "sGXsfl_37_idx") ;
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
      AV9FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV59Emprcod = httpContext.GetPar( "Emprcod") ;
      AV56CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
      AV57CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      AV35BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
      AV36BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
      AV41BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
      AV42BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
      AV52BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
      AV53BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
      AV37BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
      AV38BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
      AV39BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
      AV40BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
      AV43BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
      AV44BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
      AV50BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
      AV51BarSerto = httpContext.GetPar( "BarSerto") ;
      AV54BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
      AV55BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
      AV31BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
      AV32BarColNomto = httpContext.GetPar( "BarColNomto") ;
      AV33BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
      AV34BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
      AV46BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
      AV47BarNomClito = httpContext.GetPar( "BarNomClito") ;
      AV48BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
      AV49BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
      AV25BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
      AV30BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
      AV28BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
      AV29BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
      AV26BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
      AV27BarCodParto = httpContext.GetPar( "BarCodParto") ;
      AV58Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
      AV45BarGirar = httpContext.GetPar( "BarGirar") ;
      AV17ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5ColumnsSelector);
      AV64Pgmname = httpContext.GetPar( "Pgmname") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV9FilterFullText, AV59Emprcod, AV56CliCodfrom, AV57CliCodto, AV35BarDisNumfrom, AV36BarDisNumto, AV41BarFecGenfrom, AV42BarFecGento, AV52BarSitfrom, AV53BarSitto, AV37BarFecClifrom, AV38BarFecClito, AV39BarFecFprfrom, AV40BarFecFprto, AV43BarFecSalfrom, AV44BarFecSalto, AV50BarSerfrom, AV51BarSerto, AV54BarTipArtfrom, AV55BarTipArtto, AV31BarColNomfrom, AV32BarColNomto, AV33BarColNumfrom, AV34BarColNumto, AV46BarNomClifrom, AV47BarNomClito, AV48BarNumClifrom, AV49BarNumClito, AV25BarCodfrom, AV30BarCodto, AV28BarCodReofrom, AV29BarCodReoto, AV26BarCodParfrom, AV27BarCodParto, AV58Cod_Idtx, AV45BarGirar, AV17ManageFiltersExecutionStep, AV5ColumnsSelector, AV64Pgmname, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa26R2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento Hoja de Ruta", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.consultadeproduccion_test_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV59Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV56CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV35BarDisNumfrom)),GXutil.URLEncode(GXutil.rtrim(AV36BarDisNumto)),GXutil.URLEncode(GXutil.formatDateParm(AV41BarFecGenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV42BarFecGento)),GXutil.URLEncode(GXutil.ltrimstr(AV52BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53BarSitto,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV37BarFecClifrom)),GXutil.URLEncode(GXutil.formatDateParm(AV38BarFecClito)),GXutil.URLEncode(GXutil.formatDateParm(AV39BarFecFprfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV40BarFecFprto)),GXutil.URLEncode(GXutil.formatDateParm(AV43BarFecSalfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV44BarFecSalto)),GXutil.URLEncode(GXutil.rtrim(AV50BarSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV51BarSerto)),GXutil.URLEncode(GXutil.ltrimstr(AV54BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV31BarColNomfrom)),GXutil.URLEncode(GXutil.rtrim(AV32BarColNomto)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarColNumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarColNumto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV46BarNomClifrom)),GXutil.URLEncode(GXutil.rtrim(AV47BarNomClito)),GXutil.URLEncode(GXutil.ltrimstr(AV48BarNumClifrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarNumClito,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV54BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55BarTipArtto,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV61Muestras)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30BarCodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28BarCodReofrom,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29BarCodReoto,1,0)),GXutil.URLEncode(GXutil.rtrim(AV26BarCodParfrom)),GXutil.URLEncode(GXutil.rtrim(AV27BarCodParto)),GXutil.URLEncode(GXutil.rtrim(AV58Cod_Idtx)),GXutil.URLEncode(GXutil.rtrim(AV45BarGirar))}, new String[] {"Emprcod","CliCodfrom","CliCodto","BarDisNumfrom","BarDisNumto","BarFecGenfrom","BarFecGento","BarSitfrom","BarSitto","BarFecClifrom","BarFecClito","BarFecFprfrom","BarFecFprto","BarFecSalfrom","BarFecSalto","BarSerfrom","BarSerto","BarTipArtfrom","BarTipArtto","BarColNomfrom","BarColNomto","BarColNumfrom","BarColNumto","BarNomClifrom","BarNomClito","BarNumClifrom","BarNumClito","BarTipArtfrom","BarTipArtto","Muestras","BarCodfrom","BarCodto","BarCodReofrom","BarCodReoto","BarCodParfrom","BarCodParto","Cod_Idtx","BarGirar"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_Test_2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_test_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV9FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_37", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_37, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV16ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV16ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV10GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV11GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV8DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV8DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59Emprcod", GXutil.rtrim( wcpOAV59Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56CliCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV56CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57CliCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV57CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35BarDisNumfrom", GXutil.rtrim( wcpOAV35BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36BarDisNumto", GXutil.rtrim( wcpOAV36BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41BarFecGenfrom", localUtil.dtoc( wcpOAV41BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42BarFecGento", localUtil.dtoc( wcpOAV42BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV52BarSitfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV52BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53BarSitto", GXutil.ltrim( localUtil.ntoc( wcpOAV53BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37BarFecClifrom", localUtil.dtoc( wcpOAV37BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38BarFecClito", localUtil.dtoc( wcpOAV38BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39BarFecFprfrom", localUtil.dtoc( wcpOAV39BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40BarFecFprto", localUtil.dtoc( wcpOAV40BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43BarFecSalfrom", localUtil.dtoc( wcpOAV43BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44BarFecSalto", localUtil.dtoc( wcpOAV44BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50BarSerfrom", GXutil.rtrim( wcpOAV50BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51BarSerto", GXutil.rtrim( wcpOAV51BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54BarTipArtfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV54BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55BarTipArtto", GXutil.ltrim( localUtil.ntoc( wcpOAV55BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31BarColNomfrom", GXutil.rtrim( wcpOAV31BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32BarColNomto", GXutil.rtrim( wcpOAV32BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33BarColNumfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV33BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34BarColNumto", GXutil.ltrim( localUtil.ntoc( wcpOAV34BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46BarNomClifrom", GXutil.rtrim( wcpOAV46BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47BarNomClito", GXutil.rtrim( wcpOAV47BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48BarNumClifrom", GXutil.ltrim( localUtil.ntoc( wcpOAV48BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49BarNumClito", GXutil.ltrim( localUtil.ntoc( wcpOAV49BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61Muestras", GXutil.ltrim( localUtil.ntoc( wcpOAV61Muestras, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25BarCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV25BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30BarCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV30BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28BarCodReofrom", GXutil.ltrim( localUtil.ntoc( wcpOAV28BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29BarCodReoto", GXutil.ltrim( localUtil.ntoc( wcpOAV29BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26BarCodParfrom", GXutil.rtrim( wcpOAV26BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27BarCodParto", GXutil.rtrim( wcpOAV27BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58Cod_Idtx", GXutil.rtrim( wcpOAV58Cod_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45BarGirar", GXutil.rtrim( wcpOAV45BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV17ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV12GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV12GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV59Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV56CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV57CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMFROM", GXutil.rtrim( AV35BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMTO", GXutil.rtrim( AV36BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENFROM", localUtil.dtoc( AV41BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENTO", localUtil.dtoc( AV42BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV52BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV53BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLIFROM", localUtil.dtoc( AV37BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLITO", localUtil.dtoc( AV38BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRFROM", localUtil.dtoc( AV39BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRTO", localUtil.dtoc( AV40BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALFROM", localUtil.dtoc( AV43BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALTO", localUtil.dtoc( AV44BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERFROM", GXutil.rtrim( AV50BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERTO", GXutil.rtrim( AV51BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTFROM", GXutil.ltrim( localUtil.ntoc( AV54BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTTO", GXutil.ltrim( localUtil.ntoc( AV55BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMFROM", GXutil.rtrim( AV31BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMTO", GXutil.rtrim( AV32BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMFROM", GXutil.ltrim( localUtil.ntoc( AV33BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV34BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLIFROM", GXutil.rtrim( AV46BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLITO", GXutil.rtrim( AV47BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLIFROM", GXutil.ltrim( localUtil.ntoc( AV48BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLITO", GXutil.ltrim( localUtil.ntoc( AV49BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMUESTRAS", GXutil.ltrim( localUtil.ntoc( AV61Muestras, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODFROM", GXutil.ltrim( localUtil.ntoc( AV25BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODTO", GXutil.ltrim( localUtil.ntoc( AV30BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOFROM", GXutil.ltrim( localUtil.ntoc( AV28BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOTO", GXutil.ltrim( localUtil.ntoc( AV29BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARFROM", GXutil.rtrim( AV26BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARTO", GXutil.rtrim( AV27BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOD_IDTX", GXutil.rtrim( AV58Cod_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARGIRAR", GXutil.rtrim( AV45BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm26R2( )
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
      return "Produccion.ConsultadeProduccion_Test_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Hoja de Ruta", "") ;
   }

   public void wb26R0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.consultadeproduccion_test_2");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_Test_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_26R2( true) ;
      }
      else
      {
         wb_table1_19_26R2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_26R2e( boolean wbgen )
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
         startgridcontrol37( ) ;
      }
      if ( wbEnd == 37 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_37 = (int)(nGXsfl_37_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV10GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV11GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV64Pgmname), GXutil.rtrim( localUtil.format( AV64Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_Test_2.htm");
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
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV8DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV8DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV5ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 37 )
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

   public void start26R2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Hoja de Ruta", ""), (short)(0)) ;
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
            strup26R0( ) ;
         }
      }
   }

   public void ws26R2( )
   {
      start26R2( ) ;
      evt26R2( ) ;
   }

   public void evt26R2( )
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
                              strup26R0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1126R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1226R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1326R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1426R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26R0( ) ;
                           }
                           nGXsfl_37_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_372( ) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1526R2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1626R2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1726R2 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV9FilterFullText) != 0 )
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
                                    strup26R0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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

   public void we26R2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm26R2( ) ;
         }
      }
   }

   public void pa26R2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
      subsflControlProps_372( ) ;
      while ( nGXsfl_37_idx <= nRC_GXsfl_37 )
      {
         sendrow_372( ) ;
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV9FilterFullText ,
                                 String AV59Emprcod ,
                                 int AV56CliCodfrom ,
                                 int AV57CliCodto ,
                                 String AV35BarDisNumfrom ,
                                 String AV36BarDisNumto ,
                                 java.util.Date AV41BarFecGenfrom ,
                                 java.util.Date AV42BarFecGento ,
                                 byte AV52BarSitfrom ,
                                 byte AV53BarSitto ,
                                 java.util.Date AV37BarFecClifrom ,
                                 java.util.Date AV38BarFecClito ,
                                 java.util.Date AV39BarFecFprfrom ,
                                 java.util.Date AV40BarFecFprto ,
                                 java.util.Date AV43BarFecSalfrom ,
                                 java.util.Date AV44BarFecSalto ,
                                 String AV50BarSerfrom ,
                                 String AV51BarSerto ,
                                 short AV54BarTipArtfrom ,
                                 short AV55BarTipArtto ,
                                 String AV31BarColNomfrom ,
                                 String AV32BarColNomto ,
                                 int AV33BarColNumfrom ,
                                 int AV34BarColNumto ,
                                 String AV46BarNomClifrom ,
                                 String AV47BarNomClito ,
                                 int AV48BarNumClifrom ,
                                 int AV49BarNumClito ,
                                 int AV25BarCodfrom ,
                                 int AV30BarCodto ,
                                 byte AV28BarCodReofrom ,
                                 byte AV29BarCodReoto ,
                                 String AV26BarCodParfrom ,
                                 String AV27BarCodParto ,
                                 String AV58Cod_Idtx ,
                                 String AV45BarGirar ,
                                 byte AV17ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ,
                                 String AV64Pgmname ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1626R2 ();
      GRID_nCurrentRecord = 0 ;
      rf26R2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_Test_2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_test_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf26R2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV64Pgmname = "Produccion.ConsultadeProduccion_Test_2" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26R2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(37) ;
      /* Execute user event: Refresh */
      e1626R2 ();
      nGXsfl_37_idx = 1 ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_372( ) ;
      bGXsfl_37_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_372( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext ,
                                              AV35BarDisNumfrom ,
                                              AV36BarDisNumto ,
                                              Integer.valueOf(AV56CliCodfrom) ,
                                              Integer.valueOf(AV57CliCodto) ,
                                              Byte.valueOf(AV52BarSitfrom) ,
                                              Byte.valueOf(AV53BarSitto) ,
                                              AV41BarFecGenfrom ,
                                              AV42BarFecGento ,
                                              AV43BarFecSalfrom ,
                                              AV44BarFecSalto ,
                                              AV37BarFecClifrom ,
                                              AV38BarFecClito ,
                                              AV39BarFecFprfrom ,
                                              AV40BarFecFprto ,
                                              AV50BarSerfrom ,
                                              AV51BarSerto ,
                                              AV31BarColNomfrom ,
                                              AV32BarColNomto ,
                                              Integer.valueOf(AV33BarColNumfrom) ,
                                              Integer.valueOf(AV34BarColNumto) ,
                                              AV46BarNomClifrom ,
                                              AV47BarNomClito ,
                                              Integer.valueOf(AV48BarNumClifrom) ,
                                              Integer.valueOf(AV49BarNumClito) ,
                                              Short.valueOf(AV54BarTipArtfrom) ,
                                              Short.valueOf(AV55BarTipArtto) ,
                                              AV60TFBarPlf ,
                                              Integer.valueOf(AV25BarCodfrom) ,
                                              Integer.valueOf(AV30BarCodto) ,
                                              Byte.valueOf(AV28BarCodReofrom) ,
                                              Byte.valueOf(AV29BarCodReoto) ,
                                              AV26BarCodParfrom ,
                                              AV27BarCodParto ,
                                              AV58Cod_Idtx ,
                                              AV45BarGirar ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A143BarDisNum ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Byte.valueOf(A213BarSit) ,
                                              A159BarFecGen ,
                                              A161BarFecSal ,
                                              A155BarFecCli ,
                                              A158BarFecFpr ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              Integer.valueOf(A1235BarNumCli) ,
                                              Short.valueOf(A217BarTipArt) ,
                                              A3030BarPlf ,
                                              A2829BarProPer ,
                                              A2454BarGirar ,
                                              AV59Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext), "%", "") ;
         lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext), "%", "") ;
         lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext), "%", "") ;
         lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext), "%", "") ;
         /* Using cursor H026R2 */
         pr_default.execute(0, new Object[] {AV59Emprcod, lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext, lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext, lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext, lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext, AV35BarDisNumfrom, AV36BarDisNumto, Integer.valueOf(AV56CliCodfrom), Integer.valueOf(AV57CliCodto), Byte.valueOf(AV52BarSitfrom), Byte.valueOf(AV53BarSitto), AV41BarFecGenfrom, AV42BarFecGento, AV43BarFecSalfrom, AV44BarFecSalto, AV37BarFecClifrom, AV38BarFecClito, AV39BarFecFprfrom, AV40BarFecFprto, AV50BarSerfrom, AV51BarSerto, AV31BarColNomfrom, AV32BarColNomto, Integer.valueOf(AV33BarColNumfrom), Integer.valueOf(AV34BarColNumto), AV46BarNomClifrom, AV47BarNomClito, Integer.valueOf(AV48BarNumClifrom), Integer.valueOf(AV49BarNumClito), Short.valueOf(AV54BarTipArtfrom), Short.valueOf(AV55BarTipArtto), AV60TFBarPlf, Integer.valueOf(AV25BarCodfrom), Integer.valueOf(AV30BarCodto), Byte.valueOf(AV28BarCodReofrom), Byte.valueOf(AV29BarCodReoto), AV26BarCodParfrom, AV27BarCodParto, AV58Cod_Idtx, AV45BarGirar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_37_idx = 1 ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H026R2_A396EmprCod[0] ;
            A2454BarGirar = H026R2_A2454BarGirar[0] ;
            A2829BarProPer = H026R2_A2829BarProPer[0] ;
            A3030BarPlf = H026R2_A3030BarPlf[0] ;
            A217BarTipArt = H026R2_A217BarTipArt[0] ;
            n217BarTipArt = H026R2_n217BarTipArt[0] ;
            A1235BarNumCli = H026R2_A1235BarNumCli[0] ;
            A1234BarNomCli = H026R2_A1234BarNomCli[0] ;
            A136BarColNum = H026R2_A136BarColNum[0] ;
            A135BarColNom = H026R2_A135BarColNom[0] ;
            A212BarSer = H026R2_A212BarSer[0] ;
            A158BarFecFpr = H026R2_A158BarFecFpr[0] ;
            A155BarFecCli = H026R2_A155BarFecCli[0] ;
            A161BarFecSal = H026R2_A161BarFecSal[0] ;
            A213BarSit = H026R2_A213BarSit[0] ;
            A159BarFecGen = H026R2_A159BarFecGen[0] ;
            A143BarDisNum = H026R2_A143BarDisNum[0] ;
            A279CliNom = H026R2_A279CliNom[0] ;
            A252CliCod = H026R2_A252CliCod[0] ;
            n252CliCod = H026R2_n252CliCod[0] ;
            A130BarCodPar = H026R2_A130BarCodPar[0] ;
            A132BarCodReo = H026R2_A132BarCodReo[0] ;
            A129BarCod = H026R2_A129BarCod[0] ;
            A279CliNom = H026R2_A279CliNom[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e1726R2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(37) ;
         wb26R0( ) ;
      }
      bGXsfl_37_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26R2( )
   {
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
      AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = AV9FilterFullText ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext ,
                                           AV35BarDisNumfrom ,
                                           AV36BarDisNumto ,
                                           Integer.valueOf(AV56CliCodfrom) ,
                                           Integer.valueOf(AV57CliCodto) ,
                                           Byte.valueOf(AV52BarSitfrom) ,
                                           Byte.valueOf(AV53BarSitto) ,
                                           AV41BarFecGenfrom ,
                                           AV42BarFecGento ,
                                           AV43BarFecSalfrom ,
                                           AV44BarFecSalto ,
                                           AV37BarFecClifrom ,
                                           AV38BarFecClito ,
                                           AV39BarFecFprfrom ,
                                           AV40BarFecFprto ,
                                           AV50BarSerfrom ,
                                           AV51BarSerto ,
                                           AV31BarColNomfrom ,
                                           AV32BarColNomto ,
                                           Integer.valueOf(AV33BarColNumfrom) ,
                                           Integer.valueOf(AV34BarColNumto) ,
                                           AV46BarNomClifrom ,
                                           AV47BarNomClito ,
                                           Integer.valueOf(AV48BarNumClifrom) ,
                                           Integer.valueOf(AV49BarNumClito) ,
                                           Short.valueOf(AV54BarTipArtfrom) ,
                                           Short.valueOf(AV55BarTipArtto) ,
                                           AV60TFBarPlf ,
                                           Integer.valueOf(AV25BarCodfrom) ,
                                           Integer.valueOf(AV30BarCodto) ,
                                           Byte.valueOf(AV28BarCodReofrom) ,
                                           Byte.valueOf(AV29BarCodReoto) ,
                                           AV26BarCodParfrom ,
                                           AV27BarCodParto ,
                                           AV58Cod_Idtx ,
                                           AV45BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A3030BarPlf ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           AV59Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext), "%", "") ;
      lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext), "%", "") ;
      lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext), "%", "") ;
      lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext), "%", "") ;
      /* Using cursor H026R3 */
      pr_default.execute(1, new Object[] {AV59Emprcod, lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext, lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext, lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext, lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext, AV35BarDisNumfrom, AV36BarDisNumto, Integer.valueOf(AV56CliCodfrom), Integer.valueOf(AV57CliCodto), Byte.valueOf(AV52BarSitfrom), Byte.valueOf(AV53BarSitto), AV41BarFecGenfrom, AV42BarFecGento, AV43BarFecSalfrom, AV44BarFecSalto, AV37BarFecClifrom, AV38BarFecClito, AV39BarFecFprfrom, AV40BarFecFprto, AV50BarSerfrom, AV51BarSerto, AV31BarColNomfrom, AV32BarColNomto, Integer.valueOf(AV33BarColNumfrom), Integer.valueOf(AV34BarColNumto), AV46BarNomClifrom, AV47BarNomClito, Integer.valueOf(AV48BarNumClifrom), Integer.valueOf(AV49BarNumClito), Short.valueOf(AV54BarTipArtfrom), Short.valueOf(AV55BarTipArtto), AV60TFBarPlf, Integer.valueOf(AV25BarCodfrom), Integer.valueOf(AV30BarCodto), Byte.valueOf(AV28BarCodReofrom), Byte.valueOf(AV29BarCodReoto), AV26BarCodParfrom, AV27BarCodParto, AV58Cod_Idtx, AV45BarGirar});
      GRID_nRecordCount = H026R3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
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
      AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = AV9FilterFullText ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9FilterFullText, AV59Emprcod, AV56CliCodfrom, AV57CliCodto, AV35BarDisNumfrom, AV36BarDisNumto, AV41BarFecGenfrom, AV42BarFecGento, AV52BarSitfrom, AV53BarSitto, AV37BarFecClifrom, AV38BarFecClito, AV39BarFecFprfrom, AV40BarFecFprto, AV43BarFecSalfrom, AV44BarFecSalto, AV50BarSerfrom, AV51BarSerto, AV54BarTipArtfrom, AV55BarTipArtto, AV31BarColNomfrom, AV32BarColNomto, AV33BarColNumfrom, AV34BarColNumto, AV46BarNomClifrom, AV47BarNomClito, AV48BarNumClifrom, AV49BarNumClito, AV25BarCodfrom, AV30BarCodto, AV28BarCodReofrom, AV29BarCodReoto, AV26BarCodParfrom, AV27BarCodParto, AV58Cod_Idtx, AV45BarGirar, AV17ManageFiltersExecutionStep, AV5ColumnsSelector, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = AV9FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9FilterFullText, AV59Emprcod, AV56CliCodfrom, AV57CliCodto, AV35BarDisNumfrom, AV36BarDisNumto, AV41BarFecGenfrom, AV42BarFecGento, AV52BarSitfrom, AV53BarSitto, AV37BarFecClifrom, AV38BarFecClito, AV39BarFecFprfrom, AV40BarFecFprto, AV43BarFecSalfrom, AV44BarFecSalto, AV50BarSerfrom, AV51BarSerto, AV54BarTipArtfrom, AV55BarTipArtto, AV31BarColNomfrom, AV32BarColNomto, AV33BarColNumfrom, AV34BarColNumto, AV46BarNomClifrom, AV47BarNomClito, AV48BarNumClifrom, AV49BarNumClito, AV25BarCodfrom, AV30BarCodto, AV28BarCodReofrom, AV29BarCodReoto, AV26BarCodParfrom, AV27BarCodParto, AV58Cod_Idtx, AV45BarGirar, AV17ManageFiltersExecutionStep, AV5ColumnsSelector, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = AV9FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9FilterFullText, AV59Emprcod, AV56CliCodfrom, AV57CliCodto, AV35BarDisNumfrom, AV36BarDisNumto, AV41BarFecGenfrom, AV42BarFecGento, AV52BarSitfrom, AV53BarSitto, AV37BarFecClifrom, AV38BarFecClito, AV39BarFecFprfrom, AV40BarFecFprto, AV43BarFecSalfrom, AV44BarFecSalto, AV50BarSerfrom, AV51BarSerto, AV54BarTipArtfrom, AV55BarTipArtto, AV31BarColNomfrom, AV32BarColNomto, AV33BarColNumfrom, AV34BarColNumto, AV46BarNomClifrom, AV47BarNomClito, AV48BarNumClifrom, AV49BarNumClito, AV25BarCodfrom, AV30BarCodto, AV28BarCodReofrom, AV29BarCodReoto, AV26BarCodParfrom, AV27BarCodParto, AV58Cod_Idtx, AV45BarGirar, AV17ManageFiltersExecutionStep, AV5ColumnsSelector, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = AV9FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9FilterFullText, AV59Emprcod, AV56CliCodfrom, AV57CliCodto, AV35BarDisNumfrom, AV36BarDisNumto, AV41BarFecGenfrom, AV42BarFecGento, AV52BarSitfrom, AV53BarSitto, AV37BarFecClifrom, AV38BarFecClito, AV39BarFecFprfrom, AV40BarFecFprto, AV43BarFecSalfrom, AV44BarFecSalto, AV50BarSerfrom, AV51BarSerto, AV54BarTipArtfrom, AV55BarTipArtto, AV31BarColNomfrom, AV32BarColNomto, AV33BarColNumfrom, AV34BarColNumto, AV46BarNomClifrom, AV47BarNomClito, AV48BarNumClifrom, AV49BarNumClito, AV25BarCodfrom, AV30BarCodto, AV28BarCodReofrom, AV29BarCodReoto, AV26BarCodParfrom, AV27BarCodParto, AV58Cod_Idtx, AV45BarGirar, AV17ManageFiltersExecutionStep, AV5ColumnsSelector, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = AV9FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9FilterFullText, AV59Emprcod, AV56CliCodfrom, AV57CliCodto, AV35BarDisNumfrom, AV36BarDisNumto, AV41BarFecGenfrom, AV42BarFecGento, AV52BarSitfrom, AV53BarSitto, AV37BarFecClifrom, AV38BarFecClito, AV39BarFecFprfrom, AV40BarFecFprto, AV43BarFecSalfrom, AV44BarFecSalto, AV50BarSerfrom, AV51BarSerto, AV54BarTipArtfrom, AV55BarTipArtto, AV31BarColNomfrom, AV32BarColNomto, AV33BarColNumfrom, AV34BarColNumto, AV46BarNomClifrom, AV47BarNomClito, AV48BarNumClifrom, AV49BarNumClito, AV25BarCodfrom, AV30BarCodto, AV28BarCodReofrom, AV29BarCodReoto, AV26BarCodParfrom, AV27BarCodParto, AV58Cod_Idtx, AV45BarGirar, AV17ManageFiltersExecutionStep, AV5ColumnsSelector, AV64Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV64Pgmname = "Produccion.ConsultadeProduccion_Test_2" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26R0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1526R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV16ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV8DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV5ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV10GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV11GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV59Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV59Emprcod") ;
         wcpOAV56CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV57CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV35BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV35BarDisNumfrom") ;
         wcpOAV36BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV36BarDisNumto") ;
         wcpOAV41BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV41BarFecGenfrom"), 0) ;
         wcpOAV42BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42BarFecGento"), 0) ;
         wcpOAV52BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV53BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV37BarFecClifrom"), 0) ;
         wcpOAV38BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV38BarFecClito"), 0) ;
         wcpOAV39BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV39BarFecFprfrom"), 0) ;
         wcpOAV40BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV40BarFecFprto"), 0) ;
         wcpOAV43BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV43BarFecSalfrom"), 0) ;
         wcpOAV44BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV44BarFecSalto"), 0) ;
         wcpOAV50BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV50BarSerfrom") ;
         wcpOAV51BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV51BarSerto") ;
         wcpOAV54BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV55BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV31BarColNomfrom") ;
         wcpOAV32BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV32BarColNomto") ;
         wcpOAV33BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV46BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV46BarNomClifrom") ;
         wcpOAV47BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV47BarNomClito") ;
         wcpOAV48BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV49BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV61Muestras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV61Muestras")) ;
         wcpOAV25BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV30BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV28BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV26BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV26BarCodParfrom") ;
         wcpOAV27BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV27BarCodParto") ;
         wcpOAV58Cod_Idtx = httpContext.cgiGet( sPrefix+"wcpOAV58Cod_Idtx") ;
         wcpOAV45BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV45BarGirar") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
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
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV9FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9FilterFullText", AV9FilterFullText);
         AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_Test_2");
         AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\consultadeproduccion_test_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV9FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e1526R2 ();
      if (returnInSub) return;
   }

   public void e1526R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV65Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadeproduccion_test_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV65Station = GXt_char1 ;
      GXv_char2[0] = AV59Emprcod ;
      GXv_char3[0] = AV66Emprnom ;
      GXv_char4[0] = AV67Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV65Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadeproduccion_test_2_impl.this.AV59Emprcod = GXv_char2[0] ;
      consultadeproduccion_test_2_impl.this.AV66Emprnom = GXv_char3[0] ;
      consultadeproduccion_test_2_impl.this.AV67Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV8DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV8DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1626R2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV24WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV24WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV17ManageFiltersExecutionStep == 1 )
      {
         AV17ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ManageFiltersExecutionStep", GXutil.str( AV17ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV17ManageFiltersExecutionStep == 2 )
      {
         AV17ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ManageFiltersExecutionStep", GXutil.str( AV17ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("Produccion.ConsultadeProduccion_Test_2ColumnsSelector"), "") != 0 )
      {
         AV7ColumnsSelectorXML = AV20Session.getValue("Produccion.ConsultadeProduccion_Test_2ColumnsSelector") ;
         AV5ColumnsSelector.fromxml(AV7ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtBarDisNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarDisNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_37_Refreshing);
      AV10GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridCurrentPage), 10, 0));
      AV11GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11GridPageCount), 10, 0));
      AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = AV9FilterFullText ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ManageFiltersData", AV16ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void e1226R2( )
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
         AV19PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV19PageToGo) ;
      }
   }

   public void e1326R2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1726R2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(37) ;
      }
      sendrow_372( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_37_Refreshing )
      {
         httpContext.doAjaxLoad(37, GridRow);
      }
   }

   public void e1426R2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV7ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV5ColumnsSelector.fromJSonString(AV7ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_Test_2ColumnsSelector", ((GXutil.strcmp("", AV7ColumnsSelectorXML)==0) ? "" : AV5ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ManageFiltersData", AV16ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void e1126R2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S142 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.ConsultadeProduccion_Test_2Filters")),GXutil.URLEncode(GXutil.rtrim(AV64Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV17ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ManageFiltersExecutionStep", GXutil.str( AV17ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.ConsultadeProduccion_Test_2Filters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV17ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ManageFiltersExecutionStep", GXutil.str( AV17ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV18ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_Test_2Filters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         consultadeproduccion_test_2_impl.this.GXt_char1 = GXv_char4[0] ;
         AV18ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV18ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV64Pgmname+"GridState", AV18ManageFiltersXml) ;
            AV12GridState.fromxml(AV18ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ManageFiltersData", AV16ManageFiltersData);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV5ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarDisNum", "", "Ped.  Cli.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNHdr", "", "N° Hdr", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_Test_2ColumnsSelector", GXv_char4) ;
      consultadeproduccion_test_2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV6ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV5ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV6ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV5ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV16ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_Test_2Filters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV16ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV9FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9FilterFullText", AV9FilterFullText);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV64Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV64Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV20Session.getValue(AV64Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV12GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV12GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV12GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV9FilterFullText = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9FilterFullText", AV9FilterFullText);
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV20Session.getValue(AV64Pgmname+"GridState"), null, null);
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV9FilterFullText)==0), (short)(0), AV9FilterFullText, "") ;
      AV12GridState = GXv_SdtWWPGridState12[0] ;
      AV12GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV12GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV64Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV21TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV21TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV64Pgmname );
      AV21TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV21TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV14HTTPRequest.getScriptName()+"?"+AV14HTTPRequest.getQuerystring() );
      AV21TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.HojadeRuta_TRN" );
      AV20Session.setValue("TrnContext", AV21TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_19_26R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV16ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_24_26R2( true) ;
      }
      else
      {
         wb_table2_24_26R2( false) ;
      }
      return  ;
   }

   public void wb_table2_24_26R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_26R2e( true) ;
      }
      else
      {
         wb_table1_19_26R2e( false) ;
      }
   }

   public void wb_table2_24_26R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV9FilterFullText, GXutil.rtrim( localUtil.format( AV9FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_Test_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_24_26R2e( true) ;
      }
      else
      {
         wb_table2_24_26R2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV59Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      AV56CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56CliCodfrom), 6, 0));
      AV57CliCodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57CliCodto), 6, 0));
      AV35BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarDisNumfrom", AV35BarDisNumfrom);
      AV36BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarDisNumto", AV36BarDisNumto);
      AV41BarFecGenfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarFecGenfrom", localUtil.format(AV41BarFecGenfrom, "99/99/99"));
      AV42BarFecGento = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarFecGento", localUtil.format(AV42BarFecGento, "99/99/99"));
      AV52BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarSitfrom), 2, 0));
      AV53BarSitto = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53BarSitto), 2, 0));
      AV37BarFecClifrom = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarFecClifrom", localUtil.format(AV37BarFecClifrom, "99/99/99"));
      AV38BarFecClito = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38BarFecClito", localUtil.format(AV38BarFecClito, "99/99/99"));
      AV39BarFecFprfrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39BarFecFprfrom", localUtil.format(AV39BarFecFprfrom, "99/99/99"));
      AV40BarFecFprto = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarFecFprto", localUtil.format(AV40BarFecFprto, "99/99/99"));
      AV43BarFecSalfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarFecSalfrom", localUtil.format(AV43BarFecSalfrom, "99/99/99"));
      AV44BarFecSalto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarFecSalto", localUtil.format(AV44BarFecSalto, "99/99/99"));
      AV50BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarSerfrom", AV50BarSerfrom);
      AV51BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51BarSerto", AV51BarSerto);
      AV54BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarTipArtfrom), 4, 0));
      AV55BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarTipArtto), 4, 0));
      AV31BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarColNomfrom", AV31BarColNomfrom);
      AV32BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarColNomto", AV32BarColNomto);
      AV33BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarColNumfrom), 6, 0));
      AV34BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarColNumto), 6, 0));
      AV46BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46BarNomClifrom", AV46BarNomClifrom);
      AV47BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarNomClito", AV47BarNomClito);
      AV48BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,25,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarNumClifrom), 6, 0));
      AV49BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,26,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarNumClito), 6, 0));
      AV54BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarTipArtfrom), 4, 0));
      AV55BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarTipArtto), 4, 0));
      AV61Muestras = (java.math.BigDecimal)getParm(obj,29,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Muestras", GXutil.ltrimstr( AV61Muestras, 10, 2));
      AV25BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,30,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCodfrom), 8, 0));
      AV30BarCodto = ((Number) GXutil.testNumericType( getParm(obj,31,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarCodto), 8, 0));
      AV28BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarCodReofrom", GXutil.str( AV28BarCodReofrom, 1, 0));
      AV29BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarCodReoto", GXutil.str( AV29BarCodReoto, 1, 0));
      AV26BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarCodParfrom", AV26BarCodParfrom);
      AV27BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarCodParto", AV27BarCodParto);
      AV58Cod_Idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Cod_Idtx", AV58Cod_Idtx);
      AV45BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45BarGirar", AV45BarGirar);
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
      pa26R2( ) ;
      ws26R2( ) ;
      we26R2( ) ;
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
      sCtrlAV59Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV56CliCodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV57CliCodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV35BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV36BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV41BarFecGenfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV42BarFecGento = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV52BarSitfrom = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV53BarSitto = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV37BarFecClifrom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV38BarFecClito = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV39BarFecFprfrom = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV40BarFecFprto = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV43BarFecSalfrom = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV44BarFecSalto = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV50BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV51BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV54BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV55BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV31BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV32BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV33BarColNumfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
      sCtrlAV34BarColNumto = (String)getParm(obj,22,TypeConstants.STRING) ;
      sCtrlAV46BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      sCtrlAV47BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      sCtrlAV48BarNumClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
      sCtrlAV49BarNumClito = (String)getParm(obj,26,TypeConstants.STRING) ;
      sCtrlAV54BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV55BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV61Muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      sCtrlAV25BarCodfrom = (String)getParm(obj,30,TypeConstants.STRING) ;
      sCtrlAV30BarCodto = (String)getParm(obj,31,TypeConstants.STRING) ;
      sCtrlAV28BarCodReofrom = (String)getParm(obj,32,TypeConstants.STRING) ;
      sCtrlAV29BarCodReoto = (String)getParm(obj,33,TypeConstants.STRING) ;
      sCtrlAV26BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      sCtrlAV27BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      sCtrlAV58Cod_Idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      sCtrlAV45BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa26R2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\consultadeproduccion_test_2", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa26R2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV59Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
         AV56CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56CliCodfrom), 6, 0));
         AV57CliCodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57CliCodto), 6, 0));
         AV35BarDisNumfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarDisNumfrom", AV35BarDisNumfrom);
         AV36BarDisNumto = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarDisNumto", AV36BarDisNumto);
         AV41BarFecGenfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarFecGenfrom", localUtil.format(AV41BarFecGenfrom, "99/99/99"));
         AV42BarFecGento = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarFecGento", localUtil.format(AV42BarFecGento, "99/99/99"));
         AV52BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarSitfrom), 2, 0));
         AV53BarSitto = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53BarSitto), 2, 0));
         AV37BarFecClifrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarFecClifrom", localUtil.format(AV37BarFecClifrom, "99/99/99"));
         AV38BarFecClito = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38BarFecClito", localUtil.format(AV38BarFecClito, "99/99/99"));
         AV39BarFecFprfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39BarFecFprfrom", localUtil.format(AV39BarFecFprfrom, "99/99/99"));
         AV40BarFecFprto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarFecFprto", localUtil.format(AV40BarFecFprto, "99/99/99"));
         AV43BarFecSalfrom = (java.util.Date)getParm(obj,15,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarFecSalfrom", localUtil.format(AV43BarFecSalfrom, "99/99/99"));
         AV44BarFecSalto = (java.util.Date)getParm(obj,16,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarFecSalto", localUtil.format(AV44BarFecSalto, "99/99/99"));
         AV50BarSerfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarSerfrom", AV50BarSerfrom);
         AV51BarSerto = (String)getParm(obj,18,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51BarSerto", AV51BarSerto);
         AV54BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarTipArtfrom), 4, 0));
         AV55BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarTipArtto), 4, 0));
         AV31BarColNomfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarColNomfrom", AV31BarColNomfrom);
         AV32BarColNomto = (String)getParm(obj,22,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarColNomto", AV32BarColNomto);
         AV33BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarColNumfrom), 6, 0));
         AV34BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,24,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarColNumto), 6, 0));
         AV46BarNomClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46BarNomClifrom", AV46BarNomClifrom);
         AV47BarNomClito = (String)getParm(obj,26,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarNomClito", AV47BarNomClito);
         AV48BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,27,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarNumClifrom), 6, 0));
         AV49BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,28,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarNumClito), 6, 0));
         AV54BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarTipArtfrom), 4, 0));
         AV55BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarTipArtto), 4, 0));
         AV61Muestras = (java.math.BigDecimal)getParm(obj,31,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Muestras", GXutil.ltrimstr( AV61Muestras, 10, 2));
         AV25BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCodfrom), 8, 0));
         AV30BarCodto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarCodto), 8, 0));
         AV28BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,34,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarCodReofrom", GXutil.str( AV28BarCodReofrom, 1, 0));
         AV29BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,35,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarCodReoto", GXutil.str( AV29BarCodReoto, 1, 0));
         AV26BarCodParfrom = (String)getParm(obj,36,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarCodParfrom", AV26BarCodParfrom);
         AV27BarCodParto = (String)getParm(obj,37,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarCodParto", AV27BarCodParto);
         AV58Cod_Idtx = (String)getParm(obj,38,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Cod_Idtx", AV58Cod_Idtx);
         AV45BarGirar = (String)getParm(obj,39,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45BarGirar", AV45BarGirar);
      }
      wcpOAV59Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV59Emprcod") ;
      wcpOAV56CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV57CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV35BarDisNumfrom") ;
      wcpOAV36BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV36BarDisNumto") ;
      wcpOAV41BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV41BarFecGenfrom"), 0) ;
      wcpOAV42BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42BarFecGento"), 0) ;
      wcpOAV52BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV53BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV37BarFecClifrom"), 0) ;
      wcpOAV38BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV38BarFecClito"), 0) ;
      wcpOAV39BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV39BarFecFprfrom"), 0) ;
      wcpOAV40BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV40BarFecFprto"), 0) ;
      wcpOAV43BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV43BarFecSalfrom"), 0) ;
      wcpOAV44BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV44BarFecSalto"), 0) ;
      wcpOAV50BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV50BarSerfrom") ;
      wcpOAV51BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV51BarSerto") ;
      wcpOAV54BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV55BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV31BarColNomfrom") ;
      wcpOAV32BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV32BarColNomto") ;
      wcpOAV33BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV46BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV46BarNomClifrom") ;
      wcpOAV47BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV47BarNomClito") ;
      wcpOAV48BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV49BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV61Muestras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV61Muestras")) ;
      wcpOAV25BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV30BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV28BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV26BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV26BarCodParfrom") ;
      wcpOAV27BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV27BarCodParto") ;
      wcpOAV58Cod_Idtx = httpContext.cgiGet( sPrefix+"wcpOAV58Cod_Idtx") ;
      wcpOAV45BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV45BarGirar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV59Emprcod, wcpOAV59Emprcod) != 0 ) || ( AV56CliCodfrom != wcpOAV56CliCodfrom ) || ( AV57CliCodto != wcpOAV57CliCodto ) || ( GXutil.strcmp(AV35BarDisNumfrom, wcpOAV35BarDisNumfrom) != 0 ) || ( GXutil.strcmp(AV36BarDisNumto, wcpOAV36BarDisNumto) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV41BarFecGenfrom), GXutil.resetTime(wcpOAV41BarFecGenfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV42BarFecGento), GXutil.resetTime(wcpOAV42BarFecGento)) ) || ( AV52BarSitfrom != wcpOAV52BarSitfrom ) || ( AV53BarSitto != wcpOAV53BarSitto ) || !( GXutil.dateCompare(GXutil.resetTime(AV37BarFecClifrom), GXutil.resetTime(wcpOAV37BarFecClifrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV38BarFecClito), GXutil.resetTime(wcpOAV38BarFecClito)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV39BarFecFprfrom), GXutil.resetTime(wcpOAV39BarFecFprfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV40BarFecFprto), GXutil.resetTime(wcpOAV40BarFecFprto)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV43BarFecSalfrom), GXutil.resetTime(wcpOAV43BarFecSalfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV44BarFecSalto), GXutil.resetTime(wcpOAV44BarFecSalto)) ) || ( GXutil.strcmp(AV50BarSerfrom, wcpOAV50BarSerfrom) != 0 ) || ( GXutil.strcmp(AV51BarSerto, wcpOAV51BarSerto) != 0 ) || ( AV54BarTipArtfrom != wcpOAV54BarTipArtfrom ) || ( AV55BarTipArtto != wcpOAV55BarTipArtto ) || ( GXutil.strcmp(AV31BarColNomfrom, wcpOAV31BarColNomfrom) != 0 ) || ( GXutil.strcmp(AV32BarColNomto, wcpOAV32BarColNomto) != 0 ) || ( AV33BarColNumfrom != wcpOAV33BarColNumfrom ) || ( AV34BarColNumto != wcpOAV34BarColNumto ) || ( GXutil.strcmp(AV46BarNomClifrom, wcpOAV46BarNomClifrom) != 0 ) || ( GXutil.strcmp(AV47BarNomClito, wcpOAV47BarNomClito) != 0 ) || ( AV48BarNumClifrom != wcpOAV48BarNumClifrom ) || ( AV49BarNumClito != wcpOAV49BarNumClito ) || ( DecimalUtil.compareTo(AV61Muestras, wcpOAV61Muestras) != 0 ) || ( AV25BarCodfrom != wcpOAV25BarCodfrom ) || ( AV30BarCodto != wcpOAV30BarCodto ) || ( AV28BarCodReofrom != wcpOAV28BarCodReofrom ) || ( AV29BarCodReoto != wcpOAV29BarCodReoto ) || ( GXutil.strcmp(AV26BarCodParfrom, wcpOAV26BarCodParfrom) != 0 ) || ( GXutil.strcmp(AV27BarCodParto, wcpOAV27BarCodParto) != 0 ) || ( GXutil.strcmp(AV58Cod_Idtx, wcpOAV58Cod_Idtx) != 0 ) || ( GXutil.strcmp(AV45BarGirar, wcpOAV45BarGirar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV59Emprcod = AV59Emprcod ;
      wcpOAV56CliCodfrom = AV56CliCodfrom ;
      wcpOAV57CliCodto = AV57CliCodto ;
      wcpOAV35BarDisNumfrom = AV35BarDisNumfrom ;
      wcpOAV36BarDisNumto = AV36BarDisNumto ;
      wcpOAV41BarFecGenfrom = AV41BarFecGenfrom ;
      wcpOAV42BarFecGento = AV42BarFecGento ;
      wcpOAV52BarSitfrom = AV52BarSitfrom ;
      wcpOAV53BarSitto = AV53BarSitto ;
      wcpOAV37BarFecClifrom = AV37BarFecClifrom ;
      wcpOAV38BarFecClito = AV38BarFecClito ;
      wcpOAV39BarFecFprfrom = AV39BarFecFprfrom ;
      wcpOAV40BarFecFprto = AV40BarFecFprto ;
      wcpOAV43BarFecSalfrom = AV43BarFecSalfrom ;
      wcpOAV44BarFecSalto = AV44BarFecSalto ;
      wcpOAV50BarSerfrom = AV50BarSerfrom ;
      wcpOAV51BarSerto = AV51BarSerto ;
      wcpOAV54BarTipArtfrom = AV54BarTipArtfrom ;
      wcpOAV55BarTipArtto = AV55BarTipArtto ;
      wcpOAV31BarColNomfrom = AV31BarColNomfrom ;
      wcpOAV32BarColNomto = AV32BarColNomto ;
      wcpOAV33BarColNumfrom = AV33BarColNumfrom ;
      wcpOAV34BarColNumto = AV34BarColNumto ;
      wcpOAV46BarNomClifrom = AV46BarNomClifrom ;
      wcpOAV47BarNomClito = AV47BarNomClito ;
      wcpOAV48BarNumClifrom = AV48BarNumClifrom ;
      wcpOAV49BarNumClito = AV49BarNumClito ;
      wcpOAV61Muestras = AV61Muestras ;
      wcpOAV25BarCodfrom = AV25BarCodfrom ;
      wcpOAV30BarCodto = AV30BarCodto ;
      wcpOAV28BarCodReofrom = AV28BarCodReofrom ;
      wcpOAV29BarCodReoto = AV29BarCodReoto ;
      wcpOAV26BarCodParfrom = AV26BarCodParfrom ;
      wcpOAV27BarCodParto = AV27BarCodParto ;
      wcpOAV58Cod_Idtx = AV58Cod_Idtx ;
      wcpOAV45BarGirar = AV45BarGirar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV59Emprcod = httpContext.cgiGet( sPrefix+"AV59Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV59Emprcod) > 0 )
      {
         AV59Emprcod = httpContext.cgiGet( sCtrlAV59Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      }
      else
      {
         AV59Emprcod = httpContext.cgiGet( sPrefix+"AV59Emprcod_PARM") ;
      }
      sCtrlAV56CliCodfrom = httpContext.cgiGet( sPrefix+"AV56CliCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV56CliCodfrom) > 0 )
      {
         AV56CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV56CliCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56CliCodfrom), 6, 0));
      }
      else
      {
         AV56CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV56CliCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV57CliCodto = httpContext.cgiGet( sPrefix+"AV57CliCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV57CliCodto) > 0 )
      {
         AV57CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV57CliCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57CliCodto), 6, 0));
      }
      else
      {
         AV57CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV57CliCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV35BarDisNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV35BarDisNumfrom) > 0 )
      {
         AV35BarDisNumfrom = httpContext.cgiGet( sCtrlAV35BarDisNumfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarDisNumfrom", AV35BarDisNumfrom);
      }
      else
      {
         AV35BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV35BarDisNumfrom_PARM") ;
      }
      sCtrlAV36BarDisNumto = httpContext.cgiGet( sPrefix+"AV36BarDisNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV36BarDisNumto) > 0 )
      {
         AV36BarDisNumto = httpContext.cgiGet( sCtrlAV36BarDisNumto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarDisNumto", AV36BarDisNumto);
      }
      else
      {
         AV36BarDisNumto = httpContext.cgiGet( sPrefix+"AV36BarDisNumto_PARM") ;
      }
      sCtrlAV41BarFecGenfrom = httpContext.cgiGet( sPrefix+"AV41BarFecGenfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV41BarFecGenfrom) > 0 )
      {
         AV41BarFecGenfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV41BarFecGenfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarFecGenfrom", localUtil.format(AV41BarFecGenfrom, "99/99/99"));
      }
      else
      {
         AV41BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV41BarFecGenfrom_PARM"), 0) ;
      }
      sCtrlAV42BarFecGento = httpContext.cgiGet( sPrefix+"AV42BarFecGento_CTRL") ;
      if ( GXutil.len( sCtrlAV42BarFecGento) > 0 )
      {
         AV42BarFecGento = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV42BarFecGento), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarFecGento", localUtil.format(AV42BarFecGento, "99/99/99"));
      }
      else
      {
         AV42BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV42BarFecGento_PARM"), 0) ;
      }
      sCtrlAV52BarSitfrom = httpContext.cgiGet( sPrefix+"AV52BarSitfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV52BarSitfrom) > 0 )
      {
         AV52BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV52BarSitfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarSitfrom), 2, 0));
      }
      else
      {
         AV52BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV52BarSitfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV53BarSitto = httpContext.cgiGet( sPrefix+"AV53BarSitto_CTRL") ;
      if ( GXutil.len( sCtrlAV53BarSitto) > 0 )
      {
         AV53BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV53BarSitto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53BarSitto), 2, 0));
      }
      else
      {
         AV53BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV53BarSitto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37BarFecClifrom = httpContext.cgiGet( sPrefix+"AV37BarFecClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV37BarFecClifrom) > 0 )
      {
         AV37BarFecClifrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV37BarFecClifrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarFecClifrom", localUtil.format(AV37BarFecClifrom, "99/99/99"));
      }
      else
      {
         AV37BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV37BarFecClifrom_PARM"), 0) ;
      }
      sCtrlAV38BarFecClito = httpContext.cgiGet( sPrefix+"AV38BarFecClito_CTRL") ;
      if ( GXutil.len( sCtrlAV38BarFecClito) > 0 )
      {
         AV38BarFecClito = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV38BarFecClito), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38BarFecClito", localUtil.format(AV38BarFecClito, "99/99/99"));
      }
      else
      {
         AV38BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV38BarFecClito_PARM"), 0) ;
      }
      sCtrlAV39BarFecFprfrom = httpContext.cgiGet( sPrefix+"AV39BarFecFprfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV39BarFecFprfrom) > 0 )
      {
         AV39BarFecFprfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV39BarFecFprfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39BarFecFprfrom", localUtil.format(AV39BarFecFprfrom, "99/99/99"));
      }
      else
      {
         AV39BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV39BarFecFprfrom_PARM"), 0) ;
      }
      sCtrlAV40BarFecFprto = httpContext.cgiGet( sPrefix+"AV40BarFecFprto_CTRL") ;
      if ( GXutil.len( sCtrlAV40BarFecFprto) > 0 )
      {
         AV40BarFecFprto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV40BarFecFprto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarFecFprto", localUtil.format(AV40BarFecFprto, "99/99/99"));
      }
      else
      {
         AV40BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV40BarFecFprto_PARM"), 0) ;
      }
      sCtrlAV43BarFecSalfrom = httpContext.cgiGet( sPrefix+"AV43BarFecSalfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV43BarFecSalfrom) > 0 )
      {
         AV43BarFecSalfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV43BarFecSalfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarFecSalfrom", localUtil.format(AV43BarFecSalfrom, "99/99/99"));
      }
      else
      {
         AV43BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV43BarFecSalfrom_PARM"), 0) ;
      }
      sCtrlAV44BarFecSalto = httpContext.cgiGet( sPrefix+"AV44BarFecSalto_CTRL") ;
      if ( GXutil.len( sCtrlAV44BarFecSalto) > 0 )
      {
         AV44BarFecSalto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV44BarFecSalto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarFecSalto", localUtil.format(AV44BarFecSalto, "99/99/99"));
      }
      else
      {
         AV44BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV44BarFecSalto_PARM"), 0) ;
      }
      sCtrlAV50BarSerfrom = httpContext.cgiGet( sPrefix+"AV50BarSerfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV50BarSerfrom) > 0 )
      {
         AV50BarSerfrom = httpContext.cgiGet( sCtrlAV50BarSerfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarSerfrom", AV50BarSerfrom);
      }
      else
      {
         AV50BarSerfrom = httpContext.cgiGet( sPrefix+"AV50BarSerfrom_PARM") ;
      }
      sCtrlAV51BarSerto = httpContext.cgiGet( sPrefix+"AV51BarSerto_CTRL") ;
      if ( GXutil.len( sCtrlAV51BarSerto) > 0 )
      {
         AV51BarSerto = httpContext.cgiGet( sCtrlAV51BarSerto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51BarSerto", AV51BarSerto);
      }
      else
      {
         AV51BarSerto = httpContext.cgiGet( sPrefix+"AV51BarSerto_PARM") ;
      }
      sCtrlAV54BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV54BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV54BarTipArtfrom) > 0 )
      {
         AV54BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV54BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarTipArtfrom), 4, 0));
      }
      else
      {
         AV54BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV54BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV55BarTipArtto = httpContext.cgiGet( sPrefix+"AV55BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV55BarTipArtto) > 0 )
      {
         AV55BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV55BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarTipArtto), 4, 0));
      }
      else
      {
         AV55BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV55BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31BarColNomfrom = httpContext.cgiGet( sPrefix+"AV31BarColNomfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV31BarColNomfrom) > 0 )
      {
         AV31BarColNomfrom = httpContext.cgiGet( sCtrlAV31BarColNomfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarColNomfrom", AV31BarColNomfrom);
      }
      else
      {
         AV31BarColNomfrom = httpContext.cgiGet( sPrefix+"AV31BarColNomfrom_PARM") ;
      }
      sCtrlAV32BarColNomto = httpContext.cgiGet( sPrefix+"AV32BarColNomto_CTRL") ;
      if ( GXutil.len( sCtrlAV32BarColNomto) > 0 )
      {
         AV32BarColNomto = httpContext.cgiGet( sCtrlAV32BarColNomto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarColNomto", AV32BarColNomto);
      }
      else
      {
         AV32BarColNomto = httpContext.cgiGet( sPrefix+"AV32BarColNomto_PARM") ;
      }
      sCtrlAV33BarColNumfrom = httpContext.cgiGet( sPrefix+"AV33BarColNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV33BarColNumfrom) > 0 )
      {
         AV33BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33BarColNumfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarColNumfrom), 6, 0));
      }
      else
      {
         AV33BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33BarColNumfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV34BarColNumto = httpContext.cgiGet( sPrefix+"AV34BarColNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV34BarColNumto) > 0 )
      {
         AV34BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV34BarColNumto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarColNumto), 6, 0));
      }
      else
      {
         AV34BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34BarColNumto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV46BarNomClifrom = httpContext.cgiGet( sPrefix+"AV46BarNomClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV46BarNomClifrom) > 0 )
      {
         AV46BarNomClifrom = httpContext.cgiGet( sCtrlAV46BarNomClifrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46BarNomClifrom", AV46BarNomClifrom);
      }
      else
      {
         AV46BarNomClifrom = httpContext.cgiGet( sPrefix+"AV46BarNomClifrom_PARM") ;
      }
      sCtrlAV47BarNomClito = httpContext.cgiGet( sPrefix+"AV47BarNomClito_CTRL") ;
      if ( GXutil.len( sCtrlAV47BarNomClito) > 0 )
      {
         AV47BarNomClito = httpContext.cgiGet( sCtrlAV47BarNomClito) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarNomClito", AV47BarNomClito);
      }
      else
      {
         AV47BarNomClito = httpContext.cgiGet( sPrefix+"AV47BarNomClito_PARM") ;
      }
      sCtrlAV48BarNumClifrom = httpContext.cgiGet( sPrefix+"AV48BarNumClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV48BarNumClifrom) > 0 )
      {
         AV48BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV48BarNumClifrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarNumClifrom), 6, 0));
      }
      else
      {
         AV48BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV48BarNumClifrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV49BarNumClito = httpContext.cgiGet( sPrefix+"AV49BarNumClito_CTRL") ;
      if ( GXutil.len( sCtrlAV49BarNumClito) > 0 )
      {
         AV49BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV49BarNumClito), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarNumClito), 6, 0));
      }
      else
      {
         AV49BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV49BarNumClito_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV54BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV54BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV54BarTipArtfrom) > 0 )
      {
         AV54BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV54BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarTipArtfrom), 4, 0));
      }
      else
      {
         AV54BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV54BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV55BarTipArtto = httpContext.cgiGet( sPrefix+"AV55BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV55BarTipArtto) > 0 )
      {
         AV55BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV55BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarTipArtto), 4, 0));
      }
      else
      {
         AV55BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV55BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV61Muestras = httpContext.cgiGet( sPrefix+"AV61Muestras_CTRL") ;
      if ( GXutil.len( sCtrlAV61Muestras) > 0 )
      {
         AV61Muestras = localUtil.ctond( httpContext.cgiGet( sCtrlAV61Muestras)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Muestras", GXutil.ltrimstr( AV61Muestras, 10, 2));
      }
      else
      {
         AV61Muestras = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV61Muestras_PARM")) ;
      }
      sCtrlAV25BarCodfrom = httpContext.cgiGet( sPrefix+"AV25BarCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV25BarCodfrom) > 0 )
      {
         AV25BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV25BarCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCodfrom), 8, 0));
      }
      else
      {
         AV25BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV25BarCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV30BarCodto = httpContext.cgiGet( sPrefix+"AV30BarCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV30BarCodto) > 0 )
      {
         AV30BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30BarCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarCodto), 8, 0));
      }
      else
      {
         AV30BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30BarCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV28BarCodReofrom = httpContext.cgiGet( sPrefix+"AV28BarCodReofrom_CTRL") ;
      if ( GXutil.len( sCtrlAV28BarCodReofrom) > 0 )
      {
         AV28BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV28BarCodReofrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarCodReofrom", GXutil.str( AV28BarCodReofrom, 1, 0));
      }
      else
      {
         AV28BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV28BarCodReofrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29BarCodReoto = httpContext.cgiGet( sPrefix+"AV29BarCodReoto_CTRL") ;
      if ( GXutil.len( sCtrlAV29BarCodReoto) > 0 )
      {
         AV29BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29BarCodReoto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarCodReoto", GXutil.str( AV29BarCodReoto, 1, 0));
      }
      else
      {
         AV29BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29BarCodReoto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV26BarCodParfrom = httpContext.cgiGet( sPrefix+"AV26BarCodParfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV26BarCodParfrom) > 0 )
      {
         AV26BarCodParfrom = httpContext.cgiGet( sCtrlAV26BarCodParfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarCodParfrom", AV26BarCodParfrom);
      }
      else
      {
         AV26BarCodParfrom = httpContext.cgiGet( sPrefix+"AV26BarCodParfrom_PARM") ;
      }
      sCtrlAV27BarCodParto = httpContext.cgiGet( sPrefix+"AV27BarCodParto_CTRL") ;
      if ( GXutil.len( sCtrlAV27BarCodParto) > 0 )
      {
         AV27BarCodParto = httpContext.cgiGet( sCtrlAV27BarCodParto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarCodParto", AV27BarCodParto);
      }
      else
      {
         AV27BarCodParto = httpContext.cgiGet( sPrefix+"AV27BarCodParto_PARM") ;
      }
      sCtrlAV58Cod_Idtx = httpContext.cgiGet( sPrefix+"AV58Cod_Idtx_CTRL") ;
      if ( GXutil.len( sCtrlAV58Cod_Idtx) > 0 )
      {
         AV58Cod_Idtx = httpContext.cgiGet( sCtrlAV58Cod_Idtx) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Cod_Idtx", AV58Cod_Idtx);
      }
      else
      {
         AV58Cod_Idtx = httpContext.cgiGet( sPrefix+"AV58Cod_Idtx_PARM") ;
      }
      sCtrlAV45BarGirar = httpContext.cgiGet( sPrefix+"AV45BarGirar_CTRL") ;
      if ( GXutil.len( sCtrlAV45BarGirar) > 0 )
      {
         AV45BarGirar = httpContext.cgiGet( sCtrlAV45BarGirar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45BarGirar", AV45BarGirar);
      }
      else
      {
         AV45BarGirar = httpContext.cgiGet( sPrefix+"AV45BarGirar_PARM") ;
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
      pa26R2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws26R2( ) ;
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
      ws26R2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Emprcod_PARM", GXutil.rtrim( AV59Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Emprcod_CTRL", GXutil.rtrim( sCtrlAV59Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56CliCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV56CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56CliCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56CliCodfrom_CTRL", GXutil.rtrim( sCtrlAV56CliCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57CliCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV57CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57CliCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57CliCodto_CTRL", GXutil.rtrim( sCtrlAV57CliCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarDisNumfrom_PARM", GXutil.rtrim( AV35BarDisNumfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35BarDisNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarDisNumfrom_CTRL", GXutil.rtrim( sCtrlAV35BarDisNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36BarDisNumto_PARM", GXutil.rtrim( AV36BarDisNumto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36BarDisNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36BarDisNumto_CTRL", GXutil.rtrim( sCtrlAV36BarDisNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41BarFecGenfrom_PARM", localUtil.dtoc( AV41BarFecGenfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41BarFecGenfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41BarFecGenfrom_CTRL", GXutil.rtrim( sCtrlAV41BarFecGenfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarFecGento_PARM", localUtil.dtoc( AV42BarFecGento, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42BarFecGento)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarFecGento_CTRL", GXutil.rtrim( sCtrlAV42BarFecGento));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52BarSitfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV52BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV52BarSitfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52BarSitfrom_CTRL", GXutil.rtrim( sCtrlAV52BarSitfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53BarSitto_PARM", GXutil.ltrim( localUtil.ntoc( AV53BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53BarSitto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53BarSitto_CTRL", GXutil.rtrim( sCtrlAV53BarSitto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37BarFecClifrom_PARM", localUtil.dtoc( AV37BarFecClifrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37BarFecClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37BarFecClifrom_CTRL", GXutil.rtrim( sCtrlAV37BarFecClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38BarFecClito_PARM", localUtil.dtoc( AV38BarFecClito, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38BarFecClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38BarFecClito_CTRL", GXutil.rtrim( sCtrlAV38BarFecClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39BarFecFprfrom_PARM", localUtil.dtoc( AV39BarFecFprfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39BarFecFprfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39BarFecFprfrom_CTRL", GXutil.rtrim( sCtrlAV39BarFecFprfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40BarFecFprto_PARM", localUtil.dtoc( AV40BarFecFprto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40BarFecFprto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40BarFecFprto_CTRL", GXutil.rtrim( sCtrlAV40BarFecFprto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43BarFecSalfrom_PARM", localUtil.dtoc( AV43BarFecSalfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43BarFecSalfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43BarFecSalfrom_CTRL", GXutil.rtrim( sCtrlAV43BarFecSalfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44BarFecSalto_PARM", localUtil.dtoc( AV44BarFecSalto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44BarFecSalto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44BarFecSalto_CTRL", GXutil.rtrim( sCtrlAV44BarFecSalto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50BarSerfrom_PARM", GXutil.rtrim( AV50BarSerfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50BarSerfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50BarSerfrom_CTRL", GXutil.rtrim( sCtrlAV50BarSerfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51BarSerto_PARM", GXutil.rtrim( AV51BarSerto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51BarSerto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51BarSerto_CTRL", GXutil.rtrim( sCtrlAV51BarSerto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV54BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV54BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV55BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV55BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarColNomfrom_PARM", GXutil.rtrim( AV31BarColNomfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31BarColNomfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarColNomfrom_CTRL", GXutil.rtrim( sCtrlAV31BarColNomfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarColNomto_PARM", GXutil.rtrim( AV32BarColNomto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32BarColNomto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarColNomto_CTRL", GXutil.rtrim( sCtrlAV32BarColNomto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarColNumfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV33BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33BarColNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarColNumfrom_CTRL", GXutil.rtrim( sCtrlAV33BarColNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarColNumto_PARM", GXutil.ltrim( localUtil.ntoc( AV34BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34BarColNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarColNumto_CTRL", GXutil.rtrim( sCtrlAV34BarColNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46BarNomClifrom_PARM", GXutil.rtrim( AV46BarNomClifrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46BarNomClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46BarNomClifrom_CTRL", GXutil.rtrim( sCtrlAV46BarNomClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47BarNomClito_PARM", GXutil.rtrim( AV47BarNomClito));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47BarNomClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47BarNomClito_CTRL", GXutil.rtrim( sCtrlAV47BarNomClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48BarNumClifrom_PARM", GXutil.ltrim( localUtil.ntoc( AV48BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48BarNumClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48BarNumClifrom_CTRL", GXutil.rtrim( sCtrlAV48BarNumClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49BarNumClito_PARM", GXutil.ltrim( localUtil.ntoc( AV49BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49BarNumClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49BarNumClito_CTRL", GXutil.rtrim( sCtrlAV49BarNumClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV54BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV54BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV55BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV55BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Muestras_PARM", GXutil.ltrim( localUtil.ntoc( AV61Muestras, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61Muestras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Muestras_CTRL", GXutil.rtrim( sCtrlAV61Muestras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25BarCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV25BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25BarCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25BarCodfrom_CTRL", GXutil.rtrim( sCtrlAV25BarCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV30BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30BarCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarCodto_CTRL", GXutil.rtrim( sCtrlAV30BarCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28BarCodReofrom_PARM", GXutil.ltrim( localUtil.ntoc( AV28BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28BarCodReofrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28BarCodReofrom_CTRL", GXutil.rtrim( sCtrlAV28BarCodReofrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarCodReoto_PARM", GXutil.ltrim( localUtil.ntoc( AV29BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29BarCodReoto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarCodReoto_CTRL", GXutil.rtrim( sCtrlAV29BarCodReoto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarCodParfrom_PARM", GXutil.rtrim( AV26BarCodParfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26BarCodParfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarCodParfrom_CTRL", GXutil.rtrim( sCtrlAV26BarCodParfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27BarCodParto_PARM", GXutil.rtrim( AV27BarCodParto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27BarCodParto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27BarCodParto_CTRL", GXutil.rtrim( sCtrlAV27BarCodParto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Cod_Idtx_PARM", GXutil.rtrim( AV58Cod_Idtx));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58Cod_Idtx)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Cod_Idtx_CTRL", GXutil.rtrim( sCtrlAV58Cod_Idtx));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45BarGirar_PARM", GXutil.rtrim( AV45BarGirar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45BarGirar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45BarGirar_CTRL", GXutil.rtrim( sCtrlAV45BarGirar));
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
      we26R2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211692866", true, true);
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
      httpContext.AddJavascriptSource("produccion/consultadeproduccion_test_2.js", "?20268211692866", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_372( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_37_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_37_idx ;
      edtBarDisNum_Internalname = sPrefix+"BARDISNUM_"+sGXsfl_37_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_37_idx ;
   }

   public void subsflControlProps_fel_372( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_37_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_37_fel_idx ;
      edtBarDisNum_Internalname = sPrefix+"BARDISNUM_"+sGXsfl_37_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_37_fel_idx ;
   }

   public void sendrow_372( )
   {
      subsflControlProps_372( ) ;
      wb26R0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_37_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_37_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_37_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarDisNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDisNum_Internalname,GXutil.rtrim( A143BarDisNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarDisNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarDisNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes26R2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      /* End function sendrow_372 */
   }

   public void startgridcontrol37( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"37\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarDisNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped.  Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A143BarDisNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarDisNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarDisNum_Internalname = sPrefix+"BARDISNUM" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtBarNHdr_Jsonclick = "" ;
      edtBarDisNum_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBarNHdr_Visible = -1 ;
      edtBarDisNum_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||" ;
      Ddo_grid_Columnids = "0:CliCod|1:CliNom|2:BarDisNum|3:BarNHdr" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV57CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV35BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV36BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV41BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV42BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV52BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV53BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV37BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV38BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV39BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV40BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV43BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV44BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV50BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV51BarSerto',fld:'vBARSERTO',pic:''},{av:'AV54BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV55BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV31BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV32BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV33BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV34BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV46BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV47BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV48BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV49BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV25BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV30BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV28BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV29BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV26BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV27BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV58Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV45BarGirar',fld:'vBARGIRAR',pic:''},{av:'sPrefix'},{av:'AV17ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV17ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'AV10GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV11GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV16ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1226R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV57CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV35BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV36BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV41BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV42BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV52BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV53BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV37BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV38BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV39BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV40BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV43BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV44BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV50BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV51BarSerto',fld:'vBARSERTO',pic:''},{av:'AV54BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV55BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV31BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV32BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV33BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV34BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV46BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV47BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV48BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV49BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV25BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV30BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV28BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV29BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV26BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV27BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV58Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV45BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1326R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV57CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV35BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV36BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV41BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV42BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV52BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV53BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV37BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV38BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV39BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV40BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV43BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV44BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV50BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV51BarSerto',fld:'vBARSERTO',pic:''},{av:'AV54BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV55BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV31BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV32BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV33BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV34BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV46BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV47BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV48BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV49BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV25BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV30BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV28BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV29BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV26BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV27BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV58Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV45BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1726R2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1426R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV57CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV35BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV36BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV41BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV42BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV52BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV53BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV37BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV38BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV39BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV40BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV43BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV44BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV50BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV51BarSerto',fld:'vBARSERTO',pic:''},{av:'AV54BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV55BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV31BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV32BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV33BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV34BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV46BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV47BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV48BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV49BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV25BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV30BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV28BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV29BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV26BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV27BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV58Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV45BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV17ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'AV10GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV11GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV16ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1126R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV57CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV35BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV36BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV41BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV42BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV52BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV53BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV37BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV38BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV39BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV40BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV43BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV44BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV50BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV51BarSerto',fld:'vBARSERTO',pic:''},{av:'AV54BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV55BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV31BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV32BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV33BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV34BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV46BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV47BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV48BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV49BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV25BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV30BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV28BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV29BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV26BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV27BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV58Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV45BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV17ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV9FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'AV10GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV11GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV16ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barnhdr',iparms:[]");
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
      wcpOAV59Emprcod = "" ;
      wcpOAV35BarDisNumfrom = "" ;
      wcpOAV36BarDisNumto = "" ;
      wcpOAV41BarFecGenfrom = GXutil.nullDate() ;
      wcpOAV42BarFecGento = GXutil.nullDate() ;
      wcpOAV37BarFecClifrom = GXutil.nullDate() ;
      wcpOAV38BarFecClito = GXutil.nullDate() ;
      wcpOAV39BarFecFprfrom = GXutil.nullDate() ;
      wcpOAV40BarFecFprto = GXutil.nullDate() ;
      wcpOAV43BarFecSalfrom = GXutil.nullDate() ;
      wcpOAV44BarFecSalto = GXutil.nullDate() ;
      wcpOAV50BarSerfrom = "" ;
      wcpOAV51BarSerto = "" ;
      wcpOAV31BarColNomfrom = "" ;
      wcpOAV32BarColNomto = "" ;
      wcpOAV46BarNomClifrom = "" ;
      wcpOAV47BarNomClito = "" ;
      wcpOAV61Muestras = DecimalUtil.ZERO ;
      wcpOAV26BarCodParfrom = "" ;
      wcpOAV27BarCodParto = "" ;
      wcpOAV58Cod_Idtx = "" ;
      wcpOAV45BarGirar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV59Emprcod = "" ;
      AV35BarDisNumfrom = "" ;
      AV36BarDisNumto = "" ;
      AV41BarFecGenfrom = GXutil.nullDate() ;
      AV42BarFecGento = GXutil.nullDate() ;
      AV37BarFecClifrom = GXutil.nullDate() ;
      AV38BarFecClito = GXutil.nullDate() ;
      AV39BarFecFprfrom = GXutil.nullDate() ;
      AV40BarFecFprto = GXutil.nullDate() ;
      AV43BarFecSalfrom = GXutil.nullDate() ;
      AV44BarFecSalto = GXutil.nullDate() ;
      AV50BarSerfrom = "" ;
      AV51BarSerto = "" ;
      AV31BarColNomfrom = "" ;
      AV32BarColNomto = "" ;
      AV46BarNomClifrom = "" ;
      AV47BarNomClito = "" ;
      AV61Muestras = DecimalUtil.ZERO ;
      AV26BarCodParfrom = "" ;
      AV27BarCodParto = "" ;
      AV58Cod_Idtx = "" ;
      AV45BarGirar = "" ;
      AV9FilterFullText = "" ;
      AV5ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV64Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV16ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV8DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A130BarCodPar = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A143BarDisNum = "" ;
      A13696BarNHdr = "" ;
      scmdbuf = "" ;
      lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = "" ;
      AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext = "" ;
      AV60TFBarPlf = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A3030BarPlf = "" ;
      A2829BarProPer = "" ;
      A2454BarGirar = "" ;
      A396EmprCod = "" ;
      H026R2_A396EmprCod = new String[] {""} ;
      H026R2_A2454BarGirar = new String[] {""} ;
      H026R2_A2829BarProPer = new String[] {""} ;
      H026R2_A3030BarPlf = new String[] {""} ;
      H026R2_A217BarTipArt = new short[1] ;
      H026R2_n217BarTipArt = new boolean[] {false} ;
      H026R2_A1235BarNumCli = new int[1] ;
      H026R2_A1234BarNomCli = new String[] {""} ;
      H026R2_A136BarColNum = new int[1] ;
      H026R2_A135BarColNom = new String[] {""} ;
      H026R2_A212BarSer = new String[] {""} ;
      H026R2_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H026R2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H026R2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H026R2_A213BarSit = new byte[1] ;
      H026R2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H026R2_A143BarDisNum = new String[] {""} ;
      H026R2_A279CliNom = new String[] {""} ;
      H026R2_A252CliCod = new int[1] ;
      H026R2_n252CliCod = new boolean[] {false} ;
      H026R2_A130BarCodPar = new String[] {""} ;
      H026R2_A132BarCodReo = new byte[1] ;
      H026R2_A129BarCod = new int[1] ;
      H026R3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV65Station = "" ;
      GXv_char2 = new String[1] ;
      AV66Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV67Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV24WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV7ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV18ManageFiltersXml = "" ;
      AV23UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV6ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV21TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV59Emprcod = "" ;
      sCtrlAV56CliCodfrom = "" ;
      sCtrlAV57CliCodto = "" ;
      sCtrlAV35BarDisNumfrom = "" ;
      sCtrlAV36BarDisNumto = "" ;
      sCtrlAV41BarFecGenfrom = "" ;
      sCtrlAV42BarFecGento = "" ;
      sCtrlAV52BarSitfrom = "" ;
      sCtrlAV53BarSitto = "" ;
      sCtrlAV37BarFecClifrom = "" ;
      sCtrlAV38BarFecClito = "" ;
      sCtrlAV39BarFecFprfrom = "" ;
      sCtrlAV40BarFecFprto = "" ;
      sCtrlAV43BarFecSalfrom = "" ;
      sCtrlAV44BarFecSalto = "" ;
      sCtrlAV50BarSerfrom = "" ;
      sCtrlAV51BarSerto = "" ;
      sCtrlAV54BarTipArtfrom = "" ;
      sCtrlAV55BarTipArtto = "" ;
      sCtrlAV31BarColNomfrom = "" ;
      sCtrlAV32BarColNomto = "" ;
      sCtrlAV33BarColNumfrom = "" ;
      sCtrlAV34BarColNumto = "" ;
      sCtrlAV46BarNomClifrom = "" ;
      sCtrlAV47BarNomClito = "" ;
      sCtrlAV48BarNumClifrom = "" ;
      sCtrlAV49BarNumClito = "" ;
      sCtrlAV61Muestras = "" ;
      sCtrlAV25BarCodfrom = "" ;
      sCtrlAV30BarCodto = "" ;
      sCtrlAV28BarCodReofrom = "" ;
      sCtrlAV29BarCodReoto = "" ;
      sCtrlAV26BarCodParfrom = "" ;
      sCtrlAV27BarCodParto = "" ;
      sCtrlAV58Cod_Idtx = "" ;
      sCtrlAV45BarGirar = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_test_2__default(),
         new Object[] {
             new Object[] {
            H026R2_A396EmprCod, H026R2_A2454BarGirar, H026R2_A2829BarProPer, H026R2_A3030BarPlf, H026R2_A217BarTipArt, H026R2_n217BarTipArt, H026R2_A1235BarNumCli, H026R2_A1234BarNomCli, H026R2_A136BarColNum, H026R2_A135BarColNom,
            H026R2_A212BarSer, H026R2_A158BarFecFpr, H026R2_A155BarFecCli, H026R2_A161BarFecSal, H026R2_A213BarSit, H026R2_A159BarFecGen, H026R2_A143BarDisNum, H026R2_A279CliNom, H026R2_A252CliCod, H026R2_n252CliCod,
            H026R2_A130BarCodPar, H026R2_A132BarCodReo, H026R2_A129BarCod
            }
            , new Object[] {
            H026R3_AGRID_nRecordCount
            }
         }
      );
      AV64Pgmname = "Produccion.ConsultadeProduccion_Test_2" ;
      /* GeneXus formulas. */
      AV64Pgmname = "Produccion.ConsultadeProduccion_Test_2" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV52BarSitfrom ;
   private byte wcpOAV53BarSitto ;
   private byte wcpOAV28BarCodReofrom ;
   private byte wcpOAV29BarCodReoto ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV52BarSitfrom ;
   private byte AV53BarSitto ;
   private byte AV28BarCodReofrom ;
   private byte AV29BarCodReoto ;
   private byte AV17ManageFiltersExecutionStep ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A213BarSit ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV54BarTipArtfrom ;
   private short wcpOAV55BarTipArtto ;
   private short AV54BarTipArtfrom ;
   private short AV55BarTipArtto ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A217BarTipArt ;
   private int wcpOAV56CliCodfrom ;
   private int wcpOAV57CliCodto ;
   private int wcpOAV33BarColNumfrom ;
   private int wcpOAV34BarColNumto ;
   private int wcpOAV48BarNumClifrom ;
   private int wcpOAV49BarNumClito ;
   private int wcpOAV25BarCodfrom ;
   private int wcpOAV30BarCodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_37 ;
   private int AV56CliCodfrom ;
   private int AV57CliCodto ;
   private int AV33BarColNumfrom ;
   private int AV34BarColNumto ;
   private int AV48BarNumClifrom ;
   private int AV49BarNumClito ;
   private int AV25BarCodfrom ;
   private int AV30BarCodto ;
   private int nGXsfl_37_idx=1 ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarDisNum_Visible ;
   private int edtBarNHdr_Visible ;
   private int AV19PageToGo ;
   private int AV69GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV10GridCurrentPage ;
   private long AV11GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV61Muestras ;
   private java.math.BigDecimal AV61Muestras ;
   private String wcpOAV59Emprcod ;
   private String wcpOAV35BarDisNumfrom ;
   private String wcpOAV36BarDisNumto ;
   private String wcpOAV50BarSerfrom ;
   private String wcpOAV51BarSerto ;
   private String wcpOAV31BarColNomfrom ;
   private String wcpOAV32BarColNomto ;
   private String wcpOAV46BarNomClifrom ;
   private String wcpOAV47BarNomClito ;
   private String wcpOAV26BarCodParfrom ;
   private String wcpOAV27BarCodParto ;
   private String wcpOAV58Cod_Idtx ;
   private String wcpOAV45BarGirar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV59Emprcod ;
   private String AV35BarDisNumfrom ;
   private String AV36BarDisNumto ;
   private String AV50BarSerfrom ;
   private String AV51BarSerto ;
   private String AV31BarColNomfrom ;
   private String AV32BarColNomto ;
   private String AV46BarNomClifrom ;
   private String AV47BarNomClito ;
   private String AV26BarCodParfrom ;
   private String AV27BarCodParto ;
   private String AV58Cod_Idtx ;
   private String AV45BarGirar ;
   private String sGXsfl_37_idx="0001" ;
   private String AV64Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A130BarCodPar ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
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
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String scmdbuf ;
   private String AV60TFBarPlf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A3030BarPlf ;
   private String A2829BarProPer ;
   private String A2454BarGirar ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV65Station ;
   private String GXv_char2[] ;
   private String AV66Emprnom ;
   private String GXv_char3[] ;
   private String AV67Usurcod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV59Emprcod ;
   private String sCtrlAV56CliCodfrom ;
   private String sCtrlAV57CliCodto ;
   private String sCtrlAV35BarDisNumfrom ;
   private String sCtrlAV36BarDisNumto ;
   private String sCtrlAV41BarFecGenfrom ;
   private String sCtrlAV42BarFecGento ;
   private String sCtrlAV52BarSitfrom ;
   private String sCtrlAV53BarSitto ;
   private String sCtrlAV37BarFecClifrom ;
   private String sCtrlAV38BarFecClito ;
   private String sCtrlAV39BarFecFprfrom ;
   private String sCtrlAV40BarFecFprto ;
   private String sCtrlAV43BarFecSalfrom ;
   private String sCtrlAV44BarFecSalto ;
   private String sCtrlAV50BarSerfrom ;
   private String sCtrlAV51BarSerto ;
   private String sCtrlAV54BarTipArtfrom ;
   private String sCtrlAV55BarTipArtto ;
   private String sCtrlAV31BarColNomfrom ;
   private String sCtrlAV32BarColNomto ;
   private String sCtrlAV33BarColNumfrom ;
   private String sCtrlAV34BarColNumto ;
   private String sCtrlAV46BarNomClifrom ;
   private String sCtrlAV47BarNomClito ;
   private String sCtrlAV48BarNumClifrom ;
   private String sCtrlAV49BarNumClito ;
   private String sCtrlAV61Muestras ;
   private String sCtrlAV25BarCodfrom ;
   private String sCtrlAV30BarCodto ;
   private String sCtrlAV28BarCodReofrom ;
   private String sCtrlAV29BarCodReoto ;
   private String sCtrlAV26BarCodParfrom ;
   private String sCtrlAV27BarCodParto ;
   private String sCtrlAV58Cod_Idtx ;
   private String sCtrlAV45BarGirar ;
   private String sGXsfl_37_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarDisNum_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV41BarFecGenfrom ;
   private java.util.Date wcpOAV42BarFecGento ;
   private java.util.Date wcpOAV37BarFecClifrom ;
   private java.util.Date wcpOAV38BarFecClito ;
   private java.util.Date wcpOAV39BarFecFprfrom ;
   private java.util.Date wcpOAV40BarFecFprto ;
   private java.util.Date wcpOAV43BarFecSalfrom ;
   private java.util.Date wcpOAV44BarFecSalto ;
   private java.util.Date AV41BarFecGenfrom ;
   private java.util.Date AV42BarFecGento ;
   private java.util.Date AV37BarFecClifrom ;
   private java.util.Date AV38BarFecClito ;
   private java.util.Date AV39BarFecFprfrom ;
   private java.util.Date AV40BarFecFprto ;
   private java.util.Date AV43BarFecSalfrom ;
   private java.util.Date AV44BarFecSalto ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean bGXsfl_37_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV7ColumnsSelectorXML ;
   private String AV18ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String AV9FilterFullText ;
   private String lV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext ;
   private String AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV14HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H026R2_A396EmprCod ;
   private String[] H026R2_A2454BarGirar ;
   private String[] H026R2_A2829BarProPer ;
   private String[] H026R2_A3030BarPlf ;
   private short[] H026R2_A217BarTipArt ;
   private boolean[] H026R2_n217BarTipArt ;
   private int[] H026R2_A1235BarNumCli ;
   private String[] H026R2_A1234BarNomCli ;
   private int[] H026R2_A136BarColNum ;
   private String[] H026R2_A135BarColNom ;
   private String[] H026R2_A212BarSer ;
   private java.util.Date[] H026R2_A158BarFecFpr ;
   private java.util.Date[] H026R2_A155BarFecCli ;
   private java.util.Date[] H026R2_A161BarFecSal ;
   private byte[] H026R2_A213BarSit ;
   private java.util.Date[] H026R2_A159BarFecGen ;
   private String[] H026R2_A143BarDisNum ;
   private String[] H026R2_A279CliNom ;
   private int[] H026R2_A252CliCod ;
   private boolean[] H026R2_n252CliCod ;
   private String[] H026R2_A130BarCodPar ;
   private byte[] H026R2_A132BarCodReo ;
   private int[] H026R2_A129BarCod ;
   private long[] H026R3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV16ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV8DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV21TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV24WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class consultadeproduccion_test_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H026R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext ,
                                          String AV35BarDisNumfrom ,
                                          String AV36BarDisNumto ,
                                          int AV56CliCodfrom ,
                                          int AV57CliCodto ,
                                          byte AV52BarSitfrom ,
                                          byte AV53BarSitto ,
                                          java.util.Date AV41BarFecGenfrom ,
                                          java.util.Date AV42BarFecGento ,
                                          java.util.Date AV43BarFecSalfrom ,
                                          java.util.Date AV44BarFecSalto ,
                                          java.util.Date AV37BarFecClifrom ,
                                          java.util.Date AV38BarFecClito ,
                                          java.util.Date AV39BarFecFprfrom ,
                                          java.util.Date AV40BarFecFprto ,
                                          String AV50BarSerfrom ,
                                          String AV51BarSerto ,
                                          String AV31BarColNomfrom ,
                                          String AV32BarColNomto ,
                                          int AV33BarColNumfrom ,
                                          int AV34BarColNumto ,
                                          String AV46BarNomClifrom ,
                                          String AV47BarNomClito ,
                                          int AV48BarNumClifrom ,
                                          int AV49BarNumClito ,
                                          short AV54BarTipArtfrom ,
                                          short AV55BarTipArtto ,
                                          String AV60TFBarPlf ,
                                          int AV25BarCodfrom ,
                                          int AV30BarCodto ,
                                          byte AV28BarCodReofrom ,
                                          byte AV29BarCodReoto ,
                                          String AV26BarCodParfrom ,
                                          String AV27BarCodParto ,
                                          String AV58Cod_Idtx ,
                                          String AV45BarGirar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A143BarDisNum ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          short A217BarTipArt ,
                                          String A3030BarPlf ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          String AV59Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[45];
      Object[] GXv_Object14 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.BarGirar, T1.BarProPer, T1.BarPlf, T1.BarTipArt, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarFecFpr, T1.BarFecCli, T1.BarFecSal," ;
      sSelectString += " T1.BarSit, T1.BarFecGen, T1.BarDisNum, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod" ;
      sFromString = " FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarDisNum) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
         GXv_int13[2] = (byte)(1) ;
         GXv_int13[3] = (byte)(1) ;
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (0==AV56CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (0==AV57CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (0==AV52BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV53BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38BarFecClito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV32BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( ! (0==AV33BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( ! (0==AV34BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( ! (0==AV48BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( ! (0==AV49BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( ! (0==AV54BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (0==AV55BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( ! (0==AV25BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int13[32] = (byte)(1) ;
      }
      if ( ! (0==AV30BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int13[33] = (byte)(1) ;
      }
      if ( ! (0==AV28BarCodReofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int13[34] = (byte)(1) ;
      }
      if ( ! (0==AV29BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int13[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int13[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int13[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int13[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int13[39] = (byte)(1) ;
      }
      sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarFecGen" ;
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H026R3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext ,
                                          String AV35BarDisNumfrom ,
                                          String AV36BarDisNumto ,
                                          int AV56CliCodfrom ,
                                          int AV57CliCodto ,
                                          byte AV52BarSitfrom ,
                                          byte AV53BarSitto ,
                                          java.util.Date AV41BarFecGenfrom ,
                                          java.util.Date AV42BarFecGento ,
                                          java.util.Date AV43BarFecSalfrom ,
                                          java.util.Date AV44BarFecSalto ,
                                          java.util.Date AV37BarFecClifrom ,
                                          java.util.Date AV38BarFecClito ,
                                          java.util.Date AV39BarFecFprfrom ,
                                          java.util.Date AV40BarFecFprto ,
                                          String AV50BarSerfrom ,
                                          String AV51BarSerto ,
                                          String AV31BarColNomfrom ,
                                          String AV32BarColNomto ,
                                          int AV33BarColNumfrom ,
                                          int AV34BarColNumto ,
                                          String AV46BarNomClifrom ,
                                          String AV47BarNomClito ,
                                          int AV48BarNumClifrom ,
                                          int AV49BarNumClito ,
                                          short AV54BarTipArtfrom ,
                                          short AV55BarTipArtto ,
                                          String AV60TFBarPlf ,
                                          int AV25BarCodfrom ,
                                          int AV30BarCodto ,
                                          byte AV28BarCodReofrom ,
                                          byte AV29BarCodReoto ,
                                          String AV26BarCodParfrom ,
                                          String AV27BarCodParto ,
                                          String AV58Cod_Idtx ,
                                          String AV45BarGirar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A143BarDisNum ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          short A217BarTipArt ,
                                          String A3030BarPlf ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          String AV59Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[40];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV68Produccion_consultadeproduccion_test_2ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarDisNum) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
         GXv_int15[2] = (byte)(1) ;
         GXv_int15[3] = (byte)(1) ;
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (0==AV56CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV57CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (0==AV52BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (0==AV53BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38BarFecClito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV32BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (0==AV33BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( ! (0==AV34BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (0==AV48BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( ! (0==AV49BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ! (0==AV54BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( ! (0==AV55BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      if ( ! (0==AV25BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int15[32] = (byte)(1) ;
      }
      if ( ! (0==AV30BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int15[33] = (byte)(1) ;
      }
      if ( ! (0==AV28BarCodReofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int15[34] = (byte)(1) ;
      }
      if ( ! (0==AV29BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int15[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int15[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int15[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int15[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int15[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H026R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
            case 1 :
                  return conditional_H026R3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H026R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026R3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 8);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 20);
               }
               return;
      }
   }

}

