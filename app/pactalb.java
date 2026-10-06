package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactalb extends GXProcedure
{
   public pactalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactalb.class ), "" );
   }

   public pactalb( int remoteHandle ,
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
      pactalb.this.aP4 = new String[] {""};
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
      pactalb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactalb.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pactalb.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pactalb.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pactalb.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P012O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1263BarAlbMtrE = P012O2_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P012O2_A1265BarAlbPie[0] ;
         A1261BarAlbKgmE = P012O2_A1261BarAlbKgmE[0] ;
         A1266BarAlbTub = P012O2_A1266BarAlbTub[0] ;
         AV8TotMts = DecimalUtil.doubleToDec(0) ;
         AV9TotPzs = (short)(0) ;
         AV11TotTro = (short)(0) ;
         /* Using cursor P012O4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A200BarPieCod = P012O4_A200BarPieCod[0] ;
            A1270AlbPMtrEnt = P012O4_A1270AlbPMtrEnt[0] ;
            A27AlbPKilEnt = P012O4_A27AlbPKilEnt[0] ;
            A3469BarPTotTro = P012O4_A3469BarPTotTro[0] ;
            n3469BarPTotTro = P012O4_n3469BarPTotTro[0] ;
            A3469BarPTotTro = P012O4_A3469BarPTotTro[0] ;
            n3469BarPTotTro = P012O4_n3469BarPTotTro[0] ;
            AV8TotMts = AV8TotMts.add(A1270AlbPMtrEnt) ;
            AV9TotPzs = (short)(AV9TotPzs+1) ;
            AV10TotKgs = AV10TotKgs.add(A27AlbPKilEnt) ;
            AV11TotTro = (short)(AV11TotTro+A3469BarPTotTro) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A1263BarAlbMtrE = AV8TotMts ;
         A1265BarAlbPie = AV9TotPzs ;
         A1261BarAlbKgmE = AV10TotKgs ;
         A1266BarAlbTub = AV11TotTro ;
         /* Using cursor P012O5 */
         pr_default.execute(2, new Object[] {A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A1261BarAlbKgmE, Integer.valueOf(A1266BarAlbTub), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactalb.this.A396EmprCod;
      this.aP1[0] = pactalb.this.A30AlbProCod;
      this.aP2[0] = pactalb.this.A129BarCod;
      this.aP3[0] = pactalb.this.A132BarCodReo;
      this.aP4[0] = pactalb.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactalb");
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
      P012O2_A396EmprCod = new String[] {""} ;
      P012O2_A30AlbProCod = new long[1] ;
      P012O2_A129BarCod = new int[1] ;
      P012O2_A132BarCodReo = new byte[1] ;
      P012O2_A130BarCodPar = new String[] {""} ;
      P012O2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012O2_A1265BarAlbPie = new int[1] ;
      P012O2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012O2_A1266BarAlbTub = new int[1] ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      AV8TotMts = DecimalUtil.ZERO ;
      P012O4_A200BarPieCod = new String[] {""} ;
      P012O4_A396EmprCod = new String[] {""} ;
      P012O4_A30AlbProCod = new long[1] ;
      P012O4_A129BarCod = new int[1] ;
      P012O4_A132BarCodReo = new byte[1] ;
      P012O4_A130BarCodPar = new String[] {""} ;
      P012O4_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012O4_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012O4_A3469BarPTotTro = new short[1] ;
      P012O4_n3469BarPTotTro = new boolean[] {false} ;
      A200BarPieCod = "" ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      AV10TotKgs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactalb__default(),
         new Object[] {
             new Object[] {
            P012O2_A396EmprCod, P012O2_A30AlbProCod, P012O2_A129BarCod, P012O2_A132BarCodReo, P012O2_A130BarCodPar, P012O2_A1263BarAlbMtrE, P012O2_A1265BarAlbPie, P012O2_A1261BarAlbKgmE, P012O2_A1266BarAlbTub
            }
            , new Object[] {
            P012O4_A200BarPieCod, P012O4_A396EmprCod, P012O4_A30AlbProCod, P012O4_A129BarCod, P012O4_A132BarCodReo, P012O4_A130BarCodPar, P012O4_A1270AlbPMtrEnt, P012O4_A27AlbPKilEnt, P012O4_A3469BarPTotTro, P012O4_n3469BarPTotTro
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV9TotPzs ;
   private short AV11TotTro ;
   private short A3469BarPTotTro ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV8TotMts ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal AV10TotKgs ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private boolean n3469BarPTotTro ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P012O2_A396EmprCod ;
   private long[] P012O2_A30AlbProCod ;
   private int[] P012O2_A129BarCod ;
   private byte[] P012O2_A132BarCodReo ;
   private String[] P012O2_A130BarCodPar ;
   private java.math.BigDecimal[] P012O2_A1263BarAlbMtrE ;
   private int[] P012O2_A1265BarAlbPie ;
   private java.math.BigDecimal[] P012O2_A1261BarAlbKgmE ;
   private int[] P012O2_A1266BarAlbTub ;
   private String[] P012O4_A200BarPieCod ;
   private String[] P012O4_A396EmprCod ;
   private long[] P012O4_A30AlbProCod ;
   private int[] P012O4_A129BarCod ;
   private byte[] P012O4_A132BarCodReo ;
   private String[] P012O4_A130BarCodPar ;
   private java.math.BigDecimal[] P012O4_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P012O4_A27AlbPKilEnt ;
   private short[] P012O4_A3469BarPTotTro ;
   private boolean[] P012O4_n3469BarPTotTro ;
}

final  class pactalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012O2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbMtrE, BarAlbPie, BarAlbKgmE, BarAlbTub FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P012O4", "SELECT T1.BarPieCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPMtrEnt, T1.AlbPKilEnt, COALESCE( T2.BarPTotTro, 0) AS BarPTotTro FROM (TXPLALPRD T1 LEFT JOIN (SELECT COUNT(*) AS BarPTotTro, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALTRZ GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.BarPieCod = T1.BarPieCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012O5", "UPDATE TXPALBBAR SET BarAlbMtrE=?, BarAlbPie=?, BarAlbKgmE=?, BarAlbTub=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
      }
   }

}

