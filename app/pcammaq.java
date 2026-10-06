package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcammaq extends GXProcedure
{
   public pcammaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcammaq.class ), "" );
   }

   public pcammaq( int remoteHandle ,
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
      pcammaq.this.aP6 = new short[] {0};
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
      pcammaq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcammaq.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcammaq.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcammaq.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcammaq.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcammaq.this.AV46MaqCod = aP5[0];
      this.aP5 = aP5;
      pcammaq.this.AV66Ordlin = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV67Dt0051 = (byte)(0) ;
      /* Using cursor P021R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV66Ordlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P021R2_A194BarOrdLin[0] ;
         A7944Dtb_ForLin = P021R2_A7944Dtb_ForLin[0] ;
         A7934Dtb_Ordl = P021R2_A7934Dtb_Ordl[0] ;
         A758ProCod = P021R2_A758ProCod[0] ;
         AV67Dt0051 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV67Dt0051 == 1 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = A2804RecLinMaq ;
         GXv_char6[0] = AV46MaqCod ;
         GXv_int7[0] = AV66Ordlin ;
         new app.pcammaqs(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_int7) ;
         pcammaq.this.A396EmprCod = GXv_char1[0] ;
         pcammaq.this.A129BarCod = GXv_int2[0] ;
         pcammaq.this.A132BarCodReo = GXv_int3[0] ;
         pcammaq.this.A130BarCodPar = GXv_char4[0] ;
         pcammaq.this.A2804RecLinMaq = GXv_int5[0] ;
         pcammaq.this.AV46MaqCod = GXv_char6[0] ;
         pcammaq.this.AV66Ordlin = GXv_int7[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV48VolMax = 0 ;
      AV47VolMin = 0 ;
      /* Using cursor P021R3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV46MaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P021R3_A602MaqCod[0] ;
         A625MaqVolMin = P021R3_A625MaqVolMin[0] ;
         n625MaqVolMin = P021R3_n625MaqVolMin[0] ;
         A623MaqVolMax = P021R3_A623MaqVolMax[0] ;
         n623MaqVolMax = P021R3_n623MaqVolMax[0] ;
         AV47VolMin = A625MaqVolMin ;
         AV48VolMax = A623MaqVolMax ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV55Cambio_v = (byte)(0) ;
      /* Using cursor P021R5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4268RecOrdLin = P021R5_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P021R5_n4268RecOrdLin[0] ;
         A4258RecMaqFas = P021R5_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P021R5_n4258RecMaqFas[0] ;
         A217BarTipArt = P021R5_A217BarTipArt[0] ;
         n217BarTipArt = P021R5_n217BarTipArt[0] ;
         A4271RecFagKgs = P021R5_A4271RecFagKgs[0] ;
         n4271RecFagKgs = P021R5_n4271RecFagKgs[0] ;
         A4259RecTotKgs = P021R5_A4259RecTotKgs[0] ;
         A217BarTipArt = P021R5_A217BarTipArt[0] ;
         n217BarTipArt = P021R5_n217BarTipArt[0] ;
         A4271RecFagKgs = P021R5_A4271RecFagKgs[0] ;
         n4271RecFagKgs = P021R5_n4271RecFagKgs[0] ;
         A4316RecMaqKgs = A4259RecTotKgs.add(A4271RecFagKgs) ;
         AV57BarCod = A129BarCod ;
         AV58BarCodReo = A132BarCodReo ;
         AV59BarCodPar = A130BarCodPar ;
         AV29BarOrdLin = A4268RecOrdLin ;
         AV62Kilos = A4316RecMaqKgs ;
         AV30FasCod = A4258RecMaqFas ;
         AV43BarTipArt = A217BarTipArt ;
         /* Execute user subroutine: 'MAQTAR' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'BARFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P021R6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A764ProForCod = P021R6_A764ProForCod[0] ;
            A4695RecVolPrf = P021R6_A4695RecVolPrf[0] ;
            A1273RecLinPro = P021R6_A1273RecLinPro[0] ;
            AV34ProForCod = A764ProForCod ;
            /* Execute user subroutine: 'CAL_VOL' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( AV61Volumen > AV48VolMax ) || ( AV61Volumen < AV47VolMin ) )
            {
               AV49Volumen_c = AV61Volumen ;
               AV54VolPrfOld = A4695RecVolPrf ;
               AV50Texto_i = httpContext.getMessage( "Atençao, el Volume Calculado ", "") + GXutil.str( AV49Volumen_c, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "i ultrapasa el volume definido para la maquina", "") + GXutil.newLine( ) + httpContext.getMessage( "Vol. Max ", "") + GXutil.str( AV48VolMax, 5, 0) + " " + httpContext.getMessage( "Vol. Min ", "") + GXutil.str( AV47VolMin, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "S= Respeitar a volume Processo; N= Utilizar Capacidades definidas p/maquina ", "") + GXutil.newLine( ) ;
               AV33RecVolPrf = AV49Volumen_c ;
            }
            else
            {
               AV33RecVolPrf = AV61Volumen ;
            }
            A4695RecVolPrf = AV33RecVolPrf ;
            AV55Cambio_v = (byte)(1) ;
            /* Using cursor P021R7 */
            pr_default.execute(4, new Object[] {Integer.valueOf(A4695RecVolPrf), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV55Cambio_v == 1 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcammaq");
         GXv_char6[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int7[0] = A2804RecLinMaq ;
         GXv_char1[0] = AV65Reccal ;
         new app.preclva(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_int3, GXv_char4, GXv_int7, GXv_char1) ;
         pcammaq.this.A396EmprCod = GXv_char6[0] ;
         pcammaq.this.A129BarCod = GXv_int2[0] ;
         pcammaq.this.A132BarCodReo = GXv_int3[0] ;
         pcammaq.this.A130BarCodPar = GXv_char4[0] ;
         pcammaq.this.A2804RecLinMaq = GXv_int7[0] ;
         pcammaq.this.AV65Reccal = GXv_char1[0] ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Using cursor P021R8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV57BarCod), Byte.valueOf(AV58BarCodReo), AV59BarCodPar, Short.valueOf(AV29BarOrdLin)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A194BarOrdLin = P021R8_A194BarOrdLin[0] ;
         A150BarFacTin = P021R8_A150BarFacTin[0] ;
         A5369BarFasGral = P021R8_A5369BarFasGral[0] ;
         n5369BarFasGral = P021R8_n5369BarFasGral[0] ;
         A758ProCod = P021R8_A758ProCod[0] ;
         AV44BarFacTin = A150BarFacTin ;
         AV64BarFasGral = A5369BarFasGral ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'MAQTAR' Routine */
      returnInSub = false ;
      AV63Rb_ta = (short)(0) ;
      /* Using cursor P021R9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(AV43BarTipArt)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A4686MaqTipArt = P021R9_A4686MaqTipArt[0] ;
         A5195MaqTipArtR = P021R9_A5195MaqTipArtR[0] ;
         n5195MaqTipArtR = P021R9_n5195MaqTipArtR[0] ;
         AV63Rb_ta = A5195MaqTipArtR ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S131( )
   {
      /* 'CAL_VOL' Routine */
      returnInSub = false ;
      AV61Volumen = 0 ;
      if ( GXutil.strcmp(AV44BarFacTin, httpContext.getMessage( "S", "")) == 0 )
      {
         AV60Rb = (short)(0) ;
         /* Using cursor P021R10 */
         pr_default.execute(7, new Object[] {A396EmprCod, AV34ProForCod});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A764ProForCod = P021R10_A764ProForCod[0] ;
            A4706ProForRb = P021R10_A4706ProForRb[0] ;
            AV60Rb = A4706ProForRb ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
         if ( AV60Rb > 0 )
         {
            AV61Volumen = (int)(DecimalUtil.decToDouble(AV62Kilos.multiply(DecimalUtil.doubleToDec(AV60Rb)))) ;
         }
         else
         {
            AV61Volumen = (int)(DecimalUtil.decToDouble(AV62Kilos.multiply(DecimalUtil.doubleToDec(AV63Rb_ta)))) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(AV64BarFasGral, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P021R11 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV57BarCod), Byte.valueOf(AV58BarCodReo), AV59BarCodPar, Short.valueOf(AV29BarOrdLin)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A764ProForCod = P021R11_A764ProForCod[0] ;
               A194BarOrdLin = P021R11_A194BarOrdLin[0] ;
               A5375FasQuiRb = P021R11_A5375FasQuiRb[0] ;
               A4706ProForRb = P021R11_A4706ProForRb[0] ;
               A5371FasQuiLin = P021R11_A5371FasQuiLin[0] ;
               A758ProCod = P021R11_A758ProCod[0] ;
               A4706ProForRb = P021R11_A4706ProForRb[0] ;
               if ( A5375FasQuiRb > 0 )
               {
                  AV61Volumen = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A5375FasQuiRb).multiply(AV62Kilos))) ;
               }
               if ( ( A4706ProForRb > 0 ) && ( A5375FasQuiRb == 0 ) )
               {
                  AV61Volumen = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4706ProForRb).multiply(AV62Kilos))) ;
               }
               if ( ( AV63Rb_ta > 0 ) && ( A5375FasQuiRb == 0 ) && ( A4706ProForRb == 0 ) )
               {
                  AV61Volumen = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV63Rb_ta).multiply(AV62Kilos))) ;
               }
               pr_default.readNext(8);
            }
            pr_default.close(8);
         }
         else
         {
            /* Using cursor P021R12 */
            pr_default.execute(9, new Object[] {A396EmprCod, AV30FasCod});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A764ProForCod = P021R12_A764ProForCod[0] ;
               A457FasCod = P021R12_A457FasCod[0] ;
               A4653FasForRb = P021R12_A4653FasForRb[0] ;
               n4653FasForRb = P021R12_n4653FasForRb[0] ;
               A4706ProForRb = P021R12_A4706ProForRb[0] ;
               A4650FasForLin = P021R12_A4650FasForLin[0] ;
               A4706ProForRb = P021R12_A4706ProForRb[0] ;
               if ( A4653FasForRb > 0 )
               {
                  AV61Volumen = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4653FasForRb).multiply(AV62Kilos))) ;
               }
               if ( ( A4706ProForRb > 0 ) && ( A4653FasForRb == 0 ) )
               {
                  AV61Volumen = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4706ProForRb).multiply(AV62Kilos))) ;
               }
               if ( ( AV63Rb_ta > 0 ) && ( A4653FasForRb == 0 ) && ( A4706ProForRb == 0 ) )
               {
                  AV61Volumen = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV63Rb_ta).multiply(AV62Kilos))) ;
               }
               pr_default.readNext(9);
            }
            pr_default.close(9);
         }
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcammaq.this.A396EmprCod;
      this.aP1[0] = pcammaq.this.A129BarCod;
      this.aP2[0] = pcammaq.this.A132BarCodReo;
      this.aP3[0] = pcammaq.this.A130BarCodPar;
      this.aP4[0] = pcammaq.this.A2804RecLinMaq;
      this.aP5[0] = pcammaq.this.AV46MaqCod;
      this.aP6[0] = pcammaq.this.AV66Ordlin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcammaq");
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
      P021R2_A396EmprCod = new String[] {""} ;
      P021R2_A129BarCod = new int[1] ;
      P021R2_A132BarCodReo = new byte[1] ;
      P021R2_A130BarCodPar = new String[] {""} ;
      P021R2_A194BarOrdLin = new short[1] ;
      P021R2_A7944Dtb_ForLin = new short[1] ;
      P021R2_A7934Dtb_Ordl = new short[1] ;
      P021R2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      GXv_int5 = new short[1] ;
      P021R3_A396EmprCod = new String[] {""} ;
      P021R3_A602MaqCod = new String[] {""} ;
      P021R3_A625MaqVolMin = new int[1] ;
      P021R3_n625MaqVolMin = new boolean[] {false} ;
      P021R3_A623MaqVolMax = new int[1] ;
      P021R3_n623MaqVolMax = new boolean[] {false} ;
      A602MaqCod = "" ;
      P021R5_A396EmprCod = new String[] {""} ;
      P021R5_A129BarCod = new int[1] ;
      P021R5_A132BarCodReo = new byte[1] ;
      P021R5_A130BarCodPar = new String[] {""} ;
      P021R5_A2804RecLinMaq = new short[1] ;
      P021R5_A4268RecOrdLin = new short[1] ;
      P021R5_n4268RecOrdLin = new boolean[] {false} ;
      P021R5_A4258RecMaqFas = new String[] {""} ;
      P021R5_n4258RecMaqFas = new boolean[] {false} ;
      P021R5_A217BarTipArt = new short[1] ;
      P021R5_n217BarTipArt = new boolean[] {false} ;
      P021R5_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P021R5_n4271RecFagKgs = new boolean[] {false} ;
      P021R5_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4258RecMaqFas = "" ;
      A4271RecFagKgs = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4316RecMaqKgs = DecimalUtil.ZERO ;
      AV59BarCodPar = "" ;
      AV62Kilos = DecimalUtil.ZERO ;
      AV30FasCod = "" ;
      P021R6_A396EmprCod = new String[] {""} ;
      P021R6_A129BarCod = new int[1] ;
      P021R6_A132BarCodReo = new byte[1] ;
      P021R6_A130BarCodPar = new String[] {""} ;
      P021R6_A2804RecLinMaq = new short[1] ;
      P021R6_A764ProForCod = new String[] {""} ;
      P021R6_A4695RecVolPrf = new int[1] ;
      P021R6_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      AV34ProForCod = "" ;
      AV50Texto_i = "" ;
      GXv_char6 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new short[1] ;
      AV65Reccal = "" ;
      GXv_char1 = new String[1] ;
      P021R8_A396EmprCod = new String[] {""} ;
      P021R8_A194BarOrdLin = new short[1] ;
      P021R8_A130BarCodPar = new String[] {""} ;
      P021R8_A132BarCodReo = new byte[1] ;
      P021R8_A129BarCod = new int[1] ;
      P021R8_A150BarFacTin = new String[] {""} ;
      P021R8_A5369BarFasGral = new String[] {""} ;
      P021R8_n5369BarFasGral = new boolean[] {false} ;
      P021R8_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A5369BarFasGral = "" ;
      AV44BarFacTin = "" ;
      AV64BarFasGral = "" ;
      P021R9_A396EmprCod = new String[] {""} ;
      P021R9_A4686MaqTipArt = new short[1] ;
      P021R9_A5195MaqTipArtR = new short[1] ;
      P021R9_n5195MaqTipArtR = new boolean[] {false} ;
      P021R10_A396EmprCod = new String[] {""} ;
      P021R10_A764ProForCod = new String[] {""} ;
      P021R10_A4706ProForRb = new short[1] ;
      P021R11_A764ProForCod = new String[] {""} ;
      P021R11_A396EmprCod = new String[] {""} ;
      P021R11_A129BarCod = new int[1] ;
      P021R11_A132BarCodReo = new byte[1] ;
      P021R11_A130BarCodPar = new String[] {""} ;
      P021R11_A194BarOrdLin = new short[1] ;
      P021R11_A5375FasQuiRb = new short[1] ;
      P021R11_A4706ProForRb = new short[1] ;
      P021R11_A5371FasQuiLin = new short[1] ;
      P021R11_A758ProCod = new String[] {""} ;
      P021R12_A764ProForCod = new String[] {""} ;
      P021R12_A396EmprCod = new String[] {""} ;
      P021R12_A457FasCod = new String[] {""} ;
      P021R12_A4653FasForRb = new short[1] ;
      P021R12_n4653FasForRb = new boolean[] {false} ;
      P021R12_A4706ProForRb = new short[1] ;
      P021R12_A4650FasForLin = new short[1] ;
      A457FasCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pcammaq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pcammaq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pcammaq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcammaq__default(),
         new Object[] {
             new Object[] {
            P021R2_A396EmprCod, P021R2_A129BarCod, P021R2_A132BarCodReo, P021R2_A130BarCodPar, P021R2_A194BarOrdLin, P021R2_A7944Dtb_ForLin, P021R2_A7934Dtb_Ordl, P021R2_A758ProCod
            }
            , new Object[] {
            P021R3_A396EmprCod, P021R3_A602MaqCod, P021R3_A625MaqVolMin, P021R3_n625MaqVolMin, P021R3_A623MaqVolMax, P021R3_n623MaqVolMax
            }
            , new Object[] {
            P021R5_A396EmprCod, P021R5_A129BarCod, P021R5_A132BarCodReo, P021R5_A130BarCodPar, P021R5_A2804RecLinMaq, P021R5_A4268RecOrdLin, P021R5_n4268RecOrdLin, P021R5_A4258RecMaqFas, P021R5_n4258RecMaqFas, P021R5_A217BarTipArt,
            P021R5_n217BarTipArt, P021R5_A4271RecFagKgs, P021R5_n4271RecFagKgs, P021R5_A4259RecTotKgs
            }
            , new Object[] {
            P021R6_A396EmprCod, P021R6_A129BarCod, P021R6_A132BarCodReo, P021R6_A130BarCodPar, P021R6_A2804RecLinMaq, P021R6_A764ProForCod, P021R6_A4695RecVolPrf, P021R6_A1273RecLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            P021R8_A396EmprCod, P021R8_A194BarOrdLin, P021R8_A130BarCodPar, P021R8_A132BarCodReo, P021R8_A129BarCod, P021R8_A150BarFacTin, P021R8_A5369BarFasGral, P021R8_n5369BarFasGral, P021R8_A758ProCod
            }
            , new Object[] {
            P021R9_A396EmprCod, P021R9_A4686MaqTipArt, P021R9_A5195MaqTipArtR, P021R9_n5195MaqTipArtR
            }
            , new Object[] {
            P021R10_A396EmprCod, P021R10_A764ProForCod, P021R10_A4706ProForRb
            }
            , new Object[] {
            P021R11_A764ProForCod, P021R11_A396EmprCod, P021R11_A129BarCod, P021R11_A132BarCodReo, P021R11_A130BarCodPar, P021R11_A194BarOrdLin, P021R11_A5375FasQuiRb, P021R11_A4706ProForRb, P021R11_A5371FasQuiLin, P021R11_A758ProCod
            }
            , new Object[] {
            P021R12_A764ProForCod, P021R12_A396EmprCod, P021R12_A457FasCod, P021R12_A4653FasForRb, P021R12_n4653FasForRb, P021R12_A4706ProForRb, P021R12_A4650FasForLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV67Dt0051 ;
   private byte AV55Cambio_v ;
   private byte AV58BarCodReo ;
   private byte A1273RecLinPro ;
   private byte GXv_int3[] ;
   private short A2804RecLinMaq ;
   private short AV66Ordlin ;
   private short A194BarOrdLin ;
   private short A7944Dtb_ForLin ;
   private short A7934Dtb_Ordl ;
   private short GXv_int5[] ;
   private short A4268RecOrdLin ;
   private short A217BarTipArt ;
   private short AV29BarOrdLin ;
   private short AV43BarTipArt ;
   private short GXv_int7[] ;
   private short AV63Rb_ta ;
   private short A4686MaqTipArt ;
   private short A5195MaqTipArtR ;
   private short AV60Rb ;
   private short A4706ProForRb ;
   private short A5375FasQuiRb ;
   private short A5371FasQuiLin ;
   private short A4653FasForRb ;
   private short A4650FasForLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV48VolMax ;
   private int AV47VolMin ;
   private int A625MaqVolMin ;
   private int A623MaqVolMax ;
   private int AV57BarCod ;
   private int A4695RecVolPrf ;
   private int AV61Volumen ;
   private int AV49Volumen_c ;
   private int AV54VolPrfOld ;
   private int AV33RecVolPrf ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A4271RecFagKgs ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4316RecMaqKgs ;
   private java.math.BigDecimal AV62Kilos ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV46MaqCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A602MaqCod ;
   private String A4258RecMaqFas ;
   private String AV59BarCodPar ;
   private String AV30FasCod ;
   private String A764ProForCod ;
   private String AV34ProForCod ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String AV65Reccal ;
   private String GXv_char1[] ;
   private String A150BarFacTin ;
   private String A5369BarFasGral ;
   private String AV44BarFacTin ;
   private String AV64BarFasGral ;
   private String A457FasCod ;
   private boolean returnInSub ;
   private boolean n625MaqVolMin ;
   private boolean n623MaqVolMax ;
   private boolean n4268RecOrdLin ;
   private boolean n4258RecMaqFas ;
   private boolean n217BarTipArt ;
   private boolean n4271RecFagKgs ;
   private boolean n5369BarFasGral ;
   private boolean n5195MaqTipArtR ;
   private boolean n4653FasForRb ;
   private String AV50Texto_i ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P021R2_A396EmprCod ;
   private int[] P021R2_A129BarCod ;
   private byte[] P021R2_A132BarCodReo ;
   private String[] P021R2_A130BarCodPar ;
   private short[] P021R2_A194BarOrdLin ;
   private short[] P021R2_A7944Dtb_ForLin ;
   private short[] P021R2_A7934Dtb_Ordl ;
   private String[] P021R2_A758ProCod ;
   private String[] P021R3_A396EmprCod ;
   private String[] P021R3_A602MaqCod ;
   private int[] P021R3_A625MaqVolMin ;
   private boolean[] P021R3_n625MaqVolMin ;
   private int[] P021R3_A623MaqVolMax ;
   private boolean[] P021R3_n623MaqVolMax ;
   private String[] P021R5_A396EmprCod ;
   private int[] P021R5_A129BarCod ;
   private byte[] P021R5_A132BarCodReo ;
   private String[] P021R5_A130BarCodPar ;
   private short[] P021R5_A2804RecLinMaq ;
   private short[] P021R5_A4268RecOrdLin ;
   private boolean[] P021R5_n4268RecOrdLin ;
   private String[] P021R5_A4258RecMaqFas ;
   private boolean[] P021R5_n4258RecMaqFas ;
   private short[] P021R5_A217BarTipArt ;
   private boolean[] P021R5_n217BarTipArt ;
   private java.math.BigDecimal[] P021R5_A4271RecFagKgs ;
   private boolean[] P021R5_n4271RecFagKgs ;
   private java.math.BigDecimal[] P021R5_A4259RecTotKgs ;
   private String[] P021R6_A396EmprCod ;
   private int[] P021R6_A129BarCod ;
   private byte[] P021R6_A132BarCodReo ;
   private String[] P021R6_A130BarCodPar ;
   private short[] P021R6_A2804RecLinMaq ;
   private String[] P021R6_A764ProForCod ;
   private int[] P021R6_A4695RecVolPrf ;
   private byte[] P021R6_A1273RecLinPro ;
   private String[] P021R8_A396EmprCod ;
   private short[] P021R8_A194BarOrdLin ;
   private String[] P021R8_A130BarCodPar ;
   private byte[] P021R8_A132BarCodReo ;
   private int[] P021R8_A129BarCod ;
   private String[] P021R8_A150BarFacTin ;
   private String[] P021R8_A5369BarFasGral ;
   private boolean[] P021R8_n5369BarFasGral ;
   private String[] P021R8_A758ProCod ;
   private String[] P021R9_A396EmprCod ;
   private short[] P021R9_A4686MaqTipArt ;
   private short[] P021R9_A5195MaqTipArtR ;
   private boolean[] P021R9_n5195MaqTipArtR ;
   private String[] P021R10_A396EmprCod ;
   private String[] P021R10_A764ProForCod ;
   private short[] P021R10_A4706ProForRb ;
   private String[] P021R11_A764ProForCod ;
   private String[] P021R11_A396EmprCod ;
   private int[] P021R11_A129BarCod ;
   private byte[] P021R11_A132BarCodReo ;
   private String[] P021R11_A130BarCodPar ;
   private short[] P021R11_A194BarOrdLin ;
   private short[] P021R11_A5375FasQuiRb ;
   private short[] P021R11_A4706ProForRb ;
   private short[] P021R11_A5371FasQuiLin ;
   private String[] P021R11_A758ProCod ;
   private String[] P021R12_A764ProForCod ;
   private String[] P021R12_A396EmprCod ;
   private String[] P021R12_A457FasCod ;
   private short[] P021R12_A4653FasForRb ;
   private boolean[] P021R12_n4653FasForRb ;
   private short[] P021R12_A4706ProForRb ;
   private short[] P021R12_A4650FasForLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcammaq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcammaq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcammaq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcammaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021R2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_ForLin, Dtb_Ordl, ProCod FROM TXPDT0051 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl, Dtb_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P021R3", "SELECT EmprCod, MaqCod, MaqVolMin, MaqVolMax FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P021R5", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecOrdLin, T1.RecMaqFas, T2.BarTipArt, COALESCE( T3.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(RecAgrKgs) AS RecFagKgs, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P021R6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, ProForCod, RecVolPrf, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P021R7", "UPDATE TXPCRECET SET RecVolPrf=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new ForEachCursor("P021R8", "SELECT EmprCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, BarFacTin, BarFasGral, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P021R9", "SELECT EmprCod, MaqTipArt, MaqTipArtR FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P021R10", "SELECT EmprCod, ProForCod, ProForRb FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P021R11", "SELECT T1.ProForCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.FasQuiRb, T2.ProForRb, T1.FasQuiLin, T1.ProCod FROM (TXPFASQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P021R12", "SELECT T1.ProForCod, T1.EmprCod, T1.FasCod, T1.FasForRb, T2.ProForRb, T1.FasForLin FROM (TXPFASPR1 T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

