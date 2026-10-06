package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalbar extends GXProcedure
{
   public pcalbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalbar.class ), "" );
   }

   public pcalbar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            byte[] aP6 )
   {
      pcalbar.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 )
   {
      pcalbar.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalbar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcalbar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcalbar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcalbar.this.AV16CosPro = aP4[0];
      this.aP4 = aP4;
      pcalbar.this.AV17CosAny = aP5[0];
      this.aP5 = aP5;
      pcalbar.this.AV18Consumos = aP6[0];
      this.aP6 = aP6;
      pcalbar.this.A2804RecLinMaq = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV20Flag2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "038001", GXv_int1) ;
      pcalbar.this.AV20Flag2 = GXv_int1[0] ;
      /* Using cursor P00ER2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P00ER2_A719PrdNum[0] ;
         n719PrdNum = P00ER2_n719PrdNum[0] ;
         A3915EmpNumDec = P00ER2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ER2_n3915EmpNumDec[0] ;
         A707PrdFacCon = P00ER2_A707PrdFacCon[0] ;
         A724PrdPreAct = P00ER2_A724PrdPreAct[0] ;
         A686PrdCant = P00ER2_A686PrdCant[0] ;
         A1797PrdCanAny = P00ER2_A1797PrdCanAny[0] ;
         A811RecLin = P00ER2_A811RecLin[0] ;
         A1273RecLinPro = P00ER2_A1273RecLinPro[0] ;
         A396EmprCod = P00ER2_A396EmprCod[0] ;
         A3915EmpNumDec = P00ER2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ER2_n3915EmpNumDec[0] ;
         A707PrdFacCon = P00ER2_A707PrdFacCon[0] ;
         A724PrdPreAct = P00ER2_A724PrdPreAct[0] ;
         AV26Col = (int)(GXutil.lval( A719PrdNum)) ;
         if ( ( AV26Col > 100000 ) && ( AV26Col < 800000 ) )
         {
            if ( A3915EmpNumDec == 0 )
            {
               AV16CosPro = AV16CosPro.add((A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               AV17CosAny = AV17CosAny.add((A1797PrdCanAny.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV16CosPro = AV16CosPro.add(GXutil.roundDecimal( (A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                  AV17CosAny = AV17CosAny.add(GXutil.roundDecimal( (A1797PrdCanAny.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00ER3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P00ER3_A719PrdNum[0] ;
         n719PrdNum = P00ER3_n719PrdNum[0] ;
         A686PrdCant = P00ER3_A686PrdCant[0] ;
         A811RecLin = P00ER3_A811RecLin[0] ;
         A1273RecLinPro = P00ER3_A1273RecLinPro[0] ;
         A396EmprCod = P00ER3_A396EmprCod[0] ;
         AV21PrdComCod = A719PrdNum ;
         AV22PrdCant = A686PrdCant ;
         /* Execute user subroutine: 'COMPUEST' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P00ER4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A3915EmpNumDec = P00ER4_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ER4_n3915EmpNumDec[0] ;
         A707PrdFacCon = P00ER4_A707PrdFacCon[0] ;
         A724PrdPreAct = P00ER4_A724PrdPreAct[0] ;
         A2495BarDosUsa = P00ER4_A2495BarDosUsa[0] ;
         n2495BarDosUsa = P00ER4_n2495BarDosUsa[0] ;
         A719PrdNum = P00ER4_A719PrdNum[0] ;
         n719PrdNum = P00ER4_n719PrdNum[0] ;
         A2494BarDosPro = P00ER4_A2494BarDosPro[0] ;
         A396EmprCod = P00ER4_A396EmprCod[0] ;
         A3915EmpNumDec = P00ER4_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ER4_n3915EmpNumDec[0] ;
         A707PrdFacCon = P00ER4_A707PrdFacCon[0] ;
         A724PrdPreAct = P00ER4_A724PrdPreAct[0] ;
         if ( A129BarCod != 99999999 )
         {
            if ( A3915EmpNumDec == 0 )
            {
               AV16CosPro = AV16CosPro.add((A2495BarDosUsa.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV16CosPro = AV16CosPro.add(GXutil.roundDecimal( (A2495BarDosUsa.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P00ER5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2808RecLinMAL = P00ER5_A2808RecLinMAL[0] ;
         A719PrdNum = P00ER5_A719PrdNum[0] ;
         n719PrdNum = P00ER5_n719PrdNum[0] ;
         A3915EmpNumDec = P00ER5_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ER5_n3915EmpNumDec[0] ;
         A707PrdFacCon = P00ER5_A707PrdFacCon[0] ;
         A724PrdPreAct = P00ER5_A724PrdPreAct[0] ;
         A1378PrdCFin = P00ER5_A1378PrdCFin[0] ;
         n1378PrdCFin = P00ER5_n1378PrdCFin[0] ;
         A1377RecNumAny = P00ER5_A1377RecNumAny[0] ;
         A396EmprCod = P00ER5_A396EmprCod[0] ;
         A3915EmpNumDec = P00ER5_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ER5_n3915EmpNumDec[0] ;
         A707PrdFacCon = P00ER5_A707PrdFacCon[0] ;
         A724PrdPreAct = P00ER5_A724PrdPreAct[0] ;
         if ( A3915EmpNumDec == 0 )
         {
            AV17CosAny = AV17CosAny.add((A1378PrdCFin.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV17CosAny = AV17CosAny.add(GXutil.roundDecimal( (A1378PrdCFin.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUEST' Routine */
      returnInSub = false ;
      /* Using cursor P00ER6 */
      pr_default.execute(4, new Object[] {AV15EmprCod, AV21PrdComCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A688PrdComCod = P00ER6_A688PrdComCod[0] ;
         A3915EmpNumDec = P00ER6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ER6_n3915EmpNumDec[0] ;
         A690PrdComFN = P00ER6_A690PrdComFN[0] ;
         A707PrdFacCon = P00ER6_A707PrdFacCon[0] ;
         A724PrdPreAct = P00ER6_A724PrdPreAct[0] ;
         A719PrdNum = P00ER6_A719PrdNum[0] ;
         n719PrdNum = P00ER6_n719PrdNum[0] ;
         A396EmprCod = P00ER6_A396EmprCod[0] ;
         A3915EmpNumDec = P00ER6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ER6_n3915EmpNumDec[0] ;
         A707PrdFacCon = P00ER6_A707PrdFacCon[0] ;
         A724PrdPreAct = P00ER6_A724PrdPreAct[0] ;
         if ( A3915EmpNumDec == 0 )
         {
            AV16CosPro = AV16CosPro.add((AV22PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV16CosPro = AV16CosPro.add(GXutil.roundDecimal( (AV22PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalbar.this.AV15EmprCod;
      this.aP1[0] = pcalbar.this.A129BarCod;
      this.aP2[0] = pcalbar.this.A132BarCodReo;
      this.aP3[0] = pcalbar.this.A130BarCodPar;
      this.aP4[0] = pcalbar.this.AV16CosPro;
      this.aP5[0] = pcalbar.this.AV17CosAny;
      this.aP6[0] = pcalbar.this.AV18Consumos;
      this.aP7[0] = pcalbar.this.A2804RecLinMaq;
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
      P00ER2_A129BarCod = new int[1] ;
      P00ER2_A132BarCodReo = new byte[1] ;
      P00ER2_A130BarCodPar = new String[] {""} ;
      P00ER2_A2804RecLinMaq = new short[1] ;
      P00ER2_A719PrdNum = new String[] {""} ;
      P00ER2_n719PrdNum = new boolean[] {false} ;
      P00ER2_A3915EmpNumDec = new byte[1] ;
      P00ER2_n3915EmpNumDec = new boolean[] {false} ;
      P00ER2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER2_A811RecLin = new short[1] ;
      P00ER2_A1273RecLinPro = new byte[1] ;
      P00ER2_A396EmprCod = new String[] {""} ;
      A719PrdNum = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P00ER3_A129BarCod = new int[1] ;
      P00ER3_A132BarCodReo = new byte[1] ;
      P00ER3_A130BarCodPar = new String[] {""} ;
      P00ER3_A2804RecLinMaq = new short[1] ;
      P00ER3_A719PrdNum = new String[] {""} ;
      P00ER3_n719PrdNum = new boolean[] {false} ;
      P00ER3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER3_A811RecLin = new short[1] ;
      P00ER3_A1273RecLinPro = new byte[1] ;
      P00ER3_A396EmprCod = new String[] {""} ;
      AV21PrdComCod = "" ;
      AV22PrdCant = DecimalUtil.ZERO ;
      P00ER4_A129BarCod = new int[1] ;
      P00ER4_A132BarCodReo = new byte[1] ;
      P00ER4_A130BarCodPar = new String[] {""} ;
      P00ER4_A3915EmpNumDec = new byte[1] ;
      P00ER4_n3915EmpNumDec = new boolean[] {false} ;
      P00ER4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER4_A2495BarDosUsa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER4_n2495BarDosUsa = new boolean[] {false} ;
      P00ER4_A719PrdNum = new String[] {""} ;
      P00ER4_n719PrdNum = new boolean[] {false} ;
      P00ER4_A2494BarDosPro = new String[] {""} ;
      P00ER4_A396EmprCod = new String[] {""} ;
      A2495BarDosUsa = DecimalUtil.ZERO ;
      A2494BarDosPro = "" ;
      P00ER5_A129BarCod = new int[1] ;
      P00ER5_A132BarCodReo = new byte[1] ;
      P00ER5_A130BarCodPar = new String[] {""} ;
      P00ER5_A2808RecLinMAL = new short[1] ;
      P00ER5_A719PrdNum = new String[] {""} ;
      P00ER5_n719PrdNum = new boolean[] {false} ;
      P00ER5_A3915EmpNumDec = new byte[1] ;
      P00ER5_n3915EmpNumDec = new boolean[] {false} ;
      P00ER5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER5_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER5_n1378PrdCFin = new boolean[] {false} ;
      P00ER5_A1377RecNumAny = new byte[1] ;
      P00ER5_A396EmprCod = new String[] {""} ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      P00ER6_A688PrdComCod = new String[] {""} ;
      P00ER6_A3915EmpNumDec = new byte[1] ;
      P00ER6_n3915EmpNumDec = new boolean[] {false} ;
      P00ER6_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER6_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ER6_A719PrdNum = new String[] {""} ;
      P00ER6_n719PrdNum = new boolean[] {false} ;
      P00ER6_A396EmprCod = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalbar__default(),
         new Object[] {
             new Object[] {
            P00ER2_A129BarCod, P00ER2_A132BarCodReo, P00ER2_A130BarCodPar, P00ER2_A2804RecLinMaq, P00ER2_A719PrdNum, P00ER2_n719PrdNum, P00ER2_A3915EmpNumDec, P00ER2_n3915EmpNumDec, P00ER2_A707PrdFacCon, P00ER2_A724PrdPreAct,
            P00ER2_A686PrdCant, P00ER2_A1797PrdCanAny, P00ER2_A811RecLin, P00ER2_A1273RecLinPro, P00ER2_A396EmprCod
            }
            , new Object[] {
            P00ER3_A129BarCod, P00ER3_A132BarCodReo, P00ER3_A130BarCodPar, P00ER3_A2804RecLinMaq, P00ER3_A719PrdNum, P00ER3_n719PrdNum, P00ER3_A686PrdCant, P00ER3_A811RecLin, P00ER3_A1273RecLinPro, P00ER3_A396EmprCod
            }
            , new Object[] {
            P00ER4_A129BarCod, P00ER4_A132BarCodReo, P00ER4_A130BarCodPar, P00ER4_A3915EmpNumDec, P00ER4_n3915EmpNumDec, P00ER4_A707PrdFacCon, P00ER4_A724PrdPreAct, P00ER4_A2495BarDosUsa, P00ER4_n2495BarDosUsa, P00ER4_A719PrdNum,
            P00ER4_A2494BarDosPro, P00ER4_A396EmprCod
            }
            , new Object[] {
            P00ER5_A129BarCod, P00ER5_A132BarCodReo, P00ER5_A130BarCodPar, P00ER5_A2808RecLinMAL, P00ER5_A719PrdNum, P00ER5_A3915EmpNumDec, P00ER5_n3915EmpNumDec, P00ER5_A707PrdFacCon, P00ER5_A724PrdPreAct, P00ER5_A1378PrdCFin,
            P00ER5_n1378PrdCFin, P00ER5_A1377RecNumAny, P00ER5_A396EmprCod
            }
            , new Object[] {
            P00ER6_A688PrdComCod, P00ER6_A3915EmpNumDec, P00ER6_n3915EmpNumDec, P00ER6_A690PrdComFN, P00ER6_A707PrdFacCon, P00ER6_A724PrdPreAct, P00ER6_A719PrdNum, P00ER6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18Consumos ;
   private byte AV20Flag2 ;
   private byte GXv_int1[] ;
   private byte A3915EmpNumDec ;
   private byte A1273RecLinPro ;
   private byte A1377RecNumAny ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A2808RecLinMAL ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV26Col ;
   private java.math.BigDecimal AV16CosPro ;
   private java.math.BigDecimal AV17CosAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal AV22PrdCant ;
   private java.math.BigDecimal A2495BarDosUsa ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A690PrdComFN ;
   private String AV15EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String AV21PrdComCod ;
   private String A2494BarDosPro ;
   private String A688PrdComCod ;
   private boolean n719PrdNum ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private boolean n2495BarDosUsa ;
   private boolean n1378PrdCFin ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P00ER2_A129BarCod ;
   private byte[] P00ER2_A132BarCodReo ;
   private String[] P00ER2_A130BarCodPar ;
   private short[] P00ER2_A2804RecLinMaq ;
   private String[] P00ER2_A719PrdNum ;
   private boolean[] P00ER2_n719PrdNum ;
   private byte[] P00ER2_A3915EmpNumDec ;
   private boolean[] P00ER2_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00ER2_A707PrdFacCon ;
   private java.math.BigDecimal[] P00ER2_A724PrdPreAct ;
   private java.math.BigDecimal[] P00ER2_A686PrdCant ;
   private java.math.BigDecimal[] P00ER2_A1797PrdCanAny ;
   private short[] P00ER2_A811RecLin ;
   private byte[] P00ER2_A1273RecLinPro ;
   private String[] P00ER2_A396EmprCod ;
   private int[] P00ER3_A129BarCod ;
   private byte[] P00ER3_A132BarCodReo ;
   private String[] P00ER3_A130BarCodPar ;
   private short[] P00ER3_A2804RecLinMaq ;
   private String[] P00ER3_A719PrdNum ;
   private boolean[] P00ER3_n719PrdNum ;
   private java.math.BigDecimal[] P00ER3_A686PrdCant ;
   private short[] P00ER3_A811RecLin ;
   private byte[] P00ER3_A1273RecLinPro ;
   private String[] P00ER3_A396EmprCod ;
   private int[] P00ER4_A129BarCod ;
   private byte[] P00ER4_A132BarCodReo ;
   private String[] P00ER4_A130BarCodPar ;
   private byte[] P00ER4_A3915EmpNumDec ;
   private boolean[] P00ER4_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00ER4_A707PrdFacCon ;
   private java.math.BigDecimal[] P00ER4_A724PrdPreAct ;
   private java.math.BigDecimal[] P00ER4_A2495BarDosUsa ;
   private boolean[] P00ER4_n2495BarDosUsa ;
   private String[] P00ER4_A719PrdNum ;
   private boolean[] P00ER4_n719PrdNum ;
   private String[] P00ER4_A2494BarDosPro ;
   private String[] P00ER4_A396EmprCod ;
   private int[] P00ER5_A129BarCod ;
   private byte[] P00ER5_A132BarCodReo ;
   private String[] P00ER5_A130BarCodPar ;
   private short[] P00ER5_A2808RecLinMAL ;
   private String[] P00ER5_A719PrdNum ;
   private boolean[] P00ER5_n719PrdNum ;
   private byte[] P00ER5_A3915EmpNumDec ;
   private boolean[] P00ER5_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00ER5_A707PrdFacCon ;
   private java.math.BigDecimal[] P00ER5_A724PrdPreAct ;
   private java.math.BigDecimal[] P00ER5_A1378PrdCFin ;
   private boolean[] P00ER5_n1378PrdCFin ;
   private byte[] P00ER5_A1377RecNumAny ;
   private String[] P00ER5_A396EmprCod ;
   private String[] P00ER6_A688PrdComCod ;
   private byte[] P00ER6_A3915EmpNumDec ;
   private boolean[] P00ER6_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00ER6_A690PrdComFN ;
   private java.math.BigDecimal[] P00ER6_A707PrdFacCon ;
   private java.math.BigDecimal[] P00ER6_A724PrdPreAct ;
   private String[] P00ER6_A719PrdNum ;
   private boolean[] P00ER6_n719PrdNum ;
   private String[] P00ER6_A396EmprCod ;
}

final  class pcalbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ER2", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum, T2.EmpNumDec, T3.PrdFacCon, T3.PrdPreAct, T1.PrdCant, T1.PrdCanAny, T1.RecLin, T1.RecLinPro, T1.EmprCod FROM ((TXPLRECET T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) AND (SUBSTR(T1.PrdNum, 1, 1) <> '0') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ER3", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, PrdNum, PrdCant, RecLin, RecLinPro, EmprCod FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (Not (rtrim(PrdNum) IS NULL AND NOT(PrdNum IS NULL))) AND (SUBSTR(PrdNum, 1, 1) = '0') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ER4", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.EmpNumDec, T3.PrdFacCon, T3.PrdPreAct, T1.BarDosUsa, T1.PrdNum, T1.BarDosPro, T1.EmprCod FROM ((TXPBARDOS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDosPro, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ER5", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum, T2.EmpNumDec, T3.PrdFacCon, T3.PrdPreAct, T1.PrdCFin, T1.RecNumAny, T1.EmprCod FROM ((TXPLANYAD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ER6", "SELECT T1.PrdComCod, T2.EmpNumDec, T1.PrdComFN, T3.PrdFacCon, T3.PrdPreAct, T1.PrdNum, T1.EmprCod FROM ((TXPLPRDCO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,3);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

