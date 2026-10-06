package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcorzero extends GXProcedure
{
   public pcorzero( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcorzero.class ), "" );
   }

   public pcorzero( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 )
   {
      pcorzero.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 )
   {
      pcorzero.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcorzero.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcorzero.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcorzero.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcorzero.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcorzero.this.AV8Corante0 = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Corante0 = (byte)(0) ;
      /* Using cursor P02LY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5411RecCantCol = P02LY2_A5411RecCantCol[0] ;
         n5411RecCantCol = P02LY2_n5411RecCantCol[0] ;
         A5408RecLinCol = P02LY2_A5408RecLinCol[0] ;
         if ( A5411RecCantCol.doubleValue() == 0 )
         {
            AV8Corante0 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcorzero.this.A396EmprCod;
      this.aP1[0] = pcorzero.this.A129BarCod;
      this.aP2[0] = pcorzero.this.A132BarCodReo;
      this.aP3[0] = pcorzero.this.A130BarCodPar;
      this.aP4[0] = pcorzero.this.A2804RecLinMaq;
      this.aP5[0] = pcorzero.this.AV8Corante0;
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
      P02LY2_A396EmprCod = new String[] {""} ;
      P02LY2_A129BarCod = new int[1] ;
      P02LY2_A132BarCodReo = new byte[1] ;
      P02LY2_A130BarCodPar = new String[] {""} ;
      P02LY2_A2804RecLinMaq = new short[1] ;
      P02LY2_A5411RecCantCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LY2_n5411RecCantCol = new boolean[] {false} ;
      P02LY2_A5408RecLinCol = new short[1] ;
      A5411RecCantCol = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcorzero__default(),
         new Object[] {
             new Object[] {
            P02LY2_A396EmprCod, P02LY2_A129BarCod, P02LY2_A132BarCodReo, P02LY2_A130BarCodPar, P02LY2_A2804RecLinMaq, P02LY2_A5411RecCantCol, P02LY2_n5411RecCantCol, P02LY2_A5408RecLinCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Corante0 ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal A5411RecCantCol ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n5411RecCantCol ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02LY2_A396EmprCod ;
   private int[] P02LY2_A129BarCod ;
   private byte[] P02LY2_A132BarCodReo ;
   private String[] P02LY2_A130BarCodPar ;
   private short[] P02LY2_A2804RecLinMaq ;
   private java.math.BigDecimal[] P02LY2_A5411RecCantCol ;
   private boolean[] P02LY2_n5411RecCantCol ;
   private short[] P02LY2_A5408RecLinCol ;
}

final  class pcorzero__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LY2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecCantCol, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
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
               return;
      }
   }

}

