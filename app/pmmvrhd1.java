package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmmvrhd1 extends GXProcedure
{
   public pmmvrhd1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmmvrhd1.class ), "" );
   }

   public pmmvrhd1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
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
      pmmvrhd1.this.aP17 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
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
                        String[] aP16 ,
                        short[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
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
                             String[] aP16 ,
                             short[] aP17 )
   {
      pmmvrhd1.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmmvrhd1.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pmmvrhd1.this.AV17RpExHdTip = aP2[0];
      this.aP2 = aP2;
      pmmvrhd1.this.AV18RpExHdAlb = aP3[0];
      this.aP3 = aP3;
      pmmvrhd1.this.AV19RpExHdLi = aP4[0];
      this.aP4 = aP4;
      pmmvrhd1.this.AV20KgsOld = aP5[0];
      this.aP5 = aP5;
      pmmvrhd1.this.AV33MtsOld = aP6[0];
      this.aP6 = aP6;
      pmmvrhd1.this.AV21ConosOld = aP7[0];
      this.aP7 = aP7;
      pmmvrhd1.this.AV22Kgs = aP8[0];
      this.aP8 = aP8;
      pmmvrhd1.this.AV34Mts = aP9[0];
      this.aP9 = aP9;
      pmmvrhd1.this.AV23Conos = aP10[0];
      this.aP10 = aP10;
      pmmvrhd1.this.AV24RpExHdFe = aP11[0];
      this.aP11 = aP11;
      pmmvrhd1.this.AV25BarCod = aP12[0];
      this.aP12 = aP12;
      pmmvrhd1.this.AV26BarCodReo = aP13[0];
      this.aP13 = aP13;
      pmmvrhd1.this.AV27BarCodPar = aP14[0];
      this.aP14 = aP14;
      pmmvrhd1.this.AV17RpExHdTip = aP15[0];
      this.aP15 = aP15;
      pmmvrhd1.this.AV28RpExHdRes = aP16[0];
      this.aP16 = aP16;
      pmmvrhd1.this.AV35Salexnln = aP17[0];
      this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02CQ2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18RpExHdAlb), Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodReo), AV27BarCodPar, Short.valueOf(AV35Salexnln)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6248SalExNln = P02CQ2_A6248SalExNln[0] ;
         A130BarCodPar = P02CQ2_A130BarCodPar[0] ;
         A132BarCodReo = P02CQ2_A132BarCodReo[0] ;
         A129BarCod = P02CQ2_A129BarCod[0] ;
         A2253SalExtAlb = P02CQ2_A2253SalExtAlb[0] ;
         A396EmprCod = P02CQ2_A396EmprCod[0] ;
         A6558FasCodn = P02CQ2_A6558FasCodn[0] ;
         A6255SalExMtR = P02CQ2_A6255SalExMtR[0] ;
         A6251SalExKgR = P02CQ2_A6251SalExKgR[0] ;
         A6252SalExCoR = P02CQ2_A6252SalExCoR[0] ;
         A6250SalExFeR = P02CQ2_A6250SalExFeR[0] ;
         A6253SalExEsB = P02CQ2_A6253SalExEsB[0] ;
         A6254SalExEnt = P02CQ2_A6254SalExEnt[0] ;
         AV32FasCod = A6558FasCodn ;
         A6255SalExMtR = A6255SalExMtR.subtract(AV33MtsOld).add(AV34Mts) ;
         A6251SalExKgR = A6251SalExKgR.subtract(AV20KgsOld).add(AV22Kgs) ;
         A6252SalExCoR = (int)(A6252SalExCoR-AV21ConosOld+AV23Conos) ;
         A6250SalExFeR = AV24RpExHdFe ;
         A6253SalExEsB = (byte)(((GXutil.strcmp(AV17RpExHdTip, httpContext.getMessage( "P", ""))==0) ? 1 : 2)) ;
         A6254SalExEnt = AV17RpExHdTip ;
         /* Using cursor P02CQ3 */
         pr_default.execute(1, new Object[] {A6255SalExMtR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), A6250SalExFeR, Byte.valueOf(A6253SalExEsB), A6254SalExEnt, A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02CQ4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV32FasCod, Short.valueOf(AV19RpExHdLi), AV24RpExHdFe});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2700ExHdrFeR = P02CQ4_A2700ExHdrFeR[0] ;
         n2700ExHdrFeR = P02CQ4_n2700ExHdrFeR[0] ;
         A2693ExHdrTip = P02CQ4_A2693ExHdrTip[0] ;
         n2693ExHdrTip = P02CQ4_n2693ExHdrTip[0] ;
         A2704ExHdrExL = P02CQ4_A2704ExHdrExL[0] ;
         n2704ExHdrExL = P02CQ4_n2704ExHdrExL[0] ;
         A2689ExHdrFas = P02CQ4_A2689ExHdrFas[0] ;
         A2248ManCod = P02CQ4_A2248ManCod[0] ;
         A396EmprCod = P02CQ4_A396EmprCod[0] ;
         A2845ExHdrMtR = P02CQ4_A2845ExHdrMtR[0] ;
         n2845ExHdrMtR = P02CQ4_n2845ExHdrMtR[0] ;
         A2698ExHdrKgR = P02CQ4_A2698ExHdrKgR[0] ;
         n2698ExHdrKgR = P02CQ4_n2698ExHdrKgR[0] ;
         A2699ExHdrCnR = P02CQ4_A2699ExHdrCnR[0] ;
         n2699ExHdrCnR = P02CQ4_n2699ExHdrCnR[0] ;
         A2692ExHdrLin = P02CQ4_A2692ExHdrLin[0] ;
         if ( GXutil.strcmp(A2693ExHdrTip, httpContext.getMessage( "R", "")) == 0 )
         {
            A2845ExHdrMtR = A2845ExHdrMtR.subtract(AV33MtsOld).add(AV34Mts) ;
            n2845ExHdrMtR = false ;
            A2698ExHdrKgR = A2698ExHdrKgR.subtract(AV20KgsOld).add(AV22Kgs) ;
            n2698ExHdrKgR = false ;
            A2699ExHdrCnR = (short)(A2699ExHdrCnR-AV21ConosOld+AV23Conos) ;
            n2699ExHdrCnR = false ;
            /* Using cursor P02CQ5 */
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
      this.aP0[0] = pmmvrhd1.this.AV15EmprCod;
      this.aP1[0] = pmmvrhd1.this.AV16ManCod;
      this.aP2[0] = pmmvrhd1.this.AV17RpExHdTip;
      this.aP3[0] = pmmvrhd1.this.AV18RpExHdAlb;
      this.aP4[0] = pmmvrhd1.this.AV19RpExHdLi;
      this.aP5[0] = pmmvrhd1.this.AV20KgsOld;
      this.aP6[0] = pmmvrhd1.this.AV33MtsOld;
      this.aP7[0] = pmmvrhd1.this.AV21ConosOld;
      this.aP8[0] = pmmvrhd1.this.AV22Kgs;
      this.aP9[0] = pmmvrhd1.this.AV34Mts;
      this.aP10[0] = pmmvrhd1.this.AV23Conos;
      this.aP11[0] = pmmvrhd1.this.AV24RpExHdFe;
      this.aP12[0] = pmmvrhd1.this.AV25BarCod;
      this.aP13[0] = pmmvrhd1.this.AV26BarCodReo;
      this.aP14[0] = pmmvrhd1.this.AV27BarCodPar;
      this.aP15[0] = pmmvrhd1.this.AV17RpExHdTip;
      this.aP16[0] = pmmvrhd1.this.AV28RpExHdRes;
      this.aP17[0] = pmmvrhd1.this.AV35Salexnln;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmmvrhd1");
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
      P02CQ2_A6248SalExNln = new short[1] ;
      P02CQ2_A130BarCodPar = new String[] {""} ;
      P02CQ2_A132BarCodReo = new byte[1] ;
      P02CQ2_A129BarCod = new int[1] ;
      P02CQ2_A2253SalExtAlb = new int[1] ;
      P02CQ2_A396EmprCod = new String[] {""} ;
      P02CQ2_A6558FasCodn = new String[] {""} ;
      P02CQ2_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CQ2_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CQ2_A6252SalExCoR = new int[1] ;
      P02CQ2_A6250SalExFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P02CQ2_A6253SalExEsB = new byte[1] ;
      P02CQ2_A6254SalExEnt = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A6558FasCodn = "" ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A6250SalExFeR = GXutil.nullDate() ;
      A6254SalExEnt = "" ;
      AV32FasCod = "" ;
      P02CQ4_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P02CQ4_n2700ExHdrFeR = new boolean[] {false} ;
      P02CQ4_A2693ExHdrTip = new String[] {""} ;
      P02CQ4_n2693ExHdrTip = new boolean[] {false} ;
      P02CQ4_A2704ExHdrExL = new short[1] ;
      P02CQ4_n2704ExHdrExL = new boolean[] {false} ;
      P02CQ4_A2689ExHdrFas = new String[] {""} ;
      P02CQ4_A2248ManCod = new short[1] ;
      P02CQ4_A396EmprCod = new String[] {""} ;
      P02CQ4_A2845ExHdrMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CQ4_n2845ExHdrMtR = new boolean[] {false} ;
      P02CQ4_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CQ4_n2698ExHdrKgR = new boolean[] {false} ;
      P02CQ4_A2699ExHdrCnR = new short[1] ;
      P02CQ4_n2699ExHdrCnR = new boolean[] {false} ;
      P02CQ4_A2692ExHdrLin = new int[1] ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      A2693ExHdrTip = "" ;
      A2689ExHdrFas = "" ;
      A2845ExHdrMtR = DecimalUtil.ZERO ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmmvrhd1__default(),
         new Object[] {
             new Object[] {
            P02CQ2_A6248SalExNln, P02CQ2_A130BarCodPar, P02CQ2_A132BarCodReo, P02CQ2_A129BarCod, P02CQ2_A2253SalExtAlb, P02CQ2_A396EmprCod, P02CQ2_A6558FasCodn, P02CQ2_A6255SalExMtR, P02CQ2_A6251SalExKgR, P02CQ2_A6252SalExCoR,
            P02CQ2_A6250SalExFeR, P02CQ2_A6253SalExEsB, P02CQ2_A6254SalExEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P02CQ4_A2700ExHdrFeR, P02CQ4_n2700ExHdrFeR, P02CQ4_A2693ExHdrTip, P02CQ4_n2693ExHdrTip, P02CQ4_A2704ExHdrExL, P02CQ4_n2704ExHdrExL, P02CQ4_A2689ExHdrFas, P02CQ4_A2248ManCod, P02CQ4_A396EmprCod, P02CQ4_A2845ExHdrMtR,
            P02CQ4_n2845ExHdrMtR, P02CQ4_A2698ExHdrKgR, P02CQ4_n2698ExHdrKgR, P02CQ4_A2699ExHdrCnR, P02CQ4_n2699ExHdrCnR, P02CQ4_A2692ExHdrLin
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
   private byte A6253SalExEsB ;
   private short AV16ManCod ;
   private short AV19RpExHdLi ;
   private short AV21ConosOld ;
   private short AV23Conos ;
   private short AV35Salexnln ;
   private short A6248SalExNln ;
   private short A2704ExHdrExL ;
   private short A2248ManCod ;
   private short A2699ExHdrCnR ;
   private short Gx_err ;
   private int AV18RpExHdAlb ;
   private int AV25BarCod ;
   private int A129BarCod ;
   private int A2253SalExtAlb ;
   private int A6252SalExCoR ;
   private int A2692ExHdrLin ;
   private java.math.BigDecimal AV20KgsOld ;
   private java.math.BigDecimal AV33MtsOld ;
   private java.math.BigDecimal AV22Kgs ;
   private java.math.BigDecimal AV34Mts ;
   private java.math.BigDecimal A6255SalExMtR ;
   private java.math.BigDecimal A6251SalExKgR ;
   private java.math.BigDecimal A2845ExHdrMtR ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private String AV15EmprCod ;
   private String AV17RpExHdTip ;
   private String AV27BarCodPar ;
   private String AV28RpExHdRes ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A6558FasCodn ;
   private String A6254SalExEnt ;
   private String AV32FasCod ;
   private String A2693ExHdrTip ;
   private String A2689ExHdrFas ;
   private java.util.Date AV24RpExHdFe ;
   private java.util.Date A6250SalExFeR ;
   private java.util.Date A2700ExHdrFeR ;
   private boolean n2700ExHdrFeR ;
   private boolean n2693ExHdrTip ;
   private boolean n2704ExHdrExL ;
   private boolean n2845ExHdrMtR ;
   private boolean n2698ExHdrKgR ;
   private boolean n2699ExHdrCnR ;
   private short[] aP17 ;
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
   private String[] aP16 ;
   private IDataStoreProvider pr_default ;
   private short[] P02CQ2_A6248SalExNln ;
   private String[] P02CQ2_A130BarCodPar ;
   private byte[] P02CQ2_A132BarCodReo ;
   private int[] P02CQ2_A129BarCod ;
   private int[] P02CQ2_A2253SalExtAlb ;
   private String[] P02CQ2_A396EmprCod ;
   private String[] P02CQ2_A6558FasCodn ;
   private java.math.BigDecimal[] P02CQ2_A6255SalExMtR ;
   private java.math.BigDecimal[] P02CQ2_A6251SalExKgR ;
   private int[] P02CQ2_A6252SalExCoR ;
   private java.util.Date[] P02CQ2_A6250SalExFeR ;
   private byte[] P02CQ2_A6253SalExEsB ;
   private String[] P02CQ2_A6254SalExEnt ;
   private java.util.Date[] P02CQ4_A2700ExHdrFeR ;
   private boolean[] P02CQ4_n2700ExHdrFeR ;
   private String[] P02CQ4_A2693ExHdrTip ;
   private boolean[] P02CQ4_n2693ExHdrTip ;
   private short[] P02CQ4_A2704ExHdrExL ;
   private boolean[] P02CQ4_n2704ExHdrExL ;
   private String[] P02CQ4_A2689ExHdrFas ;
   private short[] P02CQ4_A2248ManCod ;
   private String[] P02CQ4_A396EmprCod ;
   private java.math.BigDecimal[] P02CQ4_A2845ExHdrMtR ;
   private boolean[] P02CQ4_n2845ExHdrMtR ;
   private java.math.BigDecimal[] P02CQ4_A2698ExHdrKgR ;
   private boolean[] P02CQ4_n2698ExHdrKgR ;
   private short[] P02CQ4_A2699ExHdrCnR ;
   private boolean[] P02CQ4_n2699ExHdrCnR ;
   private int[] P02CQ4_A2692ExHdrLin ;
}

final  class pmmvrhd1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CQ2", "SELECT SalExNln, BarCodPar, BarCodReo, BarCod, SalExtAlb, EmprCod, FasCodn, SalExMtR, SalExKgR, SalExCoR, SalExFeR, SalExEsB, SalExEnt FROM TXPEXHDPZ WHERE (EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (SalExNln = ?) ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02CQ3", "UPDATE TXPEXHDPZ SET SalExMtR=?, SalExKgR=?, SalExCoR=?, SalExFeR=?, SalExEsB=?, SalExEnt=?  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
         ,new ForEachCursor("P02CQ4", "SELECT ExHdrFeR, ExHdrTip, ExHdrExL, ExHdrFas, ManCod, EmprCod, ExHdrMtR, ExHdrKgR, ExHdrCnR, ExHdrLin FROM TXPLEXMVH WHERE (EmprCod = ? and ManCod = ? and ExHdrFas = ?) AND (ExHdrExL = ?) AND (ExHdrFeR = ?) ORDER BY EmprCod, ManCod, ExHdrFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02CQ5", "UPDATE TXPLEXMVH SET ExHdrMtR=?, ExHdrKgR=?, ExHdrCnR=?  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
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

