package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedartc extends GXProcedure
{
   public ppedartc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedartc.class ), "" );
   }

   public ppedartc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      ppedartc.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      ppedartc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedartc.this.A8197PArId = aP1[0];
      this.aP1 = aP1;
      ppedartc.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      ppedartc.this.AV17Ok = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Ok = (byte)(0) ;
      Gx_msg = "" ;
      /* Using cursor P037K2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8208PArArtTCod = P037K2_A8208PArArtTCod[0] ;
         n8208PArArtTCod = P037K2_n8208PArArtTCod[0] ;
         A8205PArCliCod = P037K2_A8205PArCliCod[0] ;
         n8205PArCliCod = P037K2_n8205PArCliCod[0] ;
         A8220PArTin = P037K2_A8220PArTin[0] ;
         n8220PArTin = P037K2_n8220PArTin[0] ;
         A8219PArEst = P037K2_A8219PArEst[0] ;
         n8219PArEst = P037K2_n8219PArEst[0] ;
         if ( A8220PArTin == 1 )
         {
            /* Using cursor P037K3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               brk37K3 = false ;
               A8231PArCruColN = P037K3_A8231PArCruColN[0] ;
               n8231PArCruColN = P037K3_n8231PArCruColN[0] ;
               A8230PArCruCol = P037K3_A8230PArCruCol[0] ;
               n8230PArCruCol = P037K3_n8230PArCruCol[0] ;
               A8235ParCruKgs = P037K3_A8235ParCruKgs[0] ;
               n8235ParCruKgs = P037K3_n8235ParCruKgs[0] ;
               A8234PArCruMtr = P037K3_A8234PArCruMtr[0] ;
               n8234PArCruMtr = P037K3_n8234PArCruMtr[0] ;
               A8225ParCruLin = P037K3_A8225ParCruLin[0] ;
               AV25PArCruCol = A8230PArCruCol ;
               AV26PArCruColN = A8231PArCruColN ;
               AV18PArColKgm = DecimalUtil.doubleToDec(0) ;
               AV19PArColMtr = DecimalUtil.doubleToDec(0) ;
               AV20PArColPie = (short)(0) ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P037K3_A8230PArCruCol[0], A8230PArCruCol) == 0 ) && ( P037K3_A8231PArCruColN[0] == A8231PArCruColN ) )
               {
                  brk37K3 = false ;
                  A8235ParCruKgs = P037K3_A8235ParCruKgs[0] ;
                  n8235ParCruKgs = P037K3_n8235ParCruKgs[0] ;
                  A8234PArCruMtr = P037K3_A8234PArCruMtr[0] ;
                  n8234PArCruMtr = P037K3_n8234PArCruMtr[0] ;
                  A8225ParCruLin = P037K3_A8225ParCruLin[0] ;
                  if ( GXutil.strcmp(P037K3_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( P037K3_A8197PArId[0] == A8197PArId )
                     {
                        if ( GXutil.strcmp(A8230PArCruCol, AV25PArCruCol) == 0 )
                        {
                           if ( A8231PArCruColN == AV26PArCruColN )
                           {
                              AV18PArColKgm = AV18PArColKgm.add(A8235ParCruKgs) ;
                              AV19PArColMtr = AV19PArColMtr.add(A8234PArCruMtr) ;
                              AV20PArColPie = (short)(AV20PArColPie+1) ;
                           }
                        }
                     }
                  }
                  brk37K3 = true ;
                  pr_default.readNext(1);
               }
               AV35GXLvl40 = (byte)(0) ;
               /* Using cursor P037K4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Boolean.valueOf(n8230PArCruCol), A8230PArCruCol, Boolean.valueOf(n8231PArCruColN), Integer.valueOf(A8231PArCruColN)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A8242PArColNom = P037K4_A8242PArColNom[0] ;
                  A8243PArColNum = P037K4_A8243PArColNum[0] ;
                  A8246PArColInt = P037K4_A8246PArColInt[0] ;
                  n8246PArColInt = P037K4_n8246PArColInt[0] ;
                  AV35GXLvl40 = (byte)(1) ;
                  AV17Ok = (byte)(-5) ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
               if ( AV35GXLvl40 == 0 )
               {
                  AV36GXLvl46 = (byte)(0) ;
                  /* Using cursor P037K5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Boolean.valueOf(n8230PArCruCol), A8230PArCruCol, Boolean.valueOf(n8231PArCruColN), Integer.valueOf(A8231PArCruColN)});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A8242PArColNom = P037K5_A8242PArColNom[0] ;
                     A8243PArColNum = P037K5_A8243PArColNum[0] ;
                     A8246PArColInt = P037K5_A8246PArColInt[0] ;
                     n8246PArColInt = P037K5_n8246PArColInt[0] ;
                     A8205PArCliCod = P037K5_A8205PArCliCod[0] ;
                     n8205PArCliCod = P037K5_n8205PArCliCod[0] ;
                     A8208PArArtTCod = P037K5_A8208PArArtTCod[0] ;
                     n8208PArArtTCod = P037K5_n8208PArArtTCod[0] ;
                     A8244PArColPie = P037K5_A8244PArColPie[0] ;
                     n8244PArColPie = P037K5_n8244PArColPie[0] ;
                     A8248PArColMtr = P037K5_A8248PArColMtr[0] ;
                     n8248PArColMtr = P037K5_n8248PArColMtr[0] ;
                     A8249PArColKgm = P037K5_A8249PArColKgm[0] ;
                     n8249PArColKgm = P037K5_n8249PArColKgm[0] ;
                     A8245PArColDes = P037K5_A8245PArColDes[0] ;
                     n8245PArColDes = P037K5_n8245PArColDes[0] ;
                     A8205PArCliCod = P037K5_A8205PArCliCod[0] ;
                     n8205PArCliCod = P037K5_n8205PArCliCod[0] ;
                     A8208PArArtTCod = P037K5_A8208PArArtTCod[0] ;
                     n8208PArArtTCod = P037K5_n8208PArArtTCod[0] ;
                     AV36GXLvl46 = (byte)(1) ;
                     if ( ( DecimalUtil.compareTo(A8249PArColKgm, AV18PArColKgm) == 0 ) && ( DecimalUtil.compareTo(A8248PArColMtr, AV19PArColMtr) == 0 ) && ( A8244PArColPie == AV20PArColPie ) )
                     {
                        AV37GXLvl51 = (byte)(0) ;
                        /* Using cursor P037K6 */
                        pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n8205PArCliCod), Integer.valueOf(A8205PArCliCod), Boolean.valueOf(n8208PArArtTCod), A8208PArArtTCod, A8242PArColNom, Integer.valueOf(A8243PArColNum)});
                        while ( (pr_default.getStatus(4) != 101) )
                        {
                           A494ForSer = P037K6_A494ForSer[0] ;
                           A252CliCod = P037K6_A252CliCod[0] ;
                           A482ForColNom = P037K6_A482ForColNom[0] ;
                           A483ForColNum = P037K6_A483ForColNum[0] ;
                           A831TipColCod = P037K6_A831TipColCod[0] ;
                           AV37GXLvl51 = (byte)(1) ;
                           pr_default.readNext(4);
                        }
                        pr_default.close(4);
                        if ( AV37GXLvl51 == 0 )
                        {
                           if ( A8245PArColDes == 1 )
                           {
                              AV21IntCod = (byte)(0) ;
                           }
                           else
                           {
                              AV17Ok = (byte)(-4) ;
                           }
                        }
                        AV38GXLvl63 = (byte)(0) ;
                        /* Using cursor P037K7 */
                        pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Boolean.valueOf(n8246PArColInt), Byte.valueOf(A8246PArColInt), Byte.valueOf(AV17Ok)});
                        while ( (pr_default.getStatus(5) != 101) )
                        {
                           A8293PArPTeInt = P037K7_A8293PArPTeInt[0] ;
                           A8297PArPTeImp = P037K7_A8297PArPTeImp[0] ;
                           n8297PArPTeImp = P037K7_n8297PArPTeImp[0] ;
                           AV38GXLvl63 = (byte)(1) ;
                           if ( A8297PArPTeImp <= 0 )
                           {
                              AV17Ok = (byte)(-2) ;
                           }
                           /* Exiting from a For First loop. */
                           if (true) break;
                        }
                        pr_default.close(5);
                        if ( AV38GXLvl63 == 0 )
                        {
                           AV17Ok = (byte)(-6) ;
                        }
                     }
                     else
                     {
                        Gx_msg = httpContext.getMessage( "K : ", "") + GXutil.trim( GXutil.str( A8249PArColKgm, 10, 2)) + " = " + GXutil.trim( GXutil.str( AV18PArColKgm, 10, 2)) + GXutil.newLine( ) + httpContext.getMessage( "M : ", "") + GXutil.trim( GXutil.str( A8248PArColMtr, 10, 2)) + " = " + GXutil.trim( GXutil.str( AV19PArColMtr, 10, 2)) + GXutil.newLine( ) + httpContext.getMessage( "P : ", "") + GXutil.trim( GXutil.str( A8244PArColPie, 10, 0)) + " = " + GXutil.trim( GXutil.str( AV20PArColPie, 10, 0)) ;
                        AV17Ok = (byte)(-7) ;
                     }
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(3);
                  if ( AV36GXLvl46 == 0 )
                  {
                     AV17Ok = (byte)(-1) ;
                  }
               }
               if ( ! brk37K3 )
               {
                  brk37K3 = true ;
                  pr_default.readNext(1);
               }
            }
            pr_default.close(1);
         }
         if ( ( A8219PArEst == 1 ) && ( AV17Ok == 0 ) )
         {
            /* Using cursor P037K8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               brk37K9 = false ;
               A8233PArCruPin = P037K8_A8233PArCruPin[0] ;
               n8233PArCruPin = P037K8_n8233PArCruPin[0] ;
               A8232PArCruDib = P037K8_A8232PArCruDib[0] ;
               n8232PArCruDib = P037K8_n8232PArCruDib[0] ;
               A8234PArCruMtr = P037K8_A8234PArCruMtr[0] ;
               n8234PArCruMtr = P037K8_n8234PArCruMtr[0] ;
               A8225ParCruLin = P037K8_A8225ParCruLin[0] ;
               AV27PArCruDib = A8232PArCruDib ;
               AV28PArCruPin = A8233PArCruPin ;
               AV22PArEstMtr = DecimalUtil.doubleToDec(0) ;
               AV23PArEstPie = (short)(0) ;
               while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P037K8_A8232PArCruDib[0], A8232PArCruDib) == 0 ) && ( GXutil.strcmp(P037K8_A8233PArCruPin[0], A8233PArCruPin) == 0 ) )
               {
                  brk37K9 = false ;
                  A8234PArCruMtr = P037K8_A8234PArCruMtr[0] ;
                  n8234PArCruMtr = P037K8_n8234PArCruMtr[0] ;
                  A8225ParCruLin = P037K8_A8225ParCruLin[0] ;
                  if ( GXutil.strcmp(P037K8_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( P037K8_A8197PArId[0] == A8197PArId )
                     {
                        if ( GXutil.strcmp(A8232PArCruDib, AV27PArCruDib) == 0 )
                        {
                           if ( GXutil.strcmp(A8233PArCruPin, AV28PArCruPin) == 0 )
                           {
                              AV22PArEstMtr = AV22PArEstMtr.add(A8234PArCruMtr) ;
                              AV23PArEstPie = (short)(AV23PArEstPie+1) ;
                           }
                        }
                     }
                  }
                  brk37K9 = true ;
                  pr_default.readNext(6);
               }
               AV41GXLvl99 = (byte)(0) ;
               /* Using cursor P037K9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Boolean.valueOf(n8232PArCruDib), A8232PArCruDib, Boolean.valueOf(n8233PArCruPin), A8233PArCruPin, AV22PArEstMtr, Short.valueOf(AV23PArEstPie)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A8250PArEstDib = P037K9_A8250PArEstDib[0] ;
                  A8251PArEstPin = P037K9_A8251PArEstPin[0] ;
                  A8254PArEstPie = P037K9_A8254PArEstPie[0] ;
                  n8254PArEstPie = P037K9_n8254PArEstPie[0] ;
                  A8255PArEstMtr = P037K9_A8255PArEstMtr[0] ;
                  n8255PArEstMtr = P037K9_n8255PArEstMtr[0] ;
                  AV41GXLvl99 = (byte)(1) ;
                  AV42GXLvl104 = (byte)(0) ;
                  /* Using cursor P037K10 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8250PArEstDib, A8251PArEstPin});
                  while ( (pr_default.getStatus(8) != 101) )
                  {
                     A8298PArPEsDib = P037K10_A8298PArPEsDib[0] ;
                     A8299PArPEsPin = P037K10_A8299PArPEsPin[0] ;
                     A8300PArPEsImp = P037K10_A8300PArPEsImp[0] ;
                     n8300PArPEsImp = P037K10_n8300PArPEsImp[0] ;
                     AV42GXLvl104 = (byte)(1) ;
                     if ( A8300PArPEsImp <= 0 )
                     {
                        AV17Ok = (byte)(-13) ;
                     }
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(8);
                  if ( AV42GXLvl104 == 0 )
                  {
                     AV17Ok = (byte)(-12) ;
                  }
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(7);
               if ( AV41GXLvl99 == 0 )
               {
                  AV17Ok = (byte)(-11) ;
               }
               if ( ! brk37K9 )
               {
                  brk37K9 = true ;
                  pr_default.readNext(6);
               }
            }
            pr_default.close(6);
         }
         /* Using cursor P037K11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n8205PArCliCod), Integer.valueOf(A8205PArCliCod), Boolean.valueOf(n8208PArArtTCod), A8208PArArtTCod, Byte.valueOf(AV17Ok)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A252CliCod = P037K11_A252CliCod[0] ;
            A65ArtCod = P037K11_A65ArtCod[0] ;
            A758ProCod = P037K11_A758ProCod[0] ;
            AV24ProCod = A758ProCod ;
            /* Execute user subroutine: 'FASESACABADO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(9);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(9);
         }
         pr_default.close(9);
         /* Using cursor P037K12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Byte.valueOf(AV17Ok)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A8285PArAcaFasC = P037K12_A8285PArAcaFasC[0] ;
            A8292PArAcaImpM = P037K12_A8292PArAcaImpM[0] ;
            n8292PArAcaImpM = P037K12_n8292PArAcaImpM[0] ;
            A8291PArAcaImpK = P037K12_A8291PArAcaImpK[0] ;
            n8291PArAcaImpK = P037K12_n8291PArAcaImpK[0] ;
            /* Using cursor P037K13 */
            pr_default.execute(11, new Object[] {A396EmprCod, A8285PArAcaFasC});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A457FasCod = P037K13_A457FasCod[0] ;
               A7744FasPreObl = P037K13_A7744FasPreObl[0] ;
               n7744FasPreObl = P037K13_n7744FasPreObl[0] ;
               AV17Ok = (byte)(-22) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(11);
            pr_default.readNext(10);
         }
         pr_default.close(10);
         /* Using cursor P037K14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Byte.valueOf(AV17Ok)});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A8308PArPAdImpM = P037K14_A8308PArPAdImpM[0] ;
            n8308PArPAdImpM = P037K14_n8308PArPAdImpM[0] ;
            A8307PArPAdImpK = P037K14_A8307PArPAdImpK[0] ;
            n8307PArPAdImpK = P037K14_n8307PArPAdImpK[0] ;
            A8306PArPAdImp = P037K14_A8306PArPAdImp[0] ;
            n8306PArPAdImp = P037K14_n8306PArPAdImp[0] ;
            A8301PArPAdFas = P037K14_A8301PArPAdFas[0] ;
            A8304PArPAdAdiC = P037K14_A8304PArPAdAdiC[0] ;
            AV17Ok = (byte)(-31) ;
            pr_default.readNext(12);
         }
         pr_default.close(12);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'FASESACABADO' Routine */
      returnInSub = false ;
      /* Using cursor P037K15 */
      pr_default.execute(13, new Object[] {A396EmprCod, AV24ProCod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A457FasCod = P037K15_A457FasCod[0] ;
         A4903FasAcab = P037K15_A4903FasAcab[0] ;
         n4903FasAcab = P037K15_n4903FasAcab[0] ;
         A758ProCod = P037K15_A758ProCod[0] ;
         A252CliCod = P037K15_A252CliCod[0] ;
         A65ArtCod = P037K15_A65ArtCod[0] ;
         A4903FasAcab = P037K15_A4903FasAcab[0] ;
         n4903FasAcab = P037K15_n4903FasAcab[0] ;
         if ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV48GXLvl153 = (byte)(0) ;
            /* Using cursor P037K16 */
            pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A457FasCod});
            while ( (pr_default.getStatus(14) != 101) )
            {
               A8285PArAcaFasC = P037K16_A8285PArAcaFasC[0] ;
               AV48GXLvl153 = (byte)(1) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(14);
            if ( AV48GXLvl153 == 0 )
            {
               AV17Ok = (byte)(-21) ;
            }
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedartc.this.A396EmprCod;
      this.aP1[0] = ppedartc.this.A8197PArId;
      this.aP2[0] = ppedartc.this.Gx_msg;
      this.aP3[0] = ppedartc.this.AV17Ok;
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
      P037K2_A396EmprCod = new String[] {""} ;
      P037K2_A8197PArId = new int[1] ;
      P037K2_A8208PArArtTCod = new String[] {""} ;
      P037K2_n8208PArArtTCod = new boolean[] {false} ;
      P037K2_A8205PArCliCod = new int[1] ;
      P037K2_n8205PArCliCod = new boolean[] {false} ;
      P037K2_A8220PArTin = new byte[1] ;
      P037K2_n8220PArTin = new boolean[] {false} ;
      P037K2_A8219PArEst = new byte[1] ;
      P037K2_n8219PArEst = new boolean[] {false} ;
      A8208PArArtTCod = "" ;
      P037K3_A396EmprCod = new String[] {""} ;
      P037K3_A8197PArId = new int[1] ;
      P037K3_A8231PArCruColN = new int[1] ;
      P037K3_n8231PArCruColN = new boolean[] {false} ;
      P037K3_A8230PArCruCol = new String[] {""} ;
      P037K3_n8230PArCruCol = new boolean[] {false} ;
      P037K3_A8235ParCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037K3_n8235ParCruKgs = new boolean[] {false} ;
      P037K3_A8234PArCruMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037K3_n8234PArCruMtr = new boolean[] {false} ;
      P037K3_A8225ParCruLin = new short[1] ;
      A8230PArCruCol = "" ;
      A8235ParCruKgs = DecimalUtil.ZERO ;
      A8234PArCruMtr = DecimalUtil.ZERO ;
      AV25PArCruCol = "" ;
      AV18PArColKgm = DecimalUtil.ZERO ;
      AV19PArColMtr = DecimalUtil.ZERO ;
      P037K4_A396EmprCod = new String[] {""} ;
      P037K4_A8197PArId = new int[1] ;
      P037K4_A8242PArColNom = new String[] {""} ;
      P037K4_A8243PArColNum = new int[1] ;
      P037K4_A8246PArColInt = new byte[1] ;
      P037K4_n8246PArColInt = new boolean[] {false} ;
      A8242PArColNom = "" ;
      P037K5_A396EmprCod = new String[] {""} ;
      P037K5_A8197PArId = new int[1] ;
      P037K5_A8242PArColNom = new String[] {""} ;
      P037K5_A8243PArColNum = new int[1] ;
      P037K5_A8246PArColInt = new byte[1] ;
      P037K5_n8246PArColInt = new boolean[] {false} ;
      P037K5_A8205PArCliCod = new int[1] ;
      P037K5_n8205PArCliCod = new boolean[] {false} ;
      P037K5_A8208PArArtTCod = new String[] {""} ;
      P037K5_n8208PArArtTCod = new boolean[] {false} ;
      P037K5_A8244PArColPie = new short[1] ;
      P037K5_n8244PArColPie = new boolean[] {false} ;
      P037K5_A8248PArColMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037K5_n8248PArColMtr = new boolean[] {false} ;
      P037K5_A8249PArColKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037K5_n8249PArColKgm = new boolean[] {false} ;
      P037K5_A8245PArColDes = new byte[1] ;
      P037K5_n8245PArColDes = new boolean[] {false} ;
      A8248PArColMtr = DecimalUtil.ZERO ;
      A8249PArColKgm = DecimalUtil.ZERO ;
      P037K6_A396EmprCod = new String[] {""} ;
      P037K6_A494ForSer = new String[] {""} ;
      P037K6_A252CliCod = new int[1] ;
      P037K6_A482ForColNom = new String[] {""} ;
      P037K6_A483ForColNum = new int[1] ;
      P037K6_A831TipColCod = new byte[1] ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      P037K7_A396EmprCod = new String[] {""} ;
      P037K7_A8197PArId = new int[1] ;
      P037K7_A8293PArPTeInt = new byte[1] ;
      P037K7_A8297PArPTeImp = new int[1] ;
      P037K7_n8297PArPTeImp = new boolean[] {false} ;
      P037K8_A396EmprCod = new String[] {""} ;
      P037K8_A8197PArId = new int[1] ;
      P037K8_A8233PArCruPin = new String[] {""} ;
      P037K8_n8233PArCruPin = new boolean[] {false} ;
      P037K8_A8232PArCruDib = new String[] {""} ;
      P037K8_n8232PArCruDib = new boolean[] {false} ;
      P037K8_A8234PArCruMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037K8_n8234PArCruMtr = new boolean[] {false} ;
      P037K8_A8225ParCruLin = new short[1] ;
      A8233PArCruPin = "" ;
      A8232PArCruDib = "" ;
      AV27PArCruDib = "" ;
      AV28PArCruPin = "" ;
      AV22PArEstMtr = DecimalUtil.ZERO ;
      P037K9_A396EmprCod = new String[] {""} ;
      P037K9_A8197PArId = new int[1] ;
      P037K9_A8250PArEstDib = new String[] {""} ;
      P037K9_A8251PArEstPin = new String[] {""} ;
      P037K9_A8254PArEstPie = new short[1] ;
      P037K9_n8254PArEstPie = new boolean[] {false} ;
      P037K9_A8255PArEstMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037K9_n8255PArEstMtr = new boolean[] {false} ;
      A8250PArEstDib = "" ;
      A8251PArEstPin = "" ;
      A8255PArEstMtr = DecimalUtil.ZERO ;
      P037K10_A396EmprCod = new String[] {""} ;
      P037K10_A8197PArId = new int[1] ;
      P037K10_A8298PArPEsDib = new String[] {""} ;
      P037K10_A8299PArPEsPin = new String[] {""} ;
      P037K10_A8300PArPEsImp = new int[1] ;
      P037K10_n8300PArPEsImp = new boolean[] {false} ;
      A8298PArPEsDib = "" ;
      A8299PArPEsPin = "" ;
      P037K11_A396EmprCod = new String[] {""} ;
      P037K11_A252CliCod = new int[1] ;
      P037K11_A65ArtCod = new String[] {""} ;
      P037K11_A758ProCod = new String[] {""} ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      AV24ProCod = "" ;
      P037K12_A396EmprCod = new String[] {""} ;
      P037K12_A8197PArId = new int[1] ;
      P037K12_A8285PArAcaFasC = new String[] {""} ;
      P037K12_A8292PArAcaImpM = new int[1] ;
      P037K12_n8292PArAcaImpM = new boolean[] {false} ;
      P037K12_A8291PArAcaImpK = new int[1] ;
      P037K12_n8291PArAcaImpK = new boolean[] {false} ;
      A8285PArAcaFasC = "" ;
      P037K13_A396EmprCod = new String[] {""} ;
      P037K13_A457FasCod = new String[] {""} ;
      P037K13_A7744FasPreObl = new byte[1] ;
      P037K13_n7744FasPreObl = new boolean[] {false} ;
      A457FasCod = "" ;
      P037K14_A396EmprCod = new String[] {""} ;
      P037K14_A8197PArId = new int[1] ;
      P037K14_A8308PArPAdImpM = new int[1] ;
      P037K14_n8308PArPAdImpM = new boolean[] {false} ;
      P037K14_A8307PArPAdImpK = new int[1] ;
      P037K14_n8307PArPAdImpK = new boolean[] {false} ;
      P037K14_A8306PArPAdImp = new int[1] ;
      P037K14_n8306PArPAdImp = new boolean[] {false} ;
      P037K14_A8301PArPAdFas = new String[] {""} ;
      P037K14_A8304PArPAdAdiC = new short[1] ;
      A8301PArPAdFas = "" ;
      P037K15_A396EmprCod = new String[] {""} ;
      P037K15_A457FasCod = new String[] {""} ;
      P037K15_A4903FasAcab = new String[] {""} ;
      P037K15_n4903FasAcab = new boolean[] {false} ;
      P037K15_A758ProCod = new String[] {""} ;
      P037K15_A252CliCod = new int[1] ;
      P037K15_A65ArtCod = new String[] {""} ;
      A4903FasAcab = "" ;
      P037K16_A396EmprCod = new String[] {""} ;
      P037K16_A8197PArId = new int[1] ;
      P037K16_A8285PArAcaFasC = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedartc__default(),
         new Object[] {
             new Object[] {
            P037K2_A396EmprCod, P037K2_A8197PArId, P037K2_A8208PArArtTCod, P037K2_n8208PArArtTCod, P037K2_A8205PArCliCod, P037K2_n8205PArCliCod, P037K2_A8220PArTin, P037K2_n8220PArTin, P037K2_A8219PArEst, P037K2_n8219PArEst
            }
            , new Object[] {
            P037K3_A396EmprCod, P037K3_A8197PArId, P037K3_A8231PArCruColN, P037K3_n8231PArCruColN, P037K3_A8230PArCruCol, P037K3_n8230PArCruCol, P037K3_A8235ParCruKgs, P037K3_n8235ParCruKgs, P037K3_A8234PArCruMtr, P037K3_n8234PArCruMtr,
            P037K3_A8225ParCruLin
            }
            , new Object[] {
            P037K4_A396EmprCod, P037K4_A8197PArId, P037K4_A8242PArColNom, P037K4_A8243PArColNum, P037K4_A8246PArColInt, P037K4_n8246PArColInt
            }
            , new Object[] {
            P037K5_A396EmprCod, P037K5_A8197PArId, P037K5_A8242PArColNom, P037K5_A8243PArColNum, P037K5_A8246PArColInt, P037K5_n8246PArColInt, P037K5_A8205PArCliCod, P037K5_n8205PArCliCod, P037K5_A8208PArArtTCod, P037K5_n8208PArArtTCod,
            P037K5_A8244PArColPie, P037K5_n8244PArColPie, P037K5_A8248PArColMtr, P037K5_n8248PArColMtr, P037K5_A8249PArColKgm, P037K5_n8249PArColKgm, P037K5_A8245PArColDes, P037K5_n8245PArColDes
            }
            , new Object[] {
            P037K6_A396EmprCod, P037K6_A494ForSer, P037K6_A252CliCod, P037K6_A482ForColNom, P037K6_A483ForColNum, P037K6_A831TipColCod
            }
            , new Object[] {
            P037K7_A396EmprCod, P037K7_A8197PArId, P037K7_A8293PArPTeInt, P037K7_A8297PArPTeImp, P037K7_n8297PArPTeImp
            }
            , new Object[] {
            P037K8_A396EmprCod, P037K8_A8197PArId, P037K8_A8233PArCruPin, P037K8_n8233PArCruPin, P037K8_A8232PArCruDib, P037K8_n8232PArCruDib, P037K8_A8234PArCruMtr, P037K8_n8234PArCruMtr, P037K8_A8225ParCruLin
            }
            , new Object[] {
            P037K9_A396EmprCod, P037K9_A8197PArId, P037K9_A8250PArEstDib, P037K9_A8251PArEstPin, P037K9_A8254PArEstPie, P037K9_n8254PArEstPie, P037K9_A8255PArEstMtr, P037K9_n8255PArEstMtr
            }
            , new Object[] {
            P037K10_A396EmprCod, P037K10_A8197PArId, P037K10_A8298PArPEsDib, P037K10_A8299PArPEsPin, P037K10_A8300PArPEsImp, P037K10_n8300PArPEsImp
            }
            , new Object[] {
            P037K11_A396EmprCod, P037K11_A252CliCod, P037K11_A65ArtCod, P037K11_A758ProCod
            }
            , new Object[] {
            P037K12_A396EmprCod, P037K12_A8197PArId, P037K12_A8285PArAcaFasC, P037K12_A8292PArAcaImpM, P037K12_n8292PArAcaImpM, P037K12_A8291PArAcaImpK, P037K12_n8291PArAcaImpK
            }
            , new Object[] {
            P037K13_A396EmprCod, P037K13_A457FasCod, P037K13_A7744FasPreObl, P037K13_n7744FasPreObl
            }
            , new Object[] {
            P037K14_A396EmprCod, P037K14_A8197PArId, P037K14_A8308PArPAdImpM, P037K14_n8308PArPAdImpM, P037K14_A8307PArPAdImpK, P037K14_n8307PArPAdImpK, P037K14_A8306PArPAdImp, P037K14_n8306PArPAdImp, P037K14_A8301PArPAdFas, P037K14_A8304PArPAdAdiC
            }
            , new Object[] {
            P037K15_A396EmprCod, P037K15_A457FasCod, P037K15_A4903FasAcab, P037K15_n4903FasAcab, P037K15_A758ProCod, P037K15_A252CliCod, P037K15_A65ArtCod
            }
            , new Object[] {
            P037K16_A396EmprCod, P037K16_A8197PArId, P037K16_A8285PArAcaFasC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Ok ;
   private byte A8220PArTin ;
   private byte A8219PArEst ;
   private byte AV35GXLvl40 ;
   private byte A8246PArColInt ;
   private byte AV36GXLvl46 ;
   private byte A8245PArColDes ;
   private byte AV37GXLvl51 ;
   private byte A831TipColCod ;
   private byte AV21IntCod ;
   private byte AV38GXLvl63 ;
   private byte A8293PArPTeInt ;
   private byte AV41GXLvl99 ;
   private byte AV42GXLvl104 ;
   private byte A7744FasPreObl ;
   private byte AV48GXLvl153 ;
   private short A8225ParCruLin ;
   private short AV20PArColPie ;
   private short A8244PArColPie ;
   private short AV23PArEstPie ;
   private short A8254PArEstPie ;
   private short A8304PArPAdAdiC ;
   private short Gx_err ;
   private int A8197PArId ;
   private int A8205PArCliCod ;
   private int A8231PArCruColN ;
   private int AV26PArCruColN ;
   private int A8243PArColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A8297PArPTeImp ;
   private int A8300PArPEsImp ;
   private int A8292PArAcaImpM ;
   private int A8291PArAcaImpK ;
   private int A8308PArPAdImpM ;
   private int A8307PArPAdImpK ;
   private int A8306PArPAdImp ;
   private java.math.BigDecimal A8235ParCruKgs ;
   private java.math.BigDecimal A8234PArCruMtr ;
   private java.math.BigDecimal AV18PArColKgm ;
   private java.math.BigDecimal AV19PArColMtr ;
   private java.math.BigDecimal A8248PArColMtr ;
   private java.math.BigDecimal A8249PArColKgm ;
   private java.math.BigDecimal AV22PArEstMtr ;
   private java.math.BigDecimal A8255PArEstMtr ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A8208PArArtTCod ;
   private String A8230PArCruCol ;
   private String AV25PArCruCol ;
   private String A8242PArColNom ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A8233PArCruPin ;
   private String A8232PArCruDib ;
   private String AV27PArCruDib ;
   private String AV28PArCruPin ;
   private String A8250PArEstDib ;
   private String A8251PArEstPin ;
   private String A8298PArPEsDib ;
   private String A8299PArPEsPin ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String AV24ProCod ;
   private String A8285PArAcaFasC ;
   private String A457FasCod ;
   private String A8301PArPAdFas ;
   private String A4903FasAcab ;
   private boolean n8208PArArtTCod ;
   private boolean n8205PArCliCod ;
   private boolean n8220PArTin ;
   private boolean n8219PArEst ;
   private boolean brk37K3 ;
   private boolean n8231PArCruColN ;
   private boolean n8230PArCruCol ;
   private boolean n8235ParCruKgs ;
   private boolean n8234PArCruMtr ;
   private boolean n8246PArColInt ;
   private boolean n8244PArColPie ;
   private boolean n8248PArColMtr ;
   private boolean n8249PArColKgm ;
   private boolean n8245PArColDes ;
   private boolean n8297PArPTeImp ;
   private boolean brk37K9 ;
   private boolean n8233PArCruPin ;
   private boolean n8232PArCruDib ;
   private boolean n8254PArEstPie ;
   private boolean n8255PArEstMtr ;
   private boolean n8300PArPEsImp ;
   private boolean returnInSub ;
   private boolean n8292PArAcaImpM ;
   private boolean n8291PArAcaImpK ;
   private boolean n7744FasPreObl ;
   private boolean n8308PArPAdImpM ;
   private boolean n8307PArPAdImpK ;
   private boolean n8306PArPAdImp ;
   private boolean n4903FasAcab ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P037K2_A396EmprCod ;
   private int[] P037K2_A8197PArId ;
   private String[] P037K2_A8208PArArtTCod ;
   private boolean[] P037K2_n8208PArArtTCod ;
   private int[] P037K2_A8205PArCliCod ;
   private boolean[] P037K2_n8205PArCliCod ;
   private byte[] P037K2_A8220PArTin ;
   private boolean[] P037K2_n8220PArTin ;
   private byte[] P037K2_A8219PArEst ;
   private boolean[] P037K2_n8219PArEst ;
   private String[] P037K3_A396EmprCod ;
   private int[] P037K3_A8197PArId ;
   private int[] P037K3_A8231PArCruColN ;
   private boolean[] P037K3_n8231PArCruColN ;
   private String[] P037K3_A8230PArCruCol ;
   private boolean[] P037K3_n8230PArCruCol ;
   private java.math.BigDecimal[] P037K3_A8235ParCruKgs ;
   private boolean[] P037K3_n8235ParCruKgs ;
   private java.math.BigDecimal[] P037K3_A8234PArCruMtr ;
   private boolean[] P037K3_n8234PArCruMtr ;
   private short[] P037K3_A8225ParCruLin ;
   private String[] P037K4_A396EmprCod ;
   private int[] P037K4_A8197PArId ;
   private String[] P037K4_A8242PArColNom ;
   private int[] P037K4_A8243PArColNum ;
   private byte[] P037K4_A8246PArColInt ;
   private boolean[] P037K4_n8246PArColInt ;
   private String[] P037K5_A396EmprCod ;
   private int[] P037K5_A8197PArId ;
   private String[] P037K5_A8242PArColNom ;
   private int[] P037K5_A8243PArColNum ;
   private byte[] P037K5_A8246PArColInt ;
   private boolean[] P037K5_n8246PArColInt ;
   private int[] P037K5_A8205PArCliCod ;
   private boolean[] P037K5_n8205PArCliCod ;
   private String[] P037K5_A8208PArArtTCod ;
   private boolean[] P037K5_n8208PArArtTCod ;
   private short[] P037K5_A8244PArColPie ;
   private boolean[] P037K5_n8244PArColPie ;
   private java.math.BigDecimal[] P037K5_A8248PArColMtr ;
   private boolean[] P037K5_n8248PArColMtr ;
   private java.math.BigDecimal[] P037K5_A8249PArColKgm ;
   private boolean[] P037K5_n8249PArColKgm ;
   private byte[] P037K5_A8245PArColDes ;
   private boolean[] P037K5_n8245PArColDes ;
   private String[] P037K6_A396EmprCod ;
   private String[] P037K6_A494ForSer ;
   private int[] P037K6_A252CliCod ;
   private String[] P037K6_A482ForColNom ;
   private int[] P037K6_A483ForColNum ;
   private byte[] P037K6_A831TipColCod ;
   private String[] P037K7_A396EmprCod ;
   private int[] P037K7_A8197PArId ;
   private byte[] P037K7_A8293PArPTeInt ;
   private int[] P037K7_A8297PArPTeImp ;
   private boolean[] P037K7_n8297PArPTeImp ;
   private String[] P037K8_A396EmprCod ;
   private int[] P037K8_A8197PArId ;
   private String[] P037K8_A8233PArCruPin ;
   private boolean[] P037K8_n8233PArCruPin ;
   private String[] P037K8_A8232PArCruDib ;
   private boolean[] P037K8_n8232PArCruDib ;
   private java.math.BigDecimal[] P037K8_A8234PArCruMtr ;
   private boolean[] P037K8_n8234PArCruMtr ;
   private short[] P037K8_A8225ParCruLin ;
   private String[] P037K9_A396EmprCod ;
   private int[] P037K9_A8197PArId ;
   private String[] P037K9_A8250PArEstDib ;
   private String[] P037K9_A8251PArEstPin ;
   private short[] P037K9_A8254PArEstPie ;
   private boolean[] P037K9_n8254PArEstPie ;
   private java.math.BigDecimal[] P037K9_A8255PArEstMtr ;
   private boolean[] P037K9_n8255PArEstMtr ;
   private String[] P037K10_A396EmprCod ;
   private int[] P037K10_A8197PArId ;
   private String[] P037K10_A8298PArPEsDib ;
   private String[] P037K10_A8299PArPEsPin ;
   private int[] P037K10_A8300PArPEsImp ;
   private boolean[] P037K10_n8300PArPEsImp ;
   private String[] P037K11_A396EmprCod ;
   private int[] P037K11_A252CliCod ;
   private String[] P037K11_A65ArtCod ;
   private String[] P037K11_A758ProCod ;
   private String[] P037K12_A396EmprCod ;
   private int[] P037K12_A8197PArId ;
   private String[] P037K12_A8285PArAcaFasC ;
   private int[] P037K12_A8292PArAcaImpM ;
   private boolean[] P037K12_n8292PArAcaImpM ;
   private int[] P037K12_A8291PArAcaImpK ;
   private boolean[] P037K12_n8291PArAcaImpK ;
   private String[] P037K13_A396EmprCod ;
   private String[] P037K13_A457FasCod ;
   private byte[] P037K13_A7744FasPreObl ;
   private boolean[] P037K13_n7744FasPreObl ;
   private String[] P037K14_A396EmprCod ;
   private int[] P037K14_A8197PArId ;
   private int[] P037K14_A8308PArPAdImpM ;
   private boolean[] P037K14_n8308PArPAdImpM ;
   private int[] P037K14_A8307PArPAdImpK ;
   private boolean[] P037K14_n8307PArPAdImpK ;
   private int[] P037K14_A8306PArPAdImp ;
   private boolean[] P037K14_n8306PArPAdImp ;
   private String[] P037K14_A8301PArPAdFas ;
   private short[] P037K14_A8304PArPAdAdiC ;
   private String[] P037K15_A396EmprCod ;
   private String[] P037K15_A457FasCod ;
   private String[] P037K15_A4903FasAcab ;
   private boolean[] P037K15_n4903FasAcab ;
   private String[] P037K15_A758ProCod ;
   private int[] P037K15_A252CliCod ;
   private String[] P037K15_A65ArtCod ;
   private String[] P037K16_A396EmprCod ;
   private int[] P037K16_A8197PArId ;
   private String[] P037K16_A8285PArAcaFasC ;
}

final  class ppedartc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037K2", "SELECT EmprCod, PArId, PArArtTCod, PArCliCod, PArTin, PArEst FROM TXPPedArt WHERE EmprCod = ? and PArId = ? ORDER BY EmprCod, PArId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037K3", "SELECT EmprCod, PArId, PArCruColN, PArCruCol, ParCruKgs, PArCruMtr, ParCruLin FROM TXPPedAr1 WHERE EmprCod = ? and PArId = ? ORDER BY PArCruCol, PArCruColN ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037K4", "SELECT EmprCod, PArId, PArColNom, PArColNum, PArColInt FROM TXPPedAr2 WHERE (EmprCod = ? and PArId = ? and PArColNom = ? and PArColNum = ?) AND (PArColInt = 0) ORDER BY EmprCod, PArId, PArColNom, PArColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037K5", "SELECT T1.EmprCod, T1.PArId, T1.PArColNom, T1.PArColNum, T1.PArColInt, T2.PArCliCod, T2.PArArtTCod, T1.PArColPie, T1.PArColMtr, T1.PArColKgm, T1.PArColDes FROM (TXPPedAr2 T1 INNER JOIN TXPPedArt T2 ON T2.EmprCod = T1.EmprCod AND T2.PArId = T1.PArId) WHERE T1.EmprCod = ? and T1.PArId = ? and T1.PArColNom = ? and T1.PArColNum = ? ORDER BY T1.EmprCod, T1.PArId, T1.PArColNom, T1.PArColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037K6", "SELECT EmprCod, ForSer, CliCod, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037K7", "SELECT EmprCod, PArId, PArPTeInt, PArPTeImp FROM TXPPedAr5 WHERE (EmprCod = ? and PArId = ? and PArPTeInt = ?) AND (? = 0) ORDER BY EmprCod, PArId, PArPTeInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037K8", "SELECT EmprCod, PArId, PArCruPin, PArCruDib, PArCruMtr, ParCruLin FROM TXPPedAr1 WHERE (EmprCod = ?) AND (PArId = ?) ORDER BY PArCruDib, PArCruPin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037K9", "SELECT EmprCod, PArId, PArEstDib, PArEstPin, PArEstPie, PArEstMtr FROM TXPPedAr3 WHERE (EmprCod = ? and PArId = ? and PArEstDib = ? and PArEstPin = ?) AND (PArEstMtr = ?) AND (PArEstPie = ?) ORDER BY EmprCod, PArId, PArEstDib, PArEstPin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037K10", "SELECT EmprCod, PArId, PArPEsDib, PArPEsPin, PArPEsImp FROM TXPPedAr6 WHERE EmprCod = ? and PArId = ? and PArPEsDib = ? and PArPEsPin = ? ORDER BY EmprCod, PArId, PArPEsDib, PArPEsPin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037K11", "SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? = 0) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037K12", "SELECT EmprCod, PArId, PArAcaFasC, PArAcaImpM, PArAcaImpK FROM TXPPedAr4 WHERE (EmprCod = ? and PArId = ?) AND (PArAcaImpK <= 0) AND (PArAcaImpM <= 0) AND (? = 0) ORDER BY EmprCod, PArId, PArAcaFasC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037K13", "SELECT EmprCod, FasCod, FasPreObl FROM TXPFASPRO WHERE (EmprCod = ? and FasCod = ?) AND (FasPreObl = 1) ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037K14", "SELECT EmprCod, PArId, PArPAdImpM, PArPAdImpK, PArPAdImp, PArPAdFas, PArPAdAdiC FROM TXPPedAr7 WHERE (EmprCod = ? and PArId = ?) AND (PArPAdImp <= 0) AND (PArPAdImpK <= 0) AND (PArPAdImpM <= 0) AND (? = 0) ORDER BY EmprCod, PArId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037K15", "SELECT T1.EmprCod, T1.FasCod, T2.FasAcab, T1.ProCod, T1.CliCod, T1.ArtCod FROM (TXPSERPAU T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ?) AND (T1.ProCod = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037K16", "SELECT EmprCod, PArId, PArAcaFasC FROM TXPPedAr4 WHERE EmprCod = ? and PArId = ? and PArAcaFasC = ? ORDER BY EmprCod, PArId, PArAcaFasC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 13);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 13);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 13);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 12);
               }
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

