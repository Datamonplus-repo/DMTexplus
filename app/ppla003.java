package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppla003 extends GXProcedure
{
   public ppla003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppla003.class ), "" );
   }

   public ppla003( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           short[] aP5 ,
                                           java.util.Date[] aP6 )
   {
      ppla003.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.util.Date[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      ppla003.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppla003.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppla003.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppla003.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppla003.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      ppla003.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      ppla003.this.AV8FecTeo = aP6[0];
      this.aP6 = aP6;
      ppla003.this.AV9TieTeo = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( DecimalUtil.compareTo(AV9TieTeo, DecimalUtil.stringToDec("99.99")) > 0 )
      {
         AV9TieTeo = DecimalUtil.doubleToDec(0) ;
      }
      /* Using cursor P01OZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A162BarFecTeo = P01OZ2_A162BarFecTeo[0] ;
         A216BarTieTeo = P01OZ2_A216BarTieTeo[0] ;
         if ( AV9TieTeo.doubleValue() > 0 )
         {
            A162BarFecTeo = AV8FecTeo ;
            A216BarTieTeo = AV9TieTeo ;
         }
         /* Using cursor P01OZ3 */
         pr_default.execute(1, new Object[] {A162BarFecTeo, A216BarTieTeo, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppla003.this.A396EmprCod;
      this.aP1[0] = ppla003.this.A129BarCod;
      this.aP2[0] = ppla003.this.A132BarCodReo;
      this.aP3[0] = ppla003.this.A130BarCodPar;
      this.aP4[0] = ppla003.this.A758ProCod;
      this.aP5[0] = ppla003.this.A194BarOrdLin;
      this.aP6[0] = ppla003.this.AV8FecTeo;
      this.aP7[0] = ppla003.this.AV9TieTeo;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppla003");
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
      P01OZ2_A396EmprCod = new String[] {""} ;
      P01OZ2_A129BarCod = new int[1] ;
      P01OZ2_A132BarCodReo = new byte[1] ;
      P01OZ2_A130BarCodPar = new String[] {""} ;
      P01OZ2_A758ProCod = new String[] {""} ;
      P01OZ2_A194BarOrdLin = new short[1] ;
      P01OZ2_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P01OZ2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A162BarFecTeo = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppla003__default(),
         new Object[] {
             new Object[] {
            P01OZ2_A396EmprCod, P01OZ2_A129BarCod, P01OZ2_A132BarCodReo, P01OZ2_A130BarCodPar, P01OZ2_A758ProCod, P01OZ2_A194BarOrdLin, P01OZ2_A162BarFecTeo, P01OZ2_A216BarTieTeo
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV9TieTeo ;
   private java.math.BigDecimal A216BarTieTeo ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private java.util.Date AV8FecTeo ;
   private java.util.Date A162BarFecTeo ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01OZ2_A396EmprCod ;
   private int[] P01OZ2_A129BarCod ;
   private byte[] P01OZ2_A132BarCodReo ;
   private String[] P01OZ2_A130BarCodPar ;
   private String[] P01OZ2_A758ProCod ;
   private short[] P01OZ2_A194BarOrdLin ;
   private java.util.Date[] P01OZ2_A162BarFecTeo ;
   private java.math.BigDecimal[] P01OZ2_A216BarTieTeo ;
}

final  class ppla003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01OZ2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFecTeo, BarTieTeo FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01OZ3", "UPDATE TXPBARFAS SET BarFecTeo=?, BarTieTeo=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

