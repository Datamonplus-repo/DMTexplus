package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconpret extends GXProcedure
{
   public pconpret( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconpret.class ), "" );
   }

   public pconpret( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           short[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           String[] aP9 )
   {
      pconpret.this.aP10 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 ,
                        java.math.BigDecimal[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             java.math.BigDecimal[] aP10 )
   {
      pconpret.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pconpret.this.AV13Albprocod = aP1[0];
      this.aP1 = aP1;
      pconpret.this.AV8Barcod = aP2[0];
      this.aP2 = aP2;
      pconpret.this.AV9BarCodreo = aP3[0];
      this.aP3 = aP3;
      pconpret.this.AV10BarCodpar = aP4[0];
      this.aP4 = aP4;
      pconpret.this.AV11Guifaslin = aP5[0];
      this.aP5 = aP5;
      pconpret.this.AV14BarpreKgm = aP6[0];
      this.aP6 = aP6;
      pconpret.this.AV15BarPreMtr = aP7[0];
      this.aP7 = aP7;
      pconpret.this.AV19AlbImpMan = aP8[0];
      this.aP8 = aP8;
      pconpret.this.AV12Tipo_l = aP9[0];
      this.aP9 = aP9;
      pconpret.this.AV20Albprorec = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV12Tipo_l, httpContext.getMessage( "A", "")) == 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P03UO2 */
         pr_default.execute(0, new Object[] {AV20Albprorec, AV19AlbImpMan, AV15BarPreMtr, AV14BarpreKgm, A396EmprCod, Long.valueOf(AV13Albprocod), Integer.valueOf(AV8Barcod), Byte.valueOf(AV9BarCodreo), AV10BarCodpar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* End optimized UPDATE. */
      }
      if ( GXutil.strcmp(AV12Tipo_l, httpContext.getMessage( "F", "")) == 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P03UO3 */
         pr_default.execute(1, new Object[] {AV15BarPreMtr, AV14BarpreKgm, A396EmprCod, Long.valueOf(AV13Albprocod), Integer.valueOf(AV8Barcod), Byte.valueOf(AV9BarCodreo), AV10BarCodpar, Short.valueOf(AV11Guifaslin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pconpret.this.A396EmprCod;
      this.aP1[0] = pconpret.this.AV13Albprocod;
      this.aP2[0] = pconpret.this.AV8Barcod;
      this.aP3[0] = pconpret.this.AV9BarCodreo;
      this.aP4[0] = pconpret.this.AV10BarCodpar;
      this.aP5[0] = pconpret.this.AV11Guifaslin;
      this.aP6[0] = pconpret.this.AV14BarpreKgm;
      this.aP7[0] = pconpret.this.AV15BarPreMtr;
      this.aP8[0] = pconpret.this.AV19AlbImpMan;
      this.aP9[0] = pconpret.this.AV12Tipo_l;
      this.aP10[0] = pconpret.this.AV20Albprorec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pconpret");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A40AlbProRec = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pconpret__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodreo ;
   private short AV11Guifaslin ;
   private short Gx_err ;
   private int AV8Barcod ;
   private long AV13Albprocod ;
   private java.math.BigDecimal AV14BarpreKgm ;
   private java.math.BigDecimal AV15BarPreMtr ;
   private java.math.BigDecimal AV19AlbImpMan ;
   private java.math.BigDecimal AV20Albprorec ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private String A396EmprCod ;
   private String AV10BarCodpar ;
   private String AV12Tipo_l ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
}

final  class pconpret__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03UO2", "UPDATE TXPALBBAR SET AlbProEsp=2, AlbProRec=?, AlbImpMan=?, BarPreMtr=?, BarPreKgm=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P03UO3", "UPDATE TXPALBFAS SET GuiFasPMt=?, GuiFasPKg=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 1 :
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

