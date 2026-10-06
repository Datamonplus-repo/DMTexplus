package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliho3 extends GXProcedure
{
   public peliho3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliho3.class ), "" );
   }

   public peliho3( int remoteHandle ,
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
      peliho3.this.aP4 = new String[] {""};
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
      peliho3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliho3.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      peliho3.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      peliho3.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      peliho3.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00932 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1261BarAlbKgmE = P00932_A1261BarAlbKgmE[0] ;
         /* Using cursor P00933 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A213BarSit = P00933_A213BarSit[0] ;
         /* Using cursor P00934 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         /* Using cursor P00935 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A200BarPieCod = P00935_A200BarPieCod[0] ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A30AlbProCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int4[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_char6[0] = A200BarPieCod ;
            new app.pelipi2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5, GXv_char6) ;
            peliho3.this.A396EmprCod = GXv_char1[0] ;
            peliho3.this.A30AlbProCod = GXv_int2[0] ;
            peliho3.this.A129BarCod = GXv_int3[0] ;
            peliho3.this.A132BarCodReo = GXv_int4[0] ;
            peliho3.this.A130BarCodPar = GXv_char5[0] ;
            peliho3.this.A200BarPieCod = GXv_char6[0] ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( A213BarSit == 9 )
         {
            A213BarSit = (byte)(6) ;
         }
         /* Using cursor P00936 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Using cursor P00937 */
         pr_default.execute(5, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliho3.this.A396EmprCod;
      this.aP1[0] = peliho3.this.A30AlbProCod;
      this.aP2[0] = peliho3.this.A129BarCod;
      this.aP3[0] = peliho3.this.A132BarCodReo;
      this.aP4[0] = peliho3.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliho3");
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
      P00932_A396EmprCod = new String[] {""} ;
      P00932_A30AlbProCod = new long[1] ;
      P00932_A129BarCod = new int[1] ;
      P00932_A132BarCodReo = new byte[1] ;
      P00932_A130BarCodPar = new String[] {""} ;
      P00932_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P00933_A213BarSit = new byte[1] ;
      P00934_A396EmprCod = new String[] {""} ;
      P00935_A396EmprCod = new String[] {""} ;
      P00935_A30AlbProCod = new long[1] ;
      P00935_A129BarCod = new int[1] ;
      P00935_A132BarCodReo = new byte[1] ;
      P00935_A130BarCodPar = new String[] {""} ;
      P00935_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliho3__default(),
         new Object[] {
             new Object[] {
            P00932_A396EmprCod, P00932_A30AlbProCod, P00932_A129BarCod, P00932_A132BarCodReo, P00932_A130BarCodPar, P00932_A1261BarAlbKgmE
            }
            , new Object[] {
            P00933_A213BarSit
            }
            , new Object[] {
            P00934_A396EmprCod
            }
            , new Object[] {
            P00935_A396EmprCod, P00935_A30AlbProCod, P00935_A129BarCod, P00935_A132BarCodReo, P00935_A130BarCodPar, P00935_A200BarPieCod
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
   private byte A213BarSit ;
   private byte GXv_int4[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int3[] ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00932_A396EmprCod ;
   private long[] P00932_A30AlbProCod ;
   private int[] P00932_A129BarCod ;
   private byte[] P00932_A132BarCodReo ;
   private String[] P00932_A130BarCodPar ;
   private java.math.BigDecimal[] P00932_A1261BarAlbKgmE ;
   private byte[] P00933_A213BarSit ;
   private String[] P00934_A396EmprCod ;
   private String[] P00935_A396EmprCod ;
   private long[] P00935_A30AlbProCod ;
   private int[] P00935_A129BarCod ;
   private byte[] P00935_A132BarCodReo ;
   private String[] P00935_A130BarCodPar ;
   private String[] P00935_A200BarPieCod ;
}

final  class peliho3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00932", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00933", "SELECT BarSit FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00934", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00935", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (AlbProCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00936", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P00937", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setString(6, (String)parms[5], 3);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

