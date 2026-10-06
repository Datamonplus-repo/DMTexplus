package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_wc_impl extends GXWebComponent
{
   public consultadeproduccion_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_wc_impl.class ));
   }

   public consultadeproduccion_wc_impl( int remoteHandle ,
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
      cmbavGrupodeacciones = new HTMLChoice();
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
               AV29Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Emprcod", AV29Emprcod);
               AV30clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "clicodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30clicodfrom), 6, 0));
               AV31clicodto = (int)(GXutil.lval( httpContext.GetPar( "clicodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31clicodto), 6, 0));
               AV32bardisnumfrom = httpContext.GetPar( "bardisnumfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32bardisnumfrom", AV32bardisnumfrom);
               AV33bardisnumto = httpContext.GetPar( "bardisnumto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33bardisnumto", AV33bardisnumto);
               AV34barfecgenfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecgenfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34barfecgenfrom", localUtil.format(AV34barfecgenfrom, "99/99/99"));
               AV35barfecgento = localUtil.parseDateParm( httpContext.GetPar( "barfecgento")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35barfecgento", localUtil.format(AV35barfecgento, "99/99/99"));
               AV36barsitfrom = (byte)(GXutil.lval( httpContext.GetPar( "barsitfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36barsitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barsitfrom), 2, 0));
               AV37barsitto = (byte)(GXutil.lval( httpContext.GetPar( "barsitto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37barsitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37barsitto), 2, 0));
               AV114BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarFecClifrom", localUtil.format(AV114BarFecClifrom, "99/99/99"));
               AV115BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarFecClito", localUtil.format(AV115BarFecClito, "99/99/99"));
               AV116BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116BarFecFprfrom", localUtil.format(AV116BarFecFprfrom, "99/99/99"));
               AV117BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117BarFecFprto", localUtil.format(AV117BarFecFprto, "99/99/99"));
               AV118BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118BarFecSalfrom", localUtil.format(AV118BarFecSalfrom, "99/99/99"));
               AV119BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarFecSalto", localUtil.format(AV119BarFecSalto, "99/99/99"));
               AV120BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarSerfrom", AV120BarSerfrom);
               AV121BarSerto = httpContext.GetPar( "BarSerto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121BarSerto", AV121BarSerto);
               AV130BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130BarTipArtfrom), 4, 0));
               AV131BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131BarTipArtto), 4, 0));
               AV122BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122BarColNomfrom", AV122BarColNomfrom);
               AV123BarColNomto = httpContext.GetPar( "BarColNomto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123BarColNomto", AV123BarColNomto);
               AV124BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124BarColNumfrom), 6, 0));
               AV125BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125BarColNumto), 6, 0));
               AV126BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126BarNomClifrom", AV126BarNomClifrom);
               AV127BarNomClito = httpContext.GetPar( "BarNomClito") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarNomClito", AV127BarNomClito);
               AV128BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarNumClifrom), 6, 0));
               AV129BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129BarNumClito), 6, 0));
               AV130BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130BarTipArtfrom), 4, 0));
               AV131BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131BarTipArtto), 4, 0));
               AV133Muestras = httpContext.GetPar( "Muestras") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133Muestras", AV133Muestras);
               AV134BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134BarCodfrom), 8, 0));
               AV139BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139BarCodto), 8, 0));
               AV137BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV137BarCodReofrom", GXutil.str( AV137BarCodReofrom, 1, 0));
               AV138BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138BarCodReoto", GXutil.str( AV138BarCodReoto, 1, 0));
               AV135BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV135BarCodParfrom", AV135BarCodParfrom);
               AV136BarCodParto = httpContext.GetPar( "BarCodParto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136BarCodParto", AV136BarCodParto);
               AV155Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155Cod_idtx", AV155Cod_idtx);
               AV158BarGirar = httpContext.GetPar( "BarGirar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158BarGirar", AV158BarGirar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV29Emprcod,Integer.valueOf(AV30clicodfrom),Integer.valueOf(AV31clicodto),AV32bardisnumfrom,AV33bardisnumto,AV34barfecgenfrom,AV35barfecgento,Byte.valueOf(AV36barsitfrom),Byte.valueOf(AV37barsitto),AV114BarFecClifrom,AV115BarFecClito,AV116BarFecFprfrom,AV117BarFecFprto,AV118BarFecSalfrom,AV119BarFecSalto,AV120BarSerfrom,AV121BarSerto,Short.valueOf(AV130BarTipArtfrom),Short.valueOf(AV131BarTipArtto),AV122BarColNomfrom,AV123BarColNomto,Integer.valueOf(AV124BarColNumfrom),Integer.valueOf(AV125BarColNumto),AV126BarNomClifrom,AV127BarNomClito,Integer.valueOf(AV128BarNumClifrom),Integer.valueOf(AV129BarNumClito),Short.valueOf(AV130BarTipArtfrom),Short.valueOf(AV131BarTipArtto),AV133Muestras,Integer.valueOf(AV134BarCodfrom),Integer.valueOf(AV139BarCodto),Byte.valueOf(AV137BarCodReofrom),Byte.valueOf(AV138BarCodReoto),AV135BarCodParfrom,AV136BarCodParto,AV155Cod_idtx,AV158BarGirar});
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
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
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
      AV29Emprcod = httpContext.GetPar( "Emprcod") ;
      AV30clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "clicodfrom"))) ;
      AV31clicodto = (int)(GXutil.lval( httpContext.GetPar( "clicodto"))) ;
      AV32bardisnumfrom = httpContext.GetPar( "bardisnumfrom") ;
      AV33bardisnumto = httpContext.GetPar( "bardisnumto") ;
      AV34barfecgenfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecgenfrom")) ;
      AV35barfecgento = localUtil.parseDateParm( httpContext.GetPar( "barfecgento")) ;
      AV36barsitfrom = (byte)(GXutil.lval( httpContext.GetPar( "barsitfrom"))) ;
      AV37barsitto = (byte)(GXutil.lval( httpContext.GetPar( "barsitto"))) ;
      AV114BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
      AV115BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
      AV116BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
      AV117BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
      AV118BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
      AV119BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
      AV120BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
      AV121BarSerto = httpContext.GetPar( "BarSerto") ;
      AV130BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
      AV131BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
      AV122BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
      AV123BarColNomto = httpContext.GetPar( "BarColNomto") ;
      AV124BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
      AV125BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
      AV126BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
      AV127BarNomClito = httpContext.GetPar( "BarNomClito") ;
      AV128BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
      AV129BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
      AV133Muestras = httpContext.GetPar( "Muestras") ;
      AV134BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
      AV139BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
      AV137BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
      AV138BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
      AV135BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
      AV136BarCodParto = httpContext.GetPar( "BarCodParto") ;
      AV155Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
      AV158BarGirar = httpContext.GetPar( "BarGirar") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV17ColumnsSelector);
      AV176Pgmname = httpContext.GetPar( "Pgmname") ;
      AV38OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV39OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV41TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV42TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV43TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV44TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV23TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV24TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV70TFBarAgrEst = httpContext.GetPar( "TFBarAgrEst") ;
      AV71TFBarAgrEst_Sel = httpContext.GetPar( "TFBarAgrEst_Sel") ;
      AV47TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV48TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV49TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV50TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV104TFBarTipArt = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt"))) ;
      AV105TFBarTipArt_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt_To"))) ;
      AV106TFBarTipArtDsc = httpContext.GetPar( "TFBarTipArtDsc") ;
      AV107TFBarTipArtDsc_Sel = httpContext.GetPar( "TFBarTipArtDsc_Sel") ;
      AV51TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV52TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV53TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV54TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV55TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV56TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV63TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV64TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV72TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV76TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV80TFBarFecFpr = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecFpr")) ;
      AV84TFBarFecSal = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecSal")) ;
      AV90TFBarFasSig = httpContext.GetPar( "TFBarFasSig") ;
      AV91TFBarFasSig_Sel = httpContext.GetPar( "TFBarFasSig_Sel") ;
      AV68TFBarAlbUltimo = GXutil.lval( httpContext.GetPar( "TFBarAlbUltimo")) ;
      AV69TFBarAlbUltimo_To = GXutil.lval( httpContext.GetPar( "TFBarAlbUltimo_To")) ;
      AV112TFBarAlbFact = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbFact"))) ;
      AV113TFBarAlbFact_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbFact_To"))) ;
      AV96TFBarGirar = httpContext.GetPar( "TFBarGirar") ;
      AV97TFBarGirar_Sel = httpContext.GetPar( "TFBarGirar_Sel") ;
      AV98TFBarAcaAnh = (short)(GXutil.lval( httpContext.GetPar( "TFBarAcaAnh"))) ;
      AV99TFBarAcaAnh_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarAcaAnh_To"))) ;
      AV102TFBarProPer = httpContext.GetPar( "TFBarProPer") ;
      AV103TFBarProPer_Sel = httpContext.GetPar( "TFBarProPer_Sel") ;
      AV108TFBarNormas = httpContext.GetPar( "TFBarNormas") ;
      AV109TFBarNormas_Sel = httpContext.GetPar( "TFBarNormas_Sel") ;
      AV110TFDisUsrCod = httpContext.GetPar( "TFDisUsrCod") ;
      AV111TFDisUsrCod_Sel = httpContext.GetPar( "TFDisUsrCod_Sel") ;
      AV159cuaderno = (short)(GXutil.lval( httpContext.GetPar( "cuaderno"))) ;
      AV161STNORM = (short)(GXutil.lval( httpContext.GetPar( "STNORM"))) ;
      AV154Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A13878PedidoClie = httpContext.GetPar( "PedidoClie") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV29Emprcod, AV30clicodfrom, AV31clicodto, AV32bardisnumfrom, AV33bardisnumto, AV34barfecgenfrom, AV35barfecgento, AV36barsitfrom, AV37barsitto, AV114BarFecClifrom, AV115BarFecClito, AV116BarFecFprfrom, AV117BarFecFprto, AV118BarFecSalfrom, AV119BarFecSalto, AV120BarSerfrom, AV121BarSerto, AV130BarTipArtfrom, AV131BarTipArtto, AV122BarColNomfrom, AV123BarColNomto, AV124BarColNumfrom, AV125BarColNumto, AV126BarNomClifrom, AV127BarNomClito, AV128BarNumClifrom, AV129BarNumClito, AV133Muestras, AV134BarCodfrom, AV139BarCodto, AV137BarCodReofrom, AV138BarCodReoto, AV135BarCodParfrom, AV136BarCodParto, AV155Cod_idtx, AV158BarGirar, AV17ColumnsSelector, AV176Pgmname, AV38OrderedBy, AV39OrderedDsc, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV23TFBarNHdr, AV24TFBarNHdr_Sel, AV70TFBarAgrEst, AV71TFBarAgrEst_Sel, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV104TFBarTipArt, AV105TFBarTipArt_To, AV106TFBarTipArtDsc, AV107TFBarTipArtDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV63TFBarSit, AV64TFBarSit_To, AV72TFBarFecGen, AV76TFBarFecCli, AV80TFBarFecFpr, AV84TFBarFecSal, AV90TFBarFasSig, AV91TFBarFasSig_Sel, AV68TFBarAlbUltimo, AV69TFBarAlbUltimo_To, AV112TFBarAlbFact, AV113TFBarAlbFact_To, AV96TFBarGirar, AV97TFBarGirar_Sel, AV98TFBarAcaAnh, AV99TFBarAcaAnh_To, AV102TFBarProPer, AV103TFBarProPer_Sel, AV108TFBarNormas, AV109TFBarNormas_Sel, AV110TFDisUsrCod, AV111TFDisUsrCod_Sel, AV159cuaderno, AV161STNORM, AV154Moda21, A396EmprCod, A13878PedidoClie, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1KV2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Mantenimiento HDRs", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.consultadeproduccion_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV30clicodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31clicodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV32bardisnumfrom)),GXutil.URLEncode(GXutil.rtrim(AV33bardisnumto)),GXutil.URLEncode(GXutil.formatDateParm(AV34barfecgenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV35barfecgento)),GXutil.URLEncode(GXutil.ltrimstr(AV36barsitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37barsitto,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV114BarFecClifrom)),GXutil.URLEncode(GXutil.formatDateParm(AV115BarFecClito)),GXutil.URLEncode(GXutil.formatDateParm(AV116BarFecFprfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV117BarFecFprto)),GXutil.URLEncode(GXutil.formatDateParm(AV118BarFecSalfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV119BarFecSalto)),GXutil.URLEncode(GXutil.rtrim(AV120BarSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV121BarSerto)),GXutil.URLEncode(GXutil.ltrimstr(AV130BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV131BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV122BarColNomfrom)),GXutil.URLEncode(GXutil.rtrim(AV123BarColNomto)),GXutil.URLEncode(GXutil.ltrimstr(AV124BarColNumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV125BarColNumto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV126BarNomClifrom)),GXutil.URLEncode(GXutil.rtrim(AV127BarNomClito)),GXutil.URLEncode(GXutil.ltrimstr(AV128BarNumClifrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV129BarNumClito,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV130BarTipArtfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV131BarTipArtto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV133Muestras)),GXutil.URLEncode(GXutil.ltrimstr(AV134BarCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV139BarCodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV137BarCodReofrom,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV138BarCodReoto,1,0)),GXutil.URLEncode(GXutil.rtrim(AV135BarCodParfrom)),GXutil.URLEncode(GXutil.rtrim(AV136BarCodParto)),GXutil.URLEncode(GXutil.rtrim(AV155Cod_idtx)),GXutil.URLEncode(GXutil.rtrim(AV158BarGirar))}, new String[] {"Emprcod","clicodfrom","clicodto","bardisnumfrom","bardisnumto","barfecgenfrom","barfecgento","barsitfrom","barsitto","BarFecClifrom","BarFecClito","BarFecFprfrom","BarFecFprto","BarFecSalfrom","BarFecSalto","BarSerfrom","BarSerto","BarTipArtfrom","BarTipArtto","BarColNomfrom","BarColNomto","BarColNumfrom","BarColNumto","BarNomClifrom","BarNomClito","BarNumClifrom","BarNumClito","BarTipArtfrom","BarTipArtto","Muestras","BarCodfrom","BarCodto","BarCodReofrom","BarCodReoto","BarCodParfrom","BarCodParto","Cod_idtx","BarGirar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCUADERNO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV159cuaderno), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTNORM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV161STNORM), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV154Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV176Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_40, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV27GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV28GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29Emprcod", GXutil.rtrim( wcpOAV29Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30clicodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV30clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31clicodto", GXutil.ltrim( localUtil.ntoc( wcpOAV31clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32bardisnumfrom", GXutil.rtrim( wcpOAV32bardisnumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33bardisnumto", GXutil.rtrim( wcpOAV33bardisnumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34barfecgenfrom", localUtil.dtoc( wcpOAV34barfecgenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35barfecgento", localUtil.dtoc( wcpOAV35barfecgento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36barsitfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV36barsitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37barsitto", GXutil.ltrim( localUtil.ntoc( wcpOAV37barsitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV114BarFecClifrom", localUtil.dtoc( wcpOAV114BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV115BarFecClito", localUtil.dtoc( wcpOAV115BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV116BarFecFprfrom", localUtil.dtoc( wcpOAV116BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV117BarFecFprto", localUtil.dtoc( wcpOAV117BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV118BarFecSalfrom", localUtil.dtoc( wcpOAV118BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV119BarFecSalto", localUtil.dtoc( wcpOAV119BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV120BarSerfrom", GXutil.rtrim( wcpOAV120BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV121BarSerto", GXutil.rtrim( wcpOAV121BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV130BarTipArtfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV130BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV131BarTipArtto", GXutil.ltrim( localUtil.ntoc( wcpOAV131BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV122BarColNomfrom", GXutil.rtrim( wcpOAV122BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV123BarColNomto", GXutil.rtrim( wcpOAV123BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV124BarColNumfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV124BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV125BarColNumto", GXutil.ltrim( localUtil.ntoc( wcpOAV125BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV126BarNomClifrom", GXutil.rtrim( wcpOAV126BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV127BarNomClito", GXutil.rtrim( wcpOAV127BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV128BarNumClifrom", GXutil.ltrim( localUtil.ntoc( wcpOAV128BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV129BarNumClito", GXutil.ltrim( localUtil.ntoc( wcpOAV129BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV133Muestras", GXutil.rtrim( wcpOAV133Muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV134BarCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV134BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV139BarCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV139BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV137BarCodReofrom", GXutil.ltrim( localUtil.ntoc( wcpOAV137BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV138BarCodReoto", GXutil.ltrim( localUtil.ntoc( wcpOAV138BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV135BarCodParfrom", GXutil.rtrim( wcpOAV135BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV136BarCodParto", GXutil.rtrim( wcpOAV136BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV155Cod_idtx", GXutil.rtrim( wcpOAV155Cod_idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV158BarGirar", GXutil.rtrim( wcpOAV158BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV38OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV39OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV41TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV42TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV43TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV44TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV23TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV24TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGREST", GXutil.rtrim( AV70TFBarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGREST_SEL", GXutil.rtrim( AV71TFBarAgrEst_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV47TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV48TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV49TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV50TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART", GXutil.ltrim( localUtil.ntoc( AV104TFBarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART_TO", GXutil.ltrim( localUtil.ntoc( AV105TFBarTipArt_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPARTDSC", GXutil.rtrim( AV106TFBarTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPARTDSC_SEL", GXutil.rtrim( AV107TFBarTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV51TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV52TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV53TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV54TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV55TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV56TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV63TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV64TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN", localUtil.dtoc( AV72TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI", localUtil.dtoc( AV76TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECFPR", localUtil.dtoc( AV80TFBarFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECSAL", localUtil.dtoc( AV84TFBarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASSIG", GXutil.rtrim( AV90TFBarFasSig));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASSIG_SEL", GXutil.rtrim( AV91TFBarFasSig_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBULTIMO", GXutil.ltrim( localUtil.ntoc( AV68TFBarAlbUltimo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBULTIMO_TO", GXutil.ltrim( localUtil.ntoc( AV69TFBarAlbUltimo_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBFACT", GXutil.ltrim( localUtil.ntoc( AV112TFBarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBFACT_TO", GXutil.ltrim( localUtil.ntoc( AV113TFBarAlbFact_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARGIRAR", GXutil.rtrim( AV96TFBarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARGIRAR_SEL", GXutil.rtrim( AV97TFBarGirar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARACAANH", GXutil.ltrim( localUtil.ntoc( AV98TFBarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARACAANH_TO", GXutil.ltrim( localUtil.ntoc( AV99TFBarAcaAnh_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPROPER", GXutil.rtrim( AV102TFBarProPer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPROPER_SEL", GXutil.rtrim( AV103TFBarProPer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNORMAS", AV108TFBarNormas);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNORMAS_SEL", AV109TFBarNormas_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISUSRCOD", GXutil.rtrim( AV110TFDisUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISUSRCOD_SEL", GXutil.rtrim( AV111TFDisUsrCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV29Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV30clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV31clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMFROM", GXutil.rtrim( AV32bardisnumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARDISNUMTO", GXutil.rtrim( AV33bardisnumto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENFROM", localUtil.dtoc( AV34barfecgenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGENTO", localUtil.dtoc( AV35barfecgento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV36barsitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV37barsitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLIFROM", localUtil.dtoc( AV114BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLITO", localUtil.dtoc( AV115BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRFROM", localUtil.dtoc( AV116BarFecFprfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECFPRTO", localUtil.dtoc( AV117BarFecFprto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALFROM", localUtil.dtoc( AV118BarFecSalfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSALTO", localUtil.dtoc( AV119BarFecSalto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERFROM", GXutil.rtrim( AV120BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERTO", GXutil.rtrim( AV121BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTFROM", GXutil.ltrim( localUtil.ntoc( AV130BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARTIPARTTO", GXutil.ltrim( localUtil.ntoc( AV131BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMFROM", GXutil.rtrim( AV122BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMTO", GXutil.rtrim( AV123BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMFROM", GXutil.ltrim( localUtil.ntoc( AV124BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV125BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLIFROM", GXutil.rtrim( AV126BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNOMCLITO", GXutil.rtrim( AV127BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLIFROM", GXutil.ltrim( localUtil.ntoc( AV128BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARNUMCLITO", GXutil.ltrim( localUtil.ntoc( AV129BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMUESTRAS", GXutil.rtrim( AV133Muestras));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODFROM", GXutil.ltrim( localUtil.ntoc( AV134BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODTO", GXutil.ltrim( localUtil.ntoc( AV139BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOFROM", GXutil.ltrim( localUtil.ntoc( AV137BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOTO", GXutil.ltrim( localUtil.ntoc( AV138BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARFROM", GXutil.rtrim( AV135BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARTO", GXutil.rtrim( AV136BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOD_IDTX", GXutil.rtrim( AV155Cod_idtx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARGIRAR", GXutil.rtrim( AV158BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCUADERNO", GXutil.ltrim( localUtil.ntoc( AV159cuaderno, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCUADERNO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV159cuaderno), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTNORM", GXutil.ltrim( localUtil.ntoc( AV161STNORM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTNORM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV161STNORM), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV154Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV154Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARMTR", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_BARAGREST_Gridinternalname", GXutil.rtrim( Popover_baragrest_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_BARAGREST_Iteminternalname", GXutil.rtrim( Popover_baragrest_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_BARAGREST_Isgriditem", GXutil.booltostr( Popover_baragrest_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_BARAGREST_Trigger", GXutil.rtrim( Popover_baragrest_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_BARAGREST_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_baragrest_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_BARAGREST_Position", GXutil.rtrim( Popover_baragrest_Position));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Popoversingrid", GXutil.rtrim( Grid_empowerer_Popoversingrid));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm1KV2( )
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
      return "Produccion.ConsultadeProduccion_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento HDRs", "") ;
   }

   public void wb1KV0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.consultadeproduccion_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1KV2( true) ;
      }
      else
      {
         wb_table1_23_1KV2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1KV2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol40( ) ;
      }
      if ( wbEnd == 40 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_40 = (int)(nGXsfl_40_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV27GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV28GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV176Pgmname), GXutil.rtrim( localUtil.format( AV176Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_WC.htm");
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
         /* User Defined Control */
         ucPopover_baragrest.setProperty("IsGridItem", Popover_baragrest_Isgriditem);
         ucPopover_baragrest.setProperty("Trigger", Popover_baragrest_Trigger);
         ucPopover_baragrest.setProperty("PopoverWidth", Popover_baragrest_Popoverwidth);
         ucPopover_baragrest.setProperty("Position", Popover_baragrest_Position);
         ucPopover_baragrest.render(context, "dvelop.wwppopover", Popover_baragrest_Internalname, sPrefix+"POPOVER_BARAGRESTContainer");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV17ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_93_1KV2( true) ;
      }
      else
      {
         wb_table2_93_1KV2( false) ;
      }
      return  ;
   }

   public void wb_table2_93_1KV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_98_1KV2( true) ;
      }
      else
      {
         wb_table3_98_1KV2( false) ;
      }
      return  ;
   }

   public void wb_table3_98_1KV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_103_1KV2( true) ;
      }
      else
      {
         wb_table4_103_1KV2( false) ;
      }
      return  ;
   }

   public void wb_table4_103_1KV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_108_1KV2( true) ;
      }
      else
      {
         wb_table5_108_1KV2( false) ;
      }
      return  ;
   }

   public void wb_table5_108_1KV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_113_1KV2( true) ;
      }
      else
      {
         wb_table6_113_1KV2( false) ;
      }
      return  ;
   }

   public void wb_table6_113_1KV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_118_1KV2( true) ;
      }
      else
      {
         wb_table7_118_1KV2( false) ;
      }
      return  ;
   }

   public void wb_table7_118_1KV2e( boolean wbgen )
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
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.setProperty("PopoversInGrid", Grid_empowerer_Popoversingrid);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0126"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0126"+""+"\""+((WebComp_Wwpaux_wc_Visible==1) ? "" : " style=\"display:none;\"")) ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_40_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0126"+"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'" + sPrefix + "',false,'" + sGXsfl_40_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV74DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV74DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,128);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'" + sPrefix + "',false,'" + sGXsfl_40_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV78DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV78DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,130);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecfprauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'" + sPrefix + "',false,'" + sGXsfl_40_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecfprauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecfprauxdate_Internalname, localUtil.format(AV82DDO_BarFecFprAuxDate, "99/99/99"), localUtil.format( AV82DDO_BarFecFprAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,132);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecfprauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecfprauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecsalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'" + sPrefix + "',false,'" + sGXsfl_40_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecsalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecsalauxdate_Internalname, localUtil.format(AV86DDO_BarFecSalAuxDate, "99/99/99"), localUtil.format( AV86DDO_BarFecSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,134);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecsalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecsalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 40 )
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

   public void start1KV2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento HDRs", ""), (short)(0)) ;
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
            strup1KV0( ) ;
         }
      }
   }

   public void ws1KV2( )
   {
      start1KV2( ) ;
      evt1KV2( ) ;
   }

   public void evt1KV2( )
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
                              strup1KV0( ) ;
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
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "SITUACIONFASES_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "CONSULTAALBARANSALIDA_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "RECETAS_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "PARTESPRODUCCION_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e181KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "PIEZAS_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e191KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e201KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e211KV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KV0( ) ;
                           }
                           nGXsfl_40_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_402( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV151Grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151Grupodeacciones), 4, 0));
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           AV150BarAgrEstWithTags = httpContext.cgiGet( edtavBaragrestwithtags_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrestwithtags_Internalname, AV150BarAgrEstWithTags);
                           A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPedidocliente_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPedidocliente_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDIDOCLIENTE");
                              GX_FocusControl = edtavPedidocliente_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV165PedidoCliente = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPedidocliente_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PedidoCliente), 4, 0));
                           }
                           else
                           {
                              AV165PedidoCliente = (short)(localUtil.ctol( httpContext.cgiGet( edtavPedidocliente_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPedidocliente_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PedidoCliente), 4, 0));
                           }
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n217BarTipArt = false ;
                           A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
                           n13711BarTipArtD = false ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarkgm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarkgm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
                              GX_FocusControl = edtavBarkgm_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV166BarKgm = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgm_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV166BarKgm), 4, 0));
                           }
                           else
                           {
                              AV166BarKgm = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarkgm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgm_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV166BarKgm), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmtr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmtr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMTR");
                              GX_FocusControl = edtavBarmtr_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV167BarMtr = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarmtr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV167BarMtr), 4, 0));
                           }
                           else
                           {
                              AV167BarMtr = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarmtr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarmtr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV167BarMtr), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIE");
                              GX_FocusControl = edtavBarpie_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV168BarPie = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV168BarPie), 4, 0));
                           }
                           else
                           {
                              AV168BarPie = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV168BarPie), 4, 0));
                           }
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A158BarFecFpr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecFpr_Internalname), 0)) ;
                           A161BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecSal_Internalname), 0)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARFASCOD");
                              GX_FocusControl = edtavBarfascod_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV169BarFasCod = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfascod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV169BarFasCod), 4, 0));
                           }
                           else
                           {
                              AV169BarFasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarfascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfascod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV169BarFasCod), 4, 0));
                           }
                           A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
                           n1955BarFasSig = false ;
                           A13930BarAlbUlti = localUtil.ctol( httpContext.cgiGet( edtBarAlbUlti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A13935BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbFact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbmts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbmts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBMTS");
                              GX_FocusControl = edtavBaralbmts_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV170BarAlbMts = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbmts_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV170BarAlbMts), 4, 0));
                           }
                           else
                           {
                              AV170BarAlbMts = (short)(localUtil.ctol( httpContext.cgiGet( edtavBaralbmts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbmts_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV170BarAlbMts), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbkgs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbkgs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBKGS");
                              GX_FocusControl = edtavBaralbkgs_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV171BarAlbKgs = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbkgs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171BarAlbKgs), 4, 0));
                           }
                           else
                           {
                              AV171BarAlbKgs = (short)(localUtil.ctol( httpContext.cgiGet( edtavBaralbkgs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaralbkgs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171BarAlbKgs), 4, 0));
                           }
                           A2454BarGirar = httpContext.cgiGet( edtBarGirar_Internalname) ;
                           A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcuaderno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcuaderno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCUADERNO");
                              GX_FocusControl = edtavBarcuaderno_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV172BarCuaderno = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcuaderno_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV172BarCuaderno), 4, 0));
                           }
                           else
                           {
                              AV172BarCuaderno = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarcuaderno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcuaderno_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV172BarCuaderno), 4, 0));
                           }
                           A2829BarProPer = httpContext.cgiGet( edtBarProPer_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarproperidtx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarproperidtx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPROPERIDTX");
                              GX_FocusControl = edtavBarproperidtx_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV173BarProPerIdtx = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarproperidtx_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV173BarProPerIdtx), 4, 0));
                           }
                           else
                           {
                              AV173BarProPerIdtx = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarproperidtx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarproperidtx_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV173BarProPerIdtx), 4, 0));
                           }
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e221KV2 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e231KV2 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e241KV2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e251KV2 ();
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
                                    strup1KV0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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
                     if ( nCmpId == 126 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0126") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0126", "", sEvt);
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

   public void we1KV2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1KV2( ) ;
         }
      }
   }

   public void pa1KV2( )
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
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
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
      subsflControlProps_402( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         sendrow_402( ) ;
         nGXsfl_40_idx = ((subGrid_Islastpage==1)&&(nGXsfl_40_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV29Emprcod ,
                                 int AV30clicodfrom ,
                                 int AV31clicodto ,
                                 String AV32bardisnumfrom ,
                                 String AV33bardisnumto ,
                                 java.util.Date AV34barfecgenfrom ,
                                 java.util.Date AV35barfecgento ,
                                 byte AV36barsitfrom ,
                                 byte AV37barsitto ,
                                 java.util.Date AV114BarFecClifrom ,
                                 java.util.Date AV115BarFecClito ,
                                 java.util.Date AV116BarFecFprfrom ,
                                 java.util.Date AV117BarFecFprto ,
                                 java.util.Date AV118BarFecSalfrom ,
                                 java.util.Date AV119BarFecSalto ,
                                 String AV120BarSerfrom ,
                                 String AV121BarSerto ,
                                 short AV130BarTipArtfrom ,
                                 short AV131BarTipArtto ,
                                 String AV122BarColNomfrom ,
                                 String AV123BarColNomto ,
                                 int AV124BarColNumfrom ,
                                 int AV125BarColNumto ,
                                 String AV126BarNomClifrom ,
                                 String AV127BarNomClito ,
                                 int AV128BarNumClifrom ,
                                 int AV129BarNumClito ,
                                 String AV133Muestras ,
                                 int AV134BarCodfrom ,
                                 int AV139BarCodto ,
                                 byte AV137BarCodReofrom ,
                                 byte AV138BarCodReoto ,
                                 String AV135BarCodParfrom ,
                                 String AV136BarCodParto ,
                                 String AV155Cod_idtx ,
                                 String AV158BarGirar ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ,
                                 String AV176Pgmname ,
                                 short AV38OrderedBy ,
                                 boolean AV39OrderedDsc ,
                                 int AV41TFCliCod ,
                                 int AV42TFCliCod_To ,
                                 String AV43TFCliNom ,
                                 String AV44TFCliNom_Sel ,
                                 String AV23TFBarNHdr ,
                                 String AV24TFBarNHdr_Sel ,
                                 String AV70TFBarAgrEst ,
                                 String AV71TFBarAgrEst_Sel ,
                                 String AV47TFBarSer ,
                                 String AV48TFBarSer_Sel ,
                                 String AV49TFBarSerDsc ,
                                 String AV50TFBarSerDsc_Sel ,
                                 short AV104TFBarTipArt ,
                                 short AV105TFBarTipArt_To ,
                                 String AV106TFBarTipArtDsc ,
                                 String AV107TFBarTipArtDsc_Sel ,
                                 String AV51TFBarColNom ,
                                 String AV52TFBarColNom_Sel ,
                                 int AV53TFBarColNum ,
                                 int AV54TFBarColNum_To ,
                                 String AV55TFBarNomCli ,
                                 String AV56TFBarNomCli_Sel ,
                                 byte AV63TFBarSit ,
                                 byte AV64TFBarSit_To ,
                                 java.util.Date AV72TFBarFecGen ,
                                 java.util.Date AV76TFBarFecCli ,
                                 java.util.Date AV80TFBarFecFpr ,
                                 java.util.Date AV84TFBarFecSal ,
                                 String AV90TFBarFasSig ,
                                 String AV91TFBarFasSig_Sel ,
                                 long AV68TFBarAlbUltimo ,
                                 long AV69TFBarAlbUltimo_To ,
                                 int AV112TFBarAlbFact ,
                                 int AV113TFBarAlbFact_To ,
                                 String AV96TFBarGirar ,
                                 String AV97TFBarGirar_Sel ,
                                 short AV98TFBarAcaAnh ,
                                 short AV99TFBarAcaAnh_To ,
                                 String AV102TFBarProPer ,
                                 String AV103TFBarProPer_Sel ,
                                 String AV108TFBarNormas ,
                                 String AV109TFBarNormas_Sel ,
                                 String AV110TFDisUsrCod ,
                                 String AV111TFDisUsrCod_Sel ,
                                 short AV159cuaderno ,
                                 short AV161STNORM ,
                                 short AV154Moda21 ,
                                 String A396EmprCod ,
                                 String A13878PedidoClie ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e231KV2 ();
      GRID_nCurrentRecord = 0 ;
      rf1KV2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV176Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CLICOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARSER", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A212BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARSERDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A1652BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOLNOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A135BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARFECFPR", getSecureSignedToken( sPrefix, A158BarFecFpr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFECFPR", localUtil.format(A158BarFecFpr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARAGREST", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARAGREST", GXutil.rtrim( A120BarAgrEst));
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
      rf1KV2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV176Pgmname = "Produccion.ConsultadeProduccion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176Pgmname", AV176Pgmname);
      Gx_err = (short)(0) ;
      edtavBaragrestwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrestwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrestwithtags_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBaralbmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmts_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBaralbkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgs_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarcuaderno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcuaderno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcuaderno_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarproperidtx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarproperidtx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarproperidtx_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV41TFCliCod) ,
                                           Integer.valueOf(AV42TFCliCod_To) ,
                                           AV44TFCliNom_Sel ,
                                           AV43TFCliNom ,
                                           AV24TFBarNHdr_Sel ,
                                           AV23TFBarNHdr ,
                                           AV71TFBarAgrEst_Sel ,
                                           AV70TFBarAgrEst ,
                                           AV48TFBarSer_Sel ,
                                           AV47TFBarSer ,
                                           AV50TFBarSerDsc_Sel ,
                                           AV49TFBarSerDsc ,
                                           Short.valueOf(AV104TFBarTipArt) ,
                                           Short.valueOf(AV105TFBarTipArt_To) ,
                                           AV107TFBarTipArtDsc_Sel ,
                                           AV106TFBarTipArtDsc ,
                                           AV52TFBarColNom_Sel ,
                                           AV51TFBarColNom ,
                                           Integer.valueOf(AV53TFBarColNum) ,
                                           Integer.valueOf(AV54TFBarColNum_To) ,
                                           AV56TFBarNomCli_Sel ,
                                           AV55TFBarNomCli ,
                                           Byte.valueOf(AV63TFBarSit) ,
                                           Byte.valueOf(AV64TFBarSit_To) ,
                                           AV72TFBarFecGen ,
                                           AV76TFBarFecCli ,
                                           AV80TFBarFecFpr ,
                                           AV84TFBarFecSal ,
                                           AV97TFBarGirar_Sel ,
                                           AV96TFBarGirar ,
                                           Short.valueOf(AV98TFBarAcaAnh) ,
                                           Short.valueOf(AV99TFBarAcaAnh_To) ,
                                           AV103TFBarProPer_Sel ,
                                           AV102TFBarProPer ,
                                           AV111TFDisUsrCod_Sel ,
                                           AV110TFDisUsrCod ,
                                           Integer.valueOf(AV30clicodfrom) ,
                                           Integer.valueOf(AV31clicodto) ,
                                           AV34barfecgenfrom ,
                                           AV35barfecgento ,
                                           AV118BarFecSalfrom ,
                                           AV119BarFecSalto ,
                                           AV114BarFecClifrom ,
                                           AV115BarFecClito ,
                                           AV116BarFecFprfrom ,
                                           AV117BarFecFprto ,
                                           AV120BarSerfrom ,
                                           AV121BarSerto ,
                                           AV122BarColNomfrom ,
                                           AV123BarColNomto ,
                                           Integer.valueOf(AV124BarColNumfrom) ,
                                           Integer.valueOf(AV125BarColNumto) ,
                                           AV126BarNomClifrom ,
                                           AV127BarNomClito ,
                                           Integer.valueOf(AV128BarNumClifrom) ,
                                           Integer.valueOf(AV129BarNumClito) ,
                                           Short.valueOf(AV130BarTipArtfrom) ,
                                           Short.valueOf(AV131BarTipArtto) ,
                                           AV133Muestras ,
                                           Integer.valueOf(AV134BarCodfrom) ,
                                           Integer.valueOf(AV139BarCodto) ,
                                           Byte.valueOf(AV137BarCodReofrom) ,
                                           Byte.valueOf(AV138BarCodReoto) ,
                                           AV135BarCodParfrom ,
                                           AV136BarCodParto ,
                                           AV155Cod_idtx ,
                                           AV158BarGirar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           A2454BarGirar ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2829BarProPer ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A3030BarPlf ,
                                           Short.valueOf(AV38OrderedBy) ,
                                           Boolean.valueOf(AV39OrderedDsc) ,
                                           AV91TFBarFasSig_Sel ,
                                           AV90TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV68TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV69TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV112TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV113TFBarAlbFact_To) ,
                                           AV109TFBarNormas_Sel ,
                                           AV108TFBarNormas ,
                                           A13934BarNormas ,
                                           AV32bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV33bardisnumto ,
                                           Byte.valueOf(AV36barsitfrom) ,
                                           Byte.valueOf(AV37barsitto) ,
                                           AV29Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV90TFBarFasSig = GXutil.padr( GXutil.rtrim( AV90TFBarFasSig), 8, "%") ;
      lV43TFCliNom = GXutil.padr( GXutil.rtrim( AV43TFCliNom), 30, "%") ;
      lV23TFBarNHdr = GXutil.padr( GXutil.rtrim( AV23TFBarNHdr), 11, "%") ;
      lV70TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV70TFBarAgrEst), 1, "%") ;
      lV47TFBarSer = GXutil.padr( GXutil.rtrim( AV47TFBarSer), 16, "%") ;
      lV49TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV49TFBarSerDsc), 26, "%") ;
      lV106TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV106TFBarTipArtDsc), 30, "%") ;
      lV51TFBarColNom = GXutil.padr( GXutil.rtrim( AV51TFBarColNom), 13, "%") ;
      lV55TFBarNomCli = GXutil.padr( GXutil.rtrim( AV55TFBarNomCli), 13, "%") ;
      lV96TFBarGirar = GXutil.padr( GXutil.rtrim( AV96TFBarGirar), 20, "%") ;
      lV102TFBarProPer = GXutil.padr( GXutil.rtrim( AV102TFBarProPer), 8, "%") ;
      lV110TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV110TFDisUsrCod), 8, "%") ;
      /* Using cursor H01KV7 */
      pr_default.execute(0, new Object[] {AV29Emprcod, AV91TFBarFasSig_Sel, AV90TFBarFasSig, lV90TFBarFasSig, AV91TFBarFasSig_Sel, AV91TFBarFasSig_Sel, Byte.valueOf(AV36barsitfrom), Byte.valueOf(AV37barsitto), Integer.valueOf(AV41TFCliCod), Integer.valueOf(AV42TFCliCod_To), lV43TFCliNom, AV44TFCliNom_Sel, lV23TFBarNHdr, AV24TFBarNHdr_Sel, lV70TFBarAgrEst, AV71TFBarAgrEst_Sel, lV47TFBarSer, AV48TFBarSer_Sel, lV49TFBarSerDsc, AV50TFBarSerDsc_Sel, Short.valueOf(AV104TFBarTipArt), Short.valueOf(AV105TFBarTipArt_To), lV106TFBarTipArtDsc, AV107TFBarTipArtDsc_Sel, lV51TFBarColNom, AV52TFBarColNom_Sel, Integer.valueOf(AV53TFBarColNum), Integer.valueOf(AV54TFBarColNum_To), lV55TFBarNomCli, AV56TFBarNomCli_Sel, Byte.valueOf(AV63TFBarSit), Byte.valueOf(AV64TFBarSit_To), AV72TFBarFecGen, AV76TFBarFecCli, AV80TFBarFecFpr, AV84TFBarFecSal, lV96TFBarGirar, AV97TFBarGirar_Sel, Short.valueOf(AV98TFBarAcaAnh), Short.valueOf(AV99TFBarAcaAnh_To), lV102TFBarProPer, AV103TFBarProPer_Sel, lV110TFDisUsrCod, AV111TFDisUsrCod_Sel, Integer.valueOf(AV30clicodfrom), Integer.valueOf(AV31clicodto), AV34barfecgenfrom, AV35barfecgento, AV118BarFecSalfrom, AV119BarFecSalto, AV114BarFecClifrom, AV115BarFecClito, AV116BarFecFprfrom, AV117BarFecFprto, AV120BarSerfrom, AV121BarSerto, AV122BarColNomfrom, AV123BarColNomto, Integer.valueOf(AV124BarColNumfrom), Integer.valueOf(AV125BarColNumto), AV126BarNomClifrom, AV127BarNomClito, Integer.valueOf(AV128BarNumClifrom), Integer.valueOf(AV129BarNumClito), Short.valueOf(AV130BarTipArtfrom), Short.valueOf(AV131BarTipArtto), AV133Muestras, Integer.valueOf(AV134BarCodfrom), Integer.valueOf(AV139BarCodto), Byte.valueOf(AV137BarCodReofrom), Byte.valueOf(AV138BarCodReoto), AV135BarCodParfrom, AV136BarCodParto, AV155Cod_idtx, AV158BarGirar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3030BarPlf = H01KV7_A3030BarPlf[0] ;
         A1235BarNumCli = H01KV7_A1235BarNumCli[0] ;
         A2265BarExt = H01KV7_A2265BarExt[0] ;
         n2265BarExt = H01KV7_n2265BarExt[0] ;
         A4348DisUsrCod = H01KV7_A4348DisUsrCod[0] ;
         A2829BarProPer = H01KV7_A2829BarProPer[0] ;
         A4466BarAcaAnh = H01KV7_A4466BarAcaAnh[0] ;
         A2454BarGirar = H01KV7_A2454BarGirar[0] ;
         A161BarFecSal = H01KV7_A161BarFecSal[0] ;
         A158BarFecFpr = H01KV7_A158BarFecFpr[0] ;
         A155BarFecCli = H01KV7_A155BarFecCli[0] ;
         A159BarFecGen = H01KV7_A159BarFecGen[0] ;
         A213BarSit = H01KV7_A213BarSit[0] ;
         A1234BarNomCli = H01KV7_A1234BarNomCli[0] ;
         A136BarColNum = H01KV7_A136BarColNum[0] ;
         A135BarColNom = H01KV7_A135BarColNom[0] ;
         A13711BarTipArtD = H01KV7_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01KV7_n13711BarTipArtD[0] ;
         A217BarTipArt = H01KV7_A217BarTipArt[0] ;
         n217BarTipArt = H01KV7_n217BarTipArt[0] ;
         A1652BarSerDsc = H01KV7_A1652BarSerDsc[0] ;
         A212BarSer = H01KV7_A212BarSer[0] ;
         A120BarAgrEst = H01KV7_A120BarAgrEst[0] ;
         A279CliNom = H01KV7_A279CliNom[0] ;
         A252CliCod = H01KV7_A252CliCod[0] ;
         n252CliCod = H01KV7_n252CliCod[0] ;
         A166BarKgm = H01KV7_A166BarKgm[0] ;
         A184BarMtr = H01KV7_A184BarMtr[0] ;
         A1955BarFasSig = H01KV7_A1955BarFasSig[0] ;
         n1955BarFasSig = H01KV7_n1955BarFasSig[0] ;
         A130BarCodPar = H01KV7_A130BarCodPar[0] ;
         A132BarCodReo = H01KV7_A132BarCodReo[0] ;
         A129BarCod = H01KV7_A129BarCod[0] ;
         A361DisCod = H01KV7_A361DisCod[0] ;
         A143BarDisNum = H01KV7_A143BarDisNum[0] ;
         A4812BarEncCli = H01KV7_A4812BarEncCli[0] ;
         A396EmprCod = H01KV7_A396EmprCod[0] ;
         A4348DisUsrCod = H01KV7_A4348DisUsrCod[0] ;
         A13711BarTipArtD = H01KV7_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H01KV7_n13711BarTipArtD[0] ;
         A279CliNom = H01KV7_A279CliNom[0] ;
         A166BarKgm = H01KV7_A166BarKgm[0] ;
         A184BarMtr = H01KV7_A184BarMtr[0] ;
         A1955BarFasSig = H01KV7_A1955BarFasSig[0] ;
         n1955BarFasSig = H01KV7_n1955BarFasSig[0] ;
         GXt_int1 = A13930BarAlbUlti ;
         GXv_int2[0] = GXt_int1 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int2) ;
         consultadeproduccion_wc_impl.this.GXt_int1 = GXv_int2[0] ;
         A13930BarAlbUlti = GXt_int1 ;
         if ( (0==AV68TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV68TFBarAlbUltimo ) ) )
         {
            if ( (0==AV69TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV69TFBarAlbUltimo_To ) ) )
            {
               GXt_int3 = A13935BarAlbFact ;
               GXv_int4[0] = GXt_int3 ;
               new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int4) ;
               consultadeproduccion_wc_impl.this.GXt_int3 = GXv_int4[0] ;
               A13935BarAlbFact = GXt_int3 ;
               if ( (0==AV112TFBarAlbFact) || ( ( A13935BarAlbFact >= AV112TFBarAlbFact ) ) )
               {
                  if ( (0==AV113TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV113TFBarAlbFact_To ) ) )
                  {
                     GXt_char5 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char5 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     consultadeproduccion_wc_impl.this.GXt_char5 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char5 ;
                     if ( ! ( (GXutil.strcmp("", AV109TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV108TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV108TFBarNormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV109TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV109TFBarNormas_Sel) == 0 ) ) )
                        {
                           GXt_char5 = A13878PedidoClie ;
                           GXv_char6[0] = A396EmprCod ;
                           GXv_char7[0] = A4812BarEncCli ;
                           GXv_char8[0] = A143BarDisNum ;
                           GXv_char9[0] = GXt_char5 ;
                           new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char7, GXv_char8, GXv_char9) ;
                           consultadeproduccion_wc_impl.this.A396EmprCod = GXv_char6[0] ;
                           consultadeproduccion_wc_impl.this.A4812BarEncCli = GXv_char7[0] ;
                           consultadeproduccion_wc_impl.this.A143BarDisNum = GXv_char8[0] ;
                           consultadeproduccion_wc_impl.this.GXt_char5 = GXv_char9[0] ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
                           A13878PedidoClie = GXt_char5 ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
                           if ( (GXutil.strcmp("", AV32bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV32bardisnumfrom) >= 0 ) ) )
                           {
                              if ( (GXutil.strcmp("", AV33bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV33bardisnumto) <= 0 ) ) )
                              {
                                 A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                 GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1KV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(40) ;
      /* Execute user event: Refresh */
      e231KV2 ();
      nGXsfl_40_idx = 1 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_402( ) ;
      bGXsfl_40_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wwpaux_wc_Visible != 0 )
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
         subsflControlProps_402( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV41TFCliCod) ,
                                              Integer.valueOf(AV42TFCliCod_To) ,
                                              AV44TFCliNom_Sel ,
                                              AV43TFCliNom ,
                                              AV24TFBarNHdr_Sel ,
                                              AV23TFBarNHdr ,
                                              AV71TFBarAgrEst_Sel ,
                                              AV70TFBarAgrEst ,
                                              AV48TFBarSer_Sel ,
                                              AV47TFBarSer ,
                                              AV50TFBarSerDsc_Sel ,
                                              AV49TFBarSerDsc ,
                                              Short.valueOf(AV104TFBarTipArt) ,
                                              Short.valueOf(AV105TFBarTipArt_To) ,
                                              AV107TFBarTipArtDsc_Sel ,
                                              AV106TFBarTipArtDsc ,
                                              AV52TFBarColNom_Sel ,
                                              AV51TFBarColNom ,
                                              Integer.valueOf(AV53TFBarColNum) ,
                                              Integer.valueOf(AV54TFBarColNum_To) ,
                                              AV56TFBarNomCli_Sel ,
                                              AV55TFBarNomCli ,
                                              Byte.valueOf(AV63TFBarSit) ,
                                              Byte.valueOf(AV64TFBarSit_To) ,
                                              AV72TFBarFecGen ,
                                              AV76TFBarFecCli ,
                                              AV80TFBarFecFpr ,
                                              AV84TFBarFecSal ,
                                              AV97TFBarGirar_Sel ,
                                              AV96TFBarGirar ,
                                              Short.valueOf(AV98TFBarAcaAnh) ,
                                              Short.valueOf(AV99TFBarAcaAnh_To) ,
                                              AV103TFBarProPer_Sel ,
                                              AV102TFBarProPer ,
                                              AV111TFDisUsrCod_Sel ,
                                              AV110TFDisUsrCod ,
                                              Integer.valueOf(AV30clicodfrom) ,
                                              Integer.valueOf(AV31clicodto) ,
                                              AV34barfecgenfrom ,
                                              AV35barfecgento ,
                                              AV118BarFecSalfrom ,
                                              AV119BarFecSalto ,
                                              AV114BarFecClifrom ,
                                              AV115BarFecClito ,
                                              AV116BarFecFprfrom ,
                                              AV117BarFecFprto ,
                                              AV120BarSerfrom ,
                                              AV121BarSerto ,
                                              AV122BarColNomfrom ,
                                              AV123BarColNomto ,
                                              Integer.valueOf(AV124BarColNumfrom) ,
                                              Integer.valueOf(AV125BarColNumto) ,
                                              AV126BarNomClifrom ,
                                              AV127BarNomClito ,
                                              Integer.valueOf(AV128BarNumClifrom) ,
                                              Integer.valueOf(AV129BarNumClito) ,
                                              Short.valueOf(AV130BarTipArtfrom) ,
                                              Short.valueOf(AV131BarTipArtto) ,
                                              AV133Muestras ,
                                              Integer.valueOf(AV134BarCodfrom) ,
                                              Integer.valueOf(AV139BarCodto) ,
                                              Byte.valueOf(AV137BarCodReofrom) ,
                                              Byte.valueOf(AV138BarCodReoto) ,
                                              AV135BarCodParfrom ,
                                              AV136BarCodParto ,
                                              AV155Cod_idtx ,
                                              AV158BarGirar ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A120BarAgrEst ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              Short.valueOf(A217BarTipArt) ,
                                              A13711BarTipArtD ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              Byte.valueOf(A213BarSit) ,
                                              A159BarFecGen ,
                                              A155BarFecCli ,
                                              A158BarFecFpr ,
                                              A161BarFecSal ,
                                              A2454BarGirar ,
                                              Short.valueOf(A4466BarAcaAnh) ,
                                              A2829BarProPer ,
                                              A4348DisUsrCod ,
                                              Integer.valueOf(A1235BarNumCli) ,
                                              A3030BarPlf ,
                                              Short.valueOf(AV38OrderedBy) ,
                                              Boolean.valueOf(AV39OrderedDsc) ,
                                              AV91TFBarFasSig_Sel ,
                                              AV90TFBarFasSig ,
                                              A1955BarFasSig ,
                                              Long.valueOf(AV68TFBarAlbUltimo) ,
                                              Long.valueOf(A13930BarAlbUlti) ,
                                              Long.valueOf(AV69TFBarAlbUltimo_To) ,
                                              Integer.valueOf(AV112TFBarAlbFact) ,
                                              Integer.valueOf(A13935BarAlbFact) ,
                                              Integer.valueOf(AV113TFBarAlbFact_To) ,
                                              AV109TFBarNormas_Sel ,
                                              AV108TFBarNormas ,
                                              A13934BarNormas ,
                                              AV32bardisnumfrom ,
                                              A13878PedidoClie ,
                                              AV33bardisnumto ,
                                              Byte.valueOf(AV36barsitfrom) ,
                                              Byte.valueOf(AV37barsitto) ,
                                              AV29Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV90TFBarFasSig = GXutil.padr( GXutil.rtrim( AV90TFBarFasSig), 8, "%") ;
         lV43TFCliNom = GXutil.padr( GXutil.rtrim( AV43TFCliNom), 30, "%") ;
         lV23TFBarNHdr = GXutil.padr( GXutil.rtrim( AV23TFBarNHdr), 11, "%") ;
         lV70TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV70TFBarAgrEst), 1, "%") ;
         lV47TFBarSer = GXutil.padr( GXutil.rtrim( AV47TFBarSer), 16, "%") ;
         lV49TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV49TFBarSerDsc), 26, "%") ;
         lV106TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV106TFBarTipArtDsc), 30, "%") ;
         lV51TFBarColNom = GXutil.padr( GXutil.rtrim( AV51TFBarColNom), 13, "%") ;
         lV55TFBarNomCli = GXutil.padr( GXutil.rtrim( AV55TFBarNomCli), 13, "%") ;
         lV96TFBarGirar = GXutil.padr( GXutil.rtrim( AV96TFBarGirar), 20, "%") ;
         lV102TFBarProPer = GXutil.padr( GXutil.rtrim( AV102TFBarProPer), 8, "%") ;
         lV110TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV110TFDisUsrCod), 8, "%") ;
         /* Using cursor H01KV13 */
         pr_default.execute(1, new Object[] {AV29Emprcod, AV91TFBarFasSig_Sel, AV90TFBarFasSig, lV90TFBarFasSig, AV91TFBarFasSig_Sel, AV91TFBarFasSig_Sel, Byte.valueOf(AV36barsitfrom), Byte.valueOf(AV37barsitto), Integer.valueOf(AV41TFCliCod), Integer.valueOf(AV42TFCliCod_To), lV43TFCliNom, AV44TFCliNom_Sel, lV23TFBarNHdr, AV24TFBarNHdr_Sel, lV70TFBarAgrEst, AV71TFBarAgrEst_Sel, lV47TFBarSer, AV48TFBarSer_Sel, lV49TFBarSerDsc, AV50TFBarSerDsc_Sel, Short.valueOf(AV104TFBarTipArt), Short.valueOf(AV105TFBarTipArt_To), lV106TFBarTipArtDsc, AV107TFBarTipArtDsc_Sel, lV51TFBarColNom, AV52TFBarColNom_Sel, Integer.valueOf(AV53TFBarColNum), Integer.valueOf(AV54TFBarColNum_To), lV55TFBarNomCli, AV56TFBarNomCli_Sel, Byte.valueOf(AV63TFBarSit), Byte.valueOf(AV64TFBarSit_To), AV72TFBarFecGen, AV76TFBarFecCli, AV80TFBarFecFpr, AV84TFBarFecSal, lV96TFBarGirar, AV97TFBarGirar_Sel, Short.valueOf(AV98TFBarAcaAnh), Short.valueOf(AV99TFBarAcaAnh_To), lV102TFBarProPer, AV103TFBarProPer_Sel, lV110TFDisUsrCod, AV111TFDisUsrCod_Sel, Integer.valueOf(AV30clicodfrom), Integer.valueOf(AV31clicodto), AV34barfecgenfrom, AV35barfecgento, AV118BarFecSalfrom, AV119BarFecSalto, AV114BarFecClifrom, AV115BarFecClito, AV116BarFecFprfrom, AV117BarFecFprto, AV120BarSerfrom, AV121BarSerto, AV122BarColNomfrom, AV123BarColNomto, Integer.valueOf(AV124BarColNumfrom), Integer.valueOf(AV125BarColNumto), AV126BarNomClifrom, AV127BarNomClito, Integer.valueOf(AV128BarNumClifrom), Integer.valueOf(AV129BarNumClito), Short.valueOf(AV130BarTipArtfrom), Short.valueOf(AV131BarTipArtto), AV133Muestras, Integer.valueOf(AV134BarCodfrom), Integer.valueOf(AV139BarCodto), Byte.valueOf(AV137BarCodReofrom), Byte.valueOf(AV138BarCodReoto), AV135BarCodParfrom, AV136BarCodParto, AV155Cod_idtx, AV158BarGirar});
         nGXsfl_40_idx = 1 ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3030BarPlf = H01KV13_A3030BarPlf[0] ;
            A1235BarNumCli = H01KV13_A1235BarNumCli[0] ;
            A2265BarExt = H01KV13_A2265BarExt[0] ;
            n2265BarExt = H01KV13_n2265BarExt[0] ;
            A4348DisUsrCod = H01KV13_A4348DisUsrCod[0] ;
            A2829BarProPer = H01KV13_A2829BarProPer[0] ;
            A4466BarAcaAnh = H01KV13_A4466BarAcaAnh[0] ;
            A2454BarGirar = H01KV13_A2454BarGirar[0] ;
            A161BarFecSal = H01KV13_A161BarFecSal[0] ;
            A158BarFecFpr = H01KV13_A158BarFecFpr[0] ;
            A155BarFecCli = H01KV13_A155BarFecCli[0] ;
            A159BarFecGen = H01KV13_A159BarFecGen[0] ;
            A213BarSit = H01KV13_A213BarSit[0] ;
            A1234BarNomCli = H01KV13_A1234BarNomCli[0] ;
            A136BarColNum = H01KV13_A136BarColNum[0] ;
            A135BarColNom = H01KV13_A135BarColNom[0] ;
            A13711BarTipArtD = H01KV13_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H01KV13_n13711BarTipArtD[0] ;
            A217BarTipArt = H01KV13_A217BarTipArt[0] ;
            n217BarTipArt = H01KV13_n217BarTipArt[0] ;
            A1652BarSerDsc = H01KV13_A1652BarSerDsc[0] ;
            A212BarSer = H01KV13_A212BarSer[0] ;
            A120BarAgrEst = H01KV13_A120BarAgrEst[0] ;
            A279CliNom = H01KV13_A279CliNom[0] ;
            A252CliCod = H01KV13_A252CliCod[0] ;
            n252CliCod = H01KV13_n252CliCod[0] ;
            A166BarKgm = H01KV13_A166BarKgm[0] ;
            A184BarMtr = H01KV13_A184BarMtr[0] ;
            A1955BarFasSig = H01KV13_A1955BarFasSig[0] ;
            n1955BarFasSig = H01KV13_n1955BarFasSig[0] ;
            A130BarCodPar = H01KV13_A130BarCodPar[0] ;
            A132BarCodReo = H01KV13_A132BarCodReo[0] ;
            A129BarCod = H01KV13_A129BarCod[0] ;
            A361DisCod = H01KV13_A361DisCod[0] ;
            A143BarDisNum = H01KV13_A143BarDisNum[0] ;
            A4812BarEncCli = H01KV13_A4812BarEncCli[0] ;
            A396EmprCod = H01KV13_A396EmprCod[0] ;
            A4348DisUsrCod = H01KV13_A4348DisUsrCod[0] ;
            A13711BarTipArtD = H01KV13_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H01KV13_n13711BarTipArtD[0] ;
            A279CliNom = H01KV13_A279CliNom[0] ;
            A166BarKgm = H01KV13_A166BarKgm[0] ;
            A184BarMtr = H01KV13_A184BarMtr[0] ;
            A1955BarFasSig = H01KV13_A1955BarFasSig[0] ;
            n1955BarFasSig = H01KV13_n1955BarFasSig[0] ;
            GXt_int1 = A13930BarAlbUlti ;
            GXv_int2[0] = GXt_int1 ;
            new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int2) ;
            consultadeproduccion_wc_impl.this.GXt_int1 = GXv_int2[0] ;
            A13930BarAlbUlti = GXt_int1 ;
            if ( (0==AV68TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV68TFBarAlbUltimo ) ) )
            {
               if ( (0==AV69TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV69TFBarAlbUltimo_To ) ) )
               {
                  GXt_int3 = A13935BarAlbFact ;
                  GXv_int4[0] = GXt_int3 ;
                  new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int4) ;
                  consultadeproduccion_wc_impl.this.GXt_int3 = GXv_int4[0] ;
                  A13935BarAlbFact = GXt_int3 ;
                  if ( (0==AV112TFBarAlbFact) || ( ( A13935BarAlbFact >= AV112TFBarAlbFact ) ) )
                  {
                     if ( (0==AV113TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV113TFBarAlbFact_To ) ) )
                     {
                        GXt_char5 = A13934BarNormas ;
                        GXv_char9[0] = GXt_char5 ;
                        new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char9) ;
                        consultadeproduccion_wc_impl.this.GXt_char5 = GXv_char9[0] ;
                        A13934BarNormas = GXt_char5 ;
                        if ( ! ( (GXutil.strcmp("", AV109TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV108TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV108TFBarNormas) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV109TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV109TFBarNormas_Sel) == 0 ) ) )
                           {
                              GXt_char5 = A13878PedidoClie ;
                              GXv_char9[0] = A396EmprCod ;
                              GXv_char8[0] = A4812BarEncCli ;
                              GXv_char7[0] = A143BarDisNum ;
                              GXv_char6[0] = GXt_char5 ;
                              new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char9, GXv_char8, GXv_char7, GXv_char6) ;
                              consultadeproduccion_wc_impl.this.A396EmprCod = GXv_char9[0] ;
                              consultadeproduccion_wc_impl.this.A4812BarEncCli = GXv_char8[0] ;
                              consultadeproduccion_wc_impl.this.A143BarDisNum = GXv_char7[0] ;
                              consultadeproduccion_wc_impl.this.GXt_char5 = GXv_char6[0] ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
                              A13878PedidoClie = GXt_char5 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
                              if ( (GXutil.strcmp("", AV32bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV32bardisnumfrom) >= 0 ) ) )
                              {
                                 if ( (GXutil.strcmp("", AV33bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV33bardisnumto) <= 0 ) ) )
                                 {
                                    A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                    e241KV2 ();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(40) ;
         wb1KV0( ) ;
      }
      bGXsfl_40_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1KV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCUADERNO", GXutil.ltrim( localUtil.ntoc( AV159cuaderno, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCUADERNO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV159cuaderno), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTNORM", GXutil.ltrim( localUtil.ntoc( AV161STNORM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTNORM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV161STNORM), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV154Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV154Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CLICOD"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARSER"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, GXutil.rtrim( localUtil.format( A212BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARSERDSC"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, GXutil.rtrim( localUtil.format( A1652BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOLNOM"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, GXutil.rtrim( localUtil.format( A135BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOLNUM"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARFECFPR"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, A158BarFecFpr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARAGREST"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV29Emprcod, AV30clicodfrom, AV31clicodto, AV32bardisnumfrom, AV33bardisnumto, AV34barfecgenfrom, AV35barfecgento, AV36barsitfrom, AV37barsitto, AV114BarFecClifrom, AV115BarFecClito, AV116BarFecFprfrom, AV117BarFecFprto, AV118BarFecSalfrom, AV119BarFecSalto, AV120BarSerfrom, AV121BarSerto, AV130BarTipArtfrom, AV131BarTipArtto, AV122BarColNomfrom, AV123BarColNomto, AV124BarColNumfrom, AV125BarColNumto, AV126BarNomClifrom, AV127BarNomClito, AV128BarNumClifrom, AV129BarNumClito, AV133Muestras, AV134BarCodfrom, AV139BarCodto, AV137BarCodReofrom, AV138BarCodReoto, AV135BarCodParfrom, AV136BarCodParto, AV155Cod_idtx, AV158BarGirar, AV17ColumnsSelector, AV176Pgmname, AV38OrderedBy, AV39OrderedDsc, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV23TFBarNHdr, AV24TFBarNHdr_Sel, AV70TFBarAgrEst, AV71TFBarAgrEst_Sel, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV104TFBarTipArt, AV105TFBarTipArt_To, AV106TFBarTipArtDsc, AV107TFBarTipArtDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV63TFBarSit, AV64TFBarSit_To, AV72TFBarFecGen, AV76TFBarFecCli, AV80TFBarFecFpr, AV84TFBarFecSal, AV90TFBarFasSig, AV91TFBarFasSig_Sel, AV68TFBarAlbUltimo, AV69TFBarAlbUltimo_To, AV112TFBarAlbFact, AV113TFBarAlbFact_To, AV96TFBarGirar, AV97TFBarGirar_Sel, AV98TFBarAcaAnh, AV99TFBarAcaAnh_To, AV102TFBarProPer, AV103TFBarProPer_Sel, AV108TFBarNormas, AV109TFBarNormas_Sel, AV110TFDisUsrCod, AV111TFDisUsrCod_Sel, AV159cuaderno, AV161STNORM, AV154Moda21, A396EmprCod, A13878PedidoClie, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV29Emprcod, AV30clicodfrom, AV31clicodto, AV32bardisnumfrom, AV33bardisnumto, AV34barfecgenfrom, AV35barfecgento, AV36barsitfrom, AV37barsitto, AV114BarFecClifrom, AV115BarFecClito, AV116BarFecFprfrom, AV117BarFecFprto, AV118BarFecSalfrom, AV119BarFecSalto, AV120BarSerfrom, AV121BarSerto, AV130BarTipArtfrom, AV131BarTipArtto, AV122BarColNomfrom, AV123BarColNomto, AV124BarColNumfrom, AV125BarColNumto, AV126BarNomClifrom, AV127BarNomClito, AV128BarNumClifrom, AV129BarNumClito, AV133Muestras, AV134BarCodfrom, AV139BarCodto, AV137BarCodReofrom, AV138BarCodReoto, AV135BarCodParfrom, AV136BarCodParto, AV155Cod_idtx, AV158BarGirar, AV17ColumnsSelector, AV176Pgmname, AV38OrderedBy, AV39OrderedDsc, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV23TFBarNHdr, AV24TFBarNHdr_Sel, AV70TFBarAgrEst, AV71TFBarAgrEst_Sel, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV104TFBarTipArt, AV105TFBarTipArt_To, AV106TFBarTipArtDsc, AV107TFBarTipArtDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV63TFBarSit, AV64TFBarSit_To, AV72TFBarFecGen, AV76TFBarFecCli, AV80TFBarFecFpr, AV84TFBarFecSal, AV90TFBarFasSig, AV91TFBarFasSig_Sel, AV68TFBarAlbUltimo, AV69TFBarAlbUltimo_To, AV112TFBarAlbFact, AV113TFBarAlbFact_To, AV96TFBarGirar, AV97TFBarGirar_Sel, AV98TFBarAcaAnh, AV99TFBarAcaAnh_To, AV102TFBarProPer, AV103TFBarProPer_Sel, AV108TFBarNormas, AV109TFBarNormas_Sel, AV110TFDisUsrCod, AV111TFDisUsrCod_Sel, AV159cuaderno, AV161STNORM, AV154Moda21, A396EmprCod, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV29Emprcod, AV30clicodfrom, AV31clicodto, AV32bardisnumfrom, AV33bardisnumto, AV34barfecgenfrom, AV35barfecgento, AV36barsitfrom, AV37barsitto, AV114BarFecClifrom, AV115BarFecClito, AV116BarFecFprfrom, AV117BarFecFprto, AV118BarFecSalfrom, AV119BarFecSalto, AV120BarSerfrom, AV121BarSerto, AV130BarTipArtfrom, AV131BarTipArtto, AV122BarColNomfrom, AV123BarColNomto, AV124BarColNumfrom, AV125BarColNumto, AV126BarNomClifrom, AV127BarNomClito, AV128BarNumClifrom, AV129BarNumClito, AV133Muestras, AV134BarCodfrom, AV139BarCodto, AV137BarCodReofrom, AV138BarCodReoto, AV135BarCodParfrom, AV136BarCodParto, AV155Cod_idtx, AV158BarGirar, AV17ColumnsSelector, AV176Pgmname, AV38OrderedBy, AV39OrderedDsc, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV23TFBarNHdr, AV24TFBarNHdr_Sel, AV70TFBarAgrEst, AV71TFBarAgrEst_Sel, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV104TFBarTipArt, AV105TFBarTipArt_To, AV106TFBarTipArtDsc, AV107TFBarTipArtDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV63TFBarSit, AV64TFBarSit_To, AV72TFBarFecGen, AV76TFBarFecCli, AV80TFBarFecFpr, AV84TFBarFecSal, AV90TFBarFasSig, AV91TFBarFasSig_Sel, AV68TFBarAlbUltimo, AV69TFBarAlbUltimo_To, AV112TFBarAlbFact, AV113TFBarAlbFact_To, AV96TFBarGirar, AV97TFBarGirar_Sel, AV98TFBarAcaAnh, AV99TFBarAcaAnh_To, AV102TFBarProPer, AV103TFBarProPer_Sel, AV108TFBarNormas, AV109TFBarNormas_Sel, AV110TFDisUsrCod, AV111TFDisUsrCod_Sel, AV159cuaderno, AV161STNORM, AV154Moda21, A396EmprCod, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV29Emprcod, AV30clicodfrom, AV31clicodto, AV32bardisnumfrom, AV33bardisnumto, AV34barfecgenfrom, AV35barfecgento, AV36barsitfrom, AV37barsitto, AV114BarFecClifrom, AV115BarFecClito, AV116BarFecFprfrom, AV117BarFecFprto, AV118BarFecSalfrom, AV119BarFecSalto, AV120BarSerfrom, AV121BarSerto, AV130BarTipArtfrom, AV131BarTipArtto, AV122BarColNomfrom, AV123BarColNomto, AV124BarColNumfrom, AV125BarColNumto, AV126BarNomClifrom, AV127BarNomClito, AV128BarNumClifrom, AV129BarNumClito, AV133Muestras, AV134BarCodfrom, AV139BarCodto, AV137BarCodReofrom, AV138BarCodReoto, AV135BarCodParfrom, AV136BarCodParto, AV155Cod_idtx, AV158BarGirar, AV17ColumnsSelector, AV176Pgmname, AV38OrderedBy, AV39OrderedDsc, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV23TFBarNHdr, AV24TFBarNHdr_Sel, AV70TFBarAgrEst, AV71TFBarAgrEst_Sel, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV104TFBarTipArt, AV105TFBarTipArt_To, AV106TFBarTipArtDsc, AV107TFBarTipArtDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV63TFBarSit, AV64TFBarSit_To, AV72TFBarFecGen, AV76TFBarFecCli, AV80TFBarFecFpr, AV84TFBarFecSal, AV90TFBarFasSig, AV91TFBarFasSig_Sel, AV68TFBarAlbUltimo, AV69TFBarAlbUltimo_To, AV112TFBarAlbFact, AV113TFBarAlbFact_To, AV96TFBarGirar, AV97TFBarGirar_Sel, AV98TFBarAcaAnh, AV99TFBarAcaAnh_To, AV102TFBarProPer, AV103TFBarProPer_Sel, AV108TFBarNormas, AV109TFBarNormas_Sel, AV110TFDisUsrCod, AV111TFDisUsrCod_Sel, AV159cuaderno, AV161STNORM, AV154Moda21, A396EmprCod, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV29Emprcod, AV30clicodfrom, AV31clicodto, AV32bardisnumfrom, AV33bardisnumto, AV34barfecgenfrom, AV35barfecgento, AV36barsitfrom, AV37barsitto, AV114BarFecClifrom, AV115BarFecClito, AV116BarFecFprfrom, AV117BarFecFprto, AV118BarFecSalfrom, AV119BarFecSalto, AV120BarSerfrom, AV121BarSerto, AV130BarTipArtfrom, AV131BarTipArtto, AV122BarColNomfrom, AV123BarColNomto, AV124BarColNumfrom, AV125BarColNumto, AV126BarNomClifrom, AV127BarNomClito, AV128BarNumClifrom, AV129BarNumClito, AV133Muestras, AV134BarCodfrom, AV139BarCodto, AV137BarCodReofrom, AV138BarCodReoto, AV135BarCodParfrom, AV136BarCodParto, AV155Cod_idtx, AV158BarGirar, AV17ColumnsSelector, AV176Pgmname, AV38OrderedBy, AV39OrderedDsc, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV23TFBarNHdr, AV24TFBarNHdr_Sel, AV70TFBarAgrEst, AV71TFBarAgrEst_Sel, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV104TFBarTipArt, AV105TFBarTipArt_To, AV106TFBarTipArtDsc, AV107TFBarTipArtDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV63TFBarSit, AV64TFBarSit_To, AV72TFBarFecGen, AV76TFBarFecCli, AV80TFBarFecFpr, AV84TFBarFecSal, AV90TFBarFasSig, AV91TFBarFasSig_Sel, AV68TFBarAlbUltimo, AV69TFBarAlbUltimo_To, AV112TFBarAlbFact, AV113TFBarAlbFact_To, AV96TFBarGirar, AV97TFBarGirar_Sel, AV98TFBarAcaAnh, AV99TFBarAcaAnh_To, AV102TFBarProPer, AV103TFBarProPer_Sel, AV108TFBarNormas, AV109TFBarNormas_Sel, AV110TFDisUsrCod, AV111TFDisUsrCod_Sel, AV159cuaderno, AV161STNORM, AV154Moda21, A396EmprCod, A13878PedidoClie, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV176Pgmname = "Produccion.ConsultadeProduccion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176Pgmname", AV176Pgmname);
      Gx_err = (short)(0) ;
      edtavBaragrestwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrestwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrestwithtags_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBaralbmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmts_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBaralbkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgs_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarcuaderno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcuaderno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcuaderno_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarproperidtx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarproperidtx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarproperidtx_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1KV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e221KV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV25DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV17ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV27GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV28GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV29Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV29Emprcod") ;
         wcpOAV30clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32bardisnumfrom = httpContext.cgiGet( sPrefix+"wcpOAV32bardisnumfrom") ;
         wcpOAV33bardisnumto = httpContext.cgiGet( sPrefix+"wcpOAV33bardisnumto") ;
         wcpOAV34barfecgenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34barfecgenfrom"), 0) ;
         wcpOAV35barfecgento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV35barfecgento"), 0) ;
         wcpOAV36barsitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36barsitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37barsitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37barsitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV114BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV114BarFecClifrom"), 0) ;
         wcpOAV115BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV115BarFecClito"), 0) ;
         wcpOAV116BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV116BarFecFprfrom"), 0) ;
         wcpOAV117BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV117BarFecFprto"), 0) ;
         wcpOAV118BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV118BarFecSalfrom"), 0) ;
         wcpOAV119BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV119BarFecSalto"), 0) ;
         wcpOAV120BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV120BarSerfrom") ;
         wcpOAV121BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV121BarSerto") ;
         wcpOAV130BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV130BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV131BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV131BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV122BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV122BarColNomfrom") ;
         wcpOAV123BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV123BarColNomto") ;
         wcpOAV124BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV124BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV125BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV125BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV126BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV126BarNomClifrom") ;
         wcpOAV127BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV127BarNomClito") ;
         wcpOAV128BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV128BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV129BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV129BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV133Muestras = httpContext.cgiGet( sPrefix+"wcpOAV133Muestras") ;
         wcpOAV134BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV134BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV139BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV139BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV137BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV137BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV138BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV138BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV135BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV135BarCodParfrom") ;
         wcpOAV136BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV136BarCodParto") ;
         wcpOAV155Cod_idtx = httpContext.cgiGet( sPrefix+"wcpOAV155Cod_idtx") ;
         wcpOAV158BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV158BarGirar") ;
         A13878PedidoClie = httpContext.cgiGet( sPrefix+"PEDIDOCLIE") ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         A184BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"BARMTR")) ;
         A166BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"BARKGM")) ;
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
         Popover_baragrest_Gridinternalname = httpContext.cgiGet( sPrefix+"POPOVER_BARAGREST_Gridinternalname") ;
         Popover_baragrest_Iteminternalname = httpContext.cgiGet( sPrefix+"POPOVER_BARAGREST_Iteminternalname") ;
         Popover_baragrest_Isgriditem = GXutil.strtobool( httpContext.cgiGet( sPrefix+"POPOVER_BARAGREST_Isgriditem")) ;
         Popover_baragrest_Trigger = httpContext.cgiGet( sPrefix+"POPOVER_BARAGREST_Trigger") ;
         Popover_baragrest_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"POPOVER_BARAGREST_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_baragrest_Position = httpContext.cgiGet( sPrefix+"POPOVER_BARAGREST_Position") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         Grid_empowerer_Popoversingrid = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Popoversingrid") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         /* Read variables values. */
         AV176Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176Pgmname", AV176Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV74DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74DDO_BarFecGenAuxDate", localUtil.format(AV74DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV74DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74DDO_BarFecGenAuxDate", localUtil.format(AV74DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV78DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78DDO_BarFecCliAuxDate", localUtil.format(AV78DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV78DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78DDO_BarFecCliAuxDate", localUtil.format(AV78DDO_BarFecCliAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECFPRAUXDATE");
            GX_FocusControl = edtavDdo_barfecfprauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82DDO_BarFecFprAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82DDO_BarFecFprAuxDate", localUtil.format(AV82DDO_BarFecFprAuxDate, "99/99/99"));
         }
         else
         {
            AV82DDO_BarFecFprAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82DDO_BarFecFprAuxDate", localUtil.format(AV82DDO_BarFecFprAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECSALAUXDATE");
            GX_FocusControl = edtavDdo_barfecsalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV86DDO_BarFecSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86DDO_BarFecSalAuxDate", localUtil.format(AV86DDO_BarFecSalAuxDate, "99/99/99"));
         }
         else
         {
            AV86DDO_BarFecSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86DDO_BarFecSalAuxDate", localUtil.format(AV86DDO_BarFecSalAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_WC");
         AV176Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV176Pgmname", AV176Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV176Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\consultadeproduccion_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e221KV2 ();
      if (returnInSub) return;
   }

   public void e221KV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int10 = (byte)(AV154Moda21) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int11) ;
      consultadeproduccion_wc_impl.this.GXt_int10 = GXv_int11[0] ;
      AV154Moda21 = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV154Moda21), "ZZZ9")));
      GXt_int10 = (byte)(AV159cuaderno) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "CNOENC", ""), GXv_int11) ;
      consultadeproduccion_wc_impl.this.GXt_int10 = GXv_int11[0] ;
      AV159cuaderno = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV159cuaderno", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV159cuaderno), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCUADERNO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV159cuaderno), "ZZZ9")));
      GXt_int10 = (byte)(AV161STNORM) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "STNORM", ""), GXv_int11) ;
      consultadeproduccion_wc_impl.this.GXt_int10 = GXv_int11[0] ;
      AV161STNORM = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV161STNORM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV161STNORM), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTNORM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV161STNORM), "ZZZ9")));
      GXt_char5 = AV162Station ;
      GXv_char9[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char9) ;
      consultadeproduccion_wc_impl.this.GXt_char5 = GXv_char9[0] ;
      AV162Station = GXt_char5 ;
      GXv_char9[0] = AV29Emprcod ;
      GXv_char8[0] = AV163EmprNom ;
      GXv_char7[0] = AV164UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV162Station, GXv_char9, GXv_char8, GXv_char7) ;
      consultadeproduccion_wc_impl.this.AV29Emprcod = GXv_char9[0] ;
      consultadeproduccion_wc_impl.this.AV163EmprNom = GXv_char8[0] ;
      consultadeproduccion_wc_impl.this.AV164UsurCod = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Emprcod", AV29Emprcod);
      Popover_baragrest_Gridinternalname = subGrid_Internalname ;
      ucPopover_baragrest.sendProperty(context, sPrefix, false, Popover_baragrest_Internalname, "GridInternalName", Popover_baragrest_Gridinternalname);
      Popover_baragrest_Iteminternalname = edtavBaragrestwithtags_Internalname ;
      ucPopover_baragrest.sendProperty(context, sPrefix, false, Popover_baragrest_Internalname, "ItemInternalName", Popover_baragrest_Iteminternalname);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
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
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV38OrderedBy < 1 )
      {
         AV38OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = AV25DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13[0] ;
      AV25DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e231KV2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext14[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext14) ;
      AV6WWPContext = GXv_SdtWWPContext14[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_WCColumnsSelector"), "") != 0 )
      {
         AV15ColumnsSelectorXML = AV19Session.getValue("Produccion.ConsultadeProduccion_WCColumnsSelector") ;
         AV17ColumnsSelector.fromxml(AV15ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavBaragrestwithtags_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrestwithtags_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrestwithtags_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavPedidocliente_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedidocliente_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarTipArt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArtD_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarmtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarpie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarpie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarFecFpr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecFpr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecFpr_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarFecSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarfascod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarFasSig_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasSig_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasSig_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarAlbUlti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbUlti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbUlti_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarAlbFact_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAlbFact_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbFact_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavBaralbmts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbmts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmts_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavBaralbkgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaralbkgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgs_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarGirar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarGirar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGirar_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarAcaAnh_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAcaAnh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarcuaderno_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcuaderno_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcuaderno_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarProPer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarProPer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarProPer_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtavBarproperidtx_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarproperidtx_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarproperidtx_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtBarNormas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNormas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNormas_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtDisUsrCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisUsrCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUsrCod_Visible), 5, 0), !bGXsfl_40_Refreshing);
      AV27GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridCurrentPage), 10, 0));
      AV28GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GridPageCount), 10, 0));
      edtBarNHdr_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Columnheaderclass", edtBarNHdr_Columnheaderclass, !bGXsfl_40_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e111KV2( )
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
         AV26PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV26PageToGo) ;
      }
   }

   public void e121KV2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131KV2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV38OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OrderedBy), 4, 0));
         AV39OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39OrderedDsc", AV39OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV41TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCliCod), 6, 0));
            AV42TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV43TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFCliNom", AV43TFCliNom);
            AV44TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFCliNom_Sel", AV44TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV23TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarNHdr", AV23TFBarNHdr);
            AV24TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFBarNHdr_Sel", AV24TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrEst") == 0 )
         {
            AV70TFBarAgrEst = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarAgrEst", AV70TFBarAgrEst);
            AV71TFBarAgrEst_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarAgrEst_Sel", AV71TFBarAgrEst_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV47TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarSer", AV47TFBarSer);
            AV48TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarSer_Sel", AV48TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV49TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSerDsc", AV49TFBarSerDsc);
            AV50TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc_Sel", AV50TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArt") == 0 )
         {
            AV104TFBarTipArt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFBarTipArt), 4, 0));
            AV105TFBarTipArt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArtDsc") == 0 )
         {
            AV106TFBarTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarTipArtDsc", AV106TFBarTipArtDsc);
            AV107TFBarTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarTipArtDsc_Sel", AV107TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV51TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarColNom", AV51TFBarColNom);
            AV52TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom_Sel", AV52TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV53TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarColNum), 6, 0));
            AV54TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV55TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarNomCli", AV55TFBarNomCli);
            AV56TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarNomCli_Sel", AV56TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV63TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarSit), 2, 0));
            AV64TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecGen") == 0 )
         {
            AV72TFBarFecGen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarFecGen", localUtil.format(AV72TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCli") == 0 )
         {
            AV76TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarFecCli", localUtil.format(AV76TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecFpr") == 0 )
         {
            AV80TFBarFecFpr = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFBarFecFpr", localUtil.format(AV80TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecSal") == 0 )
         {
            AV84TFBarFecSal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFBarFecSal", localUtil.format(AV84TFBarFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasSig") == 0 )
         {
            AV90TFBarFasSig = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFBarFasSig", AV90TFBarFasSig);
            AV91TFBarFasSig_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFBarFasSig_Sel", AV91TFBarFasSig_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbUltimo") == 0 )
         {
            AV68TFBarAlbUltimo = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarAlbUltimo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFBarAlbUltimo), 10, 0));
            AV69TFBarAlbUltimo_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarAlbUltimo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarAlbUltimo_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbFact") == 0 )
         {
            AV112TFBarAlbFact = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFBarAlbFact", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFBarAlbFact), 8, 0));
            AV113TFBarAlbFact_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFBarAlbFact_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFBarAlbFact_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarGirar") == 0 )
         {
            AV96TFBarGirar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFBarGirar", AV96TFBarGirar);
            AV97TFBarGirar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97TFBarGirar_Sel", AV97TFBarGirar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAcaAnh") == 0 )
         {
            AV98TFBarAcaAnh = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFBarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98TFBarAcaAnh), 4, 0));
            AV99TFBarAcaAnh_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarAcaAnh_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFBarAcaAnh_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarProPer") == 0 )
         {
            AV102TFBarProPer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFBarProPer", AV102TFBarProPer);
            AV103TFBarProPer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFBarProPer_Sel", AV103TFBarProPer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNormas") == 0 )
         {
            AV108TFBarNormas = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarNormas", AV108TFBarNormas);
            AV109TFBarNormas_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarNormas_Sel", AV109TFBarNormas_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisUsrCod") == 0 )
         {
            AV110TFDisUsrCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFDisUsrCod", AV110TFDisUsrCod);
            AV111TFDisUsrCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFDisUsrCod_Sel", AV111TFDisUsrCod_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e241KV2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGrupodeacciones.removeAllItems();
         cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Situacion Fases", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Consulta Albaran Salida", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGrupodeacciones.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Recetas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGrupodeacciones.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Partes Produccion", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGrupodeacciones.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Packing List", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGrupodeacciones.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Consulta Almacen Tejido", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         if ( AV154Moda21 == 1 )
         {
            cmbavGrupodeacciones.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Alterar Data Ent.", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGrupodeacciones.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Impresion HDR", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
         if ( A2265BarExt == 1 )
         {
            edtBarNHdr_Columnclass = "WWColumn hidden-xs WWColumnWarning WWColumnWarningSingleCell" ;
         }
         else if ( A2265BarExt == 2 )
         {
            edtBarNHdr_Columnclass = "WWColumn hidden-xs WWColumnSuccess WWColumnSuccessSingleCell" ;
         }
         else
         {
            edtBarNHdr_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         }
         AV150BarAgrEstWithTags = GXutil.trim( GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrestwithtags_Internalname, AV150BarAgrEstWithTags);
         AV150BarAgrEstWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrestwithtags_Internalname, AV150BarAgrEstWithTags);
         WebComp_Wwpaux_wc_Visible = (((GXutil.strcmp(A120BarAgrEst, "S")==0) ? true : false) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0126"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wwpaux_wc_Visible), 5, 0), true);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(40) ;
         }
         sendrow_402( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_40_Refreshing )
      {
         httpContext.doAjaxLoad(40, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV151Grupodeacciones, 4, 0)) );
   }

   public void e141KV2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV15ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV17ColumnsSelector.fromJSonString(AV15ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_WCColumnsSelector", ((GXutil.strcmp("", AV15ColumnsSelectorXML)==0) ? "" : AV17ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e251KV2( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV151Grupodeacciones == 1 )
      {
         /* Execute user subroutine: 'DO SITUACIONFASES' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV151Grupodeacciones == 2 )
      {
         /* Execute user subroutine: 'DO CONSULTAALBARANSALIDA' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV151Grupodeacciones == 3 )
      {
         /* Execute user subroutine: 'DO RECETAS' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV151Grupodeacciones == 4 )
      {
         /* Execute user subroutine: 'DO PARTESPRODUCCION' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV151Grupodeacciones == 5 )
      {
         /* Execute user subroutine: 'DO PACKINGLIST' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV151Grupodeacciones == 6 )
      {
         /* Execute user subroutine: 'DO PIEZAS' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV151Grupodeacciones == 7 )
      {
         /* Execute user subroutine: 'DO MODIFICARFECHAE' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV151Grupodeacciones == 8 )
      {
         /* Execute user subroutine: 'DO IMPRESIONHDR' */
         S242 ();
         if (returnInSub) return;
      }
      AV151Grupodeacciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151Grupodeacciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV151Grupodeacciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e151KV2( )
   {
      /* Situacionfases_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e161KV2( )
   {
      /* Consultaalbaransalida_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e171KV2( )
   {
      /* Recetas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e181KV2( )
   {
      /* Partesproduccion_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e191KV2( )
   {
      /* Piezas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ColumnsSelector", AV17ColumnsSelector);
   }

   public void e201KV2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char9[0] = AV13ExcelFilename ;
      GXv_char8[0] = AV14ErrorMessage ;
      new app.produccion.consultadeproduccion_wcexport(remoteHandle, context).execute( GXv_char9, GXv_char8) ;
      consultadeproduccion_wc_impl.this.AV13ExcelFilename = GXv_char9[0] ;
      consultadeproduccion_wc_impl.this.AV14ErrorMessage = GXv_char8[0] ;
      if ( GXutil.strcmp(AV13ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV13ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV14ErrorMessage);
      }
   }

   public void e211KV2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.produccion.consultadeproduccion_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV38OrderedBy, 4, 0))+":"+(AV39OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV17ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliCod", "", "Cliente", false, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliNom", "", "Nombre Cliente", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNHdr", "", "N° Hdr", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAgrEst", "", "A?", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&PedidoCliente", "", "Disp. Cliente", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSer", "", "Articulo", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSerDsc", "", "Descripcion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarTipArt", "", "Tip Art", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarTipArtDsc", "", "Descripcion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNom", "", "Color", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNum", "", "Numero", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNomCli", "", "Color Cliente", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&BarKgm", "", "Kilos", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&BarMtr", "", "Metros", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&BarPie", "", "Piezas", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSit", "", "St", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecGen", "Fecha", "Generacion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecCli", "Fecha", "Disp Cli", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecFpr", "Fecha", " Ent Prev", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecSal", "Fecha", "Salida", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&BarFasCod", "", "Ultima", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFasSig", "Fase", "Siguiente", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAlbUltimo", "", "Albaran", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAlbFact", "", "Factura", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&BarAlbMts", "", "Metros", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&BarAlbKgs", "", "Kilos", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarGirar", "", "Coleccion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( AV29Emprcod, httpContext.getMessage( "CNOENC", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAcaAnh", "", "Cuaderno", true, "") ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "", "", "", false, "") ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
         AV98TFBarAcaAnh = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFBarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98TFBarAcaAnh), 4, 0));
         AV99TFBarAcaAnh_To = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarAcaAnh_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFBarAcaAnh_To), 4, 0));
      }
      if ( AV159cuaderno == 1 )
      {
         GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&BarCuaderno", "", "Descripcion", true, "") ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "", "", "", false, "") ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarProPer", "", "CTW", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&BarProPerIdtx", "", "Descripcion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      if ( AV161STNORM == 1 )
      {
         GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNormas", "", "Estandars Textiles", true, "") ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "", "", "", false, "") ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
         AV108TFBarNormas = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarNormas", AV108TFBarNormas);
         AV109TFBarNormas_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarNormas_Sel", AV109TFBarNormas_Sel);
      }
      GXv_SdtWWPColumnsSelector15[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "DisUsrCod", "", "Usuario", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXt_char5 = AV16UserCustomValue ;
      GXv_char9[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_WCColumnsSelector", GXv_char9) ;
      consultadeproduccion_wc_impl.this.GXt_char5 = GXv_char9[0] ;
      AV16UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV16UserCustomValue)==0) ) )
      {
         AV18ColumnsSelectorAux.fromxml(AV16UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector15[0] = AV18ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector16[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, GXv_SdtWWPColumnsSelector16) ;
         AV18ColumnsSelectorAux = GXv_SdtWWPColumnsSelector15[0] ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
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
      if ( AV154Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.rhdrmod", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir el formato", ""));
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV176Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV176Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV19Session.getValue(AV176Pgmname+"GridState"), null, null);
      }
      AV38OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OrderedBy), 4, 0));
      AV39OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39OrderedDsc", AV39OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV177GXV1 = 1 ;
      while ( AV177GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV177GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV41TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCliCod), 6, 0));
            AV42TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV43TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFCliNom", AV43TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV44TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFCliNom_Sel", AV44TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV23TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarNHdr", AV23TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV24TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFBarNHdr_Sel", AV24TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV70TFBarAgrEst = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarAgrEst", AV70TFBarAgrEst);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV71TFBarAgrEst_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarAgrEst_Sel", AV71TFBarAgrEst_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV47TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarSer", AV47TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV48TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarSer_Sel", AV48TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV49TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSerDsc", AV49TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV50TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc_Sel", AV50TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV104TFBarTipArt = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFBarTipArt), 4, 0));
            AV105TFBarTipArt_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV106TFBarTipArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarTipArtDsc", AV106TFBarTipArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV107TFBarTipArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarTipArtDsc_Sel", AV107TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV51TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarColNom", AV51TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV52TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom_Sel", AV52TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV53TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarColNum), 6, 0));
            AV54TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV55TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarNomCli", AV55TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV56TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarNomCli_Sel", AV56TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV63TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarSit), 2, 0));
            AV64TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV72TFBarFecGen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarFecGen", localUtil.format(AV72TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV76TFBarFecCli = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarFecCli", localUtil.format(AV76TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV80TFBarFecFpr = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFBarFecFpr", localUtil.format(AV80TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV84TFBarFecSal = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFBarFecSal", localUtil.format(AV84TFBarFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV90TFBarFasSig = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFBarFasSig", AV90TFBarFasSig);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV91TFBarFasSig_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFBarFasSig_Sel", AV91TFBarFasSig_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBULTIMO") == 0 )
         {
            AV68TFBarAlbUltimo = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarAlbUltimo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFBarAlbUltimo), 10, 0));
            AV69TFBarAlbUltimo_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarAlbUltimo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarAlbUltimo_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBFACT") == 0 )
         {
            AV112TFBarAlbFact = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFBarAlbFact", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFBarAlbFact), 8, 0));
            AV113TFBarAlbFact_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFBarAlbFact_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFBarAlbFact_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGIRAR") == 0 )
         {
            AV96TFBarGirar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFBarGirar", AV96TFBarGirar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGIRAR_SEL") == 0 )
         {
            AV97TFBarGirar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97TFBarGirar_Sel", AV97TFBarGirar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAANH") == 0 )
         {
            AV98TFBarAcaAnh = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFBarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98TFBarAcaAnh), 4, 0));
            AV99TFBarAcaAnh_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarAcaAnh_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFBarAcaAnh_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPROPER") == 0 )
         {
            AV102TFBarProPer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFBarProPer", AV102TFBarProPer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPROPER_SEL") == 0 )
         {
            AV103TFBarProPer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFBarProPer_Sel", AV103TFBarProPer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS") == 0 )
         {
            AV108TFBarNormas = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarNormas", AV108TFBarNormas);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS_SEL") == 0 )
         {
            AV109TFBarNormas_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarNormas_Sel", AV109TFBarNormas_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV110TFDisUsrCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFDisUsrCod", AV110TFDisUsrCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV111TFDisUsrCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFDisUsrCod_Sel", AV111TFDisUsrCod_Sel);
         }
         AV177GXV1 = (int)(AV177GXV1+1) ;
      }
      GXt_char5 = "" ;
      GXv_char9[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFCliNom_Sel)==0), AV44TFCliNom_Sel, GXv_char9) ;
      consultadeproduccion_wc_impl.this.GXt_char5 = GXv_char9[0] ;
      GXt_char17 = "" ;
      GXv_char8[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV24TFBarNHdr_Sel)==0), AV24TFBarNHdr_Sel, GXv_char8) ;
      consultadeproduccion_wc_impl.this.GXt_char17 = GXv_char8[0] ;
      GXt_char18 = "" ;
      GXv_char7[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFBarAgrEst_Sel)==0), AV71TFBarAgrEst_Sel, GXv_char7) ;
      consultadeproduccion_wc_impl.this.GXt_char18 = GXv_char7[0] ;
      GXt_char19 = "" ;
      GXv_char6[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFBarSer_Sel)==0), AV48TFBarSer_Sel, GXv_char6) ;
      consultadeproduccion_wc_impl.this.GXt_char19 = GXv_char6[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0), AV50TFBarSerDsc_Sel, GXv_char21) ;
      consultadeproduccion_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV107TFBarTipArtDsc_Sel)==0), AV107TFBarTipArtDsc_Sel, GXv_char23) ;
      consultadeproduccion_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFBarColNom_Sel)==0), AV52TFBarColNom_Sel, GXv_char25) ;
      consultadeproduccion_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFBarNomCli_Sel)==0), AV56TFBarNomCli_Sel, GXv_char27) ;
      consultadeproduccion_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFBarFasSig_Sel)==0), AV91TFBarFasSig_Sel, GXv_char29) ;
      consultadeproduccion_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV97TFBarGirar_Sel)==0), AV97TFBarGirar_Sel, GXv_char31) ;
      consultadeproduccion_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV103TFBarProPer_Sel)==0), AV103TFBarProPer_Sel, GXv_char33) ;
      consultadeproduccion_wc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV109TFBarNormas_Sel)==0), AV109TFBarNormas_Sel, GXv_char35) ;
      consultadeproduccion_wc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV111TFDisUsrCod_Sel)==0), AV111TFDisUsrCod_Sel, GXv_char37) ;
      consultadeproduccion_wc_impl.this.GXt_char36 = GXv_char37[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char5+"|"+GXt_char17+"|"+GXt_char18+"||"+GXt_char19+"|"+GXt_char20+"||"+GXt_char22+"|"+GXt_char24+"||"+GXt_char26+"||||||||||"+GXt_char28+"|||||"+GXt_char30+"|||"+GXt_char32+"||"+GXt_char34+"|"+GXt_char36 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFCliNom)==0), AV43TFCliNom, GXv_char37) ;
      consultadeproduccion_wc_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFBarNHdr)==0), AV23TFBarNHdr, GXv_char35) ;
      consultadeproduccion_wc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFBarAgrEst)==0), AV70TFBarAgrEst, GXv_char33) ;
      consultadeproduccion_wc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFBarSer)==0), AV47TFBarSer, GXv_char31) ;
      consultadeproduccion_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFBarSerDsc)==0), AV49TFBarSerDsc, GXv_char29) ;
      consultadeproduccion_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV106TFBarTipArtDsc)==0), AV106TFBarTipArtDsc, GXv_char27) ;
      consultadeproduccion_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFBarColNom)==0), AV51TFBarColNom, GXv_char25) ;
      consultadeproduccion_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFBarNomCli)==0), AV55TFBarNomCli, GXv_char23) ;
      consultadeproduccion_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFBarFasSig)==0), AV90TFBarFasSig, GXv_char21) ;
      consultadeproduccion_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char19 = "" ;
      GXv_char9[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV96TFBarGirar)==0), AV96TFBarGirar, GXv_char9) ;
      consultadeproduccion_wc_impl.this.GXt_char19 = GXv_char9[0] ;
      GXt_char18 = "" ;
      GXv_char8[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFBarProPer)==0), AV102TFBarProPer, GXv_char8) ;
      consultadeproduccion_wc_impl.this.GXt_char18 = GXv_char8[0] ;
      GXt_char17 = "" ;
      GXv_char7[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV108TFBarNormas)==0), AV108TFBarNormas, GXv_char7) ;
      consultadeproduccion_wc_impl.this.GXt_char17 = GXv_char7[0] ;
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFDisUsrCod)==0), AV110TFDisUsrCod, GXv_char6) ;
      consultadeproduccion_wc_impl.this.GXt_char5 = GXv_char6[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV41TFCliCod) ? "" : GXutil.str( AV41TFCliCod, 6, 0))+"|"+GXt_char36+"|"+GXt_char34+"|"+GXt_char32+"||"+GXt_char30+"|"+GXt_char28+"|"+((0==AV104TFBarTipArt) ? "" : GXutil.str( AV104TFBarTipArt, 4, 0))+"|"+GXt_char26+"|"+GXt_char24+"|"+((0==AV53TFBarColNum) ? "" : GXutil.str( AV53TFBarColNum, 6, 0))+"|"+GXt_char22+"||||"+((0==AV63TFBarSit) ? "" : GXutil.str( AV63TFBarSit, 2, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72TFBarFecGen)) ? "" : localUtil.dtoc( AV72TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFBarFecCli)) ? "" : localUtil.dtoc( AV76TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80TFBarFecFpr)) ? "" : localUtil.dtoc( AV80TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84TFBarFecSal)) ? "" : localUtil.dtoc( AV84TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+GXt_char20+"|"+((0==AV68TFBarAlbUltimo) ? "" : GXutil.str( AV68TFBarAlbUltimo, 10, 0))+"|"+((0==AV112TFBarAlbFact) ? "" : GXutil.str( AV112TFBarAlbFact, 8, 0))+"|||"+GXt_char19+"|"+((0==AV98TFBarAcaAnh) ? "" : GXutil.str( AV98TFBarAcaAnh, 4, 0))+"||"+GXt_char18+"||"+GXt_char17+"|"+GXt_char5 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV42TFCliCod_To) ? "" : GXutil.str( AV42TFCliCod_To, 6, 0))+"|||||||"+((0==AV105TFBarTipArt_To) ? "" : GXutil.str( AV105TFBarTipArt_To, 4, 0))+"|||"+((0==AV54TFBarColNum_To) ? "" : GXutil.str( AV54TFBarColNum_To, 6, 0))+"|||||"+((0==AV64TFBarSit_To) ? "" : GXutil.str( AV64TFBarSit_To, 2, 0))+"|||||||"+((0==AV69TFBarAlbUltimo_To) ? "" : GXutil.str( AV69TFBarAlbUltimo_To, 10, 0))+"|"+((0==AV113TFBarAlbFact_To) ? "" : GXutil.str( AV113TFBarAlbFact_To, 8, 0))+"||||"+((0==AV99TFBarAcaAnh_To) ? "" : GXutil.str( AV99TFBarAcaAnh_To, 4, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV19Session.getValue(AV176Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV38OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV39OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFCLICOD", "", !((0==AV41TFCliCod)&&(0==AV42TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV42TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFCLINOM", "", !(GXutil.strcmp("", AV43TFCliNom)==0), (short)(0), AV43TFCliNom, "", !(GXutil.strcmp("", AV44TFCliNom_Sel)==0), AV44TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARNHDR", "", !(GXutil.strcmp("", AV23TFBarNHdr)==0), (short)(0), AV23TFBarNHdr, "", !(GXutil.strcmp("", AV24TFBarNHdr_Sel)==0), AV24TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARAGREST", "", !(GXutil.strcmp("", AV70TFBarAgrEst)==0), (short)(0), AV70TFBarAgrEst, "", !(GXutil.strcmp("", AV71TFBarAgrEst_Sel)==0), AV71TFBarAgrEst_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARSER", "", !(GXutil.strcmp("", AV47TFBarSer)==0), (short)(0), AV47TFBarSer, "", !(GXutil.strcmp("", AV48TFBarSer_Sel)==0), AV48TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARSERDSC", "", !(GXutil.strcmp("", AV49TFBarSerDsc)==0), (short)(0), AV49TFBarSerDsc, "", !(GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0), AV50TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARTIPART", "", !((0==AV104TFBarTipArt)&&(0==AV105TFBarTipArt_To)), (short)(0), GXutil.trim( GXutil.str( AV104TFBarTipArt, 4, 0)), GXutil.trim( GXutil.str( AV105TFBarTipArt_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARTIPARTDSC", "", !(GXutil.strcmp("", AV106TFBarTipArtDsc)==0), (short)(0), AV106TFBarTipArtDsc, "", !(GXutil.strcmp("", AV107TFBarTipArtDsc_Sel)==0), AV107TFBarTipArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV51TFBarColNom)==0), (short)(0), AV51TFBarColNom, "", !(GXutil.strcmp("", AV52TFBarColNom_Sel)==0), AV52TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARCOLNUM", "", !((0==AV53TFBarColNum)&&(0==AV54TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV53TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV54TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV55TFBarNomCli)==0), (short)(0), AV55TFBarNomCli, "", !(GXutil.strcmp("", AV56TFBarNomCli_Sel)==0), AV56TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARSIT", "", !((0==AV63TFBarSit)&&(0==AV64TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV63TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV64TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV72TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV76TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARFECFPR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80TFBarFecFpr)), (short)(0), GXutil.trim( localUtil.dtoc( AV80TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARFECSAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84TFBarFecSal)), (short)(0), GXutil.trim( localUtil.dtoc( AV84TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARFASSIG", "", !(GXutil.strcmp("", AV90TFBarFasSig)==0), (short)(0), AV90TFBarFasSig, "", !(GXutil.strcmp("", AV91TFBarFasSig_Sel)==0), AV91TFBarFasSig_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARALBULTIMO", "", !((0==AV68TFBarAlbUltimo)&&(0==AV69TFBarAlbUltimo_To)), (short)(0), GXutil.trim( GXutil.str( AV68TFBarAlbUltimo, 10, 0)), GXutil.trim( GXutil.str( AV69TFBarAlbUltimo_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARALBFACT", "", !((0==AV112TFBarAlbFact)&&(0==AV113TFBarAlbFact_To)), (short)(0), GXutil.trim( GXutil.str( AV112TFBarAlbFact, 8, 0)), GXutil.trim( GXutil.str( AV113TFBarAlbFact_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARGIRAR", "", !(GXutil.strcmp("", AV96TFBarGirar)==0), (short)(0), AV96TFBarGirar, "", !(GXutil.strcmp("", AV97TFBarGirar_Sel)==0), AV97TFBarGirar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARACAANH", "", !((0==AV98TFBarAcaAnh)&&(0==AV99TFBarAcaAnh_To)), (short)(0), GXutil.trim( GXutil.str( AV98TFBarAcaAnh, 4, 0)), GXutil.trim( GXutil.str( AV99TFBarAcaAnh_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARPROPER", "", !(GXutil.strcmp("", AV102TFBarProPer)==0), (short)(0), AV102TFBarProPer, "", !(GXutil.strcmp("", AV103TFBarProPer_Sel)==0), AV103TFBarProPer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARNORMAS", "", !(GXutil.strcmp("", AV108TFBarNormas)==0), (short)(0), AV108TFBarNormas, "", !(GXutil.strcmp("", AV109TFBarNormas_Sel)==0), AV109TFBarNormas_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFDISUSRCOD", "", !(GXutil.strcmp("", AV110TFDisUsrCod)==0), (short)(0), AV110TFDisUsrCod, "", !(GXutil.strcmp("", AV111TFDisUsrCod_Sel)==0), AV111TFDisUsrCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      if ( ! (GXutil.strcmp("", AV29Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV29Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV30clicodfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV30clicodfrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV31clicodto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV31clicodto, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV32bardisnumfrom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARDISNUMFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV32bardisnumfrom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV33bardisnumto)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARDISNUMTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV33bardisnumto );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34barfecgenfrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGENFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV34barfecgenfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35barfecgento)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGENTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV35barfecgento, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV36barsitfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSITFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV36barsitfrom, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV37barsitto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSITTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV37barsitto, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114BarFecClifrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECCLIFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV114BarFecClifrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115BarFecClito)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECCLITO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV115BarFecClito, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116BarFecFprfrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECFPRFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV116BarFecFprfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117BarFecFprto)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECFPRTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV117BarFecFprto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV118BarFecSalfrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECSALFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV118BarFecSalfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119BarFecSalto)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECSALTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV119BarFecSalto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV120BarSerfrom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV120BarSerfrom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV121BarSerto)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV121BarSerto );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV130BarTipArtfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARTIPARTFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV130BarTipArtfrom, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV131BarTipArtto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARTIPARTTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV131BarTipArtto, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV122BarColNomfrom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOMFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV122BarColNomfrom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV123BarColNomto)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOMTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV123BarColNomto );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV124BarColNumfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUMFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV124BarColNumfrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV125BarColNumto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUMTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV125BarColNumto, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV126BarNomClifrom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARNOMCLIFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV126BarNomClifrom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV127BarNomClito)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARNOMCLITO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV127BarNomClito );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV128BarNumClifrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARNUMCLIFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV128BarNumClifrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV129BarNumClito) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARNUMCLITO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV129BarNumClito, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV130BarTipArtfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARTIPARTFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV130BarTipArtfrom, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV131BarTipArtto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARTIPARTTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV131BarTipArtto, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV133Muestras)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MUESTRAS" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV133Muestras );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV134BarCodfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV134BarCodfrom, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV139BarCodto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV139BarCodto, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV137BarCodReofrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREOFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV137BarCodReofrom, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV138BarCodReoto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREOTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV138BarCodReoto, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV135BarCodParfrom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPARFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV135BarCodParfrom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV136BarCodParto)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPARTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV136BarCodParto );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV155Cod_idtx)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&COD_IDTX" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV155Cod_idtx );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV158BarGirar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARGIRAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV158BarGirar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV176Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV176Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn04" );
      AV19Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void wb_table7_118_1KV2( boolean wbgen )
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
         wb_table7_118_1KV2e( true) ;
      }
      else
      {
         wb_table7_118_1KV2e( false) ;
      }
   }

   public void wb_table6_113_1KV2( boolean wbgen )
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
         wb_table6_113_1KV2e( true) ;
      }
      else
      {
         wb_table6_113_1KV2e( false) ;
      }
   }

   public void wb_table5_108_1KV2( boolean wbgen )
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
         wb_table5_108_1KV2e( true) ;
      }
      else
      {
         wb_table5_108_1KV2e( false) ;
      }
   }

   public void wb_table4_103_1KV2( boolean wbgen )
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
         wb_table4_103_1KV2e( true) ;
      }
      else
      {
         wb_table4_103_1KV2e( false) ;
      }
   }

   public void wb_table3_98_1KV2( boolean wbgen )
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
         wb_table3_98_1KV2e( true) ;
      }
      else
      {
         wb_table3_98_1KV2e( false) ;
      }
   }

   public void wb_table2_93_1KV2( boolean wbgen )
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
         wb_table2_93_1KV2e( true) ;
      }
      else
      {
         wb_table2_93_1KV2e( false) ;
      }
   }

   public void wb_table1_23_1KV2( boolean wbgen )
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
         wb_table1_23_1KV2e( true) ;
      }
      else
      {
         wb_table1_23_1KV2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV29Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Emprcod", AV29Emprcod);
      AV30clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30clicodfrom), 6, 0));
      AV31clicodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31clicodto), 6, 0));
      AV32bardisnumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32bardisnumfrom", AV32bardisnumfrom);
      AV33bardisnumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33bardisnumto", AV33bardisnumto);
      AV34barfecgenfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34barfecgenfrom", localUtil.format(AV34barfecgenfrom, "99/99/99"));
      AV35barfecgento = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35barfecgento", localUtil.format(AV35barfecgento, "99/99/99"));
      AV36barsitfrom = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36barsitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barsitfrom), 2, 0));
      AV37barsitto = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37barsitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37barsitto), 2, 0));
      AV114BarFecClifrom = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarFecClifrom", localUtil.format(AV114BarFecClifrom, "99/99/99"));
      AV115BarFecClito = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarFecClito", localUtil.format(AV115BarFecClito, "99/99/99"));
      AV116BarFecFprfrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116BarFecFprfrom", localUtil.format(AV116BarFecFprfrom, "99/99/99"));
      AV117BarFecFprto = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117BarFecFprto", localUtil.format(AV117BarFecFprto, "99/99/99"));
      AV118BarFecSalfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118BarFecSalfrom", localUtil.format(AV118BarFecSalfrom, "99/99/99"));
      AV119BarFecSalto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarFecSalto", localUtil.format(AV119BarFecSalto, "99/99/99"));
      AV120BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarSerfrom", AV120BarSerfrom);
      AV121BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121BarSerto", AV121BarSerto);
      AV130BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130BarTipArtfrom), 4, 0));
      AV131BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131BarTipArtto), 4, 0));
      AV122BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122BarColNomfrom", AV122BarColNomfrom);
      AV123BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123BarColNomto", AV123BarColNomto);
      AV124BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124BarColNumfrom), 6, 0));
      AV125BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125BarColNumto), 6, 0));
      AV126BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126BarNomClifrom", AV126BarNomClifrom);
      AV127BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarNomClito", AV127BarNomClito);
      AV128BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,25,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarNumClifrom), 6, 0));
      AV129BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,26,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129BarNumClito), 6, 0));
      AV130BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130BarTipArtfrom), 4, 0));
      AV131BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131BarTipArtto), 4, 0));
      AV133Muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133Muestras", AV133Muestras);
      AV134BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,30,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134BarCodfrom), 8, 0));
      AV139BarCodto = ((Number) GXutil.testNumericType( getParm(obj,31,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139BarCodto), 8, 0));
      AV137BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV137BarCodReofrom", GXutil.str( AV137BarCodReofrom, 1, 0));
      AV138BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138BarCodReoto", GXutil.str( AV138BarCodReoto, 1, 0));
      AV135BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV135BarCodParfrom", AV135BarCodParfrom);
      AV136BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136BarCodParto", AV136BarCodParto);
      AV155Cod_idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155Cod_idtx", AV155Cod_idtx);
      AV158BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158BarGirar", AV158BarGirar);
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
      pa1KV2( ) ;
      ws1KV2( ) ;
      we1KV2( ) ;
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
      sCtrlAV29Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV30clicodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV31clicodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV32bardisnumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV33bardisnumto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV34barfecgenfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV35barfecgento = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV36barsitfrom = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV37barsitto = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV114BarFecClifrom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV115BarFecClito = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV116BarFecFprfrom = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV117BarFecFprto = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV118BarFecSalfrom = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV119BarFecSalto = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV120BarSerfrom = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV121BarSerto = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV130BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV131BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV122BarColNomfrom = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV123BarColNomto = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV124BarColNumfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
      sCtrlAV125BarColNumto = (String)getParm(obj,22,TypeConstants.STRING) ;
      sCtrlAV126BarNomClifrom = (String)getParm(obj,23,TypeConstants.STRING) ;
      sCtrlAV127BarNomClito = (String)getParm(obj,24,TypeConstants.STRING) ;
      sCtrlAV128BarNumClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
      sCtrlAV129BarNumClito = (String)getParm(obj,26,TypeConstants.STRING) ;
      sCtrlAV130BarTipArtfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV131BarTipArtto = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV133Muestras = (String)getParm(obj,29,TypeConstants.STRING) ;
      sCtrlAV134BarCodfrom = (String)getParm(obj,30,TypeConstants.STRING) ;
      sCtrlAV139BarCodto = (String)getParm(obj,31,TypeConstants.STRING) ;
      sCtrlAV137BarCodReofrom = (String)getParm(obj,32,TypeConstants.STRING) ;
      sCtrlAV138BarCodReoto = (String)getParm(obj,33,TypeConstants.STRING) ;
      sCtrlAV135BarCodParfrom = (String)getParm(obj,34,TypeConstants.STRING) ;
      sCtrlAV136BarCodParto = (String)getParm(obj,35,TypeConstants.STRING) ;
      sCtrlAV155Cod_idtx = (String)getParm(obj,36,TypeConstants.STRING) ;
      sCtrlAV158BarGirar = (String)getParm(obj,37,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1KV2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\consultadeproduccion_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1KV2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV29Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Emprcod", AV29Emprcod);
         AV30clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30clicodfrom), 6, 0));
         AV31clicodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31clicodto), 6, 0));
         AV32bardisnumfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32bardisnumfrom", AV32bardisnumfrom);
         AV33bardisnumto = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33bardisnumto", AV33bardisnumto);
         AV34barfecgenfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34barfecgenfrom", localUtil.format(AV34barfecgenfrom, "99/99/99"));
         AV35barfecgento = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35barfecgento", localUtil.format(AV35barfecgento, "99/99/99"));
         AV36barsitfrom = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36barsitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barsitfrom), 2, 0));
         AV37barsitto = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37barsitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37barsitto), 2, 0));
         AV114BarFecClifrom = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarFecClifrom", localUtil.format(AV114BarFecClifrom, "99/99/99"));
         AV115BarFecClito = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarFecClito", localUtil.format(AV115BarFecClito, "99/99/99"));
         AV116BarFecFprfrom = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116BarFecFprfrom", localUtil.format(AV116BarFecFprfrom, "99/99/99"));
         AV117BarFecFprto = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117BarFecFprto", localUtil.format(AV117BarFecFprto, "99/99/99"));
         AV118BarFecSalfrom = (java.util.Date)getParm(obj,15,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118BarFecSalfrom", localUtil.format(AV118BarFecSalfrom, "99/99/99"));
         AV119BarFecSalto = (java.util.Date)getParm(obj,16,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarFecSalto", localUtil.format(AV119BarFecSalto, "99/99/99"));
         AV120BarSerfrom = (String)getParm(obj,17,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarSerfrom", AV120BarSerfrom);
         AV121BarSerto = (String)getParm(obj,18,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121BarSerto", AV121BarSerto);
         AV130BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130BarTipArtfrom), 4, 0));
         AV131BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131BarTipArtto), 4, 0));
         AV122BarColNomfrom = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122BarColNomfrom", AV122BarColNomfrom);
         AV123BarColNomto = (String)getParm(obj,22,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123BarColNomto", AV123BarColNomto);
         AV124BarColNumfrom = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124BarColNumfrom), 6, 0));
         AV125BarColNumto = ((Number) GXutil.testNumericType( getParm(obj,24,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125BarColNumto), 6, 0));
         AV126BarNomClifrom = (String)getParm(obj,25,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126BarNomClifrom", AV126BarNomClifrom);
         AV127BarNomClito = (String)getParm(obj,26,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarNomClito", AV127BarNomClito);
         AV128BarNumClifrom = ((Number) GXutil.testNumericType( getParm(obj,27,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarNumClifrom), 6, 0));
         AV129BarNumClito = ((Number) GXutil.testNumericType( getParm(obj,28,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129BarNumClito), 6, 0));
         AV130BarTipArtfrom = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130BarTipArtfrom), 4, 0));
         AV131BarTipArtto = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131BarTipArtto), 4, 0));
         AV133Muestras = (String)getParm(obj,31,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133Muestras", AV133Muestras);
         AV134BarCodfrom = ((Number) GXutil.testNumericType( getParm(obj,32,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134BarCodfrom), 8, 0));
         AV139BarCodto = ((Number) GXutil.testNumericType( getParm(obj,33,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139BarCodto), 8, 0));
         AV137BarCodReofrom = ((Number) GXutil.testNumericType( getParm(obj,34,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV137BarCodReofrom", GXutil.str( AV137BarCodReofrom, 1, 0));
         AV138BarCodReoto = ((Number) GXutil.testNumericType( getParm(obj,35,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138BarCodReoto", GXutil.str( AV138BarCodReoto, 1, 0));
         AV135BarCodParfrom = (String)getParm(obj,36,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV135BarCodParfrom", AV135BarCodParfrom);
         AV136BarCodParto = (String)getParm(obj,37,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136BarCodParto", AV136BarCodParto);
         AV155Cod_idtx = (String)getParm(obj,38,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155Cod_idtx", AV155Cod_idtx);
         AV158BarGirar = (String)getParm(obj,39,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158BarGirar", AV158BarGirar);
      }
      wcpOAV29Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV29Emprcod") ;
      wcpOAV30clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32bardisnumfrom = httpContext.cgiGet( sPrefix+"wcpOAV32bardisnumfrom") ;
      wcpOAV33bardisnumto = httpContext.cgiGet( sPrefix+"wcpOAV33bardisnumto") ;
      wcpOAV34barfecgenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34barfecgenfrom"), 0) ;
      wcpOAV35barfecgento = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV35barfecgento"), 0) ;
      wcpOAV36barsitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36barsitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37barsitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37barsitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV114BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV114BarFecClifrom"), 0) ;
      wcpOAV115BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV115BarFecClito"), 0) ;
      wcpOAV116BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV116BarFecFprfrom"), 0) ;
      wcpOAV117BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV117BarFecFprto"), 0) ;
      wcpOAV118BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV118BarFecSalfrom"), 0) ;
      wcpOAV119BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV119BarFecSalto"), 0) ;
      wcpOAV120BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV120BarSerfrom") ;
      wcpOAV121BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV121BarSerto") ;
      wcpOAV130BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV130BarTipArtfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV131BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV131BarTipArtto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV122BarColNomfrom = httpContext.cgiGet( sPrefix+"wcpOAV122BarColNomfrom") ;
      wcpOAV123BarColNomto = httpContext.cgiGet( sPrefix+"wcpOAV123BarColNomto") ;
      wcpOAV124BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV124BarColNumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV125BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV125BarColNumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV126BarNomClifrom = httpContext.cgiGet( sPrefix+"wcpOAV126BarNomClifrom") ;
      wcpOAV127BarNomClito = httpContext.cgiGet( sPrefix+"wcpOAV127BarNomClito") ;
      wcpOAV128BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV128BarNumClifrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV129BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV129BarNumClito"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV133Muestras = httpContext.cgiGet( sPrefix+"wcpOAV133Muestras") ;
      wcpOAV134BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV134BarCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV139BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV139BarCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV137BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV137BarCodReofrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV138BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV138BarCodReoto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV135BarCodParfrom = httpContext.cgiGet( sPrefix+"wcpOAV135BarCodParfrom") ;
      wcpOAV136BarCodParto = httpContext.cgiGet( sPrefix+"wcpOAV136BarCodParto") ;
      wcpOAV155Cod_idtx = httpContext.cgiGet( sPrefix+"wcpOAV155Cod_idtx") ;
      wcpOAV158BarGirar = httpContext.cgiGet( sPrefix+"wcpOAV158BarGirar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV29Emprcod, wcpOAV29Emprcod) != 0 ) || ( AV30clicodfrom != wcpOAV30clicodfrom ) || ( AV31clicodto != wcpOAV31clicodto ) || ( GXutil.strcmp(AV32bardisnumfrom, wcpOAV32bardisnumfrom) != 0 ) || ( GXutil.strcmp(AV33bardisnumto, wcpOAV33bardisnumto) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV34barfecgenfrom), GXutil.resetTime(wcpOAV34barfecgenfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV35barfecgento), GXutil.resetTime(wcpOAV35barfecgento)) ) || ( AV36barsitfrom != wcpOAV36barsitfrom ) || ( AV37barsitto != wcpOAV37barsitto ) || !( GXutil.dateCompare(GXutil.resetTime(AV114BarFecClifrom), GXutil.resetTime(wcpOAV114BarFecClifrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV115BarFecClito), GXutil.resetTime(wcpOAV115BarFecClito)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV116BarFecFprfrom), GXutil.resetTime(wcpOAV116BarFecFprfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV117BarFecFprto), GXutil.resetTime(wcpOAV117BarFecFprto)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV118BarFecSalfrom), GXutil.resetTime(wcpOAV118BarFecSalfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV119BarFecSalto), GXutil.resetTime(wcpOAV119BarFecSalto)) ) || ( GXutil.strcmp(AV120BarSerfrom, wcpOAV120BarSerfrom) != 0 ) || ( GXutil.strcmp(AV121BarSerto, wcpOAV121BarSerto) != 0 ) || ( AV130BarTipArtfrom != wcpOAV130BarTipArtfrom ) || ( AV131BarTipArtto != wcpOAV131BarTipArtto ) || ( GXutil.strcmp(AV122BarColNomfrom, wcpOAV122BarColNomfrom) != 0 ) || ( GXutil.strcmp(AV123BarColNomto, wcpOAV123BarColNomto) != 0 ) || ( AV124BarColNumfrom != wcpOAV124BarColNumfrom ) || ( AV125BarColNumto != wcpOAV125BarColNumto ) || ( GXutil.strcmp(AV126BarNomClifrom, wcpOAV126BarNomClifrom) != 0 ) || ( GXutil.strcmp(AV127BarNomClito, wcpOAV127BarNomClito) != 0 ) || ( AV128BarNumClifrom != wcpOAV128BarNumClifrom ) || ( AV129BarNumClito != wcpOAV129BarNumClito ) || ( GXutil.strcmp(AV133Muestras, wcpOAV133Muestras) != 0 ) || ( AV134BarCodfrom != wcpOAV134BarCodfrom ) || ( AV139BarCodto != wcpOAV139BarCodto ) || ( AV137BarCodReofrom != wcpOAV137BarCodReofrom ) || ( AV138BarCodReoto != wcpOAV138BarCodReoto ) || ( GXutil.strcmp(AV135BarCodParfrom, wcpOAV135BarCodParfrom) != 0 ) || ( GXutil.strcmp(AV136BarCodParto, wcpOAV136BarCodParto) != 0 ) || ( GXutil.strcmp(AV155Cod_idtx, wcpOAV155Cod_idtx) != 0 ) || ( GXutil.strcmp(AV158BarGirar, wcpOAV158BarGirar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV29Emprcod = AV29Emprcod ;
      wcpOAV30clicodfrom = AV30clicodfrom ;
      wcpOAV31clicodto = AV31clicodto ;
      wcpOAV32bardisnumfrom = AV32bardisnumfrom ;
      wcpOAV33bardisnumto = AV33bardisnumto ;
      wcpOAV34barfecgenfrom = AV34barfecgenfrom ;
      wcpOAV35barfecgento = AV35barfecgento ;
      wcpOAV36barsitfrom = AV36barsitfrom ;
      wcpOAV37barsitto = AV37barsitto ;
      wcpOAV114BarFecClifrom = AV114BarFecClifrom ;
      wcpOAV115BarFecClito = AV115BarFecClito ;
      wcpOAV116BarFecFprfrom = AV116BarFecFprfrom ;
      wcpOAV117BarFecFprto = AV117BarFecFprto ;
      wcpOAV118BarFecSalfrom = AV118BarFecSalfrom ;
      wcpOAV119BarFecSalto = AV119BarFecSalto ;
      wcpOAV120BarSerfrom = AV120BarSerfrom ;
      wcpOAV121BarSerto = AV121BarSerto ;
      wcpOAV130BarTipArtfrom = AV130BarTipArtfrom ;
      wcpOAV131BarTipArtto = AV131BarTipArtto ;
      wcpOAV122BarColNomfrom = AV122BarColNomfrom ;
      wcpOAV123BarColNomto = AV123BarColNomto ;
      wcpOAV124BarColNumfrom = AV124BarColNumfrom ;
      wcpOAV125BarColNumto = AV125BarColNumto ;
      wcpOAV126BarNomClifrom = AV126BarNomClifrom ;
      wcpOAV127BarNomClito = AV127BarNomClito ;
      wcpOAV128BarNumClifrom = AV128BarNumClifrom ;
      wcpOAV129BarNumClito = AV129BarNumClito ;
      wcpOAV133Muestras = AV133Muestras ;
      wcpOAV134BarCodfrom = AV134BarCodfrom ;
      wcpOAV139BarCodto = AV139BarCodto ;
      wcpOAV137BarCodReofrom = AV137BarCodReofrom ;
      wcpOAV138BarCodReoto = AV138BarCodReoto ;
      wcpOAV135BarCodParfrom = AV135BarCodParfrom ;
      wcpOAV136BarCodParto = AV136BarCodParto ;
      wcpOAV155Cod_idtx = AV155Cod_idtx ;
      wcpOAV158BarGirar = AV158BarGirar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV29Emprcod = httpContext.cgiGet( sPrefix+"AV29Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV29Emprcod) > 0 )
      {
         AV29Emprcod = httpContext.cgiGet( sCtrlAV29Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Emprcod", AV29Emprcod);
      }
      else
      {
         AV29Emprcod = httpContext.cgiGet( sPrefix+"AV29Emprcod_PARM") ;
      }
      sCtrlAV30clicodfrom = httpContext.cgiGet( sPrefix+"AV30clicodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV30clicodfrom) > 0 )
      {
         AV30clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30clicodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30clicodfrom), 6, 0));
      }
      else
      {
         AV30clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30clicodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31clicodto = httpContext.cgiGet( sPrefix+"AV31clicodto_CTRL") ;
      if ( GXutil.len( sCtrlAV31clicodto) > 0 )
      {
         AV31clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31clicodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31clicodto), 6, 0));
      }
      else
      {
         AV31clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31clicodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32bardisnumfrom = httpContext.cgiGet( sPrefix+"AV32bardisnumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV32bardisnumfrom) > 0 )
      {
         AV32bardisnumfrom = httpContext.cgiGet( sCtrlAV32bardisnumfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32bardisnumfrom", AV32bardisnumfrom);
      }
      else
      {
         AV32bardisnumfrom = httpContext.cgiGet( sPrefix+"AV32bardisnumfrom_PARM") ;
      }
      sCtrlAV33bardisnumto = httpContext.cgiGet( sPrefix+"AV33bardisnumto_CTRL") ;
      if ( GXutil.len( sCtrlAV33bardisnumto) > 0 )
      {
         AV33bardisnumto = httpContext.cgiGet( sCtrlAV33bardisnumto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33bardisnumto", AV33bardisnumto);
      }
      else
      {
         AV33bardisnumto = httpContext.cgiGet( sPrefix+"AV33bardisnumto_PARM") ;
      }
      sCtrlAV34barfecgenfrom = httpContext.cgiGet( sPrefix+"AV34barfecgenfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV34barfecgenfrom) > 0 )
      {
         AV34barfecgenfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV34barfecgenfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34barfecgenfrom", localUtil.format(AV34barfecgenfrom, "99/99/99"));
      }
      else
      {
         AV34barfecgenfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV34barfecgenfrom_PARM"), 0) ;
      }
      sCtrlAV35barfecgento = httpContext.cgiGet( sPrefix+"AV35barfecgento_CTRL") ;
      if ( GXutil.len( sCtrlAV35barfecgento) > 0 )
      {
         AV35barfecgento = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV35barfecgento), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35barfecgento", localUtil.format(AV35barfecgento, "99/99/99"));
      }
      else
      {
         AV35barfecgento = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV35barfecgento_PARM"), 0) ;
      }
      sCtrlAV36barsitfrom = httpContext.cgiGet( sPrefix+"AV36barsitfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV36barsitfrom) > 0 )
      {
         AV36barsitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36barsitfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36barsitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barsitfrom), 2, 0));
      }
      else
      {
         AV36barsitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36barsitfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37barsitto = httpContext.cgiGet( sPrefix+"AV37barsitto_CTRL") ;
      if ( GXutil.len( sCtrlAV37barsitto) > 0 )
      {
         AV37barsitto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37barsitto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37barsitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37barsitto), 2, 0));
      }
      else
      {
         AV37barsitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37barsitto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV114BarFecClifrom = httpContext.cgiGet( sPrefix+"AV114BarFecClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV114BarFecClifrom) > 0 )
      {
         AV114BarFecClifrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV114BarFecClifrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarFecClifrom", localUtil.format(AV114BarFecClifrom, "99/99/99"));
      }
      else
      {
         AV114BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV114BarFecClifrom_PARM"), 0) ;
      }
      sCtrlAV115BarFecClito = httpContext.cgiGet( sPrefix+"AV115BarFecClito_CTRL") ;
      if ( GXutil.len( sCtrlAV115BarFecClito) > 0 )
      {
         AV115BarFecClito = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV115BarFecClito), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarFecClito", localUtil.format(AV115BarFecClito, "99/99/99"));
      }
      else
      {
         AV115BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV115BarFecClito_PARM"), 0) ;
      }
      sCtrlAV116BarFecFprfrom = httpContext.cgiGet( sPrefix+"AV116BarFecFprfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV116BarFecFprfrom) > 0 )
      {
         AV116BarFecFprfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV116BarFecFprfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116BarFecFprfrom", localUtil.format(AV116BarFecFprfrom, "99/99/99"));
      }
      else
      {
         AV116BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV116BarFecFprfrom_PARM"), 0) ;
      }
      sCtrlAV117BarFecFprto = httpContext.cgiGet( sPrefix+"AV117BarFecFprto_CTRL") ;
      if ( GXutil.len( sCtrlAV117BarFecFprto) > 0 )
      {
         AV117BarFecFprto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV117BarFecFprto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117BarFecFprto", localUtil.format(AV117BarFecFprto, "99/99/99"));
      }
      else
      {
         AV117BarFecFprto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV117BarFecFprto_PARM"), 0) ;
      }
      sCtrlAV118BarFecSalfrom = httpContext.cgiGet( sPrefix+"AV118BarFecSalfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV118BarFecSalfrom) > 0 )
      {
         AV118BarFecSalfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV118BarFecSalfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118BarFecSalfrom", localUtil.format(AV118BarFecSalfrom, "99/99/99"));
      }
      else
      {
         AV118BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV118BarFecSalfrom_PARM"), 0) ;
      }
      sCtrlAV119BarFecSalto = httpContext.cgiGet( sPrefix+"AV119BarFecSalto_CTRL") ;
      if ( GXutil.len( sCtrlAV119BarFecSalto) > 0 )
      {
         AV119BarFecSalto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV119BarFecSalto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119BarFecSalto", localUtil.format(AV119BarFecSalto, "99/99/99"));
      }
      else
      {
         AV119BarFecSalto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV119BarFecSalto_PARM"), 0) ;
      }
      sCtrlAV120BarSerfrom = httpContext.cgiGet( sPrefix+"AV120BarSerfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV120BarSerfrom) > 0 )
      {
         AV120BarSerfrom = httpContext.cgiGet( sCtrlAV120BarSerfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120BarSerfrom", AV120BarSerfrom);
      }
      else
      {
         AV120BarSerfrom = httpContext.cgiGet( sPrefix+"AV120BarSerfrom_PARM") ;
      }
      sCtrlAV121BarSerto = httpContext.cgiGet( sPrefix+"AV121BarSerto_CTRL") ;
      if ( GXutil.len( sCtrlAV121BarSerto) > 0 )
      {
         AV121BarSerto = httpContext.cgiGet( sCtrlAV121BarSerto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121BarSerto", AV121BarSerto);
      }
      else
      {
         AV121BarSerto = httpContext.cgiGet( sPrefix+"AV121BarSerto_PARM") ;
      }
      sCtrlAV130BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV130BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV130BarTipArtfrom) > 0 )
      {
         AV130BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV130BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130BarTipArtfrom), 4, 0));
      }
      else
      {
         AV130BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV130BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV131BarTipArtto = httpContext.cgiGet( sPrefix+"AV131BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV131BarTipArtto) > 0 )
      {
         AV131BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV131BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131BarTipArtto), 4, 0));
      }
      else
      {
         AV131BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV131BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV122BarColNomfrom = httpContext.cgiGet( sPrefix+"AV122BarColNomfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV122BarColNomfrom) > 0 )
      {
         AV122BarColNomfrom = httpContext.cgiGet( sCtrlAV122BarColNomfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122BarColNomfrom", AV122BarColNomfrom);
      }
      else
      {
         AV122BarColNomfrom = httpContext.cgiGet( sPrefix+"AV122BarColNomfrom_PARM") ;
      }
      sCtrlAV123BarColNomto = httpContext.cgiGet( sPrefix+"AV123BarColNomto_CTRL") ;
      if ( GXutil.len( sCtrlAV123BarColNomto) > 0 )
      {
         AV123BarColNomto = httpContext.cgiGet( sCtrlAV123BarColNomto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123BarColNomto", AV123BarColNomto);
      }
      else
      {
         AV123BarColNomto = httpContext.cgiGet( sPrefix+"AV123BarColNomto_PARM") ;
      }
      sCtrlAV124BarColNumfrom = httpContext.cgiGet( sPrefix+"AV124BarColNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV124BarColNumfrom) > 0 )
      {
         AV124BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV124BarColNumfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124BarColNumfrom), 6, 0));
      }
      else
      {
         AV124BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV124BarColNumfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV125BarColNumto = httpContext.cgiGet( sPrefix+"AV125BarColNumto_CTRL") ;
      if ( GXutil.len( sCtrlAV125BarColNumto) > 0 )
      {
         AV125BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV125BarColNumto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125BarColNumto), 6, 0));
      }
      else
      {
         AV125BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV125BarColNumto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV126BarNomClifrom = httpContext.cgiGet( sPrefix+"AV126BarNomClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV126BarNomClifrom) > 0 )
      {
         AV126BarNomClifrom = httpContext.cgiGet( sCtrlAV126BarNomClifrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126BarNomClifrom", AV126BarNomClifrom);
      }
      else
      {
         AV126BarNomClifrom = httpContext.cgiGet( sPrefix+"AV126BarNomClifrom_PARM") ;
      }
      sCtrlAV127BarNomClito = httpContext.cgiGet( sPrefix+"AV127BarNomClito_CTRL") ;
      if ( GXutil.len( sCtrlAV127BarNomClito) > 0 )
      {
         AV127BarNomClito = httpContext.cgiGet( sCtrlAV127BarNomClito) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarNomClito", AV127BarNomClito);
      }
      else
      {
         AV127BarNomClito = httpContext.cgiGet( sPrefix+"AV127BarNomClito_PARM") ;
      }
      sCtrlAV128BarNumClifrom = httpContext.cgiGet( sPrefix+"AV128BarNumClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV128BarNumClifrom) > 0 )
      {
         AV128BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV128BarNumClifrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128BarNumClifrom), 6, 0));
      }
      else
      {
         AV128BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV128BarNumClifrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV129BarNumClito = httpContext.cgiGet( sPrefix+"AV129BarNumClito_CTRL") ;
      if ( GXutil.len( sCtrlAV129BarNumClito) > 0 )
      {
         AV129BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV129BarNumClito), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129BarNumClito), 6, 0));
      }
      else
      {
         AV129BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV129BarNumClito_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV130BarTipArtfrom = httpContext.cgiGet( sPrefix+"AV130BarTipArtfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV130BarTipArtfrom) > 0 )
      {
         AV130BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV130BarTipArtfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130BarTipArtfrom), 4, 0));
      }
      else
      {
         AV130BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV130BarTipArtfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV131BarTipArtto = httpContext.cgiGet( sPrefix+"AV131BarTipArtto_CTRL") ;
      if ( GXutil.len( sCtrlAV131BarTipArtto) > 0 )
      {
         AV131BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV131BarTipArtto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131BarTipArtto), 4, 0));
      }
      else
      {
         AV131BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV131BarTipArtto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV133Muestras = httpContext.cgiGet( sPrefix+"AV133Muestras_CTRL") ;
      if ( GXutil.len( sCtrlAV133Muestras) > 0 )
      {
         AV133Muestras = httpContext.cgiGet( sCtrlAV133Muestras) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133Muestras", AV133Muestras);
      }
      else
      {
         AV133Muestras = httpContext.cgiGet( sPrefix+"AV133Muestras_PARM") ;
      }
      sCtrlAV134BarCodfrom = httpContext.cgiGet( sPrefix+"AV134BarCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV134BarCodfrom) > 0 )
      {
         AV134BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV134BarCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134BarCodfrom), 8, 0));
      }
      else
      {
         AV134BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV134BarCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV139BarCodto = httpContext.cgiGet( sPrefix+"AV139BarCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV139BarCodto) > 0 )
      {
         AV139BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV139BarCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV139BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139BarCodto), 8, 0));
      }
      else
      {
         AV139BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV139BarCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV137BarCodReofrom = httpContext.cgiGet( sPrefix+"AV137BarCodReofrom_CTRL") ;
      if ( GXutil.len( sCtrlAV137BarCodReofrom) > 0 )
      {
         AV137BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV137BarCodReofrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV137BarCodReofrom", GXutil.str( AV137BarCodReofrom, 1, 0));
      }
      else
      {
         AV137BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV137BarCodReofrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV138BarCodReoto = httpContext.cgiGet( sPrefix+"AV138BarCodReoto_CTRL") ;
      if ( GXutil.len( sCtrlAV138BarCodReoto) > 0 )
      {
         AV138BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV138BarCodReoto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138BarCodReoto", GXutil.str( AV138BarCodReoto, 1, 0));
      }
      else
      {
         AV138BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV138BarCodReoto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV135BarCodParfrom = httpContext.cgiGet( sPrefix+"AV135BarCodParfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV135BarCodParfrom) > 0 )
      {
         AV135BarCodParfrom = httpContext.cgiGet( sCtrlAV135BarCodParfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV135BarCodParfrom", AV135BarCodParfrom);
      }
      else
      {
         AV135BarCodParfrom = httpContext.cgiGet( sPrefix+"AV135BarCodParfrom_PARM") ;
      }
      sCtrlAV136BarCodParto = httpContext.cgiGet( sPrefix+"AV136BarCodParto_CTRL") ;
      if ( GXutil.len( sCtrlAV136BarCodParto) > 0 )
      {
         AV136BarCodParto = httpContext.cgiGet( sCtrlAV136BarCodParto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV136BarCodParto", AV136BarCodParto);
      }
      else
      {
         AV136BarCodParto = httpContext.cgiGet( sPrefix+"AV136BarCodParto_PARM") ;
      }
      sCtrlAV155Cod_idtx = httpContext.cgiGet( sPrefix+"AV155Cod_idtx_CTRL") ;
      if ( GXutil.len( sCtrlAV155Cod_idtx) > 0 )
      {
         AV155Cod_idtx = httpContext.cgiGet( sCtrlAV155Cod_idtx) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155Cod_idtx", AV155Cod_idtx);
      }
      else
      {
         AV155Cod_idtx = httpContext.cgiGet( sPrefix+"AV155Cod_idtx_PARM") ;
      }
      sCtrlAV158BarGirar = httpContext.cgiGet( sPrefix+"AV158BarGirar_CTRL") ;
      if ( GXutil.len( sCtrlAV158BarGirar) > 0 )
      {
         AV158BarGirar = httpContext.cgiGet( sCtrlAV158BarGirar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158BarGirar", AV158BarGirar);
      }
      else
      {
         AV158BarGirar = httpContext.cgiGet( sPrefix+"AV158BarGirar_PARM") ;
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
      pa1KV2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1KV2( ) ;
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
      ws1KV2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Emprcod_PARM", GXutil.rtrim( AV29Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Emprcod_CTRL", GXutil.rtrim( sCtrlAV29Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30clicodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV30clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30clicodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30clicodfrom_CTRL", GXutil.rtrim( sCtrlAV30clicodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31clicodto_PARM", GXutil.ltrim( localUtil.ntoc( AV31clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31clicodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31clicodto_CTRL", GXutil.rtrim( sCtrlAV31clicodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32bardisnumfrom_PARM", GXutil.rtrim( AV32bardisnumfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32bardisnumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32bardisnumfrom_CTRL", GXutil.rtrim( sCtrlAV32bardisnumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33bardisnumto_PARM", GXutil.rtrim( AV33bardisnumto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33bardisnumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33bardisnumto_CTRL", GXutil.rtrim( sCtrlAV33bardisnumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34barfecgenfrom_PARM", localUtil.dtoc( AV34barfecgenfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34barfecgenfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34barfecgenfrom_CTRL", GXutil.rtrim( sCtrlAV34barfecgenfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35barfecgento_PARM", localUtil.dtoc( AV35barfecgento, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35barfecgento)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35barfecgento_CTRL", GXutil.rtrim( sCtrlAV35barfecgento));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36barsitfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV36barsitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36barsitfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36barsitfrom_CTRL", GXutil.rtrim( sCtrlAV36barsitfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37barsitto_PARM", GXutil.ltrim( localUtil.ntoc( AV37barsitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37barsitto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37barsitto_CTRL", GXutil.rtrim( sCtrlAV37barsitto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV114BarFecClifrom_PARM", localUtil.dtoc( AV114BarFecClifrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV114BarFecClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV114BarFecClifrom_CTRL", GXutil.rtrim( sCtrlAV114BarFecClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV115BarFecClito_PARM", localUtil.dtoc( AV115BarFecClito, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV115BarFecClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV115BarFecClito_CTRL", GXutil.rtrim( sCtrlAV115BarFecClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV116BarFecFprfrom_PARM", localUtil.dtoc( AV116BarFecFprfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV116BarFecFprfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV116BarFecFprfrom_CTRL", GXutil.rtrim( sCtrlAV116BarFecFprfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV117BarFecFprto_PARM", localUtil.dtoc( AV117BarFecFprto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV117BarFecFprto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV117BarFecFprto_CTRL", GXutil.rtrim( sCtrlAV117BarFecFprto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118BarFecSalfrom_PARM", localUtil.dtoc( AV118BarFecSalfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV118BarFecSalfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118BarFecSalfrom_CTRL", GXutil.rtrim( sCtrlAV118BarFecSalfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119BarFecSalto_PARM", localUtil.dtoc( AV119BarFecSalto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV119BarFecSalto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119BarFecSalto_CTRL", GXutil.rtrim( sCtrlAV119BarFecSalto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120BarSerfrom_PARM", GXutil.rtrim( AV120BarSerfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV120BarSerfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120BarSerfrom_CTRL", GXutil.rtrim( sCtrlAV120BarSerfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV121BarSerto_PARM", GXutil.rtrim( AV121BarSerto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV121BarSerto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV121BarSerto_CTRL", GXutil.rtrim( sCtrlAV121BarSerto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV130BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV130BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV130BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV130BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV130BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV131BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV131BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV131BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV131BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV131BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV122BarColNomfrom_PARM", GXutil.rtrim( AV122BarColNomfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV122BarColNomfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV122BarColNomfrom_CTRL", GXutil.rtrim( sCtrlAV122BarColNomfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV123BarColNomto_PARM", GXutil.rtrim( AV123BarColNomto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV123BarColNomto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV123BarColNomto_CTRL", GXutil.rtrim( sCtrlAV123BarColNomto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV124BarColNumfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV124BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV124BarColNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV124BarColNumfrom_CTRL", GXutil.rtrim( sCtrlAV124BarColNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV125BarColNumto_PARM", GXutil.ltrim( localUtil.ntoc( AV125BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV125BarColNumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV125BarColNumto_CTRL", GXutil.rtrim( sCtrlAV125BarColNumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV126BarNomClifrom_PARM", GXutil.rtrim( AV126BarNomClifrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV126BarNomClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV126BarNomClifrom_CTRL", GXutil.rtrim( sCtrlAV126BarNomClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV127BarNomClito_PARM", GXutil.rtrim( AV127BarNomClito));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV127BarNomClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV127BarNomClito_CTRL", GXutil.rtrim( sCtrlAV127BarNomClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV128BarNumClifrom_PARM", GXutil.ltrim( localUtil.ntoc( AV128BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV128BarNumClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV128BarNumClifrom_CTRL", GXutil.rtrim( sCtrlAV128BarNumClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV129BarNumClito_PARM", GXutil.ltrim( localUtil.ntoc( AV129BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV129BarNumClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV129BarNumClito_CTRL", GXutil.rtrim( sCtrlAV129BarNumClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV130BarTipArtfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV130BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV130BarTipArtfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV130BarTipArtfrom_CTRL", GXutil.rtrim( sCtrlAV130BarTipArtfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV131BarTipArtto_PARM", GXutil.ltrim( localUtil.ntoc( AV131BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV131BarTipArtto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV131BarTipArtto_CTRL", GXutil.rtrim( sCtrlAV131BarTipArtto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV133Muestras_PARM", GXutil.rtrim( AV133Muestras));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV133Muestras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV133Muestras_CTRL", GXutil.rtrim( sCtrlAV133Muestras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV134BarCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV134BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV134BarCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV134BarCodfrom_CTRL", GXutil.rtrim( sCtrlAV134BarCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV139BarCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV139BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV139BarCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV139BarCodto_CTRL", GXutil.rtrim( sCtrlAV139BarCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV137BarCodReofrom_PARM", GXutil.ltrim( localUtil.ntoc( AV137BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV137BarCodReofrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV137BarCodReofrom_CTRL", GXutil.rtrim( sCtrlAV137BarCodReofrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV138BarCodReoto_PARM", GXutil.ltrim( localUtil.ntoc( AV138BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV138BarCodReoto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV138BarCodReoto_CTRL", GXutil.rtrim( sCtrlAV138BarCodReoto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV135BarCodParfrom_PARM", GXutil.rtrim( AV135BarCodParfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV135BarCodParfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV135BarCodParfrom_CTRL", GXutil.rtrim( sCtrlAV135BarCodParfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV136BarCodParto_PARM", GXutil.rtrim( AV136BarCodParto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV136BarCodParto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV136BarCodParto_CTRL", GXutil.rtrim( sCtrlAV136BarCodParto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV155Cod_idtx_PARM", GXutil.rtrim( AV155Cod_idtx));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV155Cod_idtx)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV155Cod_idtx_CTRL", GXutil.rtrim( sCtrlAV155Cod_idtx));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV158BarGirar_PARM", GXutil.rtrim( AV158BarGirar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV158BarGirar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV158BarGirar_CTRL", GXutil.rtrim( sCtrlAV158BarGirar));
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
      we1KV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211665387", true, true);
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
      httpContext.AddJavascriptSource("produccion/consultadeproduccion_wc.js", "?20268211665387", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_402( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_40_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_40_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_40_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_40_idx ;
      edtavBaragrestwithtags_Internalname = sPrefix+"vBARAGRESTWITHTAGS_"+sGXsfl_40_idx ;
      edtBarAgrEst_Internalname = sPrefix+"BARAGREST_"+sGXsfl_40_idx ;
      edtavPedidocliente_Internalname = sPrefix+"vPEDIDOCLIENTE_"+sGXsfl_40_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_40_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_40_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_40_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_40_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_40_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_40_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_40_idx ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM_"+sGXsfl_40_idx ;
      edtavBarmtr_Internalname = sPrefix+"vBARMTR_"+sGXsfl_40_idx ;
      edtavBarpie_Internalname = sPrefix+"vBARPIE_"+sGXsfl_40_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_40_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_40_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_40_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_40_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_40_idx ;
      edtavBarfascod_Internalname = sPrefix+"vBARFASCOD_"+sGXsfl_40_idx ;
      edtBarFasSig_Internalname = sPrefix+"BARFASSIG_"+sGXsfl_40_idx ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI_"+sGXsfl_40_idx ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT_"+sGXsfl_40_idx ;
      edtavBaralbmts_Internalname = sPrefix+"vBARALBMTS_"+sGXsfl_40_idx ;
      edtavBaralbkgs_Internalname = sPrefix+"vBARALBKGS_"+sGXsfl_40_idx ;
      edtBarGirar_Internalname = sPrefix+"BARGIRAR_"+sGXsfl_40_idx ;
      edtBarAcaAnh_Internalname = sPrefix+"BARACAANH_"+sGXsfl_40_idx ;
      edtavBarcuaderno_Internalname = sPrefix+"vBARCUADERNO_"+sGXsfl_40_idx ;
      edtBarProPer_Internalname = sPrefix+"BARPROPER_"+sGXsfl_40_idx ;
      edtavBarproperidtx_Internalname = sPrefix+"vBARPROPERIDTX_"+sGXsfl_40_idx ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS_"+sGXsfl_40_idx ;
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD_"+sGXsfl_40_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_40_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_40_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_40_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_402( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_40_fel_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_40_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_40_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_40_fel_idx ;
      edtavBaragrestwithtags_Internalname = sPrefix+"vBARAGRESTWITHTAGS_"+sGXsfl_40_fel_idx ;
      edtBarAgrEst_Internalname = sPrefix+"BARAGREST_"+sGXsfl_40_fel_idx ;
      edtavPedidocliente_Internalname = sPrefix+"vPEDIDOCLIENTE_"+sGXsfl_40_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_40_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_40_fel_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_40_fel_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_40_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_40_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_40_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_40_fel_idx ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM_"+sGXsfl_40_fel_idx ;
      edtavBarmtr_Internalname = sPrefix+"vBARMTR_"+sGXsfl_40_fel_idx ;
      edtavBarpie_Internalname = sPrefix+"vBARPIE_"+sGXsfl_40_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_40_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_40_fel_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_40_fel_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_40_fel_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_40_fel_idx ;
      edtavBarfascod_Internalname = sPrefix+"vBARFASCOD_"+sGXsfl_40_fel_idx ;
      edtBarFasSig_Internalname = sPrefix+"BARFASSIG_"+sGXsfl_40_fel_idx ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI_"+sGXsfl_40_fel_idx ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT_"+sGXsfl_40_fel_idx ;
      edtavBaralbmts_Internalname = sPrefix+"vBARALBMTS_"+sGXsfl_40_fel_idx ;
      edtavBaralbkgs_Internalname = sPrefix+"vBARALBKGS_"+sGXsfl_40_fel_idx ;
      edtBarGirar_Internalname = sPrefix+"BARGIRAR_"+sGXsfl_40_fel_idx ;
      edtBarAcaAnh_Internalname = sPrefix+"BARACAANH_"+sGXsfl_40_fel_idx ;
      edtavBarcuaderno_Internalname = sPrefix+"vBARCUADERNO_"+sGXsfl_40_fel_idx ;
      edtBarProPer_Internalname = sPrefix+"BARPROPER_"+sGXsfl_40_fel_idx ;
      edtavBarproperidtx_Internalname = sPrefix+"vBARPROPERIDTX_"+sGXsfl_40_fel_idx ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS_"+sGXsfl_40_fel_idx ;
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD_"+sGXsfl_40_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_40_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_40_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_40_fel_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_40_fel_idx ;
   }

   public void sendrow_402( )
   {
      subsflControlProps_402( ) ;
      wb1KV0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_40_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_40_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_40_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV151Grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV151Grupodeacciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151Grupodeacciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV151Grupodeacciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRUPODEACCIONES.CLICK."+sGXsfl_40_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,41);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV151Grupodeacciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_40_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNHdr_Columnclass,edtBarNHdr_Columnheaderclass,Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBaragrestwithtags_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaragrestwithtags_Enabled!=0)&&(edtavBaragrestwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaragrestwithtags_Internalname,AV150BarAgrEstWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBaragrestwithtags_Enabled!=0)&&(edtavBaragrestwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaragrestwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtavBaragrestwithtags_Visible),Integer.valueOf(edtavBaragrestwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrEst_Internalname,GXutil.rtrim( A120BarAgrEst),GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+"e261kv2_client"+"'","","","","",edtBarAgrEst_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPedidocliente_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPedidocliente_Enabled!=0)&&(edtavPedidocliente_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPedidocliente_Internalname,GXutil.ltrim( localUtil.ntoc( AV165PedidoCliente, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPedidocliente_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV165PedidoCliente), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV165PedidoCliente), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPedidocliente_Enabled!=0)&&(edtavPedidocliente_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPedidocliente_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPedidocliente_Visible),Integer.valueOf(edtavPedidocliente_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipArt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArtD_Internalname,GXutil.rtrim( A13711BarTipArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarkgm_Enabled!=0)&&(edtavBarkgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgm_Internalname,GXutil.ltrim( localUtil.ntoc( AV166BarKgm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV166BarKgm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV166BarKgm), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarkgm_Enabled!=0)&&(edtavBarkgm_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarkgm_Visible),Integer.valueOf(edtavBarkgm_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarmtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarmtr_Enabled!=0)&&(edtavBarmtr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarmtr_Internalname,GXutil.ltrim( localUtil.ntoc( AV167BarMtr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV167BarMtr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV167BarMtr), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarmtr_Enabled!=0)&&(edtavBarmtr_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarmtr_Visible),Integer.valueOf(edtavBarmtr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarpie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarpie_Enabled!=0)&&(edtavBarpie_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarpie_Internalname,GXutil.ltrim( localUtil.ntoc( AV168BarPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV168BarPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV168BarPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarpie_Enabled!=0)&&(edtavBarpie_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarpie_Visible),Integer.valueOf(edtavBarpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecFpr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecFpr_Internalname,localUtil.format(A158BarFecFpr, "99/99/99"),localUtil.format( A158BarFecFpr, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecFpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecFpr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecSal_Internalname,localUtil.format(A161BarFecSal, "99/99/99"),localUtil.format( A161BarFecSal, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarfascod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarfascod_Enabled!=0)&&(edtavBarfascod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfascod_Internalname,GXutil.ltrim( localUtil.ntoc( AV169BarFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarfascod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV169BarFasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV169BarFasCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarfascod_Enabled!=0)&&(edtavBarfascod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarfascod_Visible),Integer.valueOf(edtavBarfascod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasSig_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasSig_Internalname,GXutil.rtrim( A1955BarFasSig),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasSig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFasSig_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbUlti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbUlti_Internalname,GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbUlti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbUlti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbFact_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbFact_Internalname,GXutil.ltrim( localUtil.ntoc( A13935BarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13935BarAlbFact), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbFact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbFact_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbmts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaralbmts_Enabled!=0)&&(edtavBaralbmts_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbmts_Internalname,GXutil.ltrim( localUtil.ntoc( AV170BarAlbMts, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbmts_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV170BarAlbMts), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV170BarAlbMts), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBaralbmts_Enabled!=0)&&(edtavBaralbmts_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbmts_Visible),Integer.valueOf(edtavBaralbmts_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBaralbkgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaralbkgs_Enabled!=0)&&(edtavBaralbkgs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbkgs_Internalname,GXutil.ltrim( localUtil.ntoc( AV171BarAlbKgs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbkgs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV171BarAlbKgs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV171BarAlbKgs), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBaralbkgs_Enabled!=0)&&(edtavBaralbkgs_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbkgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaralbkgs_Visible),Integer.valueOf(edtavBaralbkgs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarGirar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGirar_Internalname,GXutil.rtrim( A2454BarGirar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarGirar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarGirar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAcaAnh_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAcaAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAcaAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAcaAnh_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarcuaderno_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcuaderno_Enabled!=0)&&(edtavBarcuaderno_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcuaderno_Internalname,GXutil.ltrim( localUtil.ntoc( AV172BarCuaderno, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcuaderno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV172BarCuaderno), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV172BarCuaderno), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcuaderno_Enabled!=0)&&(edtavBarcuaderno_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcuaderno_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarcuaderno_Visible),Integer.valueOf(edtavBarcuaderno_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarProPer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarProPer_Internalname,GXutil.rtrim( A2829BarProPer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarProPer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarProPer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarproperidtx_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarproperidtx_Enabled!=0)&&(edtavBarproperidtx_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarproperidtx_Internalname,GXutil.ltrim( localUtil.ntoc( AV173BarProPerIdtx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarproperidtx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV173BarProPerIdtx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV173BarProPerIdtx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarproperidtx_Enabled!=0)&&(edtavBarproperidtx_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarproperidtx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarproperidtx_Visible),Integer.valueOf(edtavBarproperidtx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNormas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNormas_Internalname,A13934BarNormas,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNormas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNormas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisUsrCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUsrCod_Internalname,GXutil.rtrim( A4348DisUsrCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisUsrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisUsrCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarExt_Internalname,GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1KV2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_40_idx = ((subGrid_Islastpage==1)&&(nGXsfl_40_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
      }
      /* End function sendrow_402 */
   }

   public void startgridcontrol40( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"40\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaragrestwithtags_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPedidocliente_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp. Cliente", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarmtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarpie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Generacion", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarfascod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultima", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasSig_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Siguiente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbUlti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbFact_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaralbmts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaralbkgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarGirar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAcaAnh_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuaderno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarcuaderno_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarProPer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CTW", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarproperidtx_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNormas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estandars Textiles", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV151Grupodeacciones, (byte)(4), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV150BarAgrEstWithTags);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaragrestwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaragrestwithtags_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV165PedidoCliente, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPedidocliente_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPedidocliente_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV166BarKgm, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV167BarMtr, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarmtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV168BarPie, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarpie_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV169BarFasCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarfascod_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV170BarAlbMts, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbmts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaralbmts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV171BarAlbKgs, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbkgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaralbkgs_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV172BarCuaderno, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcuaderno_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcuaderno_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2829BarProPer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarProPer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV173BarProPerIdtx, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarproperidtx_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarproperidtx_Visible, (byte)(5), (byte)(0), ".", "")));
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
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtavBaragrestwithtags_Internalname = sPrefix+"vBARAGRESTWITHTAGS" ;
      edtBarAgrEst_Internalname = sPrefix+"BARAGREST" ;
      edtavPedidocliente_Internalname = sPrefix+"vPEDIDOCLIENTE" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART" ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM" ;
      edtavBarmtr_Internalname = sPrefix+"vBARMTR" ;
      edtavBarpie_Internalname = sPrefix+"vBARPIE" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI" ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR" ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL" ;
      edtavBarfascod_Internalname = sPrefix+"vBARFASCOD" ;
      edtBarFasSig_Internalname = sPrefix+"BARFASSIG" ;
      edtBarAlbUlti_Internalname = sPrefix+"BARALBULTI" ;
      edtBarAlbFact_Internalname = sPrefix+"BARALBFACT" ;
      edtavBaralbmts_Internalname = sPrefix+"vBARALBMTS" ;
      edtavBaralbkgs_Internalname = sPrefix+"vBARALBKGS" ;
      edtBarGirar_Internalname = sPrefix+"BARGIRAR" ;
      edtBarAcaAnh_Internalname = sPrefix+"BARACAANH" ;
      edtavBarcuaderno_Internalname = sPrefix+"vBARCUADERNO" ;
      edtBarProPer_Internalname = sPrefix+"BARPROPER" ;
      edtavBarproperidtx_Internalname = sPrefix+"vBARPROPERIDTX" ;
      edtBarNormas_Internalname = sPrefix+"BARNORMAS" ;
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarExt_Internalname = sPrefix+"BAREXT" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Popover_baragrest_Internalname = sPrefix+"POPOVER_BARAGREST" ;
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
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
      edtavDdo_barfecgenauxdate_Internalname = sPrefix+"vDDO_BARFECGENAUXDATE" ;
      divDdo_barfecgenauxdates_Internalname = sPrefix+"DDO_BARFECGENAUXDATES" ;
      edtavDdo_barfeccliauxdate_Internalname = sPrefix+"vDDO_BARFECCLIAUXDATE" ;
      divDdo_barfeccliauxdates_Internalname = sPrefix+"DDO_BARFECCLIAUXDATES" ;
      edtavDdo_barfecfprauxdate_Internalname = sPrefix+"vDDO_BARFECFPRAUXDATE" ;
      divDdo_barfecfprauxdates_Internalname = sPrefix+"DDO_BARFECFPRAUXDATES" ;
      edtavDdo_barfecsalauxdate_Internalname = sPrefix+"vDDO_BARFECSALAUXDATE" ;
      divDdo_barfecsalauxdates_Internalname = sPrefix+"DDO_BARFECSALAUXDATES" ;
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
      edtBarExt_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtDisUsrCod_Jsonclick = "" ;
      edtBarNormas_Jsonclick = "" ;
      edtavBarproperidtx_Jsonclick = "" ;
      edtavBarproperidtx_Enabled = 1 ;
      edtBarProPer_Jsonclick = "" ;
      edtavBarcuaderno_Jsonclick = "" ;
      edtavBarcuaderno_Enabled = 1 ;
      edtBarAcaAnh_Jsonclick = "" ;
      edtBarGirar_Jsonclick = "" ;
      edtavBaralbkgs_Jsonclick = "" ;
      edtavBaralbkgs_Enabled = 1 ;
      edtavBaralbmts_Jsonclick = "" ;
      edtavBaralbmts_Enabled = 1 ;
      edtBarAlbFact_Jsonclick = "" ;
      edtBarAlbUlti_Jsonclick = "" ;
      edtBarFasSig_Jsonclick = "" ;
      edtavBarfascod_Jsonclick = "" ;
      edtavBarfascod_Enabled = 1 ;
      edtBarFecSal_Jsonclick = "" ;
      edtBarFecFpr_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 1 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarTipArtD_Jsonclick = "" ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtavPedidocliente_Jsonclick = "" ;
      edtavPedidocliente_Enabled = 1 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtavBaragrestwithtags_Jsonclick = "" ;
      edtavBaragrestwithtags_Enabled = 1 ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Columnclass = "WWColumn hidden-xs" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtBarNHdr_Columnheaderclass = "" ;
      edtDisUsrCod_Visible = -1 ;
      edtBarNormas_Visible = -1 ;
      edtavBarproperidtx_Visible = -1 ;
      edtBarProPer_Visible = -1 ;
      edtavBarcuaderno_Visible = -1 ;
      edtBarAcaAnh_Visible = -1 ;
      edtBarGirar_Visible = -1 ;
      edtavBaralbkgs_Visible = -1 ;
      edtavBaralbmts_Visible = -1 ;
      edtBarAlbFact_Visible = -1 ;
      edtBarAlbUlti_Visible = -1 ;
      edtBarFasSig_Visible = -1 ;
      edtavBarfascod_Visible = -1 ;
      edtBarFecSal_Visible = -1 ;
      edtBarFecFpr_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtBarSit_Visible = -1 ;
      edtavBarpie_Visible = -1 ;
      edtavBarmtr_Visible = -1 ;
      edtavBarkgm_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarTipArtD_Visible = -1 ;
      edtBarTipArt_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtavPedidocliente_Visible = -1 ;
      edtavBaragrestwithtags_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfecsalauxdate_Jsonclick = "" ;
      edtavDdo_barfecfprauxdate_Jsonclick = "" ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      WebComp_Wwpaux_wc_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"gxHTMLWrpW0126"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wwpaux_wc_Visible), 5, 0), true);
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Popoversingrid = "Popover_BarAgrEst" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;;;;Fecha;Fecha;Fecha;Fecha;;Fase;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "Produccion.ConsultadeProduccion_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic||Dynamic|Dynamic||Dynamic||||||||||Dynamic|||||Dynamic|||Dynamic||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T||T|T||T|T||T||||||||||T|||||T|||T||T|T" ;
      Ddo_grid_Filterisrange = "T|||||||T|||T|||||T|||||||T|T||||T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character||Character|Character|Numeric|Character|Character|Numeric|Character||||Numeric|Date|Date|Date|Date||Character|Numeric|Numeric|||Character|Numeric||Character||Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T||T|T|T|T|T|T|T||||T|T|T|T|T||T|T|T|||T|T||T||T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T||T|T|T|T|T|T|T||||T|T|T|T|T|||||||T|T||T|||T" ;
      Ddo_grid_Columnssortvalues = "2|3||4||5|6|7|8|9|10|11||||12|13|14|15|16|||||||17|18||19|||20" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:BarNHdr|4:BarAgrEst|6:PedidoCliente|7:BarSer|8:BarSerDsc|9:BarTipArt|10:BarTipArtDsc|11:BarColNom|12:BarColNum|13:BarNomCli|14:BarKgm|15:BarMtr|16:BarPie|17:BarSit|18:BarFecGen|19:BarFecCli|20:BarFecFpr|21:BarFecSal|22:BarFasCod|23:BarFasSig|24:BarAlbUltimo|25:BarAlbFact|26:BarAlbMts|27:BarAlbKgs|28:BarGirar|29:BarAcaAnh|30:BarCuaderno|31:BarProPer|32:BarProPerIdtx|33:BarNormas|34:DisUsrCod" ;
      Ddo_grid_Gridinternalname = "" ;
      Popover_baragrest_Position = "Bottom" ;
      Popover_baragrest_Popoverwidth = 1500 ;
      Popover_baragrest_Trigger = "Click" ;
      Popover_baragrest_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_baragrest_Iteminternalname = "" ;
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
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_40_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBaragrestwithtags_Visible',ctrl:'vBARAGRESTWITHTAGS',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBarmtr_Visible',ctrl:'vBARMTR',prop:'Visible'},{av:'edtavBarpie_Visible',ctrl:'vBARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtavBaralbmts_Visible',ctrl:'vBARALBMTS',prop:'Visible'},{av:'edtavBaralbkgs_Visible',ctrl:'vBARALBKGS',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavBarcuaderno_Visible',ctrl:'vBARCUADERNO',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtavBarproperidtx_Visible',ctrl:'vBARPROPERIDTX',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111KV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121KV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131KV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e241KV2',iparms:[{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV151Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'edtBarNHdr_Columnclass',ctrl:'BARNHDR',prop:'Columnclass'},{av:'AV150BarAgrEstWithTags',fld:'vBARAGRESTWITHTAGS',pic:''},{ctrl:'WWPAUX_WC',prop:'Visible'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141KV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBaragrestwithtags_Visible',ctrl:'vBARAGRESTWITHTAGS',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBarmtr_Visible',ctrl:'vBARMTR',prop:'Visible'},{av:'edtavBarpie_Visible',ctrl:'vBARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtavBaralbmts_Visible',ctrl:'vBARALBMTS',prop:'Visible'},{av:'edtavBaralbkgs_Visible',ctrl:'vBARALBKGS',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavBarcuaderno_Visible',ctrl:'vBARCUADERNO',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtavBarproperidtx_Visible',ctrl:'vBARPROPERIDTX',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e251KV2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV151Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:'',hsh:true},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:'',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:'',hsh:true},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:'',hsh:true}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV151Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBaragrestwithtags_Visible',ctrl:'vBARAGRESTWITHTAGS',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBarmtr_Visible',ctrl:'vBARMTR',prop:'Visible'},{av:'edtavBarpie_Visible',ctrl:'vBARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtavBaralbmts_Visible',ctrl:'vBARALBMTS',prop:'Visible'},{av:'edtavBaralbkgs_Visible',ctrl:'vBARALBKGS',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavBarcuaderno_Visible',ctrl:'vBARCUADERNO',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtavBarproperidtx_Visible',ctrl:'vBARPROPERIDTX',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''}]}");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE","{handler:'e151KV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBaragrestwithtags_Visible',ctrl:'vBARAGRESTWITHTAGS',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBarmtr_Visible',ctrl:'vBARMTR',prop:'Visible'},{av:'edtavBarpie_Visible',ctrl:'vBARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtavBaralbmts_Visible',ctrl:'vBARALBMTS',prop:'Visible'},{av:'edtavBaralbkgs_Visible',ctrl:'vBARALBKGS',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavBarcuaderno_Visible',ctrl:'vBARCUADERNO',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtavBarproperidtx_Visible',ctrl:'vBARPROPERIDTX',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''}]}");
      setEventMetadata("CONSULTAALBARANSALIDA_MODAL.CLOSE","{handler:'e161KV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("CONSULTAALBARANSALIDA_MODAL.CLOSE",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBaragrestwithtags_Visible',ctrl:'vBARAGRESTWITHTAGS',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBarmtr_Visible',ctrl:'vBARMTR',prop:'Visible'},{av:'edtavBarpie_Visible',ctrl:'vBARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtavBaralbmts_Visible',ctrl:'vBARALBMTS',prop:'Visible'},{av:'edtavBaralbkgs_Visible',ctrl:'vBARALBKGS',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavBarcuaderno_Visible',ctrl:'vBARCUADERNO',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtavBarproperidtx_Visible',ctrl:'vBARPROPERIDTX',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''}]}");
      setEventMetadata("RECETAS_MODAL.CLOSE","{handler:'e171KV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("RECETAS_MODAL.CLOSE",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBaragrestwithtags_Visible',ctrl:'vBARAGRESTWITHTAGS',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBarmtr_Visible',ctrl:'vBARMTR',prop:'Visible'},{av:'edtavBarpie_Visible',ctrl:'vBARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtavBaralbmts_Visible',ctrl:'vBARALBMTS',prop:'Visible'},{av:'edtavBaralbkgs_Visible',ctrl:'vBARALBKGS',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavBarcuaderno_Visible',ctrl:'vBARCUADERNO',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtavBarproperidtx_Visible',ctrl:'vBARPROPERIDTX',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''}]}");
      setEventMetadata("PARTESPRODUCCION_MODAL.CLOSE","{handler:'e181KV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("PARTESPRODUCCION_MODAL.CLOSE",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBaragrestwithtags_Visible',ctrl:'vBARAGRESTWITHTAGS',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBarmtr_Visible',ctrl:'vBARMTR',prop:'Visible'},{av:'edtavBarpie_Visible',ctrl:'vBARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtavBaralbmts_Visible',ctrl:'vBARALBMTS',prop:'Visible'},{av:'edtavBaralbkgs_Visible',ctrl:'vBARALBKGS',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavBarcuaderno_Visible',ctrl:'vBARCUADERNO',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtavBarproperidtx_Visible',ctrl:'vBARPROPERIDTX',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''}]}");
      setEventMetadata("PIEZAS_MODAL.CLOSE","{handler:'e191KV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV31clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV32bardisnumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV33bardisnumto',fld:'vBARDISNUMTO',pic:''},{av:'AV34barfecgenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV35barfecgento',fld:'vBARFECGENTO',pic:''},{av:'AV36barsitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37barsitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV114BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV115BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV116BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV117BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV118BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV119BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV120BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV121BarSerto',fld:'vBARSERTO',pic:''},{av:'AV130BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV131BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV122BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV123BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV124BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV125BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV126BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV127BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV128BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV129BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV133Muestras',fld:'vMUESTRAS',pic:''},{av:'AV134BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV139BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV137BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV138BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV135BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV136BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV155Cod_idtx',fld:'vCOD_IDTX',pic:''},{av:'AV158BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV176Pgmname',fld:'vPGMNAME',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV24TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV70TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV71TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV104TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV105TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV106TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV107TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV63TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV64TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV72TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV76TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV80TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV84TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV90TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV91TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV68TFBarAlbUltimo',fld:'vTFBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV69TFBarAlbUltimo_To',fld:'vTFBARALBULTIMO_TO',pic:'ZZZZZZZZZ9'},{av:'AV112TFBarAlbFact',fld:'vTFBARALBFACT',pic:'ZZZZZZZ9'},{av:'AV113TFBarAlbFact_To',fld:'vTFBARALBFACT_TO',pic:'ZZZZZZZ9'},{av:'AV96TFBarGirar',fld:'vTFBARGIRAR',pic:''},{av:'AV97TFBarGirar_Sel',fld:'vTFBARGIRAR_SEL',pic:''},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV102TFBarProPer',fld:'vTFBARPROPER',pic:''},{av:'AV103TFBarProPer_Sel',fld:'vTFBARPROPER_SEL',pic:''},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''},{av:'AV110TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV111TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV159cuaderno',fld:'vCUADERNO',pic:'ZZZ9',hsh:true},{av:'AV161STNORM',fld:'vSTNORM',pic:'ZZZ9',hsh:true},{av:'AV154Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("PIEZAS_MODAL.CLOSE",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavBaragrestwithtags_Visible',ctrl:'vBARAGRESTWITHTAGS',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtavBarkgm_Visible',ctrl:'vBARKGM',prop:'Visible'},{av:'edtavBarmtr_Visible',ctrl:'vBARMTR',prop:'Visible'},{av:'edtavBarpie_Visible',ctrl:'vBARPIE',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtavBarfascod_Visible',ctrl:'vBARFASCOD',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtBarAlbUlti_Visible',ctrl:'BARALBULTI',prop:'Visible'},{av:'edtBarAlbFact_Visible',ctrl:'BARALBFACT',prop:'Visible'},{av:'edtavBaralbmts_Visible',ctrl:'vBARALBMTS',prop:'Visible'},{av:'edtavBaralbkgs_Visible',ctrl:'vBARALBKGS',prop:'Visible'},{av:'edtBarGirar_Visible',ctrl:'BARGIRAR',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavBarcuaderno_Visible',ctrl:'vBARCUADERNO',prop:'Visible'},{av:'edtBarProPer_Visible',ctrl:'BARPROPER',prop:'Visible'},{av:'edtavBarproperidtx_Visible',ctrl:'vBARPROPERIDTX',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV98TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV99TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV108TFBarNormas',fld:'vTFBARNORMAS',pic:''},{av:'AV109TFBarNormas_Sel',fld:'vTFBARNORMAS_SEL',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e201KV2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e211KV2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("BARAGREST.CLICK","{handler:'e261KV2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:'',hsh:true},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:'',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:'',hsh:true},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!',hsh:true}]");
      setEventMetadata("BARAGREST.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARTIPART","{handler:'valid_Bartipart',iparms:[]");
      setEventMetadata("VALID_BARTIPART",",oparms:[]}");
      setEventMetadata("VALID_BARALBULTI","{handler:'valid_Baralbulti',iparms:[]");
      setEventMetadata("VALID_BARALBULTI",",oparms:[]}");
      setEventMetadata("VALID_BARALBFACT","{handler:'valid_Baralbfact',iparms:[]");
      setEventMetadata("VALID_BARALBFACT",",oparms:[]}");
      setEventMetadata("VALID_BARNORMAS","{handler:'valid_Barnormas',iparms:[]");
      setEventMetadata("VALID_BARNORMAS",",oparms:[]}");
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
      wcpOAV29Emprcod = "" ;
      wcpOAV32bardisnumfrom = "" ;
      wcpOAV33bardisnumto = "" ;
      wcpOAV34barfecgenfrom = GXutil.nullDate() ;
      wcpOAV35barfecgento = GXutil.nullDate() ;
      wcpOAV114BarFecClifrom = GXutil.nullDate() ;
      wcpOAV115BarFecClito = GXutil.nullDate() ;
      wcpOAV116BarFecFprfrom = GXutil.nullDate() ;
      wcpOAV117BarFecFprto = GXutil.nullDate() ;
      wcpOAV118BarFecSalfrom = GXutil.nullDate() ;
      wcpOAV119BarFecSalto = GXutil.nullDate() ;
      wcpOAV120BarSerfrom = "" ;
      wcpOAV121BarSerto = "" ;
      wcpOAV122BarColNomfrom = "" ;
      wcpOAV123BarColNomto = "" ;
      wcpOAV126BarNomClifrom = "" ;
      wcpOAV127BarNomClito = "" ;
      wcpOAV133Muestras = "" ;
      wcpOAV135BarCodParfrom = "" ;
      wcpOAV136BarCodParto = "" ;
      wcpOAV155Cod_idtx = "" ;
      wcpOAV158BarGirar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV29Emprcod = "" ;
      AV32bardisnumfrom = "" ;
      AV33bardisnumto = "" ;
      AV34barfecgenfrom = GXutil.nullDate() ;
      AV35barfecgento = GXutil.nullDate() ;
      AV114BarFecClifrom = GXutil.nullDate() ;
      AV115BarFecClito = GXutil.nullDate() ;
      AV116BarFecFprfrom = GXutil.nullDate() ;
      AV117BarFecFprto = GXutil.nullDate() ;
      AV118BarFecSalfrom = GXutil.nullDate() ;
      AV119BarFecSalto = GXutil.nullDate() ;
      AV120BarSerfrom = "" ;
      AV121BarSerto = "" ;
      AV122BarColNomfrom = "" ;
      AV123BarColNomto = "" ;
      AV126BarNomClifrom = "" ;
      AV127BarNomClito = "" ;
      AV133Muestras = "" ;
      AV135BarCodParfrom = "" ;
      AV136BarCodParto = "" ;
      AV155Cod_idtx = "" ;
      AV158BarGirar = "" ;
      AV17ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV176Pgmname = "" ;
      AV43TFCliNom = "" ;
      AV44TFCliNom_Sel = "" ;
      AV23TFBarNHdr = "" ;
      AV24TFBarNHdr_Sel = "" ;
      AV70TFBarAgrEst = "" ;
      AV71TFBarAgrEst_Sel = "" ;
      AV47TFBarSer = "" ;
      AV48TFBarSer_Sel = "" ;
      AV49TFBarSerDsc = "" ;
      AV50TFBarSerDsc_Sel = "" ;
      AV106TFBarTipArtDsc = "" ;
      AV107TFBarTipArtDsc_Sel = "" ;
      AV51TFBarColNom = "" ;
      AV52TFBarColNom_Sel = "" ;
      AV55TFBarNomCli = "" ;
      AV56TFBarNomCli_Sel = "" ;
      AV72TFBarFecGen = GXutil.nullDate() ;
      AV76TFBarFecCli = GXutil.nullDate() ;
      AV80TFBarFecFpr = GXutil.nullDate() ;
      AV84TFBarFecSal = GXutil.nullDate() ;
      AV90TFBarFasSig = "" ;
      AV91TFBarFasSig_Sel = "" ;
      AV96TFBarGirar = "" ;
      AV97TFBarGirar_Sel = "" ;
      AV102TFBarProPer = "" ;
      AV103TFBarProPer_Sel = "" ;
      AV108TFBarNormas = "" ;
      AV109TFBarNormas_Sel = "" ;
      AV110TFDisUsrCod = "" ;
      AV111TFDisUsrCod_Sel = "" ;
      A396EmprCod = "" ;
      A13878PedidoClie = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV25DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      Popover_baragrest_Gridinternalname = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
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
      ucPopover_baragrest = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      AV74DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV78DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      AV82DDO_BarFecFprAuxDate = GXutil.nullDate() ;
      AV86DDO_BarFecSalAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A13696BarNHdr = "" ;
      AV150BarAgrEstWithTags = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A1955BarFasSig = "" ;
      A2454BarGirar = "" ;
      A2829BarProPer = "" ;
      A13934BarNormas = "" ;
      A4348DisUsrCod = "" ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      lV90TFBarFasSig = "" ;
      lV43TFCliNom = "" ;
      lV23TFBarNHdr = "" ;
      lV70TFBarAgrEst = "" ;
      lV47TFBarSer = "" ;
      lV49TFBarSerDsc = "" ;
      lV106TFBarTipArtDsc = "" ;
      lV51TFBarColNom = "" ;
      lV55TFBarNomCli = "" ;
      lV96TFBarGirar = "" ;
      lV102TFBarProPer = "" ;
      lV110TFDisUsrCod = "" ;
      A3030BarPlf = "" ;
      H01KV7_A3030BarPlf = new String[] {""} ;
      H01KV7_A1235BarNumCli = new int[1] ;
      H01KV7_A2265BarExt = new byte[1] ;
      H01KV7_n2265BarExt = new boolean[] {false} ;
      H01KV7_A4348DisUsrCod = new String[] {""} ;
      H01KV7_A2829BarProPer = new String[] {""} ;
      H01KV7_A4466BarAcaAnh = new short[1] ;
      H01KV7_A2454BarGirar = new String[] {""} ;
      H01KV7_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H01KV7_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H01KV7_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01KV7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01KV7_A213BarSit = new byte[1] ;
      H01KV7_A1234BarNomCli = new String[] {""} ;
      H01KV7_A136BarColNum = new int[1] ;
      H01KV7_A135BarColNom = new String[] {""} ;
      H01KV7_A13711BarTipArtD = new String[] {""} ;
      H01KV7_n13711BarTipArtD = new boolean[] {false} ;
      H01KV7_A217BarTipArt = new short[1] ;
      H01KV7_n217BarTipArt = new boolean[] {false} ;
      H01KV7_A1652BarSerDsc = new String[] {""} ;
      H01KV7_A212BarSer = new String[] {""} ;
      H01KV7_A120BarAgrEst = new String[] {""} ;
      H01KV7_A279CliNom = new String[] {""} ;
      H01KV7_A252CliCod = new int[1] ;
      H01KV7_n252CliCod = new boolean[] {false} ;
      H01KV7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KV7_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KV7_A1955BarFasSig = new String[] {""} ;
      H01KV7_n1955BarFasSig = new boolean[] {false} ;
      H01KV7_A130BarCodPar = new String[] {""} ;
      H01KV7_A132BarCodReo = new byte[1] ;
      H01KV7_A129BarCod = new int[1] ;
      H01KV7_A361DisCod = new int[1] ;
      H01KV7_A143BarDisNum = new String[] {""} ;
      H01KV7_A4812BarEncCli = new String[] {""} ;
      H01KV7_A396EmprCod = new String[] {""} ;
      H01KV13_A3030BarPlf = new String[] {""} ;
      H01KV13_A1235BarNumCli = new int[1] ;
      H01KV13_A2265BarExt = new byte[1] ;
      H01KV13_n2265BarExt = new boolean[] {false} ;
      H01KV13_A4348DisUsrCod = new String[] {""} ;
      H01KV13_A2829BarProPer = new String[] {""} ;
      H01KV13_A4466BarAcaAnh = new short[1] ;
      H01KV13_A2454BarGirar = new String[] {""} ;
      H01KV13_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H01KV13_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H01KV13_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01KV13_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01KV13_A213BarSit = new byte[1] ;
      H01KV13_A1234BarNomCli = new String[] {""} ;
      H01KV13_A136BarColNum = new int[1] ;
      H01KV13_A135BarColNom = new String[] {""} ;
      H01KV13_A13711BarTipArtD = new String[] {""} ;
      H01KV13_n13711BarTipArtD = new boolean[] {false} ;
      H01KV13_A217BarTipArt = new short[1] ;
      H01KV13_n217BarTipArt = new boolean[] {false} ;
      H01KV13_A1652BarSerDsc = new String[] {""} ;
      H01KV13_A212BarSer = new String[] {""} ;
      H01KV13_A120BarAgrEst = new String[] {""} ;
      H01KV13_A279CliNom = new String[] {""} ;
      H01KV13_A252CliCod = new int[1] ;
      H01KV13_n252CliCod = new boolean[] {false} ;
      H01KV13_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KV13_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KV13_A1955BarFasSig = new String[] {""} ;
      H01KV13_n1955BarFasSig = new boolean[] {false} ;
      H01KV13_A130BarCodPar = new String[] {""} ;
      H01KV13_A132BarCodReo = new byte[1] ;
      H01KV13_A129BarCod = new int[1] ;
      H01KV13_A361DisCod = new int[1] ;
      H01KV13_A143BarDisNum = new String[] {""} ;
      H01KV13_A4812BarEncCli = new String[] {""} ;
      H01KV13_A396EmprCod = new String[] {""} ;
      GXv_int2 = new long[1] ;
      GXv_int4 = new int[1] ;
      hsh = "" ;
      GXv_int11 = new byte[1] ;
      AV162Station = "" ;
      AV163EmprNom = "" ;
      AV164UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext14 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV15ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV13ExcelFilename = "" ;
      AV14ErrorMessage = "" ;
      AV16UserCustomValue = "" ;
      AV18ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char36 = "" ;
      GXv_char37 = new String[1] ;
      GXt_char34 = "" ;
      GXv_char35 = new String[1] ;
      GXt_char32 = "" ;
      GXv_char33 = new String[1] ;
      GXt_char30 = "" ;
      GXv_char31 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char9 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char8 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char7 = new String[1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      GXv_SdtWWPGridState38 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucPiezas_modal = new com.genexus.webpanels.GXUserControl();
      ucPackinglist_modal = new com.genexus.webpanels.GXUserControl();
      ucPartesproduccion_modal = new com.genexus.webpanels.GXUserControl();
      ucRecetas_modal = new com.genexus.webpanels.GXUserControl();
      ucConsultaalbaransalida_modal = new com.genexus.webpanels.GXUserControl();
      ucSituacionfases_modal = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV29Emprcod = "" ;
      sCtrlAV30clicodfrom = "" ;
      sCtrlAV31clicodto = "" ;
      sCtrlAV32bardisnumfrom = "" ;
      sCtrlAV33bardisnumto = "" ;
      sCtrlAV34barfecgenfrom = "" ;
      sCtrlAV35barfecgento = "" ;
      sCtrlAV36barsitfrom = "" ;
      sCtrlAV37barsitto = "" ;
      sCtrlAV114BarFecClifrom = "" ;
      sCtrlAV115BarFecClito = "" ;
      sCtrlAV116BarFecFprfrom = "" ;
      sCtrlAV117BarFecFprto = "" ;
      sCtrlAV118BarFecSalfrom = "" ;
      sCtrlAV119BarFecSalto = "" ;
      sCtrlAV120BarSerfrom = "" ;
      sCtrlAV121BarSerto = "" ;
      sCtrlAV130BarTipArtfrom = "" ;
      sCtrlAV131BarTipArtto = "" ;
      sCtrlAV122BarColNomfrom = "" ;
      sCtrlAV123BarColNomto = "" ;
      sCtrlAV124BarColNumfrom = "" ;
      sCtrlAV125BarColNumto = "" ;
      sCtrlAV126BarNomClifrom = "" ;
      sCtrlAV127BarNomClito = "" ;
      sCtrlAV128BarNumClifrom = "" ;
      sCtrlAV129BarNumClito = "" ;
      sCtrlAV133Muestras = "" ;
      sCtrlAV134BarCodfrom = "" ;
      sCtrlAV139BarCodto = "" ;
      sCtrlAV137BarCodReofrom = "" ;
      sCtrlAV138BarCodReoto = "" ;
      sCtrlAV135BarCodParfrom = "" ;
      sCtrlAV136BarCodParto = "" ;
      sCtrlAV155Cod_idtx = "" ;
      sCtrlAV158BarGirar = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_wc__default(),
         new Object[] {
             new Object[] {
            H01KV7_A3030BarPlf, H01KV7_A1235BarNumCli, H01KV7_A2265BarExt, H01KV7_n2265BarExt, H01KV7_A4348DisUsrCod, H01KV7_A2829BarProPer, H01KV7_A4466BarAcaAnh, H01KV7_A2454BarGirar, H01KV7_A161BarFecSal, H01KV7_A158BarFecFpr,
            H01KV7_A155BarFecCli, H01KV7_A159BarFecGen, H01KV7_A213BarSit, H01KV7_A1234BarNomCli, H01KV7_A136BarColNum, H01KV7_A135BarColNom, H01KV7_A13711BarTipArtD, H01KV7_n13711BarTipArtD, H01KV7_A217BarTipArt, H01KV7_n217BarTipArt,
            H01KV7_A1652BarSerDsc, H01KV7_A212BarSer, H01KV7_A120BarAgrEst, H01KV7_A279CliNom, H01KV7_A252CliCod, H01KV7_n252CliCod, H01KV7_A166BarKgm, H01KV7_A184BarMtr, H01KV7_A1955BarFasSig, H01KV7_n1955BarFasSig,
            H01KV7_A130BarCodPar, H01KV7_A132BarCodReo, H01KV7_A129BarCod, H01KV7_A361DisCod, H01KV7_A143BarDisNum, H01KV7_A4812BarEncCli, H01KV7_A396EmprCod
            }
            , new Object[] {
            H01KV13_A3030BarPlf, H01KV13_A1235BarNumCli, H01KV13_A2265BarExt, H01KV13_n2265BarExt, H01KV13_A4348DisUsrCod, H01KV13_A2829BarProPer, H01KV13_A4466BarAcaAnh, H01KV13_A2454BarGirar, H01KV13_A161BarFecSal, H01KV13_A158BarFecFpr,
            H01KV13_A155BarFecCli, H01KV13_A159BarFecGen, H01KV13_A213BarSit, H01KV13_A1234BarNomCli, H01KV13_A136BarColNum, H01KV13_A135BarColNom, H01KV13_A13711BarTipArtD, H01KV13_n13711BarTipArtD, H01KV13_A217BarTipArt, H01KV13_n217BarTipArt,
            H01KV13_A1652BarSerDsc, H01KV13_A212BarSer, H01KV13_A120BarAgrEst, H01KV13_A279CliNom, H01KV13_A252CliCod, H01KV13_n252CliCod, H01KV13_A166BarKgm, H01KV13_A184BarMtr, H01KV13_A1955BarFasSig, H01KV13_n1955BarFasSig,
            H01KV13_A130BarCodPar, H01KV13_A132BarCodReo, H01KV13_A129BarCod, H01KV13_A361DisCod, H01KV13_A143BarDisNum, H01KV13_A4812BarEncCli, H01KV13_A396EmprCod
            }
         }
      );
      AV176Pgmname = "Produccion.ConsultadeProduccion_WC" ;
      /* GeneXus formulas. */
      AV176Pgmname = "Produccion.ConsultadeProduccion_WC" ;
      Gx_err = (short)(0) ;
      edtavBaragrestwithtags_Enabled = 0 ;
      edtavPedidocliente_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavBarfascod_Enabled = 0 ;
      edtavBaralbmts_Enabled = 0 ;
      edtavBaralbkgs_Enabled = 0 ;
      edtavBarcuaderno_Enabled = 0 ;
      edtavBarproperidtx_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV36barsitfrom ;
   private byte wcpOAV37barsitto ;
   private byte wcpOAV137BarCodReofrom ;
   private byte wcpOAV138BarCodReoto ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV36barsitfrom ;
   private byte AV37barsitto ;
   private byte AV137BarCodReofrom ;
   private byte AV138BarCodReoto ;
   private byte AV63TFBarSit ;
   private byte AV64TFBarSit_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A2265BarExt ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int10 ;
   private byte GXv_int11[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV130BarTipArtfrom ;
   private short wcpOAV131BarTipArtto ;
   private short AV130BarTipArtfrom ;
   private short AV131BarTipArtto ;
   private short AV38OrderedBy ;
   private short AV104TFBarTipArt ;
   private short AV105TFBarTipArt_To ;
   private short AV98TFBarAcaAnh ;
   private short AV99TFBarAcaAnh_To ;
   private short AV159cuaderno ;
   private short AV161STNORM ;
   private short AV154Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV151Grupodeacciones ;
   private short AV165PedidoCliente ;
   private short A217BarTipArt ;
   private short AV166BarKgm ;
   private short AV167BarMtr ;
   private short AV168BarPie ;
   private short AV169BarFasCod ;
   private short AV170BarAlbMts ;
   private short AV171BarAlbKgs ;
   private short A4466BarAcaAnh ;
   private short AV172BarCuaderno ;
   private short AV173BarProPerIdtx ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV30clicodfrom ;
   private int wcpOAV31clicodto ;
   private int wcpOAV124BarColNumfrom ;
   private int wcpOAV125BarColNumto ;
   private int wcpOAV128BarNumClifrom ;
   private int wcpOAV129BarNumClito ;
   private int wcpOAV134BarCodfrom ;
   private int wcpOAV139BarCodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_40 ;
   private int AV30clicodfrom ;
   private int AV31clicodto ;
   private int AV124BarColNumfrom ;
   private int AV125BarColNumto ;
   private int AV128BarNumClifrom ;
   private int AV129BarNumClito ;
   private int AV134BarCodfrom ;
   private int AV139BarCodto ;
   private int nGXsfl_40_idx=1 ;
   private int AV41TFCliCod ;
   private int AV42TFCliCod_To ;
   private int AV53TFBarColNum ;
   private int AV54TFBarColNum_To ;
   private int AV112TFBarAlbFact ;
   private int AV113TFBarAlbFact_To ;
   private int A361DisCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Popover_baragrest_Popoverwidth ;
   private int edtavPgmname_Enabled ;
   private int WebComp_Wwpaux_wc_Visible ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A13935BarAlbFact ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavBaragrestwithtags_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavBarpie_Enabled ;
   private int edtavBarfascod_Enabled ;
   private int edtavBaralbmts_Enabled ;
   private int edtavBaralbkgs_Enabled ;
   private int edtavBarcuaderno_Enabled ;
   private int edtavBarproperidtx_Enabled ;
   private int A1235BarNumCli ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtavBaragrestwithtags_Visible ;
   private int edtavPedidocliente_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarTipArt_Visible ;
   private int edtBarTipArtD_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtavBarkgm_Visible ;
   private int edtavBarmtr_Visible ;
   private int edtavBarpie_Visible ;
   private int edtBarSit_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtBarFecFpr_Visible ;
   private int edtBarFecSal_Visible ;
   private int edtavBarfascod_Visible ;
   private int edtBarFasSig_Visible ;
   private int edtBarAlbUlti_Visible ;
   private int edtBarAlbFact_Visible ;
   private int edtavBaralbmts_Visible ;
   private int edtavBaralbkgs_Visible ;
   private int edtBarGirar_Visible ;
   private int edtBarAcaAnh_Visible ;
   private int edtavBarcuaderno_Visible ;
   private int edtBarProPer_Visible ;
   private int edtavBarproperidtx_Visible ;
   private int edtBarNormas_Visible ;
   private int edtDisUsrCod_Visible ;
   private int AV26PageToGo ;
   private int AV177GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV68TFBarAlbUltimo ;
   private long AV69TFBarAlbUltimo_To ;
   private long AV27GridCurrentPage ;
   private long AV28GridPageCount ;
   private long A13930BarAlbUlti ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String wcpOAV29Emprcod ;
   private String wcpOAV32bardisnumfrom ;
   private String wcpOAV33bardisnumto ;
   private String wcpOAV120BarSerfrom ;
   private String wcpOAV121BarSerto ;
   private String wcpOAV122BarColNomfrom ;
   private String wcpOAV123BarColNomto ;
   private String wcpOAV126BarNomClifrom ;
   private String wcpOAV127BarNomClito ;
   private String wcpOAV133Muestras ;
   private String wcpOAV135BarCodParfrom ;
   private String wcpOAV136BarCodParto ;
   private String wcpOAV155Cod_idtx ;
   private String wcpOAV158BarGirar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV29Emprcod ;
   private String AV32bardisnumfrom ;
   private String AV33bardisnumto ;
   private String AV120BarSerfrom ;
   private String AV121BarSerto ;
   private String AV122BarColNomfrom ;
   private String AV123BarColNomto ;
   private String AV126BarNomClifrom ;
   private String AV127BarNomClito ;
   private String AV133Muestras ;
   private String AV135BarCodParfrom ;
   private String AV136BarCodParto ;
   private String AV155Cod_idtx ;
   private String AV158BarGirar ;
   private String sGXsfl_40_idx="0001" ;
   private String AV176Pgmname ;
   private String AV43TFCliNom ;
   private String AV44TFCliNom_Sel ;
   private String AV23TFBarNHdr ;
   private String AV24TFBarNHdr_Sel ;
   private String AV70TFBarAgrEst ;
   private String AV71TFBarAgrEst_Sel ;
   private String AV47TFBarSer ;
   private String AV48TFBarSer_Sel ;
   private String AV49TFBarSerDsc ;
   private String AV50TFBarSerDsc_Sel ;
   private String AV106TFBarTipArtDsc ;
   private String AV107TFBarTipArtDsc_Sel ;
   private String AV51TFBarColNom ;
   private String AV52TFBarColNom_Sel ;
   private String AV55TFBarNomCli ;
   private String AV56TFBarNomCli_Sel ;
   private String AV90TFBarFasSig ;
   private String AV91TFBarFasSig_Sel ;
   private String AV96TFBarGirar ;
   private String AV97TFBarGirar_Sel ;
   private String AV102TFBarProPer ;
   private String AV103TFBarProPer_Sel ;
   private String AV110TFDisUsrCod ;
   private String AV111TFDisUsrCod_Sel ;
   private String A396EmprCod ;
   private String A13878PedidoClie ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
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
   private String Popover_baragrest_Gridinternalname ;
   private String Popover_baragrest_Iteminternalname ;
   private String Popover_baragrest_Trigger ;
   private String Popover_baragrest_Position ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
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
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String Grid_empowerer_Popoversingrid ;
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
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Popover_baragrest_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String divDdo_barfecfprauxdates_Internalname ;
   private String edtavDdo_barfecfprauxdate_Internalname ;
   private String edtavDdo_barfecfprauxdate_Jsonclick ;
   private String divDdo_barfecsalauxdates_Internalname ;
   private String edtavDdo_barfecsalauxdate_Internalname ;
   private String edtavDdo_barfecsalauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtavBaragrestwithtags_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Internalname ;
   private String edtavPedidocliente_Internalname ;
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
   private String edtavBarkgm_Internalname ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarpie_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String edtBarFecFpr_Internalname ;
   private String edtBarFecSal_Internalname ;
   private String edtavBarfascod_Internalname ;
   private String A1955BarFasSig ;
   private String edtBarFasSig_Internalname ;
   private String edtBarAlbUlti_Internalname ;
   private String edtBarAlbFact_Internalname ;
   private String edtavBaralbmts_Internalname ;
   private String edtavBaralbkgs_Internalname ;
   private String A2454BarGirar ;
   private String edtBarGirar_Internalname ;
   private String edtBarAcaAnh_Internalname ;
   private String edtavBarcuaderno_Internalname ;
   private String A2829BarProPer ;
   private String edtBarProPer_Internalname ;
   private String edtavBarproperidtx_Internalname ;
   private String edtBarNormas_Internalname ;
   private String A4348DisUsrCod ;
   private String edtDisUsrCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarExt_Internalname ;
   private String scmdbuf ;
   private String lV90TFBarFasSig ;
   private String lV43TFCliNom ;
   private String lV23TFBarNHdr ;
   private String lV70TFBarAgrEst ;
   private String lV47TFBarSer ;
   private String lV49TFBarSerDsc ;
   private String lV106TFBarTipArtDsc ;
   private String lV51TFBarColNom ;
   private String lV55TFBarNomCli ;
   private String lV96TFBarGirar ;
   private String lV102TFBarProPer ;
   private String lV110TFDisUsrCod ;
   private String A3030BarPlf ;
   private String hsh ;
   private String AV162Station ;
   private String AV163EmprNom ;
   private String AV164UsurCod ;
   private String edtBarNHdr_Columnheaderclass ;
   private String edtBarNHdr_Columnclass ;
   private String GXt_char36 ;
   private String GXv_char37[] ;
   private String GXt_char34 ;
   private String GXv_char35[] ;
   private String GXt_char32 ;
   private String GXv_char33[] ;
   private String GXt_char30 ;
   private String GXv_char31[] ;
   private String GXt_char28 ;
   private String GXv_char29[] ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char19 ;
   private String GXv_char9[] ;
   private String GXt_char18 ;
   private String GXv_char8[] ;
   private String GXt_char17 ;
   private String GXv_char7[] ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
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
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV29Emprcod ;
   private String sCtrlAV30clicodfrom ;
   private String sCtrlAV31clicodto ;
   private String sCtrlAV32bardisnumfrom ;
   private String sCtrlAV33bardisnumto ;
   private String sCtrlAV34barfecgenfrom ;
   private String sCtrlAV35barfecgento ;
   private String sCtrlAV36barsitfrom ;
   private String sCtrlAV37barsitto ;
   private String sCtrlAV114BarFecClifrom ;
   private String sCtrlAV115BarFecClito ;
   private String sCtrlAV116BarFecFprfrom ;
   private String sCtrlAV117BarFecFprto ;
   private String sCtrlAV118BarFecSalfrom ;
   private String sCtrlAV119BarFecSalto ;
   private String sCtrlAV120BarSerfrom ;
   private String sCtrlAV121BarSerto ;
   private String sCtrlAV130BarTipArtfrom ;
   private String sCtrlAV131BarTipArtto ;
   private String sCtrlAV122BarColNomfrom ;
   private String sCtrlAV123BarColNomto ;
   private String sCtrlAV124BarColNumfrom ;
   private String sCtrlAV125BarColNumto ;
   private String sCtrlAV126BarNomClifrom ;
   private String sCtrlAV127BarNomClito ;
   private String sCtrlAV128BarNumClifrom ;
   private String sCtrlAV129BarNumClito ;
   private String sCtrlAV133Muestras ;
   private String sCtrlAV134BarCodfrom ;
   private String sCtrlAV139BarCodto ;
   private String sCtrlAV137BarCodReofrom ;
   private String sCtrlAV138BarCodReoto ;
   private String sCtrlAV135BarCodParfrom ;
   private String sCtrlAV136BarCodParto ;
   private String sCtrlAV155Cod_idtx ;
   private String sCtrlAV158BarGirar ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtavBaragrestwithtags_Jsonclick ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtavPedidocliente_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipArt_Jsonclick ;
   private String edtBarTipArtD_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarpie_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarFecFpr_Jsonclick ;
   private String edtBarFecSal_Jsonclick ;
   private String edtavBarfascod_Jsonclick ;
   private String edtBarFasSig_Jsonclick ;
   private String edtBarAlbUlti_Jsonclick ;
   private String edtBarAlbFact_Jsonclick ;
   private String edtavBaralbmts_Jsonclick ;
   private String edtavBaralbkgs_Jsonclick ;
   private String edtBarGirar_Jsonclick ;
   private String edtBarAcaAnh_Jsonclick ;
   private String edtavBarcuaderno_Jsonclick ;
   private String edtBarProPer_Jsonclick ;
   private String edtavBarproperidtx_Jsonclick ;
   private String edtBarNormas_Jsonclick ;
   private String edtDisUsrCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarExt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV34barfecgenfrom ;
   private java.util.Date wcpOAV35barfecgento ;
   private java.util.Date wcpOAV114BarFecClifrom ;
   private java.util.Date wcpOAV115BarFecClito ;
   private java.util.Date wcpOAV116BarFecFprfrom ;
   private java.util.Date wcpOAV117BarFecFprto ;
   private java.util.Date wcpOAV118BarFecSalfrom ;
   private java.util.Date wcpOAV119BarFecSalto ;
   private java.util.Date AV34barfecgenfrom ;
   private java.util.Date AV35barfecgento ;
   private java.util.Date AV114BarFecClifrom ;
   private java.util.Date AV115BarFecClito ;
   private java.util.Date AV116BarFecFprfrom ;
   private java.util.Date AV117BarFecFprto ;
   private java.util.Date AV118BarFecSalfrom ;
   private java.util.Date AV119BarFecSalto ;
   private java.util.Date AV72TFBarFecGen ;
   private java.util.Date AV76TFBarFecCli ;
   private java.util.Date AV80TFBarFecFpr ;
   private java.util.Date AV84TFBarFecSal ;
   private java.util.Date AV74DDO_BarFecGenAuxDate ;
   private java.util.Date AV78DDO_BarFecCliAuxDate ;
   private java.util.Date AV82DDO_BarFecFprAuxDate ;
   private java.util.Date AV86DDO_BarFecSalAuxDate ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV39OrderedDsc ;
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
   private boolean Popover_baragrest_Isgriditem ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n13711BarTipArtD ;
   private boolean n1955BarFasSig ;
   private boolean n2265BarExt ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV15ColumnsSelectorXML ;
   private String AV16UserCustomValue ;
   private String AV108TFBarNormas ;
   private String AV109TFBarNormas_Sel ;
   private String AV150BarAgrEstWithTags ;
   private String A13934BarNormas ;
   private String AV13ExcelFilename ;
   private String AV14ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucPopover_baragrest ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucPiezas_modal ;
   private com.genexus.webpanels.GXUserControl ucPackinglist_modal ;
   private com.genexus.webpanels.GXUserControl ucPartesproduccion_modal ;
   private com.genexus.webpanels.GXUserControl ucRecetas_modal ;
   private com.genexus.webpanels.GXUserControl ucConsultaalbaransalida_modal ;
   private com.genexus.webpanels.GXUserControl ucSituacionfases_modal ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGrupodeacciones ;
   private IDataStoreProvider pr_default ;
   private String[] H01KV7_A3030BarPlf ;
   private int[] H01KV7_A1235BarNumCli ;
   private byte[] H01KV7_A2265BarExt ;
   private boolean[] H01KV7_n2265BarExt ;
   private String[] H01KV7_A4348DisUsrCod ;
   private String[] H01KV7_A2829BarProPer ;
   private short[] H01KV7_A4466BarAcaAnh ;
   private String[] H01KV7_A2454BarGirar ;
   private java.util.Date[] H01KV7_A161BarFecSal ;
   private java.util.Date[] H01KV7_A158BarFecFpr ;
   private java.util.Date[] H01KV7_A155BarFecCli ;
   private java.util.Date[] H01KV7_A159BarFecGen ;
   private byte[] H01KV7_A213BarSit ;
   private String[] H01KV7_A1234BarNomCli ;
   private int[] H01KV7_A136BarColNum ;
   private String[] H01KV7_A135BarColNom ;
   private String[] H01KV7_A13711BarTipArtD ;
   private boolean[] H01KV7_n13711BarTipArtD ;
   private short[] H01KV7_A217BarTipArt ;
   private boolean[] H01KV7_n217BarTipArt ;
   private String[] H01KV7_A1652BarSerDsc ;
   private String[] H01KV7_A212BarSer ;
   private String[] H01KV7_A120BarAgrEst ;
   private String[] H01KV7_A279CliNom ;
   private int[] H01KV7_A252CliCod ;
   private boolean[] H01KV7_n252CliCod ;
   private java.math.BigDecimal[] H01KV7_A166BarKgm ;
   private java.math.BigDecimal[] H01KV7_A184BarMtr ;
   private String[] H01KV7_A1955BarFasSig ;
   private boolean[] H01KV7_n1955BarFasSig ;
   private String[] H01KV7_A130BarCodPar ;
   private byte[] H01KV7_A132BarCodReo ;
   private int[] H01KV7_A129BarCod ;
   private int[] H01KV7_A361DisCod ;
   private String[] H01KV7_A143BarDisNum ;
   private String[] H01KV7_A4812BarEncCli ;
   private String[] H01KV7_A396EmprCod ;
   private String[] H01KV13_A3030BarPlf ;
   private int[] H01KV13_A1235BarNumCli ;
   private byte[] H01KV13_A2265BarExt ;
   private boolean[] H01KV13_n2265BarExt ;
   private String[] H01KV13_A4348DisUsrCod ;
   private String[] H01KV13_A2829BarProPer ;
   private short[] H01KV13_A4466BarAcaAnh ;
   private String[] H01KV13_A2454BarGirar ;
   private java.util.Date[] H01KV13_A161BarFecSal ;
   private java.util.Date[] H01KV13_A158BarFecFpr ;
   private java.util.Date[] H01KV13_A155BarFecCli ;
   private java.util.Date[] H01KV13_A159BarFecGen ;
   private byte[] H01KV13_A213BarSit ;
   private String[] H01KV13_A1234BarNomCli ;
   private int[] H01KV13_A136BarColNum ;
   private String[] H01KV13_A135BarColNom ;
   private String[] H01KV13_A13711BarTipArtD ;
   private boolean[] H01KV13_n13711BarTipArtD ;
   private short[] H01KV13_A217BarTipArt ;
   private boolean[] H01KV13_n217BarTipArt ;
   private String[] H01KV13_A1652BarSerDsc ;
   private String[] H01KV13_A212BarSer ;
   private String[] H01KV13_A120BarAgrEst ;
   private String[] H01KV13_A279CliNom ;
   private int[] H01KV13_A252CliCod ;
   private boolean[] H01KV13_n252CliCod ;
   private java.math.BigDecimal[] H01KV13_A166BarKgm ;
   private java.math.BigDecimal[] H01KV13_A184BarMtr ;
   private String[] H01KV13_A1955BarFasSig ;
   private boolean[] H01KV13_n1955BarFasSig ;
   private String[] H01KV13_A130BarCodPar ;
   private byte[] H01KV13_A132BarCodReo ;
   private int[] H01KV13_A129BarCod ;
   private int[] H01KV13_A361DisCod ;
   private String[] H01KV13_A143BarDisNum ;
   private String[] H01KV13_A4812BarEncCli ;
   private String[] H01KV13_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV25DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState38[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext14[] ;
}

final  class consultadeproduccion_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01KV7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV41TFCliCod ,
                                          int AV42TFCliCod_To ,
                                          String AV44TFCliNom_Sel ,
                                          String AV43TFCliNom ,
                                          String AV24TFBarNHdr_Sel ,
                                          String AV23TFBarNHdr ,
                                          String AV71TFBarAgrEst_Sel ,
                                          String AV70TFBarAgrEst ,
                                          String AV48TFBarSer_Sel ,
                                          String AV47TFBarSer ,
                                          String AV50TFBarSerDsc_Sel ,
                                          String AV49TFBarSerDsc ,
                                          short AV104TFBarTipArt ,
                                          short AV105TFBarTipArt_To ,
                                          String AV107TFBarTipArtDsc_Sel ,
                                          String AV106TFBarTipArtDsc ,
                                          String AV52TFBarColNom_Sel ,
                                          String AV51TFBarColNom ,
                                          int AV53TFBarColNum ,
                                          int AV54TFBarColNum_To ,
                                          String AV56TFBarNomCli_Sel ,
                                          String AV55TFBarNomCli ,
                                          byte AV63TFBarSit ,
                                          byte AV64TFBarSit_To ,
                                          java.util.Date AV72TFBarFecGen ,
                                          java.util.Date AV76TFBarFecCli ,
                                          java.util.Date AV80TFBarFecFpr ,
                                          java.util.Date AV84TFBarFecSal ,
                                          String AV97TFBarGirar_Sel ,
                                          String AV96TFBarGirar ,
                                          short AV98TFBarAcaAnh ,
                                          short AV99TFBarAcaAnh_To ,
                                          String AV103TFBarProPer_Sel ,
                                          String AV102TFBarProPer ,
                                          String AV111TFDisUsrCod_Sel ,
                                          String AV110TFDisUsrCod ,
                                          int AV30clicodfrom ,
                                          int AV31clicodto ,
                                          java.util.Date AV34barfecgenfrom ,
                                          java.util.Date AV35barfecgento ,
                                          java.util.Date AV118BarFecSalfrom ,
                                          java.util.Date AV119BarFecSalto ,
                                          java.util.Date AV114BarFecClifrom ,
                                          java.util.Date AV115BarFecClito ,
                                          java.util.Date AV116BarFecFprfrom ,
                                          java.util.Date AV117BarFecFprto ,
                                          String AV120BarSerfrom ,
                                          String AV121BarSerto ,
                                          String AV122BarColNomfrom ,
                                          String AV123BarColNomto ,
                                          int AV124BarColNumfrom ,
                                          int AV125BarColNumto ,
                                          String AV126BarNomClifrom ,
                                          String AV127BarNomClito ,
                                          int AV128BarNumClifrom ,
                                          int AV129BarNumClito ,
                                          short AV130BarTipArtfrom ,
                                          short AV131BarTipArtto ,
                                          String AV133Muestras ,
                                          int AV134BarCodfrom ,
                                          int AV139BarCodto ,
                                          byte AV137BarCodReofrom ,
                                          byte AV138BarCodReoto ,
                                          String AV135BarCodParfrom ,
                                          String AV136BarCodParto ,
                                          String AV155Cod_idtx ,
                                          String AV158BarGirar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A120BarAgrEst ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A217BarTipArt ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          String A2454BarGirar ,
                                          short A4466BarAcaAnh ,
                                          String A2829BarProPer ,
                                          String A4348DisUsrCod ,
                                          int A1235BarNumCli ,
                                          String A3030BarPlf ,
                                          short AV38OrderedBy ,
                                          boolean AV39OrderedDsc ,
                                          String AV91TFBarFasSig_Sel ,
                                          String AV90TFBarFasSig ,
                                          String A1955BarFasSig ,
                                          long AV68TFBarAlbUltimo ,
                                          long A13930BarAlbUlti ,
                                          long AV69TFBarAlbUltimo_To ,
                                          int AV112TFBarAlbFact ,
                                          int A13935BarAlbFact ,
                                          int AV113TFBarAlbFact_To ,
                                          String AV109TFBarNormas_Sel ,
                                          String AV108TFBarNormas ,
                                          String A13934BarNormas ,
                                          String AV32bardisnumfrom ,
                                          String A13878PedidoClie ,
                                          String AV33bardisnumto ,
                                          byte AV36barsitfrom ,
                                          byte AV37barsitto ,
                                          String AV29Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int39 = new byte[75];
      Object[] GXv_Object40 = new Object[2];
      scmdbuf = "SELECT T1.BarPlf, T1.BarNumCli, T1.BarExt, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE(" ;
      scmdbuf += " T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarMtr, 0) AS BarMtr, COALESCE( T6.BarFasSig, ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T7.FasCod) AS BarFasSig, COALESCE( T8.BarFasLin, 0)" ;
      scmdbuf += " AS BarFasLin, T7.EmprCod, T7.BarCod, T7.BarCodReo, T7.BarCodPar FROM ((TXPBARFAS T7 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod = T7.EmprCod AND T8.BarCod = T7.BarCod AND T8.BarCodReo =" ;
      scmdbuf += " T7.BarCodReo AND T8.BarCodPar = T7.BarCodPar) INNER JOIN (SELECT MIN(T10.BarOrdLin) AS GXC1, COALESCE( T11.BarFasLin, 0) AS BarFasLin, T10.EmprCod, T10.BarCod," ;
      scmdbuf += " T10.BarCodReo, T10.BarCodPar FROM (TXPBARFAS T10 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar" ;
      scmdbuf += " = T10.BarCodPar) WHERE (T10.BarOrdLin >= 0) AND (T10.BarOrdLin > COALESCE( T11.BarFasLin, 0)) AND (T10.BarFasEst = 0) GROUP BY T11.BarFasLin, T10.EmprCod, T10.BarCod," ;
      scmdbuf += " T10.BarCodReo, T10.BarCodPar ) T9 ON T9.EmprCod = T7.EmprCod AND T9.BarCod = T7.BarCod AND T9.BarCodReo = T7.BarCodReo AND T9.BarCodPar = T7.BarCodPar) WHERE (T7.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T7.BarOrdLin >= 0) AND (T7.BarOrdLin > COALESCE( T8.BarFasLin, 0)) AND (T7.BarFasEst = 0) GROUP BY T8.BarFasLin, T7.EmprCod, T7.BarCod, T7.BarCodReo," ;
      scmdbuf += " T7.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV41TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int39[8] = (byte)(1) ;
      }
      if ( ! (0==AV42TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int39[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int39[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV24TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV23TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int39[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV70TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int39[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int39[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int39[19] = (byte)(1) ;
      }
      if ( ! (0==AV104TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int39[20] = (byte)(1) ;
      }
      if ( ! (0==AV105TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int39[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV106TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int39[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int39[25] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int39[26] = (byte)(1) ;
      }
      if ( ! (0==AV54TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int39[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV55TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int39[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int39[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int39[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int39[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int39[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int39[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int39[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV96TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int39[37] = (byte)(1) ;
      }
      if ( ! (0==AV98TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int39[38] = (byte)(1) ;
      }
      if ( ! (0==AV99TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int39[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV102TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int39[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV110TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int39[43] = (byte)(1) ;
      }
      if ( ! (0==AV30clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int39[44] = (byte)(1) ;
      }
      if ( ! (0==AV31clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int39[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int39[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int39[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV118BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int39[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int39[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int39[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115BarFecClito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int39[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int39[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int39[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int39[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int39[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int39[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int39[57] = (byte)(1) ;
      }
      if ( ! (0==AV124BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int39[58] = (byte)(1) ;
      }
      if ( ! (0==AV125BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int39[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int39[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int39[61] = (byte)(1) ;
      }
      if ( ! (0==AV128BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int39[62] = (byte)(1) ;
      }
      if ( ! (0==AV129BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int39[63] = (byte)(1) ;
      }
      if ( ! (0==AV130BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int39[64] = (byte)(1) ;
      }
      if ( ! (0==AV131BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int39[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int39[66] = (byte)(1) ;
      }
      if ( ! (0==AV134BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int39[67] = (byte)(1) ;
      }
      if ( ! (0==AV139BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int39[68] = (byte)(1) ;
      }
      if ( ! (0==AV137BarCodReofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int39[69] = (byte)(1) ;
      }
      if ( ! (0==AV138BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int39[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int39[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int39[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int39[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int39[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV38OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarFecGen" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr DESC" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV38OrderedBy == 17 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarGirar" ;
      }
      else if ( ( AV38OrderedBy == 17 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarGirar DESC" ;
      }
      else if ( ( AV38OrderedBy == 18 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAcaAnh" ;
      }
      else if ( ( AV38OrderedBy == 18 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAcaAnh DESC" ;
      }
      else if ( ( AV38OrderedBy == 19 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarProPer" ;
      }
      else if ( ( AV38OrderedBy == 19 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarProPer DESC" ;
      }
      else if ( ( AV38OrderedBy == 20 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DisUsrCod" ;
      }
      else if ( ( AV38OrderedBy == 20 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DisUsrCod DESC" ;
      }
      GXv_Object40[0] = scmdbuf ;
      GXv_Object40[1] = GXv_int39 ;
      return GXv_Object40 ;
   }

   protected Object[] conditional_H01KV13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV41TFCliCod ,
                                           int AV42TFCliCod_To ,
                                           String AV44TFCliNom_Sel ,
                                           String AV43TFCliNom ,
                                           String AV24TFBarNHdr_Sel ,
                                           String AV23TFBarNHdr ,
                                           String AV71TFBarAgrEst_Sel ,
                                           String AV70TFBarAgrEst ,
                                           String AV48TFBarSer_Sel ,
                                           String AV47TFBarSer ,
                                           String AV50TFBarSerDsc_Sel ,
                                           String AV49TFBarSerDsc ,
                                           short AV104TFBarTipArt ,
                                           short AV105TFBarTipArt_To ,
                                           String AV107TFBarTipArtDsc_Sel ,
                                           String AV106TFBarTipArtDsc ,
                                           String AV52TFBarColNom_Sel ,
                                           String AV51TFBarColNom ,
                                           int AV53TFBarColNum ,
                                           int AV54TFBarColNum_To ,
                                           String AV56TFBarNomCli_Sel ,
                                           String AV55TFBarNomCli ,
                                           byte AV63TFBarSit ,
                                           byte AV64TFBarSit_To ,
                                           java.util.Date AV72TFBarFecGen ,
                                           java.util.Date AV76TFBarFecCli ,
                                           java.util.Date AV80TFBarFecFpr ,
                                           java.util.Date AV84TFBarFecSal ,
                                           String AV97TFBarGirar_Sel ,
                                           String AV96TFBarGirar ,
                                           short AV98TFBarAcaAnh ,
                                           short AV99TFBarAcaAnh_To ,
                                           String AV103TFBarProPer_Sel ,
                                           String AV102TFBarProPer ,
                                           String AV111TFDisUsrCod_Sel ,
                                           String AV110TFDisUsrCod ,
                                           int AV30clicodfrom ,
                                           int AV31clicodto ,
                                           java.util.Date AV34barfecgenfrom ,
                                           java.util.Date AV35barfecgento ,
                                           java.util.Date AV118BarFecSalfrom ,
                                           java.util.Date AV119BarFecSalto ,
                                           java.util.Date AV114BarFecClifrom ,
                                           java.util.Date AV115BarFecClito ,
                                           java.util.Date AV116BarFecFprfrom ,
                                           java.util.Date AV117BarFecFprto ,
                                           String AV120BarSerfrom ,
                                           String AV121BarSerto ,
                                           String AV122BarColNomfrom ,
                                           String AV123BarColNomto ,
                                           int AV124BarColNumfrom ,
                                           int AV125BarColNumto ,
                                           String AV126BarNomClifrom ,
                                           String AV127BarNomClito ,
                                           int AV128BarNumClifrom ,
                                           int AV129BarNumClito ,
                                           short AV130BarTipArtfrom ,
                                           short AV131BarTipArtto ,
                                           String AV133Muestras ,
                                           int AV134BarCodfrom ,
                                           int AV139BarCodto ,
                                           byte AV137BarCodReofrom ,
                                           byte AV138BarCodReoto ,
                                           String AV135BarCodParfrom ,
                                           String AV136BarCodParto ,
                                           String AV155Cod_idtx ,
                                           String AV158BarGirar ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           String A2454BarGirar ,
                                           short A4466BarAcaAnh ,
                                           String A2829BarProPer ,
                                           String A4348DisUsrCod ,
                                           int A1235BarNumCli ,
                                           String A3030BarPlf ,
                                           short AV38OrderedBy ,
                                           boolean AV39OrderedDsc ,
                                           String AV91TFBarFasSig_Sel ,
                                           String AV90TFBarFasSig ,
                                           String A1955BarFasSig ,
                                           long AV68TFBarAlbUltimo ,
                                           long A13930BarAlbUlti ,
                                           long AV69TFBarAlbUltimo_To ,
                                           int AV112TFBarAlbFact ,
                                           int A13935BarAlbFact ,
                                           int AV113TFBarAlbFact_To ,
                                           String AV109TFBarNormas_Sel ,
                                           String AV108TFBarNormas ,
                                           String A13934BarNormas ,
                                           String AV32bardisnumfrom ,
                                           String A13878PedidoClie ,
                                           String AV33bardisnumto ,
                                           byte AV36barsitfrom ,
                                           byte AV37barsitto ,
                                           String AV29Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int41 = new byte[75];
      Object[] GXv_Object42 = new Object[2];
      scmdbuf = "SELECT T1.BarPlf, T1.BarNumCli, T1.BarExt, T2.DisUsrCod, T1.BarProPer, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, T4.CliNom, T1.CliCod, COALESCE(" ;
      scmdbuf += " T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarMtr, 0) AS BarMtr, COALESCE( T6.BarFasSig, ' ') AS BarFasSig, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T7.FasCod) AS BarFasSig, COALESCE( T8.BarFasLin, 0)" ;
      scmdbuf += " AS BarFasLin, T7.EmprCod, T7.BarCod, T7.BarCodReo, T7.BarCodPar FROM ((TXPBARFAS T7 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod = T7.EmprCod AND T8.BarCod = T7.BarCod AND T8.BarCodReo =" ;
      scmdbuf += " T7.BarCodReo AND T8.BarCodPar = T7.BarCodPar) INNER JOIN (SELECT MIN(T10.BarOrdLin) AS GXC1, COALESCE( T11.BarFasLin, 0) AS BarFasLin, T10.EmprCod, T10.BarCod," ;
      scmdbuf += " T10.BarCodReo, T10.BarCodPar FROM (TXPBARFAS T10 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar" ;
      scmdbuf += " = T10.BarCodPar) WHERE (T10.BarOrdLin >= 0) AND (T10.BarOrdLin > COALESCE( T11.BarFasLin, 0)) AND (T10.BarFasEst = 0) GROUP BY T11.BarFasLin, T10.EmprCod, T10.BarCod," ;
      scmdbuf += " T10.BarCodReo, T10.BarCodPar ) T9 ON T9.EmprCod = T7.EmprCod AND T9.BarCod = T7.BarCod AND T9.BarCodReo = T7.BarCodReo AND T9.BarCodPar = T7.BarCodPar) WHERE (T7.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T7.BarOrdLin >= 0) AND (T7.BarOrdLin > COALESCE( T8.BarFasLin, 0)) AND (T7.BarFasEst = 0) GROUP BY T8.BarFasLin, T7.EmprCod, T7.BarCod, T7.BarCodReo," ;
      scmdbuf += " T7.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV41TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int41[8] = (byte)(1) ;
      }
      if ( ! (0==AV42TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int41[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int41[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV24TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV23TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int41[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV70TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int41[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int41[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int41[19] = (byte)(1) ;
      }
      if ( ! (0==AV104TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int41[20] = (byte)(1) ;
      }
      if ( ! (0==AV105TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int41[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV106TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int41[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int41[25] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int41[26] = (byte)(1) ;
      }
      if ( ! (0==AV54TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int41[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV55TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int41[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int41[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int41[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int41[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int41[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80TFBarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int41[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int41[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV96TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int41[37] = (byte)(1) ;
      }
      if ( ! (0==AV98TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int41[38] = (byte)(1) ;
      }
      if ( ! (0==AV99TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int41[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV102TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int41[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV110TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int41[43] = (byte)(1) ;
      }
      if ( ! (0==AV30clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int41[44] = (byte)(1) ;
      }
      if ( ! (0==AV31clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int41[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int41[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int41[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV118BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int41[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int41[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int41[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115BarFecClito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int41[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int41[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int41[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int41[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int41[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int41[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int41[57] = (byte)(1) ;
      }
      if ( ! (0==AV124BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int41[58] = (byte)(1) ;
      }
      if ( ! (0==AV125BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int41[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int41[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int41[61] = (byte)(1) ;
      }
      if ( ! (0==AV128BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int41[62] = (byte)(1) ;
      }
      if ( ! (0==AV129BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int41[63] = (byte)(1) ;
      }
      if ( ! (0==AV130BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int41[64] = (byte)(1) ;
      }
      if ( ! (0==AV131BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int41[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Muestras)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int41[66] = (byte)(1) ;
      }
      if ( ! (0==AV134BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int41[67] = (byte)(1) ;
      }
      if ( ! (0==AV139BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int41[68] = (byte)(1) ;
      }
      if ( ! (0==AV137BarCodReofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int41[69] = (byte)(1) ;
      }
      if ( ! (0==AV138BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int41[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int41[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int41[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int41[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int41[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV38OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarFecGen" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr DESC" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV38OrderedBy == 17 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarGirar" ;
      }
      else if ( ( AV38OrderedBy == 17 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarGirar DESC" ;
      }
      else if ( ( AV38OrderedBy == 18 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAcaAnh" ;
      }
      else if ( ( AV38OrderedBy == 18 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAcaAnh DESC" ;
      }
      else if ( ( AV38OrderedBy == 19 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarProPer" ;
      }
      else if ( ( AV38OrderedBy == 19 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarProPer DESC" ;
      }
      else if ( ( AV38OrderedBy == 20 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DisUsrCod" ;
      }
      else if ( ( AV38OrderedBy == 20 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DisUsrCod DESC" ;
      }
      GXv_Object42[0] = scmdbuf ;
      GXv_Object42[1] = GXv_int41 ;
      return GXv_Object42 ;
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
                  return conditional_H01KV7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , ((Number) dynConstraints[91]).shortValue() , ((Boolean) dynConstraints[92]).booleanValue() , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).longValue() , ((Number) dynConstraints[98]).longValue() , ((Number) dynConstraints[99]).intValue() , ((Number) dynConstraints[100]).intValue() , ((Number) dynConstraints[101]).intValue() , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , (String)dynConstraints[106] , (String)dynConstraints[107] , ((Number) dynConstraints[108]).byteValue() , ((Number) dynConstraints[109]).byteValue() , (String)dynConstraints[110] , (String)dynConstraints[111] );
            case 1 :
                  return conditional_H01KV13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , ((Number) dynConstraints[78]).intValue() , (String)dynConstraints[79] , ((Number) dynConstraints[80]).byteValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).shortValue() , (String)dynConstraints[87] , (String)dynConstraints[88] , ((Number) dynConstraints[89]).intValue() , (String)dynConstraints[90] , ((Number) dynConstraints[91]).shortValue() , ((Boolean) dynConstraints[92]).booleanValue() , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , ((Number) dynConstraints[96]).longValue() , ((Number) dynConstraints[97]).longValue() , ((Number) dynConstraints[98]).longValue() , ((Number) dynConstraints[99]).intValue() , ((Number) dynConstraints[100]).intValue() , ((Number) dynConstraints[101]).intValue() , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , (String)dynConstraints[106] , (String)dynConstraints[107] , ((Number) dynConstraints[108]).byteValue() , ((Number) dynConstraints[109]).byteValue() , (String)dynConstraints[110] , (String)dynConstraints[111] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01KV7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01KV13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
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
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[28])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(26, 1);
               ((byte[]) buf[31])[0] = rslt.getByte(27);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 8);
               ((String[]) buf[35])[0] = rslt.getString(31, 20);
               ((String[]) buf[36])[0] = rslt.getString(32, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
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
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[28])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(26, 1);
               ((byte[]) buf[31])[0] = rslt.getByte(27);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 8);
               ((String[]) buf[35])[0] = rslt.getString(31, 20);
               ((String[]) buf[36])[0] = rslt.getString(32, 3);
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
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[95]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[96]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 1);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 4);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 20);
               }
               return;
      }
   }

}

