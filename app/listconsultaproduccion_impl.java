package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listconsultaproduccion_impl extends GXWebComponent
{
   public listconsultaproduccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listconsultaproduccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listconsultaproduccion_impl.class ));
   }

   public listconsultaproduccion_impl( int remoteHandle ,
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
      cmbCP_BARESTR = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "AuxEmprcod") ;
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
               AV9AuxEmprcod = httpContext.GetPar( "AuxEmprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AuxEmprcod", AV9AuxEmprcod);
               AV45CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCodfrom), 6, 0));
               AV46CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CliCodto), 6, 0));
               AV22BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarDisNumfrom", AV22BarDisNumfrom);
               AV23BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarDisNumto", AV23BarDisNumto);
               AV30BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarFecGenfrom", localUtil.format(AV30BarFecGenfrom, "99/99/99"));
               AV31BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarFecGento", localUtil.format(AV31BarFecGento, "99/99/99"));
               AV41BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarSitfrom), 2, 0));
               AV42BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42BarSitto), 2, 0));
               AV26BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarFecClifrom", localUtil.format(AV26BarFecClifrom, "99/99/99"));
               AV27BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarFecClito", localUtil.format(AV27BarFecClito, "99/99/99"));
               AV28BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarFecFprfrom", localUtil.format(AV28BarFecFprfrom, "99/99/99"));
               AV29BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarFecFprto", localUtil.format(AV29BarFecFprto, "99/99/99"));
               AV32BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarFecSalfrom", localUtil.format(AV32BarFecSalfrom, "99/99/99"));
               AV33BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarFecSalto", localUtil.format(AV33BarFecSalto, "99/99/99"));
               AV39BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39BarSerfrom", AV39BarSerfrom);
               AV40BarSerto = httpContext.GetPar( "BarSerto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarSerto", AV40BarSerto);
               AV43BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarTipArtfrom), 4, 0));
               AV44BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarTipArtto), 4, 0));
               AV18BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarColNomfrom", AV18BarColNomfrom);
               AV19BarColNomto = httpContext.GetPar( "BarColNomto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarColNomto", AV19BarColNomto);
               AV20BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarColNumfrom), 6, 0));
               AV21BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarColNumto), 6, 0));
               AV35BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarNomClifrom", AV35BarNomClifrom);
               AV36BarNomClito = httpContext.GetPar( "BarNomClito") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarNomClito", AV36BarNomClito);
               AV37BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarNumClifrom), 6, 0));
               AV38BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38BarNumClito), 6, 0));
               AV43BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarTipArtfrom), 4, 0));
               AV44BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarTipArtto), 4, 0));
               AV77muestras = httpContext.GetPar( "muestras") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77muestras", AV77muestras);
               AV12BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarCodfrom), 8, 0));
               AV17BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarCodto), 8, 0));
               AV15BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReofrom", GXutil.str( AV15BarCodReofrom, 1, 0));
               AV16BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarCodReoto", GXutil.str( AV16BarCodReoto, 1, 0));
               AV13BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarCodParfrom", AV13BarCodParfrom);
               AV14BarCodParto = httpContext.GetPar( "BarCodParto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarCodParto", AV14BarCodParto);
               AV5Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Cod_idtx", AV5Cod_idtx);
               AV34BarGirar = httpContext.GetPar( "BarGirar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarGirar", AV34BarGirar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV9AuxEmprcod,Integer.valueOf(AV45CliCodfrom),Integer.valueOf(AV46CliCodto),AV22BarDisNumfrom,AV23BarDisNumto,AV30BarFecGenfrom,AV31BarFecGento,Byte.valueOf(AV41BarSitfrom),Byte.valueOf(AV42BarSitto),AV26BarFecClifrom,AV27BarFecClito,AV28BarFecFprfrom,AV29BarFecFprto,AV32BarFecSalfrom,AV33BarFecSalto,AV39BarSerfrom,AV40BarSerto,Short.valueOf(AV43BarTipArtfrom),Short.valueOf(AV44BarTipArtto),AV18BarColNomfrom,AV19BarColNomto,Integer.valueOf(AV20BarColNumfrom),Integer.valueOf(AV21BarColNumto),AV35BarNomClifrom,AV36BarNomClito,Integer.valueOf(AV37BarNumClifrom),Integer.valueOf(AV38BarNumClito),Short.valueOf(AV43BarTipArtfrom),Short.valueOf(AV44BarTipArtto),AV77muestras,Integer.valueOf(AV12BarCodfrom),Integer.valueOf(AV17BarCodto),Byte.valueOf(AV15BarCodReofrom),Byte.valueOf(AV16BarCodReoto),AV13BarCodParfrom,AV14BarCodParto,AV5Cod_idtx,AV34BarGirar});
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
               gxfirstwebparm = httpContext.GetFirstPar( "AuxEmprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "AuxEmprcod") ;
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV63FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV59Emprcod = httpContext.GetPar( "Emprcod") ;
      AV45CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
      AV46CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      AV22BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
      AV23BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
      AV30BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
      AV31BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
      AV41BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
      AV42BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
      AV26BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
      AV27BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
      AV28BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
      AV29BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
      AV32BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
      AV33BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
      AV39BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
      AV40BarSerto = httpContext.GetPar( "BarSerto") ;
      AV43BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
      AV44BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
      AV18BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
      AV19BarColNomto = httpContext.GetPar( "BarColNomto") ;
      AV20BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
      AV21BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
      AV35BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
      AV36BarNomClito = httpContext.GetPar( "BarNomClito") ;
      AV37BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
      AV38BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
      AV77muestras = httpContext.GetPar( "muestras") ;
      AV12BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
      AV17BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
      AV15BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
      AV16BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
      AV13BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
      AV14BarCodParto = httpContext.GetPar( "BarCodParto") ;
      AV5Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
      AV34BarGirar = httpContext.GetPar( "BarGirar") ;
      AV74ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV47ColumnsSelector);
      AV174Pgmname = httpContext.GetPar( "Pgmname") ;
      AV154TotCP_BARKGM = CommonUtil.decimalVal( httpContext.GetPar( "TotCP_BARKGM"), ".") ;
      AV155TotCP_BARMTR = CommonUtil.decimalVal( httpContext.GetPar( "TotCP_BARMTR"), ".") ;
      AV156TotCP_BARPIE = GXutil.lval( httpContext.GetPar( "TotCP_BARPIE")) ;
      AV76Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV59Emprcod, AV45CliCodfrom, AV46CliCodto, AV22BarDisNumfrom, AV23BarDisNumto, AV30BarFecGenfrom, AV31BarFecGento, AV41BarSitfrom, AV42BarSitto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV32BarFecSalfrom, AV33BarFecSalto, AV39BarSerfrom, AV40BarSerto, AV43BarTipArtfrom, AV44BarTipArtto, AV18BarColNomfrom, AV19BarColNomto, AV20BarColNumfrom, AV21BarColNumto, AV35BarNomClifrom, AV36BarNomClito, AV37BarNumClifrom, AV38BarNumClito, AV77muestras, AV12BarCodfrom, AV17BarCodto, AV15BarCodReofrom, AV16BarCodReoto, AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV74ManageFiltersExecutionStep, AV47ColumnsSelector, AV174Pgmname, AV154TotCP_BARKGM, AV155TotCP_BARMTR, AV156TotCP_BARPIE, AV76Moda21, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa27M2( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.listconsultaproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9AuxEmprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV45CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV22BarDisNumfrom)),GXutil.URLEncode(GXutil.rtrim(AV23BarDisNumto)),GXutil.URLEncode(GXutil.formatDateParm(AV30BarFecGenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV31BarFecGento)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42BarSitto,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV26BarFecClifrom)),GXutil.URLEncode(GXutil.formatDateParm(AV27BarFecClito)),GXutil.URLEncode(GXutil.formatDateParm(AV28BarFecFprfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV29BarFecFprto)),GXutil.URLEncode(GXutil.formatDateParm(AV32BarFecSalfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV33BarFecSalto)),GXutil.URLEncode(GXutil.rtrim(AV39BarSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV40BarSerto)),GXutil.URLEncode(GXutil.ltrimstr(AV43BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV18BarColNomfrom)),GXutil.URLEncode(GXutil.rtrim(AV19BarColNomto)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarColNumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarColNumto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV35BarNomClifrom)),GXutil.URLEncode(GXutil.rtrim(AV36BarNomClito)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarNumClifrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarNumClito,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV77muestras)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarCodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodReofrom,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarCodReoto,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarCodParfrom)),GXutil.URLEncode(GXutil.rtrim(AV14BarCodParto)),GXutil.URLEncode(GXutil.rtrim(AV5Cod_idtx)),GXutil.URLEncode(GXutil.rtrim(AV34BarGirar))}, new String[] {"AuxEmprcod","CliCodfrom","CliCodto","BarDisNumfrom","BarDisNumto","BarFecGenfrom","BarFecGento","BarSitfrom","BarSitto","BarFecClifrom","BarFecClito","BarFecFprfrom","BarFecFprto","BarFecSalfrom","BarFecSalto","BarSerfrom","BarSerto","BarTipArtfrom","BarTipArtto","BarColNomfrom","BarColNomto","BarColNumfrom","BarColNumto","BarNomClifrom","BarNomClito","BarNumClifrom","BarNumClito","BarTipArtfrom","BarTipArtto","muestras","BarCodfrom","BarCodto","BarCodReofrom","BarCodReoto","BarCodParfrom","BarCodParto","Cod_idtx","BarGirar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV154TotCP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV155TotCP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListConsultaProduccion");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV174Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("listconsultaproduccion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV63FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV73ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV73ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV67GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV68GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV47ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV47ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9AuxEmprcod", GXutil.rtrim( wcpOAV9AuxEmprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45CliCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV45CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46CliCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV46CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22BarDisNumfrom", GXutil.rtrim( wcpOAV22BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23BarDisNumto", GXutil.rtrim( wcpOAV23BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30BarFecGenfrom", localUtil.dtoc( wcpOAV30BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31BarFecGento", localUtil.dtoc( wcpOAV31BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41BarSitfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV41BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42BarSitto", GXutil.ltrim( localUtil.ntoc( wcpOAV42BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26BarFecClifrom", localUtil.dtoc( wcpOAV26BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27BarFecClito", localUtil.dtoc( wcpOAV27BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28BarFecFprfrom", localUtil.dtoc( wcpOAV28BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29BarFecFprto", localUtil.dtoc( wcpOAV29BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32BarFecSalfrom", localUtil.dtoc( wcpOAV32BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33BarFecSalto", localUtil.dtoc( wcpOAV33BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39BarSerfrom", GXutil.rtrim( wcpOAV39BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40BarSerto", GXutil.rtrim( wcpOAV40BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43BarTipArtfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV43BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44BarTipArtto", GXutil.ltrim( localUtil.ntoc( wcpOAV44BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18BarColNomfrom", GXutil.rtrim( wcpOAV18BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19BarColNomto", GXutil.rtrim( wcpOAV19BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20BarColNumfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV20BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21BarColNumto", GXutil.ltrim( localUtil.ntoc( wcpOAV21BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35BarNomClifrom", GXutil.rtrim( wcpOAV35BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36BarNomClito", GXutil.rtrim( wcpOAV36BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37BarNumClifrom", GXutil.ltrim( localUtil.ntoc( wcpOAV37BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38BarNumClito", GXutil.ltrim( localUtil.ntoc( wcpOAV38BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV77muestras", GXutil.rtrim( wcpOAV77muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12BarCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV12BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17BarCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV17BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15BarCodReofrom", GXutil.ltrim( localUtil.ntoc( wcpOAV15BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16BarCodReoto", GXutil.ltrim( localUtil.ntoc( wcpOAV16BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13BarCodParfrom", GXutil.rtrim( wcpOAV13BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14BarCodParto", GXutil.rtrim( wcpOAV14BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Cod_idtx", GXutil.rtrim( wcpOAV5Cod_idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34BarGirar", GXutil.rtrim( wcpOAV34BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV74ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV59Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMFROM", GXutil.rtrim( AV22BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMTO", GXutil.rtrim( AV23BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV45CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV46CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV41BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV42BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENFROM", localUtil.dtoc( AV30BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENTO", localUtil.dtoc( AV31BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALFROM", localUtil.dtoc( AV32BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALTO", localUtil.dtoc( AV33BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLIFROM", localUtil.dtoc( AV26BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLITO", localUtil.dtoc( AV27BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRFROM", localUtil.dtoc( AV28BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRTO", localUtil.dtoc( AV29BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERFROM", GXutil.rtrim( AV39BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERTO", GXutil.rtrim( AV40BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMFROM", GXutil.rtrim( AV18BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMTO", GXutil.rtrim( AV19BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMFROM", GXutil.ltrim( localUtil.ntoc( AV20BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV21BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLIFROM", GXutil.rtrim( AV35BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLITO", GXutil.rtrim( AV36BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CP_BARNUMC", GXutil.ltrim( localUtil.ntoc( A14305CP_BARNUMC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLIFROM", GXutil.ltrim( localUtil.ntoc( AV37BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLITO", GXutil.ltrim( localUtil.ntoc( AV38BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTFROM", GXutil.ltrim( localUtil.ntoc( AV43BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTTO", GXutil.ltrim( localUtil.ntoc( AV44BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODFROM", GXutil.ltrim( localUtil.ntoc( AV12BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODTO", GXutil.ltrim( localUtil.ntoc( AV17BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOFROM", GXutil.ltrim( localUtil.ntoc( AV15BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOTO", GXutil.ltrim( localUtil.ntoc( AV16BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARFROM", GXutil.rtrim( AV13BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARTO", GXutil.rtrim( AV14BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOD_IDTX", GXutil.rtrim( AV5Cod_idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARGIRAR", GXutil.rtrim( AV34BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMUESTRAS", GXutil.rtrim( AV77muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARKGM", GXutil.ltrim( localUtil.ntoc( AV154TotCP_BARKGM, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV154TotCP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARMTR", GXutil.ltrim( localUtil.ntoc( AV155TotCP_BARMTR, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV155TotCP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARPIE", GXutil.ltrim( localUtil.ntoc( AV156TotCP_BARPIE, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV76Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76Moda21), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV69GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV69GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vAUXEMPRCOD", GXutil.rtrim( AV9AuxEmprcod));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm27M2( )
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
      return "ListConsultaProduccion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Consulta de Produccion", "") ;
   }

   public void wb27M0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.listconsultaproduccion");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListConsultaProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListConsultaProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF", ""), bttBtnexportpdf_Jsonclick, 7, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1127m1_client"+"'", TempTags, "", 2, "HLP_ListConsultaProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListConsultaProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_27M2( true) ;
      }
      else
      {
         wb_table1_25_27M2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_27M2e( boolean wbgen )
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
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
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
         wb_table2_87_27M2( true) ;
      }
      else
      {
         wb_table2_87_27M2( false) ;
      }
      return  ;
   }

   public void wb_table2_87_27M2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV67GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV68GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV174Pgmname), GXutil.rtrim( localUtil.format( AV174Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ListConsultaProduccion.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV47ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table3_151_27M2( true) ;
      }
      else
      {
         wb_table3_151_27M2( false) ;
      }
      return  ;
   }

   public void wb_table3_151_27M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_156_27M2( true) ;
      }
      else
      {
         wb_table4_156_27M2( false) ;
      }
      return  ;
   }

   public void wb_table4_156_27M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_161_27M2( true) ;
      }
      else
      {
         wb_table5_161_27M2( false) ;
      }
      return  ;
   }

   public void wb_table5_161_27M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_166_27M2( true) ;
      }
      else
      {
         wb_table6_166_27M2( false) ;
      }
      return  ;
   }

   public void wb_table6_166_27M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_171_27M2( true) ;
      }
      else
      {
         wb_table7_171_27M2( false) ;
      }
      return  ;
   }

   public void wb_table7_171_27M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table8_176_27M2( true) ;
      }
      else
      {
         wb_table8_176_27M2( false) ;
      }
      return  ;
   }

   public void wb_table8_176_27M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table9_181_27M2( true) ;
      }
      else
      {
         wb_table9_181_27M2( false) ;
      }
      return  ;
   }

   public void wb_table9_181_27M2e( boolean wbgen )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0189"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0189"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_43_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0189"+"");
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
      if ( wbEnd == 43 )
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

   public void start27M2( )
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
            strup27M0( ) ;
         }
      }
   }

   public void ws27M2( )
   {
      start27M2( ) ;
      evt27M2( ) ;
   }

   public void evt27M2( )
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
                              strup27M0( ) ;
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
                              strup27M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1227M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1327M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1427M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1527M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "AGRUPADAS_MODAL.ONLOADCOMPONENT") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1627M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1727M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1827M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27M0( ) ;
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
                              strup27M0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV65GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65GridActionGroup1), 4, 0));
                           A14297CP_ID = localUtil.ctol( httpContext.cgiGet( edtCP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14328CP_EMPRCOD = httpContext.cgiGet( edtCP_EMPRCOD_Internalname) ;
                           A14326CP_CLICOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_CLICOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14327CP_CLINOM = httpContext.cgiGet( edtCP_CLINOM_Internalname) ;
                           A14324CP_BARDISN = httpContext.cgiGet( edtCP_BARDISN_Internalname) ;
                           cmbCP_BARESTR.setName( cmbCP_BARESTR.getInternalname() );
                           cmbCP_BARESTR.setValue( httpContext.cgiGet( cmbCP_BARESTR.getInternalname()) );
                           A14352CP_BARESTR = (byte)(GXutil.lval( httpContext.cgiGet( cmbCP_BARESTR.getInternalname()))) ;
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
                           AV24BarFasCod = httpContext.cgiGet( edtavBarfascod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfascod_Internalname, AV24BarFasCod);
                           AV25BarFasSig = httpContext.cgiGet( edtavBarfassig_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfassig_Internalname, AV25BarFasSig);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbultimo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbultimo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBULTIMO");
                              GX_FocusControl = edtavBaralbultimo_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV11BarAlbUltimo = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbultimo_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarAlbUltimo), 10, 0));
                           }
                           else
                           {
                              AV11BarAlbUltimo = localUtil.ctol( httpContext.cgiGet( edtavBaralbultimo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbultimo_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarAlbUltimo), 10, 0));
                           }
                           A14339CP_BARALBK = localUtil.ctond( httpContext.cgiGet( edtCP_BARALBK_Internalname)) ;
                           A14340CP_BARALBM = localUtil.ctond( httpContext.cgiGet( edtCP_BARALBM_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbfact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbfact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBFACT");
                              GX_FocusControl = edtavBaralbfact_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV10BarAlbFact = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbfact_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarAlbFact), 8, 0));
                           }
                           else
                           {
                              AV10BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbfact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbfact_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarAlbFact), 8, 0));
                           }
                           A14317CP_BARGIRA = httpContext.cgiGet( edtCP_BARGIRA_Internalname) ;
                           A14323CP_BARPROP = httpContext.cgiGet( edtCP_BARPROP_Internalname) ;
                           A14334CP_DSC_BAR = httpContext.cgiGet( edtCP_DSC_BAR_Internalname) ;
                           A14341CP_DISUSRC = httpContext.cgiGet( edtCP_DISUSRC_Internalname) ;
                           A14320CP_BAREXT = (byte)(localUtil.ctol( httpContext.cgiGet( edtCP_BAREXT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14321CP_DISDES = httpContext.cgiGet( edtCP_DISDES_Internalname) ;
                           A14322CP_DISCOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_DISCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14351CP_BARMAQC = httpContext.cgiGet( edtCP_BARMAQC_Internalname) ;
                           A14306CP_BARPLF = httpContext.cgiGet( edtCP_BARPLF_Internalname) ;
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
                                       e1927M2 ();
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
                                       e2027M2 ();
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
                                       e2127M2 ();
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
                                       e2227M2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV63FilterFullText) != 0 )
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
                                    strup27M0( ) ;
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
                     if ( nCmpId == 189 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0189") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0189", "", sEvt);
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

   public void we27M2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm27M2( ) ;
         }
      }
   }

   public void pa27M2( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV63FilterFullText ,
                                 String AV59Emprcod ,
                                 int AV45CliCodfrom ,
                                 int AV46CliCodto ,
                                 String AV22BarDisNumfrom ,
                                 String AV23BarDisNumto ,
                                 java.util.Date AV30BarFecGenfrom ,
                                 java.util.Date AV31BarFecGento ,
                                 byte AV41BarSitfrom ,
                                 byte AV42BarSitto ,
                                 java.util.Date AV26BarFecClifrom ,
                                 java.util.Date AV27BarFecClito ,
                                 java.util.Date AV28BarFecFprfrom ,
                                 java.util.Date AV29BarFecFprto ,
                                 java.util.Date AV32BarFecSalfrom ,
                                 java.util.Date AV33BarFecSalto ,
                                 String AV39BarSerfrom ,
                                 String AV40BarSerto ,
                                 short AV43BarTipArtfrom ,
                                 short AV44BarTipArtto ,
                                 String AV18BarColNomfrom ,
                                 String AV19BarColNomto ,
                                 int AV20BarColNumfrom ,
                                 int AV21BarColNumto ,
                                 String AV35BarNomClifrom ,
                                 String AV36BarNomClito ,
                                 int AV37BarNumClifrom ,
                                 int AV38BarNumClito ,
                                 String AV77muestras ,
                                 int AV12BarCodfrom ,
                                 int AV17BarCodto ,
                                 byte AV15BarCodReofrom ,
                                 byte AV16BarCodReoto ,
                                 String AV13BarCodParfrom ,
                                 String AV14BarCodParto ,
                                 String AV5Cod_idtx ,
                                 String AV34BarGirar ,
                                 byte AV74ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV47ColumnsSelector ,
                                 String AV174Pgmname ,
                                 java.math.BigDecimal AV154TotCP_BARKGM ,
                                 java.math.BigDecimal AV155TotCP_BARMTR ,
                                 long AV156TotCP_BARPIE ,
                                 short AV76Moda21 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2027M2 ();
      GRID_nCurrentRecord = 0 ;
      rf27M2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListConsultaProduccion");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV174Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("listconsultaproduccion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf27M2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV174Pgmname = "ListConsultaProduccion" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV174Pgmname", AV174Pgmname);
      Gx_err = (short)(0) ;
      edtavBarfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBarfassig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfassig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassig_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBaralbultimo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbultimo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbultimo_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBaralbfact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbfact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbfact_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTotvaluecp_barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecp_barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecp_barkgm_Enabled), 5, 0), true);
      edtavTotvaluecp_barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecp_barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecp_barmtr_Enabled), 5, 0), true);
      edtavTotvaluecp_barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecp_barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecp_barpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27M2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e2027M2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV63FilterFullText ,
                                              AV22BarDisNumfrom ,
                                              AV23BarDisNumto ,
                                              Integer.valueOf(AV45CliCodfrom) ,
                                              Integer.valueOf(AV46CliCodto) ,
                                              Byte.valueOf(AV41BarSitfrom) ,
                                              Byte.valueOf(AV42BarSitto) ,
                                              AV30BarFecGenfrom ,
                                              AV31BarFecGento ,
                                              AV32BarFecSalfrom ,
                                              AV33BarFecSalto ,
                                              AV26BarFecClifrom ,
                                              AV27BarFecClito ,
                                              AV28BarFecFprfrom ,
                                              AV29BarFecFprto ,
                                              AV39BarSerfrom ,
                                              AV40BarSerto ,
                                              AV18BarColNomfrom ,
                                              AV19BarColNomto ,
                                              Integer.valueOf(AV20BarColNumfrom) ,
                                              Integer.valueOf(AV21BarColNumto) ,
                                              AV35BarNomClifrom ,
                                              AV36BarNomClito ,
                                              Integer.valueOf(AV37BarNumClifrom) ,
                                              Integer.valueOf(AV38BarNumClito) ,
                                              Short.valueOf(AV43BarTipArtfrom) ,
                                              Short.valueOf(AV44BarTipArtto) ,
                                              Integer.valueOf(AV12BarCodfrom) ,
                                              Integer.valueOf(AV17BarCodto) ,
                                              Byte.valueOf(AV15BarCodReofrom) ,
                                              Byte.valueOf(AV16BarCodReoto) ,
                                              AV13BarCodParfrom ,
                                              AV14BarCodParto ,
                                              AV5Cod_idtx ,
                                              AV34BarGirar ,
                                              AV77muestras ,
                                              Integer.valueOf(A14326CP_CLICOD) ,
                                              A14327CP_CLINOM ,
                                              A14324CP_BARDISN ,
                                              Byte.valueOf(A14352CP_BARESTR) ,
                                              Integer.valueOf(A14301CP_BARCOD) ,
                                              Byte.valueOf(A14302CP_BARCODR) ,
                                              A14303CP_BARCODP ,
                                              A14319CP_BARAGRE ,
                                              A14311CP_BARSER ,
                                              A14312CP_BARSERD ,
                                              Short.valueOf(A14316CP_BARTIPA) ,
                                              A14343CP_TARTDSC ,
                                              A14331CP_BARCOLO ,
                                              Integer.valueOf(A14332CP_BARCOLU) ,
                                              A14315CP_BARNOMC ,
                                              A14336CP_BARKGM ,
                                              A14337CP_BARMTR ,
                                              Integer.valueOf(A14338CP_BARPIE) ,
                                              Byte.valueOf(A14307CP_BARSIT) ,
                                              A14339CP_BARALBK ,
                                              A14340CP_BARALBM ,
                                              A14317CP_BARGIRA ,
                                              A14323CP_BARPROP ,
                                              A14334CP_DSC_BAR ,
                                              A14341CP_DISUSRC ,
                                              A14351CP_BARMAQC ,
                                              A14308CP_BARFECG ,
                                              A14310CP_BARFECS ,
                                              A14309CP_BARFECC ,
                                              A14304CP_BARFECF ,
                                              Integer.valueOf(A14305CP_BARNUMC) ,
                                              A14306CP_BARPLF ,
                                              AV59Emprcod ,
                                              A14328CP_EMPRCOD } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         /* Using cursor H027M2 */
         pr_default.execute(0, new Object[] {AV59Emprcod, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, AV22BarDisNumfrom, AV23BarDisNumto, Integer.valueOf(AV45CliCodfrom), Integer.valueOf(AV46CliCodto), Byte.valueOf(AV41BarSitfrom), Byte.valueOf(AV42BarSitto), AV30BarFecGenfrom, AV31BarFecGento, AV32BarFecSalfrom, AV33BarFecSalto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV39BarSerfrom, AV40BarSerto, AV18BarColNomfrom, AV19BarColNomto, Integer.valueOf(AV20BarColNumfrom), Integer.valueOf(AV21BarColNumto), AV35BarNomClifrom, AV36BarNomClito, Integer.valueOf(AV37BarNumClifrom), Integer.valueOf(AV38BarNumClito), Short.valueOf(AV43BarTipArtfrom), Short.valueOf(AV44BarTipArtto), Integer.valueOf(AV12BarCodfrom), Integer.valueOf(AV17BarCodto), Byte.valueOf(AV15BarCodReofrom), Byte.valueOf(AV16BarCodReoto), AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV77muestras, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14305CP_BARNUMC = H027M2_A14305CP_BARNUMC[0] ;
            A14306CP_BARPLF = H027M2_A14306CP_BARPLF[0] ;
            A14351CP_BARMAQC = H027M2_A14351CP_BARMAQC[0] ;
            A14322CP_DISCOD = H027M2_A14322CP_DISCOD[0] ;
            A14321CP_DISDES = H027M2_A14321CP_DISDES[0] ;
            A14320CP_BAREXT = H027M2_A14320CP_BAREXT[0] ;
            A14341CP_DISUSRC = H027M2_A14341CP_DISUSRC[0] ;
            A14334CP_DSC_BAR = H027M2_A14334CP_DSC_BAR[0] ;
            A14323CP_BARPROP = H027M2_A14323CP_BARPROP[0] ;
            A14317CP_BARGIRA = H027M2_A14317CP_BARGIRA[0] ;
            A14340CP_BARALBM = H027M2_A14340CP_BARALBM[0] ;
            A14339CP_BARALBK = H027M2_A14339CP_BARALBK[0] ;
            A14310CP_BARFECS = H027M2_A14310CP_BARFECS[0] ;
            A14304CP_BARFECF = H027M2_A14304CP_BARFECF[0] ;
            A14309CP_BARFECC = H027M2_A14309CP_BARFECC[0] ;
            A14308CP_BARFECG = H027M2_A14308CP_BARFECG[0] ;
            A14307CP_BARSIT = H027M2_A14307CP_BARSIT[0] ;
            A14338CP_BARPIE = H027M2_A14338CP_BARPIE[0] ;
            A14337CP_BARMTR = H027M2_A14337CP_BARMTR[0] ;
            A14336CP_BARKGM = H027M2_A14336CP_BARKGM[0] ;
            A14315CP_BARNOMC = H027M2_A14315CP_BARNOMC[0] ;
            A14332CP_BARCOLU = H027M2_A14332CP_BARCOLU[0] ;
            A14331CP_BARCOLO = H027M2_A14331CP_BARCOLO[0] ;
            A14343CP_TARTDSC = H027M2_A14343CP_TARTDSC[0] ;
            A14316CP_BARTIPA = H027M2_A14316CP_BARTIPA[0] ;
            A14312CP_BARSERD = H027M2_A14312CP_BARSERD[0] ;
            A14311CP_BARSER = H027M2_A14311CP_BARSER[0] ;
            A14319CP_BARAGRE = H027M2_A14319CP_BARAGRE[0] ;
            A14303CP_BARCODP = H027M2_A14303CP_BARCODP[0] ;
            A14302CP_BARCODR = H027M2_A14302CP_BARCODR[0] ;
            A14301CP_BARCOD = H027M2_A14301CP_BARCOD[0] ;
            A14352CP_BARESTR = H027M2_A14352CP_BARESTR[0] ;
            A14324CP_BARDISN = H027M2_A14324CP_BARDISN[0] ;
            A14327CP_CLINOM = H027M2_A14327CP_CLINOM[0] ;
            A14326CP_CLICOD = H027M2_A14326CP_CLICOD[0] ;
            A14328CP_EMPRCOD = H027M2_A14328CP_EMPRCOD[0] ;
            A14297CP_ID = H027M2_A14297CP_ID[0] ;
            e2127M2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wb27M0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27M2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV59Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARKGM", GXutil.ltrim( localUtil.ntoc( AV154TotCP_BARKGM, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV154TotCP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARMTR", GXutil.ltrim( localUtil.ntoc( AV155TotCP_BARMTR, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV155TotCP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCP_BARPIE", GXutil.ltrim( localUtil.ntoc( AV156TotCP_BARPIE, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV76Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76Moda21), "ZZZ9")));
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
                                           AV63FilterFullText ,
                                           AV22BarDisNumfrom ,
                                           AV23BarDisNumto ,
                                           Integer.valueOf(AV45CliCodfrom) ,
                                           Integer.valueOf(AV46CliCodto) ,
                                           Byte.valueOf(AV41BarSitfrom) ,
                                           Byte.valueOf(AV42BarSitto) ,
                                           AV30BarFecGenfrom ,
                                           AV31BarFecGento ,
                                           AV32BarFecSalfrom ,
                                           AV33BarFecSalto ,
                                           AV26BarFecClifrom ,
                                           AV27BarFecClito ,
                                           AV28BarFecFprfrom ,
                                           AV29BarFecFprto ,
                                           AV39BarSerfrom ,
                                           AV40BarSerto ,
                                           AV18BarColNomfrom ,
                                           AV19BarColNomto ,
                                           Integer.valueOf(AV20BarColNumfrom) ,
                                           Integer.valueOf(AV21BarColNumto) ,
                                           AV35BarNomClifrom ,
                                           AV36BarNomClito ,
                                           Integer.valueOf(AV37BarNumClifrom) ,
                                           Integer.valueOf(AV38BarNumClito) ,
                                           Short.valueOf(AV43BarTipArtfrom) ,
                                           Short.valueOf(AV44BarTipArtto) ,
                                           Integer.valueOf(AV12BarCodfrom) ,
                                           Integer.valueOf(AV17BarCodto) ,
                                           Byte.valueOf(AV15BarCodReofrom) ,
                                           Byte.valueOf(AV16BarCodReoto) ,
                                           AV13BarCodParfrom ,
                                           AV14BarCodParto ,
                                           AV5Cod_idtx ,
                                           AV34BarGirar ,
                                           AV77muestras ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           A14327CP_CLINOM ,
                                           A14324CP_BARDISN ,
                                           Byte.valueOf(A14352CP_BARESTR) ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14319CP_BARAGRE ,
                                           A14311CP_BARSER ,
                                           A14312CP_BARSERD ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14343CP_TARTDSC ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14315CP_BARNOMC ,
                                           A14336CP_BARKGM ,
                                           A14337CP_BARMTR ,
                                           Integer.valueOf(A14338CP_BARPIE) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14339CP_BARALBK ,
                                           A14340CP_BARALBM ,
                                           A14317CP_BARGIRA ,
                                           A14323CP_BARPROP ,
                                           A14334CP_DSC_BAR ,
                                           A14341CP_DISUSRC ,
                                           A14351CP_BARMAQC ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           A14306CP_BARPLF ,
                                           AV59Emprcod ,
                                           A14328CP_EMPRCOD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      /* Using cursor H027M3 */
      pr_default.execute(1, new Object[] {AV59Emprcod, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, AV22BarDisNumfrom, AV23BarDisNumto, Integer.valueOf(AV45CliCodfrom), Integer.valueOf(AV46CliCodto), Byte.valueOf(AV41BarSitfrom), Byte.valueOf(AV42BarSitto), AV30BarFecGenfrom, AV31BarFecGento, AV32BarFecSalfrom, AV33BarFecSalto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV39BarSerfrom, AV40BarSerto, AV18BarColNomfrom, AV19BarColNomto, Integer.valueOf(AV20BarColNumfrom), Integer.valueOf(AV21BarColNumto), AV35BarNomClifrom, AV36BarNomClito, Integer.valueOf(AV37BarNumClifrom), Integer.valueOf(AV38BarNumClito), Short.valueOf(AV43BarTipArtfrom), Short.valueOf(AV44BarTipArtto), Integer.valueOf(AV12BarCodfrom), Integer.valueOf(AV17BarCodto), Byte.valueOf(AV15BarCodReofrom), Byte.valueOf(AV16BarCodReoto), AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV77muestras});
      GRID_nRecordCount = H027M3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV59Emprcod, AV45CliCodfrom, AV46CliCodto, AV22BarDisNumfrom, AV23BarDisNumto, AV30BarFecGenfrom, AV31BarFecGento, AV41BarSitfrom, AV42BarSitto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV32BarFecSalfrom, AV33BarFecSalto, AV39BarSerfrom, AV40BarSerto, AV43BarTipArtfrom, AV44BarTipArtto, AV18BarColNomfrom, AV19BarColNomto, AV20BarColNumfrom, AV21BarColNumto, AV35BarNomClifrom, AV36BarNomClito, AV37BarNumClifrom, AV38BarNumClito, AV77muestras, AV12BarCodfrom, AV17BarCodto, AV15BarCodReofrom, AV16BarCodReoto, AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV74ManageFiltersExecutionStep, AV47ColumnsSelector, AV174Pgmname, AV154TotCP_BARKGM, AV155TotCP_BARMTR, AV156TotCP_BARPIE, AV76Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV59Emprcod, AV45CliCodfrom, AV46CliCodto, AV22BarDisNumfrom, AV23BarDisNumto, AV30BarFecGenfrom, AV31BarFecGento, AV41BarSitfrom, AV42BarSitto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV32BarFecSalfrom, AV33BarFecSalto, AV39BarSerfrom, AV40BarSerto, AV43BarTipArtfrom, AV44BarTipArtto, AV18BarColNomfrom, AV19BarColNomto, AV20BarColNumfrom, AV21BarColNumto, AV35BarNomClifrom, AV36BarNomClito, AV37BarNumClifrom, AV38BarNumClito, AV77muestras, AV12BarCodfrom, AV17BarCodto, AV15BarCodReofrom, AV16BarCodReoto, AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV74ManageFiltersExecutionStep, AV47ColumnsSelector, AV174Pgmname, AV154TotCP_BARKGM, AV155TotCP_BARMTR, AV156TotCP_BARPIE, AV76Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV59Emprcod, AV45CliCodfrom, AV46CliCodto, AV22BarDisNumfrom, AV23BarDisNumto, AV30BarFecGenfrom, AV31BarFecGento, AV41BarSitfrom, AV42BarSitto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV32BarFecSalfrom, AV33BarFecSalto, AV39BarSerfrom, AV40BarSerto, AV43BarTipArtfrom, AV44BarTipArtto, AV18BarColNomfrom, AV19BarColNomto, AV20BarColNumfrom, AV21BarColNumto, AV35BarNomClifrom, AV36BarNomClito, AV37BarNumClifrom, AV38BarNumClito, AV77muestras, AV12BarCodfrom, AV17BarCodto, AV15BarCodReofrom, AV16BarCodReoto, AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV74ManageFiltersExecutionStep, AV47ColumnsSelector, AV174Pgmname, AV154TotCP_BARKGM, AV155TotCP_BARMTR, AV156TotCP_BARPIE, AV76Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV59Emprcod, AV45CliCodfrom, AV46CliCodto, AV22BarDisNumfrom, AV23BarDisNumto, AV30BarFecGenfrom, AV31BarFecGento, AV41BarSitfrom, AV42BarSitto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV32BarFecSalfrom, AV33BarFecSalto, AV39BarSerfrom, AV40BarSerto, AV43BarTipArtfrom, AV44BarTipArtto, AV18BarColNomfrom, AV19BarColNomto, AV20BarColNumfrom, AV21BarColNumto, AV35BarNomClifrom, AV36BarNomClito, AV37BarNumClifrom, AV38BarNumClito, AV77muestras, AV12BarCodfrom, AV17BarCodto, AV15BarCodReofrom, AV16BarCodReoto, AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV74ManageFiltersExecutionStep, AV47ColumnsSelector, AV174Pgmname, AV154TotCP_BARKGM, AV155TotCP_BARMTR, AV156TotCP_BARPIE, AV76Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV59Emprcod, AV45CliCodfrom, AV46CliCodto, AV22BarDisNumfrom, AV23BarDisNumto, AV30BarFecGenfrom, AV31BarFecGento, AV41BarSitfrom, AV42BarSitto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV32BarFecSalfrom, AV33BarFecSalto, AV39BarSerfrom, AV40BarSerto, AV43BarTipArtfrom, AV44BarTipArtto, AV18BarColNomfrom, AV19BarColNomto, AV20BarColNumfrom, AV21BarColNumto, AV35BarNomClifrom, AV36BarNomClito, AV37BarNumClifrom, AV38BarNumClito, AV77muestras, AV12BarCodfrom, AV17BarCodto, AV15BarCodReofrom, AV16BarCodReoto, AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV74ManageFiltersExecutionStep, AV47ColumnsSelector, AV174Pgmname, AV154TotCP_BARKGM, AV155TotCP_BARMTR, AV156TotCP_BARPIE, AV76Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV174Pgmname = "ListConsultaProduccion" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV174Pgmname", AV174Pgmname);
      Gx_err = (short)(0) ;
      edtavBarfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBarfassig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfassig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassig_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBaralbultimo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbultimo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbultimo_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBaralbfact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbfact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbfact_Enabled), 5, 0), !bGXsfl_43_Refreshing);
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

   public void strup27M0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1927M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV73ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV58DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV47ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV67GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV68GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV9AuxEmprcod = httpContext.cgiGet( sPrefix+"wcpOAV9AuxEmprcod") ;
         wcpOAV45CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV46CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV22BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV22BarDisNumfrom") ;
         wcpOAV23BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV23BarDisNumto") ;
         wcpOAV30BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30BarFecGenfrom"), 0) ;
         wcpOAV31BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31BarFecGento"), 0) ;
         wcpOAV41BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV42BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV26BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26BarFecClifrom"), 0) ;
         wcpOAV27BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV27BarFecClito"), 0) ;
         wcpOAV28BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV28BarFecFprfrom"), 0) ;
         wcpOAV29BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV29BarFecFprto"), 0) ;
         wcpOAV32BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV32BarFecSalfrom"), 0) ;
         wcpOAV33BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV33BarFecSalto"), 0) ;
         wcpOAV39BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV39BarSerfrom") ;
         wcpOAV40BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV40BarSerto") ;
         wcpOAV43BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV44BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV18BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV18BarColNomfrom") ;
         wcpOAV19BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV19BarColNomto") ;
         wcpOAV20BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV20BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV21BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV35BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV35BarNomClifrom") ;
         wcpOAV36BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV36BarNomClito") ;
         wcpOAV37BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV38BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV77muestras = httpContext.cgiGet( sPrefix+"wcpOAV77muestras") ;
         wcpOAV12BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV15BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV16BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV13BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV13BarCodParfrom") ;
         wcpOAV14BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV14BarCodParto") ;
         wcpOAV5Cod_idtx = httpContext.cgiGet( sPrefix+"wcpOAV5Cod_idtx") ;
         wcpOAV34BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV34BarGirar") ;
         AV34BarGirar = httpContext.cgiGet( sPrefix+"vBARGIRAR") ;
         AV5Cod_idtx = httpContext.cgiGet( sPrefix+"vCOD_IDTX") ;
         AV14BarCodParto = httpContext.cgiGet( sPrefix+"vBARCODPARTO") ;
         AV13BarCodParfrom = httpContext.cgiGet( sPrefix+"vBARCODPARFROM") ;
         AV16BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCODREOTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCODREOFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV12BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV77muestras = httpContext.cgiGet( sPrefix+"vMUESTRAS") ;
         AV38BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARNUMCLITO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV37BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARNUMCLIFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV36BarNomClito = httpContext.cgiGet( sPrefix+"vBARNOMCLITO") ;
         AV35BarNomClifrom = httpContext.cgiGet( sPrefix+"vBARNOMCLIFROM") ;
         AV21BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCOLNUMTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV20BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCOLNUMFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19BarColNomto = httpContext.cgiGet( sPrefix+"vBARCOLNOMTO") ;
         AV18BarColNomfrom = httpContext.cgiGet( sPrefix+"vBARCOLNOMFROM") ;
         AV44BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARTIPARTTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARTIPARTFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40BarSerto = httpContext.cgiGet( sPrefix+"vBARSERTO") ;
         AV39BarSerfrom = httpContext.cgiGet( sPrefix+"vBARSERFROM") ;
         AV33BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECSALTO"), 0) ;
         AV32BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECSALFROM"), 0) ;
         AV29BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECFPRTO"), 0) ;
         AV28BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECFPRFROM"), 0) ;
         AV27BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECCLITO"), 0) ;
         AV26BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECCLIFROM"), 0) ;
         AV42BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV41BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECGENTO"), 0) ;
         AV30BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECGENFROM"), 0) ;
         AV23BarDisNumto = httpContext.cgiGet( sPrefix+"vBARDISNUMTO") ;
         AV22BarDisNumfrom = httpContext.cgiGet( sPrefix+"vBARDISNUMFROM") ;
         AV46CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV45CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV59Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV63FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FilterFullText", AV63FilterFullText);
         AV157TotValueCP_BARKGM = httpContext.cgiGet( edtavTotvaluecp_barkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157TotValueCP_BARKGM", AV157TotValueCP_BARKGM);
         AV158TotValueCP_BARMTR = httpContext.cgiGet( edtavTotvaluecp_barmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158TotValueCP_BARMTR", AV158TotValueCP_BARMTR);
         AV159TotValueCP_BARPIE = httpContext.cgiGet( edtavTotvaluecp_barpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV159TotValueCP_BARPIE", AV159TotValueCP_BARPIE);
         AV174Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV174Pgmname", AV174Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListConsultaProduccion");
         AV174Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV174Pgmname", AV174Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV174Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("listconsultaproduccion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV63FilterFullText) != 0 )
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
      e1927M2 ();
      if (returnInSub) return;
   }

   public void e1927M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV6Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      listconsultaproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV6Station = GXt_char1 ;
      GXv_char2[0] = AV59Emprcod ;
      GXv_char3[0] = AV60EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char2, GXv_char3, GXv_char4) ;
      listconsultaproduccion_impl.this.AV59Emprcod = GXv_char2[0] ;
      listconsultaproduccion_impl.this.AV60EmprNom = GXv_char3[0] ;
      listconsultaproduccion_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV58DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV58DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV76Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV59Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      listconsultaproduccion_impl.this.GXt_int7 = GXv_int8[0] ;
      AV76Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76Moda21), "ZZZ9")));
      GXt_int7 = (byte)(AV164cuaderno) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV59Emprcod, httpContext.getMessage( "CNOENC", ""), GXv_int8) ;
      listconsultaproduccion_impl.this.GXt_int7 = GXv_int8[0] ;
      AV164cuaderno = GXt_int7 ;
      GXt_int7 = (byte)(AV165STNORM) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV59Emprcod, httpContext.getMessage( "STNORM", ""), GXv_int8) ;
      listconsultaproduccion_impl.this.GXt_int7 = GXv_int8[0] ;
      AV165STNORM = GXt_int7 ;
      AV157TotValueCP_BARKGM = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157TotValueCP_BARKGM", AV157TotValueCP_BARKGM);
      AV158TotValueCP_BARMTR = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158TotValueCP_BARMTR", AV158TotValueCP_BARMTR);
      AV159TotValueCP_BARPIE = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV159TotValueCP_BARPIE", AV159TotValueCP_BARPIE);
      subgrid_gotopage( 1) ;
   }

   public void e2027M2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV163WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV163WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV74ManageFiltersExecutionStep == 1 )
      {
         AV74ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74ManageFiltersExecutionStep", GXutil.str( AV74ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV74ManageFiltersExecutionStep == 2 )
      {
         AV74ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74ManageFiltersExecutionStep", GXutil.str( AV74ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV82Session.getValue("ListConsultaProduccionColumnsSelector"), "") != 0 )
      {
         AV49ColumnsSelectorXML = AV82Session.getValue("ListConsultaProduccionColumnsSelector") ;
         AV47ColumnsSelector.fromxml(AV49ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtCP_CLICOD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_CLICOD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_CLICOD_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_CLINOM_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_CLINOM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_CLINOM_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARDISN_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARDISN_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARDISN_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbCP_BARESTR.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCP_BARESTR.getInternalname(), "Visible", GXutil.ltrimstr( cmbCP_BARESTR.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARCOD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCOD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCOD_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARCODR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCODR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCODR_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARCODP_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCODP_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCODP_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARAGRE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARAGRE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARAGRE_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARSER_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARSER_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARSER_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARSERD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARSERD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARSERD_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARTIPA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARTIPA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARTIPA_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_TARTDSC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_TARTDSC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_TARTDSC_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARCOLO_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCOLO_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCOLO_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARCOLU_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCOLU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCOLU_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARNOMC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARNOMC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARNOMC_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARKGM_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARKGM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARKGM_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARMTR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARMTR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARMTR_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARPIE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARPIE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARPIE_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARSIT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARSIT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARSIT_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARFECG_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARFECG_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECG_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARFECC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARFECC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECC_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARFECF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARFECF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECF_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARFECS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARFECS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECS_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavBarfascod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavBarfassig_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfassig_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassig_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavBaralbultimo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbultimo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbultimo_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARALBK_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARALBK_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARALBK_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARALBM_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARALBM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARALBM_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavBaralbfact_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbfact_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbfact_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARGIRA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARGIRA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARGIRA_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARPROP_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARPROP_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARPROP_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_DSC_BAR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_DSC_BAR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_DSC_BAR_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_DISUSRC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_DISUSRC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_DISUSRC_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCP_BARMAQC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV47ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARMAQC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARMAQC_Visible), 5, 0), !bGXsfl_43_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV67GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67GridCurrentPage), 10, 0));
      AV68GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      cmbCP_BARESTR.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCP_BARESTR.getInternalname(), "Columnheaderclass", cmbCP_BARESTR.getColumnHeaderClass(), !bGXsfl_43_Refreshing);
      edtCP_BARCOD_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCP_BARCOD_Internalname, "Columnheaderclass", edtCP_BARCOD_Columnheaderclass, !bGXsfl_43_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ColumnsSelector", AV47ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV73ManageFiltersData", AV73ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV69GridState", AV69GridState);
   }

   public void e1327M2( )
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
         AV81PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV81PageToGo) ;
      }
   }

   public void e1427M2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2127M2( )
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
      GXt_int7 = (byte)(0) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV59Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      listconsultaproduccion_impl.this.GXt_int7 = GXv_int8[0] ;
      AV83TempBoolean = (boolean)((GXt_int7==1)) ;
      if ( AV83TempBoolean )
      {
         cmbavGridactiongroup1.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Alterar Data Ent.", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( AV76Moda21 == 1 )
      {
         cmbavGridactiongroup1.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Impresion HDR", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( GXutil.strcmp(A14319CP_BARAGRE, "S") == 0 )
      {
         cmbavGridactiongroup1.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Agrupadas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      }
      GXt_char1 = AV24BarFasCod ;
      GXv_char4[0] = GXt_char1 ;
      new app.pget_barfascod(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_char4) ;
      listconsultaproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24BarFasCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfascod_Internalname, AV24BarFasCod);
      cmbCP_BARESTR.setColumnClass( ((A14352CP_BARESTR==2) ? "WWColumn WWColumnDanger WWColumnDangerSingleCell" : "WWColumn") );
      if ( A14320CP_BAREXT == 1 )
      {
         edtCP_BARCOD_Columnclass = "WWColumn WWColumnWarning WWColumnWarningSingleCell" ;
      }
      else if ( A14320CP_BAREXT == 2 )
      {
         edtCP_BARCOD_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
      }
      else
      {
         edtCP_BARCOD_Columnclass = httpContext.getMessage( "WWColumn", "") ;
      }
      GXt_char1 = AV24BarFasCod ;
      GXv_char4[0] = GXt_char1 ;
      new app.pget_barfascod(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_char4) ;
      listconsultaproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24BarFasCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfascod_Internalname, AV24BarFasCod);
      GXt_char1 = AV25BarFasSig ;
      GXv_char4[0] = GXt_char1 ;
      new app.pget_barfassig(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_char4) ;
      listconsultaproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25BarFasSig = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfassig_Internalname, AV25BarFasSig);
      GXt_int10 = AV11BarAlbUltimo ;
      GXv_int11[0] = GXt_int10 ;
      new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_int11) ;
      listconsultaproduccion_impl.this.GXt_int10 = GXv_int11[0] ;
      AV11BarAlbUltimo = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbultimo_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarAlbUltimo), 10, 0));
      GXt_int12 = AV10BarAlbFact ;
      GXv_int13[0] = GXt_int12 ;
      new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_int13) ;
      listconsultaproduccion_impl.this.GXt_int12 = GXv_int13[0] ;
      AV10BarAlbFact = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbfact_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarAlbFact), 8, 0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV65GridActionGroup1, 4, 0)) );
   }

   public void e1527M2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV49ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV47ColumnsSelector.fromJSonString(AV49ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ListConsultaProduccionColumnsSelector", ((GXutil.strcmp("", AV49ColumnsSelectorXML)==0) ? "" : AV47ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ColumnsSelector", AV47ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV73ManageFiltersData", AV73ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV69GridState", AV69GridState);
   }

   public void e1227M2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S142 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ListConsultaProduccionFilters")),GXutil.URLEncode(GXutil.rtrim(AV174Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV74ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74ManageFiltersExecutionStep", GXutil.str( AV74ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ListConsultaProduccionFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV74ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74ManageFiltersExecutionStep", GXutil.str( AV74ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV75ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ListConsultaProduccionFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         listconsultaproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
         AV75ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV75ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV174Pgmname+"GridState", AV75ManageFiltersXml) ;
            AV69GridState.fromxml(AV75ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV69GridState", AV69GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ColumnsSelector", AV47ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV73ManageFiltersData", AV73ManageFiltersData);
   }

   public void e2227M2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV65GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO SITUACIONFASES' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV65GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO CONSULTAALBARANSALIDA' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV65GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO RECETAS' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV65GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO PARTESPRODUCCION' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV65GridActionGroup1 == 5 )
      {
         /* Execute user subroutine: 'DO PACKINGLIST' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV65GridActionGroup1 == 6 )
      {
         /* Execute user subroutine: 'DO PIEZAS' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV65GridActionGroup1 == 7 )
      {
         /* Execute user subroutine: 'DO MODIFICARFECHAE' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV65GridActionGroup1 == 8 )
      {
         /* Execute user subroutine: 'DO IMPRESIONHDR' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( AV65GridActionGroup1 == 9 )
      {
         /* Execute user subroutine: 'DO AGRUPADAS' */
         S282 ();
         if (returnInSub) return;
      }
      AV65GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV65GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ColumnsSelector", AV47ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV73ManageFiltersData", AV73ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV69GridState", AV69GridState);
   }

   public void e1627M2( )
   {
      /* Agrupadas_modal_Onloadcomponent Routine */
      returnInSub = false ;
      GXt_int12 = AV171MacCod ;
      GXv_int13[0] = GXt_int12 ;
      new app.pbusmace(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_int13) ;
      listconsultaproduccion_impl.this.GXt_int12 = GXv_int13[0] ;
      AV171MacCod = GXt_int12 ;
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wwpaux_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wwpaux_wc_Component), GXutil.lower( "ConsultadeProduccion_Agrupadas")) != 0 )
      {
         WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app.consultadeproduccion_agrupadas_impl", remoteHandle, context);
         WebComp_Wwpaux_wc_Component = "ConsultadeProduccion_Agrupadas" ;
      }
      if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
      {
         WebComp_Wwpaux_wc.setjustcreated();
         WebComp_Wwpaux_wc.componentprepare(new Object[] {sPrefix+"W0189","",A14328CP_EMPRCOD,Integer.valueOf(A14301CP_BARCOD),Byte.valueOf(A14302CP_BARCODR),A14303CP_BARCODP,Integer.valueOf(A14326CP_CLICOD),A14327CP_CLINOM,A14324CP_BARDISN,A14311CP_BARSER,A14312CP_BARSERD,A14331CP_BARCOLO,Integer.valueOf(A14332CP_BARCOLU),Integer.valueOf(AV171MacCod),A14336CP_BARKGM,A14337CP_BARMTR});
         WebComp_Wwpaux_wc.componentbind(new Object[] {"","","","","","","","","","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wwpaux_wc )
      {
         httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0189"+"");
         WebComp_Wwpaux_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e1727M2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV62ExcelFilename ;
      GXv_char3[0] = AV61ErrorMessage ;
      new app.listconsultaproduccionexport(remoteHandle, context).execute( AV59Emprcod, AV45CliCodfrom, AV46CliCodto, AV22BarDisNumfrom, AV23BarDisNumto, AV30BarFecGenfrom, AV31BarFecGento, AV41BarSitfrom, AV42BarSitto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV32BarFecSalfrom, AV33BarFecSalto, AV39BarSerfrom, AV40BarSerto, AV43BarTipArtfrom, AV44BarTipArtto, AV18BarColNomfrom, AV19BarColNomto, AV20BarColNumfrom, AV21BarColNumto, AV35BarNomClifrom, AV36BarNomClito, AV37BarNumClifrom, AV38BarNumClito, AV43BarTipArtfrom, AV44BarTipArtto, AV77muestras, AV12BarCodfrom, AV17BarCodto, AV15BarCodReofrom, AV16BarCodReoto, AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, GXv_char4, GXv_char3) ;
      listconsultaproduccion_impl.this.AV62ExcelFilename = GXv_char4[0] ;
      listconsultaproduccion_impl.this.AV61ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV62ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV62ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV61ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV69GridState", AV69GridState);
   }

   public void e1827M2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.listconsultaproduccionexportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV59Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV45CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV22BarDisNumfrom)),GXutil.URLEncode(GXutil.rtrim(AV23BarDisNumto)),GXutil.URLEncode(GXutil.formatDateParm(AV30BarFecGenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV31BarFecGento)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42BarSitto,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV26BarFecClifrom)),GXutil.URLEncode(GXutil.formatDateParm(AV27BarFecClito)),GXutil.URLEncode(GXutil.formatDateParm(AV28BarFecFprfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV29BarFecFprto)),GXutil.URLEncode(GXutil.formatDateParm(AV32BarFecSalfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV33BarFecSalto)),GXutil.URLEncode(GXutil.rtrim(AV39BarSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV40BarSerto)),GXutil.URLEncode(GXutil.ltrimstr(AV43BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV18BarColNomfrom)),GXutil.URLEncode(GXutil.rtrim(AV19BarColNomto)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarColNumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarColNumto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV35BarNomClifrom)),GXutil.URLEncode(GXutil.rtrim(AV36BarNomClito)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarNumClifrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarNumClito,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV77muestras)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarCodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodReofrom,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarCodReoto,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarCodParfrom)),GXutil.URLEncode(GXutil.rtrim(AV14BarCodParto)),GXutil.URLEncode(GXutil.rtrim(AV5Cod_idtx)),GXutil.URLEncode(GXutil.rtrim(AV34BarGirar))}, new String[] {"Emprcod","CliCodfrom","CliCodto","bardisnumfrom","bardisnumto","barfecgenfrom","barfecgento","BarSitfrom","BarSitto","BarFecClifrom","barfecclito","BarFecFprfrom","barfecfprto","barfecsalfrom","barfecsalto","BarSerfrom","BarSerto","BarTipArtfrom","BarTipArtto","BarColNomfrom","BarColNomto","BarColnumfrom","BarColNumto","BarNomClifrom","BarNomClito","BarNumClifrom","Barnumclito","BarTipArtfrom","BarTipArtto","muestras","BarCodfrom","BarCodto","BarCodreofrom","BarCodreoto","BarCodparfrom","BarCodparto","Cod_idtx","BarGirar"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV69GridState", AV69GridState);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV47ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_CLICOD", "", "Cliente", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_CLINOM", "", "Nombre", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARDISNUM", "", "Ped. Cli.", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARESTR", "", "Tipo", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARCOD", "", "Nº Hdr", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARCODREO", "", "R", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARCODPAR", "", "P", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARAGREST", "", "A?", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARSER", "", "Articulo", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARSERDSC", "", "Descripcion", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARTIPART", "", "Tip. Art.", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_TARTDSC", "", "Descripcion", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARCOLO", "", "Color", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARCOLU", "", "Numero", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARNOMCLI", "", "Color Cli.", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARKGM", "", "KIlos", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARMTR", "", "Metros", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARPIE", "", "Piezas", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARSIT", "", "Sit.", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARFECGEN", "Fecha", "Fecha HDR", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARFECCLI", "Fecha", "Ped. Cli.", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARFECFPR", "Fecha", "Ent. Prev.", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARFECSAL", "", "Salida", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarFasCod", "", "Ult. Fase", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarFasSig", "", "Sig. Fase", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarAlbUltimo", "", "Ultimo Alb.", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARALBK", "", "Kgs. Sal.", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARALBM", "", "Mts. Sal.", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarAlbFact", "", "Factura", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARGIRAR", "", "Coleccion", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARPROPER", "", "Ctw", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_DSC_BAR", "", "Descripcion", false, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_DISUSRC", "", "Usuario", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV47ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CP_BARMAQCD", "", "Maquina", true, "") ;
      AV47ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV162UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListConsultaProduccionColumnsSelector", GXv_char4) ;
      listconsultaproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV162UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV162UserCustomValue)==0) ) )
      {
         AV48ColumnsSelectorAux.fromxml(AV162UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV48ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV47ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV48ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV47ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV73ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ListConsultaProduccionFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV73ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV63FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FilterFullText", AV63FilterFullText);
   }

   public void S202( )
   {
      /* 'DO SITUACIONFASES' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "SITUACIONFASES_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S212( )
   {
      /* 'DO CONSULTAALBARANSALIDA' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "CONSULTAALBARANSALIDA_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO RECETAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "RECETAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S232( )
   {
      /* 'DO PARTESPRODUCCION' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "PARTESPRODUCCION_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S242( )
   {
      /* 'DO PACKINGLIST' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_packinglist", new String[] {GXutil.URLEncode(GXutil.rtrim(A14328CP_EMPRCOD)),GXutil.URLEncode(GXutil.ltrimstr(A14301CP_BARCOD,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A14302CP_BARCODR,1,0)),GXutil.URLEncode(GXutil.rtrim(A14303CP_BARCODP)),GXutil.URLEncode(GXutil.ltrimstr(A14326CP_CLICOD,6,0)),GXutil.URLEncode(GXutil.rtrim(A14327CP_CLINOM)),GXutil.URLEncode(GXutil.rtrim(A14324CP_BARDISN)),GXutil.URLEncode(GXutil.rtrim(A14311CP_BARSER)),GXutil.URLEncode(GXutil.rtrim(A14312CP_BARSERD)),GXutil.URLEncode(GXutil.rtrim(A14331CP_BARCOLO)),GXutil.URLEncode(GXutil.ltrimstr(A14332CP_BARCOLU,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) , new Object[] {});
   }

   public void S252( )
   {
      /* 'DO PIEZAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "PIEZAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S262( )
   {
      /* 'DO MODIFICARFECHAE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_modfecent", new String[] {GXutil.URLEncode(GXutil.rtrim(A14328CP_EMPRCOD)),GXutil.URLEncode(GXutil.ltrimstr(A14301CP_BARCOD,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A14302CP_BARCODR,1,0)),GXutil.URLEncode(GXutil.rtrim(A14303CP_BARCODP)),GXutil.URLEncode(GXutil.ltrimstr(A14326CP_CLICOD,6,0)),GXutil.URLEncode(GXutil.rtrim(A14327CP_CLINOM)),GXutil.URLEncode(GXutil.rtrim(A14324CP_BARDISN)),GXutil.URLEncode(GXutil.rtrim(A14311CP_BARSER)),GXutil.URLEncode(GXutil.rtrim(A14312CP_BARSERD)),GXutil.URLEncode(GXutil.rtrim(A14331CP_BARCOLO)),GXutil.URLEncode(GXutil.ltrimstr(A14332CP_BARCOLU,6,0)),GXutil.URLEncode(GXutil.formatDateParm(A14304CP_BARFECF))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum","BarFecFpr"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S272( )
   {
      /* 'DO IMPRESIONHDR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rhdrmod", new String[] {GXutil.URLEncode(GXutil.rtrim(A14328CP_EMPRCOD)),GXutil.URLEncode(GXutil.ltrimstr(A14301CP_BARCOD,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A14302CP_BARCODR,1,0)),GXutil.URLEncode(GXutil.rtrim(A14303CP_BARCODP)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S282( )
   {
      /* 'DO AGRUPADAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod(sPrefix, false, "AGRUPADAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV82Session.getValue(AV174Pgmname+"GridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV174Pgmname+"GridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV82Session.getValue(AV174Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV69GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV69GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV69GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV175GXV1 = 1 ;
      while ( AV175GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV175GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV63FilterFullText = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FilterFullText", AV63FilterFullText);
         }
         AV175GXV1 = (int)(AV175GXV1+1) ;
      }
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV69GridState.fromxml(AV82Session.getValue(AV174Pgmname+"GridState"), null, null);
      AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV69GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV63FilterFullText)==0), (short)(0), AV63FilterFullText, "") ;
      AV69GridState = GXv_SdtWWPGridState18[0] ;
      AV69GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV69GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV174Pgmname+"GridState", AV69GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV160TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV160TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV174Pgmname );
      AV160TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV160TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV71HTTPRequest.getScriptName()+"?"+AV71HTTPRequest.getQuerystring() );
      AV160TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Produccion.CONPRODUC" );
      AV82Session.setValue("TrnContext", AV160TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV154TotCP_BARKGM = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154TotCP_BARKGM", GXutil.ltrimstr( AV154TotCP_BARKGM, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV154TotCP_BARKGM, "ZZZZZ9.99")));
      AV155TotCP_BARMTR = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155TotCP_BARMTR", GXutil.ltrimstr( AV155TotCP_BARMTR, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV155TotCP_BARMTR, "ZZZZZ9.99")));
      AV156TotCP_BARPIE = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156TotCP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), "ZZZZZ9")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      if ( 1 == 2 )
      {
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              AV63FilterFullText ,
                                              AV22BarDisNumfrom ,
                                              AV23BarDisNumto ,
                                              Integer.valueOf(AV45CliCodfrom) ,
                                              Integer.valueOf(AV46CliCodto) ,
                                              Byte.valueOf(AV41BarSitfrom) ,
                                              Byte.valueOf(AV42BarSitto) ,
                                              AV30BarFecGenfrom ,
                                              AV31BarFecGento ,
                                              AV32BarFecSalfrom ,
                                              AV33BarFecSalto ,
                                              AV26BarFecClifrom ,
                                              AV27BarFecClito ,
                                              AV28BarFecFprfrom ,
                                              AV29BarFecFprto ,
                                              AV39BarSerfrom ,
                                              AV40BarSerto ,
                                              AV18BarColNomfrom ,
                                              AV19BarColNomto ,
                                              Integer.valueOf(AV20BarColNumfrom) ,
                                              Integer.valueOf(AV21BarColNumto) ,
                                              AV35BarNomClifrom ,
                                              AV36BarNomClito ,
                                              Integer.valueOf(AV37BarNumClifrom) ,
                                              Integer.valueOf(AV38BarNumClito) ,
                                              Short.valueOf(AV43BarTipArtfrom) ,
                                              Short.valueOf(AV44BarTipArtto) ,
                                              Integer.valueOf(AV12BarCodfrom) ,
                                              Integer.valueOf(AV17BarCodto) ,
                                              Byte.valueOf(AV15BarCodReofrom) ,
                                              Byte.valueOf(AV16BarCodReoto) ,
                                              AV13BarCodParfrom ,
                                              AV14BarCodParto ,
                                              AV5Cod_idtx ,
                                              AV34BarGirar ,
                                              AV77muestras ,
                                              Integer.valueOf(A14326CP_CLICOD) ,
                                              A14327CP_CLINOM ,
                                              A14324CP_BARDISN ,
                                              Byte.valueOf(A14352CP_BARESTR) ,
                                              Integer.valueOf(A14301CP_BARCOD) ,
                                              Byte.valueOf(A14302CP_BARCODR) ,
                                              A14303CP_BARCODP ,
                                              A14319CP_BARAGRE ,
                                              A14311CP_BARSER ,
                                              A14312CP_BARSERD ,
                                              Short.valueOf(A14316CP_BARTIPA) ,
                                              A14343CP_TARTDSC ,
                                              A14331CP_BARCOLO ,
                                              Integer.valueOf(A14332CP_BARCOLU) ,
                                              A14315CP_BARNOMC ,
                                              A14336CP_BARKGM ,
                                              A14337CP_BARMTR ,
                                              Integer.valueOf(A14338CP_BARPIE) ,
                                              Byte.valueOf(A14307CP_BARSIT) ,
                                              A14339CP_BARALBK ,
                                              A14340CP_BARALBM ,
                                              A14317CP_BARGIRA ,
                                              A14323CP_BARPROP ,
                                              A14334CP_DSC_BAR ,
                                              A14341CP_DISUSRC ,
                                              A14351CP_BARMAQC ,
                                              A14308CP_BARFECG ,
                                              A14310CP_BARFECS ,
                                              A14309CP_BARFECC ,
                                              A14304CP_BARFECF ,
                                              Integer.valueOf(A14305CP_BARNUMC) ,
                                              A14306CP_BARPLF ,
                                              AV59Emprcod ,
                                              A14328CP_EMPRCOD } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
         /* Using cursor H027M4 */
         pr_default.execute(2, new Object[] {AV59Emprcod, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, AV22BarDisNumfrom, AV23BarDisNumto, Integer.valueOf(AV45CliCodfrom), Integer.valueOf(AV46CliCodto), Byte.valueOf(AV41BarSitfrom), Byte.valueOf(AV42BarSitto), AV30BarFecGenfrom, AV31BarFecGento, AV32BarFecSalfrom, AV33BarFecSalto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV39BarSerfrom, AV40BarSerto, AV18BarColNomfrom, AV19BarColNomto, Integer.valueOf(AV20BarColNumfrom), Integer.valueOf(AV21BarColNumto), AV35BarNomClifrom, AV36BarNomClito, Integer.valueOf(AV37BarNumClifrom), Integer.valueOf(AV38BarNumClito), Short.valueOf(AV43BarTipArtfrom), Short.valueOf(AV44BarTipArtto), Integer.valueOf(AV12BarCodfrom), Integer.valueOf(AV17BarCodto), Byte.valueOf(AV15BarCodReofrom), Byte.valueOf(AV16BarCodReoto), AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV77muestras});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A14306CP_BARPLF = H027M4_A14306CP_BARPLF[0] ;
            A14305CP_BARNUMC = H027M4_A14305CP_BARNUMC[0] ;
            A14304CP_BARFECF = H027M4_A14304CP_BARFECF[0] ;
            A14309CP_BARFECC = H027M4_A14309CP_BARFECC[0] ;
            A14310CP_BARFECS = H027M4_A14310CP_BARFECS[0] ;
            A14308CP_BARFECG = H027M4_A14308CP_BARFECG[0] ;
            A14328CP_EMPRCOD = H027M4_A14328CP_EMPRCOD[0] ;
            A14351CP_BARMAQC = H027M4_A14351CP_BARMAQC[0] ;
            A14341CP_DISUSRC = H027M4_A14341CP_DISUSRC[0] ;
            A14334CP_DSC_BAR = H027M4_A14334CP_DSC_BAR[0] ;
            A14323CP_BARPROP = H027M4_A14323CP_BARPROP[0] ;
            A14317CP_BARGIRA = H027M4_A14317CP_BARGIRA[0] ;
            A14340CP_BARALBM = H027M4_A14340CP_BARALBM[0] ;
            A14339CP_BARALBK = H027M4_A14339CP_BARALBK[0] ;
            A14307CP_BARSIT = H027M4_A14307CP_BARSIT[0] ;
            A14338CP_BARPIE = H027M4_A14338CP_BARPIE[0] ;
            A14337CP_BARMTR = H027M4_A14337CP_BARMTR[0] ;
            A14336CP_BARKGM = H027M4_A14336CP_BARKGM[0] ;
            A14315CP_BARNOMC = H027M4_A14315CP_BARNOMC[0] ;
            A14332CP_BARCOLU = H027M4_A14332CP_BARCOLU[0] ;
            A14331CP_BARCOLO = H027M4_A14331CP_BARCOLO[0] ;
            A14343CP_TARTDSC = H027M4_A14343CP_TARTDSC[0] ;
            A14316CP_BARTIPA = H027M4_A14316CP_BARTIPA[0] ;
            A14312CP_BARSERD = H027M4_A14312CP_BARSERD[0] ;
            A14311CP_BARSER = H027M4_A14311CP_BARSER[0] ;
            A14319CP_BARAGRE = H027M4_A14319CP_BARAGRE[0] ;
            A14303CP_BARCODP = H027M4_A14303CP_BARCODP[0] ;
            A14302CP_BARCODR = H027M4_A14302CP_BARCODR[0] ;
            A14301CP_BARCOD = H027M4_A14301CP_BARCOD[0] ;
            A14352CP_BARESTR = H027M4_A14352CP_BARESTR[0] ;
            A14324CP_BARDISN = H027M4_A14324CP_BARDISN[0] ;
            A14327CP_CLINOM = H027M4_A14327CP_CLINOM[0] ;
            A14326CP_CLICOD = H027M4_A14326CP_CLICOD[0] ;
            AV154TotCP_BARKGM = A14336CP_BARKGM.add(AV154TotCP_BARKGM) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154TotCP_BARKGM", GXutil.ltrimstr( AV154TotCP_BARKGM, 18, 2));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV154TotCP_BARKGM, "ZZZZZ9.99")));
            AV155TotCP_BARMTR = A14337CP_BARMTR.add(AV155TotCP_BARMTR) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155TotCP_BARMTR", GXutil.ltrimstr( AV155TotCP_BARMTR, 18, 2));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV155TotCP_BARMTR, "ZZZZZ9.99")));
            AV156TotCP_BARPIE = (long)(A14338CP_BARPIE+AV156TotCP_BARPIE) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156TotCP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), 18, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), "ZZZZZ9")));
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV157TotValueCP_BARKGM = localUtil.format( AV154TotCP_BARKGM, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157TotValueCP_BARKGM", AV157TotValueCP_BARKGM);
         AV158TotValueCP_BARMTR = localUtil.format( AV155TotCP_BARMTR, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158TotValueCP_BARMTR", AV158TotValueCP_BARMTR);
         AV159TotValueCP_BARPIE = localUtil.format( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), "ZZZZZ9") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV159TotValueCP_BARPIE", AV159TotValueCP_BARPIE);
      }
      GXv_decimal19[0] = AV154TotCP_BARKGM ;
      GXv_decimal20[0] = AV155TotCP_BARMTR ;
      GXv_int21[0] = (short)(AV156TotCP_BARPIE) ;
      new app.listaconsultaproducciontotal(remoteHandle, context).execute( AV59Emprcod, AV45CliCodfrom, AV46CliCodto, AV22BarDisNumfrom, AV23BarDisNumto, AV30BarFecGenfrom, AV31BarFecGento, AV41BarSitfrom, AV42BarSitto, AV26BarFecClifrom, AV27BarFecClito, AV28BarFecFprfrom, AV29BarFecFprto, AV32BarFecSalfrom, AV33BarFecSalto, AV39BarSerfrom, AV40BarSerto, AV43BarTipArtfrom, AV44BarTipArtto, AV18BarColNomfrom, AV19BarColNomto, AV20BarColNumfrom, AV21BarColNumto, AV35BarNomClifrom, AV36BarNomClito, AV37BarNumClifrom, AV38BarNumClito, AV43BarTipArtfrom, AV44BarTipArtto, AV77muestras, AV12BarCodfrom, AV17BarCodto, AV15BarCodReofrom, AV16BarCodReoto, AV13BarCodParfrom, AV14BarCodParto, AV5Cod_idtx, AV34BarGirar, AV63FilterFullText, GXv_decimal19, GXv_decimal20, GXv_int21) ;
      listconsultaproduccion_impl.this.AV154TotCP_BARKGM = GXv_decimal19[0] ;
      listconsultaproduccion_impl.this.AV155TotCP_BARMTR = GXv_decimal20[0] ;
      listconsultaproduccion_impl.this.AV156TotCP_BARPIE = GXv_int21[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154TotCP_BARKGM", GXutil.ltrimstr( AV154TotCP_BARKGM, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV154TotCP_BARKGM, "ZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155TotCP_BARMTR", GXutil.ltrimstr( AV155TotCP_BARMTR, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV155TotCP_BARMTR, "ZZZZZ9.99")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156TotCP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCP_BARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), "ZZZZZ9")));
      AV157TotValueCP_BARKGM = localUtil.format( AV154TotCP_BARKGM, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157TotValueCP_BARKGM", AV157TotValueCP_BARKGM);
      AV158TotValueCP_BARMTR = localUtil.format( AV155TotCP_BARMTR, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158TotValueCP_BARMTR", AV158TotValueCP_BARMTR);
      AV159TotValueCP_BARPIE = localUtil.format( DecimalUtil.doubleToDec(AV156TotCP_BARPIE), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV159TotValueCP_BARPIE", AV159TotValueCP_BARPIE);
   }

   public void wb_table9_181_27M2( boolean wbgen )
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
         wb_table9_181_27M2e( true) ;
      }
      else
      {
         wb_table9_181_27M2e( false) ;
      }
   }

   public void wb_table8_176_27M2( boolean wbgen )
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
         wb_table8_176_27M2e( true) ;
      }
      else
      {
         wb_table8_176_27M2e( false) ;
      }
   }

   public void wb_table7_171_27M2( boolean wbgen )
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
         wb_table7_171_27M2e( true) ;
      }
      else
      {
         wb_table7_171_27M2e( false) ;
      }
   }

   public void wb_table6_166_27M2( boolean wbgen )
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
         wb_table6_166_27M2e( true) ;
      }
      else
      {
         wb_table6_166_27M2e( false) ;
      }
   }

   public void wb_table5_161_27M2( boolean wbgen )
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
         wb_table5_161_27M2e( true) ;
      }
      else
      {
         wb_table5_161_27M2e( false) ;
      }
   }

   public void wb_table4_156_27M2( boolean wbgen )
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
         wb_table4_156_27M2e( true) ;
      }
      else
      {
         wb_table4_156_27M2e( false) ;
      }
   }

   public void wb_table3_151_27M2( boolean wbgen )
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
         wb_table3_151_27M2e( true) ;
      }
      else
      {
         wb_table3_151_27M2e( false) ;
      }
   }

   public void wb_table2_87_27M2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecp_barkgm_Internalname, httpContext.getMessage( "Tot Value CP_BARKGM", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecp_barkgm_Internalname, AV157TotValueCP_BARKGM, GXutil.rtrim( localUtil.format( AV157TotValueCP_BARKGM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecp_barkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecp_barkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ListConsultaProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecp_barmtr_Internalname, httpContext.getMessage( "Tot Value CP_BARMTR", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecp_barmtr_Internalname, AV158TotValueCP_BARMTR, GXutil.rtrim( localUtil.format( AV158TotValueCP_BARMTR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecp_barmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecp_barmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ListConsultaProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecp_barpie_Internalname, httpContext.getMessage( "Tot Value CP_BARPIE", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecp_barpie_Internalname, AV159TotValueCP_BARPIE, GXutil.rtrim( localUtil.format( AV159TotValueCP_BARPIE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecp_barpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecp_barpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ListConsultaProduccion.htm");
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
         wb_table2_87_27M2e( true) ;
      }
      else
      {
         wb_table2_87_27M2e( false) ;
      }
   }

   public void wb_table1_25_27M2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV73ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_30_27M2( true) ;
      }
      else
      {
         wb_table10_30_27M2( false) ;
      }
      return  ;
   }

   public void wb_table10_30_27M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_27M2e( true) ;
      }
      else
      {
         wb_table1_25_27M2e( false) ;
      }
   }

   public void wb_table10_30_27M2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV63FilterFullText, GXutil.rtrim( localUtil.format( AV63FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ListConsultaProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_30_27M2e( true) ;
      }
      else
      {
         wb_table10_30_27M2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV9AuxEmprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AuxEmprcod", AV9AuxEmprcod);
      AV45CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCodfrom), 6, 0));
      AV46CliCodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CliCodto), 6, 0));
      AV22BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarDisNumfrom", AV22BarDisNumfrom);
      AV23BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarDisNumto", AV23BarDisNumto);
      AV30BarFecGenfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarFecGenfrom", localUtil.format(AV30BarFecGenfrom, "99/99/99"));
      AV31BarFecGento = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarFecGento", localUtil.format(AV31BarFecGento, "99/99/99"));
      AV41BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarSitfrom), 2, 0));
      AV42BarSitto = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42BarSitto), 2, 0));
      AV26BarFecClifrom = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarFecClifrom", localUtil.format(AV26BarFecClifrom, "99/99/99"));
      AV27BarFecClito = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarFecClito", localUtil.format(AV27BarFecClito, "99/99/99"));
      AV28BarFecFprfrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarFecFprfrom", localUtil.format(AV28BarFecFprfrom, "99/99/99"));
      AV29BarFecFprto = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarFecFprto", localUtil.format(AV29BarFecFprto, "99/99/99"));
      AV32BarFecSalfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarFecSalfrom", localUtil.format(AV32BarFecSalfrom, "99/99/99"));
      AV33BarFecSalto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarFecSalto", localUtil.format(AV33BarFecSalto, "99/99/99"));
      AV39BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39BarSerfrom", AV39BarSerfrom);
      AV40BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarSerto", AV40BarSerto);
      AV43BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarTipArtfrom), 4, 0));
      AV44BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarTipArtto), 4, 0));
      AV18BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarColNomfrom", AV18BarColNomfrom);
      AV19BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarColNomto", AV19BarColNomto);
      AV20BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarColNumfrom), 6, 0));
      AV21BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarColNumto), 6, 0));
      AV35BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarNomClifrom", AV35BarNomClifrom);
      AV36BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarNomClito", AV36BarNomClito);
      AV37BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,25,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarNumClifrom), 6, 0));
      AV38BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,26,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38BarNumClito), 6, 0));
      AV43BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarTipArtfrom), 4, 0));
      AV44BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarTipArtto), 4, 0));
      AV77muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77muestras", AV77muestras);
      AV12BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,30,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarCodfrom), 8, 0));
      AV17BarCodto = ((Number) GXutil.testNumericType( getParm(obj,31,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarCodto), 8, 0));
      AV15BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReofrom", GXutil.str( AV15BarCodReofrom, 1, 0));
      AV16BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarCodReoto", GXutil.str( AV16BarCodReoto, 1, 0));
      AV13BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarCodParfrom", AV13BarCodParfrom);
      AV14BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarCodParto", AV14BarCodParto);
      AV5Cod_idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Cod_idtx", AV5Cod_idtx);
      AV34BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarGirar", AV34BarGirar);
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
      pa27M2( ) ;
      ws27M2( ) ;
      we27M2( ) ;
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
      sCtrlAV9AuxEmprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV45CliCodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV46CliCodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV22BarDisNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV23BarDisNumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV30BarFecGenfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV31BarFecGento = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV41BarSitfrom = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV42BarSitto = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV26BarFecClifrom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV27BarFecClito = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV28BarFecFprfrom = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV29BarFecFprto = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV32BarFecSalfrom = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV33BarFecSalto = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV39BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV40BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV43BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV44BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV18BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV19BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV20BarColNumfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
      sCtrlAV21BarColNumto = (String)getParm(obj,22,TypeConstants.STRING) ;
      sCtrlAV35BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      sCtrlAV36BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      sCtrlAV37BarNumClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
      sCtrlAV38BarNumClito = (String)getParm(obj,26,TypeConstants.STRING) ;
      sCtrlAV43BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV44BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV77muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      sCtrlAV12BarCodfrom = (String)getParm(obj,30,TypeConstants.STRING) ;
      sCtrlAV17BarCodto = (String)getParm(obj,31,TypeConstants.STRING) ;
      sCtrlAV15BarCodReofrom = (String)getParm(obj,32,TypeConstants.STRING) ;
      sCtrlAV16BarCodReoto = (String)getParm(obj,33,TypeConstants.STRING) ;
      sCtrlAV13BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      sCtrlAV14BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      sCtrlAV5Cod_idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      sCtrlAV34BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa27M2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "listconsultaproduccion", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa27M2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV9AuxEmprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AuxEmprcod", AV9AuxEmprcod);
         AV45CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCodfrom), 6, 0));
         AV46CliCodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CliCodto), 6, 0));
         AV22BarDisNumfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarDisNumfrom", AV22BarDisNumfrom);
         AV23BarDisNumto = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarDisNumto", AV23BarDisNumto);
         AV30BarFecGenfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarFecGenfrom", localUtil.format(AV30BarFecGenfrom, "99/99/99"));
         AV31BarFecGento = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarFecGento", localUtil.format(AV31BarFecGento, "99/99/99"));
         AV41BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarSitfrom), 2, 0));
         AV42BarSitto = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42BarSitto), 2, 0));
         AV26BarFecClifrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarFecClifrom", localUtil.format(AV26BarFecClifrom, "99/99/99"));
         AV27BarFecClito = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarFecClito", localUtil.format(AV27BarFecClito, "99/99/99"));
         AV28BarFecFprfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarFecFprfrom", localUtil.format(AV28BarFecFprfrom, "99/99/99"));
         AV29BarFecFprto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarFecFprto", localUtil.format(AV29BarFecFprto, "99/99/99"));
         AV32BarFecSalfrom = (java.util.Date)getParm(obj,15,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarFecSalfrom", localUtil.format(AV32BarFecSalfrom, "99/99/99"));
         AV33BarFecSalto = (java.util.Date)getParm(obj,16,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarFecSalto", localUtil.format(AV33BarFecSalto, "99/99/99"));
         AV39BarSerfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39BarSerfrom", AV39BarSerfrom);
         AV40BarSerto = (String)getParm(obj,18,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarSerto", AV40BarSerto);
         AV43BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarTipArtfrom), 4, 0));
         AV44BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarTipArtto), 4, 0));
         AV18BarColNomfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarColNomfrom", AV18BarColNomfrom);
         AV19BarColNomto = (String)getParm(obj,22,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarColNomto", AV19BarColNomto);
         AV20BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarColNumfrom), 6, 0));
         AV21BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,24,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarColNumto), 6, 0));
         AV35BarNomClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarNomClifrom", AV35BarNomClifrom);
         AV36BarNomClito = (String)getParm(obj,26,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarNomClito", AV36BarNomClito);
         AV37BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,27,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarNumClifrom), 6, 0));
         AV38BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,28,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38BarNumClito), 6, 0));
         AV43BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarTipArtfrom), 4, 0));
         AV44BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarTipArtto), 4, 0));
         AV77muestras = (String)getParm(obj,31,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77muestras", AV77muestras);
         AV12BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarCodfrom), 8, 0));
         AV17BarCodto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarCodto), 8, 0));
         AV15BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,34,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReofrom", GXutil.str( AV15BarCodReofrom, 1, 0));
         AV16BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,35,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarCodReoto", GXutil.str( AV16BarCodReoto, 1, 0));
         AV13BarCodParfrom = (String)getParm(obj,36,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarCodParfrom", AV13BarCodParfrom);
         AV14BarCodParto = (String)getParm(obj,37,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarCodParto", AV14BarCodParto);
         AV5Cod_idtx = (String)getParm(obj,38,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Cod_idtx", AV5Cod_idtx);
         AV34BarGirar = (String)getParm(obj,39,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarGirar", AV34BarGirar);
      }
      wcpOAV9AuxEmprcod = httpContext.cgiGet( sPrefix+"wcpOAV9AuxEmprcod") ;
      wcpOAV45CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV46CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV22BarDisNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV22BarDisNumfrom") ;
      wcpOAV23BarDisNumto = httpContext.cgiGet( sPrefix+"wcpOAV23BarDisNumto") ;
      wcpOAV30BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30BarFecGenfrom"), 0) ;
      wcpOAV31BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31BarFecGento"), 0) ;
      wcpOAV41BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV42BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV26BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26BarFecClifrom"), 0) ;
      wcpOAV27BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV27BarFecClito"), 0) ;
      wcpOAV28BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV28BarFecFprfrom"), 0) ;
      wcpOAV29BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV29BarFecFprto"), 0) ;
      wcpOAV32BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV32BarFecSalfrom"), 0) ;
      wcpOAV33BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV33BarFecSalto"), 0) ;
      wcpOAV39BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV39BarSerfrom") ;
      wcpOAV40BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV40BarSerto") ;
      wcpOAV43BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV44BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV18BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV18BarColNomfrom") ;
      wcpOAV19BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV19BarColNomto") ;
      wcpOAV20BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV20BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV21BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV35BarNomClifrom") ;
      wcpOAV36BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV36BarNomClito") ;
      wcpOAV37BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV38BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV77muestras = httpContext.cgiGet( sPrefix+"wcpOAV77muestras") ;
      wcpOAV12BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV17BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV15BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV16BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV13BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV13BarCodParfrom") ;
      wcpOAV14BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV14BarCodParto") ;
      wcpOAV5Cod_idtx = httpContext.cgiGet( sPrefix+"wcpOAV5Cod_idtx") ;
      wcpOAV34BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV34BarGirar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV9AuxEmprcod, wcpOAV9AuxEmprcod) != 0 ) || ( AV45CliCodfrom != wcpOAV45CliCodfrom ) || ( AV46CliCodto != wcpOAV46CliCodto ) || ( GXutil.strcmp(AV22BarDisNumfrom, wcpOAV22BarDisNumfrom) != 0 ) || ( GXutil.strcmp(AV23BarDisNumto, wcpOAV23BarDisNumto) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV30BarFecGenfrom), GXutil.resetTime(wcpOAV30BarFecGenfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV31BarFecGento), GXutil.resetTime(wcpOAV31BarFecGento)) ) || ( AV41BarSitfrom != wcpOAV41BarSitfrom ) || ( AV42BarSitto != wcpOAV42BarSitto ) || !( GXutil.dateCompare(GXutil.resetTime(AV26BarFecClifrom), GXutil.resetTime(wcpOAV26BarFecClifrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV27BarFecClito), GXutil.resetTime(wcpOAV27BarFecClito)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV28BarFecFprfrom), GXutil.resetTime(wcpOAV28BarFecFprfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV29BarFecFprto), GXutil.resetTime(wcpOAV29BarFecFprto)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV32BarFecSalfrom), GXutil.resetTime(wcpOAV32BarFecSalfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV33BarFecSalto), GXutil.resetTime(wcpOAV33BarFecSalto)) ) || ( GXutil.strcmp(AV39BarSerfrom, wcpOAV39BarSerfrom) != 0 ) || ( GXutil.strcmp(AV40BarSerto, wcpOAV40BarSerto) != 0 ) || ( AV43BarTipArtfrom != wcpOAV43BarTipArtfrom ) || ( AV44BarTipArtto != wcpOAV44BarTipArtto ) || ( GXutil.strcmp(AV18BarColNomfrom, wcpOAV18BarColNomfrom) != 0 ) || ( GXutil.strcmp(AV19BarColNomto, wcpOAV19BarColNomto) != 0 ) || ( AV20BarColNumfrom != wcpOAV20BarColNumfrom ) || ( AV21BarColNumto != wcpOAV21BarColNumto ) || ( GXutil.strcmp(AV35BarNomClifrom, wcpOAV35BarNomClifrom) != 0 ) || ( GXutil.strcmp(AV36BarNomClito, wcpOAV36BarNomClito) != 0 ) || ( AV37BarNumClifrom != wcpOAV37BarNumClifrom ) || ( AV38BarNumClito != wcpOAV38BarNumClito ) || ( GXutil.strcmp(AV77muestras, wcpOAV77muestras) != 0 ) || ( AV12BarCodfrom != wcpOAV12BarCodfrom ) || ( AV17BarCodto != wcpOAV17BarCodto ) || ( AV15BarCodReofrom != wcpOAV15BarCodReofrom ) || ( AV16BarCodReoto != wcpOAV16BarCodReoto ) || ( GXutil.strcmp(AV13BarCodParfrom, wcpOAV13BarCodParfrom) != 0 ) || ( GXutil.strcmp(AV14BarCodParto, wcpOAV14BarCodParto) != 0 ) || ( GXutil.strcmp(AV5Cod_idtx, wcpOAV5Cod_idtx) != 0 ) || ( GXutil.strcmp(AV34BarGirar, wcpOAV34BarGirar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV9AuxEmprcod = AV9AuxEmprcod ;
      wcpOAV45CliCodfrom = AV45CliCodfrom ;
      wcpOAV46CliCodto = AV46CliCodto ;
      wcpOAV22BarDisNumfrom = AV22BarDisNumfrom ;
      wcpOAV23BarDisNumto = AV23BarDisNumto ;
      wcpOAV30BarFecGenfrom = AV30BarFecGenfrom ;
      wcpOAV31BarFecGento = AV31BarFecGento ;
      wcpOAV41BarSitfrom = AV41BarSitfrom ;
      wcpOAV42BarSitto = AV42BarSitto ;
      wcpOAV26BarFecClifrom = AV26BarFecClifrom ;
      wcpOAV27BarFecClito = AV27BarFecClito ;
      wcpOAV28BarFecFprfrom = AV28BarFecFprfrom ;
      wcpOAV29BarFecFprto = AV29BarFecFprto ;
      wcpOAV32BarFecSalfrom = AV32BarFecSalfrom ;
      wcpOAV33BarFecSalto = AV33BarFecSalto ;
      wcpOAV39BarSerfrom = AV39BarSerfrom ;
      wcpOAV40BarSerto = AV40BarSerto ;
      wcpOAV43BarTipArtfrom = AV43BarTipArtfrom ;
      wcpOAV44BarTipArtto = AV44BarTipArtto ;
      wcpOAV18BarColNomfrom = AV18BarColNomfrom ;
      wcpOAV19BarColNomto = AV19BarColNomto ;
      wcpOAV20BarColNumfrom = AV20BarColNumfrom ;
      wcpOAV21BarColNumto = AV21BarColNumto ;
      wcpOAV35BarNomClifrom = AV35BarNomClifrom ;
      wcpOAV36BarNomClito = AV36BarNomClito ;
      wcpOAV37BarNumClifrom = AV37BarNumClifrom ;
      wcpOAV38BarNumClito = AV38BarNumClito ;
      wcpOAV77muestras = AV77muestras ;
      wcpOAV12BarCodfrom = AV12BarCodfrom ;
      wcpOAV17BarCodto = AV17BarCodto ;
      wcpOAV15BarCodReofrom = AV15BarCodReofrom ;
      wcpOAV16BarCodReoto = AV16BarCodReoto ;
      wcpOAV13BarCodParfrom = AV13BarCodParfrom ;
      wcpOAV14BarCodParto = AV14BarCodParto ;
      wcpOAV5Cod_idtx = AV5Cod_idtx ;
      wcpOAV34BarGirar = AV34BarGirar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV9AuxEmprcod = httpContext.cgiGet( sPrefix+"AV9AuxEmprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV9AuxEmprcod) > 0 )
      {
         AV9AuxEmprcod = httpContext.cgiGet( sCtrlAV9AuxEmprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AuxEmprcod", AV9AuxEmprcod);
      }
      else
      {
         AV9AuxEmprcod = httpContext.cgiGet( sPrefix+"AV9AuxEmprcod_PARM") ;
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
      sCtrlAV22BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV22BarDisNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV22BarDisNumfrom) > 0 )
      {
         AV22BarDisNumfrom = httpContext.cgiGet( sCtrlAV22BarDisNumfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22BarDisNumfrom", AV22BarDisNumfrom);
      }
      else
      {
         AV22BarDisNumfrom = httpContext.cgiGet( sPrefix+"AV22BarDisNumfrom_PARM") ;
      }
      sCtrlAV23BarDisNumto = httpContext.cgiGet( sPrefix+"AV23BarDisNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV23BarDisNumto) > 0 )
      {
         AV23BarDisNumto = httpContext.cgiGet( sCtrlAV23BarDisNumto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23BarDisNumto", AV23BarDisNumto);
      }
      else
      {
         AV23BarDisNumto = httpContext.cgiGet( sPrefix+"AV23BarDisNumto_PARM") ;
      }
      sCtrlAV30BarFecGenfrom = httpContext.cgiGet( sPrefix+"AV30BarFecGenfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV30BarFecGenfrom) > 0 )
      {
         AV30BarFecGenfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV30BarFecGenfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarFecGenfrom", localUtil.format(AV30BarFecGenfrom, "99/99/99"));
      }
      else
      {
         AV30BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV30BarFecGenfrom_PARM"), 0) ;
      }
      sCtrlAV31BarFecGento = httpContext.cgiGet( sPrefix+"AV31BarFecGento_CTRL") ;
      if ( GXutil.len( sCtrlAV31BarFecGento) > 0 )
      {
         AV31BarFecGento = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV31BarFecGento), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarFecGento", localUtil.format(AV31BarFecGento, "99/99/99"));
      }
      else
      {
         AV31BarFecGento = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV31BarFecGento_PARM"), 0) ;
      }
      sCtrlAV41BarSitfrom = httpContext.cgiGet( sPrefix+"AV41BarSitfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV41BarSitfrom) > 0 )
      {
         AV41BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV41BarSitfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarSitfrom), 2, 0));
      }
      else
      {
         AV41BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV41BarSitfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV42BarSitto = httpContext.cgiGet( sPrefix+"AV42BarSitto_CTRL") ;
      if ( GXutil.len( sCtrlAV42BarSitto) > 0 )
      {
         AV42BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV42BarSitto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42BarSitto), 2, 0));
      }
      else
      {
         AV42BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV42BarSitto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV26BarFecClifrom = httpContext.cgiGet( sPrefix+"AV26BarFecClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV26BarFecClifrom) > 0 )
      {
         AV26BarFecClifrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV26BarFecClifrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarFecClifrom", localUtil.format(AV26BarFecClifrom, "99/99/99"));
      }
      else
      {
         AV26BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV26BarFecClifrom_PARM"), 0) ;
      }
      sCtrlAV27BarFecClito = httpContext.cgiGet( sPrefix+"AV27BarFecClito_CTRL") ;
      if ( GXutil.len( sCtrlAV27BarFecClito) > 0 )
      {
         AV27BarFecClito = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV27BarFecClito), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27BarFecClito", localUtil.format(AV27BarFecClito, "99/99/99"));
      }
      else
      {
         AV27BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV27BarFecClito_PARM"), 0) ;
      }
      sCtrlAV28BarFecFprfrom = httpContext.cgiGet( sPrefix+"AV28BarFecFprfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV28BarFecFprfrom) > 0 )
      {
         AV28BarFecFprfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV28BarFecFprfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28BarFecFprfrom", localUtil.format(AV28BarFecFprfrom, "99/99/99"));
      }
      else
      {
         AV28BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV28BarFecFprfrom_PARM"), 0) ;
      }
      sCtrlAV29BarFecFprto = httpContext.cgiGet( sPrefix+"AV29BarFecFprto_CTRL") ;
      if ( GXutil.len( sCtrlAV29BarFecFprto) > 0 )
      {
         AV29BarFecFprto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV29BarFecFprto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarFecFprto", localUtil.format(AV29BarFecFprto, "99/99/99"));
      }
      else
      {
         AV29BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV29BarFecFprto_PARM"), 0) ;
      }
      sCtrlAV32BarFecSalfrom = httpContext.cgiGet( sPrefix+"AV32BarFecSalfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV32BarFecSalfrom) > 0 )
      {
         AV32BarFecSalfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV32BarFecSalfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarFecSalfrom", localUtil.format(AV32BarFecSalfrom, "99/99/99"));
      }
      else
      {
         AV32BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV32BarFecSalfrom_PARM"), 0) ;
      }
      sCtrlAV33BarFecSalto = httpContext.cgiGet( sPrefix+"AV33BarFecSalto_CTRL") ;
      if ( GXutil.len( sCtrlAV33BarFecSalto) > 0 )
      {
         AV33BarFecSalto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV33BarFecSalto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarFecSalto", localUtil.format(AV33BarFecSalto, "99/99/99"));
      }
      else
      {
         AV33BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV33BarFecSalto_PARM"), 0) ;
      }
      sCtrlAV39BarSerfrom = httpContext.cgiGet( sPrefix+"AV39BarSerfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV39BarSerfrom) > 0 )
      {
         AV39BarSerfrom = httpContext.cgiGet( sCtrlAV39BarSerfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39BarSerfrom", AV39BarSerfrom);
      }
      else
      {
         AV39BarSerfrom = httpContext.cgiGet( sPrefix+"AV39BarSerfrom_PARM") ;
      }
      sCtrlAV40BarSerto = httpContext.cgiGet( sPrefix+"AV40BarSerto_CTRL") ;
      if ( GXutil.len( sCtrlAV40BarSerto) > 0 )
      {
         AV40BarSerto = httpContext.cgiGet( sCtrlAV40BarSerto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40BarSerto", AV40BarSerto);
      }
      else
      {
         AV40BarSerto = httpContext.cgiGet( sPrefix+"AV40BarSerto_PARM") ;
      }
      sCtrlAV43BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV43BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV43BarTipArtfrom) > 0 )
      {
         AV43BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV43BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarTipArtfrom), 4, 0));
      }
      else
      {
         AV43BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV43BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV44BarTipArtto = httpContext.cgiGet( sPrefix+"AV44BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV44BarTipArtto) > 0 )
      {
         AV44BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV44BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarTipArtto), 4, 0));
      }
      else
      {
         AV44BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV44BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV18BarColNomfrom = httpContext.cgiGet( sPrefix+"AV18BarColNomfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV18BarColNomfrom) > 0 )
      {
         AV18BarColNomfrom = httpContext.cgiGet( sCtrlAV18BarColNomfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18BarColNomfrom", AV18BarColNomfrom);
      }
      else
      {
         AV18BarColNomfrom = httpContext.cgiGet( sPrefix+"AV18BarColNomfrom_PARM") ;
      }
      sCtrlAV19BarColNomto = httpContext.cgiGet( sPrefix+"AV19BarColNomto_CTRL") ;
      if ( GXutil.len( sCtrlAV19BarColNomto) > 0 )
      {
         AV19BarColNomto = httpContext.cgiGet( sCtrlAV19BarColNomto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19BarColNomto", AV19BarColNomto);
      }
      else
      {
         AV19BarColNomto = httpContext.cgiGet( sPrefix+"AV19BarColNomto_PARM") ;
      }
      sCtrlAV20BarColNumfrom = httpContext.cgiGet( sPrefix+"AV20BarColNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV20BarColNumfrom) > 0 )
      {
         AV20BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV20BarColNumfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarColNumfrom), 6, 0));
      }
      else
      {
         AV20BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV20BarColNumfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV21BarColNumto = httpContext.cgiGet( sPrefix+"AV21BarColNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV21BarColNumto) > 0 )
      {
         AV21BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV21BarColNumto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarColNumto), 6, 0));
      }
      else
      {
         AV21BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV21BarColNumto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35BarNomClifrom = httpContext.cgiGet( sPrefix+"AV35BarNomClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV35BarNomClifrom) > 0 )
      {
         AV35BarNomClifrom = httpContext.cgiGet( sCtrlAV35BarNomClifrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35BarNomClifrom", AV35BarNomClifrom);
      }
      else
      {
         AV35BarNomClifrom = httpContext.cgiGet( sPrefix+"AV35BarNomClifrom_PARM") ;
      }
      sCtrlAV36BarNomClito = httpContext.cgiGet( sPrefix+"AV36BarNomClito_CTRL") ;
      if ( GXutil.len( sCtrlAV36BarNomClito) > 0 )
      {
         AV36BarNomClito = httpContext.cgiGet( sCtrlAV36BarNomClito) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36BarNomClito", AV36BarNomClito);
      }
      else
      {
         AV36BarNomClito = httpContext.cgiGet( sPrefix+"AV36BarNomClito_PARM") ;
      }
      sCtrlAV37BarNumClifrom = httpContext.cgiGet( sPrefix+"AV37BarNumClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV37BarNumClifrom) > 0 )
      {
         AV37BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37BarNumClifrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarNumClifrom), 6, 0));
      }
      else
      {
         AV37BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37BarNumClifrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV38BarNumClito = httpContext.cgiGet( sPrefix+"AV38BarNumClito_CTRL") ;
      if ( GXutil.len( sCtrlAV38BarNumClito) > 0 )
      {
         AV38BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV38BarNumClito), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38BarNumClito), 6, 0));
      }
      else
      {
         AV38BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV38BarNumClito_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV43BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV43BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV43BarTipArtfrom) > 0 )
      {
         AV43BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV43BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarTipArtfrom), 4, 0));
      }
      else
      {
         AV43BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV43BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV44BarTipArtto = httpContext.cgiGet( sPrefix+"AV44BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV44BarTipArtto) > 0 )
      {
         AV44BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV44BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarTipArtto), 4, 0));
      }
      else
      {
         AV44BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV44BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV77muestras = httpContext.cgiGet( sPrefix+"AV77muestras_CTRL") ;
      if ( GXutil.len( sCtrlAV77muestras) > 0 )
      {
         AV77muestras = httpContext.cgiGet( sCtrlAV77muestras) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77muestras", AV77muestras);
      }
      else
      {
         AV77muestras = httpContext.cgiGet( sPrefix+"AV77muestras_PARM") ;
      }
      sCtrlAV12BarCodfrom = httpContext.cgiGet( sPrefix+"AV12BarCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV12BarCodfrom) > 0 )
      {
         AV12BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV12BarCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarCodfrom), 8, 0));
      }
      else
      {
         AV12BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV12BarCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17BarCodto = httpContext.cgiGet( sPrefix+"AV17BarCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV17BarCodto) > 0 )
      {
         AV17BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV17BarCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarCodto), 8, 0));
      }
      else
      {
         AV17BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV17BarCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV15BarCodReofrom = httpContext.cgiGet( sPrefix+"AV15BarCodReofrom_CTRL") ;
      if ( GXutil.len( sCtrlAV15BarCodReofrom) > 0 )
      {
         AV15BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15BarCodReofrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReofrom", GXutil.str( AV15BarCodReofrom, 1, 0));
      }
      else
      {
         AV15BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15BarCodReofrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV16BarCodReoto = httpContext.cgiGet( sPrefix+"AV16BarCodReoto_CTRL") ;
      if ( GXutil.len( sCtrlAV16BarCodReoto) > 0 )
      {
         AV16BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV16BarCodReoto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarCodReoto", GXutil.str( AV16BarCodReoto, 1, 0));
      }
      else
      {
         AV16BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV16BarCodReoto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV13BarCodParfrom = httpContext.cgiGet( sPrefix+"AV13BarCodParfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV13BarCodParfrom) > 0 )
      {
         AV13BarCodParfrom = httpContext.cgiGet( sCtrlAV13BarCodParfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarCodParfrom", AV13BarCodParfrom);
      }
      else
      {
         AV13BarCodParfrom = httpContext.cgiGet( sPrefix+"AV13BarCodParfrom_PARM") ;
      }
      sCtrlAV14BarCodParto = httpContext.cgiGet( sPrefix+"AV14BarCodParto_CTRL") ;
      if ( GXutil.len( sCtrlAV14BarCodParto) > 0 )
      {
         AV14BarCodParto = httpContext.cgiGet( sCtrlAV14BarCodParto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarCodParto", AV14BarCodParto);
      }
      else
      {
         AV14BarCodParto = httpContext.cgiGet( sPrefix+"AV14BarCodParto_PARM") ;
      }
      sCtrlAV5Cod_idtx = httpContext.cgiGet( sPrefix+"AV5Cod_idtx_CTRL") ;
      if ( GXutil.len( sCtrlAV5Cod_idtx) > 0 )
      {
         AV5Cod_idtx = httpContext.cgiGet( sCtrlAV5Cod_idtx) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Cod_idtx", AV5Cod_idtx);
      }
      else
      {
         AV5Cod_idtx = httpContext.cgiGet( sPrefix+"AV5Cod_idtx_PARM") ;
      }
      sCtrlAV34BarGirar = httpContext.cgiGet( sPrefix+"AV34BarGirar_CTRL") ;
      if ( GXutil.len( sCtrlAV34BarGirar) > 0 )
      {
         AV34BarGirar = httpContext.cgiGet( sCtrlAV34BarGirar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarGirar", AV34BarGirar);
      }
      else
      {
         AV34BarGirar = httpContext.cgiGet( sPrefix+"AV34BarGirar_PARM") ;
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
      pa27M2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws27M2( ) ;
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
      ws27M2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9AuxEmprcod_PARM", GXutil.rtrim( AV9AuxEmprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9AuxEmprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9AuxEmprcod_CTRL", GXutil.rtrim( sCtrlAV9AuxEmprcod));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22BarDisNumfrom_PARM", GXutil.rtrim( AV22BarDisNumfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22BarDisNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22BarDisNumfrom_CTRL", GXutil.rtrim( sCtrlAV22BarDisNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23BarDisNumto_PARM", GXutil.rtrim( AV23BarDisNumto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23BarDisNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23BarDisNumto_CTRL", GXutil.rtrim( sCtrlAV23BarDisNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarFecGenfrom_PARM", localUtil.dtoc( AV30BarFecGenfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30BarFecGenfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarFecGenfrom_CTRL", GXutil.rtrim( sCtrlAV30BarFecGenfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarFecGento_PARM", localUtil.dtoc( AV31BarFecGento, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31BarFecGento)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarFecGento_CTRL", GXutil.rtrim( sCtrlAV31BarFecGento));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41BarSitfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV41BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41BarSitfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41BarSitfrom_CTRL", GXutil.rtrim( sCtrlAV41BarSitfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarSitto_PARM", GXutil.ltrim( localUtil.ntoc( AV42BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42BarSitto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarSitto_CTRL", GXutil.rtrim( sCtrlAV42BarSitto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarFecClifrom_PARM", localUtil.dtoc( AV26BarFecClifrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26BarFecClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarFecClifrom_CTRL", GXutil.rtrim( sCtrlAV26BarFecClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27BarFecClito_PARM", localUtil.dtoc( AV27BarFecClito, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27BarFecClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27BarFecClito_CTRL", GXutil.rtrim( sCtrlAV27BarFecClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28BarFecFprfrom_PARM", localUtil.dtoc( AV28BarFecFprfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28BarFecFprfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28BarFecFprfrom_CTRL", GXutil.rtrim( sCtrlAV28BarFecFprfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarFecFprto_PARM", localUtil.dtoc( AV29BarFecFprto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29BarFecFprto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarFecFprto_CTRL", GXutil.rtrim( sCtrlAV29BarFecFprto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarFecSalfrom_PARM", localUtil.dtoc( AV32BarFecSalfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32BarFecSalfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarFecSalfrom_CTRL", GXutil.rtrim( sCtrlAV32BarFecSalfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarFecSalto_PARM", localUtil.dtoc( AV33BarFecSalto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33BarFecSalto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarFecSalto_CTRL", GXutil.rtrim( sCtrlAV33BarFecSalto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39BarSerfrom_PARM", GXutil.rtrim( AV39BarSerfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39BarSerfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39BarSerfrom_CTRL", GXutil.rtrim( sCtrlAV39BarSerfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40BarSerto_PARM", GXutil.rtrim( AV40BarSerto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40BarSerto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40BarSerto_CTRL", GXutil.rtrim( sCtrlAV40BarSerto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV43BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV43BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV44BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV44BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18BarColNomfrom_PARM", GXutil.rtrim( AV18BarColNomfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18BarColNomfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18BarColNomfrom_CTRL", GXutil.rtrim( sCtrlAV18BarColNomfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19BarColNomto_PARM", GXutil.rtrim( AV19BarColNomto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19BarColNomto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19BarColNomto_CTRL", GXutil.rtrim( sCtrlAV19BarColNomto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20BarColNumfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV20BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20BarColNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20BarColNumfrom_CTRL", GXutil.rtrim( sCtrlAV20BarColNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21BarColNumto_PARM", GXutil.ltrim( localUtil.ntoc( AV21BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21BarColNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21BarColNumto_CTRL", GXutil.rtrim( sCtrlAV21BarColNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarNomClifrom_PARM", GXutil.rtrim( AV35BarNomClifrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35BarNomClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35BarNomClifrom_CTRL", GXutil.rtrim( sCtrlAV35BarNomClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36BarNomClito_PARM", GXutil.rtrim( AV36BarNomClito));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36BarNomClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36BarNomClito_CTRL", GXutil.rtrim( sCtrlAV36BarNomClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37BarNumClifrom_PARM", GXutil.ltrim( localUtil.ntoc( AV37BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37BarNumClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37BarNumClifrom_CTRL", GXutil.rtrim( sCtrlAV37BarNumClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38BarNumClito_PARM", GXutil.ltrim( localUtil.ntoc( AV38BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38BarNumClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38BarNumClito_CTRL", GXutil.rtrim( sCtrlAV38BarNumClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV43BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV43BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV44BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV44BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77muestras_PARM", GXutil.rtrim( AV77muestras));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV77muestras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77muestras_CTRL", GXutil.rtrim( sCtrlAV77muestras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV12BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12BarCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarCodfrom_CTRL", GXutil.rtrim( sCtrlAV12BarCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17BarCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV17BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17BarCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17BarCodto_CTRL", GXutil.rtrim( sCtrlAV17BarCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarCodReofrom_PARM", GXutil.ltrim( localUtil.ntoc( AV15BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15BarCodReofrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarCodReofrom_CTRL", GXutil.rtrim( sCtrlAV15BarCodReofrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16BarCodReoto_PARM", GXutil.ltrim( localUtil.ntoc( AV16BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16BarCodReoto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16BarCodReoto_CTRL", GXutil.rtrim( sCtrlAV16BarCodReoto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarCodParfrom_PARM", GXutil.rtrim( AV13BarCodParfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13BarCodParfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarCodParfrom_CTRL", GXutil.rtrim( sCtrlAV13BarCodParfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14BarCodParto_PARM", GXutil.rtrim( AV14BarCodParto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14BarCodParto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14BarCodParto_CTRL", GXutil.rtrim( sCtrlAV14BarCodParto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Cod_idtx_PARM", GXutil.rtrim( AV5Cod_idtx));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Cod_idtx)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Cod_idtx_CTRL", GXutil.rtrim( sCtrlAV5Cod_idtx));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarGirar_PARM", GXutil.rtrim( AV34BarGirar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34BarGirar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34BarGirar_CTRL", GXutil.rtrim( sCtrlAV34BarGirar));
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
      we27M2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116104593", true, true);
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
      httpContext.AddJavascriptSource("listconsultaproduccion.js", "?202682116104594", false, true);
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

   public void subsflControlProps_432( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_43_idx );
      edtCP_ID_Internalname = sPrefix+"CP_ID_"+sGXsfl_43_idx ;
      edtCP_EMPRCOD_Internalname = sPrefix+"CP_EMPRCOD_"+sGXsfl_43_idx ;
      edtCP_CLICOD_Internalname = sPrefix+"CP_CLICOD_"+sGXsfl_43_idx ;
      edtCP_CLINOM_Internalname = sPrefix+"CP_CLINOM_"+sGXsfl_43_idx ;
      edtCP_BARDISN_Internalname = sPrefix+"CP_BARDISN_"+sGXsfl_43_idx ;
      cmbCP_BARESTR.setInternalname( sPrefix+"CP_BARESTR_"+sGXsfl_43_idx );
      edtCP_BARCOD_Internalname = sPrefix+"CP_BARCOD_"+sGXsfl_43_idx ;
      edtCP_BARCODR_Internalname = sPrefix+"CP_BARCODR_"+sGXsfl_43_idx ;
      edtCP_BARCODP_Internalname = sPrefix+"CP_BARCODP_"+sGXsfl_43_idx ;
      edtCP_BARAGRE_Internalname = sPrefix+"CP_BARAGRE_"+sGXsfl_43_idx ;
      edtCP_BARSER_Internalname = sPrefix+"CP_BARSER_"+sGXsfl_43_idx ;
      edtCP_BARSERD_Internalname = sPrefix+"CP_BARSERD_"+sGXsfl_43_idx ;
      edtCP_BARTIPA_Internalname = sPrefix+"CP_BARTIPA_"+sGXsfl_43_idx ;
      edtCP_TARTDSC_Internalname = sPrefix+"CP_TARTDSC_"+sGXsfl_43_idx ;
      edtCP_BARCOLO_Internalname = sPrefix+"CP_BARCOLO_"+sGXsfl_43_idx ;
      edtCP_BARCOLU_Internalname = sPrefix+"CP_BARCOLU_"+sGXsfl_43_idx ;
      edtCP_BARNOMC_Internalname = sPrefix+"CP_BARNOMC_"+sGXsfl_43_idx ;
      edtCP_BARKGM_Internalname = sPrefix+"CP_BARKGM_"+sGXsfl_43_idx ;
      edtCP_BARMTR_Internalname = sPrefix+"CP_BARMTR_"+sGXsfl_43_idx ;
      edtCP_BARPIE_Internalname = sPrefix+"CP_BARPIE_"+sGXsfl_43_idx ;
      edtCP_BARSIT_Internalname = sPrefix+"CP_BARSIT_"+sGXsfl_43_idx ;
      edtCP_BARFECG_Internalname = sPrefix+"CP_BARFECG_"+sGXsfl_43_idx ;
      edtCP_BARFECC_Internalname = sPrefix+"CP_BARFECC_"+sGXsfl_43_idx ;
      edtCP_BARFECF_Internalname = sPrefix+"CP_BARFECF_"+sGXsfl_43_idx ;
      edtCP_BARFECS_Internalname = sPrefix+"CP_BARFECS_"+sGXsfl_43_idx ;
      edtavBarfascod_Internalname = sPrefix+"vBARFASCOD_"+sGXsfl_43_idx ;
      edtavBarfassig_Internalname = sPrefix+"vBARFASSIG_"+sGXsfl_43_idx ;
      edtavBaralbultimo_Internalname = sPrefix+"vBARALBULTIMO_"+sGXsfl_43_idx ;
      edtCP_BARALBK_Internalname = sPrefix+"CP_BARALBK_"+sGXsfl_43_idx ;
      edtCP_BARALBM_Internalname = sPrefix+"CP_BARALBM_"+sGXsfl_43_idx ;
      edtavBaralbfact_Internalname = sPrefix+"vBARALBFACT_"+sGXsfl_43_idx ;
      edtCP_BARGIRA_Internalname = sPrefix+"CP_BARGIRA_"+sGXsfl_43_idx ;
      edtCP_BARPROP_Internalname = sPrefix+"CP_BARPROP_"+sGXsfl_43_idx ;
      edtCP_DSC_BAR_Internalname = sPrefix+"CP_DSC_BAR_"+sGXsfl_43_idx ;
      edtCP_DISUSRC_Internalname = sPrefix+"CP_DISUSRC_"+sGXsfl_43_idx ;
      edtCP_BAREXT_Internalname = sPrefix+"CP_BAREXT_"+sGXsfl_43_idx ;
      edtCP_DISDES_Internalname = sPrefix+"CP_DISDES_"+sGXsfl_43_idx ;
      edtCP_DISCOD_Internalname = sPrefix+"CP_DISCOD_"+sGXsfl_43_idx ;
      edtCP_BARMAQC_Internalname = sPrefix+"CP_BARMAQC_"+sGXsfl_43_idx ;
      edtCP_BARPLF_Internalname = sPrefix+"CP_BARPLF_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_43_fel_idx );
      edtCP_ID_Internalname = sPrefix+"CP_ID_"+sGXsfl_43_fel_idx ;
      edtCP_EMPRCOD_Internalname = sPrefix+"CP_EMPRCOD_"+sGXsfl_43_fel_idx ;
      edtCP_CLICOD_Internalname = sPrefix+"CP_CLICOD_"+sGXsfl_43_fel_idx ;
      edtCP_CLINOM_Internalname = sPrefix+"CP_CLINOM_"+sGXsfl_43_fel_idx ;
      edtCP_BARDISN_Internalname = sPrefix+"CP_BARDISN_"+sGXsfl_43_fel_idx ;
      cmbCP_BARESTR.setInternalname( sPrefix+"CP_BARESTR_"+sGXsfl_43_fel_idx );
      edtCP_BARCOD_Internalname = sPrefix+"CP_BARCOD_"+sGXsfl_43_fel_idx ;
      edtCP_BARCODR_Internalname = sPrefix+"CP_BARCODR_"+sGXsfl_43_fel_idx ;
      edtCP_BARCODP_Internalname = sPrefix+"CP_BARCODP_"+sGXsfl_43_fel_idx ;
      edtCP_BARAGRE_Internalname = sPrefix+"CP_BARAGRE_"+sGXsfl_43_fel_idx ;
      edtCP_BARSER_Internalname = sPrefix+"CP_BARSER_"+sGXsfl_43_fel_idx ;
      edtCP_BARSERD_Internalname = sPrefix+"CP_BARSERD_"+sGXsfl_43_fel_idx ;
      edtCP_BARTIPA_Internalname = sPrefix+"CP_BARTIPA_"+sGXsfl_43_fel_idx ;
      edtCP_TARTDSC_Internalname = sPrefix+"CP_TARTDSC_"+sGXsfl_43_fel_idx ;
      edtCP_BARCOLO_Internalname = sPrefix+"CP_BARCOLO_"+sGXsfl_43_fel_idx ;
      edtCP_BARCOLU_Internalname = sPrefix+"CP_BARCOLU_"+sGXsfl_43_fel_idx ;
      edtCP_BARNOMC_Internalname = sPrefix+"CP_BARNOMC_"+sGXsfl_43_fel_idx ;
      edtCP_BARKGM_Internalname = sPrefix+"CP_BARKGM_"+sGXsfl_43_fel_idx ;
      edtCP_BARMTR_Internalname = sPrefix+"CP_BARMTR_"+sGXsfl_43_fel_idx ;
      edtCP_BARPIE_Internalname = sPrefix+"CP_BARPIE_"+sGXsfl_43_fel_idx ;
      edtCP_BARSIT_Internalname = sPrefix+"CP_BARSIT_"+sGXsfl_43_fel_idx ;
      edtCP_BARFECG_Internalname = sPrefix+"CP_BARFECG_"+sGXsfl_43_fel_idx ;
      edtCP_BARFECC_Internalname = sPrefix+"CP_BARFECC_"+sGXsfl_43_fel_idx ;
      edtCP_BARFECF_Internalname = sPrefix+"CP_BARFECF_"+sGXsfl_43_fel_idx ;
      edtCP_BARFECS_Internalname = sPrefix+"CP_BARFECS_"+sGXsfl_43_fel_idx ;
      edtavBarfascod_Internalname = sPrefix+"vBARFASCOD_"+sGXsfl_43_fel_idx ;
      edtavBarfassig_Internalname = sPrefix+"vBARFASSIG_"+sGXsfl_43_fel_idx ;
      edtavBaralbultimo_Internalname = sPrefix+"vBARALBULTIMO_"+sGXsfl_43_fel_idx ;
      edtCP_BARALBK_Internalname = sPrefix+"CP_BARALBK_"+sGXsfl_43_fel_idx ;
      edtCP_BARALBM_Internalname = sPrefix+"CP_BARALBM_"+sGXsfl_43_fel_idx ;
      edtavBaralbfact_Internalname = sPrefix+"vBARALBFACT_"+sGXsfl_43_fel_idx ;
      edtCP_BARGIRA_Internalname = sPrefix+"CP_BARGIRA_"+sGXsfl_43_fel_idx ;
      edtCP_BARPROP_Internalname = sPrefix+"CP_BARPROP_"+sGXsfl_43_fel_idx ;
      edtCP_DSC_BAR_Internalname = sPrefix+"CP_DSC_BAR_"+sGXsfl_43_fel_idx ;
      edtCP_DISUSRC_Internalname = sPrefix+"CP_DISUSRC_"+sGXsfl_43_fel_idx ;
      edtCP_BAREXT_Internalname = sPrefix+"CP_BAREXT_"+sGXsfl_43_fel_idx ;
      edtCP_DISDES_Internalname = sPrefix+"CP_DISDES_"+sGXsfl_43_fel_idx ;
      edtCP_DISCOD_Internalname = sPrefix+"CP_DISCOD_"+sGXsfl_43_fel_idx ;
      edtCP_BARMAQC_Internalname = sPrefix+"CP_BARMAQC_"+sGXsfl_43_fel_idx ;
      edtCP_BARPLF_Internalname = sPrefix+"CP_BARPLF_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb27M0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_43_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV65GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV65GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV65GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_43_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV65GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A14297CP_ID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14297CP_ID), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_ID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_EMPRCOD_Internalname,GXutil.rtrim( A14328CP_EMPRCOD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_EMPRCOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_CLICOD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_CLICOD_Internalname,GXutil.ltrim( localUtil.ntoc( A14326CP_CLICOD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14326CP_CLICOD), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_CLICOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_CLICOD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_CLINOM_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_CLINOM_Internalname,A14327CP_CLINOM,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_CLINOM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_CLINOM_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARDISN_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARDISN_Internalname,GXutil.rtrim( A14324CP_BARDISN),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARDISN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARDISN_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbCP_BARESTR.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbCP_BARESTR.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CP_BARESTR_" + sGXsfl_43_idx ;
            cmbCP_BARESTR.setName( GXCCtl );
            cmbCP_BARESTR.setWebtags( "" );
            cmbCP_BARESTR.addItem("2", httpContext.getMessage( "RC", ""), (short)(0));
            if ( cmbCP_BARESTR.getItemCount() > 0 )
            {
               A14352CP_BARESTR = (byte)(GXutil.lval( cmbCP_BARESTR.getValidValue(GXutil.trim( GXutil.str( A14352CP_BARESTR, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCP_BARESTR,cmbCP_BARESTR.getInternalname(),GXutil.trim( GXutil.str( A14352CP_BARESTR, 1, 0)),Integer.valueOf(1),cmbCP_BARESTR.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbCP_BARESTR.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbCP_BARESTR.getColumnClass(),cmbCP_BARESTR.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbCP_BARESTR.setValue( GXutil.trim( GXutil.str( A14352CP_BARESTR, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCP_BARESTR.getInternalname(), "Values", cmbCP_BARESTR.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARCOD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCOD_Internalname,GXutil.ltrim( localUtil.ntoc( A14301CP_BARCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14301CP_BARCOD), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCP_BARCOD_Columnclass,edtCP_BARCOD_Columnheaderclass,Integer.valueOf(edtCP_BARCOD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARCODR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCODR_Internalname,GXutil.ltrim( localUtil.ntoc( A14302CP_BARCODR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14302CP_BARCODR), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCODR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARCODR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARCODP_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCODP_Internalname,GXutil.rtrim( A14303CP_BARCODP),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCODP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_BARCODP_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARAGRE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARAGRE_Internalname,GXutil.rtrim( A14319CP_BARAGRE),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARAGRE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARAGRE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARSER_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARSER_Internalname,GXutil.rtrim( A14311CP_BARSER),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARSER_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARSER_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARSERD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARSERD_Internalname,A14312CP_BARSERD,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARSERD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARSERD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARTIPA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARTIPA_Internalname,GXutil.ltrim( localUtil.ntoc( A14316CP_BARTIPA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14316CP_BARTIPA), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARTIPA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARTIPA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_TARTDSC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_TARTDSC_Internalname,A14343CP_TARTDSC,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_TARTDSC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_TARTDSC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARCOLO_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCOLO_Internalname,GXutil.rtrim( A14331CP_BARCOLO),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCOLO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARCOLO_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARCOLU_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCOLU_Internalname,GXutil.ltrim( localUtil.ntoc( A14332CP_BARCOLU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14332CP_BARCOLU), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCOLU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARCOLU_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARNOMC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARNOMC_Internalname,A14315CP_BARNOMC,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARNOMC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARNOMC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARKGM_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARKGM_Internalname,GXutil.ltrim( localUtil.ntoc( A14336CP_BARKGM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14336CP_BARKGM, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARKGM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARKGM_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARMTR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARMTR_Internalname,GXutil.ltrim( localUtil.ntoc( A14337CP_BARMTR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14337CP_BARMTR, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARMTR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARMTR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARPIE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARPIE_Internalname,GXutil.ltrim( localUtil.ntoc( A14338CP_BARPIE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14338CP_BARPIE), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARPIE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARPIE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARSIT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARSIT_Internalname,GXutil.ltrim( localUtil.ntoc( A14307CP_BARSIT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14307CP_BARSIT), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARSIT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARSIT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARFECG_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECG_Internalname,localUtil.format(A14308CP_BARFECG, "99/99/99"),localUtil.format( A14308CP_BARFECG, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARFECG_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARFECC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECC_Internalname,localUtil.format(A14309CP_BARFECC, "99/99/99"),localUtil.format( A14309CP_BARFECC, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARFECC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARFECF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECF_Internalname,localUtil.format(A14304CP_BARFECF, "99/99/99"),localUtil.format( A14304CP_BARFECF, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARFECF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARFECS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECS_Internalname,localUtil.format(A14310CP_BARFECS, "99/99/99"),localUtil.format( A14310CP_BARFECS, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARFECS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarfascod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarfascod_Enabled!=0)&&(edtavBarfascod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfascod_Internalname,GXutil.rtrim( AV24BarFasCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarfascod_Enabled!=0)&&(edtavBarfascod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarfascod_Visible),Integer.valueOf(edtavBarfascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarfassig_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarfassig_Enabled!=0)&&(edtavBarfassig_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfassig_Internalname,GXutil.rtrim( AV25BarFasSig),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarfassig_Enabled!=0)&&(edtavBarfassig_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfassig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarfassig_Visible),Integer.valueOf(edtavBarfassig_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbultimo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaralbultimo_Enabled!=0)&&(edtavBaralbultimo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbultimo_Internalname,GXutil.ltrim( localUtil.ntoc( AV11BarAlbUltimo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbultimo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11BarAlbUltimo), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11BarAlbUltimo), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBaralbultimo_Enabled!=0)&&(edtavBaralbultimo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbultimo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbultimo_Visible),Integer.valueOf(edtavBaralbultimo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARALBK_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARALBK_Internalname,GXutil.ltrim( localUtil.ntoc( A14339CP_BARALBK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14339CP_BARALBK, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARALBK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_BARALBK_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCP_BARALBM_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARALBM_Internalname,GXutil.ltrim( localUtil.ntoc( A14340CP_BARALBM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14340CP_BARALBM, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARALBM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_BARALBM_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbfact_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaralbfact_Enabled!=0)&&(edtavBaralbfact_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 75,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbfact_Internalname,GXutil.ltrim( localUtil.ntoc( AV10BarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbfact_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarAlbFact), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarAlbFact), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBaralbfact_Enabled!=0)&&(edtavBaralbfact_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbfact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbfact_Visible),Integer.valueOf(edtavBaralbfact_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARGIRA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARGIRA_Internalname,A14317CP_BARGIRA,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARGIRA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARGIRA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARPROP_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARPROP_Internalname,GXutil.rtrim( A14323CP_BARPROP),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARPROP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARPROP_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_DSC_BAR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_DSC_BAR_Internalname,A14334CP_DSC_BAR,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_DSC_BAR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCP_DSC_BAR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_DISUSRC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_DISUSRC_Internalname,GXutil.rtrim( A14341CP_DISUSRC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_DISUSRC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_DISUSRC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BAREXT_Internalname,GXutil.ltrim( localUtil.ntoc( A14320CP_BAREXT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14320CP_BAREXT), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BAREXT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_DISDES_Internalname,GXutil.rtrim( A14321CP_DISDES),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_DISDES_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_DISCOD_Internalname,GXutil.ltrim( localUtil.ntoc( A14322CP_DISCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14322CP_DISCOD), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_DISCOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCP_BARMAQC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARMAQC_Internalname,GXutil.rtrim( A14351CP_BARMAQC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARMAQC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCP_BARMAQC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARPLF_Internalname,GXutil.rtrim( A14306CP_BARPLF),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARPLF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes27M2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbCP_BARESTR.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCP_BARMAQC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV65GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14297CP_ID, (byte)(10), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14352CP_BARESTR, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbCP_BARESTR.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbCP_BARESTR.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbCP_BARESTR.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14301CP_BARCOD, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCP_BARCOD_Columnclass));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV24BarFasCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarfascod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV25BarFasSig));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfassig_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarfassig_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV11BarAlbUltimo, (byte)(10), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV10BarAlbFact, (byte)(8), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14320CP_BAREXT, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14321CP_DISDES));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14322CP_DISCOD, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14351CP_BARMAQC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCP_BARMAQC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14306CP_BARPLF));
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
      bttBtnexportpdf_Internalname = sPrefix+"BTNEXPORTPDF" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtCP_ID_Internalname = sPrefix+"CP_ID" ;
      edtCP_EMPRCOD_Internalname = sPrefix+"CP_EMPRCOD" ;
      edtCP_CLICOD_Internalname = sPrefix+"CP_CLICOD" ;
      edtCP_CLINOM_Internalname = sPrefix+"CP_CLINOM" ;
      edtCP_BARDISN_Internalname = sPrefix+"CP_BARDISN" ;
      cmbCP_BARESTR.setInternalname( sPrefix+"CP_BARESTR" );
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
      edtCP_BAREXT_Internalname = sPrefix+"CP_BAREXT" ;
      edtCP_DISDES_Internalname = sPrefix+"CP_DISDES" ;
      edtCP_DISCOD_Internalname = sPrefix+"CP_DISCOD" ;
      edtCP_BARMAQC_Internalname = sPrefix+"CP_BARMAQC" ;
      edtCP_BARPLF_Internalname = sPrefix+"CP_BARPLF" ;
      edtavTotvaluecp_barkgm_Internalname = sPrefix+"vTOTVALUECP_BARKGM" ;
      edtavTotvaluecp_barmtr_Internalname = sPrefix+"vTOTVALUECP_BARMTR" ;
      edtavTotvaluecp_barpie_Internalname = sPrefix+"vTOTVALUECP_BARPIE" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtCP_BARPLF_Jsonclick = "" ;
      edtCP_BARMAQC_Jsonclick = "" ;
      edtCP_DISCOD_Jsonclick = "" ;
      edtCP_DISDES_Jsonclick = "" ;
      edtCP_BAREXT_Jsonclick = "" ;
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
      edtCP_BARCOD_Columnclass = "WWColumn" ;
      cmbCP_BARESTR.setJsonclick( "" );
      cmbCP_BARESTR.setColumnClass( "WWColumn" );
      edtCP_BARDISN_Jsonclick = "" ;
      edtCP_CLINOM_Jsonclick = "" ;
      edtCP_CLICOD_Jsonclick = "" ;
      edtCP_EMPRCOD_Jsonclick = "" ;
      edtCP_ID_Jsonclick = "" ;
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
      cmbCP_BARESTR.setColumnHeaderClass( "" );
      edtCP_BARMAQC_Visible = -1 ;
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
      cmbCP_BARESTR.setVisible( -1 );
      edtCP_BARDISN_Visible = -1 ;
      edtCP_CLINOM_Visible = -1 ;
      edtCP_CLICOD_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;;;;;;;;Fecha;Fecha;Fecha;;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Columnssortvalues = "|||||||||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "3:CP_CLICOD|4:CP_CLINOM|5:CP_BARDISNUM|6:CP_BARESTR|7:CP_BARCOD|8:CP_BARCODREO|9:CP_BARCODPAR|10:CP_BARAGREST|11:CP_BARSER|12:CP_BARSERDSC|13:CP_BARTIPART|14:CP_TARTDSC|15:CP_BARCOLO|16:CP_BARCOLU|17:CP_BARNOMCLI|18:CP_BARKGM|19:CP_BARMTR|20:CP_BARPIE|21:CP_BARSIT|22:CP_BARFECGEN|23:CP_BARFECCLI|24:CP_BARFECFPR|25:CP_BARFECSAL|26:BarFasCod|27:BarFasSig|28:BarAlbUltimo|29:CP_BARALBK|30:CP_BARALBM|31:BarAlbFact|32:CP_BARGIRAR|33:CP_BARPROPER|34:CP_DSC_BAR|35:CP_DISUSRC|39:CP_BARMAQCD" ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_43_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
      }
      GXCCtl = "CP_BARESTR_" + sGXsfl_43_idx ;
      cmbCP_BARESTR.setName( GXCCtl );
      cmbCP_BARESTR.setWebtags( "" );
      cmbCP_BARESTR.addItem("2", httpContext.getMessage( "RC", ""), (short)(0));
      if ( cmbCP_BARESTR.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV76Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9'},{av:'A14327CP_CLINOM',fld:'CP_CLINOM',pic:''},{av:'A14324CP_BARDISN',fld:'CP_BARDISN',pic:''},{av:'cmbCP_BARESTR'},{av:'A14352CP_BARESTR',fld:'CP_BARESTR',pic:'9'},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'A14319CP_BARAGRE',fld:'CP_BARAGRE',pic:''},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:''},{av:'A14312CP_BARSERD',fld:'CP_BARSERD',pic:''},{av:'A14316CP_BARTIPA',fld:'CP_BARTIPA',pic:'ZZZ9'},{av:'A14343CP_TARTDSC',fld:'CP_TARTDSC',pic:''},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:''},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9'},{av:'A14315CP_BARNOMC',fld:'CP_BARNOMC',pic:''},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99'},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99'},{av:'A14338CP_BARPIE',fld:'CP_BARPIE',pic:'ZZZZZ9'},{av:'A14307CP_BARSIT',fld:'CP_BARSIT',pic:'Z9'},{av:'A14339CP_BARALBK',fld:'CP_BARALBK',pic:'ZZZZZ9.99'},{av:'A14340CP_BARALBM',fld:'CP_BARALBM',pic:'ZZZZZ9.99'},{av:'A14317CP_BARGIRA',fld:'CP_BARGIRA',pic:''},{av:'A14323CP_BARPROP',fld:'CP_BARPROP',pic:''},{av:'A14334CP_DSC_BAR',fld:'CP_DSC_BAR',pic:''},{av:'A14341CP_DISUSRC',fld:'CP_DISUSRC',pic:''},{av:'A14351CP_BARMAQC',fld:'CP_BARMAQC',pic:''},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14308CP_BARFECG',fld:'CP_BARFECG',pic:''},{av:'A14310CP_BARFECS',fld:'CP_BARFECS',pic:''},{av:'A14309CP_BARFECC',fld:'CP_BARFECC',pic:''},{av:'A14304CP_BARFECF',fld:'CP_BARFECF',pic:''},{av:'A14305CP_BARNUMC',fld:'CP_BARNUMC',pic:'ZZZZZ9'},{av:'A14306CP_BARPLF',fld:'CP_BARPLF',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCP_CLICOD_Visible',ctrl:'CP_CLICOD',prop:'Visible'},{av:'edtCP_CLINOM_Visible',ctrl:'CP_CLINOM',prop:'Visible'},{av:'edtCP_BARDISN_Visible',ctrl:'CP_BARDISN',prop:'Visible'},{av:'cmbCP_BARESTR'},{av:'edtCP_BARCOD_Visible',ctrl:'CP_BARCOD',prop:'Visible'},{av:'edtCP_BARCODR_Visible',ctrl:'CP_BARCODR',prop:'Visible'},{av:'edtCP_BARCODP_Visible',ctrl:'CP_BARCODP',prop:'Visible'},{av:'edtCP_BARAGRE_Visible',ctrl:'CP_BARAGRE',prop:'Visible'},{av:'edtCP_BARSER_Visible',ctrl:'CP_BARSER',prop:'Visible'},{av:'edtCP_BARSERD_Visible',ctrl:'CP_BARSERD',prop:'Visible'},{av:'edtCP_BARTIPA_Visible',ctrl:'CP_BARTIPA',prop:'Visible'},{av:'edtCP_TARTDSC_Visible',ctrl:'CP_TARTDSC',prop:'Visible'},{av:'edtCP_BARCOLO_Visible',ctrl:'CP_BARCOLO',prop:'Visible'},{av:'edtCP_BARCOLU_Visible',ctrl:'CP_BARCOLU',prop:'Visible'},{av:'edtCP_BARNOMC_Visible',ctrl:'CP_BARNOMC',prop:'Visible'},{av:'edtCP_BARKGM_Visible',ctrl:'CP_BARKGM',prop:'Visible'},{av:'edtCP_BARMTR_Visible',ctrl:'CP_BARMTR',prop:'Visible'},{av:'edtCP_BARPIE_Visible',ctrl:'CP_BARPIE',prop:'Visible'},{av:'edtCP_BARSIT_Visible',ctrl:'CP_BARSIT',prop:'Visible'},{av:'edtCP_BARFECG_Visible',ctrl:'CP_BARFECG',prop:'Visible'},{av:'edtCP_BARFECC_Visible',ctrl:'CP_BARFECC',prop:'Visible'},{av:'edtCP_BARFECF_Visible',ctrl:'CP_BARFECF',prop:'Visible'},{av:'edtCP_BARFECS_Visible',ctrl:'CP_BARFECS',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtavBarfassig_Visible',ctrl:'vBARFASSIG',prop:'Visible'},{av:'edtavBaralbultimo_Visible',ctrl:'vBARALBULTIMO',prop:'Visible'},{av:'edtCP_BARALBK_Visible',ctrl:'CP_BARALBK',prop:'Visible'},{av:'edtCP_BARALBM_Visible',ctrl:'CP_BARALBM',prop:'Visible'},{av:'edtavBaralbfact_Visible',ctrl:'vBARALBFACT',prop:'Visible'},{av:'edtCP_BARGIRA_Visible',ctrl:'CP_BARGIRA',prop:'Visible'},{av:'edtCP_BARPROP_Visible',ctrl:'CP_BARPROP',prop:'Visible'},{av:'edtCP_DSC_BAR_Visible',ctrl:'CP_DSC_BAR',prop:'Visible'},{av:'edtCP_DISUSRC_Visible',ctrl:'CP_DISUSRC',prop:'Visible'},{av:'edtCP_BARMAQC_Visible',ctrl:'CP_BARMAQC',prop:'Visible'},{av:'AV67GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV68GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCP_BARCOD_Columnheaderclass',ctrl:'CP_BARCOD',prop:'Columnheaderclass'},{av:'AV73ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV69GridState',fld:'vGRIDSTATE',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157TotValueCP_BARKGM',fld:'vTOTVALUECP_BARKGM',pic:''},{av:'AV158TotValueCP_BARMTR',fld:'vTOTVALUECP_BARMTR',pic:''},{av:'AV159TotValueCP_BARPIE',fld:'vTOTVALUECP_BARPIE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1327M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV76Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1427M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV76Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2127M2',iparms:[{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV76Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A14319CP_BARAGRE',fld:'CP_BARAGRE',pic:''},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'cmbCP_BARESTR'},{av:'A14352CP_BARESTR',fld:'CP_BARESTR',pic:'9'},{av:'A14320CP_BAREXT',fld:'CP_BAREXT',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV65GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV24BarFasCod',fld:'vBARFASCOD',pic:''},{av:'cmbCP_BARESTR'},{av:'edtCP_BARCOD_Columnclass',ctrl:'CP_BARCOD',prop:'Columnclass'},{av:'AV25BarFasSig',fld:'vBARFASSIG',pic:''},{av:'AV11BarAlbUltimo',fld:'vBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV10BarAlbFact',fld:'vBARALBFACT',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1527M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV76Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9'},{av:'A14327CP_CLINOM',fld:'CP_CLINOM',pic:''},{av:'A14324CP_BARDISN',fld:'CP_BARDISN',pic:''},{av:'cmbCP_BARESTR'},{av:'A14352CP_BARESTR',fld:'CP_BARESTR',pic:'9'},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'A14319CP_BARAGRE',fld:'CP_BARAGRE',pic:''},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:''},{av:'A14312CP_BARSERD',fld:'CP_BARSERD',pic:''},{av:'A14316CP_BARTIPA',fld:'CP_BARTIPA',pic:'ZZZ9'},{av:'A14343CP_TARTDSC',fld:'CP_TARTDSC',pic:''},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:''},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9'},{av:'A14315CP_BARNOMC',fld:'CP_BARNOMC',pic:''},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99'},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99'},{av:'A14338CP_BARPIE',fld:'CP_BARPIE',pic:'ZZZZZ9'},{av:'A14307CP_BARSIT',fld:'CP_BARSIT',pic:'Z9'},{av:'A14339CP_BARALBK',fld:'CP_BARALBK',pic:'ZZZZZ9.99'},{av:'A14340CP_BARALBM',fld:'CP_BARALBM',pic:'ZZZZZ9.99'},{av:'A14317CP_BARGIRA',fld:'CP_BARGIRA',pic:''},{av:'A14323CP_BARPROP',fld:'CP_BARPROP',pic:''},{av:'A14334CP_DSC_BAR',fld:'CP_DSC_BAR',pic:''},{av:'A14341CP_DISUSRC',fld:'CP_DISUSRC',pic:''},{av:'A14351CP_BARMAQC',fld:'CP_BARMAQC',pic:''},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14308CP_BARFECG',fld:'CP_BARFECG',pic:''},{av:'A14310CP_BARFECS',fld:'CP_BARFECS',pic:''},{av:'A14309CP_BARFECC',fld:'CP_BARFECC',pic:''},{av:'A14304CP_BARFECF',fld:'CP_BARFECF',pic:''},{av:'A14305CP_BARNUMC',fld:'CP_BARNUMC',pic:'ZZZZZ9'},{av:'A14306CP_BARPLF',fld:'CP_BARPLF',pic:''}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCP_CLICOD_Visible',ctrl:'CP_CLICOD',prop:'Visible'},{av:'edtCP_CLINOM_Visible',ctrl:'CP_CLINOM',prop:'Visible'},{av:'edtCP_BARDISN_Visible',ctrl:'CP_BARDISN',prop:'Visible'},{av:'cmbCP_BARESTR'},{av:'edtCP_BARCOD_Visible',ctrl:'CP_BARCOD',prop:'Visible'},{av:'edtCP_BARCODR_Visible',ctrl:'CP_BARCODR',prop:'Visible'},{av:'edtCP_BARCODP_Visible',ctrl:'CP_BARCODP',prop:'Visible'},{av:'edtCP_BARAGRE_Visible',ctrl:'CP_BARAGRE',prop:'Visible'},{av:'edtCP_BARSER_Visible',ctrl:'CP_BARSER',prop:'Visible'},{av:'edtCP_BARSERD_Visible',ctrl:'CP_BARSERD',prop:'Visible'},{av:'edtCP_BARTIPA_Visible',ctrl:'CP_BARTIPA',prop:'Visible'},{av:'edtCP_TARTDSC_Visible',ctrl:'CP_TARTDSC',prop:'Visible'},{av:'edtCP_BARCOLO_Visible',ctrl:'CP_BARCOLO',prop:'Visible'},{av:'edtCP_BARCOLU_Visible',ctrl:'CP_BARCOLU',prop:'Visible'},{av:'edtCP_BARNOMC_Visible',ctrl:'CP_BARNOMC',prop:'Visible'},{av:'edtCP_BARKGM_Visible',ctrl:'CP_BARKGM',prop:'Visible'},{av:'edtCP_BARMTR_Visible',ctrl:'CP_BARMTR',prop:'Visible'},{av:'edtCP_BARPIE_Visible',ctrl:'CP_BARPIE',prop:'Visible'},{av:'edtCP_BARSIT_Visible',ctrl:'CP_BARSIT',prop:'Visible'},{av:'edtCP_BARFECG_Visible',ctrl:'CP_BARFECG',prop:'Visible'},{av:'edtCP_BARFECC_Visible',ctrl:'CP_BARFECC',prop:'Visible'},{av:'edtCP_BARFECF_Visible',ctrl:'CP_BARFECF',prop:'Visible'},{av:'edtCP_BARFECS_Visible',ctrl:'CP_BARFECS',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtavBarfassig_Visible',ctrl:'vBARFASSIG',prop:'Visible'},{av:'edtavBaralbultimo_Visible',ctrl:'vBARALBULTIMO',prop:'Visible'},{av:'edtCP_BARALBK_Visible',ctrl:'CP_BARALBK',prop:'Visible'},{av:'edtCP_BARALBM_Visible',ctrl:'CP_BARALBM',prop:'Visible'},{av:'edtavBaralbfact_Visible',ctrl:'vBARALBFACT',prop:'Visible'},{av:'edtCP_BARGIRA_Visible',ctrl:'CP_BARGIRA',prop:'Visible'},{av:'edtCP_BARPROP_Visible',ctrl:'CP_BARPROP',prop:'Visible'},{av:'edtCP_DSC_BAR_Visible',ctrl:'CP_DSC_BAR',prop:'Visible'},{av:'edtCP_DISUSRC_Visible',ctrl:'CP_DISUSRC',prop:'Visible'},{av:'edtCP_BARMAQC_Visible',ctrl:'CP_BARMAQC',prop:'Visible'},{av:'AV67GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV68GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCP_BARCOD_Columnheaderclass',ctrl:'CP_BARCOD',prop:'Columnheaderclass'},{av:'AV73ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV69GridState',fld:'vGRIDSTATE',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157TotValueCP_BARKGM',fld:'vTOTVALUECP_BARKGM',pic:''},{av:'AV158TotValueCP_BARMTR',fld:'vTOTVALUECP_BARMTR',pic:''},{av:'AV159TotValueCP_BARPIE',fld:'vTOTVALUECP_BARPIE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1227M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV76Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV69GridState',fld:'vGRIDSTATE',pic:''},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9'},{av:'A14327CP_CLINOM',fld:'CP_CLINOM',pic:''},{av:'A14324CP_BARDISN',fld:'CP_BARDISN',pic:''},{av:'cmbCP_BARESTR'},{av:'A14352CP_BARESTR',fld:'CP_BARESTR',pic:'9'},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'A14319CP_BARAGRE',fld:'CP_BARAGRE',pic:''},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:''},{av:'A14312CP_BARSERD',fld:'CP_BARSERD',pic:''},{av:'A14316CP_BARTIPA',fld:'CP_BARTIPA',pic:'ZZZ9'},{av:'A14343CP_TARTDSC',fld:'CP_TARTDSC',pic:''},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:''},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9'},{av:'A14315CP_BARNOMC',fld:'CP_BARNOMC',pic:''},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99'},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99'},{av:'A14338CP_BARPIE',fld:'CP_BARPIE',pic:'ZZZZZ9'},{av:'A14307CP_BARSIT',fld:'CP_BARSIT',pic:'Z9'},{av:'A14339CP_BARALBK',fld:'CP_BARALBK',pic:'ZZZZZ9.99'},{av:'A14340CP_BARALBM',fld:'CP_BARALBM',pic:'ZZZZZ9.99'},{av:'A14317CP_BARGIRA',fld:'CP_BARGIRA',pic:''},{av:'A14323CP_BARPROP',fld:'CP_BARPROP',pic:''},{av:'A14334CP_DSC_BAR',fld:'CP_DSC_BAR',pic:''},{av:'A14341CP_DISUSRC',fld:'CP_DISUSRC',pic:''},{av:'A14351CP_BARMAQC',fld:'CP_BARMAQC',pic:''},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14308CP_BARFECG',fld:'CP_BARFECG',pic:''},{av:'A14310CP_BARFECS',fld:'CP_BARFECS',pic:''},{av:'A14309CP_BARFECC',fld:'CP_BARFECC',pic:''},{av:'A14304CP_BARFECF',fld:'CP_BARFECF',pic:''},{av:'A14305CP_BARNUMC',fld:'CP_BARNUMC',pic:'ZZZZZ9'},{av:'A14306CP_BARPLF',fld:'CP_BARPLF',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV69GridState',fld:'vGRIDSTATE',pic:''},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCP_CLICOD_Visible',ctrl:'CP_CLICOD',prop:'Visible'},{av:'edtCP_CLINOM_Visible',ctrl:'CP_CLINOM',prop:'Visible'},{av:'edtCP_BARDISN_Visible',ctrl:'CP_BARDISN',prop:'Visible'},{av:'cmbCP_BARESTR'},{av:'edtCP_BARCOD_Visible',ctrl:'CP_BARCOD',prop:'Visible'},{av:'edtCP_BARCODR_Visible',ctrl:'CP_BARCODR',prop:'Visible'},{av:'edtCP_BARCODP_Visible',ctrl:'CP_BARCODP',prop:'Visible'},{av:'edtCP_BARAGRE_Visible',ctrl:'CP_BARAGRE',prop:'Visible'},{av:'edtCP_BARSER_Visible',ctrl:'CP_BARSER',prop:'Visible'},{av:'edtCP_BARSERD_Visible',ctrl:'CP_BARSERD',prop:'Visible'},{av:'edtCP_BARTIPA_Visible',ctrl:'CP_BARTIPA',prop:'Visible'},{av:'edtCP_TARTDSC_Visible',ctrl:'CP_TARTDSC',prop:'Visible'},{av:'edtCP_BARCOLO_Visible',ctrl:'CP_BARCOLO',prop:'Visible'},{av:'edtCP_BARCOLU_Visible',ctrl:'CP_BARCOLU',prop:'Visible'},{av:'edtCP_BARNOMC_Visible',ctrl:'CP_BARNOMC',prop:'Visible'},{av:'edtCP_BARKGM_Visible',ctrl:'CP_BARKGM',prop:'Visible'},{av:'edtCP_BARMTR_Visible',ctrl:'CP_BARMTR',prop:'Visible'},{av:'edtCP_BARPIE_Visible',ctrl:'CP_BARPIE',prop:'Visible'},{av:'edtCP_BARSIT_Visible',ctrl:'CP_BARSIT',prop:'Visible'},{av:'edtCP_BARFECG_Visible',ctrl:'CP_BARFECG',prop:'Visible'},{av:'edtCP_BARFECC_Visible',ctrl:'CP_BARFECC',prop:'Visible'},{av:'edtCP_BARFECF_Visible',ctrl:'CP_BARFECF',prop:'Visible'},{av:'edtCP_BARFECS_Visible',ctrl:'CP_BARFECS',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtavBarfassig_Visible',ctrl:'vBARFASSIG',prop:'Visible'},{av:'edtavBaralbultimo_Visible',ctrl:'vBARALBULTIMO',prop:'Visible'},{av:'edtCP_BARALBK_Visible',ctrl:'CP_BARALBK',prop:'Visible'},{av:'edtCP_BARALBM_Visible',ctrl:'CP_BARALBM',prop:'Visible'},{av:'edtavBaralbfact_Visible',ctrl:'vBARALBFACT',prop:'Visible'},{av:'edtCP_BARGIRA_Visible',ctrl:'CP_BARGIRA',prop:'Visible'},{av:'edtCP_BARPROP_Visible',ctrl:'CP_BARPROP',prop:'Visible'},{av:'edtCP_DSC_BAR_Visible',ctrl:'CP_DSC_BAR',prop:'Visible'},{av:'edtCP_DISUSRC_Visible',ctrl:'CP_DISUSRC',prop:'Visible'},{av:'edtCP_BARMAQC_Visible',ctrl:'CP_BARMAQC',prop:'Visible'},{av:'AV67GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV68GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCP_BARCOD_Columnheaderclass',ctrl:'CP_BARCOD',prop:'Columnheaderclass'},{av:'AV73ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157TotValueCP_BARKGM',fld:'vTOTVALUECP_BARKGM',pic:''},{av:'AV158TotValueCP_BARMTR',fld:'vTOTVALUECP_BARMTR',pic:''},{av:'AV159TotValueCP_BARPIE',fld:'vTOTVALUECP_BARPIE',pic:''}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2227M2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV65GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9'},{av:'A14327CP_CLINOM',fld:'CP_CLINOM',pic:''},{av:'A14324CP_BARDISN',fld:'CP_BARDISN',pic:''},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:''},{av:'A14312CP_BARSERD',fld:'CP_BARSERD',pic:''},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:''},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV76Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A14304CP_BARFECF',fld:'CP_BARFECF',pic:''},{av:'cmbCP_BARESTR'},{av:'A14352CP_BARESTR',fld:'CP_BARESTR',pic:'9'},{av:'A14319CP_BARAGRE',fld:'CP_BARAGRE',pic:''},{av:'A14316CP_BARTIPA',fld:'CP_BARTIPA',pic:'ZZZ9'},{av:'A14343CP_TARTDSC',fld:'CP_TARTDSC',pic:''},{av:'A14315CP_BARNOMC',fld:'CP_BARNOMC',pic:''},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99'},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99'},{av:'A14338CP_BARPIE',fld:'CP_BARPIE',pic:'ZZZZZ9'},{av:'A14307CP_BARSIT',fld:'CP_BARSIT',pic:'Z9'},{av:'A14339CP_BARALBK',fld:'CP_BARALBK',pic:'ZZZZZ9.99'},{av:'A14340CP_BARALBM',fld:'CP_BARALBM',pic:'ZZZZZ9.99'},{av:'A14317CP_BARGIRA',fld:'CP_BARGIRA',pic:''},{av:'A14323CP_BARPROP',fld:'CP_BARPROP',pic:''},{av:'A14334CP_DSC_BAR',fld:'CP_DSC_BAR',pic:''},{av:'A14341CP_DISUSRC',fld:'CP_DISUSRC',pic:''},{av:'A14351CP_BARMAQC',fld:'CP_BARMAQC',pic:''},{av:'A14308CP_BARFECG',fld:'CP_BARFECG',pic:''},{av:'A14310CP_BARFECS',fld:'CP_BARFECS',pic:''},{av:'A14309CP_BARFECC',fld:'CP_BARFECC',pic:''},{av:'A14305CP_BARNUMC',fld:'CP_BARNUMC',pic:'ZZZZZ9'},{av:'A14306CP_BARPLF',fld:'CP_BARPLF',pic:''}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV65GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCP_CLICOD_Visible',ctrl:'CP_CLICOD',prop:'Visible'},{av:'edtCP_CLINOM_Visible',ctrl:'CP_CLINOM',prop:'Visible'},{av:'edtCP_BARDISN_Visible',ctrl:'CP_BARDISN',prop:'Visible'},{av:'cmbCP_BARESTR'},{av:'edtCP_BARCOD_Visible',ctrl:'CP_BARCOD',prop:'Visible'},{av:'edtCP_BARCODR_Visible',ctrl:'CP_BARCODR',prop:'Visible'},{av:'edtCP_BARCODP_Visible',ctrl:'CP_BARCODP',prop:'Visible'},{av:'edtCP_BARAGRE_Visible',ctrl:'CP_BARAGRE',prop:'Visible'},{av:'edtCP_BARSER_Visible',ctrl:'CP_BARSER',prop:'Visible'},{av:'edtCP_BARSERD_Visible',ctrl:'CP_BARSERD',prop:'Visible'},{av:'edtCP_BARTIPA_Visible',ctrl:'CP_BARTIPA',prop:'Visible'},{av:'edtCP_TARTDSC_Visible',ctrl:'CP_TARTDSC',prop:'Visible'},{av:'edtCP_BARCOLO_Visible',ctrl:'CP_BARCOLO',prop:'Visible'},{av:'edtCP_BARCOLU_Visible',ctrl:'CP_BARCOLU',prop:'Visible'},{av:'edtCP_BARNOMC_Visible',ctrl:'CP_BARNOMC',prop:'Visible'},{av:'edtCP_BARKGM_Visible',ctrl:'CP_BARKGM',prop:'Visible'},{av:'edtCP_BARMTR_Visible',ctrl:'CP_BARMTR',prop:'Visible'},{av:'edtCP_BARPIE_Visible',ctrl:'CP_BARPIE',prop:'Visible'},{av:'edtCP_BARSIT_Visible',ctrl:'CP_BARSIT',prop:'Visible'},{av:'edtCP_BARFECG_Visible',ctrl:'CP_BARFECG',prop:'Visible'},{av:'edtCP_BARFECC_Visible',ctrl:'CP_BARFECC',prop:'Visible'},{av:'edtCP_BARFECF_Visible',ctrl:'CP_BARFECF',prop:'Visible'},{av:'edtCP_BARFECS_Visible',ctrl:'CP_BARFECS',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtavBarfassig_Visible',ctrl:'vBARFASSIG',prop:'Visible'},{av:'edtavBaralbultimo_Visible',ctrl:'vBARALBULTIMO',prop:'Visible'},{av:'edtCP_BARALBK_Visible',ctrl:'CP_BARALBK',prop:'Visible'},{av:'edtCP_BARALBM_Visible',ctrl:'CP_BARALBM',prop:'Visible'},{av:'edtavBaralbfact_Visible',ctrl:'vBARALBFACT',prop:'Visible'},{av:'edtCP_BARGIRA_Visible',ctrl:'CP_BARGIRA',prop:'Visible'},{av:'edtCP_BARPROP_Visible',ctrl:'CP_BARPROP',prop:'Visible'},{av:'edtCP_DSC_BAR_Visible',ctrl:'CP_DSC_BAR',prop:'Visible'},{av:'edtCP_DISUSRC_Visible',ctrl:'CP_DISUSRC',prop:'Visible'},{av:'edtCP_BARMAQC_Visible',ctrl:'CP_BARMAQC',prop:'Visible'},{av:'AV67GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV68GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCP_BARCOD_Columnheaderclass',ctrl:'CP_BARCOD',prop:'Columnheaderclass'},{av:'AV73ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV69GridState',fld:'vGRIDSTATE',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV157TotValueCP_BARKGM',fld:'vTOTVALUECP_BARKGM',pic:''},{av:'AV158TotValueCP_BARMTR',fld:'vTOTVALUECP_BARMTR',pic:''},{av:'AV159TotValueCP_BARPIE',fld:'vTOTVALUECP_BARPIE',pic:''}]}");
      setEventMetadata("AGRUPADAS_MODAL.ONLOADCOMPONENT","{handler:'e1627M2',iparms:[{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:''},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9'},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9'},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:''},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9'},{av:'A14327CP_CLINOM',fld:'CP_CLINOM',pic:''},{av:'A14324CP_BARDISN',fld:'CP_BARDISN',pic:''},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:''},{av:'A14312CP_BARSERD',fld:'CP_BARSERD',pic:''},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:''},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9'},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99'},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("AGRUPADAS_MODAL.ONLOADCOMPONENT",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("'DOEXPORTPDF'","{handler:'e1127M1',iparms:[{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''}]");
      setEventMetadata("'DOEXPORTPDF'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1727M2',iparms:[{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV69GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV69GridState',fld:'vGRIDSTATE',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV76Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1827M2',iparms:[{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV69GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV69GridState',fld:'vGRIDSTATE',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV46CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV22BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV23BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV30BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV31BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV41BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV42BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV26BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV27BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV28BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV29BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV32BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV33BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV39BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV40BarSerto',fld:'vBARSERTO',pic:''},{av:'AV43BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV44BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV18BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV19BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV20BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV21BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV35BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV36BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV37BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV38BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV77muestras',fld:'vMUESTRAS',pic:''},{av:'AV12BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV17BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV15BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV16BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV13BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV14BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV5Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV34BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV74ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV47ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV174Pgmname',fld:'vPGMNAME',pic:''},{av:'AV154TotCP_BARKGM',fld:'vTOTCP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV155TotCP_BARMTR',fld:'vTOTCP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV156TotCP_BARPIE',fld:'vTOTCP_BARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV76Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("NULL","{handler:'valid_Cp_barplf',iparms:[]");
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
      wcpOAV9AuxEmprcod = "" ;
      wcpOAV22BarDisNumfrom = "" ;
      wcpOAV23BarDisNumto = "" ;
      wcpOAV30BarFecGenfrom = GXutil.nullDate() ;
      wcpOAV31BarFecGento = GXutil.nullDate() ;
      wcpOAV26BarFecClifrom = GXutil.nullDate() ;
      wcpOAV27BarFecClito = GXutil.nullDate() ;
      wcpOAV28BarFecFprfrom = GXutil.nullDate() ;
      wcpOAV29BarFecFprto = GXutil.nullDate() ;
      wcpOAV32BarFecSalfrom = GXutil.nullDate() ;
      wcpOAV33BarFecSalto = GXutil.nullDate() ;
      wcpOAV39BarSerfrom = "" ;
      wcpOAV40BarSerto = "" ;
      wcpOAV18BarColNomfrom = "" ;
      wcpOAV19BarColNomto = "" ;
      wcpOAV35BarNomClifrom = "" ;
      wcpOAV36BarNomClito = "" ;
      wcpOAV77muestras = "" ;
      wcpOAV13BarCodParfrom = "" ;
      wcpOAV14BarCodParto = "" ;
      wcpOAV5Cod_idtx = "" ;
      wcpOAV34BarGirar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV9AuxEmprcod = "" ;
      AV22BarDisNumfrom = "" ;
      AV23BarDisNumto = "" ;
      AV30BarFecGenfrom = GXutil.nullDate() ;
      AV31BarFecGento = GXutil.nullDate() ;
      AV26BarFecClifrom = GXutil.nullDate() ;
      AV27BarFecClito = GXutil.nullDate() ;
      AV28BarFecFprfrom = GXutil.nullDate() ;
      AV29BarFecFprto = GXutil.nullDate() ;
      AV32BarFecSalfrom = GXutil.nullDate() ;
      AV33BarFecSalto = GXutil.nullDate() ;
      AV39BarSerfrom = "" ;
      AV40BarSerto = "" ;
      AV18BarColNomfrom = "" ;
      AV19BarColNomto = "" ;
      AV35BarNomClifrom = "" ;
      AV36BarNomClito = "" ;
      AV77muestras = "" ;
      AV13BarCodParfrom = "" ;
      AV14BarCodParto = "" ;
      AV5Cod_idtx = "" ;
      AV34BarGirar = "" ;
      AV63FilterFullText = "" ;
      AV59Emprcod = "" ;
      AV47ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV174Pgmname = "" ;
      AV154TotCP_BARKGM = DecimalUtil.ZERO ;
      AV155TotCP_BARMTR = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV73ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV58DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV69GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtnexportpdf_Jsonclick = "" ;
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
      AV24BarFasCod = "" ;
      AV25BarFasSig = "" ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      A14317CP_BARGIRA = "" ;
      A14323CP_BARPROP = "" ;
      A14334CP_DSC_BAR = "" ;
      A14341CP_DISUSRC = "" ;
      A14321CP_DISDES = "" ;
      A14351CP_BARMAQC = "" ;
      A14306CP_BARPLF = "" ;
      scmdbuf = "" ;
      lV63FilterFullText = "" ;
      H027M2_A14305CP_BARNUMC = new int[1] ;
      H027M2_A14306CP_BARPLF = new String[] {""} ;
      H027M2_A14351CP_BARMAQC = new String[] {""} ;
      H027M2_A14322CP_DISCOD = new int[1] ;
      H027M2_A14321CP_DISDES = new String[] {""} ;
      H027M2_A14320CP_BAREXT = new byte[1] ;
      H027M2_A14341CP_DISUSRC = new String[] {""} ;
      H027M2_A14334CP_DSC_BAR = new String[] {""} ;
      H027M2_A14323CP_BARPROP = new String[] {""} ;
      H027M2_A14317CP_BARGIRA = new String[] {""} ;
      H027M2_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027M2_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027M2_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      H027M2_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      H027M2_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      H027M2_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      H027M2_A14307CP_BARSIT = new byte[1] ;
      H027M2_A14338CP_BARPIE = new int[1] ;
      H027M2_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027M2_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027M2_A14315CP_BARNOMC = new String[] {""} ;
      H027M2_A14332CP_BARCOLU = new int[1] ;
      H027M2_A14331CP_BARCOLO = new String[] {""} ;
      H027M2_A14343CP_TARTDSC = new String[] {""} ;
      H027M2_A14316CP_BARTIPA = new short[1] ;
      H027M2_A14312CP_BARSERD = new String[] {""} ;
      H027M2_A14311CP_BARSER = new String[] {""} ;
      H027M2_A14319CP_BARAGRE = new String[] {""} ;
      H027M2_A14303CP_BARCODP = new String[] {""} ;
      H027M2_A14302CP_BARCODR = new byte[1] ;
      H027M2_A14301CP_BARCOD = new int[1] ;
      H027M2_A14352CP_BARESTR = new byte[1] ;
      H027M2_A14324CP_BARDISN = new String[] {""} ;
      H027M2_A14327CP_CLINOM = new String[] {""} ;
      H027M2_A14326CP_CLICOD = new int[1] ;
      H027M2_A14328CP_EMPRCOD = new String[] {""} ;
      H027M2_A14297CP_ID = new long[1] ;
      H027M3_AGRID_nRecordCount = new long[1] ;
      AV157TotValueCP_BARKGM = "" ;
      AV158TotValueCP_BARMTR = "" ;
      AV159TotValueCP_BARPIE = "" ;
      hsh = "" ;
      AV6Station = "" ;
      GXv_char2 = new String[1] ;
      AV60EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV163WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV82Session = httpContext.getWebSession();
      AV49ColumnsSelectorXML = "" ;
      GXv_int8 = new byte[1] ;
      GXv_int11 = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV75ManageFiltersXml = "" ;
      GXv_int13 = new int[1] ;
      AV62ExcelFilename = "" ;
      AV61ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV162UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV48ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      AV70GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV160TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV71HTTPRequest = httpContext.getHttpRequest();
      H027M4_A14297CP_ID = new long[1] ;
      H027M4_A14306CP_BARPLF = new String[] {""} ;
      H027M4_A14305CP_BARNUMC = new int[1] ;
      H027M4_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      H027M4_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      H027M4_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      H027M4_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      H027M4_A14328CP_EMPRCOD = new String[] {""} ;
      H027M4_A14351CP_BARMAQC = new String[] {""} ;
      H027M4_A14341CP_DISUSRC = new String[] {""} ;
      H027M4_A14334CP_DSC_BAR = new String[] {""} ;
      H027M4_A14323CP_BARPROP = new String[] {""} ;
      H027M4_A14317CP_BARGIRA = new String[] {""} ;
      H027M4_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027M4_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027M4_A14307CP_BARSIT = new byte[1] ;
      H027M4_A14338CP_BARPIE = new int[1] ;
      H027M4_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027M4_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027M4_A14315CP_BARNOMC = new String[] {""} ;
      H027M4_A14332CP_BARCOLU = new int[1] ;
      H027M4_A14331CP_BARCOLO = new String[] {""} ;
      H027M4_A14343CP_TARTDSC = new String[] {""} ;
      H027M4_A14316CP_BARTIPA = new short[1] ;
      H027M4_A14312CP_BARSERD = new String[] {""} ;
      H027M4_A14311CP_BARSER = new String[] {""} ;
      H027M4_A14319CP_BARAGRE = new String[] {""} ;
      H027M4_A14303CP_BARCODP = new String[] {""} ;
      H027M4_A14302CP_BARCODR = new byte[1] ;
      H027M4_A14301CP_BARCOD = new int[1] ;
      H027M4_A14352CP_BARESTR = new byte[1] ;
      H027M4_A14324CP_BARDISN = new String[] {""} ;
      H027M4_A14327CP_CLINOM = new String[] {""} ;
      H027M4_A14326CP_CLICOD = new int[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_int21 = new short[1] ;
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
      sCtrlAV9AuxEmprcod = "" ;
      sCtrlAV45CliCodfrom = "" ;
      sCtrlAV46CliCodto = "" ;
      sCtrlAV22BarDisNumfrom = "" ;
      sCtrlAV23BarDisNumto = "" ;
      sCtrlAV30BarFecGenfrom = "" ;
      sCtrlAV31BarFecGento = "" ;
      sCtrlAV41BarSitfrom = "" ;
      sCtrlAV42BarSitto = "" ;
      sCtrlAV26BarFecClifrom = "" ;
      sCtrlAV27BarFecClito = "" ;
      sCtrlAV28BarFecFprfrom = "" ;
      sCtrlAV29BarFecFprto = "" ;
      sCtrlAV32BarFecSalfrom = "" ;
      sCtrlAV33BarFecSalto = "" ;
      sCtrlAV39BarSerfrom = "" ;
      sCtrlAV40BarSerto = "" ;
      sCtrlAV43BarTipArtfrom = "" ;
      sCtrlAV44BarTipArtto = "" ;
      sCtrlAV18BarColNomfrom = "" ;
      sCtrlAV19BarColNomto = "" ;
      sCtrlAV20BarColNumfrom = "" ;
      sCtrlAV21BarColNumto = "" ;
      sCtrlAV35BarNomClifrom = "" ;
      sCtrlAV36BarNomClito = "" ;
      sCtrlAV37BarNumClifrom = "" ;
      sCtrlAV38BarNumClito = "" ;
      sCtrlAV77muestras = "" ;
      sCtrlAV12BarCodfrom = "" ;
      sCtrlAV17BarCodto = "" ;
      sCtrlAV15BarCodReofrom = "" ;
      sCtrlAV16BarCodReoto = "" ;
      sCtrlAV13BarCodParfrom = "" ;
      sCtrlAV14BarCodParto = "" ;
      sCtrlAV5Cod_idtx = "" ;
      sCtrlAV34BarGirar = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listconsultaproduccion__default(),
         new Object[] {
             new Object[] {
            H027M2_A14305CP_BARNUMC, H027M2_A14306CP_BARPLF, H027M2_A14351CP_BARMAQC, H027M2_A14322CP_DISCOD, H027M2_A14321CP_DISDES, H027M2_A14320CP_BAREXT, H027M2_A14341CP_DISUSRC, H027M2_A14334CP_DSC_BAR, H027M2_A14323CP_BARPROP, H027M2_A14317CP_BARGIRA,
            H027M2_A14340CP_BARALBM, H027M2_A14339CP_BARALBK, H027M2_A14310CP_BARFECS, H027M2_A14304CP_BARFECF, H027M2_A14309CP_BARFECC, H027M2_A14308CP_BARFECG, H027M2_A14307CP_BARSIT, H027M2_A14338CP_BARPIE, H027M2_A14337CP_BARMTR, H027M2_A14336CP_BARKGM,
            H027M2_A14315CP_BARNOMC, H027M2_A14332CP_BARCOLU, H027M2_A14331CP_BARCOLO, H027M2_A14343CP_TARTDSC, H027M2_A14316CP_BARTIPA, H027M2_A14312CP_BARSERD, H027M2_A14311CP_BARSER, H027M2_A14319CP_BARAGRE, H027M2_A14303CP_BARCODP, H027M2_A14302CP_BARCODR,
            H027M2_A14301CP_BARCOD, H027M2_A14352CP_BARESTR, H027M2_A14324CP_BARDISN, H027M2_A14327CP_CLINOM, H027M2_A14326CP_CLICOD, H027M2_A14328CP_EMPRCOD, H027M2_A14297CP_ID
            }
            , new Object[] {
            H027M3_AGRID_nRecordCount
            }
            , new Object[] {
            H027M4_A14297CP_ID, H027M4_A14306CP_BARPLF, H027M4_A14305CP_BARNUMC, H027M4_A14304CP_BARFECF, H027M4_A14309CP_BARFECC, H027M4_A14310CP_BARFECS, H027M4_A14308CP_BARFECG, H027M4_A14328CP_EMPRCOD, H027M4_A14351CP_BARMAQC, H027M4_A14341CP_DISUSRC,
            H027M4_A14334CP_DSC_BAR, H027M4_A14323CP_BARPROP, H027M4_A14317CP_BARGIRA, H027M4_A14340CP_BARALBM, H027M4_A14339CP_BARALBK, H027M4_A14307CP_BARSIT, H027M4_A14338CP_BARPIE, H027M4_A14337CP_BARMTR, H027M4_A14336CP_BARKGM, H027M4_A14315CP_BARNOMC,
            H027M4_A14332CP_BARCOLU, H027M4_A14331CP_BARCOLO, H027M4_A14343CP_TARTDSC, H027M4_A14316CP_BARTIPA, H027M4_A14312CP_BARSERD, H027M4_A14311CP_BARSER, H027M4_A14319CP_BARAGRE, H027M4_A14303CP_BARCODP, H027M4_A14302CP_BARCODR, H027M4_A14301CP_BARCOD,
            H027M4_A14352CP_BARESTR, H027M4_A14324CP_BARDISN, H027M4_A14327CP_CLINOM, H027M4_A14326CP_CLICOD
            }
         }
      );
      AV174Pgmname = "ListConsultaProduccion" ;
      /* GeneXus formulas. */
      AV174Pgmname = "ListConsultaProduccion" ;
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

   private byte wcpOAV41BarSitfrom ;
   private byte wcpOAV42BarSitto ;
   private byte wcpOAV15BarCodReofrom ;
   private byte wcpOAV16BarCodReoto ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV41BarSitfrom ;
   private byte AV42BarSitto ;
   private byte AV15BarCodReofrom ;
   private byte AV16BarCodReoto ;
   private byte AV74ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A14352CP_BARESTR ;
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
   private short wcpOAV43BarTipArtfrom ;
   private short wcpOAV44BarTipArtto ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV43BarTipArtfrom ;
   private short AV44BarTipArtto ;
   private short AV76Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV65GridActionGroup1 ;
   private short A14316CP_BARTIPA ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV164cuaderno ;
   private short AV165STNORM ;
   private short GXv_int21[] ;
   private int wcpOAV45CliCodfrom ;
   private int wcpOAV46CliCodto ;
   private int wcpOAV20BarColNumfrom ;
   private int wcpOAV21BarColNumto ;
   private int wcpOAV37BarNumClifrom ;
   private int wcpOAV38BarNumClito ;
   private int wcpOAV12BarCodfrom ;
   private int wcpOAV17BarCodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV45CliCodfrom ;
   private int AV46CliCodto ;
   private int AV20BarColNumfrom ;
   private int AV21BarColNumto ;
   private int AV37BarNumClifrom ;
   private int AV38BarNumClito ;
   private int AV12BarCodfrom ;
   private int AV17BarCodto ;
   private int nGXsfl_43_idx=1 ;
   private int A14305CP_BARNUMC ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A14326CP_CLICOD ;
   private int A14301CP_BARCOD ;
   private int A14332CP_BARCOLU ;
   private int A14338CP_BARPIE ;
   private int AV10BarAlbFact ;
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
   private int edtCP_BARMAQC_Visible ;
   private int AV81PageToGo ;
   private int AV171MacCod ;
   private int GXt_int12 ;
   private int GXv_int13[] ;
   private int AV175GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV156TotCP_BARPIE ;
   private long AV67GridCurrentPage ;
   private long AV68GridPageCount ;
   private long A14297CP_ID ;
   private long AV11BarAlbUltimo ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int10 ;
   private long GXv_int11[] ;
   private java.math.BigDecimal AV154TotCP_BARKGM ;
   private java.math.BigDecimal AV155TotCP_BARMTR ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal A14340CP_BARALBM ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private String wcpOAV9AuxEmprcod ;
   private String wcpOAV22BarDisNumfrom ;
   private String wcpOAV23BarDisNumto ;
   private String wcpOAV39BarSerfrom ;
   private String wcpOAV40BarSerto ;
   private String wcpOAV18BarColNomfrom ;
   private String wcpOAV19BarColNomto ;
   private String wcpOAV35BarNomClifrom ;
   private String wcpOAV36BarNomClito ;
   private String wcpOAV77muestras ;
   private String wcpOAV13BarCodParfrom ;
   private String wcpOAV14BarCodParto ;
   private String wcpOAV5Cod_idtx ;
   private String wcpOAV34BarGirar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV9AuxEmprcod ;
   private String AV22BarDisNumfrom ;
   private String AV23BarDisNumto ;
   private String AV39BarSerfrom ;
   private String AV40BarSerto ;
   private String AV18BarColNomfrom ;
   private String AV19BarColNomto ;
   private String AV35BarNomClifrom ;
   private String AV36BarNomClito ;
   private String AV77muestras ;
   private String AV13BarCodParfrom ;
   private String AV14BarCodParto ;
   private String AV5Cod_idtx ;
   private String AV34BarGirar ;
   private String sGXsfl_43_idx="0001" ;
   private String AV59Emprcod ;
   private String AV174Pgmname ;
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
   private String bttBtnexportpdf_Internalname ;
   private String bttBtnexportpdf_Jsonclick ;
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
   private String edtCP_ID_Internalname ;
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
   private String AV24BarFasCod ;
   private String edtavBarfascod_Internalname ;
   private String AV25BarFasSig ;
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
   private String edtCP_BAREXT_Internalname ;
   private String A14321CP_DISDES ;
   private String edtCP_DISDES_Internalname ;
   private String edtCP_DISCOD_Internalname ;
   private String A14351CP_BARMAQC ;
   private String edtCP_BARMAQC_Internalname ;
   private String A14306CP_BARPLF ;
   private String edtCP_BARPLF_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluecp_barkgm_Internalname ;
   private String edtavTotvaluecp_barmtr_Internalname ;
   private String edtavTotvaluecp_barpie_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV6Station ;
   private String GXv_char2[] ;
   private String AV60EmprNom ;
   private String AV8UsurCod ;
   private String edtCP_BARCOD_Columnheaderclass ;
   private String edtCP_BARCOD_Columnclass ;
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
   private String sCtrlAV9AuxEmprcod ;
   private String sCtrlAV45CliCodfrom ;
   private String sCtrlAV46CliCodto ;
   private String sCtrlAV22BarDisNumfrom ;
   private String sCtrlAV23BarDisNumto ;
   private String sCtrlAV30BarFecGenfrom ;
   private String sCtrlAV31BarFecGento ;
   private String sCtrlAV41BarSitfrom ;
   private String sCtrlAV42BarSitto ;
   private String sCtrlAV26BarFecClifrom ;
   private String sCtrlAV27BarFecClito ;
   private String sCtrlAV28BarFecFprfrom ;
   private String sCtrlAV29BarFecFprto ;
   private String sCtrlAV32BarFecSalfrom ;
   private String sCtrlAV33BarFecSalto ;
   private String sCtrlAV39BarSerfrom ;
   private String sCtrlAV40BarSerto ;
   private String sCtrlAV43BarTipArtfrom ;
   private String sCtrlAV44BarTipArtto ;
   private String sCtrlAV18BarColNomfrom ;
   private String sCtrlAV19BarColNomto ;
   private String sCtrlAV20BarColNumfrom ;
   private String sCtrlAV21BarColNumto ;
   private String sCtrlAV35BarNomClifrom ;
   private String sCtrlAV36BarNomClito ;
   private String sCtrlAV37BarNumClifrom ;
   private String sCtrlAV38BarNumClito ;
   private String sCtrlAV77muestras ;
   private String sCtrlAV12BarCodfrom ;
   private String sCtrlAV17BarCodto ;
   private String sCtrlAV15BarCodReofrom ;
   private String sCtrlAV16BarCodReoto ;
   private String sCtrlAV13BarCodParfrom ;
   private String sCtrlAV14BarCodParto ;
   private String sCtrlAV5Cod_idtx ;
   private String sCtrlAV34BarGirar ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCP_ID_Jsonclick ;
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
   private String edtCP_BAREXT_Jsonclick ;
   private String edtCP_DISDES_Jsonclick ;
   private String edtCP_DISCOD_Jsonclick ;
   private String edtCP_BARMAQC_Jsonclick ;
   private String edtCP_BARPLF_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV30BarFecGenfrom ;
   private java.util.Date wcpOAV31BarFecGento ;
   private java.util.Date wcpOAV26BarFecClifrom ;
   private java.util.Date wcpOAV27BarFecClito ;
   private java.util.Date wcpOAV28BarFecFprfrom ;
   private java.util.Date wcpOAV29BarFecFprto ;
   private java.util.Date wcpOAV32BarFecSalfrom ;
   private java.util.Date wcpOAV33BarFecSalto ;
   private java.util.Date AV30BarFecGenfrom ;
   private java.util.Date AV31BarFecGento ;
   private java.util.Date AV26BarFecClifrom ;
   private java.util.Date AV27BarFecClito ;
   private java.util.Date AV28BarFecFprfrom ;
   private java.util.Date AV29BarFecFprto ;
   private java.util.Date AV32BarFecSalfrom ;
   private java.util.Date AV33BarFecSalto ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14304CP_BARFECF ;
   private java.util.Date A14310CP_BARFECS ;
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
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV83TempBoolean ;
   private boolean bDynCreated_Wwpaux_wc ;
   private String AV49ColumnsSelectorXML ;
   private String AV75ManageFiltersXml ;
   private String AV162UserCustomValue ;
   private String AV63FilterFullText ;
   private String A14327CP_CLINOM ;
   private String A14312CP_BARSERD ;
   private String A14343CP_TARTDSC ;
   private String A14315CP_BARNOMC ;
   private String A14317CP_BARGIRA ;
   private String A14334CP_DSC_BAR ;
   private String lV63FilterFullText ;
   private String AV157TotValueCP_BARKGM ;
   private String AV158TotValueCP_BARMTR ;
   private String AV159TotValueCP_BARPIE ;
   private String AV62ExcelFilename ;
   private String AV61ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV71HTTPRequest ;
   private com.genexus.webpanels.WebSession AV82Session ;
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
   private HTMLChoice cmbCP_BARESTR ;
   private IDataStoreProvider pr_default ;
   private int[] H027M2_A14305CP_BARNUMC ;
   private String[] H027M2_A14306CP_BARPLF ;
   private String[] H027M2_A14351CP_BARMAQC ;
   private int[] H027M2_A14322CP_DISCOD ;
   private String[] H027M2_A14321CP_DISDES ;
   private byte[] H027M2_A14320CP_BAREXT ;
   private String[] H027M2_A14341CP_DISUSRC ;
   private String[] H027M2_A14334CP_DSC_BAR ;
   private String[] H027M2_A14323CP_BARPROP ;
   private String[] H027M2_A14317CP_BARGIRA ;
   private java.math.BigDecimal[] H027M2_A14340CP_BARALBM ;
   private java.math.BigDecimal[] H027M2_A14339CP_BARALBK ;
   private java.util.Date[] H027M2_A14310CP_BARFECS ;
   private java.util.Date[] H027M2_A14304CP_BARFECF ;
   private java.util.Date[] H027M2_A14309CP_BARFECC ;
   private java.util.Date[] H027M2_A14308CP_BARFECG ;
   private byte[] H027M2_A14307CP_BARSIT ;
   private int[] H027M2_A14338CP_BARPIE ;
   private java.math.BigDecimal[] H027M2_A14337CP_BARMTR ;
   private java.math.BigDecimal[] H027M2_A14336CP_BARKGM ;
   private String[] H027M2_A14315CP_BARNOMC ;
   private int[] H027M2_A14332CP_BARCOLU ;
   private String[] H027M2_A14331CP_BARCOLO ;
   private String[] H027M2_A14343CP_TARTDSC ;
   private short[] H027M2_A14316CP_BARTIPA ;
   private String[] H027M2_A14312CP_BARSERD ;
   private String[] H027M2_A14311CP_BARSER ;
   private String[] H027M2_A14319CP_BARAGRE ;
   private String[] H027M2_A14303CP_BARCODP ;
   private byte[] H027M2_A14302CP_BARCODR ;
   private int[] H027M2_A14301CP_BARCOD ;
   private byte[] H027M2_A14352CP_BARESTR ;
   private String[] H027M2_A14324CP_BARDISN ;
   private String[] H027M2_A14327CP_CLINOM ;
   private int[] H027M2_A14326CP_CLICOD ;
   private String[] H027M2_A14328CP_EMPRCOD ;
   private long[] H027M2_A14297CP_ID ;
   private long[] H027M3_AGRID_nRecordCount ;
   private long[] H027M4_A14297CP_ID ;
   private String[] H027M4_A14306CP_BARPLF ;
   private int[] H027M4_A14305CP_BARNUMC ;
   private java.util.Date[] H027M4_A14304CP_BARFECF ;
   private java.util.Date[] H027M4_A14309CP_BARFECC ;
   private java.util.Date[] H027M4_A14310CP_BARFECS ;
   private java.util.Date[] H027M4_A14308CP_BARFECG ;
   private String[] H027M4_A14328CP_EMPRCOD ;
   private String[] H027M4_A14351CP_BARMAQC ;
   private String[] H027M4_A14341CP_DISUSRC ;
   private String[] H027M4_A14334CP_DSC_BAR ;
   private String[] H027M4_A14323CP_BARPROP ;
   private String[] H027M4_A14317CP_BARGIRA ;
   private java.math.BigDecimal[] H027M4_A14340CP_BARALBM ;
   private java.math.BigDecimal[] H027M4_A14339CP_BARALBK ;
   private byte[] H027M4_A14307CP_BARSIT ;
   private int[] H027M4_A14338CP_BARPIE ;
   private java.math.BigDecimal[] H027M4_A14337CP_BARMTR ;
   private java.math.BigDecimal[] H027M4_A14336CP_BARKGM ;
   private String[] H027M4_A14315CP_BARNOMC ;
   private int[] H027M4_A14332CP_BARCOLU ;
   private String[] H027M4_A14331CP_BARCOLO ;
   private String[] H027M4_A14343CP_TARTDSC ;
   private short[] H027M4_A14316CP_BARTIPA ;
   private String[] H027M4_A14312CP_BARSERD ;
   private String[] H027M4_A14311CP_BARSER ;
   private String[] H027M4_A14319CP_BARAGRE ;
   private String[] H027M4_A14303CP_BARCODP ;
   private byte[] H027M4_A14302CP_BARCODR ;
   private int[] H027M4_A14301CP_BARCOD ;
   private byte[] H027M4_A14352CP_BARESTR ;
   private String[] H027M4_A14324CP_BARDISN ;
   private String[] H027M4_A14327CP_CLINOM ;
   private int[] H027M4_A14326CP_CLICOD ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV73ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV47ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV48ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV58DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV160TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV163WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class listconsultaproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H027M2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63FilterFullText ,
                                          String AV22BarDisNumfrom ,
                                          String AV23BarDisNumto ,
                                          int AV45CliCodfrom ,
                                          int AV46CliCodto ,
                                          byte AV41BarSitfrom ,
                                          byte AV42BarSitto ,
                                          java.util.Date AV30BarFecGenfrom ,
                                          java.util.Date AV31BarFecGento ,
                                          java.util.Date AV32BarFecSalfrom ,
                                          java.util.Date AV33BarFecSalto ,
                                          java.util.Date AV26BarFecClifrom ,
                                          java.util.Date AV27BarFecClito ,
                                          java.util.Date AV28BarFecFprfrom ,
                                          java.util.Date AV29BarFecFprto ,
                                          String AV39BarSerfrom ,
                                          String AV40BarSerto ,
                                          String AV18BarColNomfrom ,
                                          String AV19BarColNomto ,
                                          int AV20BarColNumfrom ,
                                          int AV21BarColNumto ,
                                          String AV35BarNomClifrom ,
                                          String AV36BarNomClito ,
                                          int AV37BarNumClifrom ,
                                          int AV38BarNumClito ,
                                          short AV43BarTipArtfrom ,
                                          short AV44BarTipArtto ,
                                          int AV12BarCodfrom ,
                                          int AV17BarCodto ,
                                          byte AV15BarCodReofrom ,
                                          byte AV16BarCodReoto ,
                                          String AV13BarCodParfrom ,
                                          String AV14BarCodParto ,
                                          String AV5Cod_idtx ,
                                          String AV34BarGirar ,
                                          String AV77muestras ,
                                          int A14326CP_CLICOD ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          byte A14352CP_BARESTR ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14319CP_BARAGRE ,
                                          String A14311CP_BARSER ,
                                          String A14312CP_BARSERD ,
                                          short A14316CP_BARTIPA ,
                                          String A14343CP_TARTDSC ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          java.math.BigDecimal A14336CP_BARKGM ,
                                          java.math.BigDecimal A14337CP_BARMTR ,
                                          int A14338CP_BARPIE ,
                                          byte A14307CP_BARSIT ,
                                          java.math.BigDecimal A14339CP_BARALBK ,
                                          java.math.BigDecimal A14340CP_BARALBM ,
                                          String A14317CP_BARGIRA ,
                                          String A14323CP_BARPROP ,
                                          String A14334CP_DSC_BAR ,
                                          String A14341CP_DISUSRC ,
                                          String A14351CP_BARMAQC ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          int A14305CP_BARNUMC ,
                                          String A14306CP_BARPLF ,
                                          String AV59Emprcod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[67];
      Object[] GXv_Object23 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " CP_BARNUMC, CP_BARPLF, CP_BARMAQC, CP_DISCOD, CP_DISDES, CP_BAREXT, CP_DISUSRC, CP_DSC_BAR, CP_BARPROP, CP_BARGIRA, CP_BARALBM, CP_BARALBK, CP_BARFECS, CP_BARFECF," ;
      sSelectString += " CP_BARFECC, CP_BARFECG, CP_BARSIT, CP_BARPIE, CP_BARMTR, CP_BARKGM, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_TARTDSC, CP_BARTIPA, CP_BARSERD, CP_BARSER, CP_BARAGRE," ;
      sSelectString += " CP_BARCODP, CP_BARCODR, CP_BARCOD, CP_BARESTR, CP_BARDISN, CP_CLINOM, CP_CLICOD, CP_EMPRCOD, CP_ID" ;
      sFromString = " FROM TXPCONPRO" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV63FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CP_CLICOD,'999990'), 2) like '%' || ?) or ( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARESTR,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCOD,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCODR,'90'), 2) like '%' || ?) or ( UPPER(CP_BARCODP) like '%' || UPPER(?)) or ( UPPER(CP_BARAGRE) like '%' || UPPER(?)) or ( UPPER(CP_BARSER) like '%' || UPPER(?)) or ( UPPER(CP_BARSERD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARTIPA,'9990'), 2) like '%' || ?) or ( UPPER(CP_TARTDSC) like '%' || UPPER(?)) or ( UPPER(CP_BARCOLO) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOLU,'999990'), 2) like '%' || ?) or ( UPPER(CP_BARNOMC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARKGM,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARMTR,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARPIE,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARSIT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBK,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBM,'999990.99'), 2) like '%' || ?) or ( UPPER(CP_BARGIRA) like '%' || UPPER(?)) or ( UPPER(CP_BARPROP) like '%' || UPPER(?)) or ( UPPER(CP_DSC_BAR) like '%' || UPPER(?)) or ( UPPER(CP_DISUSRC) like '%' || UPPER(?)) or ( UPPER(CP_BARMAQC) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
         GXv_int22[2] = (byte)(1) ;
         GXv_int22[3] = (byte)(1) ;
         GXv_int22[4] = (byte)(1) ;
         GXv_int22[5] = (byte)(1) ;
         GXv_int22[6] = (byte)(1) ;
         GXv_int22[7] = (byte)(1) ;
         GXv_int22[8] = (byte)(1) ;
         GXv_int22[9] = (byte)(1) ;
         GXv_int22[10] = (byte)(1) ;
         GXv_int22[11] = (byte)(1) ;
         GXv_int22[12] = (byte)(1) ;
         GXv_int22[13] = (byte)(1) ;
         GXv_int22[14] = (byte)(1) ;
         GXv_int22[15] = (byte)(1) ;
         GXv_int22[16] = (byte)(1) ;
         GXv_int22[17] = (byte)(1) ;
         GXv_int22[18] = (byte)(1) ;
         GXv_int22[19] = (byte)(1) ;
         GXv_int22[20] = (byte)(1) ;
         GXv_int22[21] = (byte)(1) ;
         GXv_int22[22] = (byte)(1) ;
         GXv_int22[23] = (byte)(1) ;
         GXv_int22[24] = (byte)(1) ;
         GXv_int22[25] = (byte)(1) ;
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (0==AV45CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (0==AV41BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( ! (0==AV42BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int22[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int22[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int22[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int22[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int22[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int22[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int22[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int22[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int22[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int22[44] = (byte)(1) ;
      }
      if ( ! (0==AV20BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int22[45] = (byte)(1) ;
      }
      if ( ! (0==AV21BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int22[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int22[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int22[48] = (byte)(1) ;
      }
      if ( ! (0==AV37BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int22[49] = (byte)(1) ;
      }
      if ( ! (0==AV38BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int22[50] = (byte)(1) ;
      }
      if ( ! (0==AV43BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int22[51] = (byte)(1) ;
      }
      if ( ! (0==AV44BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int22[52] = (byte)(1) ;
      }
      if ( ! (0==AV12BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int22[53] = (byte)(1) ;
      }
      if ( ! (0==AV17BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int22[54] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int22[55] = (byte)(1) ;
      }
      if ( ! (0==AV16BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int22[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int22[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int22[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV5Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int22[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int22[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int22[61] = (byte)(1) ;
      }
      sOrderString += " ORDER BY CP_EMPRCOD" ;
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H027M3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63FilterFullText ,
                                          String AV22BarDisNumfrom ,
                                          String AV23BarDisNumto ,
                                          int AV45CliCodfrom ,
                                          int AV46CliCodto ,
                                          byte AV41BarSitfrom ,
                                          byte AV42BarSitto ,
                                          java.util.Date AV30BarFecGenfrom ,
                                          java.util.Date AV31BarFecGento ,
                                          java.util.Date AV32BarFecSalfrom ,
                                          java.util.Date AV33BarFecSalto ,
                                          java.util.Date AV26BarFecClifrom ,
                                          java.util.Date AV27BarFecClito ,
                                          java.util.Date AV28BarFecFprfrom ,
                                          java.util.Date AV29BarFecFprto ,
                                          String AV39BarSerfrom ,
                                          String AV40BarSerto ,
                                          String AV18BarColNomfrom ,
                                          String AV19BarColNomto ,
                                          int AV20BarColNumfrom ,
                                          int AV21BarColNumto ,
                                          String AV35BarNomClifrom ,
                                          String AV36BarNomClito ,
                                          int AV37BarNumClifrom ,
                                          int AV38BarNumClito ,
                                          short AV43BarTipArtfrom ,
                                          short AV44BarTipArtto ,
                                          int AV12BarCodfrom ,
                                          int AV17BarCodto ,
                                          byte AV15BarCodReofrom ,
                                          byte AV16BarCodReoto ,
                                          String AV13BarCodParfrom ,
                                          String AV14BarCodParto ,
                                          String AV5Cod_idtx ,
                                          String AV34BarGirar ,
                                          String AV77muestras ,
                                          int A14326CP_CLICOD ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          byte A14352CP_BARESTR ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14319CP_BARAGRE ,
                                          String A14311CP_BARSER ,
                                          String A14312CP_BARSERD ,
                                          short A14316CP_BARTIPA ,
                                          String A14343CP_TARTDSC ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          java.math.BigDecimal A14336CP_BARKGM ,
                                          java.math.BigDecimal A14337CP_BARMTR ,
                                          int A14338CP_BARPIE ,
                                          byte A14307CP_BARSIT ,
                                          java.math.BigDecimal A14339CP_BARALBK ,
                                          java.math.BigDecimal A14340CP_BARALBM ,
                                          String A14317CP_BARGIRA ,
                                          String A14323CP_BARPROP ,
                                          String A14334CP_DSC_BAR ,
                                          String A14341CP_DISUSRC ,
                                          String A14351CP_BARMAQC ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          int A14305CP_BARNUMC ,
                                          String A14306CP_BARPLF ,
                                          String AV59Emprcod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[62];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV63FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CP_CLICOD,'999990'), 2) like '%' || ?) or ( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARESTR,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCOD,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCODR,'90'), 2) like '%' || ?) or ( UPPER(CP_BARCODP) like '%' || UPPER(?)) or ( UPPER(CP_BARAGRE) like '%' || UPPER(?)) or ( UPPER(CP_BARSER) like '%' || UPPER(?)) or ( UPPER(CP_BARSERD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARTIPA,'9990'), 2) like '%' || ?) or ( UPPER(CP_TARTDSC) like '%' || UPPER(?)) or ( UPPER(CP_BARCOLO) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOLU,'999990'), 2) like '%' || ?) or ( UPPER(CP_BARNOMC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARKGM,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARMTR,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARPIE,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARSIT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBK,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBM,'999990.99'), 2) like '%' || ?) or ( UPPER(CP_BARGIRA) like '%' || UPPER(?)) or ( UPPER(CP_BARPROP) like '%' || UPPER(?)) or ( UPPER(CP_DSC_BAR) like '%' || UPPER(?)) or ( UPPER(CP_DISUSRC) like '%' || UPPER(?)) or ( UPPER(CP_BARMAQC) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int24[1] = (byte)(1) ;
         GXv_int24[2] = (byte)(1) ;
         GXv_int24[3] = (byte)(1) ;
         GXv_int24[4] = (byte)(1) ;
         GXv_int24[5] = (byte)(1) ;
         GXv_int24[6] = (byte)(1) ;
         GXv_int24[7] = (byte)(1) ;
         GXv_int24[8] = (byte)(1) ;
         GXv_int24[9] = (byte)(1) ;
         GXv_int24[10] = (byte)(1) ;
         GXv_int24[11] = (byte)(1) ;
         GXv_int24[12] = (byte)(1) ;
         GXv_int24[13] = (byte)(1) ;
         GXv_int24[14] = (byte)(1) ;
         GXv_int24[15] = (byte)(1) ;
         GXv_int24[16] = (byte)(1) ;
         GXv_int24[17] = (byte)(1) ;
         GXv_int24[18] = (byte)(1) ;
         GXv_int24[19] = (byte)(1) ;
         GXv_int24[20] = (byte)(1) ;
         GXv_int24[21] = (byte)(1) ;
         GXv_int24[22] = (byte)(1) ;
         GXv_int24[23] = (byte)(1) ;
         GXv_int24[24] = (byte)(1) ;
         GXv_int24[25] = (byte)(1) ;
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (0==AV45CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (0==AV41BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( ! (0==AV42BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int24[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int24[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int24[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int24[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int24[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int24[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int24[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int24[44] = (byte)(1) ;
      }
      if ( ! (0==AV20BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int24[45] = (byte)(1) ;
      }
      if ( ! (0==AV21BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int24[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int24[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int24[48] = (byte)(1) ;
      }
      if ( ! (0==AV37BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int24[49] = (byte)(1) ;
      }
      if ( ! (0==AV38BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int24[50] = (byte)(1) ;
      }
      if ( ! (0==AV43BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int24[51] = (byte)(1) ;
      }
      if ( ! (0==AV44BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int24[52] = (byte)(1) ;
      }
      if ( ! (0==AV12BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int24[53] = (byte)(1) ;
      }
      if ( ! (0==AV17BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int24[54] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int24[55] = (byte)(1) ;
      }
      if ( ! (0==AV16BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int24[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int24[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int24[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV5Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int24[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int24[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int24[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_H027M4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63FilterFullText ,
                                          String AV22BarDisNumfrom ,
                                          String AV23BarDisNumto ,
                                          int AV45CliCodfrom ,
                                          int AV46CliCodto ,
                                          byte AV41BarSitfrom ,
                                          byte AV42BarSitto ,
                                          java.util.Date AV30BarFecGenfrom ,
                                          java.util.Date AV31BarFecGento ,
                                          java.util.Date AV32BarFecSalfrom ,
                                          java.util.Date AV33BarFecSalto ,
                                          java.util.Date AV26BarFecClifrom ,
                                          java.util.Date AV27BarFecClito ,
                                          java.util.Date AV28BarFecFprfrom ,
                                          java.util.Date AV29BarFecFprto ,
                                          String AV39BarSerfrom ,
                                          String AV40BarSerto ,
                                          String AV18BarColNomfrom ,
                                          String AV19BarColNomto ,
                                          int AV20BarColNumfrom ,
                                          int AV21BarColNumto ,
                                          String AV35BarNomClifrom ,
                                          String AV36BarNomClito ,
                                          int AV37BarNumClifrom ,
                                          int AV38BarNumClito ,
                                          short AV43BarTipArtfrom ,
                                          short AV44BarTipArtto ,
                                          int AV12BarCodfrom ,
                                          int AV17BarCodto ,
                                          byte AV15BarCodReofrom ,
                                          byte AV16BarCodReoto ,
                                          String AV13BarCodParfrom ,
                                          String AV14BarCodParto ,
                                          String AV5Cod_idtx ,
                                          String AV34BarGirar ,
                                          String AV77muestras ,
                                          int A14326CP_CLICOD ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          byte A14352CP_BARESTR ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14319CP_BARAGRE ,
                                          String A14311CP_BARSER ,
                                          String A14312CP_BARSERD ,
                                          short A14316CP_BARTIPA ,
                                          String A14343CP_TARTDSC ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          java.math.BigDecimal A14336CP_BARKGM ,
                                          java.math.BigDecimal A14337CP_BARMTR ,
                                          int A14338CP_BARPIE ,
                                          byte A14307CP_BARSIT ,
                                          java.math.BigDecimal A14339CP_BARALBK ,
                                          java.math.BigDecimal A14340CP_BARALBM ,
                                          String A14317CP_BARGIRA ,
                                          String A14323CP_BARPROP ,
                                          String A14334CP_DSC_BAR ,
                                          String A14341CP_DISUSRC ,
                                          String A14351CP_BARMAQC ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          int A14305CP_BARNUMC ,
                                          String A14306CP_BARPLF ,
                                          String AV59Emprcod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[62];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT CP_ID, CP_BARPLF, CP_BARNUMC, CP_BARFECF, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_EMPRCOD, CP_BARMAQC, CP_DISUSRC, CP_DSC_BAR, CP_BARPROP, CP_BARGIRA, CP_BARALBM," ;
      scmdbuf += " CP_BARALBK, CP_BARSIT, CP_BARPIE, CP_BARMTR, CP_BARKGM, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_TARTDSC, CP_BARTIPA, CP_BARSERD, CP_BARSER, CP_BARAGRE, CP_BARCODP," ;
      scmdbuf += " CP_BARCODR, CP_BARCOD, CP_BARESTR, CP_BARDISN, CP_CLINOM, CP_CLICOD FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV63FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CP_CLICOD,'999990'), 2) like '%' || ?) or ( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARESTR,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCOD,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCODR,'90'), 2) like '%' || ?) or ( UPPER(CP_BARCODP) like '%' || UPPER(?)) or ( UPPER(CP_BARAGRE) like '%' || UPPER(?)) or ( UPPER(CP_BARSER) like '%' || UPPER(?)) or ( UPPER(CP_BARSERD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARTIPA,'9990'), 2) like '%' || ?) or ( UPPER(CP_TARTDSC) like '%' || UPPER(?)) or ( UPPER(CP_BARCOLO) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOLU,'999990'), 2) like '%' || ?) or ( UPPER(CP_BARNOMC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARKGM,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARMTR,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARPIE,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARSIT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBK,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBM,'999990.99'), 2) like '%' || ?) or ( UPPER(CP_BARGIRA) like '%' || UPPER(?)) or ( UPPER(CP_BARPROP) like '%' || UPPER(?)) or ( UPPER(CP_DSC_BAR) like '%' || UPPER(?)) or ( UPPER(CP_DISUSRC) like '%' || UPPER(?)) or ( UPPER(CP_BARMAQC) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
         GXv_int26[2] = (byte)(1) ;
         GXv_int26[3] = (byte)(1) ;
         GXv_int26[4] = (byte)(1) ;
         GXv_int26[5] = (byte)(1) ;
         GXv_int26[6] = (byte)(1) ;
         GXv_int26[7] = (byte)(1) ;
         GXv_int26[8] = (byte)(1) ;
         GXv_int26[9] = (byte)(1) ;
         GXv_int26[10] = (byte)(1) ;
         GXv_int26[11] = (byte)(1) ;
         GXv_int26[12] = (byte)(1) ;
         GXv_int26[13] = (byte)(1) ;
         GXv_int26[14] = (byte)(1) ;
         GXv_int26[15] = (byte)(1) ;
         GXv_int26[16] = (byte)(1) ;
         GXv_int26[17] = (byte)(1) ;
         GXv_int26[18] = (byte)(1) ;
         GXv_int26[19] = (byte)(1) ;
         GXv_int26[20] = (byte)(1) ;
         GXv_int26[21] = (byte)(1) ;
         GXv_int26[22] = (byte)(1) ;
         GXv_int26[23] = (byte)(1) ;
         GXv_int26[24] = (byte)(1) ;
         GXv_int26[25] = (byte)(1) ;
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (0==AV45CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (0==AV46CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (0==AV41BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (0==AV42BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int26[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int26[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int26[44] = (byte)(1) ;
      }
      if ( ! (0==AV20BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int26[45] = (byte)(1) ;
      }
      if ( ! (0==AV21BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int26[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int26[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int26[48] = (byte)(1) ;
      }
      if ( ! (0==AV37BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int26[49] = (byte)(1) ;
      }
      if ( ! (0==AV38BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int26[50] = (byte)(1) ;
      }
      if ( ! (0==AV43BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int26[51] = (byte)(1) ;
      }
      if ( ! (0==AV44BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int26[52] = (byte)(1) ;
      }
      if ( ! (0==AV12BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int26[53] = (byte)(1) ;
      }
      if ( ! (0==AV17BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int26[54] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int26[55] = (byte)(1) ;
      }
      if ( ! (0==AV16BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int26[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int26[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int26[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV5Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int26[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int26[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int26[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CP_EMPRCOD" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_H027M2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).shortValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (java.math.BigDecimal)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , (java.util.Date)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] );
            case 1 :
                  return conditional_H027M3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).shortValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (java.math.BigDecimal)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , (java.util.Date)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] );
            case 2 :
                  return conditional_H027M4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).shortValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (java.math.BigDecimal)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , (java.util.Date)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H027M2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027M3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027M4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               ((byte[]) buf[31])[0] = rslt.getByte(32);
               ((String[]) buf[32])[0] = rslt.getString(33, 8);
               ((String[]) buf[33])[0] = rslt.getVarchar(34);
               ((int[]) buf[34])[0] = rslt.getInt(35);
               ((String[]) buf[35])[0] = rslt.getString(36, 3);
               ((long[]) buf[36])[0] = rslt.getLong(37);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[19])[0] = rslt.getVarchar(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 13);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((String[]) buf[24])[0] = rslt.getVarchar(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 16);
               ((String[]) buf[26])[0] = rslt.getString(27, 1);
               ((String[]) buf[27])[0] = rslt.getString(28, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((int[]) buf[29])[0] = rslt.getInt(30);
               ((byte[]) buf[30])[0] = rslt.getByte(31);
               ((String[]) buf[31])[0] = rslt.getString(32, 8);
               ((String[]) buf[32])[0] = rslt.getVarchar(33);
               ((int[]) buf[33])[0] = rslt.getInt(34);
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
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 16);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[121]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[123]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 4);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 20);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 1);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[132]).intValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[95]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[96]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 16);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 4);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 20);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[95]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[96]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 16);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 4);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 20);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               return;
      }
   }

}

