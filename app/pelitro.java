package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelitro extends GXProcedure
{
   public pelitro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelitro.class ), "" );
   }

   public pelitro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            String[] aP5 )
   {
      pelitro.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      pelitro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelitro.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pelitro.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pelitro.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pelitro.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pelitro.this.A200BarPieCod = aP5[0];
      this.aP5 = aP5;
      pelitro.this.AV8albptrocod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char1, GXv_char2, GXv_char3) ;
      pelitro.this.A396EmprCod = GXv_char1[0] ;
      pelitro.this.AV11EmprNom = GXv_char2[0] ;
      pelitro.this.AV12UsurCod = GXv_char3[0] ;
      /* Using cursor P018O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(AV8albptrocod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A42AlbPTroCod = P018O2_A42AlbPTroCod[0] ;
         A43AlbPTroMet = P018O2_A43AlbPTroMet[0] ;
         AV9AlbPTroMet = A43AlbPTroMet ;
         /* Using cursor P018O3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
         AV13Inc_obs = httpContext.getMessage( "Albaran N        ", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Elimino Trozo N ", "") + GXutil.str( AV8albptrocod, 4, 0) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Pieza          ", "") + A200BarPieCod + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Metros         ", "") + GXutil.str( A43AlbPTroMet, 9, 2) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV17Pgmname, AV12UsurCod, AV10Station, AV13Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P018O4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( P018O4_A30AlbProCod[0] == A30AlbProCod )
         {
            /* Using cursor P018O5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            A183BarMetLan = P018O5_A183BarMetLan[0] ;
            A197BarPConTro = P018O5_A197BarPConTro[0] ;
            AV13Inc_obs = httpContext.getMessage( "Modificacion BARPIE", "") + GXutil.newLine( ) ;
            AV13Inc_obs += httpContext.getMessage( "Albaran N        ", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
            AV13Inc_obs += httpContext.getMessage( "Pieza            ", "") + A200BarPieCod + GXutil.newLine( ) ;
            AV13Inc_obs += httpContext.getMessage( "Metros           ", "") + GXutil.str( A183BarMetLan, 9, 2) + httpContext.getMessage( " se descuentan ", "") + GXutil.str( AV9AlbPTroMet, 9, 2) + GXutil.newLine( ) ;
            A183BarMetLan = A183BarMetLan.subtract(AV9AlbPTroMet) ;
            if ( AV8albptrocod == A197BarPConTro )
            {
               AV13Inc_obs += httpContext.getMessage( "N Trozos         ", "") + GXutil.str( A197BarPConTro, 3, 0) + httpContext.getMessage( " se descuentan 1", "") + GXutil.newLine( ) ;
               A197BarPConTro = (short)(A197BarPConTro-1) ;
            }
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV17Pgmname, AV12UsurCod, AV10Station, AV13Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            /* Using cursor P018O6 */
            pr_default.execute(4, new Object[] {A183BarMetLan, Short.valueOf(A197BarPConTro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      pr_default.close(3);
      /* Using cursor P018O7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A1270AlbPMtrEnt = P018O7_A1270AlbPMtrEnt[0] ;
         AV13Inc_obs = httpContext.getMessage( "Modificacion LALPRD", "") + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Albaran N        ", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Pieza            ", "") + A200BarPieCod + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Metros           ", "") + GXutil.str( A1270AlbPMtrEnt, 9, 2) + httpContext.getMessage( " se descuentan ", "") + GXutil.str( AV9AlbPTroMet, 9, 2) + GXutil.newLine( ) ;
         A1270AlbPMtrEnt = A1270AlbPMtrEnt.subtract(AV9AlbPTroMet) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV17Pgmname, AV12UsurCod, AV10Station, AV13Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P018O8 */
         pr_default.execute(6, new Object[] {A1270AlbPMtrEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelitro.this.A396EmprCod;
      this.aP1[0] = pelitro.this.A30AlbProCod;
      this.aP2[0] = pelitro.this.A129BarCod;
      this.aP3[0] = pelitro.this.A132BarCodReo;
      this.aP4[0] = pelitro.this.A130BarCodPar;
      this.aP5[0] = pelitro.this.A200BarPieCod;
      this.aP6[0] = pelitro.this.AV8albptrocod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelitro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Station = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV12UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P018O2_A396EmprCod = new String[] {""} ;
      P018O2_A30AlbProCod = new long[1] ;
      P018O2_A129BarCod = new int[1] ;
      P018O2_A132BarCodReo = new byte[1] ;
      P018O2_A130BarCodPar = new String[] {""} ;
      P018O2_A200BarPieCod = new String[] {""} ;
      P018O2_A42AlbPTroCod = new short[1] ;
      P018O2_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A43AlbPTroMet = DecimalUtil.ZERO ;
      AV9AlbPTroMet = DecimalUtil.ZERO ;
      AV13Inc_obs = "" ;
      AV17Pgmname = "" ;
      P018O4_A396EmprCod = new String[] {""} ;
      P018O4_A30AlbProCod = new long[1] ;
      P018O4_A129BarCod = new int[1] ;
      P018O4_A132BarCodReo = new byte[1] ;
      P018O4_A130BarCodPar = new String[] {""} ;
      P018O4_A200BarPieCod = new String[] {""} ;
      P018O5_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018O5_A197BarPConTro = new short[1] ;
      A183BarMetLan = DecimalUtil.ZERO ;
      P018O7_A396EmprCod = new String[] {""} ;
      P018O7_A30AlbProCod = new long[1] ;
      P018O7_A129BarCod = new int[1] ;
      P018O7_A132BarCodReo = new byte[1] ;
      P018O7_A130BarCodPar = new String[] {""} ;
      P018O7_A200BarPieCod = new String[] {""} ;
      P018O7_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelitro__default(),
         new Object[] {
             new Object[] {
            P018O2_A396EmprCod, P018O2_A30AlbProCod, P018O2_A129BarCod, P018O2_A132BarCodReo, P018O2_A130BarCodPar, P018O2_A200BarPieCod, P018O2_A42AlbPTroCod, P018O2_A43AlbPTroMet
            }
            , new Object[] {
            }
            , new Object[] {
            P018O4_A396EmprCod, P018O4_A30AlbProCod, P018O4_A129BarCod, P018O4_A132BarCodReo, P018O4_A130BarCodPar, P018O4_A200BarPieCod
            }
            , new Object[] {
            P018O5_A183BarMetLan, P018O5_A197BarPConTro
            }
            , new Object[] {
            }
            , new Object[] {
            P018O7_A396EmprCod, P018O7_A30AlbProCod, P018O7_A129BarCod, P018O7_A132BarCodReo, P018O7_A130BarCodPar, P018O7_A200BarPieCod, P018O7_A1270AlbPMtrEnt
            }
            , new Object[] {
            }
         }
      );
      AV17Pgmname = "Pelitro" ;
      /* GeneXus formulas. */
      AV17Pgmname = "Pelitro" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8albptrocod ;
   private short A42AlbPTroCod ;
   private short A197BarPConTro ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A43AlbPTroMet ;
   private java.math.BigDecimal AV9AlbPTroMet ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV10Station ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV12UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String AV17Pgmname ;
   private String AV13Inc_obs ;
   private short[] aP6 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P018O2_A396EmprCod ;
   private long[] P018O2_A30AlbProCod ;
   private int[] P018O2_A129BarCod ;
   private byte[] P018O2_A132BarCodReo ;
   private String[] P018O2_A130BarCodPar ;
   private String[] P018O2_A200BarPieCod ;
   private short[] P018O2_A42AlbPTroCod ;
   private java.math.BigDecimal[] P018O2_A43AlbPTroMet ;
   private String[] P018O4_A396EmprCod ;
   private long[] P018O4_A30AlbProCod ;
   private int[] P018O4_A129BarCod ;
   private byte[] P018O4_A132BarCodReo ;
   private String[] P018O4_A130BarCodPar ;
   private String[] P018O4_A200BarPieCod ;
   private java.math.BigDecimal[] P018O5_A183BarMetLan ;
   private short[] P018O5_A197BarPConTro ;
   private String[] P018O7_A396EmprCod ;
   private long[] P018O7_A30AlbProCod ;
   private int[] P018O7_A129BarCod ;
   private byte[] P018O7_A132BarCodReo ;
   private String[] P018O7_A130BarCodPar ;
   private String[] P018O7_A200BarPieCod ;
   private java.math.BigDecimal[] P018O7_A1270AlbPMtrEnt ;
}

final  class pelitro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P018O2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroMet FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and AlbPTroCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P018O3", "DELETE FROM TXPLALTRZ  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new ForEachCursor("P018O4", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) AND ((EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?) AND (AlbProCod = ?)) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P018O5", "SELECT BarMetLan, BarPConTro FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P018O6", "UPDATE TXPBARPIE SET BarMetLan=?, BarPConTro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P018O7", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPMtrEnt FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P018O8", "UPDATE TXPLALPRD SET AlbPMtrEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 9);
               stmt.setLong(11, ((Number) parms[10]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
      }
   }

}

