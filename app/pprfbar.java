package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprfbar extends GXProcedure
{
   public pprfbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprfbar.class ), "" );
   }

   public pprfbar( int remoteHandle ,
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
                             int[] aP9 )
   {
      pprfbar.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
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
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
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
                             String[] aP10 )
   {
      pprfbar.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pprfbar.this.AV26TermiCod = aP1[0];
      this.aP1 = aP1;
      pprfbar.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pprfbar.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      pprfbar.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      pprfbar.this.AV19BarCodMin = aP5[0];
      this.aP5 = aP5;
      pprfbar.this.AV20BarReoMin = aP6[0];
      this.aP6 = aP6;
      pprfbar.this.AV21BarParMin = aP7[0];
      this.aP7 = aP7;
      pprfbar.this.AV27BarLinMaq = aP8[0];
      this.aP8 = aP8;
      pprfbar.this.AV28BarMaqVol = aP9[0];
      this.aP9 = aP9;
      pprfbar.this.AV29BarMaqCod = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV41Erfoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      pprfbar.this.GXt_int1 = GXv_int2[0] ;
      AV41Erfoc = GXt_int1 ;
      GXt_int1 = AV52Volppr ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VOLPPR", ""), GXv_int2) ;
      pprfbar.this.GXt_int1 = GXv_int2[0] ;
      AV52Volppr = GXt_int1 ;
      GXt_int3 = AV54ConversionLbvsKgs ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "LBVSKG", ""), GXv_int4) ;
      pprfbar.this.GXt_int3 = GXv_int4[0] ;
      AV54ConversionLbvsKgs = GXt_int3 ;
      AV55lbvsKgs = ((AV54ConversionLbvsKgs==0) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(AV54ConversionLbvsKgs/ (double) (100))) ;
      AV19BarCodMin = AV16BarCod ;
      AV20BarReoMin = AV17BarCodReo ;
      AV21BarParMin = AV18BarCodPar ;
      AV23Flag = (byte)(0) ;
      new app.pminagr(remoteHandle, context).execute( AV15EmprCod, AV19BarCodMin, AV20BarReoMin, AV21BarParMin) ;
      AV34Xlformu = (byte)(0) ;
      AV42BarAcaqui = " " ;
      /* Using cursor P00272 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00272_A130BarCodPar[0] ;
         A132BarCodReo = P00272_A132BarCodReo[0] ;
         A129BarCod = P00272_A129BarCod[0] ;
         A396EmprCod = P00272_A396EmprCod[0] ;
         A118BarAcaQui = P00272_A118BarAcaQui[0] ;
         AV42BarAcaqui = A118BarAcaQui ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char6[0] = A118BarAcaQui ;
         GXv_int2[0] = AV43Err_aq ;
         new app.pexiprq(remoteHandle, context).execute( GXv_char5, GXv_char6, GXv_int2) ;
         pprfbar.this.A396EmprCod = GXv_char5[0] ;
         pprfbar.this.A118BarAcaQui = GXv_char6[0] ;
         pprfbar.this.AV43Err_aq = GXv_int2[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Inicio Tabla Barpr2", "") );
      /* Using cursor P00273 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin, Short.valueOf(AV27BarLinMaq), AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin, Short.valueOf(AV27BarLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk273 = false ;
         A2794BarLinMaq = P00273_A2794BarLinMaq[0] ;
         A130BarCodPar = P00273_A130BarCodPar[0] ;
         A132BarCodReo = P00273_A132BarCodReo[0] ;
         A129BarCod = P00273_A129BarCod[0] ;
         A2792TermiCod = P00273_A2792TermiCod[0] ;
         A396EmprCod = P00273_A396EmprCod[0] ;
         A207BarPrfCod = P00273_A207BarPrfCod[0] ;
         n207BarPrfCod = P00273_n207BarPrfCod[0] ;
         A1255BarPrfLin = P00273_A1255BarPrfLin[0] ;
         /* Using cursor P00274 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
         A2795BarMaqPrf = P00274_A2795BarMaqPrf[0] ;
         n2795BarMaqPrf = P00274_n2795BarMaqPrf[0] ;
         A2796BarMaqVol = P00274_A2796BarMaqVol[0] ;
         n2796BarMaqVol = P00274_n2796BarMaqVol[0] ;
         A8935BarSalM = P00274_A8935BarSalM[0] ;
         n8935BarSalM = P00274_n8935BarSalM[0] ;
         A2795BarMaqPrf = AV29BarMaqCod ;
         n2795BarMaqPrf = false ;
         A2796BarMaqVol = AV28BarMaqVol ;
         n2796BarMaqVol = false ;
         A8935BarSalM = httpContext.getMessage( "N", "") ;
         n8935BarSalM = false ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P00273_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P00273_A2792TermiCod[0], A2792TermiCod) == 0 ) && ( P00273_A129BarCod[0] == A129BarCod ) && ( P00273_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P00273_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( P00273_A2794BarLinMaq[0] == A2794BarLinMaq ) && ( P00273_A1255BarPrfLin[0] == A1255BarPrfLin ) ) )
            {
               if (true) break;
            }
            brk273 = false ;
            A207BarPrfCod = P00273_A207BarPrfCod[0] ;
            n207BarPrfCod = P00273_n207BarPrfCod[0] ;
            AV23Flag = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            brk273 = true ;
            pr_default.readNext(1);
         }
         /* Using cursor P00275 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n2795BarMaqPrf), A2795BarMaqPrf, Boolean.valueOf(n2796BarMaqVol), Integer.valueOf(A2796BarMaqVol), Boolean.valueOf(n8935BarSalM), A8935BarSalM, A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
         if ( ! brk273 )
         {
            brk273 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      pr_default.close(2);
      System.out.println( httpContext.getMessage( "Fin Tabla Barpr2", "") );
      if ( AV23Flag == 0 )
      {
         /* Using cursor P00278 */
         pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A396EmprCod = P00278_A396EmprCod[0] ;
            A130BarCodPar = P00278_A130BarCodPar[0] ;
            A132BarCodReo = P00278_A132BarCodReo[0] ;
            A129BarCod = P00278_A129BarCod[0] ;
            A252CliCod = P00278_A252CliCod[0] ;
            n252CliCod = P00278_n252CliCod[0] ;
            A212BarSer = P00278_A212BarSer[0] ;
            A135BarColNom = P00278_A135BarColNom[0] ;
            A136BarColNum = P00278_A136BarColNum[0] ;
            A218BarTipCol = P00278_A218BarTipCol[0] ;
            A213BarSit = P00278_A213BarSit[0] ;
            A166BarKgm = P00278_A166BarKgm[0] ;
            n166BarKgm = P00278_n166BarKgm[0] ;
            A219BarTotAgr = P00278_A219BarTotAgr[0] ;
            n219BarTotAgr = P00278_n219BarTotAgr[0] ;
            A219BarTotAgr = P00278_A219BarTotAgr[0] ;
            n219BarTotAgr = P00278_n219BarTotAgr[0] ;
            A166BarKgm = P00278_A166BarKgm[0] ;
            n166BarKgm = P00278_n166BarKgm[0] ;
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
            AV53Kg = (A812RecTotKgm.divide(AV55lbvsKgs, 18, java.math.RoundingMode.DOWN)) ;
            AV31CliCod = A252CliCod ;
            AV32ArtCod = A212BarSer ;
            AV35ForColNom = A135BarColNom ;
            AV36ForColNum = A136BarColNum ;
            AV37TipColCod = A218BarTipCol ;
            /* Execute user subroutine: 'FACABS' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
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
            A8935BarSalM = httpContext.getMessage( "N", "") ;
            n8935BarSalM = false ;
            /* Using cursor P00279 */
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
            /* Using cursor P002710 */
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
            AV46BarSer = A212BarSer ;
            AV47BarColNum = A136BarColNum ;
            AV49BarTipCol = A218BarTipCol ;
            AV48BarColNom = A135BarColNom ;
            AV51Barsit = A213BarSit ;
            /* Execute user subroutine: 'FORMULA' */
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
               GXv_char6[0] = A396EmprCod ;
               GXv_char5[0] = AV26TermiCod ;
               GXv_int7[0] = AV27BarLinMaq ;
               GXv_int4[0] = AV28BarMaqVol ;
               GXv_int8[0] = AV19BarCodMin ;
               GXv_int2[0] = AV20BarReoMin ;
               GXv_char9[0] = AV21BarParMin ;
               GXv_char10[0] = AV42BarAcaqui ;
               GXv_char11[0] = AV29BarMaqCod ;
               GXv_int12[0] = AV24Linea ;
               GXv_int13[0] = AV44ProFoNPrg ;
               GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int15[0] = (short)(1) ;
               GXv_decimal16[0] = AV53Kg ;
               new app.paddprb(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int7, GXv_int4, GXv_int8, GXv_int2, GXv_char9, GXv_char10, GXv_char11, GXv_int12, GXv_int13, GXv_decimal14, GXv_int15, GXv_decimal16) ;
               pprfbar.this.A396EmprCod = GXv_char6[0] ;
               pprfbar.this.AV26TermiCod = GXv_char5[0] ;
               pprfbar.this.AV27BarLinMaq = GXv_int7[0] ;
               pprfbar.this.AV28BarMaqVol = GXv_int4[0] ;
               pprfbar.this.AV19BarCodMin = GXv_int8[0] ;
               pprfbar.this.AV20BarReoMin = GXv_int2[0] ;
               pprfbar.this.AV21BarParMin = GXv_char9[0] ;
               pprfbar.this.AV42BarAcaqui = GXv_char10[0] ;
               pprfbar.this.AV29BarMaqCod = GXv_char11[0] ;
               pprfbar.this.AV24Linea = GXv_int12[0] ;
               pprfbar.this.AV44ProFoNPrg = GXv_int13[0] ;
               pprfbar.this.AV53Kg = GXv_decimal16[0] ;
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
         /* Using cursor P002711 */
         pr_default.execute(7, new Object[] {Boolean.valueOf(n1256BarPrfULin), Short.valueOf(AV24Linea), AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
         /* End optimized UPDATE. */
         n2800BarPrfULi2 = false ;
         /* Optimized UPDATE. */
         /* Using cursor P002712 */
         pr_default.execute(8, new Object[] {Boolean.valueOf(n2800BarPrfULi2), Short.valueOf(AV24Linea), AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin, Short.valueOf(AV27BarLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
         /* End optimized UPDATE. */
      }
      System.out.println( httpContext.getMessage( "Fin PPRFBAR", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'FORMULA' Routine */
      returnInSub = false ;
      /* Using cursor P002713 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV46BarSer, AV48BarColNom, Integer.valueOf(AV47BarColNum), Byte.valueOf(AV49BarTipCol)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A831TipColCod = P002713_A831TipColCod[0] ;
         A483ForColNum = P002713_A483ForColNum[0] ;
         A482ForColNom = P002713_A482ForColNom[0] ;
         A494ForSer = P002713_A494ForSer[0] ;
         A252CliCod = P002713_A252CliCod[0] ;
         n252CliCod = P002713_n252CliCod[0] ;
         A396EmprCod = P002713_A396EmprCod[0] ;
         A764ProForCod = P002713_A764ProForCod[0] ;
         A7802ProFoNPrg = P002713_A7802ProFoNPrg[0] ;
         A8656ProForrbn = P002713_A8656ProForrbn[0] ;
         A10542ProForH2O = P002713_A10542ProForH2O[0] ;
         A1160ProForL = P002713_A1160ProForL[0] ;
         AV38ProForcod = A764ProForCod ;
         AV44ProFoNPrg = A7802ProFoNPrg ;
         AV24Linea = (short)(AV24Linea+10) ;
         GXv_char11[0] = A396EmprCod ;
         GXv_char10[0] = AV26TermiCod ;
         GXv_int15[0] = AV27BarLinMaq ;
         GXv_int13[0] = AV28BarMaqVol ;
         GXv_int8[0] = AV19BarCodMin ;
         GXv_int2[0] = AV20BarReoMin ;
         GXv_char9[0] = AV21BarParMin ;
         GXv_char6[0] = AV38ProForcod ;
         GXv_char5[0] = AV29BarMaqCod ;
         GXv_int12[0] = AV24Linea ;
         GXv_int4[0] = AV44ProFoNPrg ;
         GXv_decimal16[0] = A8656ProForrbn ;
         GXv_int7[0] = A10542ProForH2O ;
         GXv_decimal14[0] = AV53Kg ;
         new app.paddprb(remoteHandle, context).execute( GXv_char11, GXv_char10, GXv_int15, GXv_int13, GXv_int8, GXv_int2, GXv_char9, GXv_char6, GXv_char5, GXv_int12, GXv_int4, GXv_decimal16, GXv_int7, GXv_decimal14) ;
         pprfbar.this.A396EmprCod = GXv_char11[0] ;
         pprfbar.this.AV26TermiCod = GXv_char10[0] ;
         pprfbar.this.AV27BarLinMaq = GXv_int15[0] ;
         pprfbar.this.AV28BarMaqVol = GXv_int13[0] ;
         pprfbar.this.AV19BarCodMin = GXv_int8[0] ;
         pprfbar.this.AV20BarReoMin = GXv_int2[0] ;
         pprfbar.this.AV21BarParMin = GXv_char9[0] ;
         pprfbar.this.AV38ProForcod = GXv_char6[0] ;
         pprfbar.this.AV29BarMaqCod = GXv_char5[0] ;
         pprfbar.this.AV24Linea = GXv_int12[0] ;
         pprfbar.this.AV44ProFoNPrg = GXv_int4[0] ;
         pprfbar.this.A8656ProForrbn = GXv_decimal16[0] ;
         pprfbar.this.A10542ProForH2O = GXv_int7[0] ;
         pprfbar.this.AV53Kg = GXv_decimal14[0] ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S121( )
   {
      /* 'FACABS' Routine */
      returnInSub = false ;
      AV30ArtFacAbs = DecimalUtil.ZERO ;
      /* Using cursor P002714 */
      pr_default.execute(10, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV32ArtCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A65ArtCod = P002714_A65ArtCod[0] ;
         A252CliCod = P002714_A252CliCod[0] ;
         n252CliCod = P002714_n252CliCod[0] ;
         A396EmprCod = P002714_A396EmprCod[0] ;
         A2791ArtFacAbs = P002714_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = P002714_n2791ArtFacAbs[0] ;
         A9801ArtFabsT = P002714_A9801ArtFabsT[0] ;
         n9801ArtFabsT = P002714_n9801ArtFabsT[0] ;
         AV30ArtFacAbs = A2791ArtFacAbs ;
         if ( ( A9801ArtFabsT.doubleValue() > 0 ) && ( A2791ArtFacAbs.doubleValue() == 0 ) )
         {
            AV30ArtFacAbs = A9801ArtFabsT ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprfbar.this.AV15EmprCod;
      this.aP1[0] = pprfbar.this.AV26TermiCod;
      this.aP2[0] = pprfbar.this.AV16BarCod;
      this.aP3[0] = pprfbar.this.AV17BarCodReo;
      this.aP4[0] = pprfbar.this.AV18BarCodPar;
      this.aP5[0] = pprfbar.this.AV19BarCodMin;
      this.aP6[0] = pprfbar.this.AV20BarReoMin;
      this.aP7[0] = pprfbar.this.AV21BarParMin;
      this.aP8[0] = pprfbar.this.AV27BarLinMaq;
      this.aP9[0] = pprfbar.this.AV28BarMaqVol;
      this.aP10[0] = pprfbar.this.AV29BarMaqCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprfbar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV55lbvsKgs = DecimalUtil.ZERO ;
      AV42BarAcaqui = "" ;
      scmdbuf = "" ;
      P00272_A130BarCodPar = new String[] {""} ;
      P00272_A132BarCodReo = new byte[1] ;
      P00272_A129BarCod = new int[1] ;
      P00272_A396EmprCod = new String[] {""} ;
      P00272_A118BarAcaQui = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A118BarAcaQui = "" ;
      P00273_A2794BarLinMaq = new short[1] ;
      P00273_A130BarCodPar = new String[] {""} ;
      P00273_A132BarCodReo = new byte[1] ;
      P00273_A129BarCod = new int[1] ;
      P00273_A2792TermiCod = new String[] {""} ;
      P00273_A396EmprCod = new String[] {""} ;
      P00273_A207BarPrfCod = new String[] {""} ;
      P00273_n207BarPrfCod = new boolean[] {false} ;
      P00273_A1255BarPrfLin = new short[1] ;
      A2792TermiCod = "" ;
      A207BarPrfCod = "" ;
      P00274_A2795BarMaqPrf = new String[] {""} ;
      P00274_n2795BarMaqPrf = new boolean[] {false} ;
      P00274_A2796BarMaqVol = new int[1] ;
      P00274_n2796BarMaqVol = new boolean[] {false} ;
      P00274_A8935BarSalM = new String[] {""} ;
      P00274_n8935BarSalM = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      A8935BarSalM = "" ;
      P00278_A396EmprCod = new String[] {""} ;
      P00278_A130BarCodPar = new String[] {""} ;
      P00278_A132BarCodReo = new byte[1] ;
      P00278_A129BarCod = new int[1] ;
      P00278_A252CliCod = new int[1] ;
      P00278_n252CliCod = new boolean[] {false} ;
      P00278_A212BarSer = new String[] {""} ;
      P00278_A135BarColNom = new String[] {""} ;
      P00278_A136BarColNum = new int[1] ;
      P00278_A218BarTipCol = new byte[1] ;
      P00278_A213BarSit = new byte[1] ;
      P00278_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00278_n166BarKgm = new boolean[] {false} ;
      P00278_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00278_n219BarTotAgr = new boolean[] {false} ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      W130BarCodPar = "" ;
      AV53Kg = DecimalUtil.ZERO ;
      AV32ArtCod = "" ;
      AV35ForColNom = "" ;
      A2797BarMaqFA = DecimalUtil.ZERO ;
      AV30ArtFacAbs = DecimalUtil.ZERO ;
      A5120BarMaqNpr = "" ;
      Gx_emsg = "" ;
      AV46BarSer = "" ;
      AV48BarColNom = "" ;
      P002713_A831TipColCod = new byte[1] ;
      P002713_A483ForColNum = new int[1] ;
      P002713_A482ForColNom = new String[] {""} ;
      P002713_A494ForSer = new String[] {""} ;
      P002713_A252CliCod = new int[1] ;
      P002713_n252CliCod = new boolean[] {false} ;
      P002713_A396EmprCod = new String[] {""} ;
      P002713_A764ProForCod = new String[] {""} ;
      P002713_A7802ProFoNPrg = new int[1] ;
      P002713_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002713_A10542ProForH2O = new short[1] ;
      P002713_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A764ProForCod = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      AV38ProForcod = "" ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_int13 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_int4 = new int[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int7 = new short[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      P002714_A65ArtCod = new String[] {""} ;
      P002714_A252CliCod = new int[1] ;
      P002714_n252CliCod = new boolean[] {false} ;
      P002714_A396EmprCod = new String[] {""} ;
      P002714_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002714_n2791ArtFacAbs = new boolean[] {false} ;
      P002714_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002714_n9801ArtFabsT = new boolean[] {false} ;
      A65ArtCod = "" ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A9801ArtFabsT = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprfbar__default(),
         new Object[] {
             new Object[] {
            P00272_A130BarCodPar, P00272_A132BarCodReo, P00272_A129BarCod, P00272_A396EmprCod, P00272_A118BarAcaQui
            }
            , new Object[] {
            P00273_A2794BarLinMaq, P00273_A130BarCodPar, P00273_A132BarCodReo, P00273_A129BarCod, P00273_A2792TermiCod, P00273_A396EmprCod, P00273_A207BarPrfCod, P00273_n207BarPrfCod, P00273_A1255BarPrfLin
            }
            , new Object[] {
            P00274_A2795BarMaqPrf, P00274_n2795BarMaqPrf, P00274_A2796BarMaqVol, P00274_n2796BarMaqVol, P00274_A8935BarSalM, P00274_n8935BarSalM
            }
            , new Object[] {
            }
            , new Object[] {
            P00278_A396EmprCod, P00278_A130BarCodPar, P00278_A132BarCodReo, P00278_A129BarCod, P00278_A252CliCod, P00278_n252CliCod, P00278_A212BarSer, P00278_A135BarColNom, P00278_A136BarColNum, P00278_A218BarTipCol,
            P00278_A213BarSit, P00278_A166BarKgm, P00278_n166BarKgm, P00278_A219BarTotAgr, P00278_n219BarTotAgr
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
            P002713_A831TipColCod, P002713_A483ForColNum, P002713_A482ForColNom, P002713_A494ForSer, P002713_A252CliCod, P002713_A396EmprCod, P002713_A764ProForCod, P002713_A7802ProFoNPrg, P002713_A8656ProForrbn, P002713_A10542ProForH2O,
            P002713_A1160ProForL
            }
            , new Object[] {
            P002714_A65ArtCod, P002714_A252CliCod, P002714_A396EmprCod, P002714_A2791ArtFacAbs, P002714_n2791ArtFacAbs, P002714_A9801ArtFabsT, P002714_n9801ArtFabsT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV20BarReoMin ;
   private byte AV41Erfoc ;
   private byte AV52Volppr ;
   private byte GXt_int1 ;
   private byte AV23Flag ;
   private byte AV34Xlformu ;
   private byte A132BarCodReo ;
   private byte AV43Err_aq ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte W132BarCodReo ;
   private byte AV37TipColCod ;
   private byte AV49BarTipCol ;
   private byte AV51Barsit ;
   private byte A831TipColCod ;
   private byte GXv_int2[] ;
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
   private short GXv_int15[] ;
   private short GXv_int12[] ;
   private short GXv_int7[] ;
   private int AV16BarCod ;
   private int AV19BarCodMin ;
   private int AV28BarMaqVol ;
   private int AV54ConversionLbvsKgs ;
   private int GXt_int3 ;
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
   private int AV47BarColNum ;
   private int AV44ProFoNPrg ;
   private int A483ForColNum ;
   private int A7802ProFoNPrg ;
   private int GXv_int13[] ;
   private int GXv_int8[] ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV55lbvsKgs ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV53Kg ;
   private java.math.BigDecimal A2797BarMaqFA ;
   private java.math.BigDecimal AV30ArtFacAbs ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A9801ArtFabsT ;
   private String AV15EmprCod ;
   private String AV26TermiCod ;
   private String AV18BarCodPar ;
   private String AV21BarParMin ;
   private String AV29BarMaqCod ;
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
   private String AV46BarSer ;
   private String AV48BarColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String AV38ProForcod ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String A65ArtCod ;
   private boolean brk273 ;
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
   private boolean n2791ArtFacAbs ;
   private boolean n9801ArtFabsT ;
   private String[] aP10 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P00272_A130BarCodPar ;
   private byte[] P00272_A132BarCodReo ;
   private int[] P00272_A129BarCod ;
   private String[] P00272_A396EmprCod ;
   private String[] P00272_A118BarAcaQui ;
   private short[] P00273_A2794BarLinMaq ;
   private String[] P00273_A130BarCodPar ;
   private byte[] P00273_A132BarCodReo ;
   private int[] P00273_A129BarCod ;
   private String[] P00273_A2792TermiCod ;
   private String[] P00273_A396EmprCod ;
   private String[] P00273_A207BarPrfCod ;
   private boolean[] P00273_n207BarPrfCod ;
   private short[] P00273_A1255BarPrfLin ;
   private String[] P00274_A2795BarMaqPrf ;
   private boolean[] P00274_n2795BarMaqPrf ;
   private int[] P00274_A2796BarMaqVol ;
   private boolean[] P00274_n2796BarMaqVol ;
   private String[] P00274_A8935BarSalM ;
   private boolean[] P00274_n8935BarSalM ;
   private String[] P00278_A396EmprCod ;
   private String[] P00278_A130BarCodPar ;
   private byte[] P00278_A132BarCodReo ;
   private int[] P00278_A129BarCod ;
   private int[] P00278_A252CliCod ;
   private boolean[] P00278_n252CliCod ;
   private String[] P00278_A212BarSer ;
   private String[] P00278_A135BarColNom ;
   private int[] P00278_A136BarColNum ;
   private byte[] P00278_A218BarTipCol ;
   private byte[] P00278_A213BarSit ;
   private java.math.BigDecimal[] P00278_A166BarKgm ;
   private boolean[] P00278_n166BarKgm ;
   private java.math.BigDecimal[] P00278_A219BarTotAgr ;
   private boolean[] P00278_n219BarTotAgr ;
   private byte[] P002713_A831TipColCod ;
   private int[] P002713_A483ForColNum ;
   private String[] P002713_A482ForColNom ;
   private String[] P002713_A494ForSer ;
   private int[] P002713_A252CliCod ;
   private boolean[] P002713_n252CliCod ;
   private String[] P002713_A396EmprCod ;
   private String[] P002713_A764ProForCod ;
   private int[] P002713_A7802ProFoNPrg ;
   private java.math.BigDecimal[] P002713_A8656ProForrbn ;
   private short[] P002713_A10542ProForH2O ;
   private short[] P002713_A1160ProForL ;
   private String[] P002714_A65ArtCod ;
   private int[] P002714_A252CliCod ;
   private boolean[] P002714_n252CliCod ;
   private String[] P002714_A396EmprCod ;
   private java.math.BigDecimal[] P002714_A2791ArtFacAbs ;
   private boolean[] P002714_n2791ArtFacAbs ;
   private java.math.BigDecimal[] P002714_A9801ArtFabsT ;
   private boolean[] P002714_n9801ArtFabsT ;
}

final  class pprfbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00272", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAcaQui FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00273", "SELECT BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarPrfCod, BarPrfLin FROM TXPBARPR2 WHERE (EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?) AND (EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00274", "SELECT BarMaqPrf, BarMaqVol, BarSalM FROM TXPBARMAQ WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00275", "UPDATE TXPBARMAQ SET BarMaqPrf=?, BarMaqVol=?, BarSalM=?  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new ForEachCursor("P00278", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarSit, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00279", "INSERT INTO TXPBARMAQ(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf, BarMaqVol, BarMaqFA, BarMaqB12, BarMaqB13, BarMaqB14, BarMaqB15, BarMaqNpr, BarMaqInt, BarSalM, BarMaqVR, BarMaqRep, BarPrfULi2, BarMaqPr2, BarMaqPr3, BarMaqOrd, BarMaqFas, BarMaqNh, BarMaqVX, BarMaqBL, BarMaqFlow, BarMaqRPM, BarMaqMol, BarMaqTor, BarMaqCla, BarMaqTej, BarMaqDel, BarMaqPML, BarMaqObs, MSedo1, MSedo2, MSedo3, MSedo4, MSedo5, MSedo6, Msedo7, Msedo8, Msedo9, Msedo10, Msedo11) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P002710", "INSERT INTO TXPBARTER(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarULinMaq, BarPrfULin, BarMacPro1) VALUES(?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new UpdateCursor("P002711", "UPDATE TXPBARTER SET BarPrfULin=?  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new UpdateCursor("P002712", "UPDATE TXPBARMAQ SET BarPrfULi2=?  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new ForEachCursor("P002713", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProForCod, ProFoNPrg, ProForrbn, ProForH2O, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002714", "SELECT ArtCod, CliCod, EmprCod, ArtFacAbs, ArtFabsT FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

