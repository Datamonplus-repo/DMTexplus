package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaesp5 extends GXProcedure
{
   public pclaesp5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaesp5.class ), "" );
   }

   public pclaesp5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           String[] aP5 ,
                           java.math.BigDecimal[] aP6 )
   {
      pclaesp5.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 )
   {
      pclaesp5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaesp5.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pclaesp5.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pclaesp5.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pclaesp5.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pclaesp5.this.AV15Producto = aP5[0];
      this.aP5 = aP5;
      pclaesp5.this.AV16TotCol = aP6[0];
      this.aP6 = aP6;
      pclaesp5.this.AV17FlagCol = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17FlagCol = (byte)(0) ;
      /* Using cursor P01QK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), AV15Producto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5409RecPrdCol = P01QK2_A5409RecPrdCol[0] ;
         n5409RecPrdCol = P01QK2_n5409RecPrdCol[0] ;
         A5411RecCantCol = P01QK2_A5411RecCantCol[0] ;
         n5411RecCantCol = P01QK2_n5411RecCantCol[0] ;
         A5408RecLinCol = P01QK2_A5408RecLinCol[0] ;
         AV16TotCol = AV16TotCol.add(A5411RecCantCol) ;
         AV17FlagCol = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaesp5.this.A396EmprCod;
      this.aP1[0] = pclaesp5.this.A129BarCod;
      this.aP2[0] = pclaesp5.this.A132BarCodReo;
      this.aP3[0] = pclaesp5.this.A130BarCodPar;
      this.aP4[0] = pclaesp5.this.A2804RecLinMaq;
      this.aP5[0] = pclaesp5.this.AV15Producto;
      this.aP6[0] = pclaesp5.this.AV16TotCol;
      this.aP7[0] = pclaesp5.this.AV17FlagCol;
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
      P01QK2_A396EmprCod = new String[] {""} ;
      P01QK2_A129BarCod = new int[1] ;
      P01QK2_A132BarCodReo = new byte[1] ;
      P01QK2_A130BarCodPar = new String[] {""} ;
      P01QK2_A2804RecLinMaq = new short[1] ;
      P01QK2_A5409RecPrdCol = new String[] {""} ;
      P01QK2_n5409RecPrdCol = new boolean[] {false} ;
      P01QK2_A5411RecCantCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QK2_n5411RecCantCol = new boolean[] {false} ;
      P01QK2_A5408RecLinCol = new short[1] ;
      A5409RecPrdCol = "" ;
      A5411RecCantCol = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaesp5__default(),
         new Object[] {
             new Object[] {
            P01QK2_A396EmprCod, P01QK2_A129BarCod, P01QK2_A132BarCodReo, P01QK2_A130BarCodPar, P01QK2_A2804RecLinMaq, P01QK2_A5409RecPrdCol, P01QK2_n5409RecPrdCol, P01QK2_A5411RecCantCol, P01QK2_n5411RecCantCol, P01QK2_A5408RecLinCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17FlagCol ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV16TotCol ;
   private java.math.BigDecimal A5411RecCantCol ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15Producto ;
   private String scmdbuf ;
   private String A5409RecPrdCol ;
   private boolean n5409RecPrdCol ;
   private boolean n5411RecCantCol ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01QK2_A396EmprCod ;
   private int[] P01QK2_A129BarCod ;
   private byte[] P01QK2_A132BarCodReo ;
   private String[] P01QK2_A130BarCodPar ;
   private short[] P01QK2_A2804RecLinMaq ;
   private String[] P01QK2_A5409RecPrdCol ;
   private boolean[] P01QK2_n5409RecPrdCol ;
   private java.math.BigDecimal[] P01QK2_A5411RecCantCol ;
   private boolean[] P01QK2_n5411RecCantCol ;
   private short[] P01QK2_A5408RecLinCol ;
}

final  class pclaesp5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01QK2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecPrdCol, RecCantCol, RecLinCol FROM TXPRECCOL WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (RecPrdCol = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
      }
   }

}

