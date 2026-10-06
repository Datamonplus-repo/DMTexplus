package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdibprccob extends GXProcedure
{
   public pdibprccob( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdibprccob.class ), "" );
   }

   public pdibprccob( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           int[] aP3 )
   {
      pdibprccob.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pdibprccob.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdibprccob.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdibprccob.this.A1013DibCli = aP2[0];
      this.aP2 = aP2;
      pdibprccob.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      pdibprccob.this.AV8DibPrcCob = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DibPrcCob = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P01EG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      c4860DibPrcCob = P01EG2_A4860DibPrcCob[0] ;
      n4860DibPrcCob = P01EG2_n4860DibPrcCob[0] ;
      pr_default.close(0);
      AV8DibPrcCob = AV8DibPrcCob.add(c4860DibPrcCob) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdibprccob.this.A396EmprCod;
      this.aP1[0] = pdibprccob.this.A252CliCod;
      this.aP2[0] = pdibprccob.this.A1013DibCli;
      this.aP3[0] = pdibprccob.this.A1014DibInt;
      this.aP4[0] = pdibprccob.this.AV8DibPrcCob;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c4860DibPrcCob = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01EG2_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EG2_n4860DibPrcCob = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdibprccob__default(),
         new Object[] {
             new Object[] {
            P01EG2_A4860DibPrcCob, P01EG2_n4860DibPrcCob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private java.math.BigDecimal AV8DibPrcCob ;
   private java.math.BigDecimal c4860DibPrcCob ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private boolean n4860DibPrcCob ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P01EG2_A4860DibPrcCob ;
   private boolean[] P01EG2_n4860DibPrcCob ;
}

final  class pdibprccob__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01EG2", "SELECT SUM(DibPrcCob) FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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

