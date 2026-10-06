package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_clintenvlinea extends GXProcedure
{
   public pget_clintenvlinea( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_clintenvlinea.class ), "" );
   }

   public pget_clintenvlinea( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 )
   {
      pget_clintenvlinea.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte[] aP2 )
   {
      pget_clintenvlinea.this.AV8InEmprCod = aP0;
      pget_clintenvlinea.this.AV9InCliCod = aP1;
      pget_clintenvlinea.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09M32 */
      pr_default.execute(0, new Object[] {AV8InEmprCod, Integer.valueOf(AV9InCliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09M32_A252CliCod[0] ;
         A396EmprCod = P09M32_A396EmprCod[0] ;
         A266CliEnvLin = P09M32_A266CliEnvLin[0] ;
         AV10CliEnvLin = A266CliEnvLin ;
         AV10CliEnvLin = (byte)(AV10CliEnvLin+1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pget_clintenvlinea.this.AV10CliEnvLin;
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
      P09M32_A252CliCod = new int[1] ;
      P09M32_A396EmprCod = new String[] {""} ;
      P09M32_A266CliEnvLin = new byte[1] ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pget_clintenvlinea__default(),
         new Object[] {
             new Object[] {
            P09M32_A252CliCod, P09M32_A396EmprCod, P09M32_A266CliEnvLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10CliEnvLin ;
   private byte A266CliEnvLin ;
   private short Gx_err ;
   private int AV9InCliCod ;
   private int A252CliCod ;
   private String AV8InEmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P09M32_A252CliCod ;
   private String[] P09M32_A396EmprCod ;
   private byte[] P09M32_A266CliEnvLin ;
}

final  class pget_clintenvlinea__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09M32", "SELECT * FROM (SELECT CliCod, EmprCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod DESC, CliCod DESC, CliEnvLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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

