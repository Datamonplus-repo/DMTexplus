package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prac001 extends GXProcedure
{
   public prac001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prac001.class ), "" );
   }

   public prac001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 ,
                             byte[] aP14 ,
                             String[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             int[] aP18 ,
                             java.math.BigDecimal[] aP19 )
   {
      prac001.this.aP20 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
      return aP20[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 ,
                        byte[] aP14 ,
                        String[] aP15 ,
                        short[] aP16 ,
                        short[] aP17 ,
                        int[] aP18 ,
                        java.math.BigDecimal[] aP19 ,
                        String[] aP20 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 ,
                             byte[] aP14 ,
                             String[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             int[] aP18 ,
                             java.math.BigDecimal[] aP19 ,
                             String[] aP20 )
   {
      prac001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prac001.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      prac001.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      prac001.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      prac001.this.AV13BarKgm = aP4[0];
      this.aP4 = aP4;
      prac001.this.AV14BarMtr = aP5[0];
      this.aP5 = aP5;
      prac001.this.AV15ArtFacAbs = aP6[0];
      this.aP6 = aP6;
      prac001.this.AV16CliCod = aP7[0];
      this.aP7 = aP7;
      prac001.this.AV17BarSer = aP8[0];
      this.aP8 = aP8;
      prac001.this.AV18ProCod = aP9[0];
      this.aP9 = aP9;
      prac001.this.AV19MaqCod = aP10[0];
      this.aP10 = aP10;
      prac001.this.AV21FasCod = aP11[0];
      this.aP11 = aP11;
      prac001.this.AV22ProForCod = aP12[0];
      this.aP12 = aP12;
      prac001.this.AV20Volumen = aP13[0];
      this.aP13 = aP13;
      prac001.this.AV23RecLinPro = aP14[0];
      this.aP14 = aP14;
      prac001.this.AV24Usurcod = aP15[0];
      this.aP15 = aP15;
      prac001.this.AV12RecLinMaq = aP16[0];
      this.aP16 = aP16;
      prac001.this.AV26BarOrdlin = aP17[0];
      this.aP17 = aP17;
      prac001.this.AV27LtsRec = aP18[0];
      this.aP18 = aP18;
      prac001.this.AV28Abs2 = aP19[0];
      this.aP19 = aP19;
      prac001.this.AV29Var1 = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P027T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P027T2_A130BarCodPar[0] ;
         A132BarCodReo = P027T2_A132BarCodReo[0] ;
         A129BarCod = P027T2_A129BarCod[0] ;
         A4908BarMacPro = P027T2_A4908BarMacPro[0] ;
         AV31BarMacpro = A4908BarMacPro ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV12RecLinMaq = (short)(0) ;
      /* Using cursor P027T3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A129BarCod = P027T3_A129BarCod[0] ;
         A132BarCodReo = P027T3_A132BarCodReo[0] ;
         A130BarCodPar = P027T3_A130BarCodPar[0] ;
         A2804RecLinMaq = P027T3_A2804RecLinMaq[0] ;
         AV12RecLinMaq = A2804RecLinMaq ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV12RecLinMaq = (short)(AV12RecLinMaq+(((AV12RecLinMaq==0) ? 20 : 5))) ;
      AV25ProForObs = " " ;
      /* Using cursor P027T4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV22ProForCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A764ProForCod = P027T4_A764ProForCod[0] ;
         A4586ProForObs = P027T4_A4586ProForObs[0] ;
         n4586ProForObs = P027T4_n4586ProForObs[0] ;
         AV25ProForObs = A4586ProForObs ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /*
         INSERT RECORD ON TABLE TXPRECMAQ

      */
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "NUMINR", "") ;
      GXv_int3[0] = AV30RecNumInt ;
      new app.pnuminr(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      prac001.this.A396EmprCod = GXv_char1[0] ;
      prac001.this.AV30RecNumInt = GXv_int3[0] ;
      A129BarCod = AV8BarCod ;
      A132BarCodReo = AV9BarCodReo ;
      A130BarCodPar = AV10BarCodPar ;
      A2804RecLinMaq = AV12RecLinMaq ;
      A2805RecVolPrd = AV20Volumen ;
      A2806RecFA = AV15ArtFacAbs ;
      A602MaqCod = AV19MaqCod ;
      A4402RecUsrCod = AV24Usurcod ;
      A4866RecFecAlt = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n4866RecFecAlt = false ;
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      n4867RecFecMod = false ;
      A4868RecUsrMod = GXutil.space( (short)(8)) ;
      n4868RecUsrMod = false ;
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      A4575RecMaqPes = (byte)(0) ;
      A5115RecAbsFac = AV15ArtFacAbs ;
      A5110RecNumPrg = AV31BarMacpro ;
      A5109RecNumInt = AV30RecNumInt ;
      A5111RecBp12 = (short)(0) ;
      A5112RecBp13 = (short)(0) ;
      A5113RecBp14 = (short)(0) ;
      A5114RecBp15 = (short)(0) ;
      A4700RecEnvio = (byte)(1) ;
      A4701RecRecep = (byte)(0) ;
      A5430RecFecPla = GXutil.nullDate() ;
      n5430RecFecPla = false ;
      A4268RecOrdLin = AV26BarOrdlin ;
      n4268RecOrdLin = false ;
      A4258RecMaqFas = AV21FasCod ;
      n4258RecMaqFas = false ;
      A4281RecAgrEst = "" ;
      n4281RecAgrEst = false ;
      A4654RecNroPar = 0 ;
      n4654RecNroPar = false ;
      A4298RecRecLan = "" ;
      n4298RecRecLan = false ;
      A4259RecTotKgs = AV13BarKgm ;
      A4260RecTotMts = AV14BarMtr ;
      n4260RecTotMts = false ;
      A4261RecTotPrd = 0 ;
      n4261RecTotPrd = false ;
      A2805RecVolPrd = AV20Volumen ;
      A1272UltLinPro = (byte)(0) ;
      A5431RecPriPla = (byte)(80) ;
      n5431RecPriPla = false ;
      A8367RecPriAca = (short)(800) ;
      n8367RecPriAca = false ;
      A6039RecAcab = httpContext.getMessage( "S", "") ;
      n6039RecAcab = false ;
      A9764RecLtsSR = AV27LtsRec ;
      n9764RecLtsSR = false ;
      A9811RecAbs2 = AV28Abs2 ;
      n9811RecAbs2 = false ;
      A9812RecHdrLts = AV29Var1 ;
      n9812RecHdrLts = false ;
      A10385RecCAut = (byte)(0) ;
      /* Using cursor P027T5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), A602MaqCod, Integer.valueOf(A2805RecVolPrd), A2806RecFA, Byte.valueOf(A1272UltLinPro), Boolean.valueOf(n4258RecMaqFas), A4258RecMaqFas, A4259RecTotKgs, Boolean.valueOf(n4260RecTotMts), A4260RecTotMts, Boolean.valueOf(n4261RecTotPrd), Integer.valueOf(A4261RecTotPrd), Boolean.valueOf(n4268RecOrdLin), Short.valueOf(A4268RecOrdLin), Boolean.valueOf(n4281RecAgrEst), A4281RecAgrEst, Boolean.valueOf(n4298RecRecLan), A4298RecRecLan, A4402RecUsrCod, A4574RecFecPes, Byte.valueOf(A4575RecMaqPes), Boolean.valueOf(n4654RecNroPar), Integer.valueOf(A4654RecNroPar), Byte.valueOf(A4700RecEnvio), Byte.valueOf(A4701RecRecep), Boolean.valueOf(n4866RecFecAlt), A4866RecFecAlt, Boolean.valueOf(n4867RecFecMod), A4867RecFecMod, Boolean.valueOf(n4868RecUsrMod), A4868RecUsrMod, Integer.valueOf(A5109RecNumInt), A5110RecNumPrg, Short.valueOf(A5111RecBp12), Short.valueOf(A5112RecBp13), Short.valueOf(A5113RecBp14), Short.valueOf(A5114RecBp15), A5115RecAbsFac, Boolean.valueOf(n5430RecFecPla), A5430RecFecPla, Boolean.valueOf(n5431RecPriPla), Byte.valueOf(A5431RecPriPla), Boolean.valueOf(n6039RecAcab), A6039RecAcab, Boolean.valueOf(n8367RecPriAca), Short.valueOf(A8367RecPriAca), Boolean.valueOf(n9764RecLtsSR), Integer.valueOf(A9764RecLtsSR), Boolean.valueOf(n9811RecAbs2), A9811RecAbs2, Boolean.valueOf(n9812RecHdrLts), A9812RecHdrLts, Byte.valueOf(A10385RecCAut)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
      if ( (pr_default.getStatus(3) == 1) )
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
      /*
         INSERT RECORD ON TABLE TXPCRECET

      */
      A129BarCod = AV8BarCod ;
      A132BarCodReo = AV9BarCodReo ;
      A130BarCodPar = AV10BarCodPar ;
      A2804RecLinMaq = AV12RecLinMaq ;
      A1273RecLinPro = AV23RecLinPro ;
      A764ProForCod = AV22ProForCod ;
      A4587ProRecObs = AV25ProForObs ;
      A4695RecVolPrf = AV20Volumen ;
      A4696RecTiempo = (short)(0) ;
      n4696RecTiempo = false ;
      A4697RecNroPrg = 0 ;
      /* Using cursor P027T6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod, A4587ProRecObs, Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
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
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prac001.this.A396EmprCod;
      this.aP1[0] = prac001.this.AV8BarCod;
      this.aP2[0] = prac001.this.AV9BarCodReo;
      this.aP3[0] = prac001.this.AV10BarCodPar;
      this.aP4[0] = prac001.this.AV13BarKgm;
      this.aP5[0] = prac001.this.AV14BarMtr;
      this.aP6[0] = prac001.this.AV15ArtFacAbs;
      this.aP7[0] = prac001.this.AV16CliCod;
      this.aP8[0] = prac001.this.AV17BarSer;
      this.aP9[0] = prac001.this.AV18ProCod;
      this.aP10[0] = prac001.this.AV19MaqCod;
      this.aP11[0] = prac001.this.AV21FasCod;
      this.aP12[0] = prac001.this.AV22ProForCod;
      this.aP13[0] = prac001.this.AV20Volumen;
      this.aP14[0] = prac001.this.AV23RecLinPro;
      this.aP15[0] = prac001.this.AV24Usurcod;
      this.aP16[0] = prac001.this.AV12RecLinMaq;
      this.aP17[0] = prac001.this.AV26BarOrdlin;
      this.aP18[0] = prac001.this.AV27LtsRec;
      this.aP19[0] = prac001.this.AV28Abs2;
      this.aP20[0] = prac001.this.AV29Var1;
      Application.commitDataStores(context, remoteHandle, pr_default, "prac001");
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
      P027T2_A396EmprCod = new String[] {""} ;
      P027T2_A130BarCodPar = new String[] {""} ;
      P027T2_A132BarCodReo = new byte[1] ;
      P027T2_A129BarCod = new int[1] ;
      P027T2_A4908BarMacPro = new String[] {""} ;
      A130BarCodPar = "" ;
      A4908BarMacPro = "" ;
      AV31BarMacpro = "" ;
      P027T3_A396EmprCod = new String[] {""} ;
      P027T3_A129BarCod = new int[1] ;
      P027T3_A132BarCodReo = new byte[1] ;
      P027T3_A130BarCodPar = new String[] {""} ;
      P027T3_A2804RecLinMaq = new short[1] ;
      AV25ProForObs = "" ;
      P027T4_A396EmprCod = new String[] {""} ;
      P027T4_A764ProForCod = new String[] {""} ;
      P027T4_A4586ProForObs = new String[] {""} ;
      P027T4_n4586ProForObs = new boolean[] {false} ;
      A764ProForCod = "" ;
      A4586ProForObs = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      A2806RecFA = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A4402RecUsrCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      A5115RecAbsFac = DecimalUtil.ZERO ;
      A5110RecNumPrg = "" ;
      A5430RecFecPla = GXutil.nullDate() ;
      A4258RecMaqFas = "" ;
      A4281RecAgrEst = "" ;
      A4298RecRecLan = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A6039RecAcab = "" ;
      A9811RecAbs2 = DecimalUtil.ZERO ;
      A9812RecHdrLts = "" ;
      Gx_emsg = "" ;
      A4587ProRecObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prac001__default(),
         new Object[] {
             new Object[] {
            P027T2_A396EmprCod, P027T2_A130BarCodPar, P027T2_A132BarCodReo, P027T2_A129BarCod, P027T2_A4908BarMacPro
            }
            , new Object[] {
            P027T3_A396EmprCod, P027T3_A129BarCod, P027T3_A132BarCodReo, P027T3_A130BarCodPar, P027T3_A2804RecLinMaq
            }
            , new Object[] {
            P027T4_A396EmprCod, P027T4_A764ProForCod, P027T4_A4586ProForObs, P027T4_n4586ProForObs
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

   private byte AV9BarCodReo ;
   private byte AV23RecLinPro ;
   private byte A132BarCodReo ;
   private byte A4575RecMaqPes ;
   private byte A4700RecEnvio ;
   private byte A4701RecRecep ;
   private byte A1272UltLinPro ;
   private byte A5431RecPriPla ;
   private byte A10385RecCAut ;
   private byte A1273RecLinPro ;
   private short AV12RecLinMaq ;
   private short AV26BarOrdlin ;
   private short A2804RecLinMaq ;
   private short A5111RecBp12 ;
   private short A5112RecBp13 ;
   private short A5113RecBp14 ;
   private short A5114RecBp15 ;
   private short A4268RecOrdLin ;
   private short A8367RecPriAca ;
   private short Gx_err ;
   private short A4696RecTiempo ;
   private int AV8BarCod ;
   private int AV16CliCod ;
   private int AV20Volumen ;
   private int AV27LtsRec ;
   private int A129BarCod ;
   private int GX_INS408 ;
   private int AV30RecNumInt ;
   private int GXv_int3[] ;
   private int A2805RecVolPrd ;
   private int A5109RecNumInt ;
   private int A4654RecNroPar ;
   private int A4261RecTotPrd ;
   private int A9764RecLtsSR ;
   private int GX_INS409 ;
   private int A4695RecVolPrf ;
   private int A4697RecNroPrg ;
   private java.math.BigDecimal AV13BarKgm ;
   private java.math.BigDecimal AV14BarMtr ;
   private java.math.BigDecimal AV15ArtFacAbs ;
   private java.math.BigDecimal AV28Abs2 ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4260RecTotMts ;
   private java.math.BigDecimal A9811RecAbs2 ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV17BarSer ;
   private String AV18ProCod ;
   private String AV19MaqCod ;
   private String AV21FasCod ;
   private String AV22ProForCod ;
   private String AV24Usurcod ;
   private String AV29Var1 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A4908BarMacPro ;
   private String AV31BarMacpro ;
   private String A764ProForCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String A602MaqCod ;
   private String A4402RecUsrCod ;
   private String A4868RecUsrMod ;
   private String A5110RecNumPrg ;
   private String A4258RecMaqFas ;
   private String A4281RecAgrEst ;
   private String A4298RecRecLan ;
   private String A6039RecAcab ;
   private String A9812RecHdrLts ;
   private String Gx_emsg ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date A4574RecFecPes ;
   private java.util.Date A5430RecFecPla ;
   private boolean n4586ProForObs ;
   private boolean n4866RecFecAlt ;
   private boolean n4867RecFecMod ;
   private boolean n4868RecUsrMod ;
   private boolean n5430RecFecPla ;
   private boolean n4268RecOrdLin ;
   private boolean n4258RecMaqFas ;
   private boolean n4281RecAgrEst ;
   private boolean n4654RecNroPar ;
   private boolean n4298RecRecLan ;
   private boolean n4260RecTotMts ;
   private boolean n4261RecTotPrd ;
   private boolean n5431RecPriPla ;
   private boolean n8367RecPriAca ;
   private boolean n6039RecAcab ;
   private boolean n9764RecLtsSR ;
   private boolean n9811RecAbs2 ;
   private boolean n9812RecHdrLts ;
   private boolean n4696RecTiempo ;
   private String A4587ProRecObs ;
   private String AV25ProForObs ;
   private String A4586ProForObs ;
   private String[] aP20 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private int[] aP13 ;
   private byte[] aP14 ;
   private String[] aP15 ;
   private short[] aP16 ;
   private short[] aP17 ;
   private int[] aP18 ;
   private java.math.BigDecimal[] aP19 ;
   private IDataStoreProvider pr_default ;
   private String[] P027T2_A396EmprCod ;
   private String[] P027T2_A130BarCodPar ;
   private byte[] P027T2_A132BarCodReo ;
   private int[] P027T2_A129BarCod ;
   private String[] P027T2_A4908BarMacPro ;
   private String[] P027T3_A396EmprCod ;
   private int[] P027T3_A129BarCod ;
   private byte[] P027T3_A132BarCodReo ;
   private String[] P027T3_A130BarCodPar ;
   private short[] P027T3_A2804RecLinMaq ;
   private String[] P027T4_A396EmprCod ;
   private String[] P027T4_A764ProForCod ;
   private String[] P027T4_A4586ProForObs ;
   private boolean[] P027T4_n4586ProForObs ;
}

final  class prac001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027T2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarMacPro FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P027T3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P027T4", "SELECT EmprCod, ProForCod, ProForObs FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P027T5", "INSERT INTO TXPRECMAQ(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod, RecVolPrd, RecFA, UltLinPro, RecMaqFas, RecTotKgs, RecTotMts, RecTotPrd, RecOrdLin, RecAgrEst, RecRecLan, RecUsrCod, RecFecPes, RecMaqPes, RecNroPar, RecEnvio, RecRecep, RecFecAlt, RecFecMod, RecUsrMod, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecFecPla, RecPriPla, RecAcab, RecPriAca, RecLtsSR, RecAbs2, RecHdrLts, RecCAut, RecBarCod, RecBarReo, RecBarPar, RecUltObs, RecUltLCo, RecIntCol, RecMatCol, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecMaqObs, RecLtsDf, RecObsq, Recgrm, RecAnc, Rsedo1, Rsedo2, Rsedo3, Rsedo4, Rsedo5, Rsedo6, RecAva, RecAs, RecAi, Rsedo7, Rsedo8, Rsedo9, Rsedo10, Rsedo11, Rsedo12, Rsedo13, Rsedo14) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new UpdateCursor("P027T6", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, ProRecObs, RecVolPrf, RecTiempo, RecNroPrg, RecTemp, RecPhMx, RecPhMn, RecRb, RecNumRec, RecNH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 8);
               }
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[21], 1);
               }
               stmt.setString(17, (String)parms[22], 8);
               stmt.setDateTime(18, (java.util.Date)parms[23], false);
               stmt.setByte(19, ((Number) parms[24]).byteValue());
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[26]).intValue());
               }
               stmt.setByte(21, ((Number) parms[27]).byteValue());
               stmt.setByte(22, ((Number) parms[28]).byteValue());
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[30], false);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[32], false);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[34], 8);
               }
               stmt.setInt(26, ((Number) parms[35]).intValue());
               stmt.setString(27, (String)parms[36], 6);
               stmt.setShort(28, ((Number) parms[37]).shortValue());
               stmt.setShort(29, ((Number) parms[38]).shortValue());
               stmt.setShort(30, ((Number) parms[39]).shortValue());
               stmt.setShort(31, ((Number) parms[40]).shortValue());
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[41], 2);
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DATE );
               }
               else
               {
                  stmt.setDate(33, (java.util.Date)parms[43]);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(34, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[51]).intValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[55], 12);
               }
               stmt.setByte(40, ((Number) parms[56]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setLongVarchar(8, (String)parms[7], false);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[10]).shortValue());
               }
               stmt.setInt(11, ((Number) parms[11]).intValue());
               return;
      }
   }

}

