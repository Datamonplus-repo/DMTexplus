package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg03 extends GXProcedure
{
   public ppddg03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg03.class ), "" );
   }

   public ppddg03( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      ppddg03.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      ppddg03.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg03.this.A13026PedDGId = aP1[0];
      this.aP1 = aP1;
      ppddg03.this.AV13Kilos = aP2[0];
      this.aP2 = aP2;
      ppddg03.this.AV9DisPieKgm = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05P12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13050PedDGKilos = P05P12_A13050PedDGKilos[0] ;
         n13050PedDGKilos = P05P12_n13050PedDGKilos[0] ;
         A44AlbRecCod = P05P12_A44AlbRecCod[0] ;
         AV9DisPieKgm = A13050PedDGKilos.add(AV13Kilos) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg03.this.A396EmprCod;
      this.aP1[0] = ppddg03.this.A13026PedDGId;
      this.aP2[0] = ppddg03.this.AV13Kilos;
      this.aP3[0] = ppddg03.this.AV9DisPieKgm;
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
      P05P12_A396EmprCod = new String[] {""} ;
      P05P12_A13026PedDGId = new int[1] ;
      P05P12_A13050PedDGKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05P12_n13050PedDGKilos = new boolean[] {false} ;
      P05P12_A44AlbRecCod = new int[1] ;
      A13050PedDGKilos = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg03__default(),
         new Object[] {
             new Object[] {
            P05P12_A396EmprCod, P05P12_A13026PedDGId, P05P12_A13050PedDGKilos, P05P12_n13050PedDGKilos, P05P12_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A13026PedDGId ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV13Kilos ;
   private java.math.BigDecimal AV9DisPieKgm ;
   private java.math.BigDecimal A13050PedDGKilos ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n13050PedDGKilos ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05P12_A396EmprCod ;
   private int[] P05P12_A13026PedDGId ;
   private java.math.BigDecimal[] P05P12_A13050PedDGKilos ;
   private boolean[] P05P12_n13050PedDGKilos ;
   private int[] P05P12_A44AlbRecCod ;
}

final  class ppddg03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05P12", "SELECT EmprCod, PedDGId, PedDGKilos, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? and PedDGId = ? ORDER BY EmprCod, PedDGId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
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

