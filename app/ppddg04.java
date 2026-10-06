package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg04 extends GXProcedure
{
   public ppddg04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg04.class ), "" );
   }

   public ppddg04( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      ppddg04.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      ppddg04.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg04.this.A13026PedDGId = aP1[0];
      this.aP1 = aP1;
      ppddg04.this.AV12Metros = aP2[0];
      this.aP2 = aP2;
      ppddg04.this.AV10DisPieMtr = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05P22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13049PedDGMetro = P05P22_A13049PedDGMetro[0] ;
         n13049PedDGMetro = P05P22_n13049PedDGMetro[0] ;
         A44AlbRecCod = P05P22_A44AlbRecCod[0] ;
         AV10DisPieMtr = A13049PedDGMetro.add(AV12Metros) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg04.this.A396EmprCod;
      this.aP1[0] = ppddg04.this.A13026PedDGId;
      this.aP2[0] = ppddg04.this.AV12Metros;
      this.aP3[0] = ppddg04.this.AV10DisPieMtr;
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
      P05P22_A396EmprCod = new String[] {""} ;
      P05P22_A13026PedDGId = new int[1] ;
      P05P22_A13049PedDGMetro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05P22_n13049PedDGMetro = new boolean[] {false} ;
      P05P22_A44AlbRecCod = new int[1] ;
      A13049PedDGMetro = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg04__default(),
         new Object[] {
             new Object[] {
            P05P22_A396EmprCod, P05P22_A13026PedDGId, P05P22_A13049PedDGMetro, P05P22_n13049PedDGMetro, P05P22_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A13026PedDGId ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV12Metros ;
   private java.math.BigDecimal AV10DisPieMtr ;
   private java.math.BigDecimal A13049PedDGMetro ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n13049PedDGMetro ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05P22_A396EmprCod ;
   private int[] P05P22_A13026PedDGId ;
   private java.math.BigDecimal[] P05P22_A13049PedDGMetro ;
   private boolean[] P05P22_n13049PedDGMetro ;
   private int[] P05P22_A44AlbRecCod ;
}

final  class ppddg04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05P22", "SELECT EmprCod, PedDGId, PedDGMetro, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? and PedDGId = ? ORDER BY EmprCod, PedDGId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

