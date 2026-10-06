package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmmvrhd extends GXProcedure
{
   public pmmvrhd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmmvrhd.class ), "" );
   }

   public pmmvrhd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             short[] aP10 ,
                             java.util.Date[] aP11 ,
                             int[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 )
   {
      pmmvrhd.this.aP16 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        short[] aP10 ,
                        java.util.Date[] aP11 ,
                        int[] aP12 ,
                        byte[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             short[] aP10 ,
                             java.util.Date[] aP11 ,
                             int[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 )
   {
      pmmvrhd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmmvrhd.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pmmvrhd.this.AV17RpExHdTip = aP2[0];
      this.aP2 = aP2;
      pmmvrhd.this.AV18RpExHdAlb = aP3[0];
      this.aP3 = aP3;
      pmmvrhd.this.AV19RpExHdLi = aP4[0];
      this.aP4 = aP4;
      pmmvrhd.this.AV20KgsOld = aP5[0];
      this.aP5 = aP5;
      pmmvrhd.this.AV33MtsOld = aP6[0];
      this.aP6 = aP6;
      pmmvrhd.this.AV21ConosOld = aP7[0];
      this.aP7 = aP7;
      pmmvrhd.this.AV22Kgs = aP8[0];
      this.aP8 = aP8;
      pmmvrhd.this.AV34Mts = aP9[0];
      this.aP9 = aP9;
      pmmvrhd.this.AV23Conos = aP10[0];
      this.aP10 = aP10;
      pmmvrhd.this.AV24RpExHdFe = aP11[0];
      this.aP11 = aP11;
      pmmvrhd.this.AV25BarCod = aP12[0];
      this.aP12 = aP12;
      pmmvrhd.this.AV26BarCodReo = aP13[0];
      this.aP13 = aP13;
      pmmvrhd.this.AV27BarCodPar = aP14[0];
      this.aP14 = aP14;
      pmmvrhd.this.AV17RpExHdTip = aP15[0];
      this.aP15 = aP15;
      pmmvrhd.this.AV28RpExHdRes = aP16[0];
      this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00FM2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18RpExHdAlb), Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodReo), AV27BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00FM2_A130BarCodPar[0] ;
         A132BarCodReo = P00FM2_A132BarCodReo[0] ;
         A129BarCod = P00FM2_A129BarCod[0] ;
         A2253SalExtAlb = P00FM2_A2253SalExtAlb[0] ;
         A396EmprCod = P00FM2_A396EmprCod[0] ;
         A457FasCod = P00FM2_A457FasCod[0] ;
         n457FasCod = P00FM2_n457FasCod[0] ;
         A2840SalExtMtR = P00FM2_A2840SalExtMtR[0] ;
         n2840SalExtMtR = P00FM2_n2840SalExtMtR[0] ;
         A2260SalExtKgR = P00FM2_A2260SalExtKgR[0] ;
         n2260SalExtKgR = P00FM2_n2260SalExtKgR[0] ;
         A2261SalExtCoR = P00FM2_A2261SalExtCoR[0] ;
         n2261SalExtCoR = P00FM2_n2261SalExtCoR[0] ;
         A2259SalExtFeR = P00FM2_A2259SalExtFeR[0] ;
         n2259SalExtFeR = P00FM2_n2259SalExtFeR[0] ;
         A2262SalExtEsB = P00FM2_A2262SalExtEsB[0] ;
         n2262SalExtEsB = P00FM2_n2262SalExtEsB[0] ;
         A2757SalExtEnt = P00FM2_A2757SalExtEnt[0] ;
         n2757SalExtEnt = P00FM2_n2757SalExtEnt[0] ;
         AV32FasCod = A457FasCod ;
         A2840SalExtMtR = A2840SalExtMtR.subtract(AV33MtsOld).add(AV34Mts) ;
         n2840SalExtMtR = false ;
         A2260SalExtKgR = A2260SalExtKgR.subtract(AV20KgsOld).add(AV22Kgs) ;
         n2260SalExtKgR = false ;
         A2261SalExtCoR = (short)(A2261SalExtCoR-AV21ConosOld+AV23Conos) ;
         n2261SalExtCoR = false ;
         A2259SalExtFeR = AV24RpExHdFe ;
         n2259SalExtFeR = false ;
         if ( GXutil.strcmp(AV17RpExHdTip, httpContext.getMessage( "P", "")) == 0 )
         {
            A2262SalExtEsB = (byte)(1) ;
            n2262SalExtEsB = false ;
         }
         if ( GXutil.strcmp(AV17RpExHdTip, httpContext.getMessage( "T", "")) == 0 )
         {
            A2262SalExtEsB = (byte)(2) ;
            n2262SalExtEsB = false ;
         }
         A2757SalExtEnt = AV17RpExHdTip ;
         n2757SalExtEnt = false ;
         /* Using cursor P00FM3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2840SalExtMtR), A2840SalExtMtR, Boolean.valueOf(n2260SalExtKgR), A2260SalExtKgR, Boolean.valueOf(n2261SalExtCoR), Short.valueOf(A2261SalExtCoR), Boolean.valueOf(n2259SalExtFeR), A2259SalExtFeR, Boolean.valueOf(n2262SalExtEsB), Byte.valueOf(A2262SalExtEsB), Boolean.valueOf(n2757SalExtEnt), A2757SalExtEnt, A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00FM4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV32FasCod, Short.valueOf(AV19RpExHdLi), AV24RpExHdFe});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2700ExHdrFeR = P00FM4_A2700ExHdrFeR[0] ;
         n2700ExHdrFeR = P00FM4_n2700ExHdrFeR[0] ;
         A2693ExHdrTip = P00FM4_A2693ExHdrTip[0] ;
         n2693ExHdrTip = P00FM4_n2693ExHdrTip[0] ;
         A2704ExHdrExL = P00FM4_A2704ExHdrExL[0] ;
         n2704ExHdrExL = P00FM4_n2704ExHdrExL[0] ;
         A2689ExHdrFas = P00FM4_A2689ExHdrFas[0] ;
         A2248ManCod = P00FM4_A2248ManCod[0] ;
         A396EmprCod = P00FM4_A396EmprCod[0] ;
         A2845ExHdrMtR = P00FM4_A2845ExHdrMtR[0] ;
         n2845ExHdrMtR = P00FM4_n2845ExHdrMtR[0] ;
         A2698ExHdrKgR = P00FM4_A2698ExHdrKgR[0] ;
         n2698ExHdrKgR = P00FM4_n2698ExHdrKgR[0] ;
         A2699ExHdrCnR = P00FM4_A2699ExHdrCnR[0] ;
         n2699ExHdrCnR = P00FM4_n2699ExHdrCnR[0] ;
         A2692ExHdrLin = P00FM4_A2692ExHdrLin[0] ;
         if ( GXutil.strcmp(A2693ExHdrTip, httpContext.getMessage( "R", "")) == 0 )
         {
            A2845ExHdrMtR = A2845ExHdrMtR.subtract(AV33MtsOld).add(AV34Mts) ;
            n2845ExHdrMtR = false ;
            A2698ExHdrKgR = A2698ExHdrKgR.subtract(AV20KgsOld).add(AV22Kgs) ;
            n2698ExHdrKgR = false ;
            A2699ExHdrCnR = (short)(A2699ExHdrCnR-AV21ConosOld+AV23Conos) ;
            n2699ExHdrCnR = false ;
            /* Using cursor P00FM5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n2845ExHdrMtR), A2845ExHdrMtR, Boolean.valueOf(n2698ExHdrKgR), A2698ExHdrKgR, Boolean.valueOf(n2699ExHdrCnR), Short.valueOf(A2699ExHdrCnR), A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmmvrhd.this.AV15EmprCod;
      this.aP1[0] = pmmvrhd.this.AV16ManCod;
      this.aP2[0] = pmmvrhd.this.AV17RpExHdTip;
      this.aP3[0] = pmmvrhd.this.AV18RpExHdAlb;
      this.aP4[0] = pmmvrhd.this.AV19RpExHdLi;
      this.aP5[0] = pmmvrhd.this.AV20KgsOld;
      this.aP6[0] = pmmvrhd.this.AV33MtsOld;
      this.aP7[0] = pmmvrhd.this.AV21ConosOld;
      this.aP8[0] = pmmvrhd.this.AV22Kgs;
      this.aP9[0] = pmmvrhd.this.AV34Mts;
      this.aP10[0] = pmmvrhd.this.AV23Conos;
      this.aP11[0] = pmmvrhd.this.AV24RpExHdFe;
      this.aP12[0] = pmmvrhd.this.AV25BarCod;
      this.aP13[0] = pmmvrhd.this.AV26BarCodReo;
      this.aP14[0] = pmmvrhd.this.AV27BarCodPar;
      this.aP15[0] = pmmvrhd.this.AV17RpExHdTip;
      this.aP16[0] = pmmvrhd.this.AV28RpExHdRes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmmvrhd");
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
      P00FM2_A130BarCodPar = new String[] {""} ;
      P00FM2_A132BarCodReo = new byte[1] ;
      P00FM2_A129BarCod = new int[1] ;
      P00FM2_A2253SalExtAlb = new int[1] ;
      P00FM2_A396EmprCod = new String[] {""} ;
      P00FM2_A457FasCod = new String[] {""} ;
      P00FM2_n457FasCod = new boolean[] {false} ;
      P00FM2_A2840SalExtMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FM2_n2840SalExtMtR = new boolean[] {false} ;
      P00FM2_A2260SalExtKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FM2_n2260SalExtKgR = new boolean[] {false} ;
      P00FM2_A2261SalExtCoR = new short[1] ;
      P00FM2_n2261SalExtCoR = new boolean[] {false} ;
      P00FM2_A2259SalExtFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P00FM2_n2259SalExtFeR = new boolean[] {false} ;
      P00FM2_A2262SalExtEsB = new byte[1] ;
      P00FM2_n2262SalExtEsB = new boolean[] {false} ;
      P00FM2_A2757SalExtEnt = new String[] {""} ;
      P00FM2_n2757SalExtEnt = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A2840SalExtMtR = DecimalUtil.ZERO ;
      A2260SalExtKgR = DecimalUtil.ZERO ;
      A2259SalExtFeR = GXutil.nullDate() ;
      A2757SalExtEnt = "" ;
      AV32FasCod = "" ;
      P00FM4_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P00FM4_n2700ExHdrFeR = new boolean[] {false} ;
      P00FM4_A2693ExHdrTip = new String[] {""} ;
      P00FM4_n2693ExHdrTip = new boolean[] {false} ;
      P00FM4_A2704ExHdrExL = new short[1] ;
      P00FM4_n2704ExHdrExL = new boolean[] {false} ;
      P00FM4_A2689ExHdrFas = new String[] {""} ;
      P00FM4_A2248ManCod = new short[1] ;
      P00FM4_A396EmprCod = new String[] {""} ;
      P00FM4_A2845ExHdrMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FM4_n2845ExHdrMtR = new boolean[] {false} ;
      P00FM4_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FM4_n2698ExHdrKgR = new boolean[] {false} ;
      P00FM4_A2699ExHdrCnR = new short[1] ;
      P00FM4_n2699ExHdrCnR = new boolean[] {false} ;
      P00FM4_A2692ExHdrLin = new int[1] ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      A2693ExHdrTip = "" ;
      A2689ExHdrFas = "" ;
      A2845ExHdrMtR = DecimalUtil.ZERO ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmmvrhd__default(),
         new Object[] {
             new Object[] {
            P00FM2_A130BarCodPar, P00FM2_A132BarCodReo, P00FM2_A129BarCod, P00FM2_A2253SalExtAlb, P00FM2_A396EmprCod, P00FM2_A457FasCod, P00FM2_n457FasCod, P00FM2_A2840SalExtMtR, P00FM2_n2840SalExtMtR, P00FM2_A2260SalExtKgR,
            P00FM2_n2260SalExtKgR, P00FM2_A2261SalExtCoR, P00FM2_n2261SalExtCoR, P00FM2_A2259SalExtFeR, P00FM2_n2259SalExtFeR, P00FM2_A2262SalExtEsB, P00FM2_n2262SalExtEsB, P00FM2_A2757SalExtEnt, P00FM2_n2757SalExtEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P00FM4_A2700ExHdrFeR, P00FM4_n2700ExHdrFeR, P00FM4_A2693ExHdrTip, P00FM4_n2693ExHdrTip, P00FM4_A2704ExHdrExL, P00FM4_n2704ExHdrExL, P00FM4_A2689ExHdrFas, P00FM4_A2248ManCod, P00FM4_A396EmprCod, P00FM4_A2845ExHdrMtR,
            P00FM4_n2845ExHdrMtR, P00FM4_A2698ExHdrKgR, P00FM4_n2698ExHdrKgR, P00FM4_A2699ExHdrCnR, P00FM4_n2699ExHdrCnR, P00FM4_A2692ExHdrLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26BarCodReo ;
   private byte A132BarCodReo ;
   private byte A2262SalExtEsB ;
   private short AV16ManCod ;
   private short AV19RpExHdLi ;
   private short AV21ConosOld ;
   private short AV23Conos ;
   private short A2261SalExtCoR ;
   private short A2704ExHdrExL ;
   private short A2248ManCod ;
   private short A2699ExHdrCnR ;
   private short Gx_err ;
   private int AV18RpExHdAlb ;
   private int AV25BarCod ;
   private int A129BarCod ;
   private int A2253SalExtAlb ;
   private int A2692ExHdrLin ;
   private java.math.BigDecimal AV20KgsOld ;
   private java.math.BigDecimal AV33MtsOld ;
   private java.math.BigDecimal AV22Kgs ;
   private java.math.BigDecimal AV34Mts ;
   private java.math.BigDecimal A2840SalExtMtR ;
   private java.math.BigDecimal A2260SalExtKgR ;
   private java.math.BigDecimal A2845ExHdrMtR ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private String AV15EmprCod ;
   private String AV17RpExHdTip ;
   private String AV27BarCodPar ;
   private String AV28RpExHdRes ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A2757SalExtEnt ;
   private String AV32FasCod ;
   private String A2693ExHdrTip ;
   private String A2689ExHdrFas ;
   private java.util.Date AV24RpExHdFe ;
   private java.util.Date A2259SalExtFeR ;
   private java.util.Date A2700ExHdrFeR ;
   private boolean n457FasCod ;
   private boolean n2840SalExtMtR ;
   private boolean n2260SalExtKgR ;
   private boolean n2261SalExtCoR ;
   private boolean n2259SalExtFeR ;
   private boolean n2262SalExtEsB ;
   private boolean n2757SalExtEnt ;
   private boolean n2700ExHdrFeR ;
   private boolean n2693ExHdrTip ;
   private boolean n2704ExHdrExL ;
   private boolean n2845ExHdrMtR ;
   private boolean n2698ExHdrKgR ;
   private boolean n2699ExHdrCnR ;
   private String[] aP16 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private short[] aP10 ;
   private java.util.Date[] aP11 ;
   private int[] aP12 ;
   private byte[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private IDataStoreProvider pr_default ;
   private String[] P00FM2_A130BarCodPar ;
   private byte[] P00FM2_A132BarCodReo ;
   private int[] P00FM2_A129BarCod ;
   private int[] P00FM2_A2253SalExtAlb ;
   private String[] P00FM2_A396EmprCod ;
   private String[] P00FM2_A457FasCod ;
   private boolean[] P00FM2_n457FasCod ;
   private java.math.BigDecimal[] P00FM2_A2840SalExtMtR ;
   private boolean[] P00FM2_n2840SalExtMtR ;
   private java.math.BigDecimal[] P00FM2_A2260SalExtKgR ;
   private boolean[] P00FM2_n2260SalExtKgR ;
   private short[] P00FM2_A2261SalExtCoR ;
   private boolean[] P00FM2_n2261SalExtCoR ;
   private java.util.Date[] P00FM2_A2259SalExtFeR ;
   private boolean[] P00FM2_n2259SalExtFeR ;
   private byte[] P00FM2_A2262SalExtEsB ;
   private boolean[] P00FM2_n2262SalExtEsB ;
   private String[] P00FM2_A2757SalExtEnt ;
   private boolean[] P00FM2_n2757SalExtEnt ;
   private java.util.Date[] P00FM4_A2700ExHdrFeR ;
   private boolean[] P00FM4_n2700ExHdrFeR ;
   private String[] P00FM4_A2693ExHdrTip ;
   private boolean[] P00FM4_n2693ExHdrTip ;
   private short[] P00FM4_A2704ExHdrExL ;
   private boolean[] P00FM4_n2704ExHdrExL ;
   private String[] P00FM4_A2689ExHdrFas ;
   private short[] P00FM4_A2248ManCod ;
   private String[] P00FM4_A396EmprCod ;
   private java.math.BigDecimal[] P00FM4_A2845ExHdrMtR ;
   private boolean[] P00FM4_n2845ExHdrMtR ;
   private java.math.BigDecimal[] P00FM4_A2698ExHdrKgR ;
   private boolean[] P00FM4_n2698ExHdrKgR ;
   private short[] P00FM4_A2699ExHdrCnR ;
   private boolean[] P00FM4_n2699ExHdrCnR ;
   private int[] P00FM4_A2692ExHdrLin ;
}

final  class pmmvrhd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FM2", "SELECT BarCodPar, BarCodReo, BarCod, SalExtAlb, EmprCod, FasCod, SalExtMtR, SalExtKgR, SalExtCoR, SalExtFeR, SalExtEsB, SalExtEnt FROM TXPLEXTSA WHERE EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00FM3", "UPDATE TXPLEXTSA SET SalExtMtR=?, SalExtKgR=?, SalExtCoR=?, SalExtFeR=?, SalExtEsB=?, SalExtEnt=?  WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXTSA")
         ,new ForEachCursor("P00FM4", "SELECT ExHdrFeR, ExHdrTip, ExHdrExL, ExHdrFas, ManCod, EmprCod, ExHdrMtR, ExHdrKgR, ExHdrCnR, ExHdrLin FROM TXPLEXMVH WHERE (EmprCod = ? and ManCod = ? and ExHdrFas = ?) AND (ExHdrExL = ?) AND (ExHdrFeR = ?) ORDER BY EmprCod, ManCod, ExHdrFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00FM5", "UPDATE TXPLEXMVH SET ExHdrMtR=?, ExHdrKgR=?, ExHdrCnR=?  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 8);
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setInt(9, ((Number) parms[14]).intValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setString(11, (String)parms[16], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setString(6, (String)parms[8], 8);
               stmt.setInt(7, ((Number) parms[9]).intValue());
               return;
      }
   }

}

