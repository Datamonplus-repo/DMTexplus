package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class insupd_albfas extends GXProcedure
{
   public insupd_albfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( insupd_albfas.class ), "" );
   }

   public insupd_albfas( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        short aP5 ,
                        String aP6 ,
                        java.math.BigDecimal aP7 ,
                        java.math.BigDecimal aP8 ,
                        java.math.BigDecimal aP9 ,
                        java.math.BigDecimal aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             short aP5 ,
                             String aP6 ,
                             java.math.BigDecimal aP7 ,
                             java.math.BigDecimal aP8 ,
                             java.math.BigDecimal aP9 ,
                             java.math.BigDecimal aP10 )
   {
      insupd_albfas.this.AV8emprcod = aP0;
      insupd_albfas.this.AV9albprocod = aP1;
      insupd_albfas.this.AV10barcod = aP2;
      insupd_albfas.this.AV11barcodreo = aP3;
      insupd_albfas.this.AV12barcodpar = aP4;
      insupd_albfas.this.AV13Guifaslin = aP5;
      insupd_albfas.this.AV14FasCod = aP6;
      insupd_albfas.this.AV15Faskgm = aP7;
      insupd_albfas.this.AV16GuiFasPKg = aP8;
      insupd_albfas.this.AV17fasmtr = aP9;
      insupd_albfas.this.AV18GuiFasPMt = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21GXLvl3 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0AHD2 */
      pr_default.execute(0, new Object[] {AV18GuiFasPMt, AV16GuiFasPKg, AV17fasmtr, AV15Faskgm, AV14FasCod, AV8emprcod, Long.valueOf(AV9albprocod), Integer.valueOf(AV10barcod), Byte.valueOf(AV11barcodreo), AV12barcodpar, Short.valueOf(AV13Guifaslin)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV21GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
      /* End optimized UPDATE. */
      if ( AV21GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPALBFAS

         */
         A396EmprCod = AV8emprcod ;
         A30AlbProCod = AV9albprocod ;
         A129BarCod = AV10barcod ;
         A132BarCodReo = AV11barcodreo ;
         A130BarCodPar = AV12barcodpar ;
         A1240GuiFasLin = AV13Guifaslin ;
         A457FasCod = AV14FasCod ;
         A1275FasKgm = AV15Faskgm ;
         A1276FasMtr = AV17fasmtr ;
         A1241GuiFasPKg = AV16GuiFasPKg ;
         A1242GuiFasPMt = AV18GuiFasPMt ;
         /* Using cursor P0AHD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.insupd_albfas");
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
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.insupd_albfas__default(),
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

   private byte AV11barcodreo ;
   private byte AV21GXLvl3 ;
   private byte A132BarCodReo ;
   private short AV13Guifaslin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV10barcod ;
   private int GX_INS194 ;
   private int A129BarCod ;
   private long AV9albprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV15Faskgm ;
   private java.math.BigDecimal AV16GuiFasPKg ;
   private java.math.BigDecimal AV17fasmtr ;
   private java.math.BigDecimal AV18GuiFasPMt ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private String AV8emprcod ;
   private String AV12barcodpar ;
   private String AV14FasCod ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class insupd_albfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AHD2", "UPDATE TXPALBFAS SET GuiFasPMt=?, GuiFasPKg=?, FasMtr=?, FasKgm=?, FasCod=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P0AHD3", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               return;
      }
   }

}

