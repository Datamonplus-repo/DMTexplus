package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc162 extends GXProcedure
{
   public pprc162( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc162.class ), "" );
   }

   public pprc162( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           short[] aP4 ,
                                           String[] aP5 ,
                                           String[] aP6 ,
                                           String[] aP7 ,
                                           String[] aP8 ,
                                           String[] aP9 ,
                                           int[] aP10 ,
                                           int[] aP11 ,
                                           byte[] aP12 ,
                                           String[] aP13 ,
                                           short[] aP14 ,
                                           short[] aP15 ,
                                           String[] aP16 ,
                                           java.math.BigDecimal[] aP17 )
   {
      pprc162.this.aP18 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        int[] aP11 ,
                        byte[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        String[] aP16 ,
                        java.math.BigDecimal[] aP17 ,
                        java.math.BigDecimal[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             int[] aP11 ,
                             byte[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             String[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 )
   {
      pprc162.this.AV21EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc162.this.AV22HisBarCod = aP1[0];
      this.aP1 = aP1;
      pprc162.this.AV23HisCodReo = aP2[0];
      this.aP2 = aP2;
      pprc162.this.AV24HisCodPar = aP3[0];
      this.aP3 = aP3;
      pprc162.this.AV8CodCausa = aP4[0];
      this.aP4 = aP4;
      pprc162.this.AV9HisAcCo = aP5[0];
      this.aP5 = aP5;
      pprc162.this.AV10HisAcCot = aP6[0];
      this.aP6 = aP6;
      pprc162.this.AV11HisAdEAcCo = aP7[0];
      this.aP7 = aP7;
      pprc162.this.AV12HisAdEAcCt = aP8[0];
      this.aP8 = aP8;
      pprc162.this.AV13HisAdeObs = aP9[0];
      this.aP9 = aP9;
      pprc162.this.AV14HisOpecod = aP10[0];
      this.aP10 = aP10;
      pprc162.this.AV15Hisoperar = aP11[0];
      this.aP11 = aP11;
      pprc162.this.AV16Hisopetur = aP12[0];
      this.aP12 = aP12;
      pprc162.this.AV17MaqCod = aP13[0];
      this.aP13 = aP13;
      pprc162.this.AV18Rps_Cod = aP14[0];
      this.aP14 = aP14;
      pprc162.this.AV19TipDefCod = aP15[0];
      this.aP15 = aP15;
      pprc162.this.AV20HisAdeSN = aP16[0];
      this.aP16 = aP16;
      pprc162.this.AV25HisMtsCargo = aP17[0];
      this.aP17 = aP17;
      pprc162.this.AV26HisMtsImp = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05OE2 */
      pr_default.execute(0, new Object[] {AV21EmprCod, Integer.valueOf(AV22HisBarCod), Byte.valueOf(AV23HisCodReo), AV24HisCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13016HisMtsImp = P05OE2_A13016HisMtsImp[0] ;
         n13016HisMtsImp = P05OE2_n13016HisMtsImp[0] ;
         A13015HisMtsCarg = P05OE2_A13015HisMtsCarg[0] ;
         n13015HisMtsCarg = P05OE2_n13015HisMtsCarg[0] ;
         A12950HisOpeTur = P05OE2_A12950HisOpeTur[0] ;
         n12950HisOpeTur = P05OE2_n12950HisOpeTur[0] ;
         A12949HisOpecod = P05OE2_A12949HisOpecod[0] ;
         n12949HisOpecod = P05OE2_n12949HisOpecod[0] ;
         A7000Rps_Cod = P05OE2_A7000Rps_Cod[0] ;
         n7000Rps_Cod = P05OE2_n7000Rps_Cod[0] ;
         A6669HisAdeObs = P05OE2_A6669HisAdeObs[0] ;
         n6669HisAdeObs = P05OE2_n6669HisAdeObs[0] ;
         A6668HisAdeSN = P05OE2_A6668HisAdeSN[0] ;
         n6668HisAdeSN = P05OE2_n6668HisAdeSN[0] ;
         A5695HisAdEAcCt = P05OE2_A5695HisAdEAcCt[0] ;
         n5695HisAdEAcCt = P05OE2_n5695HisAdEAcCt[0] ;
         A5694HisAdEAcCo = P05OE2_A5694HisAdEAcCo[0] ;
         n5694HisAdEAcCo = P05OE2_n5694HisAdEAcCo[0] ;
         A5693HisAcCot = P05OE2_A5693HisAcCot[0] ;
         n5693HisAcCot = P05OE2_n5693HisAcCot[0] ;
         A5662HisAcCo = P05OE2_A5662HisAcCo[0] ;
         n5662HisAcCo = P05OE2_n5662HisAcCo[0] ;
         A5356Hisoperar = P05OE2_A5356Hisoperar[0] ;
         n5356Hisoperar = P05OE2_n5356Hisoperar[0] ;
         A5085CodCausa = P05OE2_A5085CodCausa[0] ;
         n5085CodCausa = P05OE2_n5085CodCausa[0] ;
         A2298HisReoPza = P05OE2_A2298HisReoPza[0] ;
         n2298HisReoPza = P05OE2_n2298HisReoPza[0] ;
         A602MaqCod = P05OE2_A602MaqCod[0] ;
         n602MaqCod = P05OE2_n602MaqCod[0] ;
         A833TipDefCod = P05OE2_A833TipDefCod[0] ;
         A544HisCodPar = P05OE2_A544HisCodPar[0] ;
         A545HisCodReo = P05OE2_A545HisCodReo[0] ;
         A539HisBarCod = P05OE2_A539HisBarCod[0] ;
         A396EmprCod = P05OE2_A396EmprCod[0] ;
         A13698HisreoLote = P05OE2_A13698HisreoLote[0] ;
         n13698HisreoLote = P05OE2_n13698HisreoLote[0] ;
         A8890HisNumCli = P05OE2_A8890HisNumCli[0] ;
         n8890HisNumCli = P05OE2_n8890HisNumCli[0] ;
         A8889HisNomCli = P05OE2_A8889HisNomCli[0] ;
         n8889HisNomCli = P05OE2_n8889HisNomCli[0] ;
         A8567HisHorReo = P05OE2_A8567HisHorReo[0] ;
         n8567HisHorReo = P05OE2_n8567HisHorReo[0] ;
         A8414HisUsu = P05OE2_A8414HisUsu[0] ;
         n8414HisUsu = P05OE2_n8414HisUsu[0] ;
         A5196TipCorCod = P05OE2_A5196TipCorCod[0] ;
         n5196TipCorCod = P05OE2_n5196TipCorCod[0] ;
         A2299HisReoDsc = P05OE2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P05OE2_n2299HisReoDsc[0] ;
         A2297HisReoTn = P05OE2_A2297HisReoTn[0] ;
         n2297HisReoTn = P05OE2_n2297HisReoTn[0] ;
         A548HisEstReo = P05OE2_A548HisEstReo[0] ;
         n548HisEstReo = P05OE2_n548HisEstReo[0] ;
         A554HisOrdReo = P05OE2_A554HisOrdReo[0] ;
         n554HisOrdReo = P05OE2_n554HisOrdReo[0] ;
         A552HisMtrOri = P05OE2_A552HisMtrOri[0] ;
         n552HisMtrOri = P05OE2_n552HisMtrOri[0] ;
         A549HisKgmOri = P05OE2_A549HisKgmOri[0] ;
         n549HisKgmOri = P05OE2_n549HisKgmOri[0] ;
         A569HisReoFec = P05OE2_A569HisReoFec[0] ;
         n569HisReoFec = P05OE2_n569HisReoFec[0] ;
         A541HisBarMtr = P05OE2_A541HisBarMtr[0] ;
         n541HisBarMtr = P05OE2_n541HisBarMtr[0] ;
         A540HisBarKgm = P05OE2_A540HisBarKgm[0] ;
         n540HisBarKgm = P05OE2_n540HisBarKgm[0] ;
         A553HisNumPie = P05OE2_A553HisNumPie[0] ;
         n553HisNumPie = P05OE2_n553HisNumPie[0] ;
         A572HisTipCol = P05OE2_A572HisTipCol[0] ;
         n572HisTipCol = P05OE2_n572HisTipCol[0] ;
         A547HisColNum = P05OE2_A547HisColNum[0] ;
         n547HisColNum = P05OE2_n547HisColNum[0] ;
         A546HisColNom = P05OE2_A546HisColNom[0] ;
         n546HisColNom = P05OE2_n546HisColNom[0] ;
         A542HisBarSer = P05OE2_A542HisBarSer[0] ;
         n542HisBarSer = P05OE2_n542HisBarSer[0] ;
         A252CliCod = P05OE2_A252CliCod[0] ;
         n252CliCod = P05OE2_n252CliCod[0] ;
         A571HisTipArt = P05OE2_A571HisTipArt[0] ;
         n571HisTipArt = P05OE2_n571HisTipArt[0] ;
         W396EmprCod = A396EmprCod ;
         W539HisBarCod = A539HisBarCod ;
         W545HisCodReo = A545HisCodReo ;
         W544HisCodPar = A544HisCodPar ;
         /*
            INSERT RECORD ON TABLE TXPHISREO

         */
         W396EmprCod = A396EmprCod ;
         W539HisBarCod = A539HisBarCod ;
         W545HisCodReo = A545HisCodReo ;
         W544HisCodPar = A544HisCodPar ;
         W833TipDefCod = A833TipDefCod ;
         W5085CodCausa = A5085CodCausa ;
         n5085CodCausa = false ;
         W7000Rps_Cod = A7000Rps_Cod ;
         n7000Rps_Cod = false ;
         W5662HisAcCo = A5662HisAcCo ;
         n5662HisAcCo = false ;
         W5693HisAcCot = A5693HisAcCot ;
         n5693HisAcCot = false ;
         W5694HisAdEAcCo = A5694HisAdEAcCo ;
         n5694HisAdEAcCo = false ;
         W5695HisAdEAcCt = A5695HisAdEAcCt ;
         n5695HisAdEAcCt = false ;
         W6669HisAdeObs = A6669HisAdeObs ;
         n6669HisAdeObs = false ;
         W12949HisOpecod = A12949HisOpecod ;
         n12949HisOpecod = false ;
         W5356Hisoperar = A5356Hisoperar ;
         n5356Hisoperar = false ;
         W12950HisOpeTur = A12950HisOpeTur ;
         n12950HisOpeTur = false ;
         W602MaqCod = A602MaqCod ;
         n602MaqCod = false ;
         W6668HisAdeSN = A6668HisAdeSN ;
         n6668HisAdeSN = false ;
         W2298HisReoPza = A2298HisReoPza ;
         n2298HisReoPza = false ;
         W13015HisMtsCarg = A13015HisMtsCarg ;
         n13015HisMtsCarg = false ;
         W13016HisMtsImp = A13016HisMtsImp ;
         n13016HisMtsImp = false ;
         A396EmprCod = "999" ;
         A539HisBarCod = AV22HisBarCod ;
         A545HisCodReo = AV23HisCodReo ;
         A544HisCodPar = AV24HisCodPar ;
         A833TipDefCod = AV19TipDefCod ;
         A5085CodCausa = AV8CodCausa ;
         n5085CodCausa = false ;
         A7000Rps_Cod = AV18Rps_Cod ;
         n7000Rps_Cod = false ;
         A5662HisAcCo = AV9HisAcCo ;
         n5662HisAcCo = false ;
         A5693HisAcCot = AV10HisAcCot ;
         n5693HisAcCot = false ;
         A5694HisAdEAcCo = AV11HisAdEAcCo ;
         n5694HisAdEAcCo = false ;
         A5695HisAdEAcCt = AV12HisAdEAcCt ;
         n5695HisAdEAcCt = false ;
         A6669HisAdeObs = AV13HisAdeObs ;
         n6669HisAdeObs = false ;
         A12949HisOpecod = AV14HisOpecod ;
         n12949HisOpecod = false ;
         A5356Hisoperar = AV15Hisoperar ;
         n5356Hisoperar = false ;
         A12950HisOpeTur = AV16Hisopetur ;
         n12950HisOpeTur = false ;
         A602MaqCod = AV17MaqCod ;
         n602MaqCod = false ;
         A6668HisAdeSN = AV20HisAdeSN ;
         n6668HisAdeSN = false ;
         A2298HisReoPza = httpContext.getMessage( "INS", "") ;
         n2298HisReoPza = false ;
         A13015HisMtsCarg = AV25HisMtsCargo ;
         n13015HisMtsCarg = false ;
         A13016HisMtsImp = AV26HisMtsImp ;
         n13016HisMtsImp = false ;
         /* Using cursor P05OE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Short.valueOf(A833TipDefCod), Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n552HisMtrOri), A552HisMtrOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo), Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn), Boolean.valueOf(n2298HisReoPza), A2298HisReoPza, Boolean.valueOf(n2299HisReoDsc), A2299HisReoDsc, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), Boolean.valueOf(n5356Hisoperar), Integer.valueOf(A5356Hisoperar), Boolean.valueOf(n5196TipCorCod), Short.valueOf(A5196TipCorCod), Boolean.valueOf(n5662HisAcCo), A5662HisAcCo, Boolean.valueOf(n5693HisAcCot), A5693HisAcCot, Boolean.valueOf(n5694HisAdEAcCo), A5694HisAdEAcCo, Boolean.valueOf(n5695HisAdEAcCt), A5695HisAdEAcCt, Boolean.valueOf(n6668HisAdeSN), A6668HisAdeSN, Boolean.valueOf(n6669HisAdeObs), A6669HisAdeObs, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod), Boolean.valueOf(n8414HisUsu), A8414HisUsu, Boolean.valueOf(n8567HisHorReo), A8567HisHorReo, Boolean.valueOf(n8889HisNomCli), A8889HisNomCli, Boolean.valueOf(n8890HisNumCli), Integer.valueOf(A8890HisNumCli), Boolean.valueOf(n12949HisOpecod), Integer.valueOf(A12949HisOpecod), Boolean.valueOf(n12950HisOpeTur), Byte.valueOf(A12950HisOpeTur), Boolean.valueOf(n13015HisMtsCarg), A13015HisMtsCarg, Boolean.valueOf(n13016HisMtsImp), A13016HisMtsImp, Boolean.valueOf(n13698HisreoLote), A13698HisreoLote});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A539HisBarCod = W539HisBarCod ;
         A545HisCodReo = W545HisCodReo ;
         A544HisCodPar = W544HisCodPar ;
         A833TipDefCod = W833TipDefCod ;
         A5085CodCausa = W5085CodCausa ;
         n5085CodCausa = false ;
         A7000Rps_Cod = W7000Rps_Cod ;
         n7000Rps_Cod = false ;
         A5662HisAcCo = W5662HisAcCo ;
         n5662HisAcCo = false ;
         A5693HisAcCot = W5693HisAcCot ;
         n5693HisAcCot = false ;
         A5694HisAdEAcCo = W5694HisAdEAcCo ;
         n5694HisAdEAcCo = false ;
         A5695HisAdEAcCt = W5695HisAdEAcCt ;
         n5695HisAdEAcCt = false ;
         A6669HisAdeObs = W6669HisAdeObs ;
         n6669HisAdeObs = false ;
         A12949HisOpecod = W12949HisOpecod ;
         n12949HisOpecod = false ;
         A5356Hisoperar = W5356Hisoperar ;
         n5356Hisoperar = false ;
         A12950HisOpeTur = W12950HisOpeTur ;
         n12950HisOpeTur = false ;
         A602MaqCod = W602MaqCod ;
         n602MaqCod = false ;
         A6668HisAdeSN = W6668HisAdeSN ;
         n6668HisAdeSN = false ;
         A2298HisReoPza = W2298HisReoPza ;
         n2298HisReoPza = false ;
         A13015HisMtsCarg = W13015HisMtsCarg ;
         n13015HisMtsCarg = false ;
         A13016HisMtsImp = W13016HisMtsImp ;
         n13016HisMtsImp = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A539HisBarCod = W539HisBarCod ;
         A545HisCodReo = W545HisCodReo ;
         A544HisCodPar = W544HisCodPar ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc162.this.AV21EmprCod;
      this.aP1[0] = pprc162.this.AV22HisBarCod;
      this.aP2[0] = pprc162.this.AV23HisCodReo;
      this.aP3[0] = pprc162.this.AV24HisCodPar;
      this.aP4[0] = pprc162.this.AV8CodCausa;
      this.aP5[0] = pprc162.this.AV9HisAcCo;
      this.aP6[0] = pprc162.this.AV10HisAcCot;
      this.aP7[0] = pprc162.this.AV11HisAdEAcCo;
      this.aP8[0] = pprc162.this.AV12HisAdEAcCt;
      this.aP9[0] = pprc162.this.AV13HisAdeObs;
      this.aP10[0] = pprc162.this.AV14HisOpecod;
      this.aP11[0] = pprc162.this.AV15Hisoperar;
      this.aP12[0] = pprc162.this.AV16Hisopetur;
      this.aP13[0] = pprc162.this.AV17MaqCod;
      this.aP14[0] = pprc162.this.AV18Rps_Cod;
      this.aP15[0] = pprc162.this.AV19TipDefCod;
      this.aP16[0] = pprc162.this.AV20HisAdeSN;
      this.aP17[0] = pprc162.this.AV25HisMtsCargo;
      this.aP18[0] = pprc162.this.AV26HisMtsImp;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc162");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05OE2_A13016HisMtsImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OE2_n13016HisMtsImp = new boolean[] {false} ;
      P05OE2_A13015HisMtsCarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OE2_n13015HisMtsCarg = new boolean[] {false} ;
      P05OE2_A12950HisOpeTur = new byte[1] ;
      P05OE2_n12950HisOpeTur = new boolean[] {false} ;
      P05OE2_A12949HisOpecod = new int[1] ;
      P05OE2_n12949HisOpecod = new boolean[] {false} ;
      P05OE2_A7000Rps_Cod = new short[1] ;
      P05OE2_n7000Rps_Cod = new boolean[] {false} ;
      P05OE2_A6669HisAdeObs = new String[] {""} ;
      P05OE2_n6669HisAdeObs = new boolean[] {false} ;
      P05OE2_A6668HisAdeSN = new String[] {""} ;
      P05OE2_n6668HisAdeSN = new boolean[] {false} ;
      P05OE2_A5695HisAdEAcCt = new String[] {""} ;
      P05OE2_n5695HisAdEAcCt = new boolean[] {false} ;
      P05OE2_A5694HisAdEAcCo = new String[] {""} ;
      P05OE2_n5694HisAdEAcCo = new boolean[] {false} ;
      P05OE2_A5693HisAcCot = new String[] {""} ;
      P05OE2_n5693HisAcCot = new boolean[] {false} ;
      P05OE2_A5662HisAcCo = new String[] {""} ;
      P05OE2_n5662HisAcCo = new boolean[] {false} ;
      P05OE2_A5356Hisoperar = new int[1] ;
      P05OE2_n5356Hisoperar = new boolean[] {false} ;
      P05OE2_A5085CodCausa = new short[1] ;
      P05OE2_n5085CodCausa = new boolean[] {false} ;
      P05OE2_A2298HisReoPza = new String[] {""} ;
      P05OE2_n2298HisReoPza = new boolean[] {false} ;
      P05OE2_A602MaqCod = new String[] {""} ;
      P05OE2_n602MaqCod = new boolean[] {false} ;
      P05OE2_A833TipDefCod = new short[1] ;
      P05OE2_A544HisCodPar = new String[] {""} ;
      P05OE2_A545HisCodReo = new byte[1] ;
      P05OE2_A539HisBarCod = new int[1] ;
      P05OE2_A396EmprCod = new String[] {""} ;
      P05OE2_A13698HisreoLote = new String[] {""} ;
      P05OE2_n13698HisreoLote = new boolean[] {false} ;
      P05OE2_A8890HisNumCli = new int[1] ;
      P05OE2_n8890HisNumCli = new boolean[] {false} ;
      P05OE2_A8889HisNomCli = new String[] {""} ;
      P05OE2_n8889HisNomCli = new boolean[] {false} ;
      P05OE2_A8567HisHorReo = new java.util.Date[] {GXutil.nullDate()} ;
      P05OE2_n8567HisHorReo = new boolean[] {false} ;
      P05OE2_A8414HisUsu = new String[] {""} ;
      P05OE2_n8414HisUsu = new boolean[] {false} ;
      P05OE2_A5196TipCorCod = new short[1] ;
      P05OE2_n5196TipCorCod = new boolean[] {false} ;
      P05OE2_A2299HisReoDsc = new String[] {""} ;
      P05OE2_n2299HisReoDsc = new boolean[] {false} ;
      P05OE2_A2297HisReoTn = new int[1] ;
      P05OE2_n2297HisReoTn = new boolean[] {false} ;
      P05OE2_A548HisEstReo = new byte[1] ;
      P05OE2_n548HisEstReo = new boolean[] {false} ;
      P05OE2_A554HisOrdReo = new byte[1] ;
      P05OE2_n554HisOrdReo = new boolean[] {false} ;
      P05OE2_A552HisMtrOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OE2_n552HisMtrOri = new boolean[] {false} ;
      P05OE2_A549HisKgmOri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OE2_n549HisKgmOri = new boolean[] {false} ;
      P05OE2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05OE2_n569HisReoFec = new boolean[] {false} ;
      P05OE2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OE2_n541HisBarMtr = new boolean[] {false} ;
      P05OE2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OE2_n540HisBarKgm = new boolean[] {false} ;
      P05OE2_A553HisNumPie = new short[1] ;
      P05OE2_n553HisNumPie = new boolean[] {false} ;
      P05OE2_A572HisTipCol = new byte[1] ;
      P05OE2_n572HisTipCol = new boolean[] {false} ;
      P05OE2_A547HisColNum = new int[1] ;
      P05OE2_n547HisColNum = new boolean[] {false} ;
      P05OE2_A546HisColNom = new String[] {""} ;
      P05OE2_n546HisColNom = new boolean[] {false} ;
      P05OE2_A542HisBarSer = new String[] {""} ;
      P05OE2_n542HisBarSer = new boolean[] {false} ;
      P05OE2_A252CliCod = new int[1] ;
      P05OE2_n252CliCod = new boolean[] {false} ;
      P05OE2_A571HisTipArt = new short[1] ;
      P05OE2_n571HisTipArt = new boolean[] {false} ;
      A13016HisMtsImp = DecimalUtil.ZERO ;
      A13015HisMtsCarg = DecimalUtil.ZERO ;
      A6669HisAdeObs = "" ;
      A6668HisAdeSN = "" ;
      A5695HisAdEAcCt = "" ;
      A5694HisAdEAcCo = "" ;
      A5693HisAcCot = "" ;
      A5662HisAcCo = "" ;
      A2298HisReoPza = "" ;
      A602MaqCod = "" ;
      A544HisCodPar = "" ;
      A396EmprCod = "" ;
      A13698HisreoLote = "" ;
      A8889HisNomCli = "" ;
      A8567HisHorReo = GXutil.resetTime( GXutil.nullDate() );
      A8414HisUsu = "" ;
      A2299HisReoDsc = "" ;
      A552HisMtrOri = DecimalUtil.ZERO ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      A569HisReoFec = GXutil.nullDate() ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A546HisColNom = "" ;
      A542HisBarSer = "" ;
      W396EmprCod = "" ;
      W544HisCodPar = "" ;
      W5662HisAcCo = "" ;
      W5693HisAcCot = "" ;
      W5694HisAdEAcCo = "" ;
      W5695HisAdEAcCt = "" ;
      W6669HisAdeObs = "" ;
      W602MaqCod = "" ;
      W6668HisAdeSN = "" ;
      W2298HisReoPza = "" ;
      W13015HisMtsCarg = DecimalUtil.ZERO ;
      W13016HisMtsImp = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc162__default(),
         new Object[] {
             new Object[] {
            P05OE2_A13016HisMtsImp, P05OE2_n13016HisMtsImp, P05OE2_A13015HisMtsCarg, P05OE2_n13015HisMtsCarg, P05OE2_A12950HisOpeTur, P05OE2_n12950HisOpeTur, P05OE2_A12949HisOpecod, P05OE2_n12949HisOpecod, P05OE2_A7000Rps_Cod, P05OE2_n7000Rps_Cod,
            P05OE2_A6669HisAdeObs, P05OE2_n6669HisAdeObs, P05OE2_A6668HisAdeSN, P05OE2_n6668HisAdeSN, P05OE2_A5695HisAdEAcCt, P05OE2_n5695HisAdEAcCt, P05OE2_A5694HisAdEAcCo, P05OE2_n5694HisAdEAcCo, P05OE2_A5693HisAcCot, P05OE2_n5693HisAcCot,
            P05OE2_A5662HisAcCo, P05OE2_n5662HisAcCo, P05OE2_A5356Hisoperar, P05OE2_n5356Hisoperar, P05OE2_A5085CodCausa, P05OE2_n5085CodCausa, P05OE2_A2298HisReoPza, P05OE2_n2298HisReoPza, P05OE2_A602MaqCod, P05OE2_n602MaqCod,
            P05OE2_A833TipDefCod, P05OE2_A544HisCodPar, P05OE2_A545HisCodReo, P05OE2_A539HisBarCod, P05OE2_A396EmprCod, P05OE2_A13698HisreoLote, P05OE2_n13698HisreoLote, P05OE2_A8890HisNumCli, P05OE2_n8890HisNumCli, P05OE2_A8889HisNomCli,
            P05OE2_n8889HisNomCli, P05OE2_A8567HisHorReo, P05OE2_n8567HisHorReo, P05OE2_A8414HisUsu, P05OE2_n8414HisUsu, P05OE2_A5196TipCorCod, P05OE2_n5196TipCorCod, P05OE2_A2299HisReoDsc, P05OE2_n2299HisReoDsc, P05OE2_A2297HisReoTn,
            P05OE2_n2297HisReoTn, P05OE2_A548HisEstReo, P05OE2_n548HisEstReo, P05OE2_A554HisOrdReo, P05OE2_n554HisOrdReo, P05OE2_A552HisMtrOri, P05OE2_n552HisMtrOri, P05OE2_A549HisKgmOri, P05OE2_n549HisKgmOri, P05OE2_A569HisReoFec,
            P05OE2_n569HisReoFec, P05OE2_A541HisBarMtr, P05OE2_n541HisBarMtr, P05OE2_A540HisBarKgm, P05OE2_n540HisBarKgm, P05OE2_A553HisNumPie, P05OE2_n553HisNumPie, P05OE2_A572HisTipCol, P05OE2_n572HisTipCol, P05OE2_A547HisColNum,
            P05OE2_n547HisColNum, P05OE2_A546HisColNom, P05OE2_n546HisColNom, P05OE2_A542HisBarSer, P05OE2_n542HisBarSer, P05OE2_A252CliCod, P05OE2_n252CliCod, P05OE2_A571HisTipArt, P05OE2_n571HisTipArt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23HisCodReo ;
   private byte AV16Hisopetur ;
   private byte A12950HisOpeTur ;
   private byte A545HisCodReo ;
   private byte A548HisEstReo ;
   private byte A554HisOrdReo ;
   private byte A572HisTipCol ;
   private byte W545HisCodReo ;
   private byte W12950HisOpeTur ;
   private short AV8CodCausa ;
   private short AV18Rps_Cod ;
   private short AV19TipDefCod ;
   private short A7000Rps_Cod ;
   private short A5085CodCausa ;
   private short A833TipDefCod ;
   private short A5196TipCorCod ;
   private short A553HisNumPie ;
   private short A571HisTipArt ;
   private short W833TipDefCod ;
   private short W5085CodCausa ;
   private short W7000Rps_Cod ;
   private short Gx_err ;
   private int AV22HisBarCod ;
   private int AV14HisOpecod ;
   private int AV15Hisoperar ;
   private int A12949HisOpecod ;
   private int A5356Hisoperar ;
   private int A539HisBarCod ;
   private int A8890HisNumCli ;
   private int A2297HisReoTn ;
   private int A547HisColNum ;
   private int A252CliCod ;
   private int W539HisBarCod ;
   private int GX_INS60 ;
   private int W12949HisOpecod ;
   private int W5356Hisoperar ;
   private java.math.BigDecimal AV25HisMtsCargo ;
   private java.math.BigDecimal AV26HisMtsImp ;
   private java.math.BigDecimal A13016HisMtsImp ;
   private java.math.BigDecimal A13015HisMtsCarg ;
   private java.math.BigDecimal A552HisMtrOri ;
   private java.math.BigDecimal A549HisKgmOri ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal W13015HisMtsCarg ;
   private java.math.BigDecimal W13016HisMtsImp ;
   private String AV21EmprCod ;
   private String AV24HisCodPar ;
   private String AV17MaqCod ;
   private String AV20HisAdeSN ;
   private String scmdbuf ;
   private String A6668HisAdeSN ;
   private String A2298HisReoPza ;
   private String A602MaqCod ;
   private String A544HisCodPar ;
   private String A396EmprCod ;
   private String A13698HisreoLote ;
   private String A8889HisNomCli ;
   private String A8414HisUsu ;
   private String A2299HisReoDsc ;
   private String A546HisColNom ;
   private String A542HisBarSer ;
   private String W396EmprCod ;
   private String W544HisCodPar ;
   private String W602MaqCod ;
   private String W6668HisAdeSN ;
   private String W2298HisReoPza ;
   private String Gx_emsg ;
   private java.util.Date A8567HisHorReo ;
   private java.util.Date A569HisReoFec ;
   private boolean n13016HisMtsImp ;
   private boolean n13015HisMtsCarg ;
   private boolean n12950HisOpeTur ;
   private boolean n12949HisOpecod ;
   private boolean n7000Rps_Cod ;
   private boolean n6669HisAdeObs ;
   private boolean n6668HisAdeSN ;
   private boolean n5695HisAdEAcCt ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5662HisAcCo ;
   private boolean n5356Hisoperar ;
   private boolean n5085CodCausa ;
   private boolean n2298HisReoPza ;
   private boolean n602MaqCod ;
   private boolean n13698HisreoLote ;
   private boolean n8890HisNumCli ;
   private boolean n8889HisNomCli ;
   private boolean n8567HisHorReo ;
   private boolean n8414HisUsu ;
   private boolean n5196TipCorCod ;
   private boolean n2299HisReoDsc ;
   private boolean n2297HisReoTn ;
   private boolean n548HisEstReo ;
   private boolean n554HisOrdReo ;
   private boolean n552HisMtrOri ;
   private boolean n549HisKgmOri ;
   private boolean n569HisReoFec ;
   private boolean n541HisBarMtr ;
   private boolean n540HisBarKgm ;
   private boolean n553HisNumPie ;
   private boolean n572HisTipCol ;
   private boolean n547HisColNum ;
   private boolean n546HisColNom ;
   private boolean n542HisBarSer ;
   private boolean n252CliCod ;
   private boolean n571HisTipArt ;
   private String AV9HisAcCo ;
   private String AV10HisAcCot ;
   private String AV11HisAdEAcCo ;
   private String AV12HisAdEAcCt ;
   private String AV13HisAdeObs ;
   private String A6669HisAdeObs ;
   private String A5695HisAdEAcCt ;
   private String A5694HisAdEAcCo ;
   private String A5693HisAcCot ;
   private String A5662HisAcCo ;
   private String W5662HisAcCo ;
   private String W5693HisAcCot ;
   private String W5694HisAdEAcCo ;
   private String W5695HisAdEAcCt ;
   private String W6669HisAdeObs ;
   private java.math.BigDecimal[] aP18 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private int[] aP11 ;
   private byte[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private String[] aP16 ;
   private java.math.BigDecimal[] aP17 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P05OE2_A13016HisMtsImp ;
   private boolean[] P05OE2_n13016HisMtsImp ;
   private java.math.BigDecimal[] P05OE2_A13015HisMtsCarg ;
   private boolean[] P05OE2_n13015HisMtsCarg ;
   private byte[] P05OE2_A12950HisOpeTur ;
   private boolean[] P05OE2_n12950HisOpeTur ;
   private int[] P05OE2_A12949HisOpecod ;
   private boolean[] P05OE2_n12949HisOpecod ;
   private short[] P05OE2_A7000Rps_Cod ;
   private boolean[] P05OE2_n7000Rps_Cod ;
   private String[] P05OE2_A6669HisAdeObs ;
   private boolean[] P05OE2_n6669HisAdeObs ;
   private String[] P05OE2_A6668HisAdeSN ;
   private boolean[] P05OE2_n6668HisAdeSN ;
   private String[] P05OE2_A5695HisAdEAcCt ;
   private boolean[] P05OE2_n5695HisAdEAcCt ;
   private String[] P05OE2_A5694HisAdEAcCo ;
   private boolean[] P05OE2_n5694HisAdEAcCo ;
   private String[] P05OE2_A5693HisAcCot ;
   private boolean[] P05OE2_n5693HisAcCot ;
   private String[] P05OE2_A5662HisAcCo ;
   private boolean[] P05OE2_n5662HisAcCo ;
   private int[] P05OE2_A5356Hisoperar ;
   private boolean[] P05OE2_n5356Hisoperar ;
   private short[] P05OE2_A5085CodCausa ;
   private boolean[] P05OE2_n5085CodCausa ;
   private String[] P05OE2_A2298HisReoPza ;
   private boolean[] P05OE2_n2298HisReoPza ;
   private String[] P05OE2_A602MaqCod ;
   private boolean[] P05OE2_n602MaqCod ;
   private short[] P05OE2_A833TipDefCod ;
   private String[] P05OE2_A544HisCodPar ;
   private byte[] P05OE2_A545HisCodReo ;
   private int[] P05OE2_A539HisBarCod ;
   private String[] P05OE2_A396EmprCod ;
   private String[] P05OE2_A13698HisreoLote ;
   private boolean[] P05OE2_n13698HisreoLote ;
   private int[] P05OE2_A8890HisNumCli ;
   private boolean[] P05OE2_n8890HisNumCli ;
   private String[] P05OE2_A8889HisNomCli ;
   private boolean[] P05OE2_n8889HisNomCli ;
   private java.util.Date[] P05OE2_A8567HisHorReo ;
   private boolean[] P05OE2_n8567HisHorReo ;
   private String[] P05OE2_A8414HisUsu ;
   private boolean[] P05OE2_n8414HisUsu ;
   private short[] P05OE2_A5196TipCorCod ;
   private boolean[] P05OE2_n5196TipCorCod ;
   private String[] P05OE2_A2299HisReoDsc ;
   private boolean[] P05OE2_n2299HisReoDsc ;
   private int[] P05OE2_A2297HisReoTn ;
   private boolean[] P05OE2_n2297HisReoTn ;
   private byte[] P05OE2_A548HisEstReo ;
   private boolean[] P05OE2_n548HisEstReo ;
   private byte[] P05OE2_A554HisOrdReo ;
   private boolean[] P05OE2_n554HisOrdReo ;
   private java.math.BigDecimal[] P05OE2_A552HisMtrOri ;
   private boolean[] P05OE2_n552HisMtrOri ;
   private java.math.BigDecimal[] P05OE2_A549HisKgmOri ;
   private boolean[] P05OE2_n549HisKgmOri ;
   private java.util.Date[] P05OE2_A569HisReoFec ;
   private boolean[] P05OE2_n569HisReoFec ;
   private java.math.BigDecimal[] P05OE2_A541HisBarMtr ;
   private boolean[] P05OE2_n541HisBarMtr ;
   private java.math.BigDecimal[] P05OE2_A540HisBarKgm ;
   private boolean[] P05OE2_n540HisBarKgm ;
   private short[] P05OE2_A553HisNumPie ;
   private boolean[] P05OE2_n553HisNumPie ;
   private byte[] P05OE2_A572HisTipCol ;
   private boolean[] P05OE2_n572HisTipCol ;
   private int[] P05OE2_A547HisColNum ;
   private boolean[] P05OE2_n547HisColNum ;
   private String[] P05OE2_A546HisColNom ;
   private boolean[] P05OE2_n546HisColNom ;
   private String[] P05OE2_A542HisBarSer ;
   private boolean[] P05OE2_n542HisBarSer ;
   private int[] P05OE2_A252CliCod ;
   private boolean[] P05OE2_n252CliCod ;
   private short[] P05OE2_A571HisTipArt ;
   private boolean[] P05OE2_n571HisTipArt ;
}

final  class pprc162__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05OE2", "SELECT HisMtsImp, HisMtsCarg, HisOpeTur, HisOpecod, Rps_Cod, HisAdeObs, HisAdeSN, HisAdEAcCt, HisAdEAcCo, HisAcCot, HisAcCo, Hisoperar, CodCausa, HisReoPza, MaqCod, TipDefCod, HisCodPar, HisCodReo, HisBarCod, EmprCod, HisreoLote, HisNumCli, HisNomCli, HisHorReo, HisUsu, TipCorCod, HisReoDsc, HisReoTn, HisEstReo, HisOrdReo, HisMtrOri, HisKgmOri, HisReoFec, HisBarMtr, HisBarKgm, HisNumPie, HisTipCol, HisColNum, HisColNom, HisBarSer, CliCod, HisTipArt FROM TXPHISREO WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ? ORDER BY EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05OE3", "INSERT INTO TXPHISREO(EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisTipArt, CliCod, HisBarSer, HisColNom, HisColNum, HisTipCol, HisNumPie, HisBarKgm, HisBarMtr, MaqCod, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoPza, HisReoDsc, CodCausa, Hisoperar, TipCorCod, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, Rps_Cod, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 9);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(16);
               ((String[]) buf[31])[0] = rslt.getString(17, 1);
               ((byte[]) buf[32])[0] = rslt.getByte(18);
               ((int[]) buf[33])[0] = rslt.getInt(19);
               ((String[]) buf[34])[0] = rslt.getString(20, 3);
               ((String[]) buf[35])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[41])[0] = GXutil.resetDate(rslt.getGXDateTime(24));
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(28);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(29);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(33);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((byte[]) buf[67])[0] = rslt.getByte(37);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((int[]) buf[69])[0] = rslt.getInt(38);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(39, 13);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 16);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((int[]) buf[75])[0] = rslt.getInt(41);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((short[]) buf[77])[0] = rslt.getShort(42);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 6);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[26]);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[34]).byteValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[38], 9);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[40], 26);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[44]).intValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[48], 3276);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[50], 2000);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[52], 2000);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[54], 2000);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[58], 2000);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[60]).shortValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[62], 8);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(35, (java.util.Date)parms[64], true);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[66], 13);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[68]).intValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(38, ((Number) parms[70]).intValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(39, ((Number) parms[72]).byteValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[78], 20);
               }
               return;
      }
   }

}

