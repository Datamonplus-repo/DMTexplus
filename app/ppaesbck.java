package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppaesbck extends GXProcedure
{
   public ppaesbck( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppaesbck.class ), "" );
   }

   public ppaesbck( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ppaesbck.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ppaesbck.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppaesbck.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      ppaesbck.this.A4415EstCol = aP2[0];
      this.aP2 = aP2;
      ppaesbck.this.AV8EstBck = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04Q62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11685EstColBck = P04Q62_A11685EstColBck[0] ;
         n11685EstColBck = P04Q62_n11685EstColBck[0] ;
         AV8EstBck = A11685EstColBck ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppaesbck.this.A396EmprCod;
      this.aP1[0] = ppaesbck.this.A252CliCod;
      this.aP2[0] = ppaesbck.this.A4415EstCol;
      this.aP3[0] = ppaesbck.this.AV8EstBck;
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
      P04Q62_A396EmprCod = new String[] {""} ;
      P04Q62_A252CliCod = new int[1] ;
      P04Q62_A4415EstCol = new String[] {""} ;
      P04Q62_A11685EstColBck = new String[] {""} ;
      P04Q62_n11685EstColBck = new boolean[] {false} ;
      A11685EstColBck = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppaesbck__default(),
         new Object[] {
             new Object[] {
            P04Q62_A396EmprCod, P04Q62_A252CliCod, P04Q62_A4415EstCol, P04Q62_A11685EstColBck, P04Q62_n11685EstColBck
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A4415EstCol ;
   private String AV8EstBck ;
   private String scmdbuf ;
   private String A11685EstColBck ;
   private boolean n11685EstColBck ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04Q62_A396EmprCod ;
   private int[] P04Q62_A252CliCod ;
   private String[] P04Q62_A4415EstCol ;
   private String[] P04Q62_A11685EstColBck ;
   private boolean[] P04Q62_n11685EstColBck ;
}

final  class ppaesbck__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04Q62", "SELECT EmprCod, CliCod, EstCol, EstColBck FROM TXPCEstCo WHERE EmprCod = ? and CliCod = ? and EstCol = ? ORDER BY EmprCod, CliCod, EstCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
      }
   }

}

