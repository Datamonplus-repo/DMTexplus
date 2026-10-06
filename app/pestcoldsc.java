package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestcoldsc extends GXProcedure
{
   public pestcoldsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestcoldsc.class ), "" );
   }

   public pestcoldsc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 )
   {
      pestcoldsc.this.aP4 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             long[] aP4 )
   {
      pestcoldsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestcoldsc.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pestcoldsc.this.A4415EstCol = aP2[0];
      this.aP2 = aP2;
      pestcoldsc.this.AV8EstColDsc = aP3[0];
      this.aP3 = aP3;
      pestcoldsc.this.AV9EstColRGB = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02Q22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6848EstColDsc = P02Q22_A6848EstColDsc[0] ;
         n6848EstColDsc = P02Q22_n6848EstColDsc[0] ;
         A12712EstColRGB = P02Q22_A12712EstColRGB[0] ;
         n12712EstColRGB = P02Q22_n12712EstColRGB[0] ;
         AV8EstColDsc = A6848EstColDsc ;
         AV9EstColRGB = A12712EstColRGB ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestcoldsc.this.A396EmprCod;
      this.aP1[0] = pestcoldsc.this.A252CliCod;
      this.aP2[0] = pestcoldsc.this.A4415EstCol;
      this.aP3[0] = pestcoldsc.this.AV8EstColDsc;
      this.aP4[0] = pestcoldsc.this.AV9EstColRGB;
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
      P02Q22_A396EmprCod = new String[] {""} ;
      P02Q22_A252CliCod = new int[1] ;
      P02Q22_A4415EstCol = new String[] {""} ;
      P02Q22_A6848EstColDsc = new String[] {""} ;
      P02Q22_n6848EstColDsc = new boolean[] {false} ;
      P02Q22_A12712EstColRGB = new long[1] ;
      P02Q22_n12712EstColRGB = new boolean[] {false} ;
      A6848EstColDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestcoldsc__default(),
         new Object[] {
             new Object[] {
            P02Q22_A396EmprCod, P02Q22_A252CliCod, P02Q22_A4415EstCol, P02Q22_A6848EstColDsc, P02Q22_n6848EstColDsc, P02Q22_A12712EstColRGB, P02Q22_n12712EstColRGB
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private long AV9EstColRGB ;
   private long A12712EstColRGB ;
   private String A396EmprCod ;
   private String A4415EstCol ;
   private String AV8EstColDsc ;
   private String scmdbuf ;
   private String A6848EstColDsc ;
   private boolean n6848EstColDsc ;
   private boolean n12712EstColRGB ;
   private long[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02Q22_A396EmprCod ;
   private int[] P02Q22_A252CliCod ;
   private String[] P02Q22_A4415EstCol ;
   private String[] P02Q22_A6848EstColDsc ;
   private boolean[] P02Q22_n6848EstColDsc ;
   private long[] P02Q22_A12712EstColRGB ;
   private boolean[] P02Q22_n12712EstColRGB ;
}

final  class pestcoldsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02Q22", "SELECT EmprCod, CliCod, EstCol, EstColDsc, EstColRGB FROM TXPCEstCo WHERE EmprCod = ? and CliCod = ? and EstCol = ? ORDER BY EmprCod, CliCod, EstCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 20);
               return;
      }
   }

}

