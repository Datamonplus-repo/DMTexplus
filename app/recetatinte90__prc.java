package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetatinte90__prc extends GXProcedure
{
   public recetatinte90__prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetatinte90__prc.class ), "" );
   }

   public recetatinte90__prc( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            short aP4 ,
                            byte aP5 ,
                            short aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            String[] aP8 ,
                            byte[] aP9 ,
                            java.math.BigDecimal[] aP10 ,
                            byte[] aP11 ,
                            String[] aP12 ,
                            String[] aP13 ,
                            String[] aP14 ,
                            String[] aP15 ,
                            byte[] aP16 ,
                            String[] aP17 ,
                            java.math.BigDecimal[] aP18 ,
                            java.math.BigDecimal[] aP19 ,
                            java.math.BigDecimal[] aP20 ,
                            java.math.BigDecimal[] aP21 ,
                            java.math.BigDecimal[] aP22 ,
                            java.math.BigDecimal[] aP23 )
   {
      recetatinte90__prc.this.aP24 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
      return aP24[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        byte aP5 ,
                        short aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        byte[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        byte[] aP16 ,
                        String[] aP17 ,
                        java.math.BigDecimal[] aP18 ,
                        java.math.BigDecimal[] aP19 ,
                        java.math.BigDecimal[] aP20 ,
                        java.math.BigDecimal[] aP21 ,
                        java.math.BigDecimal[] aP22 ,
                        java.math.BigDecimal[] aP23 ,
                        short[] aP24 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             byte aP5 ,
                             short aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             byte[] aP16 ,
                             String[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             java.math.BigDecimal[] aP19 ,
                             java.math.BigDecimal[] aP20 ,
                             java.math.BigDecimal[] aP21 ,
                             java.math.BigDecimal[] aP22 ,
                             java.math.BigDecimal[] aP23 ,
                             short[] aP24 )
   {
      recetatinte90__prc.this.AV14EmprCod = aP0;
      recetatinte90__prc.this.AV13BarCod = aP1;
      recetatinte90__prc.this.AV12BarCodReo = aP2;
      recetatinte90__prc.this.AV11BarCodPar = aP3;
      recetatinte90__prc.this.AV10RecLinMaq = aP4;
      recetatinte90__prc.this.AV8RecLinPro = aP5;
      recetatinte90__prc.this.AV9RecLin = aP6;
      recetatinte90__prc.this.aP7 = aP7;
      recetatinte90__prc.this.aP8 = aP8;
      recetatinte90__prc.this.aP9 = aP9;
      recetatinte90__prc.this.aP10 = aP10;
      recetatinte90__prc.this.aP11 = aP11;
      recetatinte90__prc.this.aP12 = aP12;
      recetatinte90__prc.this.aP13 = aP13;
      recetatinte90__prc.this.aP14 = aP14;
      recetatinte90__prc.this.aP15 = aP15;
      recetatinte90__prc.this.aP16 = aP16;
      recetatinte90__prc.this.aP17 = aP17;
      recetatinte90__prc.this.aP18 = aP18;
      recetatinte90__prc.this.aP19 = aP19;
      recetatinte90__prc.this.aP20 = aP20;
      recetatinte90__prc.this.aP21 = aP21;
      recetatinte90__prc.this.aP22 = aP22;
      recetatinte90__prc.this.aP23 = aP23;
      recetatinte90__prc.this.aP24 = aP24;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25lrecet = (short)(0) ;
      AV15recprdnum = "" ;
      AV16RecPrdDsc = "" ;
      AV17ForPrdUMe = (byte)(0) ;
      AV18ForPrdDsc = "" ;
      AV19faccon = DecimalUtil.ZERO ;
      AV20Prdcant = DecimalUtil.ZERO ;
      AV21RecManAut = "" ;
      AV22RecLote = "" ;
      AV23RecForNro = (byte)(0) ;
      AV24RecPrdTnq = (byte)(0) ;
      AV26oldRecLote = "" ;
      AV27Cantold = DecimalUtil.ZERO ;
      AV28CanResold = DecimalUtil.ZERO ;
      AV31PrdCanRes = DecimalUtil.ZERO ;
      AV30PrdExiAlm = DecimalUtil.ZERO ;
      AV32PrdExiCC = DecimalUtil.ZERO ;
      /* Using cursor P0AGZ2 */
      pr_default.execute(0, new Object[] {AV14EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV12BarCodReo), AV11BarCodPar, Short.valueOf(AV10RecLinMaq), Byte.valueOf(AV8RecLinPro), Short.valueOf(AV9RecLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P0AGZ2_A719PrdNum[0] ;
         n719PrdNum = P0AGZ2_n719PrdNum[0] ;
         A811RecLin = P0AGZ2_A811RecLin[0] ;
         A1273RecLinPro = P0AGZ2_A1273RecLinPro[0] ;
         A2804RecLinMaq = P0AGZ2_A2804RecLinMaq[0] ;
         A130BarCodPar = P0AGZ2_A130BarCodPar[0] ;
         A132BarCodReo = P0AGZ2_A132BarCodReo[0] ;
         A129BarCod = P0AGZ2_A129BarCod[0] ;
         A396EmprCod = P0AGZ2_A396EmprCod[0] ;
         A872RecPrdNum = P0AGZ2_A872RecPrdNum[0] ;
         A875RecPrdDsc = P0AGZ2_A875RecPrdDsc[0] ;
         A490ForPrdUMe = P0AGZ2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P0AGZ2_n490ForPrdUMe[0] ;
         A488ForPrdDsc = P0AGZ2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AGZ2_n488ForPrdDsc[0] ;
         A431FacCon = P0AGZ2_A431FacCon[0] ;
         A14055RecManAut = P0AGZ2_A14055RecManAut[0] ;
         A5725RecLote = P0AGZ2_A5725RecLote[0] ;
         A2394RecForNro = P0AGZ2_A2394RecForNro[0] ;
         A3274RecPrdTnq = P0AGZ2_A3274RecPrdTnq[0] ;
         A685PrdCanRes = P0AGZ2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P0AGZ2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P0AGZ2_A705PrdExiCC[0] ;
         A686PrdCant = P0AGZ2_A686PrdCant[0] ;
         A685PrdCanRes = P0AGZ2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P0AGZ2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P0AGZ2_A705PrdExiCC[0] ;
         A488ForPrdDsc = P0AGZ2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AGZ2_n488ForPrdDsc[0] ;
         A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         AV15recprdnum = A872RecPrdNum ;
         AV16RecPrdDsc = A875RecPrdDsc ;
         AV17ForPrdUMe = A490ForPrdUMe ;
         AV18ForPrdDsc = A488ForPrdDsc ;
         AV19faccon = A431FacCon ;
         AV20Prdcant = A686PrdCant ;
         AV21RecManAut = A14055RecManAut ;
         AV22RecLote = A5725RecLote ;
         AV23RecForNro = A2394RecForNro ;
         AV24RecPrdTnq = A3274RecPrdTnq ;
         AV26oldRecLote = A5725RecLote ;
         AV27Cantold = A686PrdCant ;
         AV28CanResold = A238CanRes ;
         AV29oldfaccon = A431FacCon ;
         AV31PrdCanRes = A685PrdCanRes ;
         AV30PrdExiAlm = A704PrdExiAlm ;
         AV32PrdExiCC = A705PrdExiCC ;
         AV25lrecet = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = recetatinte90__prc.this.AV19faccon;
      this.aP8[0] = recetatinte90__prc.this.AV18ForPrdDsc;
      this.aP9[0] = recetatinte90__prc.this.AV17ForPrdUMe;
      this.aP10[0] = recetatinte90__prc.this.AV20Prdcant;
      this.aP11[0] = recetatinte90__prc.this.AV23RecForNro;
      this.aP12[0] = recetatinte90__prc.this.AV22RecLote;
      this.aP13[0] = recetatinte90__prc.this.AV21RecManAut;
      this.aP14[0] = recetatinte90__prc.this.AV16RecPrdDsc;
      this.aP15[0] = recetatinte90__prc.this.AV15recprdnum;
      this.aP16[0] = recetatinte90__prc.this.AV24RecPrdTnq;
      this.aP17[0] = recetatinte90__prc.this.AV26oldRecLote;
      this.aP18[0] = recetatinte90__prc.this.AV27Cantold;
      this.aP19[0] = recetatinte90__prc.this.AV28CanResold;
      this.aP20[0] = recetatinte90__prc.this.AV29oldfaccon;
      this.aP21[0] = recetatinte90__prc.this.AV30PrdExiAlm;
      this.aP22[0] = recetatinte90__prc.this.AV31PrdCanRes;
      this.aP23[0] = recetatinte90__prc.this.AV32PrdExiCC;
      this.aP24[0] = recetatinte90__prc.this.AV25lrecet;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19faccon = DecimalUtil.ZERO ;
      AV18ForPrdDsc = "" ;
      AV20Prdcant = DecimalUtil.ZERO ;
      AV22RecLote = "" ;
      AV21RecManAut = "" ;
      AV16RecPrdDsc = "" ;
      AV15recprdnum = "" ;
      AV26oldRecLote = "" ;
      AV27Cantold = DecimalUtil.ZERO ;
      AV28CanResold = DecimalUtil.ZERO ;
      AV29oldfaccon = DecimalUtil.ZERO ;
      AV30PrdExiAlm = DecimalUtil.ZERO ;
      AV31PrdCanRes = DecimalUtil.ZERO ;
      AV32PrdExiCC = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AGZ2_A719PrdNum = new String[] {""} ;
      P0AGZ2_n719PrdNum = new boolean[] {false} ;
      P0AGZ2_A811RecLin = new short[1] ;
      P0AGZ2_A1273RecLinPro = new byte[1] ;
      P0AGZ2_A2804RecLinMaq = new short[1] ;
      P0AGZ2_A130BarCodPar = new String[] {""} ;
      P0AGZ2_A132BarCodReo = new byte[1] ;
      P0AGZ2_A129BarCod = new int[1] ;
      P0AGZ2_A396EmprCod = new String[] {""} ;
      P0AGZ2_A872RecPrdNum = new String[] {""} ;
      P0AGZ2_A875RecPrdDsc = new String[] {""} ;
      P0AGZ2_A490ForPrdUMe = new byte[1] ;
      P0AGZ2_n490ForPrdUMe = new boolean[] {false} ;
      P0AGZ2_A488ForPrdDsc = new String[] {""} ;
      P0AGZ2_n488ForPrdDsc = new boolean[] {false} ;
      P0AGZ2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGZ2_A14055RecManAut = new String[] {""} ;
      P0AGZ2_A5725RecLote = new String[] {""} ;
      P0AGZ2_A2394RecForNro = new byte[1] ;
      P0AGZ2_A3274RecPrdTnq = new byte[1] ;
      P0AGZ2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGZ2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGZ2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGZ2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A14055RecManAut = "" ;
      A5725RecLote = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A238CanRes = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetatinte90__prc__default(),
         new Object[] {
             new Object[] {
            P0AGZ2_A719PrdNum, P0AGZ2_n719PrdNum, P0AGZ2_A811RecLin, P0AGZ2_A1273RecLinPro, P0AGZ2_A2804RecLinMaq, P0AGZ2_A130BarCodPar, P0AGZ2_A132BarCodReo, P0AGZ2_A129BarCod, P0AGZ2_A396EmprCod, P0AGZ2_A872RecPrdNum,
            P0AGZ2_A875RecPrdDsc, P0AGZ2_A490ForPrdUMe, P0AGZ2_n490ForPrdUMe, P0AGZ2_A488ForPrdDsc, P0AGZ2_n488ForPrdDsc, P0AGZ2_A431FacCon, P0AGZ2_A14055RecManAut, P0AGZ2_A5725RecLote, P0AGZ2_A2394RecForNro, P0AGZ2_A3274RecPrdTnq,
            P0AGZ2_A685PrdCanRes, P0AGZ2_A704PrdExiAlm, P0AGZ2_A705PrdExiCC, P0AGZ2_A686PrdCant
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV8RecLinPro ;
   private byte AV17ForPrdUMe ;
   private byte AV23RecForNro ;
   private byte AV24RecPrdTnq ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private short AV10RecLinMaq ;
   private short AV9RecLin ;
   private short AV25lrecet ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV19faccon ;
   private java.math.BigDecimal AV20Prdcant ;
   private java.math.BigDecimal AV27Cantold ;
   private java.math.BigDecimal AV28CanResold ;
   private java.math.BigDecimal AV29oldfaccon ;
   private java.math.BigDecimal AV30PrdExiAlm ;
   private java.math.BigDecimal AV31PrdCanRes ;
   private java.math.BigDecimal AV32PrdExiCC ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A238CanRes ;
   private String AV14EmprCod ;
   private String AV11BarCodPar ;
   private String AV18ForPrdDsc ;
   private String AV22RecLote ;
   private String AV21RecManAut ;
   private String AV16RecPrdDsc ;
   private String AV15recprdnum ;
   private String AV26oldRecLote ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A14055RecManAut ;
   private String A5725RecLote ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private short[] aP24 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private byte[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private byte[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private byte[] aP16 ;
   private String[] aP17 ;
   private java.math.BigDecimal[] aP18 ;
   private java.math.BigDecimal[] aP19 ;
   private java.math.BigDecimal[] aP20 ;
   private java.math.BigDecimal[] aP21 ;
   private java.math.BigDecimal[] aP22 ;
   private java.math.BigDecimal[] aP23 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGZ2_A719PrdNum ;
   private boolean[] P0AGZ2_n719PrdNum ;
   private short[] P0AGZ2_A811RecLin ;
   private byte[] P0AGZ2_A1273RecLinPro ;
   private short[] P0AGZ2_A2804RecLinMaq ;
   private String[] P0AGZ2_A130BarCodPar ;
   private byte[] P0AGZ2_A132BarCodReo ;
   private int[] P0AGZ2_A129BarCod ;
   private String[] P0AGZ2_A396EmprCod ;
   private String[] P0AGZ2_A872RecPrdNum ;
   private String[] P0AGZ2_A875RecPrdDsc ;
   private byte[] P0AGZ2_A490ForPrdUMe ;
   private boolean[] P0AGZ2_n490ForPrdUMe ;
   private String[] P0AGZ2_A488ForPrdDsc ;
   private boolean[] P0AGZ2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AGZ2_A431FacCon ;
   private String[] P0AGZ2_A14055RecManAut ;
   private String[] P0AGZ2_A5725RecLote ;
   private byte[] P0AGZ2_A2394RecForNro ;
   private byte[] P0AGZ2_A3274RecPrdTnq ;
   private java.math.BigDecimal[] P0AGZ2_A685PrdCanRes ;
   private java.math.BigDecimal[] P0AGZ2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P0AGZ2_A705PrdExiCC ;
   private java.math.BigDecimal[] P0AGZ2_A686PrdCant ;
}

final  class recetatinte90__prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGZ2", "SELECT T1.PrdNum, T1.RecLin, T1.RecLinPro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.RecPrdNum, T1.RecPrdDsc, T1.ForPrdUMe, T3.ForPrdDsc, T1.FacCon, T1.RecManAut, T1.RecLote, T1.RecForNro, T1.RecPrdTnq, T2.PrdCanRes, T2.PrdExiAlm, T2.PrdExiCC, T1.PrdCant FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? and T1.RecLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((String[]) buf[17])[0] = rslt.getString(15, 26);
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,4);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,3);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

