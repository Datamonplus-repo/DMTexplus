package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc387 extends GXProcedure
{
   public pprc387( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc387.class ), "" );
   }

   public pprc387( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 )
   {
      pprc387.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pprc387.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc387.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprc387.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprc387.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprc387.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31CosPrd = DecimalUtil.doubleToDec(0) ;
      AV33Coste_f = DecimalUtil.doubleToDec(0) ;
      AV34Coste_lin = DecimalUtil.ZERO ;
      AV36Coste_tin = DecimalUtil.ZERO ;
      AV38CosteFF = DecimalUtil.ZERO ;
      AV39CosteFNF = DecimalUtil.ZERO ;
      AV63HbaCosteT = DecimalUtil.ZERO ;
      AV37CosteExt = DecimalUtil.ZERO ;
      /* Using cursor P09R53 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A603MaqCodBis = P09R53_A603MaqCodBis[0] ;
         A457FasCod = P09R53_A457FasCod[0] ;
         A215BarTieRea = P09R53_A215BarTieRea[0] ;
         A3837BarFasKgm = P09R53_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P09R53_n3837BarFasKgm[0] ;
         A3838BarFasMtr = P09R53_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P09R53_n3838BarFasMtr[0] ;
         A228BarUniMed = P09R53_A228BarUniMed[0] ;
         A5719BarFasKgT = P09R53_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P09R53_n5719BarFasKgT[0] ;
         A5720BarFasMtT = P09R53_A5720BarFasMtT[0] ;
         n5720BarFasMtT = P09R53_n5720BarFasMtT[0] ;
         A150BarFacTin = P09R53_A150BarFacTin[0] ;
         A194BarOrdLin = P09R53_A194BarOrdLin[0] ;
         A758ProCod = P09R53_A758ProCod[0] ;
         A166BarKgm = P09R53_A166BarKgm[0] ;
         A184BarMtr = P09R53_A184BarMtr[0] ;
         A228BarUniMed = P09R53_A228BarUniMed[0] ;
         A166BarKgm = P09R53_A166BarKgm[0] ;
         A184BarMtr = P09R53_A184BarMtr[0] ;
         AV73MaqCod = A603MaqCodBis ;
         AV52fascod = A457FasCod ;
         /* Execute user subroutine: 'COSMIN' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV80Min = (byte)(DecimalUtil.decToDouble((A215BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
         AV95Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV80Min) ;
         AV31CosPrd = GXutil.roundDecimal( (DecimalUtil.doubleToDec(((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV80Min)).multiply(AV74MaqCosMin)), 2) ;
         AV69Kgm = ((A3837BarFasKgm.doubleValue()>0) ? A3837BarFasKgm : A166BarKgm) ;
         AV81Mtr = ((A3837BarFasKgm.doubleValue()>0) ? A3838BarFasMtr : A184BarMtr) ;
         if ( GXutil.strcmp(GXutil.trim( AV96TipMaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A3837BarFasKgm.doubleValue() > 0 )
               {
                  AV35Coste_m = GXutil.roundDecimal( (AV74MaqCosMin.multiply(A3837BarFasKgm)), 2) ;
               }
               else
               {
                  AV35Coste_m = GXutil.roundDecimal( (AV74MaqCosMin.multiply(A166BarKgm)), 2) ;
               }
               AV37CosteExt = AV37CosteExt.add(AV35Coste_m) ;
            }
            else
            {
               if ( A3838BarFasMtr.doubleValue() > 0 )
               {
                  AV35Coste_m = GXutil.roundDecimal( (AV74MaqCosMin.multiply(A3838BarFasMtr)), 2) ;
               }
               else
               {
                  AV35Coste_m = GXutil.roundDecimal( (AV74MaqCosMin.multiply(A184BarMtr)), 2) ;
               }
            }
         }
         else
         {
            if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( ( A5719BarFasKgT.doubleValue() > 0 ) && ( A3837BarFasKgm.doubleValue() > 0 ) )
               {
                  AV35Coste_m = (AV31CosPrd.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV35Coste_m = AV31CosPrd ;
               }
            }
            else
            {
               if ( ( A5720BarFasMtT.doubleValue() > 0 ) && ( A3838BarFasMtr.doubleValue() > 0 ) )
               {
                  AV35Coste_m = (AV31CosPrd.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV35Coste_m = AV31CosPrd ;
               }
            }
         }
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV36Coste_tin = AV36Coste_tin.add(AV35Coste_m) ;
         }
         else
         {
            AV34Coste_lin = AV35Coste_m ;
         }
         /* Execute user subroutine: 'ALBFAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) != 0 )
         {
            if ( AV8Albfas == 0 )
            {
               AV39CosteFNF = AV39CosteFNF.add(AV34Coste_lin) ;
            }
            else
            {
               AV38CosteFF = AV38CosteFF.add(AV34Coste_lin) ;
            }
         }
         AV33Coste_f = AV33Coste_f.add(AV35Coste_m) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'COSMIN' Routine */
      returnInSub = false ;
      AV74MaqCosMin = DecimalUtil.ZERO ;
      AV77MaqMOD = DecimalUtil.doubleToDec(0) ;
      AV78MaqMOI = DecimalUtil.doubleToDec(0) ;
      AV75MaqEnerg = DecimalUtil.doubleToDec(0) ;
      AV76MaqGas = DecimalUtil.doubleToDec(0) ;
      AV72MaqAgua = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P09R54 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV73MaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P09R54_A602MaqCod[0] ;
         A605MaqCosMin = P09R54_A605MaqCosMin[0] ;
         n605MaqCosMin = P09R54_n605MaqCosMin[0] ;
         A11825MaqAgua = P09R54_A11825MaqAgua[0] ;
         n11825MaqAgua = P09R54_n11825MaqAgua[0] ;
         A11824MaqGas = P09R54_A11824MaqGas[0] ;
         n11824MaqGas = P09R54_n11824MaqGas[0] ;
         A11823MaqEnerg = P09R54_A11823MaqEnerg[0] ;
         n11823MaqEnerg = P09R54_n11823MaqEnerg[0] ;
         A11822MaqMOI = P09R54_A11822MaqMOI[0] ;
         n11822MaqMOI = P09R54_n11822MaqMOI[0] ;
         A11821MaqMOD = P09R54_A11821MaqMOD[0] ;
         n11821MaqMOD = P09R54_n11821MaqMOD[0] ;
         A1011TipMaqCod = P09R54_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P09R54_n1011TipMaqCod[0] ;
         AV74MaqCosMin = ((AV94TasasEstandar>0) ? (A11821MaqMOD.add(A11822MaqMOI).add(A11823MaqEnerg).add(A11824MaqGas).add(A11825MaqAgua)) : A605MaqCosMin) ;
         AV96TipMaqCod = A1011TipMaqCod ;
         if ( AV94TasasEstandar == 1 )
         {
            AV77MaqMOD = A11821MaqMOD ;
            AV78MaqMOI = A11822MaqMOI ;
            AV75MaqEnerg = A11823MaqEnerg ;
            AV76MaqGas = A11824MaqGas ;
            AV72MaqAgua = A11825MaqAgua ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'ALBFAS' Routine */
      returnInSub = false ;
      AV8Albfas = (byte)(0) ;
      /* Using cursor P09R55 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV13BarCodReo), AV11BarCodPar, AV52fascod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P09R55_A457FasCod[0] ;
         A1241GuiFasPKg = P09R55_A1241GuiFasPKg[0] ;
         A30AlbProCod = P09R55_A30AlbProCod[0] ;
         A1240GuiFasLin = P09R55_A1240GuiFasLin[0] ;
         AV8Albfas = (byte)(1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc387.this.A396EmprCod;
      this.aP1[0] = pprc387.this.A129BarCod;
      this.aP2[0] = pprc387.this.A132BarCodReo;
      this.aP3[0] = pprc387.this.A130BarCodPar;
      this.aP4[0] = pprc387.this.AV33Coste_f;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33Coste_f = DecimalUtil.ZERO ;
      AV31CosPrd = DecimalUtil.ZERO ;
      AV34Coste_lin = DecimalUtil.ZERO ;
      AV36Coste_tin = DecimalUtil.ZERO ;
      AV38CosteFF = DecimalUtil.ZERO ;
      AV39CosteFNF = DecimalUtil.ZERO ;
      AV63HbaCosteT = DecimalUtil.ZERO ;
      AV37CosteExt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09R53_A396EmprCod = new String[] {""} ;
      P09R53_A129BarCod = new int[1] ;
      P09R53_A132BarCodReo = new byte[1] ;
      P09R53_A130BarCodPar = new String[] {""} ;
      P09R53_A603MaqCodBis = new String[] {""} ;
      P09R53_A457FasCod = new String[] {""} ;
      P09R53_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R53_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R53_n3837BarFasKgm = new boolean[] {false} ;
      P09R53_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R53_n3838BarFasMtr = new boolean[] {false} ;
      P09R53_A228BarUniMed = new String[] {""} ;
      P09R53_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R53_n5719BarFasKgT = new boolean[] {false} ;
      P09R53_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R53_n5720BarFasMtT = new boolean[] {false} ;
      P09R53_A150BarFacTin = new String[] {""} ;
      P09R53_A194BarOrdLin = new short[1] ;
      P09R53_A758ProCod = new String[] {""} ;
      P09R53_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R53_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A603MaqCodBis = "" ;
      A457FasCod = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV73MaqCod = "" ;
      AV52fascod = "" ;
      AV74MaqCosMin = DecimalUtil.ZERO ;
      AV69Kgm = DecimalUtil.ZERO ;
      AV81Mtr = DecimalUtil.ZERO ;
      AV96TipMaqCod = "" ;
      AV35Coste_m = DecimalUtil.ZERO ;
      AV77MaqMOD = DecimalUtil.ZERO ;
      AV78MaqMOI = DecimalUtil.ZERO ;
      AV75MaqEnerg = DecimalUtil.ZERO ;
      AV76MaqGas = DecimalUtil.ZERO ;
      AV72MaqAgua = DecimalUtil.ZERO ;
      P09R54_A396EmprCod = new String[] {""} ;
      P09R54_A602MaqCod = new String[] {""} ;
      P09R54_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R54_n605MaqCosMin = new boolean[] {false} ;
      P09R54_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R54_n11825MaqAgua = new boolean[] {false} ;
      P09R54_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R54_n11824MaqGas = new boolean[] {false} ;
      P09R54_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R54_n11823MaqEnerg = new boolean[] {false} ;
      P09R54_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R54_n11822MaqMOI = new boolean[] {false} ;
      P09R54_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R54_n11821MaqMOD = new boolean[] {false} ;
      P09R54_A1011TipMaqCod = new String[] {""} ;
      P09R54_n1011TipMaqCod = new boolean[] {false} ;
      A602MaqCod = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A11825MaqAgua = DecimalUtil.ZERO ;
      A11824MaqGas = DecimalUtil.ZERO ;
      A11823MaqEnerg = DecimalUtil.ZERO ;
      A11822MaqMOI = DecimalUtil.ZERO ;
      A11821MaqMOD = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      AV11BarCodPar = "" ;
      P09R55_A396EmprCod = new String[] {""} ;
      P09R55_A129BarCod = new int[1] ;
      P09R55_A132BarCodReo = new byte[1] ;
      P09R55_A130BarCodPar = new String[] {""} ;
      P09R55_A457FasCod = new String[] {""} ;
      P09R55_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R55_A30AlbProCod = new long[1] ;
      P09R55_A1240GuiFasLin = new short[1] ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc387__default(),
         new Object[] {
             new Object[] {
            P09R53_A396EmprCod, P09R53_A129BarCod, P09R53_A132BarCodReo, P09R53_A130BarCodPar, P09R53_A603MaqCodBis, P09R53_A457FasCod, P09R53_A215BarTieRea, P09R53_A3837BarFasKgm, P09R53_n3837BarFasKgm, P09R53_A3838BarFasMtr,
            P09R53_n3838BarFasMtr, P09R53_A228BarUniMed, P09R53_A5719BarFasKgT, P09R53_n5719BarFasKgT, P09R53_A5720BarFasMtT, P09R53_n5720BarFasMtT, P09R53_A150BarFacTin, P09R53_A194BarOrdLin, P09R53_A758ProCod, P09R53_A166BarKgm,
            P09R53_A184BarMtr
            }
            , new Object[] {
            P09R54_A396EmprCod, P09R54_A602MaqCod, P09R54_A605MaqCosMin, P09R54_n605MaqCosMin, P09R54_A11825MaqAgua, P09R54_n11825MaqAgua, P09R54_A11824MaqGas, P09R54_n11824MaqGas, P09R54_A11823MaqEnerg, P09R54_n11823MaqEnerg,
            P09R54_A11822MaqMOI, P09R54_n11822MaqMOI, P09R54_A11821MaqMOD, P09R54_n11821MaqMOD, P09R54_A1011TipMaqCod, P09R54_n1011TipMaqCod
            }
            , new Object[] {
            P09R55_A396EmprCod, P09R55_A129BarCod, P09R55_A132BarCodReo, P09R55_A130BarCodPar, P09R55_A457FasCod, P09R55_A1241GuiFasPKg, P09R55_A30AlbProCod, P09R55_A1240GuiFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV80Min ;
   private byte AV8Albfas ;
   private byte AV94TasasEstandar ;
   private byte AV13BarCodReo ;
   private short A194BarOrdLin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV95Tiempo_m ;
   private int AV9BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV33Coste_f ;
   private java.math.BigDecimal AV31CosPrd ;
   private java.math.BigDecimal AV34Coste_lin ;
   private java.math.BigDecimal AV36Coste_tin ;
   private java.math.BigDecimal AV38CosteFF ;
   private java.math.BigDecimal AV39CosteFNF ;
   private java.math.BigDecimal AV63HbaCosteT ;
   private java.math.BigDecimal AV37CosteExt ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV74MaqCosMin ;
   private java.math.BigDecimal AV69Kgm ;
   private java.math.BigDecimal AV81Mtr ;
   private java.math.BigDecimal AV35Coste_m ;
   private java.math.BigDecimal AV77MaqMOD ;
   private java.math.BigDecimal AV78MaqMOI ;
   private java.math.BigDecimal AV75MaqEnerg ;
   private java.math.BigDecimal AV76MaqGas ;
   private java.math.BigDecimal AV72MaqAgua ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A11825MaqAgua ;
   private java.math.BigDecimal A11824MaqGas ;
   private java.math.BigDecimal A11823MaqEnerg ;
   private java.math.BigDecimal A11822MaqMOI ;
   private java.math.BigDecimal A11821MaqMOD ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A603MaqCodBis ;
   private String A457FasCod ;
   private String A228BarUniMed ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String AV73MaqCod ;
   private String AV52fascod ;
   private String AV96TipMaqCod ;
   private String A602MaqCod ;
   private String A1011TipMaqCod ;
   private String AV11BarCodPar ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private boolean returnInSub ;
   private boolean n605MaqCosMin ;
   private boolean n11825MaqAgua ;
   private boolean n11824MaqGas ;
   private boolean n11823MaqEnerg ;
   private boolean n11822MaqMOI ;
   private boolean n11821MaqMOD ;
   private boolean n1011TipMaqCod ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P09R53_A396EmprCod ;
   private int[] P09R53_A129BarCod ;
   private byte[] P09R53_A132BarCodReo ;
   private String[] P09R53_A130BarCodPar ;
   private String[] P09R53_A603MaqCodBis ;
   private String[] P09R53_A457FasCod ;
   private java.math.BigDecimal[] P09R53_A215BarTieRea ;
   private java.math.BigDecimal[] P09R53_A3837BarFasKgm ;
   private boolean[] P09R53_n3837BarFasKgm ;
   private java.math.BigDecimal[] P09R53_A3838BarFasMtr ;
   private boolean[] P09R53_n3838BarFasMtr ;
   private String[] P09R53_A228BarUniMed ;
   private java.math.BigDecimal[] P09R53_A5719BarFasKgT ;
   private boolean[] P09R53_n5719BarFasKgT ;
   private java.math.BigDecimal[] P09R53_A5720BarFasMtT ;
   private boolean[] P09R53_n5720BarFasMtT ;
   private String[] P09R53_A150BarFacTin ;
   private short[] P09R53_A194BarOrdLin ;
   private String[] P09R53_A758ProCod ;
   private java.math.BigDecimal[] P09R53_A166BarKgm ;
   private java.math.BigDecimal[] P09R53_A184BarMtr ;
   private String[] P09R54_A396EmprCod ;
   private String[] P09R54_A602MaqCod ;
   private java.math.BigDecimal[] P09R54_A605MaqCosMin ;
   private boolean[] P09R54_n605MaqCosMin ;
   private java.math.BigDecimal[] P09R54_A11825MaqAgua ;
   private boolean[] P09R54_n11825MaqAgua ;
   private java.math.BigDecimal[] P09R54_A11824MaqGas ;
   private boolean[] P09R54_n11824MaqGas ;
   private java.math.BigDecimal[] P09R54_A11823MaqEnerg ;
   private boolean[] P09R54_n11823MaqEnerg ;
   private java.math.BigDecimal[] P09R54_A11822MaqMOI ;
   private boolean[] P09R54_n11822MaqMOI ;
   private java.math.BigDecimal[] P09R54_A11821MaqMOD ;
   private boolean[] P09R54_n11821MaqMOD ;
   private String[] P09R54_A1011TipMaqCod ;
   private boolean[] P09R54_n1011TipMaqCod ;
   private String[] P09R55_A396EmprCod ;
   private int[] P09R55_A129BarCod ;
   private byte[] P09R55_A132BarCodReo ;
   private String[] P09R55_A130BarCodPar ;
   private String[] P09R55_A457FasCod ;
   private java.math.BigDecimal[] P09R55_A1241GuiFasPKg ;
   private long[] P09R55_A30AlbProCod ;
   private short[] P09R55_A1240GuiFasLin ;
}

final  class pprc387__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09R53", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis, T1.FasCod, T1.BarTieRea, T1.BarFasKgm, T1.BarFasMtr, T2.BarUniMed, T1.BarFasKgT, T1.BarFasMtT, T1.BarFacTin, T1.BarOrdLin, T1.ProCod, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr FROM ((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09R54", "SELECT EmprCod, MaqCod, MaqCosMin, MaqAgua, MaqGas, MaqEnerg, MaqMOI, MaqMOD, TipMaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09R55", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, GuiFasPKg, AlbProCod, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and FasCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 1);
               ((short[]) buf[17])[0] = rslt.getShort(14);
               ((String[]) buf[18])[0] = rslt.getString(15, 8);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(17,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

