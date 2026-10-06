package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacau14 extends GXProcedure
{
   public pfacau14( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacau14.class ), "" );
   }

   public pfacau14( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 ,
                          int[] aP2 ,
                          byte[] aP3 ,
                          String[] aP4 ,
                          int[] aP5 ,
                          int[] aP6 ,
                          String[] aP7 ,
                          byte[] aP8 ,
                          byte[] aP9 ,
                          byte[] aP10 ,
                          byte[] aP11 ,
                          short[] aP12 )
   {
      pfacau14.this.aP13 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        byte[] aP9 ,
                        byte[] aP10 ,
                        byte[] aP11 ,
                        short[] aP12 ,
                        int[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             byte[] aP9 ,
                             byte[] aP10 ,
                             byte[] aP11 ,
                             short[] aP12 ,
                             int[] aP13 )
   {
      pfacau14.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacau14.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pfacau14.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pfacau14.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pfacau14.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pfacau14.this.AV24NumLin = aP5[0];
      this.aP5 = aP5;
      pfacau14.this.AV23NumFac = aP6[0];
      this.aP6 = aP6;
      pfacau14.this.AV40BarDisNum = aP7[0];
      this.aP7 = aP7;
      pfacau14.this.AV94Texknit = aP8[0];
      this.aP8 = aP8;
      pfacau14.this.AV103Martex = aP9[0];
      this.aP9 = aP9;
      pfacau14.this.AV74FlagSal = aP10[0];
      this.aP10 = aP10;
      pfacau14.this.AV86Guasch = aP11[0];
      this.aP11 = aP11;
      pfacau14.this.AV102TotAlb = aP12[0];
      this.aP12 = aP12;
      pfacau14.this.AV75CliFac = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV110PLinea = (byte)(0) ;
      GXv_int1[0] = AV110PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pfacau14.this.AV110PLinea = GXv_int1[0] ;
      /* Using cursor P01UR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A212BarSer = P01UR2_A212BarSer[0] ;
         A759ProDsc = P01UR2_A759ProDsc[0] ;
         A1503BarPart = P01UR2_A1503BarPart[0] ;
         A758ProCod = P01UR2_A758ProCod[0] ;
         n758ProCod = P01UR2_n758ProCod[0] ;
         A4812BarEncCli = P01UR2_A4812BarEncCli[0] ;
         A217BarTipArt = P01UR2_A217BarTipArt[0] ;
         n217BarTipArt = P01UR2_n217BarTipArt[0] ;
         A1472PrdMtr = P01UR2_A1472PrdMtr[0] ;
         n1472PrdMtr = P01UR2_n1472PrdMtr[0] ;
         A1471PrdKgm = P01UR2_A1471PrdKgm[0] ;
         n1471PrdKgm = P01UR2_n1471PrdKgm[0] ;
         A1469AlbPrdPKg = P01UR2_A1469AlbPrdPKg[0] ;
         n1469AlbPrdPKg = P01UR2_n1469AlbPrdPKg[0] ;
         A1470AlbPrdPMt = P01UR2_A1470AlbPrdPMt[0] ;
         n1470AlbPrdPMt = P01UR2_n1470AlbPrdPMt[0] ;
         A4333ProPorRec = P01UR2_A4333ProPorRec[0] ;
         n4333ProPorRec = P01UR2_n4333ProPorRec[0] ;
         A4332ProPreRec = P01UR2_A4332ProPreRec[0] ;
         n4332ProPreRec = P01UR2_n4332ProPreRec[0] ;
         A1468AlbPrdLin = P01UR2_A1468AlbPrdLin[0] ;
         A759ProDsc = P01UR2_A759ProDsc[0] ;
         A212BarSer = P01UR2_A212BarSer[0] ;
         A1503BarPart = P01UR2_A1503BarPart[0] ;
         A4812BarEncCli = P01UR2_A4812BarEncCli[0] ;
         A217BarTipArt = P01UR2_A217BarTipArt[0] ;
         n217BarTipArt = P01UR2_n217BarTipArt[0] ;
         AV24NumLin = (int)(AV24NumLin+1) ;
         AV33Metros = A1472PrdMtr ;
         AV34Kilos = A1471PrdKgm ;
         AV35PrecioKg = A1469AlbPrdPKg ;
         AV36PrecioMt = A1470AlbPrdPMt ;
         AV92ProPorRec = A4333ProPorRec ;
         AV93ProPreRec = A4332ProPreRec ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36PrecioMt)==0) )
         {
            AV36PrecioMt = DecimalUtil.ZERO ;
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35PrecioKg)==0) )
         {
            AV35PrecioKg = DecimalUtil.ZERO ;
         }
         /*
            INSERT RECORD ON TABLE TXPLFAVEN

         */
         A430FacCod = AV23NumFac ;
         A446FacLin = AV24NumLin ;
         A427FacAlbCod = A30AlbProCod ;
         A1294FacBarCod = A129BarCod ;
         A1295FacBarReo = A132BarCodReo ;
         A1296FacBarPar = A130BarCodPar ;
         A428FacAlbTip = (byte)(1) ;
         A454FacSer = A212BarSer ;
         A448FacPreKgs = AV35PrecioKg ;
         A449FacPreMts = AV36PrecioMt ;
         A444FacKgs = AV34Kilos ;
         A447FacMts = AV33Metros ;
         A432FacDsc = A759ProDsc ;
         A1498FacDisNum = AV40BarDisNum ;
         A3303FacNPart = A1503BarPart ;
         A3397FacFasCod = A758ProCod ;
         A4814FacEncCli = A4812BarEncCli ;
         A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
         A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
         A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
         A3883FacCliCod = AV75CliFac ;
         A5189FacTipArt = A217BarTipArt ;
         A3884FacProCod = A758ProCod ;
         /* Using cursor P01UR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A3884FacProCod, A4814FacEncCli, A5050FacBonLi, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
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
         GXt_decimal2 = DecimalUtil.doubleToDec(AV102TotAlb) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV23NumFac ;
         GXv_int5[0] = AV24NumLin ;
         GXv_decimal6[0] = GXt_decimal2 ;
         new app.pfacimli(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_decimal6) ;
         pfacau14.this.A396EmprCod = GXv_char3[0] ;
         pfacau14.this.AV23NumFac = GXv_int4[0] ;
         pfacau14.this.AV24NumLin = GXv_int5[0] ;
         pfacau14.this.GXt_decimal2 = GXv_decimal6[0] ;
         AV102TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV102TotAlb).add((GXt_decimal2)))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacau14.this.A396EmprCod;
      this.aP1[0] = pfacau14.this.A30AlbProCod;
      this.aP2[0] = pfacau14.this.A129BarCod;
      this.aP3[0] = pfacau14.this.A132BarCodReo;
      this.aP4[0] = pfacau14.this.A130BarCodPar;
      this.aP5[0] = pfacau14.this.AV24NumLin;
      this.aP6[0] = pfacau14.this.AV23NumFac;
      this.aP7[0] = pfacau14.this.AV40BarDisNum;
      this.aP8[0] = pfacau14.this.AV94Texknit;
      this.aP9[0] = pfacau14.this.AV103Martex;
      this.aP10[0] = pfacau14.this.AV74FlagSal;
      this.aP11[0] = pfacau14.this.AV86Guasch;
      this.aP12[0] = pfacau14.this.AV102TotAlb;
      this.aP13[0] = pfacau14.this.AV75CliFac;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P01UR2_A396EmprCod = new String[] {""} ;
      P01UR2_A30AlbProCod = new long[1] ;
      P01UR2_A129BarCod = new int[1] ;
      P01UR2_A132BarCodReo = new byte[1] ;
      P01UR2_A130BarCodPar = new String[] {""} ;
      P01UR2_A212BarSer = new String[] {""} ;
      P01UR2_A759ProDsc = new String[] {""} ;
      P01UR2_A1503BarPart = new short[1] ;
      P01UR2_A758ProCod = new String[] {""} ;
      P01UR2_n758ProCod = new boolean[] {false} ;
      P01UR2_A4812BarEncCli = new String[] {""} ;
      P01UR2_A217BarTipArt = new short[1] ;
      P01UR2_n217BarTipArt = new boolean[] {false} ;
      P01UR2_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UR2_n1472PrdMtr = new boolean[] {false} ;
      P01UR2_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UR2_n1471PrdKgm = new boolean[] {false} ;
      P01UR2_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UR2_n1469AlbPrdPKg = new boolean[] {false} ;
      P01UR2_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UR2_n1470AlbPrdPMt = new boolean[] {false} ;
      P01UR2_A4333ProPorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UR2_n4333ProPorRec = new boolean[] {false} ;
      P01UR2_A4332ProPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UR2_n4332ProPreRec = new boolean[] {false} ;
      P01UR2_A1468AlbPrdLin = new short[1] ;
      A212BarSer = "" ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      A4812BarEncCli = "" ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A4333ProPorRec = DecimalUtil.ZERO ;
      A4332ProPreRec = DecimalUtil.ZERO ;
      AV33Metros = DecimalUtil.ZERO ;
      AV34Kilos = DecimalUtil.ZERO ;
      AV35PrecioKg = DecimalUtil.ZERO ;
      AV36PrecioMt = DecimalUtil.ZERO ;
      AV92ProPorRec = DecimalUtil.ZERO ;
      AV93ProPreRec = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A1498FacDisNum = "" ;
      A3397FacFasCod = "" ;
      A4814FacEncCli = "" ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A3884FacProCod = "" ;
      Gx_emsg = "" ;
      GXt_decimal2 = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacau14__default(),
         new Object[] {
             new Object[] {
            P01UR2_A396EmprCod, P01UR2_A30AlbProCod, P01UR2_A129BarCod, P01UR2_A132BarCodReo, P01UR2_A130BarCodPar, P01UR2_A212BarSer, P01UR2_A759ProDsc, P01UR2_A1503BarPart, P01UR2_A758ProCod, P01UR2_n758ProCod,
            P01UR2_A4812BarEncCli, P01UR2_A217BarTipArt, P01UR2_n217BarTipArt, P01UR2_A1472PrdMtr, P01UR2_n1472PrdMtr, P01UR2_A1471PrdKgm, P01UR2_n1471PrdKgm, P01UR2_A1469AlbPrdPKg, P01UR2_n1469AlbPrdPKg, P01UR2_A1470AlbPrdPMt,
            P01UR2_n1470AlbPrdPMt, P01UR2_A4333ProPorRec, P01UR2_n4333ProPorRec, P01UR2_A4332ProPreRec, P01UR2_n4332ProPreRec, P01UR2_A1468AlbPrdLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV94Texknit ;
   private byte AV103Martex ;
   private byte AV74FlagSal ;
   private byte AV86Guasch ;
   private byte AV110PLinea ;
   private byte GXv_int1[] ;
   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private short AV102TotAlb ;
   private short A1503BarPart ;
   private short A217BarTipArt ;
   private short A1468AlbPrdLin ;
   private short A3303FacNPart ;
   private short A5189FacTipArt ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV24NumLin ;
   private int AV23NumFac ;
   private int AV75CliFac ;
   private int GX_INS44 ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A3883FacCliCod ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private long A30AlbProCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1471PrdKgm ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A4333ProPorRec ;
   private java.math.BigDecimal A4332ProPreRec ;
   private java.math.BigDecimal AV33Metros ;
   private java.math.BigDecimal AV34Kilos ;
   private java.math.BigDecimal AV35PrecioKg ;
   private java.math.BigDecimal AV36PrecioMt ;
   private java.math.BigDecimal AV92ProPorRec ;
   private java.math.BigDecimal AV93ProPreRec ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal GXt_decimal2 ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV40BarDisNum ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String A4812BarEncCli ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A1498FacDisNum ;
   private String A3397FacFasCod ;
   private String A4814FacEncCli ;
   private String A3884FacProCod ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private boolean n758ProCod ;
   private boolean n217BarTipArt ;
   private boolean n1472PrdMtr ;
   private boolean n1471PrdKgm ;
   private boolean n1469AlbPrdPKg ;
   private boolean n1470AlbPrdPMt ;
   private boolean n4333ProPorRec ;
   private boolean n4332ProPreRec ;
   private int[] aP13 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private byte[] aP9 ;
   private byte[] aP10 ;
   private byte[] aP11 ;
   private short[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P01UR2_A396EmprCod ;
   private long[] P01UR2_A30AlbProCod ;
   private int[] P01UR2_A129BarCod ;
   private byte[] P01UR2_A132BarCodReo ;
   private String[] P01UR2_A130BarCodPar ;
   private String[] P01UR2_A212BarSer ;
   private String[] P01UR2_A759ProDsc ;
   private short[] P01UR2_A1503BarPart ;
   private String[] P01UR2_A758ProCod ;
   private boolean[] P01UR2_n758ProCod ;
   private String[] P01UR2_A4812BarEncCli ;
   private short[] P01UR2_A217BarTipArt ;
   private boolean[] P01UR2_n217BarTipArt ;
   private java.math.BigDecimal[] P01UR2_A1472PrdMtr ;
   private boolean[] P01UR2_n1472PrdMtr ;
   private java.math.BigDecimal[] P01UR2_A1471PrdKgm ;
   private boolean[] P01UR2_n1471PrdKgm ;
   private java.math.BigDecimal[] P01UR2_A1469AlbPrdPKg ;
   private boolean[] P01UR2_n1469AlbPrdPKg ;
   private java.math.BigDecimal[] P01UR2_A1470AlbPrdPMt ;
   private boolean[] P01UR2_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] P01UR2_A4333ProPorRec ;
   private boolean[] P01UR2_n4333ProPorRec ;
   private java.math.BigDecimal[] P01UR2_A4332ProPreRec ;
   private boolean[] P01UR2_n4332ProPreRec ;
   private short[] P01UR2_A1468AlbPrdLin ;
}

final  class pfacau14__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01UR2", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarSer, T2.ProDsc, T3.BarPart, T1.ProCod, T3.BarEncCli, T3.BarTipArt, T1.PrdMtr, T1.PrdKgm, T1.AlbPrdPKg, T1.AlbPrdPMt, T1.ProPorRec, T1.ProPreRec, T1.AlbPrdLin FROM ((TXPALBPRD T1 LEFT JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01UR3", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacProCod, FacEncCli, FacBonLi, FacTipArt, FacImpMan, FacImpMin, FacRec, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacPreKgsA, FacDsc2, FacDishCod, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(18);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 8);
               stmt.setString(20, (String)parms[19], 20);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 2);
               return;
      }
   }

}

