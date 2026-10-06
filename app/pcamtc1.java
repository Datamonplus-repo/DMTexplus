package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcamtc1 extends GXProcedure
{
   public pcamtc1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcamtc1.class ), "" );
   }

   public pcamtc1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pcamtc1.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pcamtc1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcamtc1.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00CH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1157TipConCod = P00CH2_A1157TipConCod[0] ;
         n1157TipConCod = P00CH2_n1157TipConCod[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcamtc1.this.A396EmprCod;
      this.aP1[0] = pcamtc1.this.A361DisCod;
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
      P00CH2_A396EmprCod = new String[] {""} ;
      P00CH2_A361DisCod = new int[1] ;
      P00CH2_A1157TipConCod = new short[1] ;
      P00CH2_n1157TipConCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcamtc1__default(),
         new Object[] {
             new Object[] {
            P00CH2_A396EmprCod, P00CH2_A361DisCod, P00CH2_A1157TipConCod, P00CH2_n1157TipConCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1157TipConCod ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n1157TipConCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CH2_A396EmprCod ;
   private int[] P00CH2_A361DisCod ;
   private short[] P00CH2_A1157TipConCod ;
   private boolean[] P00CH2_n1157TipConCod ;
}

final  class pcamtc1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CH2", "SELECT EmprCod, DisCod, TipConCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

