package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacparth extends GXProcedure
{
   public pacparth( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacparth.class ), "" );
   }

   public pacparth( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           java.math.BigDecimal[] aP6 ,
                           short[] aP7 ,
                           java.math.BigDecimal[] aP8 ,
                           java.math.BigDecimal[] aP9 ,
                           java.math.BigDecimal[] aP10 ,
                           java.math.BigDecimal[] aP11 )
   {
      pacparth.this.aP12 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        byte[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             byte[] aP12 )
   {
      pacparth.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacparth.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pacparth.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pacparth.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pacparth.this.AV39Conos = aP4[0];
      this.aP4 = aP4;
      pacparth.this.AV40Kilos = aP5[0];
      this.aP5 = aP5;
      pacparth.this.AV41Metros = aP6[0];
      this.aP6 = aP6;
      pacparth.this.AV15TotPieOri = aP7[0];
      this.aP7 = aP7;
      pacparth.this.AV16TotKgmOri = aP8[0];
      this.aP8 = aP8;
      pacparth.this.AV17TotMetOri = aP9[0];
      this.aP9 = aP9;
      pacparth.this.AV18CosAny = aP10[0];
      this.aP10 = aP10;
      pacparth.this.AV19CosPrd = aP11[0];
      this.aP11 = aP11;
      pacparth.this.AV38Signo = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV44Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pacparth.this.GXt_char1 = GXv_char2[0] ;
      AV44Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV45EmprNom ;
      GXv_char4[0] = AV46UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char2, GXv_char3, GXv_char4) ;
      pacparth.this.A396EmprCod = GXv_char2[0] ;
      pacparth.this.AV45EmprNom = GXv_char3[0] ;
      pacparth.this.AV46UsurCod = GXv_char4[0] ;
      AV25DecTot = DecimalUtil.doubleToDec(0) ;
      AV26Resto = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01353 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A141BarCosPro = P01353_A141BarCosPro[0] ;
         A140BarCosAny = P01353_A140BarCosAny[0] ;
         A228BarUniMed = P01353_A228BarUniMed[0] ;
         A213BarSit = P01353_A213BarSit[0] ;
         A161BarFecSal = P01353_A161BarFecSal[0] ;
         A142BarDiaP = P01353_A142BarDiaP[0] ;
         A157BarFecEnt = P01353_A157BarFecEnt[0] ;
         A184BarMtr = P01353_A184BarMtr[0] ;
         A166BarKgm = P01353_A166BarKgm[0] ;
         A199BarPie1 = P01353_A199BarPie1[0] ;
         A365DisDes = P01353_A365DisDes[0] ;
         A898BarPieNDes = P01353_A898BarPieNDes[0] ;
         A184BarMtr = P01353_A184BarMtr[0] ;
         A166BarKgm = P01353_A166BarKgm[0] ;
         A199BarPie1 = P01353_A199BarPie1[0] ;
         A898BarPieNDes = P01353_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV16TotKgmOri)==0) )
         {
            if ( AV16TotKgmOri.doubleValue() > 0 )
            {
               A141BarCosPro = A141BarCosPro.add((GXutil.roundDecimal( AV40Kilos.multiply(AV19CosPrd).divide(AV16TotKgmOri, 18, java.math.RoundingMode.DOWN), 2).multiply(DecimalUtil.doubleToDec(AV38Signo)))) ;
               A140BarCosAny = A140BarCosAny.add((GXutil.roundDecimal( AV40Kilos.multiply(AV18CosAny).divide(AV16TotKgmOri, 18, java.math.RoundingMode.DOWN), 2).multiply(DecimalUtil.doubleToDec(AV38Signo)))) ;
            }
         }
         else
         {
            A141BarCosPro = DecimalUtil.doubleToDec(0) ;
            A140BarCosAny = DecimalUtil.doubleToDec(0) ;
         }
         if ( ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A166BarKgm)==0) && (0==A198BarPie) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) ) || ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A184BarMtr)==0) && (0==A198BarPie) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) ) )
         {
            AV43Inc_obs = httpContext.getMessage( "Pacparth.Cambio Situacion de ", "") + GXutil.str( A213BarSit, 2, 0) + " -> 9" + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV50Pgmname, AV46UsurCod, AV44Station, AV43Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = (byte)(9) ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A161BarFecSal)) || (( GXutil.resetTime(A161BarFecSal).before( GXutil.resetTime( GXutil.today( ) )) ) || ( GXutil.dateCompare(GXutil.resetTime(A161BarFecSal), GXutil.resetTime(GXutil.today( ))) )) )
            {
               A161BarFecSal = GXutil.today( ) ;
            }
         }
         /* Using cursor P01354 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A758ProCod = P01354_A758ProCod[0] ;
            A761ProFasLin = P01354_A761ProFasLin[0] ;
            n761ProFasLin = P01354_n761ProFasLin[0] ;
            /* Using cursor P01355 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A457FasCod = P01355_A457FasCod[0] ;
               A162BarFecTeo = P01355_A162BarFecTeo[0] ;
               A216BarTieTeo = P01355_A216BarTieTeo[0] ;
               A194BarOrdLin = P01355_A194BarOrdLin[0] ;
               AV20FasCod = A457FasCod ;
               System.out.println( httpContext.getMessage( "Go PCALCUL", "") );
               GXv_char4[0] = A396EmprCod ;
               GXv_int5[0] = A129BarCod ;
               GXv_int6[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_char2[0] = AV20FasCod ;
               GXv_date7[0] = AV21FecTeo ;
               GXv_decimal8[0] = AV22TieTeo ;
               GXv_decimal9[0] = AV23Decalaje ;
               GXv_decimal10[0] = AV26Resto ;
               new app.pcalcul(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_date7, GXv_decimal8, GXv_decimal9, GXv_decimal10) ;
               pacparth.this.A396EmprCod = GXv_char4[0] ;
               pacparth.this.A129BarCod = GXv_int5[0] ;
               pacparth.this.A132BarCodReo = GXv_int6[0] ;
               pacparth.this.A130BarCodPar = GXv_char3[0] ;
               pacparth.this.AV20FasCod = GXv_char2[0] ;
               pacparth.this.AV21FecTeo = GXv_date7[0] ;
               pacparth.this.AV22TieTeo = GXv_decimal8[0] ;
               pacparth.this.AV23Decalaje = GXv_decimal9[0] ;
               pacparth.this.AV26Resto = GXv_decimal10[0] ;
               System.out.println( httpContext.getMessage( "Return PCALCUL", "") );
               AV25DecTot = AV25DecTot.add(AV23Decalaje) ;
               AV24FecFinPre = AV21FecTeo ;
               if ( DecimalUtil.compareTo(AV22TieTeo, DecimalUtil.stringToDec("99.99")) >= 0 )
               {
                  AV22TieTeo = DecimalUtil.stringToDec("99.99") ;
               }
               A162BarFecTeo = AV21FecTeo ;
               A216BarTieTeo = AV22TieTeo ;
               /* Using cursor P01356 */
               pr_default.execute(3, new Object[] {A162BarFecTeo, A216BarTieTeo, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               pr_default.readNext(2);
            }
            pr_default.close(2);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A142BarDiaP = AV25DecTot ;
         A157BarFecEnt = AV24FecFinPre ;
         /* Using cursor P01357 */
         pr_default.execute(4, new Object[] {A141BarCosPro, A140BarCosAny, Byte.valueOf(A213BarSit), A161BarFecSal, A142BarDiaP, A157BarFecEnt, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacparth.this.A396EmprCod;
      this.aP1[0] = pacparth.this.A129BarCod;
      this.aP2[0] = pacparth.this.A132BarCodReo;
      this.aP3[0] = pacparth.this.A130BarCodPar;
      this.aP4[0] = pacparth.this.AV39Conos;
      this.aP5[0] = pacparth.this.AV40Kilos;
      this.aP6[0] = pacparth.this.AV41Metros;
      this.aP7[0] = pacparth.this.AV15TotPieOri;
      this.aP8[0] = pacparth.this.AV16TotKgmOri;
      this.aP9[0] = pacparth.this.AV17TotMetOri;
      this.aP10[0] = pacparth.this.AV18CosAny;
      this.aP11[0] = pacparth.this.AV19CosPrd;
      this.aP12[0] = pacparth.this.AV38Signo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacparth");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV44Station = "" ;
      GXt_char1 = "" ;
      AV45EmprNom = "" ;
      AV46UsurCod = "" ;
      AV25DecTot = DecimalUtil.ZERO ;
      AV26Resto = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01353_A396EmprCod = new String[] {""} ;
      P01353_A129BarCod = new int[1] ;
      P01353_A132BarCodReo = new byte[1] ;
      P01353_A130BarCodPar = new String[] {""} ;
      P01353_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01353_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01353_A228BarUniMed = new String[] {""} ;
      P01353_A213BarSit = new byte[1] ;
      P01353_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P01353_A142BarDiaP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01353_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P01353_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01353_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01353_A199BarPie1 = new short[1] ;
      P01353_A365DisDes = new String[] {""} ;
      P01353_A898BarPieNDes = new int[1] ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A142BarDiaP = DecimalUtil.ZERO ;
      A157BarFecEnt = GXutil.nullDate() ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV43Inc_obs = "" ;
      AV50Pgmname = "" ;
      P01354_A396EmprCod = new String[] {""} ;
      P01354_A129BarCod = new int[1] ;
      P01354_A132BarCodReo = new byte[1] ;
      P01354_A130BarCodPar = new String[] {""} ;
      P01354_A758ProCod = new String[] {""} ;
      P01354_A761ProFasLin = new short[1] ;
      P01354_n761ProFasLin = new boolean[] {false} ;
      A758ProCod = "" ;
      P01355_A396EmprCod = new String[] {""} ;
      P01355_A129BarCod = new int[1] ;
      P01355_A132BarCodReo = new byte[1] ;
      P01355_A130BarCodPar = new String[] {""} ;
      P01355_A758ProCod = new String[] {""} ;
      P01355_A457FasCod = new String[] {""} ;
      P01355_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P01355_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01355_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      AV20FasCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV21FecTeo = GXutil.nullDate() ;
      GXv_date7 = new java.util.Date[1] ;
      AV22TieTeo = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV23Decalaje = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV24FecFinPre = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacparth__default(),
         new Object[] {
             new Object[] {
            P01353_A396EmprCod, P01353_A129BarCod, P01353_A132BarCodReo, P01353_A130BarCodPar, P01353_A141BarCosPro, P01353_A140BarCosAny, P01353_A228BarUniMed, P01353_A213BarSit, P01353_A161BarFecSal, P01353_A142BarDiaP,
            P01353_A157BarFecEnt, P01353_A184BarMtr, P01353_A166BarKgm, P01353_A199BarPie1, P01353_A365DisDes, P01353_A898BarPieNDes
            }
            , new Object[] {
            P01354_A396EmprCod, P01354_A129BarCod, P01354_A132BarCodReo, P01354_A130BarCodPar, P01354_A758ProCod, P01354_A761ProFasLin, P01354_n761ProFasLin
            }
            , new Object[] {
            P01355_A396EmprCod, P01355_A129BarCod, P01355_A132BarCodReo, P01355_A130BarCodPar, P01355_A758ProCod, P01355_A457FasCod, P01355_A162BarFecTeo, P01355_A216BarTieTeo, P01355_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV50Pgmname = "PACPARTH" ;
      /* GeneXus formulas. */
      AV50Pgmname = "PACPARTH" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV38Signo ;
   private byte A213BarSit ;
   private byte GXv_int6[] ;
   private short AV39Conos ;
   private short AV15TotPieOri ;
   private short A199BarPie1 ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GXv_int5[] ;
   private java.math.BigDecimal AV40Kilos ;
   private java.math.BigDecimal AV41Metros ;
   private java.math.BigDecimal AV16TotKgmOri ;
   private java.math.BigDecimal AV17TotMetOri ;
   private java.math.BigDecimal AV18CosAny ;
   private java.math.BigDecimal AV19CosPrd ;
   private java.math.BigDecimal AV25DecTot ;
   private java.math.BigDecimal AV26Resto ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A142BarDiaP ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal AV22TieTeo ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV23Decalaje ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV44Station ;
   private String GXt_char1 ;
   private String AV45EmprNom ;
   private String AV46UsurCod ;
   private String scmdbuf ;
   private String A228BarUniMed ;
   private String A365DisDes ;
   private String AV50Pgmname ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String AV20FasCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date AV21FecTeo ;
   private java.util.Date GXv_date7[] ;
   private java.util.Date AV24FecFinPre ;
   private boolean n761ProFasLin ;
   private String AV43Inc_obs ;
   private byte[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P01353_A396EmprCod ;
   private int[] P01353_A129BarCod ;
   private byte[] P01353_A132BarCodReo ;
   private String[] P01353_A130BarCodPar ;
   private java.math.BigDecimal[] P01353_A141BarCosPro ;
   private java.math.BigDecimal[] P01353_A140BarCosAny ;
   private String[] P01353_A228BarUniMed ;
   private byte[] P01353_A213BarSit ;
   private java.util.Date[] P01353_A161BarFecSal ;
   private java.math.BigDecimal[] P01353_A142BarDiaP ;
   private java.util.Date[] P01353_A157BarFecEnt ;
   private java.math.BigDecimal[] P01353_A184BarMtr ;
   private java.math.BigDecimal[] P01353_A166BarKgm ;
   private short[] P01353_A199BarPie1 ;
   private String[] P01353_A365DisDes ;
   private int[] P01353_A898BarPieNDes ;
   private String[] P01354_A396EmprCod ;
   private int[] P01354_A129BarCod ;
   private byte[] P01354_A132BarCodReo ;
   private String[] P01354_A130BarCodPar ;
   private String[] P01354_A758ProCod ;
   private short[] P01354_A761ProFasLin ;
   private boolean[] P01354_n761ProFasLin ;
   private String[] P01355_A396EmprCod ;
   private int[] P01355_A129BarCod ;
   private byte[] P01355_A132BarCodReo ;
   private String[] P01355_A130BarCodPar ;
   private String[] P01355_A758ProCod ;
   private String[] P01355_A457FasCod ;
   private java.util.Date[] P01355_A162BarFecTeo ;
   private java.math.BigDecimal[] P01355_A216BarTieTeo ;
   private short[] P01355_A194BarOrdLin ;
}

final  class pacparth__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01353", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarCosPro, T1.BarCosAny, T1.BarUniMed, T1.BarSit, T1.BarFecSal, T1.BarDiaP, T1.BarFecEnt, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01354", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01355", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, BarFecTeo, BarTieTeo, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01356", "UPDATE TXPBARFAS SET BarFecTeo=?, BarTieTeo=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P01357", "UPDATE TXPBARCAD SET BarCosPro=?, BarCosAny=?, BarSit=?, BarFecSal=?, BarDiaP=?, BarFecEnt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 1);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
      }
   }

}

