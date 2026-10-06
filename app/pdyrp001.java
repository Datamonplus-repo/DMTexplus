package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp001 extends GXProcedure
{
   public pdyrp001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp001.class ), "" );
   }

   public pdyrp001( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 ,
                            String[] aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            byte[] aP8 ,
                            short[] aP9 )
   {
      pdyrp001.this.aP10 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 ,
                        short[] aP9 ,
                        short[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 )
   {
      pdyrp001.this.AV19EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp001.this.AV20BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp001.this.AV21BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp001.this.AV22BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdyrp001.this.AV16LinRec = aP4[0];
      this.aP4 = aP4;
      pdyrp001.this.AV15PrdDesc = aP5[0];
      this.aP5 = aP5;
      pdyrp001.this.AV17PrdNum = aP6[0];
      this.aP6 = aP6;
      pdyrp001.this.AV18FacCon = aP7[0];
      this.aP7 = aP7;
      pdyrp001.this.AV23LinPro = aP8[0];
      this.aP8 = aP8;
      pdyrp001.this.AV24RecLinMaq = aP9[0];
      this.aP9 = aP9;
      pdyrp001.this.AV25UltRecLin = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25UltRecLin = (short)(AV25UltRecLin+10) ;
      AV16LinRec = (short)(AV16LinRec+10) ;
      /*
         INSERT RECORD ON TABLE TXPLRECET

      */
      A396EmprCod = AV19EmprCod ;
      A129BarCod = AV20BarCod ;
      A132BarCodReo = AV21BarCodReo ;
      A130BarCodPar = AV22BarCodPar ;
      A2804RecLinMaq = AV24RecLinMaq ;
      A1273RecLinPro = AV23LinPro ;
      A811RecLin = AV16LinRec ;
      A872RecPrdNum = AV17PrdNum ;
      A875RecPrdDsc = AV15PrdDesc ;
      A431FacCon = AV18FacCon ;
      A2394RecForNro = (byte)(0) ;
      A3274RecPrdTnq = (byte)(0) ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A3804RecFecMov = GXutil.nullDate() ;
      A3805RecAnyTie = (short)(0) ;
      A3806RecUltAny = DecimalUtil.ZERO ;
      A3807RecPorAny = DecimalUtil.ZERO ;
      A3938RecCanEns = DecimalUtil.ZERO ;
      A4024RecMar = (byte)(0) ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A5422RecSalMP = (short)(0) ;
      A5527RecLinRea = httpContext.getMessage( "N", "") ;
      A5725RecLote = "" ;
      A8934RecPes = (byte)(0) ;
      A8937RecAcc = "" ;
      A9813FacCon1 = DecimalUtil.ZERO ;
      A3804RecFecMov = GXutil.nullDate() ;
      A3805RecAnyTie = (short)(0) ;
      A3806RecUltAny = DecimalUtil.ZERO ;
      A3807RecPorAny = DecimalUtil.ZERO ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A11708RecProv = 0 ;
      A12641RecPrdDc2 = "" ;
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      A12717RecFabId = 0 ;
      /* Using cursor P098Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin), A872RecPrdNum, A875RecPrdDsc, A431FacCon, A686PrdCant, A683PrdCanFin, A1797PrdCanAny, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), A3938RecCanEns, Byte.valueOf(A4024RecMar), A4576RecLinUsr, A4577RecPesFec, Short.valueOf(A5422RecSalMP), A5527RecLinRea, A5725RecLote, Byte.valueOf(A8934RecPes), A8937RecAcc, A9813FacCon1, A3804RecFecMov, Short.valueOf(A3805RecAnyTie), A3806RecUltAny, A3807RecPorAny, A4900PrdCanMac, Integer.valueOf(A11708RecProv), A12641RecPrdDc2, A12710PrdCantOrg, Integer.valueOf(A12717RecFabId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
      if ( (pr_default.getStatus(0) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp001.this.AV19EmprCod;
      this.aP1[0] = pdyrp001.this.AV20BarCod;
      this.aP2[0] = pdyrp001.this.AV21BarCodReo;
      this.aP3[0] = pdyrp001.this.AV22BarCodPar;
      this.aP4[0] = pdyrp001.this.AV16LinRec;
      this.aP5[0] = pdyrp001.this.AV15PrdDesc;
      this.aP6[0] = pdyrp001.this.AV17PrdNum;
      this.aP7[0] = pdyrp001.this.AV18FacCon;
      this.aP8[0] = pdyrp001.this.AV23LinPro;
      this.aP9[0] = pdyrp001.this.AV24RecLinMaq;
      this.aP10[0] = pdyrp001.this.AV25UltRecLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdyrp001");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A3804RecFecMov = GXutil.nullDate() ;
      A3806RecUltAny = DecimalUtil.ZERO ;
      A3807RecPorAny = DecimalUtil.ZERO ;
      A3938RecCanEns = DecimalUtil.ZERO ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A5527RecLinRea = "" ;
      A5725RecLote = "" ;
      A8937RecAcc = "" ;
      A9813FacCon1 = DecimalUtil.ZERO ;
      A12641RecPrdDc2 = "" ;
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp001__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21BarCodReo ;
   private byte AV23LinPro ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private byte A8934RecPes ;
   private short AV16LinRec ;
   private short AV24RecLinMaq ;
   private short AV25UltRecLin ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A3805RecAnyTie ;
   private short A5422RecSalMP ;
   private short Gx_err ;
   private int AV20BarCod ;
   private int GX_INS410 ;
   private int A129BarCod ;
   private int A11708RecProv ;
   private int A12717RecFabId ;
   private java.math.BigDecimal AV18FacCon ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A3806RecUltAny ;
   private java.math.BigDecimal A3807RecPorAny ;
   private java.math.BigDecimal A3938RecCanEns ;
   private java.math.BigDecimal A4900PrdCanMac ;
   private java.math.BigDecimal A9813FacCon1 ;
   private java.math.BigDecimal A12710PrdCantOrg ;
   private String AV19EmprCod ;
   private String AV22BarCodPar ;
   private String AV15PrdDesc ;
   private String AV17PrdNum ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A4576RecLinUsr ;
   private String A5527RecLinRea ;
   private String A5725RecLote ;
   private String A8937RecAcc ;
   private String A12641RecPrdDc2 ;
   private String Gx_emsg ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date A3804RecFecMov ;
   private short[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private byte[] aP8 ;
   private short[] aP9 ;
   private IDataStoreProvider pr_default ;
}

final  class pdyrp001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P098Q2", "INSERT INTO TXPLRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, RecPrdNum, RecPrdDsc, FacCon, PrdCant, PrdCanFin, PrdCanAny, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecLinUsr, RecPesFec, RecSalMP, RecLinRea, RecLote, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecPrdDc2, PrdCantOrg, RecFabId, PrdNum, ForPrdUMe, RecSalVol, RecLotAlm, RecLoteFch, RecManAut) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 3);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 3);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 3);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 5);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 8);
               stmt.setDateTime(19, (java.util.Date)parms[18], false);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setString(21, (String)parms[20], 1);
               stmt.setString(22, (String)parms[21], 26);
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setString(24, (String)parms[23], 40);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 5);
               stmt.setDate(26, (java.util.Date)parms[25]);
               stmt.setShort(27, ((Number) parms[26]).shortValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[27], 3);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[28], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 3);
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setString(32, (String)parms[31], 40);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[32], 3);
               stmt.setInt(34, ((Number) parms[33]).intValue());
               return;
      }
   }

}

