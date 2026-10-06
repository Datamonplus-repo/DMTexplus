package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putil32 extends GXProcedure
{
   public putil32( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putil32.class ), "" );
   }

   public putil32( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      putil32.this.aP1 = new long[] {0};
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
      putil32.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      putil32.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01OO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01OO2_A130BarCodPar[0] ;
         A132BarCodReo = P01OO2_A132BarCodReo[0] ;
         A129BarCod = P01OO2_A129BarCod[0] ;
         A2839AlbProVal = P01OO2_A2839AlbProVal[0] ;
         A1262BarPreKgm = P01OO2_A1262BarPreKgm[0] ;
         A1264BarPreMtr = P01OO2_A1264BarPreMtr[0] ;
         A2762AlbBarDto = P01OO2_A2762AlbBarDto[0] ;
         n2762AlbBarDto = P01OO2_n2762AlbBarDto[0] ;
         A2761AlbBarRec = P01OO2_A2761AlbBarRec[0] ;
         if ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 )
         {
            A1262BarPreKgm = DecimalUtil.doubleToDec(0) ;
            A1264BarPreMtr = DecimalUtil.doubleToDec(0) ;
            A2762AlbBarDto = DecimalUtil.doubleToDec(0) ;
            n2762AlbBarDto = false ;
            A2761AlbBarRec = DecimalUtil.doubleToDec(0) ;
            n4333ProPorRec = false ;
            n4332ProPreRec = false ;
            n1470AlbPrdPMt = false ;
            n1469AlbPrdPKg = false ;
            /* Optimized UPDATE. */
            /* Using cursor P01OO3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
            /* End optimized UPDATE. */
            /* Optimized UPDATE. */
            /* Using cursor P01OO4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            /* End optimized UPDATE. */
            /* Using cursor P01OO5 */
            pr_default.execute(3, new Object[] {A1262BarPreKgm, A1264BarPreMtr, Boolean.valueOf(n2762AlbBarDto), A2762AlbBarDto, A2761AlbBarRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P01OO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A130BarCodPar = P01OO6_A130BarCodPar[0] ;
         A132BarCodReo = P01OO6_A132BarCodReo[0] ;
         A129BarCod = P01OO6_A129BarCod[0] ;
         AV8MtsTrozo = DecimalUtil.doubleToDec(0) ;
         AV9kgsTrozo = DecimalUtil.doubleToDec(0) ;
         /* Optimized group. */
         /* Using cursor P01OO7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         c43AlbPTroMet = P01OO7_A43AlbPTroMet[0] ;
         c5303AlbPTroKil = P01OO7_A5303AlbPTroKil[0] ;
         pr_default.close(5);
         AV8MtsTrozo = AV8MtsTrozo.add(c43AlbPTroMet) ;
         AV9kgsTrozo = AV9kgsTrozo.add(c5303AlbPTroKil) ;
         /* End optimized group. */
         pr_default.readNext(4);
      }
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = putil32.this.A396EmprCod;
      this.aP1[0] = putil32.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "putil32");
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
      P01OO2_A396EmprCod = new String[] {""} ;
      P01OO2_A30AlbProCod = new long[1] ;
      P01OO2_A130BarCodPar = new String[] {""} ;
      P01OO2_A132BarCodReo = new byte[1] ;
      P01OO2_A129BarCod = new int[1] ;
      P01OO2_A2839AlbProVal = new String[] {""} ;
      P01OO2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01OO2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01OO2_A2762AlbBarDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01OO2_n2762AlbBarDto = new boolean[] {false} ;
      P01OO2_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A2839AlbProVal = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      P01OO6_A396EmprCod = new String[] {""} ;
      P01OO6_A30AlbProCod = new long[1] ;
      P01OO6_A130BarCodPar = new String[] {""} ;
      P01OO6_A132BarCodReo = new byte[1] ;
      P01OO6_A129BarCod = new int[1] ;
      AV8MtsTrozo = DecimalUtil.ZERO ;
      AV9kgsTrozo = DecimalUtil.ZERO ;
      c43AlbPTroMet = DecimalUtil.ZERO ;
      c5303AlbPTroKil = DecimalUtil.ZERO ;
      P01OO7_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01OO7_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.putil32__default(),
         new Object[] {
             new Object[] {
            P01OO2_A396EmprCod, P01OO2_A30AlbProCod, P01OO2_A130BarCodPar, P01OO2_A132BarCodReo, P01OO2_A129BarCod, P01OO2_A2839AlbProVal, P01OO2_A1262BarPreKgm, P01OO2_A1264BarPreMtr, P01OO2_A2762AlbBarDto, P01OO2_n2762AlbBarDto,
            P01OO2_A2761AlbBarRec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01OO6_A396EmprCod, P01OO6_A30AlbProCod, P01OO6_A130BarCodPar, P01OO6_A132BarCodReo, P01OO6_A129BarCod
            }
            , new Object[] {
            P01OO7_A43AlbPTroMet, P01OO7_A5303AlbPTroKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal AV8MtsTrozo ;
   private java.math.BigDecimal AV9kgsTrozo ;
   private java.math.BigDecimal c43AlbPTroMet ;
   private java.math.BigDecimal c5303AlbPTroKil ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2839AlbProVal ;
   private boolean n2762AlbBarDto ;
   private boolean n4333ProPorRec ;
   private boolean n4332ProPreRec ;
   private boolean n1470AlbPrdPMt ;
   private boolean n1469AlbPrdPKg ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01OO2_A396EmprCod ;
   private long[] P01OO2_A30AlbProCod ;
   private String[] P01OO2_A130BarCodPar ;
   private byte[] P01OO2_A132BarCodReo ;
   private int[] P01OO2_A129BarCod ;
   private String[] P01OO2_A2839AlbProVal ;
   private java.math.BigDecimal[] P01OO2_A1262BarPreKgm ;
   private java.math.BigDecimal[] P01OO2_A1264BarPreMtr ;
   private java.math.BigDecimal[] P01OO2_A2762AlbBarDto ;
   private boolean[] P01OO2_n2762AlbBarDto ;
   private java.math.BigDecimal[] P01OO2_A2761AlbBarRec ;
   private String[] P01OO6_A396EmprCod ;
   private long[] P01OO6_A30AlbProCod ;
   private String[] P01OO6_A130BarCodPar ;
   private byte[] P01OO6_A132BarCodReo ;
   private int[] P01OO6_A129BarCod ;
   private java.math.BigDecimal[] P01OO7_A43AlbPTroMet ;
   private java.math.BigDecimal[] P01OO7_A5303AlbPTroKil ;
}

final  class putil32__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01OO2", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, AlbProVal, BarPreKgm, BarPreMtr, AlbBarDto, AlbBarRec FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01OO3", "UPDATE TXPALBPRD SET ProPorRec=0, ProPreRec=0, AlbPrdPMt=0, AlbPrdPKg=0  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
         ,new UpdateCursor("P01OO4", "UPDATE TXPALBFAS SET GuiFasPMt=0, GuiFasPKg=0  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P01OO5", "UPDATE TXPALBBAR SET BarPreKgm=?, BarPreMtr=?, AlbBarDto=?, AlbBarRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P01OO6", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01OO7", "SELECT SUM(AlbPTroMet), SUM(AlbPTroKil) FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(5, (String)parms[5], 3);
               stmt.setLong(6, ((Number) parms[6]).longValue());
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

