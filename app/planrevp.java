package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class planrevp extends GXProcedure
{
   public planrevp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( planrevp.class ), "" );
   }

   public planrevp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 ,
                          String[] aP5 )
   {
      planrevp.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 )
   {
      planrevp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      planrevp.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      planrevp.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      planrevp.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      planrevp.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      planrevp.this.AV34BarMaqPrf = aP5[0];
      this.aP5 = aP5;
      planrevp.this.AV35BarMaqVol = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28Linea = (short)(0) ;
      AV30TermiCod = context.getWorkstationId( remoteHandle) ;
      /* Using cursor P037N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2792TermiCod = P037N2_A2792TermiCod[0] ;
         A2793BarULinMaq = P037N2_A2793BarULinMaq[0] ;
         n2793BarULinMaq = P037N2_n2793BarULinMaq[0] ;
         /* Using cursor P037N3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2794BarLinMaq = P037N3_A2794BarLinMaq[0] ;
            A2795BarMaqPrf = P037N3_A2795BarMaqPrf[0] ;
            n2795BarMaqPrf = P037N3_n2795BarMaqPrf[0] ;
            /* Optimized DELETE. */
            /* Using cursor P037N4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
            /* End optimized DELETE. */
            /* Using cursor P037N5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P037N6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P037N7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A5111RecBp12 = P037N7_A5111RecBp12[0] ;
         A5112RecBp13 = P037N7_A5112RecBp13[0] ;
         A5113RecBp14 = P037N7_A5113RecBp14[0] ;
         A5114RecBp15 = P037N7_A5114RecBp15[0] ;
         A5110RecNumPrg = P037N7_A5110RecNumPrg[0] ;
         A5109RecNumInt = P037N7_A5109RecNumInt[0] ;
         A2806RecFA = P037N7_A2806RecFA[0] ;
         A5115RecAbsFac = P037N7_A5115RecAbsFac[0] ;
         A1272UltLinPro = P037N7_A1272UltLinPro[0] ;
         /* Using cursor P037N8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A2803UltLinMaq = P037N8_A2803UltLinMaq[0] ;
         n2803UltLinMaq = P037N8_n2803UltLinMaq[0] ;
         A180BarMaqCod = P037N8_A180BarMaqCod[0] ;
         A236BarVolMaq = P037N8_A236BarVolMaq[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /* Using cursor P037N9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A764ProForCod = P037N9_A764ProForCod[0] ;
            A4697RecNroPrg = P037N9_A4697RecNroPrg[0] ;
            A1273RecLinPro = P037N9_A1273RecLinPro[0] ;
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            AV29EmprCod = A396EmprCod ;
            AV25BarCod = A129BarCod ;
            AV26BarCodReo = A132BarCodReo ;
            AV27BarCodPar = A130BarCodPar ;
            AV31BarLinMaq = A2804RecLinMaq ;
            AV32BarPrfLin = A1273RecLinPro ;
            AV33BarPrfCod = A764ProForCod ;
            AV49RecNroprg = A4697RecNroPrg ;
            /*
               INSERT RECORD ON TABLE TXPBARPR2

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            A396EmprCod = AV29EmprCod ;
            A2792TermiCod = AV30TermiCod ;
            A129BarCod = AV25BarCod ;
            A132BarCodReo = AV26BarCodReo ;
            A130BarCodPar = AV27BarCodPar ;
            A2794BarLinMaq = AV31BarLinMaq ;
            A1255BarPrfLin = AV32BarPrfLin ;
            A207BarPrfCod = AV33BarPrfCod ;
            n207BarPrfCod = false ;
            A4871BarPrfPrg = AV49RecNroprg ;
            n4871BarPrfPrg = false ;
            /* Using cursor P037N10 */
            pr_default.execute(8, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin), Boolean.valueOf(n207BarPrfCod), A207BarPrfCod, Boolean.valueOf(n4871BarPrfPrg), Integer.valueOf(A4871BarPrfPrg)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
            if ( (pr_default.getStatus(8) == 1) )
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
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         AV36BarMaqFA = A2806RecFA ;
         if ( A5115RecAbsFac.doubleValue() > 0 )
         {
            AV36BarMaqFA = A5115RecAbsFac ;
         }
         AV39BarPrfUli2 = A1272UltLinPro ;
         AV40BarULinMaq = A2803UltLinMaq ;
         /*
            INSERT RECORD ON TABLE TXPBARMAQ

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A396EmprCod = AV29EmprCod ;
         A2792TermiCod = AV30TermiCod ;
         A129BarCod = AV25BarCod ;
         A132BarCodReo = AV26BarCodReo ;
         A130BarCodPar = AV27BarCodPar ;
         A2794BarLinMaq = AV31BarLinMaq ;
         A2795BarMaqPrf = AV34BarMaqPrf ;
         n2795BarMaqPrf = false ;
         A2796BarMaqVol = AV35BarMaqVol ;
         n2796BarMaqVol = false ;
         A2797BarMaqFA = AV36BarMaqFA ;
         n2797BarMaqFA = false ;
         A2800BarPrfULi2 = AV39BarPrfUli2 ;
         n2800BarPrfULi2 = false ;
         A5116BarMaqB12 = A5111RecBp12 ;
         n5116BarMaqB12 = false ;
         A5117BarMaqB13 = A5112RecBp13 ;
         n5117BarMaqB13 = false ;
         A5118BarMaqB14 = A5113RecBp14 ;
         n5118BarMaqB14 = false ;
         A5119BarMaqB15 = A5114RecBp15 ;
         n5119BarMaqB15 = false ;
         A5120BarMaqNpr = A5110RecNumPrg ;
         n5120BarMaqNpr = false ;
         A5121BarMaqInt = A5109RecNumInt ;
         n5121BarMaqInt = false ;
         /* Using cursor P037N11 */
         pr_default.execute(9, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Boolean.valueOf(n2795BarMaqPrf), A2795BarMaqPrf, Boolean.valueOf(n2796BarMaqVol), Integer.valueOf(A2796BarMaqVol), Boolean.valueOf(n2797BarMaqFA), A2797BarMaqFA, Boolean.valueOf(n2800BarPrfULi2), Short.valueOf(A2800BarPrfULi2), Boolean.valueOf(n5116BarMaqB12), Short.valueOf(A5116BarMaqB12), Boolean.valueOf(n5117BarMaqB13), Short.valueOf(A5117BarMaqB13), Boolean.valueOf(n5118BarMaqB14), Short.valueOf(A5118BarMaqB14), Boolean.valueOf(n5119BarMaqB15), Short.valueOf(A5119BarMaqB15), Boolean.valueOf(n5120BarMaqNpr), A5120BarMaqNpr, Boolean.valueOf(n5121BarMaqInt), Integer.valueOf(A5121BarMaqInt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
         if ( (pr_default.getStatus(9) == 1) )
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
         A180BarMaqCod = AV34BarMaqPrf ;
         A236BarVolMaq = AV35BarMaqVol ;
         /* Using cursor P037N12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A122BarAgrPar = P037N12_A122BarAgrPar[0] ;
            A124BarAgrReo = P037N12_A124BarAgrReo[0] ;
            A119BarAgrCod = P037N12_A119BarAgrCod[0] ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A119BarAgrCod ;
            GXv_int3[0] = A124BarAgrReo ;
            GXv_char4[0] = A122BarAgrPar ;
            GXv_char5[0] = AV34BarMaqPrf ;
            GXv_int6[0] = AV35BarMaqVol ;
            new app.pmodmav(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_int6) ;
            planrevp.this.A396EmprCod = GXv_char1[0] ;
            planrevp.this.A119BarAgrCod = GXv_int2[0] ;
            planrevp.this.A124BarAgrReo = GXv_int3[0] ;
            planrevp.this.A122BarAgrPar = GXv_char4[0] ;
            planrevp.this.AV34BarMaqPrf = GXv_char5[0] ;
            planrevp.this.AV35BarMaqVol = GXv_int6[0] ;
            pr_default.readNext(10);
         }
         pr_default.close(10);
         /* Using cursor P037N13 */
         pr_default.execute(11, new Object[] {A180BarMaqCod, Integer.valueOf(A236BarVolMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      pr_default.close(6);
      /*
         INSERT RECORD ON TABLE TXPBARTER

      */
      A396EmprCod = AV29EmprCod ;
      A2792TermiCod = AV30TermiCod ;
      A129BarCod = AV25BarCod ;
      A132BarCodReo = AV26BarCodReo ;
      A130BarCodPar = AV27BarCodPar ;
      A2793BarULinMaq = AV40BarULinMaq ;
      n2793BarULinMaq = false ;
      /* Using cursor P037N14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n2793BarULinMaq), Short.valueOf(A2793BarULinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
      if ( (pr_default.getStatus(12) == 1) )
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
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = AV30TermiCod ;
      GXv_int6[0] = A129BarCod ;
      GXv_int3[0] = A132BarCodReo ;
      GXv_char1[0] = A130BarCodPar ;
      GXv_char7[0] = " " ;
      new app.planzar(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int6, GXv_int3, GXv_char1, GXv_char7) ;
      planrevp.this.A396EmprCod = GXv_char5[0] ;
      planrevp.this.AV30TermiCod = GXv_char4[0] ;
      planrevp.this.A129BarCod = GXv_int6[0] ;
      planrevp.this.A132BarCodReo = GXv_int3[0] ;
      planrevp.this.A130BarCodPar = GXv_char1[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = planrevp.this.A396EmprCod;
      this.aP1[0] = planrevp.this.A129BarCod;
      this.aP2[0] = planrevp.this.A132BarCodReo;
      this.aP3[0] = planrevp.this.A130BarCodPar;
      this.aP4[0] = planrevp.this.A2804RecLinMaq;
      this.aP5[0] = planrevp.this.AV34BarMaqPrf;
      this.aP6[0] = planrevp.this.AV35BarMaqVol;
      Application.commitDataStores(context, remoteHandle, pr_default, "planrevp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30TermiCod = "" ;
      scmdbuf = "" ;
      P037N2_A396EmprCod = new String[] {""} ;
      P037N2_A129BarCod = new int[1] ;
      P037N2_A132BarCodReo = new byte[1] ;
      P037N2_A130BarCodPar = new String[] {""} ;
      P037N2_A2792TermiCod = new String[] {""} ;
      P037N2_A2793BarULinMaq = new short[1] ;
      P037N2_n2793BarULinMaq = new boolean[] {false} ;
      A2792TermiCod = "" ;
      P037N3_A396EmprCod = new String[] {""} ;
      P037N3_A2792TermiCod = new String[] {""} ;
      P037N3_A129BarCod = new int[1] ;
      P037N3_A132BarCodReo = new byte[1] ;
      P037N3_A130BarCodPar = new String[] {""} ;
      P037N3_A2794BarLinMaq = new short[1] ;
      P037N3_A2795BarMaqPrf = new String[] {""} ;
      P037N3_n2795BarMaqPrf = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      P037N7_A396EmprCod = new String[] {""} ;
      P037N7_A129BarCod = new int[1] ;
      P037N7_A132BarCodReo = new byte[1] ;
      P037N7_A130BarCodPar = new String[] {""} ;
      P037N7_A2804RecLinMaq = new short[1] ;
      P037N7_A5111RecBp12 = new short[1] ;
      P037N7_A5112RecBp13 = new short[1] ;
      P037N7_A5113RecBp14 = new short[1] ;
      P037N7_A5114RecBp15 = new short[1] ;
      P037N7_A5110RecNumPrg = new String[] {""} ;
      P037N7_A5109RecNumInt = new int[1] ;
      P037N7_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037N7_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037N7_A1272UltLinPro = new byte[1] ;
      A5110RecNumPrg = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      P037N8_A2803UltLinMaq = new short[1] ;
      P037N8_n2803UltLinMaq = new boolean[] {false} ;
      P037N8_A180BarMaqCod = new String[] {""} ;
      P037N8_A236BarVolMaq = new int[1] ;
      A180BarMaqCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      P037N9_A396EmprCod = new String[] {""} ;
      P037N9_A129BarCod = new int[1] ;
      P037N9_A132BarCodReo = new byte[1] ;
      P037N9_A130BarCodPar = new String[] {""} ;
      P037N9_A2804RecLinMaq = new short[1] ;
      P037N9_A764ProForCod = new String[] {""} ;
      P037N9_A4697RecNroPrg = new int[1] ;
      P037N9_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      AV29EmprCod = "" ;
      AV27BarCodPar = "" ;
      AV33BarPrfCod = "" ;
      A207BarPrfCod = "" ;
      Gx_emsg = "" ;
      AV36BarMaqFA = DecimalUtil.ZERO ;
      A2797BarMaqFA = DecimalUtil.ZERO ;
      A5120BarMaqNpr = "" ;
      P037N12_A396EmprCod = new String[] {""} ;
      P037N12_A129BarCod = new int[1] ;
      P037N12_A132BarCodReo = new byte[1] ;
      P037N12_A130BarCodPar = new String[] {""} ;
      P037N12_A122BarAgrPar = new String[] {""} ;
      P037N12_A124BarAgrReo = new byte[1] ;
      P037N12_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      GXv_int2 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.planrevp__default(),
         new Object[] {
             new Object[] {
            P037N2_A396EmprCod, P037N2_A129BarCod, P037N2_A132BarCodReo, P037N2_A130BarCodPar, P037N2_A2792TermiCod, P037N2_A2793BarULinMaq, P037N2_n2793BarULinMaq
            }
            , new Object[] {
            P037N3_A396EmprCod, P037N3_A2792TermiCod, P037N3_A129BarCod, P037N3_A132BarCodReo, P037N3_A130BarCodPar, P037N3_A2794BarLinMaq, P037N3_A2795BarMaqPrf, P037N3_n2795BarMaqPrf
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P037N7_A396EmprCod, P037N7_A129BarCod, P037N7_A132BarCodReo, P037N7_A130BarCodPar, P037N7_A2804RecLinMaq, P037N7_A5111RecBp12, P037N7_A5112RecBp13, P037N7_A5113RecBp14, P037N7_A5114RecBp15, P037N7_A5110RecNumPrg,
            P037N7_A5109RecNumInt, P037N7_A2806RecFA, P037N7_A5115RecAbsFac, P037N7_A1272UltLinPro
            }
            , new Object[] {
            P037N8_A2803UltLinMaq, P037N8_n2803UltLinMaq, P037N8_A180BarMaqCod, P037N8_A236BarVolMaq
            }
            , new Object[] {
            P037N9_A396EmprCod, P037N9_A129BarCod, P037N9_A132BarCodReo, P037N9_A130BarCodPar, P037N9_A2804RecLinMaq, P037N9_A764ProForCod, P037N9_A4697RecNroPrg, P037N9_A1273RecLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P037N12_A396EmprCod, P037N12_A129BarCod, P037N12_A132BarCodReo, P037N12_A130BarCodPar, P037N12_A122BarAgrPar, P037N12_A124BarAgrReo, P037N12_A119BarAgrCod
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

   private byte A132BarCodReo ;
   private byte A1272UltLinPro ;
   private byte W132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV26BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private short A2804RecLinMaq ;
   private short AV28Linea ;
   private short A2793BarULinMaq ;
   private short A2794BarLinMaq ;
   private short A5111RecBp12 ;
   private short A5112RecBp13 ;
   private short A5113RecBp14 ;
   private short A5114RecBp15 ;
   private short A2803UltLinMaq ;
   private short AV31BarLinMaq ;
   private short AV32BarPrfLin ;
   private short A1255BarPrfLin ;
   private short Gx_err ;
   private short AV39BarPrfUli2 ;
   private short AV40BarULinMaq ;
   private short A2800BarPrfULi2 ;
   private short A5116BarMaqB12 ;
   private short A5117BarMaqB13 ;
   private short A5118BarMaqB14 ;
   private short A5119BarMaqB15 ;
   private int A129BarCod ;
   private int AV35BarMaqVol ;
   private int A5109RecNumInt ;
   private int A236BarVolMaq ;
   private int W129BarCod ;
   private int A4697RecNroPrg ;
   private int AV25BarCod ;
   private int AV49RecNroprg ;
   private int GX_INS407 ;
   private int A4871BarPrfPrg ;
   private int GX_INS406 ;
   private int A2796BarMaqVol ;
   private int A5121BarMaqInt ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private int GX_INS405 ;
   private int GXv_int6[] ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal AV36BarMaqFA ;
   private java.math.BigDecimal A2797BarMaqFA ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV34BarMaqPrf ;
   private String AV30TermiCod ;
   private String scmdbuf ;
   private String A2792TermiCod ;
   private String A2795BarMaqPrf ;
   private String A5110RecNumPrg ;
   private String A180BarMaqCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A764ProForCod ;
   private String AV29EmprCod ;
   private String AV27BarCodPar ;
   private String AV33BarPrfCod ;
   private String A207BarPrfCod ;
   private String Gx_emsg ;
   private String A5120BarMaqNpr ;
   private String A122BarAgrPar ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char7[] ;
   private boolean n2793BarULinMaq ;
   private boolean n2795BarMaqPrf ;
   private boolean n2803UltLinMaq ;
   private boolean n207BarPrfCod ;
   private boolean n4871BarPrfPrg ;
   private boolean n2796BarMaqVol ;
   private boolean n2797BarMaqFA ;
   private boolean n2800BarPrfULi2 ;
   private boolean n5116BarMaqB12 ;
   private boolean n5117BarMaqB13 ;
   private boolean n5118BarMaqB14 ;
   private boolean n5119BarMaqB15 ;
   private boolean n5120BarMaqNpr ;
   private boolean n5121BarMaqInt ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P037N2_A396EmprCod ;
   private int[] P037N2_A129BarCod ;
   private byte[] P037N2_A132BarCodReo ;
   private String[] P037N2_A130BarCodPar ;
   private String[] P037N2_A2792TermiCod ;
   private short[] P037N2_A2793BarULinMaq ;
   private boolean[] P037N2_n2793BarULinMaq ;
   private String[] P037N3_A396EmprCod ;
   private String[] P037N3_A2792TermiCod ;
   private int[] P037N3_A129BarCod ;
   private byte[] P037N3_A132BarCodReo ;
   private String[] P037N3_A130BarCodPar ;
   private short[] P037N3_A2794BarLinMaq ;
   private String[] P037N3_A2795BarMaqPrf ;
   private boolean[] P037N3_n2795BarMaqPrf ;
   private String[] P037N7_A396EmprCod ;
   private int[] P037N7_A129BarCod ;
   private byte[] P037N7_A132BarCodReo ;
   private String[] P037N7_A130BarCodPar ;
   private short[] P037N7_A2804RecLinMaq ;
   private short[] P037N7_A5111RecBp12 ;
   private short[] P037N7_A5112RecBp13 ;
   private short[] P037N7_A5113RecBp14 ;
   private short[] P037N7_A5114RecBp15 ;
   private String[] P037N7_A5110RecNumPrg ;
   private int[] P037N7_A5109RecNumInt ;
   private java.math.BigDecimal[] P037N7_A2806RecFA ;
   private java.math.BigDecimal[] P037N7_A5115RecAbsFac ;
   private byte[] P037N7_A1272UltLinPro ;
   private short[] P037N8_A2803UltLinMaq ;
   private boolean[] P037N8_n2803UltLinMaq ;
   private String[] P037N8_A180BarMaqCod ;
   private int[] P037N8_A236BarVolMaq ;
   private String[] P037N9_A396EmprCod ;
   private int[] P037N9_A129BarCod ;
   private byte[] P037N9_A132BarCodReo ;
   private String[] P037N9_A130BarCodPar ;
   private short[] P037N9_A2804RecLinMaq ;
   private String[] P037N9_A764ProForCod ;
   private int[] P037N9_A4697RecNroPrg ;
   private byte[] P037N9_A1273RecLinPro ;
   private String[] P037N12_A396EmprCod ;
   private int[] P037N12_A129BarCod ;
   private byte[] P037N12_A132BarCodReo ;
   private String[] P037N12_A130BarCodPar ;
   private String[] P037N12_A122BarAgrPar ;
   private byte[] P037N12_A124BarAgrReo ;
   private int[] P037N12_A119BarAgrCod ;
}

final  class planrevp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037N2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, TermiCod, BarULinMaq FROM TXPBARTER WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037N3", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf FROM TXPBARMAQ WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037N4", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P037N5", "DELETE FROM TXPBARMAQ  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P037N6", "DELETE FROM TXPBARTER  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new ForEachCursor("P037N7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecBp12, RecBp13, RecBp14, RecBp15, RecNumPrg, RecNumInt, RecFA, RecAbsFac, UltLinPro FROM TXPRECMAQ WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037N8", "SELECT UltLinMaq, BarMaqCod, BarVolMaq FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037N9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, ProForCod, RecNroPrg, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037N10", "INSERT INTO TXPBARPR2(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin, BarPrfCod, BarPrfPrg, BarPrfVol, BarPrfTie, BarPrfTmp, BarPrfPhx, BarPrfPhm, BarPrfRb, BarPrfRec, BarPrfH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P037N11", "INSERT INTO TXPBARMAQ(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf, BarMaqVol, BarMaqFA, BarPrfULi2, BarMaqB12, BarMaqB13, BarMaqB14, BarMaqB15, BarMaqNpr, BarMaqInt, BarMaqVR, BarMaqRep, BarMaqPr2, BarMaqPr3, BarMaqOrd, BarMaqFas, BarMaqNh, BarMaqVX, BarMaqBL, BarMaqFlow, BarMaqRPM, BarMaqMol, BarMaqTor, BarMaqCla, BarMaqTej, BarMaqDel, BarMaqPML, BarMaqObs, BarSalM, MSedo1, MSedo2, MSedo3, MSedo4, MSedo5, MSedo6, Msedo7, Msedo8, Msedo9, Msedo10, Msedo11) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new ForEachCursor("P037N12", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037N13", "UPDATE TXPBARCAD SET BarMaqCod=?, BarVolMaq=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P037N14", "INSERT INTO TXPBARTER(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarULinMaq, BarPrfULin, BarMacPro1) VALUES(?, ?, ?, ?, ?, ?, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[23], 6);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[25]).intValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
      }
   }

}

