package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcamkil extends GXProcedure
{
   public pcamkil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcamkil.class ), "" );
   }

   public pcamkil( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 )
   {
      pcamkil.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 )
   {
      pcamkil.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcamkil.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pcamkil.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcamkil.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcamkil.this.AV18Kilos = aP4[0];
      this.aP4 = aP4;
      pcamkil.this.AV19Piezas = aP5[0];
      this.aP5 = aP5;
      pcamkil.this.AV20CliCod = aP6[0];
      this.aP6 = aP6;
      pcamkil.this.AV21Locali = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV32FlagJM = (byte)(0) ;
      GXv_int1[0] = AV32FlagJM ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JMOLTO", ""), GXv_int1) ;
      pcamkil.this.AV32FlagJM = GXv_int1[0] ;
      AV37FlagBros = (byte)(0) ;
      GXv_int1[0] = AV37FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int1) ;
      pcamkil.this.AV37FlagBros = GXv_int1[0] ;
      AV39Pervaf = (byte)(0) ;
      GXv_int1[0] = AV39Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      pcamkil.this.AV39Pervaf = GXv_int1[0] ;
      /* Using cursor P009R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar, A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P009R2_A252CliCod[0] ;
         n252CliCod = P009R2_n252CliCod[0] ;
         A130BarCodPar = P009R2_A130BarCodPar[0] ;
         A132BarCodReo = P009R2_A132BarCodReo[0] ;
         A129BarCod = P009R2_A129BarCod[0] ;
         A1878BarNumTen = P009R2_A1878BarNumTen[0] ;
         A1499BarNMez = P009R2_A1499BarNMez[0] ;
         A1500BarNMtr = P009R2_A1500BarNMtr[0] ;
         A143BarDisNum = P009R2_A143BarDisNum[0] ;
         A155BarFecCli = P009R2_A155BarFecCli[0] ;
         A135BarColNom = P009R2_A135BarColNom[0] ;
         A136BarColNum = P009R2_A136BarColNum[0] ;
         A1234BarNomCli = P009R2_A1234BarNomCli[0] ;
         A1235BarNumCli = P009R2_A1235BarNumCli[0] ;
         A361DisCod = P009R2_A361DisCod[0] ;
         A1003BarFecLan = P009R2_A1003BarFecLan[0] ;
         n1003BarFecLan = P009R2_n1003BarFecLan[0] ;
         A4937BarCtrPdas = P009R2_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = P009R2_n4937BarCtrPdas[0] ;
         A212BarSer = P009R2_A212BarSer[0] ;
         /* Using cursor P009R3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A1002DisNumTen = P009R3_A1002DisNumTen[0] ;
         n1002DisNumTen = P009R3_n1002DisNumTen[0] ;
         A999DisNMez = P009R3_A999DisNMez[0] ;
         A998DisNMtr = P009R3_A998DisNMtr[0] ;
         A360DisCliNum = P009R3_A360DisCliNum[0] ;
         A370DisFecCli = P009R3_A370DisFecCli[0] ;
         A362DisColNom = P009R3_A362DisColNom[0] ;
         n362DisColNom = P009R3_n362DisColNom[0] ;
         A363DisColNum = P009R3_A363DisColNum[0] ;
         n363DisColNum = P009R3_n363DisColNum[0] ;
         A1195DisNomCli = P009R3_A1195DisNomCli[0] ;
         A1196DisNumCli = P009R3_A1196DisNumCli[0] ;
         A966PartCod = P009R3_A966PartCod[0] ;
         n966PartCod = P009R3_n966PartCod[0] ;
         A2403DisOpeAnt = P009R3_A2403DisOpeAnt[0] ;
         n2403DisOpeAnt = P009R3_n2403DisOpeAnt[0] ;
         A2402DisManCod = P009R3_A2402DisManCod[0] ;
         /* Using cursor P009R4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = P009R4_A279CliNom[0] ;
         A1002DisNumTen = A1878BarNumTen ;
         n1002DisNumTen = false ;
         A999DisNMez = A1499BarNMez ;
         A998DisNMtr = A1500BarNMtr ;
         A360DisCliNum = A143BarDisNum ;
         A370DisFecCli = A155BarFecCli ;
         A362DisColNom = A135BarColNom ;
         n362DisColNom = false ;
         A363DisColNum = A136BarColNum ;
         n363DisColNum = false ;
         A1195DisNomCli = A1234BarNomCli ;
         A1196DisNumCli = A1235BarNumCli ;
         AV38BarNumTen = A1878BarNumTen ;
         AV29DisColNom = A362DisColNom ;
         AV30DisColnum = A363DisColNum ;
         AV31DisCliNum = A360DisCliNum ;
         AV38BarNumTen = A1878BarNumTen ;
         AV25DisCod = A361DisCod ;
         AV24PartCod = A966PartCod ;
         AV26Flag = (byte)(0) ;
         /* Using cursor P009R5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A200BarPieCod = P009R5_A200BarPieCod[0] ;
            A130BarCodPar = P009R5_A130BarCodPar[0] ;
            A132BarCodReo = P009R5_A132BarCodReo[0] ;
            A129BarCod = P009R5_A129BarCod[0] ;
            A203BarPieKil = P009R5_A203BarPieKil[0] ;
            A1501BarPiePie = P009R5_A1501BarPiePie[0] ;
            if ( GXutil.strcmp(A200BarPieCod, httpContext.getMessage( "NO PIEZA", "")) == 0 )
            {
               AV22KilAct = A203BarPieKil ;
               AV23PieAct = A1501BarPiePie ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( ! (0==A2403DisOpeAnt) )
         {
            /* Using cursor P009R6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar, A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A200BarPieCod = P009R6_A200BarPieCod[0] ;
               A130BarCodPar = P009R6_A130BarCodPar[0] ;
               A132BarCodReo = P009R6_A132BarCodReo[0] ;
               A129BarCod = P009R6_A129BarCod[0] ;
               A203BarPieKil = P009R6_A203BarPieKil[0] ;
               A1501BarPiePie = P009R6_A1501BarPiePie[0] ;
               if ( GXutil.strcmp(A200BarPieCod, httpContext.getMessage( "NO PIEZA", "")) == 0 )
               {
                  /* Using cursor P009R7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  A361DisCod = P009R7_A361DisCod[0] ;
                  /* Using cursor P009R8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  A375DisNumUni = P009R8_A375DisNumUni[0] ;
                  A374DisNumPie = P009R8_A374DisNumPie[0] ;
                  AV22KilAct = A203BarPieKil ;
                  AV23PieAct = A1501BarPiePie ;
                  A203BarPieKil = AV18Kilos ;
                  A1501BarPiePie = AV19Piezas ;
                  A375DisNumUni = AV18Kilos ;
                  A374DisNumPie = (short)(AV19Piezas) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  /* Using cursor P009R9 */
                  pr_default.execute(7, new Object[] {A375DisNumUni, Short.valueOf(A374DisNumPie), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  /* Using cursor P009R10 */
                  pr_default.execute(8, new Object[] {A203BarPieKil, Integer.valueOf(A1501BarPiePie), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if (true) break;
                  /* Using cursor P009R11 */
                  pr_default.execute(9, new Object[] {A375DisNumUni, Short.valueOf(A374DisNumPie), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  /* Using cursor P009R12 */
                  pr_default.execute(10, new Object[] {A203BarPieKil, Integer.valueOf(A1501BarPiePie), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            pr_default.close(5);
            pr_default.close(6);
            AV35DisOpeAnt = A2403DisOpeAnt ;
            AV36DisManCod = A2402DisManCod ;
            /* Execute user subroutine: 'OPEANT' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            /* Execute user subroutine: 'PARTIDO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( (0==A2403DisOpeAnt) )
         {
            if ( AV26Flag == 1 )
            {
               /* Using cursor P009R13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
               while ( (pr_default.getStatus(11) != 101) )
               {
                  A200BarPieCod = P009R13_A200BarPieCod[0] ;
                  A130BarCodPar = P009R13_A130BarCodPar[0] ;
                  A132BarCodReo = P009R13_A132BarCodReo[0] ;
                  A129BarCod = P009R13_A129BarCod[0] ;
                  A203BarPieKil = P009R13_A203BarPieKil[0] ;
                  A1501BarPiePie = P009R13_A1501BarPiePie[0] ;
                  if ( GXutil.strcmp(A200BarPieCod, httpContext.getMessage( "NO PIEZA", "")) == 0 )
                  {
                     O375DisNumUni = A375DisNumUni ;
                     O374DisNumPie = A374DisNumPie ;
                     AV22KilAct = A203BarPieKil ;
                     AV23PieAct = A1501BarPiePie ;
                     A203BarPieKil = AV18Kilos ;
                     A1501BarPiePie = AV19Piezas ;
                     A375DisNumUni = A375DisNumUni.subtract(AV22KilAct).add(AV18Kilos) ;
                     A374DisNumPie = (short)(A374DisNumPie-AV23PieAct+AV19Piezas) ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     /* Using cursor P009R14 */
                     pr_default.execute(12, new Object[] {A203BarPieKil, Integer.valueOf(A1501BarPiePie), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                     if (true) break;
                     /* Using cursor P009R15 */
                     pr_default.execute(13, new Object[] {A203BarPieKil, Integer.valueOf(A1501BarPiePie), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  }
                  pr_default.readNext(11);
               }
               pr_default.close(11);
            }
            else
            {
               if ( AV26Flag == 0 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Partido Inexistente", ""));
               }
               else
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION. Stock Insuficiente en el Partido Actual", ""));
               }
            }
         }
         if ( ( AV39Pervaf == 1 ) && ( AV26Flag == 1 ) && ( ( DecimalUtil.compareTo(AV22KilAct, AV18Kilos) != 0 ) || ( AV23PieAct != AV19Piezas ) ) )
         {
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A1003BarFecLan)) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION HDR PLANIFICADA EN UBICACION", ""));
               AV46UbiKil = AV18Kilos.subtract(AV22KilAct) ;
               AV47UbiCon = (short)(AV19Piezas-AV23PieAct) ;
               GXv_char2[0] = A396EmprCod ;
               GXv_char3[0] = AV24PartCod ;
               GXv_int4[0] = AV20CliCod ;
               GXv_int5[0] = AV15BarCod ;
               GXv_date6[0] = A1003BarFecLan ;
               GXv_char7[0] = "999" ;
               GXv_char8[0] = httpContext.getMessage( "PT", "") ;
               GXv_char9[0] = httpContext.getMessage( "N", "") ;
               GXv_decimal10[0] = AV46UbiKil ;
               GXv_int11[0] = AV47UbiCon ;
               GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int13[0] = (short)(0) ;
               GXv_char14[0] = "" ;
               new app.pubiplt(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_date6, GXv_char7, GXv_char8, GXv_char9, GXv_decimal10, GXv_int11, GXv_decimal12, GXv_int13, GXv_char14) ;
               pcamkil.this.A396EmprCod = GXv_char2[0] ;
               pcamkil.this.AV24PartCod = GXv_char3[0] ;
               pcamkil.this.AV20CliCod = GXv_int4[0] ;
               pcamkil.this.AV15BarCod = GXv_int5[0] ;
               pcamkil.this.A1003BarFecLan = GXv_date6[0] ;
               pcamkil.this.AV46UbiKil = GXv_decimal10[0] ;
               pcamkil.this.AV47UbiCon = GXv_int11[0] ;
            }
            if ( A4937BarCtrPdas == 1 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION. HDR CON UBICACION CONFIRMADA", ""));
               AV40CliNom = A279CliNom ;
               AV41BarSer = A212BarSer ;
               AV42BarColNom = A135BarColNom ;
               AV43BarColNum = A136BarColNum ;
            }
         }
         /* Using cursor P009R16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n1002DisNumTen), A1002DisNumTen, A999DisNMez, A998DisNMtr, A360DisCliNum, A370DisFecCli, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), A1195DisNomCli, Integer.valueOf(A1196DisNumCli), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'PARTIDO' Routine */
      returnInSub = false ;
      /* Using cursor P009R18 */
      pr_default.execute(15, new Object[] {A396EmprCod, AV24PartCod, Integer.valueOf(AV20CliCod)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A252CliCod = P009R18_A252CliCod[0] ;
         n252CliCod = P009R18_n252CliCod[0] ;
         A966PartCod = P009R18_A966PartCod[0] ;
         n966PartCod = P009R18_n966PartCod[0] ;
         A975PartKilUti = P009R18_A975PartKilUti[0] ;
         A973PartKilEnt = P009R18_A973PartKilEnt[0] ;
         A975PartKilUti = P009R18_A975PartKilUti[0] ;
         A973PartKilEnt = P009R18_A973PartKilEnt[0] ;
         A977PartKilSal = A973PartKilEnt.subtract(A975PartKilUti) ;
         AV28PartKilSal = A977PartKilSal ;
         /* Using cursor P009R19 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(AV25DisCod)});
         while ( (pr_default.getStatus(16) != 101) )
         {
            A980PartLinTip = P009R19_A980PartLinTip[0] ;
            n980PartLinTip = P009R19_n980PartLinTip[0] ;
            A981PartAlbDis = P009R19_A981PartAlbDis[0] ;
            n981PartAlbDis = P009R19_n981PartAlbDis[0] ;
            A982PartSitDis = P009R19_A982PartSitDis[0] ;
            n982PartSitDis = P009R19_n982PartSitDis[0] ;
            A2246ParNumCli = P009R19_A2246ParNumCli[0] ;
            n2246ParNumCli = P009R19_n2246ParNumCli[0] ;
            A1877PartLoc = P009R19_A1877PartLoc[0] ;
            n1877PartLoc = P009R19_n1877PartLoc[0] ;
            A986KilUti = P009R19_A986KilUti[0] ;
            n986KilUti = P009R19_n986KilUti[0] ;
            A987ConUti = P009R19_A987ConUti[0] ;
            n987ConUti = P009R19_n987ConUti[0] ;
            A979PartLin = P009R19_A979PartLin[0] ;
            if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 )
            {
               AV26Flag = (byte)(1) ;
               if ( ( (AV28PartKilSal.add(AV22KilAct).subtract(AV18Kilos)).doubleValue() < 0 ) && ( AV32FlagJM == 0 ) )
               {
                  AV26Flag = (byte)(2) ;
               }
               else
               {
                  if ( AV37FlagBros == 1 )
                  {
                     A982PartSitDis = GXutil.concat( AV31DisCliNum, AV38BarNumTen, "/") ;
                     n982PartSitDis = false ;
                  }
                  else
                  {
                     A982PartSitDis = GXutil.concat( AV29DisColNom, GXutil.str( AV30DisColnum, 6, 0), " / ") ;
                     n982PartSitDis = false ;
                  }
                  if ( AV39Pervaf == 1 )
                  {
                     A982PartSitDis = httpContext.getMessage( "T. ", "") + AV38BarNumTen ;
                     n982PartSitDis = false ;
                  }
                  A2246ParNumCli = AV31DisCliNum ;
                  n2246ParNumCli = false ;
                  A1877PartLoc = AV21Locali ;
                  n1877PartLoc = false ;
                  A986KilUti = A986KilUti.subtract(AV22KilAct).add(AV18Kilos) ;
                  n986KilUti = false ;
                  A987ConUti = (short)(A987ConUti-AV23PieAct+AV19Piezas) ;
                  n987ConUti = false ;
               }
               /* Using cursor P009R20 */
               pr_default.execute(17, new Object[] {Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n2246ParNumCli), A2246ParNumCli, Boolean.valueOf(n1877PartLoc), A1877PartLoc, Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
            }
            pr_default.readNext(16);
         }
         pr_default.close(16);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S121( )
   {
      /* 'OPEANT' Routine */
      returnInSub = false ;
      /* Using cursor P009R21 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV35DisOpeAnt)});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A2420OpeAntCod = P009R21_A2420OpeAntCod[0] ;
         A2422OpeAntKgm = P009R21_A2422OpeAntKgm[0] ;
         n2422OpeAntKgm = P009R21_n2422OpeAntKgm[0] ;
         A457FasCod = P009R21_A457FasCod[0] ;
         n457FasCod = P009R21_n457FasCod[0] ;
         A2419OpeAlbCli = P009R21_A2419OpeAlbCli[0] ;
         n2419OpeAlbCli = P009R21_n2419OpeAlbCli[0] ;
         A2422OpeAntKgm = AV18Kilos ;
         n2422OpeAntKgm = false ;
         AV33FasCod = A457FasCod ;
         AV34OpeAlbCli = A2419OpeAlbCli ;
         /* Using cursor P009R22 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n2422OpeAntKgm), A2422OpeAntKgm, A396EmprCod, Integer.valueOf(A2420OpeAntCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPEANT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(18);
      /* Using cursor P009R23 */
      pr_default.execute(20, new Object[] {A396EmprCod, AV24PartCod, Integer.valueOf(AV20CliCod), Integer.valueOf(AV25DisCod)});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A980PartLinTip = P009R23_A980PartLinTip[0] ;
         n980PartLinTip = P009R23_n980PartLinTip[0] ;
         A981PartAlbDis = P009R23_A981PartAlbDis[0] ;
         n981PartAlbDis = P009R23_n981PartAlbDis[0] ;
         A252CliCod = P009R23_A252CliCod[0] ;
         n252CliCod = P009R23_n252CliCod[0] ;
         A966PartCod = P009R23_A966PartCod[0] ;
         n966PartCod = P009R23_n966PartCod[0] ;
         A984KilEnt = P009R23_A984KilEnt[0] ;
         n984KilEnt = P009R23_n984KilEnt[0] ;
         A979PartLin = P009R23_A979PartLin[0] ;
         if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 )
         {
            A984KilEnt = AV18Kilos ;
            n984KilEnt = false ;
            /* Using cursor P009R24 */
            pr_default.execute(21, new Object[] {Boolean.valueOf(n984KilEnt), A984KilEnt, A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
         }
         pr_default.readNext(20);
      }
      pr_default.close(20);
      /* Using cursor P009R25 */
      pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(AV36DisManCod), AV33FasCod, AV34OpeAlbCli});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A2349ExMvpAlb = P009R25_A2349ExMvpAlb[0] ;
         n2349ExMvpAlb = P009R25_n2349ExMvpAlb[0] ;
         A2348ExMvpTip = P009R25_A2348ExMvpTip[0] ;
         n2348ExMvpTip = P009R25_n2348ExMvpTip[0] ;
         A2358ExMvpFas = P009R25_A2358ExMvpFas[0] ;
         A2248ManCod = P009R25_A2248ManCod[0] ;
         A2350ExMvpKgE = P009R25_A2350ExMvpKgE[0] ;
         n2350ExMvpKgE = P009R25_n2350ExMvpKgE[0] ;
         A2347ExMvpLin = P009R25_A2347ExMvpLin[0] ;
         if ( GXutil.strcmp(A2348ExMvpTip, httpContext.getMessage( "E", "")) == 0 )
         {
            A2350ExMvpKgE = AV18Kilos ;
            n2350ExMvpKgE = false ;
            /* Using cursor P009R26 */
            pr_default.execute(23, new Object[] {Boolean.valueOf(n2350ExMvpKgE), A2350ExMvpKgE, A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas, Short.valueOf(A2347ExMvpLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVP");
         }
         pr_default.readNext(22);
      }
      pr_default.close(22);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcamkil.this.A396EmprCod;
      this.aP1[0] = pcamkil.this.AV15BarCod;
      this.aP2[0] = pcamkil.this.AV16BarCodReo;
      this.aP3[0] = pcamkil.this.AV17BarCodPar;
      this.aP4[0] = pcamkil.this.AV18Kilos;
      this.aP5[0] = pcamkil.this.AV19Piezas;
      this.aP6[0] = pcamkil.this.AV20CliCod;
      this.aP7[0] = pcamkil.this.AV21Locali;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P009R2_A252CliCod = new int[1] ;
      P009R2_n252CliCod = new boolean[] {false} ;
      P009R2_A396EmprCod = new String[] {""} ;
      P009R2_A130BarCodPar = new String[] {""} ;
      P009R2_A132BarCodReo = new byte[1] ;
      P009R2_A129BarCod = new int[1] ;
      P009R2_A1878BarNumTen = new String[] {""} ;
      P009R2_A1499BarNMez = new String[] {""} ;
      P009R2_A1500BarNMtr = new String[] {""} ;
      P009R2_A143BarDisNum = new String[] {""} ;
      P009R2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P009R2_A135BarColNom = new String[] {""} ;
      P009R2_A136BarColNum = new int[1] ;
      P009R2_A1234BarNomCli = new String[] {""} ;
      P009R2_A1235BarNumCli = new int[1] ;
      P009R2_A361DisCod = new int[1] ;
      P009R2_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P009R2_n1003BarFecLan = new boolean[] {false} ;
      P009R2_A4937BarCtrPdas = new byte[1] ;
      P009R2_n4937BarCtrPdas = new boolean[] {false} ;
      P009R2_A212BarSer = new String[] {""} ;
      A130BarCodPar = "" ;
      A1878BarNumTen = "" ;
      A1499BarNMez = "" ;
      A1500BarNMtr = "" ;
      A143BarDisNum = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A1003BarFecLan = GXutil.nullDate() ;
      A212BarSer = "" ;
      P009R3_A1002DisNumTen = new String[] {""} ;
      P009R3_n1002DisNumTen = new boolean[] {false} ;
      P009R3_A999DisNMez = new String[] {""} ;
      P009R3_A998DisNMtr = new String[] {""} ;
      P009R3_A360DisCliNum = new String[] {""} ;
      P009R3_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P009R3_A362DisColNom = new String[] {""} ;
      P009R3_n362DisColNom = new boolean[] {false} ;
      P009R3_A363DisColNum = new int[1] ;
      P009R3_n363DisColNum = new boolean[] {false} ;
      P009R3_A1195DisNomCli = new String[] {""} ;
      P009R3_A1196DisNumCli = new int[1] ;
      P009R3_A966PartCod = new String[] {""} ;
      P009R3_n966PartCod = new boolean[] {false} ;
      P009R3_A2403DisOpeAnt = new int[1] ;
      P009R3_n2403DisOpeAnt = new boolean[] {false} ;
      P009R3_A2402DisManCod = new short[1] ;
      A1002DisNumTen = "" ;
      A999DisNMez = "" ;
      A998DisNMtr = "" ;
      A360DisCliNum = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A966PartCod = "" ;
      P009R4_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV38BarNumTen = "" ;
      AV29DisColNom = "" ;
      AV31DisCliNum = "" ;
      AV24PartCod = "" ;
      P009R5_A396EmprCod = new String[] {""} ;
      P009R5_A200BarPieCod = new String[] {""} ;
      P009R5_A130BarCodPar = new String[] {""} ;
      P009R5_A132BarCodReo = new byte[1] ;
      P009R5_A129BarCod = new int[1] ;
      P009R5_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009R5_A1501BarPiePie = new int[1] ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      AV22KilAct = DecimalUtil.ZERO ;
      P009R6_A396EmprCod = new String[] {""} ;
      P009R6_A200BarPieCod = new String[] {""} ;
      P009R6_A130BarCodPar = new String[] {""} ;
      P009R6_A132BarCodReo = new byte[1] ;
      P009R6_A129BarCod = new int[1] ;
      P009R6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009R6_A1501BarPiePie = new int[1] ;
      P009R7_A361DisCod = new int[1] ;
      P009R8_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009R8_A374DisNumPie = new short[1] ;
      A375DisNumUni = DecimalUtil.ZERO ;
      P009R13_A396EmprCod = new String[] {""} ;
      P009R13_A200BarPieCod = new String[] {""} ;
      P009R13_A130BarCodPar = new String[] {""} ;
      P009R13_A132BarCodReo = new byte[1] ;
      P009R13_A129BarCod = new int[1] ;
      P009R13_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009R13_A1501BarPiePie = new int[1] ;
      O375DisNumUni = DecimalUtil.ZERO ;
      AV46UbiKil = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_char14 = new String[1] ;
      AV40CliNom = "" ;
      AV41BarSer = "" ;
      AV42BarColNom = "" ;
      P009R18_A396EmprCod = new String[] {""} ;
      P009R18_A252CliCod = new int[1] ;
      P009R18_n252CliCod = new boolean[] {false} ;
      P009R18_A966PartCod = new String[] {""} ;
      P009R18_n966PartCod = new boolean[] {false} ;
      P009R18_A975PartKilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009R18_A973PartKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A975PartKilUti = DecimalUtil.ZERO ;
      A973PartKilEnt = DecimalUtil.ZERO ;
      A977PartKilSal = DecimalUtil.ZERO ;
      AV28PartKilSal = DecimalUtil.ZERO ;
      P009R19_A396EmprCod = new String[] {""} ;
      P009R19_A966PartCod = new String[] {""} ;
      P009R19_n966PartCod = new boolean[] {false} ;
      P009R19_A252CliCod = new int[1] ;
      P009R19_n252CliCod = new boolean[] {false} ;
      P009R19_A980PartLinTip = new String[] {""} ;
      P009R19_n980PartLinTip = new boolean[] {false} ;
      P009R19_A981PartAlbDis = new int[1] ;
      P009R19_n981PartAlbDis = new boolean[] {false} ;
      P009R19_A982PartSitDis = new String[] {""} ;
      P009R19_n982PartSitDis = new boolean[] {false} ;
      P009R19_A2246ParNumCli = new String[] {""} ;
      P009R19_n2246ParNumCli = new boolean[] {false} ;
      P009R19_A1877PartLoc = new String[] {""} ;
      P009R19_n1877PartLoc = new boolean[] {false} ;
      P009R19_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009R19_n986KilUti = new boolean[] {false} ;
      P009R19_A987ConUti = new short[1] ;
      P009R19_n987ConUti = new boolean[] {false} ;
      P009R19_A979PartLin = new int[1] ;
      A980PartLinTip = "" ;
      A982PartSitDis = "" ;
      A2246ParNumCli = "" ;
      A1877PartLoc = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      P009R21_A396EmprCod = new String[] {""} ;
      P009R21_A2420OpeAntCod = new int[1] ;
      P009R21_A2422OpeAntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009R21_n2422OpeAntKgm = new boolean[] {false} ;
      P009R21_A457FasCod = new String[] {""} ;
      P009R21_n457FasCod = new boolean[] {false} ;
      P009R21_A2419OpeAlbCli = new String[] {""} ;
      P009R21_n2419OpeAlbCli = new boolean[] {false} ;
      A2422OpeAntKgm = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A2419OpeAlbCli = "" ;
      AV33FasCod = "" ;
      AV34OpeAlbCli = "" ;
      P009R23_A396EmprCod = new String[] {""} ;
      P009R23_A980PartLinTip = new String[] {""} ;
      P009R23_n980PartLinTip = new boolean[] {false} ;
      P009R23_A981PartAlbDis = new int[1] ;
      P009R23_n981PartAlbDis = new boolean[] {false} ;
      P009R23_A252CliCod = new int[1] ;
      P009R23_n252CliCod = new boolean[] {false} ;
      P009R23_A966PartCod = new String[] {""} ;
      P009R23_n966PartCod = new boolean[] {false} ;
      P009R23_A984KilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009R23_n984KilEnt = new boolean[] {false} ;
      P009R23_A979PartLin = new int[1] ;
      A984KilEnt = DecimalUtil.ZERO ;
      P009R25_A396EmprCod = new String[] {""} ;
      P009R25_A2349ExMvpAlb = new int[1] ;
      P009R25_n2349ExMvpAlb = new boolean[] {false} ;
      P009R25_A2348ExMvpTip = new String[] {""} ;
      P009R25_n2348ExMvpTip = new boolean[] {false} ;
      P009R25_A2358ExMvpFas = new String[] {""} ;
      P009R25_A2248ManCod = new short[1] ;
      P009R25_A2350ExMvpKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009R25_n2350ExMvpKgE = new boolean[] {false} ;
      P009R25_A2347ExMvpLin = new short[1] ;
      A2348ExMvpTip = "" ;
      A2358ExMvpFas = "" ;
      A2350ExMvpKgE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcamkil__default(),
         new Object[] {
             new Object[] {
            P009R2_A252CliCod, P009R2_n252CliCod, P009R2_A396EmprCod, P009R2_A130BarCodPar, P009R2_A132BarCodReo, P009R2_A129BarCod, P009R2_A1878BarNumTen, P009R2_A1499BarNMez, P009R2_A1500BarNMtr, P009R2_A143BarDisNum,
            P009R2_A155BarFecCli, P009R2_A135BarColNom, P009R2_A136BarColNum, P009R2_A1234BarNomCli, P009R2_A1235BarNumCli, P009R2_A361DisCod, P009R2_A1003BarFecLan, P009R2_n1003BarFecLan, P009R2_A4937BarCtrPdas, P009R2_n4937BarCtrPdas,
            P009R2_A212BarSer
            }
            , new Object[] {
            P009R3_A1002DisNumTen, P009R3_n1002DisNumTen, P009R3_A999DisNMez, P009R3_A998DisNMtr, P009R3_A360DisCliNum, P009R3_A370DisFecCli, P009R3_A362DisColNom, P009R3_n362DisColNom, P009R3_A363DisColNum, P009R3_n363DisColNum,
            P009R3_A1195DisNomCli, P009R3_A1196DisNumCli, P009R3_A966PartCod, P009R3_n966PartCod, P009R3_A2403DisOpeAnt, P009R3_n2403DisOpeAnt, P009R3_A2402DisManCod
            }
            , new Object[] {
            P009R4_A279CliNom
            }
            , new Object[] {
            P009R5_A396EmprCod, P009R5_A200BarPieCod, P009R5_A130BarCodPar, P009R5_A132BarCodReo, P009R5_A129BarCod, P009R5_A203BarPieKil, P009R5_A1501BarPiePie
            }
            , new Object[] {
            P009R6_A396EmprCod, P009R6_A200BarPieCod, P009R6_A130BarCodPar, P009R6_A132BarCodReo, P009R6_A129BarCod, P009R6_A203BarPieKil, P009R6_A1501BarPiePie
            }
            , new Object[] {
            P009R7_A361DisCod
            }
            , new Object[] {
            P009R8_A375DisNumUni, P009R8_A374DisNumPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P009R13_A396EmprCod, P009R13_A200BarPieCod, P009R13_A130BarCodPar, P009R13_A132BarCodReo, P009R13_A129BarCod, P009R13_A203BarPieKil, P009R13_A1501BarPiePie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P009R18_A396EmprCod, P009R18_A252CliCod, P009R18_A966PartCod, P009R18_A975PartKilUti, P009R18_A973PartKilEnt
            }
            , new Object[] {
            P009R19_A396EmprCod, P009R19_A966PartCod, P009R19_A252CliCod, P009R19_A980PartLinTip, P009R19_n980PartLinTip, P009R19_A981PartAlbDis, P009R19_n981PartAlbDis, P009R19_A982PartSitDis, P009R19_n982PartSitDis, P009R19_A2246ParNumCli,
            P009R19_n2246ParNumCli, P009R19_A1877PartLoc, P009R19_n1877PartLoc, P009R19_A986KilUti, P009R19_n986KilUti, P009R19_A987ConUti, P009R19_n987ConUti, P009R19_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            P009R21_A396EmprCod, P009R21_A2420OpeAntCod, P009R21_A2422OpeAntKgm, P009R21_n2422OpeAntKgm, P009R21_A457FasCod, P009R21_n457FasCod, P009R21_A2419OpeAlbCli, P009R21_n2419OpeAlbCli
            }
            , new Object[] {
            }
            , new Object[] {
            P009R23_A396EmprCod, P009R23_A980PartLinTip, P009R23_n980PartLinTip, P009R23_A981PartAlbDis, P009R23_n981PartAlbDis, P009R23_A252CliCod, P009R23_A966PartCod, P009R23_A984KilEnt, P009R23_n984KilEnt, P009R23_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            P009R25_A396EmprCod, P009R25_A2349ExMvpAlb, P009R25_n2349ExMvpAlb, P009R25_A2348ExMvpTip, P009R25_n2348ExMvpTip, P009R25_A2358ExMvpFas, P009R25_A2248ManCod, P009R25_A2350ExMvpKgE, P009R25_n2350ExMvpKgE, P009R25_A2347ExMvpLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV32FlagJM ;
   private byte AV37FlagBros ;
   private byte AV39Pervaf ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A4937BarCtrPdas ;
   private byte AV26Flag ;
   private short A2402DisManCod ;
   private short A374DisNumPie ;
   private short AV36DisManCod ;
   private short O374DisNumPie ;
   private short AV47UbiCon ;
   private short GXv_int11[] ;
   private short GXv_int13[] ;
   private short A987ConUti ;
   private short A2248ManCod ;
   private short A2347ExMvpLin ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int AV19Piezas ;
   private int AV20CliCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A361DisCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int A2403DisOpeAnt ;
   private int AV30DisColnum ;
   private int AV25DisCod ;
   private int A1501BarPiePie ;
   private int AV23PieAct ;
   private int AV35DisOpeAnt ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private int AV43BarColNum ;
   private int A981PartAlbDis ;
   private int A979PartLin ;
   private int A2420OpeAntCod ;
   private int A2349ExMvpAlb ;
   private java.math.BigDecimal AV18Kilos ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal AV22KilAct ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal O375DisNumUni ;
   private java.math.BigDecimal AV46UbiKil ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal A975PartKilUti ;
   private java.math.BigDecimal A973PartKilEnt ;
   private java.math.BigDecimal A977PartKilSal ;
   private java.math.BigDecimal AV28PartKilSal ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A2422OpeAntKgm ;
   private java.math.BigDecimal A984KilEnt ;
   private java.math.BigDecimal A2350ExMvpKgE ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV21Locali ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A1878BarNumTen ;
   private String A1499BarNMez ;
   private String A1500BarNMtr ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A212BarSer ;
   private String A1002DisNumTen ;
   private String A999DisNMez ;
   private String A998DisNMtr ;
   private String A360DisCliNum ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A966PartCod ;
   private String A279CliNom ;
   private String AV38BarNumTen ;
   private String AV29DisColNom ;
   private String AV31DisCliNum ;
   private String AV24PartCod ;
   private String A200BarPieCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char14[] ;
   private String AV40CliNom ;
   private String AV41BarSer ;
   private String AV42BarColNom ;
   private String A980PartLinTip ;
   private String A982PartSitDis ;
   private String A2246ParNumCli ;
   private String A1877PartLoc ;
   private String A457FasCod ;
   private String A2419OpeAlbCli ;
   private String AV33FasCod ;
   private String AV34OpeAlbCli ;
   private String A2348ExMvpTip ;
   private String A2358ExMvpFas ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date GXv_date6[] ;
   private boolean n252CliCod ;
   private boolean n1003BarFecLan ;
   private boolean n4937BarCtrPdas ;
   private boolean n1002DisNumTen ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n966PartCod ;
   private boolean n2403DisOpeAnt ;
   private boolean returnInSub ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n982PartSitDis ;
   private boolean n2246ParNumCli ;
   private boolean n1877PartLoc ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private boolean n2422OpeAntKgm ;
   private boolean n457FasCod ;
   private boolean n2419OpeAlbCli ;
   private boolean n984KilEnt ;
   private boolean n2349ExMvpAlb ;
   private boolean n2348ExMvpTip ;
   private boolean n2350ExMvpKgE ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P009R2_A252CliCod ;
   private boolean[] P009R2_n252CliCod ;
   private String[] P009R2_A396EmprCod ;
   private String[] P009R2_A130BarCodPar ;
   private byte[] P009R2_A132BarCodReo ;
   private int[] P009R2_A129BarCod ;
   private String[] P009R2_A1878BarNumTen ;
   private String[] P009R2_A1499BarNMez ;
   private String[] P009R2_A1500BarNMtr ;
   private String[] P009R2_A143BarDisNum ;
   private java.util.Date[] P009R2_A155BarFecCli ;
   private String[] P009R2_A135BarColNom ;
   private int[] P009R2_A136BarColNum ;
   private String[] P009R2_A1234BarNomCli ;
   private int[] P009R2_A1235BarNumCli ;
   private int[] P009R2_A361DisCod ;
   private java.util.Date[] P009R2_A1003BarFecLan ;
   private boolean[] P009R2_n1003BarFecLan ;
   private byte[] P009R2_A4937BarCtrPdas ;
   private boolean[] P009R2_n4937BarCtrPdas ;
   private String[] P009R2_A212BarSer ;
   private String[] P009R3_A1002DisNumTen ;
   private boolean[] P009R3_n1002DisNumTen ;
   private String[] P009R3_A999DisNMez ;
   private String[] P009R3_A998DisNMtr ;
   private String[] P009R3_A360DisCliNum ;
   private java.util.Date[] P009R3_A370DisFecCli ;
   private String[] P009R3_A362DisColNom ;
   private boolean[] P009R3_n362DisColNom ;
   private int[] P009R3_A363DisColNum ;
   private boolean[] P009R3_n363DisColNum ;
   private String[] P009R3_A1195DisNomCli ;
   private int[] P009R3_A1196DisNumCli ;
   private String[] P009R3_A966PartCod ;
   private boolean[] P009R3_n966PartCod ;
   private int[] P009R3_A2403DisOpeAnt ;
   private boolean[] P009R3_n2403DisOpeAnt ;
   private short[] P009R3_A2402DisManCod ;
   private String[] P009R4_A279CliNom ;
   private String[] P009R5_A396EmprCod ;
   private String[] P009R5_A200BarPieCod ;
   private String[] P009R5_A130BarCodPar ;
   private byte[] P009R5_A132BarCodReo ;
   private int[] P009R5_A129BarCod ;
   private java.math.BigDecimal[] P009R5_A203BarPieKil ;
   private int[] P009R5_A1501BarPiePie ;
   private String[] P009R6_A396EmprCod ;
   private String[] P009R6_A200BarPieCod ;
   private String[] P009R6_A130BarCodPar ;
   private byte[] P009R6_A132BarCodReo ;
   private int[] P009R6_A129BarCod ;
   private java.math.BigDecimal[] P009R6_A203BarPieKil ;
   private int[] P009R6_A1501BarPiePie ;
   private int[] P009R7_A361DisCod ;
   private java.math.BigDecimal[] P009R8_A375DisNumUni ;
   private short[] P009R8_A374DisNumPie ;
   private String[] P009R13_A396EmprCod ;
   private String[] P009R13_A200BarPieCod ;
   private String[] P009R13_A130BarCodPar ;
   private byte[] P009R13_A132BarCodReo ;
   private int[] P009R13_A129BarCod ;
   private java.math.BigDecimal[] P009R13_A203BarPieKil ;
   private int[] P009R13_A1501BarPiePie ;
   private String[] P009R18_A396EmprCod ;
   private int[] P009R18_A252CliCod ;
   private boolean[] P009R18_n252CliCod ;
   private String[] P009R18_A966PartCod ;
   private boolean[] P009R18_n966PartCod ;
   private java.math.BigDecimal[] P009R18_A975PartKilUti ;
   private java.math.BigDecimal[] P009R18_A973PartKilEnt ;
   private String[] P009R19_A396EmprCod ;
   private String[] P009R19_A966PartCod ;
   private boolean[] P009R19_n966PartCod ;
   private int[] P009R19_A252CliCod ;
   private boolean[] P009R19_n252CliCod ;
   private String[] P009R19_A980PartLinTip ;
   private boolean[] P009R19_n980PartLinTip ;
   private int[] P009R19_A981PartAlbDis ;
   private boolean[] P009R19_n981PartAlbDis ;
   private String[] P009R19_A982PartSitDis ;
   private boolean[] P009R19_n982PartSitDis ;
   private String[] P009R19_A2246ParNumCli ;
   private boolean[] P009R19_n2246ParNumCli ;
   private String[] P009R19_A1877PartLoc ;
   private boolean[] P009R19_n1877PartLoc ;
   private java.math.BigDecimal[] P009R19_A986KilUti ;
   private boolean[] P009R19_n986KilUti ;
   private short[] P009R19_A987ConUti ;
   private boolean[] P009R19_n987ConUti ;
   private int[] P009R19_A979PartLin ;
   private String[] P009R21_A396EmprCod ;
   private int[] P009R21_A2420OpeAntCod ;
   private java.math.BigDecimal[] P009R21_A2422OpeAntKgm ;
   private boolean[] P009R21_n2422OpeAntKgm ;
   private String[] P009R21_A457FasCod ;
   private boolean[] P009R21_n457FasCod ;
   private String[] P009R21_A2419OpeAlbCli ;
   private boolean[] P009R21_n2419OpeAlbCli ;
   private String[] P009R23_A396EmprCod ;
   private String[] P009R23_A980PartLinTip ;
   private boolean[] P009R23_n980PartLinTip ;
   private int[] P009R23_A981PartAlbDis ;
   private boolean[] P009R23_n981PartAlbDis ;
   private int[] P009R23_A252CliCod ;
   private boolean[] P009R23_n252CliCod ;
   private String[] P009R23_A966PartCod ;
   private boolean[] P009R23_n966PartCod ;
   private java.math.BigDecimal[] P009R23_A984KilEnt ;
   private boolean[] P009R23_n984KilEnt ;
   private int[] P009R23_A979PartLin ;
   private String[] P009R25_A396EmprCod ;
   private int[] P009R25_A2349ExMvpAlb ;
   private boolean[] P009R25_n2349ExMvpAlb ;
   private String[] P009R25_A2348ExMvpTip ;
   private boolean[] P009R25_n2348ExMvpTip ;
   private String[] P009R25_A2358ExMvpFas ;
   private short[] P009R25_A2248ManCod ;
   private java.math.BigDecimal[] P009R25_A2350ExMvpKgE ;
   private boolean[] P009R25_n2350ExMvpKgE ;
   private short[] P009R25_A2347ExMvpLin ;
}

final  class pcamkil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P009R2", "SELECT CliCod, EmprCod, BarCodPar, BarCodReo, BarCod, BarNumTen, BarNMez, BarNMtr, BarDisNum, BarFecCli, BarColNom, BarColNum, BarNomCli, BarNumCli, DisCod, BarFecLan, BarCtrPdas, BarSer FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009R3", "SELECT DisNumTen, DisNMez, DisNMtr, DisCliNum, DisFecCli, DisColNom, DisColNum, DisNomCli, DisNumCli, PartCod, DisOpeAnt, DisManCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009R4", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009R5", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarPieKil, BarPiePie FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P009R6", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarPieKil, BarPiePie FROM TXPBARPIE WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P009R7", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P009R8", "SELECT DisNumUni, DisNumPie FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009R9", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P009R10", "UPDATE TXPBARPIE SET BarPieKil=?, BarPiePie=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009R11", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P009R12", "UPDATE TXPBARPIE SET BarPieKil=?, BarPiePie=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P009R13", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarPieKil, BarPiePie FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009R14", "UPDATE TXPBARPIE SET BarPieKil=?, BarPiePie=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009R15", "UPDATE TXPBARPIE SET BarPieKil=?, BarPiePie=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009R16", "UPDATE TXPDISPOS SET DisNumTen=?, DisNMez=?, DisNMtr=?, DisCliNum=?, DisFecCli=?, DisColNom=?, DisColNum=?, DisNomCli=?, DisNumCli=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P009R18", "SELECT T1.EmprCod, T1.CliCod, T1.PartCod, COALESCE( T2.PartKilUti, 0) AS PartKilUti, COALESCE( T2.PartKilEnt, 0) AS PartKilEnt FROM (TXPCPARTI T1 LEFT JOIN (SELECT SUM(KilEnt) AS PartKilEnt, EmprCod, PartCod, CliCod, SUM(KilUti) AS PartKilUti FROM TXPLPARTI GROUP BY EmprCod, PartCod, CliCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PartCod = T1.PartCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.PartCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.PartCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009R19", "SELECT EmprCod, PartCod, CliCod, PartLinTip, PartAlbDis, PartSitDis, ParNumCli, PartLoc, KilUti, ConUti, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod, PartLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009R20", "UPDATE TXPLPARTI SET PartSitDis=?, ParNumCli=?, PartLoc=?, KilUti=?, ConUti=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P009R21", "SELECT EmprCod, OpeAntCod, OpeAntKgm, FasCod, OpeAlbCli FROM TXPOPEANT WHERE EmprCod = ? and OpeAntCod = ? ORDER BY EmprCod, OpeAntCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P009R22", "UPDATE TXPOPEANT SET OpeAntKgm=?  WHERE EmprCod = ? AND OpeAntCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOPEANT")
         ,new ForEachCursor("P009R23", "SELECT EmprCod, PartLinTip, PartAlbDis, CliCod, PartCod, KilEnt, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod, PartLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009R24", "UPDATE TXPLPARTI SET KilEnt=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P009R25", "SELECT EmprCod, ExMvpAlb, ExMvpTip, ExMvpFas, ManCod, ExMvpKgE, ExMvpLin FROM TXPLEXMVP WHERE (EmprCod = ? and ManCod = ? and ExMvpFas = ?) AND (ExMvpAlb = TO_NUMBER(NVL(TRIM(?), '0'))) ORDER BY EmprCod, ManCod, ExMvpFas, ExMvpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009R26", "UPDATE TXPLEXMVP SET ExMvpKgE=?  WHERE EmprCod = ? AND ManCod = ? AND ExMvpFas = ? AND ExMvpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVP")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((String[]) buf[8])[0] = rslt.getString(8, 10);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
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
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 10);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 8);
               stmt.setDate(5, (java.util.Date)parms[5]);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               stmt.setString(8, (String)parms[10], 13);
               stmt.setInt(9, ((Number) parms[11]).intValue());
               stmt.setString(10, (String)parms[12], 3);
               stmt.setInt(11, ((Number) parms[13]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               stmt.setInt(9, ((Number) parms[15]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               stmt.setInt(5, ((Number) parms[7]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

