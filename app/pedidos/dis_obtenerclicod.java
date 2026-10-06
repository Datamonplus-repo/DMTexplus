package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dis_obtenerclicod extends GXProcedure
{
   public dis_obtenerclicod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis_obtenerclicod.class ), "" );
   }

   public dis_obtenerclicod( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 )
   {
      dis_obtenerclicod.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int[] aP2 )
   {
      dis_obtenerclicod.this.AV8EmprCod = aP0;
      dis_obtenerclicod.this.AV9DisCod = aP1;
      dis_obtenerclicod.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A3N2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P0A3N2_A361DisCod[0] ;
         A396EmprCod = P0A3N2_A396EmprCod[0] ;
         A252CliCod = P0A3N2_A252CliCod[0] ;
         AV10CliCod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dis_obtenerclicod.this.AV10CliCod;
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
      P0A3N2_A361DisCod = new int[1] ;
      P0A3N2_A396EmprCod = new String[] {""} ;
      P0A3N2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis_obtenerclicod__default(),
         new Object[] {
             new Object[] {
            P0A3N2_A361DisCod, P0A3N2_A396EmprCod, P0A3N2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9DisCod ;
   private int AV10CliCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P0A3N2_A361DisCod ;
   private String[] P0A3N2_A396EmprCod ;
   private int[] P0A3N2_A252CliCod ;
}

final  class dis_obtenerclicod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3N2", "SELECT DisCod, EmprCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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

