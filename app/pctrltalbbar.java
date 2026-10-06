package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrltalbbar extends GXProcedure
{
   public pctrltalbbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrltalbbar.class ), "" );
   }

   public pctrltalbbar( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      pctrltalbbar.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pctrltalbbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrltalbbar.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pctrltalbbar.this.AV12usurcod = aP2[0];
      this.aP2 = aP2;
      pctrltalbbar.this.AV13Station = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05AE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05AE2_A130BarCodPar[0] ;
         A132BarCodReo = P05AE2_A132BarCodReo[0] ;
         A129BarCod = P05AE2_A129BarCod[0] ;
         A1263BarAlbMtrE = P05AE2_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P05AE2_A1265BarAlbPie[0] ;
         AV8Mts = DecimalUtil.doubleToDec(0) ;
         AV9Kgs = DecimalUtil.doubleToDec(0) ;
         AV10Pzs = 0 ;
         /* Optimized group. */
         /* Using cursor P05AE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         c1270AlbPMtrEnt = P05AE3_A1270AlbPMtrEnt[0] ;
         c27AlbPKilEnt = P05AE3_A27AlbPKilEnt[0] ;
         cV10Pzs = P05AE3_AV10Pzs[0] ;
         pr_default.close(1);
         AV8Mts = AV8Mts.add(c1270AlbPMtrEnt) ;
         AV9Kgs = AV9Kgs.add(c27AlbPKilEnt) ;
         AV10Pzs = (int)(AV10Pzs+cV10Pzs*1) ;
         /* End optimized group. */
         if ( DecimalUtil.compareTo(AV8Mts, A1263BarAlbMtrE) != 0 )
         {
            AV11Inc_obs = httpContext.getMessage( "Diferencia de Metros en ALBBAR. Actualizo", "") + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Albaran ", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Metros Ant ", "") + GXutil.str( A1263BarAlbMtrE, 9, 2) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( AV8Mts, 9, 2) + GXutil.newLine( ) ;
            AV11Inc_obs += httpContext.getMessage( "Piezas Ant ", "") + GXutil.str( A1265BarAlbPie, 6, 0) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( AV10Pzs, 6, 0) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmname, AV12usurcod, AV13Station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A1263BarAlbMtrE = AV8Mts ;
            A1265BarAlbPie = AV10Pzs ;
         }
         /* Using cursor P05AE4 */
         pr_default.execute(2, new Object[] {A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrltalbbar.this.A396EmprCod;
      this.aP1[0] = pctrltalbbar.this.A30AlbProCod;
      this.aP2[0] = pctrltalbbar.this.AV12usurcod;
      this.aP3[0] = pctrltalbbar.this.AV13Station;
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
      P05AE2_A396EmprCod = new String[] {""} ;
      P05AE2_A30AlbProCod = new long[1] ;
      P05AE2_A130BarCodPar = new String[] {""} ;
      P05AE2_A132BarCodReo = new byte[1] ;
      P05AE2_A129BarCod = new int[1] ;
      P05AE2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AE2_A1265BarAlbPie = new int[1] ;
      A130BarCodPar = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV8Mts = DecimalUtil.ZERO ;
      AV9Kgs = DecimalUtil.ZERO ;
      c1270AlbPMtrEnt = DecimalUtil.ZERO ;
      c27AlbPKilEnt = DecimalUtil.ZERO ;
      P05AE3_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AE3_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AE3_AV10Pzs = new int[1] ;
      AV11Inc_obs = "" ;
      AV18Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrltalbbar__default(),
         new Object[] {
             new Object[] {
            P05AE2_A396EmprCod, P05AE2_A30AlbProCod, P05AE2_A130BarCodPar, P05AE2_A132BarCodReo, P05AE2_A129BarCod, P05AE2_A1263BarAlbMtrE, P05AE2_A1265BarAlbPie
            }
            , new Object[] {
            P05AE3_A1270AlbPMtrEnt, P05AE3_A27AlbPKilEnt, P05AE3_AV10Pzs
            }
            , new Object[] {
            }
         }
      );
      AV18Pgmname = "PctrlTAlbbar" ;
      /* GeneXus formulas. */
      AV18Pgmname = "PctrlTAlbbar" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV10Pzs ;
   private int cV10Pzs ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV8Mts ;
   private java.math.BigDecimal AV9Kgs ;
   private java.math.BigDecimal c1270AlbPMtrEnt ;
   private java.math.BigDecimal c27AlbPKilEnt ;
   private String A396EmprCod ;
   private String AV12usurcod ;
   private String AV13Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV18Pgmname ;
   private String AV11Inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05AE2_A396EmprCod ;
   private long[] P05AE2_A30AlbProCod ;
   private String[] P05AE2_A130BarCodPar ;
   private byte[] P05AE2_A132BarCodReo ;
   private int[] P05AE2_A129BarCod ;
   private java.math.BigDecimal[] P05AE2_A1263BarAlbMtrE ;
   private int[] P05AE2_A1265BarAlbPie ;
   private java.math.BigDecimal[] P05AE3_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P05AE3_A27AlbPKilEnt ;
   private int[] P05AE3_AV10Pzs ;
}

final  class pctrltalbbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05AE2", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarAlbMtrE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05AE3", "SELECT SUM(AlbPMtrEnt), SUM(AlbPKilEnt), COUNT(*) FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05AE4", "UPDATE TXPALBBAR SET BarAlbMtrE=?, BarAlbPie=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

