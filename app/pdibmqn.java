package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdibmqn extends GXProcedure
{
   public pdibmqn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdibmqn.class ), "" );
   }

   public pdibmqn( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           int[] aP3 )
   {
      pdibmqn.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 )
   {
      pdibmqn.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdibmqn.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      pdibmqn.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pdibmqn.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      pdibmqn.this.AV16FlagTipMqn = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16FlagTipMqn = (byte)(0) ;
      /* Using cursor P01F32 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3911TipMqnCod = P01F32_A3911TipMqnCod[0] ;
         n3911TipMqnCod = P01F32_n3911TipMqnCod[0] ;
         if ( ( A3911TipMqnCod == 2 ) || ( A3911TipMqnCod == 3 ) )
         {
            AV16FlagTipMqn = (byte)(1) ;
         }
         if ( ( A3911TipMqnCod == 52 ) || ( A3911TipMqnCod == 53 ) )
         {
            AV16FlagTipMqn = (byte)(2) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdibmqn.this.A396EmprCod;
      this.aP1[0] = pdibmqn.this.A1013DibCli;
      this.aP2[0] = pdibmqn.this.A252CliCod;
      this.aP3[0] = pdibmqn.this.A1014DibInt;
      this.aP4[0] = pdibmqn.this.AV16FlagTipMqn;
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
      P01F32_A396EmprCod = new String[] {""} ;
      P01F32_A1013DibCli = new String[] {""} ;
      P01F32_A252CliCod = new int[1] ;
      P01F32_A1014DibInt = new int[1] ;
      P01F32_A3911TipMqnCod = new byte[1] ;
      P01F32_n3911TipMqnCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdibmqn__default(),
         new Object[] {
             new Object[] {
            P01F32_A396EmprCod, P01F32_A1013DibCli, P01F32_A252CliCod, P01F32_A1014DibInt, P01F32_A3911TipMqnCod, P01F32_n3911TipMqnCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16FlagTipMqn ;
   private byte A3911TipMqnCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private boolean n3911TipMqnCod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01F32_A396EmprCod ;
   private String[] P01F32_A1013DibCli ;
   private int[] P01F32_A252CliCod ;
   private int[] P01F32_A1014DibInt ;
   private byte[] P01F32_A3911TipMqnCod ;
   private boolean[] P01F32_n3911TipMqnCod ;
}

final  class pdibmqn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01F32", "SELECT EmprCod, DibCli, CliCod, DibInt, TipMqnCod FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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

