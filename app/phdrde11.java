package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrde11 extends GXProcedure
{
   public phdrde11( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrde11.class ), "" );
   }

   public phdrde11( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 )
   {
      phdrde11.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      phdrde11.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrde11.this.AV16SalExtAlb = aP1[0];
      this.aP1 = aP1;
      phdrde11.this.AV22Salexnln = aP2[0];
      this.aP2 = aP2;
      phdrde11.this.AV17BarCod = aP3[0];
      this.aP3 = aP3;
      phdrde11.this.AV18BarCodReo = aP4[0];
      this.aP4 = aP4;
      phdrde11.this.AV19BarCodPar = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02JD2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2256SalExtFec = P02JD2_A2256SalExtFec[0] ;
         A2248ManCod = P02JD2_A2248ManCod[0] ;
         A2253SalExtAlb = P02JD2_A2253SalExtAlb[0] ;
         A396EmprCod = P02JD2_A396EmprCod[0] ;
         /* Using cursor P02JD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(AV22Salexnln)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6248SalExNln = P02JD3_A6248SalExNln[0] ;
            A6249SalExObs = P02JD3_A6249SalExObs[0] ;
            AV16SalExtAlb = A2253SalExtAlb ;
            AV22Salexnln = A6248SalExNln ;
            Gx_msg = httpContext.getMessage( "&SalExtAlb=", "") + GXutil.str( AV16SalExtAlb, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "&Salexnln =", "") + GXutil.str( AV22Salexnln, 4, 0) ;
            /* Execute user subroutine: 'LREXHD' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV21Lrexhd == 1 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV21Lrexhd == 1 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Using cursor P02JD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(AV22Salexnln), Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A6558FasCodn = P02JD4_A6558FasCodn[0] ;
            A252CliCod = P02JD4_A252CliCod[0] ;
            n252CliCod = P02JD4_n252CliCod[0] ;
            A130BarCodPar = P02JD4_A130BarCodPar[0] ;
            A132BarCodReo = P02JD4_A132BarCodReo[0] ;
            A129BarCod = P02JD4_A129BarCod[0] ;
            A6248SalExNln = P02JD4_A6248SalExNln[0] ;
            A252CliCod = P02JD4_A252CliCod[0] ;
            n252CliCod = P02JD4_n252CliCod[0] ;
            /* Using cursor P02JD5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A6558FasCodn});
            pr_default.close(3);
            /* Using cursor P02JD6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A6558FasCodn});
            pr_default.close(4);
            GXv_char1[0] = AV15EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_char5[0] = A457FasCod ;
            GXv_date6[0] = A2256SalExtFec ;
            GXv_int7[0] = (byte)(0) ;
            GXv_int8[0] = AV16SalExtAlb ;
            new app.trabajosexternos.phdrextn(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_date6, GXv_int7, GXv_int8) ;
            phdrde11.this.AV15EmprCod = GXv_char1[0] ;
            phdrde11.this.A129BarCod = GXv_int2[0] ;
            phdrde11.this.A132BarCodReo = GXv_int3[0] ;
            phdrde11.this.A130BarCodPar = GXv_char4[0] ;
            phdrde11.this.A457FasCod = GXv_char5[0] ;
            phdrde11.this.A2256SalExtFec = GXv_date6[0] ;
            phdrde11.this.AV16SalExtAlb = GXv_int8[0] ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int9[0] = A2248ManCod ;
            GXv_char4[0] = A457FasCod ;
            GXv_char1[0] = httpContext.getMessage( "E", "") ;
            GXv_int8[0] = A2253SalExtAlb ;
            GXv_int2[0] = A129BarCod ;
            GXv_int7[0] = A132BarCodReo ;
            GXv_char10[0] = A130BarCodPar ;
            new app.trabajosexternos.pbmvhdr(remoteHandle, context).execute( GXv_char5, GXv_int9, GXv_char4, GXv_char1, GXv_int8, GXv_int2, GXv_int7, GXv_char10) ;
            phdrde11.this.A396EmprCod = GXv_char5[0] ;
            phdrde11.this.A2248ManCod = GXv_int9[0] ;
            phdrde11.this.A457FasCod = GXv_char4[0] ;
            phdrde11.this.A2253SalExtAlb = GXv_int8[0] ;
            phdrde11.this.A129BarCod = GXv_int2[0] ;
            phdrde11.this.A132BarCodReo = GXv_int7[0] ;
            phdrde11.this.A130BarCodPar = GXv_char10[0] ;
            /* Using cursor P02JD7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         pr_default.close(3);
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV21Lrexhd == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede eliminar hay informacion en recepcion", ""));
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20Flag = (byte)(0) ;
      /* Using cursor P02JD8 */
      pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A2253SalExtAlb = P02JD8_A2253SalExtAlb[0] ;
         A396EmprCod = P02JD8_A396EmprCod[0] ;
         A2256SalExtFec = P02JD8_A2256SalExtFec[0] ;
         /* Using cursor P02JD9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A6248SalExNln = P02JD9_A6248SalExNln[0] ;
            AV20Flag = (byte)(1) ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         if ( AV20Flag == 0 )
         {
            /* Using cursor P02JD10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      cleanup();
   }

   public void S111( )
   {
      /* 'LREXHD' Routine */
      returnInSub = false ;
      AV21Lrexhd = (byte)(0) ;
      /* Using cursor P02JD11 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb), Short.valueOf(AV22Salexnln)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A396EmprCod = P02JD11_A396EmprCod[0] ;
         A2714RpExHdAlb = P02JD11_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = P02JD11_n2714RpExHdAlb[0] ;
         A6262RpExSalLn = P02JD11_A6262RpExSalLn[0] ;
         n6262RpExSalLn = P02JD11_n6262RpExSalLn[0] ;
         A2248ManCod = P02JD11_A2248ManCod[0] ;
         A2711RpExHdFe = P02JD11_A2711RpExHdFe[0] ;
         A2713RpExHdLi = P02JD11_A2713RpExHdLi[0] ;
         AV21Lrexhd = (byte)(1) ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrde11.this.AV15EmprCod;
      this.aP1[0] = phdrde11.this.AV16SalExtAlb;
      this.aP2[0] = phdrde11.this.AV22Salexnln;
      this.aP3[0] = phdrde11.this.AV17BarCod;
      this.aP4[0] = phdrde11.this.AV18BarCodReo;
      this.aP5[0] = phdrde11.this.AV19BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrde11");
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
      P02JD2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02JD2_A2248ManCod = new short[1] ;
      P02JD2_A2253SalExtAlb = new int[1] ;
      P02JD2_A396EmprCod = new String[] {""} ;
      A2256SalExtFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P02JD3_A396EmprCod = new String[] {""} ;
      P02JD3_A2253SalExtAlb = new int[1] ;
      P02JD3_A6248SalExNln = new short[1] ;
      P02JD3_A6249SalExObs = new String[] {""} ;
      A6249SalExObs = "" ;
      Gx_msg = "" ;
      P02JD4_A6558FasCodn = new String[] {""} ;
      P02JD4_A252CliCod = new int[1] ;
      P02JD4_n252CliCod = new boolean[] {false} ;
      P02JD4_A396EmprCod = new String[] {""} ;
      P02JD4_A2253SalExtAlb = new int[1] ;
      P02JD4_A130BarCodPar = new String[] {""} ;
      P02JD4_A132BarCodReo = new byte[1] ;
      P02JD4_A129BarCod = new int[1] ;
      P02JD4_A6248SalExNln = new short[1] ;
      A6558FasCodn = "" ;
      A130BarCodPar = "" ;
      P02JD5_A396EmprCod = new String[] {""} ;
      P02JD6_A396EmprCod = new String[] {""} ;
      GXv_int3 = new byte[1] ;
      A457FasCod = "" ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char5 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int2 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char10 = new String[1] ;
      P02JD8_A2253SalExtAlb = new int[1] ;
      P02JD8_A396EmprCod = new String[] {""} ;
      P02JD8_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02JD9_A396EmprCod = new String[] {""} ;
      P02JD9_A2253SalExtAlb = new int[1] ;
      P02JD9_A6248SalExNln = new short[1] ;
      P02JD11_A396EmprCod = new String[] {""} ;
      P02JD11_A2714RpExHdAlb = new int[1] ;
      P02JD11_n2714RpExHdAlb = new boolean[] {false} ;
      P02JD11_A6262RpExSalLn = new short[1] ;
      P02JD11_n6262RpExSalLn = new boolean[] {false} ;
      P02JD11_A2248ManCod = new short[1] ;
      P02JD11_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P02JD11_A2713RpExHdLi = new short[1] ;
      A2711RpExHdFe = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrde11__default(),
         new Object[] {
             new Object[] {
            P02JD2_A2256SalExtFec, P02JD2_A2248ManCod, P02JD2_A2253SalExtAlb, P02JD2_A396EmprCod
            }
            , new Object[] {
            P02JD3_A396EmprCod, P02JD3_A2253SalExtAlb, P02JD3_A6248SalExNln, P02JD3_A6249SalExObs
            }
            , new Object[] {
            P02JD4_A6558FasCodn, P02JD4_A252CliCod, P02JD4_n252CliCod, P02JD4_A396EmprCod, P02JD4_A2253SalExtAlb, P02JD4_A130BarCodPar, P02JD4_A132BarCodReo, P02JD4_A129BarCod, P02JD4_A6248SalExNln
            }
            , new Object[] {
            P02JD5_A396EmprCod
            }
            , new Object[] {
            P02JD6_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02JD8_A2253SalExtAlb, P02JD8_A396EmprCod, P02JD8_A2256SalExtFec
            }
            , new Object[] {
            P02JD9_A396EmprCod, P02JD9_A2253SalExtAlb, P02JD9_A6248SalExNln
            }
            , new Object[] {
            }
            , new Object[] {
            P02JD11_A396EmprCod, P02JD11_A2714RpExHdAlb, P02JD11_n2714RpExHdAlb, P02JD11_A6262RpExSalLn, P02JD11_n6262RpExSalLn, P02JD11_A2248ManCod, P02JD11_A2711RpExHdFe, P02JD11_A2713RpExHdLi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18BarCodReo ;
   private byte AV21Lrexhd ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private byte GXv_int7[] ;
   private byte AV20Flag ;
   private short AV22Salexnln ;
   private short A2248ManCod ;
   private short A6248SalExNln ;
   private short GXv_int9[] ;
   private short A6262RpExSalLn ;
   private short A2713RpExHdLi ;
   private short Gx_err ;
   private int AV16SalExtAlb ;
   private int AV17BarCod ;
   private int A2253SalExtAlb ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int GXv_int8[] ;
   private int GXv_int2[] ;
   private int A2714RpExHdAlb ;
   private String AV15EmprCod ;
   private String AV19BarCodPar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A6249SalExObs ;
   private String Gx_msg ;
   private String A6558FasCodn ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char10[] ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date A2711RpExHdFe ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n2714RpExHdAlb ;
   private boolean n6262RpExSalLn ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P02JD2_A2256SalExtFec ;
   private short[] P02JD2_A2248ManCod ;
   private int[] P02JD2_A2253SalExtAlb ;
   private String[] P02JD2_A396EmprCod ;
   private String[] P02JD3_A396EmprCod ;
   private int[] P02JD3_A2253SalExtAlb ;
   private short[] P02JD3_A6248SalExNln ;
   private String[] P02JD3_A6249SalExObs ;
   private String[] P02JD4_A6558FasCodn ;
   private int[] P02JD4_A252CliCod ;
   private boolean[] P02JD4_n252CliCod ;
   private String[] P02JD4_A396EmprCod ;
   private int[] P02JD4_A2253SalExtAlb ;
   private String[] P02JD4_A130BarCodPar ;
   private byte[] P02JD4_A132BarCodReo ;
   private int[] P02JD4_A129BarCod ;
   private short[] P02JD4_A6248SalExNln ;
   private String[] P02JD5_A396EmprCod ;
   private String[] P02JD6_A396EmprCod ;
   private int[] P02JD8_A2253SalExtAlb ;
   private String[] P02JD8_A396EmprCod ;
   private java.util.Date[] P02JD8_A2256SalExtFec ;
   private String[] P02JD9_A396EmprCod ;
   private int[] P02JD9_A2253SalExtAlb ;
   private short[] P02JD9_A6248SalExNln ;
   private String[] P02JD11_A396EmprCod ;
   private int[] P02JD11_A2714RpExHdAlb ;
   private boolean[] P02JD11_n2714RpExHdAlb ;
   private short[] P02JD11_A6262RpExSalLn ;
   private boolean[] P02JD11_n6262RpExSalLn ;
   private short[] P02JD11_A2248ManCod ;
   private java.util.Date[] P02JD11_A2711RpExHdFe ;
   private short[] P02JD11_A2713RpExHdLi ;
}

final  class phdrde11__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02JD2", "SELECT SalExtFec, ManCod, SalExtAlb, EmprCod FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02JD3", "SELECT EmprCod, SalExtAlb, SalExNln, SalExObs FROM TXPEXHDPZ WHERE EmprCod = ? and SalExtAlb = ? and SalExNln = ? ORDER BY EmprCod, SalExtAlb, SalExNln ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02JD4", "SELECT T1.FasCodn, T2.CliCod, T1.EmprCod, T1.SalExtAlb, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.SalExtAlb = ? and T1.SalExNln = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.SalExtAlb, T1.SalExNln ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02JD5", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02JD6", "SELECT EmprCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02JD7", "DELETE FROM TXPEXHDPZ  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
         ,new ForEachCursor("P02JD8", "SELECT SalExtAlb, EmprCod, SalExtFec FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02JD9", "SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02JD10", "DELETE FROM TXPCEXTSA  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
         ,new ForEachCursor("P02JD11", "SELECT EmprCod, RpExHdAlb, RpExSalLn, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? and RpExHdAlb = ? and RpExSalLn = ? ORDER BY EmprCod, RpExHdAlb, RpExSalLn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((short[]) buf[7])[0] = rslt.getShort(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

