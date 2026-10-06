package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultaproduccion_tabla_materializada_impl extends GXWebComponent
{
   public consultaproduccion_tabla_materializada_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultaproduccion_tabla_materializada_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaproduccion_tabla_materializada_impl.class ));
   }

   public consultaproduccion_tabla_materializada_impl( int remoteHandle ,
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
               AV131Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131Emprcod", AV131Emprcod);
               AV129CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129CliCodfrom), 6, 0));
               AV130CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130CliCodto), 6, 0));
               AV108BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108BarDisNumfrom", AV108BarDisNumfrom);
               AV109BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109BarDisNumto", AV109BarDisNumto);
               AV114BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarFecGenfrom", localUtil.format(AV114BarFecGenfrom, "99/99/99"));
               AV115BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarFecGento", localUtil.format(AV115BarFecGento, "99/99/99"));
               AV125BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125BarSitfrom), 2, 0));
               AV126BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126BarSitto), 2, 0));
               AV110BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110BarFecClifrom", localUtil.format(AV110BarFecClifrom, "99/99/99"));
               AV111BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111BarFecClito", localUtil.format(AV111BarFecClito, "99/99/99"));
               AV112BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112BarFecFprfrom", localUtil.format(AV112BarFecFprfrom, "99/99/99"));
               AV113BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113BarFecFprto", localUtil.format(AV113BarFecFprto, "99/99/99"));
               AV116BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116BarFecSalfrom", localUtil.format(AV116BarFecSalfrom, "99/99/99"));
               AV117BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117BarFecSalto", localUtil.format(AV117BarFecSalto, "99/99/99"));
               AV123BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123BarSerfrom", AV123BarSerfrom);
               AV124BarSerto = httpContext.GetPar( "BarSerto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124BarSerto", AV124BarSerto);
               AV127BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127BarTipArtfrom), 4, 0));
               AV128BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarTipArtto), 4, 0));
               AV104BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104BarColNomfrom", AV104BarColNomfrom);
               AV105BarColNomto = httpContext.GetPar( "BarColNomto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105BarColNomto", AV105BarColNomto);
               AV106BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarColNumfrom), 6, 0));
               AV107BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarColNumto), 6, 0));
               AV119BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarNomClifrom", AV119BarNomClifrom);
               AV120BarNomClito = httpContext.GetPar( "BarNomClito") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarNomClito", AV120BarNomClito);
               AV121BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarNumClifrom), 6, 0));
               AV122BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122BarNumClito), 6, 0));
               AV127BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127BarTipArtfrom), 4, 0));
               AV128BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarTipArtto), 4, 0));
               AV136muestras = httpContext.GetPar( "muestras") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136muestras", AV136muestras);
               AV98BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarCodfrom), 8, 0));
               AV103BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarCodto), 8, 0));
               AV101BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarCodReofrom", GXutil.str( AV101BarCodReofrom, 1, 0));
               AV102BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102BarCodReoto", GXutil.str( AV102BarCodReoto, 1, 0));
               AV99BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99BarCodParfrom", AV99BarCodParfrom);
               AV100BarCodParto = httpContext.GetPar( "BarCodParto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarCodParto", AV100BarCodParto);
               AV132Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Cod_idtx", AV132Cod_idtx);
               AV118BarGirar = httpContext.GetPar( "BarGirar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118BarGirar", AV118BarGirar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV131Emprcod,Integer.valueOf(AV129CliCodfrom),Integer.valueOf(AV130CliCodto),AV108BarDisNumfrom,AV109BarDisNumto,AV114BarFecGenfrom,AV115BarFecGento,Byte.valueOf(AV125BarSitfrom),Byte.valueOf(AV126BarSitto),AV110BarFecClifrom,AV111BarFecClito,AV112BarFecFprfrom,AV113BarFecFprto,AV116BarFecSalfrom,AV117BarFecSalto,AV123BarSerfrom,AV124BarSerto,Short.valueOf(AV127BarTipArtfrom),Short.valueOf(AV128BarTipArtto),AV104BarColNomfrom,AV105BarColNomto,Integer.valueOf(AV106BarColNumfrom),Integer.valueOf(AV107BarColNumto),AV119BarNomClifrom,AV120BarNomClito,Integer.valueOf(AV121BarNumClifrom),Integer.valueOf(AV122BarNumClito),Short.valueOf(AV127BarTipArtfrom),Short.valueOf(AV128BarTipArtto),AV136muestras,Integer.valueOf(AV98BarCodfrom),Integer.valueOf(AV103BarCodto),Byte.valueOf(AV101BarCodReofrom),Byte.valueOf(AV102BarCodReoto),AV99BarCodParfrom,AV100BarCodParto,AV132Cod_idtx,AV118BarGirar});
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
      nRC_GXsfl_44 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_44"))) ;
      nGXsfl_44_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_44_idx"))) ;
      sGXsfl_44_idx = httpContext.GetPar( "sGXsfl_44_idx") ;
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
      AV166FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV131Emprcod = httpContext.GetPar( "Emprcod") ;
      AV129CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
      AV130CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      AV108BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
      AV109BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
      AV114BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
      AV115BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
      AV125BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
      AV126BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
      AV110BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
      AV111BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
      AV112BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
      AV113BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
      AV116BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
      AV117BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
      AV123BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
      AV124BarSerto = httpContext.GetPar( "BarSerto") ;
      AV127BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
      AV128BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
      AV104BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
      AV105BarColNomto = httpContext.GetPar( "BarColNomto") ;
      AV106BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
      AV107BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
      AV119BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
      AV120BarNomClito = httpContext.GetPar( "BarNomClito") ;
      AV121BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
      AV122BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
      AV98BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
      AV103BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
      AV101BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
      AV102BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
      AV99BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
      AV100BarCodParto = httpContext.GetPar( "BarCodParto") ;
      AV132Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
      AV118BarGirar = httpContext.GetPar( "BarGirar") ;
      AV169ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5ColumnsSelector);
      AV172Pgmname = httpContext.GetPar( "Pgmname") ;
      AV21OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV23OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV133TFBarPlf = httpContext.GetPar( "TFBarPlf") ;
      AV148TotCP_BARKGM = CommonUtil.decimalVal( httpContext.GetPar( "TotCP_BARKGM"), ".") ;
      AV150TotCP_BARMTR = CommonUtil.decimalVal( httpContext.GetPar( "TotCP_BARMTR"), ".") ;
      AV152TotCP_BARPIE = GXutil.lval( httpContext.GetPar( "TotCP_BARPIE")) ;
      AV157Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV166FilterFullText, AV131Emprcod, AV129CliCodfrom, AV130CliCodto, AV108BarDisNumfrom, AV109BarDisNumto, AV114BarFecGenfrom, AV115BarFecGento, AV125BarSitfrom, AV126BarSitto, AV110BarFecClifrom, AV111BarFecClito, AV112BarFecFprfrom, AV113BarFecFprto, AV116BarFecSalfrom, AV117BarFecSalto, AV123BarSerfrom, AV124BarSerto, AV127BarTipArtfrom, AV128BarTipArtto, AV104BarColNomfrom, AV105BarColNomto, AV106BarColNumfrom, AV107BarColNumto, AV119BarNomClifrom, AV120BarNomClito, AV121BarNumClifrom, AV122BarNumClito, AV98BarCodfrom, AV103BarCodto, AV101BarCodReofrom, AV102BarCodReoto, AV99BarCodParfrom, AV100BarCodParto, AV132Cod_idtx, AV118BarGirar, AV169ManageFiltersExecutionStep, AV5ColumnsSelector, AV172Pgmname, AV21OrderedBy, AV23OrderedDsc, AV133TFBarPlf, AV148TotCP_BARKGM, AV150TotCP_BARMTR, AV152TotCP_BARPIE, AV157Moda21, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa26N2( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.consultaproduccion_tabla_materializada", new String[] {GXutil.URLEncode(GXutil.rtrim(AV131Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV129CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV130CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV108BarDisNumfrom)),GXutil.URLEncode(GXutil.rtrim(AV109BarDisNumto)),GXutil.URLEncode(GXutil.formatDateParm(AV114BarFecGenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV115BarFecGento)),GXutil.URLEncode(GXutil.ltrimstr(AV125BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV126BarSitto,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV110BarFecClifrom)),GXutil.URLEncode(GXutil.formatDateParm(AV111BarFecClito)),GXutil.URLEncode(GXutil.formatDateParm(AV112BarFecFprfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV113BarFecFprto)),GXutil.URLEncode(GXutil.formatDateParm(AV116BarFecSalfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV117BarFecSalto)),GXutil.URLEncode(GXutil.rtrim(AV123BarSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV124BarSerto)),GXutil.URLEncode(GXutil.ltrimstr(AV127BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV128BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV104BarColNomfrom)),GXutil.URLEncode(GXutil.rtrim(AV105BarColNomto)),GXutil.URLEncode(GXutil.ltrimstr(AV106BarColNumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV107BarColNumto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV119BarNomClifrom)),GXutil.URLEncode(GXutil.rtrim(AV120BarNomClito)),GXutil.URLEncode(GXutil.ltrimstr(AV121BarNumClifrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV122BarNumClito,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV127BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV128BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV136muestras)),GXutil.URLEncode(GXutil.ltrimstr(AV98BarCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV103BarCodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV101BarCodReofrom,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV102BarCodReoto,1,0)),GXutil.URLEncode(GXutil.rtrim(AV99BarCodParfrom)),GXutil.URLEncode(GXutil.rtrim(AV100BarCodParto)),GXutil.URLEncode(GXutil.rtrim(AV132Cod_idtx)),GXutil.URLEncode(GXutil.rtrim(AV118BarGirar))}, new String[] {"Emprcod","CliCodfrom","CliCodto","BarDisNumfrom","BarDisNumto","BarFecGenfrom","BarFecGento","BarSitfrom","BarSitto","BarFecClifrom","BarFecClito","BarFecFprfrom","BarFecFprto","BarFecSalfrom","BarFecSalto","BarSerfrom","BarSerto","BarTipArtfrom","BarTipArtto","BarColNomfrom","BarColNomto","BarColNumfrom","BarColNumto","BarNomClifrom","BarNomClito","BarNumClifrom","BarNumClito","BarTipArtfrom","BarTipArtto","muestras","BarCodfrom","BarCodto","BarCodReofrom","BarCodReoto","BarCodParfrom","BarCodParto","Cod_idtx","BarGirar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPLF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV133TFBarPlf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV148TotCP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV150TotCP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152TotCP_BARPIE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV157Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaProduccion_Tabla_Materializada");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV172Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultaproduccion_tabla_materializada:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV166FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_44, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV167ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV167ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV15GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV16GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV12DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV12DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV131Emprcod", GXutil.rtrim( wcpOAV131Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV129CliCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV129CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV130CliCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV130CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV108BarDisNumfrom", GXutil.rtrim( wcpOAV108BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV109BarDisNumto", GXutil.rtrim( wcpOAV109BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV114BarFecGenfrom", localUtil.dtoc( wcpOAV114BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV115BarFecGento", localUtil.dtoc( wcpOAV115BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV125BarSitfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV125BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV126BarSitto", GXutil.ltrim( localUtil.ntoc( wcpOAV126BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV110BarFecClifrom", localUtil.dtoc( wcpOAV110BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV111BarFecClito", localUtil.dtoc( wcpOAV111BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV112BarFecFprfrom", localUtil.dtoc( wcpOAV112BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV113BarFecFprto", localUtil.dtoc( wcpOAV113BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV116BarFecSalfrom", localUtil.dtoc( wcpOAV116BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV117BarFecSalto", localUtil.dtoc( wcpOAV117BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV123BarSerfrom", GXutil.rtrim( wcpOAV123BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV124BarSerto", GXutil.rtrim( wcpOAV124BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV127BarTipArtfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV127BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV128BarTipArtto", GXutil.ltrim( localUtil.ntoc( wcpOAV128BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV104BarColNomfrom", GXutil.rtrim( wcpOAV104BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV105BarColNomto", GXutil.rtrim( wcpOAV105BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV106BarColNumfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV106BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV107BarColNumto", GXutil.ltrim( localUtil.ntoc( wcpOAV107BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV119BarNomClifrom", GXutil.rtrim( wcpOAV119BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV120BarNomClito", GXutil.rtrim( wcpOAV120BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV121BarNumClifrom", GXutil.ltrim( localUtil.ntoc( wcpOAV121BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV122BarNumClito", GXutil.ltrim( localUtil.ntoc( wcpOAV122BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV136muestras", GXutil.rtrim( wcpOAV136muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV98BarCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV98BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV103BarCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV103BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV101BarCodReofrom", GXutil.ltrim( localUtil.ntoc( wcpOAV101BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV102BarCodReoto", GXutil.ltrim( localUtil.ntoc( wcpOAV102BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV99BarCodParfrom", GXutil.rtrim( wcpOAV99BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV100BarCodParto", GXutil.rtrim( wcpOAV100BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV132Cod_idtx", GXutil.rtrim( wcpOAV132Cod_idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV118BarGirar", GXutil.rtrim( wcpOAV118BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV169ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV21OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV23OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV131Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMFROM", GXutil.rtrim( AV108BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMTO", GXutil.rtrim( AV109BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV129CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV130CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV125BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV126BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENFROM", localUtil.dtoc( AV114BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENTO", localUtil.dtoc( AV115BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALFROM", localUtil.dtoc( AV116BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALTO", localUtil.dtoc( AV117BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLIFROM", localUtil.dtoc( AV110BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLITO", localUtil.dtoc( AV111BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRFROM", localUtil.dtoc( AV112BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRTO", localUtil.dtoc( AV113BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERFROM", GXutil.rtrim( AV123BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERTO", GXutil.rtrim( AV124BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMFROM", GXutil.rtrim( AV104BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMTO", GXutil.rtrim( AV105BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMFROM", GXutil.ltrim( localUtil.ntoc( AV106BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV107BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLIFROM", GXutil.rtrim( AV119BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLITO", GXutil.rtrim( AV120BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CP_BARNUMC", GXutil.ltrim( localUtil.ntoc( A14305CP_BARNUMC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLIFROM", GXutil.ltrim( localUtil.ntoc( AV121BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLITO", GXutil.ltrim( localUtil.ntoc( AV122BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTFROM", GXutil.ltrim( localUtil.ntoc( AV127BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTTO", GXutil.ltrim( localUtil.ntoc( AV128BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPLF", GXutil.rtrim( AV133TFBarPlf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPLF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV133TFBarPlf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODFROM", GXutil.ltrim( localUtil.ntoc( AV98BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODTO", GXutil.ltrim( localUtil.ntoc( AV103BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOFROM", GXutil.ltrim( localUtil.ntoc( AV101BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOTO", GXutil.ltrim( localUtil.ntoc( AV102BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARFROM", GXutil.rtrim( AV99BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARTO", GXutil.rtrim( AV100BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOD_IDTX", GXutil.rtrim( AV132Cod_idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARGIRAR", GXutil.rtrim( AV118BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARKGM", GXutil.ltrim( localUtil.ntoc( AV148TotCP_BARKGM, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV148TotCP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARMTR", GXutil.ltrim( localUtil.ntoc( AV150TotCP_BARMTR, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV150TotCP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARPIE", GXutil.ltrim( localUtil.ntoc( AV152TotCP_BARPIE, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152TotCP_BARPIE), "ZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV17GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV17GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV157Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV157Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMUESTRAS", GXutil.rtrim( AV136muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm26N2( )
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
      return "Produccion.ConsultaProduccion_Tabla_Materializada" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Consulta de Produccion", "") ;
   }

   public void wb26N0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.consultaproduccion_tabla_materializada");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultaProduccion_Tabla_Materializada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultaProduccion_Tabla_Materializada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultaProduccion_Tabla_Materializada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_26_26N2( true) ;
      }
      else
      {
         wb_table1_26_26N2( false) ;
      }
      return  ;
   }

   public void wb_table1_26_26N2e( boolean wbgen )
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
         startgridcontrol44( ) ;
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_44 = (int)(nGXsfl_44_idx-1) ;
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
         wb_table2_86_26N2( true) ;
      }
      else
      {
         wb_table2_86_26N2( false) ;
      }
      return  ;
   }

   public void wb_table2_86_26N2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV15GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV16GridPageCount);
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
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "Pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV172Pgmname), GXutil.rtrim( localUtil.format( AV172Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 30, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultaProduccion_Tabla_Materializada.htm");
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV12DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV12DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV5ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table3_148_26N2( true) ;
      }
      else
      {
         wb_table3_148_26N2( false) ;
      }
      return  ;
   }

   public void wb_table3_148_26N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_153_26N2( true) ;
      }
      else
      {
         wb_table4_153_26N2( false) ;
      }
      return  ;
   }

   public void wb_table4_153_26N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_158_26N2( true) ;
      }
      else
      {
         wb_table5_158_26N2( false) ;
      }
      return  ;
   }

   public void wb_table5_158_26N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_163_26N2( true) ;
      }
      else
      {
         wb_table6_163_26N2( false) ;
      }
      return  ;
   }

   public void wb_table6_163_26N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_168_26N2( true) ;
      }
      else
      {
         wb_table7_168_26N2( false) ;
      }
      return  ;
   }

   public void wb_table7_168_26N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table8_173_26N2( true) ;
      }
      else
      {
         wb_table8_173_26N2( false) ;
      }
      return  ;
   }

   public void wb_table8_173_26N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table9_178_26N2( true) ;
      }
      else
      {
         wb_table9_178_26N2( false) ;
      }
      return  ;
   }

   public void wb_table9_178_26N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0186"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0186"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_44_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0186"+"");
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
      if ( wbEnd == 44 )
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

   public void start26N2( )
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
            strup26N0( ) ;
         }
      }
   }

   public void ws26N2( )
   {
      start26N2( ) ;
      evt26N2( ) ;
   }

   public void evt26N2( )
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
                              strup26N0( ) ;
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
                              strup26N0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1126N2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26N0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1226N2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26N0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1326N2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26N0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1426N2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26N0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1526N2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26N0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1626N2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26N0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1726N2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26N0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26N0( ) ;
                           }
                           nGXsfl_44_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_442( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV155GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155GridActionGroup1), 4, 0));
                           A14328CP_EMPRCOD = httpContext.cgiGet( edtCP_EMPRCOD_Internalname) ;
                           A14326CP_CLICOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_CLICOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14327CP_CLINOM = httpContext.cgiGet( edtCP_CLINOM_Internalname) ;
                           A14324CP_BARDISN = httpContext.cgiGet( edtCP_BARDISN_Internalname) ;
                           A14301CP_BARCOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14302CP_BARCODR = (byte)(localUtil.ctol( httpContext.cgiGet( edtCP_BARCODR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14303CP_BARCODP = httpContext.cgiGet( edtCP_BARCODP_Internalname) ;
                           A14319CP_BARAGRE = httpContext.cgiGet( edtCP_BARAGRE_Internalname) ;
                           A14311CP_BARSER = httpContext.cgiGet( edtCP_BARSER_Internalname) ;
                           A14312CP_BARSERD = httpContext.cgiGet( edtCP_BARSERD_Internalname) ;
                           A14316CP_BARTIPA = (short)(localUtil.ctol( httpContext.cgiGet( edtCP_BARTIPA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14343CP_TARTDSC = httpContext.cgiGet( edtCP_TARTDSC_Internalname) ;
                           A14331CP_BARCOLO = httpContext.cgiGet( edtCP_BARCOLO_Internalname) ;
                           A14332CP_BARCOLU = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARCOLU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14315CP_BARNOMC = httpContext.cgiGet( edtCP_BARNOMC_Internalname) ;
                           A14336CP_BARKGM = localUtil.ctond( httpContext.cgiGet( edtCP_BARKGM_Internalname)) ;
                           A14337CP_BARMTR = localUtil.ctond( httpContext.cgiGet( edtCP_BARMTR_Internalname)) ;
                           A14338CP_BARPIE = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARPIE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14307CP_BARSIT = (byte)(localUtil.ctol( httpContext.cgiGet( edtCP_BARSIT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14308CP_BARFECG = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCP_BARFECG_Internalname), 0)) ;
                           A14309CP_BARFECC = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCP_BARFECC_Internalname), 0)) ;
                           A14304CP_BARFECF = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCP_BARFECF_Internalname), 0)) ;
                           A14310CP_BARFECS = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCP_BARFECS_Internalname), 0)) ;
                           AV143BarFasCod = httpContext.cgiGet( edtavBarfascod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfascod_Internalname, AV143BarFasCod);
                           AV140BarFasSig = httpContext.cgiGet( edtavBarfassig_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfassig_Internalname, AV140BarFasSig);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbultimo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbultimo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBULTIMO");
                              GX_FocusControl = edtavBaralbultimo_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV141BarAlbUltimo = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbultimo_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141BarAlbUltimo), 10, 0));
                           }
                           else
                           {
                              AV141BarAlbUltimo = localUtil.ctol( httpContext.cgiGet( edtavBaralbultimo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbultimo_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141BarAlbUltimo), 10, 0));
                           }
                           A14339CP_BARALBK = localUtil.ctond( httpContext.cgiGet( edtCP_BARALBK_Internalname)) ;
                           A14340CP_BARALBM = localUtil.ctond( httpContext.cgiGet( edtCP_BARALBM_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbfact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbfact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBFACT");
                              GX_FocusControl = edtavBaralbfact_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV142BarAlbFact = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbfact_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV142BarAlbFact), 8, 0));
                           }
                           else
                           {
                              AV142BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbfact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbfact_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV142BarAlbFact), 8, 0));
                           }
                           A14317CP_BARGIRA = httpContext.cgiGet( edtCP_BARGIRA_Internalname) ;
                           A14323CP_BARPROP = httpContext.cgiGet( edtCP_BARPROP_Internalname) ;
                           A14334CP_DSC_BAR = httpContext.cgiGet( edtCP_DSC_BAR_Internalname) ;
                           A14341CP_DISUSRC = httpContext.cgiGet( edtCP_DISUSRC_Internalname) ;
                           A14297CP_ID = localUtil.ctol( httpContext.cgiGet( edtCP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14306CP_BARPLF = httpContext.cgiGet( edtCP_BARPLF_Internalname) ;
                           A14320CP_BAREXT = (byte)(localUtil.ctol( httpContext.cgiGet( edtCP_BAREXT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14321CP_DISDES = httpContext.cgiGet( edtCP_DISDES_Internalname) ;
                           A14322CP_DISCOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_DISCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       e1826N2 ();
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
                                       e1926N2 ();
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
                                       e2026N2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV166FilterFullText) != 0 )
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
                                    strup26N0( ) ;
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
                     if ( nCmpId == 186 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0186") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0186", "", sEvt);
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

   public void we26N2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm26N2( ) ;
         }
      }
   }

   public void pa26N2( )
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
      subsflControlProps_442( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         sendrow_442( ) ;
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV166FilterFullText ,
                                 String AV131Emprcod ,
                                 int AV129CliCodfrom ,
                                 int AV130CliCodto ,
                                 String AV108BarDisNumfrom ,
                                 String AV109BarDisNumto ,
                                 java.util.Date AV114BarFecGenfrom ,
                                 java.util.Date AV115BarFecGento ,
                                 byte AV125BarSitfrom ,
                                 byte AV126BarSitto ,
                                 java.util.Date AV110BarFecClifrom ,
                                 java.util.Date AV111BarFecClito ,
                                 java.util.Date AV112BarFecFprfrom ,
                                 java.util.Date AV113BarFecFprto ,
                                 java.util.Date AV116BarFecSalfrom ,
                                 java.util.Date AV117BarFecSalto ,
                                 String AV123BarSerfrom ,
                                 String AV124BarSerto ,
                                 short AV127BarTipArtfrom ,
                                 short AV128BarTipArtto ,
                                 String AV104BarColNomfrom ,
                                 String AV105BarColNomto ,
                                 int AV106BarColNumfrom ,
                                 int AV107BarColNumto ,
                                 String AV119BarNomClifrom ,
                                 String AV120BarNomClito ,
                                 int AV121BarNumClifrom ,
                                 int AV122BarNumClito ,
                                 int AV98BarCodfrom ,
                                 int AV103BarCodto ,
                                 byte AV101BarCodReofrom ,
                                 byte AV102BarCodReoto ,
                                 String AV99BarCodParfrom ,
                                 String AV100BarCodParto ,
                                 String AV132Cod_idtx ,
                                 String AV118BarGirar ,
                                 byte AV169ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ,
                                 String AV172Pgmname ,
                                 short AV21OrderedBy ,
                                 boolean AV23OrderedDsc ,
                                 String AV133TFBarPlf ,
                                 java.math.BigDecimal AV148TotCP_BARKGM ,
                                 java.math.BigDecimal AV150TotCP_BARMTR ,
                                 long AV152TotCP_BARPIE ,
                                 short AV157Moda21 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1926N2 ();
      GRID_nCurrentRecord = 0 ;
      rf26N2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaProduccion_Tabla_Materializada");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV172Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultaproduccion_tabla_materializada:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CP_BARSERD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14312CP_BARSERD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CP_BARSERD", A14312CP_BARSERD);
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
      rf26N2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV172Pgmname = "Produccion.ConsultaProduccion_Tabla_Materializada" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172Pgmname", AV172Pgmname);
      Gx_err = (short)(0) ;
      edtavBarfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavBarfassig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfassig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassig_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavBaralbultimo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbultimo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbultimo_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavBaralbfact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbfact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbfact_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavTotvaluecp_barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecp_barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecp_barkgm_Enabled), 5, 0), true);
      edtavTotvaluecp_barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecp_barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecp_barmtr_Enabled), 5, 0), true);
      edtavTotvaluecp_barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecp_barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecp_barpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26N2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(44) ;
      /* Execute user event: Refresh */
      e1926N2 ();
      nGXsfl_44_idx = 1 ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      bGXsfl_44_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_442( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ,
                                              AV108BarDisNumfrom ,
                                              AV109BarDisNumto ,
                                              Integer.valueOf(AV129CliCodfrom) ,
                                              Integer.valueOf(AV130CliCodto) ,
                                              Byte.valueOf(AV125BarSitfrom) ,
                                              Byte.valueOf(AV126BarSitto) ,
                                              AV114BarFecGenfrom ,
                                              AV115BarFecGento ,
                                              AV116BarFecSalfrom ,
                                              AV117BarFecSalto ,
                                              AV110BarFecClifrom ,
                                              AV111BarFecClito ,
                                              AV112BarFecFprfrom ,
                                              AV113BarFecFprto ,
                                              AV123BarSerfrom ,
                                              AV124BarSerto ,
                                              AV104BarColNomfrom ,
                                              AV105BarColNomto ,
                                              Integer.valueOf(AV106BarColNumfrom) ,
                                              Integer.valueOf(AV107BarColNumto) ,
                                              AV119BarNomClifrom ,
                                              AV120BarNomClito ,
                                              Integer.valueOf(AV121BarNumClifrom) ,
                                              Integer.valueOf(AV122BarNumClito) ,
                                              Short.valueOf(AV127BarTipArtfrom) ,
                                              Short.valueOf(AV128BarTipArtto) ,
                                              AV133TFBarPlf ,
                                              Integer.valueOf(AV98BarCodfrom) ,
                                              Integer.valueOf(AV103BarCodto) ,
                                              Byte.valueOf(AV101BarCodReofrom) ,
                                              Byte.valueOf(AV102BarCodReoto) ,
                                              AV99BarCodParfrom ,
                                              AV100BarCodParto ,
                                              AV132Cod_idtx ,
                                              AV118BarGirar ,
                                              A14327CP_CLINOM ,
                                              A14324CP_BARDISN ,
                                              Integer.valueOf(A14326CP_CLICOD) ,
                                              Byte.valueOf(A14307CP_BARSIT) ,
                                              A14308CP_BARFECG ,
                                              A14310CP_BARFECS ,
                                              A14309CP_BARFECC ,
                                              A14304CP_BARFECF ,
                                              A14311CP_BARSER ,
                                              A14331CP_BARCOLO ,
                                              Integer.valueOf(A14332CP_BARCOLU) ,
                                              A14315CP_BARNOMC ,
                                              Integer.valueOf(A14305CP_BARNUMC) ,
                                              Short.valueOf(A14316CP_BARTIPA) ,
                                              A14306CP_BARPLF ,
                                              Integer.valueOf(A14301CP_BARCOD) ,
                                              Byte.valueOf(A14302CP_BARCODR) ,
                                              A14303CP_BARCODP ,
                                              A14323CP_BARPROP ,
                                              A14317CP_BARGIRA ,
                                              Short.valueOf(AV21OrderedBy) ,
                                              Boolean.valueOf(AV23OrderedDsc) ,
                                              AV131Emprcod ,
                                              A14328CP_EMPRCOD } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext), "%", "") ;
         lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext), "%", "") ;
         /* Using cursor H026N2 */
         pr_default.execute(0, new Object[] {AV131Emprcod, lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext, lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext, AV108BarDisNumfrom, AV109BarDisNumto, Integer.valueOf(AV129CliCodfrom), Integer.valueOf(AV130CliCodto), Byte.valueOf(AV125BarSitfrom), Byte.valueOf(AV126BarSitto), AV114BarFecGenfrom, AV115BarFecGento, AV116BarFecSalfrom, AV117BarFecSalto, AV110BarFecClifrom, AV111BarFecClito, AV112BarFecFprfrom, AV113BarFecFprto, AV123BarSerfrom, AV124BarSerto, AV104BarColNomfrom, AV105BarColNomto, Integer.valueOf(AV106BarColNumfrom), Integer.valueOf(AV107BarColNumto), AV119BarNomClifrom, AV120BarNomClito, Integer.valueOf(AV121BarNumClifrom), Integer.valueOf(AV122BarNumClito), Short.valueOf(AV127BarTipArtfrom), Short.valueOf(AV128BarTipArtto), AV133TFBarPlf, Integer.valueOf(AV98BarCodfrom), Integer.valueOf(AV103BarCodto), Byte.valueOf(AV101BarCodReofrom), Byte.valueOf(AV102BarCodReoto), AV99BarCodParfrom, AV100BarCodParto, AV132Cod_idtx, AV118BarGirar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_44_idx = 1 ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14305CP_BARNUMC = H026N2_A14305CP_BARNUMC[0] ;
            A14322CP_DISCOD = H026N2_A14322CP_DISCOD[0] ;
            A14321CP_DISDES = H026N2_A14321CP_DISDES[0] ;
            A14320CP_BAREXT = H026N2_A14320CP_BAREXT[0] ;
            A14306CP_BARPLF = H026N2_A14306CP_BARPLF[0] ;
            A14297CP_ID = H026N2_A14297CP_ID[0] ;
            A14341CP_DISUSRC = H026N2_A14341CP_DISUSRC[0] ;
            A14334CP_DSC_BAR = H026N2_A14334CP_DSC_BAR[0] ;
            A14323CP_BARPROP = H026N2_A14323CP_BARPROP[0] ;
            A14317CP_BARGIRA = H026N2_A14317CP_BARGIRA[0] ;
            A14340CP_BARALBM = H026N2_A14340CP_BARALBM[0] ;
            A14339CP_BARALBK = H026N2_A14339CP_BARALBK[0] ;
            A14310CP_BARFECS = H026N2_A14310CP_BARFECS[0] ;
            A14304CP_BARFECF = H026N2_A14304CP_BARFECF[0] ;
            A14309CP_BARFECC = H026N2_A14309CP_BARFECC[0] ;
            A14308CP_BARFECG = H026N2_A14308CP_BARFECG[0] ;
            A14307CP_BARSIT = H026N2_A14307CP_BARSIT[0] ;
            A14338CP_BARPIE = H026N2_A14338CP_BARPIE[0] ;
            A14337CP_BARMTR = H026N2_A14337CP_BARMTR[0] ;
            A14336CP_BARKGM = H026N2_A14336CP_BARKGM[0] ;
            A14315CP_BARNOMC = H026N2_A14315CP_BARNOMC[0] ;
            A14332CP_BARCOLU = H026N2_A14332CP_BARCOLU[0] ;
            A14331CP_BARCOLO = H026N2_A14331CP_BARCOLO[0] ;
            A14343CP_TARTDSC = H026N2_A14343CP_TARTDSC[0] ;
            A14316CP_BARTIPA = H026N2_A14316CP_BARTIPA[0] ;
            A14312CP_BARSERD = H026N2_A14312CP_BARSERD[0] ;
            A14311CP_BARSER = H026N2_A14311CP_BARSER[0] ;
            A14319CP_BARAGRE = H026N2_A14319CP_BARAGRE[0] ;
            A14303CP_BARCODP = H026N2_A14303CP_BARCODP[0] ;
            A14302CP_BARCODR = H026N2_A14302CP_BARCODR[0] ;
            A14301CP_BARCOD = H026N2_A14301CP_BARCOD[0] ;
            A14324CP_BARDISN = H026N2_A14324CP_BARDISN[0] ;
            A14327CP_CLINOM = H026N2_A14327CP_CLINOM[0] ;
            A14326CP_CLICOD = H026N2_A14326CP_CLICOD[0] ;
            A14328CP_EMPRCOD = H026N2_A14328CP_EMPRCOD[0] ;
            e2026N2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(44) ;
         wb26N0( ) ;
      }
      bGXsfl_44_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26N2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPLF", GXutil.rtrim( AV133TFBarPlf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPLF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV133TFBarPlf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARKGM", GXutil.ltrim( localUtil.ntoc( AV148TotCP_BARKGM, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV148TotCP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARMTR", GXutil.ltrim( localUtil.ntoc( AV150TotCP_BARMTR, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV150TotCP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARPIE", GXutil.ltrim( localUtil.ntoc( AV152TotCP_BARPIE, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152TotCP_BARPIE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CP_BARSERD"+"_"+sGXsfl_44_idx, getSecureSignedToken( sPrefix+sGXsfl_44_idx, GXutil.rtrim( localUtil.format( A14312CP_BARSERD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV157Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV157Moda21), "ZZZ9")));
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
      AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = AV166FilterFullText ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ,
                                           AV108BarDisNumfrom ,
                                           AV109BarDisNumto ,
                                           Integer.valueOf(AV129CliCodfrom) ,
                                           Integer.valueOf(AV130CliCodto) ,
                                           Byte.valueOf(AV125BarSitfrom) ,
                                           Byte.valueOf(AV126BarSitto) ,
                                           AV114BarFecGenfrom ,
                                           AV115BarFecGento ,
                                           AV116BarFecSalfrom ,
                                           AV117BarFecSalto ,
                                           AV110BarFecClifrom ,
                                           AV111BarFecClito ,
                                           AV112BarFecFprfrom ,
                                           AV113BarFecFprto ,
                                           AV123BarSerfrom ,
                                           AV124BarSerto ,
                                           AV104BarColNomfrom ,
                                           AV105BarColNomto ,
                                           Integer.valueOf(AV106BarColNumfrom) ,
                                           Integer.valueOf(AV107BarColNumto) ,
                                           AV119BarNomClifrom ,
                                           AV120BarNomClito ,
                                           Integer.valueOf(AV121BarNumClifrom) ,
                                           Integer.valueOf(AV122BarNumClito) ,
                                           Short.valueOf(AV127BarTipArtfrom) ,
                                           Short.valueOf(AV128BarTipArtto) ,
                                           AV133TFBarPlf ,
                                           Integer.valueOf(AV98BarCodfrom) ,
                                           Integer.valueOf(AV103BarCodto) ,
                                           Byte.valueOf(AV101BarCodReofrom) ,
                                           Byte.valueOf(AV102BarCodReoto) ,
                                           AV99BarCodParfrom ,
                                           AV100BarCodParto ,
                                           AV132Cod_idtx ,
                                           AV118BarGirar ,
                                           A14327CP_CLINOM ,
                                           A14324CP_BARDISN ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           A14311CP_BARSER ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14315CP_BARNOMC ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14306CP_BARPLF ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14323CP_BARPROP ,
                                           A14317CP_BARGIRA ,
                                           Short.valueOf(AV21OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           AV131Emprcod ,
                                           A14328CP_EMPRCOD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext), "%", "") ;
      lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext), "%", "") ;
      /* Using cursor H026N3 */
      pr_default.execute(1, new Object[] {AV131Emprcod, lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext, lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext, AV108BarDisNumfrom, AV109BarDisNumto, Integer.valueOf(AV129CliCodfrom), Integer.valueOf(AV130CliCodto), Byte.valueOf(AV125BarSitfrom), Byte.valueOf(AV126BarSitto), AV114BarFecGenfrom, AV115BarFecGento, AV116BarFecSalfrom, AV117BarFecSalto, AV110BarFecClifrom, AV111BarFecClito, AV112BarFecFprfrom, AV113BarFecFprto, AV123BarSerfrom, AV124BarSerto, AV104BarColNomfrom, AV105BarColNomto, Integer.valueOf(AV106BarColNumfrom), Integer.valueOf(AV107BarColNumto), AV119BarNomClifrom, AV120BarNomClito, Integer.valueOf(AV121BarNumClifrom), Integer.valueOf(AV122BarNumClito), Short.valueOf(AV127BarTipArtfrom), Short.valueOf(AV128BarTipArtto), AV133TFBarPlf, Integer.valueOf(AV98BarCodfrom), Integer.valueOf(AV103BarCodto), Byte.valueOf(AV101BarCodReofrom), Byte.valueOf(AV102BarCodReoto), AV99BarCodParfrom, AV100BarCodParto, AV132Cod_idtx, AV118BarGirar});
      GRID_nRecordCount = H026N3_AGRID_nRecordCount[0] ;
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
      AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = AV166FilterFullText ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV166FilterFullText, AV131Emprcod, AV129CliCodfrom, AV130CliCodto, AV108BarDisNumfrom, AV109BarDisNumto, AV114BarFecGenfrom, AV115BarFecGento, AV125BarSitfrom, AV126BarSitto, AV110BarFecClifrom, AV111BarFecClito, AV112BarFecFprfrom, AV113BarFecFprto, AV116BarFecSalfrom, AV117BarFecSalto, AV123BarSerfrom, AV124BarSerto, AV127BarTipArtfrom, AV128BarTipArtto, AV104BarColNomfrom, AV105BarColNomto, AV106BarColNumfrom, AV107BarColNumto, AV119BarNomClifrom, AV120BarNomClito, AV121BarNumClifrom, AV122BarNumClito, AV98BarCodfrom, AV103BarCodto, AV101BarCodReofrom, AV102BarCodReoto, AV99BarCodParfrom, AV100BarCodParto, AV132Cod_idtx, AV118BarGirar, AV169ManageFiltersExecutionStep, AV5ColumnsSelector, AV172Pgmname, AV21OrderedBy, AV23OrderedDsc, AV133TFBarPlf, AV148TotCP_BARKGM, AV150TotCP_BARMTR, AV152TotCP_BARPIE, AV157Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = AV166FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV166FilterFullText, AV131Emprcod, AV129CliCodfrom, AV130CliCodto, AV108BarDisNumfrom, AV109BarDisNumto, AV114BarFecGenfrom, AV115BarFecGento, AV125BarSitfrom, AV126BarSitto, AV110BarFecClifrom, AV111BarFecClito, AV112BarFecFprfrom, AV113BarFecFprto, AV116BarFecSalfrom, AV117BarFecSalto, AV123BarSerfrom, AV124BarSerto, AV127BarTipArtfrom, AV128BarTipArtto, AV104BarColNomfrom, AV105BarColNomto, AV106BarColNumfrom, AV107BarColNumto, AV119BarNomClifrom, AV120BarNomClito, AV121BarNumClifrom, AV122BarNumClito, AV98BarCodfrom, AV103BarCodto, AV101BarCodReofrom, AV102BarCodReoto, AV99BarCodParfrom, AV100BarCodParto, AV132Cod_idtx, AV118BarGirar, AV169ManageFiltersExecutionStep, AV5ColumnsSelector, AV172Pgmname, AV21OrderedBy, AV23OrderedDsc, AV133TFBarPlf, AV148TotCP_BARKGM, AV150TotCP_BARMTR, AV152TotCP_BARPIE, AV157Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = AV166FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV166FilterFullText, AV131Emprcod, AV129CliCodfrom, AV130CliCodto, AV108BarDisNumfrom, AV109BarDisNumto, AV114BarFecGenfrom, AV115BarFecGento, AV125BarSitfrom, AV126BarSitto, AV110BarFecClifrom, AV111BarFecClito, AV112BarFecFprfrom, AV113BarFecFprto, AV116BarFecSalfrom, AV117BarFecSalto, AV123BarSerfrom, AV124BarSerto, AV127BarTipArtfrom, AV128BarTipArtto, AV104BarColNomfrom, AV105BarColNomto, AV106BarColNumfrom, AV107BarColNumto, AV119BarNomClifrom, AV120BarNomClito, AV121BarNumClifrom, AV122BarNumClito, AV98BarCodfrom, AV103BarCodto, AV101BarCodReofrom, AV102BarCodReoto, AV99BarCodParfrom, AV100BarCodParto, AV132Cod_idtx, AV118BarGirar, AV169ManageFiltersExecutionStep, AV5ColumnsSelector, AV172Pgmname, AV21OrderedBy, AV23OrderedDsc, AV133TFBarPlf, AV148TotCP_BARKGM, AV150TotCP_BARMTR, AV152TotCP_BARPIE, AV157Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = AV166FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV166FilterFullText, AV131Emprcod, AV129CliCodfrom, AV130CliCodto, AV108BarDisNumfrom, AV109BarDisNumto, AV114BarFecGenfrom, AV115BarFecGento, AV125BarSitfrom, AV126BarSitto, AV110BarFecClifrom, AV111BarFecClito, AV112BarFecFprfrom, AV113BarFecFprto, AV116BarFecSalfrom, AV117BarFecSalto, AV123BarSerfrom, AV124BarSerto, AV127BarTipArtfrom, AV128BarTipArtto, AV104BarColNomfrom, AV105BarColNomto, AV106BarColNumfrom, AV107BarColNumto, AV119BarNomClifrom, AV120BarNomClito, AV121BarNumClifrom, AV122BarNumClito, AV98BarCodfrom, AV103BarCodto, AV101BarCodReofrom, AV102BarCodReoto, AV99BarCodParfrom, AV100BarCodParto, AV132Cod_idtx, AV118BarGirar, AV169ManageFiltersExecutionStep, AV5ColumnsSelector, AV172Pgmname, AV21OrderedBy, AV23OrderedDsc, AV133TFBarPlf, AV148TotCP_BARKGM, AV150TotCP_BARMTR, AV152TotCP_BARPIE, AV157Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = AV166FilterFullText ;
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
         gxgrgrid_refresh( subGrid_Rows, AV166FilterFullText, AV131Emprcod, AV129CliCodfrom, AV130CliCodto, AV108BarDisNumfrom, AV109BarDisNumto, AV114BarFecGenfrom, AV115BarFecGento, AV125BarSitfrom, AV126BarSitto, AV110BarFecClifrom, AV111BarFecClito, AV112BarFecFprfrom, AV113BarFecFprto, AV116BarFecSalfrom, AV117BarFecSalto, AV123BarSerfrom, AV124BarSerto, AV127BarTipArtfrom, AV128BarTipArtto, AV104BarColNomfrom, AV105BarColNomto, AV106BarColNumfrom, AV107BarColNumto, AV119BarNomClifrom, AV120BarNomClito, AV121BarNumClifrom, AV122BarNumClito, AV98BarCodfrom, AV103BarCodto, AV101BarCodReofrom, AV102BarCodReoto, AV99BarCodParfrom, AV100BarCodParto, AV132Cod_idtx, AV118BarGirar, AV169ManageFiltersExecutionStep, AV5ColumnsSelector, AV172Pgmname, AV21OrderedBy, AV23OrderedDsc, AV133TFBarPlf, AV148TotCP_BARKGM, AV150TotCP_BARMTR, AV152TotCP_BARPIE, AV157Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV172Pgmname = "Produccion.ConsultaProduccion_Tabla_Materializada" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172Pgmname", AV172Pgmname);
      Gx_err = (short)(0) ;
      edtavBarfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavBarfassig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfassig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassig_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavBaralbultimo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbultimo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbultimo_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavBaralbfact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbfact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbfact_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavTotvaluecp_barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecp_barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecp_barkgm_Enabled), 5, 0), true);
      edtavTotvaluecp_barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecp_barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecp_barmtr_Enabled), 5, 0), true);
      edtavTotvaluecp_barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecp_barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecp_barpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26N0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1826N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV167ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV12DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV5ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_44"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV16GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV131Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV131Emprcod") ;
         wcpOAV129CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV129CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV130CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV130CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV108BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV108BarDisNumfrom") ;
         wcpOAV109BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV109BarDisNumto") ;
         wcpOAV114BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV114BarFecGenfrom"), 0) ;
         wcpOAV115BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV115BarFecGento"), 0) ;
         wcpOAV125BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV125BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV126BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV126BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV110BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV110BarFecClifrom"), 0) ;
         wcpOAV111BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV111BarFecClito"), 0) ;
         wcpOAV112BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV112BarFecFprfrom"), 0) ;
         wcpOAV113BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV113BarFecFprto"), 0) ;
         wcpOAV116BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV116BarFecSalfrom"), 0) ;
         wcpOAV117BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV117BarFecSalto"), 0) ;
         wcpOAV123BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV123BarSerfrom") ;
         wcpOAV124BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV124BarSerto") ;
         wcpOAV127BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV127BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV128BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV128BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV104BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV104BarColNomfrom") ;
         wcpOAV105BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV105BarColNomto") ;
         wcpOAV106BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV106BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV107BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV107BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV119BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV119BarNomClifrom") ;
         wcpOAV120BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV120BarNomClito") ;
         wcpOAV121BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV121BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV122BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV122BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV136muestras = httpContext.cgiGet( sPrefix+"wcpOAV136muestras") ;
         wcpOAV98BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV98BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV103BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV103BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV101BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV101BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV102BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV102BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV99BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV99BarCodParfrom") ;
         wcpOAV100BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV100BarCodParto") ;
         wcpOAV132Cod_idtx = httpContext.cgiGet( sPrefix+"wcpOAV132Cod_idtx") ;
         wcpOAV118BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV118BarGirar") ;
         AV157Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV131Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
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
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV166FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV166FilterFullText", AV166FilterFullText);
         AV149TotValueCP_BARKGM = httpContext.cgiGet( edtavTotvaluecp_barkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV149TotValueCP_BARKGM", AV149TotValueCP_BARKGM);
         AV151TotValueCP_BARMTR = httpContext.cgiGet( edtavTotvaluecp_barmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV151TotValueCP_BARMTR", AV151TotValueCP_BARMTR);
         AV153TotValueCP_BARPIE = httpContext.cgiGet( edtavTotvaluecp_barpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153TotValueCP_BARPIE", AV153TotValueCP_BARPIE);
         AV172Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172Pgmname", AV172Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaProduccion_Tabla_Materializada");
         AV172Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV172Pgmname", AV172Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV172Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\consultaproduccion_tabla_materializada:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV166FilterFullText) != 0 )
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
      e1826N2 ();
      if (returnInSub) return;
   }

   public void e1826N2( )
   {
      /* Start Routine */
      returnInSub = false ;
      subGrid_Sortable = (byte)(0) ;
      GXt_char1 = AV134Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultaproduccion_tabla_materializada_impl.this.GXt_char1 = GXv_char2[0] ;
      AV134Station = GXt_char1 ;
      GXv_char2[0] = AV131Emprcod ;
      GXv_char3[0] = AV135EmprNom ;
      GXv_char4[0] = AV137UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV134Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultaproduccion_tabla_materializada_impl.this.AV131Emprcod = GXv_char2[0] ;
      consultaproduccion_tabla_materializada_impl.this.AV135EmprNom = GXv_char3[0] ;
      consultaproduccion_tabla_materializada_impl.this.AV137UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131Emprcod", AV131Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Grid_titlescategories_Gridtitlescategories = GXutil.format( ";;;;;;;;;;;;;;;;;;;;%1;%1;%1;;;;;;;;;;;;;;;;", httpContext.getMessage( "Fecha", ""), "", "", "", "", "", "", "", "") ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
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
      if ( AV21OrderedBy < 1 )
      {
         AV21OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV12DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV12DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV157Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV131Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      consultaproduccion_tabla_materializada_impl.this.GXt_int7 = GXv_int8[0] ;
      AV157Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV157Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV157Moda21), "ZZZ9")));
   }

   public void e1926N2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV97WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV97WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV169ManageFiltersExecutionStep == 1 )
      {
         AV169ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV169ManageFiltersExecutionStep", GXutil.str( AV169ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV169ManageFiltersExecutionStep == 2 )
      {
         AV169ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV169ManageFiltersExecutionStep", GXutil.str( AV169ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25Session.getValue("Produccion.ConsultaProduccion_Tabla_MaterializadaColumnsSelector"), "") != 0 )
      {
         AV7ColumnsSelectorXML = AV25Session.getValue("Produccion.ConsultaProduccion_Tabla_MaterializadaColumnsSelector") ;
         AV5ColumnsSelector.fromxml(AV7ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCP_CLICOD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_CLICOD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_CLICOD_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_CLINOM_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_CLINOM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_CLINOM_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARDISN_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARDISN_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARDISN_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARCOD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCOD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCOD_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARCODR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCODR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCODR_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARCODP_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCODP_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCODP_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARAGRE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARAGRE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARAGRE_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARSER_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARSER_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARSER_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARSERD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARSERD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARSERD_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARTIPA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARTIPA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARTIPA_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_TARTDSC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_TARTDSC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_TARTDSC_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARCOLO_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCOLO_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCOLO_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARCOLU_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCOLU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCOLU_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARNOMC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARNOMC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARNOMC_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARKGM_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARKGM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARKGM_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARMTR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARMTR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARMTR_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARPIE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARPIE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARPIE_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARSIT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARSIT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARSIT_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARFECG_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARFECG_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECG_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARFECC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARFECC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECC_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARFECF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARFECF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECF_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARFECS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARFECS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECS_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavBarfascod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavBarfassig_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfassig_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassig_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavBaralbultimo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbultimo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbultimo_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARALBK_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARALBK_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARALBK_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARALBM_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARALBM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARALBM_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavBaralbfact_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbfact_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbfact_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARGIRA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARGIRA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARGIRA_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_BARPROP_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARPROP_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARPROP_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_DSC_BAR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_DSC_BAR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_DSC_BAR_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtCP_DISUSRC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_DISUSRC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_DISUSRC_Visible), 5, 0), !bGXsfl_44_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV15GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
      AV16GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      edtCP_BARCOD_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCOD_Internalname, "Columnheaderclass", edtCP_BARCOD_Columnheaderclass, !bGXsfl_44_Refreshing);
      AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = AV166FilterFullText ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV167ManageFiltersData", AV167ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17GridState", AV17GridState);
   }

   public void e1226N2( )
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
         AV24PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV24PageToGo) ;
      }
   }

   public void e1326N2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1426N2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV21OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
         AV23OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23OrderedDsc", AV23OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2026N2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(44) ;
      }
      sendrow_442( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_44_Refreshing )
      {
         httpContext.doAjaxLoad(44, GridRow);
      }
   }

   public void e1526N2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV7ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV5ColumnsSelector.fromJSonString(AV7ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultaProduccion_Tabla_MaterializadaColumnsSelector", ((GXutil.strcmp("", AV7ColumnsSelectorXML)==0) ? "" : AV5ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV167ManageFiltersData", AV167ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17GridState", AV17GridState);
   }

   public void e1126N2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.ConsultaProduccion_Tabla_MaterializadaFilters")),GXutil.URLEncode(GXutil.rtrim(AV172Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV169ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV169ManageFiltersExecutionStep", GXutil.str( AV169ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.ConsultaProduccion_Tabla_MaterializadaFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV169ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV169ManageFiltersExecutionStep", GXutil.str( AV169ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV168ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Produccion.ConsultaProduccion_Tabla_MaterializadaFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         consultaproduccion_tabla_materializada_impl.this.GXt_char1 = GXv_char4[0] ;
         AV168ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV168ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV172Pgmname+"GridState", AV168ManageFiltersXml) ;
            AV17GridState.fromxml(AV168ManageFiltersXml, null, null);
            AV21OrderedBy = AV17GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
            AV23OrderedDsc = AV17GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23OrderedDsc", AV23OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17GridState", AV17GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV167ManageFiltersData", AV167ManageFiltersData);
   }

   public void e1626N2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV13ErrorMessage ;
      new app.produccion.consultaproduccion_tabla_materializadaexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consultaproduccion_tabla_materializada_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      consultaproduccion_tabla_materializada_impl.this.AV13ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV13ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17GridState", AV17GridState);
   }

   public void e1726N2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.produccion.consultaproduccion_tabla_materializadaexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17GridState", AV17GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV21OrderedBy, 4, 0))+":"+(AV23OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV5ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_CLICOD", "", "Cliente", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_CLINOM", "", "Nombre", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARDISNUM", "", "Ped. Cli.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARCOD", "", "Nº Hdr", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARCODREO", "", "R", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARCODPAR", "", "P", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARAGREST", "", "A?", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARSER", "", "Articulo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARSERDSC", "", "Descripcion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARTIPART", "", "Tip. Art.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_TARTDSC", "", "Descripcion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARCOLO", "", "Color", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARCOLU", "", "Numero", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARNOMCLI", "", "Color Cli.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARKGM", "", "KIlos", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARMTR", "", "Metros", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARPIE", "", "Piezas", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARSIT", "", "Sit.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARFECGEN", "Fecha", "Fecha HDR", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARFECCLI", "Fecha", "Ped. Cli.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARFECFPR", "Fecha", "Ent. Prev.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARFECSAL", "", "Salida", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&BarFasCod", "", "Ult. Fase", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&BarFasSig", "", "Sig. Fase", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&BarAlbUltimo", "", "Ultimo Alb.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARALBK", "", "Kgs. Sal.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARALBM", "", "Mts. Sal.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&BarAlbFact", "", "Factura", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARGIRAR", "", "Coleccion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_BARPROPER", "", "Ctw", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_DSC_BAR", "", "Descripcion", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CP_DISUSRC", "", "Usuario", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV96UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultaProduccion_Tabla_MaterializadaColumnsSelector", GXv_char4) ;
      consultaproduccion_tabla_materializada_impl.this.GXt_char1 = GXv_char4[0] ;
      AV96UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV96UserCustomValue)==0) ) )
      {
         AV6ColumnsSelectorAux.fromxml(AV96UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV6ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV5ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV6ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV5ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV167ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Produccion.ConsultaProduccion_Tabla_MaterializadaFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV167ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV166FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV166FilterFullText", AV166FilterFullText);
   }

   public void S212( )
   {
      /* 'DO SITUACIONFASES' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "SITUACIONFASES_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO CONSULTAALBARANSALIDA' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "CONSULTAALBARANSALIDA_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S232( )
   {
      /* 'DO RECETAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "RECETAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S242( )
   {
      /* 'DO PARTESPRODUCCION' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "PARTESPRODUCCION_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S252( )
   {
      /* 'DO PACKINGLIST' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "PACKINGLIST_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S262( )
   {
      /* 'DO PIEZAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "PIEZAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S272( )
   {
      /* 'DO MODIFICARFECHAE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_modfecent", new String[] {GXutil.URLEncode(GXutil.rtrim(A14328CP_EMPRCOD)),GXutil.URLEncode(GXutil.ltrimstr(A14301CP_BARCOD,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A14302CP_BARCODR,1,0)),GXutil.URLEncode(GXutil.rtrim(A14303CP_BARCODP)),GXutil.URLEncode(GXutil.ltrimstr(A14326CP_CLICOD,6,0)),GXutil.URLEncode(GXutil.rtrim(A14327CP_CLINOM)),GXutil.URLEncode(GXutil.rtrim(A14324CP_BARDISN)),GXutil.URLEncode(GXutil.rtrim(A14311CP_BARSER)),GXutil.URLEncode(GXutil.rtrim(A14312CP_BARSERD)),GXutil.URLEncode(GXutil.rtrim(A14331CP_BARCOLO)),GXutil.URLEncode(GXutil.ltrimstr(A14332CP_BARCOLU,6,0)),GXutil.URLEncode(GXutil.formatDateParm(A14304CP_BARFECF))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum","BarFecFpr"}) , new Object[] {});
   }

   public void S282( )
   {
      /* 'DO IMPRESIONHDR' Routine */
      returnInSub = false ;
      if ( AV157Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.rhdrmod", new String[] {GXutil.URLEncode(GXutil.rtrim(AV131Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A14301CP_BARCOD,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A14302CP_BARCODR,1,0)),GXutil.URLEncode(GXutil.rtrim(A14303CP_BARCODP)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir el formato", ""));
      }
   }

   public void S292( )
   {
      /* 'DO AGRUPADAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "AGRUPADAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV172Pgmname+"GridState"), "") == 0 )
      {
         AV17GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV172Pgmname+"GridState"), null, null);
      }
      else
      {
         AV17GridState.fromxml(AV25Session.getValue(AV172Pgmname+"GridState"), null, null);
      }
      AV21OrderedBy = AV17GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OrderedBy), 4, 0));
      AV23OrderedDsc = AV17GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23OrderedDsc", AV23OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV17GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV17GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV17GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV174GXV1 = 1 ;
      while ( AV174GXV1 <= AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV174GXV1));
         if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV166FilterFullText = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV166FilterFullText", AV166FilterFullText);
         }
         AV174GXV1 = (int)(AV174GXV1+1) ;
      }
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV17GridState.fromxml(AV25Session.getValue(AV172Pgmname+"GridState"), null, null);
      AV17GridState.setgxTv_SdtWWPGridState_Orderedby( AV21OrderedBy );
      AV17GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV23OrderedDsc );
      AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV166FilterFullText)==0), (short)(0), AV166FilterFullText, "") ;
      AV17GridState = GXv_SdtWWPGridState14[0] ;
      AV17GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV17GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV172Pgmname+"GridState", AV17GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV94TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV94TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV172Pgmname );
      AV94TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV94TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV19HTTPRequest.getScriptName()+"?"+AV19HTTPRequest.getQuerystring() );
      AV94TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Produccion.CONPRODUC" );
      AV25Session.setValue("TrnContext", AV94TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV148TotCP_BARKGM = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148TotCP_BARKGM", GXutil.ltrimstr( AV148TotCP_BARKGM, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV148TotCP_BARKGM, "ZZZZZ9.99")));
      AV150TotCP_BARMTR = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV150TotCP_BARMTR", GXutil.ltrimstr( AV150TotCP_BARMTR, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV150TotCP_BARMTR, "ZZZZZ9.99")));
      AV152TotCP_BARPIE = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152TotCP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152TotCP_BARPIE), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152TotCP_BARPIE), "ZZZZZ9")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = AV166FilterFullText ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ,
                                           AV108BarDisNumfrom ,
                                           AV109BarDisNumto ,
                                           Integer.valueOf(AV129CliCodfrom) ,
                                           Integer.valueOf(AV130CliCodto) ,
                                           Byte.valueOf(AV125BarSitfrom) ,
                                           Byte.valueOf(AV126BarSitto) ,
                                           AV114BarFecGenfrom ,
                                           AV115BarFecGento ,
                                           AV116BarFecSalfrom ,
                                           AV117BarFecSalto ,
                                           AV110BarFecClifrom ,
                                           AV111BarFecClito ,
                                           AV112BarFecFprfrom ,
                                           AV113BarFecFprto ,
                                           AV123BarSerfrom ,
                                           AV124BarSerto ,
                                           AV104BarColNomfrom ,
                                           AV105BarColNomto ,
                                           Integer.valueOf(AV106BarColNumfrom) ,
                                           Integer.valueOf(AV107BarColNumto) ,
                                           AV119BarNomClifrom ,
                                           AV120BarNomClito ,
                                           Integer.valueOf(AV121BarNumClifrom) ,
                                           Integer.valueOf(AV122BarNumClito) ,
                                           Short.valueOf(AV127BarTipArtfrom) ,
                                           Short.valueOf(AV128BarTipArtto) ,
                                           AV133TFBarPlf ,
                                           Integer.valueOf(AV98BarCodfrom) ,
                                           Integer.valueOf(AV103BarCodto) ,
                                           Byte.valueOf(AV101BarCodReofrom) ,
                                           Byte.valueOf(AV102BarCodReoto) ,
                                           AV99BarCodParfrom ,
                                           AV100BarCodParto ,
                                           AV132Cod_idtx ,
                                           AV118BarGirar ,
                                           A14327CP_CLINOM ,
                                           A14324CP_BARDISN ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           A14311CP_BARSER ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14315CP_BARNOMC ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14306CP_BARPLF ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14323CP_BARPROP ,
                                           A14317CP_BARGIRA ,
                                           AV131Emprcod ,
                                           A14328CP_EMPRCOD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext), "%", "") ;
      lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext), "%", "") ;
      /* Using cursor H026N4 */
      pr_default.execute(2, new Object[] {AV131Emprcod, lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext, lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext, AV108BarDisNumfrom, AV109BarDisNumto, Integer.valueOf(AV129CliCodfrom), Integer.valueOf(AV130CliCodto), Byte.valueOf(AV125BarSitfrom), Byte.valueOf(AV126BarSitto), AV114BarFecGenfrom, AV115BarFecGento, AV116BarFecSalfrom, AV117BarFecSalto, AV110BarFecClifrom, AV111BarFecClito, AV112BarFecFprfrom, AV113BarFecFprto, AV123BarSerfrom, AV124BarSerto, AV104BarColNomfrom, AV105BarColNomto, Integer.valueOf(AV106BarColNumfrom), Integer.valueOf(AV107BarColNumto), AV119BarNomClifrom, AV120BarNomClito, Integer.valueOf(AV121BarNumClifrom), Integer.valueOf(AV122BarNumClito), Short.valueOf(AV127BarTipArtfrom), Short.valueOf(AV128BarTipArtto), AV133TFBarPlf, Integer.valueOf(AV98BarCodfrom), Integer.valueOf(AV103BarCodto), Byte.valueOf(AV101BarCodReofrom), Byte.valueOf(AV102BarCodReoto), AV99BarCodParfrom, AV100BarCodParto, AV132Cod_idtx, AV118BarGirar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14317CP_BARGIRA = H026N4_A14317CP_BARGIRA[0] ;
         A14323CP_BARPROP = H026N4_A14323CP_BARPROP[0] ;
         A14303CP_BARCODP = H026N4_A14303CP_BARCODP[0] ;
         A14302CP_BARCODR = H026N4_A14302CP_BARCODR[0] ;
         A14301CP_BARCOD = H026N4_A14301CP_BARCOD[0] ;
         A14306CP_BARPLF = H026N4_A14306CP_BARPLF[0] ;
         A14316CP_BARTIPA = H026N4_A14316CP_BARTIPA[0] ;
         A14305CP_BARNUMC = H026N4_A14305CP_BARNUMC[0] ;
         A14315CP_BARNOMC = H026N4_A14315CP_BARNOMC[0] ;
         A14332CP_BARCOLU = H026N4_A14332CP_BARCOLU[0] ;
         A14331CP_BARCOLO = H026N4_A14331CP_BARCOLO[0] ;
         A14311CP_BARSER = H026N4_A14311CP_BARSER[0] ;
         A14304CP_BARFECF = H026N4_A14304CP_BARFECF[0] ;
         A14309CP_BARFECC = H026N4_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = H026N4_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = H026N4_A14308CP_BARFECG[0] ;
         A14307CP_BARSIT = H026N4_A14307CP_BARSIT[0] ;
         A14326CP_CLICOD = H026N4_A14326CP_CLICOD[0] ;
         A14328CP_EMPRCOD = H026N4_A14328CP_EMPRCOD[0] ;
         A14324CP_BARDISN = H026N4_A14324CP_BARDISN[0] ;
         A14327CP_CLINOM = H026N4_A14327CP_CLINOM[0] ;
         A14336CP_BARKGM = H026N4_A14336CP_BARKGM[0] ;
         A14337CP_BARMTR = H026N4_A14337CP_BARMTR[0] ;
         A14338CP_BARPIE = H026N4_A14338CP_BARPIE[0] ;
         AV148TotCP_BARKGM = A14336CP_BARKGM.add(AV148TotCP_BARKGM) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV148TotCP_BARKGM", GXutil.ltrimstr( AV148TotCP_BARKGM, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV148TotCP_BARKGM, "ZZZZZ9.99")));
         AV150TotCP_BARMTR = A14337CP_BARMTR.add(AV150TotCP_BARMTR) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV150TotCP_BARMTR", GXutil.ltrimstr( AV150TotCP_BARMTR, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV150TotCP_BARMTR, "ZZZZZ9.99")));
         AV152TotCP_BARPIE = (long)(A14338CP_BARPIE+AV152TotCP_BARPIE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV152TotCP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152TotCP_BARPIE), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV152TotCP_BARPIE), "ZZZZZ9")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV149TotValueCP_BARKGM = localUtil.format( AV148TotCP_BARKGM, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV149TotValueCP_BARKGM", AV149TotValueCP_BARKGM);
      AV151TotValueCP_BARMTR = localUtil.format( AV150TotCP_BARMTR, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV151TotValueCP_BARMTR", AV151TotValueCP_BARMTR);
      AV153TotValueCP_BARPIE = localUtil.format( DecimalUtil.doubleToDec(AV152TotCP_BARPIE), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153TotValueCP_BARPIE", AV153TotValueCP_BARPIE);
   }

   public void wb_table9_178_26N2( boolean wbgen )
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
         wb_table9_178_26N2e( true) ;
      }
      else
      {
         wb_table9_178_26N2e( false) ;
      }
   }

   public void wb_table8_173_26N2( boolean wbgen )
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
         wb_table8_173_26N2e( true) ;
      }
      else
      {
         wb_table8_173_26N2e( false) ;
      }
   }

   public void wb_table7_168_26N2( boolean wbgen )
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
         wb_table7_168_26N2e( true) ;
      }
      else
      {
         wb_table7_168_26N2e( false) ;
      }
   }

   public void wb_table6_163_26N2( boolean wbgen )
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
         wb_table6_163_26N2e( true) ;
      }
      else
      {
         wb_table6_163_26N2e( false) ;
      }
   }

   public void wb_table5_158_26N2( boolean wbgen )
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
         wb_table5_158_26N2e( true) ;
      }
      else
      {
         wb_table5_158_26N2e( false) ;
      }
   }

   public void wb_table4_153_26N2( boolean wbgen )
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
         wb_table4_153_26N2e( true) ;
      }
      else
      {
         wb_table4_153_26N2e( false) ;
      }
   }

   public void wb_table3_148_26N2( boolean wbgen )
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
         wb_table3_148_26N2e( true) ;
      }
      else
      {
         wb_table3_148_26N2e( false) ;
      }
   }

   public void wb_table2_86_26N2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecp_barkgm_Internalname, httpContext.getMessage( "Tot Value CP_BARKGM", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'" + sPrefix + "',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecp_barkgm_Internalname, AV149TotValueCP_BARKGM, GXutil.rtrim( localUtil.format( AV149TotValueCP_BARKGM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecp_barkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecp_barkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultaProduccion_Tabla_Materializada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecp_barmtr_Internalname, httpContext.getMessage( "Tot Value CP_BARMTR", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'" + sPrefix + "',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecp_barmtr_Internalname, AV151TotValueCP_BARMTR, GXutil.rtrim( localUtil.format( AV151TotValueCP_BARMTR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecp_barmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecp_barmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultaProduccion_Tabla_Materializada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecp_barpie_Internalname, httpContext.getMessage( "Tot Value CP_BARPIE", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'" + sPrefix + "',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecp_barpie_Internalname, AV153TotValueCP_BARPIE, GXutil.rtrim( localUtil.format( AV153TotValueCP_BARPIE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecp_barpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecp_barpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultaProduccion_Tabla_Materializada.htm");
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
         wb_table2_86_26N2e( true) ;
      }
      else
      {
         wb_table2_86_26N2e( false) ;
      }
   }

   public void wb_table1_26_26N2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV167ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_31_26N2( true) ;
      }
      else
      {
         wb_table10_31_26N2( false) ;
      }
      return  ;
   }

   public void wb_table10_31_26N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_26_26N2e( true) ;
      }
      else
      {
         wb_table1_26_26N2e( false) ;
      }
   }

   public void wb_table10_31_26N2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'" + sPrefix + "',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV166FilterFullText, GXutil.rtrim( localUtil.format( AV166FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Produccion\\ConsultaProduccion_Tabla_Materializada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_31_26N2e( true) ;
      }
      else
      {
         wb_table10_31_26N2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV131Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131Emprcod", AV131Emprcod);
      AV129CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129CliCodfrom), 6, 0));
      AV130CliCodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130CliCodto), 6, 0));
      AV108BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108BarDisNumfrom", AV108BarDisNumfrom);
      AV109BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109BarDisNumto", AV109BarDisNumto);
      AV114BarFecGenfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarFecGenfrom", localUtil.format(AV114BarFecGenfrom, "99/99/99"));
      AV115BarFecGento = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarFecGento", localUtil.format(AV115BarFecGento, "99/99/99"));
      AV125BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125BarSitfrom), 2, 0));
      AV126BarSitto = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126BarSitto), 2, 0));
      AV110BarFecClifrom = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110BarFecClifrom", localUtil.format(AV110BarFecClifrom, "99/99/99"));
      AV111BarFecClito = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111BarFecClito", localUtil.format(AV111BarFecClito, "99/99/99"));
      AV112BarFecFprfrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112BarFecFprfrom", localUtil.format(AV112BarFecFprfrom, "99/99/99"));
      AV113BarFecFprto = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113BarFecFprto", localUtil.format(AV113BarFecFprto, "99/99/99"));
      AV116BarFecSalfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116BarFecSalfrom", localUtil.format(AV116BarFecSalfrom, "99/99/99"));
      AV117BarFecSalto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117BarFecSalto", localUtil.format(AV117BarFecSalto, "99/99/99"));
      AV123BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123BarSerfrom", AV123BarSerfrom);
      AV124BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124BarSerto", AV124BarSerto);
      AV127BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127BarTipArtfrom), 4, 0));
      AV128BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarTipArtto), 4, 0));
      AV104BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104BarColNomfrom", AV104BarColNomfrom);
      AV105BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105BarColNomto", AV105BarColNomto);
      AV106BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarColNumfrom), 6, 0));
      AV107BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarColNumto), 6, 0));
      AV119BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarNomClifrom", AV119BarNomClifrom);
      AV120BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarNomClito", AV120BarNomClito);
      AV121BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,25,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarNumClifrom), 6, 0));
      AV122BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,26,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122BarNumClito), 6, 0));
      AV127BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127BarTipArtfrom), 4, 0));
      AV128BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarTipArtto), 4, 0));
      AV136muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136muestras", AV136muestras);
      AV98BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,30,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarCodfrom), 8, 0));
      AV103BarCodto = ((Number) GXutil.testNumericType( getParm(obj,31,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarCodto), 8, 0));
      AV101BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarCodReofrom", GXutil.str( AV101BarCodReofrom, 1, 0));
      AV102BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102BarCodReoto", GXutil.str( AV102BarCodReoto, 1, 0));
      AV99BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99BarCodParfrom", AV99BarCodParfrom);
      AV100BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarCodParto", AV100BarCodParto);
      AV132Cod_idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Cod_idtx", AV132Cod_idtx);
      AV118BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118BarGirar", AV118BarGirar);
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
      pa26N2( ) ;
      ws26N2( ) ;
      we26N2( ) ;
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
      sCtrlAV131Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV129CliCodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV130CliCodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV108BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV109BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV114BarFecGenfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV115BarFecGento = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV125BarSitfrom = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV126BarSitto = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV110BarFecClifrom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV111BarFecClito = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV112BarFecFprfrom = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV113BarFecFprto = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV116BarFecSalfrom = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV117BarFecSalto = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV123BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV124BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV127BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV128BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV104BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV105BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV106BarColNumfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
      sCtrlAV107BarColNumto = (String)getParm(obj,22,TypeConstants.STRING) ;
      sCtrlAV119BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      sCtrlAV120BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      sCtrlAV121BarNumClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
      sCtrlAV122BarNumClito = (String)getParm(obj,26,TypeConstants.STRING) ;
      sCtrlAV127BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV128BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV136muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      sCtrlAV98BarCodfrom = (String)getParm(obj,30,TypeConstants.STRING) ;
      sCtrlAV103BarCodto = (String)getParm(obj,31,TypeConstants.STRING) ;
      sCtrlAV101BarCodReofrom = (String)getParm(obj,32,TypeConstants.STRING) ;
      sCtrlAV102BarCodReoto = (String)getParm(obj,33,TypeConstants.STRING) ;
      sCtrlAV99BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      sCtrlAV100BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      sCtrlAV132Cod_idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      sCtrlAV118BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa26N2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\consultaproduccion_tabla_materializada", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa26N2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV131Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131Emprcod", AV131Emprcod);
         AV129CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129CliCodfrom), 6, 0));
         AV130CliCodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130CliCodto), 6, 0));
         AV108BarDisNumfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108BarDisNumfrom", AV108BarDisNumfrom);
         AV109BarDisNumto = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109BarDisNumto", AV109BarDisNumto);
         AV114BarFecGenfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarFecGenfrom", localUtil.format(AV114BarFecGenfrom, "99/99/99"));
         AV115BarFecGento = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarFecGento", localUtil.format(AV115BarFecGento, "99/99/99"));
         AV125BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125BarSitfrom), 2, 0));
         AV126BarSitto = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126BarSitto), 2, 0));
         AV110BarFecClifrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110BarFecClifrom", localUtil.format(AV110BarFecClifrom, "99/99/99"));
         AV111BarFecClito = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111BarFecClito", localUtil.format(AV111BarFecClito, "99/99/99"));
         AV112BarFecFprfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112BarFecFprfrom", localUtil.format(AV112BarFecFprfrom, "99/99/99"));
         AV113BarFecFprto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113BarFecFprto", localUtil.format(AV113BarFecFprto, "99/99/99"));
         AV116BarFecSalfrom = (java.util.Date)getParm(obj,15,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116BarFecSalfrom", localUtil.format(AV116BarFecSalfrom, "99/99/99"));
         AV117BarFecSalto = (java.util.Date)getParm(obj,16,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117BarFecSalto", localUtil.format(AV117BarFecSalto, "99/99/99"));
         AV123BarSerfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123BarSerfrom", AV123BarSerfrom);
         AV124BarSerto = (String)getParm(obj,18,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124BarSerto", AV124BarSerto);
         AV127BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127BarTipArtfrom), 4, 0));
         AV128BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarTipArtto), 4, 0));
         AV104BarColNomfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104BarColNomfrom", AV104BarColNomfrom);
         AV105BarColNomto = (String)getParm(obj,22,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105BarColNomto", AV105BarColNomto);
         AV106BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarColNumfrom), 6, 0));
         AV107BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,24,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarColNumto), 6, 0));
         AV119BarNomClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarNomClifrom", AV119BarNomClifrom);
         AV120BarNomClito = (String)getParm(obj,26,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarNomClito", AV120BarNomClito);
         AV121BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,27,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarNumClifrom), 6, 0));
         AV122BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,28,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122BarNumClito), 6, 0));
         AV127BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127BarTipArtfrom), 4, 0));
         AV128BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarTipArtto), 4, 0));
         AV136muestras = (String)getParm(obj,31,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136muestras", AV136muestras);
         AV98BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarCodfrom), 8, 0));
         AV103BarCodto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarCodto), 8, 0));
         AV101BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,34,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarCodReofrom", GXutil.str( AV101BarCodReofrom, 1, 0));
         AV102BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,35,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102BarCodReoto", GXutil.str( AV102BarCodReoto, 1, 0));
         AV99BarCodParfrom = (String)getParm(obj,36,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99BarCodParfrom", AV99BarCodParfrom);
         AV100BarCodParto = (String)getParm(obj,37,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarCodParto", AV100BarCodParto);
         AV132Cod_idtx = (String)getParm(obj,38,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Cod_idtx", AV132Cod_idtx);
         AV118BarGirar = (String)getParm(obj,39,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118BarGirar", AV118BarGirar);
      }
      wcpOAV131Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV131Emprcod") ;
      wcpOAV129CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV129CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV130CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV130CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV108BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV108BarDisNumfrom") ;
      wcpOAV109BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV109BarDisNumto") ;
      wcpOAV114BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV114BarFecGenfrom"), 0) ;
      wcpOAV115BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV115BarFecGento"), 0) ;
      wcpOAV125BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV125BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV126BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV126BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV110BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV110BarFecClifrom"), 0) ;
      wcpOAV111BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV111BarFecClito"), 0) ;
      wcpOAV112BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV112BarFecFprfrom"), 0) ;
      wcpOAV113BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV113BarFecFprto"), 0) ;
      wcpOAV116BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV116BarFecSalfrom"), 0) ;
      wcpOAV117BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV117BarFecSalto"), 0) ;
      wcpOAV123BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV123BarSerfrom") ;
      wcpOAV124BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV124BarSerto") ;
      wcpOAV127BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV127BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV128BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV128BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV104BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV104BarColNomfrom") ;
      wcpOAV105BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV105BarColNomto") ;
      wcpOAV106BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV106BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV107BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV107BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV119BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV119BarNomClifrom") ;
      wcpOAV120BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV120BarNomClito") ;
      wcpOAV121BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV121BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV122BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV122BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV136muestras = httpContext.cgiGet( sPrefix+"wcpOAV136muestras") ;
      wcpOAV98BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV98BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV103BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV103BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV101BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV101BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV102BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV102BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV99BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV99BarCodParfrom") ;
      wcpOAV100BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV100BarCodParto") ;
      wcpOAV132Cod_idtx = httpContext.cgiGet( sPrefix+"wcpOAV132Cod_idtx") ;
      wcpOAV118BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV118BarGirar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV131Emprcod, wcpOAV131Emprcod) != 0 ) || ( AV129CliCodfrom != wcpOAV129CliCodfrom ) || ( AV130CliCodto != wcpOAV130CliCodto ) || ( GXutil.strcmp(AV108BarDisNumfrom, wcpOAV108BarDisNumfrom) != 0 ) || ( GXutil.strcmp(AV109BarDisNumto, wcpOAV109BarDisNumto) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV114BarFecGenfrom), GXutil.resetTime(wcpOAV114BarFecGenfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV115BarFecGento), GXutil.resetTime(wcpOAV115BarFecGento)) ) || ( AV125BarSitfrom != wcpOAV125BarSitfrom ) || ( AV126BarSitto != wcpOAV126BarSitto ) || !( GXutil.dateCompare(GXutil.resetTime(AV110BarFecClifrom), GXutil.resetTime(wcpOAV110BarFecClifrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV111BarFecClito), GXutil.resetTime(wcpOAV111BarFecClito)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV112BarFecFprfrom), GXutil.resetTime(wcpOAV112BarFecFprfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV113BarFecFprto), GXutil.resetTime(wcpOAV113BarFecFprto)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV116BarFecSalfrom), GXutil.resetTime(wcpOAV116BarFecSalfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV117BarFecSalto), GXutil.resetTime(wcpOAV117BarFecSalto)) ) || ( GXutil.strcmp(AV123BarSerfrom, wcpOAV123BarSerfrom) != 0 ) || ( GXutil.strcmp(AV124BarSerto, wcpOAV124BarSerto) != 0 ) || ( AV127BarTipArtfrom != wcpOAV127BarTipArtfrom ) || ( AV128BarTipArtto != wcpOAV128BarTipArtto ) || ( GXutil.strcmp(AV104BarColNomfrom, wcpOAV104BarColNomfrom) != 0 ) || ( GXutil.strcmp(AV105BarColNomto, wcpOAV105BarColNomto) != 0 ) || ( AV106BarColNumfrom != wcpOAV106BarColNumfrom ) || ( AV107BarColNumto != wcpOAV107BarColNumto ) || ( GXutil.strcmp(AV119BarNomClifrom, wcpOAV119BarNomClifrom) != 0 ) || ( GXutil.strcmp(AV120BarNomClito, wcpOAV120BarNomClito) != 0 ) || ( AV121BarNumClifrom != wcpOAV121BarNumClifrom ) || ( AV122BarNumClito != wcpOAV122BarNumClito ) || ( GXutil.strcmp(AV136muestras, wcpOAV136muestras) != 0 ) || ( AV98BarCodfrom != wcpOAV98BarCodfrom ) || ( AV103BarCodto != wcpOAV103BarCodto ) || ( AV101BarCodReofrom != wcpOAV101BarCodReofrom ) || ( AV102BarCodReoto != wcpOAV102BarCodReoto ) || ( GXutil.strcmp(AV99BarCodParfrom, wcpOAV99BarCodParfrom) != 0 ) || ( GXutil.strcmp(AV100BarCodParto, wcpOAV100BarCodParto) != 0 ) || ( GXutil.strcmp(AV132Cod_idtx, wcpOAV132Cod_idtx) != 0 ) || ( GXutil.strcmp(AV118BarGirar, wcpOAV118BarGirar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV131Emprcod = AV131Emprcod ;
      wcpOAV129CliCodfrom = AV129CliCodfrom ;
      wcpOAV130CliCodto = AV130CliCodto ;
      wcpOAV108BarDisNumfrom = AV108BarDisNumfrom ;
      wcpOAV109BarDisNumto = AV109BarDisNumto ;
      wcpOAV114BarFecGenfrom = AV114BarFecGenfrom ;
      wcpOAV115BarFecGento = AV115BarFecGento ;
      wcpOAV125BarSitfrom = AV125BarSitfrom ;
      wcpOAV126BarSitto = AV126BarSitto ;
      wcpOAV110BarFecClifrom = AV110BarFecClifrom ;
      wcpOAV111BarFecClito = AV111BarFecClito ;
      wcpOAV112BarFecFprfrom = AV112BarFecFprfrom ;
      wcpOAV113BarFecFprto = AV113BarFecFprto ;
      wcpOAV116BarFecSalfrom = AV116BarFecSalfrom ;
      wcpOAV117BarFecSalto = AV117BarFecSalto ;
      wcpOAV123BarSerfrom = AV123BarSerfrom ;
      wcpOAV124BarSerto = AV124BarSerto ;
      wcpOAV127BarTipArtfrom = AV127BarTipArtfrom ;
      wcpOAV128BarTipArtto = AV128BarTipArtto ;
      wcpOAV104BarColNomfrom = AV104BarColNomfrom ;
      wcpOAV105BarColNomto = AV105BarColNomto ;
      wcpOAV106BarColNumfrom = AV106BarColNumfrom ;
      wcpOAV107BarColNumto = AV107BarColNumto ;
      wcpOAV119BarNomClifrom = AV119BarNomClifrom ;
      wcpOAV120BarNomClito = AV120BarNomClito ;
      wcpOAV121BarNumClifrom = AV121BarNumClifrom ;
      wcpOAV122BarNumClito = AV122BarNumClito ;
      wcpOAV136muestras = AV136muestras ;
      wcpOAV98BarCodfrom = AV98BarCodfrom ;
      wcpOAV103BarCodto = AV103BarCodto ;
      wcpOAV101BarCodReofrom = AV101BarCodReofrom ;
      wcpOAV102BarCodReoto = AV102BarCodReoto ;
      wcpOAV99BarCodParfrom = AV99BarCodParfrom ;
      wcpOAV100BarCodParto = AV100BarCodParto ;
      wcpOAV132Cod_idtx = AV132Cod_idtx ;
      wcpOAV118BarGirar = AV118BarGirar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV131Emprcod = httpContext.cgiGet( sPrefix+"AV131Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV131Emprcod) > 0 )
      {
         AV131Emprcod = httpContext.cgiGet( sCtrlAV131Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131Emprcod", AV131Emprcod);
      }
      else
      {
         AV131Emprcod = httpContext.cgiGet( sPrefix+"AV131Emprcod_PARM") ;
      }
      sCtrlAV129CliCodfrom = httpContext.cgiGet( sPrefix+"AV129CliCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV129CliCodfrom) > 0 )
      {
         AV129CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV129CliCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129CliCodfrom), 6, 0));
      }
      else
      {
         AV129CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV129CliCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV130CliCodto = httpContext.cgiGet( sPrefix+"AV130CliCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV130CliCodto) > 0 )
      {
         AV130CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV130CliCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130CliCodto), 6, 0));
      }
      else
      {
         AV130CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV130CliCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV108BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV108BarDisNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV108BarDisNumfrom) > 0 )
      {
         AV108BarDisNumfrom = httpContext.cgiGet( sCtrlAV108BarDisNumfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108BarDisNumfrom", AV108BarDisNumfrom);
      }
      else
      {
         AV108BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV108BarDisNumfrom_PARM") ;
      }
      sCtrlAV109BarDisNumto = httpContext.cgiGet( sPrefix+"AV109BarDisNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV109BarDisNumto) > 0 )
      {
         AV109BarDisNumto = httpContext.cgiGet( sCtrlAV109BarDisNumto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109BarDisNumto", AV109BarDisNumto);
      }
      else
      {
         AV109BarDisNumto = httpContext.cgiGet( sPrefix+"AV109BarDisNumto_PARM") ;
      }
      sCtrlAV114BarFecGenfrom = httpContext.cgiGet( sPrefix+"AV114BarFecGenfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV114BarFecGenfrom) > 0 )
      {
         AV114BarFecGenfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV114BarFecGenfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarFecGenfrom", localUtil.format(AV114BarFecGenfrom, "99/99/99"));
      }
      else
      {
         AV114BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV114BarFecGenfrom_PARM"), 0) ;
      }
      sCtrlAV115BarFecGento = httpContext.cgiGet( sPrefix+"AV115BarFecGento_CTRL") ;
      if ( GXutil.len( sCtrlAV115BarFecGento) > 0 )
      {
         AV115BarFecGento = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV115BarFecGento), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarFecGento", localUtil.format(AV115BarFecGento, "99/99/99"));
      }
      else
      {
         AV115BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV115BarFecGento_PARM"), 0) ;
      }
      sCtrlAV125BarSitfrom = httpContext.cgiGet( sPrefix+"AV125BarSitfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV125BarSitfrom) > 0 )
      {
         AV125BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV125BarSitfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125BarSitfrom), 2, 0));
      }
      else
      {
         AV125BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV125BarSitfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV126BarSitto = httpContext.cgiGet( sPrefix+"AV126BarSitto_CTRL") ;
      if ( GXutil.len( sCtrlAV126BarSitto) > 0 )
      {
         AV126BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV126BarSitto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126BarSitto), 2, 0));
      }
      else
      {
         AV126BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV126BarSitto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV110BarFecClifrom = httpContext.cgiGet( sPrefix+"AV110BarFecClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV110BarFecClifrom) > 0 )
      {
         AV110BarFecClifrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV110BarFecClifrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110BarFecClifrom", localUtil.format(AV110BarFecClifrom, "99/99/99"));
      }
      else
      {
         AV110BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV110BarFecClifrom_PARM"), 0) ;
      }
      sCtrlAV111BarFecClito = httpContext.cgiGet( sPrefix+"AV111BarFecClito_CTRL") ;
      if ( GXutil.len( sCtrlAV111BarFecClito) > 0 )
      {
         AV111BarFecClito = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV111BarFecClito), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111BarFecClito", localUtil.format(AV111BarFecClito, "99/99/99"));
      }
      else
      {
         AV111BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV111BarFecClito_PARM"), 0) ;
      }
      sCtrlAV112BarFecFprfrom = httpContext.cgiGet( sPrefix+"AV112BarFecFprfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV112BarFecFprfrom) > 0 )
      {
         AV112BarFecFprfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV112BarFecFprfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112BarFecFprfrom", localUtil.format(AV112BarFecFprfrom, "99/99/99"));
      }
      else
      {
         AV112BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV112BarFecFprfrom_PARM"), 0) ;
      }
      sCtrlAV113BarFecFprto = httpContext.cgiGet( sPrefix+"AV113BarFecFprto_CTRL") ;
      if ( GXutil.len( sCtrlAV113BarFecFprto) > 0 )
      {
         AV113BarFecFprto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV113BarFecFprto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113BarFecFprto", localUtil.format(AV113BarFecFprto, "99/99/99"));
      }
      else
      {
         AV113BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV113BarFecFprto_PARM"), 0) ;
      }
      sCtrlAV116BarFecSalfrom = httpContext.cgiGet( sPrefix+"AV116BarFecSalfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV116BarFecSalfrom) > 0 )
      {
         AV116BarFecSalfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV116BarFecSalfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116BarFecSalfrom", localUtil.format(AV116BarFecSalfrom, "99/99/99"));
      }
      else
      {
         AV116BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV116BarFecSalfrom_PARM"), 0) ;
      }
      sCtrlAV117BarFecSalto = httpContext.cgiGet( sPrefix+"AV117BarFecSalto_CTRL") ;
      if ( GXutil.len( sCtrlAV117BarFecSalto) > 0 )
      {
         AV117BarFecSalto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV117BarFecSalto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117BarFecSalto", localUtil.format(AV117BarFecSalto, "99/99/99"));
      }
      else
      {
         AV117BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV117BarFecSalto_PARM"), 0) ;
      }
      sCtrlAV123BarSerfrom = httpContext.cgiGet( sPrefix+"AV123BarSerfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV123BarSerfrom) > 0 )
      {
         AV123BarSerfrom = httpContext.cgiGet( sCtrlAV123BarSerfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123BarSerfrom", AV123BarSerfrom);
      }
      else
      {
         AV123BarSerfrom = httpContext.cgiGet( sPrefix+"AV123BarSerfrom_PARM") ;
      }
      sCtrlAV124BarSerto = httpContext.cgiGet( sPrefix+"AV124BarSerto_CTRL") ;
      if ( GXutil.len( sCtrlAV124BarSerto) > 0 )
      {
         AV124BarSerto = httpContext.cgiGet( sCtrlAV124BarSerto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124BarSerto", AV124BarSerto);
      }
      else
      {
         AV124BarSerto = httpContext.cgiGet( sPrefix+"AV124BarSerto_PARM") ;
      }
      sCtrlAV127BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV127BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV127BarTipArtfrom) > 0 )
      {
         AV127BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV127BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127BarTipArtfrom), 4, 0));
      }
      else
      {
         AV127BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV127BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV128BarTipArtto = httpContext.cgiGet( sPrefix+"AV128BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV128BarTipArtto) > 0 )
      {
         AV128BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV128BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarTipArtto), 4, 0));
      }
      else
      {
         AV128BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV128BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV104BarColNomfrom = httpContext.cgiGet( sPrefix+"AV104BarColNomfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV104BarColNomfrom) > 0 )
      {
         AV104BarColNomfrom = httpContext.cgiGet( sCtrlAV104BarColNomfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104BarColNomfrom", AV104BarColNomfrom);
      }
      else
      {
         AV104BarColNomfrom = httpContext.cgiGet( sPrefix+"AV104BarColNomfrom_PARM") ;
      }
      sCtrlAV105BarColNomto = httpContext.cgiGet( sPrefix+"AV105BarColNomto_CTRL") ;
      if ( GXutil.len( sCtrlAV105BarColNomto) > 0 )
      {
         AV105BarColNomto = httpContext.cgiGet( sCtrlAV105BarColNomto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105BarColNomto", AV105BarColNomto);
      }
      else
      {
         AV105BarColNomto = httpContext.cgiGet( sPrefix+"AV105BarColNomto_PARM") ;
      }
      sCtrlAV106BarColNumfrom = httpContext.cgiGet( sPrefix+"AV106BarColNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV106BarColNumfrom) > 0 )
      {
         AV106BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV106BarColNumfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarColNumfrom), 6, 0));
      }
      else
      {
         AV106BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV106BarColNumfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV107BarColNumto = httpContext.cgiGet( sPrefix+"AV107BarColNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV107BarColNumto) > 0 )
      {
         AV107BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV107BarColNumto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarColNumto), 6, 0));
      }
      else
      {
         AV107BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV107BarColNumto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV119BarNomClifrom = httpContext.cgiGet( sPrefix+"AV119BarNomClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV119BarNomClifrom) > 0 )
      {
         AV119BarNomClifrom = httpContext.cgiGet( sCtrlAV119BarNomClifrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarNomClifrom", AV119BarNomClifrom);
      }
      else
      {
         AV119BarNomClifrom = httpContext.cgiGet( sPrefix+"AV119BarNomClifrom_PARM") ;
      }
      sCtrlAV120BarNomClito = httpContext.cgiGet( sPrefix+"AV120BarNomClito_CTRL") ;
      if ( GXutil.len( sCtrlAV120BarNomClito) > 0 )
      {
         AV120BarNomClito = httpContext.cgiGet( sCtrlAV120BarNomClito) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarNomClito", AV120BarNomClito);
      }
      else
      {
         AV120BarNomClito = httpContext.cgiGet( sPrefix+"AV120BarNomClito_PARM") ;
      }
      sCtrlAV121BarNumClifrom = httpContext.cgiGet( sPrefix+"AV121BarNumClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV121BarNumClifrom) > 0 )
      {
         AV121BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV121BarNumClifrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarNumClifrom), 6, 0));
      }
      else
      {
         AV121BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV121BarNumClifrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV122BarNumClito = httpContext.cgiGet( sPrefix+"AV122BarNumClito_CTRL") ;
      if ( GXutil.len( sCtrlAV122BarNumClito) > 0 )
      {
         AV122BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV122BarNumClito), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122BarNumClito), 6, 0));
      }
      else
      {
         AV122BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV122BarNumClito_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV127BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV127BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV127BarTipArtfrom) > 0 )
      {
         AV127BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV127BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127BarTipArtfrom), 4, 0));
      }
      else
      {
         AV127BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV127BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV128BarTipArtto = httpContext.cgiGet( sPrefix+"AV128BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV128BarTipArtto) > 0 )
      {
         AV128BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV128BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarTipArtto), 4, 0));
      }
      else
      {
         AV128BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV128BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV136muestras = httpContext.cgiGet( sPrefix+"AV136muestras_CTRL") ;
      if ( GXutil.len( sCtrlAV136muestras) > 0 )
      {
         AV136muestras = httpContext.cgiGet( sCtrlAV136muestras) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136muestras", AV136muestras);
      }
      else
      {
         AV136muestras = httpContext.cgiGet( sPrefix+"AV136muestras_PARM") ;
      }
      sCtrlAV98BarCodfrom = httpContext.cgiGet( sPrefix+"AV98BarCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV98BarCodfrom) > 0 )
      {
         AV98BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV98BarCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarCodfrom), 8, 0));
      }
      else
      {
         AV98BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV98BarCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV103BarCodto = httpContext.cgiGet( sPrefix+"AV103BarCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV103BarCodto) > 0 )
      {
         AV103BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV103BarCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarCodto), 8, 0));
      }
      else
      {
         AV103BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV103BarCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV101BarCodReofrom = httpContext.cgiGet( sPrefix+"AV101BarCodReofrom_CTRL") ;
      if ( GXutil.len( sCtrlAV101BarCodReofrom) > 0 )
      {
         AV101BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV101BarCodReofrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarCodReofrom", GXutil.str( AV101BarCodReofrom, 1, 0));
      }
      else
      {
         AV101BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV101BarCodReofrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV102BarCodReoto = httpContext.cgiGet( sPrefix+"AV102BarCodReoto_CTRL") ;
      if ( GXutil.len( sCtrlAV102BarCodReoto) > 0 )
      {
         AV102BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV102BarCodReoto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102BarCodReoto", GXutil.str( AV102BarCodReoto, 1, 0));
      }
      else
      {
         AV102BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV102BarCodReoto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV99BarCodParfrom = httpContext.cgiGet( sPrefix+"AV99BarCodParfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV99BarCodParfrom) > 0 )
      {
         AV99BarCodParfrom = httpContext.cgiGet( sCtrlAV99BarCodParfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99BarCodParfrom", AV99BarCodParfrom);
      }
      else
      {
         AV99BarCodParfrom = httpContext.cgiGet( sPrefix+"AV99BarCodParfrom_PARM") ;
      }
      sCtrlAV100BarCodParto = httpContext.cgiGet( sPrefix+"AV100BarCodParto_CTRL") ;
      if ( GXutil.len( sCtrlAV100BarCodParto) > 0 )
      {
         AV100BarCodParto = httpContext.cgiGet( sCtrlAV100BarCodParto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarCodParto", AV100BarCodParto);
      }
      else
      {
         AV100BarCodParto = httpContext.cgiGet( sPrefix+"AV100BarCodParto_PARM") ;
      }
      sCtrlAV132Cod_idtx = httpContext.cgiGet( sPrefix+"AV132Cod_idtx_CTRL") ;
      if ( GXutil.len( sCtrlAV132Cod_idtx) > 0 )
      {
         AV132Cod_idtx = httpContext.cgiGet( sCtrlAV132Cod_idtx) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Cod_idtx", AV132Cod_idtx);
      }
      else
      {
         AV132Cod_idtx = httpContext.cgiGet( sPrefix+"AV132Cod_idtx_PARM") ;
      }
      sCtrlAV118BarGirar = httpContext.cgiGet( sPrefix+"AV118BarGirar_CTRL") ;
      if ( GXutil.len( sCtrlAV118BarGirar) > 0 )
      {
         AV118BarGirar = httpContext.cgiGet( sCtrlAV118BarGirar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118BarGirar", AV118BarGirar);
      }
      else
      {
         AV118BarGirar = httpContext.cgiGet( sPrefix+"AV118BarGirar_PARM") ;
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
      pa26N2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws26N2( ) ;
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
      ws26N2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV131Emprcod_PARM", GXutil.rtrim( AV131Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV131Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV131Emprcod_CTRL", GXutil.rtrim( sCtrlAV131Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV129CliCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV129CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV129CliCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV129CliCodfrom_CTRL", GXutil.rtrim( sCtrlAV129CliCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV130CliCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV130CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV130CliCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV130CliCodto_CTRL", GXutil.rtrim( sCtrlAV130CliCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108BarDisNumfrom_PARM", GXutil.rtrim( AV108BarDisNumfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV108BarDisNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108BarDisNumfrom_CTRL", GXutil.rtrim( sCtrlAV108BarDisNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV109BarDisNumto_PARM", GXutil.rtrim( AV109BarDisNumto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV109BarDisNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV109BarDisNumto_CTRL", GXutil.rtrim( sCtrlAV109BarDisNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV114BarFecGenfrom_PARM", localUtil.dtoc( AV114BarFecGenfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV114BarFecGenfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV114BarFecGenfrom_CTRL", GXutil.rtrim( sCtrlAV114BarFecGenfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV115BarFecGento_PARM", localUtil.dtoc( AV115BarFecGento, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV115BarFecGento)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV115BarFecGento_CTRL", GXutil.rtrim( sCtrlAV115BarFecGento));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV125BarSitfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV125BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV125BarSitfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV125BarSitfrom_CTRL", GXutil.rtrim( sCtrlAV125BarSitfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV126BarSitto_PARM", GXutil.ltrim( localUtil.ntoc( AV126BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV126BarSitto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV126BarSitto_CTRL", GXutil.rtrim( sCtrlAV126BarSitto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV110BarFecClifrom_PARM", localUtil.dtoc( AV110BarFecClifrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV110BarFecClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV110BarFecClifrom_CTRL", GXutil.rtrim( sCtrlAV110BarFecClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV111BarFecClito_PARM", localUtil.dtoc( AV111BarFecClito, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV111BarFecClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV111BarFecClito_CTRL", GXutil.rtrim( sCtrlAV111BarFecClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV112BarFecFprfrom_PARM", localUtil.dtoc( AV112BarFecFprfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV112BarFecFprfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV112BarFecFprfrom_CTRL", GXutil.rtrim( sCtrlAV112BarFecFprfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV113BarFecFprto_PARM", localUtil.dtoc( AV113BarFecFprto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV113BarFecFprto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV113BarFecFprto_CTRL", GXutil.rtrim( sCtrlAV113BarFecFprto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV116BarFecSalfrom_PARM", localUtil.dtoc( AV116BarFecSalfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV116BarFecSalfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV116BarFecSalfrom_CTRL", GXutil.rtrim( sCtrlAV116BarFecSalfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV117BarFecSalto_PARM", localUtil.dtoc( AV117BarFecSalto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV117BarFecSalto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV117BarFecSalto_CTRL", GXutil.rtrim( sCtrlAV117BarFecSalto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV123BarSerfrom_PARM", GXutil.rtrim( AV123BarSerfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV123BarSerfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV123BarSerfrom_CTRL", GXutil.rtrim( sCtrlAV123BarSerfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV124BarSerto_PARM", GXutil.rtrim( AV124BarSerto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV124BarSerto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV124BarSerto_CTRL", GXutil.rtrim( sCtrlAV124BarSerto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV127BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV127BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV127BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV127BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV127BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV128BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV128BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV128BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV128BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV128BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV104BarColNomfrom_PARM", GXutil.rtrim( AV104BarColNomfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV104BarColNomfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV104BarColNomfrom_CTRL", GXutil.rtrim( sCtrlAV104BarColNomfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV105BarColNomto_PARM", GXutil.rtrim( AV105BarColNomto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV105BarColNomto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV105BarColNomto_CTRL", GXutil.rtrim( sCtrlAV105BarColNomto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV106BarColNumfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV106BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV106BarColNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV106BarColNumfrom_CTRL", GXutil.rtrim( sCtrlAV106BarColNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV107BarColNumto_PARM", GXutil.ltrim( localUtil.ntoc( AV107BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV107BarColNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV107BarColNumto_CTRL", GXutil.rtrim( sCtrlAV107BarColNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119BarNomClifrom_PARM", GXutil.rtrim( AV119BarNomClifrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV119BarNomClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119BarNomClifrom_CTRL", GXutil.rtrim( sCtrlAV119BarNomClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120BarNomClito_PARM", GXutil.rtrim( AV120BarNomClito));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV120BarNomClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120BarNomClito_CTRL", GXutil.rtrim( sCtrlAV120BarNomClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV121BarNumClifrom_PARM", GXutil.ltrim( localUtil.ntoc( AV121BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV121BarNumClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV121BarNumClifrom_CTRL", GXutil.rtrim( sCtrlAV121BarNumClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV122BarNumClito_PARM", GXutil.ltrim( localUtil.ntoc( AV122BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV122BarNumClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV122BarNumClito_CTRL", GXutil.rtrim( sCtrlAV122BarNumClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV127BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV127BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV127BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV127BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV127BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV128BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV128BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV128BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV128BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV128BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV136muestras_PARM", GXutil.rtrim( AV136muestras));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV136muestras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV136muestras_CTRL", GXutil.rtrim( sCtrlAV136muestras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV98BarCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV98BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV98BarCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV98BarCodfrom_CTRL", GXutil.rtrim( sCtrlAV98BarCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV103BarCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV103BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV103BarCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV103BarCodto_CTRL", GXutil.rtrim( sCtrlAV103BarCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV101BarCodReofrom_PARM", GXutil.ltrim( localUtil.ntoc( AV101BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV101BarCodReofrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV101BarCodReofrom_CTRL", GXutil.rtrim( sCtrlAV101BarCodReofrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV102BarCodReoto_PARM", GXutil.ltrim( localUtil.ntoc( AV102BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV102BarCodReoto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV102BarCodReoto_CTRL", GXutil.rtrim( sCtrlAV102BarCodReoto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99BarCodParfrom_PARM", GXutil.rtrim( AV99BarCodParfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV99BarCodParfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99BarCodParfrom_CTRL", GXutil.rtrim( sCtrlAV99BarCodParfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100BarCodParto_PARM", GXutil.rtrim( AV100BarCodParto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV100BarCodParto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100BarCodParto_CTRL", GXutil.rtrim( sCtrlAV100BarCodParto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV132Cod_idtx_PARM", GXutil.rtrim( AV132Cod_idtx));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV132Cod_idtx)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV132Cod_idtx_CTRL", GXutil.rtrim( sCtrlAV132Cod_idtx));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118BarGirar_PARM", GXutil.rtrim( AV118BarGirar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV118BarGirar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118BarGirar_CTRL", GXutil.rtrim( sCtrlAV118BarGirar));
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
      we26N2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610454", true, true);
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
      httpContext.AddJavascriptSource("produccion/consultaproduccion_tabla_materializada.js", "?20268211610454", false, true);
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

   public void subsflControlProps_442( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_44_idx );
      edtCP_EMPRCOD_Internalname = sPrefix+"CP_EMPRCOD_"+sGXsfl_44_idx ;
      edtCP_CLICOD_Internalname = sPrefix+"CP_CLICOD_"+sGXsfl_44_idx ;
      edtCP_CLINOM_Internalname = sPrefix+"CP_CLINOM_"+sGXsfl_44_idx ;
      edtCP_BARDISN_Internalname = sPrefix+"CP_BARDISN_"+sGXsfl_44_idx ;
      edtCP_BARCOD_Internalname = sPrefix+"CP_BARCOD_"+sGXsfl_44_idx ;
      edtCP_BARCODR_Internalname = sPrefix+"CP_BARCODR_"+sGXsfl_44_idx ;
      edtCP_BARCODP_Internalname = sPrefix+"CP_BARCODP_"+sGXsfl_44_idx ;
      edtCP_BARAGRE_Internalname = sPrefix+"CP_BARAGRE_"+sGXsfl_44_idx ;
      edtCP_BARSER_Internalname = sPrefix+"CP_BARSER_"+sGXsfl_44_idx ;
      edtCP_BARSERD_Internalname = sPrefix+"CP_BARSERD_"+sGXsfl_44_idx ;
      edtCP_BARTIPA_Internalname = sPrefix+"CP_BARTIPA_"+sGXsfl_44_idx ;
      edtCP_TARTDSC_Internalname = sPrefix+"CP_TARTDSC_"+sGXsfl_44_idx ;
      edtCP_BARCOLO_Internalname = sPrefix+"CP_BARCOLO_"+sGXsfl_44_idx ;
      edtCP_BARCOLU_Internalname = sPrefix+"CP_BARCOLU_"+sGXsfl_44_idx ;
      edtCP_BARNOMC_Internalname = sPrefix+"CP_BARNOMC_"+sGXsfl_44_idx ;
      edtCP_BARKGM_Internalname = sPrefix+"CP_BARKGM_"+sGXsfl_44_idx ;
      edtCP_BARMTR_Internalname = sPrefix+"CP_BARMTR_"+sGXsfl_44_idx ;
      edtCP_BARPIE_Internalname = sPrefix+"CP_BARPIE_"+sGXsfl_44_idx ;
      edtCP_BARSIT_Internalname = sPrefix+"CP_BARSIT_"+sGXsfl_44_idx ;
      edtCP_BARFECG_Internalname = sPrefix+"CP_BARFECG_"+sGXsfl_44_idx ;
      edtCP_BARFECC_Internalname = sPrefix+"CP_BARFECC_"+sGXsfl_44_idx ;
      edtCP_BARFECF_Internalname = sPrefix+"CP_BARFECF_"+sGXsfl_44_idx ;
      edtCP_BARFECS_Internalname = sPrefix+"CP_BARFECS_"+sGXsfl_44_idx ;
      edtavBarfascod_Internalname = sPrefix+"vBARFASCOD_"+sGXsfl_44_idx ;
      edtavBarfassig_Internalname = sPrefix+"vBARFASSIG_"+sGXsfl_44_idx ;
      edtavBaralbultimo_Internalname = sPrefix+"vBARALBULTIMO_"+sGXsfl_44_idx ;
      edtCP_BARALBK_Internalname = sPrefix+"CP_BARALBK_"+sGXsfl_44_idx ;
      edtCP_BARALBM_Internalname = sPrefix+"CP_BARALBM_"+sGXsfl_44_idx ;
      edtavBaralbfact_Internalname = sPrefix+"vBARALBFACT_"+sGXsfl_44_idx ;
      edtCP_BARGIRA_Internalname = sPrefix+"CP_BARGIRA_"+sGXsfl_44_idx ;
      edtCP_BARPROP_Internalname = sPrefix+"CP_BARPROP_"+sGXsfl_44_idx ;
      edtCP_DSC_BAR_Internalname = sPrefix+"CP_DSC_BAR_"+sGXsfl_44_idx ;
      edtCP_DISUSRC_Internalname = sPrefix+"CP_DISUSRC_"+sGXsfl_44_idx ;
      edtCP_ID_Internalname = sPrefix+"CP_ID_"+sGXsfl_44_idx ;
      edtCP_BARPLF_Internalname = sPrefix+"CP_BARPLF_"+sGXsfl_44_idx ;
      edtCP_BAREXT_Internalname = sPrefix+"CP_BAREXT_"+sGXsfl_44_idx ;
      edtCP_DISDES_Internalname = sPrefix+"CP_DISDES_"+sGXsfl_44_idx ;
      edtCP_DISCOD_Internalname = sPrefix+"CP_DISCOD_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_442( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_44_fel_idx );
      edtCP_EMPRCOD_Internalname = sPrefix+"CP_EMPRCOD_"+sGXsfl_44_fel_idx ;
      edtCP_CLICOD_Internalname = sPrefix+"CP_CLICOD_"+sGXsfl_44_fel_idx ;
      edtCP_CLINOM_Internalname = sPrefix+"CP_CLINOM_"+sGXsfl_44_fel_idx ;
      edtCP_BARDISN_Internalname = sPrefix+"CP_BARDISN_"+sGXsfl_44_fel_idx ;
      edtCP_BARCOD_Internalname = sPrefix+"CP_BARCOD_"+sGXsfl_44_fel_idx ;
      edtCP_BARCODR_Internalname = sPrefix+"CP_BARCODR_"+sGXsfl_44_fel_idx ;
      edtCP_BARCODP_Internalname = sPrefix+"CP_BARCODP_"+sGXsfl_44_fel_idx ;
      edtCP_BARAGRE_Internalname = sPrefix+"CP_BARAGRE_"+sGXsfl_44_fel_idx ;
      edtCP_BARSER_Internalname = sPrefix+"CP_BARSER_"+sGXsfl_44_fel_idx ;
      edtCP_BARSERD_Internalname = sPrefix+"CP_BARSERD_"+sGXsfl_44_fel_idx ;
      edtCP_BARTIPA_Internalname = sPrefix+"CP_BARTIPA_"+sGXsfl_44_fel_idx ;
      edtCP_TARTDSC_Internalname = sPrefix+"CP_TARTDSC_"+sGXsfl_44_fel_idx ;
      edtCP_BARCOLO_Internalname = sPrefix+"CP_BARCOLO_"+sGXsfl_44_fel_idx ;
      edtCP_BARCOLU_Internalname = sPrefix+"CP_BARCOLU_"+sGXsfl_44_fel_idx ;
      edtCP_BARNOMC_Internalname = sPrefix+"CP_BARNOMC_"+sGXsfl_44_fel_idx ;
      edtCP_BARKGM_Internalname = sPrefix+"CP_BARKGM_"+sGXsfl_44_fel_idx ;
      edtCP_BARMTR_Internalname = sPrefix+"CP_BARMTR_"+sGXsfl_44_fel_idx ;
      edtCP_BARPIE_Internalname = sPrefix+"CP_BARPIE_"+sGXsfl_44_fel_idx ;
      edtCP_BARSIT_Internalname = sPrefix+"CP_BARSIT_"+sGXsfl_44_fel_idx ;
      edtCP_BARFECG_Internalname = sPrefix+"CP_BARFECG_"+sGXsfl_44_fel_idx ;
      edtCP_BARFECC_Internalname = sPrefix+"CP_BARFECC_"+sGXsfl_44_fel_idx ;
      edtCP_BARFECF_Internalname = sPrefix+"CP_BARFECF_"+sGXsfl_44_fel_idx ;
      edtCP_BARFECS_Internalname = sPrefix+"CP_BARFECS_"+sGXsfl_44_fel_idx ;
      edtavBarfascod_Internalname = sPrefix+"vBARFASCOD_"+sGXsfl_44_fel_idx ;
      edtavBarfassig_Internalname = sPrefix+"vBARFASSIG_"+sGXsfl_44_fel_idx ;
      edtavBaralbultimo_Internalname = sPrefix+"vBARALBULTIMO_"+sGXsfl_44_fel_idx ;
      edtCP_BARALBK_Internalname = sPrefix+"CP_BARALBK_"+sGXsfl_44_fel_idx ;
      edtCP_BARALBM_Internalname = sPrefix+"CP_BARALBM_"+sGXsfl_44_fel_idx ;
      edtavBaralbfact_Internalname = sPrefix+"vBARALBFACT_"+sGXsfl_44_fel_idx ;
      edtCP_BARGIRA_Internalname = sPrefix+"CP_BARGIRA_"+sGXsfl_44_fel_idx ;
      edtCP_BARPROP_Internalname = sPrefix+"CP_BARPROP_"+sGXsfl_44_fel_idx ;
      edtCP_DSC_BAR_Internalname = sPrefix+"CP_DSC_BAR_"+sGXsfl_44_fel_idx ;
      edtCP_DISUSRC_Internalname = sPrefix+"CP_DISUSRC_"+sGXsfl_44_fel_idx ;
      edtCP_ID_Internalname = sPrefix+"CP_ID_"+sGXsfl_44_fel_idx ;
      edtCP_BARPLF_Internalname = sPrefix+"CP_BARPLF_"+sGXsfl_44_fel_idx ;
      edtCP_BAREXT_Internalname = sPrefix+"CP_BAREXT_"+sGXsfl_44_fel_idx ;
      edtCP_DISDES_Internalname = sPrefix+"CP_DISDES_"+sGXsfl_44_fel_idx ;
      edtCP_DISCOD_Internalname = sPrefix+"CP_DISCOD_"+sGXsfl_44_fel_idx ;
   }

   public void sendrow_442( )
   {
      subsflControlProps_442( ) ;
      wb26N0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_44_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_44_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_44_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV155GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV155GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV155GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e2126n2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV155GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_44_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_EMPRCOD_Internalname,GXutil.rtrim( A14328CP_EMPRCOD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_EMPRCOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_CLICOD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_CLICOD_Internalname,GXutil.ltrim( localUtil.ntoc( A14326CP_CLICOD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14326CP_CLICOD), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_CLICOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_CLICOD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_CLINOM_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_CLINOM_Internalname,A14327CP_CLINOM,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_CLINOM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_CLINOM_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARDISN_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARDISN_Internalname,GXutil.rtrim( A14324CP_BARDISN),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARDISN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARDISN_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARCOD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCOD_Internalname,GXutil.ltrim( localUtil.ntoc( A14301CP_BARCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14301CP_BARCOD), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn",edtCP_BARCOD_Columnheaderclass,Integer.valueOf(edtCP_BARCOD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARCODR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCODR_Internalname,GXutil.ltrim( localUtil.ntoc( A14302CP_BARCODR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14302CP_BARCODR), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCODR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARCODR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARCODP_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCODP_Internalname,GXutil.rtrim( A14303CP_BARCODP),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCODP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_BARCODP_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARAGRE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARAGRE_Internalname,GXutil.rtrim( A14319CP_BARAGRE),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARAGRE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARAGRE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARSER_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARSER_Internalname,GXutil.rtrim( A14311CP_BARSER),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARSER_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARSER_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARSERD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARSERD_Internalname,A14312CP_BARSERD,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARSERD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARSERD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARTIPA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARTIPA_Internalname,GXutil.ltrim( localUtil.ntoc( A14316CP_BARTIPA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14316CP_BARTIPA), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARTIPA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARTIPA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_TARTDSC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_TARTDSC_Internalname,A14343CP_TARTDSC,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_TARTDSC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_TARTDSC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARCOLO_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCOLO_Internalname,GXutil.rtrim( A14331CP_BARCOLO),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCOLO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARCOLO_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARCOLU_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCOLU_Internalname,GXutil.ltrim( localUtil.ntoc( A14332CP_BARCOLU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14332CP_BARCOLU), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCOLU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARCOLU_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARNOMC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARNOMC_Internalname,A14315CP_BARNOMC,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARNOMC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARNOMC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARKGM_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARKGM_Internalname,GXutil.ltrim( localUtil.ntoc( A14336CP_BARKGM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14336CP_BARKGM, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARKGM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARKGM_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARMTR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARMTR_Internalname,GXutil.ltrim( localUtil.ntoc( A14337CP_BARMTR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14337CP_BARMTR, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARMTR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARMTR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARPIE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARPIE_Internalname,GXutil.ltrim( localUtil.ntoc( A14338CP_BARPIE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14338CP_BARPIE), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARPIE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARPIE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARSIT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARSIT_Internalname,GXutil.ltrim( localUtil.ntoc( A14307CP_BARSIT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14307CP_BARSIT), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARSIT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARSIT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARFECG_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECG_Internalname,localUtil.format(A14308CP_BARFECG, "99/99/99"),localUtil.format( A14308CP_BARFECG, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARFECG_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARFECC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECC_Internalname,localUtil.format(A14309CP_BARFECC, "99/99/99"),localUtil.format( A14309CP_BARFECC, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARFECC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARFECF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECF_Internalname,localUtil.format(A14304CP_BARFECF, "99/99/99"),localUtil.format( A14304CP_BARFECF, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARFECF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARFECS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECS_Internalname,localUtil.format(A14310CP_BARFECS, "99/99/99"),localUtil.format( A14310CP_BARFECS, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARFECS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarfascod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarfascod_Enabled!=0)&&(edtavBarfascod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfascod_Internalname,GXutil.rtrim( AV143BarFasCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarfascod_Enabled!=0)&&(edtavBarfascod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,69);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarfascod_Visible),Integer.valueOf(edtavBarfascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarfassig_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarfassig_Enabled!=0)&&(edtavBarfassig_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfassig_Internalname,GXutil.rtrim( AV140BarFasSig),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarfassig_Enabled!=0)&&(edtavBarfassig_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfassig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarfassig_Visible),Integer.valueOf(edtavBarfassig_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbultimo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaralbultimo_Enabled!=0)&&(edtavBaralbultimo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbultimo_Internalname,GXutil.ltrim( localUtil.ntoc( AV141BarAlbUltimo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbultimo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV141BarAlbUltimo), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV141BarAlbUltimo), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBaralbultimo_Enabled!=0)&&(edtavBaralbultimo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbultimo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbultimo_Visible),Integer.valueOf(edtavBaralbultimo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARALBK_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARALBK_Internalname,GXutil.ltrim( localUtil.ntoc( A14339CP_BARALBK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14339CP_BARALBK, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARALBK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_BARALBK_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARALBM_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARALBM_Internalname,GXutil.ltrim( localUtil.ntoc( A14340CP_BARALBM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14340CP_BARALBM, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARALBM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_BARALBM_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbfact_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaralbfact_Enabled!=0)&&(edtavBaralbfact_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbfact_Internalname,GXutil.ltrim( localUtil.ntoc( AV142BarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbfact_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV142BarAlbFact), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV142BarAlbFact), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBaralbfact_Enabled!=0)&&(edtavBaralbfact_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbfact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbfact_Visible),Integer.valueOf(edtavBaralbfact_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARGIRA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARGIRA_Internalname,A14317CP_BARGIRA,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARGIRA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARGIRA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARPROP_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARPROP_Internalname,GXutil.rtrim( A14323CP_BARPROP),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARPROP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARPROP_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_DSC_BAR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_DSC_BAR_Internalname,A14334CP_DSC_BAR,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_DSC_BAR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_DSC_BAR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_DISUSRC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_DISUSRC_Internalname,GXutil.rtrim( A14341CP_DISUSRC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_DISUSRC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_DISUSRC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A14297CP_ID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14297CP_ID), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_ID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARPLF_Internalname,GXutil.rtrim( A14306CP_BARPLF),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARPLF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BAREXT_Internalname,GXutil.ltrim( localUtil.ntoc( A14320CP_BAREXT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14320CP_BAREXT), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BAREXT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_DISDES_Internalname,GXutil.rtrim( A14321CP_DISDES),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_DISDES_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_DISCOD_Internalname,GXutil.ltrim( localUtil.ntoc( A14322CP_DISCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14322CP_DISCOD), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_DISCOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes26N2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      /* End function sendrow_442 */
   }

   public void startgridcontrol44( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"44\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_CLICOD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_CLINOM_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARDISN_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARCOD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARCODR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARCODP_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARAGRE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARSER_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARSERD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARTIPA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tip. Art.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_TARTDSC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARCOLO_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARCOLU_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARNOMC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARKGM_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "KIlos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARMTR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARPIE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARSIT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARFECG_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARFECC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARFECF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ent. Prev.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARFECS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarfascod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ult. Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarfassig_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sig. Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaralbultimo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultimo Alb.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARALBK_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs. Sal.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARALBM_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. Sal.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaralbfact_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARGIRA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARPROP_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ctw", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_DSC_BAR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_DISUSRC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV155GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14328CP_EMPRCOD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14326CP_CLICOD, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_CLICOD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14327CP_CLINOM);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_CLINOM_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14324CP_BARDISN));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARDISN_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14301CP_BARCOD, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCP_BARCOD_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARCOD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14302CP_BARCODR, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARCODR_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14303CP_BARCODP));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARCODP_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14319CP_BARAGRE));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARAGRE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14311CP_BARSER));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARSER_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14312CP_BARSERD);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARSERD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14316CP_BARTIPA, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARTIPA_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14343CP_TARTDSC);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_TARTDSC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14331CP_BARCOLO));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARCOLO_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14332CP_BARCOLU, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARCOLU_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14315CP_BARNOMC);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARNOMC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14336CP_BARKGM, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARKGM_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14337CP_BARMTR, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARMTR_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14338CP_BARPIE, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARPIE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14307CP_BARSIT, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARSIT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14308CP_BARFECG, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARFECG_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14309CP_BARFECC, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARFECC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14304CP_BARFECF, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARFECF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14310CP_BARFECS, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARFECS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV143BarFasCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarfascod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV140BarFasSig));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfassig_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarfassig_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV141BarAlbUltimo, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbultimo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaralbultimo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14339CP_BARALBK, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARALBK_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14340CP_BARALBM, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARALBM_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV142BarAlbFact, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbfact_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaralbfact_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14317CP_BARGIRA);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARGIRA_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14323CP_BARPROP));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARPROP_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14334CP_DSC_BAR);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_DSC_BAR_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14341CP_DISUSRC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_DISUSRC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14297CP_ID, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14306CP_BARPLF));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14320CP_BAREXT, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14321CP_DISDES));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14322CP_DISCOD, (byte)(8), (byte)(0), ".", "")));
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
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtCP_EMPRCOD_Internalname = sPrefix+"CP_EMPRCOD" ;
      edtCP_CLICOD_Internalname = sPrefix+"CP_CLICOD" ;
      edtCP_CLINOM_Internalname = sPrefix+"CP_CLINOM" ;
      edtCP_BARDISN_Internalname = sPrefix+"CP_BARDISN" ;
      edtCP_BARCOD_Internalname = sPrefix+"CP_BARCOD" ;
      edtCP_BARCODR_Internalname = sPrefix+"CP_BARCODR" ;
      edtCP_BARCODP_Internalname = sPrefix+"CP_BARCODP" ;
      edtCP_BARAGRE_Internalname = sPrefix+"CP_BARAGRE" ;
      edtCP_BARSER_Internalname = sPrefix+"CP_BARSER" ;
      edtCP_BARSERD_Internalname = sPrefix+"CP_BARSERD" ;
      edtCP_BARTIPA_Internalname = sPrefix+"CP_BARTIPA" ;
      edtCP_TARTDSC_Internalname = sPrefix+"CP_TARTDSC" ;
      edtCP_BARCOLO_Internalname = sPrefix+"CP_BARCOLO" ;
      edtCP_BARCOLU_Internalname = sPrefix+"CP_BARCOLU" ;
      edtCP_BARNOMC_Internalname = sPrefix+"CP_BARNOMC" ;
      edtCP_BARKGM_Internalname = sPrefix+"CP_BARKGM" ;
      edtCP_BARMTR_Internalname = sPrefix+"CP_BARMTR" ;
      edtCP_BARPIE_Internalname = sPrefix+"CP_BARPIE" ;
      edtCP_BARSIT_Internalname = sPrefix+"CP_BARSIT" ;
      edtCP_BARFECG_Internalname = sPrefix+"CP_BARFECG" ;
      edtCP_BARFECC_Internalname = sPrefix+"CP_BARFECC" ;
      edtCP_BARFECF_Internalname = sPrefix+"CP_BARFECF" ;
      edtCP_BARFECS_Internalname = sPrefix+"CP_BARFECS" ;
      edtavBarfascod_Internalname = sPrefix+"vBARFASCOD" ;
      edtavBarfassig_Internalname = sPrefix+"vBARFASSIG" ;
      edtavBaralbultimo_Internalname = sPrefix+"vBARALBULTIMO" ;
      edtCP_BARALBK_Internalname = sPrefix+"CP_BARALBK" ;
      edtCP_BARALBM_Internalname = sPrefix+"CP_BARALBM" ;
      edtavBaralbfact_Internalname = sPrefix+"vBARALBFACT" ;
      edtCP_BARGIRA_Internalname = sPrefix+"CP_BARGIRA" ;
      edtCP_BARPROP_Internalname = sPrefix+"CP_BARPROP" ;
      edtCP_DSC_BAR_Internalname = sPrefix+"CP_DSC_BAR" ;
      edtCP_DISUSRC_Internalname = sPrefix+"CP_DISUSRC" ;
      edtCP_ID_Internalname = sPrefix+"CP_ID" ;
      edtCP_BARPLF_Internalname = sPrefix+"CP_BARPLF" ;
      edtCP_BAREXT_Internalname = sPrefix+"CP_BAREXT" ;
      edtCP_DISDES_Internalname = sPrefix+"CP_DISDES" ;
      edtCP_DISCOD_Internalname = sPrefix+"CP_DISCOD" ;
      edtavTotvaluecp_barkgm_Internalname = sPrefix+"vTOTVALUECP_BARKGM" ;
      edtavTotvaluecp_barmtr_Internalname = sPrefix+"vTOTVALUECP_BARMTR" ;
      edtavTotvaluecp_barpie_Internalname = sPrefix+"vTOTVALUECP_BARPIE" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtCP_DISCOD_Jsonclick = "" ;
      edtCP_DISDES_Jsonclick = "" ;
      edtCP_BAREXT_Jsonclick = "" ;
      edtCP_BARPLF_Jsonclick = "" ;
      edtCP_ID_Jsonclick = "" ;
      edtCP_DISUSRC_Jsonclick = "" ;
      edtCP_DSC_BAR_Jsonclick = "" ;
      edtCP_BARPROP_Jsonclick = "" ;
      edtCP_BARGIRA_Jsonclick = "" ;
      edtavBaralbfact_Jsonclick = "" ;
      edtavBaralbfact_Enabled = 1 ;
      edtCP_BARALBM_Jsonclick = "" ;
      edtCP_BARALBK_Jsonclick = "" ;
      edtavBaralbultimo_Jsonclick = "" ;
      edtavBaralbultimo_Enabled = 1 ;
      edtavBarfassig_Jsonclick = "" ;
      edtavBarfassig_Enabled = 1 ;
      edtavBarfascod_Jsonclick = "" ;
      edtavBarfascod_Enabled = 1 ;
      edtCP_BARFECS_Jsonclick = "" ;
      edtCP_BARFECF_Jsonclick = "" ;
      edtCP_BARFECC_Jsonclick = "" ;
      edtCP_BARFECG_Jsonclick = "" ;
      edtCP_BARSIT_Jsonclick = "" ;
      edtCP_BARPIE_Jsonclick = "" ;
      edtCP_BARMTR_Jsonclick = "" ;
      edtCP_BARKGM_Jsonclick = "" ;
      edtCP_BARNOMC_Jsonclick = "" ;
      edtCP_BARCOLU_Jsonclick = "" ;
      edtCP_BARCOLO_Jsonclick = "" ;
      edtCP_TARTDSC_Jsonclick = "" ;
      edtCP_BARTIPA_Jsonclick = "" ;
      edtCP_BARSERD_Jsonclick = "" ;
      edtCP_BARSER_Jsonclick = "" ;
      edtCP_BARAGRE_Jsonclick = "" ;
      edtCP_BARCODP_Jsonclick = "" ;
      edtCP_BARCODR_Jsonclick = "" ;
      edtCP_BARCOD_Jsonclick = "" ;
      edtCP_BARDISN_Jsonclick = "" ;
      edtCP_CLINOM_Jsonclick = "" ;
      edtCP_CLICOD_Jsonclick = "" ;
      edtCP_EMPRCOD_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluecp_barpie_Jsonclick = "" ;
      edtavTotvaluecp_barpie_Enabled = 1 ;
      edtavTotvaluecp_barmtr_Jsonclick = "" ;
      edtavTotvaluecp_barmtr_Enabled = 1 ;
      edtavTotvaluecp_barkgm_Jsonclick = "" ;
      edtavTotvaluecp_barkgm_Enabled = 1 ;
      edtCP_BARCOD_Columnheaderclass = "" ;
      edtCP_DISUSRC_Visible = -1 ;
      edtCP_DSC_BAR_Visible = -1 ;
      edtCP_BARPROP_Visible = -1 ;
      edtCP_BARGIRA_Visible = -1 ;
      edtavBaralbfact_Visible = -1 ;
      edtCP_BARALBM_Visible = -1 ;
      edtCP_BARALBK_Visible = -1 ;
      edtavBaralbultimo_Visible = -1 ;
      edtavBarfassig_Visible = -1 ;
      edtavBarfascod_Visible = -1 ;
      edtCP_BARFECS_Visible = -1 ;
      edtCP_BARFECF_Visible = -1 ;
      edtCP_BARFECC_Visible = -1 ;
      edtCP_BARFECG_Visible = -1 ;
      edtCP_BARSIT_Visible = -1 ;
      edtCP_BARPIE_Visible = -1 ;
      edtCP_BARMTR_Visible = -1 ;
      edtCP_BARKGM_Visible = -1 ;
      edtCP_BARNOMC_Visible = -1 ;
      edtCP_BARCOLU_Visible = -1 ;
      edtCP_BARCOLO_Visible = -1 ;
      edtCP_TARTDSC_Visible = -1 ;
      edtCP_BARTIPA_Visible = -1 ;
      edtCP_BARSERD_Visible = -1 ;
      edtCP_BARSER_Visible = -1 ;
      edtCP_BARAGRE_Visible = -1 ;
      edtCP_BARCODP_Visible = -1 ;
      edtCP_BARCODR_Visible = -1 ;
      edtCP_BARCOD_Visible = -1 ;
      edtCP_BARDISN_Visible = -1 ;
      edtCP_CLINOM_Visible = -1 ;
      edtCP_CLICOD_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = "" ;
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
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||||T|T||T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23||||24|25||26|27|28|29" ;
      Ddo_grid_Columnids = "2:CP_CLICOD|3:CP_CLINOM|4:CP_BARDISNUM|5:CP_BARCOD|6:CP_BARCODREO|7:CP_BARCODPAR|8:CP_BARAGREST|9:CP_BARSER|10:CP_BARSERDSC|11:CP_BARTIPART|12:CP_TARTDSC|13:CP_BARCOLO|14:CP_BARCOLU|15:CP_BARNOMCLI|16:CP_BARKGM|17:CP_BARMTR|18:CP_BARPIE|19:CP_BARSIT|20:CP_BARFECGEN|21:CP_BARFECCLI|22:CP_BARFECFPR|23:CP_BARFECSAL|24:BarFasCod|25:BarFasSig|26:BarAlbUltimo|27:CP_BARALBK|28:CP_BARALBM|29:BarAlbFact|30:CP_BARGIRAR|31:CP_BARPROPER|32:CP_DSC_BAR|33:CP_DISUSRC" ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_44_idx ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV166FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV131Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV130CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV108BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV109BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV114BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV115BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV125BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV126BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV110BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV111BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV112BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV113BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV116BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV117BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV123BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV124BarSerto',fld:'vBARSERTO',pic:''},{av:'AV127BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV128BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV104BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV105BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV106BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV107BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV119BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV120BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV121BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV122BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV98BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV103BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV101BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV102BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV99BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV100BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV132Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV118BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV133TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14324CP_BARDISN',fld:'CP_BARDISN',pic:''},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9'},{av:'A14307CP_BARSIT',fld:'CP_BARSIT',pic:'Z9'},{av:'A14308CP_BARFECG',fld:'CP_BARFECG',pic:''},{av:'A14310CP_BARFECS',fld:'CP_BARFECS',pic:''},{av:'A14309CP_BARFECC',fld:'CP_BARFECC',pic:''},{av:'A14304CP_BARFECF',fld:'CP_BARFECF',pic:''},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:''},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:''},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9'},{av:'A14315CP_BARNOMC',fld:'CP_BARNOMC',pic:''},{av:'A14305CP_BARNUMC',fld:'CP_BARNUMC',pic:'ZZZZZ9'},{av:'A14316CP_BARTIPA',fld:'CP_BARTIPA',pic:'ZZZ9'},{av:'A14306CP_BARPLF',fld:'CP_BARPLF',pic:''},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'A14323CP_BARPROP',fld:'CP_BARPROP',pic:''},{av:'A14317CP_BARGIRA',fld:'CP_BARGIRA',pic:''},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99'},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99'},{av:'A14338CP_BARPIE',fld:'CP_BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCP_CLICOD_Visible',ctrl:'CP_CLICOD',prop:'Visible'},{av:'edtCP_CLINOM_Visible',ctrl:'CP_CLINOM',prop:'Visible'},{av:'edtCP_BARDISN_Visible',ctrl:'CP_BARDISN',prop:'Visible'},{av:'edtCP_BARCOD_Visible',ctrl:'CP_BARCOD',prop:'Visible'},{av:'edtCP_BARCODR_Visible',ctrl:'CP_BARCODR',prop:'Visible'},{av:'edtCP_BARCODP_Visible',ctrl:'CP_BARCODP',prop:'Visible'},{av:'edtCP_BARAGRE_Visible',ctrl:'CP_BARAGRE',prop:'Visible'},{av:'edtCP_BARSER_Visible',ctrl:'CP_BARSER',prop:'Visible'},{av:'edtCP_BARSERD_Visible',ctrl:'CP_BARSERD',prop:'Visible'},{av:'edtCP_BARTIPA_Visible',ctrl:'CP_BARTIPA',prop:'Visible'},{av:'edtCP_TARTDSC_Visible',ctrl:'CP_TARTDSC',prop:'Visible'},{av:'edtCP_BARCOLO_Visible',ctrl:'CP_BARCOLO',prop:'Visible'},{av:'edtCP_BARCOLU_Visible',ctrl:'CP_BARCOLU',prop:'Visible'},{av:'edtCP_BARNOMC_Visible',ctrl:'CP_BARNOMC',prop:'Visible'},{av:'edtCP_BARKGM_Visible',ctrl:'CP_BARKGM',prop:'Visible'},{av:'edtCP_BARMTR_Visible',ctrl:'CP_BARMTR',prop:'Visible'},{av:'edtCP_BARPIE_Visible',ctrl:'CP_BARPIE',prop:'Visible'},{av:'edtCP_BARSIT_Visible',ctrl:'CP_BARSIT',prop:'Visible'},{av:'edtCP_BARFECG_Visible',ctrl:'CP_BARFECG',prop:'Visible'},{av:'edtCP_BARFECC_Visible',ctrl:'CP_BARFECC',prop:'Visible'},{av:'edtCP_BARFECF_Visible',ctrl:'CP_BARFECF',prop:'Visible'},{av:'edtCP_BARFECS_Visible',ctrl:'CP_BARFECS',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtavBarfassig_Visible',ctrl:'vBARFASSIG',prop:'Visible'},{av:'edtavBaralbultimo_Visible',ctrl:'vBARALBULTIMO',prop:'Visible'},{av:'edtCP_BARALBK_Visible',ctrl:'CP_BARALBK',prop:'Visible'},{av:'edtCP_BARALBM_Visible',ctrl:'CP_BARALBM',prop:'Visible'},{av:'edtavBaralbfact_Visible',ctrl:'vBARALBFACT',prop:'Visible'},{av:'edtCP_BARGIRA_Visible',ctrl:'CP_BARGIRA',prop:'Visible'},{av:'edtCP_BARPROP_Visible',ctrl:'CP_BARPROP',prop:'Visible'},{av:'edtCP_DSC_BAR_Visible',ctrl:'CP_DSC_BAR',prop:'Visible'},{av:'edtCP_DISUSRC_Visible',ctrl:'CP_DISUSRC',prop:'Visible'},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCP_BARCOD_Columnheaderclass',ctrl:'CP_BARCOD',prop:'Columnheaderclass'},{av:'AV167ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV17GridState',fld:'vGRIDSTATE',pic:''},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV149TotValueCP_BARKGM',fld:'vTOTVALUECP_BARKGM',pic:''},{av:'AV151TotValueCP_BARMTR',fld:'vTOTVALUECP_BARMTR',pic:''},{av:'AV153TotValueCP_BARPIE',fld:'vTOTVALUECP_BARPIE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1226N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV166FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV131Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV130CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV108BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV109BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV114BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV115BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV125BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV126BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV110BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV111BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV112BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV113BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV116BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV117BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV123BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV124BarSerto',fld:'vBARSERTO',pic:''},{av:'AV127BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV128BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV104BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV105BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV106BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV107BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV119BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV120BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV121BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV122BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV98BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV103BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV101BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV102BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV99BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV100BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV132Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV118BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV133TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1326N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV166FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV131Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV130CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV108BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV109BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV114BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV115BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV125BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV126BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV110BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV111BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV112BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV113BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV116BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV117BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV123BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV124BarSerto',fld:'vBARSERTO',pic:''},{av:'AV127BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV128BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV104BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV105BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV106BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV107BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV119BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV120BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV121BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV122BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV98BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV103BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV101BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV102BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV99BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV100BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV132Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV118BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV133TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1426N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV166FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV131Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV130CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV108BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV109BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV114BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV115BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV125BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV126BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV110BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV111BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV112BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV113BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV116BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV117BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV123BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV124BarSerto',fld:'vBARSERTO',pic:''},{av:'AV127BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV128BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV104BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV105BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV106BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV107BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV119BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV120BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV121BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV122BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV98BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV103BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV101BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV102BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV99BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV100BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV132Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV118BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV133TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2026N2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1526N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV166FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV131Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV130CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV108BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV109BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV114BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV115BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV125BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV126BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV110BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV111BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV112BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV113BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV116BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV117BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV123BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV124BarSerto',fld:'vBARSERTO',pic:''},{av:'AV127BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV128BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV104BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV105BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV106BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV107BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV119BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV120BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV121BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV122BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV98BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV103BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV101BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV102BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV99BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV100BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV132Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV118BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV133TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14324CP_BARDISN',fld:'CP_BARDISN',pic:''},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9'},{av:'A14307CP_BARSIT',fld:'CP_BARSIT',pic:'Z9'},{av:'A14308CP_BARFECG',fld:'CP_BARFECG',pic:''},{av:'A14310CP_BARFECS',fld:'CP_BARFECS',pic:''},{av:'A14309CP_BARFECC',fld:'CP_BARFECC',pic:''},{av:'A14304CP_BARFECF',fld:'CP_BARFECF',pic:''},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:''},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:''},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9'},{av:'A14315CP_BARNOMC',fld:'CP_BARNOMC',pic:''},{av:'A14305CP_BARNUMC',fld:'CP_BARNUMC',pic:'ZZZZZ9'},{av:'A14316CP_BARTIPA',fld:'CP_BARTIPA',pic:'ZZZ9'},{av:'A14306CP_BARPLF',fld:'CP_BARPLF',pic:''},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'A14323CP_BARPROP',fld:'CP_BARPROP',pic:''},{av:'A14317CP_BARGIRA',fld:'CP_BARGIRA',pic:''},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99'},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99'},{av:'A14338CP_BARPIE',fld:'CP_BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCP_CLICOD_Visible',ctrl:'CP_CLICOD',prop:'Visible'},{av:'edtCP_CLINOM_Visible',ctrl:'CP_CLINOM',prop:'Visible'},{av:'edtCP_BARDISN_Visible',ctrl:'CP_BARDISN',prop:'Visible'},{av:'edtCP_BARCOD_Visible',ctrl:'CP_BARCOD',prop:'Visible'},{av:'edtCP_BARCODR_Visible',ctrl:'CP_BARCODR',prop:'Visible'},{av:'edtCP_BARCODP_Visible',ctrl:'CP_BARCODP',prop:'Visible'},{av:'edtCP_BARAGRE_Visible',ctrl:'CP_BARAGRE',prop:'Visible'},{av:'edtCP_BARSER_Visible',ctrl:'CP_BARSER',prop:'Visible'},{av:'edtCP_BARSERD_Visible',ctrl:'CP_BARSERD',prop:'Visible'},{av:'edtCP_BARTIPA_Visible',ctrl:'CP_BARTIPA',prop:'Visible'},{av:'edtCP_TARTDSC_Visible',ctrl:'CP_TARTDSC',prop:'Visible'},{av:'edtCP_BARCOLO_Visible',ctrl:'CP_BARCOLO',prop:'Visible'},{av:'edtCP_BARCOLU_Visible',ctrl:'CP_BARCOLU',prop:'Visible'},{av:'edtCP_BARNOMC_Visible',ctrl:'CP_BARNOMC',prop:'Visible'},{av:'edtCP_BARKGM_Visible',ctrl:'CP_BARKGM',prop:'Visible'},{av:'edtCP_BARMTR_Visible',ctrl:'CP_BARMTR',prop:'Visible'},{av:'edtCP_BARPIE_Visible',ctrl:'CP_BARPIE',prop:'Visible'},{av:'edtCP_BARSIT_Visible',ctrl:'CP_BARSIT',prop:'Visible'},{av:'edtCP_BARFECG_Visible',ctrl:'CP_BARFECG',prop:'Visible'},{av:'edtCP_BARFECC_Visible',ctrl:'CP_BARFECC',prop:'Visible'},{av:'edtCP_BARFECF_Visible',ctrl:'CP_BARFECF',prop:'Visible'},{av:'edtCP_BARFECS_Visible',ctrl:'CP_BARFECS',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtavBarfassig_Visible',ctrl:'vBARFASSIG',prop:'Visible'},{av:'edtavBaralbultimo_Visible',ctrl:'vBARALBULTIMO',prop:'Visible'},{av:'edtCP_BARALBK_Visible',ctrl:'CP_BARALBK',prop:'Visible'},{av:'edtCP_BARALBM_Visible',ctrl:'CP_BARALBM',prop:'Visible'},{av:'edtavBaralbfact_Visible',ctrl:'vBARALBFACT',prop:'Visible'},{av:'edtCP_BARGIRA_Visible',ctrl:'CP_BARGIRA',prop:'Visible'},{av:'edtCP_BARPROP_Visible',ctrl:'CP_BARPROP',prop:'Visible'},{av:'edtCP_DSC_BAR_Visible',ctrl:'CP_DSC_BAR',prop:'Visible'},{av:'edtCP_DISUSRC_Visible',ctrl:'CP_DISUSRC',prop:'Visible'},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCP_BARCOD_Columnheaderclass',ctrl:'CP_BARCOD',prop:'Columnheaderclass'},{av:'AV167ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV17GridState',fld:'vGRIDSTATE',pic:''},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV149TotValueCP_BARKGM',fld:'vTOTVALUECP_BARKGM',pic:''},{av:'AV151TotValueCP_BARMTR',fld:'vTOTVALUECP_BARMTR',pic:''},{av:'AV153TotValueCP_BARPIE',fld:'vTOTVALUECP_BARPIE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1126N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV166FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV131Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV130CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV108BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV109BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV114BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV115BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV125BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV126BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV110BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV111BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV112BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV113BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV116BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV117BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV123BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV124BarSerto',fld:'vBARSERTO',pic:''},{av:'AV127BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV128BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV104BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV105BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV106BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV107BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV119BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV120BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV121BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV122BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV98BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV103BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV101BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV102BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV99BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV100BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV132Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV118BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV133TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV17GridState',fld:'vGRIDSTATE',pic:''},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14324CP_BARDISN',fld:'CP_BARDISN',pic:''},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9'},{av:'A14307CP_BARSIT',fld:'CP_BARSIT',pic:'Z9'},{av:'A14308CP_BARFECG',fld:'CP_BARFECG',pic:''},{av:'A14310CP_BARFECS',fld:'CP_BARFECS',pic:''},{av:'A14309CP_BARFECC',fld:'CP_BARFECC',pic:''},{av:'A14304CP_BARFECF',fld:'CP_BARFECF',pic:''},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:''},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:''},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9'},{av:'A14315CP_BARNOMC',fld:'CP_BARNOMC',pic:''},{av:'A14305CP_BARNUMC',fld:'CP_BARNUMC',pic:'ZZZZZ9'},{av:'A14316CP_BARTIPA',fld:'CP_BARTIPA',pic:'ZZZ9'},{av:'A14306CP_BARPLF',fld:'CP_BARPLF',pic:''},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'A14323CP_BARPROP',fld:'CP_BARPROP',pic:''},{av:'A14317CP_BARGIRA',fld:'CP_BARGIRA',pic:''},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99'},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99'},{av:'A14338CP_BARPIE',fld:'CP_BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17GridState',fld:'vGRIDSTATE',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV166FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCP_CLICOD_Visible',ctrl:'CP_CLICOD',prop:'Visible'},{av:'edtCP_CLINOM_Visible',ctrl:'CP_CLINOM',prop:'Visible'},{av:'edtCP_BARDISN_Visible',ctrl:'CP_BARDISN',prop:'Visible'},{av:'edtCP_BARCOD_Visible',ctrl:'CP_BARCOD',prop:'Visible'},{av:'edtCP_BARCODR_Visible',ctrl:'CP_BARCODR',prop:'Visible'},{av:'edtCP_BARCODP_Visible',ctrl:'CP_BARCODP',prop:'Visible'},{av:'edtCP_BARAGRE_Visible',ctrl:'CP_BARAGRE',prop:'Visible'},{av:'edtCP_BARSER_Visible',ctrl:'CP_BARSER',prop:'Visible'},{av:'edtCP_BARSERD_Visible',ctrl:'CP_BARSERD',prop:'Visible'},{av:'edtCP_BARTIPA_Visible',ctrl:'CP_BARTIPA',prop:'Visible'},{av:'edtCP_TARTDSC_Visible',ctrl:'CP_TARTDSC',prop:'Visible'},{av:'edtCP_BARCOLO_Visible',ctrl:'CP_BARCOLO',prop:'Visible'},{av:'edtCP_BARCOLU_Visible',ctrl:'CP_BARCOLU',prop:'Visible'},{av:'edtCP_BARNOMC_Visible',ctrl:'CP_BARNOMC',prop:'Visible'},{av:'edtCP_BARKGM_Visible',ctrl:'CP_BARKGM',prop:'Visible'},{av:'edtCP_BARMTR_Visible',ctrl:'CP_BARMTR',prop:'Visible'},{av:'edtCP_BARPIE_Visible',ctrl:'CP_BARPIE',prop:'Visible'},{av:'edtCP_BARSIT_Visible',ctrl:'CP_BARSIT',prop:'Visible'},{av:'edtCP_BARFECG_Visible',ctrl:'CP_BARFECG',prop:'Visible'},{av:'edtCP_BARFECC_Visible',ctrl:'CP_BARFECC',prop:'Visible'},{av:'edtCP_BARFECF_Visible',ctrl:'CP_BARFECF',prop:'Visible'},{av:'edtCP_BARFECS_Visible',ctrl:'CP_BARFECS',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtavBarfassig_Visible',ctrl:'vBARFASSIG',prop:'Visible'},{av:'edtavBaralbultimo_Visible',ctrl:'vBARALBULTIMO',prop:'Visible'},{av:'edtCP_BARALBK_Visible',ctrl:'CP_BARALBK',prop:'Visible'},{av:'edtCP_BARALBM_Visible',ctrl:'CP_BARALBM',prop:'Visible'},{av:'edtavBaralbfact_Visible',ctrl:'vBARALBFACT',prop:'Visible'},{av:'edtCP_BARGIRA_Visible',ctrl:'CP_BARGIRA',prop:'Visible'},{av:'edtCP_BARPROP_Visible',ctrl:'CP_BARPROP',prop:'Visible'},{av:'edtCP_DSC_BAR_Visible',ctrl:'CP_DSC_BAR',prop:'Visible'},{av:'edtCP_DISUSRC_Visible',ctrl:'CP_DISUSRC',prop:'Visible'},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCP_BARCOD_Columnheaderclass',ctrl:'CP_BARCOD',prop:'Columnheaderclass'},{av:'AV167ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV149TotValueCP_BARKGM',fld:'vTOTVALUECP_BARKGM',pic:''},{av:'AV151TotValueCP_BARMTR',fld:'vTOTVALUECP_BARMTR',pic:''},{av:'AV153TotValueCP_BARPIE',fld:'vTOTVALUECP_BARPIE',pic:''}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2126N2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV155GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9'},{av:'A14327CP_CLINOM',fld:'CP_CLINOM',pic:''},{av:'A14324CP_BARDISN',fld:'CP_BARDISN',pic:''},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:''},{av:'A14312CP_BARSERD',fld:'CP_BARSERD',pic:'',hsh:true},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:''},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9'},{av:'A14304CP_BARFECF',fld:'CP_BARFECF',pic:''},{av:'AV157Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV131Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV155GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1626N2',iparms:[{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV17GridState',fld:'vGRIDSTATE',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV166FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV131Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV130CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV108BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV109BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV114BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV115BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV125BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV126BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV110BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV111BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV112BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV113BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV116BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV117BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV123BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV124BarSerto',fld:'vBARSERTO',pic:''},{av:'AV127BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV128BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV104BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV105BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV106BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV107BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV119BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV120BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV121BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV122BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV98BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV103BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV101BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV102BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV99BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV100BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV132Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV118BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV133TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1726N2',iparms:[{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV17GridState',fld:'vGRIDSTATE',pic:''},{av:'AV21OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV166FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV131Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV130CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV108BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV109BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV114BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV115BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV125BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV126BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV110BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV111BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV112BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV113BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV116BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV117BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV123BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV124BarSerto',fld:'vBARSERTO',pic:''},{av:'AV127BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV128BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV104BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV105BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV106BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV107BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV119BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV120BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV121BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV122BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV98BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV103BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV101BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV102BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV99BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV100BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV132Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV118BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV169ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV172Pgmname',fld:'vPGMNAME',pic:''},{av:'AV133TFBarPlf',fld:'vTFBARPLF',pic:'@!',hsh:true},{av:'AV148TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV150TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV152TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("NULL","{handler:'valid_Cp_discod',iparms:[]");
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
      wcpOAV131Emprcod = "" ;
      wcpOAV108BarDisNumfrom = "" ;
      wcpOAV109BarDisNumto = "" ;
      wcpOAV114BarFecGenfrom = GXutil.nullDate() ;
      wcpOAV115BarFecGento = GXutil.nullDate() ;
      wcpOAV110BarFecClifrom = GXutil.nullDate() ;
      wcpOAV111BarFecClito = GXutil.nullDate() ;
      wcpOAV112BarFecFprfrom = GXutil.nullDate() ;
      wcpOAV113BarFecFprto = GXutil.nullDate() ;
      wcpOAV116BarFecSalfrom = GXutil.nullDate() ;
      wcpOAV117BarFecSalto = GXutil.nullDate() ;
      wcpOAV123BarSerfrom = "" ;
      wcpOAV124BarSerto = "" ;
      wcpOAV104BarColNomfrom = "" ;
      wcpOAV105BarColNomto = "" ;
      wcpOAV119BarNomClifrom = "" ;
      wcpOAV120BarNomClito = "" ;
      wcpOAV136muestras = "" ;
      wcpOAV99BarCodParfrom = "" ;
      wcpOAV100BarCodParto = "" ;
      wcpOAV132Cod_idtx = "" ;
      wcpOAV118BarGirar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV131Emprcod = "" ;
      AV108BarDisNumfrom = "" ;
      AV109BarDisNumto = "" ;
      AV114BarFecGenfrom = GXutil.nullDate() ;
      AV115BarFecGento = GXutil.nullDate() ;
      AV110BarFecClifrom = GXutil.nullDate() ;
      AV111BarFecClito = GXutil.nullDate() ;
      AV112BarFecFprfrom = GXutil.nullDate() ;
      AV113BarFecFprto = GXutil.nullDate() ;
      AV116BarFecSalfrom = GXutil.nullDate() ;
      AV117BarFecSalto = GXutil.nullDate() ;
      AV123BarSerfrom = "" ;
      AV124BarSerto = "" ;
      AV104BarColNomfrom = "" ;
      AV105BarColNomto = "" ;
      AV119BarNomClifrom = "" ;
      AV120BarNomClito = "" ;
      AV136muestras = "" ;
      AV99BarCodParfrom = "" ;
      AV100BarCodParto = "" ;
      AV132Cod_idtx = "" ;
      AV118BarGirar = "" ;
      AV166FilterFullText = "" ;
      AV5ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV172Pgmname = "" ;
      AV133TFBarPlf = "" ;
      AV148TotCP_BARKGM = DecimalUtil.ZERO ;
      AV150TotCP_BARMTR = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV167ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV12DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV17GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
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
      A14328CP_EMPRCOD = "" ;
      A14327CP_CLINOM = "" ;
      A14324CP_BARDISN = "" ;
      A14303CP_BARCODP = "" ;
      A14319CP_BARAGRE = "" ;
      A14311CP_BARSER = "" ;
      A14312CP_BARSERD = "" ;
      A14343CP_TARTDSC = "" ;
      A14331CP_BARCOLO = "" ;
      A14315CP_BARNOMC = "" ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      AV143BarFasCod = "" ;
      AV140BarFasSig = "" ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      A14317CP_BARGIRA = "" ;
      A14323CP_BARPROP = "" ;
      A14334CP_DSC_BAR = "" ;
      A14341CP_DISUSRC = "" ;
      A14306CP_BARPLF = "" ;
      A14321CP_DISDES = "" ;
      scmdbuf = "" ;
      lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = "" ;
      AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = "" ;
      H026N2_A14305CP_BARNUMC = new int[1] ;
      H026N2_A14322CP_DISCOD = new int[1] ;
      H026N2_A14321CP_DISDES = new String[] {""} ;
      H026N2_A14320CP_BAREXT = new byte[1] ;
      H026N2_A14306CP_BARPLF = new String[] {""} ;
      H026N2_A14297CP_ID = new long[1] ;
      H026N2_A14341CP_DISUSRC = new String[] {""} ;
      H026N2_A14334CP_DSC_BAR = new String[] {""} ;
      H026N2_A14323CP_BARPROP = new String[] {""} ;
      H026N2_A14317CP_BARGIRA = new String[] {""} ;
      H026N2_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026N2_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026N2_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      H026N2_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      H026N2_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      H026N2_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      H026N2_A14307CP_BARSIT = new byte[1] ;
      H026N2_A14338CP_BARPIE = new int[1] ;
      H026N2_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026N2_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026N2_A14315CP_BARNOMC = new String[] {""} ;
      H026N2_A14332CP_BARCOLU = new int[1] ;
      H026N2_A14331CP_BARCOLO = new String[] {""} ;
      H026N2_A14343CP_TARTDSC = new String[] {""} ;
      H026N2_A14316CP_BARTIPA = new short[1] ;
      H026N2_A14312CP_BARSERD = new String[] {""} ;
      H026N2_A14311CP_BARSER = new String[] {""} ;
      H026N2_A14319CP_BARAGRE = new String[] {""} ;
      H026N2_A14303CP_BARCODP = new String[] {""} ;
      H026N2_A14302CP_BARCODR = new byte[1] ;
      H026N2_A14301CP_BARCOD = new int[1] ;
      H026N2_A14324CP_BARDISN = new String[] {""} ;
      H026N2_A14327CP_CLINOM = new String[] {""} ;
      H026N2_A14326CP_CLICOD = new int[1] ;
      H026N2_A14328CP_EMPRCOD = new String[] {""} ;
      H026N3_AGRID_nRecordCount = new long[1] ;
      AV149TotValueCP_BARKGM = "" ;
      AV151TotValueCP_BARMTR = "" ;
      AV153TotValueCP_BARPIE = "" ;
      hsh = "" ;
      AV134Station = "" ;
      GXv_char2 = new String[1] ;
      AV135EmprNom = "" ;
      AV137UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV97WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV7ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV168ManageFiltersXml = "" ;
      AV14ExcelFilename = "" ;
      AV13ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV96UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV6ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV18GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV94TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV19HTTPRequest = httpContext.getHttpRequest();
      H026N4_A14297CP_ID = new long[1] ;
      H026N4_A14317CP_BARGIRA = new String[] {""} ;
      H026N4_A14323CP_BARPROP = new String[] {""} ;
      H026N4_A14303CP_BARCODP = new String[] {""} ;
      H026N4_A14302CP_BARCODR = new byte[1] ;
      H026N4_A14301CP_BARCOD = new int[1] ;
      H026N4_A14306CP_BARPLF = new String[] {""} ;
      H026N4_A14316CP_BARTIPA = new short[1] ;
      H026N4_A14305CP_BARNUMC = new int[1] ;
      H026N4_A14315CP_BARNOMC = new String[] {""} ;
      H026N4_A14332CP_BARCOLU = new int[1] ;
      H026N4_A14331CP_BARCOLO = new String[] {""} ;
      H026N4_A14311CP_BARSER = new String[] {""} ;
      H026N4_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      H026N4_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      H026N4_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      H026N4_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      H026N4_A14307CP_BARSIT = new byte[1] ;
      H026N4_A14326CP_CLICOD = new int[1] ;
      H026N4_A14328CP_EMPRCOD = new String[] {""} ;
      H026N4_A14324CP_BARDISN = new String[] {""} ;
      H026N4_A14327CP_CLINOM = new String[] {""} ;
      H026N4_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026N4_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026N4_A14338CP_BARPIE = new int[1] ;
      ucAgrupadas_modal = new com.genexus.webpanels.GXUserControl();
      ucPiezas_modal = new com.genexus.webpanels.GXUserControl();
      ucPackinglist_modal = new com.genexus.webpanels.GXUserControl();
      ucPartesproduccion_modal = new com.genexus.webpanels.GXUserControl();
      ucRecetas_modal = new com.genexus.webpanels.GXUserControl();
      ucConsultaalbaransalida_modal = new com.genexus.webpanels.GXUserControl();
      ucSituacionfases_modal = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV131Emprcod = "" ;
      sCtrlAV129CliCodfrom = "" ;
      sCtrlAV130CliCodto = "" ;
      sCtrlAV108BarDisNumfrom = "" ;
      sCtrlAV109BarDisNumto = "" ;
      sCtrlAV114BarFecGenfrom = "" ;
      sCtrlAV115BarFecGento = "" ;
      sCtrlAV125BarSitfrom = "" ;
      sCtrlAV126BarSitto = "" ;
      sCtrlAV110BarFecClifrom = "" ;
      sCtrlAV111BarFecClito = "" ;
      sCtrlAV112BarFecFprfrom = "" ;
      sCtrlAV113BarFecFprto = "" ;
      sCtrlAV116BarFecSalfrom = "" ;
      sCtrlAV117BarFecSalto = "" ;
      sCtrlAV123BarSerfrom = "" ;
      sCtrlAV124BarSerto = "" ;
      sCtrlAV127BarTipArtfrom = "" ;
      sCtrlAV128BarTipArtto = "" ;
      sCtrlAV104BarColNomfrom = "" ;
      sCtrlAV105BarColNomto = "" ;
      sCtrlAV106BarColNumfrom = "" ;
      sCtrlAV107BarColNumto = "" ;
      sCtrlAV119BarNomClifrom = "" ;
      sCtrlAV120BarNomClito = "" ;
      sCtrlAV121BarNumClifrom = "" ;
      sCtrlAV122BarNumClito = "" ;
      sCtrlAV136muestras = "" ;
      sCtrlAV98BarCodfrom = "" ;
      sCtrlAV103BarCodto = "" ;
      sCtrlAV101BarCodReofrom = "" ;
      sCtrlAV102BarCodReoto = "" ;
      sCtrlAV99BarCodParfrom = "" ;
      sCtrlAV100BarCodParto = "" ;
      sCtrlAV132Cod_idtx = "" ;
      sCtrlAV118BarGirar = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultaproduccion_tabla_materializada__default(),
         new Object[] {
             new Object[] {
            H026N2_A14305CP_BARNUMC, H026N2_A14322CP_DISCOD, H026N2_A14321CP_DISDES, H026N2_A14320CP_BAREXT, H026N2_A14306CP_BARPLF, H026N2_A14297CP_ID, H026N2_A14341CP_DISUSRC, H026N2_A14334CP_DSC_BAR, H026N2_A14323CP_BARPROP, H026N2_A14317CP_BARGIRA,
            H026N2_A14340CP_BARALBM, H026N2_A14339CP_BARALBK, H026N2_A14310CP_BARFECS, H026N2_A14304CP_BARFECF, H026N2_A14309CP_BARFECC, H026N2_A14308CP_BARFECG, H026N2_A14307CP_BARSIT, H026N2_A14338CP_BARPIE, H026N2_A14337CP_BARMTR, H026N2_A14336CP_BARKGM,
            H026N2_A14315CP_BARNOMC, H026N2_A14332CP_BARCOLU, H026N2_A14331CP_BARCOLO, H026N2_A14343CP_TARTDSC, H026N2_A14316CP_BARTIPA, H026N2_A14312CP_BARSERD, H026N2_A14311CP_BARSER, H026N2_A14319CP_BARAGRE, H026N2_A14303CP_BARCODP, H026N2_A14302CP_BARCODR,
            H026N2_A14301CP_BARCOD, H026N2_A14324CP_BARDISN, H026N2_A14327CP_CLINOM, H026N2_A14326CP_CLICOD, H026N2_A14328CP_EMPRCOD
            }
            , new Object[] {
            H026N3_AGRID_nRecordCount
            }
            , new Object[] {
            H026N4_A14297CP_ID, H026N4_A14317CP_BARGIRA, H026N4_A14323CP_BARPROP, H026N4_A14303CP_BARCODP, H026N4_A14302CP_BARCODR, H026N4_A14301CP_BARCOD, H026N4_A14306CP_BARPLF, H026N4_A14316CP_BARTIPA, H026N4_A14305CP_BARNUMC, H026N4_A14315CP_BARNOMC,
            H026N4_A14332CP_BARCOLU, H026N4_A14331CP_BARCOLO, H026N4_A14311CP_BARSER, H026N4_A14304CP_BARFECF, H026N4_A14309CP_BARFECC, H026N4_A14310CP_BARFECS, H026N4_A14308CP_BARFECG, H026N4_A14307CP_BARSIT, H026N4_A14326CP_CLICOD, H026N4_A14328CP_EMPRCOD,
            H026N4_A14324CP_BARDISN, H026N4_A14327CP_CLINOM, H026N4_A14336CP_BARKGM, H026N4_A14337CP_BARMTR, H026N4_A14338CP_BARPIE
            }
         }
      );
      AV172Pgmname = "Produccion.ConsultaProduccion_Tabla_Materializada" ;
      /* GeneXus formulas. */
      AV172Pgmname = "Produccion.ConsultaProduccion_Tabla_Materializada" ;
      Gx_err = (short)(0) ;
      edtavBarfascod_Enabled = 0 ;
      edtavBarfassig_Enabled = 0 ;
      edtavBaralbultimo_Enabled = 0 ;
      edtavBaralbfact_Enabled = 0 ;
      edtavTotvaluecp_barkgm_Enabled = 0 ;
      edtavTotvaluecp_barmtr_Enabled = 0 ;
      edtavTotvaluecp_barpie_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV125BarSitfrom ;
   private byte wcpOAV126BarSitto ;
   private byte wcpOAV101BarCodReofrom ;
   private byte wcpOAV102BarCodReoto ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV125BarSitfrom ;
   private byte AV126BarSitto ;
   private byte AV101BarCodReofrom ;
   private byte AV102BarCodReoto ;
   private byte AV169ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A14302CP_BARCODR ;
   private byte A14307CP_BARSIT ;
   private byte A14320CP_BAREXT ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV127BarTipArtfrom ;
   private short wcpOAV128BarTipArtto ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV127BarTipArtfrom ;
   private short AV128BarTipArtto ;
   private short AV21OrderedBy ;
   private short AV157Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV155GridActionGroup1 ;
   private short A14316CP_BARTIPA ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV129CliCodfrom ;
   private int wcpOAV130CliCodto ;
   private int wcpOAV106BarColNumfrom ;
   private int wcpOAV107BarColNumto ;
   private int wcpOAV121BarNumClifrom ;
   private int wcpOAV122BarNumClito ;
   private int wcpOAV98BarCodfrom ;
   private int wcpOAV103BarCodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_44 ;
   private int AV129CliCodfrom ;
   private int AV130CliCodto ;
   private int AV106BarColNumfrom ;
   private int AV107BarColNumto ;
   private int AV121BarNumClifrom ;
   private int AV122BarNumClito ;
   private int AV98BarCodfrom ;
   private int AV103BarCodto ;
   private int nGXsfl_44_idx=1 ;
   private int A14305CP_BARNUMC ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A14326CP_CLICOD ;
   private int A14301CP_BARCOD ;
   private int A14332CP_BARCOLU ;
   private int A14338CP_BARPIE ;
   private int AV142BarAlbFact ;
   private int A14322CP_DISCOD ;
   private int subGrid_Islastpage ;
   private int edtavBarfascod_Enabled ;
   private int edtavBarfassig_Enabled ;
   private int edtavBaralbultimo_Enabled ;
   private int edtavBaralbfact_Enabled ;
   private int edtavTotvaluecp_barkgm_Enabled ;
   private int edtavTotvaluecp_barmtr_Enabled ;
   private int edtavTotvaluecp_barpie_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtCP_CLICOD_Visible ;
   private int edtCP_CLINOM_Visible ;
   private int edtCP_BARDISN_Visible ;
   private int edtCP_BARCOD_Visible ;
   private int edtCP_BARCODR_Visible ;
   private int edtCP_BARCODP_Visible ;
   private int edtCP_BARAGRE_Visible ;
   private int edtCP_BARSER_Visible ;
   private int edtCP_BARSERD_Visible ;
   private int edtCP_BARTIPA_Visible ;
   private int edtCP_TARTDSC_Visible ;
   private int edtCP_BARCOLO_Visible ;
   private int edtCP_BARCOLU_Visible ;
   private int edtCP_BARNOMC_Visible ;
   private int edtCP_BARKGM_Visible ;
   private int edtCP_BARMTR_Visible ;
   private int edtCP_BARPIE_Visible ;
   private int edtCP_BARSIT_Visible ;
   private int edtCP_BARFECG_Visible ;
   private int edtCP_BARFECC_Visible ;
   private int edtCP_BARFECF_Visible ;
   private int edtCP_BARFECS_Visible ;
   private int edtavBarfascod_Visible ;
   private int edtavBarfassig_Visible ;
   private int edtavBaralbultimo_Visible ;
   private int edtCP_BARALBK_Visible ;
   private int edtCP_BARALBM_Visible ;
   private int edtavBaralbfact_Visible ;
   private int edtCP_BARGIRA_Visible ;
   private int edtCP_BARPROP_Visible ;
   private int edtCP_DSC_BAR_Visible ;
   private int edtCP_DISUSRC_Visible ;
   private int AV24PageToGo ;
   private int AV174GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV152TotCP_BARPIE ;
   private long AV15GridCurrentPage ;
   private long AV16GridPageCount ;
   private long AV141BarAlbUltimo ;
   private long A14297CP_ID ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV148TotCP_BARKGM ;
   private java.math.BigDecimal AV150TotCP_BARMTR ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal A14340CP_BARALBM ;
   private String wcpOAV131Emprcod ;
   private String wcpOAV108BarDisNumfrom ;
   private String wcpOAV109BarDisNumto ;
   private String wcpOAV123BarSerfrom ;
   private String wcpOAV124BarSerto ;
   private String wcpOAV104BarColNomfrom ;
   private String wcpOAV105BarColNomto ;
   private String wcpOAV119BarNomClifrom ;
   private String wcpOAV120BarNomClito ;
   private String wcpOAV136muestras ;
   private String wcpOAV99BarCodParfrom ;
   private String wcpOAV100BarCodParto ;
   private String wcpOAV132Cod_idtx ;
   private String wcpOAV118BarGirar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV131Emprcod ;
   private String AV108BarDisNumfrom ;
   private String AV109BarDisNumto ;
   private String AV123BarSerfrom ;
   private String AV124BarSerto ;
   private String AV104BarColNomfrom ;
   private String AV105BarColNomto ;
   private String AV119BarNomClifrom ;
   private String AV120BarNomClito ;
   private String AV136muestras ;
   private String AV99BarCodParfrom ;
   private String AV100BarCodParto ;
   private String AV132Cod_idtx ;
   private String AV118BarGirar ;
   private String sGXsfl_44_idx="0001" ;
   private String AV172Pgmname ;
   private String AV133TFBarPlf ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
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
   private String divUnnamedtable1_Internalname ;
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
   private String A14328CP_EMPRCOD ;
   private String edtCP_EMPRCOD_Internalname ;
   private String edtCP_CLICOD_Internalname ;
   private String edtCP_CLINOM_Internalname ;
   private String A14324CP_BARDISN ;
   private String edtCP_BARDISN_Internalname ;
   private String edtCP_BARCOD_Internalname ;
   private String edtCP_BARCODR_Internalname ;
   private String A14303CP_BARCODP ;
   private String edtCP_BARCODP_Internalname ;
   private String A14319CP_BARAGRE ;
   private String edtCP_BARAGRE_Internalname ;
   private String A14311CP_BARSER ;
   private String edtCP_BARSER_Internalname ;
   private String edtCP_BARSERD_Internalname ;
   private String edtCP_BARTIPA_Internalname ;
   private String edtCP_TARTDSC_Internalname ;
   private String A14331CP_BARCOLO ;
   private String edtCP_BARCOLO_Internalname ;
   private String edtCP_BARCOLU_Internalname ;
   private String edtCP_BARNOMC_Internalname ;
   private String edtCP_BARKGM_Internalname ;
   private String edtCP_BARMTR_Internalname ;
   private String edtCP_BARPIE_Internalname ;
   private String edtCP_BARSIT_Internalname ;
   private String edtCP_BARFECG_Internalname ;
   private String edtCP_BARFECC_Internalname ;
   private String edtCP_BARFECF_Internalname ;
   private String edtCP_BARFECS_Internalname ;
   private String AV143BarFasCod ;
   private String edtavBarfascod_Internalname ;
   private String AV140BarFasSig ;
   private String edtavBarfassig_Internalname ;
   private String edtavBaralbultimo_Internalname ;
   private String edtCP_BARALBK_Internalname ;
   private String edtCP_BARALBM_Internalname ;
   private String edtavBaralbfact_Internalname ;
   private String edtCP_BARGIRA_Internalname ;
   private String A14323CP_BARPROP ;
   private String edtCP_BARPROP_Internalname ;
   private String edtCP_DSC_BAR_Internalname ;
   private String A14341CP_DISUSRC ;
   private String edtCP_DISUSRC_Internalname ;
   private String edtCP_ID_Internalname ;
   private String A14306CP_BARPLF ;
   private String edtCP_BARPLF_Internalname ;
   private String edtCP_BAREXT_Internalname ;
   private String A14321CP_DISDES ;
   private String edtCP_DISDES_Internalname ;
   private String edtCP_DISCOD_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluecp_barkgm_Internalname ;
   private String edtavTotvaluecp_barmtr_Internalname ;
   private String edtavTotvaluecp_barpie_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV134Station ;
   private String GXv_char2[] ;
   private String AV135EmprNom ;
   private String AV137UsurCod ;
   private String edtCP_BARCOD_Columnheaderclass ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
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
   private String edtavTotvaluecp_barkgm_Jsonclick ;
   private String edtavTotvaluecp_barmtr_Jsonclick ;
   private String edtavTotvaluecp_barpie_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV131Emprcod ;
   private String sCtrlAV129CliCodfrom ;
   private String sCtrlAV130CliCodto ;
   private String sCtrlAV108BarDisNumfrom ;
   private String sCtrlAV109BarDisNumto ;
   private String sCtrlAV114BarFecGenfrom ;
   private String sCtrlAV115BarFecGento ;
   private String sCtrlAV125BarSitfrom ;
   private String sCtrlAV126BarSitto ;
   private String sCtrlAV110BarFecClifrom ;
   private String sCtrlAV111BarFecClito ;
   private String sCtrlAV112BarFecFprfrom ;
   private String sCtrlAV113BarFecFprto ;
   private String sCtrlAV116BarFecSalfrom ;
   private String sCtrlAV117BarFecSalto ;
   private String sCtrlAV123BarSerfrom ;
   private String sCtrlAV124BarSerto ;
   private String sCtrlAV127BarTipArtfrom ;
   private String sCtrlAV128BarTipArtto ;
   private String sCtrlAV104BarColNomfrom ;
   private String sCtrlAV105BarColNomto ;
   private String sCtrlAV106BarColNumfrom ;
   private String sCtrlAV107BarColNumto ;
   private String sCtrlAV119BarNomClifrom ;
   private String sCtrlAV120BarNomClito ;
   private String sCtrlAV121BarNumClifrom ;
   private String sCtrlAV122BarNumClito ;
   private String sCtrlAV136muestras ;
   private String sCtrlAV98BarCodfrom ;
   private String sCtrlAV103BarCodto ;
   private String sCtrlAV101BarCodReofrom ;
   private String sCtrlAV102BarCodReoto ;
   private String sCtrlAV99BarCodParfrom ;
   private String sCtrlAV100BarCodParto ;
   private String sCtrlAV132Cod_idtx ;
   private String sCtrlAV118BarGirar ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCP_EMPRCOD_Jsonclick ;
   private String edtCP_CLICOD_Jsonclick ;
   private String edtCP_CLINOM_Jsonclick ;
   private String edtCP_BARDISN_Jsonclick ;
   private String edtCP_BARCOD_Jsonclick ;
   private String edtCP_BARCODR_Jsonclick ;
   private String edtCP_BARCODP_Jsonclick ;
   private String edtCP_BARAGRE_Jsonclick ;
   private String edtCP_BARSER_Jsonclick ;
   private String edtCP_BARSERD_Jsonclick ;
   private String edtCP_BARTIPA_Jsonclick ;
   private String edtCP_TARTDSC_Jsonclick ;
   private String edtCP_BARCOLO_Jsonclick ;
   private String edtCP_BARCOLU_Jsonclick ;
   private String edtCP_BARNOMC_Jsonclick ;
   private String edtCP_BARKGM_Jsonclick ;
   private String edtCP_BARMTR_Jsonclick ;
   private String edtCP_BARPIE_Jsonclick ;
   private String edtCP_BARSIT_Jsonclick ;
   private String edtCP_BARFECG_Jsonclick ;
   private String edtCP_BARFECC_Jsonclick ;
   private String edtCP_BARFECF_Jsonclick ;
   private String edtCP_BARFECS_Jsonclick ;
   private String edtavBarfascod_Jsonclick ;
   private String edtavBarfassig_Jsonclick ;
   private String edtavBaralbultimo_Jsonclick ;
   private String edtCP_BARALBK_Jsonclick ;
   private String edtCP_BARALBM_Jsonclick ;
   private String edtavBaralbfact_Jsonclick ;
   private String edtCP_BARGIRA_Jsonclick ;
   private String edtCP_BARPROP_Jsonclick ;
   private String edtCP_DSC_BAR_Jsonclick ;
   private String edtCP_DISUSRC_Jsonclick ;
   private String edtCP_ID_Jsonclick ;
   private String edtCP_BARPLF_Jsonclick ;
   private String edtCP_BAREXT_Jsonclick ;
   private String edtCP_DISDES_Jsonclick ;
   private String edtCP_DISCOD_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV114BarFecGenfrom ;
   private java.util.Date wcpOAV115BarFecGento ;
   private java.util.Date wcpOAV110BarFecClifrom ;
   private java.util.Date wcpOAV111BarFecClito ;
   private java.util.Date wcpOAV112BarFecFprfrom ;
   private java.util.Date wcpOAV113BarFecFprto ;
   private java.util.Date wcpOAV116BarFecSalfrom ;
   private java.util.Date wcpOAV117BarFecSalto ;
   private java.util.Date AV114BarFecGenfrom ;
   private java.util.Date AV115BarFecGento ;
   private java.util.Date AV110BarFecClifrom ;
   private java.util.Date AV111BarFecClito ;
   private java.util.Date AV112BarFecFprfrom ;
   private java.util.Date AV113BarFecFprto ;
   private java.util.Date AV116BarFecSalfrom ;
   private java.util.Date AV117BarFecSalto ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14304CP_BARFECF ;
   private java.util.Date A14310CP_BARFECS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV23OrderedDsc ;
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
   private boolean bGXsfl_44_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV7ColumnsSelectorXML ;
   private String AV168ManageFiltersXml ;
   private String AV96UserCustomValue ;
   private String AV166FilterFullText ;
   private String A14327CP_CLINOM ;
   private String A14312CP_BARSERD ;
   private String A14343CP_TARTDSC ;
   private String A14315CP_BARNOMC ;
   private String A14317CP_BARGIRA ;
   private String A14334CP_DSC_BAR ;
   private String lV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ;
   private String AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ;
   private String AV149TotValueCP_BARKGM ;
   private String AV151TotValueCP_BARMTR ;
   private String AV153TotValueCP_BARPIE ;
   private String AV14ExcelFilename ;
   private String AV13ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV19HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
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
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private int[] H026N2_A14305CP_BARNUMC ;
   private int[] H026N2_A14322CP_DISCOD ;
   private String[] H026N2_A14321CP_DISDES ;
   private byte[] H026N2_A14320CP_BAREXT ;
   private String[] H026N2_A14306CP_BARPLF ;
   private long[] H026N2_A14297CP_ID ;
   private String[] H026N2_A14341CP_DISUSRC ;
   private String[] H026N2_A14334CP_DSC_BAR ;
   private String[] H026N2_A14323CP_BARPROP ;
   private String[] H026N2_A14317CP_BARGIRA ;
   private java.math.BigDecimal[] H026N2_A14340CP_BARALBM ;
   private java.math.BigDecimal[] H026N2_A14339CP_BARALBK ;
   private java.util.Date[] H026N2_A14310CP_BARFECS ;
   private java.util.Date[] H026N2_A14304CP_BARFECF ;
   private java.util.Date[] H026N2_A14309CP_BARFECC ;
   private java.util.Date[] H026N2_A14308CP_BARFECG ;
   private byte[] H026N2_A14307CP_BARSIT ;
   private int[] H026N2_A14338CP_BARPIE ;
   private java.math.BigDecimal[] H026N2_A14337CP_BARMTR ;
   private java.math.BigDecimal[] H026N2_A14336CP_BARKGM ;
   private String[] H026N2_A14315CP_BARNOMC ;
   private int[] H026N2_A14332CP_BARCOLU ;
   private String[] H026N2_A14331CP_BARCOLO ;
   private String[] H026N2_A14343CP_TARTDSC ;
   private short[] H026N2_A14316CP_BARTIPA ;
   private String[] H026N2_A14312CP_BARSERD ;
   private String[] H026N2_A14311CP_BARSER ;
   private String[] H026N2_A14319CP_BARAGRE ;
   private String[] H026N2_A14303CP_BARCODP ;
   private byte[] H026N2_A14302CP_BARCODR ;
   private int[] H026N2_A14301CP_BARCOD ;
   private String[] H026N2_A14324CP_BARDISN ;
   private String[] H026N2_A14327CP_CLINOM ;
   private int[] H026N2_A14326CP_CLICOD ;
   private String[] H026N2_A14328CP_EMPRCOD ;
   private long[] H026N3_AGRID_nRecordCount ;
   private long[] H026N4_A14297CP_ID ;
   private String[] H026N4_A14317CP_BARGIRA ;
   private String[] H026N4_A14323CP_BARPROP ;
   private String[] H026N4_A14303CP_BARCODP ;
   private byte[] H026N4_A14302CP_BARCODR ;
   private int[] H026N4_A14301CP_BARCOD ;
   private String[] H026N4_A14306CP_BARPLF ;
   private short[] H026N4_A14316CP_BARTIPA ;
   private int[] H026N4_A14305CP_BARNUMC ;
   private String[] H026N4_A14315CP_BARNOMC ;
   private int[] H026N4_A14332CP_BARCOLU ;
   private String[] H026N4_A14331CP_BARCOLO ;
   private String[] H026N4_A14311CP_BARSER ;
   private java.util.Date[] H026N4_A14304CP_BARFECF ;
   private java.util.Date[] H026N4_A14309CP_BARFECC ;
   private java.util.Date[] H026N4_A14310CP_BARFECS ;
   private java.util.Date[] H026N4_A14308CP_BARFECG ;
   private byte[] H026N4_A14307CP_BARSIT ;
   private int[] H026N4_A14326CP_CLICOD ;
   private String[] H026N4_A14328CP_EMPRCOD ;
   private String[] H026N4_A14324CP_BARDISN ;
   private String[] H026N4_A14327CP_CLINOM ;
   private java.math.BigDecimal[] H026N4_A14336CP_BARKGM ;
   private java.math.BigDecimal[] H026N4_A14337CP_BARMTR ;
   private int[] H026N4_A14338CP_BARPIE ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV167ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV12DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV17GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV18GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV94TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV97WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class consultaproduccion_tabla_materializada__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H026N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ,
                                          String AV108BarDisNumfrom ,
                                          String AV109BarDisNumto ,
                                          int AV129CliCodfrom ,
                                          int AV130CliCodto ,
                                          byte AV125BarSitfrom ,
                                          byte AV126BarSitto ,
                                          java.util.Date AV114BarFecGenfrom ,
                                          java.util.Date AV115BarFecGento ,
                                          java.util.Date AV116BarFecSalfrom ,
                                          java.util.Date AV117BarFecSalto ,
                                          java.util.Date AV110BarFecClifrom ,
                                          java.util.Date AV111BarFecClito ,
                                          java.util.Date AV112BarFecFprfrom ,
                                          java.util.Date AV113BarFecFprto ,
                                          String AV123BarSerfrom ,
                                          String AV124BarSerto ,
                                          String AV104BarColNomfrom ,
                                          String AV105BarColNomto ,
                                          int AV106BarColNumfrom ,
                                          int AV107BarColNumto ,
                                          String AV119BarNomClifrom ,
                                          String AV120BarNomClito ,
                                          int AV121BarNumClifrom ,
                                          int AV122BarNumClito ,
                                          short AV127BarTipArtfrom ,
                                          short AV128BarTipArtto ,
                                          String AV133TFBarPlf ,
                                          int AV98BarCodfrom ,
                                          int AV103BarCodto ,
                                          byte AV101BarCodReofrom ,
                                          byte AV102BarCodReoto ,
                                          String AV99BarCodParfrom ,
                                          String AV100BarCodParto ,
                                          String AV132Cod_idtx ,
                                          String AV118BarGirar ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          String A14306CP_BARPLF ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          short AV21OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String AV131Emprcod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[43];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " CP_BARNUMC, CP_DISCOD, CP_DISDES, CP_BAREXT, CP_BARPLF, CP_ID, CP_DISUSRC, CP_DSC_BAR, CP_BARPROP, CP_BARGIRA, CP_BARALBM, CP_BARALBK, CP_BARFECS, CP_BARFECF, CP_BARFECC," ;
      sSelectString += " CP_BARFECG, CP_BARSIT, CP_BARPIE, CP_BARMTR, CP_BARKGM, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_TARTDSC, CP_BARTIPA, CP_BARSERD, CP_BARSER, CP_BARAGRE, CP_BARCODP," ;
      sSelectString += " CP_BARCODR, CP_BARCOD, CP_BARDISN, CP_CLINOM, CP_CLICOD, CP_EMPRCOD" ;
      sFromString = " FROM TXPCONPRO" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (0==AV129CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! (0==AV130CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (0==AV125BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV126BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV110BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV112BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (0==AV106BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (0==AV107BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! (0==AV121BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( ! (0==AV122BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (0==AV127BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( ! (0==AV128BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( ! (0==AV98BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (0==AV103BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      if ( ! (0==AV101BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int15[32] = (byte)(1) ;
      }
      if ( ! (0==AV102BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int15[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int15[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int15[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int15[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int15[37] = (byte)(1) ;
      }
      if ( AV21OrderedBy == 1 )
      {
         sOrderString += " ORDER BY CP_EMPRCOD, CP_CLICOD, CP_BARDISN, CP_BARFECG" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_CLICOD" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_CLICOD DESC" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_CLINOM" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_CLINOM DESC" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARDISN" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARDISN DESC" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARCOD" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARCOD DESC" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARCODR" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARCODR DESC" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARCODP" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARCODP DESC" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARAGRE" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARAGRE DESC" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARSER" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARSER DESC" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARSERD" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARSERD DESC" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARTIPA" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARTIPA DESC" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_TARTDSC" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_TARTDSC DESC" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARCOLO" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARCOLO DESC" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARCOLU" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARCOLU DESC" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARNOMC" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARNOMC DESC" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARKGM" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARKGM DESC" ;
      }
      else if ( ( AV21OrderedBy == 17 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARMTR" ;
      }
      else if ( ( AV21OrderedBy == 17 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARMTR DESC" ;
      }
      else if ( ( AV21OrderedBy == 18 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARPIE" ;
      }
      else if ( ( AV21OrderedBy == 18 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARPIE DESC" ;
      }
      else if ( ( AV21OrderedBy == 19 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARSIT" ;
      }
      else if ( ( AV21OrderedBy == 19 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARSIT DESC" ;
      }
      else if ( ( AV21OrderedBy == 20 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARFECG" ;
      }
      else if ( ( AV21OrderedBy == 20 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARFECG DESC" ;
      }
      else if ( ( AV21OrderedBy == 21 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARFECC" ;
      }
      else if ( ( AV21OrderedBy == 21 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARFECC DESC" ;
      }
      else if ( ( AV21OrderedBy == 22 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARFECF" ;
      }
      else if ( ( AV21OrderedBy == 22 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARFECF DESC" ;
      }
      else if ( ( AV21OrderedBy == 23 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARFECS" ;
      }
      else if ( ( AV21OrderedBy == 23 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARFECS DESC" ;
      }
      else if ( ( AV21OrderedBy == 24 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARALBK" ;
      }
      else if ( ( AV21OrderedBy == 24 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARALBK DESC" ;
      }
      else if ( ( AV21OrderedBy == 25 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARALBM" ;
      }
      else if ( ( AV21OrderedBy == 25 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARALBM DESC" ;
      }
      else if ( ( AV21OrderedBy == 26 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARGIRA" ;
      }
      else if ( ( AV21OrderedBy == 26 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARGIRA DESC" ;
      }
      else if ( ( AV21OrderedBy == 27 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARPROP" ;
      }
      else if ( ( AV21OrderedBy == 27 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARPROP DESC" ;
      }
      else if ( ( AV21OrderedBy == 28 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_DSC_BAR" ;
      }
      else if ( ( AV21OrderedBy == 28 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_DSC_BAR DESC" ;
      }
      else if ( ( AV21OrderedBy == 29 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY CP_DISUSRC" ;
      }
      else if ( ( AV21OrderedBy == 29 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_DISUSRC DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY CP_ID" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H026N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ,
                                          String AV108BarDisNumfrom ,
                                          String AV109BarDisNumto ,
                                          int AV129CliCodfrom ,
                                          int AV130CliCodto ,
                                          byte AV125BarSitfrom ,
                                          byte AV126BarSitto ,
                                          java.util.Date AV114BarFecGenfrom ,
                                          java.util.Date AV115BarFecGento ,
                                          java.util.Date AV116BarFecSalfrom ,
                                          java.util.Date AV117BarFecSalto ,
                                          java.util.Date AV110BarFecClifrom ,
                                          java.util.Date AV111BarFecClito ,
                                          java.util.Date AV112BarFecFprfrom ,
                                          java.util.Date AV113BarFecFprto ,
                                          String AV123BarSerfrom ,
                                          String AV124BarSerto ,
                                          String AV104BarColNomfrom ,
                                          String AV105BarColNomto ,
                                          int AV106BarColNumfrom ,
                                          int AV107BarColNumto ,
                                          String AV119BarNomClifrom ,
                                          String AV120BarNomClito ,
                                          int AV121BarNumClifrom ,
                                          int AV122BarNumClito ,
                                          short AV127BarTipArtfrom ,
                                          short AV128BarTipArtto ,
                                          String AV133TFBarPlf ,
                                          int AV98BarCodfrom ,
                                          int AV103BarCodto ,
                                          byte AV101BarCodReofrom ,
                                          byte AV102BarCodReoto ,
                                          String AV99BarCodParfrom ,
                                          String AV100BarCodParto ,
                                          String AV132Cod_idtx ,
                                          String AV118BarGirar ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          String A14306CP_BARPLF ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          short AV21OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String AV131Emprcod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[38];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (0==AV129CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (0==AV130CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (0==AV125BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV126BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV110BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV112BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV106BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV107BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV121BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV122BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (0==AV127BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV128BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV98BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV103BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV101BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV102BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV21OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 17 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 17 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 18 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 18 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 19 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 19 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 20 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 20 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 21 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 21 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 22 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 22 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 23 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 23 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 24 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 24 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 25 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 25 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 26 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 26 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 27 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 27 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 28 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 28 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 29 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV21OrderedBy == 29 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H026N4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ,
                                          String AV108BarDisNumfrom ,
                                          String AV109BarDisNumto ,
                                          int AV129CliCodfrom ,
                                          int AV130CliCodto ,
                                          byte AV125BarSitfrom ,
                                          byte AV126BarSitto ,
                                          java.util.Date AV114BarFecGenfrom ,
                                          java.util.Date AV115BarFecGento ,
                                          java.util.Date AV116BarFecSalfrom ,
                                          java.util.Date AV117BarFecSalto ,
                                          java.util.Date AV110BarFecClifrom ,
                                          java.util.Date AV111BarFecClito ,
                                          java.util.Date AV112BarFecFprfrom ,
                                          java.util.Date AV113BarFecFprto ,
                                          String AV123BarSerfrom ,
                                          String AV124BarSerto ,
                                          String AV104BarColNomfrom ,
                                          String AV105BarColNomto ,
                                          int AV106BarColNumfrom ,
                                          int AV107BarColNumto ,
                                          String AV119BarNomClifrom ,
                                          String AV120BarNomClito ,
                                          int AV121BarNumClifrom ,
                                          int AV122BarNumClito ,
                                          short AV127BarTipArtfrom ,
                                          short AV128BarTipArtto ,
                                          String AV133TFBarPlf ,
                                          int AV98BarCodfrom ,
                                          int AV103BarCodto ,
                                          byte AV101BarCodReofrom ,
                                          byte AV102BarCodReoto ,
                                          String AV99BarCodParfrom ,
                                          String AV100BarCodParto ,
                                          String AV132Cod_idtx ,
                                          String AV118BarGirar ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          String A14306CP_BARPLF ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          String AV131Emprcod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[38];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT CP_ID, CP_BARGIRA, CP_BARPROP, CP_BARCODP, CP_BARCODR, CP_BARCOD, CP_BARPLF, CP_BARTIPA, CP_BARNUMC, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_BARSER, CP_BARFECF," ;
      scmdbuf += " CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSIT, CP_CLICOD, CP_EMPRCOD, CP_BARDISN, CP_CLINOM, CP_BARKGM, CP_BARMTR, CP_BARPIE FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV173Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (0==AV129CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (0==AV130CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (0==AV125BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV126BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV110BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV112BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV106BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV107BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV121BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (0==AV122BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (0==AV127BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (0==AV128BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV98BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV103BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (0==AV101BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (0==AV102BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CP_EMPRCOD" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H026N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).shortValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Boolean) dynConstraints[57]).booleanValue() , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 1 :
                  return conditional_H026N3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).shortValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Boolean) dynConstraints[57]).booleanValue() , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 2 :
                  return conditional_H026N4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).shortValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H026N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026N4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 13);
               ((String[]) buf[23])[0] = rslt.getVarchar(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((String[]) buf[25])[0] = rslt.getVarchar(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 16);
               ((String[]) buf[27])[0] = rslt.getString(28, 1);
               ((String[]) buf[28])[0] = rslt.getString(29, 1);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((int[]) buf[30])[0] = rslt.getInt(31);
               ((String[]) buf[31])[0] = rslt.getString(32, 8);
               ((String[]) buf[32])[0] = rslt.getVarchar(33);
               ((int[]) buf[33])[0] = rslt.getInt(34);
               ((String[]) buf[34])[0] = rslt.getString(35, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((String[]) buf[20])[0] = rslt.getString(21, 8);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,2);
               ((int[]) buf[24])[0] = rslt.getInt(25);
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
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               return;
      }
   }

}

