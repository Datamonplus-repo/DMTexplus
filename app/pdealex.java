package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdealex extends GXProcedure
{
   public pdealex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdealex.class ), "" );
   }

   public pdealex( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pdealex.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pdealex.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdealex.this.A1736AlbExtCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00YN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A1736AlbExtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1747AlbExtPri = P00YN2_A1747AlbExtPri[0] ;
         n1747AlbExtPri = P00YN2_n1747AlbExtPri[0] ;
         /* Using cursor P00YN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A1736AlbExtCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P00YN3_A130BarCodPar[0] ;
            A132BarCodReo = P00YN3_A132BarCodReo[0] ;
            A129BarCod = P00YN3_A129BarCod[0] ;
            A1742AlbExtMtr = P00YN3_A1742AlbExtMtr[0] ;
            /* Optimized DELETE. */
            /* Using cursor P00YN4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A1736AlbExtCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOMEXT");
            /* End optimized DELETE. */
            /* Using cursor P00YN5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A1736AlbExtCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALEXT");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Optimized DELETE. */
         /* Using cursor P00YN6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A1736AlbExtCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSEXT");
         /* End optimized DELETE. */
         /* Using cursor P00YN7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A1736AlbExtCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALEXT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdealex.this.A396EmprCod;
      this.aP1[0] = pdealex.this.A1736AlbExtCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdealex");
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
      P00YN2_A396EmprCod = new String[] {""} ;
      P00YN2_A1736AlbExtCod = new long[1] ;
      P00YN2_A1747AlbExtPri = new String[] {""} ;
      P00YN2_n1747AlbExtPri = new boolean[] {false} ;
      A1747AlbExtPri = "" ;
      P00YN3_A396EmprCod = new String[] {""} ;
      P00YN3_A1736AlbExtCod = new long[1] ;
      P00YN3_A130BarCodPar = new String[] {""} ;
      P00YN3_A132BarCodReo = new byte[1] ;
      P00YN3_A129BarCod = new int[1] ;
      P00YN3_A1742AlbExtMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1742AlbExtMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdealex__default(),
         new Object[] {
             new Object[] {
            P00YN2_A396EmprCod, P00YN2_A1736AlbExtCod, P00YN2_A1747AlbExtPri, P00YN2_n1747AlbExtPri
            }
            , new Object[] {
            P00YN3_A396EmprCod, P00YN3_A1736AlbExtCod, P00YN3_A130BarCodPar, P00YN3_A132BarCodReo, P00YN3_A129BarCod, P00YN3_A1742AlbExtMtr
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A1736AlbExtCod ;
   private java.math.BigDecimal A1742AlbExtMtr ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1747AlbExtPri ;
   private String A130BarCodPar ;
   private boolean n1747AlbExtPri ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YN2_A396EmprCod ;
   private long[] P00YN2_A1736AlbExtCod ;
   private String[] P00YN2_A1747AlbExtPri ;
   private boolean[] P00YN2_n1747AlbExtPri ;
   private String[] P00YN3_A396EmprCod ;
   private long[] P00YN3_A1736AlbExtCod ;
   private String[] P00YN3_A130BarCodPar ;
   private byte[] P00YN3_A132BarCodReo ;
   private int[] P00YN3_A129BarCod ;
   private java.math.BigDecimal[] P00YN3_A1742AlbExtMtr ;
}

final  class pdealex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YN2", "SELECT EmprCod, AlbExtCod, AlbExtPri FROM TXPCALEXT WHERE EmprCod = ? and AlbExtCod = ? ORDER BY EmprCod, AlbExtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YN3", "SELECT EmprCod, AlbExtCod, BarCodPar, BarCodReo, BarCod, AlbExtMtr FROM TXPLALEXT WHERE EmprCod = ? and AlbExtCod = ? ORDER BY EmprCod, AlbExtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YN4", "DELETE FROM TXPCOMEXT  WHERE EmprCod = ? and AlbExtCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCOMEXT")
         ,new UpdateCursor("P00YN5", "DELETE FROM TXPLALEXT  WHERE EmprCod = ? AND AlbExtCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALEXT")
         ,new UpdateCursor("P00YN6", "DELETE FROM TXPOBSEXT  WHERE EmprCod = ? and AlbExtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSEXT")
         ,new UpdateCursor("P00YN7", "DELETE FROM TXPCALEXT  WHERE EmprCod = ? AND AlbExtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALEXT")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

