package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasesmodif extends GXProcedure
{
   public pfasesmodif( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasesmodif.class ), "" );
   }

   public pfasesmodif( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             String[] aP17 )
   {
      pfasesmodif.this.aP18 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        byte[] aP9 ,
                        String[] aP10 ,
                        java.util.Date[] aP11 ,
                        java.util.Date[] aP12 ,
                        short[] aP13 ,
                        short[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 )
   {
      pfasesmodif.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasesmodif.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfasesmodif.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasesmodif.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasesmodif.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pfasesmodif.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pfasesmodif.this.AV8Barfactin = aP6[0];
      this.aP6 = aP6;
      pfasesmodif.this.AV9Barfasacab = aP7[0];
      this.aP7 = aP7;
      pfasesmodif.this.AV10BarFascon = aP8[0];
      this.aP8 = aP8;
      pfasesmodif.this.AV11BarFasEst = aP9[0];
      this.aP9 = aP9;
      pfasesmodif.this.AV12BarFasfor = aP10[0];
      this.aP10 = aP10;
      pfasesmodif.this.AV13Barfecrea = aP11[0];
      this.aP11 = aP11;
      pfasesmodif.this.AV14Barfecrini = aP12[0];
      this.aP12 = aP12;
      pfasesmodif.this.AV15Barhorfin = aP13[0];
      this.aP13 = aP13;
      pfasesmodif.this.AV16BarHorIni = aP14[0];
      this.aP14 = aP14;
      pfasesmodif.this.AV17BarTieteo = aP15[0];
      this.aP15 = aP15;
      pfasesmodif.this.AV18Baruni = aP16[0];
      this.aP16 = aP16;
      pfasesmodif.this.AV19MaqCodbis = aP17[0];
      this.aP17 = aP17;
      pfasesmodif.this.AV20Fascod = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P048R2 */
      pr_default.execute(0, new Object[] {AV19MaqCodbis, AV18Baruni, AV17BarTieteo, Short.valueOf(AV16BarHorIni), Short.valueOf(AV15Barhorfin), AV14Barfecrini, AV13Barfecrea, AV12BarFasfor, Byte.valueOf(AV11BarFasEst), AV10BarFascon, AV9Barfasacab, AV8Barfactin, AV20Fascod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasesmodif.this.A396EmprCod;
      this.aP1[0] = pfasesmodif.this.A129BarCod;
      this.aP2[0] = pfasesmodif.this.A132BarCodReo;
      this.aP3[0] = pfasesmodif.this.A130BarCodPar;
      this.aP4[0] = pfasesmodif.this.A758ProCod;
      this.aP5[0] = pfasesmodif.this.A194BarOrdLin;
      this.aP6[0] = pfasesmodif.this.AV8Barfactin;
      this.aP7[0] = pfasesmodif.this.AV9Barfasacab;
      this.aP8[0] = pfasesmodif.this.AV10BarFascon;
      this.aP9[0] = pfasesmodif.this.AV11BarFasEst;
      this.aP10[0] = pfasesmodif.this.AV12BarFasfor;
      this.aP11[0] = pfasesmodif.this.AV13Barfecrea;
      this.aP12[0] = pfasesmodif.this.AV14Barfecrini;
      this.aP13[0] = pfasesmodif.this.AV15Barhorfin;
      this.aP14[0] = pfasesmodif.this.AV16BarHorIni;
      this.aP15[0] = pfasesmodif.this.AV17BarTieteo;
      this.aP16[0] = pfasesmodif.this.AV18Baruni;
      this.aP17[0] = pfasesmodif.this.AV19MaqCodbis;
      this.aP18[0] = pfasesmodif.this.AV20Fascod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A603MaqCodBis = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A4287BarFasFor = "" ;
      A152BarFasCon = "" ;
      A4905BarFasAcab = "" ;
      A150BarFacTin = "" ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasesmodif__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11BarFasEst ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short AV15Barhorfin ;
   private short AV16BarHorIni ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV17BarTieteo ;
   private java.math.BigDecimal AV18Baruni ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A216BarTieTeo ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV8Barfactin ;
   private String AV9Barfasacab ;
   private String AV10BarFascon ;
   private String AV12BarFasfor ;
   private String AV19MaqCodbis ;
   private String AV20Fascod ;
   private String A603MaqCodBis ;
   private String A4287BarFasFor ;
   private String A152BarFasCon ;
   private String A4905BarFasAcab ;
   private String A150BarFacTin ;
   private String A457FasCod ;
   private java.util.Date AV13Barfecrea ;
   private java.util.Date AV14Barfecrini ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A160BarFecRea ;
   private String[] aP18 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private byte[] aP9 ;
   private String[] aP10 ;
   private java.util.Date[] aP11 ;
   private java.util.Date[] aP12 ;
   private short[] aP13 ;
   private short[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private String[] aP17 ;
   private IDataStoreProvider pr_default ;
}

final  class pfasesmodif__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P048R2", "UPDATE TXPBARFAS SET MaqCodBis=?, BarUni=?, BarTieTeo=?, BarHorIni=?, BarHorFin=?, BarFecRIni=?, BarFecRea=?, BarFasFor=?, BarFasEst=?, BarFasCon=?, BarFasAcab=?, BarFacTin=?, FasCod=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 8);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 8);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               return;
      }
   }

}

