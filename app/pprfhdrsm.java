package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprfhdrsm extends GXProcedure
{
   public pprfhdrsm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprfhdrsm.class ), "" );
   }

   public pprfhdrsm( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pprfhdrsm.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      pprfhdrsm.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pprfhdrsm.this.AV26TermiCod = aP1[0];
      this.aP1 = aP1;
      pprfhdrsm.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pprfhdrsm.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      pprfhdrsm.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      pprfhdrsm.this.AV19BarCodMin = aP5[0];
      this.aP5 = aP5;
      pprfhdrsm.this.AV20BarReoMin = aP6[0];
      this.aP6 = aP6;
      pprfhdrsm.this.AV21BarParMin = aP7[0];
      this.aP7 = aP7;
      pprfhdrsm.this.AV27BarLinMaq = aP8[0];
      this.aP8 = aP8;
      pprfhdrsm.this.AV28BarMaqVol = aP9[0];
      this.aP9 = aP9;
      pprfhdrsm.this.AV29BarMaqCod = aP10[0];
      this.aP10 = aP10;
      pprfhdrsm.this.AV45Barsalm = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25FlagJM = (byte)(0) ;
      GXv_int1[0] = AV25FlagJM ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "JMOLTO", ""), GXv_int1) ;
      pprfhdrsm.this.AV25FlagJM = GXv_int1[0] ;
      GXt_int2 = AV33Kholer ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int1) ;
      pprfhdrsm.this.GXt_int2 = GXv_int1[0] ;
      AV33Kholer = GXt_int2 ;
      GXt_int2 = AV40RiColTex ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RICOLT", ""), GXv_int1) ;
      pprfhdrsm.this.GXt_int2 = GXv_int1[0] ;
      AV40RiColTex = GXt_int2 ;
      GXt_int2 = AV41Erfoc ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int1) ;
      pprfhdrsm.this.GXt_int2 = GXv_int1[0] ;
      AV41Erfoc = GXt_int2 ;
      AV19BarCodMin = AV16BarCod ;
      AV20BarReoMin = AV17BarCodReo ;
      AV21BarParMin = AV18BarCodPar ;
      AV23Flag = (byte)(0) ;
      new app.pminagr(remoteHandle, context).execute( AV15EmprCod, AV19BarCodMin, AV20BarReoMin, AV21BarParMin) ;
      AV34Xlformu = (byte)(0) ;
      AV42BarAcaqui = " " ;
      /* Using cursor P03KB2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03KB2_A130BarCodPar[0] ;
         A132BarCodReo = P03KB2_A132BarCodReo[0] ;
         A129BarCod = P03KB2_A129BarCod[0] ;
         A396EmprCod = P03KB2_A396EmprCod[0] ;
         A118BarAcaQui = P03KB2_A118BarAcaQui[0] ;
         AV42BarAcaqui = A118BarAcaQui ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A118BarAcaQui ;
         GXv_int1[0] = AV43Err_aq ;
         new app.pexiprq(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_int1) ;
         pprfhdrsm.this.A396EmprCod = GXv_char3[0] ;
         pprfhdrsm.this.A118BarAcaQui = GXv_char4[0] ;
         pprfhdrsm.this.AV43Err_aq = GXv_int1[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P03KB3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin, Short.valueOf(AV27BarLinMaq), AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin, Short.valueOf(AV27BarLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk3KB3 = false ;
         A2794BarLinMaq = P03KB3_A2794BarLinMaq[0] ;
         A130BarCodPar = P03KB3_A130BarCodPar[0] ;
         A132BarCodReo = P03KB3_A132BarCodReo[0] ;
         A129BarCod = P03KB3_A129BarCod[0] ;
         A2792TermiCod = P03KB3_A2792TermiCod[0] ;
         A396EmprCod = P03KB3_A396EmprCod[0] ;
         A207BarPrfCod = P03KB3_A207BarPrfCod[0] ;
         n207BarPrfCod = P03KB3_n207BarPrfCod[0] ;
         A1255BarPrfLin = P03KB3_A1255BarPrfLin[0] ;
         /* Using cursor P03KB4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
         A2795BarMaqPrf = P03KB4_A2795BarMaqPrf[0] ;
         n2795BarMaqPrf = P03KB4_n2795BarMaqPrf[0] ;
         A2796BarMaqVol = P03KB4_A2796BarMaqVol[0] ;
         n2796BarMaqVol = P03KB4_n2796BarMaqVol[0] ;
         A8935BarSalM = P03KB4_A8935BarSalM[0] ;
         n8935BarSalM = P03KB4_n8935BarSalM[0] ;
         A2795BarMaqPrf = AV29BarMaqCod ;
         n2795BarMaqPrf = false ;
         A2796BarMaqVol = AV28BarMaqVol ;
         n2796BarMaqVol = false ;
         A8935BarSalM = httpContext.getMessage( "S", "") ;
         n8935BarSalM = false ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P03KB3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P03KB3_A2792TermiCod[0], A2792TermiCod) == 0 ) && ( P03KB3_A129BarCod[0] == A129BarCod ) && ( P03KB3_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P03KB3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( P03KB3_A2794BarLinMaq[0] == A2794BarLinMaq ) && ( P03KB3_A1255BarPrfLin[0] == A1255BarPrfLin ) ) )
            {
               if (true) break;
            }
            brk3KB3 = false ;
            A207BarPrfCod = P03KB3_A207BarPrfCod[0] ;
            n207BarPrfCod = P03KB3_n207BarPrfCod[0] ;
            AV23Flag = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            brk3KB3 = true ;
            pr_default.readNext(1);
         }
         /* Using cursor P03KB5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n2795BarMaqPrf), A2795BarMaqPrf, Boolean.valueOf(n2796BarMaqVol), Integer.valueOf(A2796BarMaqVol), Boolean.valueOf(n8935BarSalM), A8935BarSalM, A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
         if ( ! brk3KB3 )
         {
            brk3KB3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      pr_default.close(2);
      if ( AV23Flag == 0 )
      {
         /* Using cursor P03KB8 */
         pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A396EmprCod = P03KB8_A396EmprCod[0] ;
            A130BarCodPar = P03KB8_A130BarCodPar[0] ;
            A132BarCodReo = P03KB8_A132BarCodReo[0] ;
            A129BarCod = P03KB8_A129BarCod[0] ;
            A252CliCod = P03KB8_A252CliCod[0] ;
            n252CliCod = P03KB8_n252CliCod[0] ;
            A212BarSer = P03KB8_A212BarSer[0] ;
            A135BarColNom = P03KB8_A135BarColNom[0] ;
            A136BarColNum = P03KB8_A136BarColNum[0] ;
            A218BarTipCol = P03KB8_A218BarTipCol[0] ;
            A213BarSit = P03KB8_A213BarSit[0] ;
            A166BarKgm = P03KB8_A166BarKgm[0] ;
            n166BarKgm = P03KB8_n166BarKgm[0] ;
            A219BarTotAgr = P03KB8_A219BarTotAgr[0] ;
            n219BarTotAgr = P03KB8_n219BarTotAgr[0] ;
            A219BarTotAgr = P03KB8_A219BarTotAgr[0] ;
            n219BarTotAgr = P03KB8_n219BarTotAgr[0] ;
            A166BarKgm = P03KB8_A166BarKgm[0] ;
            n166BarKgm = P03KB8_n166BarKgm[0] ;
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            AV24Linea = (short)(0) ;
            AV46Kg = A812RecTotKgm ;
            AV31CliCod = A252CliCod ;
            AV32ArtCod = A212BarSer ;
            AV35ForColNom = A135BarColNom ;
            AV36ForColNum = A136BarColNum ;
            AV37TipColCod = A218BarTipCol ;
            AV47BarSit = A213BarSit ;
            /* Execute user subroutine: 'FACABS' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            System.out.println( httpContext.getMessage( "Insert BARMAQ", "") );
            /*
               INSERT RECORD ON TABLE TXPBARMAQ

            */
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            A2792TermiCod = AV26TermiCod ;
            A129BarCod = AV19BarCodMin ;
            A132BarCodReo = AV20BarReoMin ;
            A130BarCodPar = AV21BarParMin ;
            A2794BarLinMaq = AV27BarLinMaq ;
            A2796BarMaqVol = AV28BarMaqVol ;
            n2796BarMaqVol = false ;
            A2795BarMaqPrf = AV29BarMaqCod ;
            n2795BarMaqPrf = false ;
            A2797BarMaqFA = AV30ArtFacAbs ;
            n2797BarMaqFA = false ;
            A5116BarMaqB12 = (short)(0) ;
            n5116BarMaqB12 = false ;
            A5117BarMaqB13 = (short)(0) ;
            n5117BarMaqB13 = false ;
            A5118BarMaqB14 = (short)(0) ;
            n5118BarMaqB14 = false ;
            A5119BarMaqB15 = (short)(0) ;
            n5119BarMaqB15 = false ;
            A5120BarMaqNpr = GXutil.space( (short)(6)) ;
            n5120BarMaqNpr = false ;
            A5121BarMaqInt = 0 ;
            n5121BarMaqInt = false ;
            A8935BarSalM = httpContext.getMessage( "S", "") ;
            n8935BarSalM = false ;
            /* Using cursor P03KB9 */
            pr_default.execute(5, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Boolean.valueOf(n2795BarMaqPrf), A2795BarMaqPrf, Boolean.valueOf(n2796BarMaqVol), Integer.valueOf(A2796BarMaqVol), Boolean.valueOf(n2797BarMaqFA), A2797BarMaqFA, Boolean.valueOf(n5116BarMaqB12), Short.valueOf(A5116BarMaqB12), Boolean.valueOf(n5117BarMaqB13), Short.valueOf(A5117BarMaqB13), Boolean.valueOf(n5118BarMaqB14), Short.valueOf(A5118BarMaqB14), Boolean.valueOf(n5119BarMaqB15), Short.valueOf(A5119BarMaqB15), Boolean.valueOf(n5120BarMaqNpr), A5120BarMaqNpr, Boolean.valueOf(n5121BarMaqInt), Integer.valueOf(A5121BarMaqInt), Boolean.valueOf(n8935BarSalM), A8935BarSalM});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
            if ( (pr_default.getStatus(5) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            /* End Insert */
            System.out.println( httpContext.getMessage( "Insert BARTER", "") );
            /*
               INSERT RECORD ON TABLE TXPBARTER

            */
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            A2792TermiCod = AV26TermiCod ;
            A129BarCod = AV19BarCodMin ;
            A132BarCodReo = AV20BarReoMin ;
            A130BarCodPar = AV21BarParMin ;
            /* Using cursor P03KB10 */
            pr_default.execute(6, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
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
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            /* End Insert */
            if ( ( AV33Kholer == 1 ) && ( AV34Xlformu == 1 ) )
            {
               /* Execute user subroutine: 'XLFORMU' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               System.out.println( httpContext.getMessage( "Ready LFORMU", "") );
               /* Execute user subroutine: 'LFORMU' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ( AV41Erfoc == 1 ) && ( GXutil.strcmp(AV42BarAcaqui, " ") != 0 ) && ( AV43Err_aq == 1 ) )
               {
                  AV24Linea = (short)(AV24Linea+10) ;
                  GXv_char4[0] = A396EmprCod ;
                  GXv_char3[0] = AV26TermiCod ;
                  GXv_int5[0] = AV27BarLinMaq ;
                  GXv_int6[0] = AV28BarMaqVol ;
                  GXv_int7[0] = AV19BarCodMin ;
                  GXv_int1[0] = AV20BarReoMin ;
                  GXv_char8[0] = AV21BarParMin ;
                  GXv_char9[0] = AV42BarAcaqui ;
                  GXv_char10[0] = AV29BarMaqCod ;
                  GXv_int11[0] = AV24Linea ;
                  GXv_int12[0] = AV44ProFoNPrg ;
                  GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_int14[0] = (short)(1) ;
                  GXv_decimal15[0] = AV46Kg ;
                  new app.paddprb(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_int6, GXv_int7, GXv_int1, GXv_char8, GXv_char9, GXv_char10, GXv_int11, GXv_int12, GXv_decimal13, GXv_int14, GXv_decimal15) ;
                  pprfhdrsm.this.A396EmprCod = GXv_char4[0] ;
                  pprfhdrsm.this.AV26TermiCod = GXv_char3[0] ;
                  pprfhdrsm.this.AV27BarLinMaq = GXv_int5[0] ;
                  pprfhdrsm.this.AV28BarMaqVol = GXv_int6[0] ;
                  pprfhdrsm.this.AV19BarCodMin = GXv_int7[0] ;
                  pprfhdrsm.this.AV20BarReoMin = GXv_int1[0] ;
                  pprfhdrsm.this.AV21BarParMin = GXv_char8[0] ;
                  pprfhdrsm.this.AV42BarAcaqui = GXv_char9[0] ;
                  pprfhdrsm.this.AV29BarMaqCod = GXv_char10[0] ;
                  pprfhdrsm.this.AV24Linea = GXv_int11[0] ;
                  pprfhdrsm.this.AV44ProFoNPrg = GXv_int12[0] ;
                  pprfhdrsm.this.AV46Kg = GXv_decimal15[0] ;
               }
            }
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         n1256BarPrfULin = false ;
         /* Optimized UPDATE. */
         /* Using cursor P03KB11 */
         pr_default.execute(7, new Object[] {Boolean.valueOf(n1256BarPrfULin), Short.valueOf(AV24Linea), AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
         /* End optimized UPDATE. */
         n2800BarPrfULi2 = false ;
         /* Optimized UPDATE. */
         /* Using cursor P03KB12 */
         pr_default.execute(8, new Object[] {Boolean.valueOf(n2800BarPrfULi2), Short.valueOf(AV24Linea), AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin, Short.valueOf(AV27BarLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LFORMU' Routine */
      returnInSub = false ;
      /* Using cursor P03KB13 */
      pr_default.execute(9, new Object[] {Integer.valueOf(AV31CliCod), AV32ArtCod, Integer.valueOf(AV36ForColNum), AV35ForColNom, Byte.valueOf(AV37TipColCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A831TipColCod = P03KB13_A831TipColCod[0] ;
         A482ForColNom = P03KB13_A482ForColNom[0] ;
         A483ForColNum = P03KB13_A483ForColNum[0] ;
         A494ForSer = P03KB13_A494ForSer[0] ;
         A252CliCod = P03KB13_A252CliCod[0] ;
         n252CliCod = P03KB13_n252CliCod[0] ;
         A764ProForCod = P03KB13_A764ProForCod[0] ;
         A7802ProFoNPrg = P03KB13_A7802ProFoNPrg[0] ;
         A8656ProForrbn = P03KB13_A8656ProForrbn[0] ;
         A10542ProForH2O = P03KB13_A10542ProForH2O[0] ;
         A1160ProForL = P03KB13_A1160ProForL[0] ;
         A396EmprCod = P03KB13_A396EmprCod[0] ;
         if ( ( AV25FlagJM == 1 ) && ( AV47BarSit > 4 ) )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         else
         {
            AV38ProForcod = A764ProForCod ;
            AV44ProFoNPrg = A7802ProFoNPrg ;
            AV24Linea = (short)(AV24Linea+10) ;
            GXv_char10[0] = A396EmprCod ;
            GXv_char9[0] = AV26TermiCod ;
            GXv_int14[0] = AV27BarLinMaq ;
            GXv_int12[0] = AV28BarMaqVol ;
            GXv_int7[0] = AV19BarCodMin ;
            GXv_int1[0] = AV20BarReoMin ;
            GXv_char8[0] = AV21BarParMin ;
            GXv_char4[0] = AV38ProForcod ;
            GXv_char3[0] = AV29BarMaqCod ;
            GXv_int11[0] = AV24Linea ;
            GXv_int6[0] = AV44ProFoNPrg ;
            GXv_decimal15[0] = A8656ProForrbn ;
            GXv_int5[0] = A10542ProForH2O ;
            GXv_decimal13[0] = AV46Kg ;
            new app.paddprb(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_int14, GXv_int12, GXv_int7, GXv_int1, GXv_char8, GXv_char4, GXv_char3, GXv_int11, GXv_int6, GXv_decimal15, GXv_int5, GXv_decimal13) ;
            pprfhdrsm.this.A396EmprCod = GXv_char10[0] ;
            pprfhdrsm.this.AV26TermiCod = GXv_char9[0] ;
            pprfhdrsm.this.AV27BarLinMaq = GXv_int14[0] ;
            pprfhdrsm.this.AV28BarMaqVol = GXv_int12[0] ;
            pprfhdrsm.this.AV19BarCodMin = GXv_int7[0] ;
            pprfhdrsm.this.AV20BarReoMin = GXv_int1[0] ;
            pprfhdrsm.this.AV21BarParMin = GXv_char8[0] ;
            pprfhdrsm.this.AV38ProForcod = GXv_char4[0] ;
            pprfhdrsm.this.AV29BarMaqCod = GXv_char3[0] ;
            pprfhdrsm.this.AV24Linea = GXv_int11[0] ;
            pprfhdrsm.this.AV44ProFoNPrg = GXv_int6[0] ;
            pprfhdrsm.this.A8656ProForrbn = GXv_decimal15[0] ;
            pprfhdrsm.this.A10542ProForH2O = GXv_int5[0] ;
            pprfhdrsm.this.AV46Kg = GXv_decimal13[0] ;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S121( )
   {
      /* 'PROFOC' Routine */
      returnInSub = false ;
      AV39PROFOQUC = " " ;
      /* Using cursor P03KB14 */
      pr_default.execute(10, new Object[] {AV15EmprCod, AV38ProForcod, AV29BarMaqCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A396EmprCod = P03KB14_A396EmprCod[0] ;
         A764ProForCod = P03KB14_A764ProForCod[0] ;
         A6229ProFoMaq = P03KB14_A6229ProFoMaq[0] ;
         n6229ProFoMaq = P03KB14_n6229ProFoMaq[0] ;
         A6286ProFoQuC = P03KB14_A6286ProFoQuC[0] ;
         n6286ProFoQuC = P03KB14_n6286ProFoQuC[0] ;
         A5191ProForLC = P03KB14_A5191ProForLC[0] ;
         AV39PROFOQUC = A6286ProFoQuC ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S131( )
   {
      /* 'FACABS' Routine */
      returnInSub = false ;
      AV30ArtFacAbs = DecimalUtil.ZERO ;
      /* Using cursor P03KB15 */
      pr_default.execute(11, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV32ArtCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A65ArtCod = P03KB15_A65ArtCod[0] ;
         A252CliCod = P03KB15_A252CliCod[0] ;
         n252CliCod = P03KB15_n252CliCod[0] ;
         A396EmprCod = P03KB15_A396EmprCod[0] ;
         A2791ArtFacAbs = P03KB15_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = P03KB15_n2791ArtFacAbs[0] ;
         A9801ArtFabsT = P03KB15_A9801ArtFabsT[0] ;
         n9801ArtFabsT = P03KB15_n9801ArtFabsT[0] ;
         AV30ArtFacAbs = A2791ArtFacAbs ;
         if ( A9801ArtFabsT.doubleValue() > 0 )
         {
            AV30ArtFacAbs = A9801ArtFabsT ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S141( )
   {
      /* 'XLFORMU' Routine */
      returnInSub = false ;
      /* Using cursor P03KB16 */
      pr_default.execute(12, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV32ArtCod, AV35ForColNom, Integer.valueOf(AV36ForColNum), Byte.valueOf(AV37TipColCod), Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A396EmprCod = P03KB16_A396EmprCod[0] ;
         A5571XCliCodf = P03KB16_A5571XCliCodf[0] ;
         A5572XForSer = P03KB16_A5572XForSer[0] ;
         A5573XForColNom = P03KB16_A5573XForColNom[0] ;
         A5574XForColNum = P03KB16_A5574XForColNum[0] ;
         A5575XTipColCod = P03KB16_A5575XTipColCod[0] ;
         A5579XBarCodf = P03KB16_A5579XBarCodf[0] ;
         A5580XCodReof = P03KB16_A5580XCodReof[0] ;
         A5581XCodParf = P03KB16_A5581XCodParf[0] ;
         A5576XProForCod = P03KB16_A5576XProForCod[0] ;
         n5576XProForCod = P03KB16_n5576XProForCod[0] ;
         A5578XProForLn = P03KB16_A5578XProForLn[0] ;
         AV24Linea = (short)(AV24Linea+10) ;
         GXv_char10[0] = A396EmprCod ;
         GXv_char9[0] = AV26TermiCod ;
         GXv_int14[0] = AV27BarLinMaq ;
         GXv_int12[0] = AV28BarMaqVol ;
         GXv_int7[0] = AV19BarCodMin ;
         GXv_int1[0] = AV20BarReoMin ;
         GXv_char8[0] = AV21BarParMin ;
         GXv_char4[0] = A5576XProForCod ;
         GXv_char3[0] = AV29BarMaqCod ;
         GXv_int11[0] = AV24Linea ;
         GXv_int6[0] = 0 ;
         GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int5[0] = (short)(1) ;
         GXv_decimal13[0] = AV46Kg ;
         new app.paddprb(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_int14, GXv_int12, GXv_int7, GXv_int1, GXv_char8, GXv_char4, GXv_char3, GXv_int11, GXv_int6, GXv_decimal15, GXv_int5, GXv_decimal13) ;
         pprfhdrsm.this.A396EmprCod = GXv_char10[0] ;
         pprfhdrsm.this.AV26TermiCod = GXv_char9[0] ;
         pprfhdrsm.this.AV27BarLinMaq = GXv_int14[0] ;
         pprfhdrsm.this.AV28BarMaqVol = GXv_int12[0] ;
         pprfhdrsm.this.AV19BarCodMin = GXv_int7[0] ;
         pprfhdrsm.this.AV20BarReoMin = GXv_int1[0] ;
         pprfhdrsm.this.AV21BarParMin = GXv_char8[0] ;
         pprfhdrsm.this.A5576XProForCod = GXv_char4[0] ;
         pprfhdrsm.this.AV29BarMaqCod = GXv_char3[0] ;
         pprfhdrsm.this.AV24Linea = GXv_int11[0] ;
         pprfhdrsm.this.AV46Kg = GXv_decimal13[0] ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprfhdrsm.this.AV15EmprCod;
      this.aP1[0] = pprfhdrsm.this.AV26TermiCod;
      this.aP2[0] = pprfhdrsm.this.AV16BarCod;
      this.aP3[0] = pprfhdrsm.this.AV17BarCodReo;
      this.aP4[0] = pprfhdrsm.this.AV18BarCodPar;
      this.aP5[0] = pprfhdrsm.this.AV19BarCodMin;
      this.aP6[0] = pprfhdrsm.this.AV20BarReoMin;
      this.aP7[0] = pprfhdrsm.this.AV21BarParMin;
      this.aP8[0] = pprfhdrsm.this.AV27BarLinMaq;
      this.aP9[0] = pprfhdrsm.this.AV28BarMaqVol;
      this.aP10[0] = pprfhdrsm.this.AV29BarMaqCod;
      this.aP11[0] = pprfhdrsm.this.AV45Barsalm;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprfhdrsm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42BarAcaqui = "" ;
      scmdbuf = "" ;
      P03KB2_A130BarCodPar = new String[] {""} ;
      P03KB2_A132BarCodReo = new byte[1] ;
      P03KB2_A129BarCod = new int[1] ;
      P03KB2_A396EmprCod = new String[] {""} ;
      P03KB2_A118BarAcaQui = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A118BarAcaQui = "" ;
      P03KB3_A2794BarLinMaq = new short[1] ;
      P03KB3_A130BarCodPar = new String[] {""} ;
      P03KB3_A132BarCodReo = new byte[1] ;
      P03KB3_A129BarCod = new int[1] ;
      P03KB3_A2792TermiCod = new String[] {""} ;
      P03KB3_A396EmprCod = new String[] {""} ;
      P03KB3_A207BarPrfCod = new String[] {""} ;
      P03KB3_n207BarPrfCod = new boolean[] {false} ;
      P03KB3_A1255BarPrfLin = new short[1] ;
      A2792TermiCod = "" ;
      A207BarPrfCod = "" ;
      P03KB4_A2795BarMaqPrf = new String[] {""} ;
      P03KB4_n2795BarMaqPrf = new boolean[] {false} ;
      P03KB4_A2796BarMaqVol = new int[1] ;
      P03KB4_n2796BarMaqVol = new boolean[] {false} ;
      P03KB4_A8935BarSalM = new String[] {""} ;
      P03KB4_n8935BarSalM = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      A8935BarSalM = "" ;
      P03KB8_A396EmprCod = new String[] {""} ;
      P03KB8_A130BarCodPar = new String[] {""} ;
      P03KB8_A132BarCodReo = new byte[1] ;
      P03KB8_A129BarCod = new int[1] ;
      P03KB8_A252CliCod = new int[1] ;
      P03KB8_n252CliCod = new boolean[] {false} ;
      P03KB8_A212BarSer = new String[] {""} ;
      P03KB8_A135BarColNom = new String[] {""} ;
      P03KB8_A136BarColNum = new int[1] ;
      P03KB8_A218BarTipCol = new byte[1] ;
      P03KB8_A213BarSit = new byte[1] ;
      P03KB8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03KB8_n166BarKgm = new boolean[] {false} ;
      P03KB8_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03KB8_n219BarTotAgr = new boolean[] {false} ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      W130BarCodPar = "" ;
      AV46Kg = DecimalUtil.ZERO ;
      AV32ArtCod = "" ;
      AV35ForColNom = "" ;
      A2797BarMaqFA = DecimalUtil.ZERO ;
      AV30ArtFacAbs = DecimalUtil.ZERO ;
      A5120BarMaqNpr = "" ;
      Gx_emsg = "" ;
      P03KB13_A831TipColCod = new byte[1] ;
      P03KB13_A482ForColNom = new String[] {""} ;
      P03KB13_A483ForColNum = new int[1] ;
      P03KB13_A494ForSer = new String[] {""} ;
      P03KB13_A252CliCod = new int[1] ;
      P03KB13_n252CliCod = new boolean[] {false} ;
      P03KB13_A764ProForCod = new String[] {""} ;
      P03KB13_A7802ProFoNPrg = new int[1] ;
      P03KB13_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03KB13_A10542ProForH2O = new short[1] ;
      P03KB13_A1160ProForL = new short[1] ;
      P03KB13_A396EmprCod = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A764ProForCod = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      AV38ProForcod = "" ;
      AV39PROFOQUC = "" ;
      P03KB14_A396EmprCod = new String[] {""} ;
      P03KB14_A764ProForCod = new String[] {""} ;
      P03KB14_A6229ProFoMaq = new String[] {""} ;
      P03KB14_n6229ProFoMaq = new boolean[] {false} ;
      P03KB14_A6286ProFoQuC = new String[] {""} ;
      P03KB14_n6286ProFoQuC = new boolean[] {false} ;
      P03KB14_A5191ProForLC = new short[1] ;
      A6229ProFoMaq = "" ;
      A6286ProFoQuC = "" ;
      P03KB15_A65ArtCod = new String[] {""} ;
      P03KB15_A252CliCod = new int[1] ;
      P03KB15_n252CliCod = new boolean[] {false} ;
      P03KB15_A396EmprCod = new String[] {""} ;
      P03KB15_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03KB15_n2791ArtFacAbs = new boolean[] {false} ;
      P03KB15_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03KB15_n9801ArtFabsT = new boolean[] {false} ;
      A65ArtCod = "" ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A9801ArtFabsT = DecimalUtil.ZERO ;
      P03KB16_A396EmprCod = new String[] {""} ;
      P03KB16_A5571XCliCodf = new int[1] ;
      P03KB16_A5572XForSer = new String[] {""} ;
      P03KB16_A5573XForColNom = new String[] {""} ;
      P03KB16_A5574XForColNum = new int[1] ;
      P03KB16_A5575XTipColCod = new byte[1] ;
      P03KB16_A5579XBarCodf = new int[1] ;
      P03KB16_A5580XCodReof = new byte[1] ;
      P03KB16_A5581XCodParf = new String[] {""} ;
      P03KB16_A5576XProForCod = new String[] {""} ;
      P03KB16_n5576XProForCod = new boolean[] {false} ;
      P03KB16_A5578XProForLn = new short[1] ;
      A5572XForSer = "" ;
      A5573XForColNom = "" ;
      A5581XCodParf = "" ;
      A5576XProForCod = "" ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int14 = new short[1] ;
      GXv_int12 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_int6 = new int[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int5 = new short[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprfhdrsm__default(),
         new Object[] {
             new Object[] {
            P03KB2_A130BarCodPar, P03KB2_A132BarCodReo, P03KB2_A129BarCod, P03KB2_A396EmprCod, P03KB2_A118BarAcaQui
            }
            , new Object[] {
            P03KB3_A2794BarLinMaq, P03KB3_A130BarCodPar, P03KB3_A132BarCodReo, P03KB3_A129BarCod, P03KB3_A2792TermiCod, P03KB3_A396EmprCod, P03KB3_A207BarPrfCod, P03KB3_n207BarPrfCod, P03KB3_A1255BarPrfLin
            }
            , new Object[] {
            P03KB4_A2795BarMaqPrf, P03KB4_n2795BarMaqPrf, P03KB4_A2796BarMaqVol, P03KB4_n2796BarMaqVol, P03KB4_A8935BarSalM, P03KB4_n8935BarSalM
            }
            , new Object[] {
            }
            , new Object[] {
            P03KB8_A396EmprCod, P03KB8_A130BarCodPar, P03KB8_A132BarCodReo, P03KB8_A129BarCod, P03KB8_A252CliCod, P03KB8_n252CliCod, P03KB8_A212BarSer, P03KB8_A135BarColNom, P03KB8_A136BarColNum, P03KB8_A218BarTipCol,
            P03KB8_A213BarSit, P03KB8_A166BarKgm, P03KB8_n166BarKgm, P03KB8_A219BarTotAgr, P03KB8_n219BarTotAgr
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03KB13_A831TipColCod, P03KB13_A482ForColNom, P03KB13_A483ForColNum, P03KB13_A494ForSer, P03KB13_A252CliCod, P03KB13_A764ProForCod, P03KB13_A7802ProFoNPrg, P03KB13_A8656ProForrbn, P03KB13_A10542ProForH2O, P03KB13_A1160ProForL,
            P03KB13_A396EmprCod
            }
            , new Object[] {
            P03KB14_A396EmprCod, P03KB14_A764ProForCod, P03KB14_A6229ProFoMaq, P03KB14_n6229ProFoMaq, P03KB14_A6286ProFoQuC, P03KB14_n6286ProFoQuC, P03KB14_A5191ProForLC
            }
            , new Object[] {
            P03KB15_A65ArtCod, P03KB15_A252CliCod, P03KB15_A396EmprCod, P03KB15_A2791ArtFacAbs, P03KB15_n2791ArtFacAbs, P03KB15_A9801ArtFabsT, P03KB15_n9801ArtFabsT
            }
            , new Object[] {
            P03KB16_A396EmprCod, P03KB16_A5571XCliCodf, P03KB16_A5572XForSer, P03KB16_A5573XForColNom, P03KB16_A5574XForColNum, P03KB16_A5575XTipColCod, P03KB16_A5579XBarCodf, P03KB16_A5580XCodReof, P03KB16_A5581XCodParf, P03KB16_A5576XProForCod,
            P03KB16_n5576XProForCod, P03KB16_A5578XProForLn
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV20BarReoMin ;
   private byte AV25FlagJM ;
   private byte AV33Kholer ;
   private byte AV40RiColTex ;
   private byte AV41Erfoc ;
   private byte GXt_int2 ;
   private byte AV23Flag ;
   private byte AV34Xlformu ;
   private byte A132BarCodReo ;
   private byte AV43Err_aq ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte W132BarCodReo ;
   private byte AV37TipColCod ;
   private byte AV47BarSit ;
   private byte A831TipColCod ;
   private byte A5575XTipColCod ;
   private byte A5580XCodReof ;
   private byte GXv_int1[] ;
   private short AV27BarLinMaq ;
   private short A2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short AV24Linea ;
   private short A5116BarMaqB12 ;
   private short A5117BarMaqB13 ;
   private short A5118BarMaqB14 ;
   private short A5119BarMaqB15 ;
   private short Gx_err ;
   private short A1256BarPrfULin ;
   private short A2800BarPrfULi2 ;
   private short A10542ProForH2O ;
   private short A1160ProForL ;
   private short A5191ProForLC ;
   private short A5578XProForLn ;
   private short GXv_int14[] ;
   private short GXv_int11[] ;
   private short GXv_int5[] ;
   private int AV16BarCod ;
   private int AV19BarCodMin ;
   private int AV28BarMaqVol ;
   private int A129BarCod ;
   private int A2796BarMaqVol ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int W129BarCod ;
   private int AV31CliCod ;
   private int AV36ForColNum ;
   private int GX_INS406 ;
   private int A5121BarMaqInt ;
   private int GX_INS405 ;
   private int AV44ProFoNPrg ;
   private int A483ForColNum ;
   private int A7802ProFoNPrg ;
   private int A5571XCliCodf ;
   private int A5574XForColNum ;
   private int A5579XBarCodf ;
   private int GXv_int12[] ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV46Kg ;
   private java.math.BigDecimal A2797BarMaqFA ;
   private java.math.BigDecimal AV30ArtFacAbs ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A9801ArtFabsT ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String AV15EmprCod ;
   private String AV26TermiCod ;
   private String AV18BarCodPar ;
   private String AV21BarParMin ;
   private String AV29BarMaqCod ;
   private String AV45Barsalm ;
   private String AV42BarAcaqui ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A118BarAcaQui ;
   private String A2792TermiCod ;
   private String A207BarPrfCod ;
   private String A2795BarMaqPrf ;
   private String A8935BarSalM ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String W130BarCodPar ;
   private String AV32ArtCod ;
   private String AV35ForColNom ;
   private String A5120BarMaqNpr ;
   private String Gx_emsg ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String AV38ProForcod ;
   private String AV39PROFOQUC ;
   private String A6229ProFoMaq ;
   private String A6286ProFoQuC ;
   private String A65ArtCod ;
   private String A5572XForSer ;
   private String A5573XForColNom ;
   private String A5581XCodParf ;
   private String A5576XProForCod ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean brk3KB3 ;
   private boolean n207BarPrfCod ;
   private boolean n2795BarMaqPrf ;
   private boolean n2796BarMaqVol ;
   private boolean n8935BarSalM ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean n219BarTotAgr ;
   private boolean returnInSub ;
   private boolean n2797BarMaqFA ;
   private boolean n5116BarMaqB12 ;
   private boolean n5117BarMaqB13 ;
   private boolean n5118BarMaqB14 ;
   private boolean n5119BarMaqB15 ;
   private boolean n5120BarMaqNpr ;
   private boolean n5121BarMaqInt ;
   private boolean n1256BarPrfULin ;
   private boolean n2800BarPrfULi2 ;
   private boolean n6229ProFoMaq ;
   private boolean n6286ProFoQuC ;
   private boolean n2791ArtFacAbs ;
   private boolean n9801ArtFabsT ;
   private boolean n5576XProForCod ;
   private String[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P03KB2_A130BarCodPar ;
   private byte[] P03KB2_A132BarCodReo ;
   private int[] P03KB2_A129BarCod ;
   private String[] P03KB2_A396EmprCod ;
   private String[] P03KB2_A118BarAcaQui ;
   private short[] P03KB3_A2794BarLinMaq ;
   private String[] P03KB3_A130BarCodPar ;
   private byte[] P03KB3_A132BarCodReo ;
   private int[] P03KB3_A129BarCod ;
   private String[] P03KB3_A2792TermiCod ;
   private String[] P03KB3_A396EmprCod ;
   private String[] P03KB3_A207BarPrfCod ;
   private boolean[] P03KB3_n207BarPrfCod ;
   private short[] P03KB3_A1255BarPrfLin ;
   private String[] P03KB4_A2795BarMaqPrf ;
   private boolean[] P03KB4_n2795BarMaqPrf ;
   private int[] P03KB4_A2796BarMaqVol ;
   private boolean[] P03KB4_n2796BarMaqVol ;
   private String[] P03KB4_A8935BarSalM ;
   private boolean[] P03KB4_n8935BarSalM ;
   private String[] P03KB8_A396EmprCod ;
   private String[] P03KB8_A130BarCodPar ;
   private byte[] P03KB8_A132BarCodReo ;
   private int[] P03KB8_A129BarCod ;
   private int[] P03KB8_A252CliCod ;
   private boolean[] P03KB8_n252CliCod ;
   private String[] P03KB8_A212BarSer ;
   private String[] P03KB8_A135BarColNom ;
   private int[] P03KB8_A136BarColNum ;
   private byte[] P03KB8_A218BarTipCol ;
   private byte[] P03KB8_A213BarSit ;
   private java.math.BigDecimal[] P03KB8_A166BarKgm ;
   private boolean[] P03KB8_n166BarKgm ;
   private java.math.BigDecimal[] P03KB8_A219BarTotAgr ;
   private boolean[] P03KB8_n219BarTotAgr ;
   private byte[] P03KB13_A831TipColCod ;
   private String[] P03KB13_A482ForColNom ;
   private int[] P03KB13_A483ForColNum ;
   private String[] P03KB13_A494ForSer ;
   private int[] P03KB13_A252CliCod ;
   private boolean[] P03KB13_n252CliCod ;
   private String[] P03KB13_A764ProForCod ;
   private int[] P03KB13_A7802ProFoNPrg ;
   private java.math.BigDecimal[] P03KB13_A8656ProForrbn ;
   private short[] P03KB13_A10542ProForH2O ;
   private short[] P03KB13_A1160ProForL ;
   private String[] P03KB13_A396EmprCod ;
   private String[] P03KB14_A396EmprCod ;
   private String[] P03KB14_A764ProForCod ;
   private String[] P03KB14_A6229ProFoMaq ;
   private boolean[] P03KB14_n6229ProFoMaq ;
   private String[] P03KB14_A6286ProFoQuC ;
   private boolean[] P03KB14_n6286ProFoQuC ;
   private short[] P03KB14_A5191ProForLC ;
   private String[] P03KB15_A65ArtCod ;
   private int[] P03KB15_A252CliCod ;
   private boolean[] P03KB15_n252CliCod ;
   private String[] P03KB15_A396EmprCod ;
   private java.math.BigDecimal[] P03KB15_A2791ArtFacAbs ;
   private boolean[] P03KB15_n2791ArtFacAbs ;
   private java.math.BigDecimal[] P03KB15_A9801ArtFabsT ;
   private boolean[] P03KB15_n9801ArtFabsT ;
   private String[] P03KB16_A396EmprCod ;
   private int[] P03KB16_A5571XCliCodf ;
   private String[] P03KB16_A5572XForSer ;
   private String[] P03KB16_A5573XForColNom ;
   private int[] P03KB16_A5574XForColNum ;
   private byte[] P03KB16_A5575XTipColCod ;
   private int[] P03KB16_A5579XBarCodf ;
   private byte[] P03KB16_A5580XCodReof ;
   private String[] P03KB16_A5581XCodParf ;
   private String[] P03KB16_A5576XProForCod ;
   private boolean[] P03KB16_n5576XProForCod ;
   private short[] P03KB16_A5578XProForLn ;
}

final  class pprfhdrsm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03KB2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAcaQui FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03KB3", "SELECT BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarPrfCod, BarPrfLin FROM TXPBARPR2 WHERE (EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?) AND (EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03KB4", "SELECT BarMaqPrf, BarMaqVol, BarSalM FROM TXPBARMAQ WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03KB5", "UPDATE TXPBARMAQ SET BarMaqPrf=?, BarMaqVol=?, BarSalM=?  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new ForEachCursor("P03KB8", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarSit, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03KB9", "INSERT INTO TXPBARMAQ(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf, BarMaqVol, BarMaqFA, BarMaqB12, BarMaqB13, BarMaqB14, BarMaqB15, BarMaqNpr, BarMaqInt, BarSalM, BarMaqVR, BarMaqRep, BarPrfULi2, BarMaqPr2, BarMaqPr3, BarMaqOrd, BarMaqFas, BarMaqNh, BarMaqVX, BarMaqBL, BarMaqFlow, BarMaqRPM, BarMaqMol, BarMaqTor, BarMaqCla, BarMaqTej, BarMaqDel, BarMaqPML, BarMaqObs, MSedo1, MSedo2, MSedo3, MSedo4, MSedo5, MSedo6, Msedo7, Msedo8, Msedo9, Msedo10, Msedo11) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P03KB10", "INSERT INTO TXPBARTER(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarULinMaq, BarPrfULin, BarMacPro1) VALUES(?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new UpdateCursor("P03KB11", "UPDATE TXPBARTER SET BarPrfULin=?  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new UpdateCursor("P03KB12", "UPDATE TXPBARMAQ SET BarPrfULi2=?  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new ForEachCursor("P03KB13", "SELECT TipColCod, ForColNom, ForColNum, ForSer, CliCod, ProForCod, ProFoNPrg, ProForrbn, ProForH2O, ProForL, EmprCod FROM TXPLFORMU WHERE (CliCod = ?) AND (ForSer = ?) AND (ForColNum = ?) AND (ForColNom = ?) AND (TipColCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03KB14", "SELECT EmprCod, ProForCod, ProFoMaq, ProFoQuC, ProForLC FROM TXPPROFOC WHERE EmprCod = ? and ProForCod = ? and ProFoMaq = ? ORDER BY EmprCod, ProForCod, ProFoMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03KB15", "SELECT ArtCod, CliCod, EmprCod, ArtFacAbs, ArtFabsT FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03KB16", "SELECT EmprCod, XCliCodf, XForSer, XForColNom, XForColNum, XTipColCod, XBarCodf, XCodReof, XCodParf, XProForCod, XProForLn FROM TXPXLFOR1 WHERE (EmprCod = ? and XCliCodf = ? and XForSer = ? and XForColNom = ? and XForColNum = ? and XTipColCod = ?) AND (XBarCodf = ?) AND (XCodReof = ?) AND (XCodParf = ?) ORDER BY EmprCod, XCliCodf, XForSer, XForColNom, XForColNum, XTipColCod, XProForLn, XBarCodf, XCodReof, XCodParf ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 10);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setShort(9, ((Number) parms[11]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
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
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[21], 6);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[25], 1);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
      }
   }

}

