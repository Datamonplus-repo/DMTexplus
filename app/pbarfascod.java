package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarfascod extends GXProcedure
{
   public pbarfascod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarfascod.class ), "" );
   }

   public pbarfascod( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pbarfascod.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pbarfascod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarfascod.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbarfascod.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbarfascod.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbarfascod.this.AV8BarFasCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01CO4 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A151BarFasCod = P01CO4_A151BarFasCod[0] ;
         n151BarFasCod = P01CO4_n151BarFasCod[0] ;
         A151BarFasCod = P01CO4_A151BarFasCod[0] ;
         n151BarFasCod = P01CO4_n151BarFasCod[0] ;
         AV8BarFasCod = A151BarFasCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarfascod.this.A396EmprCod;
      this.aP1[0] = pbarfascod.this.A129BarCod;
      this.aP2[0] = pbarfascod.this.A132BarCodReo;
      this.aP3[0] = pbarfascod.this.A130BarCodPar;
      this.aP4[0] = pbarfascod.this.AV8BarFasCod;
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
      P01CO4_A396EmprCod = new String[] {""} ;
      P01CO4_A129BarCod = new int[1] ;
      P01CO4_A132BarCodReo = new byte[1] ;
      P01CO4_A130BarCodPar = new String[] {""} ;
      P01CO4_A151BarFasCod = new String[] {""} ;
      P01CO4_n151BarFasCod = new boolean[] {false} ;
      A151BarFasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarfascod__default(),
         new Object[] {
             new Object[] {
            P01CO4_A396EmprCod, P01CO4_A129BarCod, P01CO4_A132BarCodReo, P01CO4_A130BarCodPar, P01CO4_A151BarFasCod, P01CO4_n151BarFasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarFasCod ;
   private String scmdbuf ;
   private String A151BarFasCod ;
   private boolean n151BarFasCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01CO4_A396EmprCod ;
   private int[] P01CO4_A129BarCod ;
   private byte[] P01CO4_A132BarCodReo ;
   private String[] P01CO4_A130BarCodPar ;
   private String[] P01CO4_A151BarFasCod ;
   private boolean[] P01CO4_n151BarFasCod ;
}

final  class pbarfascod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01CO4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarFasCod, ' ') AS BarFasCod FROM (TXPBARCAD T1 LEFT JOIN (SELECT MIN(T3.FasCod) AS BarFasCod, T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar FROM (TXPBARFAS T3 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) WHERE (T3.BarOrdLin = T4.GXC1) AND (T3.BarFasEst <> 0) GROUP BY T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
      }
   }

}

