package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc280 extends GXProcedure
{
   public pprc280( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc280.class ), "" );
   }

   public pprc280( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             long[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      pprc280.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        long[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             long[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      pprc280.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc280.this.AV19FacCod = aP1[0];
      this.aP1 = aP1;
      pprc280.this.AV8FacAlbCod = aP2[0];
      this.aP2 = aP2;
      pprc280.this.AV12FacAlbTip = aP3[0];
      this.aP3 = aP3;
      pprc280.this.AV13FacBarCod = aP4[0];
      this.aP4 = aP4;
      pprc280.this.AV14FacBarReo = aP5[0];
      this.aP5 = aP5;
      pprc280.this.AV15FacBarPar = aP6[0];
      this.aP6 = aP6;
      pprc280.this.AV9FacPreKgs = aP7[0];
      this.aP7 = aP7;
      pprc280.this.AV10FacPreMts = aP8[0];
      this.aP8 = aP8;
      pprc280.this.AV11FacFasCod = aP9[0];
      this.aP9 = aP9;
      pprc280.this.AV16usurcod = aP10[0];
      this.aP10 = aP10;
      pprc280.this.AV17station = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( AV12FacAlbTip == 1 ) && (GXutil.strcmp("", AV11FacFasCod)==0) )
      {
         /* Using cursor P09YO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV8FacAlbCod), Integer.valueOf(AV13FacBarCod), Byte.valueOf(AV14FacBarReo), AV15FacBarPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P09YO2_A130BarCodPar[0] ;
            A132BarCodReo = P09YO2_A132BarCodReo[0] ;
            A129BarCod = P09YO2_A129BarCod[0] ;
            A30AlbProCod = P09YO2_A30AlbProCod[0] ;
            A1262BarPreKgm = P09YO2_A1262BarPreKgm[0] ;
            A1264BarPreMtr = P09YO2_A1264BarPreMtr[0] ;
            AV18Inc_obs = httpContext.getMessage( "Cambios Precios", "") + GXutil.newLine( ) ;
            AV18Inc_obs += httpContext.getMessage( "Guia =", "") + GXutil.trim( GXutil.str( AV8FacAlbCod, 10, 0)) + httpContext.getMessage( ", OS =", "") + GXutil.trim( GXutil.str( AV13FacBarCod, 8, 0)) + "-" + GXutil.str( AV14FacBarReo, 1, 0) + AV15FacBarPar + GXutil.newLine( ) ;
            AV18Inc_obs += httpContext.getMessage( "Precio kg ", "") + GXutil.trim( GXutil.str( A1262BarPreKgm, 13, 5)) + httpContext.getMessage( " se cambia por ", "") + GXutil.trim( GXutil.str( AV9FacPreKgs, 13, 5)) + GXutil.newLine( ) ;
            AV18Inc_obs += httpContext.getMessage( "Precio mt ", "") + GXutil.trim( GXutil.str( A1264BarPreMtr, 13, 5)) + httpContext.getMessage( " se cambia por ", "") + GXutil.trim( GXutil.str( AV10FacPreMts, 13, 5)) + GXutil.newLine( ) ;
            A1262BarPreKgm = AV9FacPreKgs ;
            A1264BarPreMtr = AV10FacPreMts ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV23Pgmname, AV16usurcod, AV17station, AV18Inc_obs, AV19FacCod, (byte)(0), "") ;
            /* Using cursor P09YO3 */
            pr_default.execute(1, new Object[] {A1262BarPreKgm, A1264BarPreMtr, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else if ( ( AV12FacAlbTip == 1 ) && ! (GXutil.strcmp("", AV11FacFasCod)==0) )
      {
         /* Using cursor P09YO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(AV8FacAlbCod), Integer.valueOf(AV13FacBarCod), Byte.valueOf(AV14FacBarReo), AV15FacBarPar, AV11FacFasCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A457FasCod = P09YO4_A457FasCod[0] ;
            A130BarCodPar = P09YO4_A130BarCodPar[0] ;
            A132BarCodReo = P09YO4_A132BarCodReo[0] ;
            A129BarCod = P09YO4_A129BarCod[0] ;
            A30AlbProCod = P09YO4_A30AlbProCod[0] ;
            A1241GuiFasPKg = P09YO4_A1241GuiFasPKg[0] ;
            A1242GuiFasPMt = P09YO4_A1242GuiFasPMt[0] ;
            A1240GuiFasLin = P09YO4_A1240GuiFasLin[0] ;
            AV18Inc_obs = httpContext.getMessage( "Cambios Precios Fases", "") + GXutil.newLine( ) ;
            AV18Inc_obs += httpContext.getMessage( "Guia =", "") + GXutil.trim( GXutil.str( AV8FacAlbCod, 10, 0)) + httpContext.getMessage( ", OS =", "") + GXutil.trim( GXutil.str( AV13FacBarCod, 8, 0)) + "-" + GXutil.str( AV14FacBarReo, 1, 0) + AV15FacBarPar + GXutil.newLine( ) + httpContext.getMessage( " Fase =", "") + GXutil.trim( A457FasCod) ;
            AV18Inc_obs += httpContext.getMessage( "Precio kg ", "") + GXutil.trim( GXutil.str( A1241GuiFasPKg, 13, 5)) + httpContext.getMessage( " se cambia por ", "") + GXutil.trim( GXutil.str( AV9FacPreKgs, 13, 5)) + GXutil.newLine( ) ;
            AV18Inc_obs += httpContext.getMessage( "Precio mt ", "") + GXutil.trim( GXutil.str( A1242GuiFasPMt, 13, 5)) + httpContext.getMessage( " se cambia por ", "") + GXutil.trim( GXutil.str( AV10FacPreMts, 13, 5)) + GXutil.newLine( ) ;
            A1241GuiFasPKg = AV9FacPreKgs ;
            A1242GuiFasPMt = AV10FacPreMts ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV23Pgmname, AV16usurcod, AV17station, AV18Inc_obs, AV19FacCod, (byte)(0), "") ;
            /* Using cursor P09YO5 */
            pr_default.execute(3, new Object[] {A1241GuiFasPKg, A1242GuiFasPMt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc280.this.A396EmprCod;
      this.aP1[0] = pprc280.this.AV19FacCod;
      this.aP2[0] = pprc280.this.AV8FacAlbCod;
      this.aP3[0] = pprc280.this.AV12FacAlbTip;
      this.aP4[0] = pprc280.this.AV13FacBarCod;
      this.aP5[0] = pprc280.this.AV14FacBarReo;
      this.aP6[0] = pprc280.this.AV15FacBarPar;
      this.aP7[0] = pprc280.this.AV9FacPreKgs;
      this.aP8[0] = pprc280.this.AV10FacPreMts;
      this.aP9[0] = pprc280.this.AV11FacFasCod;
      this.aP10[0] = pprc280.this.AV16usurcod;
      this.aP11[0] = pprc280.this.AV17station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc280");
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
      P09YO2_A396EmprCod = new String[] {""} ;
      P09YO2_A130BarCodPar = new String[] {""} ;
      P09YO2_A132BarCodReo = new byte[1] ;
      P09YO2_A129BarCod = new int[1] ;
      P09YO2_A30AlbProCod = new long[1] ;
      P09YO2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YO2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      AV18Inc_obs = "" ;
      AV23Pgmname = "" ;
      P09YO4_A396EmprCod = new String[] {""} ;
      P09YO4_A457FasCod = new String[] {""} ;
      P09YO4_A130BarCodPar = new String[] {""} ;
      P09YO4_A132BarCodReo = new byte[1] ;
      P09YO4_A129BarCod = new int[1] ;
      P09YO4_A30AlbProCod = new long[1] ;
      P09YO4_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YO4_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YO4_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc280__default(),
         new Object[] {
             new Object[] {
            P09YO2_A396EmprCod, P09YO2_A130BarCodPar, P09YO2_A132BarCodReo, P09YO2_A129BarCod, P09YO2_A30AlbProCod, P09YO2_A1262BarPreKgm, P09YO2_A1264BarPreMtr
            }
            , new Object[] {
            }
            , new Object[] {
            P09YO4_A396EmprCod, P09YO4_A457FasCod, P09YO4_A130BarCodPar, P09YO4_A132BarCodReo, P09YO4_A129BarCod, P09YO4_A30AlbProCod, P09YO4_A1241GuiFasPKg, P09YO4_A1242GuiFasPMt, P09YO4_A1240GuiFasLin
            }
            , new Object[] {
            }
         }
      );
      AV23Pgmname = "PPrc280" ;
      /* GeneXus formulas. */
      AV23Pgmname = "PPrc280" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12FacAlbTip ;
   private byte AV14FacBarReo ;
   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV19FacCod ;
   private int AV13FacBarCod ;
   private int A129BarCod ;
   private long AV8FacAlbCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV9FacPreKgs ;
   private java.math.BigDecimal AV10FacPreMts ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private String A396EmprCod ;
   private String AV15FacBarPar ;
   private String AV11FacFasCod ;
   private String AV16usurcod ;
   private String AV17station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV23Pgmname ;
   private String A457FasCod ;
   private String AV18Inc_obs ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private long[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P09YO2_A396EmprCod ;
   private String[] P09YO2_A130BarCodPar ;
   private byte[] P09YO2_A132BarCodReo ;
   private int[] P09YO2_A129BarCod ;
   private long[] P09YO2_A30AlbProCod ;
   private java.math.BigDecimal[] P09YO2_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09YO2_A1264BarPreMtr ;
   private String[] P09YO4_A396EmprCod ;
   private String[] P09YO4_A457FasCod ;
   private String[] P09YO4_A130BarCodPar ;
   private byte[] P09YO4_A132BarCodReo ;
   private int[] P09YO4_A129BarCod ;
   private long[] P09YO4_A30AlbProCod ;
   private java.math.BigDecimal[] P09YO4_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P09YO4_A1242GuiFasPMt ;
   private short[] P09YO4_A1240GuiFasLin ;
}

final  class pprc280__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YO2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarPreKgm, BarPreMtr FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09YO3", "UPDATE TXPALBBAR SET BarPreKgm=?, BarPreMtr=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P09YO4", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, AlbProCod, GuiFasPKg, GuiFasPMt, GuiFasLin FROM TXPALBFAS WHERE (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09YO5", "UPDATE TXPALBFAS SET GuiFasPKg=?, GuiFasPMt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
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

