package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexipdo extends GXProcedure
{
   public pexipdo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexipdo.class ), "" );
   }

   public pexipdo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 )
   {
      pexipdo.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pexipdo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexipdo.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pexipdo.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pexipdo.this.AV15FlagPdo = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagPdo = (byte)(0) ;
      /* Using cursor P00DT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2245PartEstM = P00DT2_A2245PartEstM[0] ;
         n2245PartEstM = P00DT2_n2245PartEstM[0] ;
         AV15FlagPdo = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexipdo.this.A396EmprCod;
      this.aP1[0] = pexipdo.this.A966PartCod;
      this.aP2[0] = pexipdo.this.A252CliCod;
      this.aP3[0] = pexipdo.this.AV15FlagPdo;
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
      P00DT2_A396EmprCod = new String[] {""} ;
      P00DT2_A966PartCod = new String[] {""} ;
      P00DT2_A252CliCod = new int[1] ;
      P00DT2_A2245PartEstM = new String[] {""} ;
      P00DT2_n2245PartEstM = new boolean[] {false} ;
      A2245PartEstM = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexipdo__default(),
         new Object[] {
             new Object[] {
            P00DT2_A396EmprCod, P00DT2_A966PartCod, P00DT2_A252CliCod, P00DT2_A2245PartEstM, P00DT2_n2245PartEstM
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagPdo ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private String A2245PartEstM ;
   private boolean n2245PartEstM ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DT2_A396EmprCod ;
   private String[] P00DT2_A966PartCod ;
   private int[] P00DT2_A252CliCod ;
   private String[] P00DT2_A2245PartEstM ;
   private boolean[] P00DT2_n2245PartEstM ;
}

final  class pexipdo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DT2", "SELECT EmprCod, PartCod, CliCod, PartEstM FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
      }
   }

}

