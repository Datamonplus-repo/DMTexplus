package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class parmmza extends GXProcedure
{
   public parmmza( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( parmmza.class ), "" );
   }

   public parmmza( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      parmmza.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      parmmza.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      parmmza.this.AV8DibCli = aP1[0];
      this.aP1 = aP1;
      parmmza.this.AV9CliCod = aP2[0];
      this.aP2 = aP2;
      parmmza.this.AV10DibInt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02XN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8DibCli, Integer.valueOf(AV9CliCod), Integer.valueOf(AV10DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1014DibInt = P02XN2_A1014DibInt[0] ;
         A252CliCod = P02XN2_A252CliCod[0] ;
         A1013DibCli = P02XN2_A1013DibCli[0] ;
         A1019DibMolCil = P02XN2_A1019DibMolCil[0] ;
         n1019DibMolCil = P02XN2_n1019DibMolCil[0] ;
         A1824DibUltCil = P02XN2_A1824DibUltCil[0] ;
         n1824DibUltCil = P02XN2_n1824DibUltCil[0] ;
         A1024DibUltLin = P02XN2_A1024DibUltLin[0] ;
         n1024DibUltLin = P02XN2_n1024DibUltLin[0] ;
         A1019DibMolCil = (short)(0) ;
         n1019DibMolCil = false ;
         A1824DibUltCil = (short)(0) ;
         n1824DibUltCil = false ;
         A1024DibUltLin = (short)(0) ;
         n1024DibUltLin = false ;
         /* Optimized DELETE. */
         /* Using cursor P02XN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P02XN4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUJ");
         /* End optimized DELETE. */
         /* Using cursor P02XN5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n1019DibMolCil), Short.valueOf(A1019DibMolCil), Boolean.valueOf(n1824DibUltCil), Short.valueOf(A1824DibUltCil), Boolean.valueOf(n1024DibUltLin), Short.valueOf(A1024DibUltLin), A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV11Orden = (byte)(0) ;
      /* Using cursor P02XN6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV8DibCli, Integer.valueOf(AV9CliCod), Integer.valueOf(AV10DibInt)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1013DibCli = P02XN6_A1013DibCli[0] ;
         A252CliCod = P02XN6_A252CliCod[0] ;
         A1014DibInt = P02XN6_A1014DibInt[0] ;
         A7502AMDibCli = P02XN6_A7502AMDibCli[0] ;
         A7504AMCliCod = P02XN6_A7504AMCliCod[0] ;
         A7503AMDibInt = P02XN6_A7503AMDibInt[0] ;
         A7675AMOrden = P02XN6_A7675AMOrden[0] ;
         n7675AMOrden = P02XN6_n7675AMOrden[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A7502AMDibCli ;
         GXv_int3[0] = A7504AMCliCod ;
         GXv_int4[0] = A7503AMDibInt ;
         GXv_char5[0] = AV8DibCli ;
         GXv_int6[0] = AV9CliCod ;
         GXv_int7[0] = AV10DibInt ;
         GXv_int8[0] = AV11Orden ;
         new app.pcoplin(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_int6, GXv_int7, GXv_int8) ;
         parmmza.this.A396EmprCod = GXv_char1[0] ;
         parmmza.this.A7502AMDibCli = GXv_char2[0] ;
         parmmza.this.A7504AMCliCod = GXv_int3[0] ;
         parmmza.this.A7503AMDibInt = GXv_int4[0] ;
         parmmza.this.AV8DibCli = GXv_char5[0] ;
         parmmza.this.AV9CliCod = GXv_int6[0] ;
         parmmza.this.AV10DibInt = GXv_int7[0] ;
         parmmza.this.AV11Orden = GXv_int8[0] ;
         /* Using cursor P02XN7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A1808DibOrdCil = P02XN7_A1808DibOrdCil[0] ;
            n1808DibOrdCil = P02XN7_n1808DibOrdCil[0] ;
            A1807DibLinCil = P02XN7_A1807DibLinCil[0] ;
            AV11Orden = A1808DibOrdCil ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Using cursor P02XN8 */
         pr_default.execute(6, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A1809DibOrdMol = P02XN8_A1809DibOrdMol[0] ;
            n1809DibOrdMol = P02XN8_n1809DibOrdMol[0] ;
            A1029DibLin = P02XN8_A1029DibLin[0] ;
            AV11Orden = A1809DibOrdMol ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P02XN9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV8DibCli, Integer.valueOf(AV9CliCod), Integer.valueOf(AV10DibInt)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A1014DibInt = P02XN9_A1014DibInt[0] ;
         A252CliCod = P02XN9_A252CliCod[0] ;
         A1013DibCli = P02XN9_A1013DibCli[0] ;
         A1823DibTipMaq = P02XN9_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P02XN9_n1823DibTipMaq[0] ;
         A1824DibUltCil = P02XN9_A1824DibUltCil[0] ;
         n1824DibUltCil = P02XN9_n1824DibUltCil[0] ;
         A1019DibMolCil = P02XN9_A1019DibMolCil[0] ;
         n1019DibMolCil = P02XN9_n1019DibMolCil[0] ;
         A1024DibUltLin = P02XN9_A1024DibUltLin[0] ;
         n1024DibUltLin = P02XN9_n1024DibUltLin[0] ;
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
         {
            A1019DibMolCil = A1824DibUltCil ;
            n1019DibMolCil = false ;
         }
         else
         {
            A1019DibMolCil = A1024DibUltLin ;
            n1019DibMolCil = false ;
         }
         /* Using cursor P02XN10 */
         pr_default.execute(8, new Object[] {Boolean.valueOf(n1019DibMolCil), Short.valueOf(A1019DibMolCil), A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = parmmza.this.A396EmprCod;
      this.aP1[0] = parmmza.this.AV8DibCli;
      this.aP2[0] = parmmza.this.AV9CliCod;
      this.aP3[0] = parmmza.this.AV10DibInt;
      Application.commitDataStores(context, remoteHandle, pr_default, "parmmza");
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
      P02XN2_A396EmprCod = new String[] {""} ;
      P02XN2_A1014DibInt = new int[1] ;
      P02XN2_A252CliCod = new int[1] ;
      P02XN2_A1013DibCli = new String[] {""} ;
      P02XN2_A1019DibMolCil = new short[1] ;
      P02XN2_n1019DibMolCil = new boolean[] {false} ;
      P02XN2_A1824DibUltCil = new short[1] ;
      P02XN2_n1824DibUltCil = new boolean[] {false} ;
      P02XN2_A1024DibUltLin = new short[1] ;
      P02XN2_n1024DibUltLin = new boolean[] {false} ;
      A1013DibCli = "" ;
      P02XN6_A396EmprCod = new String[] {""} ;
      P02XN6_A1013DibCli = new String[] {""} ;
      P02XN6_A252CliCod = new int[1] ;
      P02XN6_A1014DibInt = new int[1] ;
      P02XN6_A7502AMDibCli = new String[] {""} ;
      P02XN6_A7504AMCliCod = new int[1] ;
      P02XN6_A7503AMDibInt = new int[1] ;
      P02XN6_A7675AMOrden = new byte[1] ;
      P02XN6_n7675AMOrden = new boolean[] {false} ;
      A7502AMDibCli = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      P02XN7_A396EmprCod = new String[] {""} ;
      P02XN7_A1013DibCli = new String[] {""} ;
      P02XN7_A252CliCod = new int[1] ;
      P02XN7_A1014DibInt = new int[1] ;
      P02XN7_A1808DibOrdCil = new byte[1] ;
      P02XN7_n1808DibOrdCil = new boolean[] {false} ;
      P02XN7_A1807DibLinCil = new short[1] ;
      P02XN8_A396EmprCod = new String[] {""} ;
      P02XN8_A1013DibCli = new String[] {""} ;
      P02XN8_A252CliCod = new int[1] ;
      P02XN8_A1014DibInt = new int[1] ;
      P02XN8_A1809DibOrdMol = new byte[1] ;
      P02XN8_n1809DibOrdMol = new boolean[] {false} ;
      P02XN8_A1029DibLin = new short[1] ;
      P02XN9_A396EmprCod = new String[] {""} ;
      P02XN9_A1014DibInt = new int[1] ;
      P02XN9_A252CliCod = new int[1] ;
      P02XN9_A1013DibCli = new String[] {""} ;
      P02XN9_A1823DibTipMaq = new String[] {""} ;
      P02XN9_n1823DibTipMaq = new boolean[] {false} ;
      P02XN9_A1824DibUltCil = new short[1] ;
      P02XN9_n1824DibUltCil = new boolean[] {false} ;
      P02XN9_A1019DibMolCil = new short[1] ;
      P02XN9_n1019DibMolCil = new boolean[] {false} ;
      P02XN9_A1024DibUltLin = new short[1] ;
      P02XN9_n1024DibUltLin = new boolean[] {false} ;
      A1823DibTipMaq = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.parmmza__default(),
         new Object[] {
             new Object[] {
            P02XN2_A396EmprCod, P02XN2_A1014DibInt, P02XN2_A252CliCod, P02XN2_A1013DibCli, P02XN2_A1019DibMolCil, P02XN2_n1019DibMolCil, P02XN2_A1824DibUltCil, P02XN2_n1824DibUltCil, P02XN2_A1024DibUltLin, P02XN2_n1024DibUltLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02XN6_A396EmprCod, P02XN6_A1013DibCli, P02XN6_A252CliCod, P02XN6_A1014DibInt, P02XN6_A7502AMDibCli, P02XN6_A7504AMCliCod, P02XN6_A7503AMDibInt, P02XN6_A7675AMOrden, P02XN6_n7675AMOrden
            }
            , new Object[] {
            P02XN7_A396EmprCod, P02XN7_A1013DibCli, P02XN7_A252CliCod, P02XN7_A1014DibInt, P02XN7_A1808DibOrdCil, P02XN7_n1808DibOrdCil, P02XN7_A1807DibLinCil
            }
            , new Object[] {
            P02XN8_A396EmprCod, P02XN8_A1013DibCli, P02XN8_A252CliCod, P02XN8_A1014DibInt, P02XN8_A1809DibOrdMol, P02XN8_n1809DibOrdMol, P02XN8_A1029DibLin
            }
            , new Object[] {
            P02XN9_A396EmprCod, P02XN9_A1014DibInt, P02XN9_A252CliCod, P02XN9_A1013DibCli, P02XN9_A1823DibTipMaq, P02XN9_n1823DibTipMaq, P02XN9_A1824DibUltCil, P02XN9_n1824DibUltCil, P02XN9_A1019DibMolCil, P02XN9_n1019DibMolCil,
            P02XN9_A1024DibUltLin, P02XN9_n1024DibUltLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Orden ;
   private byte A7675AMOrden ;
   private byte GXv_int8[] ;
   private byte A1808DibOrdCil ;
   private byte A1809DibOrdMol ;
   private short A1019DibMolCil ;
   private short A1824DibUltCil ;
   private short A1024DibUltLin ;
   private short A1807DibLinCil ;
   private short A1029DibLin ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV10DibInt ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int A7504AMCliCod ;
   private int A7503AMDibInt ;
   private int GXv_int3[] ;
   private int GXv_int4[] ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private String A396EmprCod ;
   private String AV8DibCli ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A7502AMDibCli ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String A1823DibTipMaq ;
   private boolean n1019DibMolCil ;
   private boolean n1824DibUltCil ;
   private boolean n1024DibUltLin ;
   private boolean n7675AMOrden ;
   private boolean n1808DibOrdCil ;
   private boolean n1809DibOrdMol ;
   private boolean n1823DibTipMaq ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XN2_A396EmprCod ;
   private int[] P02XN2_A1014DibInt ;
   private int[] P02XN2_A252CliCod ;
   private String[] P02XN2_A1013DibCli ;
   private short[] P02XN2_A1019DibMolCil ;
   private boolean[] P02XN2_n1019DibMolCil ;
   private short[] P02XN2_A1824DibUltCil ;
   private boolean[] P02XN2_n1824DibUltCil ;
   private short[] P02XN2_A1024DibUltLin ;
   private boolean[] P02XN2_n1024DibUltLin ;
   private String[] P02XN6_A396EmprCod ;
   private String[] P02XN6_A1013DibCli ;
   private int[] P02XN6_A252CliCod ;
   private int[] P02XN6_A1014DibInt ;
   private String[] P02XN6_A7502AMDibCli ;
   private int[] P02XN6_A7504AMCliCod ;
   private int[] P02XN6_A7503AMDibInt ;
   private byte[] P02XN6_A7675AMOrden ;
   private boolean[] P02XN6_n7675AMOrden ;
   private String[] P02XN7_A396EmprCod ;
   private String[] P02XN7_A1013DibCli ;
   private int[] P02XN7_A252CliCod ;
   private int[] P02XN7_A1014DibInt ;
   private byte[] P02XN7_A1808DibOrdCil ;
   private boolean[] P02XN7_n1808DibOrdCil ;
   private short[] P02XN7_A1807DibLinCil ;
   private String[] P02XN8_A396EmprCod ;
   private String[] P02XN8_A1013DibCli ;
   private int[] P02XN8_A252CliCod ;
   private int[] P02XN8_A1014DibInt ;
   private byte[] P02XN8_A1809DibOrdMol ;
   private boolean[] P02XN8_n1809DibOrdMol ;
   private short[] P02XN8_A1029DibLin ;
   private String[] P02XN9_A396EmprCod ;
   private int[] P02XN9_A1014DibInt ;
   private int[] P02XN9_A252CliCod ;
   private String[] P02XN9_A1013DibCli ;
   private String[] P02XN9_A1823DibTipMaq ;
   private boolean[] P02XN9_n1823DibTipMaq ;
   private short[] P02XN9_A1824DibUltCil ;
   private boolean[] P02XN9_n1824DibUltCil ;
   private short[] P02XN9_A1019DibMolCil ;
   private boolean[] P02XN9_n1019DibMolCil ;
   private short[] P02XN9_A1024DibUltLin ;
   private boolean[] P02XN9_n1024DibUltLin ;
}

final  class parmmza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XN2", "SELECT EmprCod, DibInt, CliCod, DibCli, DibMolCil, DibUltCil, DibUltLin FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02XN3", "DELETE FROM TXPLDIBUC  WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
         ,new UpdateCursor("P02XN4", "DELETE FROM TXPLDIBUJ  WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUJ")
         ,new UpdateCursor("P02XN5", "UPDATE TXPCDIBUJ SET DibMolCil=?, DibUltCil=?, DibUltLin=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
         ,new ForEachCursor("P02XN6", "SELECT EmprCod, DibCli, CliCod, DibInt, AMDibCli, AMCliCod, AMDibInt, AMOrden FROM TXPARTMZA WHERE (EmprCod = ?) AND (DibCli = ?) AND (CliCod = ?) AND (DibInt = ?) ORDER BY AMOrden ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XN7", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, DibOrdCil, DibLinCil FROM TXPLDIBUC WHERE (EmprCod = ?) AND (DibCli = ?) AND (CliCod = ?) AND (DibInt = ?) ORDER BY DibOrdCil DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XN8", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, DibOrdMol, DibLin FROM TXPLDIBUJ WHERE (EmprCod = ?) AND (DibCli = ?) AND (CliCod = ?) AND (DibInt = ?) ORDER BY DibOrdMol DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XN9", "SELECT EmprCod, DibInt, CliCod, DibCli, DibTipMaq, DibUltCil, DibMolCil, DibUltLin FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02XN10", "UPDATE TXPCDIBUJ SET DibMolCil=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setInt(7, ((Number) parms[9]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
      }
   }

}

