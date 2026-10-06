package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbufeor extends GXProcedure
{
   public pbufeor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbufeor.class ), "" );
   }

   public pbufeor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      pbufeor.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      pbufeor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbufeor.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbufeor.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      pbufeor.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      pbufeor.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      pbufeor.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      pbufeor.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      pbufeor.this.AV15Flag = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P00Y92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2079ColMolCil = P00Y92_A2079ColMolCil[0] ;
         n2079ColMolCil = P00Y92_n2079ColMolCil[0] ;
         AV15Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbufeor.this.A396EmprCod;
      this.aP1[0] = pbufeor.this.A252CliCod;
      this.aP2[0] = pbufeor.this.A2141SerEst;
      this.aP3[0] = pbufeor.this.A1013DibCli;
      this.aP4[0] = pbufeor.this.A1014DibInt;
      this.aP5[0] = pbufeor.this.A2074ColCom;
      this.aP6[0] = pbufeor.this.A2078ColFon;
      this.aP7[0] = pbufeor.this.AV15Flag;
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
      P00Y92_A396EmprCod = new String[] {""} ;
      P00Y92_A252CliCod = new int[1] ;
      P00Y92_A2141SerEst = new String[] {""} ;
      P00Y92_A1013DibCli = new String[] {""} ;
      P00Y92_A1014DibInt = new int[1] ;
      P00Y92_A2074ColCom = new String[] {""} ;
      P00Y92_A2078ColFon = new String[] {""} ;
      P00Y92_A2079ColMolCil = new short[1] ;
      P00Y92_n2079ColMolCil = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbufeor__default(),
         new Object[] {
             new Object[] {
            P00Y92_A396EmprCod, P00Y92_A252CliCod, P00Y92_A2141SerEst, P00Y92_A1013DibCli, P00Y92_A1014DibInt, P00Y92_A2074ColCom, P00Y92_A2078ColFon, P00Y92_A2079ColMolCil, P00Y92_n2079ColMolCil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short A2079ColMolCil ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String scmdbuf ;
   private boolean n2079ColMolCil ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Y92_A396EmprCod ;
   private int[] P00Y92_A252CliCod ;
   private String[] P00Y92_A2141SerEst ;
   private String[] P00Y92_A1013DibCli ;
   private int[] P00Y92_A1014DibInt ;
   private String[] P00Y92_A2074ColCom ;
   private String[] P00Y92_A2078ColFon ;
   private short[] P00Y92_A2079ColMolCil ;
   private boolean[] P00Y92_n2079ColMolCil ;
}

final  class pbufeor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Y92", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ColMolCil FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
      }
   }

}

