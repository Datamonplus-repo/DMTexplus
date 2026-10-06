package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preclva3 extends GXProcedure
{
   public preclva3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preclva3.class ), "" );
   }

   public preclva3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      preclva3.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      preclva3.this.AV20EmprCod = aP0[0];
      this.aP0 = aP0;
      preclva3.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      preclva3.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      preclva3.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      preclva3.this.AV11RecLinMaq = aP4[0];
      this.aP4 = aP4;
      preclva3.this.AV21Recal = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Recal = httpContext.getMessage( "S", "") ;
      AV12Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV20EmprCod ;
      GXv_char2[0] = AV15EmprNom ;
      GXv_char3[0] = AV14Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char1, GXv_char2, GXv_char3) ;
      preclva3.this.AV20EmprCod = GXv_char1[0] ;
      preclva3.this.AV15EmprNom = GXv_char2[0] ;
      preclva3.this.AV14Usurcod = GXv_char3[0] ;
      AV16Tot_rgtos = (short)(0) ;
      /* Using cursor P024F2 */
      pr_default.execute(0, new Object[] {AV20EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P024F2_A2804RecLinMaq[0] ;
         A130BarCodPar = P024F2_A130BarCodPar[0] ;
         A132BarCodReo = P024F2_A132BarCodReo[0] ;
         A129BarCod = P024F2_A129BarCod[0] ;
         A396EmprCod = P024F2_A396EmprCod[0] ;
         A4268RecOrdLin = P024F2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P024F2_n4268RecOrdLin[0] ;
         AV18RecOrdLin = A4268RecOrdLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P024F3 */
      pr_default.execute(1, new Object[] {AV20EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV18RecOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A194BarOrdLin = P024F3_A194BarOrdLin[0] ;
         A130BarCodPar = P024F3_A130BarCodPar[0] ;
         A132BarCodReo = P024F3_A132BarCodReo[0] ;
         A129BarCod = P024F3_A129BarCod[0] ;
         A396EmprCod = P024F3_A396EmprCod[0] ;
         A758ProCod = P024F3_A758ProCod[0] ;
         AV19ProCod = A758ProCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P024F5 */
      pr_default.execute(2, new Object[] {AV20EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2804RecLinMaq = P024F5_A2804RecLinMaq[0] ;
         A130BarCodPar = P024F5_A130BarCodPar[0] ;
         A132BarCodReo = P024F5_A132BarCodReo[0] ;
         A129BarCod = P024F5_A129BarCod[0] ;
         A396EmprCod = P024F5_A396EmprCod[0] ;
         A2805RecVolPrd = P024F5_A2805RecVolPrd[0] ;
         A4271RecFagKgs = P024F5_A4271RecFagKgs[0] ;
         n4271RecFagKgs = P024F5_n4271RecFagKgs[0] ;
         A4259RecTotKgs = P024F5_A4259RecTotKgs[0] ;
         A4271RecFagKgs = P024F5_A4271RecFagKgs[0] ;
         n4271RecFagKgs = P024F5_n4271RecFagKgs[0] ;
         A4316RecMaqKgs = A4259RecTotKgs.add(A4271RecFagKgs) ;
         AV17Kgs_for = A4316RecMaqKgs ;
         AV16Tot_rgtos = (short)(AV16Tot_rgtos+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P024F6 */
      pr_default.execute(3, new Object[] {AV20EmprCod, AV12Station, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2794BarLinMaq = P024F6_A2794BarLinMaq[0] ;
         A130BarCodPar = P024F6_A130BarCodPar[0] ;
         A132BarCodReo = P024F6_A132BarCodReo[0] ;
         A129BarCod = P024F6_A129BarCod[0] ;
         A2792TermiCod = P024F6_A2792TermiCod[0] ;
         A396EmprCod = P024F6_A396EmprCod[0] ;
         A4869BarPrfVol = P024F6_A4869BarPrfVol[0] ;
         n4869BarPrfVol = P024F6_n4869BarPrfVol[0] ;
         A1255BarPrfLin = P024F6_A1255BarPrfLin[0] ;
         /* Using cursor P024F7 */
         pr_default.execute(4, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P024F8 */
      pr_default.execute(5, new Object[] {AV20EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A1273RecLinPro = P024F8_A1273RecLinPro[0] ;
         A764ProForCod = P024F8_A764ProForCod[0] ;
         A4695RecVolPrf = P024F8_A4695RecVolPrf[0] ;
         A4696RecTiempo = P024F8_A4696RecTiempo[0] ;
         n4696RecTiempo = P024F8_n4696RecTiempo[0] ;
         A4697RecNroPrg = P024F8_A4697RecNroPrg[0] ;
         A7228RecTemp = P024F8_A7228RecTemp[0] ;
         n7228RecTemp = P024F8_n7228RecTemp[0] ;
         A7230RecPhMn = P024F8_A7230RecPhMn[0] ;
         n7230RecPhMn = P024F8_n7230RecPhMn[0] ;
         A7229RecPhMx = P024F8_A7229RecPhMx[0] ;
         n7229RecPhMx = P024F8_n7229RecPhMx[0] ;
         A396EmprCod = P024F8_A396EmprCod[0] ;
         A2804RecLinMaq = P024F8_A2804RecLinMaq[0] ;
         A130BarCodPar = P024F8_A130BarCodPar[0] ;
         A132BarCodReo = P024F8_A132BarCodReo[0] ;
         A129BarCod = P024F8_A129BarCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /*
            INSERT RECORD ON TABLE TXPBARPR2

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A2792TermiCod = AV12Station ;
         A129BarCod = AV8BarCod ;
         A132BarCodReo = AV9BarCodReo ;
         A130BarCodPar = AV10BarCodPar ;
         A2794BarLinMaq = AV11RecLinMaq ;
         A1255BarPrfLin = A1273RecLinPro ;
         A207BarPrfCod = A764ProForCod ;
         n207BarPrfCod = false ;
         A4869BarPrfVol = A4695RecVolPrf ;
         n4869BarPrfVol = false ;
         A4870BarPrfTie = A4696RecTiempo ;
         n4870BarPrfTie = false ;
         A4871BarPrfPrg = A4697RecNroPrg ;
         n4871BarPrfPrg = false ;
         A7216BarPrfTmp = A7228RecTemp ;
         n7216BarPrfTmp = false ;
         A7218BarPrfPhm = A7230RecPhMn ;
         n7218BarPrfPhm = false ;
         A7217BarPrfPhx = A7229RecPhMx ;
         n7217BarPrfPhx = false ;
         /* Using cursor P024F9 */
         pr_default.execute(6, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin), Boolean.valueOf(n207BarPrfCod), A207BarPrfCod, Boolean.valueOf(n4869BarPrfVol), Integer.valueOf(A4869BarPrfVol), Boolean.valueOf(n4870BarPrfTie), Short.valueOf(A4870BarPrfTie), Boolean.valueOf(n4871BarPrfPrg), Integer.valueOf(A4871BarPrfPrg), Boolean.valueOf(n7216BarPrfTmp), Short.valueOf(A7216BarPrfTmp), Boolean.valueOf(n7217BarPrfPhx), A7217BarPrfPhx, Boolean.valueOf(n7218BarPrfPhm), A7218BarPrfPhm});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Application.commitDataStores(context, remoteHandle, pr_default, "preclva3");
      GXv_char3[0] = A396EmprCod ;
      GXv_int4[0] = AV8BarCod ;
      GXv_int5[0] = AV9BarCodReo ;
      GXv_char2[0] = AV10BarCodPar ;
      GXv_int6[0] = AV11RecLinMaq ;
      new app.preclva2(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_int6) ;
      preclva3.this.A396EmprCod = GXv_char3[0] ;
      preclva3.this.AV8BarCod = GXv_int4[0] ;
      preclva3.this.AV9BarCodReo = GXv_int5[0] ;
      preclva3.this.AV10BarCodPar = GXv_char2[0] ;
      preclva3.this.AV11RecLinMaq = GXv_int6[0] ;
      /* Using cursor P024F10 */
      pr_default.execute(7, new Object[] {AV20EmprCod, AV12Station, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A207BarPrfCod = P024F10_A207BarPrfCod[0] ;
         n207BarPrfCod = P024F10_n207BarPrfCod[0] ;
         A4869BarPrfVol = P024F10_A4869BarPrfVol[0] ;
         n4869BarPrfVol = P024F10_n4869BarPrfVol[0] ;
         A4870BarPrfTie = P024F10_A4870BarPrfTie[0] ;
         n4870BarPrfTie = P024F10_n4870BarPrfTie[0] ;
         A4871BarPrfPrg = P024F10_A4871BarPrfPrg[0] ;
         n4871BarPrfPrg = P024F10_n4871BarPrfPrg[0] ;
         A2794BarLinMaq = P024F10_A2794BarLinMaq[0] ;
         A130BarCodPar = P024F10_A130BarCodPar[0] ;
         A132BarCodReo = P024F10_A132BarCodReo[0] ;
         A129BarCod = P024F10_A129BarCod[0] ;
         A2792TermiCod = P024F10_A2792TermiCod[0] ;
         A396EmprCod = P024F10_A396EmprCod[0] ;
         A1255BarPrfLin = P024F10_A1255BarPrfLin[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV13RecLinPro = (byte)(A1255BarPrfLin) ;
         /*
            INSERT RECORD ON TABLE TXPCRECET

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A396EmprCod = AV20EmprCod ;
         A129BarCod = AV8BarCod ;
         A132BarCodReo = AV9BarCodReo ;
         A130BarCodPar = AV10BarCodPar ;
         A2804RecLinMaq = AV11RecLinMaq ;
         A1273RecLinPro = AV13RecLinPro ;
         A764ProForCod = A207BarPrfCod ;
         A4695RecVolPrf = A4869BarPrfVol ;
         A4696RecTiempo = A4870BarPrfTie ;
         n4696RecTiempo = false ;
         A4697RecNroPrg = A4871BarPrfPrg ;
         /* Using cursor P024F11 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod, Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
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
         /* Using cursor P024F12 */
         pr_default.execute(9, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
      n4868RecUsrMod = false ;
      n4867RecFecMod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P024F13 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n4868RecUsrMod), AV14Usurcod, AV20EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV11RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
      /* End optimized UPDATE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "preclva3");
      GXv_char3[0] = AV20EmprCod ;
      GXv_int4[0] = AV8BarCod ;
      GXv_int5[0] = AV9BarCodReo ;
      GXv_char2[0] = AV10BarCodPar ;
      GXv_int6[0] = AV11RecLinMaq ;
      GXv_char1[0] = httpContext.getMessage( "N", "") ;
      new app.planref2(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_int6, GXv_char1) ;
      preclva3.this.AV20EmprCod = GXv_char3[0] ;
      preclva3.this.AV8BarCod = GXv_int4[0] ;
      preclva3.this.AV9BarCodReo = GXv_int5[0] ;
      preclva3.this.AV10BarCodPar = GXv_char2[0] ;
      preclva3.this.AV11RecLinMaq = GXv_int6[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preclva3.this.AV20EmprCod;
      this.aP1[0] = preclva3.this.AV8BarCod;
      this.aP2[0] = preclva3.this.AV9BarCodReo;
      this.aP3[0] = preclva3.this.AV10BarCodPar;
      this.aP4[0] = preclva3.this.AV11RecLinMaq;
      this.aP5[0] = preclva3.this.AV21Recal;
      Application.commitDataStores(context, remoteHandle, pr_default, "preclva3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      AV15EmprNom = "" ;
      AV14Usurcod = "" ;
      scmdbuf = "" ;
      P024F2_A2804RecLinMaq = new short[1] ;
      P024F2_A130BarCodPar = new String[] {""} ;
      P024F2_A132BarCodReo = new byte[1] ;
      P024F2_A129BarCod = new int[1] ;
      P024F2_A396EmprCod = new String[] {""} ;
      P024F2_A4268RecOrdLin = new short[1] ;
      P024F2_n4268RecOrdLin = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P024F3_A194BarOrdLin = new short[1] ;
      P024F3_A130BarCodPar = new String[] {""} ;
      P024F3_A132BarCodReo = new byte[1] ;
      P024F3_A129BarCod = new int[1] ;
      P024F3_A396EmprCod = new String[] {""} ;
      P024F3_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV19ProCod = "" ;
      P024F5_A2804RecLinMaq = new short[1] ;
      P024F5_A130BarCodPar = new String[] {""} ;
      P024F5_A132BarCodReo = new byte[1] ;
      P024F5_A129BarCod = new int[1] ;
      P024F5_A396EmprCod = new String[] {""} ;
      P024F5_A2805RecVolPrd = new int[1] ;
      P024F5_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024F5_n4271RecFagKgs = new boolean[] {false} ;
      P024F5_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4271RecFagKgs = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4316RecMaqKgs = DecimalUtil.ZERO ;
      AV17Kgs_for = DecimalUtil.ZERO ;
      P024F6_A2794BarLinMaq = new short[1] ;
      P024F6_A130BarCodPar = new String[] {""} ;
      P024F6_A132BarCodReo = new byte[1] ;
      P024F6_A129BarCod = new int[1] ;
      P024F6_A2792TermiCod = new String[] {""} ;
      P024F6_A396EmprCod = new String[] {""} ;
      P024F6_A4869BarPrfVol = new int[1] ;
      P024F6_n4869BarPrfVol = new boolean[] {false} ;
      P024F6_A1255BarPrfLin = new short[1] ;
      A2792TermiCod = "" ;
      P024F8_A1273RecLinPro = new byte[1] ;
      P024F8_A764ProForCod = new String[] {""} ;
      P024F8_A4695RecVolPrf = new int[1] ;
      P024F8_A4696RecTiempo = new short[1] ;
      P024F8_n4696RecTiempo = new boolean[] {false} ;
      P024F8_A4697RecNroPrg = new int[1] ;
      P024F8_A7228RecTemp = new short[1] ;
      P024F8_n7228RecTemp = new boolean[] {false} ;
      P024F8_A7230RecPhMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024F8_n7230RecPhMn = new boolean[] {false} ;
      P024F8_A7229RecPhMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024F8_n7229RecPhMx = new boolean[] {false} ;
      P024F8_A396EmprCod = new String[] {""} ;
      P024F8_A2804RecLinMaq = new short[1] ;
      P024F8_A130BarCodPar = new String[] {""} ;
      P024F8_A132BarCodReo = new byte[1] ;
      P024F8_A129BarCod = new int[1] ;
      A764ProForCod = "" ;
      A7230RecPhMn = DecimalUtil.ZERO ;
      A7229RecPhMx = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A207BarPrfCod = "" ;
      A7218BarPrfPhm = DecimalUtil.ZERO ;
      A7217BarPrfPhx = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P024F10_A207BarPrfCod = new String[] {""} ;
      P024F10_n207BarPrfCod = new boolean[] {false} ;
      P024F10_A4869BarPrfVol = new int[1] ;
      P024F10_n4869BarPrfVol = new boolean[] {false} ;
      P024F10_A4870BarPrfTie = new short[1] ;
      P024F10_n4870BarPrfTie = new boolean[] {false} ;
      P024F10_A4871BarPrfPrg = new int[1] ;
      P024F10_n4871BarPrfPrg = new boolean[] {false} ;
      P024F10_A2794BarLinMaq = new short[1] ;
      P024F10_A130BarCodPar = new String[] {""} ;
      P024F10_A132BarCodReo = new byte[1] ;
      P024F10_A129BarCod = new int[1] ;
      P024F10_A2792TermiCod = new String[] {""} ;
      P024F10_A396EmprCod = new String[] {""} ;
      P024F10_A1255BarPrfLin = new short[1] ;
      A4868RecUsrMod = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_char1 = new String[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.preclva3__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.preclva3__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.preclva3__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preclva3__default(),
         new Object[] {
             new Object[] {
            P024F2_A2804RecLinMaq, P024F2_A130BarCodPar, P024F2_A132BarCodReo, P024F2_A129BarCod, P024F2_A396EmprCod, P024F2_A4268RecOrdLin, P024F2_n4268RecOrdLin
            }
            , new Object[] {
            P024F3_A194BarOrdLin, P024F3_A130BarCodPar, P024F3_A132BarCodReo, P024F3_A129BarCod, P024F3_A396EmprCod, P024F3_A758ProCod
            }
            , new Object[] {
            P024F5_A2804RecLinMaq, P024F5_A130BarCodPar, P024F5_A132BarCodReo, P024F5_A129BarCod, P024F5_A396EmprCod, P024F5_A2805RecVolPrd, P024F5_A4271RecFagKgs, P024F5_n4271RecFagKgs, P024F5_A4259RecTotKgs
            }
            , new Object[] {
            P024F6_A2794BarLinMaq, P024F6_A130BarCodPar, P024F6_A132BarCodReo, P024F6_A129BarCod, P024F6_A2792TermiCod, P024F6_A396EmprCod, P024F6_A4869BarPrfVol, P024F6_n4869BarPrfVol, P024F6_A1255BarPrfLin
            }
            , new Object[] {
            }
            , new Object[] {
            P024F8_A1273RecLinPro, P024F8_A764ProForCod, P024F8_A4695RecVolPrf, P024F8_A4696RecTiempo, P024F8_n4696RecTiempo, P024F8_A4697RecNroPrg, P024F8_A7228RecTemp, P024F8_n7228RecTemp, P024F8_A7230RecPhMn, P024F8_n7230RecPhMn,
            P024F8_A7229RecPhMx, P024F8_n7229RecPhMx, P024F8_A396EmprCod, P024F8_A2804RecLinMaq, P024F8_A130BarCodPar, P024F8_A132BarCodReo, P024F8_A129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            P024F10_A207BarPrfCod, P024F10_n207BarPrfCod, P024F10_A4869BarPrfVol, P024F10_n4869BarPrfVol, P024F10_A4870BarPrfTie, P024F10_n4870BarPrfTie, P024F10_A4871BarPrfPrg, P024F10_n4871BarPrfPrg, P024F10_A2794BarLinMaq, P024F10_A130BarCodPar,
            P024F10_A132BarCodReo, P024F10_A129BarCod, P024F10_A2792TermiCod, P024F10_A396EmprCod, P024F10_A1255BarPrfLin
            }
            , new Object[] {
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
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte W132BarCodReo ;
   private byte AV13RecLinPro ;
   private byte GXv_int5[] ;
   private short AV11RecLinMaq ;
   private short AV16Tot_rgtos ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short AV18RecOrdLin ;
   private short A194BarOrdLin ;
   private short A2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short A4696RecTiempo ;
   private short A7228RecTemp ;
   private short A4870BarPrfTie ;
   private short A7216BarPrfTmp ;
   private short Gx_err ;
   private short GXv_int6[] ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int A4869BarPrfVol ;
   private int A4695RecVolPrf ;
   private int A4697RecNroPrg ;
   private int W129BarCod ;
   private int GX_INS407 ;
   private int A4871BarPrfPrg ;
   private int GX_INS409 ;
   private int GXv_int4[] ;
   private java.math.BigDecimal A4271RecFagKgs ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4316RecMaqKgs ;
   private java.math.BigDecimal AV17Kgs_for ;
   private java.math.BigDecimal A7230RecPhMn ;
   private java.math.BigDecimal A7229RecPhMx ;
   private java.math.BigDecimal A7218BarPrfPhm ;
   private java.math.BigDecimal A7217BarPrfPhx ;
   private String AV20EmprCod ;
   private String AV10BarCodPar ;
   private String AV21Recal ;
   private String AV12Station ;
   private String AV15EmprNom ;
   private String AV14Usurcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV19ProCod ;
   private String A2792TermiCod ;
   private String A764ProForCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A207BarPrfCod ;
   private String Gx_emsg ;
   private String A4868RecUsrMod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private boolean n4268RecOrdLin ;
   private boolean n4271RecFagKgs ;
   private boolean n4869BarPrfVol ;
   private boolean n4696RecTiempo ;
   private boolean n7228RecTemp ;
   private boolean n7230RecPhMn ;
   private boolean n7229RecPhMx ;
   private boolean n207BarPrfCod ;
   private boolean n4870BarPrfTie ;
   private boolean n4871BarPrfPrg ;
   private boolean n7216BarPrfTmp ;
   private boolean n7218BarPrfPhm ;
   private boolean n7217BarPrfPhx ;
   private boolean n4868RecUsrMod ;
   private boolean n4867RecFecMod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P024F2_A2804RecLinMaq ;
   private String[] P024F2_A130BarCodPar ;
   private byte[] P024F2_A132BarCodReo ;
   private int[] P024F2_A129BarCod ;
   private String[] P024F2_A396EmprCod ;
   private short[] P024F2_A4268RecOrdLin ;
   private boolean[] P024F2_n4268RecOrdLin ;
   private short[] P024F3_A194BarOrdLin ;
   private String[] P024F3_A130BarCodPar ;
   private byte[] P024F3_A132BarCodReo ;
   private int[] P024F3_A129BarCod ;
   private String[] P024F3_A396EmprCod ;
   private String[] P024F3_A758ProCod ;
   private short[] P024F5_A2804RecLinMaq ;
   private String[] P024F5_A130BarCodPar ;
   private byte[] P024F5_A132BarCodReo ;
   private int[] P024F5_A129BarCod ;
   private String[] P024F5_A396EmprCod ;
   private int[] P024F5_A2805RecVolPrd ;
   private java.math.BigDecimal[] P024F5_A4271RecFagKgs ;
   private boolean[] P024F5_n4271RecFagKgs ;
   private java.math.BigDecimal[] P024F5_A4259RecTotKgs ;
   private short[] P024F6_A2794BarLinMaq ;
   private String[] P024F6_A130BarCodPar ;
   private byte[] P024F6_A132BarCodReo ;
   private int[] P024F6_A129BarCod ;
   private String[] P024F6_A2792TermiCod ;
   private String[] P024F6_A396EmprCod ;
   private int[] P024F6_A4869BarPrfVol ;
   private boolean[] P024F6_n4869BarPrfVol ;
   private short[] P024F6_A1255BarPrfLin ;
   private byte[] P024F8_A1273RecLinPro ;
   private String[] P024F8_A764ProForCod ;
   private int[] P024F8_A4695RecVolPrf ;
   private short[] P024F8_A4696RecTiempo ;
   private boolean[] P024F8_n4696RecTiempo ;
   private int[] P024F8_A4697RecNroPrg ;
   private short[] P024F8_A7228RecTemp ;
   private boolean[] P024F8_n7228RecTemp ;
   private java.math.BigDecimal[] P024F8_A7230RecPhMn ;
   private boolean[] P024F8_n7230RecPhMn ;
   private java.math.BigDecimal[] P024F8_A7229RecPhMx ;
   private boolean[] P024F8_n7229RecPhMx ;
   private String[] P024F8_A396EmprCod ;
   private short[] P024F8_A2804RecLinMaq ;
   private String[] P024F8_A130BarCodPar ;
   private byte[] P024F8_A132BarCodReo ;
   private int[] P024F8_A129BarCod ;
   private String[] P024F10_A207BarPrfCod ;
   private boolean[] P024F10_n207BarPrfCod ;
   private int[] P024F10_A4869BarPrfVol ;
   private boolean[] P024F10_n4869BarPrfVol ;
   private short[] P024F10_A4870BarPrfTie ;
   private boolean[] P024F10_n4870BarPrfTie ;
   private int[] P024F10_A4871BarPrfPrg ;
   private boolean[] P024F10_n4871BarPrfPrg ;
   private short[] P024F10_A2794BarLinMaq ;
   private String[] P024F10_A130BarCodPar ;
   private byte[] P024F10_A132BarCodReo ;
   private int[] P024F10_A129BarCod ;
   private String[] P024F10_A2792TermiCod ;
   private String[] P024F10_A396EmprCod ;
   private short[] P024F10_A1255BarPrfLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class preclva3__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class preclva3__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class preclva3__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class preclva3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P024F2", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecOrdLin FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P024F3", "SELECT BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P024F5", "SELECT T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.RecVolPrd, COALESCE( T2.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs FROM (TXPRECMAQ T1 LEFT JOIN (SELECT SUM(RecAgrKgs) AS RecFagKgs, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P024F6", "SELECT BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarPrfVol, BarPrfLin FROM TXPBARPR2 WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P024F7", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ? AND BarPrfLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new ForEachCursor("P024F8", "SELECT RecLinPro, ProForCod, RecVolPrf, RecTiempo, RecNroPrg, RecTemp, RecPhMn, RecPhMx, EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P024F9", "INSERT INTO TXPBARPR2(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin, BarPrfCod, BarPrfVol, BarPrfTie, BarPrfPrg, BarPrfTmp, BarPrfPhx, BarPrfPhm, BarPrfRb, BarPrfRec, BarPrfH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new ForEachCursor("P024F10", "SELECT BarPrfCod, BarPrfVol, BarPrfTie, BarPrfPrg, BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarPrfLin FROM TXPBARPR2 WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P024F11", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, RecVolPrf, RecTiempo, RecNroPrg, ProRecObs, RecTemp, RecPhMx, RecPhMn, RecRb, RecNumRec, RecNH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P024F12", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ? AND BarPrfLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P024F13", "UPDATE TXPRECMAQ SET RecUsrMod=?, RecFecMod=(SYSDATE)  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 10);
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((short[]) buf[14])[0] = rslt.getShort(11);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
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
                  stmt.setInt(11, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[16]).shortValue());
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
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[9]).shortValue());
               }
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

