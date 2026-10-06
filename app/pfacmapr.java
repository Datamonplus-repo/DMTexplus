package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacmapr extends GXProcedure
{
   public pfacmapr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacmapr.class ), "" );
   }

   public pfacmapr( int remoteHandle ,
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
                          String[] aP5 ,
                          int[] aP6 ,
                          int[] aP7 )
   {
      pfacmapr.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 )
   {
      pfacmapr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacmapr.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pfacmapr.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pfacmapr.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pfacmapr.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pfacmapr.this.AV38BarDisNum = aP5[0];
      this.aP5 = aP5;
      pfacmapr.this.AV20NumLin = aP6[0];
      this.aP6 = aP6;
      pfacmapr.this.AV19NumFac = aP7[0];
      this.aP7 = aP7;
      pfacmapr.this.AV80CliFac = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV91Guasch ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GUASCH", ""), GXv_int1) ;
      pfacmapr.this.AV91Guasch = GXv_int1[0] ;
      GXv_int1[0] = AV100Martex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int1) ;
      pfacmapr.this.AV100Martex = GXv_int1[0] ;
      GXv_int1[0] = AV99Texknit ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int1) ;
      pfacmapr.this.AV99Texknit = GXv_int1[0] ;
      /* Using cursor P038B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A212BarSer = P038B2_A212BarSer[0] ;
         A759ProDsc = P038B2_A759ProDsc[0] ;
         A1458BarAlbBul = P038B2_A1458BarAlbBul[0] ;
         A1503BarPart = P038B2_A1503BarPart[0] ;
         A758ProCod = P038B2_A758ProCod[0] ;
         n758ProCod = P038B2_n758ProCod[0] ;
         A135BarColNom = P038B2_A135BarColNom[0] ;
         A136BarColNum = P038B2_A136BarColNum[0] ;
         A864BarPes = P038B2_A864BarPes[0] ;
         A4812BarEncCli = P038B2_A4812BarEncCli[0] ;
         A217BarTipArt = P038B2_A217BarTipArt[0] ;
         n217BarTipArt = P038B2_n217BarTipArt[0] ;
         A1472PrdMtr = P038B2_A1472PrdMtr[0] ;
         n1472PrdMtr = P038B2_n1472PrdMtr[0] ;
         A1471PrdKgm = P038B2_A1471PrdKgm[0] ;
         n1471PrdKgm = P038B2_n1471PrdKgm[0] ;
         A1469AlbPrdPKg = P038B2_A1469AlbPrdPKg[0] ;
         n1469AlbPrdPKg = P038B2_n1469AlbPrdPKg[0] ;
         A1470AlbPrdPMt = P038B2_A1470AlbPrdPMt[0] ;
         n1470AlbPrdPMt = P038B2_n1470AlbPrdPMt[0] ;
         A4333ProPorRec = P038B2_A4333ProPorRec[0] ;
         n4333ProPorRec = P038B2_n4333ProPorRec[0] ;
         A4332ProPreRec = P038B2_A4332ProPreRec[0] ;
         n4332ProPreRec = P038B2_n4332ProPreRec[0] ;
         A1468AlbPrdLin = P038B2_A1468AlbPrdLin[0] ;
         A759ProDsc = P038B2_A759ProDsc[0] ;
         A212BarSer = P038B2_A212BarSer[0] ;
         A1503BarPart = P038B2_A1503BarPart[0] ;
         A135BarColNom = P038B2_A135BarColNom[0] ;
         A136BarColNum = P038B2_A136BarColNum[0] ;
         A864BarPes = P038B2_A864BarPes[0] ;
         A4812BarEncCli = P038B2_A4812BarEncCli[0] ;
         A217BarTipArt = P038B2_A217BarTipArt[0] ;
         n217BarTipArt = P038B2_n217BarTipArt[0] ;
         A1458BarAlbBul = P038B2_A1458BarAlbBul[0] ;
         AV20NumLin = (int)(AV20NumLin+1) ;
         AV30Metros = A1472PrdMtr ;
         AV31Kilos = A1471PrdKgm ;
         AV32PrecioKg = A1469AlbPrdPKg ;
         AV33PrecioMt = A1470AlbPrdPMt ;
         AV98ProPorRec = A4333ProPorRec ;
         AV97ProPreRec = A4332ProPreRec ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33PrecioMt)==0) )
         {
            AV33PrecioMt = DecimalUtil.ZERO ;
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32PrecioKg)==0) )
         {
            AV32PrecioKg = DecimalUtil.ZERO ;
         }
         /*
            INSERT RECORD ON TABLE TXPLFAVEN

         */
         A430FacCod = AV19NumFac ;
         A446FacLin = AV20NumLin ;
         A427FacAlbCod = A30AlbProCod ;
         A1294FacBarCod = A129BarCod ;
         A1295FacBarReo = A132BarCodReo ;
         A1296FacBarPar = A130BarCodPar ;
         A428FacAlbTip = (byte)(1) ;
         A454FacSer = A212BarSer ;
         A448FacPreKgs = AV32PrecioKg ;
         A449FacPreMts = AV33PrecioMt ;
         A444FacKgs = AV31Kilos ;
         A447FacMts = AV30Metros ;
         A432FacDsc = A759ProDsc ;
         A1498FacDisNum = AV38BarDisNum ;
         if ( ( AV79FlagSal == 1 ) || ( AV105PLinea == 1 ) )
         {
            A1498FacDisNum = GXutil.str( A1458BarAlbBul, 4, 0) ;
         }
         A3303FacNPart = A1503BarPart ;
         A3397FacFasCod = A758ProCod ;
         if ( AV91Guasch == 1 )
         {
            A3884FacProCod = A758ProCod ;
            A3881FacNomCol = A135BarColNom ;
            A3882FacNumCol = A136BarColNum ;
            A3303FacNPart = A864BarPes ;
            A451FacRec = AV97ProPreRec ;
            A3897FacKgsA = AV98ProPorRec ;
         }
         if ( ( AV99Texknit == 1 ) || ( AV100Martex == 1 ) )
         {
            A3097FacTipPro = httpContext.getMessage( "P", "") ;
         }
         A4814FacEncCli = A4812BarEncCli ;
         A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
         A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
         A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
         A3883FacCliCod = AV80CliFac ;
         A5189FacTipArt = A217BarTipArt ;
         /* Using cursor P038B3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A3881FacNomCol, Integer.valueOf(A3882FacNumCol), Integer.valueOf(A3883FacCliCod), A3884FacProCod, A4814FacEncCli, A5050FacBonLi, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin, A3897FacKgsA});
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacmapr.this.A396EmprCod;
      this.aP1[0] = pfacmapr.this.A30AlbProCod;
      this.aP2[0] = pfacmapr.this.A129BarCod;
      this.aP3[0] = pfacmapr.this.A132BarCodReo;
      this.aP4[0] = pfacmapr.this.A130BarCodPar;
      this.aP5[0] = pfacmapr.this.AV38BarDisNum;
      this.aP6[0] = pfacmapr.this.AV20NumLin;
      this.aP7[0] = pfacmapr.this.AV19NumFac;
      this.aP8[0] = pfacmapr.this.AV80CliFac;
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
      P038B2_A396EmprCod = new String[] {""} ;
      P038B2_A30AlbProCod = new long[1] ;
      P038B2_A129BarCod = new int[1] ;
      P038B2_A132BarCodReo = new byte[1] ;
      P038B2_A130BarCodPar = new String[] {""} ;
      P038B2_A212BarSer = new String[] {""} ;
      P038B2_A759ProDsc = new String[] {""} ;
      P038B2_A1458BarAlbBul = new short[1] ;
      P038B2_A1503BarPart = new short[1] ;
      P038B2_A758ProCod = new String[] {""} ;
      P038B2_n758ProCod = new boolean[] {false} ;
      P038B2_A135BarColNom = new String[] {""} ;
      P038B2_A136BarColNum = new int[1] ;
      P038B2_A864BarPes = new short[1] ;
      P038B2_A4812BarEncCli = new String[] {""} ;
      P038B2_A217BarTipArt = new short[1] ;
      P038B2_n217BarTipArt = new boolean[] {false} ;
      P038B2_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038B2_n1472PrdMtr = new boolean[] {false} ;
      P038B2_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038B2_n1471PrdKgm = new boolean[] {false} ;
      P038B2_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038B2_n1469AlbPrdPKg = new boolean[] {false} ;
      P038B2_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038B2_n1470AlbPrdPMt = new boolean[] {false} ;
      P038B2_A4333ProPorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038B2_n4333ProPorRec = new boolean[] {false} ;
      P038B2_A4332ProPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038B2_n4332ProPreRec = new boolean[] {false} ;
      P038B2_A1468AlbPrdLin = new short[1] ;
      A212BarSer = "" ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      A135BarColNom = "" ;
      A4812BarEncCli = "" ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A4333ProPorRec = DecimalUtil.ZERO ;
      A4332ProPreRec = DecimalUtil.ZERO ;
      AV30Metros = DecimalUtil.ZERO ;
      AV31Kilos = DecimalUtil.ZERO ;
      AV32PrecioKg = DecimalUtil.ZERO ;
      AV33PrecioMt = DecimalUtil.ZERO ;
      AV98ProPorRec = DecimalUtil.ZERO ;
      AV97ProPreRec = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A1498FacDisNum = "" ;
      A3397FacFasCod = "" ;
      A3884FacProCod = "" ;
      A3881FacNomCol = "" ;
      A451FacRec = DecimalUtil.ZERO ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3097FacTipPro = "" ;
      A4814FacEncCli = "" ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacmapr__default(),
         new Object[] {
             new Object[] {
            P038B2_A396EmprCod, P038B2_A30AlbProCod, P038B2_A129BarCod, P038B2_A132BarCodReo, P038B2_A130BarCodPar, P038B2_A212BarSer, P038B2_A759ProDsc, P038B2_A1458BarAlbBul, P038B2_A1503BarPart, P038B2_A758ProCod,
            P038B2_n758ProCod, P038B2_A135BarColNom, P038B2_A136BarColNum, P038B2_A864BarPes, P038B2_A4812BarEncCli, P038B2_A217BarTipArt, P038B2_n217BarTipArt, P038B2_A1472PrdMtr, P038B2_n1472PrdMtr, P038B2_A1471PrdKgm,
            P038B2_n1471PrdKgm, P038B2_A1469AlbPrdPKg, P038B2_n1469AlbPrdPKg, P038B2_A1470AlbPrdPMt, P038B2_n1470AlbPrdPMt, P038B2_A4333ProPorRec, P038B2_n4333ProPorRec, P038B2_A4332ProPreRec, P038B2_n4332ProPreRec, P038B2_A1468AlbPrdLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV91Guasch ;
   private byte AV100Martex ;
   private byte AV99Texknit ;
   private byte GXv_int1[] ;
   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private byte AV79FlagSal ;
   private byte AV105PLinea ;
   private short A1458BarAlbBul ;
   private short A1503BarPart ;
   private short A864BarPes ;
   private short A217BarTipArt ;
   private short A1468AlbPrdLin ;
   private short A3303FacNPart ;
   private short A5189FacTipArt ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV20NumLin ;
   private int AV19NumFac ;
   private int AV80CliFac ;
   private int A136BarColNum ;
   private int GX_INS44 ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A3882FacNumCol ;
   private int A3883FacCliCod ;
   private long A30AlbProCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1471PrdKgm ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A4333ProPorRec ;
   private java.math.BigDecimal A4332ProPreRec ;
   private java.math.BigDecimal AV30Metros ;
   private java.math.BigDecimal AV31Kilos ;
   private java.math.BigDecimal AV32PrecioKg ;
   private java.math.BigDecimal AV33PrecioMt ;
   private java.math.BigDecimal AV98ProPorRec ;
   private java.math.BigDecimal AV97ProPreRec ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV38BarDisNum ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String A135BarColNom ;
   private String A4812BarEncCli ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A1498FacDisNum ;
   private String A3397FacFasCod ;
   private String A3884FacProCod ;
   private String A3881FacNomCol ;
   private String A3097FacTipPro ;
   private String A4814FacEncCli ;
   private String Gx_emsg ;
   private boolean n758ProCod ;
   private boolean n217BarTipArt ;
   private boolean n1472PrdMtr ;
   private boolean n1471PrdKgm ;
   private boolean n1469AlbPrdPKg ;
   private boolean n1470AlbPrdPMt ;
   private boolean n4333ProPorRec ;
   private boolean n4332ProPreRec ;
   private int[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P038B2_A396EmprCod ;
   private long[] P038B2_A30AlbProCod ;
   private int[] P038B2_A129BarCod ;
   private byte[] P038B2_A132BarCodReo ;
   private String[] P038B2_A130BarCodPar ;
   private String[] P038B2_A212BarSer ;
   private String[] P038B2_A759ProDsc ;
   private short[] P038B2_A1458BarAlbBul ;
   private short[] P038B2_A1503BarPart ;
   private String[] P038B2_A758ProCod ;
   private boolean[] P038B2_n758ProCod ;
   private String[] P038B2_A135BarColNom ;
   private int[] P038B2_A136BarColNum ;
   private short[] P038B2_A864BarPes ;
   private String[] P038B2_A4812BarEncCli ;
   private short[] P038B2_A217BarTipArt ;
   private boolean[] P038B2_n217BarTipArt ;
   private java.math.BigDecimal[] P038B2_A1472PrdMtr ;
   private boolean[] P038B2_n1472PrdMtr ;
   private java.math.BigDecimal[] P038B2_A1471PrdKgm ;
   private boolean[] P038B2_n1471PrdKgm ;
   private java.math.BigDecimal[] P038B2_A1469AlbPrdPKg ;
   private boolean[] P038B2_n1469AlbPrdPKg ;
   private java.math.BigDecimal[] P038B2_A1470AlbPrdPMt ;
   private boolean[] P038B2_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] P038B2_A4333ProPorRec ;
   private boolean[] P038B2_n4333ProPorRec ;
   private java.math.BigDecimal[] P038B2_A4332ProPreRec ;
   private boolean[] P038B2_n4332ProPreRec ;
   private short[] P038B2_A1468AlbPrdLin ;
}

final  class pfacmapr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P038B2", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarSer, T2.ProDsc, T4.BarAlbBul, T3.BarPart, T1.ProCod, T3.BarColNom, T3.BarColNum, T3.BarPes, T3.BarEncCli, T3.BarTipArt, T1.PrdMtr, T1.PrdKgm, T1.AlbPrdPKg, T1.AlbPrdPMt, T1.ProPorRec, T1.ProPreRec, T1.AlbPrdLin FROM (((TXPALBPRD T1 LEFT JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) INNER JOIN TXPALBBAR T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P038B3", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacFasCod, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacEncCli, FacBonLi, FacTipArt, FacImpMan, FacImpMin, FacKgsA, FacColNom, FocColNum, FacTipColC, FacPreKgsA, FacDsc2, FacDishCod, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
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
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(19,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(21,5);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(22);
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
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 8);
               stmt.setString(20, (String)parms[19], 13);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setString(23, (String)parms[22], 8);
               stmt.setString(24, (String)parms[23], 20);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 2);
               stmt.setShort(26, ((Number) parms[25]).shortValue());
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[26], 2);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[27], 2);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[28], 2);
               return;
      }
   }

}

