package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexicli extends GXProcedure
{
   public pexicli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexicli.class ), "" );
   }

   public pexicli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pexicli.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pexicli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexicli.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pexicli.this.AV15FlagCli = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagCli = (byte)(0) ;
      /* Using cursor P00DO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A279CliNom = P00DO2_A279CliNom[0] ;
         AV15FlagCli = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexicli.this.A396EmprCod;
      this.aP1[0] = pexicli.this.A252CliCod;
      this.aP2[0] = pexicli.this.AV15FlagCli;
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
      P00DO2_A396EmprCod = new String[] {""} ;
      P00DO2_A252CliCod = new int[1] ;
      P00DO2_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexicli__default(),
         new Object[] {
             new Object[] {
            P00DO2_A396EmprCod, P00DO2_A252CliCod, P00DO2_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagCli ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A279CliNom ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DO2_A396EmprCod ;
   private int[] P00DO2_A252CliCod ;
   private String[] P00DO2_A279CliNom ;
}

final  class pexicli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DO2", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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

