package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class haydatosexhdpz extends GXProcedure
{
   public haydatosexhdpz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( haydatosexhdpz.class ), "" );
   }

   public haydatosexhdpz( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      haydatosexhdpz.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short[] aP2 )
   {
      haydatosexhdpz.this.A396EmprCod = aP0;
      haydatosexhdpz.this.A2253SalExtAlb = aP1;
      haydatosexhdpz.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9DatosEXHDPZ = (short)(0) ;
      /* Using cursor P0ALJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6248SalExNln = P0ALJ2_A6248SalExNln[0] ;
         AV9DatosEXHDPZ = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = haydatosexhdpz.this.AV9DatosEXHDPZ;
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
      P0ALJ2_A396EmprCod = new String[] {""} ;
      P0ALJ2_A2253SalExtAlb = new int[1] ;
      P0ALJ2_A6248SalExNln = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.haydatosexhdpz__default(),
         new Object[] {
             new Object[] {
            P0ALJ2_A396EmprCod, P0ALJ2_A2253SalExtAlb, P0ALJ2_A6248SalExNln
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9DatosEXHDPZ ;
   private short A6248SalExNln ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALJ2_A396EmprCod ;
   private int[] P0ALJ2_A2253SalExtAlb ;
   private short[] P0ALJ2_A6248SalExNln ;
}

final  class haydatosexhdpz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALJ2", "SELECT * FROM (SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

