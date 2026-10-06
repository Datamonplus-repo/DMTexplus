package app.recetasdeacabados ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcietina extends GXProcedure
{
   public pcietina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcietina.class ), "" );
   }

   public pcietina( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     String[] aP4 ,
                                     byte[] aP5 ,
                                     short[] aP6 ,
                                     short[] aP7 ,
                                     String[] aP8 ,
                                     String[] aP9 ,
                                     byte[] aP10 ,
                                     int[] aP11 ,
                                     String[] aP12 ,
                                     java.math.BigDecimal[] aP13 ,
                                     String[] aP14 ,
                                     int[] aP15 )
   {
      pcietina.this.aP16 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        short[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        byte[] aP10 ,
                        int[] aP11 ,
                        String[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        String[] aP14 ,
                        int[] aP15 ,
                        java.util.Date[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             String[] aP14 ,
                             int[] aP15 ,
                             java.util.Date[] aP16 )
   {
      pcietina.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcietina.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcietina.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcietina.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcietina.this.AV15CieCerAny = aP4[0];
      this.aP4 = aP4;
      pcietina.this.AV16Consumos = aP5[0];
      this.aP5 = aP5;
      pcietina.this.AV17Anyadi = aP6[0];
      this.aP6 = aP6;
      pcietina.this.AV72recLinMaq = aP7[0];
      this.aP7 = aP7;
      pcietina.this.AV18MaqCod = aP8[0];
      this.aP8 = aP8;
      pcietina.this.AV19Tipo = aP9[0];
      this.aP9 = aP9;
      pcietina.this.AV75Cc_almcod = aP10[0];
      this.aP10 = aP10;
      pcietina.this.AV78RecLtsSR = aP11[0];
      this.aP11 = aP11;
      pcietina.this.AV79Hreacaq = aP12[0];
      this.aP12 = aP12;
      pcietina.this.AV80Abs2 = aP13[0];
      this.aP13 = aP13;
      pcietina.this.AV94productosconsumos = aP14[0];
      this.aP14 = aP14;
      pcietina.this.AV84j = aP15[0];
      this.aP15 = aP15;
      pcietina.this.AV68Fec_t = aP16[0];
      this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV34Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcietina.this.GXt_char1 = GXv_char2[0] ;
      AV34Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char4[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV34Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcietina.this.A396EmprCod = GXv_char2[0] ;
      pcietina.this.AV36EmprNom = GXv_char3[0] ;
      pcietina.this.AV35UsurCod = GXv_char4[0] ;
      GXt_int5 = AV55FlagHisRet ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISRET", ""), GXv_int6) ;
      pcietina.this.GXt_int5 = GXv_int6[0] ;
      AV55FlagHisRet = GXt_int5 ;
      GXt_int5 = AV58Matizar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MATIZA", ""), GXv_int6) ;
      pcietina.this.GXt_int5 = GXv_int6[0] ;
      AV58Matizar = GXt_int5 ;
      GXt_int5 = AV70NCLec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int6) ;
      pcietina.this.GXt_int5 = GXv_int6[0] ;
      AV70NCLec = GXt_int5 ;
      GXt_int5 = AV76Nalmcc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      pcietina.this.GXt_int5 = GXv_int6[0] ;
      AV76Nalmcc = GXt_int5 ;
      GXt_int5 = AV88Anahuac ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ANAHUA", ""), GXv_int6) ;
      pcietina.this.GXt_int5 = GXv_int6[0] ;
      AV88Anahuac = GXt_int5 ;
      if ( AV58Matizar == 1 )
      {
         AV60Dia = (byte)(GXutil.day( AV68Fec_t)) ;
         AV61Mes = (byte)(GXutil.month( AV68Fec_t)) ;
         AV62Any = (short)(GXutil.year( AV68Fec_t)) ;
         AV64TipDefCod = (short)(0) ;
         AV65CodCausa = (short)(0) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int8[0] = AV59Lconti ;
         new app.pmat001(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_int8) ;
         pcietina.this.A396EmprCod = GXv_char4[0] ;
         pcietina.this.A129BarCod = GXv_int7[0] ;
         pcietina.this.A132BarCodReo = GXv_int6[0] ;
         pcietina.this.A130BarCodPar = GXv_char3[0] ;
         pcietina.this.AV59Lconti = GXv_int8[0] ;
      }
      AV31FlagLR = (byte)(0) ;
      AV57RecNumInt = 0 ;
      AV71RecAcab = " " ;
      AV73RECVOLPRD = 0 ;
      /* Using cursor P02LT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV72recLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02LT2_A2804RecLinMaq[0] ;
         A4268RecOrdLin = P02LT2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P02LT2_n4268RecOrdLin[0] ;
         A4258RecMaqFas = P02LT2_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P02LT2_n4258RecMaqFas[0] ;
         A602MaqCod = P02LT2_A602MaqCod[0] ;
         A6039RecAcab = P02LT2_A6039RecAcab[0] ;
         n6039RecAcab = P02LT2_n6039RecAcab[0] ;
         A2805RecVolPrd = P02LT2_A2805RecVolPrd[0] ;
         A4259RecTotKgs = P02LT2_A4259RecTotKgs[0] ;
         AV86RecOrdlin = A4268RecOrdLin ;
         AV87RecMaqFas = A4258RecMaqFas ;
         AV18MaqCod = A602MaqCod ;
         AV71RecAcab = A6039RecAcab ;
         AV72recLinMaq = A2804RecLinMaq ;
         AV73RECVOLPRD = A2805RecVolPrd ;
         AV74RecTotKgs = A4259RecTotKgs ;
         /* Using cursor P02LT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1273RecLinPro = P02LT3_A1273RecLinPro[0] ;
            AV31FlagLR = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV24CosPro = DecimalUtil.doubleToDec(0) ;
      AV25CosAny = DecimalUtil.doubleToDec(0) ;
      GXv_int8[0] = AV29Flag ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOSIFI", ""), GXv_int8) ;
      pcietina.this.AV29Flag = GXv_int8[0] ;
      GXv_int8[0] = AV37FlagFT ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECTIN", ""), GXv_int8) ;
      pcietina.this.AV37FlagFT = GXv_int8[0] ;
      GXv_int8[0] = AV38FlagDia ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIARIO", ""), GXv_int8) ;
      pcietina.this.AV38FlagDia = GXv_int8[0] ;
      GXt_int5 = AV66Ricoltex ;
      GXv_int8[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RICOLT", ""), GXv_int8) ;
      pcietina.this.GXt_int5 = GXv_int8[0] ;
      AV66Ricoltex = GXt_int5 ;
      GXt_int5 = AV67Vertex ;
      GXv_int8[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int8) ;
      pcietina.this.GXt_int5 = GXv_int8[0] ;
      AV67Vertex = GXt_int5 ;
      AV54FlagHss = (byte)(0) ;
      GXv_int8[0] = AV54FlagHss ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int8) ;
      pcietina.this.AV54FlagHss = GXv_int8[0] ;
      GXv_int8[0] = AV33FlagCcs ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int8) ;
      pcietina.this.AV33FlagCcs = GXv_int8[0] ;
      AV81inc_obs = httpContext.getMessage( "Receta ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " # " + GXutil.str( AV72recLinMaq, 4, 0) + GXutil.newLine( ) ;
      AV81inc_obs += httpContext.getMessage( "Go PCALREC. Actualizo Existencias en base a la receta que estoy Cerrando", "") ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV99Pgmname, AV35UsurCod, AV34Station, AV81inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A129BarCod ;
      GXv_int8[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_decimal9[0] = AV24CosPro ;
      GXv_decimal10[0] = AV25CosAny ;
      GXv_int6[0] = AV16Consumos ;
      GXv_int11[0] = AV72recLinMaq ;
      GXv_char2[0] = AV19Tipo ;
      new app.pcalrec(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_decimal9, GXv_decimal10, GXv_int6, GXv_int11, GXv_char2) ;
      pcietina.this.A396EmprCod = GXv_char4[0] ;
      pcietina.this.A129BarCod = GXv_int7[0] ;
      pcietina.this.A132BarCodReo = GXv_int8[0] ;
      pcietina.this.A130BarCodPar = GXv_char3[0] ;
      pcietina.this.AV24CosPro = GXv_decimal9[0] ;
      pcietina.this.AV25CosAny = GXv_decimal10[0] ;
      pcietina.this.AV16Consumos = GXv_int6[0] ;
      pcietina.this.AV72recLinMaq = GXv_int11[0] ;
      pcietina.this.AV19Tipo = GXv_char2[0] ;
      if ( AV38FlagDia == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int8[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int11[0] = AV72recLinMaq ;
         GXv_decimal10[0] = AV40BarCosPD ;
         GXv_decimal9[0] = AV41BarCosAD ;
         GXv_decimal12[0] = AV42BarCosAA ;
         GXv_decimal13[0] = AV43BarCosPA ;
         GXv_decimal14[0] = AV44BarCosCol ;
         GXv_decimal15[0] = AV45BarCosAnc ;
         new app.pcosdab(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_int11, GXv_decimal10, GXv_decimal9, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_decimal15) ;
         pcietina.this.A396EmprCod = GXv_char4[0] ;
         pcietina.this.A129BarCod = GXv_int7[0] ;
         pcietina.this.A132BarCodReo = GXv_int8[0] ;
         pcietina.this.A130BarCodPar = GXv_char3[0] ;
         pcietina.this.AV72recLinMaq = GXv_int11[0] ;
         pcietina.this.AV40BarCosPD = GXv_decimal10[0] ;
         pcietina.this.AV41BarCosAD = GXv_decimal9[0] ;
         pcietina.this.AV42BarCosAA = GXv_decimal12[0] ;
         pcietina.this.AV43BarCosPA = GXv_decimal13[0] ;
         pcietina.this.AV44BarCosCol = GXv_decimal14[0] ;
         pcietina.this.AV45BarCosAnc = GXv_decimal15[0] ;
      }
      AV81inc_obs = httpContext.getMessage( "Receta ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " # " + GXutil.str( AV72recLinMaq, 4, 0) + GXutil.newLine( ) ;
      AV81inc_obs += httpContext.getMessage( "Go PHISRECa. Actualizo tablas Historico: HISREM,HISREH,HISREC,HISLRE,etc", "") ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV99Pgmname, AV35UsurCod, AV34Station, AV81inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A129BarCod ;
      GXv_int8[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int11[0] = AV72recLinMaq ;
      GXv_int16[0] = AV78RecLtsSR ;
      GXv_char2[0] = AV79Hreacaq ;
      GXv_decimal15[0] = AV80Abs2 ;
      GXv_decimal14[0] = AV40BarCosPD ;
      GXv_decimal13[0] = AV41BarCosAD ;
      GXv_decimal12[0] = AV42BarCosAA ;
      GXv_decimal10[0] = AV43BarCosPA ;
      GXv_decimal9[0] = AV44BarCosCol ;
      GXv_decimal17[0] = AV45BarCosAnc ;
      GXv_date18[0] = AV68Fec_t ;
      new app.recetasdeacabados.phisreca(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_int11, GXv_int16, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_decimal10, GXv_decimal9, GXv_decimal17, GXv_date18) ;
      pcietina.this.A396EmprCod = GXv_char4[0] ;
      pcietina.this.A129BarCod = GXv_int7[0] ;
      pcietina.this.A132BarCodReo = GXv_int8[0] ;
      pcietina.this.A130BarCodPar = GXv_char3[0] ;
      pcietina.this.AV72recLinMaq = GXv_int11[0] ;
      pcietina.this.AV78RecLtsSR = GXv_int16[0] ;
      pcietina.this.AV79Hreacaq = GXv_char2[0] ;
      pcietina.this.AV80Abs2 = GXv_decimal15[0] ;
      pcietina.this.AV40BarCosPD = GXv_decimal14[0] ;
      pcietina.this.AV41BarCosAD = GXv_decimal13[0] ;
      pcietina.this.AV42BarCosAA = GXv_decimal12[0] ;
      pcietina.this.AV43BarCosPA = GXv_decimal10[0] ;
      pcietina.this.AV44BarCosCol = GXv_decimal9[0] ;
      pcietina.this.AV45BarCosAnc = GXv_decimal17[0] ;
      pcietina.this.AV68Fec_t = GXv_date18[0] ;
      if ( AV33FlagCcs == 1 )
      {
         AV77FecMov = GXutil.serverNow( context, remoteHandle, pr_default) ;
         AV81inc_obs = httpContext.getMessage( "Receta ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " # " + GXutil.str( AV72recLinMaq, 4, 0) + GXutil.newLine( ) ;
         AV81inc_obs += httpContext.getMessage( "Go PCIECCSm. Actualizo tabla CCSTKS", "") ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV99Pgmname, AV35UsurCod, AV34Station, AV81inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int16[0] = A129BarCod ;
         GXv_int8[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int11[0] = AV72recLinMaq ;
         GXv_char2[0] = AV35UsurCod ;
         GXv_dtime19[0] = AV77FecMov ;
         GXv_int6[0] = AV75Cc_almcod ;
         GXv_char20[0] = httpContext.getMessage( "A", "") ;
         GXv_date18[0] = AV68Fec_t ;
         new app.recetasdeacabados.pclsrcac(remoteHandle, context).execute( GXv_char4, GXv_int16, GXv_int8, GXv_char3, GXv_int11, GXv_char2, GXv_dtime19, GXv_int6, GXv_char20, GXv_date18) ;
         pcietina.this.A396EmprCod = GXv_char4[0] ;
         pcietina.this.A129BarCod = GXv_int16[0] ;
         pcietina.this.A132BarCodReo = GXv_int8[0] ;
         pcietina.this.A130BarCodPar = GXv_char3[0] ;
         pcietina.this.AV72recLinMaq = GXv_int11[0] ;
         pcietina.this.AV35UsurCod = GXv_char2[0] ;
         pcietina.this.AV77FecMov = GXv_dtime19[0] ;
         pcietina.this.AV75Cc_almcod = GXv_int6[0] ;
         pcietina.this.AV68Fec_t = GXv_date18[0] ;
      }
      if ( AV31FlagLR == 1 )
      {
         /* Using cursor P02LT5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A212BarSer = P02LT5_A212BarSer[0] ;
            A3595BarMacCod = P02LT5_A3595BarMacCod[0] ;
            A148BarEstReo = P02LT5_A148BarEstReo[0] ;
            A141BarCosPro = P02LT5_A141BarCosPro[0] ;
            A140BarCosAny = P02LT5_A140BarCosAny[0] ;
            A189BarNumAny = P02LT5_A189BarNumAny[0] ;
            A2498BarPrdPes = P02LT5_A2498BarPrdPes[0] ;
            A3871BarFecCRe = P02LT5_A3871BarFecCRe[0] ;
            A166BarKgm = P02LT5_A166BarKgm[0] ;
            n166BarKgm = P02LT5_n166BarKgm[0] ;
            A166BarKgm = P02LT5_A166BarKgm[0] ;
            n166BarKgm = P02LT5_n166BarKgm[0] ;
            AV39BarAgrLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV57RecNumInt = A3595BarMacCod ;
            if ( AV38FlagDia == 1 )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74RecTotKgs)==0) )
               {
                  AV46BarCosPD1 = GXutil.roundDecimal( A166BarKgm.multiply(AV40BarCosPD).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV47BarCosAD1 = GXutil.roundDecimal( A166BarKgm.multiply(AV41BarCosAD).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV48BarCosAA1 = GXutil.roundDecimal( A166BarKgm.multiply(AV42BarCosAA).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV49BarCosPA1 = GXutil.roundDecimal( A166BarKgm.multiply(AV43BarCosPA).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV50BarCosCol1 = GXutil.roundDecimal( A166BarKgm.multiply(AV44BarCosCol).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV51BarCosAnc1 = GXutil.roundDecimal( A166BarKgm.multiply(AV45BarCosAnc).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
               }
               else
               {
                  AV46BarCosPD1 = DecimalUtil.doubleToDec(0) ;
                  AV47BarCosAD1 = DecimalUtil.doubleToDec(0) ;
                  AV48BarCosAA1 = DecimalUtil.doubleToDec(0) ;
                  AV49BarCosPA1 = DecimalUtil.doubleToDec(0) ;
                  AV50BarCosCol1 = DecimalUtil.doubleToDec(0) ;
                  AV51BarCosAnc1 = DecimalUtil.doubleToDec(0) ;
               }
               AV81inc_obs = httpContext.getMessage( "Receta ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " # " + GXutil.str( AV72recLinMaq, 4, 0) + GXutil.newLine( ) ;
               AV81inc_obs += httpContext.getMessage( "Go cyPESTTIN. Actualizo tabla LCONTI", "") ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV99Pgmname, AV35UsurCod, AV34Station, AV81inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               GXv_char20[0] = A396EmprCod ;
               GXv_int16[0] = A129BarCod ;
               GXv_int8[0] = A132BarCodReo ;
               GXv_char4[0] = A130BarCodPar ;
               GXv_decimal17[0] = AV46BarCosPD1 ;
               GXv_decimal15[0] = AV47BarCosAD1 ;
               GXv_decimal14[0] = AV48BarCosAA1 ;
               GXv_decimal13[0] = AV49BarCosPA1 ;
               GXv_decimal12[0] = AV50BarCosCol1 ;
               GXv_decimal10[0] = AV51BarCosAnc1 ;
               GXv_char3[0] = AV39BarAgrLot ;
               GXv_int7[0] = AV57RecNumInt ;
               GXv_int11[0] = AV63Esttinnr ;
               GXv_char2[0] = AV71RecAcab ;
               GXv_int21[0] = AV72recLinMaq ;
               GXv_int22[0] = AV73RECVOLPRD ;
               GXv_char23[0] = AV18MaqCod ;
               GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal24[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int25[0] = AV86RecOrdlin ;
               GXv_char26[0] = AV87RecMaqFas ;
               GXv_date18[0] = AV68Fec_t ;
               new app.recetasdeacabados.pcyesttin(remoteHandle, context).execute( GXv_char20, GXv_int16, GXv_int8, GXv_char4, GXv_decimal17, GXv_decimal15, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_decimal10, GXv_char3, GXv_int7, GXv_int11, GXv_char2, GXv_int21, GXv_int22, GXv_char23, GXv_decimal9, GXv_decimal24, GXv_int25, GXv_char26, GXv_date18) ;
               pcietina.this.A396EmprCod = GXv_char20[0] ;
               pcietina.this.A129BarCod = GXv_int16[0] ;
               pcietina.this.A132BarCodReo = GXv_int8[0] ;
               pcietina.this.A130BarCodPar = GXv_char4[0] ;
               pcietina.this.AV46BarCosPD1 = GXv_decimal17[0] ;
               pcietina.this.AV47BarCosAD1 = GXv_decimal15[0] ;
               pcietina.this.AV48BarCosAA1 = GXv_decimal14[0] ;
               pcietina.this.AV49BarCosPA1 = GXv_decimal13[0] ;
               pcietina.this.AV50BarCosCol1 = GXv_decimal12[0] ;
               pcietina.this.AV51BarCosAnc1 = GXv_decimal10[0] ;
               pcietina.this.AV39BarAgrLot = GXv_char3[0] ;
               pcietina.this.AV57RecNumInt = GXv_int7[0] ;
               pcietina.this.AV63Esttinnr = GXv_int11[0] ;
               pcietina.this.AV71RecAcab = GXv_char2[0] ;
               pcietina.this.AV72recLinMaq = GXv_int21[0] ;
               pcietina.this.AV73RECVOLPRD = GXv_int22[0] ;
               pcietina.this.AV18MaqCod = GXv_char23[0] ;
               pcietina.this.AV86RecOrdlin = GXv_int25[0] ;
               pcietina.this.AV87RecMaqFas = GXv_char26[0] ;
               pcietina.this.AV68Fec_t = GXv_date18[0] ;
            }
            /* Using cursor P02LT6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A9839Ac_Abs = P02LT6_A9839Ac_Abs[0] ;
               n9839Ac_Abs = P02LT6_n9839Ac_Abs[0] ;
               A6035Ac_Kilos = P02LT6_A6035Ac_Kilos[0] ;
               n6035Ac_Kilos = P02LT6_n6035Ac_Kilos[0] ;
               A6031Ac_Barcod = P02LT6_A6031Ac_Barcod[0] ;
               A6032Ac_BarReo = P02LT6_A6032Ac_BarReo[0] ;
               A6033Ac_BarPar = P02LT6_A6033Ac_BarPar[0] ;
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74RecTotKgs)==0) )
               {
                  AV46BarCosPD1 = GXutil.roundDecimal( A6035Ac_Kilos.multiply(AV40BarCosPD).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV47BarCosAD1 = GXutil.roundDecimal( A6035Ac_Kilos.multiply(AV41BarCosAD).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV48BarCosAA1 = GXutil.roundDecimal( A6035Ac_Kilos.multiply(AV42BarCosAA).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV49BarCosPA1 = GXutil.roundDecimal( A6035Ac_Kilos.multiply(AV43BarCosPA).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV50BarCosCol1 = GXutil.roundDecimal( A6035Ac_Kilos.multiply(AV44BarCosCol).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV51BarCosAnc1 = GXutil.roundDecimal( A6035Ac_Kilos.multiply(AV45BarCosAnc).divide(AV74RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
               }
               else
               {
                  AV46BarCosPD1 = DecimalUtil.doubleToDec(0) ;
                  AV47BarCosAD1 = DecimalUtil.doubleToDec(0) ;
                  AV48BarCosAA1 = DecimalUtil.doubleToDec(0) ;
                  AV49BarCosPA1 = DecimalUtil.doubleToDec(0) ;
                  AV50BarCosCol1 = DecimalUtil.doubleToDec(0) ;
                  AV51BarCosAnc1 = DecimalUtil.doubleToDec(0) ;
               }
               AV89Ac_Barcod = A6031Ac_Barcod ;
               AV90Ac_Barreo = A6032Ac_BarReo ;
               AV91Ac_Barpar = A6033Ac_BarPar ;
               AV92Barordlin = AV86RecOrdlin ;
               AV93Fascod = AV87RecMaqFas ;
               if ( AV88Anahuac == 1 )
               {
                  /* Execute user subroutine: 'BARFAS' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(2);
                     pr_default.close(2);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               AV81inc_obs = httpContext.getMessage( "Receta ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " # " + GXutil.str( AV72recLinMaq, 4, 0) + GXutil.newLine( ) ;
               AV81inc_obs += httpContext.getMessage( "Go cyPESTTIN. Actualizo tabla LCONTI F(Agrupadas)", "") ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV99Pgmname, AV35UsurCod, AV34Station, AV81inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               GXv_char26[0] = A396EmprCod ;
               GXv_int22[0] = A6031Ac_Barcod ;
               GXv_int8[0] = A6032Ac_BarReo ;
               GXv_char23[0] = A6033Ac_BarPar ;
               GXv_decimal24[0] = AV46BarCosPD1 ;
               GXv_decimal17[0] = AV47BarCosAD1 ;
               GXv_decimal15[0] = AV48BarCosAA1 ;
               GXv_decimal14[0] = AV49BarCosPA1 ;
               GXv_decimal13[0] = AV50BarCosCol1 ;
               GXv_decimal12[0] = AV51BarCosAnc1 ;
               GXv_char20[0] = AV39BarAgrLot ;
               GXv_int16[0] = AV57RecNumInt ;
               GXv_int25[0] = AV63Esttinnr ;
               GXv_char4[0] = AV71RecAcab ;
               GXv_int21[0] = AV72recLinMaq ;
               GXv_int7[0] = AV73RECVOLPRD ;
               GXv_char3[0] = AV18MaqCod ;
               GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int11[0] = AV92Barordlin ;
               GXv_char2[0] = AV93Fascod ;
               GXv_date18[0] = AV68Fec_t ;
               new app.recetasdeacabados.pcyesttin(remoteHandle, context).execute( GXv_char26, GXv_int22, GXv_int8, GXv_char23, GXv_decimal24, GXv_decimal17, GXv_decimal15, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_char20, GXv_int16, GXv_int25, GXv_char4, GXv_int21, GXv_int7, GXv_char3, GXv_decimal10, GXv_decimal9, GXv_int11, GXv_char2, GXv_date18) ;
               pcietina.this.A396EmprCod = GXv_char26[0] ;
               pcietina.this.A6031Ac_Barcod = GXv_int22[0] ;
               pcietina.this.A6032Ac_BarReo = GXv_int8[0] ;
               pcietina.this.A6033Ac_BarPar = GXv_char23[0] ;
               pcietina.this.AV46BarCosPD1 = GXv_decimal24[0] ;
               pcietina.this.AV47BarCosAD1 = GXv_decimal17[0] ;
               pcietina.this.AV48BarCosAA1 = GXv_decimal15[0] ;
               pcietina.this.AV49BarCosPA1 = GXv_decimal14[0] ;
               pcietina.this.AV50BarCosCol1 = GXv_decimal13[0] ;
               pcietina.this.AV51BarCosAnc1 = GXv_decimal12[0] ;
               pcietina.this.AV39BarAgrLot = GXv_char20[0] ;
               pcietina.this.AV57RecNumInt = GXv_int16[0] ;
               pcietina.this.AV63Esttinnr = GXv_int25[0] ;
               pcietina.this.AV71RecAcab = GXv_char4[0] ;
               pcietina.this.AV72recLinMaq = GXv_int21[0] ;
               pcietina.this.AV73RECVOLPRD = GXv_int7[0] ;
               pcietina.this.AV18MaqCod = GXv_char3[0] ;
               pcietina.this.AV92Barordlin = GXv_int11[0] ;
               pcietina.this.AV93Fascod = GXv_char2[0] ;
               pcietina.this.AV68Fec_t = GXv_date18[0] ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( ( A148BarEstReo == 1 ) || ( GXutil.strcmp(AV15CieCerAny, httpContext.getMessage( "A", "")) == 0 ) )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74RecTotKgs)==0) )
               {
                  A141BarCosPro = A141BarCosPro.add((AV46BarCosPD1.add(AV49BarCosPA1).add(AV50BarCosCol1))) ;
                  A140BarCosAny = A140BarCosAny.add((AV47BarCosAD1.add(AV48BarCosAA1).add(AV51BarCosAnc1))) ;
               }
               else
               {
                  A141BarCosPro = DecimalUtil.ZERO ;
                  A140BarCosAny = DecimalUtil.ZERO ;
               }
            }
            else
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74RecTotKgs)==0) )
               {
                  A141BarCosPro = AV46BarCosPD1.add(AV49BarCosPA1).add(AV50BarCosCol1) ;
                  A140BarCosAny = AV47BarCosAD1.add(AV48BarCosAA1).add(AV51BarCosAnc1) ;
               }
               else
               {
                  A141BarCosPro = DecimalUtil.ZERO ;
                  A140BarCosAny = DecimalUtil.ZERO ;
               }
            }
            A189BarNumAny = AV17Anyadi ;
            A2498BarPrdPes = httpContext.getMessage( "N", "") ;
            A3871BarFecCRe = Gx_date ;
            AV81inc_obs = httpContext.getMessage( "Receta ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " # " + GXutil.str( AV72recLinMaq, 4, 0) + GXutil.newLine( ) ;
            AV81inc_obs += httpContext.getMessage( "Actualizando BARCAD, costes Barcospro,Barcosany", "") ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV99Pgmname, AV35UsurCod, AV34Station, AV81inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            /* Using cursor P02LT7 */
            pr_default.execute(4, new Object[] {A141BarCosPro, A140BarCosAny, Short.valueOf(A189BarNumAny), A2498BarPrdPes, A3871BarFecCRe, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      GXv_char26[0] = A396EmprCod ;
      GXv_int22[0] = A129BarCod ;
      GXv_int8[0] = A132BarCodReo ;
      GXv_char23[0] = A130BarCodPar ;
      GXv_int25[0] = AV72recLinMaq ;
      GXv_int16[0] = AV84j ;
      GXv_char20[0] = AV94productosconsumos ;
      new app.recetasdeacabados.pprc43(remoteHandle, context).execute( GXv_char26, GXv_int22, GXv_int8, GXv_char23, GXv_int25, GXv_int16, GXv_char20) ;
      pcietina.this.A396EmprCod = GXv_char26[0] ;
      pcietina.this.A129BarCod = GXv_int22[0] ;
      pcietina.this.A132BarCodReo = GXv_int8[0] ;
      pcietina.this.A130BarCodPar = GXv_char23[0] ;
      pcietina.this.AV72recLinMaq = GXv_int25[0] ;
      pcietina.this.AV84j = GXv_int16[0] ;
      pcietina.this.AV94productosconsumos = GXv_char20[0] ;
      System.out.println( Gx_msg+httpContext.getMessage( "Go pcldy07", "") );
      AV81inc_obs = httpContext.getMessage( "Receta ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " # " + GXutil.str( AV72recLinMaq, 4, 0) + GXutil.newLine( ) ;
      AV81inc_obs += httpContext.getMessage( "Go PCLDY07. Elimino Tablas: RECMAQ,CERECT,LRECET,etc", "") ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV99Pgmname, AV35UsurCod, AV34Station, AV81inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      GXv_char26[0] = A396EmprCod ;
      GXv_int22[0] = A129BarCod ;
      GXv_int8[0] = A132BarCodReo ;
      GXv_char23[0] = A130BarCodPar ;
      GXv_int25[0] = AV72recLinMaq ;
      new app.pcldy07(remoteHandle, context).execute( GXv_char26, GXv_int22, GXv_int8, GXv_char23, GXv_int25) ;
      pcietina.this.A396EmprCod = GXv_char26[0] ;
      pcietina.this.A129BarCod = GXv_int22[0] ;
      pcietina.this.A132BarCodReo = GXv_int8[0] ;
      pcietina.this.A130BarCodPar = GXv_char23[0] ;
      pcietina.this.AV72recLinMaq = GXv_int25[0] ;
      System.out.println( Gx_msg+httpContext.getMessage( "Return pcldy07", "") );
      if ( AV70NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recetasdeacabados.pcietina");
      }
      System.out.println( Gx_msg+httpContext.getMessage( "Go pcldy08", "") );
      GXv_char26[0] = A396EmprCod ;
      GXv_int22[0] = A129BarCod ;
      GXv_int8[0] = A132BarCodReo ;
      GXv_char23[0] = A130BarCodPar ;
      GXv_int25[0] = AV72recLinMaq ;
      new app.pcldy06(remoteHandle, context).execute( GXv_char26, GXv_int22, GXv_int8, GXv_char23, GXv_int25) ;
      pcietina.this.A396EmprCod = GXv_char26[0] ;
      pcietina.this.A129BarCod = GXv_int22[0] ;
      pcietina.this.A132BarCodReo = GXv_int8[0] ;
      pcietina.this.A130BarCodPar = GXv_char23[0] ;
      pcietina.this.AV72recLinMaq = GXv_int25[0] ;
      System.out.println( Gx_msg+httpContext.getMessage( "Return pcldy08", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV92Barordlin = (short)(0) ;
      AV93Fascod = " " ;
      /* Using cursor P02LT8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV89Ac_Barcod), Byte.valueOf(AV90Ac_Barreo), AV91Ac_Barpar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A457FasCod = P02LT8_A457FasCod[0] ;
         A194BarOrdLin = P02LT8_A194BarOrdLin[0] ;
         A758ProCod = P02LT8_A758ProCod[0] ;
         if ( GXutil.strcmp(A457FasCod, AV87RecMaqFas) == 0 )
         {
            AV93Fascod = A457FasCod ;
            AV92Barordlin = A194BarOrdLin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( ( AV92Barordlin == 0 ) && ( GXutil.strcmp(AV93Fascod, " ") == 0 ) )
      {
         /* Using cursor P02LT9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV89Ac_Barcod), Byte.valueOf(AV90Ac_Barreo), AV91Ac_Barpar});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A457FasCod = P02LT9_A457FasCod[0] ;
            A194BarOrdLin = P02LT9_A194BarOrdLin[0] ;
            A758ProCod = P02LT9_A758ProCod[0] ;
            if ( GXutil.strcmp(GXutil.substring( A457FasCod, 1, 3), GXutil.substring( AV87RecMaqFas, 1, 3)) == 0 )
            {
               AV93Fascod = A457FasCod ;
               AV92Barordlin = A194BarOrdLin ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcietina.this.A396EmprCod;
      this.aP1[0] = pcietina.this.A129BarCod;
      this.aP2[0] = pcietina.this.A132BarCodReo;
      this.aP3[0] = pcietina.this.A130BarCodPar;
      this.aP4[0] = pcietina.this.AV15CieCerAny;
      this.aP5[0] = pcietina.this.AV16Consumos;
      this.aP6[0] = pcietina.this.AV17Anyadi;
      this.aP7[0] = pcietina.this.AV72recLinMaq;
      this.aP8[0] = pcietina.this.AV18MaqCod;
      this.aP9[0] = pcietina.this.AV19Tipo;
      this.aP10[0] = pcietina.this.AV75Cc_almcod;
      this.aP11[0] = pcietina.this.AV78RecLtsSR;
      this.aP12[0] = pcietina.this.AV79Hreacaq;
      this.aP13[0] = pcietina.this.AV80Abs2;
      this.aP14[0] = pcietina.this.AV94productosconsumos;
      this.aP15[0] = pcietina.this.AV84j;
      this.aP16[0] = pcietina.this.AV68Fec_t;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34Station = "" ;
      GXt_char1 = "" ;
      AV36EmprNom = "" ;
      AV35UsurCod = "" ;
      AV71RecAcab = "" ;
      scmdbuf = "" ;
      P02LT2_A396EmprCod = new String[] {""} ;
      P02LT2_A129BarCod = new int[1] ;
      P02LT2_A132BarCodReo = new byte[1] ;
      P02LT2_A130BarCodPar = new String[] {""} ;
      P02LT2_A2804RecLinMaq = new short[1] ;
      P02LT2_A4268RecOrdLin = new short[1] ;
      P02LT2_n4268RecOrdLin = new boolean[] {false} ;
      P02LT2_A4258RecMaqFas = new String[] {""} ;
      P02LT2_n4258RecMaqFas = new boolean[] {false} ;
      P02LT2_A602MaqCod = new String[] {""} ;
      P02LT2_A6039RecAcab = new String[] {""} ;
      P02LT2_n6039RecAcab = new boolean[] {false} ;
      P02LT2_A2805RecVolPrd = new int[1] ;
      P02LT2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4258RecMaqFas = "" ;
      A602MaqCod = "" ;
      A6039RecAcab = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      AV87RecMaqFas = "" ;
      AV74RecTotKgs = DecimalUtil.ZERO ;
      P02LT3_A396EmprCod = new String[] {""} ;
      P02LT3_A129BarCod = new int[1] ;
      P02LT3_A132BarCodReo = new byte[1] ;
      P02LT3_A130BarCodPar = new String[] {""} ;
      P02LT3_A2804RecLinMaq = new short[1] ;
      P02LT3_A1273RecLinPro = new byte[1] ;
      AV24CosPro = DecimalUtil.ZERO ;
      AV25CosAny = DecimalUtil.ZERO ;
      AV81inc_obs = "" ;
      AV99Pgmname = "" ;
      AV40BarCosPD = DecimalUtil.ZERO ;
      AV41BarCosAD = DecimalUtil.ZERO ;
      AV42BarCosAA = DecimalUtil.ZERO ;
      AV43BarCosPA = DecimalUtil.ZERO ;
      AV44BarCosCol = DecimalUtil.ZERO ;
      AV45BarCosAnc = DecimalUtil.ZERO ;
      AV77FecMov = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime19 = new java.util.Date[1] ;
      GXv_int6 = new byte[1] ;
      P02LT5_A396EmprCod = new String[] {""} ;
      P02LT5_A129BarCod = new int[1] ;
      P02LT5_A132BarCodReo = new byte[1] ;
      P02LT5_A130BarCodPar = new String[] {""} ;
      P02LT5_A212BarSer = new String[] {""} ;
      P02LT5_A3595BarMacCod = new int[1] ;
      P02LT5_A148BarEstReo = new byte[1] ;
      P02LT5_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LT5_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LT5_A189BarNumAny = new short[1] ;
      P02LT5_A2498BarPrdPes = new String[] {""} ;
      P02LT5_A3871BarFecCRe = new java.util.Date[] {GXutil.nullDate()} ;
      P02LT5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LT5_n166BarKgm = new boolean[] {false} ;
      A212BarSer = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A2498BarPrdPes = "" ;
      A3871BarFecCRe = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV39BarAgrLot = "" ;
      AV46BarCosPD1 = DecimalUtil.ZERO ;
      AV47BarCosAD1 = DecimalUtil.ZERO ;
      AV48BarCosAA1 = DecimalUtil.ZERO ;
      AV49BarCosPA1 = DecimalUtil.ZERO ;
      AV50BarCosCol1 = DecimalUtil.ZERO ;
      AV51BarCosAnc1 = DecimalUtil.ZERO ;
      P02LT6_A396EmprCod = new String[] {""} ;
      P02LT6_A129BarCod = new int[1] ;
      P02LT6_A132BarCodReo = new byte[1] ;
      P02LT6_A130BarCodPar = new String[] {""} ;
      P02LT6_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LT6_n9839Ac_Abs = new boolean[] {false} ;
      P02LT6_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LT6_n6035Ac_Kilos = new boolean[] {false} ;
      P02LT6_A6031Ac_Barcod = new int[1] ;
      P02LT6_A6032Ac_BarReo = new byte[1] ;
      P02LT6_A6033Ac_BarPar = new String[] {""} ;
      A9839Ac_Abs = DecimalUtil.ZERO ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6033Ac_BarPar = "" ;
      AV91Ac_Barpar = "" ;
      AV93Fascod = "" ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int21 = new short[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_date18 = new java.util.Date[1] ;
      Gx_date = GXutil.nullDate() ;
      GXv_int16 = new int[1] ;
      GXv_char20 = new String[1] ;
      Gx_msg = "" ;
      GXv_char26 = new String[1] ;
      GXv_int22 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char23 = new String[1] ;
      GXv_int25 = new short[1] ;
      P02LT8_A396EmprCod = new String[] {""} ;
      P02LT8_A130BarCodPar = new String[] {""} ;
      P02LT8_A132BarCodReo = new byte[1] ;
      P02LT8_A129BarCod = new int[1] ;
      P02LT8_A457FasCod = new String[] {""} ;
      P02LT8_A194BarOrdLin = new short[1] ;
      P02LT8_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      P02LT9_A396EmprCod = new String[] {""} ;
      P02LT9_A130BarCodPar = new String[] {""} ;
      P02LT9_A132BarCodReo = new byte[1] ;
      P02LT9_A129BarCod = new int[1] ;
      P02LT9_A457FasCod = new String[] {""} ;
      P02LT9_A194BarOrdLin = new short[1] ;
      P02LT9_A758ProCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pcietina__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pcietina__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pcietina__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pcietina__default(),
         new Object[] {
             new Object[] {
            P02LT2_A396EmprCod, P02LT2_A129BarCod, P02LT2_A132BarCodReo, P02LT2_A130BarCodPar, P02LT2_A2804RecLinMaq, P02LT2_A4268RecOrdLin, P02LT2_n4268RecOrdLin, P02LT2_A4258RecMaqFas, P02LT2_n4258RecMaqFas, P02LT2_A602MaqCod,
            P02LT2_A6039RecAcab, P02LT2_n6039RecAcab, P02LT2_A2805RecVolPrd, P02LT2_A4259RecTotKgs
            }
            , new Object[] {
            P02LT3_A396EmprCod, P02LT3_A129BarCod, P02LT3_A132BarCodReo, P02LT3_A130BarCodPar, P02LT3_A2804RecLinMaq, P02LT3_A1273RecLinPro
            }
            , new Object[] {
            P02LT5_A396EmprCod, P02LT5_A129BarCod, P02LT5_A132BarCodReo, P02LT5_A130BarCodPar, P02LT5_A212BarSer, P02LT5_A3595BarMacCod, P02LT5_A148BarEstReo, P02LT5_A141BarCosPro, P02LT5_A140BarCosAny, P02LT5_A189BarNumAny,
            P02LT5_A2498BarPrdPes, P02LT5_A3871BarFecCRe, P02LT5_A166BarKgm, P02LT5_n166BarKgm
            }
            , new Object[] {
            P02LT6_A396EmprCod, P02LT6_A129BarCod, P02LT6_A132BarCodReo, P02LT6_A130BarCodPar, P02LT6_A9839Ac_Abs, P02LT6_n9839Ac_Abs, P02LT6_A6035Ac_Kilos, P02LT6_n6035Ac_Kilos, P02LT6_A6031Ac_Barcod, P02LT6_A6032Ac_BarReo,
            P02LT6_A6033Ac_BarPar
            }
            , new Object[] {
            }
            , new Object[] {
            P02LT8_A396EmprCod, P02LT8_A130BarCodPar, P02LT8_A132BarCodReo, P02LT8_A129BarCod, P02LT8_A457FasCod, P02LT8_A194BarOrdLin, P02LT8_A758ProCod
            }
            , new Object[] {
            P02LT9_A396EmprCod, P02LT9_A130BarCodPar, P02LT9_A132BarCodReo, P02LT9_A129BarCod, P02LT9_A457FasCod, P02LT9_A194BarOrdLin, P02LT9_A758ProCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV99Pgmname = "RecetasDeAcabados.PCIETINa" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV99Pgmname = "RecetasDeAcabados.PCIETINa" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV16Consumos ;
   private byte AV75Cc_almcod ;
   private byte AV55FlagHisRet ;
   private byte AV58Matizar ;
   private byte AV70NCLec ;
   private byte AV76Nalmcc ;
   private byte AV88Anahuac ;
   private byte AV60Dia ;
   private byte AV61Mes ;
   private byte AV59Lconti ;
   private byte AV31FlagLR ;
   private byte A1273RecLinPro ;
   private byte AV29Flag ;
   private byte AV37FlagFT ;
   private byte AV38FlagDia ;
   private byte AV66Ricoltex ;
   private byte AV67Vertex ;
   private byte GXt_int5 ;
   private byte AV54FlagHss ;
   private byte AV33FlagCcs ;
   private byte GXv_int6[] ;
   private byte A148BarEstReo ;
   private byte A6032Ac_BarReo ;
   private byte AV90Ac_Barreo ;
   private byte GXv_int8[] ;
   private short AV17Anyadi ;
   private short AV72recLinMaq ;
   private short AV62Any ;
   private short AV64TipDefCod ;
   private short AV65CodCausa ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short AV86RecOrdlin ;
   private short A189BarNumAny ;
   private short AV63Esttinnr ;
   private short AV92Barordlin ;
   private short GXv_int21[] ;
   private short GXv_int11[] ;
   private short GXv_int25[] ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV78RecLtsSR ;
   private int AV84j ;
   private int AV57RecNumInt ;
   private int AV73RECVOLPRD ;
   private int A2805RecVolPrd ;
   private int A3595BarMacCod ;
   private int A6031Ac_Barcod ;
   private int AV89Ac_Barcod ;
   private int GXv_int7[] ;
   private int GXv_int16[] ;
   private int GXv_int22[] ;
   private java.math.BigDecimal AV80Abs2 ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal AV74RecTotKgs ;
   private java.math.BigDecimal AV24CosPro ;
   private java.math.BigDecimal AV25CosAny ;
   private java.math.BigDecimal AV40BarCosPD ;
   private java.math.BigDecimal AV41BarCosAD ;
   private java.math.BigDecimal AV42BarCosAA ;
   private java.math.BigDecimal AV43BarCosPA ;
   private java.math.BigDecimal AV44BarCosCol ;
   private java.math.BigDecimal AV45BarCosAnc ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV46BarCosPD1 ;
   private java.math.BigDecimal AV47BarCosAD1 ;
   private java.math.BigDecimal AV48BarCosAA1 ;
   private java.math.BigDecimal AV49BarCosPA1 ;
   private java.math.BigDecimal AV50BarCosCol1 ;
   private java.math.BigDecimal AV51BarCosAnc1 ;
   private java.math.BigDecimal A9839Ac_Abs ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15CieCerAny ;
   private String AV18MaqCod ;
   private String AV19Tipo ;
   private String AV79Hreacaq ;
   private String AV34Station ;
   private String GXt_char1 ;
   private String AV36EmprNom ;
   private String AV35UsurCod ;
   private String AV71RecAcab ;
   private String scmdbuf ;
   private String A4258RecMaqFas ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private String AV87RecMaqFas ;
   private String AV99Pgmname ;
   private String A212BarSer ;
   private String A2498BarPrdPes ;
   private String AV39BarAgrLot ;
   private String A6033Ac_BarPar ;
   private String AV91Ac_Barpar ;
   private String AV93Fascod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char20[] ;
   private String Gx_msg ;
   private String GXv_char26[] ;
   private String GXv_char23[] ;
   private String A457FasCod ;
   private String A758ProCod ;
   private java.util.Date AV77FecMov ;
   private java.util.Date GXv_dtime19[] ;
   private java.util.Date AV68Fec_t ;
   private java.util.Date A3871BarFecCRe ;
   private java.util.Date GXv_date18[] ;
   private java.util.Date Gx_date ;
   private boolean n4268RecOrdLin ;
   private boolean n4258RecMaqFas ;
   private boolean n6039RecAcab ;
   private boolean n166BarKgm ;
   private boolean n9839Ac_Abs ;
   private boolean n6035Ac_Kilos ;
   private boolean returnInSub ;
   private String AV94productosconsumos ;
   private String AV81inc_obs ;
   private java.util.Date[] aP16 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private short[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private byte[] aP10 ;
   private int[] aP11 ;
   private String[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private String[] aP14 ;
   private int[] aP15 ;
   private IDataStoreProvider pr_default ;
   private String[] P02LT2_A396EmprCod ;
   private int[] P02LT2_A129BarCod ;
   private byte[] P02LT2_A132BarCodReo ;
   private String[] P02LT2_A130BarCodPar ;
   private short[] P02LT2_A2804RecLinMaq ;
   private short[] P02LT2_A4268RecOrdLin ;
   private boolean[] P02LT2_n4268RecOrdLin ;
   private String[] P02LT2_A4258RecMaqFas ;
   private boolean[] P02LT2_n4258RecMaqFas ;
   private String[] P02LT2_A602MaqCod ;
   private String[] P02LT2_A6039RecAcab ;
   private boolean[] P02LT2_n6039RecAcab ;
   private int[] P02LT2_A2805RecVolPrd ;
   private java.math.BigDecimal[] P02LT2_A4259RecTotKgs ;
   private String[] P02LT3_A396EmprCod ;
   private int[] P02LT3_A129BarCod ;
   private byte[] P02LT3_A132BarCodReo ;
   private String[] P02LT3_A130BarCodPar ;
   private short[] P02LT3_A2804RecLinMaq ;
   private byte[] P02LT3_A1273RecLinPro ;
   private String[] P02LT5_A396EmprCod ;
   private int[] P02LT5_A129BarCod ;
   private byte[] P02LT5_A132BarCodReo ;
   private String[] P02LT5_A130BarCodPar ;
   private String[] P02LT5_A212BarSer ;
   private int[] P02LT5_A3595BarMacCod ;
   private byte[] P02LT5_A148BarEstReo ;
   private java.math.BigDecimal[] P02LT5_A141BarCosPro ;
   private java.math.BigDecimal[] P02LT5_A140BarCosAny ;
   private short[] P02LT5_A189BarNumAny ;
   private String[] P02LT5_A2498BarPrdPes ;
   private java.util.Date[] P02LT5_A3871BarFecCRe ;
   private java.math.BigDecimal[] P02LT5_A166BarKgm ;
   private boolean[] P02LT5_n166BarKgm ;
   private String[] P02LT6_A396EmprCod ;
   private int[] P02LT6_A129BarCod ;
   private byte[] P02LT6_A132BarCodReo ;
   private String[] P02LT6_A130BarCodPar ;
   private java.math.BigDecimal[] P02LT6_A9839Ac_Abs ;
   private boolean[] P02LT6_n9839Ac_Abs ;
   private java.math.BigDecimal[] P02LT6_A6035Ac_Kilos ;
   private boolean[] P02LT6_n6035Ac_Kilos ;
   private int[] P02LT6_A6031Ac_Barcod ;
   private byte[] P02LT6_A6032Ac_BarReo ;
   private String[] P02LT6_A6033Ac_BarPar ;
   private String[] P02LT8_A396EmprCod ;
   private String[] P02LT8_A130BarCodPar ;
   private byte[] P02LT8_A132BarCodReo ;
   private int[] P02LT8_A129BarCod ;
   private String[] P02LT8_A457FasCod ;
   private short[] P02LT8_A194BarOrdLin ;
   private String[] P02LT8_A758ProCod ;
   private String[] P02LT9_A396EmprCod ;
   private String[] P02LT9_A130BarCodPar ;
   private byte[] P02LT9_A132BarCodReo ;
   private int[] P02LT9_A129BarCod ;
   private String[] P02LT9_A457FasCod ;
   private short[] P02LT9_A194BarOrdLin ;
   private String[] P02LT9_A758ProCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcietina__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcietina__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcietina__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcietina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LT2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecOrdLin, RecMaqFas, MaqCod, RecAcab, RecVolPrd, RecTotKgs FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LT3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LT5", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSer, T1.BarMacCod, T1.BarEstReo, T1.BarCosPro, T1.BarCosAny, T1.BarNumAny, T1.BarPrdPes, T1.BarFecCRe, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LT6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Abs, Ac_Kilos, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02LT7", "UPDATE TXPBARCAD SET BarCosPro=?, BarCosAny=?, BarNumAny=?, BarPrdPes=?, BarFecCRe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02LT8", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02LT9", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

