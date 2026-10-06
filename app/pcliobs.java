package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcliobs extends GXProcedure
{
   public pcliobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcliobs.class ), "" );
   }

   public pcliobs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pcliobs.this.aP2 = new String[] {""};
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
      pcliobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcliobs.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcliobs.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      /* Using cursor P04552 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3629CliObs = P04552_A3629CliObs[0] ;
         if ( GXutil.strcmp(A3629CliObs, "") != 0 )
         {
            Gx_msg = httpContext.getMessage( "Atenção. Este cliente tem Observações", "") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcliobs.this.A396EmprCod;
      this.aP1[0] = pcliobs.this.A252CliCod;
      this.aP2[0] = pcliobs.this.Gx_msg;
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
      P04552_A396EmprCod = new String[] {""} ;
      P04552_A252CliCod = new int[1] ;
      P04552_A3629CliObs = new String[] {""} ;
      A3629CliObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcliobs__default(),
         new Object[] {
             new Object[] {
            P04552_A396EmprCod, P04552_A252CliCod, P04552_A3629CliObs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A3629CliObs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04552_A396EmprCod ;
   private int[] P04552_A252CliCod ;
   private String[] P04552_A3629CliObs ;
}

final  class pcliobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04552", "SELECT EmprCod, CliCod, CliObs FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
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

