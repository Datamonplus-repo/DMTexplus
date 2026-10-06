package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusmer extends GXProcedure
{
   public pbusmer( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusmer.class ), "" );
   }

   public pbusmer( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 )
   {
      pbusmer.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pbusmer.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusmer.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbusmer.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pbusmer.this.AV8ArtMer = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00GZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A88ArtMer = P00GZ2_A88ArtMer[0] ;
         n88ArtMer = P00GZ2_n88ArtMer[0] ;
         AV8ArtMer = A88ArtMer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusmer.this.A396EmprCod;
      this.aP1[0] = pbusmer.this.A252CliCod;
      this.aP2[0] = pbusmer.this.A65ArtCod;
      this.aP3[0] = pbusmer.this.AV8ArtMer;
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
      P00GZ2_A396EmprCod = new String[] {""} ;
      P00GZ2_A252CliCod = new int[1] ;
      P00GZ2_A65ArtCod = new String[] {""} ;
      P00GZ2_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00GZ2_n88ArtMer = new boolean[] {false} ;
      A88ArtMer = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusmer__default(),
         new Object[] {
             new Object[] {
            P00GZ2_A396EmprCod, P00GZ2_A252CliCod, P00GZ2_A65ArtCod, P00GZ2_A88ArtMer, P00GZ2_n88ArtMer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8ArtMer ;
   private java.math.BigDecimal A88ArtMer ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String scmdbuf ;
   private boolean n88ArtMer ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00GZ2_A396EmprCod ;
   private int[] P00GZ2_A252CliCod ;
   private String[] P00GZ2_A65ArtCod ;
   private java.math.BigDecimal[] P00GZ2_A88ArtMer ;
   private boolean[] P00GZ2_n88ArtMer ;
}

final  class pbusmer__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00GZ2", "SELECT EmprCod, CliCod, ArtCod, ArtMer FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

