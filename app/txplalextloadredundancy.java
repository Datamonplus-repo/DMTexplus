package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txplalextloadredundancy extends GXProcedure
{
   public txplalextloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txplalextloadredundancy.class ), "" );
   }

   public txplalextloadredundancy( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPLALEXT ...", "") );
      /* Using cursor TXPLALEXTL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = TXPLALEXTL2_A130BarCodPar[0] ;
         A132BarCodReo = TXPLALEXTL2_A132BarCodReo[0] ;
         A129BarCod = TXPLALEXTL2_A129BarCod[0] ;
         A1736AlbExtCod = TXPLALEXTL2_A1736AlbExtCod[0] ;
         A396EmprCod = TXPLALEXTL2_A396EmprCod[0] ;
         A1742AlbExtMtr = TXPLALEXTL2_A1742AlbExtMtr[0] ;
         A1744AlbExtPie = TXPLALEXTL2_A1744AlbExtPie[0] ;
         O1744AlbExtPie = A1744AlbExtPie ;
         O1742AlbExtMtr = A1742AlbExtMtr ;
         O1744AlbExtPie = A1744AlbExtPie ;
         O1742AlbExtMtr = A1742AlbExtMtr ;
         A1742AlbExtMtr = DecimalUtil.doubleToDec(0) ;
         A1744AlbExtPie = (short)(0) ;
         /* Using cursor TXPLALEXTL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A1736AlbExtCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1738AlbExtComP = TXPLALEXTL3_A1738AlbExtComP[0] ;
            n1738AlbExtComP = TXPLALEXTL3_n1738AlbExtComP[0] ;
            A1737AlbExtComM = TXPLALEXTL3_A1737AlbExtComM[0] ;
            n1737AlbExtComM = TXPLALEXTL3_n1737AlbExtComM[0] ;
            A2524DisComLin = TXPLALEXTL3_A2524DisComLin[0] ;
            A1056DisComCod = TXPLALEXTL3_A1056DisComCod[0] ;
            A1032FonCod = TXPLALEXTL3_A1032FonCod[0] ;
            A1742AlbExtMtr = O1742AlbExtMtr.add(A1737AlbExtComM) ;
            A1744AlbExtPie = (short)(O1744AlbExtPie+A1738AlbExtComP) ;
            O1744AlbExtPie = A1744AlbExtPie ;
            O1742AlbExtMtr = A1742AlbExtMtr ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor TXPLALEXTL4 */
         pr_default.execute(2, new Object[] {A1742AlbExtMtr, Short.valueOf(A1744AlbExtPie), A396EmprCod, Long.valueOf(A1736AlbExtCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALEXT");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txplalextloadredundancy");
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
      TXPLALEXTL2_A130BarCodPar = new String[] {""} ;
      TXPLALEXTL2_A132BarCodReo = new byte[1] ;
      TXPLALEXTL2_A129BarCod = new int[1] ;
      TXPLALEXTL2_A1736AlbExtCod = new long[1] ;
      TXPLALEXTL2_A396EmprCod = new String[] {""} ;
      TXPLALEXTL2_A1742AlbExtMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPLALEXTL2_A1744AlbExtPie = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A1742AlbExtMtr = DecimalUtil.ZERO ;
      O1742AlbExtMtr = DecimalUtil.ZERO ;
      TXPLALEXTL3_A396EmprCod = new String[] {""} ;
      TXPLALEXTL3_A1736AlbExtCod = new long[1] ;
      TXPLALEXTL3_A129BarCod = new int[1] ;
      TXPLALEXTL3_A132BarCodReo = new byte[1] ;
      TXPLALEXTL3_A130BarCodPar = new String[] {""} ;
      TXPLALEXTL3_A1738AlbExtComP = new short[1] ;
      TXPLALEXTL3_n1738AlbExtComP = new boolean[] {false} ;
      TXPLALEXTL3_A1737AlbExtComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPLALEXTL3_n1737AlbExtComM = new boolean[] {false} ;
      TXPLALEXTL3_A2524DisComLin = new byte[1] ;
      TXPLALEXTL3_A1056DisComCod = new String[] {""} ;
      TXPLALEXTL3_A1032FonCod = new String[] {""} ;
      A1737AlbExtComM = DecimalUtil.ZERO ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txplalextloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPLALEXTL2_A130BarCodPar, TXPLALEXTL2_A132BarCodReo, TXPLALEXTL2_A129BarCod, TXPLALEXTL2_A1736AlbExtCod, TXPLALEXTL2_A396EmprCod, TXPLALEXTL2_A1742AlbExtMtr, TXPLALEXTL2_A1744AlbExtPie
            }
            , new Object[] {
            TXPLALEXTL3_A396EmprCod, TXPLALEXTL3_A1736AlbExtCod, TXPLALEXTL3_A129BarCod, TXPLALEXTL3_A132BarCodReo, TXPLALEXTL3_A130BarCodPar, TXPLALEXTL3_A1738AlbExtComP, TXPLALEXTL3_n1738AlbExtComP, TXPLALEXTL3_A1737AlbExtComM, TXPLALEXTL3_n1737AlbExtComM, TXPLALEXTL3_A2524DisComLin,
            TXPLALEXTL3_A1056DisComCod, TXPLALEXTL3_A1032FonCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private short A1744AlbExtPie ;
   private short O1744AlbExtPie ;
   private short A1738AlbExtComP ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A1736AlbExtCod ;
   private java.math.BigDecimal A1742AlbExtMtr ;
   private java.math.BigDecimal O1742AlbExtMtr ;
   private java.math.BigDecimal A1737AlbExtComM ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private boolean n1738AlbExtComP ;
   private boolean n1737AlbExtComM ;
   private IDataStoreProvider pr_default ;
   private String[] TXPLALEXTL2_A130BarCodPar ;
   private byte[] TXPLALEXTL2_A132BarCodReo ;
   private int[] TXPLALEXTL2_A129BarCod ;
   private long[] TXPLALEXTL2_A1736AlbExtCod ;
   private String[] TXPLALEXTL2_A396EmprCod ;
   private java.math.BigDecimal[] TXPLALEXTL2_A1742AlbExtMtr ;
   private short[] TXPLALEXTL2_A1744AlbExtPie ;
   private String[] TXPLALEXTL3_A396EmprCod ;
   private long[] TXPLALEXTL3_A1736AlbExtCod ;
   private int[] TXPLALEXTL3_A129BarCod ;
   private byte[] TXPLALEXTL3_A132BarCodReo ;
   private String[] TXPLALEXTL3_A130BarCodPar ;
   private short[] TXPLALEXTL3_A1738AlbExtComP ;
   private boolean[] TXPLALEXTL3_n1738AlbExtComP ;
   private java.math.BigDecimal[] TXPLALEXTL3_A1737AlbExtComM ;
   private boolean[] TXPLALEXTL3_n1737AlbExtComM ;
   private byte[] TXPLALEXTL3_A2524DisComLin ;
   private String[] TXPLALEXTL3_A1056DisComCod ;
   private String[] TXPLALEXTL3_A1032FonCod ;
}

final  class txplalextloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPLALEXTL2", "SELECT BarCodPar, BarCodReo, BarCod, AlbExtCod, EmprCod, AlbExtMtr, AlbExtPie FROM TXPLALEXT ORDER BY EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF AlbExtMtr, AlbExtPie NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("TXPLALEXTL3", "SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar, AlbExtComP, AlbExtComM, DisComLin, DisComCod, FonCod FROM TXPCOMEXT WHERE EmprCod = ? and AlbExtCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPLALEXTL4", "UPDATE TXPLALEXT SET AlbExtMtr=?, AlbExtPie=?  WHERE EmprCod = ? AND AlbExtCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALEXT")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

