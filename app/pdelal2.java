package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelal2 extends GXProcedure
{
   public pdelal2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelal2.class ), "" );
   }

   public pdelal2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 )
   {
      pdelal2.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             byte[] aP2 )
   {
      pdelal2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelal2.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pdelal2.this.AV15Tipo = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00942 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A39AlbProPri = P00942_A39AlbProPri[0] ;
         /* Using cursor P00943 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1265BarAlbPie = P00943_A1265BarAlbPie[0] ;
            A129BarCod = P00943_A129BarCod[0] ;
            A132BarCodReo = P00943_A132BarCodReo[0] ;
            A130BarCodPar = P00943_A130BarCodPar[0] ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A30AlbProCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int4[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            new app.peliho3(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5) ;
            pdelal2.this.A396EmprCod = GXv_char1[0] ;
            pdelal2.this.A30AlbProCod = GXv_int2[0] ;
            pdelal2.this.A129BarCod = GXv_int3[0] ;
            pdelal2.this.A132BarCodReo = GXv_int4[0] ;
            pdelal2.this.A130BarCodPar = GXv_char5[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Optimized DELETE. */
         /* Using cursor P00944 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00945 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00946 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00947 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
         /* End optimized DELETE. */
         /* Using cursor P00948 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelal2.this.A396EmprCod;
      this.aP1[0] = pdelal2.this.A30AlbProCod;
      this.aP2[0] = pdelal2.this.AV15Tipo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelal2");
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
      P00942_A396EmprCod = new String[] {""} ;
      P00942_A30AlbProCod = new long[1] ;
      P00942_A39AlbProPri = new String[] {""} ;
      A39AlbProPri = "" ;
      P00943_A396EmprCod = new String[] {""} ;
      P00943_A30AlbProCod = new long[1] ;
      P00943_A1265BarAlbPie = new int[1] ;
      P00943_A129BarCod = new int[1] ;
      P00943_A132BarCodReo = new byte[1] ;
      P00943_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelal2__default(),
         new Object[] {
             new Object[] {
            P00942_A396EmprCod, P00942_A30AlbProCod, P00942_A39AlbProPri
            }
            , new Object[] {
            P00943_A396EmprCod, P00943_A30AlbProCod, P00943_A1265BarAlbPie, P00943_A129BarCod, P00943_A132BarCodReo, P00943_A130BarCodPar
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

   private byte AV15Tipo ;
   private byte A132BarCodReo ;
   private byte GXv_int4[] ;
   private short Gx_err ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int GXv_int3[] ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00942_A396EmprCod ;
   private long[] P00942_A30AlbProCod ;
   private String[] P00942_A39AlbProPri ;
   private String[] P00943_A396EmprCod ;
   private long[] P00943_A30AlbProCod ;
   private int[] P00943_A1265BarAlbPie ;
   private int[] P00943_A129BarCod ;
   private byte[] P00943_A132BarCodReo ;
   private String[] P00943_A130BarCodPar ;
}

final  class pdelal2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00942", "SELECT EmprCod, AlbProCod, AlbProPri FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00943", "SELECT EmprCod, AlbProCod, BarAlbPie, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00944", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P00945", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new UpdateCursor("P00946", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P00947", "DELETE FROM TXPALBPRD  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
         ,new UpdateCursor("P00948", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

