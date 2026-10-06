package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwalbfan extends GXProcedure
{
   public pwalbfan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwalbfan.class ), "" );
   }

   public pwalbfan( int remoteHandle ,
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
                                           java.math.BigDecimal[] aP6 )
   {
      pwalbfan.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pwalbfan.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pwalbfan.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pwalbfan.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pwalbfan.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pwalbfan.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pwalbfan.this.A1240GuiFasLin = aP5[0];
      this.aP5 = aP5;
      pwalbfan.this.AV8FasPreKgm = aP6[0];
      this.aP6 = aP6;
      pwalbfan.this.AV9fasPreMtr = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P03YJ2 */
      pr_default.execute(0, new Object[] {AV9fasPreMtr, AV8FasPreKgm, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwalbfan.this.A396EmprCod;
      this.aP1[0] = pwalbfan.this.A30AlbProCod;
      this.aP2[0] = pwalbfan.this.A129BarCod;
      this.aP3[0] = pwalbfan.this.A132BarCodReo;
      this.aP4[0] = pwalbfan.this.A130BarCodPar;
      this.aP5[0] = pwalbfan.this.A1240GuiFasLin;
      this.aP6[0] = pwalbfan.this.AV8FasPreKgm;
      this.aP7[0] = pwalbfan.this.AV9fasPreMtr;
      Application.commitDataStores(context, remoteHandle, pr_default, "pwalbfan");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pwalbfan__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV8FasPreKgm ;
   private java.math.BigDecimal AV9fasPreMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
}

final  class pwalbfan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03YJ2", "UPDATE TXPALBFAS SET GuiFasPMt=?, GuiFasPKg=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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

