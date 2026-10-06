package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls108 extends GXProcedure
{
   public pcls108( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls108.class ), "" );
   }

   public pcls108( int remoteHandle ,
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
      pcls108.this.aP10 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pcls108.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls108.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcls108.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls108.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls108.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcls108.this.AV53BarCosPdP = aP5[0];
      this.aP5 = aP5;
      pcls108.this.AV45BarCosADP = aP6[0];
      this.aP6 = aP6;
      pcls108.this.AV43BarCosAAP = aP7[0];
      this.aP7 = aP7;
      pcls108.this.AV51BarCosPaP = aP8[0];
      this.aP8 = aP8;
      pcls108.this.AV49BarCosColP = aP9[0];
      this.aP9 = aP9;
      pcls108.this.AV47BarCosAncP = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV63F_precio2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRECI2", ""), GXv_int2) ;
      pcls108.this.GXt_int1 = GXv_int2[0] ;
      AV63F_precio2 = GXt_int1 ;
      /* Using cursor P05782 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P05782_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P05782_n3915EmpNumDec[0] ;
         AV60EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P05783 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P05783_A719PrdNum[0] ;
         n719PrdNum = P05783_n719PrdNum[0] ;
         A724PrdPreAct = P05783_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P05783_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P05783_A707PrdFacCon[0] ;
         A1797PrdCanAny = P05783_A1797PrdCanAny[0] ;
         A686PrdCant = P05783_A686PrdCant[0] ;
         A811RecLin = P05783_A811RecLin[0] ;
         A1273RecLinPro = P05783_A1273RecLinPro[0] ;
         A724PrdPreAct = P05783_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P05783_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P05783_A707PrdFacCon[0] ;
         AV75PrdPreAct = ((AV63F_precio2==1)&&(A5255PrdPreAc2.doubleValue()>0) ? A5255PrdPreAc2 : A724PrdPreAct) ;
         AV62Exis = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         AV59CosPro2 = (A686PrdCant.multiply(AV75PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         AV57CosAny2 = (A1797PrdCanAny.multiply(AV75PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         GXv_char3[0] = A719PrdNum ;
         GXv_decimal4[0] = AV59CosPro2 ;
         GXv_decimal5[0] = AV57CosAny2 ;
         GXv_decimal6[0] = AV52BarCosPD ;
         GXv_decimal7[0] = AV44BarCosAD ;
         GXv_decimal8[0] = AV42BarCosAA ;
         GXv_decimal9[0] = AV50BarCosPA ;
         GXv_decimal10[0] = AV48BarCosCol ;
         GXv_decimal11[0] = AV46BarCosAnc ;
         new app.pcls009(remoteHandle, context).execute( GXv_char3, GXv_decimal4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11) ;
         pcls108.this.A719PrdNum = GXv_char3[0] ;
         pcls108.this.AV59CosPro2 = GXv_decimal4[0] ;
         pcls108.this.AV57CosAny2 = GXv_decimal5[0] ;
         pcls108.this.AV52BarCosPD = GXv_decimal6[0] ;
         pcls108.this.AV44BarCosAD = GXv_decimal7[0] ;
         pcls108.this.AV42BarCosAA = GXv_decimal8[0] ;
         pcls108.this.AV50BarCosPA = GXv_decimal9[0] ;
         pcls108.this.AV48BarCosCol = GXv_decimal10[0] ;
         pcls108.this.AV46BarCosAnc = GXv_decimal11[0] ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P05784 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P05784_A719PrdNum[0] ;
         n719PrdNum = P05784_n719PrdNum[0] ;
         A686PrdCant = P05784_A686PrdCant[0] ;
         A1797PrdCanAny = P05784_A1797PrdCanAny[0] ;
         A683PrdCanFin = P05784_A683PrdCanFin[0] ;
         A811RecLin = P05784_A811RecLin[0] ;
         A1273RecLinPro = P05784_A1273RecLinPro[0] ;
         AV74PrdComCod = A719PrdNum ;
         AV73PrdCant = A686PrdCant ;
         AV71PrdCanAny = A1797PrdCanAny ;
         AV72PrdCanFin = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A683PrdCanFin)==0) ? A686PrdCant : A683PrdCanFin) ;
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
      /* Using cursor P05785 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2808RecLinMAL = P05785_A2808RecLinMAL[0] ;
         A719PrdNum = P05785_A719PrdNum[0] ;
         n719PrdNum = P05785_n719PrdNum[0] ;
         A724PrdPreAct = P05785_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P05785_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P05785_A707PrdFacCon[0] ;
         A1378PrdCFin = P05785_A1378PrdCFin[0] ;
         n1378PrdCFin = P05785_n1378PrdCFin[0] ;
         A3915EmpNumDec = P05785_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P05785_n3915EmpNumDec[0] ;
         A1377RecNumAny = P05785_A1377RecNumAny[0] ;
         A3915EmpNumDec = P05785_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P05785_n3915EmpNumDec[0] ;
         A724PrdPreAct = P05785_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P05785_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P05785_A707PrdFacCon[0] ;
         AV75PrdPreAct = ((AV63F_precio2==1)&&(A5255PrdPreAc2.doubleValue()>0) ? A5255PrdPreAc2 : A724PrdPreAct) ;
         AV62Exis = (A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         if ( A3915EmpNumDec == 0 )
         {
            AV57CosAny2 = (A1378PrdCFin.multiply(AV75PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV57CosAny2 = (A1378PrdCFin.multiply(AV75PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         GXv_char3[0] = A719PrdNum ;
         GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal10[0] = AV57CosAny2 ;
         GXv_decimal9[0] = AV52BarCosPD ;
         GXv_decimal8[0] = AV44BarCosAD ;
         GXv_decimal7[0] = AV42BarCosAA ;
         GXv_decimal6[0] = AV50BarCosPA ;
         GXv_decimal5[0] = AV48BarCosCol ;
         GXv_decimal4[0] = AV46BarCosAnc ;
         new app.pcls009(remoteHandle, context).execute( GXv_char3, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_decimal6, GXv_decimal5, GXv_decimal4) ;
         pcls108.this.A719PrdNum = GXv_char3[0] ;
         pcls108.this.AV57CosAny2 = GXv_decimal10[0] ;
         pcls108.this.AV52BarCosPD = GXv_decimal9[0] ;
         pcls108.this.AV44BarCosAD = GXv_decimal8[0] ;
         pcls108.this.AV42BarCosAA = GXv_decimal7[0] ;
         pcls108.this.AV50BarCosPA = GXv_decimal6[0] ;
         pcls108.this.AV48BarCosCol = GXv_decimal5[0] ;
         pcls108.this.AV46BarCosAnc = GXv_decimal4[0] ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV53BarCosPdP = GXutil.roundDecimal( AV52BarCosPD, 2) ;
      AV45BarCosADP = GXutil.roundDecimal( AV44BarCosAD, 2) ;
      AV43BarCosAAP = GXutil.roundDecimal( AV42BarCosAA, 2) ;
      AV51BarCosPaP = GXutil.roundDecimal( AV50BarCosPA, 2) ;
      AV49BarCosColP = GXutil.roundDecimal( AV48BarCosCol, 2) ;
      AV47BarCosAncP = GXutil.roundDecimal( AV46BarCosAnc, 2) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUEST' Routine */
      returnInSub = false ;
      /* Using cursor P05786 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV74PrdComCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A688PrdComCod = P05786_A688PrdComCod[0] ;
         A724PrdPreAct = P05786_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P05786_A5255PrdPreAc2[0] ;
         A690PrdComFN = P05786_A690PrdComFN[0] ;
         A707PrdFacCon = P05786_A707PrdFacCon[0] ;
         A3915EmpNumDec = P05786_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P05786_n3915EmpNumDec[0] ;
         A719PrdNum = P05786_A719PrdNum[0] ;
         n719PrdNum = P05786_n719PrdNum[0] ;
         A3915EmpNumDec = P05786_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P05786_n3915EmpNumDec[0] ;
         A724PrdPreAct = P05786_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P05786_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P05786_A707PrdFacCon[0] ;
         AV75PrdPreAct = ((AV63F_precio2==1)&&(A5255PrdPreAc2.doubleValue()>0) ? A5255PrdPreAc2 : A724PrdPreAct) ;
         AV62Exis = ((AV73PrdCant.add(AV71PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         if ( A3915EmpNumDec == 0 )
         {
            AV59CosPro2 = (AV73PrdCant.multiply(AV75PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            AV57CosAny2 = (AV71PrdCanAny.multiply(AV75PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV59CosPro2 = (AV73PrdCant.multiply(AV75PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               AV57CosAny2 = (AV71PrdCanAny.multiply(AV75PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         GXv_char3[0] = A719PrdNum ;
         GXv_decimal11[0] = AV59CosPro2 ;
         GXv_decimal10[0] = AV57CosAny2 ;
         GXv_decimal9[0] = AV52BarCosPD ;
         GXv_decimal8[0] = AV44BarCosAD ;
         GXv_decimal7[0] = AV42BarCosAA ;
         GXv_decimal6[0] = AV50BarCosPA ;
         GXv_decimal5[0] = AV48BarCosCol ;
         GXv_decimal4[0] = AV46BarCosAnc ;
         new app.pcls009(remoteHandle, context).execute( GXv_char3, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_decimal6, GXv_decimal5, GXv_decimal4) ;
         pcls108.this.A719PrdNum = GXv_char3[0] ;
         pcls108.this.AV59CosPro2 = GXv_decimal11[0] ;
         pcls108.this.AV57CosAny2 = GXv_decimal10[0] ;
         pcls108.this.AV52BarCosPD = GXv_decimal9[0] ;
         pcls108.this.AV44BarCosAD = GXv_decimal8[0] ;
         pcls108.this.AV42BarCosAA = GXv_decimal7[0] ;
         pcls108.this.AV50BarCosPA = GXv_decimal6[0] ;
         pcls108.this.AV48BarCosCol = GXv_decimal5[0] ;
         pcls108.this.AV46BarCosAnc = GXv_decimal4[0] ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls108.this.A396EmprCod;
      this.aP1[0] = pcls108.this.A129BarCod;
      this.aP2[0] = pcls108.this.A132BarCodReo;
      this.aP3[0] = pcls108.this.A130BarCodPar;
      this.aP4[0] = pcls108.this.A2804RecLinMaq;
      this.aP5[0] = pcls108.this.AV53BarCosPdP;
      this.aP6[0] = pcls108.this.AV45BarCosADP;
      this.aP7[0] = pcls108.this.AV43BarCosAAP;
      this.aP8[0] = pcls108.this.AV51BarCosPaP;
      this.aP9[0] = pcls108.this.AV49BarCosColP;
      this.aP10[0] = pcls108.this.AV47BarCosAncP;
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
      P05782_A396EmprCod = new String[] {""} ;
      P05782_A3915EmpNumDec = new byte[1] ;
      P05782_n3915EmpNumDec = new boolean[] {false} ;
      P05783_A396EmprCod = new String[] {""} ;
      P05783_A129BarCod = new int[1] ;
      P05783_A132BarCodReo = new byte[1] ;
      P05783_A130BarCodPar = new String[] {""} ;
      P05783_A2804RecLinMaq = new short[1] ;
      P05783_A719PrdNum = new String[] {""} ;
      P05783_n719PrdNum = new boolean[] {false} ;
      P05783_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05783_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05783_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05783_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05783_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05783_A811RecLin = new short[1] ;
      P05783_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      AV75PrdPreAct = DecimalUtil.ZERO ;
      AV62Exis = DecimalUtil.ZERO ;
      AV59CosPro2 = DecimalUtil.ZERO ;
      AV57CosAny2 = DecimalUtil.ZERO ;
      AV52BarCosPD = DecimalUtil.ZERO ;
      AV44BarCosAD = DecimalUtil.ZERO ;
      AV42BarCosAA = DecimalUtil.ZERO ;
      AV50BarCosPA = DecimalUtil.ZERO ;
      AV48BarCosCol = DecimalUtil.ZERO ;
      AV46BarCosAnc = DecimalUtil.ZERO ;
      P05784_A396EmprCod = new String[] {""} ;
      P05784_A129BarCod = new int[1] ;
      P05784_A132BarCodReo = new byte[1] ;
      P05784_A130BarCodPar = new String[] {""} ;
      P05784_A2804RecLinMaq = new short[1] ;
      P05784_A719PrdNum = new String[] {""} ;
      P05784_n719PrdNum = new boolean[] {false} ;
      P05784_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05784_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05784_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05784_A811RecLin = new short[1] ;
      P05784_A1273RecLinPro = new byte[1] ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      AV74PrdComCod = "" ;
      AV73PrdCant = DecimalUtil.ZERO ;
      AV71PrdCanAny = DecimalUtil.ZERO ;
      AV72PrdCanFin = DecimalUtil.ZERO ;
      P05785_A396EmprCod = new String[] {""} ;
      P05785_A129BarCod = new int[1] ;
      P05785_A132BarCodReo = new byte[1] ;
      P05785_A130BarCodPar = new String[] {""} ;
      P05785_A2808RecLinMAL = new short[1] ;
      P05785_A719PrdNum = new String[] {""} ;
      P05785_n719PrdNum = new boolean[] {false} ;
      P05785_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05785_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05785_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05785_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05785_n1378PrdCFin = new boolean[] {false} ;
      P05785_A3915EmpNumDec = new byte[1] ;
      P05785_n3915EmpNumDec = new boolean[] {false} ;
      P05785_A1377RecNumAny = new byte[1] ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      P05786_A396EmprCod = new String[] {""} ;
      P05786_A688PrdComCod = new String[] {""} ;
      P05786_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05786_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05786_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05786_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05786_A3915EmpNumDec = new byte[1] ;
      P05786_n3915EmpNumDec = new boolean[] {false} ;
      P05786_A719PrdNum = new String[] {""} ;
      P05786_n719PrdNum = new boolean[] {false} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls108__default(),
         new Object[] {
             new Object[] {
            P05782_A396EmprCod, P05782_A3915EmpNumDec, P05782_n3915EmpNumDec
            }
            , new Object[] {
            P05783_A396EmprCod, P05783_A129BarCod, P05783_A132BarCodReo, P05783_A130BarCodPar, P05783_A2804RecLinMaq, P05783_A719PrdNum, P05783_n719PrdNum, P05783_A724PrdPreAct, P05783_A5255PrdPreAc2, P05783_A707PrdFacCon,
            P05783_A1797PrdCanAny, P05783_A686PrdCant, P05783_A811RecLin, P05783_A1273RecLinPro
            }
            , new Object[] {
            P05784_A396EmprCod, P05784_A129BarCod, P05784_A132BarCodReo, P05784_A130BarCodPar, P05784_A2804RecLinMaq, P05784_A719PrdNum, P05784_n719PrdNum, P05784_A686PrdCant, P05784_A1797PrdCanAny, P05784_A683PrdCanFin,
            P05784_A811RecLin, P05784_A1273RecLinPro
            }
            , new Object[] {
            P05785_A396EmprCod, P05785_A129BarCod, P05785_A132BarCodReo, P05785_A130BarCodPar, P05785_A2808RecLinMAL, P05785_A719PrdNum, P05785_A724PrdPreAct, P05785_A5255PrdPreAc2, P05785_A707PrdFacCon, P05785_A1378PrdCFin,
            P05785_n1378PrdCFin, P05785_A3915EmpNumDec, P05785_n3915EmpNumDec, P05785_A1377RecNumAny
            }
            , new Object[] {
            P05786_A396EmprCod, P05786_A688PrdComCod, P05786_A724PrdPreAct, P05786_A5255PrdPreAc2, P05786_A690PrdComFN, P05786_A707PrdFacCon, P05786_A3915EmpNumDec, P05786_n3915EmpNumDec, P05786_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV63F_precio2 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A3915EmpNumDec ;
   private byte AV60EmpNumDec ;
   private byte A1273RecLinPro ;
   private byte A1377RecNumAny ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A2808RecLinMAL ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV53BarCosPdP ;
   private java.math.BigDecimal AV45BarCosADP ;
   private java.math.BigDecimal AV43BarCosAAP ;
   private java.math.BigDecimal AV51BarCosPaP ;
   private java.math.BigDecimal AV49BarCosColP ;
   private java.math.BigDecimal AV47BarCosAncP ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV75PrdPreAct ;
   private java.math.BigDecimal AV62Exis ;
   private java.math.BigDecimal AV59CosPro2 ;
   private java.math.BigDecimal AV57CosAny2 ;
   private java.math.BigDecimal AV52BarCosPD ;
   private java.math.BigDecimal AV44BarCosAD ;
   private java.math.BigDecimal AV42BarCosAA ;
   private java.math.BigDecimal AV50BarCosPA ;
   private java.math.BigDecimal AV48BarCosCol ;
   private java.math.BigDecimal AV46BarCosAnc ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal AV73PrdCant ;
   private java.math.BigDecimal AV71PrdCanAny ;
   private java.math.BigDecimal AV72PrdCanFin ;
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
   private String AV74PrdComCod ;
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
   private String[] P05782_A396EmprCod ;
   private byte[] P05782_A3915EmpNumDec ;
   private boolean[] P05782_n3915EmpNumDec ;
   private String[] P05783_A396EmprCod ;
   private int[] P05783_A129BarCod ;
   private byte[] P05783_A132BarCodReo ;
   private String[] P05783_A130BarCodPar ;
   private short[] P05783_A2804RecLinMaq ;
   private String[] P05783_A719PrdNum ;
   private boolean[] P05783_n719PrdNum ;
   private java.math.BigDecimal[] P05783_A724PrdPreAct ;
   private java.math.BigDecimal[] P05783_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P05783_A707PrdFacCon ;
   private java.math.BigDecimal[] P05783_A1797PrdCanAny ;
   private java.math.BigDecimal[] P05783_A686PrdCant ;
   private short[] P05783_A811RecLin ;
   private byte[] P05783_A1273RecLinPro ;
   private String[] P05784_A396EmprCod ;
   private int[] P05784_A129BarCod ;
   private byte[] P05784_A132BarCodReo ;
   private String[] P05784_A130BarCodPar ;
   private short[] P05784_A2804RecLinMaq ;
   private String[] P05784_A719PrdNum ;
   private boolean[] P05784_n719PrdNum ;
   private java.math.BigDecimal[] P05784_A686PrdCant ;
   private java.math.BigDecimal[] P05784_A1797PrdCanAny ;
   private java.math.BigDecimal[] P05784_A683PrdCanFin ;
   private short[] P05784_A811RecLin ;
   private byte[] P05784_A1273RecLinPro ;
   private String[] P05785_A396EmprCod ;
   private int[] P05785_A129BarCod ;
   private byte[] P05785_A132BarCodReo ;
   private String[] P05785_A130BarCodPar ;
   private short[] P05785_A2808RecLinMAL ;
   private String[] P05785_A719PrdNum ;
   private boolean[] P05785_n719PrdNum ;
   private java.math.BigDecimal[] P05785_A724PrdPreAct ;
   private java.math.BigDecimal[] P05785_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P05785_A707PrdFacCon ;
   private java.math.BigDecimal[] P05785_A1378PrdCFin ;
   private boolean[] P05785_n1378PrdCFin ;
   private byte[] P05785_A3915EmpNumDec ;
   private boolean[] P05785_n3915EmpNumDec ;
   private byte[] P05785_A1377RecNumAny ;
   private String[] P05786_A396EmprCod ;
   private String[] P05786_A688PrdComCod ;
   private java.math.BigDecimal[] P05786_A724PrdPreAct ;
   private java.math.BigDecimal[] P05786_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P05786_A690PrdComFN ;
   private java.math.BigDecimal[] P05786_A707PrdFacCon ;
   private byte[] P05786_A3915EmpNumDec ;
   private boolean[] P05786_n3915EmpNumDec ;
   private String[] P05786_A719PrdNum ;
   private boolean[] P05786_n719PrdNum ;
}

final  class pcls108__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05782", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05783", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum, T2.PrdPreAct, T2.PrdPreAc2, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) AND (SUBSTR(T1.PrdNum, 1, 1) <> '0') AND (T1.PrdNum >= '100000' and T1.PrdNum <= '999999') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05784", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, PrdNum, PrdCant, PrdCanAny, PrdCanFin, RecLin, RecLinPro FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (Not (rtrim(PrdNum) IS NULL AND NOT(PrdNum IS NULL))) AND (SUBSTR(PrdNum, 1, 1) = '0') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05785", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum, T3.PrdPreAct, T3.PrdPreAc2, T3.PrdFacCon, T1.PrdCFin, T2.EmpNumDec, T1.RecNumAny FROM ((TXPLANYAD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05786", "SELECT T1.EmprCod, T1.PrdComCod, T3.PrdPreAct, T3.PrdPreAc2, T1.PrdComFN, T3.PrdFacCon, T2.EmpNumDec, T1.PrdNum FROM ((TXPLPRDCO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(12);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

