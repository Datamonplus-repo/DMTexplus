package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclitipo extends GXProcedure
{
   public pclitipo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclitipo.class ), "" );
   }

   public pclitipo( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pclitipo.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pclitipo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclitipo.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclitipo.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09Q92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5648CliTipo = P09Q92_A5648CliTipo[0] ;
         AV8CliTipo = A5648CliTipo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclitipo.this.A396EmprCod;
      this.aP1[0] = pclitipo.this.A252CliCod;
      this.aP2[0] = pclitipo.this.AV8CliTipo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8CliTipo = "" ;
      scmdbuf = "" ;
      P09Q92_A396EmprCod = new String[] {""} ;
      P09Q92_A252CliCod = new int[1] ;
      P09Q92_A5648CliTipo = new String[] {""} ;
      A5648CliTipo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclitipo__default(),
         new Object[] {
             new Object[] {
            P09Q92_A396EmprCod, P09Q92_A252CliCod, P09Q92_A5648CliTipo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV8CliTipo ;
   private String scmdbuf ;
   private String A5648CliTipo ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P09Q92_A396EmprCod ;
   private int[] P09Q92_A252CliCod ;
   private String[] P09Q92_A5648CliTipo ;
}

final  class pclitipo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09Q92", "SELECT EmprCod, CliCod, CliTipo FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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

