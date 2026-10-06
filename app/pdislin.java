package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdislin extends GXProcedure
{
   public pdislin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdislin.class ), "" );
   }

   public pdislin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pdislin.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pdislin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdislin.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdislin.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      pdislin.this.AV8Tdislin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Tdislin = (byte)(0) ;
      /* Using cursor P04AJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A368DisFasLin = P04AJ2_A368DisFasLin[0] ;
         AV8Tdislin = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdislin.this.A396EmprCod;
      this.aP1[0] = pdislin.this.A361DisCod;
      this.aP2[0] = pdislin.this.A758ProCod;
      this.aP3[0] = pdislin.this.AV8Tdislin;
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
      P04AJ2_A396EmprCod = new String[] {""} ;
      P04AJ2_A361DisCod = new int[1] ;
      P04AJ2_A758ProCod = new String[] {""} ;
      P04AJ2_A368DisFasLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdislin__default(),
         new Object[] {
             new Object[] {
            P04AJ2_A396EmprCod, P04AJ2_A361DisCod, P04AJ2_A758ProCod, P04AJ2_A368DisFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Tdislin ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04AJ2_A396EmprCod ;
   private int[] P04AJ2_A361DisCod ;
   private String[] P04AJ2_A758ProCod ;
   private short[] P04AJ2_A368DisFasLin ;
}

final  class pdislin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04AJ2", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

