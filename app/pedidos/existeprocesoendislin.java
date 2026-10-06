package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existeprocesoendislin extends GXProcedure
{
   public existeprocesoendislin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existeprocesoendislin.class ), "" );
   }

   public existeprocesoendislin( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 )
   {
      existeprocesoendislin.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte[] aP3 )
   {
      existeprocesoendislin.this.A396EmprCod = aP0;
      existeprocesoendislin.this.A361DisCod = aP1;
      existeprocesoendislin.this.A758ProCod = aP2;
      existeprocesoendislin.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8flag = (byte)(0) ;
      /* Using cursor P0AGB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A846UltFasLin = P0AGB2_A846UltFasLin[0] ;
         AV8flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = existeprocesoendislin.this.AV8flag;
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
      P0AGB2_A396EmprCod = new String[] {""} ;
      P0AGB2_A361DisCod = new int[1] ;
      P0AGB2_A758ProCod = new String[] {""} ;
      P0AGB2_A846UltFasLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.existeprocesoendislin__default(),
         new Object[] {
             new Object[] {
            P0AGB2_A396EmprCod, P0AGB2_A361DisCod, P0AGB2_A758ProCod, P0AGB2_A846UltFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8flag ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGB2_A396EmprCod ;
   private int[] P0AGB2_A361DisCod ;
   private String[] P0AGB2_A758ProCod ;
   private short[] P0AGB2_A846UltFasLin ;
}

final  class existeprocesoendislin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGB2", "SELECT EmprCod, DisCod, ProCod, UltFasLin FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

