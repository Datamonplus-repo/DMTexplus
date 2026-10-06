package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plinalb extends GXProcedure
{
   public plinalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plinalb.class ), "" );
   }

   public plinalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 )
   {
      plinalb.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             short[] aP2 )
   {
      plinalb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plinalb.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      plinalb.this.AV8AlbContLin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8AlbContLin = (short)(0) ;
      /* Using cursor P01WX3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5617AlbContLin = P01WX3_A5617AlbContLin[0] ;
         n5617AlbContLin = P01WX3_n5617AlbContLin[0] ;
         A5617AlbContLin = P01WX3_A5617AlbContLin[0] ;
         n5617AlbContLin = P01WX3_n5617AlbContLin[0] ;
         AV8AlbContLin = A5617AlbContLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plinalb.this.A396EmprCod;
      this.aP1[0] = plinalb.this.A30AlbProCod;
      this.aP2[0] = plinalb.this.AV8AlbContLin;
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
      P01WX3_A396EmprCod = new String[] {""} ;
      P01WX3_A30AlbProCod = new long[1] ;
      P01WX3_A5617AlbContLin = new short[1] ;
      P01WX3_n5617AlbContLin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plinalb__default(),
         new Object[] {
             new Object[] {
            P01WX3_A396EmprCod, P01WX3_A30AlbProCod, P01WX3_A5617AlbContLin, P01WX3_n5617AlbContLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8AlbContLin ;
   private short A5617AlbContLin ;
   private short Gx_err ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n5617AlbContLin ;
   private short[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01WX3_A396EmprCod ;
   private long[] P01WX3_A30AlbProCod ;
   private short[] P01WX3_A5617AlbContLin ;
   private boolean[] P01WX3_n5617AlbContLin ;
}

final  class plinalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01WX3", "SELECT T1.EmprCod, T1.AlbProCod, COALESCE( T2.AlbContLin, 0) AS AlbContLin FROM (TXPCALPRD T1 LEFT JOIN (SELECT COUNT(*) AS AlbContLin, EmprCod, AlbProCod FROM TXPALBBAR GROUP BY EmprCod, AlbProCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
      }
   }

}

