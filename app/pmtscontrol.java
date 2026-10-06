package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtscontrol extends GXProcedure
{
   public pmtscontrol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtscontrol.class ), "" );
   }

   public pmtscontrol( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            java.math.BigDecimal[] aP6 ,
                            short[] aP7 )
   {
      pmtscontrol.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 )
   {
      pmtscontrol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmtscontrol.this.AV20ALbProcod = aP1[0];
      this.aP1 = aP1;
      pmtscontrol.this.AV21Barcod = aP2[0];
      this.aP2 = aP2;
      pmtscontrol.this.AV22Barcodreo = aP3[0];
      this.aP3 = aP3;
      pmtscontrol.this.AV23barcodpar = aP4[0];
      this.aP4 = aP4;
      pmtscontrol.this.AV46BarAlbKgmE = aP5[0];
      this.aP5 = aP5;
      pmtscontrol.this.AV24BarAlbMtrE = aP6[0];
      this.aP6 = aP6;
      pmtscontrol.this.AV35AlbHdrAnc = aP7[0];
      this.aP7 = aP7;
      pmtscontrol.this.AV36AlbHdrgm2 = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Pml = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( AV46BarAlbKgmE.multiply(DecimalUtil.doubleToDec(1000)).divide(AV24BarAlbMtrE, 18, java.math.RoundingMode.DOWN), 0))) ;
      GXt_int1 = AV43valor1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "DIF000", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      pmtscontrol.this.A396EmprCod = GXv_char2[0] ;
      pmtscontrol.this.GXt_int1 = GXv_int4[0] ;
      AV43valor1 = GXt_int1 ;
      GXt_int1 = AV44Valor2 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "DIF002", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
      pmtscontrol.this.A396EmprCod = GXv_char3[0] ;
      pmtscontrol.this.GXt_int1 = GXv_int4[0] ;
      AV44Valor2 = GXt_int1 ;
      GXt_int1 = AV42ValorMts ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "MTS000", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
      pmtscontrol.this.A396EmprCod = GXv_char3[0] ;
      pmtscontrol.this.GXt_int1 = GXv_int4[0] ;
      AV42ValorMts = GXt_int1 ;
      GXt_int1 = AV45ValPml ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "PMLHDR", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
      pmtscontrol.this.A396EmprCod = GXv_char3[0] ;
      pmtscontrol.this.GXt_int1 = GXv_int4[0] ;
      AV45ValPml = GXt_int1 ;
      AV40BarOrdLin = (short)(0) ;
      /* Using cursor P04ZD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV21Barcod), Byte.valueOf(AV22Barcodreo), AV23barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P04ZD2_A457FasCod[0] ;
         A130BarCodPar = P04ZD2_A130BarCodPar[0] ;
         A132BarCodReo = P04ZD2_A132BarCodReo[0] ;
         A129BarCod = P04ZD2_A129BarCod[0] ;
         A153BarFasEst = P04ZD2_A153BarFasEst[0] ;
         A6011FasTip = P04ZD2_A6011FasTip[0] ;
         n6011FasTip = P04ZD2_n6011FasTip[0] ;
         A194BarOrdLin = P04ZD2_A194BarOrdLin[0] ;
         A758ProCod = P04ZD2_A758ProCod[0] ;
         A6011FasTip = P04ZD2_A6011FasTip[0] ;
         n6011FasTip = P04ZD2_n6011FasTip[0] ;
         if ( ( GXutil.strcmp(A6011FasTip, httpContext.getMessage( "S", "")) == 0 ) && ( A153BarFasEst > 0 ) )
         {
            AV40BarOrdLin = A194BarOrdLin ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV31MtsEnt = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04ZD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV21Barcod), Byte.valueOf(AV22Barcodreo), AV23barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P04ZD3_A130BarCodPar[0] ;
         A132BarCodReo = P04ZD3_A132BarCodReo[0] ;
         A129BarCod = P04ZD3_A129BarCod[0] ;
         A30AlbProCod = P04ZD3_A30AlbProCod[0] ;
         A1263BarAlbMtrE = P04ZD3_A1263BarAlbMtrE[0] ;
         if ( A30AlbProCod != AV20ALbProcod )
         {
            AV31MtsEnt = AV31MtsEnt.add(A1263BarAlbMtrE) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV26MetPiemet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04ZD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV21Barcod), Byte.valueOf(AV22Barcodreo), AV23barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P04ZD4_A130BarCodPar[0] ;
         A132BarCodReo = P04ZD4_A132BarCodReo[0] ;
         A129BarCod = P04ZD4_A129BarCod[0] ;
         A4917MetPieObs = P04ZD4_A4917MetPieObs[0] ;
         A2815MetPieMet = P04ZD4_A2815MetPieMet[0] ;
         A4910MetPieMtD = P04ZD4_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P04ZD4_A6635MetPieAnc[0] ;
         A2813MetPieCod = P04ZD4_A2813MetPieCod[0] ;
         A2809MetTerCod = P04ZD4_A2809MetTerCod[0] ;
         AV39ValNum = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         if ( AV39ValNum == AV40BarOrdLin )
         {
            AV26MetPiemet = AV26MetPiemet.add(A2815MetPieMet) ;
            if ( A4910MetPieMtD.doubleValue() > 0 )
            {
               AV37Grm = A4910MetPieMtD ;
            }
            if ( A6635MetPieAnc > 0 )
            {
               AV38Anc = A6635MetPieAnc ;
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV27MetrosCtrl = AV26MetPiemet.subtract(AV31MtsEnt) ;
      if ( AV27MetrosCtrl.doubleValue() <= AV42ValorMts )
      {
         AV28Limite = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( (AV27MetrosCtrl.multiply(DecimalUtil.doubleToDec(AV43valor1))).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2))) ;
      }
      else
      {
         AV28Limite = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( (AV27MetrosCtrl.multiply(DecimalUtil.doubleToDec(AV44Valor2))).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2))) ;
      }
      AV32Vf = AV27MetrosCtrl.add(DecimalUtil.doubleToDec(AV28Limite)) ;
      AV33Vi = AV27MetrosCtrl.subtract(DecimalUtil.doubleToDec(AV28Limite)) ;
      Gx_msg = httpContext.getMessage( "Mts Entrega=", "") + GXutil.str( AV24BarAlbMtrE, 9, 2) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "Kgs Entrega=", "") + GXutil.str( AV46BarAlbKgmE, 9, 2) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "Pml=", "") + GXutil.str( AV41Pml, 4, 0) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "ContadorPml=", "") + GXutil.str( AV45ValPml, 8, 0) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "Mts Ent Parcial=", "") + GXutil.str( AV31MtsEnt, 9, 2) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "Mts Contador=", "") + GXutil.str( AV26MetPiemet, 9, 2) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "Mts Control=", "") + GXutil.str( AV27MetrosCtrl, 9, 2) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "ContadorMts=", "") + GXutil.str( AV42ValorMts, 8, 0) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "valor1=", "") + GXutil.str( AV43valor1, 8, 0) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "valor2=", "") + GXutil.str( AV44Valor2, 8, 0) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "&Limite=", "") + GXutil.str( AV28Limite, 8, 0) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "&Vf=", "") + GXutil.str( AV32Vf, 9, 2) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "&Vi=", "") + GXutil.str( AV33Vi, 9, 2) ;
      System.out.println( Gx_msg );
      if ( AV26MetPiemet.doubleValue() > 0 )
      {
         if ( AV41Pml < AV45ValPml )
         {
            if ( ( DecimalUtil.compareTo(AV24BarAlbMtrE, AV27MetrosCtrl.add(DecimalUtil.doubleToDec(AV28Limite))) > 0 ) || ( DecimalUtil.compareTo(AV24BarAlbMtrE, AV27MetrosCtrl.subtract(DecimalUtil.doubleToDec(AV28Limite))) < 0 ) )
            {
               AV34MtsContador = AV26MetPiemet.subtract(AV31MtsEnt) ;
               AV24BarAlbMtrE = ((GXutil.strcmp(AV30Opb, httpContext.getMessage( "S", ""))==0) ? AV34MtsContador : AV24BarAlbMtrE) ;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmtscontrol.this.A396EmprCod;
      this.aP1[0] = pmtscontrol.this.AV20ALbProcod;
      this.aP2[0] = pmtscontrol.this.AV21Barcod;
      this.aP3[0] = pmtscontrol.this.AV22Barcodreo;
      this.aP4[0] = pmtscontrol.this.AV23barcodpar;
      this.aP5[0] = pmtscontrol.this.AV46BarAlbKgmE;
      this.aP6[0] = pmtscontrol.this.AV24BarAlbMtrE;
      this.aP7[0] = pmtscontrol.this.AV35AlbHdrAnc;
      this.aP8[0] = pmtscontrol.this.AV36AlbHdrgm2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new int[1] ;
      scmdbuf = "" ;
      P04ZD2_A457FasCod = new String[] {""} ;
      P04ZD2_A396EmprCod = new String[] {""} ;
      P04ZD2_A130BarCodPar = new String[] {""} ;
      P04ZD2_A132BarCodReo = new byte[1] ;
      P04ZD2_A129BarCod = new int[1] ;
      P04ZD2_A153BarFasEst = new byte[1] ;
      P04ZD2_A6011FasTip = new String[] {""} ;
      P04ZD2_n6011FasTip = new boolean[] {false} ;
      P04ZD2_A194BarOrdLin = new short[1] ;
      P04ZD2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A6011FasTip = "" ;
      A758ProCod = "" ;
      AV31MtsEnt = DecimalUtil.ZERO ;
      P04ZD3_A396EmprCod = new String[] {""} ;
      P04ZD3_A130BarCodPar = new String[] {""} ;
      P04ZD3_A132BarCodReo = new byte[1] ;
      P04ZD3_A129BarCod = new int[1] ;
      P04ZD3_A30AlbProCod = new long[1] ;
      P04ZD3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV26MetPiemet = DecimalUtil.ZERO ;
      P04ZD4_A396EmprCod = new String[] {""} ;
      P04ZD4_A130BarCodPar = new String[] {""} ;
      P04ZD4_A132BarCodReo = new byte[1] ;
      P04ZD4_A129BarCod = new int[1] ;
      P04ZD4_A4917MetPieObs = new String[] {""} ;
      P04ZD4_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04ZD4_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04ZD4_A6635MetPieAnc = new short[1] ;
      P04ZD4_A2813MetPieCod = new String[] {""} ;
      P04ZD4_A2809MetTerCod = new String[] {""} ;
      A4917MetPieObs = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      AV37Grm = DecimalUtil.ZERO ;
      AV27MetrosCtrl = DecimalUtil.ZERO ;
      AV32Vf = DecimalUtil.ZERO ;
      AV33Vi = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV34MtsContador = DecimalUtil.ZERO ;
      AV30Opb = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtscontrol__default(),
         new Object[] {
             new Object[] {
            P04ZD2_A457FasCod, P04ZD2_A396EmprCod, P04ZD2_A130BarCodPar, P04ZD2_A132BarCodReo, P04ZD2_A129BarCod, P04ZD2_A153BarFasEst, P04ZD2_A6011FasTip, P04ZD2_n6011FasTip, P04ZD2_A194BarOrdLin, P04ZD2_A758ProCod
            }
            , new Object[] {
            P04ZD3_A396EmprCod, P04ZD3_A130BarCodPar, P04ZD3_A132BarCodReo, P04ZD3_A129BarCod, P04ZD3_A30AlbProCod, P04ZD3_A1263BarAlbMtrE
            }
            , new Object[] {
            P04ZD4_A396EmprCod, P04ZD4_A130BarCodPar, P04ZD4_A132BarCodReo, P04ZD4_A129BarCod, P04ZD4_A4917MetPieObs, P04ZD4_A2815MetPieMet, P04ZD4_A4910MetPieMtD, P04ZD4_A6635MetPieAnc, P04ZD4_A2813MetPieCod, P04ZD4_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22Barcodreo ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short AV35AlbHdrAnc ;
   private short AV36AlbHdrgm2 ;
   private short AV41Pml ;
   private short AV40BarOrdLin ;
   private short A194BarOrdLin ;
   private short A6635MetPieAnc ;
   private short AV39ValNum ;
   private short AV38Anc ;
   private short Gx_err ;
   private int AV21Barcod ;
   private int AV43valor1 ;
   private int AV44Valor2 ;
   private int AV42ValorMts ;
   private int AV45ValPml ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private int AV28Limite ;
   private long AV20ALbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV46BarAlbKgmE ;
   private java.math.BigDecimal AV24BarAlbMtrE ;
   private java.math.BigDecimal AV31MtsEnt ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV26MetPiemet ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal AV37Grm ;
   private java.math.BigDecimal AV27MetrosCtrl ;
   private java.math.BigDecimal AV32Vf ;
   private java.math.BigDecimal AV33Vi ;
   private java.math.BigDecimal AV34MtsContador ;
   private String A396EmprCod ;
   private String AV23barcodpar ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A6011FasTip ;
   private String A758ProCod ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String Gx_msg ;
   private String AV30Opb ;
   private boolean n6011FasTip ;
   private String A4917MetPieObs ;
   private short[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ZD2_A457FasCod ;
   private String[] P04ZD2_A396EmprCod ;
   private String[] P04ZD2_A130BarCodPar ;
   private byte[] P04ZD2_A132BarCodReo ;
   private int[] P04ZD2_A129BarCod ;
   private byte[] P04ZD2_A153BarFasEst ;
   private String[] P04ZD2_A6011FasTip ;
   private boolean[] P04ZD2_n6011FasTip ;
   private short[] P04ZD2_A194BarOrdLin ;
   private String[] P04ZD2_A758ProCod ;
   private String[] P04ZD3_A396EmprCod ;
   private String[] P04ZD3_A130BarCodPar ;
   private byte[] P04ZD3_A132BarCodReo ;
   private int[] P04ZD3_A129BarCod ;
   private long[] P04ZD3_A30AlbProCod ;
   private java.math.BigDecimal[] P04ZD3_A1263BarAlbMtrE ;
   private String[] P04ZD4_A396EmprCod ;
   private String[] P04ZD4_A130BarCodPar ;
   private byte[] P04ZD4_A132BarCodReo ;
   private int[] P04ZD4_A129BarCod ;
   private String[] P04ZD4_A4917MetPieObs ;
   private java.math.BigDecimal[] P04ZD4_A2815MetPieMet ;
   private java.math.BigDecimal[] P04ZD4_A4910MetPieMtD ;
   private short[] P04ZD4_A6635MetPieAnc ;
   private String[] P04ZD4_A2813MetPieCod ;
   private String[] P04ZD4_A2809MetTerCod ;
}

final  class pmtscontrol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ZD2", "SELECT T1.FasCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFasEst, T2.FasTip, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04ZD3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04ZD4", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, MetPieObs, MetPieMet, MetPieMtD, MetPieAnc, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

