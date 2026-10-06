package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengopreciofase extends GXProcedure
{
   public obtengopreciofase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengopreciofase.class ), "" );
   }

   public obtengopreciofase( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           String aP2 ,
                                           java.math.BigDecimal[] aP3 )
   {
      obtengopreciofase.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      obtengopreciofase.this.A396EmprCod = aP0;
      obtengopreciofase.this.A252CliCod = aP1;
      obtengopreciofase.this.A457FasCod = aP2;
      obtengopreciofase.this.aP3 = aP3;
      obtengopreciofase.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FasPreKgm = DecimalUtil.ZERO ;
      AV9FasPreMtr = DecimalUtil.ZERO ;
      /* Using cursor P0AHC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A466FasPreKgm = P0AHC2_A466FasPreKgm[0] ;
         n466FasPreKgm = P0AHC2_n466FasPreKgm[0] ;
         A467FasPreMtr = P0AHC2_A467FasPreMtr[0] ;
         n467FasPreMtr = P0AHC2_n467FasPreMtr[0] ;
         AV8FasPreKgm = A466FasPreKgm ;
         AV9FasPreMtr = A467FasPreMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = obtengopreciofase.this.AV8FasPreKgm;
      this.aP4[0] = obtengopreciofase.this.AV9FasPreMtr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8FasPreKgm = DecimalUtil.ZERO ;
      AV9FasPreMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AHC2_A396EmprCod = new String[] {""} ;
      P0AHC2_A252CliCod = new int[1] ;
      P0AHC2_A457FasCod = new String[] {""} ;
      P0AHC2_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHC2_n466FasPreKgm = new boolean[] {false} ;
      P0AHC2_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHC2_n467FasPreMtr = new boolean[] {false} ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.obtengopreciofase__default(),
         new Object[] {
             new Object[] {
            P0AHC2_A396EmprCod, P0AHC2_A252CliCod, P0AHC2_A457FasCod, P0AHC2_A466FasPreKgm, P0AHC2_n466FasPreKgm, P0AHC2_A467FasPreMtr, P0AHC2_n467FasPreMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8FasPreKgm ;
   private java.math.BigDecimal AV9FasPreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String scmdbuf ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHC2_A396EmprCod ;
   private int[] P0AHC2_A252CliCod ;
   private String[] P0AHC2_A457FasCod ;
   private java.math.BigDecimal[] P0AHC2_A466FasPreKgm ;
   private boolean[] P0AHC2_n466FasPreKgm ;
   private java.math.BigDecimal[] P0AHC2_A467FasPreMtr ;
   private boolean[] P0AHC2_n467FasPreMtr ;
}

final  class obtengopreciofase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHC2", "SELECT EmprCod, CliCod, FasCod, FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

