package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelale extends GXProcedure
{
   public pdelale( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelale.class ), "" );
   }

   public pdelale( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pdelale.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pdelale.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelale.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV15Flag ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int1) ;
      pdelale.this.AV15Flag = GXv_int1[0] ;
      /* Using cursor P00YO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P00YO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P00YO3_A130BarCodPar[0] ;
            A132BarCodReo = P00YO3_A132BarCodReo[0] ;
            A129BarCod = P00YO3_A129BarCod[0] ;
            A1265BarAlbPie = P00YO3_A1265BarAlbPie[0] ;
            AV16BarCod = A129BarCod ;
            AV17BarCodReo = A132BarCodReo ;
            AV18BarCodPar = A130BarCodPar ;
            /* Execute user subroutine: 'BARCADA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Optimized DELETE. */
            /* Using cursor P00YO4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            /* End optimized DELETE. */
            /* Using cursor P00YO5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A1533AlbEComM = P00YO5_A1533AlbEComM[0] ;
               n1533AlbEComM = P00YO5_n1533AlbEComM[0] ;
               A1032FonCod = P00YO5_A1032FonCod[0] ;
               A1056DisComCod = P00YO5_A1056DisComCod[0] ;
               A2524DisComLin = P00YO5_A2524DisComLin[0] ;
               A1534AlbEComP = P00YO5_A1534AlbEComP[0] ;
               n1534AlbEComP = P00YO5_n1534AlbEComP[0] ;
               AV19DisComLin = A2524DisComLin ;
               AV20DisComCod = A1056DisComCod ;
               AV21FonCod = A1032FonCod ;
               AV22AlbEComM = A1533AlbEComM ;
               AV23AlbEComP = A1534AlbEComP ;
               /* Optimized DELETE. */
               /* Using cursor P00YO6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTEP");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P00YO7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALESTP");
               /* End optimized DELETE. */
               AV25CosOpeAca = 0 ;
               /* Using cursor P00YO8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A1761ExtCod = P00YO8_A1761ExtCod[0] ;
                  /* Using cursor P00YO9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A1761ExtCod)});
                  while ( (pr_default.getStatus(7) != 101) )
                  {
                     A2651OperPreAlb = P00YO9_A2651OperPreAlb[0] ;
                     n2651OperPreAlb = P00YO9_n2651OperPreAlb[0] ;
                     A2102OperCod = P00YO9_A2102OperCod[0] ;
                     AV25CosOpeAca = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV25CosOpeAca).add(A1533AlbEComM.multiply(A2651OperPreAlb)))) ;
                     /* Using cursor P00YO10 */
                     pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A1761ExtCod), A2102OperCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBETO");
                     pr_default.readNext(7);
                  }
                  pr_default.close(7);
                  /* Using cursor P00YO11 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A1761ExtCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBETE");
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               AV24CosOpeEmp = 0 ;
               /* Using cursor P00YO12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A2666ProceCodA = P00YO12_A2666ProceCodA[0] ;
                  A3915EmpNumDec = P00YO12_A3915EmpNumDec[0] ;
                  n3915EmpNumDec = P00YO12_n3915EmpNumDec[0] ;
                  A3915EmpNumDec = P00YO12_A3915EmpNumDec[0] ;
                  n3915EmpNumDec = P00YO12_n3915EmpNumDec[0] ;
                  /* Using cursor P00YO13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A2666ProceCodA)});
                  while ( (pr_default.getStatus(11) != 101) )
                  {
                     A2652OperPreEAl = P00YO13_A2652OperPreEAl[0] ;
                     n2652OperPreEAl = P00YO13_n2652OperPreEAl[0] ;
                     A2102OperCod = P00YO13_A2102OperCod[0] ;
                     if ( A3915EmpNumDec == 0 )
                     {
                        AV24CosOpeEmp = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV24CosOpeEmp).add(A1541BarComMtr.multiply(A2652OperPreEAl)))) ;
                     }
                     else
                     {
                        if ( A3915EmpNumDec == 2 )
                        {
                           AV24CosOpeEmp = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV24CosOpeEmp).add(GXutil.roundDecimal( A1541BarComMtr.multiply(A2652OperPreEAl), 2)))) ;
                        }
                     }
                     /* Using cursor P00YO14 */
                     pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A2666ProceCodA), A2102OperCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBOPE");
                     pr_default.readNext(11);
                  }
                  pr_default.close(11);
                  /* Using cursor P00YO15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A2666ProceCodA)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEPR");
                  pr_default.readNext(10);
               }
               pr_default.close(10);
               /* Execute user subroutine: 'COMBINA' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Using cursor P00YO16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Using cursor P00YO17 */
            pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Optimized DELETE. */
         /* Using cursor P00YO18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
         /* End optimized DELETE. */
         /* Using cursor P00YO19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCADA' Routine */
      returnInSub = false ;
      /* Using cursor P00YO20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A130BarCodPar = P00YO20_A130BarCodPar[0] ;
         A132BarCodReo = P00YO20_A132BarCodReo[0] ;
         A129BarCod = P00YO20_A129BarCod[0] ;
         A212BarSer = P00YO20_A212BarSer[0] ;
         A213BarSit = P00YO20_A213BarSit[0] ;
         if ( A213BarSit == 9 )
         {
            A213BarSit = (byte)(6) ;
         }
         /* Using cursor P00YO21 */
         pr_default.execute(19, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(18);
   }

   public void S121( )
   {
      /* 'COMBINA' Routine */
      returnInSub = false ;
      /* Using cursor P00YO22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Byte.valueOf(AV19DisComLin), AV20DisComCod, AV21FonCod});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A1032FonCod = P00YO22_A1032FonCod[0] ;
         A1056DisComCod = P00YO22_A1056DisComCod[0] ;
         A2524DisComLin = P00YO22_A2524DisComLin[0] ;
         A130BarCodPar = P00YO22_A130BarCodPar[0] ;
         A132BarCodReo = P00YO22_A132BarCodReo[0] ;
         A129BarCod = P00YO22_A129BarCod[0] ;
         A2513BarGasAca = P00YO22_A2513BarGasAca[0] ;
         n2513BarGasAca = P00YO22_n2513BarGasAca[0] ;
         A2514BarGasEmp = P00YO22_A2514BarGasEmp[0] ;
         n2514BarGasEmp = P00YO22_n2514BarGasEmp[0] ;
         A1542BarComPEst = P00YO22_A1542BarComPEst[0] ;
         n1542BarComPEst = P00YO22_n1542BarComPEst[0] ;
         A1540BarComMLan = P00YO22_A1540BarComMLan[0] ;
         n1540BarComMLan = P00YO22_n1540BarComMLan[0] ;
         A1544BarComPLan = P00YO22_A1544BarComPLan[0] ;
         n1544BarComPLan = P00YO22_n1544BarComPLan[0] ;
         A2513BarGasAca = A2513BarGasAca.subtract(DecimalUtil.doubleToDec(AV25CosOpeAca)) ;
         n2513BarGasAca = false ;
         A2514BarGasEmp = A2514BarGasEmp.subtract(DecimalUtil.doubleToDec(AV24CosOpeEmp)) ;
         n2514BarGasEmp = false ;
         A1542BarComPEst = (byte)(0) ;
         n1542BarComPEst = false ;
         A1540BarComMLan = A1540BarComMLan.subtract(AV22AlbEComM) ;
         n1540BarComMLan = false ;
         A1544BarComPLan = (short)(A1544BarComPLan-AV23AlbEComP) ;
         n1544BarComPLan = false ;
         if ( A2513BarGasAca.doubleValue() < 0 )
         {
            A2513BarGasAca = DecimalUtil.doubleToDec(0) ;
            n2513BarGasAca = false ;
         }
         if ( A2514BarGasEmp.doubleValue() < 0 )
         {
            A2514BarGasEmp = DecimalUtil.doubleToDec(0) ;
            n2514BarGasEmp = false ;
         }
         if ( A1540BarComMLan.doubleValue() < 0 )
         {
            A1540BarComMLan = DecimalUtil.doubleToDec(0) ;
            n1540BarComMLan = false ;
         }
         if ( A1544BarComPLan < 0 )
         {
            A1544BarComPLan = (short)(0) ;
            n1544BarComPLan = false ;
         }
         /* Using cursor P00YO23 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n2513BarGasAca), A2513BarGasAca, Boolean.valueOf(n2514BarGasEmp), A2514BarGasEmp, Boolean.valueOf(n1542BarComPEst), Byte.valueOf(A1542BarComPEst), Boolean.valueOf(n1540BarComMLan), A1540BarComMLan, Boolean.valueOf(n1544BarComPLan), Short.valueOf(A1544BarComPLan), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(20);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelale.this.A396EmprCod;
      this.aP1[0] = pdelale.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelale");
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
      P00YO2_A396EmprCod = new String[] {""} ;
      P00YO2_A30AlbProCod = new long[1] ;
      P00YO3_A396EmprCod = new String[] {""} ;
      P00YO3_A30AlbProCod = new long[1] ;
      P00YO3_A130BarCodPar = new String[] {""} ;
      P00YO3_A132BarCodReo = new byte[1] ;
      P00YO3_A129BarCod = new int[1] ;
      P00YO3_A1265BarAlbPie = new int[1] ;
      A130BarCodPar = "" ;
      AV18BarCodPar = "" ;
      P00YO5_A396EmprCod = new String[] {""} ;
      P00YO5_A30AlbProCod = new long[1] ;
      P00YO5_A129BarCod = new int[1] ;
      P00YO5_A132BarCodReo = new byte[1] ;
      P00YO5_A130BarCodPar = new String[] {""} ;
      P00YO5_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YO5_n1533AlbEComM = new boolean[] {false} ;
      P00YO5_A1032FonCod = new String[] {""} ;
      P00YO5_A1056DisComCod = new String[] {""} ;
      P00YO5_A2524DisComLin = new byte[1] ;
      P00YO5_A1534AlbEComP = new short[1] ;
      P00YO5_n1534AlbEComP = new boolean[] {false} ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      AV20DisComCod = "" ;
      AV21FonCod = "" ;
      AV22AlbEComM = DecimalUtil.ZERO ;
      P00YO8_A396EmprCod = new String[] {""} ;
      P00YO8_A30AlbProCod = new long[1] ;
      P00YO8_A129BarCod = new int[1] ;
      P00YO8_A132BarCodReo = new byte[1] ;
      P00YO8_A130BarCodPar = new String[] {""} ;
      P00YO8_A2524DisComLin = new byte[1] ;
      P00YO8_A1056DisComCod = new String[] {""} ;
      P00YO8_A1032FonCod = new String[] {""} ;
      P00YO8_A1761ExtCod = new short[1] ;
      P00YO9_A396EmprCod = new String[] {""} ;
      P00YO9_A30AlbProCod = new long[1] ;
      P00YO9_A129BarCod = new int[1] ;
      P00YO9_A132BarCodReo = new byte[1] ;
      P00YO9_A130BarCodPar = new String[] {""} ;
      P00YO9_A2524DisComLin = new byte[1] ;
      P00YO9_A1056DisComCod = new String[] {""} ;
      P00YO9_A1032FonCod = new String[] {""} ;
      P00YO9_A1761ExtCod = new short[1] ;
      P00YO9_A2651OperPreAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YO9_n2651OperPreAlb = new boolean[] {false} ;
      P00YO9_A2102OperCod = new String[] {""} ;
      A2651OperPreAlb = DecimalUtil.ZERO ;
      A2102OperCod = "" ;
      P00YO12_A396EmprCod = new String[] {""} ;
      P00YO12_A30AlbProCod = new long[1] ;
      P00YO12_A129BarCod = new int[1] ;
      P00YO12_A132BarCodReo = new byte[1] ;
      P00YO12_A130BarCodPar = new String[] {""} ;
      P00YO12_A2524DisComLin = new byte[1] ;
      P00YO12_A1056DisComCod = new String[] {""} ;
      P00YO12_A1032FonCod = new String[] {""} ;
      P00YO12_A2666ProceCodA = new short[1] ;
      P00YO12_A3915EmpNumDec = new byte[1] ;
      P00YO12_n3915EmpNumDec = new boolean[] {false} ;
      P00YO13_A396EmprCod = new String[] {""} ;
      P00YO13_A30AlbProCod = new long[1] ;
      P00YO13_A129BarCod = new int[1] ;
      P00YO13_A132BarCodReo = new byte[1] ;
      P00YO13_A130BarCodPar = new String[] {""} ;
      P00YO13_A2524DisComLin = new byte[1] ;
      P00YO13_A1056DisComCod = new String[] {""} ;
      P00YO13_A1032FonCod = new String[] {""} ;
      P00YO13_A2666ProceCodA = new short[1] ;
      P00YO13_A2652OperPreEAl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YO13_n2652OperPreEAl = new boolean[] {false} ;
      P00YO13_A2102OperCod = new String[] {""} ;
      A2652OperPreEAl = DecimalUtil.ZERO ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      P00YO20_A396EmprCod = new String[] {""} ;
      P00YO20_A130BarCodPar = new String[] {""} ;
      P00YO20_A132BarCodReo = new byte[1] ;
      P00YO20_A129BarCod = new int[1] ;
      P00YO20_A212BarSer = new String[] {""} ;
      P00YO20_A213BarSit = new byte[1] ;
      A212BarSer = "" ;
      P00YO22_A396EmprCod = new String[] {""} ;
      P00YO22_A1032FonCod = new String[] {""} ;
      P00YO22_A1056DisComCod = new String[] {""} ;
      P00YO22_A2524DisComLin = new byte[1] ;
      P00YO22_A130BarCodPar = new String[] {""} ;
      P00YO22_A132BarCodReo = new byte[1] ;
      P00YO22_A129BarCod = new int[1] ;
      P00YO22_A2513BarGasAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YO22_n2513BarGasAca = new boolean[] {false} ;
      P00YO22_A2514BarGasEmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YO22_n2514BarGasEmp = new boolean[] {false} ;
      P00YO22_A1542BarComPEst = new byte[1] ;
      P00YO22_n1542BarComPEst = new boolean[] {false} ;
      P00YO22_A1540BarComMLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YO22_n1540BarComMLan = new boolean[] {false} ;
      P00YO22_A1544BarComPLan = new short[1] ;
      P00YO22_n1544BarComPLan = new boolean[] {false} ;
      A2513BarGasAca = DecimalUtil.ZERO ;
      A2514BarGasEmp = DecimalUtil.ZERO ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelale__default(),
         new Object[] {
             new Object[] {
            P00YO2_A396EmprCod, P00YO2_A30AlbProCod
            }
            , new Object[] {
            P00YO3_A396EmprCod, P00YO3_A30AlbProCod, P00YO3_A130BarCodPar, P00YO3_A132BarCodReo, P00YO3_A129BarCod, P00YO3_A1265BarAlbPie
            }
            , new Object[] {
            }
            , new Object[] {
            P00YO5_A396EmprCod, P00YO5_A30AlbProCod, P00YO5_A129BarCod, P00YO5_A132BarCodReo, P00YO5_A130BarCodPar, P00YO5_A1533AlbEComM, P00YO5_n1533AlbEComM, P00YO5_A1032FonCod, P00YO5_A1056DisComCod, P00YO5_A2524DisComLin,
            P00YO5_A1534AlbEComP, P00YO5_n1534AlbEComP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00YO8_A396EmprCod, P00YO8_A30AlbProCod, P00YO8_A129BarCod, P00YO8_A132BarCodReo, P00YO8_A130BarCodPar, P00YO8_A2524DisComLin, P00YO8_A1056DisComCod, P00YO8_A1032FonCod, P00YO8_A1761ExtCod
            }
            , new Object[] {
            P00YO9_A396EmprCod, P00YO9_A30AlbProCod, P00YO9_A129BarCod, P00YO9_A132BarCodReo, P00YO9_A130BarCodPar, P00YO9_A2524DisComLin, P00YO9_A1056DisComCod, P00YO9_A1032FonCod, P00YO9_A1761ExtCod, P00YO9_A2651OperPreAlb,
            P00YO9_n2651OperPreAlb, P00YO9_A2102OperCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00YO12_A396EmprCod, P00YO12_A30AlbProCod, P00YO12_A129BarCod, P00YO12_A132BarCodReo, P00YO12_A130BarCodPar, P00YO12_A2524DisComLin, P00YO12_A1056DisComCod, P00YO12_A1032FonCod, P00YO12_A2666ProceCodA, P00YO12_A3915EmpNumDec,
            P00YO12_n3915EmpNumDec
            }
            , new Object[] {
            P00YO13_A396EmprCod, P00YO13_A30AlbProCod, P00YO13_A129BarCod, P00YO13_A132BarCodReo, P00YO13_A130BarCodPar, P00YO13_A2524DisComLin, P00YO13_A1056DisComCod, P00YO13_A1032FonCod, P00YO13_A2666ProceCodA, P00YO13_A2652OperPreEAl,
            P00YO13_n2652OperPreEAl, P00YO13_A2102OperCod
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
            }
            , new Object[] {
            }
            , new Object[] {
            P00YO20_A396EmprCod, P00YO20_A130BarCodPar, P00YO20_A132BarCodReo, P00YO20_A129BarCod, P00YO20_A212BarSer, P00YO20_A213BarSit
            }
            , new Object[] {
            }
            , new Object[] {
            P00YO22_A396EmprCod, P00YO22_A1032FonCod, P00YO22_A1056DisComCod, P00YO22_A2524DisComLin, P00YO22_A130BarCodPar, P00YO22_A132BarCodReo, P00YO22_A129BarCod, P00YO22_A2513BarGasAca, P00YO22_n2513BarGasAca, P00YO22_A2514BarGasEmp,
            P00YO22_n2514BarGasEmp, P00YO22_A1542BarComPEst, P00YO22_n1542BarComPEst, P00YO22_A1540BarComMLan, P00YO22_n1540BarComMLan, P00YO22_A1544BarComPLan, P00YO22_n1544BarComPLan
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte AV17BarCodReo ;
   private byte A2524DisComLin ;
   private byte AV19DisComLin ;
   private byte A3915EmpNumDec ;
   private byte A213BarSit ;
   private byte A1542BarComPEst ;
   private short A1534AlbEComP ;
   private short AV23AlbEComP ;
   private short A1761ExtCod ;
   private short A2666ProceCodA ;
   private short A1544BarComPLan ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV16BarCod ;
   private int AV25CosOpeAca ;
   private int AV24CosOpeEmp ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal AV22AlbEComM ;
   private java.math.BigDecimal A2651OperPreAlb ;
   private java.math.BigDecimal A2652OperPreEAl ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A2513BarGasAca ;
   private java.math.BigDecimal A2514BarGasEmp ;
   private java.math.BigDecimal A1540BarComMLan ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV18BarCodPar ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String AV20DisComCod ;
   private String AV21FonCod ;
   private String A2102OperCod ;
   private String A212BarSer ;
   private boolean returnInSub ;
   private boolean n1533AlbEComM ;
   private boolean n1534AlbEComP ;
   private boolean n2651OperPreAlb ;
   private boolean n3915EmpNumDec ;
   private boolean n2652OperPreEAl ;
   private boolean n2513BarGasAca ;
   private boolean n2514BarGasEmp ;
   private boolean n1542BarComPEst ;
   private boolean n1540BarComMLan ;
   private boolean n1544BarComPLan ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YO2_A396EmprCod ;
   private long[] P00YO2_A30AlbProCod ;
   private String[] P00YO3_A396EmprCod ;
   private long[] P00YO3_A30AlbProCod ;
   private String[] P00YO3_A130BarCodPar ;
   private byte[] P00YO3_A132BarCodReo ;
   private int[] P00YO3_A129BarCod ;
   private int[] P00YO3_A1265BarAlbPie ;
   private String[] P00YO5_A396EmprCod ;
   private long[] P00YO5_A30AlbProCod ;
   private int[] P00YO5_A129BarCod ;
   private byte[] P00YO5_A132BarCodReo ;
   private String[] P00YO5_A130BarCodPar ;
   private java.math.BigDecimal[] P00YO5_A1533AlbEComM ;
   private boolean[] P00YO5_n1533AlbEComM ;
   private String[] P00YO5_A1032FonCod ;
   private String[] P00YO5_A1056DisComCod ;
   private byte[] P00YO5_A2524DisComLin ;
   private short[] P00YO5_A1534AlbEComP ;
   private boolean[] P00YO5_n1534AlbEComP ;
   private String[] P00YO8_A396EmprCod ;
   private long[] P00YO8_A30AlbProCod ;
   private int[] P00YO8_A129BarCod ;
   private byte[] P00YO8_A132BarCodReo ;
   private String[] P00YO8_A130BarCodPar ;
   private byte[] P00YO8_A2524DisComLin ;
   private String[] P00YO8_A1056DisComCod ;
   private String[] P00YO8_A1032FonCod ;
   private short[] P00YO8_A1761ExtCod ;
   private String[] P00YO9_A396EmprCod ;
   private long[] P00YO9_A30AlbProCod ;
   private int[] P00YO9_A129BarCod ;
   private byte[] P00YO9_A132BarCodReo ;
   private String[] P00YO9_A130BarCodPar ;
   private byte[] P00YO9_A2524DisComLin ;
   private String[] P00YO9_A1056DisComCod ;
   private String[] P00YO9_A1032FonCod ;
   private short[] P00YO9_A1761ExtCod ;
   private java.math.BigDecimal[] P00YO9_A2651OperPreAlb ;
   private boolean[] P00YO9_n2651OperPreAlb ;
   private String[] P00YO9_A2102OperCod ;
   private String[] P00YO12_A396EmprCod ;
   private long[] P00YO12_A30AlbProCod ;
   private int[] P00YO12_A129BarCod ;
   private byte[] P00YO12_A132BarCodReo ;
   private String[] P00YO12_A130BarCodPar ;
   private byte[] P00YO12_A2524DisComLin ;
   private String[] P00YO12_A1056DisComCod ;
   private String[] P00YO12_A1032FonCod ;
   private short[] P00YO12_A2666ProceCodA ;
   private byte[] P00YO12_A3915EmpNumDec ;
   private boolean[] P00YO12_n3915EmpNumDec ;
   private String[] P00YO13_A396EmprCod ;
   private long[] P00YO13_A30AlbProCod ;
   private int[] P00YO13_A129BarCod ;
   private byte[] P00YO13_A132BarCodReo ;
   private String[] P00YO13_A130BarCodPar ;
   private byte[] P00YO13_A2524DisComLin ;
   private String[] P00YO13_A1056DisComCod ;
   private String[] P00YO13_A1032FonCod ;
   private short[] P00YO13_A2666ProceCodA ;
   private java.math.BigDecimal[] P00YO13_A2652OperPreEAl ;
   private boolean[] P00YO13_n2652OperPreEAl ;
   private String[] P00YO13_A2102OperCod ;
   private String[] P00YO20_A396EmprCod ;
   private String[] P00YO20_A130BarCodPar ;
   private byte[] P00YO20_A132BarCodReo ;
   private int[] P00YO20_A129BarCod ;
   private String[] P00YO20_A212BarSer ;
   private byte[] P00YO20_A213BarSit ;
   private String[] P00YO22_A396EmprCod ;
   private String[] P00YO22_A1032FonCod ;
   private String[] P00YO22_A1056DisComCod ;
   private byte[] P00YO22_A2524DisComLin ;
   private String[] P00YO22_A130BarCodPar ;
   private byte[] P00YO22_A132BarCodReo ;
   private int[] P00YO22_A129BarCod ;
   private java.math.BigDecimal[] P00YO22_A2513BarGasAca ;
   private boolean[] P00YO22_n2513BarGasAca ;
   private java.math.BigDecimal[] P00YO22_A2514BarGasEmp ;
   private boolean[] P00YO22_n2514BarGasEmp ;
   private byte[] P00YO22_A1542BarComPEst ;
   private boolean[] P00YO22_n1542BarComPEst ;
   private java.math.BigDecimal[] P00YO22_A1540BarComMLan ;
   private boolean[] P00YO22_n1540BarComMLan ;
   private short[] P00YO22_A1544BarComPLan ;
   private boolean[] P00YO22_n1544BarComPLan ;
}

final  class pdelale__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YO2", "SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YO3", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod  FOR UPDATE OF BarCodPar NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YO4", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new ForEachCursor("P00YO5", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbEComM, FonCod, DisComCod, DisComLin, AlbEComP FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF AlbEComM NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YO6", "DELETE FROM TXPALBTEP  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTEP")
         ,new UpdateCursor("P00YO7", "DELETE FROM TXPALESTP  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALESTP")
         ,new ForEachCursor("P00YO8", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod FROM TXPALBETE WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod  FOR UPDATE OF ExtCod NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YO9", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod, OperPreAlb, OperCod FROM TXPALBETO WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and ExtCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod  FOR UPDATE OF OperPreAlb NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YO10", "DELETE FROM TXPALBETO  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND ExtCod = ? AND OperCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBETO")
         ,new UpdateCursor("P00YO11", "DELETE FROM TXPALBETE  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND ExtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBETE")
         ,new ForEachCursor("P00YO12", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.ProceCodA, T2.EmpNumDec FROM (TXPALBEPR T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod  FOR UPDATE OF T1.ProceCodA NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YO13", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA, OperPreEAl, OperCod FROM TXPALBOPE WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and ProceCodA = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA  FOR UPDATE OF OperPreEAl NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YO14", "DELETE FROM TXPALBOPE  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND ProceCodA = ? AND OperCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBOPE")
         ,new UpdateCursor("P00YO15", "DELETE FROM TXPALBEPR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND ProceCodA = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEPR")
         ,new UpdateCursor("P00YO16", "DELETE FROM TXPALBEST  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new UpdateCursor("P00YO17", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P00YO18", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new UpdateCursor("P00YO19", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P00YO20", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSer, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF BarSit NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00YO21", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00YO22", "SELECT EmprCod, FonCod, DisComCod, DisComLin, BarCodPar, BarCodReo, BarCod, BarGasAca, BarGasEmp, BarComPEst, BarComMLan, BarComPLan FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod  FOR UPDATE OF BarGasAca, BarGasEmp, BarComPEst, BarComMLan, BarComPLan NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00YO23", "UPDATE TXPBARCOM SET BarGasAca=?, BarGasEmp=?, BarComPEst=?, BarComMLan=?, BarComPLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 19 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
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
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setByte(10, ((Number) parms[14]).byteValue());
               stmt.setString(11, (String)parms[15], 12);
               stmt.setString(12, (String)parms[16], 12);
               return;
      }
   }

}

