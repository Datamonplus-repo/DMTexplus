package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfaskpq extends GXProcedure
{
   public pfaskpq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfaskpq.class ), "" );
   }

   public pfaskpq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pfaskpq.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pfaskpq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfaskpq.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pfaskpq.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pfaskpq.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pfaskpq.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01RE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1261BarAlbKgmE = P01RE2_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P01RE2_A1265BarAlbPie[0] ;
         AV15Kilos = A1261BarAlbKgmE ;
         AV16Metros = DecimalUtil.doubleToDec(A1265BarAlbPie) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      n5460P_forMtr = false ;
      n5459P_forKgm = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01RE3 */
      short AV16Metros5460Aux;
      AV16Metros5460Aux = (short)(DecimalUtil.decToDouble(AV16Metros)) ;
      pr_default.execute(1, new Object[] {Boolean.valueOf(n5460P_forMtr), Short.valueOf(AV16Metros5460Aux), Boolean.valueOf(n5459P_forKgm), AV15Kilos, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBQUI");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfaskpq.this.A396EmprCod;
      this.aP1[0] = pfaskpq.this.A30AlbProCod;
      this.aP2[0] = pfaskpq.this.A129BarCod;
      this.aP3[0] = pfaskpq.this.A132BarCodReo;
      this.aP4[0] = pfaskpq.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfaskpq");
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
      P01RE2_A396EmprCod = new String[] {""} ;
      P01RE2_A30AlbProCod = new long[1] ;
      P01RE2_A129BarCod = new int[1] ;
      P01RE2_A132BarCodReo = new byte[1] ;
      P01RE2_A130BarCodPar = new String[] {""} ;
      P01RE2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RE2_A1265BarAlbPie = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      AV15Kilos = DecimalUtil.ZERO ;
      AV16Metros = DecimalUtil.ZERO ;
      A5459P_forKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfaskpq__default(),
         new Object[] {
             new Object[] {
            P01RE2_A396EmprCod, P01RE2_A30AlbProCod, P01RE2_A129BarCod, P01RE2_A132BarCodReo, P01RE2_A130BarCodPar, P01RE2_A1261BarAlbKgmE, P01RE2_A1265BarAlbPie
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A5460P_forMtr ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16Metros ;
   private java.math.BigDecimal A5459P_forKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n5460P_forMtr ;
   private boolean n5459P_forKgm ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01RE2_A396EmprCod ;
   private long[] P01RE2_A30AlbProCod ;
   private int[] P01RE2_A129BarCod ;
   private byte[] P01RE2_A132BarCodReo ;
   private String[] P01RE2_A130BarCodPar ;
   private java.math.BigDecimal[] P01RE2_A1261BarAlbKgmE ;
   private int[] P01RE2_A1265BarAlbPie ;
}

final  class pfaskpq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01RE2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01RE3", "UPDATE TXPALBQUI SET P_forMtr=?, P_forKgm=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBQUI")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setLong(4, ((Number) parms[5]).longValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               return;
      }
   }

}

