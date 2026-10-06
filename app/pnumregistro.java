package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumregistro extends GXProcedure
{
   public pnumregistro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumregistro.class ), "" );
   }

   public pnumregistro( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pnumregistro.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pnumregistro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumregistro.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pnumregistro.this.AV8RARID = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P062U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11761CliUltNPz = P062U2_A11761CliUltNPz[0] ;
         AV8RARID = (int)(A11761CliUltNPz+1) ;
         A11761CliUltNPz = (int)(A11761CliUltNPz+1) ;
         /* Using cursor P062U3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A11761CliUltNPz), A396EmprCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumregistro.this.A396EmprCod;
      this.aP1[0] = pnumregistro.this.A252CliCod;
      this.aP2[0] = pnumregistro.this.AV8RARID;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumregistro");
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
      P062U2_A396EmprCod = new String[] {""} ;
      P062U2_A252CliCod = new int[1] ;
      P062U2_A11761CliUltNPz = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumregistro__default(),
         new Object[] {
             new Object[] {
            P062U2_A396EmprCod, P062U2_A252CliCod, P062U2_A11761CliUltNPz
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int AV8RARID ;
   private int A11761CliUltNPz ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P062U2_A396EmprCod ;
   private int[] P062U2_A252CliCod ;
   private int[] P062U2_A11761CliUltNPz ;
}

final  class pnumregistro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P062U2", "SELECT EmprCod, CliCod, CliUltNPz FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P062U3", "UPDATE TXPCLIENT SET CliUltNPz=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
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
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

