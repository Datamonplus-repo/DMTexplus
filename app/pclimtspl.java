package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclimtspl extends GXProcedure
{
   public pclimtspl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclimtspl.class ), "" );
   }

   public pclimtspl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pclimtspl.this.aP2 = new String[] {""};
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
      pclimtspl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclimtspl.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclimtspl.this.AV8CliFacMtsP = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CliFacMtsP = httpContext.getMessage( "N", "") ;
      /* Using cursor P05UR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13236CliFacMtsP = P05UR2_A13236CliFacMtsP[0] ;
         AV8CliFacMtsP = A13236CliFacMtsP ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclimtspl.this.A396EmprCod;
      this.aP1[0] = pclimtspl.this.A252CliCod;
      this.aP2[0] = pclimtspl.this.AV8CliFacMtsP;
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
      P05UR2_A396EmprCod = new String[] {""} ;
      P05UR2_A252CliCod = new int[1] ;
      P05UR2_A13236CliFacMtsP = new String[] {""} ;
      A13236CliFacMtsP = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclimtspl__default(),
         new Object[] {
             new Object[] {
            P05UR2_A396EmprCod, P05UR2_A252CliCod, P05UR2_A13236CliFacMtsP
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV8CliFacMtsP ;
   private String scmdbuf ;
   private String A13236CliFacMtsP ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05UR2_A396EmprCod ;
   private int[] P05UR2_A252CliCod ;
   private String[] P05UR2_A13236CliFacMtsP ;
}

final  class pclimtspl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05UR2", "SELECT EmprCod, CliCod, CliFacMtsP FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

