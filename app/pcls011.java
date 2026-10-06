package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls011 extends GXProcedure
{
   public pcls011( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls011.class ), "" );
   }

   public pcls011( int remoteHandle ,
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
                                     String[] aP10 ,
                                     java.util.Date[] aP11 ,
                                     byte[] aP12 ,
                                     java.math.BigDecimal[] aP13 ,
                                     java.math.BigDecimal[] aP14 ,
                                     byte[] aP15 ,
                                     java.math.BigDecimal[] aP16 ,
                                     java.math.BigDecimal[] aP17 ,
                                     java.math.BigDecimal[] aP18 ,
                                     java.math.BigDecimal[] aP19 ,
                                     java.math.BigDecimal[] aP20 ,
                                     java.math.BigDecimal[] aP21 ,
                                     String[] aP22 )
   {
      pcls011.this.aP23 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23);
      return aP23[0];
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
                        String[] aP10 ,
                        java.util.Date[] aP11 ,
                        byte[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
                        byte[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        java.math.BigDecimal[] aP17 ,
                        java.math.BigDecimal[] aP18 ,
                        java.math.BigDecimal[] aP19 ,
                        java.math.BigDecimal[] aP20 ,
                        java.math.BigDecimal[] aP21 ,
                        String[] aP22 ,
                        java.util.Date[] aP23 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23);
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
                             String[] aP10 ,
                             java.util.Date[] aP11 ,
                             byte[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             byte[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             java.math.BigDecimal[] aP19 ,
                             java.math.BigDecimal[] aP20 ,
                             java.math.BigDecimal[] aP21 ,
                             String[] aP22 ,
                             java.util.Date[] aP23 )
   {
      pcls011.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls011.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcls011.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls011.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls011.this.AV93CieCerAny = aP4[0];
      this.aP4 = aP4;
      pcls011.this.AV96Consumos = aP5[0];
      this.aP5 = aP5;
      pcls011.this.AV71Anyadi = aP6[0];
      this.aP6 = aP6;
      pcls011.this.A2804RecLinMaq = aP7[0];
      this.aP7 = aP7;
      pcls011.this.AV119MaqCod = aP8[0];
      this.aP8 = aP8;
      pcls011.this.AV140Tipo = aP9[0];
      this.aP9 = aP9;
      pcls011.this.AV94CierreAM = aP10[0];
      this.aP10 = aP10;
      pcls011.this.AV90Ca_diahora = aP11[0];
      this.aP11 = aP11;
      pcls011.this.AV91Cc_almcod = aP12[0];
      this.aP12 = aP12;
      pcls011.this.AV99CosPro = aP13[0];
      this.aP13 = aP13;
      pcls011.this.AV98CosAny = aP14[0];
      this.aP14 = aP14;
      pcls011.this.AV96Consumos = aP15[0];
      this.aP15 = aP15;
      pcls011.this.AV87BarCosPD = aP16[0];
      this.aP16 = aP16;
      pcls011.this.AV79BarCosAD = aP17[0];
      this.aP17 = aP17;
      pcls011.this.AV77BarCosAA = aP18[0];
      this.aP18 = aP18;
      pcls011.this.AV85BarCosPA = aP19[0];
      this.aP19 = aP19;
      pcls011.this.AV83BarCosCol = aP20[0];
      this.aP20 = aP20;
      pcls011.this.AV81BarCosAnc = aP21[0];
      this.aP21 = aP21;
      pcls011.this.Gx_msg = aP22[0];
      this.aP22 = aP22;
      pcls011.this.AV145FechaCierre = aP23[0];
      this.aP23 = aP23;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV138Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcls011.this.GXt_char1 = GXv_char2[0] ;
      AV138Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV102EmprNom ;
      GXv_char4[0] = AV143UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV138Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcls011.this.A396EmprCod = GXv_char2[0] ;
      pcls011.this.AV102EmprNom = GXv_char3[0] ;
      pcls011.this.AV143UsurCod = GXv_char4[0] ;
      AV104Fec_t = Gx_date ;
      GXt_int5 = AV111FlagHisRet ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISRET", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV111FlagHisRet = GXt_int5 ;
      GXt_int5 = AV120Matizar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MATIZA", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV120Matizar = GXt_int5 ;
      GXt_int5 = AV124NCLec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV124NCLec = GXt_int5 ;
      GXt_int5 = AV115KGSREA ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KGSREA", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV115KGSREA = GXt_int5 ;
      GXt_int5 = AV105Flag ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOSIFI", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV105Flag = GXt_int5 ;
      GXt_int5 = AV110FlagFT ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECTIN", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV110FlagFT = GXt_int5 ;
      GXt_int5 = AV109FlagDia ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIARIO", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV109FlagDia = GXt_int5 ;
      GXt_int5 = AV137Ricoltex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RICOLT", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV137Ricoltex = GXt_int5 ;
      GXt_int5 = AV144Vertex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV144Vertex = GXt_int5 ;
      GXt_int5 = AV112FlagHss ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV112FlagHss = GXt_int5 ;
      GXt_int5 = AV106Flag2 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BARROS", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV106Flag2 = GXt_int5 ;
      GXt_int5 = AV108FlagCcs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV108FlagCcs = GXt_int5 ;
      GXt_int5 = AV100CtrlRec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRREP", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV100CtrlRec = GXt_int5 ;
      GXt_int5 = AV123Nalmcc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV123Nalmcc = GXt_int5 ;
      GXt_int5 = AV142TyTelas ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TYT", ""), GXv_int6) ;
      pcls011.this.GXt_int5 = GXv_int6[0] ;
      AV142TyTelas = GXt_int5 ;
      AV131RecNumInt = 0 ;
      AV127RecAcab = " " ;
      AV136RecVolprd = 0 ;
      /* Using cursor P055U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P055U2_A6039RecAcab[0] ;
         n6039RecAcab = P055U2_n6039RecAcab[0] ;
         A2805RecVolPrd = P055U2_A2805RecVolPrd[0] ;
         A4259RecTotKgs = P055U2_A4259RecTotKgs[0] ;
         A4260RecTotMts = P055U2_A4260RecTotMts[0] ;
         n4260RecTotMts = P055U2_n4260RecTotMts[0] ;
         A602MaqCod = P055U2_A602MaqCod[0] ;
         AV127RecAcab = A6039RecAcab ;
         AV129RecLinMaq = A2804RecLinMaq ;
         AV136RecVolprd = A2805RecVolPrd ;
         AV133RecTotKgs = A4259RecTotKgs ;
         AV135RecTotMts = A4260RecTotMts ;
         AV119MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P055U5 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3595BarMacCod = P055U5_A3595BarMacCod[0] ;
         A148BarEstReo = P055U5_A148BarEstReo[0] ;
         A141BarCosPro = P055U5_A141BarCosPro[0] ;
         A140BarCosAny = P055U5_A140BarCosAny[0] ;
         A180BarMaqCod = P055U5_A180BarMaqCod[0] ;
         A2759BarMaqGru = P055U5_A2759BarMaqGru[0] ;
         A189BarNumAny = P055U5_A189BarNumAny[0] ;
         A2498BarPrdPes = P055U5_A2498BarPrdPes[0] ;
         A3871BarFecCRe = P055U5_A3871BarFecCRe[0] ;
         A184BarMtr = P055U5_A184BarMtr[0] ;
         A870BarTotMtr = P055U5_A870BarTotMtr[0] ;
         A166BarKgm = P055U5_A166BarKgm[0] ;
         A219BarTotAgr = P055U5_A219BarTotAgr[0] ;
         A870BarTotMtr = P055U5_A870BarTotMtr[0] ;
         A219BarTotAgr = P055U5_A219BarTotAgr[0] ;
         A184BarMtr = P055U5_A184BarMtr[0] ;
         A166BarKgm = P055U5_A166BarKgm[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         if ( A870BarTotMtr.doubleValue() != 0 )
         {
            A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
         }
         else
         {
            A871RecTotMtr = A184BarMtr ;
         }
         Gx_msg = httpContext.getMessage( "Leyendo tabla BARCAD ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV73BarAgrLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV131RecNumInt = A3595BarMacCod ;
         AV133RecTotKgs = ((AV133RecTotKgs.doubleValue()>0) ? AV133RecTotKgs : A812RecTotKgm) ;
         AV135RecTotMts = ((AV135RecTotMts.doubleValue()>0) ? AV135RecTotMts : A871RecTotMtr) ;
         AV132RecTotKgm = ((AV115KGSREA==1) ? AV133RecTotKgs : A812RecTotKgm) ;
         AV134RecTotMtr = ((AV115KGSREA==1) ? AV135RecTotMts : A871RecTotMtr) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133RecTotKgs)==0) )
         {
            if ( AV133RecTotKgs.doubleValue() == 0 )
            {
               AV88BarCosPD1 = GXutil.roundDecimal( A166BarKgm.multiply(AV87BarCosPD).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
               AV80BarCosAD1 = GXutil.roundDecimal( A166BarKgm.multiply(AV79BarCosAD).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
               AV78BarCosAA1 = GXutil.roundDecimal( A166BarKgm.multiply(AV77BarCosAA).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
               AV86BarCosPA1 = GXutil.roundDecimal( A166BarKgm.multiply(AV85BarCosPA).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
               AV84BarCosCol1 = GXutil.roundDecimal( A166BarKgm.multiply(AV83BarCosCol).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
               AV82BarCosAnc1 = GXutil.roundDecimal( A166BarKgm.multiply(AV81BarCosAnc).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
            }
            else
            {
               if ( A166BarKgm.doubleValue() == 0 )
               {
                  AV89BarKgm = AV133RecTotKgs ;
               }
               else
               {
                  AV89BarKgm = A166BarKgm ;
               }
               AV88BarCosPD1 = GXutil.roundDecimal( AV89BarKgm.multiply(AV87BarCosPD).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
               AV80BarCosAD1 = GXutil.roundDecimal( AV89BarKgm.multiply(AV79BarCosAD).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
               AV78BarCosAA1 = GXutil.roundDecimal( AV89BarKgm.multiply(AV77BarCosAA).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
               AV86BarCosPA1 = GXutil.roundDecimal( AV89BarKgm.multiply(AV85BarCosPA).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
               AV84BarCosCol1 = GXutil.roundDecimal( AV89BarKgm.multiply(AV83BarCosCol).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
               AV82BarCosAnc1 = GXutil.roundDecimal( AV89BarKgm.multiply(AV81BarCosAnc).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
            }
         }
         else
         {
            AV88BarCosPD1 = DecimalUtil.doubleToDec(0) ;
            AV80BarCosAD1 = DecimalUtil.doubleToDec(0) ;
            AV78BarCosAA1 = DecimalUtil.doubleToDec(0) ;
            AV86BarCosPA1 = DecimalUtil.doubleToDec(0) ;
            AV84BarCosCol1 = DecimalUtil.doubleToDec(0) ;
            AV82BarCosAnc1 = DecimalUtil.doubleToDec(0) ;
         }
         AV128RecKgm = DecimalUtil.doubleToDec(0) ;
         AV130RecMtr = DecimalUtil.doubleToDec(0) ;
         if ( A812RecTotKgm.doubleValue() > 0 )
         {
            AV128RecKgm = A166BarKgm.multiply(AV132RecTotKgm).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
         }
         if ( A871RecTotMtr.doubleValue() > 0 )
         {
            AV130RecMtr = A184BarMtr.multiply(AV134RecTotMtr).divide(A871RecTotMtr, 18, java.math.RoundingMode.DOWN) ;
         }
         Gx_msg = httpContext.getMessage( "Go Pcls012 ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_decimal8[0] = AV88BarCosPD1 ;
         GXv_decimal9[0] = AV80BarCosAD1 ;
         GXv_decimal10[0] = AV78BarCosAA1 ;
         GXv_decimal11[0] = AV86BarCosPA1 ;
         GXv_decimal12[0] = AV84BarCosCol1 ;
         GXv_decimal13[0] = AV82BarCosAnc1 ;
         GXv_char2[0] = AV73BarAgrLot ;
         GXv_int14[0] = AV131RecNumInt ;
         GXv_int15[0] = AV103Esttinnr ;
         GXv_char16[0] = AV127RecAcab ;
         GXv_int17[0] = AV129RecLinMaq ;
         GXv_int18[0] = AV136RecVolprd ;
         GXv_char19[0] = AV119MaqCod ;
         GXv_decimal20[0] = AV128RecKgm ;
         GXv_decimal21[0] = AV130RecMtr ;
         GXv_date22[0] = AV145FechaCierre ;
         new app.pcls012(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_char2, GXv_int14, GXv_int15, GXv_char16, GXv_int17, GXv_int18, GXv_char19, GXv_decimal20, GXv_decimal21, GXv_date22) ;
         pcls011.this.A396EmprCod = GXv_char4[0] ;
         pcls011.this.A129BarCod = GXv_int7[0] ;
         pcls011.this.A132BarCodReo = GXv_int6[0] ;
         pcls011.this.A130BarCodPar = GXv_char3[0] ;
         pcls011.this.AV88BarCosPD1 = GXv_decimal8[0] ;
         pcls011.this.AV80BarCosAD1 = GXv_decimal9[0] ;
         pcls011.this.AV78BarCosAA1 = GXv_decimal10[0] ;
         pcls011.this.AV86BarCosPA1 = GXv_decimal11[0] ;
         pcls011.this.AV84BarCosCol1 = GXv_decimal12[0] ;
         pcls011.this.AV82BarCosAnc1 = GXv_decimal13[0] ;
         pcls011.this.AV73BarAgrLot = GXv_char2[0] ;
         pcls011.this.AV131RecNumInt = GXv_int14[0] ;
         pcls011.this.AV103Esttinnr = GXv_int15[0] ;
         pcls011.this.AV127RecAcab = GXv_char16[0] ;
         pcls011.this.AV129RecLinMaq = GXv_int17[0] ;
         pcls011.this.AV136RecVolprd = GXv_int18[0] ;
         pcls011.this.AV119MaqCod = GXv_char19[0] ;
         pcls011.this.AV128RecKgm = GXv_decimal20[0] ;
         pcls011.this.AV130RecMtr = GXv_decimal21[0] ;
         pcls011.this.AV145FechaCierre = GXv_date22[0] ;
         Gx_msg = httpContext.getMessage( "Return Pcls012 ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         if ( ( A148BarEstReo == 1 ) || ( GXutil.strcmp(AV93CieCerAny, httpContext.getMessage( "A", "")) == 0 ) )
         {
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) )
            {
               A141BarCosPro = A141BarCosPro.add(GXutil.roundDecimal( A166BarKgm.multiply(AV99CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2)) ;
               A140BarCosAny = A140BarCosAny.add(GXutil.roundDecimal( A166BarKgm.multiply(AV98CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2)) ;
            }
            else
            {
               A141BarCosPro = DecimalUtil.ZERO ;
               A140BarCosAny = DecimalUtil.ZERO ;
            }
         }
         else
         {
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) )
            {
               A141BarCosPro = A141BarCosPro.add((GXutil.roundDecimal( A166BarKgm.multiply(AV99CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2))) ;
               A140BarCosAny = A140BarCosAny.add((GXutil.roundDecimal( A166BarKgm.multiply(AV98CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2))) ;
            }
            else
            {
               A141BarCosPro = DecimalUtil.ZERO ;
               A140BarCosAny = DecimalUtil.ZERO ;
            }
         }
         A180BarMaqCod = AV119MaqCod ;
         A2759BarMaqGru = GXutil.substring( AV119MaqCod, 1, 4) ;
         A189BarNumAny = AV71Anyadi ;
         A2498BarPrdPes = httpContext.getMessage( "N", "") ;
         A3871BarFecCRe = GXutil.today( ) ;
         /* Using cursor P055U6 */
         pr_default.execute(2, new Object[] {A141BarCosPro, A140BarCosAny, A180BarMaqCod, A2759BarMaqGru, Short.valueOf(A189BarNumAny), A2498BarPrdPes, A3871BarFecCRe, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls011.this.A396EmprCod;
      this.aP1[0] = pcls011.this.A129BarCod;
      this.aP2[0] = pcls011.this.A132BarCodReo;
      this.aP3[0] = pcls011.this.A130BarCodPar;
      this.aP4[0] = pcls011.this.AV93CieCerAny;
      this.aP5[0] = pcls011.this.AV96Consumos;
      this.aP6[0] = pcls011.this.AV71Anyadi;
      this.aP7[0] = pcls011.this.A2804RecLinMaq;
      this.aP8[0] = pcls011.this.AV119MaqCod;
      this.aP9[0] = pcls011.this.AV140Tipo;
      this.aP10[0] = pcls011.this.AV94CierreAM;
      this.aP11[0] = pcls011.this.AV90Ca_diahora;
      this.aP12[0] = pcls011.this.AV91Cc_almcod;
      this.aP13[0] = pcls011.this.AV99CosPro;
      this.aP14[0] = pcls011.this.AV98CosAny;
      this.aP15[0] = pcls011.this.AV96Consumos;
      this.aP16[0] = pcls011.this.AV87BarCosPD;
      this.aP17[0] = pcls011.this.AV79BarCosAD;
      this.aP18[0] = pcls011.this.AV77BarCosAA;
      this.aP19[0] = pcls011.this.AV85BarCosPA;
      this.aP20[0] = pcls011.this.AV83BarCosCol;
      this.aP21[0] = pcls011.this.AV81BarCosAnc;
      this.aP22[0] = pcls011.this.Gx_msg;
      this.aP23[0] = pcls011.this.AV145FechaCierre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV138Station = "" ;
      GXt_char1 = "" ;
      AV102EmprNom = "" ;
      AV143UsurCod = "" ;
      AV104Fec_t = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      AV127RecAcab = "" ;
      scmdbuf = "" ;
      P055U2_A396EmprCod = new String[] {""} ;
      P055U2_A129BarCod = new int[1] ;
      P055U2_A132BarCodReo = new byte[1] ;
      P055U2_A130BarCodPar = new String[] {""} ;
      P055U2_A2804RecLinMaq = new short[1] ;
      P055U2_A6039RecAcab = new String[] {""} ;
      P055U2_n6039RecAcab = new boolean[] {false} ;
      P055U2_A2805RecVolPrd = new int[1] ;
      P055U2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055U2_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055U2_n4260RecTotMts = new boolean[] {false} ;
      P055U2_A602MaqCod = new String[] {""} ;
      A6039RecAcab = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      AV133RecTotKgs = DecimalUtil.ZERO ;
      AV135RecTotMts = DecimalUtil.ZERO ;
      P055U5_A396EmprCod = new String[] {""} ;
      P055U5_A129BarCod = new int[1] ;
      P055U5_A132BarCodReo = new byte[1] ;
      P055U5_A130BarCodPar = new String[] {""} ;
      P055U5_A3595BarMacCod = new int[1] ;
      P055U5_A148BarEstReo = new byte[1] ;
      P055U5_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055U5_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055U5_A180BarMaqCod = new String[] {""} ;
      P055U5_A2759BarMaqGru = new String[] {""} ;
      P055U5_A189BarNumAny = new short[1] ;
      P055U5_A2498BarPrdPes = new String[] {""} ;
      P055U5_A3871BarFecCRe = new java.util.Date[] {GXutil.nullDate()} ;
      P055U5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055U5_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055U5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055U5_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A180BarMaqCod = "" ;
      A2759BarMaqGru = "" ;
      A2498BarPrdPes = "" ;
      A3871BarFecCRe = GXutil.nullDate() ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      AV73BarAgrLot = "" ;
      AV132RecTotKgm = DecimalUtil.ZERO ;
      AV134RecTotMtr = DecimalUtil.ZERO ;
      AV88BarCosPD1 = DecimalUtil.ZERO ;
      AV80BarCosAD1 = DecimalUtil.ZERO ;
      AV78BarCosAA1 = DecimalUtil.ZERO ;
      AV86BarCosPA1 = DecimalUtil.ZERO ;
      AV84BarCosCol1 = DecimalUtil.ZERO ;
      AV82BarCosAnc1 = DecimalUtil.ZERO ;
      AV89BarKgm = DecimalUtil.ZERO ;
      AV128RecKgm = DecimalUtil.ZERO ;
      AV130RecMtr = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int15 = new short[1] ;
      GXv_char16 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new int[1] ;
      GXv_char19 = new String[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_date22 = new java.util.Date[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls011__default(),
         new Object[] {
             new Object[] {
            P055U2_A396EmprCod, P055U2_A129BarCod, P055U2_A132BarCodReo, P055U2_A130BarCodPar, P055U2_A2804RecLinMaq, P055U2_A6039RecAcab, P055U2_n6039RecAcab, P055U2_A2805RecVolPrd, P055U2_A4259RecTotKgs, P055U2_A4260RecTotMts,
            P055U2_n4260RecTotMts, P055U2_A602MaqCod
            }
            , new Object[] {
            P055U5_A396EmprCod, P055U5_A129BarCod, P055U5_A132BarCodReo, P055U5_A130BarCodPar, P055U5_A3595BarMacCod, P055U5_A148BarEstReo, P055U5_A141BarCosPro, P055U5_A140BarCosAny, P055U5_A180BarMaqCod, P055U5_A2759BarMaqGru,
            P055U5_A189BarNumAny, P055U5_A2498BarPrdPes, P055U5_A3871BarFecCRe, P055U5_A184BarMtr, P055U5_A870BarTotMtr, P055U5_A166BarKgm, P055U5_A219BarTotAgr
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV96Consumos ;
   private byte AV91Cc_almcod ;
   private byte AV111FlagHisRet ;
   private byte AV120Matizar ;
   private byte AV124NCLec ;
   private byte AV115KGSREA ;
   private byte AV105Flag ;
   private byte AV110FlagFT ;
   private byte AV109FlagDia ;
   private byte AV137Ricoltex ;
   private byte AV144Vertex ;
   private byte AV112FlagHss ;
   private byte AV106Flag2 ;
   private byte AV108FlagCcs ;
   private byte AV100CtrlRec ;
   private byte AV123Nalmcc ;
   private byte AV142TyTelas ;
   private byte GXt_int5 ;
   private byte A148BarEstReo ;
   private byte GXv_int6[] ;
   private short AV71Anyadi ;
   private short A2804RecLinMaq ;
   private short AV129RecLinMaq ;
   private short A189BarNumAny ;
   private short AV103Esttinnr ;
   private short GXv_int15[] ;
   private short GXv_int17[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV131RecNumInt ;
   private int AV136RecVolprd ;
   private int A2805RecVolPrd ;
   private int A3595BarMacCod ;
   private int GXv_int7[] ;
   private int GXv_int14[] ;
   private int GXv_int18[] ;
   private java.math.BigDecimal AV99CosPro ;
   private java.math.BigDecimal AV98CosAny ;
   private java.math.BigDecimal AV87BarCosPD ;
   private java.math.BigDecimal AV79BarCosAD ;
   private java.math.BigDecimal AV77BarCosAA ;
   private java.math.BigDecimal AV85BarCosPA ;
   private java.math.BigDecimal AV83BarCosCol ;
   private java.math.BigDecimal AV81BarCosAnc ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4260RecTotMts ;
   private java.math.BigDecimal AV133RecTotKgs ;
   private java.math.BigDecimal AV135RecTotMts ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal AV132RecTotKgm ;
   private java.math.BigDecimal AV134RecTotMtr ;
   private java.math.BigDecimal AV88BarCosPD1 ;
   private java.math.BigDecimal AV80BarCosAD1 ;
   private java.math.BigDecimal AV78BarCosAA1 ;
   private java.math.BigDecimal AV86BarCosPA1 ;
   private java.math.BigDecimal AV84BarCosCol1 ;
   private java.math.BigDecimal AV82BarCosAnc1 ;
   private java.math.BigDecimal AV89BarKgm ;
   private java.math.BigDecimal AV128RecKgm ;
   private java.math.BigDecimal AV130RecMtr ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV93CieCerAny ;
   private String AV119MaqCod ;
   private String AV140Tipo ;
   private String AV94CierreAM ;
   private String Gx_msg ;
   private String AV138Station ;
   private String GXt_char1 ;
   private String AV102EmprNom ;
   private String AV143UsurCod ;
   private String AV127RecAcab ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A602MaqCod ;
   private String A180BarMaqCod ;
   private String A2759BarMaqGru ;
   private String A2498BarPrdPes ;
   private String AV73BarAgrLot ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char16[] ;
   private String GXv_char19[] ;
   private java.util.Date AV90Ca_diahora ;
   private java.util.Date AV145FechaCierre ;
   private java.util.Date AV104Fec_t ;
   private java.util.Date Gx_date ;
   private java.util.Date A3871BarFecCRe ;
   private java.util.Date GXv_date22[] ;
   private boolean n6039RecAcab ;
   private boolean n4260RecTotMts ;
   private java.util.Date[] aP23 ;
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
   private String[] aP10 ;
   private java.util.Date[] aP11 ;
   private byte[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
   private byte[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private java.math.BigDecimal[] aP17 ;
   private java.math.BigDecimal[] aP18 ;
   private java.math.BigDecimal[] aP19 ;
   private java.math.BigDecimal[] aP20 ;
   private java.math.BigDecimal[] aP21 ;
   private String[] aP22 ;
   private IDataStoreProvider pr_default ;
   private String[] P055U2_A396EmprCod ;
   private int[] P055U2_A129BarCod ;
   private byte[] P055U2_A132BarCodReo ;
   private String[] P055U2_A130BarCodPar ;
   private short[] P055U2_A2804RecLinMaq ;
   private String[] P055U2_A6039RecAcab ;
   private boolean[] P055U2_n6039RecAcab ;
   private int[] P055U2_A2805RecVolPrd ;
   private java.math.BigDecimal[] P055U2_A4259RecTotKgs ;
   private java.math.BigDecimal[] P055U2_A4260RecTotMts ;
   private boolean[] P055U2_n4260RecTotMts ;
   private String[] P055U2_A602MaqCod ;
   private String[] P055U5_A396EmprCod ;
   private int[] P055U5_A129BarCod ;
   private byte[] P055U5_A132BarCodReo ;
   private String[] P055U5_A130BarCodPar ;
   private int[] P055U5_A3595BarMacCod ;
   private byte[] P055U5_A148BarEstReo ;
   private java.math.BigDecimal[] P055U5_A141BarCosPro ;
   private java.math.BigDecimal[] P055U5_A140BarCosAny ;
   private String[] P055U5_A180BarMaqCod ;
   private String[] P055U5_A2759BarMaqGru ;
   private short[] P055U5_A189BarNumAny ;
   private String[] P055U5_A2498BarPrdPes ;
   private java.util.Date[] P055U5_A3871BarFecCRe ;
   private java.math.BigDecimal[] P055U5_A184BarMtr ;
   private java.math.BigDecimal[] P055U5_A870BarTotMtr ;
   private java.math.BigDecimal[] P055U5_A166BarKgm ;
   private java.math.BigDecimal[] P055U5_A219BarTotAgr ;
}

final  class pcls011__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055U2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecAcab, RecVolPrd, RecTotKgs, RecTotMts, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055U5", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarMacCod, T1.BarEstReo, T1.BarCosPro, T1.BarCosAny, T1.BarMaqCod, T1.BarMaqGru, T1.BarNumAny, T1.BarPrdPes, T1.BarFecCRe, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T2.BarTotMtr, 0) AS BarTotMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055U6", "UPDATE TXPBARCAD SET BarCosPro=?, BarCosAny=?, BarMaqCod=?, BarMaqGru=?, BarNumAny=?, BarPrdPes=?, BarFecCRe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
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
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 4);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               return;
      }
   }

}

