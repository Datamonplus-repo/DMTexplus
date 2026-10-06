package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcosdab extends GXProcedure
{
   public pcosdab( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcosdab.class ), "" );
   }

   public pcosdab( int remoteHandle ,
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
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           java.math.BigDecimal[] aP9 )
   {
      pcosdab.this.aP10 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 )
   {
      pcosdab.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcosdab.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcosdab.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcosdab.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcosdab.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcosdab.this.AV38BarCosPdP = aP5[0];
      this.aP5 = aP5;
      pcosdab.this.AV42BarCosADP = aP6[0];
      this.aP6 = aP6;
      pcosdab.this.AV43BarCosAAP = aP7[0];
      this.aP7 = aP7;
      pcosdab.this.AV39BarCosPaP = aP8[0];
      this.aP8 = aP8;
      pcosdab.this.AV40BarCosColP = aP9[0];
      this.aP9 = aP9;
      pcosdab.this.AV41BarCosAncP = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV49NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      pcosdab.this.GXt_int1 = GXv_int2[0] ;
      AV49NCLec = GXt_int1 ;
      AV47F_precio2 = (byte)(0) ;
      GXv_int2[0] = AV47F_precio2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRECI2", ""), GXv_int2) ;
      pcosdab.this.AV47F_precio2 = GXv_int2[0] ;
      /* Using cursor P00SP2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P00SP2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00SP2_n3915EmpNumDec[0] ;
         AV37EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00SP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P00SP3_A719PrdNum[0] ;
         n719PrdNum = P00SP3_n719PrdNum[0] ;
         A724PrdPreAct = P00SP3_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00SP3_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00SP3_A707PrdFacCon[0] ;
         A1797PrdCanAny = P00SP3_A1797PrdCanAny[0] ;
         A686PrdCant = P00SP3_A686PrdCant[0] ;
         A811RecLin = P00SP3_A811RecLin[0] ;
         A1273RecLinPro = P00SP3_A1273RecLinPro[0] ;
         A724PrdPreAct = P00SP3_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00SP3_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00SP3_A707PrdFacCon[0] ;
         Gx_msg = httpContext.getMessage( "PCOSDAB.", "") + httpContext.getMessage( " Hdr=", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Producto=", "") + A719PrdNum ;
         System.out.println( Gx_msg );
         AV48PrdPreAct = A724PrdPreAct ;
         if ( ( AV47F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
         {
            AV48PrdPreAct = A5255PrdPreAc2 ;
         }
         AV20Exis = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         AV35CosPro2 = (A686PrdCant.multiply(AV48PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         AV36CosAny2 = (A1797PrdCanAny.multiply(AV48PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         Gx_msg = httpContext.getMessage( "Go PACUCOS.", "") + httpContext.getMessage( " Hdr=", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Producto=", "") + A719PrdNum ;
         System.out.println( Gx_msg );
         GXv_char3[0] = A719PrdNum ;
         GXv_decimal4[0] = AV35CosPro2 ;
         GXv_decimal5[0] = AV36CosAny2 ;
         GXv_decimal6[0] = AV29BarCosPD ;
         GXv_decimal7[0] = AV30BarCosAD ;
         GXv_decimal8[0] = AV31BarCosAA ;
         GXv_decimal9[0] = AV32BarCosPA ;
         GXv_decimal10[0] = AV33BarCosCol ;
         GXv_decimal11[0] = AV34BarCosAnc ;
         new app.pacucos(remoteHandle, context).execute( GXv_char3, GXv_decimal4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11) ;
         pcosdab.this.A719PrdNum = GXv_char3[0] ;
         pcosdab.this.AV35CosPro2 = GXv_decimal4[0] ;
         pcosdab.this.AV36CosAny2 = GXv_decimal5[0] ;
         pcosdab.this.AV29BarCosPD = GXv_decimal6[0] ;
         pcosdab.this.AV30BarCosAD = GXv_decimal7[0] ;
         pcosdab.this.AV31BarCosAA = GXv_decimal8[0] ;
         pcosdab.this.AV32BarCosPA = GXv_decimal9[0] ;
         pcosdab.this.AV33BarCosCol = GXv_decimal10[0] ;
         pcosdab.this.AV34BarCosAnc = GXv_decimal11[0] ;
         Gx_msg = httpContext.getMessage( "Return PACUCOS.", "") + httpContext.getMessage( " Hdr=", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Producto=", "") + A719PrdNum ;
         System.out.println( Gx_msg );
         pr_default.readNext(1);
      }
      pr_default.close(1);
      System.out.println( httpContext.getMessage( "Procesado Productos en PCOSDAB.No Compuestos", "") );
      /* Using cursor P00SP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P00SP4_A719PrdNum[0] ;
         n719PrdNum = P00SP4_n719PrdNum[0] ;
         A686PrdCant = P00SP4_A686PrdCant[0] ;
         A1797PrdCanAny = P00SP4_A1797PrdCanAny[0] ;
         A683PrdCanFin = P00SP4_A683PrdCanFin[0] ;
         A811RecLin = P00SP4_A811RecLin[0] ;
         A1273RecLinPro = P00SP4_A1273RecLinPro[0] ;
         AV22PrdComCod = A719PrdNum ;
         AV23PrdCant = A686PrdCant ;
         AV24PrdCanAny = A1797PrdCanAny ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A683PrdCanFin)==0) )
         {
            AV25PrdCanFin = A686PrdCant ;
         }
         else
         {
            AV25PrdCanFin = A683PrdCanFin ;
         }
         /* Execute user subroutine: 'COMPUEST' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P00SP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P00SP5_A719PrdNum[0] ;
         n719PrdNum = P00SP5_n719PrdNum[0] ;
         A724PrdPreAct = P00SP5_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00SP5_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00SP5_A707PrdFacCon[0] ;
         A1378PrdCFin = P00SP5_A1378PrdCFin[0] ;
         n1378PrdCFin = P00SP5_n1378PrdCFin[0] ;
         A3915EmpNumDec = P00SP5_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00SP5_n3915EmpNumDec[0] ;
         A1377RecNumAny = P00SP5_A1377RecNumAny[0] ;
         A2808RecLinMAL = P00SP5_A2808RecLinMAL[0] ;
         A3915EmpNumDec = P00SP5_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00SP5_n3915EmpNumDec[0] ;
         A724PrdPreAct = P00SP5_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00SP5_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00SP5_A707PrdFacCon[0] ;
         AV48PrdPreAct = A724PrdPreAct ;
         if ( ( AV47F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
         {
            AV48PrdPreAct = A5255PrdPreAc2 ;
         }
         AV20Exis = (A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         if ( A3915EmpNumDec == 0 )
         {
            AV36CosAny2 = (A1378PrdCFin.multiply(AV48PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV36CosAny2 = (A1378PrdCFin.multiply(AV48PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         AV35CosPro2 = DecimalUtil.doubleToDec(0) ;
         GXv_char3[0] = A719PrdNum ;
         GXv_decimal11[0] = AV35CosPro2 ;
         GXv_decimal10[0] = AV36CosAny2 ;
         GXv_decimal9[0] = AV29BarCosPD ;
         GXv_decimal8[0] = AV30BarCosAD ;
         GXv_decimal7[0] = AV31BarCosAA ;
         GXv_decimal6[0] = AV32BarCosPA ;
         GXv_decimal5[0] = AV33BarCosCol ;
         GXv_decimal4[0] = AV34BarCosAnc ;
         new app.pacucos(remoteHandle, context).execute( GXv_char3, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_decimal6, GXv_decimal5, GXv_decimal4) ;
         pcosdab.this.A719PrdNum = GXv_char3[0] ;
         pcosdab.this.AV35CosPro2 = GXv_decimal11[0] ;
         pcosdab.this.AV36CosAny2 = GXv_decimal10[0] ;
         pcosdab.this.AV29BarCosPD = GXv_decimal9[0] ;
         pcosdab.this.AV30BarCosAD = GXv_decimal8[0] ;
         pcosdab.this.AV31BarCosAA = GXv_decimal7[0] ;
         pcosdab.this.AV32BarCosPA = GXv_decimal6[0] ;
         pcosdab.this.AV33BarCosCol = GXv_decimal5[0] ;
         pcosdab.this.AV34BarCosAnc = GXv_decimal4[0] ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV37EmpNumDec == 0 )
      {
         AV38BarCosPdP = AV29BarCosPD ;
         AV42BarCosADP = AV30BarCosAD ;
         AV43BarCosAAP = AV31BarCosAA ;
         AV39BarCosPaP = AV32BarCosPA ;
         AV40BarCosColP = AV33BarCosCol ;
         AV41BarCosAncP = AV34BarCosAnc ;
      }
      else
      {
         if ( AV37EmpNumDec == 2 )
         {
            AV38BarCosPdP = GXutil.roundDecimal( AV29BarCosPD, 2) ;
            AV42BarCosADP = GXutil.roundDecimal( AV30BarCosAD, 2) ;
            AV43BarCosAAP = GXutil.roundDecimal( AV31BarCosAA, 2) ;
            AV39BarCosPaP = GXutil.roundDecimal( AV32BarCosPA, 2) ;
            AV40BarCosColP = GXutil.roundDecimal( AV33BarCosCol, 2) ;
            AV41BarCosAncP = GXutil.roundDecimal( AV34BarCosAnc, 2) ;
         }
      }
      if ( AV49NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcosdab");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUEST' Routine */
      returnInSub = false ;
      /* Using cursor P00SP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV22PrdComCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A688PrdComCod = P00SP6_A688PrdComCod[0] ;
         A724PrdPreAct = P00SP6_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00SP6_A5255PrdPreAc2[0] ;
         A690PrdComFN = P00SP6_A690PrdComFN[0] ;
         A707PrdFacCon = P00SP6_A707PrdFacCon[0] ;
         A3915EmpNumDec = P00SP6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00SP6_n3915EmpNumDec[0] ;
         A719PrdNum = P00SP6_A719PrdNum[0] ;
         n719PrdNum = P00SP6_n719PrdNum[0] ;
         A3915EmpNumDec = P00SP6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00SP6_n3915EmpNumDec[0] ;
         A724PrdPreAct = P00SP6_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00SP6_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00SP6_A707PrdFacCon[0] ;
         AV48PrdPreAct = A724PrdPreAct ;
         if ( ( AV47F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
         {
            AV48PrdPreAct = A5255PrdPreAc2 ;
         }
         AV20Exis = ((AV23PrdCant.add(AV24PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         if ( A3915EmpNumDec == 0 )
         {
            AV35CosPro2 = (AV23PrdCant.multiply(AV48PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            AV36CosAny2 = (AV24PrdCanAny.multiply(AV48PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV35CosPro2 = (AV23PrdCant.multiply(AV48PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               AV36CosAny2 = (AV24PrdCanAny.multiply(AV48PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         GXv_char3[0] = A719PrdNum ;
         GXv_decimal11[0] = AV35CosPro2 ;
         GXv_decimal10[0] = AV36CosAny2 ;
         GXv_decimal9[0] = AV29BarCosPD ;
         GXv_decimal8[0] = AV30BarCosAD ;
         GXv_decimal7[0] = AV31BarCosAA ;
         GXv_decimal6[0] = AV32BarCosPA ;
         GXv_decimal5[0] = AV33BarCosCol ;
         GXv_decimal4[0] = AV34BarCosAnc ;
         new app.pacucos(remoteHandle, context).execute( GXv_char3, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_decimal6, GXv_decimal5, GXv_decimal4) ;
         pcosdab.this.A719PrdNum = GXv_char3[0] ;
         pcosdab.this.AV35CosPro2 = GXv_decimal11[0] ;
         pcosdab.this.AV36CosAny2 = GXv_decimal10[0] ;
         pcosdab.this.AV29BarCosPD = GXv_decimal9[0] ;
         pcosdab.this.AV30BarCosAD = GXv_decimal8[0] ;
         pcosdab.this.AV31BarCosAA = GXv_decimal7[0] ;
         pcosdab.this.AV32BarCosPA = GXv_decimal6[0] ;
         pcosdab.this.AV33BarCosCol = GXv_decimal5[0] ;
         pcosdab.this.AV34BarCosAnc = GXv_decimal4[0] ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcosdab.this.A396EmprCod;
      this.aP1[0] = pcosdab.this.A129BarCod;
      this.aP2[0] = pcosdab.this.A132BarCodReo;
      this.aP3[0] = pcosdab.this.A130BarCodPar;
      this.aP4[0] = pcosdab.this.A2804RecLinMaq;
      this.aP5[0] = pcosdab.this.AV38BarCosPdP;
      this.aP6[0] = pcosdab.this.AV42BarCosADP;
      this.aP7[0] = pcosdab.this.AV43BarCosAAP;
      this.aP8[0] = pcosdab.this.AV39BarCosPaP;
      this.aP9[0] = pcosdab.this.AV40BarCosColP;
      this.aP10[0] = pcosdab.this.AV41BarCosAncP;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P00SP2_A396EmprCod = new String[] {""} ;
      P00SP2_A3915EmpNumDec = new byte[1] ;
      P00SP2_n3915EmpNumDec = new boolean[] {false} ;
      P00SP3_A396EmprCod = new String[] {""} ;
      P00SP3_A129BarCod = new int[1] ;
      P00SP3_A132BarCodReo = new byte[1] ;
      P00SP3_A130BarCodPar = new String[] {""} ;
      P00SP3_A2804RecLinMaq = new short[1] ;
      P00SP3_A719PrdNum = new String[] {""} ;
      P00SP3_n719PrdNum = new boolean[] {false} ;
      P00SP3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP3_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP3_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP3_A811RecLin = new short[1] ;
      P00SP3_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV48PrdPreAct = DecimalUtil.ZERO ;
      AV20Exis = DecimalUtil.ZERO ;
      AV35CosPro2 = DecimalUtil.ZERO ;
      AV36CosAny2 = DecimalUtil.ZERO ;
      AV29BarCosPD = DecimalUtil.ZERO ;
      AV30BarCosAD = DecimalUtil.ZERO ;
      AV31BarCosAA = DecimalUtil.ZERO ;
      AV32BarCosPA = DecimalUtil.ZERO ;
      AV33BarCosCol = DecimalUtil.ZERO ;
      AV34BarCosAnc = DecimalUtil.ZERO ;
      P00SP4_A396EmprCod = new String[] {""} ;
      P00SP4_A129BarCod = new int[1] ;
      P00SP4_A132BarCodReo = new byte[1] ;
      P00SP4_A130BarCodPar = new String[] {""} ;
      P00SP4_A2804RecLinMaq = new short[1] ;
      P00SP4_A719PrdNum = new String[] {""} ;
      P00SP4_n719PrdNum = new boolean[] {false} ;
      P00SP4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP4_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP4_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP4_A811RecLin = new short[1] ;
      P00SP4_A1273RecLinPro = new byte[1] ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      AV22PrdComCod = "" ;
      AV23PrdCant = DecimalUtil.ZERO ;
      AV24PrdCanAny = DecimalUtil.ZERO ;
      AV25PrdCanFin = DecimalUtil.ZERO ;
      P00SP5_A396EmprCod = new String[] {""} ;
      P00SP5_A129BarCod = new int[1] ;
      P00SP5_A132BarCodReo = new byte[1] ;
      P00SP5_A130BarCodPar = new String[] {""} ;
      P00SP5_A719PrdNum = new String[] {""} ;
      P00SP5_n719PrdNum = new boolean[] {false} ;
      P00SP5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP5_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP5_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP5_n1378PrdCFin = new boolean[] {false} ;
      P00SP5_A3915EmpNumDec = new byte[1] ;
      P00SP5_n3915EmpNumDec = new boolean[] {false} ;
      P00SP5_A1377RecNumAny = new byte[1] ;
      P00SP5_A2808RecLinMAL = new short[1] ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      P00SP6_A396EmprCod = new String[] {""} ;
      P00SP6_A688PrdComCod = new String[] {""} ;
      P00SP6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP6_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP6_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP6_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SP6_A3915EmpNumDec = new byte[1] ;
      P00SP6_n3915EmpNumDec = new boolean[] {false} ;
      P00SP6_A719PrdNum = new String[] {""} ;
      P00SP6_n719PrdNum = new boolean[] {false} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pcosdab__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pcosdab__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pcosdab__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pcosdab__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcosdab__default(),
         new Object[] {
             new Object[] {
            P00SP2_A396EmprCod, P00SP2_A3915EmpNumDec, P00SP2_n3915EmpNumDec
            }
            , new Object[] {
            P00SP3_A396EmprCod, P00SP3_A129BarCod, P00SP3_A132BarCodReo, P00SP3_A130BarCodPar, P00SP3_A2804RecLinMaq, P00SP3_A719PrdNum, P00SP3_n719PrdNum, P00SP3_A724PrdPreAct, P00SP3_A5255PrdPreAc2, P00SP3_A707PrdFacCon,
            P00SP3_A1797PrdCanAny, P00SP3_A686PrdCant, P00SP3_A811RecLin, P00SP3_A1273RecLinPro
            }
            , new Object[] {
            P00SP4_A396EmprCod, P00SP4_A129BarCod, P00SP4_A132BarCodReo, P00SP4_A130BarCodPar, P00SP4_A2804RecLinMaq, P00SP4_A719PrdNum, P00SP4_n719PrdNum, P00SP4_A686PrdCant, P00SP4_A1797PrdCanAny, P00SP4_A683PrdCanFin,
            P00SP4_A811RecLin, P00SP4_A1273RecLinPro
            }
            , new Object[] {
            P00SP5_A396EmprCod, P00SP5_A129BarCod, P00SP5_A132BarCodReo, P00SP5_A130BarCodPar, P00SP5_A719PrdNum, P00SP5_A724PrdPreAct, P00SP5_A5255PrdPreAc2, P00SP5_A707PrdFacCon, P00SP5_A1378PrdCFin, P00SP5_n1378PrdCFin,
            P00SP5_A3915EmpNumDec, P00SP5_n3915EmpNumDec, P00SP5_A1377RecNumAny, P00SP5_A2808RecLinMAL
            }
            , new Object[] {
            P00SP6_A396EmprCod, P00SP6_A688PrdComCod, P00SP6_A724PrdPreAct, P00SP6_A5255PrdPreAc2, P00SP6_A690PrdComFN, P00SP6_A707PrdFacCon, P00SP6_A3915EmpNumDec, P00SP6_n3915EmpNumDec, P00SP6_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV49NCLec ;
   private byte GXt_int1 ;
   private byte AV47F_precio2 ;
   private byte GXv_int2[] ;
   private byte A3915EmpNumDec ;
   private byte AV37EmpNumDec ;
   private byte A1273RecLinPro ;
   private byte A1377RecNumAny ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A2808RecLinMAL ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV38BarCosPdP ;
   private java.math.BigDecimal AV42BarCosADP ;
   private java.math.BigDecimal AV43BarCosAAP ;
   private java.math.BigDecimal AV39BarCosPaP ;
   private java.math.BigDecimal AV40BarCosColP ;
   private java.math.BigDecimal AV41BarCosAncP ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV48PrdPreAct ;
   private java.math.BigDecimal AV20Exis ;
   private java.math.BigDecimal AV35CosPro2 ;
   private java.math.BigDecimal AV36CosAny2 ;
   private java.math.BigDecimal AV29BarCosPD ;
   private java.math.BigDecimal AV30BarCosAD ;
   private java.math.BigDecimal AV31BarCosAA ;
   private java.math.BigDecimal AV32BarCosPA ;
   private java.math.BigDecimal AV33BarCosCol ;
   private java.math.BigDecimal AV34BarCosAnc ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal AV23PrdCant ;
   private java.math.BigDecimal AV24PrdCanAny ;
   private java.math.BigDecimal AV25PrdCanFin ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String Gx_msg ;
   private String AV22PrdComCod ;
   private String A688PrdComCod ;
   private String GXv_char3[] ;
   private boolean n3915EmpNumDec ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n1378PrdCFin ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P00SP2_A396EmprCod ;
   private byte[] P00SP2_A3915EmpNumDec ;
   private boolean[] P00SP2_n3915EmpNumDec ;
   private String[] P00SP3_A396EmprCod ;
   private int[] P00SP3_A129BarCod ;
   private byte[] P00SP3_A132BarCodReo ;
   private String[] P00SP3_A130BarCodPar ;
   private short[] P00SP3_A2804RecLinMaq ;
   private String[] P00SP3_A719PrdNum ;
   private boolean[] P00SP3_n719PrdNum ;
   private java.math.BigDecimal[] P00SP3_A724PrdPreAct ;
   private java.math.BigDecimal[] P00SP3_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P00SP3_A707PrdFacCon ;
   private java.math.BigDecimal[] P00SP3_A1797PrdCanAny ;
   private java.math.BigDecimal[] P00SP3_A686PrdCant ;
   private short[] P00SP3_A811RecLin ;
   private byte[] P00SP3_A1273RecLinPro ;
   private String[] P00SP4_A396EmprCod ;
   private int[] P00SP4_A129BarCod ;
   private byte[] P00SP4_A132BarCodReo ;
   private String[] P00SP4_A130BarCodPar ;
   private short[] P00SP4_A2804RecLinMaq ;
   private String[] P00SP4_A719PrdNum ;
   private boolean[] P00SP4_n719PrdNum ;
   private java.math.BigDecimal[] P00SP4_A686PrdCant ;
   private java.math.BigDecimal[] P00SP4_A1797PrdCanAny ;
   private java.math.BigDecimal[] P00SP4_A683PrdCanFin ;
   private short[] P00SP4_A811RecLin ;
   private byte[] P00SP4_A1273RecLinPro ;
   private String[] P00SP5_A396EmprCod ;
   private int[] P00SP5_A129BarCod ;
   private byte[] P00SP5_A132BarCodReo ;
   private String[] P00SP5_A130BarCodPar ;
   private String[] P00SP5_A719PrdNum ;
   private boolean[] P00SP5_n719PrdNum ;
   private java.math.BigDecimal[] P00SP5_A724PrdPreAct ;
   private java.math.BigDecimal[] P00SP5_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P00SP5_A707PrdFacCon ;
   private java.math.BigDecimal[] P00SP5_A1378PrdCFin ;
   private boolean[] P00SP5_n1378PrdCFin ;
   private byte[] P00SP5_A3915EmpNumDec ;
   private boolean[] P00SP5_n3915EmpNumDec ;
   private byte[] P00SP5_A1377RecNumAny ;
   private short[] P00SP5_A2808RecLinMAL ;
   private String[] P00SP6_A396EmprCod ;
   private String[] P00SP6_A688PrdComCod ;
   private java.math.BigDecimal[] P00SP6_A724PrdPreAct ;
   private java.math.BigDecimal[] P00SP6_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P00SP6_A690PrdComFN ;
   private java.math.BigDecimal[] P00SP6_A707PrdFacCon ;
   private byte[] P00SP6_A3915EmpNumDec ;
   private boolean[] P00SP6_n3915EmpNumDec ;
   private String[] P00SP6_A719PrdNum ;
   private boolean[] P00SP6_n719PrdNum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcosdab__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class pcosdab__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pcosdab__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pcosdab__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pcosdab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00SP2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00SP3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum, T2.PrdPreAct, T2.PrdPreAc2, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) AND (SUBSTR(T1.PrdNum, 1, 1) <> '0') AND (T1.PrdNum >= '100000' and T1.PrdNum <= '999999') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00SP4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, PrdNum, PrdCant, PrdCanAny, PrdCanFin, RecLin, RecLinPro FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (Not (rtrim(PrdNum) IS NULL AND NOT(PrdNum IS NULL))) AND (SUBSTR(PrdNum, 1, 1) = '0') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00SP5", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PrdNum, T3.PrdPreAct, T3.PrdPreAc2, T3.PrdFacCon, T1.PrdCFin, T2.EmpNumDec, T1.RecNumAny, T1.RecLinMAL FROM ((TXPLANYAD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00SP6", "SELECT T1.EmprCod, T1.PrdComCod, T3.PrdPreAct, T3.PrdPreAc2, T1.PrdComFN, T3.PrdFacCon, T2.EmpNumDec, T1.PrdNum FROM ((TXPLPRDCO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

