package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmacprh extends GXProcedure
{
   public pmacprh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmacprh.class ), "" );
   }

   public pmacprh( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      pmacprh.this.A396EmprCod = aP0;
      pmacprh.this.AV17MacProCod = aP1;
      pmacprh.this.Gx_mode = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 ) || ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DLT", "")) == 0 ) )
      {
         /* Using cursor P01R02 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV17MacProCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A764ProForCod = P01R02_A764ProForCod[0] ;
            /* Optimized DELETE. */
            /* Using cursor P01R03 */
            pr_default.execute(1, new Object[] {A396EmprCod, A764ProForCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
            /* End optimized DELETE. */
            /* Using cursor P01R04 */
            pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      if ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 ) || ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 ) )
      {
         /* Using cursor P01R05 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV17MacProCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1515MacProDsc = P01R05_A1515MacProDsc[0] ;
            A5424MacProTmx = P01R05_A5424MacProTmx[0] ;
            n5424MacProTmx = P01R05_n5424MacProTmx[0] ;
            A5425MacProMat = P01R05_A5425MacProMat[0] ;
            n5425MacProMat = P01R05_n5425MacProMat[0] ;
            A1514MacProCod = P01R05_A1514MacProCod[0] ;
            GXt_int1 = A3602MacTotTie ;
            GXv_char2[0] = A396EmprCod ;
            GXv_char3[0] = A1514MacProCod ;
            GXv_int4[0] = GXt_int1 ;
            new app.ptotmac(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
            pmacprh.this.A396EmprCod = GXv_char2[0] ;
            pmacprh.this.A1514MacProCod = GXv_char3[0] ;
            pmacprh.this.GXt_int1 = GXv_int4[0] ;
            A3602MacTotTie = GXt_int1 ;
            AV18MacProDsc = A1515MacProDsc ;
            AV19MacTotTie = A3602MacTotTie ;
            AV27MacProTmx = A5424MacProTmx ;
            AV28MacProMat = A5425MacProMat ;
            AV22MacProNro = (byte)(0) ;
            AV23ProForLin = (short)(0) ;
            AV16ProUltLin = (short)(0) ;
            AV24Proceso = (byte)(0) ;
            /* Using cursor P01R06 */
            pr_default.execute(4, new Object[] {A396EmprCod, A1514MacProCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A764ProForCod = P01R06_A764ProForCod[0] ;
               A1517MacProLin = P01R06_A1517MacProLin[0] ;
               AV20ProForCod = A764ProForCod ;
               AV24Proceso = (byte)(AV24Proceso+1) ;
               /* Execute user subroutine: 'INS_PROCESO' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(3);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INS_PROCESO' Routine */
      returnInSub = false ;
      /* Using cursor P01R07 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV20ProForCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A3005ProRev = P01R07_A3005ProRev[0] ;
         A2393ProNumRec = P01R07_A2393ProNumRec[0] ;
         A2392ProNumPro = P01R07_A2392ProNumPro[0] ;
         A769ProForMat = P01R07_A769ProForMat[0] ;
         A772ProForTmx = P01R07_A772ProForTmx[0] ;
         A771ProForTie = P01R07_A771ProForTie[0] ;
         A766ProForDsc = P01R07_A766ProForDsc[0] ;
         A764ProForCod = P01R07_A764ProForCod[0] ;
         A13936ProForRs = P01R07_A13936ProForRs[0] ;
         A13133ProForAct = P01R07_A13133ProForAct[0] ;
         A12109ProNh2o = P01R07_A12109ProNh2o[0] ;
         n12109ProNh2o = P01R07_n12109ProNh2o[0] ;
         A3589ProForMer = P01R07_A3589ProForMer[0] ;
         A10547ProH2O = P01R07_A10547ProH2O[0] ;
         A10120ProforVl = P01R07_A10120ProforVl[0] ;
         A8528ProForCos = P01R07_A8528ProForCos[0] ;
         A8527ProForAbs = P01R07_A8527ProForAbs[0] ;
         A6877ProForPhn = P01R07_A6877ProForPhn[0] ;
         n6877ProForPhn = P01R07_n6877ProForPhn[0] ;
         A6876ProForPhx = P01R07_A6876ProForPhx[0] ;
         n6876ProForPhx = P01R07_n6876ProForPhx[0] ;
         A6610ProForCol = P01R07_A6610ProForCol[0] ;
         n6610ProForCol = P01R07_n6610ProForCol[0] ;
         A6061ProForLab = P01R07_A6061ProForLab[0] ;
         A6018ProForFab = P01R07_A6018ProForFab[0] ;
         n6018ProForFab = P01R07_n6018ProForFab[0] ;
         A5523ProForTip = P01R07_A5523ProForTip[0] ;
         A5436IntCodF2 = P01R07_A5436IntCodF2[0] ;
         n5436IntCodF2 = P01R07_n5436IntCodF2[0] ;
         A5465ProForFac = P01R07_A5465ProForFac[0] ;
         n5465ProForFac = P01R07_n5465ProForFac[0] ;
         A5190ProFoLCU = P01R07_A5190ProFoLCU[0] ;
         n5190ProFoLCU = P01R07_n5190ProFoLCU[0] ;
         A4865ProForDCi = P01R07_A4865ProForDCi[0] ;
         A4864ProForCCi = P01R07_A4864ProForCCi[0] ;
         A4715ProForDsc2 = P01R07_A4715ProForDsc2[0] ;
         A4706ProForRb = P01R07_A4706ProForRb[0] ;
         A4705ProForPau = P01R07_A4705ProForPau[0] ;
         A4586ProForObs = P01R07_A4586ProForObs[0] ;
         n4586ProForObs = P01R07_n4586ProForObs[0] ;
         A773ProForUli = P01R07_A773ProForUli[0] ;
         A674PorForFul = P01R07_A674PorForFul[0] ;
         W764ProForCod = A764ProForCod ;
         /*
            INSERT RECORD ON TABLE TXPCPROFO

         */
         W764ProForCod = A764ProForCod ;
         W766ProForDsc = A766ProForDsc ;
         W771ProForTie = A771ProForTie ;
         W772ProForTmx = A772ProForTmx ;
         W769ProForMat = A769ProForMat ;
         W2392ProNumPro = A2392ProNumPro ;
         W2393ProNumRec = A2393ProNumRec ;
         W3005ProRev = A3005ProRev ;
         A764ProForCod = AV17MacProCod ;
         A766ProForDsc = AV18MacProDsc ;
         A771ProForTie = (short)(AV19MacTotTie) ;
         A772ProForTmx = AV27MacProTmx ;
         A769ProForMat = AV28MacProMat ;
         A2392ProNumPro = 0 ;
         A2393ProNumRec = 0 ;
         A3005ProRev = httpContext.getMessage( "N", "") ;
         /* Using cursor P01R08 */
         pr_default.execute(6, new Object[] {A396EmprCod, A764ProForCod, A766ProForDsc, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Boolean.valueOf(n4586ProForObs), A4586ProForObs, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4715ProForDsc2, A4864ProForCCi, A4865ProForDCi, Boolean.valueOf(n5190ProFoLCU), Short.valueOf(A5190ProFoLCU), Boolean.valueOf(n5465ProForFac), A5465ProForFac, Boolean.valueOf(n5436IntCodF2), Short.valueOf(A5436IntCodF2), A5523ProForTip, Boolean.valueOf(n6018ProForFab), A6018ProForFab, A6061ProForLab, Boolean.valueOf(n6610ProForCol), A6610ProForCol, Boolean.valueOf(n6876ProForPhx), A6876ProForPhx, Boolean.valueOf(n6877ProForPhn), A6877ProForPhn, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, Boolean.valueOf(n12109ProNh2o), Short.valueOf(A12109ProNh2o), A13133ProForAct, A13936ProForRs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
         if ( (pr_default.getStatus(6) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A764ProForCod = W764ProForCod ;
         A766ProForDsc = W766ProForDsc ;
         A771ProForTie = W771ProForTie ;
         A772ProForTmx = W772ProForTmx ;
         A769ProForMat = W769ProForMat ;
         A2392ProNumPro = W2392ProNumPro ;
         A2393ProNumRec = W2393ProNumRec ;
         A3005ProRev = W3005ProRev ;
         /* End Insert */
         /* Using cursor P01R09 */
         pr_default.execute(7, new Object[] {A396EmprCod, A764ProForCod});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A13178ProForFT = P01R09_A13178ProForFT[0] ;
            A1645ProForNro = P01R09_A1645ProForNro[0] ;
            A767ProForLin = P01R09_A767ProForLin[0] ;
            A13111ProForDe2 = P01R09_A13111ProForDe2[0] ;
            A765ProForDes = P01R09_A765ProForDes[0] ;
            A6062ProForCPo = P01R09_A6062ProForCPo[0] ;
            A5358ProForClv = P01R09_A5358ProForClv[0] ;
            A3379ProForTnq = P01R09_A3379ProForTnq[0] ;
            A763ProForCla = P01R09_A763ProForCla[0] ;
            A762ProForCan = P01R09_A762ProForCan[0] ;
            A490ForPrdUMe = P01R09_A490ForPrdUMe[0] ;
            A770ProForPrd = P01R09_A770ProForPrd[0] ;
            W764ProForCod = A764ProForCod ;
            AV21ProForNro = A1645ProForNro ;
            AV23ProForLin = (short)(AV23ProForLin+50) ;
            /*
               INSERT RECORD ON TABLE TXPLPROFO

            */
            W764ProForCod = A764ProForCod ;
            W767ProForLin = A767ProForLin ;
            W1645ProForNro = A1645ProForNro ;
            W1645ProForNro = A1645ProForNro ;
            W1645ProForNro = A1645ProForNro ;
            W13178ProForFT = A13178ProForFT ;
            A764ProForCod = AV17MacProCod ;
            A767ProForLin = AV23ProForLin ;
            if ( ! (0==AV21ProForNro) )
            {
               if ( AV24Proceso == 1 )
               {
                  A1645ProForNro = AV21ProForNro ;
                  AV26UltMacNro = AV21ProForNro ;
               }
               else
               {
                  if ( AV21ProForNro == AV25UltProNro )
                  {
                     A1645ProForNro = AV26UltMacNro ;
                  }
                  else
                  {
                     A1645ProForNro = (byte)(AV26UltMacNro+1) ;
                  }
                  AV26UltMacNro = A1645ProForNro ;
               }
            }
            A13178ProForFT = AV20ProForCod ;
            /* Using cursor P01R010 */
            pr_default.execute(8, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin), A770ProForPrd, Byte.valueOf(A490ForPrdUMe), A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A5358ProForClv, A6062ProForCPo, A765ProForDes, A13178ProForFT, A13111ProForDe2});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
            if ( (pr_default.getStatus(8) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A764ProForCod = W764ProForCod ;
            A767ProForLin = W767ProForLin ;
            A1645ProForNro = W1645ProForNro ;
            A1645ProForNro = W1645ProForNro ;
            A1645ProForNro = W1645ProForNro ;
            A13178ProForFT = W13178ProForFT ;
            /* End Insert */
            AV25UltProNro = AV21ProForNro ;
            A764ProForCod = W764ProForCod ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         A764ProForCod = W764ProForCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      /* Optimized UPDATE. */
      /* Using cursor P01R011 */
      pr_default.execute(9, new Object[] {Short.valueOf(AV23ProForLin), A396EmprCod, AV17MacProCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pmacprh");
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
      P01R02_A396EmprCod = new String[] {""} ;
      P01R02_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      P01R05_A1515MacProDsc = new String[] {""} ;
      P01R05_A5424MacProTmx = new short[1] ;
      P01R05_n5424MacProTmx = new boolean[] {false} ;
      P01R05_A5425MacProMat = new String[] {""} ;
      P01R05_n5425MacProMat = new boolean[] {false} ;
      P01R05_A396EmprCod = new String[] {""} ;
      P01R05_A1514MacProCod = new String[] {""} ;
      A1515MacProDsc = "" ;
      A5425MacProMat = "" ;
      A1514MacProCod = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV18MacProDsc = "" ;
      AV28MacProMat = "" ;
      P01R06_A396EmprCod = new String[] {""} ;
      P01R06_A1514MacProCod = new String[] {""} ;
      P01R06_A764ProForCod = new String[] {""} ;
      P01R06_A1517MacProLin = new short[1] ;
      AV20ProForCod = "" ;
      P01R07_A396EmprCod = new String[] {""} ;
      P01R07_A3005ProRev = new String[] {""} ;
      P01R07_A2393ProNumRec = new int[1] ;
      P01R07_A2392ProNumPro = new int[1] ;
      P01R07_A769ProForMat = new String[] {""} ;
      P01R07_A772ProForTmx = new short[1] ;
      P01R07_A771ProForTie = new short[1] ;
      P01R07_A766ProForDsc = new String[] {""} ;
      P01R07_A764ProForCod = new String[] {""} ;
      P01R07_A13936ProForRs = new String[] {""} ;
      P01R07_A13133ProForAct = new String[] {""} ;
      P01R07_A12109ProNh2o = new short[1] ;
      P01R07_n12109ProNh2o = new boolean[] {false} ;
      P01R07_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R07_A10547ProH2O = new short[1] ;
      P01R07_A10120ProforVl = new int[1] ;
      P01R07_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R07_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R07_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R07_n6877ProForPhn = new boolean[] {false} ;
      P01R07_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R07_n6876ProForPhx = new boolean[] {false} ;
      P01R07_A6610ProForCol = new String[] {""} ;
      P01R07_n6610ProForCol = new boolean[] {false} ;
      P01R07_A6061ProForLab = new String[] {""} ;
      P01R07_A6018ProForFab = new String[] {""} ;
      P01R07_n6018ProForFab = new boolean[] {false} ;
      P01R07_A5523ProForTip = new String[] {""} ;
      P01R07_A5436IntCodF2 = new short[1] ;
      P01R07_n5436IntCodF2 = new boolean[] {false} ;
      P01R07_A5465ProForFac = new String[] {""} ;
      P01R07_n5465ProForFac = new boolean[] {false} ;
      P01R07_A5190ProFoLCU = new short[1] ;
      P01R07_n5190ProFoLCU = new boolean[] {false} ;
      P01R07_A4865ProForDCi = new String[] {""} ;
      P01R07_A4864ProForCCi = new String[] {""} ;
      P01R07_A4715ProForDsc2 = new String[] {""} ;
      P01R07_A4706ProForRb = new short[1] ;
      P01R07_A4705ProForPau = new short[1] ;
      P01R07_A4586ProForObs = new String[] {""} ;
      P01R07_n4586ProForObs = new boolean[] {false} ;
      P01R07_A773ProForUli = new short[1] ;
      P01R07_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      A3005ProRev = "" ;
      A769ProForMat = "" ;
      A766ProForDsc = "" ;
      A13936ProForRs = "" ;
      A13133ProForAct = "" ;
      A3589ProForMer = DecimalUtil.ZERO ;
      A8528ProForCos = DecimalUtil.ZERO ;
      A8527ProForAbs = DecimalUtil.ZERO ;
      A6877ProForPhn = DecimalUtil.ZERO ;
      A6876ProForPhx = DecimalUtil.ZERO ;
      A6610ProForCol = "" ;
      A6061ProForLab = "" ;
      A6018ProForFab = "" ;
      A5523ProForTip = "" ;
      A5465ProForFac = "" ;
      A4865ProForDCi = "" ;
      A4864ProForCCi = "" ;
      A4715ProForDsc2 = "" ;
      A4586ProForObs = "" ;
      A674PorForFul = GXutil.nullDate() ;
      W764ProForCod = "" ;
      W766ProForDsc = "" ;
      W769ProForMat = "" ;
      W3005ProRev = "" ;
      Gx_emsg = "" ;
      P01R09_A396EmprCod = new String[] {""} ;
      P01R09_A764ProForCod = new String[] {""} ;
      P01R09_A13178ProForFT = new String[] {""} ;
      P01R09_A1645ProForNro = new byte[1] ;
      P01R09_A767ProForLin = new short[1] ;
      P01R09_A13111ProForDe2 = new String[] {""} ;
      P01R09_A765ProForDes = new String[] {""} ;
      P01R09_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R09_A5358ProForClv = new String[] {""} ;
      P01R09_A3379ProForTnq = new byte[1] ;
      P01R09_A763ProForCla = new String[] {""} ;
      P01R09_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R09_A490ForPrdUMe = new byte[1] ;
      P01R09_A770ProForPrd = new String[] {""} ;
      A13178ProForFT = "" ;
      A13111ProForDe2 = "" ;
      A765ProForDes = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A5358ProForClv = "" ;
      A763ProForCla = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A770ProForPrd = "" ;
      W13178ProForFT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmacprh__default(),
         new Object[] {
             new Object[] {
            P01R02_A396EmprCod, P01R02_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01R05_A1515MacProDsc, P01R05_A5424MacProTmx, P01R05_n5424MacProTmx, P01R05_A5425MacProMat, P01R05_n5425MacProMat, P01R05_A396EmprCod, P01R05_A1514MacProCod
            }
            , new Object[] {
            P01R06_A396EmprCod, P01R06_A1514MacProCod, P01R06_A764ProForCod, P01R06_A1517MacProLin
            }
            , new Object[] {
            P01R07_A396EmprCod, P01R07_A3005ProRev, P01R07_A2393ProNumRec, P01R07_A2392ProNumPro, P01R07_A769ProForMat, P01R07_A772ProForTmx, P01R07_A771ProForTie, P01R07_A766ProForDsc, P01R07_A764ProForCod, P01R07_A13936ProForRs,
            P01R07_A13133ProForAct, P01R07_A12109ProNh2o, P01R07_n12109ProNh2o, P01R07_A3589ProForMer, P01R07_A10547ProH2O, P01R07_A10120ProforVl, P01R07_A8528ProForCos, P01R07_A8527ProForAbs, P01R07_A6877ProForPhn, P01R07_n6877ProForPhn,
            P01R07_A6876ProForPhx, P01R07_n6876ProForPhx, P01R07_A6610ProForCol, P01R07_n6610ProForCol, P01R07_A6061ProForLab, P01R07_A6018ProForFab, P01R07_n6018ProForFab, P01R07_A5523ProForTip, P01R07_A5436IntCodF2, P01R07_n5436IntCodF2,
            P01R07_A5465ProForFac, P01R07_n5465ProForFac, P01R07_A5190ProFoLCU, P01R07_n5190ProFoLCU, P01R07_A4865ProForDCi, P01R07_A4864ProForCCi, P01R07_A4715ProForDsc2, P01R07_A4706ProForRb, P01R07_A4705ProForPau, P01R07_A4586ProForObs,
            P01R07_n4586ProForObs, P01R07_A773ProForUli, P01R07_A674PorForFul
            }
            , new Object[] {
            }
            , new Object[] {
            P01R09_A396EmprCod, P01R09_A764ProForCod, P01R09_A13178ProForFT, P01R09_A1645ProForNro, P01R09_A767ProForLin, P01R09_A13111ProForDe2, P01R09_A765ProForDes, P01R09_A6062ProForCPo, P01R09_A5358ProForClv, P01R09_A3379ProForTnq,
            P01R09_A763ProForCla, P01R09_A762ProForCan, P01R09_A490ForPrdUMe, P01R09_A770ProForPrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22MacProNro ;
   private byte AV24Proceso ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte A490ForPrdUMe ;
   private byte AV21ProForNro ;
   private byte W1645ProForNro ;
   private byte AV26UltMacNro ;
   private byte AV25UltProNro ;
   private short A5424MacProTmx ;
   private short AV27MacProTmx ;
   private short AV23ProForLin ;
   private short AV16ProUltLin ;
   private short A1517MacProLin ;
   private short A772ProForTmx ;
   private short A771ProForTie ;
   private short A12109ProNh2o ;
   private short A10547ProH2O ;
   private short A5436IntCodF2 ;
   private short A5190ProFoLCU ;
   private short A4706ProForRb ;
   private short A4705ProForPau ;
   private short A773ProForUli ;
   private short W771ProForTie ;
   private short W772ProForTmx ;
   private short Gx_err ;
   private short A767ProForLin ;
   private short W767ProForLin ;
   private int A3602MacTotTie ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private int AV19MacTotTie ;
   private int A2393ProNumRec ;
   private int A2392ProNumPro ;
   private int A10120ProforVl ;
   private int GX_INS89 ;
   private int W2392ProNumPro ;
   private int W2393ProNumRec ;
   private int GX_INS90 ;
   private java.math.BigDecimal A3589ProForMer ;
   private java.math.BigDecimal A8528ProForCos ;
   private java.math.BigDecimal A8527ProForAbs ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private String A396EmprCod ;
   private String AV17MacProCod ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A1515MacProDsc ;
   private String A5425MacProMat ;
   private String A1514MacProCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV18MacProDsc ;
   private String AV28MacProMat ;
   private String AV20ProForCod ;
   private String A3005ProRev ;
   private String A769ProForMat ;
   private String A766ProForDsc ;
   private String A13936ProForRs ;
   private String A13133ProForAct ;
   private String A6610ProForCol ;
   private String A6061ProForLab ;
   private String A6018ProForFab ;
   private String A5523ProForTip ;
   private String A5465ProForFac ;
   private String A4865ProForDCi ;
   private String A4864ProForCCi ;
   private String A4715ProForDsc2 ;
   private String W764ProForCod ;
   private String W766ProForDsc ;
   private String W769ProForMat ;
   private String W3005ProRev ;
   private String Gx_emsg ;
   private String A13178ProForFT ;
   private String A13111ProForDe2 ;
   private String A765ProForDes ;
   private String A5358ProForClv ;
   private String A763ProForCla ;
   private String A770ProForPrd ;
   private String W13178ProForFT ;
   private java.util.Date A674PorForFul ;
   private boolean n5424MacProTmx ;
   private boolean n5425MacProMat ;
   private boolean returnInSub ;
   private boolean n12109ProNh2o ;
   private boolean n6877ProForPhn ;
   private boolean n6876ProForPhx ;
   private boolean n6610ProForCol ;
   private boolean n6018ProForFab ;
   private boolean n5436IntCodF2 ;
   private boolean n5465ProForFac ;
   private boolean n5190ProFoLCU ;
   private boolean n4586ProForObs ;
   private String A4586ProForObs ;
   private IDataStoreProvider pr_default ;
   private String[] P01R02_A396EmprCod ;
   private String[] P01R02_A764ProForCod ;
   private String[] P01R05_A1515MacProDsc ;
   private short[] P01R05_A5424MacProTmx ;
   private boolean[] P01R05_n5424MacProTmx ;
   private String[] P01R05_A5425MacProMat ;
   private boolean[] P01R05_n5425MacProMat ;
   private String[] P01R05_A396EmprCod ;
   private String[] P01R05_A1514MacProCod ;
   private String[] P01R06_A396EmprCod ;
   private String[] P01R06_A1514MacProCod ;
   private String[] P01R06_A764ProForCod ;
   private short[] P01R06_A1517MacProLin ;
   private String[] P01R07_A396EmprCod ;
   private String[] P01R07_A3005ProRev ;
   private int[] P01R07_A2393ProNumRec ;
   private int[] P01R07_A2392ProNumPro ;
   private String[] P01R07_A769ProForMat ;
   private short[] P01R07_A772ProForTmx ;
   private short[] P01R07_A771ProForTie ;
   private String[] P01R07_A766ProForDsc ;
   private String[] P01R07_A764ProForCod ;
   private String[] P01R07_A13936ProForRs ;
   private String[] P01R07_A13133ProForAct ;
   private short[] P01R07_A12109ProNh2o ;
   private boolean[] P01R07_n12109ProNh2o ;
   private java.math.BigDecimal[] P01R07_A3589ProForMer ;
   private short[] P01R07_A10547ProH2O ;
   private int[] P01R07_A10120ProforVl ;
   private java.math.BigDecimal[] P01R07_A8528ProForCos ;
   private java.math.BigDecimal[] P01R07_A8527ProForAbs ;
   private java.math.BigDecimal[] P01R07_A6877ProForPhn ;
   private boolean[] P01R07_n6877ProForPhn ;
   private java.math.BigDecimal[] P01R07_A6876ProForPhx ;
   private boolean[] P01R07_n6876ProForPhx ;
   private String[] P01R07_A6610ProForCol ;
   private boolean[] P01R07_n6610ProForCol ;
   private String[] P01R07_A6061ProForLab ;
   private String[] P01R07_A6018ProForFab ;
   private boolean[] P01R07_n6018ProForFab ;
   private String[] P01R07_A5523ProForTip ;
   private short[] P01R07_A5436IntCodF2 ;
   private boolean[] P01R07_n5436IntCodF2 ;
   private String[] P01R07_A5465ProForFac ;
   private boolean[] P01R07_n5465ProForFac ;
   private short[] P01R07_A5190ProFoLCU ;
   private boolean[] P01R07_n5190ProFoLCU ;
   private String[] P01R07_A4865ProForDCi ;
   private String[] P01R07_A4864ProForCCi ;
   private String[] P01R07_A4715ProForDsc2 ;
   private short[] P01R07_A4706ProForRb ;
   private short[] P01R07_A4705ProForPau ;
   private String[] P01R07_A4586ProForObs ;
   private boolean[] P01R07_n4586ProForObs ;
   private short[] P01R07_A773ProForUli ;
   private java.util.Date[] P01R07_A674PorForFul ;
   private String[] P01R09_A396EmprCod ;
   private String[] P01R09_A764ProForCod ;
   private String[] P01R09_A13178ProForFT ;
   private byte[] P01R09_A1645ProForNro ;
   private short[] P01R09_A767ProForLin ;
   private String[] P01R09_A13111ProForDe2 ;
   private String[] P01R09_A765ProForDes ;
   private java.math.BigDecimal[] P01R09_A6062ProForCPo ;
   private String[] P01R09_A5358ProForClv ;
   private byte[] P01R09_A3379ProForTnq ;
   private String[] P01R09_A763ProForCla ;
   private java.math.BigDecimal[] P01R09_A762ProForCan ;
   private byte[] P01R09_A490ForPrdUMe ;
   private String[] P01R09_A770ProForPrd ;
}

final  class pmacprh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01R02", "SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01R03", "DELETE FROM TXPLPROFO  WHERE EmprCod = ? and ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new UpdateCursor("P01R04", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
         ,new ForEachCursor("P01R05", "SELECT MacProDsc, MacProTmx, MacProMat, EmprCod, MacProCod FROM TXPCMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01R06", "SELECT EmprCod, MacProCod, ProForCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod, MacProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01R07", "SELECT EmprCod, ProRev, ProNumRec, ProNumPro, ProForMat, ProForTmx, ProForTie, ProForDsc, ProForCod, ProForRs, ProForAct, ProNh2o, ProForMer, ProH2O, ProforVl, ProForCos, ProForAbs, ProForPhn, ProForPhx, ProForCol, ProForLab, ProForFab, ProForTip, IntCodF2, ProForFac, ProFoLCU, ProForDCi, ProForCCi, ProForDsc2, ProForRb, ProForPau, ProForObs, ProForUli, PorForFul FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01R08", "INSERT INTO TXPCPROFO(EmprCod, ProForCod, ProForDsc, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForObs, ProForPau, ProForRb, ProForDsc2, ProForCCi, ProForDCi, ProFoLCU, ProForFac, IntCodF2, ProForTip, ProForFab, ProForLab, ProForCol, ProForPhx, ProForPhn, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProNh2o, ProForAct, ProForRs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
         ,new ForEachCursor("P01R09", "SELECT EmprCod, ProForCod, ProForFT, ProForNro, ProForLin, ProForDe2, ProForDes, ProForCPo, ProForClv, ProForTnq, ProForCla, ProForCan, ForPrdUMe, ProForPrd FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01R010", "INSERT INTO TXPLPROFO(EmprCod, ProForCod, ProForLin, ProForPrd, ForPrdUMe, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForCPo, ProForDes, ProForFT, ProForDe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new UpdateCursor("P01R011", "UPDATE TXPCPROFO SET ProForUli=?  WHERE EmprCod = ? and ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 6);
               ((String[]) buf[25])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(23, 1);
               ((short[]) buf[28])[0] = rslt.getShort(24);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(26);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(27, 16);
               ((String[]) buf[35])[0] = rslt.getString(28, 10);
               ((String[]) buf[36])[0] = rslt.getString(29, 40);
               ((short[]) buf[37])[0] = rslt.getShort(30);
               ((short[]) buf[38])[0] = rslt.getShort(31);
               ((String[]) buf[39])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(33);
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(34);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 1);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[12], 300);
               }
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setShort(14, ((Number) parms[14]).shortValue());
               stmt.setString(15, (String)parms[15], 40);
               stmt.setString(16, (String)parms[16], 10);
               stmt.setString(17, (String)parms[17], 16);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[23]).shortValue());
               }
               stmt.setString(21, (String)parms[24], 1);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[26], 1);
               }
               stmt.setString(23, (String)parms[27], 6);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[33], 2);
               }
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[35], 4);
               stmt.setInt(29, ((Number) parms[36]).intValue());
               stmt.setShort(30, ((Number) parms[37]).shortValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[38], 2);
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[40]).shortValue());
               }
               stmt.setString(33, (String)parms[41], 1);
               stmt.setString(34, (String)parms[42], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 30);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 26);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 40);
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

