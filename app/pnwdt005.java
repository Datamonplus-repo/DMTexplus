package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnwdt005 extends GXProcedure
{
   public pnwdt005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnwdt005.class ), "" );
   }

   public pnwdt005( int remoteHandle ,
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
                            String[] aP5 )
   {
      pnwdt005.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      pnwdt005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnwdt005.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pnwdt005.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnwdt005.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnwdt005.this.AV11RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pnwdt005.this.AV12Procod = aP5[0];
      this.aP5 = aP5;
      pnwdt005.this.AV13Barordlin = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04PR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, AV12Procod, Short.valueOf(AV13Barordlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7934Dtb_Ordl = P04PR2_A7934Dtb_Ordl[0] ;
         A194BarOrdLin = P04PR2_A194BarOrdLin[0] ;
         A758ProCod = P04PR2_A758ProCod[0] ;
         A130BarCodPar = P04PR2_A130BarCodPar[0] ;
         A132BarCodReo = P04PR2_A132BarCodReo[0] ;
         A129BarCod = P04PR2_A129BarCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P04PR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
         /* End optimized DELETE. */
         /* Using cursor P04PR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04PR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A1273RecLinPro = P04PR5_A1273RecLinPro[0] ;
         A764ProForCod = P04PR5_A764ProForCod[0] ;
         A6018ProForFab = P04PR5_A6018ProForFab[0] ;
         n6018ProForFab = P04PR5_n6018ProForFab[0] ;
         A4696RecTiempo = P04PR5_A4696RecTiempo[0] ;
         n4696RecTiempo = P04PR5_n4696RecTiempo[0] ;
         A7228RecTemp = P04PR5_A7228RecTemp[0] ;
         n7228RecTemp = P04PR5_n7228RecTemp[0] ;
         A7257RecRb = P04PR5_A7257RecRb[0] ;
         n7257RecRb = P04PR5_n7257RecRb[0] ;
         A7229RecPhMx = P04PR5_A7229RecPhMx[0] ;
         n7229RecPhMx = P04PR5_n7229RecPhMx[0] ;
         A7230RecPhMn = P04PR5_A7230RecPhMn[0] ;
         n7230RecPhMn = P04PR5_n7230RecPhMn[0] ;
         A773ProForUli = P04PR5_A773ProForUli[0] ;
         A130BarCodPar = P04PR5_A130BarCodPar[0] ;
         A132BarCodReo = P04PR5_A132BarCodReo[0] ;
         A129BarCod = P04PR5_A129BarCod[0] ;
         A2804RecLinMaq = P04PR5_A2804RecLinMaq[0] ;
         A6018ProForFab = P04PR5_A6018ProForFab[0] ;
         n6018ProForFab = P04PR5_n6018ProForFab[0] ;
         A773ProForUli = P04PR5_A773ProForUli[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV14Proforcod = A764ProForCod ;
         AV15RecLinpro = A1273RecLinPro ;
         /*
            INSERT RECORD ON TABLE TXPDT005

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A758ProCod = AV12Procod ;
         A194BarOrdLin = AV13Barordlin ;
         A7934Dtb_Ordl = A1273RecLinPro ;
         A7935Dtb_CPQ = A764ProForCod ;
         n7935Dtb_CPQ = false ;
         A7937Dtb_ForFab = A6018ProForFab ;
         n7937Dtb_ForFab = false ;
         A7938Dtb_Fortie = A4696RecTiempo ;
         n7938Dtb_Fortie = false ;
         A7939Dtb_ForTmx = A7228RecTemp ;
         n7939Dtb_ForTmx = false ;
         A7940Dtb_ForRb = A7257RecRb ;
         n7940Dtb_ForRb = false ;
         A7941Dtb_ForPhx = A7229RecPhMx ;
         n7941Dtb_ForPhx = false ;
         A7942Dtb_ForPhn = A7230RecPhMn ;
         n7942Dtb_ForPhn = false ;
         A7943Dtb_ForUli = A773ProForUli ;
         n7943Dtb_ForUli = false ;
         /* Using cursor P04PR6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Boolean.valueOf(n7935Dtb_CPQ), A7935Dtb_CPQ, Boolean.valueOf(n7937Dtb_ForFab), A7937Dtb_ForFab, Boolean.valueOf(n7938Dtb_Fortie), Short.valueOf(A7938Dtb_Fortie), Boolean.valueOf(n7939Dtb_ForTmx), Short.valueOf(A7939Dtb_ForTmx), Boolean.valueOf(n7940Dtb_ForRb), A7940Dtb_ForRb, Boolean.valueOf(n7941Dtb_ForPhx), A7941Dtb_ForPhx, Boolean.valueOf(n7942Dtb_ForPhn), A7942Dtb_ForPhn, Boolean.valueOf(n7943Dtb_ForUli), Short.valueOf(A7943Dtb_ForUli)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         /* Execute user subroutine: 'LPROFO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            pr_default.close(3);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   public void S111( )
   {
      /* 'LPROFO' Routine */
      returnInSub = false ;
      /* Using cursor P04PR7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV14Proforcod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A767ProForLin = P04PR7_A767ProForLin[0] ;
         A770ProForPrd = P04PR7_A770ProForPrd[0] ;
         A762ProForCan = P04PR7_A762ProForCan[0] ;
         A490ForPrdUMe = P04PR7_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P04PR7_n490ForPrdUMe[0] ;
         A764ProForCod = P04PR7_A764ProForCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPDT0051

         */
         W396EmprCod = A396EmprCod ;
         W490ForPrdUMe = A490ForPrdUMe ;
         n490ForPrdUMe = false ;
         A129BarCod = AV8BarCod ;
         A132BarCodReo = AV9BarCodReo ;
         A130BarCodPar = AV10BarCodPar ;
         A758ProCod = AV12Procod ;
         A194BarOrdLin = AV13Barordlin ;
         A7934Dtb_Ordl = AV15RecLinpro ;
         A7944Dtb_ForLin = A767ProForLin ;
         A7945Dtb_Prdnum = A770ProForPrd ;
         n7945Dtb_Prdnum = false ;
         n490ForPrdUMe = false ;
         A7947Dtb_Forcan = A762ProForCan ;
         n7947Dtb_Forcan = false ;
         A8477Dtb_clave1 = " " ;
         n8477Dtb_clave1 = false ;
         A8478Dtb_clave2 = " " ;
         n8478Dtb_clave2 = false ;
         /* Using cursor P04PR8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin), Boolean.valueOf(n7945Dtb_Prdnum), A7945Dtb_Prdnum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7947Dtb_Forcan), A7947Dtb_Forcan, Boolean.valueOf(n8477Dtb_clave1), A8477Dtb_clave1, Boolean.valueOf(n8478Dtb_clave2), A8478Dtb_clave2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
         if ( (pr_default.getStatus(6) == 1) )
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
         A490ForPrdUMe = W490ForPrdUMe ;
         n490ForPrdUMe = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnwdt005.this.A396EmprCod;
      this.aP1[0] = pnwdt005.this.AV8BarCod;
      this.aP2[0] = pnwdt005.this.AV9BarCodReo;
      this.aP3[0] = pnwdt005.this.AV10BarCodPar;
      this.aP4[0] = pnwdt005.this.AV11RecLinMaq;
      this.aP5[0] = pnwdt005.this.AV12Procod;
      this.aP6[0] = pnwdt005.this.AV13Barordlin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnwdt005");
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
      P04PR2_A396EmprCod = new String[] {""} ;
      P04PR2_A7934Dtb_Ordl = new short[1] ;
      P04PR2_A194BarOrdLin = new short[1] ;
      P04PR2_A758ProCod = new String[] {""} ;
      P04PR2_A130BarCodPar = new String[] {""} ;
      P04PR2_A132BarCodReo = new byte[1] ;
      P04PR2_A129BarCod = new int[1] ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      P04PR5_A396EmprCod = new String[] {""} ;
      P04PR5_A1273RecLinPro = new byte[1] ;
      P04PR5_A764ProForCod = new String[] {""} ;
      P04PR5_A6018ProForFab = new String[] {""} ;
      P04PR5_n6018ProForFab = new boolean[] {false} ;
      P04PR5_A4696RecTiempo = new short[1] ;
      P04PR5_n4696RecTiempo = new boolean[] {false} ;
      P04PR5_A7228RecTemp = new short[1] ;
      P04PR5_n7228RecTemp = new boolean[] {false} ;
      P04PR5_A7257RecRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04PR5_n7257RecRb = new boolean[] {false} ;
      P04PR5_A7229RecPhMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04PR5_n7229RecPhMx = new boolean[] {false} ;
      P04PR5_A7230RecPhMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04PR5_n7230RecPhMn = new boolean[] {false} ;
      P04PR5_A773ProForUli = new short[1] ;
      P04PR5_A130BarCodPar = new String[] {""} ;
      P04PR5_A132BarCodReo = new byte[1] ;
      P04PR5_A129BarCod = new int[1] ;
      P04PR5_A2804RecLinMaq = new short[1] ;
      A764ProForCod = "" ;
      A6018ProForFab = "" ;
      A7257RecRb = DecimalUtil.ZERO ;
      A7229RecPhMx = DecimalUtil.ZERO ;
      A7230RecPhMn = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      AV14Proforcod = "" ;
      A7935Dtb_CPQ = "" ;
      A7937Dtb_ForFab = "" ;
      A7940Dtb_ForRb = DecimalUtil.ZERO ;
      A7941Dtb_ForPhx = DecimalUtil.ZERO ;
      A7942Dtb_ForPhn = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P04PR7_A396EmprCod = new String[] {""} ;
      P04PR7_A767ProForLin = new short[1] ;
      P04PR7_A770ProForPrd = new String[] {""} ;
      P04PR7_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04PR7_A490ForPrdUMe = new byte[1] ;
      P04PR7_n490ForPrdUMe = new boolean[] {false} ;
      P04PR7_A764ProForCod = new String[] {""} ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A7945Dtb_Prdnum = "" ;
      A7947Dtb_Forcan = DecimalUtil.ZERO ;
      A8477Dtb_clave1 = "" ;
      A8478Dtb_clave2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnwdt005__default(),
         new Object[] {
             new Object[] {
            P04PR2_A396EmprCod, P04PR2_A7934Dtb_Ordl, P04PR2_A194BarOrdLin, P04PR2_A758ProCod, P04PR2_A130BarCodPar, P04PR2_A132BarCodReo, P04PR2_A129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04PR5_A396EmprCod, P04PR5_A1273RecLinPro, P04PR5_A764ProForCod, P04PR5_A6018ProForFab, P04PR5_n6018ProForFab, P04PR5_A4696RecTiempo, P04PR5_n4696RecTiempo, P04PR5_A7228RecTemp, P04PR5_n7228RecTemp, P04PR5_A7257RecRb,
            P04PR5_n7257RecRb, P04PR5_A7229RecPhMx, P04PR5_n7229RecPhMx, P04PR5_A7230RecPhMn, P04PR5_n7230RecPhMn, P04PR5_A773ProForUli, P04PR5_A130BarCodPar, P04PR5_A132BarCodReo, P04PR5_A129BarCod, P04PR5_A2804RecLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            P04PR7_A396EmprCod, P04PR7_A767ProForLin, P04PR7_A770ProForPrd, P04PR7_A762ProForCan, P04PR7_A490ForPrdUMe, P04PR7_A764ProForCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte W132BarCodReo ;
   private byte AV15RecLinpro ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private short AV11RecLinMaq ;
   private short AV13Barordlin ;
   private short A7934Dtb_Ordl ;
   private short A194BarOrdLin ;
   private short A4696RecTiempo ;
   private short A7228RecTemp ;
   private short A773ProForUli ;
   private short A2804RecLinMaq ;
   private short A7938Dtb_Fortie ;
   private short A7939Dtb_ForTmx ;
   private short A7943Dtb_ForUli ;
   private short Gx_err ;
   private short A767ProForLin ;
   private short A7944Dtb_ForLin ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS1108 ;
   private int GX_INS1109 ;
   private java.math.BigDecimal A7257RecRb ;
   private java.math.BigDecimal A7229RecPhMx ;
   private java.math.BigDecimal A7230RecPhMn ;
   private java.math.BigDecimal A7940Dtb_ForRb ;
   private java.math.BigDecimal A7941Dtb_ForPhx ;
   private java.math.BigDecimal A7942Dtb_ForPhn ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A7947Dtb_Forcan ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV12Procod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A764ProForCod ;
   private String A6018ProForFab ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String AV14Proforcod ;
   private String A7935Dtb_CPQ ;
   private String A7937Dtb_ForFab ;
   private String Gx_emsg ;
   private String A770ProForPrd ;
   private String A7945Dtb_Prdnum ;
   private String A8477Dtb_clave1 ;
   private String A8478Dtb_clave2 ;
   private boolean n6018ProForFab ;
   private boolean n4696RecTiempo ;
   private boolean n7228RecTemp ;
   private boolean n7257RecRb ;
   private boolean n7229RecPhMx ;
   private boolean n7230RecPhMn ;
   private boolean n7935Dtb_CPQ ;
   private boolean n7937Dtb_ForFab ;
   private boolean n7938Dtb_Fortie ;
   private boolean n7939Dtb_ForTmx ;
   private boolean n7940Dtb_ForRb ;
   private boolean n7941Dtb_ForPhx ;
   private boolean n7942Dtb_ForPhn ;
   private boolean n7943Dtb_ForUli ;
   private boolean returnInSub ;
   private boolean n490ForPrdUMe ;
   private boolean n7945Dtb_Prdnum ;
   private boolean n7947Dtb_Forcan ;
   private boolean n8477Dtb_clave1 ;
   private boolean n8478Dtb_clave2 ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04PR2_A396EmprCod ;
   private short[] P04PR2_A7934Dtb_Ordl ;
   private short[] P04PR2_A194BarOrdLin ;
   private String[] P04PR2_A758ProCod ;
   private String[] P04PR2_A130BarCodPar ;
   private byte[] P04PR2_A132BarCodReo ;
   private int[] P04PR2_A129BarCod ;
   private String[] P04PR5_A396EmprCod ;
   private byte[] P04PR5_A1273RecLinPro ;
   private String[] P04PR5_A764ProForCod ;
   private String[] P04PR5_A6018ProForFab ;
   private boolean[] P04PR5_n6018ProForFab ;
   private short[] P04PR5_A4696RecTiempo ;
   private boolean[] P04PR5_n4696RecTiempo ;
   private short[] P04PR5_A7228RecTemp ;
   private boolean[] P04PR5_n7228RecTemp ;
   private java.math.BigDecimal[] P04PR5_A7257RecRb ;
   private boolean[] P04PR5_n7257RecRb ;
   private java.math.BigDecimal[] P04PR5_A7229RecPhMx ;
   private boolean[] P04PR5_n7229RecPhMx ;
   private java.math.BigDecimal[] P04PR5_A7230RecPhMn ;
   private boolean[] P04PR5_n7230RecPhMn ;
   private short[] P04PR5_A773ProForUli ;
   private String[] P04PR5_A130BarCodPar ;
   private byte[] P04PR5_A132BarCodReo ;
   private int[] P04PR5_A129BarCod ;
   private short[] P04PR5_A2804RecLinMaq ;
   private String[] P04PR7_A396EmprCod ;
   private short[] P04PR7_A767ProForLin ;
   private String[] P04PR7_A770ProForPrd ;
   private java.math.BigDecimal[] P04PR7_A762ProForCan ;
   private byte[] P04PR7_A490ForPrdUMe ;
   private boolean[] P04PR7_n490ForPrdUMe ;
   private String[] P04PR7_A764ProForCod ;
}

final  class pnwdt005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04PR2", "SELECT EmprCod, Dtb_Ordl, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod FROM TXPDT005 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04PR3", "DELETE FROM TXPDT0051  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
         ,new UpdateCursor("P04PR4", "DELETE FROM TXPDT005  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND Dtb_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new ForEachCursor("P04PR5", "SELECT T1.EmprCod, T1.RecLinPro, T1.ProForCod, T2.ProForFab, T1.RecTiempo, T1.RecTemp, T1.RecRb, T1.RecPhMx, T1.RecPhMn, T2.ProForUli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04PR6", "INSERT INTO TXPDT005(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new ForEachCursor("P04PR7", "SELECT EmprCod, ProForLin, ProForPrd, ProForCan, ForPrdUMe, ProForCod FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04PR8", "INSERT INTO TXPDT0051(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin, Dtb_Prdnum, ForPrdUMe, Dtb_Forcan, Dtb_clave1, Dtb_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((int[]) buf[18])[0] = rslt.getInt(13);
               ((short[]) buf[19])[0] = rslt.getShort(14);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[22]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 16);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 30);
               }
               return;
      }
   }

}

