package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg18 extends GXProcedure
{
   public ppddg18( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg18.class ), "" );
   }

   public ppddg18( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      ppddg18.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      ppddg18.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg18.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      ppddg18.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      ppddg18.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      ppddg18.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      AV5GXLvl3 = (byte)(0) ;
      /* Using cursor P05PJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV5GXLvl3 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV5GXLvl3 == 0 )
      {
         Gx_msg = httpContext.getMessage( "NO existe Dibujo ", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg18.this.A396EmprCod;
      this.aP1[0] = ppddg18.this.A1013DibCli;
      this.aP2[0] = ppddg18.this.A252CliCod;
      this.aP3[0] = ppddg18.this.A1014DibInt;
      this.aP4[0] = ppddg18.this.Gx_msg;
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
      P05PJ2_A396EmprCod = new String[] {""} ;
      P05PJ2_A1013DibCli = new String[] {""} ;
      P05PJ2_A252CliCod = new int[1] ;
      P05PJ2_A1014DibInt = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg18__default(),
         new Object[] {
             new Object[] {
            P05PJ2_A396EmprCod, P05PJ2_A1013DibCli, P05PJ2_A252CliCod, P05PJ2_A1014DibInt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV5GXLvl3 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05PJ2_A396EmprCod ;
   private String[] P05PJ2_A1013DibCli ;
   private int[] P05PJ2_A252CliCod ;
   private int[] P05PJ2_A1014DibInt ;
}

final  class ppddg18__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PJ2", "SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

