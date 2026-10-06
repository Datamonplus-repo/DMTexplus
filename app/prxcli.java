package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prxcli extends GXProcedure
{
   public prxcli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prxcli.class ), "" );
   }

   public prxcli( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 )
   {
      prxcli.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      prxcli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prxcli.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      prxcli.this.A2308CliDesCod = aP2[0];
      this.aP2 = aP2;
      prxcli.this.AV17Flag = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20GXLvl1 = (byte)(0) ;
      /* Using cursor P02182 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A2308CliDesCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV20GXLvl1 = (byte)(1) ;
         AV17Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV20GXLvl1 == 0 )
      {
         AV17Flag = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prxcli.this.A396EmprCod;
      this.aP1[0] = prxcli.this.A252CliCod;
      this.aP2[0] = prxcli.this.A2308CliDesCod;
      this.aP3[0] = prxcli.this.AV17Flag;
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
      P02182_A396EmprCod = new String[] {""} ;
      P02182_A252CliCod = new int[1] ;
      P02182_A2308CliDesCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prxcli__default(),
         new Object[] {
             new Object[] {
            P02182_A396EmprCod, P02182_A252CliCod, P02182_A2308CliDesCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Flag ;
   private byte AV20GXLvl1 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A2308CliDesCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02182_A396EmprCod ;
   private int[] P02182_A252CliCod ;
   private int[] P02182_A2308CliDesCod ;
}

final  class prxcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02182", "SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? and CliCod = ? and CliDesCod = ? ORDER BY EmprCod, CliCod, CliDesCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

