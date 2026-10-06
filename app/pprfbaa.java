package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprfbaa extends GXProcedure
{
   public pprfbaa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprfbaa.class ), "" );
   }

   public pprfbaa( int remoteHandle ,
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
      pprfbaa.this.aP11 = new String[] {""};
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
      pprfbaa.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pprfbaa.this.AV26TermiCod = aP1[0];
      this.aP1 = aP1;
      pprfbaa.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pprfbaa.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      pprfbaa.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      pprfbaa.this.AV19BarCodMin = aP5[0];
      this.aP5 = aP5;
      pprfbaa.this.AV20BarReoMin = aP6[0];
      this.aP6 = aP6;
      pprfbaa.this.AV21BarParMin = aP7[0];
      this.aP7 = aP7;
      pprfbaa.this.AV27BarLinMaq = aP8[0];
      this.aP8 = aP8;
      pprfbaa.this.AV28BarMaqVol = aP9[0];
      this.aP9 = aP9;
      pprfbaa.this.AV29BarMaqCod = aP10[0];
      this.aP10 = aP10;
      pprfbaa.this.AV30Tipo = aP11[0];
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
      pprfbaa.this.AV25FlagJM = GXv_int1[0] ;
      AV19BarCodMin = AV16BarCod ;
      AV20BarReoMin = AV17BarCodReo ;
      AV21BarParMin = AV18BarCodPar ;
      AV23Flag = (byte)(0) ;
      new app.pminagr(remoteHandle, context).execute( AV15EmprCod, AV19BarCodMin, AV20BarReoMin, AV21BarParMin) ;
      /* Using cursor P018I2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin, Short.valueOf(AV27BarLinMaq), AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin, Short.valueOf(AV27BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk18I2 = false ;
         A2794BarLinMaq = P018I2_A2794BarLinMaq[0] ;
         A130BarCodPar = P018I2_A130BarCodPar[0] ;
         n130BarCodPar = P018I2_n130BarCodPar[0] ;
         A132BarCodReo = P018I2_A132BarCodReo[0] ;
         n132BarCodReo = P018I2_n132BarCodReo[0] ;
         A129BarCod = P018I2_A129BarCod[0] ;
         n129BarCod = P018I2_n129BarCod[0] ;
         A2792TermiCod = P018I2_A2792TermiCod[0] ;
         A396EmprCod = P018I2_A396EmprCod[0] ;
         A207BarPrfCod = P018I2_A207BarPrfCod[0] ;
         n207BarPrfCod = P018I2_n207BarPrfCod[0] ;
         A1255BarPrfLin = P018I2_A1255BarPrfLin[0] ;
         /* Using cursor P018I3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A2792TermiCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
         A2795BarMaqPrf = P018I3_A2795BarMaqPrf[0] ;
         n2795BarMaqPrf = P018I3_n2795BarMaqPrf[0] ;
         A2796BarMaqVol = P018I3_A2796BarMaqVol[0] ;
         n2796BarMaqVol = P018I3_n2796BarMaqVol[0] ;
         A2795BarMaqPrf = AV29BarMaqCod ;
         n2795BarMaqPrf = false ;
         A2796BarMaqVol = AV28BarMaqVol ;
         n2796BarMaqVol = false ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P018I2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P018I2_A2792TermiCod[0], A2792TermiCod) == 0 ) && ( P018I2_A129BarCod[0] == A129BarCod ) && ( P018I2_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P018I2_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( P018I2_A2794BarLinMaq[0] == A2794BarLinMaq ) && ( P018I2_A1255BarPrfLin[0] == A1255BarPrfLin ) ) )
            {
               if (true) break;
            }
            brk18I2 = false ;
            A207BarPrfCod = P018I2_A207BarPrfCod[0] ;
            n207BarPrfCod = P018I2_n207BarPrfCod[0] ;
            AV23Flag = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            brk18I2 = true ;
            pr_default.readNext(0);
         }
         /* Using cursor P018I4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n2795BarMaqPrf), A2795BarMaqPrf, Boolean.valueOf(n2796BarMaqVol), Integer.valueOf(A2796BarMaqVol), A396EmprCod, A2792TermiCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
         if ( ! brk18I2 )
         {
            brk18I2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      pr_default.close(1);
      if ( AV23Flag == 0 )
      {
         /* Using cursor P018I7 */
         pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A218BarTipCol = P018I7_A218BarTipCol[0] ;
            A135BarColNom = P018I7_A135BarColNom[0] ;
            A136BarColNum = P018I7_A136BarColNum[0] ;
            A212BarSer = P018I7_A212BarSer[0] ;
            A213BarSit = P018I7_A213BarSit[0] ;
            A252CliCod = P018I7_A252CliCod[0] ;
            n252CliCod = P018I7_n252CliCod[0] ;
            A396EmprCod = P018I7_A396EmprCod[0] ;
            A130BarCodPar = P018I7_A130BarCodPar[0] ;
            n130BarCodPar = P018I7_n130BarCodPar[0] ;
            A132BarCodReo = P018I7_A132BarCodReo[0] ;
            n132BarCodReo = P018I7_n132BarCodReo[0] ;
            A129BarCod = P018I7_A129BarCod[0] ;
            n129BarCod = P018I7_n129BarCod[0] ;
            A166BarKgm = P018I7_A166BarKgm[0] ;
            n166BarKgm = P018I7_n166BarKgm[0] ;
            A219BarTotAgr = P018I7_A219BarTotAgr[0] ;
            n219BarTotAgr = P018I7_n219BarTotAgr[0] ;
            A219BarTotAgr = P018I7_A219BarTotAgr[0] ;
            n219BarTotAgr = P018I7_n219BarTotAgr[0] ;
            A166BarKgm = P018I7_A166BarKgm[0] ;
            n166BarKgm = P018I7_n166BarKgm[0] ;
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            AV24Linea = (short)(0) ;
            AV34Kgm = A812RecTotKgm ;
            AV31CliCod = A252CliCod ;
            AV32ArtCod = A212BarSer ;
            /* Execute user subroutine: 'FACABS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /*
               INSERT RECORD ON TABLE TXPBARMAQ

            */
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            A2792TermiCod = AV26TermiCod ;
            A129BarCod = AV19BarCodMin ;
            n129BarCod = false ;
            A132BarCodReo = AV20BarReoMin ;
            n132BarCodReo = false ;
            A130BarCodPar = AV21BarParMin ;
            n130BarCodPar = false ;
            A2794BarLinMaq = AV27BarLinMaq ;
            A2796BarMaqVol = AV28BarMaqVol ;
            n2796BarMaqVol = false ;
            A2795BarMaqPrf = AV29BarMaqCod ;
            n2795BarMaqPrf = false ;
            A2797BarMaqFA = AV33ArtFacAbs ;
            n2797BarMaqFA = false ;
            /* Using cursor P018I8 */
            pr_default.execute(4, new Object[] {A396EmprCod, A2792TermiCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Boolean.valueOf(n2795BarMaqPrf), A2795BarMaqPrf, Boolean.valueOf(n2796BarMaqVol), Integer.valueOf(A2796BarMaqVol), Boolean.valueOf(n2797BarMaqFA), A2797BarMaqFA});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
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
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPBARTER

            */
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            A2792TermiCod = AV26TermiCod ;
            A129BarCod = AV19BarCodMin ;
            n129BarCod = false ;
            A132BarCodReo = AV20BarReoMin ;
            n132BarCodReo = false ;
            A130BarCodPar = AV21BarParMin ;
            n130BarCodPar = false ;
            /* Using cursor P018I9 */
            pr_default.execute(5, new Object[] {A396EmprCod, A2792TermiCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
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
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            /* End Insert */
            if ( GXutil.strcmp(AV30Tipo, httpContext.getMessage( "T", "")) == 0 )
            {
               /* Using cursor P018I10 */
               pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A212BarSer, Integer.valueOf(A136BarColNum), A135BarColNom, Byte.valueOf(A218BarTipCol)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A831TipColCod = P018I10_A831TipColCod[0] ;
                  A482ForColNom = P018I10_A482ForColNom[0] ;
                  A483ForColNum = P018I10_A483ForColNum[0] ;
                  A494ForSer = P018I10_A494ForSer[0] ;
                  A764ProForCod = P018I10_A764ProForCod[0] ;
                  A7802ProFoNPrg = P018I10_A7802ProFoNPrg[0] ;
                  A8656ProForrbn = P018I10_A8656ProForrbn[0] ;
                  A10542ProForH2O = P018I10_A10542ProForH2O[0] ;
                  A1160ProForL = P018I10_A1160ProForL[0] ;
                  if ( ( AV25FlagJM == 1 ) && ( A213BarSit > 4 ) )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  else
                  {
                     AV24Linea = (short)(AV24Linea+10) ;
                     GXv_char2[0] = A396EmprCod ;
                     GXv_char3[0] = AV26TermiCod ;
                     GXv_int4[0] = AV27BarLinMaq ;
                     GXv_int5[0] = AV28BarMaqVol ;
                     GXv_int6[0] = AV19BarCodMin ;
                     GXv_int1[0] = AV20BarReoMin ;
                     GXv_char7[0] = AV21BarParMin ;
                     GXv_char8[0] = A764ProForCod ;
                     GXv_char9[0] = AV29BarMaqCod ;
                     GXv_int10[0] = AV24Linea ;
                     GXv_int11[0] = A7802ProFoNPrg ;
                     GXv_decimal12[0] = A8656ProForrbn ;
                     GXv_int13[0] = A10542ProForH2O ;
                     GXv_decimal14[0] = AV34Kgm ;
                     new app.paddprb(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_int6, GXv_int1, GXv_char7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_decimal12, GXv_int13, GXv_decimal14) ;
                     pprfbaa.this.A396EmprCod = GXv_char2[0] ;
                     pprfbaa.this.AV26TermiCod = GXv_char3[0] ;
                     pprfbaa.this.AV27BarLinMaq = GXv_int4[0] ;
                     pprfbaa.this.AV28BarMaqVol = GXv_int5[0] ;
                     pprfbaa.this.AV19BarCodMin = GXv_int6[0] ;
                     pprfbaa.this.AV20BarReoMin = GXv_int1[0] ;
                     pprfbaa.this.AV21BarParMin = GXv_char7[0] ;
                     pprfbaa.this.A764ProForCod = GXv_char8[0] ;
                     pprfbaa.this.AV29BarMaqCod = GXv_char9[0] ;
                     pprfbaa.this.AV24Linea = GXv_int10[0] ;
                     pprfbaa.this.A7802ProFoNPrg = GXv_int11[0] ;
                     pprfbaa.this.A8656ProForrbn = GXv_decimal12[0] ;
                     pprfbaa.this.A10542ProForH2O = GXv_int13[0] ;
                     pprfbaa.this.AV34Kgm = GXv_decimal14[0] ;
                  }
                  pr_default.readNext(6);
               }
               pr_default.close(6);
            }
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         n1256BarPrfULin = false ;
         /* Optimized UPDATE. */
         /* Using cursor P018I11 */
         pr_default.execute(7, new Object[] {Boolean.valueOf(n1256BarPrfULin), Short.valueOf(AV24Linea), AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
         /* End optimized UPDATE. */
         if ( GXutil.strcmp(AV30Tipo, httpContext.getMessage( "T", "")) == 0 )
         {
            n2800BarPrfULi2 = false ;
            /* Optimized UPDATE. */
            /* Using cursor P018I12 */
            pr_default.execute(8, new Object[] {Boolean.valueOf(n2800BarPrfULi2), Short.valueOf(AV24Linea), AV15EmprCod, AV26TermiCod, Integer.valueOf(AV19BarCodMin), Byte.valueOf(AV20BarReoMin), AV21BarParMin, Short.valueOf(AV27BarLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
            /* End optimized UPDATE. */
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'FACABS' Routine */
      returnInSub = false ;
      AV33ArtFacAbs = DecimalUtil.ZERO ;
      /* Using cursor P018I13 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV31CliCod), AV32ArtCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A65ArtCod = P018I13_A65ArtCod[0] ;
         A252CliCod = P018I13_A252CliCod[0] ;
         n252CliCod = P018I13_n252CliCod[0] ;
         A396EmprCod = P018I13_A396EmprCod[0] ;
         A2791ArtFacAbs = P018I13_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = P018I13_n2791ArtFacAbs[0] ;
         AV33ArtFacAbs = A2791ArtFacAbs ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprfbaa.this.AV15EmprCod;
      this.aP1[0] = pprfbaa.this.AV26TermiCod;
      this.aP2[0] = pprfbaa.this.AV16BarCod;
      this.aP3[0] = pprfbaa.this.AV17BarCodReo;
      this.aP4[0] = pprfbaa.this.AV18BarCodPar;
      this.aP5[0] = pprfbaa.this.AV19BarCodMin;
      this.aP6[0] = pprfbaa.this.AV20BarReoMin;
      this.aP7[0] = pprfbaa.this.AV21BarParMin;
      this.aP8[0] = pprfbaa.this.AV27BarLinMaq;
      this.aP9[0] = pprfbaa.this.AV28BarMaqVol;
      this.aP10[0] = pprfbaa.this.AV29BarMaqCod;
      this.aP11[0] = pprfbaa.this.AV30Tipo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprfbaa");
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
      P018I2_A2794BarLinMaq = new short[1] ;
      P018I2_A130BarCodPar = new String[] {""} ;
      P018I2_n130BarCodPar = new boolean[] {false} ;
      P018I2_A132BarCodReo = new byte[1] ;
      P018I2_n132BarCodReo = new boolean[] {false} ;
      P018I2_A129BarCod = new int[1] ;
      P018I2_n129BarCod = new boolean[] {false} ;
      P018I2_A2792TermiCod = new String[] {""} ;
      P018I2_A396EmprCod = new String[] {""} ;
      P018I2_A207BarPrfCod = new String[] {""} ;
      P018I2_n207BarPrfCod = new boolean[] {false} ;
      P018I2_A1255BarPrfLin = new short[1] ;
      A130BarCodPar = "" ;
      A2792TermiCod = "" ;
      A396EmprCod = "" ;
      A207BarPrfCod = "" ;
      P018I3_A2795BarMaqPrf = new String[] {""} ;
      P018I3_n2795BarMaqPrf = new boolean[] {false} ;
      P018I3_A2796BarMaqVol = new int[1] ;
      P018I3_n2796BarMaqVol = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      P018I7_A218BarTipCol = new byte[1] ;
      P018I7_A135BarColNom = new String[] {""} ;
      P018I7_A136BarColNum = new int[1] ;
      P018I7_A212BarSer = new String[] {""} ;
      P018I7_A213BarSit = new byte[1] ;
      P018I7_A252CliCod = new int[1] ;
      P018I7_n252CliCod = new boolean[] {false} ;
      P018I7_A396EmprCod = new String[] {""} ;
      P018I7_A130BarCodPar = new String[] {""} ;
      P018I7_n130BarCodPar = new boolean[] {false} ;
      P018I7_A132BarCodReo = new byte[1] ;
      P018I7_n132BarCodReo = new boolean[] {false} ;
      P018I7_A129BarCod = new int[1] ;
      P018I7_n129BarCod = new boolean[] {false} ;
      P018I7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018I7_n166BarKgm = new boolean[] {false} ;
      P018I7_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018I7_n219BarTotAgr = new boolean[] {false} ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      W130BarCodPar = "" ;
      AV34Kgm = DecimalUtil.ZERO ;
      AV32ArtCod = "" ;
      A2797BarMaqFA = DecimalUtil.ZERO ;
      AV33ArtFacAbs = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P018I10_A252CliCod = new int[1] ;
      P018I10_n252CliCod = new boolean[] {false} ;
      P018I10_A396EmprCod = new String[] {""} ;
      P018I10_A129BarCod = new int[1] ;
      P018I10_n129BarCod = new boolean[] {false} ;
      P018I10_A132BarCodReo = new byte[1] ;
      P018I10_n132BarCodReo = new boolean[] {false} ;
      P018I10_A130BarCodPar = new String[] {""} ;
      P018I10_n130BarCodPar = new boolean[] {false} ;
      P018I10_A831TipColCod = new byte[1] ;
      P018I10_A482ForColNom = new String[] {""} ;
      P018I10_A483ForColNum = new int[1] ;
      P018I10_A494ForSer = new String[] {""} ;
      P018I10_A764ProForCod = new String[] {""} ;
      P018I10_A7802ProFoNPrg = new int[1] ;
      P018I10_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018I10_A10542ProForH2O = new short[1] ;
      P018I10_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A764ProForCod = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new int[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      P018I13_A65ArtCod = new String[] {""} ;
      P018I13_A252CliCod = new int[1] ;
      P018I13_n252CliCod = new boolean[] {false} ;
      P018I13_A396EmprCod = new String[] {""} ;
      P018I13_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018I13_n2791ArtFacAbs = new boolean[] {false} ;
      A65ArtCod = "" ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprfbaa__default(),
         new Object[] {
             new Object[] {
            P018I2_A2794BarLinMaq, P018I2_A130BarCodPar, P018I2_A132BarCodReo, P018I2_A129BarCod, P018I2_A2792TermiCod, P018I2_A396EmprCod, P018I2_A207BarPrfCod, P018I2_n207BarPrfCod, P018I2_A1255BarPrfLin
            }
            , new Object[] {
            P018I3_A2795BarMaqPrf, P018I3_n2795BarMaqPrf, P018I3_A2796BarMaqVol, P018I3_n2796BarMaqVol
            }
            , new Object[] {
            }
            , new Object[] {
            P018I7_A218BarTipCol, P018I7_A135BarColNom, P018I7_A136BarColNum, P018I7_A212BarSer, P018I7_A213BarSit, P018I7_A252CliCod, P018I7_n252CliCod, P018I7_A396EmprCod, P018I7_A130BarCodPar, P018I7_A132BarCodReo,
            P018I7_A129BarCod, P018I7_A166BarKgm, P018I7_n166BarKgm, P018I7_A219BarTotAgr, P018I7_n219BarTotAgr
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P018I10_A252CliCod, P018I10_A396EmprCod, P018I10_A129BarCod, P018I10_n129BarCod, P018I10_A132BarCodReo, P018I10_n132BarCodReo, P018I10_A130BarCodPar, P018I10_n130BarCodPar, P018I10_A831TipColCod, P018I10_A482ForColNom,
            P018I10_A483ForColNum, P018I10_A494ForSer, P018I10_A764ProForCod, P018I10_A7802ProFoNPrg, P018I10_A8656ProForrbn, P018I10_A10542ProForH2O, P018I10_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P018I13_A65ArtCod, P018I13_A252CliCod, P018I13_A396EmprCod, P018I13_A2791ArtFacAbs, P018I13_n2791ArtFacAbs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV20BarReoMin ;
   private byte AV25FlagJM ;
   private byte AV23Flag ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte W132BarCodReo ;
   private byte A831TipColCod ;
   private byte GXv_int1[] ;
   private short AV27BarLinMaq ;
   private short A2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short AV24Linea ;
   private short Gx_err ;
   private short A10542ProForH2O ;
   private short A1160ProForL ;
   private short GXv_int4[] ;
   private short GXv_int10[] ;
   private short GXv_int13[] ;
   private short A1256BarPrfULin ;
   private short A2800BarPrfULi2 ;
   private int AV16BarCod ;
   private int AV19BarCodMin ;
   private int AV28BarMaqVol ;
   private int A129BarCod ;
   private int A2796BarMaqVol ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int W129BarCod ;
   private int AV31CliCod ;
   private int GX_INS406 ;
   private int GX_INS405 ;
   private int A483ForColNum ;
   private int A7802ProFoNPrg ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private int GXv_int11[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV34Kgm ;
   private java.math.BigDecimal A2797BarMaqFA ;
   private java.math.BigDecimal AV33ArtFacAbs ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private String AV15EmprCod ;
   private String AV26TermiCod ;
   private String AV18BarCodPar ;
   private String AV21BarParMin ;
   private String AV29BarMaqCod ;
   private String AV30Tipo ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2792TermiCod ;
   private String A396EmprCod ;
   private String A207BarPrfCod ;
   private String A2795BarMaqPrf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String W130BarCodPar ;
   private String AV32ArtCod ;
   private String Gx_emsg ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String A65ArtCod ;
   private boolean brk18I2 ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n207BarPrfCod ;
   private boolean n2795BarMaqPrf ;
   private boolean n2796BarMaqVol ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean n219BarTotAgr ;
   private boolean returnInSub ;
   private boolean n2797BarMaqFA ;
   private boolean n1256BarPrfULin ;
   private boolean n2800BarPrfULi2 ;
   private boolean n2791ArtFacAbs ;
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
   private short[] P018I2_A2794BarLinMaq ;
   private String[] P018I2_A130BarCodPar ;
   private boolean[] P018I2_n130BarCodPar ;
   private byte[] P018I2_A132BarCodReo ;
   private boolean[] P018I2_n132BarCodReo ;
   private int[] P018I2_A129BarCod ;
   private boolean[] P018I2_n129BarCod ;
   private String[] P018I2_A2792TermiCod ;
   private String[] P018I2_A396EmprCod ;
   private String[] P018I2_A207BarPrfCod ;
   private boolean[] P018I2_n207BarPrfCod ;
   private short[] P018I2_A1255BarPrfLin ;
   private String[] P018I3_A2795BarMaqPrf ;
   private boolean[] P018I3_n2795BarMaqPrf ;
   private int[] P018I3_A2796BarMaqVol ;
   private boolean[] P018I3_n2796BarMaqVol ;
   private byte[] P018I7_A218BarTipCol ;
   private String[] P018I7_A135BarColNom ;
   private int[] P018I7_A136BarColNum ;
   private String[] P018I7_A212BarSer ;
   private byte[] P018I7_A213BarSit ;
   private int[] P018I7_A252CliCod ;
   private boolean[] P018I7_n252CliCod ;
   private String[] P018I7_A396EmprCod ;
   private String[] P018I7_A130BarCodPar ;
   private boolean[] P018I7_n130BarCodPar ;
   private byte[] P018I7_A132BarCodReo ;
   private boolean[] P018I7_n132BarCodReo ;
   private int[] P018I7_A129BarCod ;
   private boolean[] P018I7_n129BarCod ;
   private java.math.BigDecimal[] P018I7_A166BarKgm ;
   private boolean[] P018I7_n166BarKgm ;
   private java.math.BigDecimal[] P018I7_A219BarTotAgr ;
   private boolean[] P018I7_n219BarTotAgr ;
   private int[] P018I10_A252CliCod ;
   private boolean[] P018I10_n252CliCod ;
   private String[] P018I10_A396EmprCod ;
   private int[] P018I10_A129BarCod ;
   private boolean[] P018I10_n129BarCod ;
   private byte[] P018I10_A132BarCodReo ;
   private boolean[] P018I10_n132BarCodReo ;
   private String[] P018I10_A130BarCodPar ;
   private boolean[] P018I10_n130BarCodPar ;
   private byte[] P018I10_A831TipColCod ;
   private String[] P018I10_A482ForColNom ;
   private int[] P018I10_A483ForColNum ;
   private String[] P018I10_A494ForSer ;
   private String[] P018I10_A764ProForCod ;
   private int[] P018I10_A7802ProFoNPrg ;
   private java.math.BigDecimal[] P018I10_A8656ProForrbn ;
   private short[] P018I10_A10542ProForH2O ;
   private short[] P018I10_A1160ProForL ;
   private String[] P018I13_A65ArtCod ;
   private int[] P018I13_A252CliCod ;
   private boolean[] P018I13_n252CliCod ;
   private String[] P018I13_A396EmprCod ;
   private java.math.BigDecimal[] P018I13_A2791ArtFacAbs ;
   private boolean[] P018I13_n2791ArtFacAbs ;
}

final  class pprfbaa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P018I2", "SELECT BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarPrfCod, BarPrfLin FROM TXPBARPR2 WHERE (EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?) AND (EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P018I3", "SELECT BarMaqPrf, BarMaqVol FROM TXPBARMAQ WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P018I4", "UPDATE TXPBARMAQ SET BarMaqPrf=?, BarMaqVol=?  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new ForEachCursor("P018I7", "SELECT T1.BarTipCol, T1.BarColNom, T1.BarColNum, T1.BarSer, T1.BarSit, T1.CliCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P018I8", "INSERT INTO TXPBARMAQ(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf, BarMaqVol, BarMaqFA, BarMaqVR, BarMaqRep, BarPrfULi2, BarMaqB12, BarMaqB13, BarMaqB14, BarMaqB15, BarMaqNpr, BarMaqInt, BarMaqPr2, BarMaqPr3, BarMaqOrd, BarMaqFas, BarMaqNh, BarMaqVX, BarMaqBL, BarMaqFlow, BarMaqRPM, BarMaqMol, BarMaqTor, BarMaqCla, BarMaqTej, BarMaqDel, BarMaqPML, BarMaqObs, BarSalM, MSedo1, MSedo2, MSedo3, MSedo4, MSedo5, MSedo6, Msedo7, Msedo8, Msedo9, Msedo10, Msedo11) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P018I9", "INSERT INTO TXPBARTER(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarULinMaq, BarPrfULin, BarMacPro1) VALUES(?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new ForEachCursor("P018I10", "SELECT T1.CliCod, T1.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar, T1.TipColCod, T1.ForColNom, T1.ForColNum, T1.ForSer, T1.ProForCod, T1.ProFoNPrg, T1.ProForrbn, T1.ProForH2O, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCFORMU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum AND T2.TipColCod = T1.TipColCod) WHERE (T1.EmprCod = ?) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T1.ForSer = ? and T1.ForColNum = ? and T1.ForColNom = ? and T1.TipColCod = ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P018I11", "UPDATE TXPBARTER SET BarPrfULin=?  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new UpdateCursor("P018I12", "UPDATE TXPBARMAQ SET BarPrfULi2=?  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new ForEachCursor("P018I13", "SELECT ArtCod, CliCod, EmprCod, ArtFacAbs FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 2 :
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
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 10);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 1);
               }
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setString(7, (String)parms[9], 13);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
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
               return;
      }
   }

}

