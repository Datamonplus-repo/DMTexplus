package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_test_impl extends GXWebComponent
{
   public consultadeproduccion_test_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_test_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_test_impl.class ));
   }

   public consultadeproduccion_test_impl( int remoteHandle ,
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV36CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliCodfrom), 6, 0));
               AV37CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliCodto), 6, 0));
               AV16BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarDisNumfrom", AV16BarDisNumfrom);
               AV17BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarDisNumto", AV17BarDisNumto);
               AV22BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarFecGenfrom", localUtil.format(AV22BarFecGenfrom, "99/99/99"));
               AV23BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarFecGento", localUtil.format(AV23BarFecGento, "99/99/99"));
               AV32BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSitfrom), 2, 0));
               AV33BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarSitto), 2, 0));
               AV18BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarFecClifrom", localUtil.format(AV18BarFecClifrom, "99/99/99"));
               AV19BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarFecClito", localUtil.format(AV19BarFecClito, "99/99/99"));
               AV20BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarFecFprfrom", localUtil.format(AV20BarFecFprfrom, "99/99/99"));
               AV21BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarFecFprto", localUtil.format(AV21BarFecFprto, "99/99/99"));
               AV24BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarFecSalfrom", localUtil.format(AV24BarFecSalfrom, "99/99/99"));
               AV25BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarFecSalto", localUtil.format(AV25BarFecSalto, "99/99/99"));
               AV30BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarSerfrom", AV30BarSerfrom);
               AV31BarSerto = httpContext.GetPar( "BarSerto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarSerto", AV31BarSerto);
               AV34BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarTipArtfrom), 4, 0));
               AV35BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
               AV12BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarColNomfrom", AV12BarColNomfrom);
               AV13BarColNomto = httpContext.GetPar( "BarColNomto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarColNomto", AV13BarColNomto);
               AV14BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumfrom), 6, 0));
               AV15BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarColNumto), 6, 0));
               AV26BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarNomClifrom", AV26BarNomClifrom);
               AV27BarNomClito = httpContext.GetPar( "BarNomClito") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarNomClito", AV27BarNomClito);
               AV28BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarNumClifrom), 6, 0));
               AV29BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarNumClito), 6, 0));
               AV34BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarTipArtfrom), 4, 0));
               AV35BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
               AV68muestras = httpContext.GetPar( "muestras") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68muestras", AV68muestras);
               AV6BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodfrom), 8, 0));
               AV11BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarCodto), 8, 0));
               AV9BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCodReofrom", GXutil.str( AV9BarCodReofrom, 1, 0));
               AV10BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReoto", GXutil.str( AV10BarCodReoto, 1, 0));
               AV7BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodParfrom", AV7BarCodParfrom);
               AV8BarCodParto = httpContext.GetPar( "BarCodParto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodParto", AV8BarCodParto);
               AV38Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Cod_Idtx", AV38Cod_Idtx);
               AV69BarGirar = httpContext.GetPar( "BarGirar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarGirar", AV69BarGirar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV36CliCodfrom),Integer.valueOf(AV37CliCodto),AV16BarDisNumfrom,AV17BarDisNumto,AV22BarFecGenfrom,AV23BarFecGento,Byte.valueOf(AV32BarSitfrom),Byte.valueOf(AV33BarSitto),AV18BarFecClifrom,AV19BarFecClito,AV20BarFecFprfrom,AV21BarFecFprto,AV24BarFecSalfrom,AV25BarFecSalto,AV30BarSerfrom,AV31BarSerto,Short.valueOf(AV34BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV12BarColNomfrom,AV13BarColNomto,Integer.valueOf(AV14BarColNumfrom),Integer.valueOf(AV15BarColNumto),AV26BarNomClifrom,AV27BarNomClito,Integer.valueOf(AV28BarNumClifrom),Integer.valueOf(AV29BarNumClito),Short.valueOf(AV34BarTipArtfrom),Short.valueOf(AV35BarTipArtto),AV68muestras,Integer.valueOf(AV6BarCodfrom),Integer.valueOf(AV11BarCodto),Byte.valueOf(AV9BarCodReofrom),Byte.valueOf(AV10BarCodReoto),AV7BarCodParfrom,AV8BarCodParto,AV38Cod_Idtx,AV69BarGirar});
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV36CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
      AV37CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      AV16BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
      AV17BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
      AV22BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
      AV23BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
      AV32BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
      AV33BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
      AV18BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
      AV19BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
      AV20BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
      AV21BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
      AV24BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
      AV25BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
      AV30BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
      AV31BarSerto = httpContext.GetPar( "BarSerto") ;
      AV34BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
      AV35BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
      AV12BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
      AV13BarColNomto = httpContext.GetPar( "BarColNomto") ;
      AV14BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
      AV15BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
      AV26BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
      AV27BarNomClito = httpContext.GetPar( "BarNomClito") ;
      AV28BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
      AV29BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
      AV6BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
      AV11BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
      AV9BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
      AV10BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
      AV7BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
      AV8BarCodParto = httpContext.GetPar( "BarCodParto") ;
      AV38Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
      AV69BarGirar = httpContext.GetPar( "BarGirar") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV53ColumnsSelector);
      AV141Pgmname = httpContext.GetPar( "Pgmname") ;
      AV114STNORM = (short)(GXutil.lval( httpContext.GetPar( "STNORM"))) ;
      AV136TFBarPlf = httpContext.GetPar( "TFBarPlf") ;
      AV129TotBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgm"), ".") ;
      AV131TotBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMtr"), ".") ;
      AV133TotBarPie = GXutil.lval( httpContext.GetPar( "TotBarPie")) ;
      AV138Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      A13878PedidoClie = httpContext.GetPar( "PedidoClie") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV36CliCodfrom, AV37CliCodto, AV16BarDisNumfrom, AV17BarDisNumto, AV22BarFecGenfrom, AV23BarFecGento, AV32BarSitfrom, AV33BarSitto, AV18BarFecClifrom, AV19BarFecClito, AV20BarFecFprfrom, AV21BarFecFprto, AV24BarFecSalfrom, AV25BarFecSalto, AV30BarSerfrom, AV31BarSerto, AV34BarTipArtfrom, AV35BarTipArtto, AV12BarColNomfrom, AV13BarColNomto, AV14BarColNumfrom, AV15BarColNumto, AV26BarNomClifrom, AV27BarNomClito, AV28BarNumClifrom, AV29BarNumClito, AV6BarCodfrom, AV11BarCodto, AV9BarCodReofrom, AV10BarCodReoto, AV7BarCodParfrom, AV8BarCodParto, AV38Cod_Idtx, AV69BarGirar, AV53ColumnsSelector, AV141Pgmname, AV114STNORM, AV136TFBarPlf, AV129TotBarKgm, AV131TotBarMtr, AV133TotBarPie, AV138Moda21, A13878PedidoClie, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa26E2( ) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.consultadeproduccion_test", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV36CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarDisNumfrom)),GXutil.URLEncode(GXutil.rtrim(AV17BarDisNumto)),GXutil.URLEncode(GXutil.formatDateParm(AV22BarFecGenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV23BarFecGento)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarSitto,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV18BarFecClifrom)),GXutil.URLEncode(GXutil.formatDateParm(AV19BarFecClito)),GXutil.URLEncode(GXutil.formatDateParm(AV20BarFecFprfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV21BarFecFprto)),GXutil.URLEncode(GXutil.formatDateParm(AV24BarFecSalfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV25BarFecSalto)),GXutil.URLEncode(GXutil.rtrim(AV30BarSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV31BarSerto)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV12BarColNomfrom)),GXutil.URLEncode(GXutil.rtrim(AV13BarColNomto)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarColNumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarColNumto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV26BarNomClifrom)),GXutil.URLEncode(GXutil.rtrim(AV27BarNomClito)),GXutil.URLEncode(GXutil.ltrimstr(AV28BarNumClifrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29BarNumClito,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV68muestras)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReofrom,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReoto,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodParfrom)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodParto)),GXutil.URLEncode(GXutil.rtrim(AV38Cod_Idtx)),GXutil.URLEncode(GXutil.rtrim(AV69BarGirar))}, new String[] {"Emprcod","CliCodfrom","CliCodto","BarDisNumfrom","BarDisNumto","BarFecGenfrom","BarFecGento","BarSitfrom","BarSitto","BarFecClifrom","BarFecClito","BarFecFprfrom","BarFecFprto","BarFecSalfrom","BarFecSalto","BarSerfrom","BarSerto","BarTipArtfrom","BarTipArtto","BarColNomfrom","BarColNomto","BarColNumfrom","BarColNumto","BarNomClifrom","BarNomClito","BarNumClifrom","BarNumClito","BarTipArtfrom","BarTipArtto","muestras","BarCodfrom","BarCodto","BarCodReofrom","BarCodReoto","BarCodParfrom","BarCodParto","Cod_Idtx","BarGirar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTNORM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV114STNORM), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPLF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV136TFBarPlf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV129TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV131TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133TotBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_Test");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV141Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_test:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_34", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV66GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV67GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV64DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV64DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV53ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV53ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36CliCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV36CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37CliCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV37CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16BarDisNumfrom", GXutil.rtrim( wcpOAV16BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17BarDisNumto", GXutil.rtrim( wcpOAV17BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22BarFecGenfrom", localUtil.dtoc( wcpOAV22BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23BarFecGento", localUtil.dtoc( wcpOAV23BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32BarSitfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV32BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33BarSitto", GXutil.ltrim( localUtil.ntoc( wcpOAV33BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18BarFecClifrom", localUtil.dtoc( wcpOAV18BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19BarFecClito", localUtil.dtoc( wcpOAV19BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20BarFecFprfrom", localUtil.dtoc( wcpOAV20BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21BarFecFprto", localUtil.dtoc( wcpOAV21BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24BarFecSalfrom", localUtil.dtoc( wcpOAV24BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25BarFecSalto", localUtil.dtoc( wcpOAV25BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30BarSerfrom", GXutil.rtrim( wcpOAV30BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31BarSerto", GXutil.rtrim( wcpOAV31BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34BarTipArtfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV34BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35BarTipArtto", GXutil.ltrim( localUtil.ntoc( wcpOAV35BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12BarColNomfrom", GXutil.rtrim( wcpOAV12BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13BarColNomto", GXutil.rtrim( wcpOAV13BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14BarColNumfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV14BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15BarColNumto", GXutil.ltrim( localUtil.ntoc( wcpOAV15BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26BarNomClifrom", GXutil.rtrim( wcpOAV26BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27BarNomClito", GXutil.rtrim( wcpOAV27BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28BarNumClifrom", GXutil.ltrim( localUtil.ntoc( wcpOAV28BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29BarNumClito", GXutil.ltrim( localUtil.ntoc( wcpOAV29BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68muestras", GXutil.rtrim( wcpOAV68muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6BarCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV6BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11BarCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV11BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9BarCodReofrom", GXutil.ltrim( localUtil.ntoc( wcpOAV9BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10BarCodReoto", GXutil.ltrim( localUtil.ntoc( wcpOAV10BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7BarCodParfrom", GXutil.rtrim( wcpOAV7BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarCodParto", GXutil.rtrim( wcpOAV8BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38Cod_Idtx", GXutil.rtrim( wcpOAV38Cod_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69BarGirar", GXutil.rtrim( wcpOAV69BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTNORM", GXutil.ltrim( localUtil.ntoc( AV114STNORM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTNORM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV114STNORM), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMFROM", GXutil.rtrim( AV16BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMTO", GXutil.rtrim( AV17BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV36CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV37CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV32BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV33BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENFROM", localUtil.dtoc( AV22BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENTO", localUtil.dtoc( AV23BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALFROM", localUtil.dtoc( AV24BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALTO", localUtil.dtoc( AV25BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLIFROM", localUtil.dtoc( AV18BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLITO", localUtil.dtoc( AV19BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRFROM", localUtil.dtoc( AV20BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRTO", localUtil.dtoc( AV21BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERFROM", GXutil.rtrim( AV30BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERTO", GXutil.rtrim( AV31BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMFROM", GXutil.rtrim( AV12BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMTO", GXutil.rtrim( AV13BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMFROM", GXutil.ltrim( localUtil.ntoc( AV14BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV15BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLIFROM", GXutil.rtrim( AV26BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLITO", GXutil.rtrim( AV27BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARNUMCLI", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLIFROM", GXutil.ltrim( localUtil.ntoc( AV28BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLITO", GXutil.ltrim( localUtil.ntoc( AV29BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTFROM", GXutil.ltrim( localUtil.ntoc( AV34BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTTO", GXutil.ltrim( localUtil.ntoc( AV35BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPLF", GXutil.rtrim( A3030BarPlf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPLF", GXutil.rtrim( AV136TFBarPlf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPLF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV136TFBarPlf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODFROM", GXutil.ltrim( localUtil.ntoc( AV6BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODTO", GXutil.ltrim( localUtil.ntoc( AV11BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOFROM", GXutil.ltrim( localUtil.ntoc( AV9BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOTO", GXutil.ltrim( localUtil.ntoc( AV10BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARFROM", GXutil.rtrim( AV7BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARTO", GXutil.rtrim( AV8BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOD_IDTX", GXutil.rtrim( AV38Cod_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARGIRAR", GXutil.rtrim( AV69BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV129TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV129TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV131TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV131TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARPIE", GXutil.ltrim( localUtil.ntoc( AV133TotBarPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133TotBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV138Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMUESTRAS", GXutil.rtrim( AV68muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm26E2( )
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
      return "Produccion.ConsultadeProduccion_Test" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Hoja de Ruta", "") ;
   }

   public void wb26E0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.consultadeproduccion_test");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_26E2( true) ;
      }
      else
      {
         wb_table1_23_26E2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_26E2e( boolean wbgen )
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
         wb_table2_73_26E2( true) ;
      }
      else
      {
         wb_table2_73_26E2( false) ;
      }
      return  ;
   }

   public void wb_table2_73_26E2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV66GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV67GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV141Pgmname), GXutil.rtrim( localUtil.format( AV141Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_Test.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV64DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV64DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV53ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table3_132_26E2( true) ;
      }
      else
      {
         wb_table3_132_26E2( false) ;
      }
      return  ;
   }

   public void wb_table3_132_26E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_137_26E2( true) ;
      }
      else
      {
         wb_table4_137_26E2( false) ;
      }
      return  ;
   }

   public void wb_table4_137_26E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_142_26E2( true) ;
      }
      else
      {
         wb_table5_142_26E2( false) ;
      }
      return  ;
   }

   public void wb_table5_142_26E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_147_26E2( true) ;
      }
      else
      {
         wb_table6_147_26E2( false) ;
      }
      return  ;
   }

   public void wb_table6_147_26E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_152_26E2( true) ;
      }
      else
      {
         wb_table7_152_26E2( false) ;
      }
      return  ;
   }

   public void wb_table7_152_26E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table8_157_26E2( true) ;
      }
      else
      {
         wb_table8_157_26E2( false) ;
      }
      return  ;
   }

   public void wb_table8_157_26E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table9_162_26E2( true) ;
      }
      else
      {
         wb_table9_162_26E2( false) ;
      }
      return  ;
   }

   public void wb_table9_162_26E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0170"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0170"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_34_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0170"+"");
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

   public void start26E2( )
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
            strup26E0( ) ;
         }
      }
   }

   public void ws26E2( )
   {
      start26E2( ) ;
      evt26E2( ) ;
   }

   public void evt26E2( )
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
                              strup26E0( ) ;
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
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1126E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1226E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1326E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "SITUACIONFASES_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1426E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "CONSULTAALBARANSALIDA_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1526E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "RECETAS_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1626E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "PARTESPRODUCCION_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1726E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "PIEZAS_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1826E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "AGRUPADAS_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1926E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e2026E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e2126E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26E0( ) ;
                           }
                           nGXsfl_34_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_342( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV113GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113GridActionGroup1), 4, 0));
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n217BarTipArt = false ;
                           A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
                           n13711BarTipArtD = false ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A158BarFecFpr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecFpr_Internalname), 0)) ;
                           A161BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecSal_Internalname), 0)) ;
                           A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
                           n151BarFasCod = false ;
                           A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
                           n1955BarFasSig = false ;
                           A13930BarAlbUlti = localUtil.ctol( httpContext.cgiGet( edtBarAlbUlti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A13935BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbFact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2454BarGirar = httpContext.cgiGet( edtBarGirar_Internalname) ;
                           A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13933BarCuadern = httpContext.cgiGet( edtBarCuadern_Internalname) ;
                           n13933BarCuadern = false ;
                           A2829BarProPer = httpContext.cgiGet( edtBarProPer_Internalname) ;
                           A14204BarProPerI = httpContext.cgiGet( edtBarProPerI_Internalname) ;
                           A13934BarNormas = httpContext.cgiGet( edtBarNormas_Internalname) ;
                           A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2265BarExt = false ;
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
                                       e2226E2 ();
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
                                       e2326E2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2426E2 ();
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
                                       e2526E2 ();
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
                                    strup26E0( ) ;
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
                     if ( nCmpId == 170 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0170") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0170", "", sEvt);
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

   public void we26E2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm26E2( ) ;
         }
      }
   }

   public void pa26E2( )
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
            GX_FocusControl = edtavTotvaluebarkgm_Internalname ;
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
                                 String AV5Emprcod ,
                                 int AV36CliCodfrom ,
                                 int AV37CliCodto ,
                                 String AV16BarDisNumfrom ,
                                 String AV17BarDisNumto ,
                                 java.util.Date AV22BarFecGenfrom ,
                                 java.util.Date AV23BarFecGento ,
                                 byte AV32BarSitfrom ,
                                 byte AV33BarSitto ,
                                 java.util.Date AV18BarFecClifrom ,
                                 java.util.Date AV19BarFecClito ,
                                 java.util.Date AV20BarFecFprfrom ,
                                 java.util.Date AV21BarFecFprto ,
                                 java.util.Date AV24BarFecSalfrom ,
                                 java.util.Date AV25BarFecSalto ,
                                 String AV30BarSerfrom ,
                                 String AV31BarSerto ,
                                 short AV34BarTipArtfrom ,
                                 short AV35BarTipArtto ,
                                 String AV12BarColNomfrom ,
                                 String AV13BarColNomto ,
                                 int AV14BarColNumfrom ,
                                 int AV15BarColNumto ,
                                 String AV26BarNomClifrom ,
                                 String AV27BarNomClito ,
                                 int AV28BarNumClifrom ,
                                 int AV29BarNumClito ,
                                 int AV6BarCodfrom ,
                                 int AV11BarCodto ,
                                 byte AV9BarCodReofrom ,
                                 byte AV10BarCodReoto ,
                                 String AV7BarCodParfrom ,
                                 String AV8BarCodParto ,
                                 String AV38Cod_Idtx ,
                                 String AV69BarGirar ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV53ColumnsSelector ,
                                 String AV141Pgmname ,
                                 short AV114STNORM ,
                                 String AV136TFBarPlf ,
                                 java.math.BigDecimal AV129TotBarKgm ,
                                 java.math.BigDecimal AV131TotBarMtr ,
                                 long AV133TotBarPie ,
                                 short AV138Moda21 ,
                                 String A13878PedidoClie ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2326E2 ();
      GRID_nCurrentRecord = 0 ;
      rf26E2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_Test");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV141Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_test:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARSERDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A1652BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
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
      rf26E2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV141Pgmname = "Produccion.ConsultadeProduccion_Test" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV141Pgmname", AV141Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluebarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26E2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(34) ;
      /* Execute user event: Refresh */
      e2326E2 ();
      nGXsfl_34_idx = 1 ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_342( ) ;
      bGXsfl_34_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
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
         subsflControlProps_342( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV16BarDisNumfrom ,
                                              AV17BarDisNumto ,
                                              Integer.valueOf(AV36CliCodfrom) ,
                                              Integer.valueOf(AV37CliCodto) ,
                                              Byte.valueOf(AV32BarSitfrom) ,
                                              Byte.valueOf(AV33BarSitto) ,
                                              AV22BarFecGenfrom ,
                                              AV23BarFecGento ,
                                              AV24BarFecSalfrom ,
                                              AV25BarFecSalto ,
                                              AV18BarFecClifrom ,
                                              AV19BarFecClito ,
                                              AV20BarFecFprfrom ,
                                              AV21BarFecFprto ,
                                              AV30BarSerfrom ,
                                              AV31BarSerto ,
                                              AV12BarColNomfrom ,
                                              AV13BarColNomto ,
                                              Integer.valueOf(AV14BarColNumfrom) ,
                                              Integer.valueOf(AV15BarColNumto) ,
                                              AV26BarNomClifrom ,
                                              AV27BarNomClito ,
                                              Integer.valueOf(AV28BarNumClifrom) ,
                                              Integer.valueOf(AV29BarNumClito) ,
                                              Short.valueOf(AV34BarTipArtfrom) ,
                                              Short.valueOf(AV35BarTipArtto) ,
                                              AV136TFBarPlf ,
                                              Integer.valueOf(AV6BarCodfrom) ,
                                              Integer.valueOf(AV11BarCodto) ,
                                              Byte.valueOf(AV9BarCodReofrom) ,
                                              Byte.valueOf(AV10BarCodReoto) ,
                                              AV7BarCodParfrom ,
                                              AV8BarCodParto ,
                                              AV38Cod_Idtx ,
                                              AV69BarGirar ,
                                              A143BarDisNum ,
                                              Integer.valueOf(A252CliCod) ,
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
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A2829BarProPer ,
                                              A2454BarGirar ,
                                              AV5Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H026E9 */
         pr_default.execute(0, new Object[] {AV5Emprcod, AV16BarDisNumfrom, AV17BarDisNumto, Integer.valueOf(AV36CliCodfrom), Integer.valueOf(AV37CliCodto), Byte.valueOf(AV32BarSitfrom), Byte.valueOf(AV33BarSitto), AV22BarFecGenfrom, AV23BarFecGento, AV24BarFecSalfrom, AV25BarFecSalto, AV18BarFecClifrom, AV19BarFecClito, AV20BarFecFprfrom, AV21BarFecFprto, AV30BarSerfrom, AV31BarSerto, AV12BarColNomfrom, AV13BarColNomto, Integer.valueOf(AV14BarColNumfrom), Integer.valueOf(AV15BarColNumto), AV26BarNomClifrom, AV27BarNomClito, Integer.valueOf(AV28BarNumClifrom), Integer.valueOf(AV29BarNumClito), Short.valueOf(AV34BarTipArtfrom), Short.valueOf(AV35BarTipArtto), AV136TFBarPlf, Integer.valueOf(AV6BarCodfrom), Integer.valueOf(AV11BarCodto), Byte.valueOf(AV9BarCodReofrom), Byte.valueOf(AV10BarCodReoto), AV7BarCodParfrom, AV8BarCodParto, AV38Cod_Idtx, AV69BarGirar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_34_idx = 1 ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3030BarPlf = H026E9_A3030BarPlf[0] ;
            A1235BarNumCli = H026E9_A1235BarNumCli[0] ;
            A2265BarExt = H026E9_A2265BarExt[0] ;
            n2265BarExt = H026E9_n2265BarExt[0] ;
            A4348DisUsrCod = H026E9_A4348DisUsrCod[0] ;
            A4466BarAcaAnh = H026E9_A4466BarAcaAnh[0] ;
            A2454BarGirar = H026E9_A2454BarGirar[0] ;
            A161BarFecSal = H026E9_A161BarFecSal[0] ;
            A158BarFecFpr = H026E9_A158BarFecFpr[0] ;
            A155BarFecCli = H026E9_A155BarFecCli[0] ;
            A159BarFecGen = H026E9_A159BarFecGen[0] ;
            A213BarSit = H026E9_A213BarSit[0] ;
            A1234BarNomCli = H026E9_A1234BarNomCli[0] ;
            A136BarColNum = H026E9_A136BarColNum[0] ;
            A135BarColNom = H026E9_A135BarColNom[0] ;
            A13711BarTipArtD = H026E9_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H026E9_n13711BarTipArtD[0] ;
            A217BarTipArt = H026E9_A217BarTipArt[0] ;
            n217BarTipArt = H026E9_n217BarTipArt[0] ;
            A1652BarSerDsc = H026E9_A1652BarSerDsc[0] ;
            A212BarSer = H026E9_A212BarSer[0] ;
            A120BarAgrEst = H026E9_A120BarAgrEst[0] ;
            A279CliNom = H026E9_A279CliNom[0] ;
            A252CliCod = H026E9_A252CliCod[0] ;
            n252CliCod = H026E9_n252CliCod[0] ;
            A13933BarCuadern = H026E9_A13933BarCuadern[0] ;
            n13933BarCuadern = H026E9_n13933BarCuadern[0] ;
            A1955BarFasSig = H026E9_A1955BarFasSig[0] ;
            n1955BarFasSig = H026E9_n1955BarFasSig[0] ;
            A151BarFasCod = H026E9_A151BarFasCod[0] ;
            n151BarFasCod = H026E9_n151BarFasCod[0] ;
            A184BarMtr = H026E9_A184BarMtr[0] ;
            A166BarKgm = H026E9_A166BarKgm[0] ;
            A199BarPie1 = H026E9_A199BarPie1[0] ;
            A365DisDes = H026E9_A365DisDes[0] ;
            A898BarPieNDes = H026E9_A898BarPieNDes[0] ;
            A130BarCodPar = H026E9_A130BarCodPar[0] ;
            A132BarCodReo = H026E9_A132BarCodReo[0] ;
            A129BarCod = H026E9_A129BarCod[0] ;
            A2829BarProPer = H026E9_A2829BarProPer[0] ;
            A361DisCod = H026E9_A361DisCod[0] ;
            A143BarDisNum = H026E9_A143BarDisNum[0] ;
            A4812BarEncCli = H026E9_A4812BarEncCli[0] ;
            A396EmprCod = H026E9_A396EmprCod[0] ;
            A4348DisUsrCod = H026E9_A4348DisUsrCod[0] ;
            A13711BarTipArtD = H026E9_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H026E9_n13711BarTipArtD[0] ;
            A279CliNom = H026E9_A279CliNom[0] ;
            A13933BarCuadern = H026E9_A13933BarCuadern[0] ;
            n13933BarCuadern = H026E9_n13933BarCuadern[0] ;
            A1955BarFasSig = H026E9_A1955BarFasSig[0] ;
            n1955BarFasSig = H026E9_n1955BarFasSig[0] ;
            A151BarFasCod = H026E9_A151BarFasCod[0] ;
            n151BarFasCod = H026E9_n151BarFasCod[0] ;
            A184BarMtr = H026E9_A184BarMtr[0] ;
            A166BarKgm = H026E9_A166BarKgm[0] ;
            A199BarPie1 = H026E9_A199BarPie1[0] ;
            A898BarPieNDes = H026E9_A898BarPieNDes[0] ;
            GXt_int1 = A13930BarAlbUlti ;
            GXv_int2[0] = GXt_int1 ;
            new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int2) ;
            consultadeproduccion_test_impl.this.GXt_int1 = GXv_int2[0] ;
            A13930BarAlbUlti = GXt_int1 ;
            GXt_int3 = A13935BarAlbFact ;
            GXv_int4[0] = GXt_int3 ;
            new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int4) ;
            consultadeproduccion_test_impl.this.GXt_int3 = GXv_int4[0] ;
            A13935BarAlbFact = GXt_int3 ;
            GXt_char5 = A14204BarProPerI ;
            GXv_char6[0] = GXt_char5 ;
            new app.pinditexin(remoteHandle, context).execute( A396EmprCod, A2829BarProPer, GXv_char6) ;
            consultadeproduccion_test_impl.this.GXt_char5 = GXv_char6[0] ;
            A14204BarProPerI = GXt_char5 ;
            GXt_char5 = A13934BarNormas ;
            GXv_char6[0] = GXt_char5 ;
            new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
            consultadeproduccion_test_impl.this.GXt_char5 = GXv_char6[0] ;
            A13934BarNormas = GXt_char5 ;
            GXt_char5 = A13878PedidoClie ;
            GXv_char6[0] = A396EmprCod ;
            GXv_char7[0] = A4812BarEncCli ;
            GXv_char8[0] = A143BarDisNum ;
            GXv_char9[0] = GXt_char5 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char7, GXv_char8, GXv_char9) ;
            consultadeproduccion_test_impl.this.A396EmprCod = GXv_char6[0] ;
            consultadeproduccion_test_impl.this.A4812BarEncCli = GXv_char7[0] ;
            consultadeproduccion_test_impl.this.A143BarDisNum = GXv_char8[0] ;
            consultadeproduccion_test_impl.this.GXt_char5 = GXv_char9[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            A13878PedidoClie = GXt_char5 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            e2426E2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(34) ;
         wb26E0( ) ;
      }
      bGXsfl_34_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26E2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTNORM", GXutil.ltrim( localUtil.ntoc( AV114STNORM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTNORM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV114STNORM), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPLF", GXutil.rtrim( AV136TFBarPlf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPLF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV136TFBarPlf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV129TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV129TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV131TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV131TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARPIE", GXutil.ltrim( localUtil.ntoc( AV133TotBarPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133TotBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARSERDSC"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, GXutil.rtrim( localUtil.format( A1652BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV138Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138Moda21), "ZZZ9")));
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV16BarDisNumfrom ,
                                           AV17BarDisNumto ,
                                           Integer.valueOf(AV36CliCodfrom) ,
                                           Integer.valueOf(AV37CliCodto) ,
                                           Byte.valueOf(AV32BarSitfrom) ,
                                           Byte.valueOf(AV33BarSitto) ,
                                           AV22BarFecGenfrom ,
                                           AV23BarFecGento ,
                                           AV24BarFecSalfrom ,
                                           AV25BarFecSalto ,
                                           AV18BarFecClifrom ,
                                           AV19BarFecClito ,
                                           AV20BarFecFprfrom ,
                                           AV21BarFecFprto ,
                                           AV30BarSerfrom ,
                                           AV31BarSerto ,
                                           AV12BarColNomfrom ,
                                           AV13BarColNomto ,
                                           Integer.valueOf(AV14BarColNumfrom) ,
                                           Integer.valueOf(AV15BarColNumto) ,
                                           AV26BarNomClifrom ,
                                           AV27BarNomClito ,
                                           Integer.valueOf(AV28BarNumClifrom) ,
                                           Integer.valueOf(AV29BarNumClito) ,
                                           Short.valueOf(AV34BarTipArtfrom) ,
                                           Short.valueOf(AV35BarTipArtto) ,
                                           AV136TFBarPlf ,
                                           Integer.valueOf(AV6BarCodfrom) ,
                                           Integer.valueOf(AV11BarCodto) ,
                                           Byte.valueOf(AV9BarCodReofrom) ,
                                           Byte.valueOf(AV10BarCodReoto) ,
                                           AV7BarCodParfrom ,
                                           AV8BarCodParto ,
                                           AV38Cod_Idtx ,
                                           AV69BarGirar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
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
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H026E17 */
      pr_default.execute(1, new Object[] {AV5Emprcod, AV16BarDisNumfrom, AV17BarDisNumto, Integer.valueOf(AV36CliCodfrom), Integer.valueOf(AV37CliCodto), Byte.valueOf(AV32BarSitfrom), Byte.valueOf(AV33BarSitto), AV22BarFecGenfrom, AV23BarFecGento, AV24BarFecSalfrom, AV25BarFecSalto, AV18BarFecClifrom, AV19BarFecClito, AV20BarFecFprfrom, AV21BarFecFprto, AV30BarSerfrom, AV31BarSerto, AV12BarColNomfrom, AV13BarColNomto, Integer.valueOf(AV14BarColNumfrom), Integer.valueOf(AV15BarColNumto), AV26BarNomClifrom, AV27BarNomClito, Integer.valueOf(AV28BarNumClifrom), Integer.valueOf(AV29BarNumClito), Short.valueOf(AV34BarTipArtfrom), Short.valueOf(AV35BarTipArtto), AV136TFBarPlf, Integer.valueOf(AV6BarCodfrom), Integer.valueOf(AV11BarCodto), Byte.valueOf(AV9BarCodReofrom), Byte.valueOf(AV10BarCodReoto), AV7BarCodParfrom, AV8BarCodParto, AV38Cod_Idtx, AV69BarGirar});
      GRID_nRecordCount = H026E17_AGRID_nRecordCount[0] ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV36CliCodfrom, AV37CliCodto, AV16BarDisNumfrom, AV17BarDisNumto, AV22BarFecGenfrom, AV23BarFecGento, AV32BarSitfrom, AV33BarSitto, AV18BarFecClifrom, AV19BarFecClito, AV20BarFecFprfrom, AV21BarFecFprto, AV24BarFecSalfrom, AV25BarFecSalto, AV30BarSerfrom, AV31BarSerto, AV34BarTipArtfrom, AV35BarTipArtto, AV12BarColNomfrom, AV13BarColNomto, AV14BarColNumfrom, AV15BarColNumto, AV26BarNomClifrom, AV27BarNomClito, AV28BarNumClifrom, AV29BarNumClito, AV6BarCodfrom, AV11BarCodto, AV9BarCodReofrom, AV10BarCodReoto, AV7BarCodParfrom, AV8BarCodParto, AV38Cod_Idtx, AV69BarGirar, AV53ColumnsSelector, AV141Pgmname, AV114STNORM, AV136TFBarPlf, AV129TotBarKgm, AV131TotBarMtr, AV133TotBarPie, AV138Moda21, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV36CliCodfrom, AV37CliCodto, AV16BarDisNumfrom, AV17BarDisNumto, AV22BarFecGenfrom, AV23BarFecGento, AV32BarSitfrom, AV33BarSitto, AV18BarFecClifrom, AV19BarFecClito, AV20BarFecFprfrom, AV21BarFecFprto, AV24BarFecSalfrom, AV25BarFecSalto, AV30BarSerfrom, AV31BarSerto, AV34BarTipArtfrom, AV35BarTipArtto, AV12BarColNomfrom, AV13BarColNomto, AV14BarColNumfrom, AV15BarColNumto, AV26BarNomClifrom, AV27BarNomClito, AV28BarNumClifrom, AV29BarNumClito, AV6BarCodfrom, AV11BarCodto, AV9BarCodReofrom, AV10BarCodReoto, AV7BarCodParfrom, AV8BarCodParto, AV38Cod_Idtx, AV69BarGirar, AV53ColumnsSelector, AV141Pgmname, AV114STNORM, AV136TFBarPlf, AV129TotBarKgm, AV131TotBarMtr, AV133TotBarPie, AV138Moda21, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV36CliCodfrom, AV37CliCodto, AV16BarDisNumfrom, AV17BarDisNumto, AV22BarFecGenfrom, AV23BarFecGento, AV32BarSitfrom, AV33BarSitto, AV18BarFecClifrom, AV19BarFecClito, AV20BarFecFprfrom, AV21BarFecFprto, AV24BarFecSalfrom, AV25BarFecSalto, AV30BarSerfrom, AV31BarSerto, AV34BarTipArtfrom, AV35BarTipArtto, AV12BarColNomfrom, AV13BarColNomto, AV14BarColNumfrom, AV15BarColNumto, AV26BarNomClifrom, AV27BarNomClito, AV28BarNumClifrom, AV29BarNumClito, AV6BarCodfrom, AV11BarCodto, AV9BarCodReofrom, AV10BarCodReoto, AV7BarCodParfrom, AV8BarCodParto, AV38Cod_Idtx, AV69BarGirar, AV53ColumnsSelector, AV141Pgmname, AV114STNORM, AV136TFBarPlf, AV129TotBarKgm, AV131TotBarMtr, AV133TotBarPie, AV138Moda21, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV36CliCodfrom, AV37CliCodto, AV16BarDisNumfrom, AV17BarDisNumto, AV22BarFecGenfrom, AV23BarFecGento, AV32BarSitfrom, AV33BarSitto, AV18BarFecClifrom, AV19BarFecClito, AV20BarFecFprfrom, AV21BarFecFprto, AV24BarFecSalfrom, AV25BarFecSalto, AV30BarSerfrom, AV31BarSerto, AV34BarTipArtfrom, AV35BarTipArtto, AV12BarColNomfrom, AV13BarColNomto, AV14BarColNumfrom, AV15BarColNumto, AV26BarNomClifrom, AV27BarNomClito, AV28BarNumClifrom, AV29BarNumClito, AV6BarCodfrom, AV11BarCodto, AV9BarCodReofrom, AV10BarCodReoto, AV7BarCodParfrom, AV8BarCodParto, AV38Cod_Idtx, AV69BarGirar, AV53ColumnsSelector, AV141Pgmname, AV114STNORM, AV136TFBarPlf, AV129TotBarKgm, AV131TotBarMtr, AV133TotBarPie, AV138Moda21, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV36CliCodfrom, AV37CliCodto, AV16BarDisNumfrom, AV17BarDisNumto, AV22BarFecGenfrom, AV23BarFecGento, AV32BarSitfrom, AV33BarSitto, AV18BarFecClifrom, AV19BarFecClito, AV20BarFecFprfrom, AV21BarFecFprto, AV24BarFecSalfrom, AV25BarFecSalto, AV30BarSerfrom, AV31BarSerto, AV34BarTipArtfrom, AV35BarTipArtto, AV12BarColNomfrom, AV13BarColNomto, AV14BarColNumfrom, AV15BarColNumto, AV26BarNomClifrom, AV27BarNomClito, AV28BarNumClifrom, AV29BarNumClito, AV6BarCodfrom, AV11BarCodto, AV9BarCodReofrom, AV10BarCodReoto, AV7BarCodParfrom, AV8BarCodParto, AV38Cod_Idtx, AV69BarGirar, AV53ColumnsSelector, AV141Pgmname, AV114STNORM, AV136TFBarPlf, AV129TotBarKgm, AV131TotBarMtr, AV133TotBarPie, AV138Moda21, A13878PedidoClie, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV141Pgmname = "Produccion.ConsultadeProduccion_Test" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV141Pgmname", AV141Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluebarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26E0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2226E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV64DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV53ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_34 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_34"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV66GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV67GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV36CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV16BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV16BarDisNumfrom") ;
         wcpOAV17BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV17BarDisNumto") ;
         wcpOAV22BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV22BarFecGenfrom"), 0) ;
         wcpOAV23BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23BarFecGento"), 0) ;
         wcpOAV32BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV18BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV18BarFecClifrom"), 0) ;
         wcpOAV19BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV19BarFecClito"), 0) ;
         wcpOAV20BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20BarFecFprfrom"), 0) ;
         wcpOAV21BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV21BarFecFprto"), 0) ;
         wcpOAV24BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24BarFecSalfrom"), 0) ;
         wcpOAV25BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV25BarFecSalto"), 0) ;
         wcpOAV30BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV30BarSerfrom") ;
         wcpOAV31BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV31BarSerto") ;
         wcpOAV34BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV35BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV12BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV12BarColNomfrom") ;
         wcpOAV13BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV13BarColNomto") ;
         wcpOAV14BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV15BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV26BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV26BarNomClifrom") ;
         wcpOAV27BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV27BarNomClito") ;
         wcpOAV28BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV68muestras = httpContext.cgiGet( sPrefix+"wcpOAV68muestras") ;
         wcpOAV6BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV7BarCodParfrom") ;
         wcpOAV8BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV8BarCodParto") ;
         wcpOAV38Cod_Idtx = httpContext.cgiGet( sPrefix+"wcpOAV38Cod_Idtx") ;
         wcpOAV69BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV69BarGirar") ;
         A13878PedidoClie = httpContext.cgiGet( sPrefix+"PEDIDOCLIE") ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         /* Read variables values. */
         AV130TotValueBarKgm = httpContext.cgiGet( edtavTotvaluebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130TotValueBarKgm", AV130TotValueBarKgm);
         AV132TotValueBarMtr = httpContext.cgiGet( edtavTotvaluebarmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132TotValueBarMtr", AV132TotValueBarMtr);
         AV134TotValueBarPie = httpContext.cgiGet( edtavTotvaluebarpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134TotValueBarPie", AV134TotValueBarPie);
         AV141Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV141Pgmname", AV141Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_34_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
         if ( nGXsfl_34_idx > 0 )
         {
            cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
            cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
            AV113GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113GridActionGroup1), 4, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n217BarTipArt = false ;
            A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
            n13711BarTipArtD = false ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A155BarFecCli = localUtil.ctod( httpContext.cgiGet( edtBarFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A158BarFecFpr = localUtil.ctod( httpContext.cgiGet( edtBarFecFpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A161BarFecSal = localUtil.ctod( httpContext.cgiGet( edtBarFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
            n151BarFasCod = false ;
            A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
            n1955BarFasSig = false ;
            A13930BarAlbUlti = localUtil.ctol( httpContext.cgiGet( edtBarAlbUlti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A13935BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbFact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2454BarGirar = httpContext.cgiGet( edtBarGirar_Internalname) ;
            A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13933BarCuadern = httpContext.cgiGet( edtBarCuadern_Internalname) ;
            n13933BarCuadern = false ;
            A2829BarProPer = httpContext.cgiGet( edtBarProPer_Internalname) ;
            A14204BarProPerI = httpContext.cgiGet( edtBarProPerI_Internalname) ;
            A13934BarNormas = httpContext.cgiGet( edtBarNormas_Internalname) ;
            A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2265BarExt = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_Test");
         AV141Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV141Pgmname", AV141Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV141Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\consultadeproduccion_test:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2226E2 ();
      if (returnInSub) return;
   }

   public void e2226E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char5 = AV110Station ;
      GXv_char9[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char9) ;
      consultadeproduccion_test_impl.this.GXt_char5 = GXv_char9[0] ;
      AV110Station = GXt_char5 ;
      GXv_char9[0] = AV5Emprcod ;
      GXv_char8[0] = AV111EmprNom ;
      GXv_char7[0] = AV112UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV110Station, GXv_char9, GXv_char8, GXv_char7) ;
      consultadeproduccion_test_impl.this.AV5Emprcod = GXv_char9[0] ;
      consultadeproduccion_test_impl.this.AV111EmprNom = GXv_char8[0] ;
      consultadeproduccion_test_impl.this.AV112UsurCod = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = AV64DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] ;
      AV64DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int12 = (byte)(AV138Moda21) ;
      GXv_int13[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int13) ;
      consultadeproduccion_test_impl.this.GXt_int12 = GXv_int13[0] ;
      AV138Moda21 = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138Moda21), "ZZZ9")));
      GXt_int12 = (byte)(AV137cuaderno) ;
      GXv_int13[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "CNOENC", ""), GXv_int13) ;
      consultadeproduccion_test_impl.this.GXt_int12 = GXv_int13[0] ;
      AV137cuaderno = GXt_int12 ;
      GXt_int12 = (byte)(AV114STNORM) ;
      GXv_int13[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "STNORM", ""), GXv_int13) ;
      consultadeproduccion_test_impl.this.GXt_int12 = GXv_int13[0] ;
      AV114STNORM = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114STNORM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114STNORM), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTNORM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV114STNORM), "ZZZ9")));
   }

   public void e2326E2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext14[0] = AV40WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext14) ;
      AV40WWPContext = GXv_SdtWWPContext14[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV55Session.getValue("Produccion.ConsultadeProduccion_TestColumnsSelector"), "") != 0 )
      {
         AV51ColumnsSelectorXML = AV55Session.getValue("Produccion.ConsultadeProduccion_TestColumnsSelector") ;
         AV53ColumnsSelector.fromxml(AV51ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarDisNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarDisNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarAgrEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAgrEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarTipArt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArtD_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarFecFpr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecFpr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecFpr_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarFecSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarFasSig_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasSig_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasSig_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarAlbUlti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbUlti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbUlti_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarAlbFact_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbFact_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbFact_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarGirar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarGirar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGirar_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarAcaAnh_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAcaAnh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarCuadern_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCuadern_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCuadern_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarProPer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarProPer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarProPer_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarProPerI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarProPerI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarProPerI_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarNormas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNormas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNormas_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtDisUsrCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV53ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisUsrCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUsrCod_Visible), 5, 0), !bGXsfl_34_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      AV66GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridCurrentPage), 10, 0));
      AV67GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      edtBarNHdr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Columnheaderclass", edtBarNHdr_Columnheaderclass, !bGXsfl_34_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53ColumnsSelector", AV53ColumnsSelector);
   }

   public void e1126E2( )
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
         AV65PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV65PageToGo) ;
      }
   }

   public void e1226E2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2426E2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Situacion Fases", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Consulta Albaran Salida", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Recetas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Partes Produccion", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Packing List", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Consulta Almacen Tejido", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      GXt_int12 = (byte)(0) ;
      GXv_int13[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int13) ;
      consultadeproduccion_test_impl.this.GXt_int12 = GXv_int13[0] ;
      AV135TempBoolean = (boolean)((GXt_int12==1)) ;
      if ( AV135TempBoolean )
      {
         cmbavGridactiongroup1.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Alterar Data Ent.", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactiongroup1.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Impresion HDR", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      if ( GXutil.strcmp(A120BarAgrEst, "S") == 0 )
      {
         cmbavGridactiongroup1.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Agrupadas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( A2265BarExt == 2 )
      {
         edtBarNHdr_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
      }
      else if ( A2265BarExt == 1 )
      {
         edtBarNHdr_Columnclass = "WWColumn WWColumnWarning WWColumnWarningSingleCell" ;
      }
      else
      {
         edtBarNHdr_Columnclass = httpContext.getMessage( "WWColumn", "") ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(34) ;
      }
      sendrow_342( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
      {
         httpContext.doAjaxLoad(34, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV113GridActionGroup1, 4, 0)) );
   }

   public void e1326E2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV51ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV53ColumnsSelector.fromJSonString(AV51ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_TestColumnsSelector", ((GXutil.strcmp("", AV51ColumnsSelectorXML)==0) ? "" : AV53ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53ColumnsSelector", AV53ColumnsSelector);
   }

   public void e2526E2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV113GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO SITUACIONFASES' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV113GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO CONSULTAALBARANSALIDA' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV113GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO RECETAS' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV113GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO PARTESPRODUCCION' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV113GridActionGroup1 == 5 )
      {
         /* Execute user subroutine: 'DO PACKINGLIST' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV113GridActionGroup1 == 6 )
      {
         /* Execute user subroutine: 'DO PIEZAS' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV113GridActionGroup1 == 7 )
      {
         /* Execute user subroutine: 'DO MODIFICARFECHAE' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV113GridActionGroup1 == 8 )
      {
         /* Execute user subroutine: 'DO IMPRESIONHDR' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV113GridActionGroup1 == 9 )
      {
         /* Execute user subroutine: 'DO AGRUPADAS' */
         S252 ();
         if (returnInSub) return;
      }
      AV113GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV113GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53ColumnsSelector", AV53ColumnsSelector);
   }

   public void e1426E2( )
   {
      /* Situacionfases_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53ColumnsSelector", AV53ColumnsSelector);
   }

   public void e1526E2( )
   {
      /* Consultaalbaransalida_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53ColumnsSelector", AV53ColumnsSelector);
   }

   public void e1626E2( )
   {
      /* Recetas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53ColumnsSelector", AV53ColumnsSelector);
   }

   public void e1726E2( )
   {
      /* Partesproduccion_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53ColumnsSelector", AV53ColumnsSelector);
   }

   public void e1826E2( )
   {
      /* Piezas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53ColumnsSelector", AV53ColumnsSelector);
   }

   public void e1926E2( )
   {
      /* Agrupadas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53ColumnsSelector", AV53ColumnsSelector);
   }

   public void e2026E2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXv_char9[0] = AV49ExcelFilename ;
      GXv_char8[0] = AV50ErrorMessage ;
      new app.produccion.consultadeproduccion_testexport(remoteHandle, context).execute( GXv_char9, GXv_char8) ;
      consultadeproduccion_test_impl.this.AV49ExcelFilename = GXv_char9[0] ;
      consultadeproduccion_test_impl.this.AV50ErrorMessage = GXv_char8[0] ;
      if ( GXutil.strcmp(AV49ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV49ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV50ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e2126E2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.produccion.consultadeproduccion_testexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV53ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliCod", "", "Cliente", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliNom", "", "Nombre", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarDisNum", "", "Ped.  Cli.", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNHdr", "", "N° Hdr", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAgrEst", "", "A?", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSer", "", "Articulo", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSerDsc", "", "Descripcion", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarTipArt", "", "Tip Art", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarTipArtDsc", "", "Descripcion", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNom", "", "Color", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNum", "", "Numero", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNomCli", "", "Color Cliente", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarKgm", "", "Kilos", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarMtr", "", "Metros", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarPie", "", "Piezas", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSit", "", "Situacion", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecGen", "Fecha", "Fecha HDR", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecCli", "Fecha", "Disp Cli", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecFpr", "Fecha", " Ent Prev", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecSal", "Fecha", "Salida", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFasCod", "", "Ult. Fase", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFasSig", "", "Sig. Fase", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAlbUltimo", "", "Ultimo Albaran", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAlbFact", "", "Factura", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarGirar", "", "Coleccion", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( AV5Emprcod, httpContext.getMessage( "CNOENC", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAcaAnh", "", "Cuaderno", true, "") ;
         AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "", "", "", false, "") ;
         AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarCuaderno", "", "Descripcion", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarProPer", "", "CTW", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarProPerIdtx", "", "Descripcion", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      if ( AV114STNORM == 1 )
      {
         GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNormas", "", "Normas Estandars Textiles", true, "") ;
         AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "", "", "", false, "") ;
         AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
      GXv_SdtWWPColumnsSelector15[0] = AV53ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "DisUsrCod", "", "Usuario", true, "") ;
      AV53ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXt_char5 = AV52UserCustomValue ;
      GXv_char9[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_TestColumnsSelector", GXv_char9) ;
      consultadeproduccion_test_impl.this.GXt_char5 = GXv_char9[0] ;
      AV52UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV52UserCustomValue)==0) ) )
      {
         AV54ColumnsSelectorAux.fromxml(AV52UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector15[0] = AV54ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector16[0] = AV53ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, GXv_SdtWWPColumnsSelector16) ;
         AV54ColumnsSelectorAux = GXv_SdtWWPColumnsSelector15[0] ;
         AV53ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
   }

   public void S172( )
   {
      /* 'DO SITUACIONFASES' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "SITUACIONFASES_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'DO CONSULTAALBARANSALIDA' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "CONSULTAALBARANSALIDA_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S192( )
   {
      /* 'DO RECETAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "RECETAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S202( )
   {
      /* 'DO PARTESPRODUCCION' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "PARTESPRODUCCION_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S212( )
   {
      /* 'DO PACKINGLIST' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_packinglist", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S222( )
   {
      /* 'DO PIEZAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "PIEZAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S232( )
   {
      /* 'DO MODIFICARFECHAE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_modfecent", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.formatDateParm(A158BarFecFpr))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum","BarFecFpr"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S242( )
   {
      /* 'DO IMPRESIONHDR' Routine */
      returnInSub = false ;
      if ( AV138Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.rhdrmod", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir el formato", ""));
      }
   }

   public void S252( )
   {
      /* 'DO AGRUPADAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "AGRUPADAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV55Session.getValue(AV141Pgmname+"GridState"), "") == 0 )
      {
         AV44GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV141Pgmname+"GridState"), null, null);
      }
      else
      {
         AV44GridState.fromxml(AV55Session.getValue(AV141Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV44GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV44GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV44GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV44GridState.fromxml(AV55Session.getValue(AV141Pgmname+"GridState"), null, null);
      AV44GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      AV44GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV44GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV141Pgmname+"GridState", AV44GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV42TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV42TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV141Pgmname );
      AV42TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV42TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV41HTTPRequest.getScriptName()+"?"+AV41HTTPRequest.getQuerystring() );
      AV42TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.HojadeRuta_TRN" );
      AV55Session.setValue("TrnContext", AV42TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV129TotBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129TotBarKgm", GXutil.ltrimstr( AV129TotBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV129TotBarKgm, "ZZZZZ9.99")));
      AV131TotBarMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131TotBarMtr", GXutil.ltrimstr( AV131TotBarMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV131TotBarMtr, "ZZZZZ9.99")));
      AV133TotBarPie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133TotBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV133TotBarPie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133TotBarPie), "ZZZZZ9")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV16BarDisNumfrom ,
                                           AV17BarDisNumto ,
                                           Integer.valueOf(AV36CliCodfrom) ,
                                           Integer.valueOf(AV37CliCodto) ,
                                           Byte.valueOf(AV32BarSitfrom) ,
                                           Byte.valueOf(AV33BarSitto) ,
                                           AV22BarFecGenfrom ,
                                           AV23BarFecGento ,
                                           AV24BarFecSalfrom ,
                                           AV25BarFecSalto ,
                                           AV18BarFecClifrom ,
                                           AV19BarFecClito ,
                                           AV20BarFecFprfrom ,
                                           AV21BarFecFprto ,
                                           AV30BarSerfrom ,
                                           AV31BarSerto ,
                                           AV12BarColNomfrom ,
                                           AV13BarColNomto ,
                                           Integer.valueOf(AV14BarColNumfrom) ,
                                           Integer.valueOf(AV15BarColNumto) ,
                                           AV26BarNomClifrom ,
                                           AV27BarNomClito ,
                                           Integer.valueOf(AV28BarNumClifrom) ,
                                           Integer.valueOf(AV29BarNumClito) ,
                                           Short.valueOf(AV34BarTipArtfrom) ,
                                           Short.valueOf(AV35BarTipArtto) ,
                                           AV136TFBarPlf ,
                                           Integer.valueOf(AV6BarCodfrom) ,
                                           Integer.valueOf(AV11BarCodto) ,
                                           Byte.valueOf(AV9BarCodReofrom) ,
                                           Byte.valueOf(AV10BarCodReoto) ,
                                           AV7BarCodParfrom ,
                                           AV8BarCodParto ,
                                           AV38Cod_Idtx ,
                                           AV69BarGirar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
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
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H026E19 */
      pr_default.execute(2, new Object[] {AV5Emprcod, AV16BarDisNumfrom, AV17BarDisNumto, Integer.valueOf(AV36CliCodfrom), Integer.valueOf(AV37CliCodto), Byte.valueOf(AV32BarSitfrom), Byte.valueOf(AV33BarSitto), AV22BarFecGenfrom, AV23BarFecGento, AV24BarFecSalfrom, AV25BarFecSalto, AV18BarFecClifrom, AV19BarFecClito, AV20BarFecFprfrom, AV21BarFecFprto, AV30BarSerfrom, AV31BarSerto, AV12BarColNomfrom, AV13BarColNomto, Integer.valueOf(AV14BarColNumfrom), Integer.valueOf(AV15BarColNumto), AV26BarNomClifrom, AV27BarNomClito, Integer.valueOf(AV28BarNumClifrom), Integer.valueOf(AV29BarNumClito), Short.valueOf(AV34BarTipArtfrom), Short.valueOf(AV35BarTipArtto), AV136TFBarPlf, Integer.valueOf(AV6BarCodfrom), Integer.valueOf(AV11BarCodto), Byte.valueOf(AV9BarCodReofrom), Byte.valueOf(AV10BarCodReoto), AV7BarCodParfrom, AV8BarCodParto, AV38Cod_Idtx, AV69BarGirar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2454BarGirar = H026E19_A2454BarGirar[0] ;
         A2829BarProPer = H026E19_A2829BarProPer[0] ;
         A130BarCodPar = H026E19_A130BarCodPar[0] ;
         A132BarCodReo = H026E19_A132BarCodReo[0] ;
         A129BarCod = H026E19_A129BarCod[0] ;
         A3030BarPlf = H026E19_A3030BarPlf[0] ;
         A217BarTipArt = H026E19_A217BarTipArt[0] ;
         n217BarTipArt = H026E19_n217BarTipArt[0] ;
         A1235BarNumCli = H026E19_A1235BarNumCli[0] ;
         A1234BarNomCli = H026E19_A1234BarNomCli[0] ;
         A136BarColNum = H026E19_A136BarColNum[0] ;
         A135BarColNom = H026E19_A135BarColNom[0] ;
         A212BarSer = H026E19_A212BarSer[0] ;
         A158BarFecFpr = H026E19_A158BarFecFpr[0] ;
         A155BarFecCli = H026E19_A155BarFecCli[0] ;
         A161BarFecSal = H026E19_A161BarFecSal[0] ;
         A159BarFecGen = H026E19_A159BarFecGen[0] ;
         A213BarSit = H026E19_A213BarSit[0] ;
         A252CliCod = H026E19_A252CliCod[0] ;
         n252CliCod = H026E19_n252CliCod[0] ;
         A143BarDisNum = H026E19_A143BarDisNum[0] ;
         A396EmprCod = H026E19_A396EmprCod[0] ;
         A166BarKgm = H026E19_A166BarKgm[0] ;
         A184BarMtr = H026E19_A184BarMtr[0] ;
         A199BarPie1 = H026E19_A199BarPie1[0] ;
         A365DisDes = H026E19_A365DisDes[0] ;
         A898BarPieNDes = H026E19_A898BarPieNDes[0] ;
         A166BarKgm = H026E19_A166BarKgm[0] ;
         A184BarMtr = H026E19_A184BarMtr[0] ;
         A199BarPie1 = H026E19_A199BarPie1[0] ;
         A898BarPieNDes = H026E19_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV129TotBarKgm = A166BarKgm.add(AV129TotBarKgm) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129TotBarKgm", GXutil.ltrimstr( AV129TotBarKgm, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV129TotBarKgm, "ZZZZZ9.99")));
         AV131TotBarMtr = A184BarMtr.add(AV131TotBarMtr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131TotBarMtr", GXutil.ltrimstr( AV131TotBarMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV131TotBarMtr, "ZZZZZ9.99")));
         AV133TotBarPie = (long)(A198BarPie+AV133TotBarPie) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133TotBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV133TotBarPie), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV133TotBarPie), "ZZZZZ9")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV130TotValueBarKgm = localUtil.format( AV129TotBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130TotValueBarKgm", AV130TotValueBarKgm);
      AV132TotValueBarMtr = localUtil.format( AV131TotBarMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132TotValueBarMtr", AV132TotValueBarMtr);
      AV134TotValueBarPie = localUtil.format( DecimalUtil.doubleToDec(AV133TotBarPie), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134TotValueBarPie", AV134TotValueBarPie);
   }

   public void wb_table9_162_26E2( boolean wbgen )
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
         wb_table9_162_26E2e( true) ;
      }
      else
      {
         wb_table9_162_26E2e( false) ;
      }
   }

   public void wb_table8_157_26E2( boolean wbgen )
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
         wb_table8_157_26E2e( true) ;
      }
      else
      {
         wb_table8_157_26E2e( false) ;
      }
   }

   public void wb_table7_152_26E2( boolean wbgen )
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
         wb_table7_152_26E2e( true) ;
      }
      else
      {
         wb_table7_152_26E2e( false) ;
      }
   }

   public void wb_table6_147_26E2( boolean wbgen )
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
         wb_table6_147_26E2e( true) ;
      }
      else
      {
         wb_table6_147_26E2e( false) ;
      }
   }

   public void wb_table5_142_26E2( boolean wbgen )
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
         wb_table5_142_26E2e( true) ;
      }
      else
      {
         wb_table5_142_26E2e( false) ;
      }
   }

   public void wb_table4_137_26E2( boolean wbgen )
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
         wb_table4_137_26E2e( true) ;
      }
      else
      {
         wb_table4_137_26E2e( false) ;
      }
   }

   public void wb_table3_132_26E2( boolean wbgen )
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
         wb_table3_132_26E2e( true) ;
      }
      else
      {
         wb_table3_132_26E2e( false) ;
      }
   }

   public void wb_table2_73_26E2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgm_Internalname, httpContext.getMessage( "Tot Value Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgm_Internalname, AV130TotValueBarKgm, GXutil.rtrim( localUtil.format( AV130TotValueBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtr_Internalname, httpContext.getMessage( "Tot Value Bar Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtr_Internalname, AV132TotValueBarMtr, GXutil.rtrim( localUtil.format( AV132TotValueBarMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpie_Internalname, httpContext.getMessage( "Tot Value Bar Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpie_Internalname, AV134TotValueBarPie, GXutil.rtrim( localUtil.format( AV134TotValueBarPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_Test.htm");
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_73_26E2e( true) ;
      }
      else
      {
         wb_table2_73_26E2e( false) ;
      }
   }

   public void wb_table1_23_26E2( boolean wbgen )
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
         wb_table1_23_26E2e( true) ;
      }
      else
      {
         wb_table1_23_26E2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV36CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliCodfrom), 6, 0));
      AV37CliCodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliCodto), 6, 0));
      AV16BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarDisNumfrom", AV16BarDisNumfrom);
      AV17BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarDisNumto", AV17BarDisNumto);
      AV22BarFecGenfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarFecGenfrom", localUtil.format(AV22BarFecGenfrom, "99/99/99"));
      AV23BarFecGento = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarFecGento", localUtil.format(AV23BarFecGento, "99/99/99"));
      AV32BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSitfrom), 2, 0));
      AV33BarSitto = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarSitto), 2, 0));
      AV18BarFecClifrom = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarFecClifrom", localUtil.format(AV18BarFecClifrom, "99/99/99"));
      AV19BarFecClito = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarFecClito", localUtil.format(AV19BarFecClito, "99/99/99"));
      AV20BarFecFprfrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarFecFprfrom", localUtil.format(AV20BarFecFprfrom, "99/99/99"));
      AV21BarFecFprto = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarFecFprto", localUtil.format(AV21BarFecFprto, "99/99/99"));
      AV24BarFecSalfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarFecSalfrom", localUtil.format(AV24BarFecSalfrom, "99/99/99"));
      AV25BarFecSalto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarFecSalto", localUtil.format(AV25BarFecSalto, "99/99/99"));
      AV30BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarSerfrom", AV30BarSerfrom);
      AV31BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarSerto", AV31BarSerto);
      AV34BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarTipArtfrom), 4, 0));
      AV35BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
      AV12BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarColNomfrom", AV12BarColNomfrom);
      AV13BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarColNomto", AV13BarColNomto);
      AV14BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumfrom), 6, 0));
      AV15BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarColNumto), 6, 0));
      AV26BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarNomClifrom", AV26BarNomClifrom);
      AV27BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarNomClito", AV27BarNomClito);
      AV28BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,25,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarNumClifrom), 6, 0));
      AV29BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,26,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarNumClito), 6, 0));
      AV34BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarTipArtfrom), 4, 0));
      AV35BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
      AV68muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68muestras", AV68muestras);
      AV6BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,30,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodfrom), 8, 0));
      AV11BarCodto = ((Number) GXutil.testNumericType( getParm(obj,31,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarCodto), 8, 0));
      AV9BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCodReofrom", GXutil.str( AV9BarCodReofrom, 1, 0));
      AV10BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReoto", GXutil.str( AV10BarCodReoto, 1, 0));
      AV7BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodParfrom", AV7BarCodParfrom);
      AV8BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodParto", AV8BarCodParto);
      AV38Cod_Idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Cod_Idtx", AV38Cod_Idtx);
      AV69BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarGirar", AV69BarGirar);
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
      pa26E2( ) ;
      ws26E2( ) ;
      we26E2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV36CliCodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV37CliCodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV16BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV17BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV22BarFecGenfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV23BarFecGento = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV32BarSitfrom = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV33BarSitto = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV18BarFecClifrom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV19BarFecClito = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV20BarFecFprfrom = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV21BarFecFprto = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV24BarFecSalfrom = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV25BarFecSalto = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV30BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV31BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV34BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV35BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV12BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV13BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV14BarColNumfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
      sCtrlAV15BarColNumto = (String)getParm(obj,22,TypeConstants.STRING) ;
      sCtrlAV26BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      sCtrlAV27BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      sCtrlAV28BarNumClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
      sCtrlAV29BarNumClito = (String)getParm(obj,26,TypeConstants.STRING) ;
      sCtrlAV34BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV35BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV68muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      sCtrlAV6BarCodfrom = (String)getParm(obj,30,TypeConstants.STRING) ;
      sCtrlAV11BarCodto = (String)getParm(obj,31,TypeConstants.STRING) ;
      sCtrlAV9BarCodReofrom = (String)getParm(obj,32,TypeConstants.STRING) ;
      sCtrlAV10BarCodReoto = (String)getParm(obj,33,TypeConstants.STRING) ;
      sCtrlAV7BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      sCtrlAV8BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      sCtrlAV38Cod_Idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      sCtrlAV69BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa26E2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\consultadeproduccion_test", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa26E2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV36CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliCodfrom), 6, 0));
         AV37CliCodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliCodto), 6, 0));
         AV16BarDisNumfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarDisNumfrom", AV16BarDisNumfrom);
         AV17BarDisNumto = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarDisNumto", AV17BarDisNumto);
         AV22BarFecGenfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarFecGenfrom", localUtil.format(AV22BarFecGenfrom, "99/99/99"));
         AV23BarFecGento = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarFecGento", localUtil.format(AV23BarFecGento, "99/99/99"));
         AV32BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSitfrom), 2, 0));
         AV33BarSitto = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarSitto), 2, 0));
         AV18BarFecClifrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarFecClifrom", localUtil.format(AV18BarFecClifrom, "99/99/99"));
         AV19BarFecClito = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarFecClito", localUtil.format(AV19BarFecClito, "99/99/99"));
         AV20BarFecFprfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarFecFprfrom", localUtil.format(AV20BarFecFprfrom, "99/99/99"));
         AV21BarFecFprto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarFecFprto", localUtil.format(AV21BarFecFprto, "99/99/99"));
         AV24BarFecSalfrom = (java.util.Date)getParm(obj,15,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarFecSalfrom", localUtil.format(AV24BarFecSalfrom, "99/99/99"));
         AV25BarFecSalto = (java.util.Date)getParm(obj,16,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarFecSalto", localUtil.format(AV25BarFecSalto, "99/99/99"));
         AV30BarSerfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarSerfrom", AV30BarSerfrom);
         AV31BarSerto = (String)getParm(obj,18,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarSerto", AV31BarSerto);
         AV34BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarTipArtfrom), 4, 0));
         AV35BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
         AV12BarColNomfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarColNomfrom", AV12BarColNomfrom);
         AV13BarColNomto = (String)getParm(obj,22,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarColNomto", AV13BarColNomto);
         AV14BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumfrom), 6, 0));
         AV15BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,24,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarColNumto), 6, 0));
         AV26BarNomClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarNomClifrom", AV26BarNomClifrom);
         AV27BarNomClito = (String)getParm(obj,26,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarNomClito", AV27BarNomClito);
         AV28BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,27,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarNumClifrom), 6, 0));
         AV29BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,28,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarNumClito), 6, 0));
         AV34BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarTipArtfrom), 4, 0));
         AV35BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
         AV68muestras = (String)getParm(obj,31,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68muestras", AV68muestras);
         AV6BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodfrom), 8, 0));
         AV11BarCodto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarCodto), 8, 0));
         AV9BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,34,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCodReofrom", GXutil.str( AV9BarCodReofrom, 1, 0));
         AV10BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,35,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReoto", GXutil.str( AV10BarCodReoto, 1, 0));
         AV7BarCodParfrom = (String)getParm(obj,36,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodParfrom", AV7BarCodParfrom);
         AV8BarCodParto = (String)getParm(obj,37,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodParto", AV8BarCodParto);
         AV38Cod_Idtx = (String)getParm(obj,38,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Cod_Idtx", AV38Cod_Idtx);
         AV69BarGirar = (String)getParm(obj,39,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarGirar", AV69BarGirar);
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV36CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV16BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV16BarDisNumfrom") ;
      wcpOAV17BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV17BarDisNumto") ;
      wcpOAV22BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV22BarFecGenfrom"), 0) ;
      wcpOAV23BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23BarFecGento"), 0) ;
      wcpOAV32BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV18BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV18BarFecClifrom"), 0) ;
      wcpOAV19BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV19BarFecClito"), 0) ;
      wcpOAV20BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20BarFecFprfrom"), 0) ;
      wcpOAV21BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV21BarFecFprto"), 0) ;
      wcpOAV24BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24BarFecSalfrom"), 0) ;
      wcpOAV25BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV25BarFecSalto"), 0) ;
      wcpOAV30BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV30BarSerfrom") ;
      wcpOAV31BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV31BarSerto") ;
      wcpOAV34BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV12BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV12BarColNomfrom") ;
      wcpOAV13BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV13BarColNomto") ;
      wcpOAV14BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV15BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV26BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV26BarNomClifrom") ;
      wcpOAV27BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV27BarNomClito") ;
      wcpOAV28BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV68muestras = httpContext.cgiGet( sPrefix+"wcpOAV68muestras") ;
      wcpOAV6BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV7BarCodParfrom") ;
      wcpOAV8BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV8BarCodParto") ;
      wcpOAV38Cod_Idtx = httpContext.cgiGet( sPrefix+"wcpOAV38Cod_Idtx") ;
      wcpOAV69BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV69BarGirar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV36CliCodfrom != wcpOAV36CliCodfrom ) || ( AV37CliCodto != wcpOAV37CliCodto ) || ( GXutil.strcmp(AV16BarDisNumfrom, wcpOAV16BarDisNumfrom) != 0 ) || ( GXutil.strcmp(AV17BarDisNumto, wcpOAV17BarDisNumto) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV22BarFecGenfrom), GXutil.resetTime(wcpOAV22BarFecGenfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV23BarFecGento), GXutil.resetTime(wcpOAV23BarFecGento)) ) || ( AV32BarSitfrom != wcpOAV32BarSitfrom ) || ( AV33BarSitto != wcpOAV33BarSitto ) || !( GXutil.dateCompare(GXutil.resetTime(AV18BarFecClifrom), GXutil.resetTime(wcpOAV18BarFecClifrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV19BarFecClito), GXutil.resetTime(wcpOAV19BarFecClito)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV20BarFecFprfrom), GXutil.resetTime(wcpOAV20BarFecFprfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV21BarFecFprto), GXutil.resetTime(wcpOAV21BarFecFprto)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV24BarFecSalfrom), GXutil.resetTime(wcpOAV24BarFecSalfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV25BarFecSalto), GXutil.resetTime(wcpOAV25BarFecSalto)) ) || ( GXutil.strcmp(AV30BarSerfrom, wcpOAV30BarSerfrom) != 0 ) || ( GXutil.strcmp(AV31BarSerto, wcpOAV31BarSerto) != 0 ) || ( AV34BarTipArtfrom != wcpOAV34BarTipArtfrom ) || ( AV35BarTipArtto != wcpOAV35BarTipArtto ) || ( GXutil.strcmp(AV12BarColNomfrom, wcpOAV12BarColNomfrom) != 0 ) || ( GXutil.strcmp(AV13BarColNomto, wcpOAV13BarColNomto) != 0 ) || ( AV14BarColNumfrom != wcpOAV14BarColNumfrom ) || ( AV15BarColNumto != wcpOAV15BarColNumto ) || ( GXutil.strcmp(AV26BarNomClifrom, wcpOAV26BarNomClifrom) != 0 ) || ( GXutil.strcmp(AV27BarNomClito, wcpOAV27BarNomClito) != 0 ) || ( AV28BarNumClifrom != wcpOAV28BarNumClifrom ) || ( AV29BarNumClito != wcpOAV29BarNumClito ) || ( GXutil.strcmp(AV68muestras, wcpOAV68muestras) != 0 ) || ( AV6BarCodfrom != wcpOAV6BarCodfrom ) || ( AV11BarCodto != wcpOAV11BarCodto ) || ( AV9BarCodReofrom != wcpOAV9BarCodReofrom ) || ( AV10BarCodReoto != wcpOAV10BarCodReoto ) || ( GXutil.strcmp(AV7BarCodParfrom, wcpOAV7BarCodParfrom) != 0 ) || ( GXutil.strcmp(AV8BarCodParto, wcpOAV8BarCodParto) != 0 ) || ( GXutil.strcmp(AV38Cod_Idtx, wcpOAV38Cod_Idtx) != 0 ) || ( GXutil.strcmp(AV69BarGirar, wcpOAV69BarGirar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV36CliCodfrom = AV36CliCodfrom ;
      wcpOAV37CliCodto = AV37CliCodto ;
      wcpOAV16BarDisNumfrom = AV16BarDisNumfrom ;
      wcpOAV17BarDisNumto = AV17BarDisNumto ;
      wcpOAV22BarFecGenfrom = AV22BarFecGenfrom ;
      wcpOAV23BarFecGento = AV23BarFecGento ;
      wcpOAV32BarSitfrom = AV32BarSitfrom ;
      wcpOAV33BarSitto = AV33BarSitto ;
      wcpOAV18BarFecClifrom = AV18BarFecClifrom ;
      wcpOAV19BarFecClito = AV19BarFecClito ;
      wcpOAV20BarFecFprfrom = AV20BarFecFprfrom ;
      wcpOAV21BarFecFprto = AV21BarFecFprto ;
      wcpOAV24BarFecSalfrom = AV24BarFecSalfrom ;
      wcpOAV25BarFecSalto = AV25BarFecSalto ;
      wcpOAV30BarSerfrom = AV30BarSerfrom ;
      wcpOAV31BarSerto = AV31BarSerto ;
      wcpOAV34BarTipArtfrom = AV34BarTipArtfrom ;
      wcpOAV35BarTipArtto = AV35BarTipArtto ;
      wcpOAV12BarColNomfrom = AV12BarColNomfrom ;
      wcpOAV13BarColNomto = AV13BarColNomto ;
      wcpOAV14BarColNumfrom = AV14BarColNumfrom ;
      wcpOAV15BarColNumto = AV15BarColNumto ;
      wcpOAV26BarNomClifrom = AV26BarNomClifrom ;
      wcpOAV27BarNomClito = AV27BarNomClito ;
      wcpOAV28BarNumClifrom = AV28BarNumClifrom ;
      wcpOAV29BarNumClito = AV29BarNumClito ;
      wcpOAV68muestras = AV68muestras ;
      wcpOAV6BarCodfrom = AV6BarCodfrom ;
      wcpOAV11BarCodto = AV11BarCodto ;
      wcpOAV9BarCodReofrom = AV9BarCodReofrom ;
      wcpOAV10BarCodReoto = AV10BarCodReoto ;
      wcpOAV7BarCodParfrom = AV7BarCodParfrom ;
      wcpOAV8BarCodParto = AV8BarCodParto ;
      wcpOAV38Cod_Idtx = AV38Cod_Idtx ;
      wcpOAV69BarGirar = AV69BarGirar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV36CliCodfrom = httpContext.cgiGet( sPrefix+"AV36CliCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV36CliCodfrom) > 0 )
      {
         AV36CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36CliCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliCodfrom), 6, 0));
      }
      else
      {
         AV36CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36CliCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37CliCodto = httpContext.cgiGet( sPrefix+"AV37CliCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV37CliCodto) > 0 )
      {
         AV37CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37CliCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliCodto), 6, 0));
      }
      else
      {
         AV37CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37CliCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV16BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV16BarDisNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV16BarDisNumfrom) > 0 )
      {
         AV16BarDisNumfrom = httpContext.cgiGet( sCtrlAV16BarDisNumfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarDisNumfrom", AV16BarDisNumfrom);
      }
      else
      {
         AV16BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV16BarDisNumfrom_PARM") ;
      }
      sCtrlAV17BarDisNumto = httpContext.cgiGet( sPrefix+"AV17BarDisNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV17BarDisNumto) > 0 )
      {
         AV17BarDisNumto = httpContext.cgiGet( sCtrlAV17BarDisNumto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarDisNumto", AV17BarDisNumto);
      }
      else
      {
         AV17BarDisNumto = httpContext.cgiGet( sPrefix+"AV17BarDisNumto_PARM") ;
      }
      sCtrlAV22BarFecGenfrom = httpContext.cgiGet( sPrefix+"AV22BarFecGenfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV22BarFecGenfrom) > 0 )
      {
         AV22BarFecGenfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV22BarFecGenfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarFecGenfrom", localUtil.format(AV22BarFecGenfrom, "99/99/99"));
      }
      else
      {
         AV22BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV22BarFecGenfrom_PARM"), 0) ;
      }
      sCtrlAV23BarFecGento = httpContext.cgiGet( sPrefix+"AV23BarFecGento_CTRL") ;
      if ( GXutil.len( sCtrlAV23BarFecGento) > 0 )
      {
         AV23BarFecGento = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV23BarFecGento), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarFecGento", localUtil.format(AV23BarFecGento, "99/99/99"));
      }
      else
      {
         AV23BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV23BarFecGento_PARM"), 0) ;
      }
      sCtrlAV32BarSitfrom = httpContext.cgiGet( sPrefix+"AV32BarSitfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV32BarSitfrom) > 0 )
      {
         AV32BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32BarSitfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSitfrom), 2, 0));
      }
      else
      {
         AV32BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32BarSitfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33BarSitto = httpContext.cgiGet( sPrefix+"AV33BarSitto_CTRL") ;
      if ( GXutil.len( sCtrlAV33BarSitto) > 0 )
      {
         AV33BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33BarSitto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarSitto), 2, 0));
      }
      else
      {
         AV33BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33BarSitto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV18BarFecClifrom = httpContext.cgiGet( sPrefix+"AV18BarFecClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV18BarFecClifrom) > 0 )
      {
         AV18BarFecClifrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV18BarFecClifrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarFecClifrom", localUtil.format(AV18BarFecClifrom, "99/99/99"));
      }
      else
      {
         AV18BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV18BarFecClifrom_PARM"), 0) ;
      }
      sCtrlAV19BarFecClito = httpContext.cgiGet( sPrefix+"AV19BarFecClito_CTRL") ;
      if ( GXutil.len( sCtrlAV19BarFecClito) > 0 )
      {
         AV19BarFecClito = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV19BarFecClito), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarFecClito", localUtil.format(AV19BarFecClito, "99/99/99"));
      }
      else
      {
         AV19BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV19BarFecClito_PARM"), 0) ;
      }
      sCtrlAV20BarFecFprfrom = httpContext.cgiGet( sPrefix+"AV20BarFecFprfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV20BarFecFprfrom) > 0 )
      {
         AV20BarFecFprfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV20BarFecFprfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarFecFprfrom", localUtil.format(AV20BarFecFprfrom, "99/99/99"));
      }
      else
      {
         AV20BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV20BarFecFprfrom_PARM"), 0) ;
      }
      sCtrlAV21BarFecFprto = httpContext.cgiGet( sPrefix+"AV21BarFecFprto_CTRL") ;
      if ( GXutil.len( sCtrlAV21BarFecFprto) > 0 )
      {
         AV21BarFecFprto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV21BarFecFprto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarFecFprto", localUtil.format(AV21BarFecFprto, "99/99/99"));
      }
      else
      {
         AV21BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV21BarFecFprto_PARM"), 0) ;
      }
      sCtrlAV24BarFecSalfrom = httpContext.cgiGet( sPrefix+"AV24BarFecSalfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV24BarFecSalfrom) > 0 )
      {
         AV24BarFecSalfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV24BarFecSalfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarFecSalfrom", localUtil.format(AV24BarFecSalfrom, "99/99/99"));
      }
      else
      {
         AV24BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV24BarFecSalfrom_PARM"), 0) ;
      }
      sCtrlAV25BarFecSalto = httpContext.cgiGet( sPrefix+"AV25BarFecSalto_CTRL") ;
      if ( GXutil.len( sCtrlAV25BarFecSalto) > 0 )
      {
         AV25BarFecSalto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV25BarFecSalto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarFecSalto", localUtil.format(AV25BarFecSalto, "99/99/99"));
      }
      else
      {
         AV25BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV25BarFecSalto_PARM"), 0) ;
      }
      sCtrlAV30BarSerfrom = httpContext.cgiGet( sPrefix+"AV30BarSerfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV30BarSerfrom) > 0 )
      {
         AV30BarSerfrom = httpContext.cgiGet( sCtrlAV30BarSerfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarSerfrom", AV30BarSerfrom);
      }
      else
      {
         AV30BarSerfrom = httpContext.cgiGet( sPrefix+"AV30BarSerfrom_PARM") ;
      }
      sCtrlAV31BarSerto = httpContext.cgiGet( sPrefix+"AV31BarSerto_CTRL") ;
      if ( GXutil.len( sCtrlAV31BarSerto) > 0 )
      {
         AV31BarSerto = httpContext.cgiGet( sCtrlAV31BarSerto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarSerto", AV31BarSerto);
      }
      else
      {
         AV31BarSerto = httpContext.cgiGet( sPrefix+"AV31BarSerto_PARM") ;
      }
      sCtrlAV34BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV34BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV34BarTipArtfrom) > 0 )
      {
         AV34BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV34BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarTipArtfrom), 4, 0));
      }
      else
      {
         AV34BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35BarTipArtto = httpContext.cgiGet( sPrefix+"AV35BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV35BarTipArtto) > 0 )
      {
         AV35BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
      }
      else
      {
         AV35BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV12BarColNomfrom = httpContext.cgiGet( sPrefix+"AV12BarColNomfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV12BarColNomfrom) > 0 )
      {
         AV12BarColNomfrom = httpContext.cgiGet( sCtrlAV12BarColNomfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarColNomfrom", AV12BarColNomfrom);
      }
      else
      {
         AV12BarColNomfrom = httpContext.cgiGet( sPrefix+"AV12BarColNomfrom_PARM") ;
      }
      sCtrlAV13BarColNomto = httpContext.cgiGet( sPrefix+"AV13BarColNomto_CTRL") ;
      if ( GXutil.len( sCtrlAV13BarColNomto) > 0 )
      {
         AV13BarColNomto = httpContext.cgiGet( sCtrlAV13BarColNomto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarColNomto", AV13BarColNomto);
      }
      else
      {
         AV13BarColNomto = httpContext.cgiGet( sPrefix+"AV13BarColNomto_PARM") ;
      }
      sCtrlAV14BarColNumfrom = httpContext.cgiGet( sPrefix+"AV14BarColNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV14BarColNumfrom) > 0 )
      {
         AV14BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14BarColNumfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarColNumfrom), 6, 0));
      }
      else
      {
         AV14BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14BarColNumfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV15BarColNumto = httpContext.cgiGet( sPrefix+"AV15BarColNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV15BarColNumto) > 0 )
      {
         AV15BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15BarColNumto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarColNumto), 6, 0));
      }
      else
      {
         AV15BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15BarColNumto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV26BarNomClifrom = httpContext.cgiGet( sPrefix+"AV26BarNomClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV26BarNomClifrom) > 0 )
      {
         AV26BarNomClifrom = httpContext.cgiGet( sCtrlAV26BarNomClifrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarNomClifrom", AV26BarNomClifrom);
      }
      else
      {
         AV26BarNomClifrom = httpContext.cgiGet( sPrefix+"AV26BarNomClifrom_PARM") ;
      }
      sCtrlAV27BarNomClito = httpContext.cgiGet( sPrefix+"AV27BarNomClito_CTRL") ;
      if ( GXutil.len( sCtrlAV27BarNomClito) > 0 )
      {
         AV27BarNomClito = httpContext.cgiGet( sCtrlAV27BarNomClito) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarNomClito", AV27BarNomClito);
      }
      else
      {
         AV27BarNomClito = httpContext.cgiGet( sPrefix+"AV27BarNomClito_PARM") ;
      }
      sCtrlAV28BarNumClifrom = httpContext.cgiGet( sPrefix+"AV28BarNumClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV28BarNumClifrom) > 0 )
      {
         AV28BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV28BarNumClifrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28BarNumClifrom), 6, 0));
      }
      else
      {
         AV28BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV28BarNumClifrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29BarNumClito = httpContext.cgiGet( sPrefix+"AV29BarNumClito_CTRL") ;
      if ( GXutil.len( sCtrlAV29BarNumClito) > 0 )
      {
         AV29BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29BarNumClito), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarNumClito), 6, 0));
      }
      else
      {
         AV29BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29BarNumClito_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV34BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV34BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV34BarTipArtfrom) > 0 )
      {
         AV34BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV34BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarTipArtfrom), 4, 0));
      }
      else
      {
         AV34BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35BarTipArtto = httpContext.cgiGet( sPrefix+"AV35BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV35BarTipArtto) > 0 )
      {
         AV35BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarTipArtto), 4, 0));
      }
      else
      {
         AV35BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV68muestras = httpContext.cgiGet( sPrefix+"AV68muestras_CTRL") ;
      if ( GXutil.len( sCtrlAV68muestras) > 0 )
      {
         AV68muestras = httpContext.cgiGet( sCtrlAV68muestras) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68muestras", AV68muestras);
      }
      else
      {
         AV68muestras = httpContext.cgiGet( sPrefix+"AV68muestras_PARM") ;
      }
      sCtrlAV6BarCodfrom = httpContext.cgiGet( sPrefix+"AV6BarCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV6BarCodfrom) > 0 )
      {
         AV6BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6BarCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodfrom), 8, 0));
      }
      else
      {
         AV6BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6BarCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11BarCodto = httpContext.cgiGet( sPrefix+"AV11BarCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV11BarCodto) > 0 )
      {
         AV11BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11BarCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarCodto), 8, 0));
      }
      else
      {
         AV11BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11BarCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9BarCodReofrom = httpContext.cgiGet( sPrefix+"AV9BarCodReofrom_CTRL") ;
      if ( GXutil.len( sCtrlAV9BarCodReofrom) > 0 )
      {
         AV9BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9BarCodReofrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCodReofrom", GXutil.str( AV9BarCodReofrom, 1, 0));
      }
      else
      {
         AV9BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9BarCodReofrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10BarCodReoto = httpContext.cgiGet( sPrefix+"AV10BarCodReoto_CTRL") ;
      if ( GXutil.len( sCtrlAV10BarCodReoto) > 0 )
      {
         AV10BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10BarCodReoto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReoto", GXutil.str( AV10BarCodReoto, 1, 0));
      }
      else
      {
         AV10BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10BarCodReoto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7BarCodParfrom = httpContext.cgiGet( sPrefix+"AV7BarCodParfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV7BarCodParfrom) > 0 )
      {
         AV7BarCodParfrom = httpContext.cgiGet( sCtrlAV7BarCodParfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodParfrom", AV7BarCodParfrom);
      }
      else
      {
         AV7BarCodParfrom = httpContext.cgiGet( sPrefix+"AV7BarCodParfrom_PARM") ;
      }
      sCtrlAV8BarCodParto = httpContext.cgiGet( sPrefix+"AV8BarCodParto_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarCodParto) > 0 )
      {
         AV8BarCodParto = httpContext.cgiGet( sCtrlAV8BarCodParto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodParto", AV8BarCodParto);
      }
      else
      {
         AV8BarCodParto = httpContext.cgiGet( sPrefix+"AV8BarCodParto_PARM") ;
      }
      sCtrlAV38Cod_Idtx = httpContext.cgiGet( sPrefix+"AV38Cod_Idtx_CTRL") ;
      if ( GXutil.len( sCtrlAV38Cod_Idtx) > 0 )
      {
         AV38Cod_Idtx = httpContext.cgiGet( sCtrlAV38Cod_Idtx) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Cod_Idtx", AV38Cod_Idtx);
      }
      else
      {
         AV38Cod_Idtx = httpContext.cgiGet( sPrefix+"AV38Cod_Idtx_PARM") ;
      }
      sCtrlAV69BarGirar = httpContext.cgiGet( sPrefix+"AV69BarGirar_CTRL") ;
      if ( GXutil.len( sCtrlAV69BarGirar) > 0 )
      {
         AV69BarGirar = httpContext.cgiGet( sCtrlAV69BarGirar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarGirar", AV69BarGirar);
      }
      else
      {
         AV69BarGirar = httpContext.cgiGet( sPrefix+"AV69BarGirar_PARM") ;
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
      pa26E2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws26E2( ) ;
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
      ws26E2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36CliCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV36CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36CliCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36CliCodfrom_CTRL", GXutil.rtrim( sCtrlAV36CliCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37CliCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV37CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37CliCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37CliCodto_CTRL", GXutil.rtrim( sCtrlAV37CliCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16BarDisNumfrom_PARM", GXutil.rtrim( AV16BarDisNumfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16BarDisNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16BarDisNumfrom_CTRL", GXutil.rtrim( sCtrlAV16BarDisNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17BarDisNumto_PARM", GXutil.rtrim( AV17BarDisNumto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17BarDisNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17BarDisNumto_CTRL", GXutil.rtrim( sCtrlAV17BarDisNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22BarFecGenfrom_PARM", localUtil.dtoc( AV22BarFecGenfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22BarFecGenfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22BarFecGenfrom_CTRL", GXutil.rtrim( sCtrlAV22BarFecGenfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23BarFecGento_PARM", localUtil.dtoc( AV23BarFecGento, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23BarFecGento)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23BarFecGento_CTRL", GXutil.rtrim( sCtrlAV23BarFecGento));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarSitfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV32BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32BarSitfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarSitfrom_CTRL", GXutil.rtrim( sCtrlAV32BarSitfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarSitto_PARM", GXutil.ltrim( localUtil.ntoc( AV33BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33BarSitto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarSitto_CTRL", GXutil.rtrim( sCtrlAV33BarSitto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18BarFecClifrom_PARM", localUtil.dtoc( AV18BarFecClifrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18BarFecClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18BarFecClifrom_CTRL", GXutil.rtrim( sCtrlAV18BarFecClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19BarFecClito_PARM", localUtil.dtoc( AV19BarFecClito, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19BarFecClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19BarFecClito_CTRL", GXutil.rtrim( sCtrlAV19BarFecClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20BarFecFprfrom_PARM", localUtil.dtoc( AV20BarFecFprfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20BarFecFprfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20BarFecFprfrom_CTRL", GXutil.rtrim( sCtrlAV20BarFecFprfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21BarFecFprto_PARM", localUtil.dtoc( AV21BarFecFprto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21BarFecFprto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21BarFecFprto_CTRL", GXutil.rtrim( sCtrlAV21BarFecFprto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24BarFecSalfrom_PARM", localUtil.dtoc( AV24BarFecSalfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24BarFecSalfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24BarFecSalfrom_CTRL", GXutil.rtrim( sCtrlAV24BarFecSalfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25BarFecSalto_PARM", localUtil.dtoc( AV25BarFecSalto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25BarFecSalto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25BarFecSalto_CTRL", GXutil.rtrim( sCtrlAV25BarFecSalto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarSerfrom_PARM", GXutil.rtrim( AV30BarSerfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30BarSerfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarSerfrom_CTRL", GXutil.rtrim( sCtrlAV30BarSerfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarSerto_PARM", GXutil.rtrim( AV31BarSerto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31BarSerto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarSerto_CTRL", GXutil.rtrim( sCtrlAV31BarSerto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV34BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV34BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV35BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV35BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarColNomfrom_PARM", GXutil.rtrim( AV12BarColNomfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12BarColNomfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarColNomfrom_CTRL", GXutil.rtrim( sCtrlAV12BarColNomfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarColNomto_PARM", GXutil.rtrim( AV13BarColNomto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13BarColNomto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarColNomto_CTRL", GXutil.rtrim( sCtrlAV13BarColNomto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14BarColNumfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV14BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14BarColNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14BarColNumfrom_CTRL", GXutil.rtrim( sCtrlAV14BarColNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarColNumto_PARM", GXutil.ltrim( localUtil.ntoc( AV15BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15BarColNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarColNumto_CTRL", GXutil.rtrim( sCtrlAV15BarColNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarNomClifrom_PARM", GXutil.rtrim( AV26BarNomClifrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26BarNomClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarNomClifrom_CTRL", GXutil.rtrim( sCtrlAV26BarNomClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27BarNomClito_PARM", GXutil.rtrim( AV27BarNomClito));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27BarNomClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27BarNomClito_CTRL", GXutil.rtrim( sCtrlAV27BarNomClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28BarNumClifrom_PARM", GXutil.ltrim( localUtil.ntoc( AV28BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28BarNumClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28BarNumClifrom_CTRL", GXutil.rtrim( sCtrlAV28BarNumClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarNumClito_PARM", GXutil.ltrim( localUtil.ntoc( AV29BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29BarNumClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarNumClito_CTRL", GXutil.rtrim( sCtrlAV29BarNumClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV34BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV34BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV35BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV35BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68muestras_PARM", GXutil.rtrim( AV68muestras));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68muestras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68muestras_CTRL", GXutil.rtrim( sCtrlAV68muestras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV6BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6BarCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCodfrom_CTRL", GXutil.rtrim( sCtrlAV6BarCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV11BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11BarCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarCodto_CTRL", GXutil.rtrim( sCtrlAV11BarCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarCodReofrom_PARM", GXutil.ltrim( localUtil.ntoc( AV9BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9BarCodReofrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarCodReofrom_CTRL", GXutil.rtrim( sCtrlAV9BarCodReofrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarCodReoto_PARM", GXutil.ltrim( localUtil.ntoc( AV10BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10BarCodReoto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarCodReoto_CTRL", GXutil.rtrim( sCtrlAV10BarCodReoto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarCodParfrom_PARM", GXutil.rtrim( AV7BarCodParfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7BarCodParfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarCodParfrom_CTRL", GXutil.rtrim( sCtrlAV7BarCodParfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarCodParto_PARM", GXutil.rtrim( AV8BarCodParto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarCodParto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarCodParto_CTRL", GXutil.rtrim( sCtrlAV8BarCodParto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Cod_Idtx_PARM", GXutil.rtrim( AV38Cod_Idtx));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38Cod_Idtx)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Cod_Idtx_CTRL", GXutil.rtrim( sCtrlAV38Cod_Idtx));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69BarGirar_PARM", GXutil.rtrim( AV69BarGirar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69BarGirar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69BarGirar_CTRL", GXutil.rtrim( sCtrlAV69BarGirar));
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
      we26E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211694695", true, true);
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
      httpContext.AddJavascriptSource("produccion/consultadeproduccion_test.js", "?20268211694695", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_342( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_34_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_34_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_34_idx ;
      edtBarDisNum_Internalname = sPrefix+"BARDISNUM_"+sGXsfl_34_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_34_idx ;
      edtBarAgrEst_Internalname = sPrefix+"BARAGREST_"+sGXsfl_34_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_34_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_34_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_34_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_34_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_34_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_34_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_34_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_34_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_34_idx ;
      edtBarPie_Internalname = sPrefix+"BARPIE_"+sGXsfl_34_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_34_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_34_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_34_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_34_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_34_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_34_idx ;
      edtBarFasSig_Internalname = sPrefix+"BARFASSIG_"+sGXsfl_34_idx ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI_"+sGXsfl_34_idx ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT_"+sGXsfl_34_idx ;
      edtBarGirar_Internalname = sPrefix+"BARGIRAR_"+sGXsfl_34_idx ;
      edtBarAcaAnh_Internalname = sPrefix+"BARACAANH_"+sGXsfl_34_idx ;
      edtBarCuadern_Internalname = sPrefix+"BARCUADERN_"+sGXsfl_34_idx ;
      edtBarProPer_Internalname = sPrefix+"BARPROPER_"+sGXsfl_34_idx ;
      edtBarProPerI_Internalname = sPrefix+"BARPROPERI_"+sGXsfl_34_idx ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS_"+sGXsfl_34_idx ;
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD_"+sGXsfl_34_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_34_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_34_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_34_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_34_idx ;
   }

   public void subsflControlProps_fel_342( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_34_fel_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_34_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_34_fel_idx ;
      edtBarDisNum_Internalname = sPrefix+"BARDISNUM_"+sGXsfl_34_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_34_fel_idx ;
      edtBarAgrEst_Internalname = sPrefix+"BARAGREST_"+sGXsfl_34_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_34_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_34_fel_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_34_fel_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_34_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_34_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_34_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_34_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_34_fel_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_34_fel_idx ;
      edtBarPie_Internalname = sPrefix+"BARPIE_"+sGXsfl_34_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_34_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_34_fel_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_34_fel_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_34_fel_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_34_fel_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_34_fel_idx ;
      edtBarFasSig_Internalname = sPrefix+"BARFASSIG_"+sGXsfl_34_fel_idx ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI_"+sGXsfl_34_fel_idx ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT_"+sGXsfl_34_fel_idx ;
      edtBarGirar_Internalname = sPrefix+"BARGIRAR_"+sGXsfl_34_fel_idx ;
      edtBarAcaAnh_Internalname = sPrefix+"BARACAANH_"+sGXsfl_34_fel_idx ;
      edtBarCuadern_Internalname = sPrefix+"BARCUADERN_"+sGXsfl_34_fel_idx ;
      edtBarProPer_Internalname = sPrefix+"BARPROPER_"+sGXsfl_34_fel_idx ;
      edtBarProPerI_Internalname = sPrefix+"BARPROPERI_"+sGXsfl_34_fel_idx ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS_"+sGXsfl_34_fel_idx ;
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD_"+sGXsfl_34_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_34_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_34_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_34_fel_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_34_fel_idx ;
   }

   public void sendrow_342( )
   {
      subsflControlProps_342( ) ;
      wb26E0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_34_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 35,'"+sPrefix+"',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_34_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV113GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV113GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV113GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_34_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,35);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV113GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_34_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarDisNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDisNum_Internalname,GXutil.rtrim( A143BarDisNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarDisNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarDisNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNHdr_Columnclass,edtBarNHdr_Columnheaderclass,Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrEst_Internalname,GXutil.rtrim( A120BarAgrEst),GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipArt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArtD_Internalname,GXutil.rtrim( A13711BarTipArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecFpr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecFpr_Internalname,localUtil.format(A158BarFecFpr, "99/99/99"),localUtil.format( A158BarFecFpr, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecFpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecFpr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecSal_Internalname,localUtil.format(A161BarFecSal, "99/99/99"),localUtil.format( A161BarFecSal, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod_Internalname,GXutil.rtrim( A151BarFasCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasSig_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasSig_Internalname,GXutil.rtrim( A1955BarFasSig),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasSig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasSig_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbUlti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbUlti_Internalname,GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbUlti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbUlti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbFact_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbFact_Internalname,GXutil.ltrim( localUtil.ntoc( A13935BarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13935BarAlbFact), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbFact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbFact_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarGirar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGirar_Internalname,GXutil.rtrim( A2454BarGirar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarGirar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarGirar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAcaAnh_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAcaAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAcaAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAcaAnh_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarCuadern_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCuadern_Internalname,GXutil.rtrim( A13933BarCuadern),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCuadern_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCuadern_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarProPer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarProPer_Internalname,GXutil.rtrim( A2829BarProPer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarProPer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarProPer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarProPerI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarProPerI_Internalname,GXutil.rtrim( A14204BarProPerI),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarProPerI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarProPerI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNormas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNormas_Internalname,A13934BarNormas,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNormas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNormas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisUsrCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUsrCod_Internalname,GXutil.rtrim( A4348DisUsrCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisUsrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisUsrCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarExt_Internalname,GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes26E2( ) ;
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
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tip Art", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecFpr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( " Ent Prev", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ult. Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasSig_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sig. Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbUlti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultimo Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbFact_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarGirar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAcaAnh_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuaderno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCuadern_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarProPer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CTW", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarProPerI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNormas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Normas Estandars Textiles", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisUsrCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV113GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
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
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrEst_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13711BarTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A158BarFecFpr, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecFpr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A161BarFecSal, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecSal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A151BarFasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1955BarFasSig));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasSig_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbUlti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13935BarAlbFact, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbFact_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2454BarGirar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarGirar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAcaAnh_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13933BarCuadern));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCuadern_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2829BarProPer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarProPer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14204BarProPerI));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarProPerI_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13934BarNormas);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNormas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4348DisUsrCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisUsrCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarDisNum_Internalname = sPrefix+"BARDISNUM" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarAgrEst_Internalname = sPrefix+"BARAGREST" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART" ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtBarMtr_Internalname = sPrefix+"BARMTR" ;
      edtBarPie_Internalname = sPrefix+"BARPIE" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI" ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR" ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL" ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD" ;
      edtBarFasSig_Internalname = sPrefix+"BARFASSIG" ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI" ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT" ;
      edtBarGirar_Internalname = sPrefix+"BARGIRAR" ;
      edtBarAcaAnh_Internalname = sPrefix+"BARACAANH" ;
      edtBarCuadern_Internalname = sPrefix+"BARCUADERN" ;
      edtBarProPer_Internalname = sPrefix+"BARPROPER" ;
      edtBarProPerI_Internalname = sPrefix+"BARPROPERI" ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS" ;
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarExt_Internalname = sPrefix+"BAREXT" ;
      edtavTotvaluebarkgm_Internalname = sPrefix+"vTOTVALUEBARKGM" ;
      edtavTotvaluebarmtr_Internalname = sPrefix+"vTOTVALUEBARMTR" ;
      edtavTotvaluebarpie_Internalname = sPrefix+"vTOTVALUEBARPIE" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
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
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtBarExt_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtDisUsrCod_Jsonclick = "" ;
      edtBarNormas_Jsonclick = "" ;
      edtBarProPerI_Jsonclick = "" ;
      edtBarProPer_Jsonclick = "" ;
      edtBarCuadern_Jsonclick = "" ;
      edtBarAcaAnh_Jsonclick = "" ;
      edtBarGirar_Jsonclick = "" ;
      edtBarAlbFact_Jsonclick = "" ;
      edtBarAlbUlti_Jsonclick = "" ;
      edtBarFasSig_Jsonclick = "" ;
      edtBarFasCod_Jsonclick = "" ;
      edtBarFecSal_Jsonclick = "" ;
      edtBarFecFpr_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarTipArtD_Jsonclick = "" ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Columnclass = "WWColumn" ;
      edtBarDisNum_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluebarpie_Jsonclick = "" ;
      edtavTotvaluebarpie_Enabled = 1 ;
      edtavTotvaluebarmtr_Jsonclick = "" ;
      edtavTotvaluebarmtr_Enabled = 1 ;
      edtavTotvaluebarkgm_Jsonclick = "" ;
      edtavTotvaluebarkgm_Enabled = 1 ;
      edtBarNHdr_Columnheaderclass = "" ;
      edtDisUsrCod_Visible = -1 ;
      edtBarNormas_Visible = -1 ;
      edtBarProPerI_Visible = -1 ;
      edtBarProPer_Visible = -1 ;
      edtBarCuadern_Visible = -1 ;
      edtBarAcaAnh_Visible = -1 ;
      edtBarGirar_Visible = -1 ;
      edtBarAlbFact_Visible = -1 ;
      edtBarAlbUlti_Visible = -1 ;
      edtBarFasSig_Visible = -1 ;
      edtBarFasCod_Visible = -1 ;
      edtBarFecSal_Visible = -1 ;
      edtBarFecFpr_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtBarSit_Visible = -1 ;
      edtBarPie_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarTipArtD_Visible = -1 ;
      edtBarTipArt_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarAgrEst_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtBarDisNum_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;;;Fecha;Fecha;Fecha;Fecha;;;;;;;;;;;;;;;" ;
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
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:BarDisNum|4:BarNHdr|5:BarAgrEst|6:BarSer|7:BarSerDsc|8:BarTipArt|9:BarTipArtDsc|10:BarColNom|11:BarColNum|12:BarNomCli|13:BarKgm|14:BarMtr|15:BarPie|16:BarSit|17:BarFecGen|18:BarFecCli|19:BarFecFpr|20:BarFecSal|21:BarFasCod|22:BarFasSig|23:BarAlbUltimo|24:BarAlbFact|25:BarGirar|26:BarAcaAnh|27:BarCuaderno|28:BarProPer|29:BarProPerIdtx|30:BarNormas|31:DisUsrCod" ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_34_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A3030BarPlf',fld:'BARPLF',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtBarProPerI_Visible',ctrl:'BARPROPERI',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV130TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV132TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV134TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1126E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1226E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2426E2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV113GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'edtBarNHdr_Columnclass',ctrl:'BARNHDR',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1326E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A3030BarPlf',fld:'BARPLF',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtBarProPerI_Visible',ctrl:'BARPROPERI',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV130TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV132TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV134TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2526E2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV113GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:'',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A3030BarPlf',fld:'BARPLF',pic:'@!'},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV113GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtBarProPerI_Visible',ctrl:'BARPROPERI',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV130TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV132TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV134TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE","{handler:'e1426E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A3030BarPlf',fld:'BARPLF',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE",",oparms:[{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtBarProPerI_Visible',ctrl:'BARPROPERI',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV130TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV132TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV134TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("CONSULTAALBARANSALIDA_MODAL.CLOSE","{handler:'e1526E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A3030BarPlf',fld:'BARPLF',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("CONSULTAALBARANSALIDA_MODAL.CLOSE",",oparms:[{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtBarProPerI_Visible',ctrl:'BARPROPERI',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV130TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV132TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV134TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("RECETAS_MODAL.CLOSE","{handler:'e1626E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A3030BarPlf',fld:'BARPLF',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("RECETAS_MODAL.CLOSE",",oparms:[{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtBarProPerI_Visible',ctrl:'BARPROPERI',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV130TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV132TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV134TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("PARTESPRODUCCION_MODAL.CLOSE","{handler:'e1726E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A3030BarPlf',fld:'BARPLF',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("PARTESPRODUCCION_MODAL.CLOSE",",oparms:[{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtBarProPerI_Visible',ctrl:'BARPROPERI',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV130TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV132TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV134TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("PIEZAS_MODAL.CLOSE","{handler:'e1826E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A3030BarPlf',fld:'BARPLF',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("PIEZAS_MODAL.CLOSE",",oparms:[{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtBarProPerI_Visible',ctrl:'BARPROPERI',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV130TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV132TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV134TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("AGRUPADAS_MODAL.CLOSE","{handler:'e1926E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A3030BarPlf',fld:'BARPLF',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("AGRUPADAS_MODAL.CLOSE",",oparms:[{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarDisNum_Visible',ctrl:'BARDISNUM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtBarProPerI_Visible',ctrl:'BARPROPERI',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV130TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV132TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV134TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e2026E2',iparms:[{av:'AV141Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2126E2',iparms:[{av:'AV141Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV37CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV16BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV17BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV22BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV23BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV32BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV33BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV18BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV19BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV20BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV21BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV24BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV25BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV30BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV31BarSerto',fld:'vBARSERTO',pic:''},{av:'AV34BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV35BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV12BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV13BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV14BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV15BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV26BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV27BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV28BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV29BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV6BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV11BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV10BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV7BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV8BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV38Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV69BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV53ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV141Pgmname',fld:'vPGMNAME',pic:''},{av:'AV114STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV136TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV129TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV131TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV133TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV138Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARDISNUM","{handler:'valid_Bardisnum',iparms:[]");
      setEventMetadata("VALID_BARDISNUM",",oparms:[]}");
      setEventMetadata("VALID_BARTIPART","{handler:'valid_Bartipart',iparms:[]");
      setEventMetadata("VALID_BARTIPART",",oparms:[]}");
      setEventMetadata("VALID_BARACAANH","{handler:'valid_Baracaanh',iparms:[]");
      setEventMetadata("VALID_BARACAANH",",oparms:[]}");
      setEventMetadata("VALID_BARPROPER","{handler:'valid_Barproper',iparms:[]");
      setEventMetadata("VALID_BARPROPER",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barext',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV16BarDisNumfrom = "" ;
      wcpOAV17BarDisNumto = "" ;
      wcpOAV22BarFecGenfrom = GXutil.nullDate() ;
      wcpOAV23BarFecGento = GXutil.nullDate() ;
      wcpOAV18BarFecClifrom = GXutil.nullDate() ;
      wcpOAV19BarFecClito = GXutil.nullDate() ;
      wcpOAV20BarFecFprfrom = GXutil.nullDate() ;
      wcpOAV21BarFecFprto = GXutil.nullDate() ;
      wcpOAV24BarFecSalfrom = GXutil.nullDate() ;
      wcpOAV25BarFecSalto = GXutil.nullDate() ;
      wcpOAV30BarSerfrom = "" ;
      wcpOAV31BarSerto = "" ;
      wcpOAV12BarColNomfrom = "" ;
      wcpOAV13BarColNomto = "" ;
      wcpOAV26BarNomClifrom = "" ;
      wcpOAV27BarNomClito = "" ;
      wcpOAV68muestras = "" ;
      wcpOAV7BarCodParfrom = "" ;
      wcpOAV8BarCodParto = "" ;
      wcpOAV38Cod_Idtx = "" ;
      wcpOAV69BarGirar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV16BarDisNumfrom = "" ;
      AV17BarDisNumto = "" ;
      AV22BarFecGenfrom = GXutil.nullDate() ;
      AV23BarFecGento = GXutil.nullDate() ;
      AV18BarFecClifrom = GXutil.nullDate() ;
      AV19BarFecClito = GXutil.nullDate() ;
      AV20BarFecFprfrom = GXutil.nullDate() ;
      AV21BarFecFprto = GXutil.nullDate() ;
      AV24BarFecSalfrom = GXutil.nullDate() ;
      AV25BarFecSalto = GXutil.nullDate() ;
      AV30BarSerfrom = "" ;
      AV31BarSerto = "" ;
      AV12BarColNomfrom = "" ;
      AV13BarColNomto = "" ;
      AV26BarNomClifrom = "" ;
      AV27BarNomClito = "" ;
      AV68muestras = "" ;
      AV7BarCodParfrom = "" ;
      AV8BarCodParto = "" ;
      AV38Cod_Idtx = "" ;
      AV69BarGirar = "" ;
      AV53ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV141Pgmname = "" ;
      AV136TFBarPlf = "" ;
      AV129TotBarKgm = DecimalUtil.ZERO ;
      AV131TotBarMtr = DecimalUtil.ZERO ;
      A13878PedidoClie = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV64DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A3030BarPlf = "" ;
      A365DisDes = "" ;
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A143BarDisNum = "" ;
      A13696BarNHdr = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A151BarFasCod = "" ;
      A1955BarFasSig = "" ;
      A2454BarGirar = "" ;
      A13933BarCuadern = "" ;
      A2829BarProPer = "" ;
      A14204BarProPerI = "" ;
      A13934BarNormas = "" ;
      A4348DisUsrCod = "" ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      H026E9_A9713Tb1_Cod = new short[1] ;
      H026E9_A3030BarPlf = new String[] {""} ;
      H026E9_A1235BarNumCli = new int[1] ;
      H026E9_A2265BarExt = new byte[1] ;
      H026E9_n2265BarExt = new boolean[] {false} ;
      H026E9_A4348DisUsrCod = new String[] {""} ;
      H026E9_A4466BarAcaAnh = new short[1] ;
      H026E9_A2454BarGirar = new String[] {""} ;
      H026E9_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H026E9_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H026E9_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H026E9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H026E9_A213BarSit = new byte[1] ;
      H026E9_A1234BarNomCli = new String[] {""} ;
      H026E9_A136BarColNum = new int[1] ;
      H026E9_A135BarColNom = new String[] {""} ;
      H026E9_A13711BarTipArtD = new String[] {""} ;
      H026E9_n13711BarTipArtD = new boolean[] {false} ;
      H026E9_A217BarTipArt = new short[1] ;
      H026E9_n217BarTipArt = new boolean[] {false} ;
      H026E9_A1652BarSerDsc = new String[] {""} ;
      H026E9_A212BarSer = new String[] {""} ;
      H026E9_A120BarAgrEst = new String[] {""} ;
      H026E9_A279CliNom = new String[] {""} ;
      H026E9_A252CliCod = new int[1] ;
      H026E9_n252CliCod = new boolean[] {false} ;
      H026E9_A13933BarCuadern = new String[] {""} ;
      H026E9_n13933BarCuadern = new boolean[] {false} ;
      H026E9_A1955BarFasSig = new String[] {""} ;
      H026E9_n1955BarFasSig = new boolean[] {false} ;
      H026E9_A151BarFasCod = new String[] {""} ;
      H026E9_n151BarFasCod = new boolean[] {false} ;
      H026E9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026E9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026E9_A199BarPie1 = new short[1] ;
      H026E9_A365DisDes = new String[] {""} ;
      H026E9_A898BarPieNDes = new int[1] ;
      H026E9_A130BarCodPar = new String[] {""} ;
      H026E9_A132BarCodReo = new byte[1] ;
      H026E9_A129BarCod = new int[1] ;
      H026E9_A2829BarProPer = new String[] {""} ;
      H026E9_A361DisCod = new int[1] ;
      H026E9_A143BarDisNum = new String[] {""} ;
      H026E9_A4812BarEncCli = new String[] {""} ;
      H026E9_A396EmprCod = new String[] {""} ;
      GXv_int2 = new long[1] ;
      GXv_int4 = new int[1] ;
      GXv_char6 = new String[1] ;
      H026E17_AGRID_nRecordCount = new long[1] ;
      AV130TotValueBarKgm = "" ;
      AV132TotValueBarMtr = "" ;
      AV134TotValueBarPie = "" ;
      hsh = "" ;
      AV110Station = "" ;
      AV111EmprNom = "" ;
      AV112UsurCod = "" ;
      GXv_char7 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV40WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext14 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV55Session = httpContext.getWebSession();
      AV51ColumnsSelectorXML = "" ;
      GXv_int13 = new byte[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV49ExcelFilename = "" ;
      AV50ErrorMessage = "" ;
      GXv_char8 = new String[1] ;
      AV52UserCustomValue = "" ;
      GXt_char5 = "" ;
      GXv_char9 = new String[1] ;
      AV54ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV44GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV41HTTPRequest = httpContext.getHttpRequest();
      H026E19_A2454BarGirar = new String[] {""} ;
      H026E19_A2829BarProPer = new String[] {""} ;
      H026E19_A130BarCodPar = new String[] {""} ;
      H026E19_A132BarCodReo = new byte[1] ;
      H026E19_A129BarCod = new int[1] ;
      H026E19_A3030BarPlf = new String[] {""} ;
      H026E19_A217BarTipArt = new short[1] ;
      H026E19_n217BarTipArt = new boolean[] {false} ;
      H026E19_A1235BarNumCli = new int[1] ;
      H026E19_A1234BarNomCli = new String[] {""} ;
      H026E19_A136BarColNum = new int[1] ;
      H026E19_A135BarColNom = new String[] {""} ;
      H026E19_A212BarSer = new String[] {""} ;
      H026E19_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H026E19_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H026E19_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H026E19_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H026E19_A213BarSit = new byte[1] ;
      H026E19_A252CliCod = new int[1] ;
      H026E19_n252CliCod = new boolean[] {false} ;
      H026E19_A143BarDisNum = new String[] {""} ;
      H026E19_A396EmprCod = new String[] {""} ;
      H026E19_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026E19_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026E19_A199BarPie1 = new short[1] ;
      H026E19_A365DisDes = new String[] {""} ;
      H026E19_A898BarPieNDes = new int[1] ;
      ucAgrupadas_modal = new com.genexus.webpanels.GXUserControl();
      ucPiezas_modal = new com.genexus.webpanels.GXUserControl();
      ucPackinglist_modal = new com.genexus.webpanels.GXUserControl();
      ucPartesproduccion_modal = new com.genexus.webpanels.GXUserControl();
      ucRecetas_modal = new com.genexus.webpanels.GXUserControl();
      ucConsultaalbaransalida_modal = new com.genexus.webpanels.GXUserControl();
      ucSituacionfases_modal = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV36CliCodfrom = "" ;
      sCtrlAV37CliCodto = "" ;
      sCtrlAV16BarDisNumfrom = "" ;
      sCtrlAV17BarDisNumto = "" ;
      sCtrlAV22BarFecGenfrom = "" ;
      sCtrlAV23BarFecGento = "" ;
      sCtrlAV32BarSitfrom = "" ;
      sCtrlAV33BarSitto = "" ;
      sCtrlAV18BarFecClifrom = "" ;
      sCtrlAV19BarFecClito = "" ;
      sCtrlAV20BarFecFprfrom = "" ;
      sCtrlAV21BarFecFprto = "" ;
      sCtrlAV24BarFecSalfrom = "" ;
      sCtrlAV25BarFecSalto = "" ;
      sCtrlAV30BarSerfrom = "" ;
      sCtrlAV31BarSerto = "" ;
      sCtrlAV34BarTipArtfrom = "" ;
      sCtrlAV35BarTipArtto = "" ;
      sCtrlAV12BarColNomfrom = "" ;
      sCtrlAV13BarColNomto = "" ;
      sCtrlAV14BarColNumfrom = "" ;
      sCtrlAV15BarColNumto = "" ;
      sCtrlAV26BarNomClifrom = "" ;
      sCtrlAV27BarNomClito = "" ;
      sCtrlAV28BarNumClifrom = "" ;
      sCtrlAV29BarNumClito = "" ;
      sCtrlAV68muestras = "" ;
      sCtrlAV6BarCodfrom = "" ;
      sCtrlAV11BarCodto = "" ;
      sCtrlAV9BarCodReofrom = "" ;
      sCtrlAV10BarCodReoto = "" ;
      sCtrlAV7BarCodParfrom = "" ;
      sCtrlAV8BarCodParto = "" ;
      sCtrlAV38Cod_Idtx = "" ;
      sCtrlAV69BarGirar = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_test__default(),
         new Object[] {
             new Object[] {
            H026E9_A9713Tb1_Cod, H026E9_A3030BarPlf, H026E9_A1235BarNumCli, H026E9_A2265BarExt, H026E9_n2265BarExt, H026E9_A4348DisUsrCod, H026E9_A4466BarAcaAnh, H026E9_A2454BarGirar, H026E9_A161BarFecSal, H026E9_A158BarFecFpr,
            H026E9_A155BarFecCli, H026E9_A159BarFecGen, H026E9_A213BarSit, H026E9_A1234BarNomCli, H026E9_A136BarColNum, H026E9_A135BarColNom, H026E9_A13711BarTipArtD, H026E9_n13711BarTipArtD, H026E9_A217BarTipArt, H026E9_n217BarTipArt,
            H026E9_A1652BarSerDsc, H026E9_A212BarSer, H026E9_A120BarAgrEst, H026E9_A279CliNom, H026E9_A252CliCod, H026E9_n252CliCod, H026E9_A13933BarCuadern, H026E9_n13933BarCuadern, H026E9_A1955BarFasSig, H026E9_n1955BarFasSig,
            H026E9_A151BarFasCod, H026E9_n151BarFasCod, H026E9_A184BarMtr, H026E9_A166BarKgm, H026E9_A199BarPie1, H026E9_A365DisDes, H026E9_A898BarPieNDes, H026E9_A130BarCodPar, H026E9_A132BarCodReo, H026E9_A129BarCod,
            H026E9_A2829BarProPer, H026E9_A361DisCod, H026E9_A143BarDisNum, H026E9_A4812BarEncCli, H026E9_A396EmprCod
            }
            , new Object[] {
            H026E17_AGRID_nRecordCount
            }
            , new Object[] {
            H026E19_A2454BarGirar, H026E19_A2829BarProPer, H026E19_A130BarCodPar, H026E19_A132BarCodReo, H026E19_A129BarCod, H026E19_A3030BarPlf, H026E19_A217BarTipArt, H026E19_n217BarTipArt, H026E19_A1235BarNumCli, H026E19_A1234BarNomCli,
            H026E19_A136BarColNum, H026E19_A135BarColNom, H026E19_A212BarSer, H026E19_A158BarFecFpr, H026E19_A155BarFecCli, H026E19_A161BarFecSal, H026E19_A159BarFecGen, H026E19_A213BarSit, H026E19_A252CliCod, H026E19_n252CliCod,
            H026E19_A143BarDisNum, H026E19_A396EmprCod, H026E19_A166BarKgm, H026E19_A184BarMtr, H026E19_A199BarPie1, H026E19_A365DisDes, H026E19_A898BarPieNDes
            }
         }
      );
      AV141Pgmname = "Produccion.ConsultadeProduccion_Test" ;
      /* GeneXus formulas. */
      AV141Pgmname = "Produccion.ConsultadeProduccion_Test" ;
      Gx_err = (short)(0) ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      edtavTotvaluebarpie_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV32BarSitfrom ;
   private byte wcpOAV33BarSitto ;
   private byte wcpOAV9BarCodReofrom ;
   private byte wcpOAV10BarCodReoto ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV32BarSitfrom ;
   private byte AV33BarSitto ;
   private byte AV9BarCodReofrom ;
   private byte AV10BarCodReoto ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A2265BarExt ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int12 ;
   private byte GXv_int13[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV34BarTipArtfrom ;
   private short wcpOAV35BarTipArtto ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV34BarTipArtfrom ;
   private short AV35BarTipArtto ;
   private short AV114STNORM ;
   private short AV138Moda21 ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV113GridActionGroup1 ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV137cuaderno ;
   private int wcpOAV36CliCodfrom ;
   private int wcpOAV37CliCodto ;
   private int wcpOAV14BarColNumfrom ;
   private int wcpOAV15BarColNumto ;
   private int wcpOAV28BarNumClifrom ;
   private int wcpOAV29BarNumClito ;
   private int wcpOAV6BarCodfrom ;
   private int wcpOAV11BarCodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_34 ;
   private int AV36CliCodfrom ;
   private int AV37CliCodto ;
   private int AV14BarColNumfrom ;
   private int AV15BarColNumto ;
   private int AV28BarNumClifrom ;
   private int AV29BarNumClito ;
   private int AV6BarCodfrom ;
   private int AV11BarCodto ;
   private int nGXsfl_34_idx=1 ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int A13935BarAlbFact ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluebarkgm_Enabled ;
   private int edtavTotvaluebarmtr_Enabled ;
   private int edtavTotvaluebarpie_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarDisNum_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarAgrEst_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarTipArt_Visible ;
   private int edtBarTipArtD_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarMtr_Visible ;
   private int edtBarPie_Visible ;
   private int edtBarSit_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtBarFecFpr_Visible ;
   private int edtBarFecSal_Visible ;
   private int edtBarFasCod_Visible ;
   private int edtBarFasSig_Visible ;
   private int edtBarAlbUlti_Visible ;
   private int edtBarAlbFact_Visible ;
   private int edtBarGirar_Visible ;
   private int edtBarAcaAnh_Visible ;
   private int edtBarCuadern_Visible ;
   private int edtBarProPer_Visible ;
   private int edtBarProPerI_Visible ;
   private int edtBarNormas_Visible ;
   private int edtDisUsrCod_Visible ;
   private int AV65PageToGo ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV133TotBarPie ;
   private long AV66GridCurrentPage ;
   private long AV67GridPageCount ;
   private long A13930BarAlbUlti ;
   private long GRID_nCurrentRecord ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV129TotBarKgm ;
   private java.math.BigDecimal AV131TotBarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV16BarDisNumfrom ;
   private String wcpOAV17BarDisNumto ;
   private String wcpOAV30BarSerfrom ;
   private String wcpOAV31BarSerto ;
   private String wcpOAV12BarColNomfrom ;
   private String wcpOAV13BarColNomto ;
   private String wcpOAV26BarNomClifrom ;
   private String wcpOAV27BarNomClito ;
   private String wcpOAV68muestras ;
   private String wcpOAV7BarCodParfrom ;
   private String wcpOAV8BarCodParto ;
   private String wcpOAV38Cod_Idtx ;
   private String wcpOAV69BarGirar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV16BarDisNumfrom ;
   private String AV17BarDisNumto ;
   private String AV30BarSerfrom ;
   private String AV31BarSerto ;
   private String AV12BarColNomfrom ;
   private String AV13BarColNomto ;
   private String AV26BarNomClifrom ;
   private String AV27BarNomClito ;
   private String AV68muestras ;
   private String AV7BarCodParfrom ;
   private String AV8BarCodParto ;
   private String AV38Cod_Idtx ;
   private String AV69BarGirar ;
   private String sGXsfl_34_idx="0001" ;
   private String AV141Pgmname ;
   private String AV136TFBarPlf ;
   private String A13878PedidoClie ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A3030BarPlf ;
   private String A365DisDes ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
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
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
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
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarTipArt_Internalname ;
   private String A13711BarTipArtD ;
   private String edtBarTipArtD_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String edtBarFecFpr_Internalname ;
   private String edtBarFecSal_Internalname ;
   private String A151BarFasCod ;
   private String edtBarFasCod_Internalname ;
   private String A1955BarFasSig ;
   private String edtBarFasSig_Internalname ;
   private String edtBarAlbUlti_Internalname ;
   private String edtBarAlbFact_Internalname ;
   private String A2454BarGirar ;
   private String edtBarGirar_Internalname ;
   private String edtBarAcaAnh_Internalname ;
   private String A13933BarCuadern ;
   private String edtBarCuadern_Internalname ;
   private String A2829BarProPer ;
   private String edtBarProPer_Internalname ;
   private String A14204BarProPerI ;
   private String edtBarProPerI_Internalname ;
   private String edtBarNormas_Internalname ;
   private String A4348DisUsrCod ;
   private String edtDisUsrCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarExt_Internalname ;
   private String edtavTotvaluebarkgm_Internalname ;
   private String edtavTotvaluebarmtr_Internalname ;
   private String edtavTotvaluebarpie_Internalname ;
   private String scmdbuf ;
   private String GXv_char6[] ;
   private String hsh ;
   private String AV110Station ;
   private String AV111EmprNom ;
   private String AV112UsurCod ;
   private String GXv_char7[] ;
   private String edtBarNHdr_Columnheaderclass ;
   private String edtBarNHdr_Columnclass ;
   private String GXv_char8[] ;
   private String GXt_char5 ;
   private String GXv_char9[] ;
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
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgm_Jsonclick ;
   private String edtavTotvaluebarmtr_Jsonclick ;
   private String edtavTotvaluebarpie_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV36CliCodfrom ;
   private String sCtrlAV37CliCodto ;
   private String sCtrlAV16BarDisNumfrom ;
   private String sCtrlAV17BarDisNumto ;
   private String sCtrlAV22BarFecGenfrom ;
   private String sCtrlAV23BarFecGento ;
   private String sCtrlAV32BarSitfrom ;
   private String sCtrlAV33BarSitto ;
   private String sCtrlAV18BarFecClifrom ;
   private String sCtrlAV19BarFecClito ;
   private String sCtrlAV20BarFecFprfrom ;
   private String sCtrlAV21BarFecFprto ;
   private String sCtrlAV24BarFecSalfrom ;
   private String sCtrlAV25BarFecSalto ;
   private String sCtrlAV30BarSerfrom ;
   private String sCtrlAV31BarSerto ;
   private String sCtrlAV34BarTipArtfrom ;
   private String sCtrlAV35BarTipArtto ;
   private String sCtrlAV12BarColNomfrom ;
   private String sCtrlAV13BarColNomto ;
   private String sCtrlAV14BarColNumfrom ;
   private String sCtrlAV15BarColNumto ;
   private String sCtrlAV26BarNomClifrom ;
   private String sCtrlAV27BarNomClito ;
   private String sCtrlAV28BarNumClifrom ;
   private String sCtrlAV29BarNumClito ;
   private String sCtrlAV68muestras ;
   private String sCtrlAV6BarCodfrom ;
   private String sCtrlAV11BarCodto ;
   private String sCtrlAV9BarCodReofrom ;
   private String sCtrlAV10BarCodReoto ;
   private String sCtrlAV7BarCodParfrom ;
   private String sCtrlAV8BarCodParto ;
   private String sCtrlAV38Cod_Idtx ;
   private String sCtrlAV69BarGirar ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarDisNum_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipArt_Jsonclick ;
   private String edtBarTipArtD_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarFecFpr_Jsonclick ;
   private String edtBarFecSal_Jsonclick ;
   private String edtBarFasCod_Jsonclick ;
   private String edtBarFasSig_Jsonclick ;
   private String edtBarAlbUlti_Jsonclick ;
   private String edtBarAlbFact_Jsonclick ;
   private String edtBarGirar_Jsonclick ;
   private String edtBarAcaAnh_Jsonclick ;
   private String edtBarCuadern_Jsonclick ;
   private String edtBarProPer_Jsonclick ;
   private String edtBarProPerI_Jsonclick ;
   private String edtBarNormas_Jsonclick ;
   private String edtDisUsrCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarExt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV22BarFecGenfrom ;
   private java.util.Date wcpOAV23BarFecGento ;
   private java.util.Date wcpOAV18BarFecClifrom ;
   private java.util.Date wcpOAV19BarFecClito ;
   private java.util.Date wcpOAV20BarFecFprfrom ;
   private java.util.Date wcpOAV21BarFecFprto ;
   private java.util.Date wcpOAV24BarFecSalfrom ;
   private java.util.Date wcpOAV25BarFecSalto ;
   private java.util.Date AV22BarFecGenfrom ;
   private java.util.Date AV23BarFecGento ;
   private java.util.Date AV18BarFecClifrom ;
   private java.util.Date AV19BarFecClito ;
   private java.util.Date AV20BarFecFprfrom ;
   private java.util.Date AV21BarFecFprto ;
   private java.util.Date AV24BarFecSalfrom ;
   private java.util.Date AV25BarFecSalto ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_34_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n13711BarTipArtD ;
   private boolean n151BarFasCod ;
   private boolean n1955BarFasSig ;
   private boolean n13933BarCuadern ;
   private boolean n2265BarExt ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV135TempBoolean ;
   private boolean Cond_result ;
   private String AV51ColumnsSelectorXML ;
   private String AV52UserCustomValue ;
   private String A13934BarNormas ;
   private String AV130TotValueBarKgm ;
   private String AV132TotValueBarMtr ;
   private String AV134TotValueBarPie ;
   private String AV49ExcelFilename ;
   private String AV50ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV41HTTPRequest ;
   private com.genexus.webpanels.WebSession AV55Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucAgrupadas_modal ;
   private com.genexus.webpanels.GXUserControl ucPiezas_modal ;
   private com.genexus.webpanels.GXUserControl ucPackinglist_modal ;
   private com.genexus.webpanels.GXUserControl ucPartesproduccion_modal ;
   private com.genexus.webpanels.GXUserControl ucRecetas_modal ;
   private com.genexus.webpanels.GXUserControl ucConsultaalbaransalida_modal ;
   private com.genexus.webpanels.GXUserControl ucSituacionfases_modal ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private short[] H026E9_A9713Tb1_Cod ;
   private String[] H026E9_A3030BarPlf ;
   private int[] H026E9_A1235BarNumCli ;
   private byte[] H026E9_A2265BarExt ;
   private boolean[] H026E9_n2265BarExt ;
   private String[] H026E9_A4348DisUsrCod ;
   private short[] H026E9_A4466BarAcaAnh ;
   private String[] H026E9_A2454BarGirar ;
   private java.util.Date[] H026E9_A161BarFecSal ;
   private java.util.Date[] H026E9_A158BarFecFpr ;
   private java.util.Date[] H026E9_A155BarFecCli ;
   private java.util.Date[] H026E9_A159BarFecGen ;
   private byte[] H026E9_A213BarSit ;
   private String[] H026E9_A1234BarNomCli ;
   private int[] H026E9_A136BarColNum ;
   private String[] H026E9_A135BarColNom ;
   private String[] H026E9_A13711BarTipArtD ;
   private boolean[] H026E9_n13711BarTipArtD ;
   private short[] H026E9_A217BarTipArt ;
   private boolean[] H026E9_n217BarTipArt ;
   private String[] H026E9_A1652BarSerDsc ;
   private String[] H026E9_A212BarSer ;
   private String[] H026E9_A120BarAgrEst ;
   private String[] H026E9_A279CliNom ;
   private int[] H026E9_A252CliCod ;
   private boolean[] H026E9_n252CliCod ;
   private String[] H026E9_A13933BarCuadern ;
   private boolean[] H026E9_n13933BarCuadern ;
   private String[] H026E9_A1955BarFasSig ;
   private boolean[] H026E9_n1955BarFasSig ;
   private String[] H026E9_A151BarFasCod ;
   private boolean[] H026E9_n151BarFasCod ;
   private java.math.BigDecimal[] H026E9_A184BarMtr ;
   private java.math.BigDecimal[] H026E9_A166BarKgm ;
   private short[] H026E9_A199BarPie1 ;
   private String[] H026E9_A365DisDes ;
   private int[] H026E9_A898BarPieNDes ;
   private String[] H026E9_A130BarCodPar ;
   private byte[] H026E9_A132BarCodReo ;
   private int[] H026E9_A129BarCod ;
   private String[] H026E9_A2829BarProPer ;
   private int[] H026E9_A361DisCod ;
   private String[] H026E9_A143BarDisNum ;
   private String[] H026E9_A4812BarEncCli ;
   private String[] H026E9_A396EmprCod ;
   private long[] H026E17_AGRID_nRecordCount ;
   private String[] H026E19_A2454BarGirar ;
   private String[] H026E19_A2829BarProPer ;
   private String[] H026E19_A130BarCodPar ;
   private byte[] H026E19_A132BarCodReo ;
   private int[] H026E19_A129BarCod ;
   private String[] H026E19_A3030BarPlf ;
   private short[] H026E19_A217BarTipArt ;
   private boolean[] H026E19_n217BarTipArt ;
   private int[] H026E19_A1235BarNumCli ;
   private String[] H026E19_A1234BarNomCli ;
   private int[] H026E19_A136BarColNum ;
   private String[] H026E19_A135BarColNom ;
   private String[] H026E19_A212BarSer ;
   private java.util.Date[] H026E19_A158BarFecFpr ;
   private java.util.Date[] H026E19_A155BarFecCli ;
   private java.util.Date[] H026E19_A161BarFecSal ;
   private java.util.Date[] H026E19_A159BarFecGen ;
   private byte[] H026E19_A213BarSit ;
   private int[] H026E19_A252CliCod ;
   private boolean[] H026E19_n252CliCod ;
   private String[] H026E19_A143BarDisNum ;
   private String[] H026E19_A396EmprCod ;
   private java.math.BigDecimal[] H026E19_A166BarKgm ;
   private java.math.BigDecimal[] H026E19_A184BarMtr ;
   private short[] H026E19_A199BarPie1 ;
   private String[] H026E19_A365DisDes ;
   private int[] H026E19_A898BarPieNDes ;
   private app.wwpbaseobjects.SdtWWPContext AV40WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext14[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV42TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV44GridState ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV53ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV54ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV64DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[] ;
}

final  class consultadeproduccion_test__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H026E9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV16BarDisNumfrom ,
                                          String AV17BarDisNumto ,
                                          int AV36CliCodfrom ,
                                          int AV37CliCodto ,
                                          byte AV32BarSitfrom ,
                                          byte AV33BarSitto ,
                                          java.util.Date AV22BarFecGenfrom ,
                                          java.util.Date AV23BarFecGento ,
                                          java.util.Date AV24BarFecSalfrom ,
                                          java.util.Date AV25BarFecSalto ,
                                          java.util.Date AV18BarFecClifrom ,
                                          java.util.Date AV19BarFecClito ,
                                          java.util.Date AV20BarFecFprfrom ,
                                          java.util.Date AV21BarFecFprto ,
                                          String AV30BarSerfrom ,
                                          String AV31BarSerto ,
                                          String AV12BarColNomfrom ,
                                          String AV13BarColNomto ,
                                          int AV14BarColNumfrom ,
                                          int AV15BarColNumto ,
                                          String AV26BarNomClifrom ,
                                          String AV27BarNomClito ,
                                          int AV28BarNumClifrom ,
                                          int AV29BarNumClito ,
                                          short AV34BarTipArtfrom ,
                                          short AV35BarTipArtto ,
                                          String AV136TFBarPlf ,
                                          int AV6BarCodfrom ,
                                          int AV11BarCodto ,
                                          byte AV9BarCodReofrom ,
                                          byte AV10BarCodReoto ,
                                          String AV7BarCodParfrom ,
                                          String AV8BarCodParto ,
                                          String AV38Cod_Idtx ,
                                          String AV69BarGirar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
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
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[41];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T5.Tb1_Cod, T1.BarPlf, T1.BarNumCli, T1.BarExt, T2.DisUsrCod, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      sSelectString += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE( T5.Tb1_Dsc," ;
      sSelectString += " ' ') AS BarCuadern, COALESCE( T6.BarFasSig, ' ') AS BarFasSig, COALESCE( T7.BarFasSig, ' ') AS BarFasCod, COALESCE( T8.BarMtr, 0) AS BarMtr, COALESCE( T8.BarKgm," ;
      sSelectString += " 0) AS BarKgm, COALESCE( T8.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T8.BarPieNDes, 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarProPer, T1.DisCod," ;
      sSelectString += " T1.BarDisNum, T1.BarEncCli, T1.EmprCod" ;
      sFromString = " FROM (((((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod" ;
      sFromString += " = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod =" ;
      sFromString += " T1.BarAcaAnh) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasSig, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM ((TXPBARFAS" ;
      sFromString += " T9 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo," ;
      sFromString += " BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) INNER JOIN (SELECT MIN(T12.BarOrdLin)" ;
      sFromString += " AS GXC2, COALESCE( T13.BarFasLin, 0) AS BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar FROM (TXPBARFAS T12 LEFT JOIN (SELECT MAX(BarOrdLin) AS" ;
      sFromString += " BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T13 ON T13.EmprCod = T12.EmprCod" ;
      sFromString += " AND T13.BarCod = T12.BarCod AND T13.BarCodReo = T12.BarCodReo AND T13.BarCodPar = T12.BarCodPar) WHERE (T12.BarOrdLin >= 0) AND (T12.BarOrdLin > COALESCE( T13.BarFasLin," ;
      sFromString += " 0)) AND (T12.BarFasEst = 0) GROUP BY T13.BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar ) T11 ON T11.EmprCod = T9.EmprCod AND T11.BarCod = T9.BarCod" ;
      sFromString += " AND T11.BarCodReo = T9.BarCodReo AND T11.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin = T11.GXC2) AND (T9.BarOrdLin >= 0) AND (T9.BarOrdLin > COALESCE( T10.BarFasLin," ;
      sFromString += " 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND" ;
      sFromString += " T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasSig, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM" ;
      sFromString += " (TXPBARFAS T9 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC3, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo," ;
      sFromString += " BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin =" ;
      sFromString += " T10.GXC3) AND (T9.BarFasEst <> 0) GROUP BY T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo" ;
      sFromString += " = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet)" ;
      sFromString += " AS BarMtr, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND" ;
      sFromString += " T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV16BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV36CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV37CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (0==AV32BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (0==AV33BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19BarFecClito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV14BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV15BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV28BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV29BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV34BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV35BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV6BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV11BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV9BarCodReofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV10BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarFecGen" ;
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H026E17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV16BarDisNumfrom ,
                                           String AV17BarDisNumto ,
                                           int AV36CliCodfrom ,
                                           int AV37CliCodto ,
                                           byte AV32BarSitfrom ,
                                           byte AV33BarSitto ,
                                           java.util.Date AV22BarFecGenfrom ,
                                           java.util.Date AV23BarFecGento ,
                                           java.util.Date AV24BarFecSalfrom ,
                                           java.util.Date AV25BarFecSalto ,
                                           java.util.Date AV18BarFecClifrom ,
                                           java.util.Date AV19BarFecClito ,
                                           java.util.Date AV20BarFecFprfrom ,
                                           java.util.Date AV21BarFecFprto ,
                                           String AV30BarSerfrom ,
                                           String AV31BarSerto ,
                                           String AV12BarColNomfrom ,
                                           String AV13BarColNomto ,
                                           int AV14BarColNumfrom ,
                                           int AV15BarColNumto ,
                                           String AV26BarNomClifrom ,
                                           String AV27BarNomClito ,
                                           int AV28BarNumClifrom ,
                                           int AV29BarNumClito ,
                                           short AV34BarTipArtfrom ,
                                           short AV35BarTipArtto ,
                                           String AV136TFBarPlf ,
                                           int AV6BarCodfrom ,
                                           int AV11BarCodto ,
                                           byte AV9BarCodReofrom ,
                                           byte AV10BarCodReoto ,
                                           String AV7BarCodParfrom ,
                                           String AV8BarCodParto ,
                                           String AV38Cod_Idtx ,
                                           String AV69BarGirar ,
                                           String A143BarDisNum ,
                                           int A252CliCod ,
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
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A2829BarProPer ,
                                           String A2454BarGirar ,
                                           String AV5Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[36];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasSig, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARFAS T9 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) INNER JOIN" ;
      scmdbuf += " (SELECT MIN(T12.BarOrdLin) AS GXC2, COALESCE( T13.BarFasLin, 0) AS BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar FROM (TXPBARFAS T12 LEFT JOIN" ;
      scmdbuf += " (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar )" ;
      scmdbuf += " T13 ON T13.EmprCod = T12.EmprCod AND T13.BarCod = T12.BarCod AND T13.BarCodReo = T12.BarCodReo AND T13.BarCodPar = T12.BarCodPar) WHERE (T12.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T12.BarOrdLin > COALESCE( T13.BarFasLin, 0)) AND (T12.BarFasEst = 0) GROUP BY T13.BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar ) T11 ON T11.EmprCod" ;
      scmdbuf += " = T9.EmprCod AND T11.BarCod = T9.BarCod AND T11.BarCodReo = T9.BarCodReo AND T11.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin = T11.GXC2) AND (T9.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T9.BarOrdLin > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T6 ON T6.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasSig, T9.EmprCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC3, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar" ;
      scmdbuf += " = T9.BarCodPar) WHERE (T9.BarOrdLin = T10.GXC3) AND (T9.BarFasEst <> 0) GROUP BY T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T8.BarCod = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV16BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (0==AV36CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (0==AV37CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (0==AV32BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (0==AV33BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19BarFecClito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (0==AV14BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV15BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (0==AV28BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV29BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV34BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (0==AV35BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (0==AV6BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (0==AV11BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV9BarCodReofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV10BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H026E19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV16BarDisNumfrom ,
                                           String AV17BarDisNumto ,
                                           int AV36CliCodfrom ,
                                           int AV37CliCodto ,
                                           byte AV32BarSitfrom ,
                                           byte AV33BarSitto ,
                                           java.util.Date AV22BarFecGenfrom ,
                                           java.util.Date AV23BarFecGento ,
                                           java.util.Date AV24BarFecSalfrom ,
                                           java.util.Date AV25BarFecSalto ,
                                           java.util.Date AV18BarFecClifrom ,
                                           java.util.Date AV19BarFecClito ,
                                           java.util.Date AV20BarFecFprfrom ,
                                           java.util.Date AV21BarFecFprto ,
                                           String AV30BarSerfrom ,
                                           String AV31BarSerto ,
                                           String AV12BarColNomfrom ,
                                           String AV13BarColNomto ,
                                           int AV14BarColNumfrom ,
                                           int AV15BarColNumto ,
                                           String AV26BarNomClifrom ,
                                           String AV27BarNomClito ,
                                           int AV28BarNumClifrom ,
                                           int AV29BarNumClito ,
                                           short AV34BarTipArtfrom ,
                                           short AV35BarTipArtto ,
                                           String AV136TFBarPlf ,
                                           int AV6BarCodfrom ,
                                           int AV11BarCodto ,
                                           byte AV9BarCodReofrom ,
                                           byte AV10BarCodReoto ,
                                           String AV7BarCodParfrom ,
                                           String AV8BarCodParto ,
                                           String AV38Cod_Idtx ,
                                           String AV69BarGirar ,
                                           String A143BarDisNum ,
                                           int A252CliCod ,
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
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A2829BarProPer ,
                                           String A2454BarGirar ,
                                           String AV5Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[36];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T1.BarGirar, T1.BarProPer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarPlf, T1.BarTipArt AS BarTipArt, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom," ;
      scmdbuf += " T1.BarSer, T1.BarFecFpr, T1.BarFecCli, T1.BarFecSal, T1.BarFecGen, T1.BarSit, T1.CliCod, T1.BarDisNum, T1.EmprCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE(" ;
      scmdbuf += " T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV16BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      if ( ! (0==AV36CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( ! (0==AV37CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (0==AV32BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( ! (0==AV33BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19BarFecClito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (0==AV14BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV15BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV28BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV29BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (0==AV34BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (0==AV35BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (0==AV6BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (0==AV11BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (0==AV9BarCodReofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV10BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H026E9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 1 :
                  return conditional_H026E17(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 2 :
                  return conditional_H026E19(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H026E9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026E17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026E19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 26);
               ((String[]) buf[21])[0] = rslt.getString(19, 16);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
               ((String[]) buf[23])[0] = rslt.getString(21, 30);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(27,2);
               ((short[]) buf[34])[0] = rslt.getShort(28);
               ((String[]) buf[35])[0] = rslt.getString(29, 1);
               ((int[]) buf[36])[0] = rslt.getInt(30);
               ((String[]) buf[37])[0] = rslt.getString(31, 1);
               ((byte[]) buf[38])[0] = rslt.getByte(32);
               ((int[]) buf[39])[0] = rslt.getInt(33);
               ((String[]) buf[40])[0] = rslt.getString(34, 8);
               ((int[]) buf[41])[0] = rslt.getInt(35);
               ((String[]) buf[42])[0] = rslt.getString(36, 8);
               ((String[]) buf[43])[0] = rslt.getString(37, 20);
               ((String[]) buf[44])[0] = rslt.getString(38, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((String[]) buf[21])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((int[]) buf[26])[0] = rslt.getInt(25);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               return;
      }
   }

}

