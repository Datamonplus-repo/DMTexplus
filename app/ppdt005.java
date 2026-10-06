package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppdt005 extends GXProcedure
{
   public ppdt005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppdt005.class ), "" );
   }

   public ppdt005( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           short[] aP5 )
   {
      ppdt005.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 )
   {
      ppdt005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppdt005.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppdt005.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppdt005.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppdt005.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      ppdt005.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      ppdt005.this.AV16Ok = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Ok = (byte)(0) ;
      /* Using cursor P035V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7934Dtb_Ordl = P035V2_A7934Dtb_Ordl[0] ;
         AV16Ok = (byte)(1) ;
         System.out.println( httpContext.getMessage( "Ya existe registro en DT005", "") );
         pr_default.close(0);
         returnInSub = true;
         cleanup();
         if (true) return;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P035V3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P035V3_A457FasCod[0] ;
         AV9FasCod = A457FasCod ;
         AV10Barordlin = A194BarOrdLin ;
         AV11Procod = A758ProCod ;
         AV8Barcod = A129BarCod ;
         AV12Barcodreo = A132BarCodReo ;
         AV13barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'FASPR1' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'FASPR1' Routine */
      returnInSub = false ;
      /* Using cursor P035V4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV9FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P035V4_A457FasCod[0] ;
         A764ProForCod = P035V4_A764ProForCod[0] ;
         A4650FasForLin = P035V4_A4650FasForLin[0] ;
         AV14Proforcod = A764ProForCod ;
         AV15FasForlin = A4650FasForLin ;
         /* Execute user subroutine: 'CPROFO' */
         S124 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S124( )
   {
      /* 'CPROFO' Routine */
      returnInSub = false ;
      /* Using cursor P035V5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV14Proforcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A764ProForCod = P035V5_A764ProForCod[0] ;
         A6018ProForFab = P035V5_A6018ProForFab[0] ;
         n6018ProForFab = P035V5_n6018ProForFab[0] ;
         A771ProForTie = P035V5_A771ProForTie[0] ;
         A772ProForTmx = P035V5_A772ProForTmx[0] ;
         A4706ProForRb = P035V5_A4706ProForRb[0] ;
         A6876ProForPhx = P035V5_A6876ProForPhx[0] ;
         n6876ProForPhx = P035V5_n6876ProForPhx[0] ;
         A6877ProForPhn = P035V5_A6877ProForPhn[0] ;
         n6877ProForPhn = P035V5_n6877ProForPhn[0] ;
         A773ProForUli = P035V5_A773ProForUli[0] ;
         A12109ProNh2o = P035V5_A12109ProNh2o[0] ;
         n12109ProNh2o = P035V5_n12109ProNh2o[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPDT005

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         A129BarCod = AV8Barcod ;
         A132BarCodReo = AV12Barcodreo ;
         A130BarCodPar = AV13barcodpar ;
         A758ProCod = AV11Procod ;
         A194BarOrdLin = AV10Barordlin ;
         A7934Dtb_Ordl = AV15FasForlin ;
         A7935Dtb_CPQ = AV14Proforcod ;
         n7935Dtb_CPQ = false ;
         A7937Dtb_ForFab = A6018ProForFab ;
         n7937Dtb_ForFab = false ;
         A7938Dtb_Fortie = A771ProForTie ;
         n7938Dtb_Fortie = false ;
         A7939Dtb_ForTmx = A772ProForTmx ;
         n7939Dtb_ForTmx = false ;
         A7940Dtb_ForRb = DecimalUtil.doubleToDec(A4706ProForRb) ;
         n7940Dtb_ForRb = false ;
         A7941Dtb_ForPhx = A6876ProForPhx ;
         n7941Dtb_ForPhx = false ;
         A7942Dtb_ForPhn = A6877ProForPhn ;
         n7942Dtb_ForPhn = false ;
         A7943Dtb_ForUli = A773ProForUli ;
         n7943Dtb_ForUli = false ;
         A12111Dtb_Nh2o = A12109ProNh2o ;
         n12111Dtb_Nh2o = false ;
         /* Using cursor P035V6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Boolean.valueOf(n7935Dtb_CPQ), A7935Dtb_CPQ, Boolean.valueOf(n7937Dtb_ForFab), A7937Dtb_ForFab, Boolean.valueOf(n7938Dtb_Fortie), Short.valueOf(A7938Dtb_Fortie), Boolean.valueOf(n7939Dtb_ForTmx), Short.valueOf(A7939Dtb_ForTmx), Boolean.valueOf(n7940Dtb_ForRb), A7940Dtb_ForRb, Boolean.valueOf(n7941Dtb_ForPhx), A7941Dtb_ForPhx, Boolean.valueOf(n7942Dtb_ForPhn), A7942Dtb_ForPhn, Boolean.valueOf(n7943Dtb_ForUli), Short.valueOf(A7943Dtb_ForUli), Boolean.valueOf(n12111Dtb_Nh2o), Short.valueOf(A12111Dtb_Nh2o)});
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
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         /* End Insert */
         /* Using cursor P035V7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A764ProForCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A767ProForLin = P035V7_A767ProForLin[0] ;
            A770ProForPrd = P035V7_A770ProForPrd[0] ;
            A762ProForCan = P035V7_A762ProForCan[0] ;
            A763ProForCla = P035V7_A763ProForCla[0] ;
            A5358ProForClv = P035V7_A5358ProForClv[0] ;
            A490ForPrdUMe = P035V7_A490ForPrdUMe[0] ;
            n490ForPrdUMe = P035V7_n490ForPrdUMe[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPDT0051

            */
            W396EmprCod = A396EmprCod ;
            W490ForPrdUMe = A490ForPrdUMe ;
            n490ForPrdUMe = false ;
            A129BarCod = AV8Barcod ;
            A132BarCodReo = AV12Barcodreo ;
            A130BarCodPar = AV13barcodpar ;
            A758ProCod = AV11Procod ;
            A194BarOrdLin = AV10Barordlin ;
            A7934Dtb_Ordl = AV15FasForlin ;
            A7944Dtb_ForLin = A767ProForLin ;
            A7945Dtb_Prdnum = A770ProForPrd ;
            n7945Dtb_Prdnum = false ;
            n490ForPrdUMe = false ;
            A7947Dtb_Forcan = A762ProForCan ;
            n7947Dtb_Forcan = false ;
            A8477Dtb_clave1 = A763ProForCla ;
            n8477Dtb_clave1 = false ;
            A8478Dtb_clave2 = A5358ProForClv ;
            n8478Dtb_clave2 = false ;
            /* Using cursor P035V8 */
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
         AV16Ok = (byte)(1) ;
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppdt005.this.A396EmprCod;
      this.aP1[0] = ppdt005.this.A129BarCod;
      this.aP2[0] = ppdt005.this.A132BarCodReo;
      this.aP3[0] = ppdt005.this.A130BarCodPar;
      this.aP4[0] = ppdt005.this.A758ProCod;
      this.aP5[0] = ppdt005.this.A194BarOrdLin;
      this.aP6[0] = ppdt005.this.AV16Ok;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppdt005");
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
      P035V2_A396EmprCod = new String[] {""} ;
      P035V2_A129BarCod = new int[1] ;
      P035V2_A132BarCodReo = new byte[1] ;
      P035V2_A130BarCodPar = new String[] {""} ;
      P035V2_A758ProCod = new String[] {""} ;
      P035V2_A194BarOrdLin = new short[1] ;
      P035V2_A7934Dtb_Ordl = new short[1] ;
      P035V3_A396EmprCod = new String[] {""} ;
      P035V3_A129BarCod = new int[1] ;
      P035V3_A132BarCodReo = new byte[1] ;
      P035V3_A130BarCodPar = new String[] {""} ;
      P035V3_A758ProCod = new String[] {""} ;
      P035V3_A194BarOrdLin = new short[1] ;
      P035V3_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      AV9FasCod = "" ;
      AV11Procod = "" ;
      AV13barcodpar = "" ;
      P035V4_A396EmprCod = new String[] {""} ;
      P035V4_A457FasCod = new String[] {""} ;
      P035V4_A764ProForCod = new String[] {""} ;
      P035V4_A4650FasForLin = new short[1] ;
      A764ProForCod = "" ;
      AV14Proforcod = "" ;
      P035V5_A396EmprCod = new String[] {""} ;
      P035V5_A764ProForCod = new String[] {""} ;
      P035V5_A6018ProForFab = new String[] {""} ;
      P035V5_n6018ProForFab = new boolean[] {false} ;
      P035V5_A771ProForTie = new short[1] ;
      P035V5_A772ProForTmx = new short[1] ;
      P035V5_A4706ProForRb = new short[1] ;
      P035V5_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035V5_n6876ProForPhx = new boolean[] {false} ;
      P035V5_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035V5_n6877ProForPhn = new boolean[] {false} ;
      P035V5_A773ProForUli = new short[1] ;
      P035V5_A12109ProNh2o = new short[1] ;
      P035V5_n12109ProNh2o = new boolean[] {false} ;
      A6018ProForFab = "" ;
      A6876ProForPhx = DecimalUtil.ZERO ;
      A6877ProForPhn = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      A7935Dtb_CPQ = "" ;
      A7937Dtb_ForFab = "" ;
      A7940Dtb_ForRb = DecimalUtil.ZERO ;
      A7941Dtb_ForPhx = DecimalUtil.ZERO ;
      A7942Dtb_ForPhn = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P035V7_A396EmprCod = new String[] {""} ;
      P035V7_A764ProForCod = new String[] {""} ;
      P035V7_A767ProForLin = new short[1] ;
      P035V7_A770ProForPrd = new String[] {""} ;
      P035V7_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035V7_A763ProForCla = new String[] {""} ;
      P035V7_A5358ProForClv = new String[] {""} ;
      P035V7_A490ForPrdUMe = new byte[1] ;
      P035V7_n490ForPrdUMe = new boolean[] {false} ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A7945Dtb_Prdnum = "" ;
      A7947Dtb_Forcan = DecimalUtil.ZERO ;
      A8477Dtb_clave1 = "" ;
      A8478Dtb_clave2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppdt005__default(),
         new Object[] {
             new Object[] {
            P035V2_A396EmprCod, P035V2_A129BarCod, P035V2_A132BarCodReo, P035V2_A130BarCodPar, P035V2_A758ProCod, P035V2_A194BarOrdLin, P035V2_A7934Dtb_Ordl
            }
            , new Object[] {
            P035V3_A396EmprCod, P035V3_A129BarCod, P035V3_A132BarCodReo, P035V3_A130BarCodPar, P035V3_A758ProCod, P035V3_A194BarOrdLin, P035V3_A457FasCod
            }
            , new Object[] {
            P035V4_A396EmprCod, P035V4_A457FasCod, P035V4_A764ProForCod, P035V4_A4650FasForLin
            }
            , new Object[] {
            P035V5_A396EmprCod, P035V5_A764ProForCod, P035V5_A6018ProForFab, P035V5_n6018ProForFab, P035V5_A771ProForTie, P035V5_A772ProForTmx, P035V5_A4706ProForRb, P035V5_A6876ProForPhx, P035V5_n6876ProForPhx, P035V5_A6877ProForPhn,
            P035V5_n6877ProForPhn, P035V5_A773ProForUli, P035V5_A12109ProNh2o, P035V5_n12109ProNh2o
            }
            , new Object[] {
            }
            , new Object[] {
            P035V7_A396EmprCod, P035V7_A764ProForCod, P035V7_A767ProForLin, P035V7_A770ProForPrd, P035V7_A762ProForCan, P035V7_A763ProForCla, P035V7_A5358ProForClv, P035V7_A490ForPrdUMe
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV16Ok ;
   private byte AV12Barcodreo ;
   private byte W132BarCodReo ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private short A194BarOrdLin ;
   private short A7934Dtb_Ordl ;
   private short AV10Barordlin ;
   private short A4650FasForLin ;
   private short AV15FasForlin ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A4706ProForRb ;
   private short A773ProForUli ;
   private short A12109ProNh2o ;
   private short W194BarOrdLin ;
   private short A7938Dtb_Fortie ;
   private short A7939Dtb_ForTmx ;
   private short A7943Dtb_ForUli ;
   private short A12111Dtb_Nh2o ;
   private short Gx_err ;
   private short A767ProForLin ;
   private short A7944Dtb_ForLin ;
   private int A129BarCod ;
   private int AV8Barcod ;
   private int GX_INS1108 ;
   private int W129BarCod ;
   private int GX_INS1109 ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A7940Dtb_ForRb ;
   private java.math.BigDecimal A7941Dtb_ForPhx ;
   private java.math.BigDecimal A7942Dtb_ForPhn ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A7947Dtb_Forcan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String AV9FasCod ;
   private String AV11Procod ;
   private String AV13barcodpar ;
   private String A764ProForCod ;
   private String AV14Proforcod ;
   private String A6018ProForFab ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String A7935Dtb_CPQ ;
   private String A7937Dtb_ForFab ;
   private String Gx_emsg ;
   private String A770ProForPrd ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String A7945Dtb_Prdnum ;
   private String A8477Dtb_clave1 ;
   private String A8478Dtb_clave2 ;
   private boolean returnInSub ;
   private boolean n6018ProForFab ;
   private boolean n6876ProForPhx ;
   private boolean n6877ProForPhn ;
   private boolean n12109ProNh2o ;
   private boolean n7935Dtb_CPQ ;
   private boolean n7937Dtb_ForFab ;
   private boolean n7938Dtb_Fortie ;
   private boolean n7939Dtb_ForTmx ;
   private boolean n7940Dtb_ForRb ;
   private boolean n7941Dtb_ForPhx ;
   private boolean n7942Dtb_ForPhn ;
   private boolean n7943Dtb_ForUli ;
   private boolean n12111Dtb_Nh2o ;
   private boolean n490ForPrdUMe ;
   private boolean n7945Dtb_Prdnum ;
   private boolean n7947Dtb_Forcan ;
   private boolean n8477Dtb_clave1 ;
   private boolean n8478Dtb_clave2 ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P035V2_A396EmprCod ;
   private int[] P035V2_A129BarCod ;
   private byte[] P035V2_A132BarCodReo ;
   private String[] P035V2_A130BarCodPar ;
   private String[] P035V2_A758ProCod ;
   private short[] P035V2_A194BarOrdLin ;
   private short[] P035V2_A7934Dtb_Ordl ;
   private String[] P035V3_A396EmprCod ;
   private int[] P035V3_A129BarCod ;
   private byte[] P035V3_A132BarCodReo ;
   private String[] P035V3_A130BarCodPar ;
   private String[] P035V3_A758ProCod ;
   private short[] P035V3_A194BarOrdLin ;
   private String[] P035V3_A457FasCod ;
   private String[] P035V4_A396EmprCod ;
   private String[] P035V4_A457FasCod ;
   private String[] P035V4_A764ProForCod ;
   private short[] P035V4_A4650FasForLin ;
   private String[] P035V5_A396EmprCod ;
   private String[] P035V5_A764ProForCod ;
   private String[] P035V5_A6018ProForFab ;
   private boolean[] P035V5_n6018ProForFab ;
   private short[] P035V5_A771ProForTie ;
   private short[] P035V5_A772ProForTmx ;
   private short[] P035V5_A4706ProForRb ;
   private java.math.BigDecimal[] P035V5_A6876ProForPhx ;
   private boolean[] P035V5_n6876ProForPhx ;
   private java.math.BigDecimal[] P035V5_A6877ProForPhn ;
   private boolean[] P035V5_n6877ProForPhn ;
   private short[] P035V5_A773ProForUli ;
   private short[] P035V5_A12109ProNh2o ;
   private boolean[] P035V5_n12109ProNh2o ;
   private String[] P035V7_A396EmprCod ;
   private String[] P035V7_A764ProForCod ;
   private short[] P035V7_A767ProForLin ;
   private String[] P035V7_A770ProForPrd ;
   private java.math.BigDecimal[] P035V7_A762ProForCan ;
   private String[] P035V7_A763ProForCla ;
   private String[] P035V7_A5358ProForClv ;
   private byte[] P035V7_A490ForPrdUMe ;
   private boolean[] P035V7_n490ForPrdUMe ;
}

final  class ppdt005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P035V2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P035V3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P035V4", "SELECT EmprCod, FasCod, ProForCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P035V5", "SELECT EmprCod, ProForCod, ProForFab, ProForTie, ProForTmx, ProForRb, ProForPhx, ProForPhn, ProForUli, ProNh2o FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P035V6", "INSERT INTO TXPDT005(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new ForEachCursor("P035V7", "SELECT EmprCod, ProForCod, ProForLin, ProForPrd, ProForCan, ProForCla, ProForClv, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P035V8", "INSERT INTO TXPDT0051(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin, Dtb_Prdnum, ForPrdUMe, Dtb_Forcan, Dtb_clave1, Dtb_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[24]).shortValue());
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

