package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodany extends GXProcedure
{
   public pmodany( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodany.class ), "" );
   }

   public pmodany( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        byte aP4 ,
                        short aP5 ,
                        java.math.BigDecimal aP6 ,
                        short aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             byte aP4 ,
                             short aP5 ,
                             java.math.BigDecimal aP6 ,
                             short aP7 )
   {
      pmodany.this.A396EmprCod = aP0;
      pmodany.this.A129BarCod = aP1;
      pmodany.this.A132BarCodReo = aP2;
      pmodany.this.A130BarCodPar = aP3;
      pmodany.this.A1273RecLinPro = aP4;
      pmodany.this.A811RecLin = aP5;
      pmodany.this.AV15Anyadida = aP6;
      pmodany.this.A2804RecLinMaq = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1797PrdCanAny = P002F2_A1797PrdCanAny[0] ;
         A1797PrdCanAny = A1797PrdCanAny.add(AV15Anyadida) ;
         if ( A1797PrdCanAny.doubleValue() < 0 )
         {
            A1797PrdCanAny = DecimalUtil.doubleToDec(0) ;
         }
         /* Using cursor P002F3 */
         pr_default.execute(1, new Object[] {A1797PrdCanAny, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodany");
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
      P002F2_A396EmprCod = new String[] {""} ;
      P002F2_A129BarCod = new int[1] ;
      P002F2_A132BarCodReo = new byte[1] ;
      P002F2_A130BarCodPar = new String[] {""} ;
      P002F2_A2804RecLinMaq = new short[1] ;
      P002F2_A1273RecLinPro = new byte[1] ;
      P002F2_A811RecLin = new short[1] ;
      P002F2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodany__default(),
         new Object[] {
             new Object[] {
            P002F2_A396EmprCod, P002F2_A129BarCod, P002F2_A132BarCodReo, P002F2_A130BarCodPar, P002F2_A2804RecLinMaq, P002F2_A1273RecLinPro, P002F2_A811RecLin, P002F2_A1797PrdCanAny
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15Anyadida ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private IDataStoreProvider pr_default ;
   private String[] P002F2_A396EmprCod ;
   private int[] P002F2_A129BarCod ;
   private byte[] P002F2_A132BarCodReo ;
   private String[] P002F2_A130BarCodPar ;
   private short[] P002F2_A2804RecLinMaq ;
   private byte[] P002F2_A1273RecLinPro ;
   private short[] P002F2_A811RecLin ;
   private java.math.BigDecimal[] P002F2_A1797PrdCanAny ;
}

final  class pmodany__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002F2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, PrdCanAny FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? and RecLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P002F3", "UPDATE TXPLRECET SET PrdCanAny=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

