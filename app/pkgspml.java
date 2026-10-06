package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgspml extends GXProcedure
{
   public pkgspml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgspml.class ), "" );
   }

   public pkgspml( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pkgspml.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pkgspml.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgspml.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pkgspml.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pkgspml.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pkgspml.this.AV15BarPes = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02NF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A864BarPes = P02NF2_A864BarPes[0] ;
         A228BarUniMed = P02NF2_A228BarUniMed[0] ;
         AV20BarUnimed = A228BarUniMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV15BarPes <= 0 )
      {
         /* Using cursor P02NF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A864BarPes = P02NF3_A864BarPes[0] ;
            A361DisCod = P02NF3_A361DisCod[0] ;
            AV18Discod = A361DisCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P02NF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18Discod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A361DisCod = P02NF4_A361DisCod[0] ;
            A342DisArtPes = P02NF4_A342DisArtPes[0] ;
            AV19Disartpes = A342DisArtPes ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         /* Optimized UPDATE. */
         /* Using cursor P02NF5 */
         pr_default.execute(3, new Object[] {Short.valueOf(AV19Disartpes), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* End optimized UPDATE. */
         AV15BarPes = AV19Disartpes ;
      }
      /* Using cursor P02NF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A200BarPieCod = P02NF6_A200BarPieCod[0] ;
         A44AlbRecCod = P02NF6_A44AlbRecCod[0] ;
         A361DisCod = P02NF6_A361DisCod[0] ;
         A205BarPieMet = P02NF6_A205BarPieMet[0] ;
         A203BarPieKil = P02NF6_A203BarPieKil[0] ;
         A361DisCod = P02NF6_A361DisCod[0] ;
         if ( ( AV15BarPes > 0 ) && ( GXutil.strcmp(AV20BarUnimed, httpContext.getMessage( "M", "")) == 0 ) )
         {
            AV16Kgs = (A205BarPieMet.multiply(DecimalUtil.doubleToDec(AV15BarPes))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            A203BarPieKil = AV16Kgs ;
            AV17DisPiekil = AV16Kgs ;
            /* Optimized UPDATE. */
            /* Using cursor P02NF7 */
            pr_default.execute(5, new Object[] {AV16Kgs, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            /* End optimized UPDATE. */
         }
         /* Using cursor P02NF8 */
         pr_default.execute(6, new Object[] {A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         pr_default.readNext(4);
      }
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgspml.this.A396EmprCod;
      this.aP1[0] = pkgspml.this.A129BarCod;
      this.aP2[0] = pkgspml.this.A132BarCodReo;
      this.aP3[0] = pkgspml.this.A130BarCodPar;
      this.aP4[0] = pkgspml.this.AV15BarPes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkgspml");
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
      P02NF2_A396EmprCod = new String[] {""} ;
      P02NF2_A129BarCod = new int[1] ;
      P02NF2_A132BarCodReo = new byte[1] ;
      P02NF2_A130BarCodPar = new String[] {""} ;
      P02NF2_A864BarPes = new short[1] ;
      P02NF2_A228BarUniMed = new String[] {""} ;
      A228BarUniMed = "" ;
      AV20BarUnimed = "" ;
      P02NF3_A396EmprCod = new String[] {""} ;
      P02NF3_A129BarCod = new int[1] ;
      P02NF3_A132BarCodReo = new byte[1] ;
      P02NF3_A130BarCodPar = new String[] {""} ;
      P02NF3_A864BarPes = new short[1] ;
      P02NF3_A361DisCod = new int[1] ;
      P02NF4_A396EmprCod = new String[] {""} ;
      P02NF4_A361DisCod = new int[1] ;
      P02NF4_A342DisArtPes = new short[1] ;
      P02NF6_A396EmprCod = new String[] {""} ;
      P02NF6_A129BarCod = new int[1] ;
      P02NF6_A132BarCodReo = new byte[1] ;
      P02NF6_A130BarCodPar = new String[] {""} ;
      P02NF6_A200BarPieCod = new String[] {""} ;
      P02NF6_A44AlbRecCod = new int[1] ;
      P02NF6_A361DisCod = new int[1] ;
      P02NF6_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NF6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      AV16Kgs = DecimalUtil.ZERO ;
      AV17DisPiekil = DecimalUtil.ZERO ;
      A382DisPieKil = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgspml__default(),
         new Object[] {
             new Object[] {
            P02NF2_A396EmprCod, P02NF2_A129BarCod, P02NF2_A132BarCodReo, P02NF2_A130BarCodPar, P02NF2_A864BarPes, P02NF2_A228BarUniMed
            }
            , new Object[] {
            P02NF3_A396EmprCod, P02NF3_A129BarCod, P02NF3_A132BarCodReo, P02NF3_A130BarCodPar, P02NF3_A864BarPes, P02NF3_A361DisCod
            }
            , new Object[] {
            P02NF4_A396EmprCod, P02NF4_A361DisCod, P02NF4_A342DisArtPes
            }
            , new Object[] {
            }
            , new Object[] {
            P02NF6_A396EmprCod, P02NF6_A129BarCod, P02NF6_A132BarCodReo, P02NF6_A130BarCodPar, P02NF6_A200BarPieCod, P02NF6_A44AlbRecCod, P02NF6_A361DisCod, P02NF6_A205BarPieMet, P02NF6_A203BarPieKil
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
   private short AV15BarPes ;
   private short A864BarPes ;
   private short A342DisArtPes ;
   private short AV19Disartpes ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV18Discod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal AV16Kgs ;
   private java.math.BigDecimal AV17DisPiekil ;
   private java.math.BigDecimal A382DisPieKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A228BarUniMed ;
   private String AV20BarUnimed ;
   private String A200BarPieCod ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02NF2_A396EmprCod ;
   private int[] P02NF2_A129BarCod ;
   private byte[] P02NF2_A132BarCodReo ;
   private String[] P02NF2_A130BarCodPar ;
   private short[] P02NF2_A864BarPes ;
   private String[] P02NF2_A228BarUniMed ;
   private String[] P02NF3_A396EmprCod ;
   private int[] P02NF3_A129BarCod ;
   private byte[] P02NF3_A132BarCodReo ;
   private String[] P02NF3_A130BarCodPar ;
   private short[] P02NF3_A864BarPes ;
   private int[] P02NF3_A361DisCod ;
   private String[] P02NF4_A396EmprCod ;
   private int[] P02NF4_A361DisCod ;
   private short[] P02NF4_A342DisArtPes ;
   private String[] P02NF6_A396EmprCod ;
   private int[] P02NF6_A129BarCod ;
   private byte[] P02NF6_A132BarCodReo ;
   private String[] P02NF6_A130BarCodPar ;
   private String[] P02NF6_A200BarPieCod ;
   private int[] P02NF6_A44AlbRecCod ;
   private int[] P02NF6_A361DisCod ;
   private java.math.BigDecimal[] P02NF6_A205BarPieMet ;
   private java.math.BigDecimal[] P02NF6_A203BarPieKil ;
}

final  class pkgspml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02NF2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPes, BarUniMed FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02NF3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPes, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02NF4", "SELECT EmprCod, DisCod, DisArtPes FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02NF5", "UPDATE TXPBARCAD SET BarPes=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02NF6", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.AlbRecCod, T2.DisCod, T1.BarPieMet, T1.BarPieKil FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02NF7", "UPDATE TXPDISALD SET DisPieKil=?  WHERE (EmprCod = ? and DisCod = ? and AlbRecCod = ?) AND (DisPieCod = SUBSTR(?, 1, 8))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P02NF8", "UPDATE TXPBARPIE SET BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

