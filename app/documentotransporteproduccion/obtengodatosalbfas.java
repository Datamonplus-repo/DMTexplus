package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengodatosalbfas extends GXProcedure
{
   public obtengodatosalbfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengodatosalbfas.class ), "" );
   }

   public obtengodatosalbfas( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            long aP1 ,
                            int aP2 ,
                            byte aP3 ,
                            String aP4 ,
                            short aP5 ,
                            String[] aP6 ,
                            String[] aP7 ,
                            java.math.BigDecimal[] aP8 ,
                            java.math.BigDecimal[] aP9 ,
                            java.math.BigDecimal[] aP10 ,
                            java.math.BigDecimal[] aP11 )
   {
      obtengodatosalbfas.this.aP12 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        short aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        short[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             short aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             short[] aP12 )
   {
      obtengodatosalbfas.this.A396EmprCod = aP0;
      obtengodatosalbfas.this.A30AlbProCod = aP1;
      obtengodatosalbfas.this.A129BarCod = aP2;
      obtengodatosalbfas.this.A132BarCodReo = aP3;
      obtengodatosalbfas.this.A130BarCodPar = aP4;
      obtengodatosalbfas.this.A1240GuiFasLin = aP5;
      obtengodatosalbfas.this.aP6 = aP6;
      obtengodatosalbfas.this.aP7 = aP7;
      obtengodatosalbfas.this.aP8 = aP8;
      obtengodatosalbfas.this.aP9 = aP9;
      obtengodatosalbfas.this.aP10 = aP10;
      obtengodatosalbfas.this.aP11 = aP11;
      obtengodatosalbfas.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FasCod = "" ;
      AV9FasDsc = "" ;
      AV12Faskg = (short)(0) ;
      AV10fasmtr = DecimalUtil.ZERO ;
      AV13GuiFasPKg = DecimalUtil.ZERO ;
      AV11GuiFasPMt = DecimalUtil.ZERO ;
      AV15albfas = (short)(0) ;
      /* Using cursor P0AHA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P0AHA2_A457FasCod[0] ;
         A460FasDsc = P0AHA2_A460FasDsc[0] ;
         A1275FasKgm = P0AHA2_A1275FasKgm[0] ;
         A1276FasMtr = P0AHA2_A1276FasMtr[0] ;
         A1241GuiFasPKg = P0AHA2_A1241GuiFasPKg[0] ;
         A1242GuiFasPMt = P0AHA2_A1242GuiFasPMt[0] ;
         A460FasDsc = P0AHA2_A460FasDsc[0] ;
         AV8FasCod = A457FasCod ;
         AV9FasDsc = A460FasDsc ;
         AV14Faskgm = A1275FasKgm ;
         AV10fasmtr = A1276FasMtr ;
         AV13GuiFasPKg = A1241GuiFasPKg ;
         AV11GuiFasPMt = A1242GuiFasPMt ;
         AV15albfas = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = obtengodatosalbfas.this.AV8FasCod;
      this.aP7[0] = obtengodatosalbfas.this.AV9FasDsc;
      this.aP8[0] = obtengodatosalbfas.this.AV14Faskgm;
      this.aP9[0] = obtengodatosalbfas.this.AV13GuiFasPKg;
      this.aP10[0] = obtengodatosalbfas.this.AV10fasmtr;
      this.aP11[0] = obtengodatosalbfas.this.AV11GuiFasPMt;
      this.aP12[0] = obtengodatosalbfas.this.AV15albfas;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8FasCod = "" ;
      AV9FasDsc = "" ;
      AV14Faskgm = DecimalUtil.ZERO ;
      AV13GuiFasPKg = DecimalUtil.ZERO ;
      AV10fasmtr = DecimalUtil.ZERO ;
      AV11GuiFasPMt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AHA2_A396EmprCod = new String[] {""} ;
      P0AHA2_A30AlbProCod = new long[1] ;
      P0AHA2_A129BarCod = new int[1] ;
      P0AHA2_A132BarCodReo = new byte[1] ;
      P0AHA2_A130BarCodPar = new String[] {""} ;
      P0AHA2_A1240GuiFasLin = new short[1] ;
      P0AHA2_A457FasCod = new String[] {""} ;
      P0AHA2_A460FasDsc = new String[] {""} ;
      P0AHA2_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHA2_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHA2_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHA2_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.obtengodatosalbfas__default(),
         new Object[] {
             new Object[] {
            P0AHA2_A396EmprCod, P0AHA2_A30AlbProCod, P0AHA2_A129BarCod, P0AHA2_A132BarCodReo, P0AHA2_A130BarCodPar, P0AHA2_A1240GuiFasLin, P0AHA2_A457FasCod, P0AHA2_A460FasDsc, P0AHA2_A1275FasKgm, P0AHA2_A1276FasMtr,
            P0AHA2_A1241GuiFasPKg, P0AHA2_A1242GuiFasPMt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short AV15albfas ;
   private short AV12Faskg ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV14Faskgm ;
   private java.math.BigDecimal AV13GuiFasPKg ;
   private java.math.BigDecimal AV10fasmtr ;
   private java.math.BigDecimal AV11GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8FasCod ;
   private String AV9FasDsc ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private short[] aP12 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHA2_A396EmprCod ;
   private long[] P0AHA2_A30AlbProCod ;
   private int[] P0AHA2_A129BarCod ;
   private byte[] P0AHA2_A132BarCodReo ;
   private String[] P0AHA2_A130BarCodPar ;
   private short[] P0AHA2_A1240GuiFasLin ;
   private String[] P0AHA2_A457FasCod ;
   private String[] P0AHA2_A460FasDsc ;
   private java.math.BigDecimal[] P0AHA2_A1275FasKgm ;
   private java.math.BigDecimal[] P0AHA2_A1276FasMtr ;
   private java.math.BigDecimal[] P0AHA2_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P0AHA2_A1242GuiFasPMt ;
}

final  class obtengodatosalbfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHA2", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin, T1.FasCod, T2.FasDsc, T1.FasKgm, T1.FasMtr, T1.GuiFasPKg, T1.GuiFasPMt FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.GuiFasLin = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

