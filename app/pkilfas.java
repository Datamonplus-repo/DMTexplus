package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilfas extends GXProcedure
{
   public pkilfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilfas.class ), "" );
   }

   public pkilfas( int remoteHandle ,
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
      pkilfas.this.aP4 = new String[] {""};
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
      pkilfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilfas.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pkilfas.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pkilfas.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pkilfas.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Flagmarpei = (byte)(0) ;
      AV24F_carvema = (byte)(0) ;
      AV18FlagVt = (byte)(0) ;
      GXt_int1 = AV17Flagmarpei ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARPEI", ""), GXv_int2) ;
      pkilfas.this.GXt_int1 = GXv_int2[0] ;
      AV17Flagmarpei = GXt_int1 ;
      GXt_int1 = AV24F_carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      pkilfas.this.GXt_int1 = GXv_int2[0] ;
      AV24F_carvema = GXt_int1 ;
      GXt_int1 = AV30Lamina ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAMINA", ""), GXv_int2) ;
      pkilfas.this.GXt_int1 = GXv_int2[0] ;
      AV30Lamina = GXt_int1 ;
      GXt_int1 = AV31Grm2Control ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERGRM2", ""), GXv_int2) ;
      pkilfas.this.GXt_int1 = GXv_int2[0] ;
      AV31Grm2Control = GXt_int1 ;
      GXt_int1 = AV18FlagVt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VTABUA", ""), GXv_int2) ;
      pkilfas.this.GXt_int1 = GXv_int2[0] ;
      AV18FlagVt = GXt_int1 ;
      GXt_int3 = AV32vGrm2 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERGRM2", ""), GXv_int4) ;
      pkilfas.this.GXt_int3 = GXv_int4[0] ;
      AV32vGrm2 = (short)(GXt_int3) ;
      if ( ( AV18FlagVt == 1 ) || ( AV30Lamina == 1 ) )
      {
         /* Using cursor P008I2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = P008I2_A252CliCod[0] ;
            n252CliCod = P008I2_n252CliCod[0] ;
            A4716BarDishCod = P008I2_A4716BarDishCod[0] ;
            A5026BarTipEst = P008I2_A5026BarTipEst[0] ;
            A5027BarGraCob = P008I2_A5027BarGraCob[0] ;
            A2827BarKgsLot = P008I2_A2827BarKgsLot[0] ;
            AV20CliCod = A252CliCod ;
            AV19BarDishcod = A4716BarDishCod ;
            AV21BarTipEst = A5026BarTipEst ;
            AV22BarGraCob = A5027BarGraCob ;
            AV29Barkgslot = A2827BarKgsLot ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      /* Using cursor P008I3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1261BarAlbKgmE = P008I3_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P008I3_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P008I3_A1265BarAlbPie[0] ;
         A5019AlbHdrgm2 = P008I3_A5019AlbHdrgm2[0] ;
         AV15Kilos = A1261BarAlbKgmE ;
         AV16Metros = A1263BarAlbMtrE ;
         AV25Pie_a = A1265BarAlbPie ;
         AV33BarGraAca = A5019AlbHdrgm2 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P008I4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A460FasDsc = P008I4_A460FasDsc[0] ;
         A1275FasKgm = P008I4_A1275FasKgm[0] ;
         A1241GuiFasPKg = P008I4_A1241GuiFasPKg[0] ;
         A1242GuiFasPMt = P008I4_A1242GuiFasPMt[0] ;
         A1276FasMtr = P008I4_A1276FasMtr[0] ;
         A457FasCod = P008I4_A457FasCod[0] ;
         A1240GuiFasLin = P008I4_A1240GuiFasLin[0] ;
         A460FasDsc = P008I4_A460FasDsc[0] ;
         if ( GXutil.like( A460FasDsc , GXutil.padr( httpContext.getMessage( "%LAMINAR%", "") , 254 , "%"),  ' ' ) && ( AV30Lamina == 1 ) )
         {
            A1275FasKgm = AV29Barkgslot ;
         }
         else
         {
            if ( AV24F_carvema == 1 )
            {
               if ( A1241GuiFasPKg.doubleValue() > 0 )
               {
                  A1275FasKgm = AV15Kilos ;
               }
               if ( A1242GuiFasPMt.doubleValue() > 0 )
               {
                  A1276FasMtr = AV16Metros ;
               }
            }
            else
            {
               A1275FasKgm = AV15Kilos ;
               A1276FasMtr = AV16Metros ;
            }
            if ( ( AV24F_carvema == 1 ) && ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "EMBALAR", "")) == 0 ) )
            {
               A1275FasKgm = DecimalUtil.doubleToDec(AV25Pie_a) ;
            }
            if ( ( AV31Grm2Control == 1 ) && ( AV33BarGraAca > AV32vGrm2 ) )
            {
               A1276FasMtr = DecimalUtil.doubleToDec(0) ;
            }
         }
         /* Using cursor P008I5 */
         pr_default.execute(3, new Object[] {A1275FasKgm, A1276FasMtr, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilfas.this.A396EmprCod;
      this.aP1[0] = pkilfas.this.A30AlbProCod;
      this.aP2[0] = pkilfas.this.A129BarCod;
      this.aP3[0] = pkilfas.this.A132BarCodReo;
      this.aP4[0] = pkilfas.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkilfas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      GXv_int4 = new int[1] ;
      scmdbuf = "" ;
      P008I2_A396EmprCod = new String[] {""} ;
      P008I2_A129BarCod = new int[1] ;
      P008I2_A132BarCodReo = new byte[1] ;
      P008I2_A130BarCodPar = new String[] {""} ;
      P008I2_A252CliCod = new int[1] ;
      P008I2_n252CliCod = new boolean[] {false} ;
      P008I2_A4716BarDishCod = new String[] {""} ;
      P008I2_A5026BarTipEst = new byte[1] ;
      P008I2_A5027BarGraCob = new byte[1] ;
      P008I2_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4716BarDishCod = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      AV19BarDishcod = "" ;
      AV29Barkgslot = DecimalUtil.ZERO ;
      P008I3_A396EmprCod = new String[] {""} ;
      P008I3_A30AlbProCod = new long[1] ;
      P008I3_A129BarCod = new int[1] ;
      P008I3_A132BarCodReo = new byte[1] ;
      P008I3_A130BarCodPar = new String[] {""} ;
      P008I3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008I3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008I3_A1265BarAlbPie = new int[1] ;
      P008I3_A5019AlbHdrgm2 = new short[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV15Kilos = DecimalUtil.ZERO ;
      AV16Metros = DecimalUtil.ZERO ;
      P008I4_A396EmprCod = new String[] {""} ;
      P008I4_A30AlbProCod = new long[1] ;
      P008I4_A129BarCod = new int[1] ;
      P008I4_A132BarCodReo = new byte[1] ;
      P008I4_A130BarCodPar = new String[] {""} ;
      P008I4_A460FasDsc = new String[] {""} ;
      P008I4_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008I4_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008I4_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008I4_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008I4_A457FasCod = new String[] {""} ;
      P008I4_A1240GuiFasLin = new short[1] ;
      A460FasDsc = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkilfas__default(),
         new Object[] {
             new Object[] {
            P008I2_A396EmprCod, P008I2_A129BarCod, P008I2_A132BarCodReo, P008I2_A130BarCodPar, P008I2_A252CliCod, P008I2_n252CliCod, P008I2_A4716BarDishCod, P008I2_A5026BarTipEst, P008I2_A5027BarGraCob, P008I2_A2827BarKgsLot
            }
            , new Object[] {
            P008I3_A396EmprCod, P008I3_A30AlbProCod, P008I3_A129BarCod, P008I3_A132BarCodReo, P008I3_A130BarCodPar, P008I3_A1261BarAlbKgmE, P008I3_A1263BarAlbMtrE, P008I3_A1265BarAlbPie, P008I3_A5019AlbHdrgm2
            }
            , new Object[] {
            P008I4_A396EmprCod, P008I4_A30AlbProCod, P008I4_A129BarCod, P008I4_A132BarCodReo, P008I4_A130BarCodPar, P008I4_A460FasDsc, P008I4_A1275FasKgm, P008I4_A1241GuiFasPKg, P008I4_A1242GuiFasPMt, P008I4_A1276FasMtr,
            P008I4_A457FasCod, P008I4_A1240GuiFasLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17Flagmarpei ;
   private byte AV24F_carvema ;
   private byte AV18FlagVt ;
   private byte AV30Lamina ;
   private byte AV31Grm2Control ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A5026BarTipEst ;
   private byte A5027BarGraCob ;
   private byte AV21BarTipEst ;
   private byte AV22BarGraCob ;
   private short AV32vGrm2 ;
   private short A5019AlbHdrgm2 ;
   private short AV33BarGraAca ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int A252CliCod ;
   private int AV20CliCod ;
   private int A1265BarAlbPie ;
   private int AV25Pie_a ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal AV29Barkgslot ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16Metros ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A4716BarDishCod ;
   private String AV19BarDishcod ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private boolean n252CliCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P008I2_A396EmprCod ;
   private int[] P008I2_A129BarCod ;
   private byte[] P008I2_A132BarCodReo ;
   private String[] P008I2_A130BarCodPar ;
   private int[] P008I2_A252CliCod ;
   private boolean[] P008I2_n252CliCod ;
   private String[] P008I2_A4716BarDishCod ;
   private byte[] P008I2_A5026BarTipEst ;
   private byte[] P008I2_A5027BarGraCob ;
   private java.math.BigDecimal[] P008I2_A2827BarKgsLot ;
   private String[] P008I3_A396EmprCod ;
   private long[] P008I3_A30AlbProCod ;
   private int[] P008I3_A129BarCod ;
   private byte[] P008I3_A132BarCodReo ;
   private String[] P008I3_A130BarCodPar ;
   private java.math.BigDecimal[] P008I3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P008I3_A1263BarAlbMtrE ;
   private int[] P008I3_A1265BarAlbPie ;
   private short[] P008I3_A5019AlbHdrgm2 ;
   private String[] P008I4_A396EmprCod ;
   private long[] P008I4_A30AlbProCod ;
   private int[] P008I4_A129BarCod ;
   private byte[] P008I4_A132BarCodReo ;
   private String[] P008I4_A130BarCodPar ;
   private String[] P008I4_A460FasDsc ;
   private java.math.BigDecimal[] P008I4_A1275FasKgm ;
   private java.math.BigDecimal[] P008I4_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P008I4_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P008I4_A1276FasMtr ;
   private String[] P008I4_A457FasCod ;
   private short[] P008I4_A1240GuiFasLin ;
}

final  class pkilfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008I2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarDishCod, BarTipEst, BarGraCob, BarKgsLot FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008I3", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, BarAlbMtrE, BarAlbPie, AlbHdrgm2 FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008I4", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.FasKgm, T1.GuiFasPKg, T1.GuiFasPMt, T1.FasMtr, T1.FasCod, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008I5", "UPDATE TXPALBFAS SET FasKgm=?, FasMtr=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

