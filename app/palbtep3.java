package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbtep3 extends GXProcedure
{
   public palbtep3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbtep3.class ), "" );
   }

   public palbtep3( int remoteHandle ,
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
                            byte[] aP5 ,
                            String[] aP6 ,
                            String[] aP7 ,
                            String[] aP8 ,
                            byte[] aP9 ,
                            java.math.BigDecimal[] aP10 ,
                            java.math.BigDecimal[] aP11 ,
                            int[] aP12 ,
                            java.math.BigDecimal[] aP13 ,
                            short[] aP14 ,
                            java.math.BigDecimal[] aP15 )
   {
      palbtep3.this.aP16 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        byte[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        int[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        short[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        short[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             int[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             short[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             short[] aP16 )
   {
      palbtep3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbtep3.this.AV22AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbtep3.this.AV12BarCod = aP2[0];
      this.aP2 = aP2;
      palbtep3.this.AV13BarCodReo = aP3[0];
      this.aP3 = aP3;
      palbtep3.this.AV14BarCodPar = aP4[0];
      this.aP4 = aP4;
      palbtep3.this.AV15DisComLin = aP5[0];
      this.aP5 = aP5;
      palbtep3.this.AV16DisComCod = aP6[0];
      this.aP6 = aP6;
      palbtep3.this.AV17FonCod = aP7[0];
      this.aP7 = aP7;
      palbtep3.this.AV18BarPieCod = aP8[0];
      this.aP8 = aP8;
      palbtep3.this.AV8Tipo = aP9[0];
      this.aP9 = aP9;
      palbtep3.this.AV23BarAlbKgmE = aP10[0];
      this.aP10 = aP10;
      palbtep3.this.AV24BarAlbMtrE = aP11[0];
      this.aP11 = aP11;
      palbtep3.this.AV25BarAlbPie = aP12[0];
      this.aP12 = aP12;
      palbtep3.this.AV26ALbEComM = aP13[0];
      this.aP13 = aP13;
      palbtep3.this.AV27AlbEComP = aP14[0];
      this.aP14 = aP14;
      palbtep3.this.AV28BarComMLan = aP15[0];
      this.aP15 = aP15;
      palbtep3.this.AV29BarComPLan = aP16[0];
      this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02RO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV22AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P02RO2_A30AlbProCod[0] ;
         /* Using cursor P02RO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(AV12BarCod), Byte.valueOf(AV13BarCodReo), AV14BarCodPar, Byte.valueOf(AV8Tipo), Byte.valueOf(AV8Tipo)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P02RO3_A130BarCodPar[0] ;
            A132BarCodReo = P02RO3_A132BarCodReo[0] ;
            A129BarCod = P02RO3_A129BarCod[0] ;
            A6816BarPreFMt = P02RO3_A6816BarPreFMt[0] ;
            n6816BarPreFMt = P02RO3_n6816BarPreFMt[0] ;
            /* Using cursor P02RO4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(AV15DisComLin), AV16DisComCod, AV17FonCod, Byte.valueOf(AV8Tipo), Byte.valueOf(AV8Tipo)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1032FonCod = P02RO4_A1032FonCod[0] ;
               A1056DisComCod = P02RO4_A1056DisComCod[0] ;
               A2524DisComLin = P02RO4_A2524DisComLin[0] ;
               if ( ( ( A2524DisComLin == AV15DisComLin ) && ( GXutil.strcmp(A1056DisComCod, AV16DisComCod) == 0 ) && ( GXutil.strcmp(A1032FonCod, AV17FonCod) == 0 ) && ( AV8Tipo > 2 ) ) || ( AV8Tipo <= 2 ) )
               {
                  /* Using cursor P02RO5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, AV18BarPieCod, Byte.valueOf(AV8Tipo), Byte.valueOf(AV8Tipo)});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A7080AEPKil = P02RO5_A7080AEPKil[0] ;
                     n7080AEPKil = P02RO5_n7080AEPKil[0] ;
                     A7081AEPMet = P02RO5_A7081AEPMet[0] ;
                     n7081AEPMet = P02RO5_n7081AEPMet[0] ;
                     A200BarPieCod = P02RO5_A200BarPieCod[0] ;
                     if ( ( ( GXutil.strcmp(A200BarPieCod, AV18BarPieCod) == 0 ) && ( AV8Tipo > 3 ) ) || ( AV8Tipo <= 3 ) )
                     {
                        A7079AEPPie = (byte)(1) ;
                        /* Using cursor P02RO6 */
                        pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                        A27AlbPKilEnt = P02RO6_A27AlbPKilEnt[0] ;
                        A1270AlbPMtrEnt = P02RO6_A1270AlbPMtrEnt[0] ;
                        AV23BarAlbKgmE = AV23BarAlbKgmE.subtract(A7080AEPKil) ;
                        AV24BarAlbMtrE = AV24BarAlbMtrE.subtract(A7081AEPMet) ;
                        AV25BarAlbPie = (int)(AV25BarAlbPie-A7079AEPPie) ;
                        AV26ALbEComM = AV26ALbEComM.subtract(A7081AEPMet) ;
                        AV27AlbEComP = (short)(AV27AlbEComP-A7079AEPPie) ;
                        AV28BarComMLan = AV28BarComMLan.subtract(A7081AEPMet) ;
                        AV29BarComPLan = (short)(AV29BarComPLan-A7079AEPPie) ;
                        A27AlbPKilEnt = A27AlbPKilEnt.subtract(A7080AEPKil) ;
                        A1270AlbPMtrEnt = A1270AlbPMtrEnt.subtract(A7081AEPMet) ;
                        if ( AV8Tipo <= 4 )
                        {
                           /* Using cursor P02RO7 */
                           pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, A200BarPieCod});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTEP");
                        }
                        /* Using cursor P02RO8 */
                        pr_default.execute(6, new Object[] {A27AlbPKilEnt, A1270AlbPMtrEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
                     }
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
                  pr_default.close(4);
                  if ( AV8Tipo <= 3 )
                  {
                     /* Using cursor P02RO9 */
                     pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
                  }
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV8Tipo <= 2 )
            {
               /* Optimized DELETE. */
               /* Using cursor P02RO10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               /* End optimized DELETE. */
               /* Using cursor P02RO11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV8Tipo <= 1 )
         {
            /* Using cursor P02RO12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV8Tipo <= 4 )
      {
         AV18BarPieCod = "" ;
         if ( AV8Tipo <= 3 )
         {
            AV15DisComLin = (byte)(0) ;
            AV16DisComCod = "" ;
            AV17FonCod = "" ;
            if ( AV8Tipo <= 2 )
            {
               AV12BarCod = 0 ;
               AV13BarCodReo = (byte)(0) ;
               AV14BarCodPar = "" ;
               if ( AV8Tipo <= 1 )
               {
                  AV22AlbProCod = 0 ;
               }
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbtep3.this.A396EmprCod;
      this.aP1[0] = palbtep3.this.AV22AlbProCod;
      this.aP2[0] = palbtep3.this.AV12BarCod;
      this.aP3[0] = palbtep3.this.AV13BarCodReo;
      this.aP4[0] = palbtep3.this.AV14BarCodPar;
      this.aP5[0] = palbtep3.this.AV15DisComLin;
      this.aP6[0] = palbtep3.this.AV16DisComCod;
      this.aP7[0] = palbtep3.this.AV17FonCod;
      this.aP8[0] = palbtep3.this.AV18BarPieCod;
      this.aP9[0] = palbtep3.this.AV8Tipo;
      this.aP10[0] = palbtep3.this.AV23BarAlbKgmE;
      this.aP11[0] = palbtep3.this.AV24BarAlbMtrE;
      this.aP12[0] = palbtep3.this.AV25BarAlbPie;
      this.aP13[0] = palbtep3.this.AV26ALbEComM;
      this.aP14[0] = palbtep3.this.AV27AlbEComP;
      this.aP15[0] = palbtep3.this.AV28BarComMLan;
      this.aP16[0] = palbtep3.this.AV29BarComPLan;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbtep3");
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
      P02RO2_A396EmprCod = new String[] {""} ;
      P02RO2_A30AlbProCod = new long[1] ;
      P02RO3_A396EmprCod = new String[] {""} ;
      P02RO3_A30AlbProCod = new long[1] ;
      P02RO3_A130BarCodPar = new String[] {""} ;
      P02RO3_A132BarCodReo = new byte[1] ;
      P02RO3_A129BarCod = new int[1] ;
      P02RO3_A6816BarPreFMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RO3_n6816BarPreFMt = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A6816BarPreFMt = DecimalUtil.ZERO ;
      P02RO4_A396EmprCod = new String[] {""} ;
      P02RO4_A30AlbProCod = new long[1] ;
      P02RO4_A129BarCod = new int[1] ;
      P02RO4_A132BarCodReo = new byte[1] ;
      P02RO4_A130BarCodPar = new String[] {""} ;
      P02RO4_A1032FonCod = new String[] {""} ;
      P02RO4_A1056DisComCod = new String[] {""} ;
      P02RO4_A2524DisComLin = new byte[1] ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      P02RO5_A396EmprCod = new String[] {""} ;
      P02RO5_A30AlbProCod = new long[1] ;
      P02RO5_A129BarCod = new int[1] ;
      P02RO5_A132BarCodReo = new byte[1] ;
      P02RO5_A130BarCodPar = new String[] {""} ;
      P02RO5_A2524DisComLin = new byte[1] ;
      P02RO5_A1056DisComCod = new String[] {""} ;
      P02RO5_A1032FonCod = new String[] {""} ;
      P02RO5_A7080AEPKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RO5_n7080AEPKil = new boolean[] {false} ;
      P02RO5_A7081AEPMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RO5_n7081AEPMet = new boolean[] {false} ;
      P02RO5_A200BarPieCod = new String[] {""} ;
      A7080AEPKil = DecimalUtil.ZERO ;
      A7081AEPMet = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      P02RO6_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RO6_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbtep3__default(),
         new Object[] {
             new Object[] {
            P02RO2_A396EmprCod, P02RO2_A30AlbProCod
            }
            , new Object[] {
            P02RO3_A396EmprCod, P02RO3_A30AlbProCod, P02RO3_A130BarCodPar, P02RO3_A132BarCodReo, P02RO3_A129BarCod, P02RO3_A6816BarPreFMt, P02RO3_n6816BarPreFMt
            }
            , new Object[] {
            P02RO4_A396EmprCod, P02RO4_A30AlbProCod, P02RO4_A129BarCod, P02RO4_A132BarCodReo, P02RO4_A130BarCodPar, P02RO4_A1032FonCod, P02RO4_A1056DisComCod, P02RO4_A2524DisComLin
            }
            , new Object[] {
            P02RO5_A396EmprCod, P02RO5_A30AlbProCod, P02RO5_A129BarCod, P02RO5_A132BarCodReo, P02RO5_A130BarCodPar, P02RO5_A2524DisComLin, P02RO5_A1056DisComCod, P02RO5_A1032FonCod, P02RO5_A7080AEPKil, P02RO5_n7080AEPKil,
            P02RO5_A7081AEPMet, P02RO5_n7081AEPMet, P02RO5_A200BarPieCod
            }
            , new Object[] {
            P02RO6_A27AlbPKilEnt, P02RO6_A1270AlbPMtrEnt
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
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13BarCodReo ;
   private byte AV15DisComLin ;
   private byte AV8Tipo ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte A7079AEPPie ;
   private short AV27AlbEComP ;
   private short AV29BarComPLan ;
   private short Gx_err ;
   private int AV12BarCod ;
   private int AV25BarAlbPie ;
   private int A129BarCod ;
   private long AV22AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV23BarAlbKgmE ;
   private java.math.BigDecimal AV24BarAlbMtrE ;
   private java.math.BigDecimal AV26ALbEComM ;
   private java.math.BigDecimal AV28BarComMLan ;
   private java.math.BigDecimal A6816BarPreFMt ;
   private java.math.BigDecimal A7080AEPKil ;
   private java.math.BigDecimal A7081AEPMet ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private String A396EmprCod ;
   private String AV14BarCodPar ;
   private String AV16DisComCod ;
   private String AV17FonCod ;
   private String AV18BarPieCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A200BarPieCod ;
   private boolean n6816BarPreFMt ;
   private boolean n7080AEPKil ;
   private boolean n7081AEPMet ;
   private short[] aP16 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private byte[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private int[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private short[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private IDataStoreProvider pr_default ;
   private String[] P02RO2_A396EmprCod ;
   private long[] P02RO2_A30AlbProCod ;
   private String[] P02RO3_A396EmprCod ;
   private long[] P02RO3_A30AlbProCod ;
   private String[] P02RO3_A130BarCodPar ;
   private byte[] P02RO3_A132BarCodReo ;
   private int[] P02RO3_A129BarCod ;
   private java.math.BigDecimal[] P02RO3_A6816BarPreFMt ;
   private boolean[] P02RO3_n6816BarPreFMt ;
   private String[] P02RO4_A396EmprCod ;
   private long[] P02RO4_A30AlbProCod ;
   private int[] P02RO4_A129BarCod ;
   private byte[] P02RO4_A132BarCodReo ;
   private String[] P02RO4_A130BarCodPar ;
   private String[] P02RO4_A1032FonCod ;
   private String[] P02RO4_A1056DisComCod ;
   private byte[] P02RO4_A2524DisComLin ;
   private String[] P02RO5_A396EmprCod ;
   private long[] P02RO5_A30AlbProCod ;
   private int[] P02RO5_A129BarCod ;
   private byte[] P02RO5_A132BarCodReo ;
   private String[] P02RO5_A130BarCodPar ;
   private byte[] P02RO5_A2524DisComLin ;
   private String[] P02RO5_A1056DisComCod ;
   private String[] P02RO5_A1032FonCod ;
   private java.math.BigDecimal[] P02RO5_A7080AEPKil ;
   private boolean[] P02RO5_n7080AEPKil ;
   private java.math.BigDecimal[] P02RO5_A7081AEPMet ;
   private boolean[] P02RO5_n7081AEPMet ;
   private String[] P02RO5_A200BarPieCod ;
   private java.math.BigDecimal[] P02RO6_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P02RO6_A1270AlbPMtrEnt ;
}

final  class palbtep3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RO2", "SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RO3", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarPreFMt FROM TXPALBBAR WHERE (EmprCod = ? and AlbProCod = ?) AND (( BarCod = ? and BarCodReo = ? and BarCodPar = ? and ? > 1) or ? <= 1) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02RO4", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FonCod, DisComCod, DisComLin FROM TXPALBEST WHERE (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (( DisComLin = ? and DisComCod = ? and FonCod = ? and ? > 2) or ? <= 2) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02RO5", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, AEPKil, AEPMet, BarPieCod FROM TXPALBTEP WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) AND ((EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ?) AND (( BarPieCod = ? and ? > 3) or ? <= 3)) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02RO6", "SELECT AlbPKilEnt, AlbPMtrEnt FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02RO7", "DELETE FROM TXPALBTEP  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTEP")
         ,new UpdateCursor("P02RO8", "UPDATE TXPLALPRD SET AlbPKilEnt=?, AlbPMtrEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P02RO9", "DELETE FROM TXPALBEST  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new UpdateCursor("P02RO10", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P02RO11", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P02RO12", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 9);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 12);
               stmt.setString(16, (String)parms[15], 12);
               stmt.setString(17, (String)parms[16], 9);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
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
               stmt.setString(9, (String)parms[8], 9);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
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
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

