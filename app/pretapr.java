package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pretapr extends GXProcedure
{
   public pretapr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pretapr.class ), "" );
   }

   public pretapr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pretapr.this.aP1 = new long[] {0};
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
      pretapr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pretapr.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00OE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A33AlbProEst = P00OE2_A33AlbProEst[0] ;
         /* Optimized DELETE. */
         /* Using cursor P00OE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P00OE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         /* End optimized DELETE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00OE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A33AlbProEst = P00OE5_A33AlbProEst[0] ;
         /* Using cursor P00OE6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A129BarCod = P00OE6_A129BarCod[0] ;
            A132BarCodReo = P00OE6_A132BarCodReo[0] ;
            A130BarCodPar = P00OE6_A130BarCodPar[0] ;
            A32AlbProEsp = P00OE6_A32AlbProEsp[0] ;
            A40AlbProRec = P00OE6_A40AlbProRec[0] ;
            A1262BarPreKgm = P00OE6_A1262BarPreKgm[0] ;
            A1264BarPreMtr = P00OE6_A1264BarPreMtr[0] ;
            A2761AlbBarRec = P00OE6_A2761AlbBarRec[0] ;
            A2762AlbBarDto = P00OE6_A2762AlbBarDto[0] ;
            n2762AlbBarDto = P00OE6_n2762AlbBarDto[0] ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_decimal5[0] = AV15PreKgs ;
            GXv_decimal6[0] = AV16PreMtr ;
            GXv_int7[0] = AV19Operesp ;
            GXv_decimal8[0] = AV20TotRec ;
            GXv_decimal9[0] = AV17Recar ;
            GXv_decimal10[0] = AV18Dtos ;
            new app.ptarpre(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_decimal10) ;
            pretapr.this.A396EmprCod = GXv_char1[0] ;
            pretapr.this.A129BarCod = GXv_int2[0] ;
            pretapr.this.A132BarCodReo = GXv_int3[0] ;
            pretapr.this.A130BarCodPar = GXv_char4[0] ;
            pretapr.this.AV15PreKgs = GXv_decimal5[0] ;
            pretapr.this.AV16PreMtr = GXv_decimal6[0] ;
            pretapr.this.AV19Operesp = GXv_int7[0] ;
            pretapr.this.AV20TotRec = GXv_decimal8[0] ;
            pretapr.this.AV17Recar = GXv_decimal9[0] ;
            pretapr.this.AV18Dtos = GXv_decimal10[0] ;
            A32AlbProEsp = AV19Operesp ;
            A40AlbProRec = AV20TotRec ;
            A1262BarPreKgm = AV15PreKgs ;
            A1264BarPreMtr = AV16PreMtr ;
            A2761AlbBarRec = AV17Recar ;
            A2762AlbBarDto = AV18Dtos ;
            n2762AlbBarDto = false ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int11[0] = A30AlbProCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int7[0] = A132BarCodReo ;
            GXv_char1[0] = A130BarCodPar ;
            GXv_char12[0] = httpContext.getMessage( "A", "") ;
            new app.pnewtxt(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int2, GXv_int7, GXv_char1, GXv_char12) ;
            pretapr.this.A396EmprCod = GXv_char4[0] ;
            pretapr.this.A30AlbProCod = GXv_int11[0] ;
            pretapr.this.A129BarCod = GXv_int2[0] ;
            pretapr.this.A132BarCodReo = GXv_int7[0] ;
            pretapr.this.A130BarCodPar = GXv_char1[0] ;
            GXv_char12[0] = A396EmprCod ;
            GXv_int11[0] = A30AlbProCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int7[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_char1[0] = httpContext.getMessage( "A", "") ;
            new app.pnewope(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_int2, GXv_int7, GXv_char4, GXv_char1) ;
            pretapr.this.A396EmprCod = GXv_char12[0] ;
            pretapr.this.A30AlbProCod = GXv_int11[0] ;
            pretapr.this.A129BarCod = GXv_int2[0] ;
            pretapr.this.A132BarCodReo = GXv_int7[0] ;
            pretapr.this.A130BarCodPar = GXv_char4[0] ;
            /* Using cursor P00OE7 */
            pr_default.execute(5, new Object[] {Byte.valueOf(A32AlbProEsp), A40AlbProRec, A1262BarPreKgm, A1264BarPreMtr, A2761AlbBarRec, Boolean.valueOf(n2762AlbBarDto), A2762AlbBarDto, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pretapr.this.A396EmprCod;
      this.aP1[0] = pretapr.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pretapr");
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
      P00OE2_A396EmprCod = new String[] {""} ;
      P00OE2_A30AlbProCod = new long[1] ;
      P00OE2_A33AlbProEst = new byte[1] ;
      P00OE5_A396EmprCod = new String[] {""} ;
      P00OE5_A30AlbProCod = new long[1] ;
      P00OE5_A33AlbProEst = new byte[1] ;
      P00OE6_A396EmprCod = new String[] {""} ;
      P00OE6_A30AlbProCod = new long[1] ;
      P00OE6_A129BarCod = new int[1] ;
      P00OE6_A132BarCodReo = new byte[1] ;
      P00OE6_A130BarCodPar = new String[] {""} ;
      P00OE6_A32AlbProEsp = new byte[1] ;
      P00OE6_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OE6_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OE6_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OE6_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OE6_A2762AlbBarDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OE6_n2762AlbBarDto = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      GXv_int3 = new byte[1] ;
      AV15PreKgs = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV16PreMtr = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV20TotRec = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV17Recar = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV18Dtos = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char12 = new String[1] ;
      GXv_int11 = new long[1] ;
      GXv_int2 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pretapr__default(),
         new Object[] {
             new Object[] {
            P00OE2_A396EmprCod, P00OE2_A30AlbProCod, P00OE2_A33AlbProEst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00OE5_A396EmprCod, P00OE5_A30AlbProCod, P00OE5_A33AlbProEst
            }
            , new Object[] {
            P00OE6_A396EmprCod, P00OE6_A30AlbProCod, P00OE6_A129BarCod, P00OE6_A132BarCodReo, P00OE6_A130BarCodPar, P00OE6_A32AlbProEsp, P00OE6_A40AlbProRec, P00OE6_A1262BarPreKgm, P00OE6_A1264BarPreMtr, P00OE6_A2761AlbBarRec,
            P00OE6_A2762AlbBarDto, P00OE6_n2762AlbBarDto
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private byte GXv_int3[] ;
   private byte AV19Operesp ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private long A30AlbProCod ;
   private long GXv_int11[] ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal AV15PreKgs ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV16PreMtr ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV20TotRec ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV17Recar ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV18Dtos ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String GXv_char12[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private boolean n2762AlbBarDto ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00OE2_A396EmprCod ;
   private long[] P00OE2_A30AlbProCod ;
   private byte[] P00OE2_A33AlbProEst ;
   private String[] P00OE5_A396EmprCod ;
   private long[] P00OE5_A30AlbProCod ;
   private byte[] P00OE5_A33AlbProEst ;
   private String[] P00OE6_A396EmprCod ;
   private long[] P00OE6_A30AlbProCod ;
   private int[] P00OE6_A129BarCod ;
   private byte[] P00OE6_A132BarCodReo ;
   private String[] P00OE6_A130BarCodPar ;
   private byte[] P00OE6_A32AlbProEsp ;
   private java.math.BigDecimal[] P00OE6_A40AlbProRec ;
   private java.math.BigDecimal[] P00OE6_A1262BarPreKgm ;
   private java.math.BigDecimal[] P00OE6_A1264BarPreMtr ;
   private java.math.BigDecimal[] P00OE6_A2761AlbBarRec ;
   private java.math.BigDecimal[] P00OE6_A2762AlbBarDto ;
   private boolean[] P00OE6_n2762AlbBarDto ;
}

final  class pretapr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00OE2", "SELECT EmprCod, AlbProCod, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00OE3", "DELETE FROM TXPALBTXT  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
         ,new UpdateCursor("P00OE4", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new ForEachCursor("P00OE5", "SELECT EmprCod, AlbProCod, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00OE6", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbProEsp, AlbProRec, BarPreKgm, BarPreMtr, AlbBarRec, AlbBarDto FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00OE7", "UPDATE TXPALBBAR SET AlbProEsp=?, AlbProRec=?, BarPreKgm=?, BarPreMtr=?, AlbBarRec=?, AlbBarDto=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               stmt.setString(7, (String)parms[7], 3);
               stmt.setLong(8, ((Number) parms[8]).longValue());
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setString(11, (String)parms[11], 1);
               return;
      }
   }

}

