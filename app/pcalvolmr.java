package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalvolmr extends GXProcedure
{
   public pcalvolmr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalvolmr.class ), "" );
   }

   public pcalvolmr( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           int[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           int[] aP7 ,
                                           int[] aP8 ,
                                           short[] aP9 ,
                                           String[] aP10 ,
                                           java.math.BigDecimal[] aP11 ,
                                           java.math.BigDecimal[] aP12 )
   {
      pcalvolmr.this.aP13 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        java.math.BigDecimal[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.math.BigDecimal[] aP13 )
   {
      pcalvolmr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalvolmr.this.AV30barCod = aP1[0];
      this.aP1 = aP1;
      pcalvolmr.this.AV31BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcalvolmr.this.AV32barCodPar = aP3[0];
      this.aP3 = aP3;
      pcalvolmr.this.AV25BarMaqCod = aP4[0];
      this.aP4 = aP4;
      pcalvolmr.this.AV24BarVolMaq = aP5[0];
      this.aP5 = aP5;
      pcalvolmr.this.AV26TIPARTRB = aP6[0];
      this.aP6 = aP6;
      pcalvolmr.this.AV34TipArtVmx = aP7[0];
      this.aP7 = aP7;
      pcalvolmr.this.AV35TipArtVmn = aP8[0];
      this.aP8 = aP8;
      pcalvolmr.this.AV23BarTipArt = aP9[0];
      this.aP9 = aP9;
      pcalvolmr.this.AV36TipArtDsc = aP10[0];
      this.aP10 = aP10;
      pcalvolmr.this.AV33Kgs = aP11[0];
      this.aP11 = aP11;
      pcalvolmr.this.AV37MAQKGSMAX = aP12[0];
      this.aP12 = aP12;
      pcalvolmr.this.AV38MAQKGSMin = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37MAQKGSMAX = DecimalUtil.doubleToDec(0) ;
      AV38MAQKGSMin = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02C72 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV25BarMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P02C72_A602MaqCod[0] ;
         A4285MaqKgsMax = P02C72_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P02C72_n4285MaqKgsMax[0] ;
         A4283MaqKgsMin = P02C72_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P02C72_n4283MaqKgsMin[0] ;
         AV37MAQKGSMAX = A4285MaqKgsMax ;
         AV38MAQKGSMin = A4283MaqKgsMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02C74 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV30barCod), Byte.valueOf(AV31BarCodReo), AV32barCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P02C74_A130BarCodPar[0] ;
         A132BarCodReo = P02C74_A132BarCodReo[0] ;
         A129BarCod = P02C74_A129BarCod[0] ;
         A217BarTipArt = P02C74_A217BarTipArt[0] ;
         n217BarTipArt = P02C74_n217BarTipArt[0] ;
         A120BarAgrEst = P02C74_A120BarAgrEst[0] ;
         A236BarVolMaq = P02C74_A236BarVolMaq[0] ;
         A166BarKgm = P02C74_A166BarKgm[0] ;
         n166BarKgm = P02C74_n166BarKgm[0] ;
         A166BarKgm = P02C74_A166BarKgm[0] ;
         n166BarKgm = P02C74_n166BarKgm[0] ;
         AV23BarTipArt = A217BarTipArt ;
         AV33Kgs = A166BarKgm ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            AV30barCod = A129BarCod ;
            AV31BarCodReo = A132BarCodReo ;
            AV32barCodPar = A130BarCodPar ;
            /* Execute user subroutine: 'BARAGR' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Execute user subroutine: 'TIPART' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'TIPARTRB' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV29Volumen = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( AV33Kgs.multiply(AV26TIPARTRB), 0))) ;
         if ( ( AV29Volumen > AV34TipArtVmx ) && ( AV29Volumen > 0 ) && ( AV34TipArtVmx > 0 ) )
         {
            A236BarVolMaq = AV34TipArtVmx ;
         }
         if ( ( AV29Volumen < AV35TipArtVmn ) && ( AV29Volumen > 0 ) && ( AV35TipArtVmn > 0 ) )
         {
            A236BarVolMaq = AV35TipArtVmn ;
         }
         Gx_msg = httpContext.getMessage( "&Volumen   =", "") + GXutil.str( AV29Volumen, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "&TipArtVmn =", "") + GXutil.str( AV35TipArtVmn, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "&TipArtVmx =", "") + GXutil.str( AV34TipArtVmx, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "Barvolmaq  =", "") + GXutil.str( A236BarVolMaq, 5, 0) + GXutil.newLine( ) ;
         if ( ( AV34TipArtVmx >= AV29Volumen ) && ( AV35TipArtVmn <= AV29Volumen ) )
         {
            A236BarVolMaq = AV29Volumen ;
         }
         AV24BarVolMaq = A236BarVolMaq ;
         /* Using cursor P02C75 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A236BarVolMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV36TipArtDsc = "" ;
      /* Using cursor P02C76 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(AV23BarTipArt)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A829TipArtCod = P02C76_A829TipArtCod[0] ;
         A830TipArtDsc = P02C76_A830TipArtDsc[0] ;
         n830TipArtDsc = P02C76_n830TipArtDsc[0] ;
         AV36TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'TIPARTRB' Routine */
      returnInSub = false ;
      AV26TIPARTRB = DecimalUtil.doubleToDec(0) ;
      AV34TipArtVmx = 0 ;
      AV35TipArtVmn = 0 ;
      /* Using cursor P02C77 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(AV23BarTipArt), AV25BarMaqCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = P02C77_A602MaqCod[0] ;
         A6188MaqTArt = P02C77_A6188MaqTArt[0] ;
         A6190TipArtRb = P02C77_A6190TipArtRb[0] ;
         n6190TipArtRb = P02C77_n6190TipArtRb[0] ;
         A6234TipArtVmx = P02C77_A6234TipArtVmx[0] ;
         n6234TipArtVmx = P02C77_n6234TipArtVmx[0] ;
         A6233TipArtVmn = P02C77_A6233TipArtVmn[0] ;
         n6233TipArtVmn = P02C77_n6233TipArtVmn[0] ;
         AV26TIPARTRB = A6190TipArtRb ;
         AV34TipArtVmx = A6234TipArtVmx ;
         AV35TipArtVmn = A6233TipArtVmn ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S131( )
   {
      /* 'BARAGR' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P02C78 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV30barCod), Byte.valueOf(AV31BarCodReo), AV32barCodPar});
      c590KgmAgr = P02C78_A590KgmAgr[0] ;
      pr_default.close(5);
      AV33Kgs = AV33Kgs.add(c590KgmAgr) ;
      /* End optimized group. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalvolmr.this.A396EmprCod;
      this.aP1[0] = pcalvolmr.this.AV30barCod;
      this.aP2[0] = pcalvolmr.this.AV31BarCodReo;
      this.aP3[0] = pcalvolmr.this.AV32barCodPar;
      this.aP4[0] = pcalvolmr.this.AV25BarMaqCod;
      this.aP5[0] = pcalvolmr.this.AV24BarVolMaq;
      this.aP6[0] = pcalvolmr.this.AV26TIPARTRB;
      this.aP7[0] = pcalvolmr.this.AV34TipArtVmx;
      this.aP8[0] = pcalvolmr.this.AV35TipArtVmn;
      this.aP9[0] = pcalvolmr.this.AV23BarTipArt;
      this.aP10[0] = pcalvolmr.this.AV36TipArtDsc;
      this.aP11[0] = pcalvolmr.this.AV33Kgs;
      this.aP12[0] = pcalvolmr.this.AV37MAQKGSMAX;
      this.aP13[0] = pcalvolmr.this.AV38MAQKGSMin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcalvolmr");
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
      P02C72_A396EmprCod = new String[] {""} ;
      P02C72_A602MaqCod = new String[] {""} ;
      P02C72_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02C72_n4285MaqKgsMax = new boolean[] {false} ;
      P02C72_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02C72_n4283MaqKgsMin = new boolean[] {false} ;
      A602MaqCod = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      P02C74_A396EmprCod = new String[] {""} ;
      P02C74_A130BarCodPar = new String[] {""} ;
      P02C74_A132BarCodReo = new byte[1] ;
      P02C74_A129BarCod = new int[1] ;
      P02C74_A217BarTipArt = new short[1] ;
      P02C74_n217BarTipArt = new boolean[] {false} ;
      P02C74_A120BarAgrEst = new String[] {""} ;
      P02C74_A236BarVolMaq = new int[1] ;
      P02C74_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02C74_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      P02C76_A396EmprCod = new String[] {""} ;
      P02C76_A829TipArtCod = new short[1] ;
      P02C76_A830TipArtDsc = new String[] {""} ;
      P02C76_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P02C77_A396EmprCod = new String[] {""} ;
      P02C77_A602MaqCod = new String[] {""} ;
      P02C77_A6188MaqTArt = new short[1] ;
      P02C77_A6190TipArtRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02C77_n6190TipArtRb = new boolean[] {false} ;
      P02C77_A6234TipArtVmx = new int[1] ;
      P02C77_n6234TipArtVmx = new boolean[] {false} ;
      P02C77_A6233TipArtVmn = new int[1] ;
      P02C77_n6233TipArtVmn = new boolean[] {false} ;
      A6190TipArtRb = DecimalUtil.ZERO ;
      c590KgmAgr = DecimalUtil.ZERO ;
      P02C78_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalvolmr__default(),
         new Object[] {
             new Object[] {
            P02C72_A396EmprCod, P02C72_A602MaqCod, P02C72_A4285MaqKgsMax, P02C72_n4285MaqKgsMax, P02C72_A4283MaqKgsMin, P02C72_n4283MaqKgsMin
            }
            , new Object[] {
            P02C74_A396EmprCod, P02C74_A130BarCodPar, P02C74_A132BarCodReo, P02C74_A129BarCod, P02C74_A217BarTipArt, P02C74_n217BarTipArt, P02C74_A120BarAgrEst, P02C74_A236BarVolMaq, P02C74_A166BarKgm, P02C74_n166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P02C76_A396EmprCod, P02C76_A829TipArtCod, P02C76_A830TipArtDsc, P02C76_n830TipArtDsc
            }
            , new Object[] {
            P02C77_A396EmprCod, P02C77_A602MaqCod, P02C77_A6188MaqTArt, P02C77_A6190TipArtRb, P02C77_n6190TipArtRb, P02C77_A6234TipArtVmx, P02C77_n6234TipArtVmx, P02C77_A6233TipArtVmn, P02C77_n6233TipArtVmn
            }
            , new Object[] {
            P02C78_A590KgmAgr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV31BarCodReo ;
   private byte A132BarCodReo ;
   private short AV23BarTipArt ;
   private short A217BarTipArt ;
   private short A829TipArtCod ;
   private short A6188MaqTArt ;
   private short Gx_err ;
   private int AV30barCod ;
   private int AV24BarVolMaq ;
   private int AV34TipArtVmx ;
   private int AV35TipArtVmn ;
   private int A129BarCod ;
   private int A236BarVolMaq ;
   private int AV29Volumen ;
   private int A6234TipArtVmx ;
   private int A6233TipArtVmn ;
   private java.math.BigDecimal AV26TIPARTRB ;
   private java.math.BigDecimal AV33Kgs ;
   private java.math.BigDecimal AV37MAQKGSMAX ;
   private java.math.BigDecimal AV38MAQKGSMin ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A6190TipArtRb ;
   private java.math.BigDecimal c590KgmAgr ;
   private String A396EmprCod ;
   private String AV32barCodPar ;
   private String AV25BarMaqCod ;
   private String AV36TipArtDsc ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String Gx_msg ;
   private String A830TipArtDsc ;
   private boolean n4285MaqKgsMax ;
   private boolean n4283MaqKgsMin ;
   private boolean n217BarTipArt ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n830TipArtDsc ;
   private boolean n6190TipArtRb ;
   private boolean n6234TipArtVmx ;
   private boolean n6233TipArtVmn ;
   private java.math.BigDecimal[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private int[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P02C72_A396EmprCod ;
   private String[] P02C72_A602MaqCod ;
   private java.math.BigDecimal[] P02C72_A4285MaqKgsMax ;
   private boolean[] P02C72_n4285MaqKgsMax ;
   private java.math.BigDecimal[] P02C72_A4283MaqKgsMin ;
   private boolean[] P02C72_n4283MaqKgsMin ;
   private String[] P02C74_A396EmprCod ;
   private String[] P02C74_A130BarCodPar ;
   private byte[] P02C74_A132BarCodReo ;
   private int[] P02C74_A129BarCod ;
   private short[] P02C74_A217BarTipArt ;
   private boolean[] P02C74_n217BarTipArt ;
   private String[] P02C74_A120BarAgrEst ;
   private int[] P02C74_A236BarVolMaq ;
   private java.math.BigDecimal[] P02C74_A166BarKgm ;
   private boolean[] P02C74_n166BarKgm ;
   private String[] P02C76_A396EmprCod ;
   private short[] P02C76_A829TipArtCod ;
   private String[] P02C76_A830TipArtDsc ;
   private boolean[] P02C76_n830TipArtDsc ;
   private String[] P02C77_A396EmprCod ;
   private String[] P02C77_A602MaqCod ;
   private short[] P02C77_A6188MaqTArt ;
   private java.math.BigDecimal[] P02C77_A6190TipArtRb ;
   private boolean[] P02C77_n6190TipArtRb ;
   private int[] P02C77_A6234TipArtVmx ;
   private boolean[] P02C77_n6234TipArtVmx ;
   private int[] P02C77_A6233TipArtVmn ;
   private boolean[] P02C77_n6233TipArtVmn ;
   private java.math.BigDecimal[] P02C78_A590KgmAgr ;
}

final  class pcalvolmr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02C72", "SELECT EmprCod, MaqCod, MaqKgsMax, MaqKgsMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02C74", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarTipArt, T1.BarAgrEst, T1.BarVolMaq, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02C75", "UPDATE TXPBARCAD SET BarVolMaq=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02C76", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02C77", "SELECT EmprCod, MaqCod, MaqTArt, TipArtRb, TipArtVmx, TipArtVmn FROM TXPTARTM1 WHERE EmprCod = ? and MaqTArt = ? and MaqCod = ? ORDER BY EmprCod, MaqTArt, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02C78", "SELECT SUM(KgmAgr) FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

