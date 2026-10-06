package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnfaspd extends GXProcedure
{
   public pnfaspd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnfaspd.class ), "" );
   }

   public pnfaspd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pnfaspd.this.aP3 = new String[] {""};
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
      pnfaspd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnfaspd.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnfaspd.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnfaspd.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV10Suprema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int2) ;
      pnfaspd.this.GXt_int1 = GXv_int2[0] ;
      AV10Suprema = GXt_int1 ;
      AV13Cambio_p = (byte)(0) ;
      if ( AV10Suprema == 1 )
      {
         /* Using cursor P020W2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P020W2_A361DisCod[0] ;
            AV8DisCod = A361DisCod ;
            /* Using cursor P020W3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A758ProCod = P020W3_A758ProCod[0] ;
               AV11Procod = A758ProCod ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Execute user subroutine: 'DISLIN' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV11Procod, AV12Procod_d) != 0 )
         {
            AV13Cambio_p = (byte)(1) ;
            System.out.println( httpContext.getMessage( "Cambio de Proceso ¡¡¡", "") );
         }
      }
      /* Using cursor P020W4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P020W4_A361DisCod[0] ;
         A148BarEstReo = P020W4_A148BarEstReo[0] ;
         W396EmprCod = A396EmprCod ;
         AV8DisCod = A361DisCod ;
         AV9BarEstReo = A148BarEstReo ;
         if ( ( A148BarEstReo == 1 ) || ( ( AV10Suprema == 1 ) && ( AV13Cambio_p == 1 ) ) )
         {
            /* Execute user subroutine: 'DEL_FASDIS' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P020W5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A361DisCod = P020W5_A361DisCod[0] ;
               A761ProFasLin = P020W5_A761ProFasLin[0] ;
               n761ProFasLin = P020W5_n761ProFasLin[0] ;
               A12144ProStsFec = P020W5_A12144ProStsFec[0] ;
               n12144ProStsFec = P020W5_n12144ProStsFec[0] ;
               A12143ProSts = P020W5_A12143ProSts[0] ;
               n12143ProSts = P020W5_n12143ProSts[0] ;
               A758ProCod = P020W5_A758ProCod[0] ;
               A361DisCod = P020W5_A361DisCod[0] ;
               A12144ProStsFec = P020W5_A12144ProStsFec[0] ;
               n12144ProStsFec = P020W5_n12144ProStsFec[0] ;
               A12143ProSts = P020W5_A12143ProSts[0] ;
               n12143ProSts = P020W5_n12143ProSts[0] ;
               W396EmprCod = A396EmprCod ;
               /*
                  INSERT RECORD ON TABLE TXPDISLIN

               */
               W396EmprCod = A396EmprCod ;
               W361DisCod = A361DisCod ;
               W758ProCod = A758ProCod ;
               W846UltFasLin = A846UltFasLin ;
               W5334DisFasApr = A5334DisFasApr ;
               n5334DisFasApr = false ;
               A361DisCod = AV8DisCod ;
               A846UltFasLin = A761ProFasLin ;
               A5334DisFasApr = "" ;
               n5334DisFasApr = false ;
               /* Using cursor P020W6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin), Boolean.valueOf(n5334DisFasApr), A5334DisFasApr, Boolean.valueOf(n12143ProSts), Byte.valueOf(A12143ProSts), Boolean.valueOf(n12144ProStsFec), A12144ProStsFec});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
               if ( (pr_default.getStatus(4) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               A361DisCod = W361DisCod ;
               A758ProCod = W758ProCod ;
               A846UltFasLin = W846UltFasLin ;
               A5334DisFasApr = W5334DisFasApr ;
               n5334DisFasApr = false ;
               /* End Insert */
               /* Using cursor P020W7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A194BarOrdLin = P020W7_A194BarOrdLin[0] ;
                  A7744FasPreObl = P020W7_A7744FasPreObl[0] ;
                  n7744FasPreObl = P020W7_n7744FasPreObl[0] ;
                  A457FasCod = P020W7_A457FasCod[0] ;
                  A7744FasPreObl = P020W7_A7744FasPreObl[0] ;
                  n7744FasPreObl = P020W7_n7744FasPreObl[0] ;
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  /*
                     INSERT RECORD ON TABLE TXPDISFAS

                  */
                  W396EmprCod = A396EmprCod ;
                  W361DisCod = A361DisCod ;
                  W758ProCod = A758ProCod ;
                  W457FasCod = A457FasCod ;
                  A361DisCod = AV8DisCod ;
                  A368DisFasLin = A194BarOrdLin ;
                  /* Using cursor P020W8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
                  A396EmprCod = W396EmprCod ;
                  A361DisCod = W361DisCod ;
                  A758ProCod = W758ProCod ;
                  A457FasCod = W457FasCod ;
                  /* End Insert */
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
         }
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'DISLIN' Routine */
      returnInSub = false ;
      /* Using cursor P020W9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A361DisCod = P020W9_A361DisCod[0] ;
         A5334DisFasApr = P020W9_A5334DisFasApr[0] ;
         n5334DisFasApr = P020W9_n5334DisFasApr[0] ;
         A758ProCod = P020W9_A758ProCod[0] ;
         AV12Procod_d = A758ProCod ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S121( )
   {
      /* 'DEL_FASDIS' Routine */
      returnInSub = false ;
      /* Using cursor P020W10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A758ProCod = P020W10_A758ProCod[0] ;
         A361DisCod = P020W10_A361DisCod[0] ;
         A5334DisFasApr = P020W10_A5334DisFasApr[0] ;
         n5334DisFasApr = P020W10_n5334DisFasApr[0] ;
         /* Optimized DELETE. */
         /* Using cursor P020W11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
         /* End optimized DELETE. */
         /* Using cursor P020W12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnfaspd.this.A396EmprCod;
      this.aP1[0] = pnfaspd.this.A129BarCod;
      this.aP2[0] = pnfaspd.this.A132BarCodReo;
      this.aP3[0] = pnfaspd.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnfaspd");
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
      P020W2_A396EmprCod = new String[] {""} ;
      P020W2_A129BarCod = new int[1] ;
      P020W2_A132BarCodReo = new byte[1] ;
      P020W2_A130BarCodPar = new String[] {""} ;
      P020W2_A361DisCod = new int[1] ;
      P020W3_A396EmprCod = new String[] {""} ;
      P020W3_A129BarCod = new int[1] ;
      P020W3_A132BarCodReo = new byte[1] ;
      P020W3_A130BarCodPar = new String[] {""} ;
      P020W3_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV11Procod = "" ;
      AV12Procod_d = "" ;
      P020W4_A396EmprCod = new String[] {""} ;
      P020W4_A129BarCod = new int[1] ;
      P020W4_A132BarCodReo = new byte[1] ;
      P020W4_A130BarCodPar = new String[] {""} ;
      P020W4_A361DisCod = new int[1] ;
      P020W4_A148BarEstReo = new byte[1] ;
      W396EmprCod = "" ;
      P020W5_A361DisCod = new int[1] ;
      P020W5_A396EmprCod = new String[] {""} ;
      P020W5_A129BarCod = new int[1] ;
      P020W5_A132BarCodReo = new byte[1] ;
      P020W5_A130BarCodPar = new String[] {""} ;
      P020W5_A761ProFasLin = new short[1] ;
      P020W5_n761ProFasLin = new boolean[] {false} ;
      P020W5_A12144ProStsFec = new java.util.Date[] {GXutil.nullDate()} ;
      P020W5_n12144ProStsFec = new boolean[] {false} ;
      P020W5_A12143ProSts = new byte[1] ;
      P020W5_n12143ProSts = new boolean[] {false} ;
      P020W5_A758ProCod = new String[] {""} ;
      A12144ProStsFec = GXutil.resetTime( GXutil.nullDate() );
      W758ProCod = "" ;
      W5334DisFasApr = "" ;
      A5334DisFasApr = "" ;
      Gx_emsg = "" ;
      P020W7_A396EmprCod = new String[] {""} ;
      P020W7_A129BarCod = new int[1] ;
      P020W7_A132BarCodReo = new byte[1] ;
      P020W7_A130BarCodPar = new String[] {""} ;
      P020W7_A758ProCod = new String[] {""} ;
      P020W7_A194BarOrdLin = new short[1] ;
      P020W7_A7744FasPreObl = new byte[1] ;
      P020W7_n7744FasPreObl = new boolean[] {false} ;
      P020W7_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      W457FasCod = "" ;
      P020W9_A396EmprCod = new String[] {""} ;
      P020W9_A361DisCod = new int[1] ;
      P020W9_A5334DisFasApr = new String[] {""} ;
      P020W9_n5334DisFasApr = new boolean[] {false} ;
      P020W9_A758ProCod = new String[] {""} ;
      P020W10_A396EmprCod = new String[] {""} ;
      P020W10_A758ProCod = new String[] {""} ;
      P020W10_A361DisCod = new int[1] ;
      P020W10_A5334DisFasApr = new String[] {""} ;
      P020W10_n5334DisFasApr = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnfaspd__default(),
         new Object[] {
             new Object[] {
            P020W2_A396EmprCod, P020W2_A129BarCod, P020W2_A132BarCodReo, P020W2_A130BarCodPar, P020W2_A361DisCod
            }
            , new Object[] {
            P020W3_A396EmprCod, P020W3_A129BarCod, P020W3_A132BarCodReo, P020W3_A130BarCodPar, P020W3_A758ProCod
            }
            , new Object[] {
            P020W4_A396EmprCod, P020W4_A129BarCod, P020W4_A132BarCodReo, P020W4_A130BarCodPar, P020W4_A361DisCod, P020W4_A148BarEstReo
            }
            , new Object[] {
            P020W5_A361DisCod, P020W5_A396EmprCod, P020W5_A129BarCod, P020W5_A132BarCodReo, P020W5_A130BarCodPar, P020W5_A761ProFasLin, P020W5_n761ProFasLin, P020W5_A12144ProStsFec, P020W5_n12144ProStsFec, P020W5_A12143ProSts,
            P020W5_n12143ProSts, P020W5_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P020W7_A396EmprCod, P020W7_A129BarCod, P020W7_A132BarCodReo, P020W7_A130BarCodPar, P020W7_A758ProCod, P020W7_A194BarOrdLin, P020W7_A7744FasPreObl, P020W7_n7744FasPreObl, P020W7_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P020W9_A396EmprCod, P020W9_A361DisCod, P020W9_A5334DisFasApr, P020W9_n5334DisFasApr, P020W9_A758ProCod
            }
            , new Object[] {
            P020W10_A396EmprCod, P020W10_A758ProCod, P020W10_A361DisCod, P020W10_A5334DisFasApr, P020W10_n5334DisFasApr
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

   private byte A132BarCodReo ;
   private byte AV10Suprema ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV13Cambio_p ;
   private byte A148BarEstReo ;
   private byte AV9BarEstReo ;
   private byte A12143ProSts ;
   private byte A7744FasPreObl ;
   private short A761ProFasLin ;
   private short W846UltFasLin ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private short A194BarOrdLin ;
   private short A368DisFasLin ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV8DisCod ;
   private int GX_INS38 ;
   private int W361DisCod ;
   private int GX_INS39 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String AV11Procod ;
   private String AV12Procod_d ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String W5334DisFasApr ;
   private String A5334DisFasApr ;
   private String Gx_emsg ;
   private String A457FasCod ;
   private String W457FasCod ;
   private java.util.Date A12144ProStsFec ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n12144ProStsFec ;
   private boolean n12143ProSts ;
   private boolean n5334DisFasApr ;
   private boolean n7744FasPreObl ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P020W2_A396EmprCod ;
   private int[] P020W2_A129BarCod ;
   private byte[] P020W2_A132BarCodReo ;
   private String[] P020W2_A130BarCodPar ;
   private int[] P020W2_A361DisCod ;
   private String[] P020W3_A396EmprCod ;
   private int[] P020W3_A129BarCod ;
   private byte[] P020W3_A132BarCodReo ;
   private String[] P020W3_A130BarCodPar ;
   private String[] P020W3_A758ProCod ;
   private String[] P020W4_A396EmprCod ;
   private int[] P020W4_A129BarCod ;
   private byte[] P020W4_A132BarCodReo ;
   private String[] P020W4_A130BarCodPar ;
   private int[] P020W4_A361DisCod ;
   private byte[] P020W4_A148BarEstReo ;
   private int[] P020W5_A361DisCod ;
   private String[] P020W5_A396EmprCod ;
   private int[] P020W5_A129BarCod ;
   private byte[] P020W5_A132BarCodReo ;
   private String[] P020W5_A130BarCodPar ;
   private short[] P020W5_A761ProFasLin ;
   private boolean[] P020W5_n761ProFasLin ;
   private java.util.Date[] P020W5_A12144ProStsFec ;
   private boolean[] P020W5_n12144ProStsFec ;
   private byte[] P020W5_A12143ProSts ;
   private boolean[] P020W5_n12143ProSts ;
   private String[] P020W5_A758ProCod ;
   private String[] P020W7_A396EmprCod ;
   private int[] P020W7_A129BarCod ;
   private byte[] P020W7_A132BarCodReo ;
   private String[] P020W7_A130BarCodPar ;
   private String[] P020W7_A758ProCod ;
   private short[] P020W7_A194BarOrdLin ;
   private byte[] P020W7_A7744FasPreObl ;
   private boolean[] P020W7_n7744FasPreObl ;
   private String[] P020W7_A457FasCod ;
   private String[] P020W9_A396EmprCod ;
   private int[] P020W9_A361DisCod ;
   private String[] P020W9_A5334DisFasApr ;
   private boolean[] P020W9_n5334DisFasApr ;
   private String[] P020W9_A758ProCod ;
   private String[] P020W10_A396EmprCod ;
   private String[] P020W10_A758ProCod ;
   private int[] P020W10_A361DisCod ;
   private String[] P020W10_A5334DisFasApr ;
   private boolean[] P020W10_n5334DisFasApr ;
}

final  class pnfaspd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020W2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P020W3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P020W4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod, BarEstReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P020W5", "SELECT T2.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProFasLin, T3.ProStsFec, T3.ProSts, T1.ProCod FROM ((TXPBARPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISLIN T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod AND T3.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P020W6", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P020W7", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T2.FasPreObl, T1.FasCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P020W8", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasPreObl, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P020W9", "SELECT EmprCod, DisCod, DisFasApr, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P020W10", "SELECT EmprCod, ProCod, DisCod, DisFasApr FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P020W11", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? and DisCod = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new UpdateCursor("P020W12", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

