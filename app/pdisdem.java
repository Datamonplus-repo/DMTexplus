package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisdem extends GXProcedure
{
   public pdisdem( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisdem.class ), "" );
   }

   public pdisdem( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 )
   {
      pdisdem.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pdisdem.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisdem.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisdem.this.AV10DisPieMtr = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10DisPieMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01UF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A384DisPieMet = P01UF2_A384DisPieMet[0] ;
         A44AlbRecCod = P01UF2_A44AlbRecCod[0] ;
         A380DisPieCod = P01UF2_A380DisPieCod[0] ;
         AV10DisPieMtr = GXutil.roundDecimal( AV10DisPieMtr.add(A384DisPieMet), 2) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisdem.this.A396EmprCod;
      this.aP1[0] = pdisdem.this.A361DisCod;
      this.aP2[0] = pdisdem.this.AV10DisPieMtr;
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
      P01UF2_A396EmprCod = new String[] {""} ;
      P01UF2_A361DisCod = new int[1] ;
      P01UF2_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UF2_A44AlbRecCod = new int[1] ;
      P01UF2_A380DisPieCod = new String[] {""} ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A380DisPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisdem__default(),
         new Object[] {
             new Object[] {
            P01UF2_A396EmprCod, P01UF2_A361DisCod, P01UF2_A384DisPieMet, P01UF2_A44AlbRecCod, P01UF2_A380DisPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV10DisPieMtr ;
   private java.math.BigDecimal A384DisPieMet ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A380DisPieCod ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01UF2_A396EmprCod ;
   private int[] P01UF2_A361DisCod ;
   private java.math.BigDecimal[] P01UF2_A384DisPieMet ;
   private int[] P01UF2_A44AlbRecCod ;
   private String[] P01UF2_A380DisPieCod ;
}

final  class pdisdem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01UF2", "SELECT EmprCod, DisCod, DisPieMet, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
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
               return;
      }
   }

}

