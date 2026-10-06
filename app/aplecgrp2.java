package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aplecgrp2 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aplecgrp2 pgm = new aplecgrp2 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aplecgrp2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aplecgrp2.class ), "" );
   }

   public aplecgrp2( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Procesando.......LECTOR", "") );
      /* Using cursor P03KZ2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P03KZ2_A396EmprCod[0] ;
         A1796LecTipEnt = P03KZ2_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P03KZ2_n1796LecTipEnt[0] ;
         A1170LecOpeCod = P03KZ2_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P03KZ2_n1170LecOpeCod[0] ;
         A1171LecFasCod = P03KZ2_A1171LecFasCod[0] ;
         n1171LecFasCod = P03KZ2_n1171LecFasCod[0] ;
         A1188LecFasOrd = P03KZ2_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P03KZ2_n1188LecFasOrd[0] ;
         A1167LecBarCod = P03KZ2_A1167LecBarCod[0] ;
         n1167LecBarCod = P03KZ2_n1167LecBarCod[0] ;
         A1168LecBarReo = P03KZ2_A1168LecBarReo[0] ;
         n1168LecBarReo = P03KZ2_n1168LecBarReo[0] ;
         A1169LecBarPar = P03KZ2_A1169LecBarPar[0] ;
         n1169LecBarPar = P03KZ2_n1169LecBarPar[0] ;
         A1172LecParCod = P03KZ2_A1172LecParCod[0] ;
         n1172LecParCod = P03KZ2_n1172LecParCod[0] ;
         A1166LecMaqCod = P03KZ2_A1166LecMaqCod[0] ;
         AV13Emprcod = A396EmprCod ;
         AV8Lecmaqcod = A1166LecMaqCod ;
         AV9LecTipEnt = A1796LecTipEnt ;
         AV10Lecopecod = A1170LecOpeCod ;
         AV11Lecfascod = A1171LecFasCod ;
         AV12Lecfasord = A1188LecFasOrd ;
         AV14Lecbarcod = A1167LecBarCod ;
         AV15Lecbarreo = A1168LecBarReo ;
         AV16Lecbarpar = A1169LecBarPar ;
         AV17Lecparcod = A1172LecParCod ;
         /* Execute user subroutine: 'GRULECH' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV9LecTipEnt, httpContext.getMessage( "G", "")) == 0 )
         {
            /* Execute user subroutine: 'GRULECG' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Proceso.......LECTOR", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'GRULECH' Routine */
      returnInSub = false ;
      n8943GruParco = false ;
      n8944GruOpera = false ;
      n8941GruOrdLin = false ;
      n8942GruFasCod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03KZ3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n8943GruParco), Short.valueOf(AV17Lecparcod), Boolean.valueOf(n8944GruOpera), Integer.valueOf(AV10Lecopecod), Boolean.valueOf(n8941GruOrdLin), Short.valueOf(AV12Lecfasord), Boolean.valueOf(n8942GruFasCod), AV11Lecfascod, A396EmprCod, AV8Lecmaqcod, Integer.valueOf(AV14Lecbarcod), Byte.valueOf(AV15Lecbarreo), AV16Lecbarpar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRULEC");
      /* End optimized UPDATE. */
   }

   public void S121( )
   {
      /* 'GRULECG' Routine */
      returnInSub = false ;
      /* Using cursor P03KZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV8Lecmaqcod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1794GruLecMaq = P03KZ4_A1794GruLecMaq[0] ;
         A396EmprCod = P03KZ4_A396EmprCod[0] ;
         A8942GruFasCod = P03KZ4_A8942GruFasCod[0] ;
         n8942GruFasCod = P03KZ4_n8942GruFasCod[0] ;
         A8941GruOrdLin = P03KZ4_A8941GruOrdLin[0] ;
         n8941GruOrdLin = P03KZ4_n8941GruOrdLin[0] ;
         A8944GruOpera = P03KZ4_A8944GruOpera[0] ;
         n8944GruOpera = P03KZ4_n8944GruOpera[0] ;
         A8943GruParco = P03KZ4_A8943GruParco[0] ;
         n8943GruParco = P03KZ4_n8943GruParco[0] ;
         A1792GruBarPar = P03KZ4_A1792GruBarPar[0] ;
         A1793GruBarReo = P03KZ4_A1793GruBarReo[0] ;
         A1791GruBarCod = P03KZ4_A1791GruBarCod[0] ;
         A1795GruOrd = P03KZ4_A1795GruOrd[0] ;
         if ( ( A1791GruBarCod == AV14Lecbarcod ) && ( A1793GruBarReo == AV15Lecbarreo ) && ( GXutil.strcmp(A1792GruBarPar, AV16Lecbarpar) == 0 ) )
         {
         }
         else
         {
            AV18Barcod = A1791GruBarCod ;
            AV19Barcodreo = A1793GruBarReo ;
            AV20Barcodpar = A1792GruBarPar ;
            /* Execute user subroutine: 'BARFAS' */
            S134 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            A8942GruFasCod = AV11Lecfascod ;
            n8942GruFasCod = false ;
            A8941GruOrdLin = AV21Barordlin ;
            n8941GruOrdLin = false ;
            A8944GruOpera = AV10Lecopecod ;
            n8944GruOpera = false ;
            A8943GruParco = AV17Lecparcod ;
            n8943GruParco = false ;
         }
         /* Using cursor P03KZ5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n8942GruFasCod), A8942GruFasCod, Boolean.valueOf(n8941GruOrdLin), Short.valueOf(A8941GruOrdLin), Boolean.valueOf(n8944GruOpera), Integer.valueOf(A8944GruOpera), Boolean.valueOf(n8943GruParco), Short.valueOf(A8943GruParco), A396EmprCod, A1794GruLecMaq, Byte.valueOf(A1795GruOrd), Integer.valueOf(A1791GruBarCod), Byte.valueOf(A1793GruBarReo), A1792GruBarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRULEC");
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S134( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Using cursor P03KZ6 */
      pr_default.execute(4, new Object[] {AV13Emprcod, Integer.valueOf(AV18Barcod), Byte.valueOf(AV19Barcodreo), AV20Barcodpar, AV8Lecmaqcod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A153BarFasEst = P03KZ6_A153BarFasEst[0] ;
         A603MaqCodBis = P03KZ6_A603MaqCodBis[0] ;
         A130BarCodPar = P03KZ6_A130BarCodPar[0] ;
         A132BarCodReo = P03KZ6_A132BarCodReo[0] ;
         A129BarCod = P03KZ6_A129BarCod[0] ;
         A396EmprCod = P03KZ6_A396EmprCod[0] ;
         A457FasCod = P03KZ6_A457FasCod[0] ;
         A194BarOrdLin = P03KZ6_A194BarOrdLin[0] ;
         A758ProCod = P03KZ6_A758ProCod[0] ;
         AV22FasCod = A457FasCod ;
         AV23FlagMFas = (byte)(0) ;
         /* Using cursor P03KZ7 */
         pr_default.execute(5, new Object[] {AV13Emprcod, AV8Lecmaqcod, AV22FasCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A1142MaqFCod = P03KZ7_A1142MaqFCod[0] ;
            A602MaqCod = P03KZ7_A602MaqCod[0] ;
            A396EmprCod = P03KZ7_A396EmprCod[0] ;
            AV23FlagMFas = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         if ( AV23FlagMFas == 1 )
         {
            AV21Barordlin = A194BarOrdLin ;
            AV22FasCod = A457FasCod ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(plecgrp2.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aplecgrp2");
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
      P03KZ2_A396EmprCod = new String[] {""} ;
      P03KZ2_A1796LecTipEnt = new String[] {""} ;
      P03KZ2_n1796LecTipEnt = new boolean[] {false} ;
      P03KZ2_A1170LecOpeCod = new int[1] ;
      P03KZ2_n1170LecOpeCod = new boolean[] {false} ;
      P03KZ2_A1171LecFasCod = new String[] {""} ;
      P03KZ2_n1171LecFasCod = new boolean[] {false} ;
      P03KZ2_A1188LecFasOrd = new short[1] ;
      P03KZ2_n1188LecFasOrd = new boolean[] {false} ;
      P03KZ2_A1167LecBarCod = new int[1] ;
      P03KZ2_n1167LecBarCod = new boolean[] {false} ;
      P03KZ2_A1168LecBarReo = new byte[1] ;
      P03KZ2_n1168LecBarReo = new boolean[] {false} ;
      P03KZ2_A1169LecBarPar = new String[] {""} ;
      P03KZ2_n1169LecBarPar = new boolean[] {false} ;
      P03KZ2_A1172LecParCod = new short[1] ;
      P03KZ2_n1172LecParCod = new boolean[] {false} ;
      P03KZ2_A1166LecMaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      A1796LecTipEnt = "" ;
      A1171LecFasCod = "" ;
      A1169LecBarPar = "" ;
      A1166LecMaqCod = "" ;
      AV13Emprcod = "" ;
      AV8Lecmaqcod = "" ;
      AV9LecTipEnt = "" ;
      AV11Lecfascod = "" ;
      AV16Lecbarpar = "" ;
      A8942GruFasCod = "" ;
      P03KZ4_A1794GruLecMaq = new String[] {""} ;
      P03KZ4_A396EmprCod = new String[] {""} ;
      P03KZ4_A8942GruFasCod = new String[] {""} ;
      P03KZ4_n8942GruFasCod = new boolean[] {false} ;
      P03KZ4_A8941GruOrdLin = new short[1] ;
      P03KZ4_n8941GruOrdLin = new boolean[] {false} ;
      P03KZ4_A8944GruOpera = new int[1] ;
      P03KZ4_n8944GruOpera = new boolean[] {false} ;
      P03KZ4_A8943GruParco = new short[1] ;
      P03KZ4_n8943GruParco = new boolean[] {false} ;
      P03KZ4_A1792GruBarPar = new String[] {""} ;
      P03KZ4_A1793GruBarReo = new byte[1] ;
      P03KZ4_A1791GruBarCod = new int[1] ;
      P03KZ4_A1795GruOrd = new byte[1] ;
      A1794GruLecMaq = "" ;
      A1792GruBarPar = "" ;
      AV20Barcodpar = "" ;
      P03KZ6_A153BarFasEst = new byte[1] ;
      P03KZ6_A603MaqCodBis = new String[] {""} ;
      P03KZ6_A130BarCodPar = new String[] {""} ;
      P03KZ6_A132BarCodReo = new byte[1] ;
      P03KZ6_A129BarCod = new int[1] ;
      P03KZ6_A396EmprCod = new String[] {""} ;
      P03KZ6_A457FasCod = new String[] {""} ;
      P03KZ6_A194BarOrdLin = new short[1] ;
      P03KZ6_A758ProCod = new String[] {""} ;
      A603MaqCodBis = "" ;
      A130BarCodPar = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV22FasCod = "" ;
      P03KZ7_A1142MaqFCod = new String[] {""} ;
      P03KZ7_A602MaqCod = new String[] {""} ;
      P03KZ7_A396EmprCod = new String[] {""} ;
      A1142MaqFCod = "" ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aplecgrp2__default(),
         new Object[] {
             new Object[] {
            P03KZ2_A396EmprCod, P03KZ2_A1796LecTipEnt, P03KZ2_n1796LecTipEnt, P03KZ2_A1170LecOpeCod, P03KZ2_n1170LecOpeCod, P03KZ2_A1171LecFasCod, P03KZ2_n1171LecFasCod, P03KZ2_A1188LecFasOrd, P03KZ2_n1188LecFasOrd, P03KZ2_A1167LecBarCod,
            P03KZ2_n1167LecBarCod, P03KZ2_A1168LecBarReo, P03KZ2_n1168LecBarReo, P03KZ2_A1169LecBarPar, P03KZ2_n1169LecBarPar, P03KZ2_A1172LecParCod, P03KZ2_n1172LecParCod, P03KZ2_A1166LecMaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03KZ4_A1794GruLecMaq, P03KZ4_A396EmprCod, P03KZ4_A8942GruFasCod, P03KZ4_n8942GruFasCod, P03KZ4_A8941GruOrdLin, P03KZ4_n8941GruOrdLin, P03KZ4_A8944GruOpera, P03KZ4_n8944GruOpera, P03KZ4_A8943GruParco, P03KZ4_n8943GruParco,
            P03KZ4_A1792GruBarPar, P03KZ4_A1793GruBarReo, P03KZ4_A1791GruBarCod, P03KZ4_A1795GruOrd
            }
            , new Object[] {
            }
            , new Object[] {
            P03KZ6_A153BarFasEst, P03KZ6_A603MaqCodBis, P03KZ6_A130BarCodPar, P03KZ6_A132BarCodReo, P03KZ6_A129BarCod, P03KZ6_A396EmprCod, P03KZ6_A457FasCod, P03KZ6_A194BarOrdLin, P03KZ6_A758ProCod
            }
            , new Object[] {
            P03KZ7_A1142MaqFCod, P03KZ7_A602MaqCod, P03KZ7_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private byte AV15Lecbarreo ;
   private byte A1793GruBarReo ;
   private byte A1795GruOrd ;
   private byte AV19Barcodreo ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte AV23FlagMFas ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short AV12Lecfasord ;
   private short AV17Lecparcod ;
   private short A8943GruParco ;
   private short A8941GruOrdLin ;
   private short AV21Barordlin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A1170LecOpeCod ;
   private int A1167LecBarCod ;
   private int AV10Lecopecod ;
   private int AV14Lecbarcod ;
   private int A8944GruOpera ;
   private int A1791GruBarCod ;
   private int AV18Barcod ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A1796LecTipEnt ;
   private String A1171LecFasCod ;
   private String A1169LecBarPar ;
   private String A1166LecMaqCod ;
   private String AV13Emprcod ;
   private String AV8Lecmaqcod ;
   private String AV9LecTipEnt ;
   private String AV11Lecfascod ;
   private String AV16Lecbarpar ;
   private String A8942GruFasCod ;
   private String A1794GruLecMaq ;
   private String A1792GruBarPar ;
   private String AV20Barcodpar ;
   private String A603MaqCodBis ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV22FasCod ;
   private String A1142MaqFCod ;
   private String A602MaqCod ;
   private boolean n1796LecTipEnt ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1188LecFasOrd ;
   private boolean n1167LecBarCod ;
   private boolean n1168LecBarReo ;
   private boolean n1169LecBarPar ;
   private boolean n1172LecParCod ;
   private boolean returnInSub ;
   private boolean n8943GruParco ;
   private boolean n8944GruOpera ;
   private boolean n8941GruOrdLin ;
   private boolean n8942GruFasCod ;
   private IDataStoreProvider pr_default ;
   private String[] P03KZ2_A396EmprCod ;
   private String[] P03KZ2_A1796LecTipEnt ;
   private boolean[] P03KZ2_n1796LecTipEnt ;
   private int[] P03KZ2_A1170LecOpeCod ;
   private boolean[] P03KZ2_n1170LecOpeCod ;
   private String[] P03KZ2_A1171LecFasCod ;
   private boolean[] P03KZ2_n1171LecFasCod ;
   private short[] P03KZ2_A1188LecFasOrd ;
   private boolean[] P03KZ2_n1188LecFasOrd ;
   private int[] P03KZ2_A1167LecBarCod ;
   private boolean[] P03KZ2_n1167LecBarCod ;
   private byte[] P03KZ2_A1168LecBarReo ;
   private boolean[] P03KZ2_n1168LecBarReo ;
   private String[] P03KZ2_A1169LecBarPar ;
   private boolean[] P03KZ2_n1169LecBarPar ;
   private short[] P03KZ2_A1172LecParCod ;
   private boolean[] P03KZ2_n1172LecParCod ;
   private String[] P03KZ2_A1166LecMaqCod ;
   private String[] P03KZ4_A1794GruLecMaq ;
   private String[] P03KZ4_A396EmprCod ;
   private String[] P03KZ4_A8942GruFasCod ;
   private boolean[] P03KZ4_n8942GruFasCod ;
   private short[] P03KZ4_A8941GruOrdLin ;
   private boolean[] P03KZ4_n8941GruOrdLin ;
   private int[] P03KZ4_A8944GruOpera ;
   private boolean[] P03KZ4_n8944GruOpera ;
   private short[] P03KZ4_A8943GruParco ;
   private boolean[] P03KZ4_n8943GruParco ;
   private String[] P03KZ4_A1792GruBarPar ;
   private byte[] P03KZ4_A1793GruBarReo ;
   private int[] P03KZ4_A1791GruBarCod ;
   private byte[] P03KZ4_A1795GruOrd ;
   private byte[] P03KZ6_A153BarFasEst ;
   private String[] P03KZ6_A603MaqCodBis ;
   private String[] P03KZ6_A130BarCodPar ;
   private byte[] P03KZ6_A132BarCodReo ;
   private int[] P03KZ6_A129BarCod ;
   private String[] P03KZ6_A396EmprCod ;
   private String[] P03KZ6_A457FasCod ;
   private short[] P03KZ6_A194BarOrdLin ;
   private String[] P03KZ6_A758ProCod ;
   private String[] P03KZ7_A1142MaqFCod ;
   private String[] P03KZ7_A602MaqCod ;
   private String[] P03KZ7_A396EmprCod ;
}

final  class aplecgrp2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03KZ2", "SELECT EmprCod, LecTipEnt, LecOpeCod, LecFasCod, LecFasOrd, LecBarCod, LecBarReo, LecBarPar, LecParCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = '001' ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03KZ3", "UPDATE TXPGRULEC SET GruParco=?, GruOpera=?, GruOrdLin=?, GruFasCod=?  WHERE EmprCod = ? and GruLecMaq = ? and GruBarCod = ? and GruBarReo = ? and GruBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRULEC")
         ,new ForEachCursor("P03KZ4", "SELECT GruLecMaq, EmprCod, GruFasCod, GruOrdLin, GruOpera, GruParco, GruBarPar, GruBarReo, GruBarCod, GruOrd FROM TXPGRULEC WHERE EmprCod = ? and GruLecMaq = ? ORDER BY EmprCod, GruLecMaq, GruBarCod, GruBarReo, GruBarPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03KZ5", "UPDATE TXPGRULEC SET GruFasCod=?, GruOrdLin=?, GruOpera=?, GruParco=?  WHERE EmprCod = ? AND GruLecMaq = ? AND GruOrd = ? AND GruBarCod = ? AND GruBarReo = ? AND GruBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRULEC")
         ,new ForEachCursor("P03KZ6", "SELECT BarFasEst, MaqCodBis, BarCodPar, BarCodReo, BarCod, EmprCod, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst > 0) AND (MaqCodBis = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03KZ7", "SELECT MaqFCod, MaqCod, EmprCod FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? and MaqFCod = ? ORDER BY EmprCod, MaqCod, MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setString(6, (String)parms[9], 6);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               stmt.setString(9, (String)parms[12], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setString(6, (String)parms[9], 6);
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setInt(8, ((Number) parms[11]).intValue());
               stmt.setByte(9, ((Number) parms[12]).byteValue());
               stmt.setString(10, (String)parms[13], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

