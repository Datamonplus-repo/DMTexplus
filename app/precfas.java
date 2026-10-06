package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precfas extends GXProcedure
{
   public precfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precfas.class ), "" );
   }

   public precfas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      precfas.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      precfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precfas.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      precfas.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      precfas.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Hss = (byte)(0) ;
      GXv_int1[0] = AV23Hss ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int1) ;
      precfas.this.AV23Hss = GXv_int1[0] ;
      AV24Mab = (byte)(0) ;
      GXv_int1[0] = AV24Mab ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int1) ;
      precfas.this.AV24Mab = GXv_int1[0] ;
      AV21DecTot = DecimalUtil.doubleToDec(0) ;
      AV22Resto = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P001P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P001P2_A457FasCod[0] ;
         A603MaqCodBis = P001P2_A603MaqCodBis[0] ;
         A194BarOrdLin = P001P2_A194BarOrdLin[0] ;
         A153BarFasEst = P001P2_A153BarFasEst[0] ;
         A4443BarFasDTF = P001P2_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P001P2_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P001P2_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P001P2_n4442BarFasDTI[0] ;
         A227BarUni = P001P2_A227BarUni[0] ;
         A165BarHorIni = P001P2_A165BarHorIni[0] ;
         A164BarHorFin = P001P2_A164BarHorFin[0] ;
         A215BarTieRea = P001P2_A215BarTieRea[0] ;
         A3298BarFecRIni = P001P2_A3298BarFecRIni[0] ;
         A160BarFecRea = P001P2_A160BarFecRea[0] ;
         A179BarLoc = P001P2_A179BarLoc[0] ;
         A3837BarFasKgm = P001P2_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P001P2_n3837BarFasKgm[0] ;
         A5719BarFasKgT = P001P2_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P001P2_n5719BarFasKgT[0] ;
         A6390BarfasMn = P001P2_A6390BarfasMn[0] ;
         n6390BarfasMn = P001P2_n6390BarfasMn[0] ;
         A758ProCod = P001P2_A758ProCod[0] ;
         AV15FasCod = A457FasCod ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A129BarCod ;
         GXv_int1[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char5[0] = AV15FasCod ;
         GXv_date6[0] = AV17FecTeo ;
         GXv_decimal7[0] = AV18TieTeo ;
         GXv_decimal8[0] = AV19Decalaje ;
         GXv_decimal9[0] = AV22Resto ;
         new app.pcalcul(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_char5, GXv_date6, GXv_decimal7, GXv_decimal8, GXv_decimal9) ;
         precfas.this.A396EmprCod = GXv_char2[0] ;
         precfas.this.A129BarCod = GXv_int3[0] ;
         precfas.this.A132BarCodReo = GXv_int1[0] ;
         precfas.this.A130BarCodPar = GXv_char4[0] ;
         precfas.this.AV15FasCod = GXv_char5[0] ;
         precfas.this.AV17FecTeo = GXv_date6[0] ;
         precfas.this.AV18TieTeo = GXv_decimal7[0] ;
         precfas.this.AV19Decalaje = GXv_decimal8[0] ;
         precfas.this.AV22Resto = GXv_decimal9[0] ;
         AV21DecTot = AV21DecTot.add(AV19Decalaje) ;
         AV20FecFinPre = AV17FecTeo ;
         AV26Maqcodbis = A603MaqCodBis ;
         AV27Barcod = A129BarCod ;
         AV28Barcodreo = A132BarCodReo ;
         AV29barcodpar = A130BarCodPar ;
         AV30Barordlin = A194BarOrdLin ;
         if ( A153BarFasEst == 0 )
         {
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
            A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
            n4442BarFasDTI = false ;
            A227BarUni = DecimalUtil.doubleToDec(0) ;
            A165BarHorIni = (short)(0) ;
            A164BarHorFin = (short)(0) ;
            A215BarTieRea = DecimalUtil.doubleToDec(0) ;
            A3298BarFecRIni = GXutil.nullDate() ;
            A160BarFecRea = GXutil.nullDate() ;
            A179BarLoc = " " ;
            A3837BarFasKgm = DecimalUtil.doubleToDec(0) ;
            n3837BarFasKgm = false ;
            A5719BarFasKgT = DecimalUtil.doubleToDec(0) ;
            n5719BarFasKgT = false ;
            A6390BarfasMn = " " ;
            n6390BarfasMn = false ;
            /* Execute user subroutine: 'LECTOR' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Using cursor P001P3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, A227BarUni, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, A160BarFecRea, A179BarLoc, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n6390BarfasMn), A6390BarfasMn, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P001P4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A212BarSer = P001P4_A212BarSer[0] ;
         A142BarDiaP = P001P4_A142BarDiaP[0] ;
         A157BarFecEnt = P001P4_A157BarFecEnt[0] ;
         A142BarDiaP = AV21DecTot ;
         if ( (0==AV23Hss) )
         {
            A157BarFecEnt = AV20FecFinPre ;
         }
         /* Using cursor P001P5 */
         pr_default.execute(3, new Object[] {A142BarDiaP, A157BarFecEnt, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'LECTOR' Routine */
      returnInSub = false ;
      /* Using cursor P001P6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV26Maqcodbis});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1166LecMaqCod = P001P6_A1166LecMaqCod[0] ;
         A1171LecFasCod = P001P6_A1171LecFasCod[0] ;
         n1171LecFasCod = P001P6_n1171LecFasCod[0] ;
         A1169LecBarPar = P001P6_A1169LecBarPar[0] ;
         n1169LecBarPar = P001P6_n1169LecBarPar[0] ;
         A1168LecBarReo = P001P6_A1168LecBarReo[0] ;
         n1168LecBarReo = P001P6_n1168LecBarReo[0] ;
         A1167LecBarCod = P001P6_A1167LecBarCod[0] ;
         n1167LecBarCod = P001P6_n1167LecBarCod[0] ;
         if ( ( A1167LecBarCod == AV27Barcod ) && ( A1168LecBarReo == AV28Barcodreo ) && ( GXutil.strcmp(A1169LecBarPar, AV29barcodpar) == 0 ) && ( GXutil.strcmp(A1171LecFasCod, AV15FasCod) == 0 ) )
         {
            /* Using cursor P001P7 */
            pr_default.execute(5, new Object[] {A396EmprCod, A1166LecMaqCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A1166LecMaqCod ;
            new app.plecdelt(remoteHandle, context).execute( GXv_char5, GXv_char4) ;
            precfas.this.A396EmprCod = GXv_char5[0] ;
            precfas.this.A1166LecMaqCod = GXv_char4[0] ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = precfas.this.A396EmprCod;
      this.aP1[0] = precfas.this.A129BarCod;
      this.aP2[0] = precfas.this.A132BarCodReo;
      this.aP3[0] = precfas.this.A130BarCodPar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21DecTot = DecimalUtil.ZERO ;
      AV22Resto = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P001P2_A396EmprCod = new String[] {""} ;
      P001P2_A129BarCod = new int[1] ;
      P001P2_A132BarCodReo = new byte[1] ;
      P001P2_A130BarCodPar = new String[] {""} ;
      P001P2_A457FasCod = new String[] {""} ;
      P001P2_A603MaqCodBis = new String[] {""} ;
      P001P2_A194BarOrdLin = new short[1] ;
      P001P2_A153BarFasEst = new byte[1] ;
      P001P2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P001P2_n4443BarFasDTF = new boolean[] {false} ;
      P001P2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P001P2_n4442BarFasDTI = new boolean[] {false} ;
      P001P2_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_A165BarHorIni = new short[1] ;
      P001P2_A164BarHorFin = new short[1] ;
      P001P2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P001P2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P001P2_A179BarLoc = new String[] {""} ;
      P001P2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n3837BarFasKgm = new boolean[] {false} ;
      P001P2_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P2_n5719BarFasKgT = new boolean[] {false} ;
      P001P2_A6390BarfasMn = new String[] {""} ;
      P001P2_n6390BarfasMn = new boolean[] {false} ;
      P001P2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A227BarUni = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A179BarLoc = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A6390BarfasMn = "" ;
      A758ProCod = "" ;
      AV15FasCod = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int1 = new byte[1] ;
      AV17FecTeo = GXutil.nullDate() ;
      GXv_date6 = new java.util.Date[1] ;
      AV18TieTeo = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV19Decalaje = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV20FecFinPre = GXutil.nullDate() ;
      AV26Maqcodbis = "" ;
      AV29barcodpar = "" ;
      P001P4_A396EmprCod = new String[] {""} ;
      P001P4_A129BarCod = new int[1] ;
      P001P4_A132BarCodReo = new byte[1] ;
      P001P4_A130BarCodPar = new String[] {""} ;
      P001P4_A212BarSer = new String[] {""} ;
      P001P4_A142BarDiaP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P4_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      A212BarSer = "" ;
      A142BarDiaP = DecimalUtil.ZERO ;
      A157BarFecEnt = GXutil.nullDate() ;
      P001P6_A396EmprCod = new String[] {""} ;
      P001P6_A1166LecMaqCod = new String[] {""} ;
      P001P6_A1171LecFasCod = new String[] {""} ;
      P001P6_n1171LecFasCod = new boolean[] {false} ;
      P001P6_A1169LecBarPar = new String[] {""} ;
      P001P6_n1169LecBarPar = new boolean[] {false} ;
      P001P6_A1168LecBarReo = new byte[1] ;
      P001P6_n1168LecBarReo = new boolean[] {false} ;
      P001P6_A1167LecBarCod = new int[1] ;
      P001P6_n1167LecBarCod = new boolean[] {false} ;
      A1166LecMaqCod = "" ;
      A1171LecFasCod = "" ;
      A1169LecBarPar = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precfas__default(),
         new Object[] {
             new Object[] {
            P001P2_A396EmprCod, P001P2_A129BarCod, P001P2_A132BarCodReo, P001P2_A130BarCodPar, P001P2_A457FasCod, P001P2_A603MaqCodBis, P001P2_A194BarOrdLin, P001P2_A153BarFasEst, P001P2_A4443BarFasDTF, P001P2_n4443BarFasDTF,
            P001P2_A4442BarFasDTI, P001P2_n4442BarFasDTI, P001P2_A227BarUni, P001P2_A165BarHorIni, P001P2_A164BarHorFin, P001P2_A215BarTieRea, P001P2_A3298BarFecRIni, P001P2_A160BarFecRea, P001P2_A179BarLoc, P001P2_A3837BarFasKgm,
            P001P2_n3837BarFasKgm, P001P2_A5719BarFasKgT, P001P2_n5719BarFasKgT, P001P2_A6390BarfasMn, P001P2_n6390BarfasMn, P001P2_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P001P4_A396EmprCod, P001P4_A129BarCod, P001P4_A132BarCodReo, P001P4_A130BarCodPar, P001P4_A212BarSer, P001P4_A142BarDiaP, P001P4_A157BarFecEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P001P6_A396EmprCod, P001P6_A1166LecMaqCod, P001P6_A1171LecFasCod, P001P6_n1171LecFasCod, P001P6_A1169LecBarPar, P001P6_n1169LecBarPar, P001P6_A1168LecBarReo, P001P6_n1168LecBarReo, P001P6_A1167LecBarCod, P001P6_n1167LecBarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV23Hss ;
   private byte AV24Mab ;
   private byte A153BarFasEst ;
   private byte GXv_int1[] ;
   private byte AV28Barcodreo ;
   private byte A1168LecBarReo ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short AV30Barordlin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int3[] ;
   private int AV27Barcod ;
   private int A1167LecBarCod ;
   private java.math.BigDecimal AV21DecTot ;
   private java.math.BigDecimal AV22Resto ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal AV18TieTeo ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV19Decalaje ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal A142BarDiaP ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A179BarLoc ;
   private String A6390BarfasMn ;
   private String A758ProCod ;
   private String AV15FasCod ;
   private String GXv_char2[] ;
   private String AV26Maqcodbis ;
   private String AV29barcodpar ;
   private String A212BarSer ;
   private String A1166LecMaqCod ;
   private String A1171LecFasCod ;
   private String A1169LecBarPar ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date AV17FecTeo ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date AV20FecFinPre ;
   private java.util.Date A157BarFecEnt ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean n3837BarFasKgm ;
   private boolean n5719BarFasKgT ;
   private boolean n6390BarfasMn ;
   private boolean returnInSub ;
   private boolean n1171LecFasCod ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P001P2_A396EmprCod ;
   private int[] P001P2_A129BarCod ;
   private byte[] P001P2_A132BarCodReo ;
   private String[] P001P2_A130BarCodPar ;
   private String[] P001P2_A457FasCod ;
   private String[] P001P2_A603MaqCodBis ;
   private short[] P001P2_A194BarOrdLin ;
   private byte[] P001P2_A153BarFasEst ;
   private java.util.Date[] P001P2_A4443BarFasDTF ;
   private boolean[] P001P2_n4443BarFasDTF ;
   private java.util.Date[] P001P2_A4442BarFasDTI ;
   private boolean[] P001P2_n4442BarFasDTI ;
   private java.math.BigDecimal[] P001P2_A227BarUni ;
   private short[] P001P2_A165BarHorIni ;
   private short[] P001P2_A164BarHorFin ;
   private java.math.BigDecimal[] P001P2_A215BarTieRea ;
   private java.util.Date[] P001P2_A3298BarFecRIni ;
   private java.util.Date[] P001P2_A160BarFecRea ;
   private String[] P001P2_A179BarLoc ;
   private java.math.BigDecimal[] P001P2_A3837BarFasKgm ;
   private boolean[] P001P2_n3837BarFasKgm ;
   private java.math.BigDecimal[] P001P2_A5719BarFasKgT ;
   private boolean[] P001P2_n5719BarFasKgT ;
   private String[] P001P2_A6390BarfasMn ;
   private boolean[] P001P2_n6390BarfasMn ;
   private String[] P001P2_A758ProCod ;
   private String[] P001P4_A396EmprCod ;
   private int[] P001P4_A129BarCod ;
   private byte[] P001P4_A132BarCodReo ;
   private String[] P001P4_A130BarCodPar ;
   private String[] P001P4_A212BarSer ;
   private java.math.BigDecimal[] P001P4_A142BarDiaP ;
   private java.util.Date[] P001P4_A157BarFecEnt ;
   private String[] P001P6_A396EmprCod ;
   private String[] P001P6_A1166LecMaqCod ;
   private String[] P001P6_A1171LecFasCod ;
   private boolean[] P001P6_n1171LecFasCod ;
   private String[] P001P6_A1169LecBarPar ;
   private boolean[] P001P6_n1169LecBarPar ;
   private byte[] P001P6_A1168LecBarReo ;
   private boolean[] P001P6_n1168LecBarReo ;
   private int[] P001P6_A1167LecBarCod ;
   private boolean[] P001P6_n1167LecBarCod ;
}

final  class precfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001P2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, MaqCodBis, BarOrdLin, BarFasEst, BarFasDTF, BarFasDTI, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFecRea, BarLoc, BarFasKgm, BarFasKgT, BarfasMn, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001P3", "UPDATE TXPBARFAS SET BarFasDTF=?, BarFasDTI=?, BarUni=?, BarHorIni=?, BarHorFin=?, BarTieRea=?, BarFecRIni=?, BarFecRea=?, BarLoc=?, BarFasKgm=?, BarFasKgT=?, BarfasMn=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P001P4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSer, BarDiaP, BarFecEnt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001P5", "UPDATE TXPBARCAD SET BarDiaP=?, BarFecEnt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P001P6", "SELECT EmprCod, LecMaqCod, LecFasCod, LecBarPar, LecBarReo, LecBarCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001P7", "DELETE FROM TXPLECTOR  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 10);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(21, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               stmt.setDate(7, (java.util.Date)parms[8]);
               stmt.setDate(8, (java.util.Date)parms[9]);
               stmt.setString(9, (String)parms[10], 10);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 10);
               }
               stmt.setString(13, (String)parms[17], 3);
               stmt.setInt(14, ((Number) parms[18]).intValue());
               stmt.setByte(15, ((Number) parms[19]).byteValue());
               stmt.setString(16, (String)parms[20], 1);
               stmt.setString(17, (String)parms[21], 8);
               stmt.setShort(18, ((Number) parms[22]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 1);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

