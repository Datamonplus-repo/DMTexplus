package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pamvrhd extends GXProcedure
{
   public pamvrhd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pamvrhd.class ), "" );
   }

   public pamvrhd( int remoteHandle ,
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
                             java.util.Date[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      pamvrhd.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        java.util.Date[] aP8 ,
                        int[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             java.util.Date[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      pamvrhd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pamvrhd.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pamvrhd.this.AV17ExHdrTip = aP2[0];
      this.aP2 = aP2;
      pamvrhd.this.AV18ExHdrAlb = aP3[0];
      this.aP3 = aP3;
      pamvrhd.this.AV19RpExHdLi = aP4[0];
      this.aP4 = aP4;
      pamvrhd.this.AV20Kgs = aP5[0];
      this.aP5 = aP5;
      pamvrhd.this.AV32Mts = aP6[0];
      this.aP6 = aP6;
      pamvrhd.this.AV21Conos = aP7[0];
      this.aP7 = aP7;
      pamvrhd.this.AV22FecMov = aP8[0];
      this.aP8 = aP8;
      pamvrhd.this.AV23BarCod = aP9[0];
      this.aP9 = aP9;
      pamvrhd.this.AV24BarCodReo = aP10[0];
      this.aP10 = aP10;
      pamvrhd.this.AV25BarCodPar = aP11[0];
      this.aP11 = aP11;
      pamvrhd.this.AV26TipE = aP12[0];
      this.aP12 = aP12;
      pamvrhd.this.AV27Resto = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00F92 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18ExHdrAlb), Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00F92_A130BarCodPar[0] ;
         n130BarCodPar = P00F92_n130BarCodPar[0] ;
         A132BarCodReo = P00F92_A132BarCodReo[0] ;
         n132BarCodReo = P00F92_n132BarCodReo[0] ;
         A129BarCod = P00F92_A129BarCod[0] ;
         n129BarCod = P00F92_n129BarCod[0] ;
         A2253SalExtAlb = P00F92_A2253SalExtAlb[0] ;
         A396EmprCod = P00F92_A396EmprCod[0] ;
         A457FasCod = P00F92_A457FasCod[0] ;
         n457FasCod = P00F92_n457FasCod[0] ;
         A2840SalExtMtR = P00F92_A2840SalExtMtR[0] ;
         n2840SalExtMtR = P00F92_n2840SalExtMtR[0] ;
         A2260SalExtKgR = P00F92_A2260SalExtKgR[0] ;
         n2260SalExtKgR = P00F92_n2260SalExtKgR[0] ;
         A2261SalExtCoR = P00F92_A2261SalExtCoR[0] ;
         n2261SalExtCoR = P00F92_n2261SalExtCoR[0] ;
         A2259SalExtFeR = P00F92_A2259SalExtFeR[0] ;
         n2259SalExtFeR = P00F92_n2259SalExtFeR[0] ;
         A2262SalExtEsB = P00F92_A2262SalExtEsB[0] ;
         n2262SalExtEsB = P00F92_n2262SalExtEsB[0] ;
         A2757SalExtEnt = P00F92_A2757SalExtEnt[0] ;
         n2757SalExtEnt = P00F92_n2757SalExtEnt[0] ;
         AV29ExHdrFas = A457FasCod ;
         A2840SalExtMtR = A2840SalExtMtR.add(AV32Mts) ;
         n2840SalExtMtR = false ;
         A2260SalExtKgR = A2260SalExtKgR.add(AV20Kgs) ;
         n2260SalExtKgR = false ;
         A2261SalExtCoR = (short)(A2261SalExtCoR+AV21Conos) ;
         n2261SalExtCoR = false ;
         A2259SalExtFeR = AV22FecMov ;
         n2259SalExtFeR = false ;
         if ( GXutil.strcmp(AV26TipE, httpContext.getMessage( "P", "")) == 0 )
         {
            A2262SalExtEsB = (byte)(1) ;
            n2262SalExtEsB = false ;
         }
         if ( GXutil.strcmp(AV26TipE, httpContext.getMessage( "T", "")) == 0 )
         {
            A2262SalExtEsB = (byte)(2) ;
            n2262SalExtEsB = false ;
         }
         A2757SalExtEnt = AV26TipE ;
         n2757SalExtEnt = false ;
         /* Using cursor P00F93 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2840SalExtMtR), A2840SalExtMtR, Boolean.valueOf(n2260SalExtKgR), A2260SalExtKgR, Boolean.valueOf(n2261SalExtCoR), Short.valueOf(A2261SalExtCoR), Boolean.valueOf(n2259SalExtFeR), A2259SalExtFeR, Boolean.valueOf(n2262SalExtEsB), Byte.valueOf(A2262SalExtEsB), Boolean.valueOf(n2757SalExtEnt), A2757SalExtEnt, A396EmprCod, Integer.valueOf(A2253SalExtAlb), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00F94 */
      pr_default.execute(2, new Object[] {AV15EmprCod, AV29ExHdrFas});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P00F94_A457FasCod[0] ;
         n457FasCod = P00F94_n457FasCod[0] ;
         A396EmprCod = P00F94_A396EmprCod[0] ;
         A460FasDsc = P00F94_A460FasDsc[0] ;
         AV31ExHdrFdc = A460FasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P00F95 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV29ExHdrFas});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2691ExHdrUln = P00F95_A2691ExHdrUln[0] ;
         n2691ExHdrUln = P00F95_n2691ExHdrUln[0] ;
         A2689ExHdrFas = P00F95_A2689ExHdrFas[0] ;
         A2248ManCod = P00F95_A2248ManCod[0] ;
         A396EmprCod = P00F95_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W2248ManCod = A2248ManCod ;
         W2689ExHdrFas = A2689ExHdrFas ;
         /*
            INSERT RECORD ON TABLE TXPLEXMVH

         */
         W396EmprCod = A396EmprCod ;
         W2248ManCod = A2248ManCod ;
         W2689ExHdrFas = A2689ExHdrFas ;
         A396EmprCod = AV15EmprCod ;
         A2248ManCod = AV16ManCod ;
         A2689ExHdrFas = AV29ExHdrFas ;
         A2692ExHdrLin = (int)(A2691ExHdrUln+1) ;
         A129BarCod = AV23BarCod ;
         n129BarCod = false ;
         A132BarCodReo = AV24BarCodReo ;
         n132BarCodReo = false ;
         A130BarCodPar = AV25BarCodPar ;
         n130BarCodPar = false ;
         A2693ExHdrTip = AV17ExHdrTip ;
         n2693ExHdrTip = false ;
         A2694ExHdrAlb = AV18ExHdrAlb ;
         n2694ExHdrAlb = false ;
         A2700ExHdrFeR = AV22FecMov ;
         n2700ExHdrFeR = false ;
         A2704ExHdrExL = AV19RpExHdLi ;
         n2704ExHdrExL = false ;
         A2845ExHdrMtR = AV32Mts ;
         n2845ExHdrMtR = false ;
         A2698ExHdrKgR = AV20Kgs ;
         n2698ExHdrKgR = false ;
         A2699ExHdrCnR = AV21Conos ;
         n2699ExHdrCnR = false ;
         /* Using cursor P00F96 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin), Boolean.valueOf(n2693ExHdrTip), A2693ExHdrTip, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n2694ExHdrAlb), Integer.valueOf(A2694ExHdrAlb), Boolean.valueOf(n2698ExHdrKgR), A2698ExHdrKgR, Boolean.valueOf(n2699ExHdrCnR), Short.valueOf(A2699ExHdrCnR), Boolean.valueOf(n2700ExHdrFeR), A2700ExHdrFeR, Boolean.valueOf(n2704ExHdrExL), Short.valueOf(A2704ExHdrExL), Boolean.valueOf(n2845ExHdrMtR), A2845ExHdrMtR});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A2248ManCod = W2248ManCod ;
         A2689ExHdrFas = W2689ExHdrFas ;
         /* End Insert */
         A2691ExHdrUln = (int)(A2691ExHdrUln+1) ;
         n2691ExHdrUln = false ;
         /* Using cursor P00F97 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n2691ExHdrUln), Integer.valueOf(A2691ExHdrUln), A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVH");
         A396EmprCod = W396EmprCod ;
         A2248ManCod = W2248ManCod ;
         A2689ExHdrFas = W2689ExHdrFas ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pamvrhd.this.AV15EmprCod;
      this.aP1[0] = pamvrhd.this.AV16ManCod;
      this.aP2[0] = pamvrhd.this.AV17ExHdrTip;
      this.aP3[0] = pamvrhd.this.AV18ExHdrAlb;
      this.aP4[0] = pamvrhd.this.AV19RpExHdLi;
      this.aP5[0] = pamvrhd.this.AV20Kgs;
      this.aP6[0] = pamvrhd.this.AV32Mts;
      this.aP7[0] = pamvrhd.this.AV21Conos;
      this.aP8[0] = pamvrhd.this.AV22FecMov;
      this.aP9[0] = pamvrhd.this.AV23BarCod;
      this.aP10[0] = pamvrhd.this.AV24BarCodReo;
      this.aP11[0] = pamvrhd.this.AV25BarCodPar;
      this.aP12[0] = pamvrhd.this.AV26TipE;
      this.aP13[0] = pamvrhd.this.AV27Resto;
      Application.commitDataStores(context, remoteHandle, pr_default, "pamvrhd");
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
      P00F92_A130BarCodPar = new String[] {""} ;
      P00F92_n130BarCodPar = new boolean[] {false} ;
      P00F92_A132BarCodReo = new byte[1] ;
      P00F92_n132BarCodReo = new boolean[] {false} ;
      P00F92_A129BarCod = new int[1] ;
      P00F92_n129BarCod = new boolean[] {false} ;
      P00F92_A2253SalExtAlb = new int[1] ;
      P00F92_A396EmprCod = new String[] {""} ;
      P00F92_A457FasCod = new String[] {""} ;
      P00F92_n457FasCod = new boolean[] {false} ;
      P00F92_A2840SalExtMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00F92_n2840SalExtMtR = new boolean[] {false} ;
      P00F92_A2260SalExtKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00F92_n2260SalExtKgR = new boolean[] {false} ;
      P00F92_A2261SalExtCoR = new short[1] ;
      P00F92_n2261SalExtCoR = new boolean[] {false} ;
      P00F92_A2259SalExtFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P00F92_n2259SalExtFeR = new boolean[] {false} ;
      P00F92_A2262SalExtEsB = new byte[1] ;
      P00F92_n2262SalExtEsB = new boolean[] {false} ;
      P00F92_A2757SalExtEnt = new String[] {""} ;
      P00F92_n2757SalExtEnt = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A2840SalExtMtR = DecimalUtil.ZERO ;
      A2260SalExtKgR = DecimalUtil.ZERO ;
      A2259SalExtFeR = GXutil.nullDate() ;
      A2757SalExtEnt = "" ;
      AV29ExHdrFas = "" ;
      P00F94_A457FasCod = new String[] {""} ;
      P00F94_n457FasCod = new boolean[] {false} ;
      P00F94_A396EmprCod = new String[] {""} ;
      P00F94_A460FasDsc = new String[] {""} ;
      A460FasDsc = "" ;
      AV31ExHdrFdc = "" ;
      P00F95_A2691ExHdrUln = new int[1] ;
      P00F95_n2691ExHdrUln = new boolean[] {false} ;
      P00F95_A2689ExHdrFas = new String[] {""} ;
      P00F95_A2248ManCod = new short[1] ;
      P00F95_A396EmprCod = new String[] {""} ;
      A2689ExHdrFas = "" ;
      W396EmprCod = "" ;
      W2689ExHdrFas = "" ;
      A2693ExHdrTip = "" ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      A2845ExHdrMtR = DecimalUtil.ZERO ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pamvrhd__default(),
         new Object[] {
             new Object[] {
            P00F92_A130BarCodPar, P00F92_A132BarCodReo, P00F92_A129BarCod, P00F92_A2253SalExtAlb, P00F92_A396EmprCod, P00F92_A457FasCod, P00F92_n457FasCod, P00F92_A2840SalExtMtR, P00F92_n2840SalExtMtR, P00F92_A2260SalExtKgR,
            P00F92_n2260SalExtKgR, P00F92_A2261SalExtCoR, P00F92_n2261SalExtCoR, P00F92_A2259SalExtFeR, P00F92_n2259SalExtFeR, P00F92_A2262SalExtEsB, P00F92_n2262SalExtEsB, P00F92_A2757SalExtEnt, P00F92_n2757SalExtEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P00F94_A457FasCod, P00F94_A396EmprCod, P00F94_A460FasDsc
            }
            , new Object[] {
            P00F95_A2691ExHdrUln, P00F95_n2691ExHdrUln, P00F95_A2689ExHdrFas, P00F95_A2248ManCod, P00F95_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24BarCodReo ;
   private byte A132BarCodReo ;
   private byte A2262SalExtEsB ;
   private short AV16ManCod ;
   private short AV19RpExHdLi ;
   private short AV21Conos ;
   private short A2261SalExtCoR ;
   private short A2248ManCod ;
   private short W2248ManCod ;
   private short A2704ExHdrExL ;
   private short A2699ExHdrCnR ;
   private short Gx_err ;
   private int AV18ExHdrAlb ;
   private int AV23BarCod ;
   private int A129BarCod ;
   private int A2253SalExtAlb ;
   private int A2691ExHdrUln ;
   private int GX_INS382 ;
   private int A2692ExHdrLin ;
   private int A2694ExHdrAlb ;
   private java.math.BigDecimal AV20Kgs ;
   private java.math.BigDecimal AV32Mts ;
   private java.math.BigDecimal A2840SalExtMtR ;
   private java.math.BigDecimal A2260SalExtKgR ;
   private java.math.BigDecimal A2845ExHdrMtR ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private String AV15EmprCod ;
   private String AV17ExHdrTip ;
   private String AV25BarCodPar ;
   private String AV26TipE ;
   private String AV27Resto ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A2757SalExtEnt ;
   private String AV29ExHdrFas ;
   private String A460FasDsc ;
   private String AV31ExHdrFdc ;
   private String A2689ExHdrFas ;
   private String W396EmprCod ;
   private String W2689ExHdrFas ;
   private String A2693ExHdrTip ;
   private String Gx_emsg ;
   private java.util.Date AV22FecMov ;
   private java.util.Date A2259SalExtFeR ;
   private java.util.Date A2700ExHdrFeR ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n457FasCod ;
   private boolean n2840SalExtMtR ;
   private boolean n2260SalExtKgR ;
   private boolean n2261SalExtCoR ;
   private boolean n2259SalExtFeR ;
   private boolean n2262SalExtEsB ;
   private boolean n2757SalExtEnt ;
   private boolean n2691ExHdrUln ;
   private boolean n2693ExHdrTip ;
   private boolean n2694ExHdrAlb ;
   private boolean n2700ExHdrFeR ;
   private boolean n2704ExHdrExL ;
   private boolean n2845ExHdrMtR ;
   private boolean n2698ExHdrKgR ;
   private boolean n2699ExHdrCnR ;
   private String[] aP13 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private java.util.Date[] aP8 ;
   private int[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P00F92_A130BarCodPar ;
   private boolean[] P00F92_n130BarCodPar ;
   private byte[] P00F92_A132BarCodReo ;
   private boolean[] P00F92_n132BarCodReo ;
   private int[] P00F92_A129BarCod ;
   private boolean[] P00F92_n129BarCod ;
   private int[] P00F92_A2253SalExtAlb ;
   private String[] P00F92_A396EmprCod ;
   private String[] P00F92_A457FasCod ;
   private boolean[] P00F92_n457FasCod ;
   private java.math.BigDecimal[] P00F92_A2840SalExtMtR ;
   private boolean[] P00F92_n2840SalExtMtR ;
   private java.math.BigDecimal[] P00F92_A2260SalExtKgR ;
   private boolean[] P00F92_n2260SalExtKgR ;
   private short[] P00F92_A2261SalExtCoR ;
   private boolean[] P00F92_n2261SalExtCoR ;
   private java.util.Date[] P00F92_A2259SalExtFeR ;
   private boolean[] P00F92_n2259SalExtFeR ;
   private byte[] P00F92_A2262SalExtEsB ;
   private boolean[] P00F92_n2262SalExtEsB ;
   private String[] P00F92_A2757SalExtEnt ;
   private boolean[] P00F92_n2757SalExtEnt ;
   private String[] P00F94_A457FasCod ;
   private boolean[] P00F94_n457FasCod ;
   private String[] P00F94_A396EmprCod ;
   private String[] P00F94_A460FasDsc ;
   private int[] P00F95_A2691ExHdrUln ;
   private boolean[] P00F95_n2691ExHdrUln ;
   private String[] P00F95_A2689ExHdrFas ;
   private short[] P00F95_A2248ManCod ;
   private String[] P00F95_A396EmprCod ;
}

final  class pamvrhd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00F92", "SELECT BarCodPar, BarCodReo, BarCod, SalExtAlb, EmprCod, FasCod, SalExtMtR, SalExtKgR, SalExtCoR, SalExtFeR, SalExtEsB, SalExtEnt FROM TXPLEXTSA WHERE EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00F93", "UPDATE TXPLEXTSA SET SalExtMtR=?, SalExtKgR=?, SalExtCoR=?, SalExtFeR=?, SalExtEsB=?, SalExtEnt=?  WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXTSA")
         ,new ForEachCursor("P00F94", "SELECT FasCod, EmprCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00F95", "SELECT ExHdrUln, ExHdrFas, ManCod, EmprCod FROM TXPCEXMVH WHERE EmprCod = ? and ManCod = ? and ExHdrFas = ? ORDER BY EmprCod, ManCod, ExHdrFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00F96", "INSERT INTO TXPLEXMVH(EmprCod, ManCod, ExHdrFas, ExHdrLin, ExHdrTip, BarCod, BarCodReo, BarCodPar, ExHdrAlb, ExHdrKgR, ExHdrCnR, ExHdrFeR, ExHdrExL, ExHdrMtR, ExHdrKgE, ExHdrCnE, ExHdrFeE, ExHdrKRe, ExHdrCRe, ExHdrLoc, ExHdrTin, ExHdrCli, ExHdrMtE, ExtHdrLS) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
         ,new UpdateCursor("P00F97", "UPDATE TXPCEXMVH SET ExHdrUln=?  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVH")
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
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 8);
               return;
      }
   }

}

