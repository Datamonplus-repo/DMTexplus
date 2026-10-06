package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgealex extends GXProcedure
{
   public pgealex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgealex.class ), "" );
   }

   public pgealex( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            java.util.Date[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pgealex.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pgealex.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgealex.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pgealex.this.AV15ExhAlbFec = aP2[0];
      this.aP2 = aP2;
      pgealex.this.AV16ExhAlbSec = aP3[0];
      this.aP3 = aP3;
      pgealex.this.AV17ExhAlbPri = aP4[0];
      this.aP4 = aP4;
      pgealex.this.AV18TrnCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00E52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A39AlbProPri = P00E52_A39AlbProPri[0] ;
         /* Using cursor P00E53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brkE53 = false ;
            A2248ManCod = P00E53_A2248ManCod[0] ;
            n2248ManCod = P00E53_n2248ManCod[0] ;
            A32AlbProEsp = P00E53_A32AlbProEsp[0] ;
            A129BarCod = P00E53_A129BarCod[0] ;
            A132BarCodReo = P00E53_A132BarCodReo[0] ;
            A130BarCodPar = P00E53_A130BarCodPar[0] ;
            AV23ManCod = A2248ManCod ;
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV20Contador = httpContext.getMessage( "ALBMA0", "") ;
            }
            else
            {
               AV20Contador = httpContext.getMessage( "ALBMA1", "") ;
            }
            GXv_int1[0] = AV19ExhAlbCod ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV20Contador, GXv_int1) ;
            pgealex.this.AV19ExhAlbCod = GXv_int1[0] ;
            /*
               INSERT RECORD ON TABLE TXPCEXPER

            */
            W840TrnCod = A840TrnCod ;
            n840TrnCod = false ;
            A2406ExhAlbCod = AV19ExhAlbCod ;
            A2407ExhAlbFec = AV15ExhAlbFec ;
            n2407ExhAlbFec = false ;
            A2412ExhAlbSec = AV16ExhAlbSec ;
            n2412ExhAlbSec = false ;
            A2411ExhAlbPri = AV17ExhAlbPri ;
            n2411ExhAlbPri = false ;
            A2409ExhAlbLis = (byte)(0) ;
            n2409ExhAlbLis = false ;
            A2418ExhObsULin = (short)(0) ;
            n2418ExhObsULin = false ;
            A840TrnCod = AV18TrnCod ;
            n840TrnCod = false ;
            /* Using cursor P00E54 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod), Boolean.valueOf(n2411ExhAlbPri), A2411ExhAlbPri, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n2407ExhAlbFec), A2407ExhAlbFec, Boolean.valueOf(n2409ExhAlbLis), Byte.valueOf(A2409ExhAlbLis), Boolean.valueOf(n2412ExhAlbSec), A2412ExhAlbSec, Boolean.valueOf(n2418ExhObsULin), Short.valueOf(A2418ExhObsULin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXPER");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A840TrnCod = W840TrnCod ;
            n840TrnCod = false ;
            /* End Insert */
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P00E53_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00E53_A30AlbProCod[0] == A30AlbProCod ) && ( P00E53_A2248ManCod[0] == A2248ManCod ) )
            {
               brkE53 = false ;
               A129BarCod = P00E53_A129BarCod[0] ;
               A132BarCodReo = P00E53_A132BarCodReo[0] ;
               A130BarCodPar = P00E53_A130BarCodPar[0] ;
               AV23ManCod = A2248ManCod ;
               /* Execute user subroutine: 'LEXPER' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               brkE53 = true ;
               pr_default.readNext(1);
            }
            if ( ! brkE53 )
            {
               brkE53 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'LEXPER' Routine */
      returnInSub = false ;
      /* Using cursor P00E55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Short.valueOf(AV23ManCod), A396EmprCod, Long.valueOf(A30AlbProCod), Short.valueOf(AV23ManCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2398BarFasExt = P00E55_A2398BarFasExt[0] ;
         A1261BarAlbKgmE = P00E55_A1261BarAlbKgmE[0] ;
         A1458BarAlbBul = P00E55_A1458BarAlbBul[0] ;
         A2396BarAlbObs = P00E55_A2396BarAlbObs[0] ;
         A130BarCodPar = P00E55_A130BarCodPar[0] ;
         A132BarCodReo = P00E55_A132BarCodReo[0] ;
         A129BarCod = P00E55_A129BarCod[0] ;
         A2248ManCod = P00E55_A2248ManCod[0] ;
         n2248ManCod = P00E55_n2248ManCod[0] ;
         A32AlbProEsp = P00E55_A32AlbProEsp[0] ;
         A2395BarAlbExt = P00E55_A2395BarAlbExt[0] ;
         n2395BarAlbExt = P00E55_n2395BarAlbExt[0] ;
         /* Using cursor P00E56 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A361DisCod = P00E56_A361DisCod[0] ;
         A2400BarManCod = P00E56_A2400BarManCod[0] ;
         A252CliCod = P00E56_A252CliCod[0] ;
         n252CliCod = P00E56_n252CliCod[0] ;
         /* Using cursor P00E57 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A2402DisManCod = P00E57_A2402DisManCod[0] ;
         /*
            INSERT RECORD ON TABLE TXPLEXPER

         */
         A2406ExhAlbCod = AV19ExhAlbCod ;
         A457FasCod = A2398BarFasExt ;
         n457FasCod = false ;
         A2415ExhKgsEnt = A1261BarAlbKgmE ;
         n2415ExhKgsEnt = false ;
         A2413ExhBulEnt = A1458BarAlbBul ;
         n2413ExhBulEnt = false ;
         A2414ExhEst = (byte)(0) ;
         n2414ExhEst = false ;
         A2410ExhAlbObs = A2396BarAlbObs ;
         n2410ExhAlbObs = false ;
         /* Using cursor P00E58 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n2415ExhKgsEnt), A2415ExhKgsEnt, Boolean.valueOf(n2413ExhBulEnt), Short.valueOf(A2413ExhBulEnt), Boolean.valueOf(n2414ExhEst), Byte.valueOf(A2414ExhEst), Boolean.valueOf(n2410ExhAlbObs), A2410ExhAlbObs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXPER");
         if ( (pr_default.getStatus(6) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         A2395BarAlbExt = AV19ExhAlbCod ;
         n2395BarAlbExt = false ;
         A2400BarManCod = A2248ManCod ;
         A2402DisManCod = A2248ManCod ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A2248ManCod ;
         GXv_char4[0] = A2398BarFasExt ;
         GXv_char5[0] = httpContext.getMessage( "E", "") ;
         GXv_int1[0] = AV19ExhAlbCod ;
         GXv_decimal6[0] = A1261BarAlbKgmE ;
         GXv_int7[0] = A1458BarAlbBul ;
         GXv_date8[0] = AV15ExhAlbFec ;
         GXv_int9[0] = A252CliCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         new app.pactmvh(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int1, GXv_decimal6, GXv_int7, GXv_date8, GXv_int9, GXv_int10, GXv_int11, GXv_char12) ;
         pgealex.this.A396EmprCod = GXv_char2[0] ;
         pgealex.this.A2248ManCod = GXv_int3[0] ;
         pgealex.this.A2398BarFasExt = GXv_char4[0] ;
         pgealex.this.AV19ExhAlbCod = GXv_int1[0] ;
         pgealex.this.A1261BarAlbKgmE = GXv_decimal6[0] ;
         pgealex.this.A1458BarAlbBul = GXv_int7[0] ;
         pgealex.this.AV15ExhAlbFec = GXv_date8[0] ;
         pgealex.this.A252CliCod = GXv_int9[0] ;
         pgealex.this.A129BarCod = GXv_int10[0] ;
         pgealex.this.A132BarCodReo = GXv_int11[0] ;
         pgealex.this.A130BarCodPar = GXv_char12[0] ;
         /* Using cursor P00E59 */
         pr_default.execute(7, new Object[] {Short.valueOf(A2400BarManCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Using cursor P00E510 */
         pr_default.execute(8, new Object[] {Short.valueOf(A2402DisManCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Using cursor P00E511 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n2395BarAlbExt), Integer.valueOf(A2395BarAlbExt), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         pr_default.readNext(3);
      }
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgealex.this.A396EmprCod;
      this.aP1[0] = pgealex.this.A30AlbProCod;
      this.aP2[0] = pgealex.this.AV15ExhAlbFec;
      this.aP3[0] = pgealex.this.AV16ExhAlbSec;
      this.aP4[0] = pgealex.this.AV17ExhAlbPri;
      this.aP5[0] = pgealex.this.AV18TrnCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgealex");
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
      P00E52_A396EmprCod = new String[] {""} ;
      P00E52_A30AlbProCod = new long[1] ;
      P00E52_A39AlbProPri = new String[] {""} ;
      A39AlbProPri = "" ;
      P00E53_A396EmprCod = new String[] {""} ;
      P00E53_A30AlbProCod = new long[1] ;
      P00E53_A2248ManCod = new short[1] ;
      P00E53_n2248ManCod = new boolean[] {false} ;
      P00E53_A32AlbProEsp = new byte[1] ;
      P00E53_A129BarCod = new int[1] ;
      P00E53_A132BarCodReo = new byte[1] ;
      P00E53_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      AV20Contador = "" ;
      A2407ExhAlbFec = GXutil.nullDate() ;
      A2412ExhAlbSec = "" ;
      A2411ExhAlbPri = "" ;
      Gx_emsg = "" ;
      P00E55_A396EmprCod = new String[] {""} ;
      P00E55_A30AlbProCod = new long[1] ;
      P00E55_A2398BarFasExt = new String[] {""} ;
      P00E55_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00E55_A1458BarAlbBul = new short[1] ;
      P00E55_A2396BarAlbObs = new String[] {""} ;
      P00E55_A130BarCodPar = new String[] {""} ;
      P00E55_A132BarCodReo = new byte[1] ;
      P00E55_A129BarCod = new int[1] ;
      P00E55_A2248ManCod = new short[1] ;
      P00E55_n2248ManCod = new boolean[] {false} ;
      P00E55_A32AlbProEsp = new byte[1] ;
      P00E55_A2395BarAlbExt = new int[1] ;
      P00E55_n2395BarAlbExt = new boolean[] {false} ;
      A2398BarFasExt = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A2396BarAlbObs = "" ;
      P00E56_A361DisCod = new int[1] ;
      P00E56_A2400BarManCod = new short[1] ;
      P00E56_A252CliCod = new int[1] ;
      P00E56_n252CliCod = new boolean[] {false} ;
      P00E57_A2402DisManCod = new short[1] ;
      A457FasCod = "" ;
      A2415ExhKgsEnt = DecimalUtil.ZERO ;
      A2410ExhAlbObs = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int1 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new short[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char12 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgealex__default(),
         new Object[] {
             new Object[] {
            P00E52_A396EmprCod, P00E52_A30AlbProCod, P00E52_A39AlbProPri
            }
            , new Object[] {
            P00E53_A396EmprCod, P00E53_A30AlbProCod, P00E53_A2248ManCod, P00E53_n2248ManCod, P00E53_A32AlbProEsp, P00E53_A129BarCod, P00E53_A132BarCodReo, P00E53_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            P00E55_A396EmprCod, P00E55_A30AlbProCod, P00E55_A2398BarFasExt, P00E55_A1261BarAlbKgmE, P00E55_A1458BarAlbBul, P00E55_A2396BarAlbObs, P00E55_A130BarCodPar, P00E55_A132BarCodReo, P00E55_A129BarCod, P00E55_A2248ManCod,
            P00E55_n2248ManCod, P00E55_A32AlbProEsp, P00E55_A2395BarAlbExt, P00E55_n2395BarAlbExt
            }
            , new Object[] {
            P00E56_A361DisCod, P00E56_A2400BarManCod, P00E56_A252CliCod, P00E56_n252CliCod
            }
            , new Object[] {
            P00E57_A2402DisManCod
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

   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private byte A2409ExhAlbLis ;
   private byte A2414ExhEst ;
   private byte GXv_int11[] ;
   private short AV18TrnCod ;
   private short A2248ManCod ;
   private short AV23ManCod ;
   private short W840TrnCod ;
   private short A840TrnCod ;
   private short A2418ExhObsULin ;
   private short Gx_err ;
   private short A1458BarAlbBul ;
   private short A2400BarManCod ;
   private short A2402DisManCod ;
   private short A2413ExhBulEnt ;
   private short GXv_int3[] ;
   private short GXv_int7[] ;
   private int A129BarCod ;
   private int AV19ExhAlbCod ;
   private int GX_INS326 ;
   private int A2406ExhAlbCod ;
   private int A2395BarAlbExt ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int GX_INS327 ;
   private int GXv_int1[] ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2415ExhKgsEnt ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String AV16ExhAlbSec ;
   private String AV17ExhAlbPri ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A130BarCodPar ;
   private String AV20Contador ;
   private String A2412ExhAlbSec ;
   private String A2411ExhAlbPri ;
   private String Gx_emsg ;
   private String A2398BarFasExt ;
   private String A2396BarAlbObs ;
   private String A457FasCod ;
   private String A2410ExhAlbObs ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char12[] ;
   private java.util.Date AV15ExhAlbFec ;
   private java.util.Date A2407ExhAlbFec ;
   private java.util.Date GXv_date8[] ;
   private boolean brkE53 ;
   private boolean n2248ManCod ;
   private boolean n840TrnCod ;
   private boolean n2407ExhAlbFec ;
   private boolean n2412ExhAlbSec ;
   private boolean n2411ExhAlbPri ;
   private boolean n2409ExhAlbLis ;
   private boolean n2418ExhObsULin ;
   private boolean returnInSub ;
   private boolean n2395BarAlbExt ;
   private boolean n252CliCod ;
   private boolean n457FasCod ;
   private boolean n2415ExhKgsEnt ;
   private boolean n2413ExhBulEnt ;
   private boolean n2414ExhEst ;
   private boolean n2410ExhAlbObs ;
   private short[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00E52_A396EmprCod ;
   private long[] P00E52_A30AlbProCod ;
   private String[] P00E52_A39AlbProPri ;
   private String[] P00E53_A396EmprCod ;
   private long[] P00E53_A30AlbProCod ;
   private short[] P00E53_A2248ManCod ;
   private boolean[] P00E53_n2248ManCod ;
   private byte[] P00E53_A32AlbProEsp ;
   private int[] P00E53_A129BarCod ;
   private byte[] P00E53_A132BarCodReo ;
   private String[] P00E53_A130BarCodPar ;
   private String[] P00E55_A396EmprCod ;
   private long[] P00E55_A30AlbProCod ;
   private String[] P00E55_A2398BarFasExt ;
   private java.math.BigDecimal[] P00E55_A1261BarAlbKgmE ;
   private short[] P00E55_A1458BarAlbBul ;
   private String[] P00E55_A2396BarAlbObs ;
   private String[] P00E55_A130BarCodPar ;
   private byte[] P00E55_A132BarCodReo ;
   private int[] P00E55_A129BarCod ;
   private short[] P00E55_A2248ManCod ;
   private boolean[] P00E55_n2248ManCod ;
   private byte[] P00E55_A32AlbProEsp ;
   private int[] P00E55_A2395BarAlbExt ;
   private boolean[] P00E55_n2395BarAlbExt ;
   private int[] P00E56_A361DisCod ;
   private short[] P00E56_A2400BarManCod ;
   private int[] P00E56_A252CliCod ;
   private boolean[] P00E56_n252CliCod ;
   private short[] P00E57_A2402DisManCod ;
}

final  class pgealex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00E52", "SELECT EmprCod, AlbProCod, AlbProPri FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00E53", "SELECT EmprCod, AlbProCod, ManCod, AlbProEsp, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE (EmprCod = ? and AlbProCod = ?) AND (Not (ManCod = 0)) ORDER BY EmprCod, AlbProCod, ManCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00E54", "INSERT INTO TXPCEXPER(EmprCod, ExhAlbCod, ExhAlbPri, ManCod, TrnCod, ExhAlbFec, ExhAlbLis, ExhAlbSec, ExhObsULin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXPER")
         ,new ForEachCursor("P00E55", "SELECT EmprCod, AlbProCod, BarFasExt, BarAlbKgmE, BarAlbBul, BarAlbObs, BarCodPar, BarCodReo, BarCod, ManCod, AlbProEsp, BarAlbExt FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND ManCod = ?) AND (EmprCod = ? and AlbProCod = ? and ManCod = ?) ORDER BY EmprCod, AlbProCod, ManCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00E56", "SELECT DisCod, BarManCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00E57", "SELECT DisManCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00E58", "INSERT INTO TXPLEXPER(EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar, FasCod, ExhKgsEnt, ExhBulEnt, ExhEst, ExhAlbObs, BarKgsCl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXPER")
         ,new UpdateCursor("P00E59", "UPDATE TXPBARCAD SET BarManCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P00E510", "UPDATE TXPDISPOS SET DisManCod=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P00E511", "UPDATE TXPALBBAR SET BarAlbExt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 30);
               }
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
      }
   }

}

