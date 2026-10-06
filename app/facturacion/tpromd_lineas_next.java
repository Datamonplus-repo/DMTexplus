package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_lineas_next extends GXProcedure
{
   public tpromd_lineas_next( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_lineas_next.class ), "" );
   }

   public tpromd_lineas_next( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          short aP2 )
   {
      tpromd_lineas_next.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             int[] aP3 )
   {
      tpromd_lineas_next.this.A396EmprCod = aP0;
      tpromd_lineas_next.this.A252CliCod = aP1;
      tpromd_lineas_next.this.A8391PMDCod = aP2;
      tpromd_lineas_next.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PMDColNum = 0 ;
      /* Using cursor P0AMU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8393PMDColNum = P0AMU2_A8393PMDColNum[0] ;
         AV8PMDColNum = A8393PMDColNum ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8PMDColNum = (int)(AV8PMDColNum+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = tpromd_lineas_next.this.AV8PMDColNum;
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
      P0AMU2_A396EmprCod = new String[] {""} ;
      P0AMU2_A252CliCod = new int[1] ;
      P0AMU2_A8391PMDCod = new short[1] ;
      P0AMU2_A8393PMDColNum = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_next__default(),
         new Object[] {
             new Object[] {
            P0AMU2_A396EmprCod, P0AMU2_A252CliCod, P0AMU2_A8391PMDCod, P0AMU2_A8393PMDColNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8391PMDCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV8PMDColNum ;
   private int A8393PMDColNum ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMU2_A396EmprCod ;
   private int[] P0AMU2_A252CliCod ;
   private short[] P0AMU2_A8391PMDCod ;
   private int[] P0AMU2_A8393PMDColNum ;
}

final  class tpromd_lineas_next__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMU2", "SELECT * FROM (SELECT EmprCod, CliCod, PMDCod, PMDColNum FROM TXPProMD1 WHERE EmprCod = ? and CliCod = ? and PMDCod = ? ORDER BY EmprCod, CliCod, PMDCod, PMDColNum DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

