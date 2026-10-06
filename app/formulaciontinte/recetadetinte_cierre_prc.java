package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte_cierre_prc extends GXProcedure
{
   public recetadetinte_cierre_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_cierre_prc.class ), "" );
   }

   public recetadetinte_cierre_prc( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String aP6 )
   {
      recetadetinte_cierre_prc.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        String aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String aP6 ,
                             String[] aP7 )
   {
      recetadetinte_cierre_prc.this.AV14Emprcod = aP0;
      recetadetinte_cierre_prc.this.AV9BarcodIN = aP1;
      recetadetinte_cierre_prc.this.AV13BarcodreoIN = aP2;
      recetadetinte_cierre_prc.this.AV11BarcodparIN = aP3;
      recetadetinte_cierre_prc.this.AV41inicio = aP4;
      recetadetinte_cierre_prc.this.AV42fin = aP5;
      recetadetinte_cierre_prc.this.AV23RecAcab = aP6;
      recetadetinte_cierre_prc.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26RecetadeTinte_Cierre_SDT_json = "" ;
      AV24RecetadeTinte_Cierre_SDT.clear();
      GXt_int1 = (byte)(AV31colorservicecontador) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV14Emprcod, httpContext.getMessage( "CSTXP", ""), GXv_int2) ;
      recetadetinte_cierre_prc.this.GXt_int1 = GXv_int2[0] ;
      AV31colorservicecontador = GXt_int1 ;
      GXt_int3 = (int)(AV32colorserviceID) ;
      GXv_char4[0] = AV14Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "CSTXP", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      recetadetinte_cierre_prc.this.AV14Emprcod = GXv_char4[0] ;
      recetadetinte_cierre_prc.this.GXt_int3 = GXv_int6[0] ;
      AV32colorserviceID = GXt_int3 ;
      AV35Pagina = (short)(1) ;
      AV36TamanhoPagina = (short)(300) ;
      GXPagingFrom2 = (int)((AV35Pagina-1)*AV36TamanhoPagina) ;
      GXPagingTo2 = AV36TamanhoPagina ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV9BarcodIN) ,
                                           Byte.valueOf(AV13BarcodreoIN) ,
                                           AV11BarcodparIN ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A6039RecAcab ,
                                           A4866RecFecAlt ,
                                           AV41inicio ,
                                           AV42fin ,
                                           AV14Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AFO2 */
      pr_default.execute(0, new Object[] {AV14Emprcod, AV41inicio, AV42fin, Integer.valueOf(AV9BarcodIN), Byte.valueOf(AV13BarcodreoIN), AV11BarcodparIN, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4866RecFecAlt = P0AFO2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P0AFO2_n4866RecFecAlt[0] ;
         A6039RecAcab = P0AFO2_A6039RecAcab[0] ;
         n6039RecAcab = P0AFO2_n6039RecAcab[0] ;
         A4700RecEnvio = P0AFO2_A4700RecEnvio[0] ;
         A4654RecNroPar = P0AFO2_A4654RecNroPar[0] ;
         n4654RecNroPar = P0AFO2_n4654RecNroPar[0] ;
         A120BarAgrEst = P0AFO2_A120BarAgrEst[0] ;
         A135BarColNom = P0AFO2_A135BarColNom[0] ;
         A136BarColNum = P0AFO2_A136BarColNum[0] ;
         A1234BarNomCli = P0AFO2_A1234BarNomCli[0] ;
         A189BarNumAny = P0AFO2_A189BarNumAny[0] ;
         A1235BarNumCli = P0AFO2_A1235BarNumCli[0] ;
         A212BarSer = P0AFO2_A212BarSer[0] ;
         A1652BarSerDsc = P0AFO2_A1652BarSerDsc[0] ;
         A213BarSit = P0AFO2_A213BarSit[0] ;
         A218BarTipCol = P0AFO2_A218BarTipCol[0] ;
         A602MaqCod = P0AFO2_A602MaqCod[0] ;
         A2805RecVolPrd = P0AFO2_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P0AFO2_A2804RecLinMaq[0] ;
         A130BarCodPar = P0AFO2_A130BarCodPar[0] ;
         A132BarCodReo = P0AFO2_A132BarCodReo[0] ;
         A129BarCod = P0AFO2_A129BarCod[0] ;
         A396EmprCod = P0AFO2_A396EmprCod[0] ;
         A120BarAgrEst = P0AFO2_A120BarAgrEst[0] ;
         A135BarColNom = P0AFO2_A135BarColNom[0] ;
         A136BarColNum = P0AFO2_A136BarColNum[0] ;
         A1234BarNomCli = P0AFO2_A1234BarNomCli[0] ;
         A189BarNumAny = P0AFO2_A189BarNumAny[0] ;
         A1235BarNumCli = P0AFO2_A1235BarNumCli[0] ;
         A212BarSer = P0AFO2_A212BarSer[0] ;
         A1652BarSerDsc = P0AFO2_A1652BarSerDsc[0] ;
         A213BarSit = P0AFO2_A213BarSit[0] ;
         A218BarTipCol = P0AFO2_A218BarTipCol[0] ;
         GXt_char7 = A14372RecHayAny ;
         GXv_char5[0] = GXt_char7 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char5) ;
         recetadetinte_cierre_prc.this.GXt_char7 = GXv_char5[0] ;
         A14372RecHayAny = GXt_char7 ;
         GXv_int8[0] = AV34NInci ;
         new app.puti016(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_int8) ;
         recetadetinte_cierre_prc.this.AV34NInci = GXv_int8[0] ;
         GXv_decimal9[0] = AV27kilostot ;
         new app.pfrectotkgm(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal9) ;
         recetadetinte_cierre_prc.this.AV27kilostot = GXv_decimal9[0] ;
         AV8Barcod = A129BarCod ;
         AV12Barcodreo = A132BarCodReo ;
         AV10Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'LCONTI' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV20PesAut = "N" ;
         /* Using cursor P0AFO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4576RecLinUsr = P0AFO3_A4576RecLinUsr[0] ;
            A811RecLin = P0AFO3_A811RecLin[0] ;
            A1273RecLinPro = P0AFO3_A1273RecLinPro[0] ;
            AV19Lrecet = (short)(1) ;
            if ( GXutil.strcmp(A4576RecLinUsr, " ") != 0 )
            {
               AV20PesAut = "S" ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV28BatchCode = "" ;
         AV30WeigProdID = 0 ;
         AV29Colorservicedatos = (byte)(0) ;
         if ( AV31colorservicecontador == 1 )
         {
            AV28BatchCode = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) ;
            AV28BatchCode = GXutil.trim( AV28BatchCode) ;
            /* Execute user subroutine: 'SUBCOLORSERVICE' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV43RecNroPar = A4654RecNroPar ;
         AV25RecetadeTinte_Cierre_SDT_item = (app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)new app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item(remoteHandle, context);
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar( false );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion( "N" );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest( A120BarAgrEst );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod( A129BarCod );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo( A132BarCodReo );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar( A130BarCodPar );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom( A135BarColNom );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum( A136BarColNum );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli( A1234BarNomCli );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany( A189BarNumAny );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli( A1235BarNumCli );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser( A212BarSer );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc( A1652BarSerDsc );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit( A213BarSit );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol( A218BarTipCol );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti( (byte)(AV17Lconti) );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod( A602MaqCod );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado( AV20PesAut );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt( A4866RecFecAlt );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq( A2804RecLinMaq );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm( AV27kilostot );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd( A2805RecVolPrd );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias( AV34NInci );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode( AV28BatchCode );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid( AV30WeigProdID );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos( AV29Colorservicedatos );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar( AV43RecNroPar );
         AV25RecetadeTinte_Cierre_SDT_item.setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany( A14372RecHayAny );
         AV24RecetadeTinte_Cierre_SDT.add(AV25RecetadeTinte_Cierre_SDT_item, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV26RecetadeTinte_Cierre_SDT_json = AV24RecetadeTinte_Cierre_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LCONTI' Routine */
      returnInSub = false ;
      AV17Lconti = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P0AFO4 */
      pr_default.execute(2, new Object[] {AV14Emprcod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV12Barcodreo), AV10Barcodpar});
      cV17Lconti = P0AFO4_AV17Lconti[0] ;
      pr_default.close(2);
      AV17Lconti = (short)(AV17Lconti+cV17Lconti*1) ;
      /* End optimized group. */
      AV16Hisreh = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P0AFO5 */
      pr_default.execute(3, new Object[] {AV14Emprcod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV12Barcodreo), AV10Barcodpar});
      cV16Hisreh = P0AFO5_AV16Hisreh[0] ;
      pr_default.close(3);
      AV16Hisreh = (short)(AV16Hisreh+cV16Hisreh*1) ;
      /* End optimized group. */
   }

   public void S121( )
   {
      /* 'SUBCOLORSERVICE' Routine */
      returnInSub = false ;
      AV29Colorservicedatos = (byte)(0) ;
      AV30WeigProdID = 0 ;
      /* Using cursor P0AFO6 */
      pr_colorservice.execute(0, new Object[] {AV28BatchCode});
      while ( (pr_colorservice.getStatus(0) != 101) )
      {
         A13951WP_BatchCo = P0AFO6_A13951WP_BatchCo[0] ;
         A13948WP_ID = P0AFO6_A13948WP_ID[0] ;
         if ( A13948WP_ID > AV32colorserviceID )
         {
            AV29Colorservicedatos = (byte)(1) ;
            AV30WeigProdID = A13948WP_ID ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_colorservice.readNext(0);
      }
      pr_colorservice.close(0);
   }

   protected void cleanup( )
   {
      this.aP7[0] = recetadetinte_cierre_prc.this.AV26RecetadeTinte_Cierre_SDT_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26RecetadeTinte_Cierre_SDT_json = "" ;
      AV24RecetadeTinte_Cierre_SDT = new GXBaseCollection<app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item>(app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      A130BarCodPar = "" ;
      A6039RecAcab = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P0AFO2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFO2_n4866RecFecAlt = new boolean[] {false} ;
      P0AFO2_A6039RecAcab = new String[] {""} ;
      P0AFO2_n6039RecAcab = new boolean[] {false} ;
      P0AFO2_A4700RecEnvio = new byte[1] ;
      P0AFO2_A4654RecNroPar = new int[1] ;
      P0AFO2_n4654RecNroPar = new boolean[] {false} ;
      P0AFO2_A120BarAgrEst = new String[] {""} ;
      P0AFO2_A135BarColNom = new String[] {""} ;
      P0AFO2_A136BarColNum = new int[1] ;
      P0AFO2_A1234BarNomCli = new String[] {""} ;
      P0AFO2_A189BarNumAny = new short[1] ;
      P0AFO2_A1235BarNumCli = new int[1] ;
      P0AFO2_A212BarSer = new String[] {""} ;
      P0AFO2_A1652BarSerDsc = new String[] {""} ;
      P0AFO2_A213BarSit = new byte[1] ;
      P0AFO2_A218BarTipCol = new byte[1] ;
      P0AFO2_A602MaqCod = new String[] {""} ;
      P0AFO2_A2805RecVolPrd = new int[1] ;
      P0AFO2_A2804RecLinMaq = new short[1] ;
      P0AFO2_A130BarCodPar = new String[] {""} ;
      P0AFO2_A132BarCodReo = new byte[1] ;
      P0AFO2_A129BarCod = new int[1] ;
      P0AFO2_A396EmprCod = new String[] {""} ;
      A120BarAgrEst = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A602MaqCod = "" ;
      A14372RecHayAny = "" ;
      GXt_char7 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new short[1] ;
      AV27kilostot = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV10Barcodpar = "" ;
      AV20PesAut = "" ;
      P0AFO3_A396EmprCod = new String[] {""} ;
      P0AFO3_A129BarCod = new int[1] ;
      P0AFO3_A132BarCodReo = new byte[1] ;
      P0AFO3_A130BarCodPar = new String[] {""} ;
      P0AFO3_A2804RecLinMaq = new short[1] ;
      P0AFO3_A4576RecLinUsr = new String[] {""} ;
      P0AFO3_A811RecLin = new short[1] ;
      P0AFO3_A1273RecLinPro = new byte[1] ;
      A4576RecLinUsr = "" ;
      AV28BatchCode = "" ;
      AV25RecetadeTinte_Cierre_SDT_item = new app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item(remoteHandle, context);
      P0AFO4_AV17Lconti = new short[1] ;
      P0AFO5_AV16Hisreh = new short[1] ;
      P0AFO6_A13951WP_BatchCo = new String[] {""} ;
      P0AFO6_A13948WP_ID = new long[1] ;
      A13951WP_BatchCo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre_prc__default(),
         new Object[] {
             new Object[] {
            P0AFO2_A4866RecFecAlt, P0AFO2_n4866RecFecAlt, P0AFO2_A6039RecAcab, P0AFO2_n6039RecAcab, P0AFO2_A4700RecEnvio, P0AFO2_A4654RecNroPar, P0AFO2_n4654RecNroPar, P0AFO2_A120BarAgrEst, P0AFO2_A135BarColNom, P0AFO2_A136BarColNum,
            P0AFO2_A1234BarNomCli, P0AFO2_A189BarNumAny, P0AFO2_A1235BarNumCli, P0AFO2_A212BarSer, P0AFO2_A1652BarSerDsc, P0AFO2_A213BarSit, P0AFO2_A218BarTipCol, P0AFO2_A602MaqCod, P0AFO2_A2805RecVolPrd, P0AFO2_A2804RecLinMaq,
            P0AFO2_A130BarCodPar, P0AFO2_A132BarCodReo, P0AFO2_A129BarCod, P0AFO2_A396EmprCod
            }
            , new Object[] {
            P0AFO3_A396EmprCod, P0AFO3_A129BarCod, P0AFO3_A132BarCodReo, P0AFO3_A130BarCodPar, P0AFO3_A2804RecLinMaq, P0AFO3_A4576RecLinUsr, P0AFO3_A811RecLin, P0AFO3_A1273RecLinPro
            }
            , new Object[] {
            P0AFO4_AV17Lconti
            }
            , new Object[] {
            P0AFO5_AV16Hisreh
            }
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre_prc__colorservice(),
         new Object[] {
             new Object[] {
            P0AFO6_A13951WP_BatchCo, P0AFO6_A13948WP_ID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13BarcodreoIN ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A4700RecEnvio ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV12Barcodreo ;
   private byte A1273RecLinPro ;
   private byte AV29Colorservicedatos ;
   private short AV31colorservicecontador ;
   private short AV35Pagina ;
   private short AV36TamanhoPagina ;
   private short A189BarNumAny ;
   private short A2804RecLinMaq ;
   private short AV34NInci ;
   private short GXv_int8[] ;
   private short A811RecLin ;
   private short AV19Lrecet ;
   private short AV17Lconti ;
   private short cV17Lconti ;
   private short AV16Hisreh ;
   private short cV16Hisreh ;
   private short Gx_err ;
   private int AV9BarcodIN ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A129BarCod ;
   private int A4654RecNroPar ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int AV8Barcod ;
   private int AV43RecNroPar ;
   private long AV32colorserviceID ;
   private long AV30WeigProdID ;
   private long A13948WP_ID ;
   private java.math.BigDecimal AV27kilostot ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String AV14Emprcod ;
   private String AV11BarcodparIN ;
   private String AV23RecAcab ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A6039RecAcab ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A602MaqCod ;
   private String A14372RecHayAny ;
   private String GXt_char7 ;
   private String GXv_char5[] ;
   private String AV10Barcodpar ;
   private String AV20PesAut ;
   private String A4576RecLinUsr ;
   private String AV28BatchCode ;
   private java.util.Date AV41inicio ;
   private java.util.Date AV42fin ;
   private java.util.Date A4866RecFecAlt ;
   private boolean n4866RecFecAlt ;
   private boolean n6039RecAcab ;
   private boolean n4654RecNroPar ;
   private boolean returnInSub ;
   private String AV26RecetadeTinte_Cierre_SDT_json ;
   private String A13951WP_BatchCo ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0AFO2_A4866RecFecAlt ;
   private boolean[] P0AFO2_n4866RecFecAlt ;
   private String[] P0AFO2_A6039RecAcab ;
   private boolean[] P0AFO2_n6039RecAcab ;
   private byte[] P0AFO2_A4700RecEnvio ;
   private int[] P0AFO2_A4654RecNroPar ;
   private boolean[] P0AFO2_n4654RecNroPar ;
   private String[] P0AFO2_A120BarAgrEst ;
   private String[] P0AFO2_A135BarColNom ;
   private int[] P0AFO2_A136BarColNum ;
   private String[] P0AFO2_A1234BarNomCli ;
   private short[] P0AFO2_A189BarNumAny ;
   private int[] P0AFO2_A1235BarNumCli ;
   private String[] P0AFO2_A212BarSer ;
   private String[] P0AFO2_A1652BarSerDsc ;
   private byte[] P0AFO2_A213BarSit ;
   private byte[] P0AFO2_A218BarTipCol ;
   private String[] P0AFO2_A602MaqCod ;
   private int[] P0AFO2_A2805RecVolPrd ;
   private short[] P0AFO2_A2804RecLinMaq ;
   private String[] P0AFO2_A130BarCodPar ;
   private byte[] P0AFO2_A132BarCodReo ;
   private int[] P0AFO2_A129BarCod ;
   private String[] P0AFO2_A396EmprCod ;
   private String[] P0AFO3_A396EmprCod ;
   private int[] P0AFO3_A129BarCod ;
   private byte[] P0AFO3_A132BarCodReo ;
   private String[] P0AFO3_A130BarCodPar ;
   private short[] P0AFO3_A2804RecLinMaq ;
   private String[] P0AFO3_A4576RecLinUsr ;
   private short[] P0AFO3_A811RecLin ;
   private byte[] P0AFO3_A1273RecLinPro ;
   private short[] P0AFO4_AV17Lconti ;
   private short[] P0AFO5_AV16Hisreh ;
   private IDataStoreProvider pr_colorservice ;
   private String[] P0AFO6_A13951WP_BatchCo ;
   private long[] P0AFO6_A13948WP_ID ;
   private GXBaseCollection<app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item> AV24RecetadeTinte_Cierre_SDT ;
   private app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item AV25RecetadeTinte_Cierre_SDT_item ;
}

final  class recetadetinte_cierre_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AFO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV9BarcodIN ,
                                          byte AV13BarcodreoIN ,
                                          String AV11BarcodparIN ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A6039RecAcab ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date AV41inicio ,
                                          java.util.Date AV42fin ,
                                          String AV14Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[9];
      Object[] GXv_Object11 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.RecFecAlt, T1.RecAcab, T1.RecEnvio, T1.RecNroPar, T2.BarAgrEst, T2.BarColNom, T2.BarColNum, T2.BarNomCli, T2.BarNumAny, T2.BarNumCli, T2.BarSer, T2.BarSerDsc," ;
      sSelectString += " T2.BarSit, T2.BarTipCol, T1.MaqCod, T1.RecVolPrd, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecEnvio > 0)");
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      addWhere(sWhereString, "(T1.RecFecAlt < ?)");
      if ( ! (0==AV9BarcodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV13BarcodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11BarcodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      sOrderString += " ORDER BY T1.EmprCod, T1.RecEnvio" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P0AFO2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFO3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinUsr, RecLin, RecLinPro FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFO4", "SELECT COUNT(*) FROM TXPLCONTI WHERE (EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ?) AND (BarRecAcb <> 'S') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFO5", "SELECT COUNT(*) FROM TXPHISREH WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?) AND (HreRacab <> 'S') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((short[]) buf[19])[0] = rslt.getShort(17);
               ((String[]) buf[20])[0] = rslt.getString(18, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((int[]) buf[22])[0] = rslt.getInt(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[10], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

final  class recetadetinte_cierre_prc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFO6", "SELECT [BatchCode], [id] FROM [TXPWeightProduct] WITH (NOLOCK) WHERE [BatchCode] = ? ORDER BY [BatchCode] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               stmt.setString(1, (String)parms[0], 20);
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

