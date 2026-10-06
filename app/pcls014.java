package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls014 extends GXProcedure
{
   public pcls014( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls014.class ), "" );
   }

   public pcls014( int remoteHandle ,
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
      pcls014.this.aP23 = new java.util.Date[] {GXutil.nullDate()};
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
      pcls014.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls014.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcls014.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls014.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls014.this.AV93CieCerAny = aP4[0];
      this.aP4 = aP4;
      pcls014.this.AV96Consumos = aP5[0];
      this.aP5 = aP5;
      pcls014.this.AV71Anyadi = aP6[0];
      this.aP6 = aP6;
      pcls014.this.A2804RecLinMaq = aP7[0];
      this.aP7 = aP7;
      pcls014.this.AV119MaqCod = aP8[0];
      this.aP8 = aP8;
      pcls014.this.AV140Tipo = aP9[0];
      this.aP9 = aP9;
      pcls014.this.AV94CierreAM = aP10[0];
      this.aP10 = aP10;
      pcls014.this.AV90Ca_diahora = aP11[0];
      this.aP11 = aP11;
      pcls014.this.AV91Cc_almcod = aP12[0];
      this.aP12 = aP12;
      pcls014.this.AV99CosPro = aP13[0];
      this.aP13 = aP13;
      pcls014.this.AV98CosAny = aP14[0];
      this.aP14 = aP14;
      pcls014.this.AV96Consumos = aP15[0];
      this.aP15 = aP15;
      pcls014.this.AV87BarCosPD = aP16[0];
      this.aP16 = aP16;
      pcls014.this.AV79BarCosAD = aP17[0];
      this.aP17 = aP17;
      pcls014.this.AV77BarCosAA = aP18[0];
      this.aP18 = aP18;
      pcls014.this.AV85BarCosPA = aP19[0];
      this.aP19 = aP19;
      pcls014.this.AV83BarCosCol = aP20[0];
      this.aP20 = aP20;
      pcls014.this.AV81BarCosAnc = aP21[0];
      this.aP21 = aP21;
      pcls014.this.Gx_msg = aP22[0];
      this.aP22 = aP22;
      pcls014.this.AV145FechaCierre = aP23[0];
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
      pcls014.this.GXt_char1 = GXv_char2[0] ;
      AV138Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV102EmprNom ;
      GXv_char4[0] = AV143UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV138Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcls014.this.A396EmprCod = GXv_char2[0] ;
      pcls014.this.AV102EmprNom = GXv_char3[0] ;
      pcls014.this.AV143UsurCod = GXv_char4[0] ;
      AV104Fec_t = Gx_date ;
      GXt_int5 = AV111FlagHisRet ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISRET", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV111FlagHisRet = GXt_int5 ;
      GXt_int5 = AV120Matizar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MATIZA", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV120Matizar = GXt_int5 ;
      GXt_int5 = AV124NCLec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV124NCLec = GXt_int5 ;
      GXt_int5 = AV115KGSREA ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KGSREA", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV115KGSREA = GXt_int5 ;
      GXt_int5 = AV105Flag ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOSIFI", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV105Flag = GXt_int5 ;
      GXt_int5 = AV110FlagFT ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECTIN", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV110FlagFT = GXt_int5 ;
      GXt_int5 = AV109FlagDia ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIARIO", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV109FlagDia = GXt_int5 ;
      GXt_int5 = AV137Ricoltex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RICOLT", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV137Ricoltex = GXt_int5 ;
      GXt_int5 = AV144Vertex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV144Vertex = GXt_int5 ;
      GXt_int5 = AV112FlagHss ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV112FlagHss = GXt_int5 ;
      GXt_int5 = AV106Flag2 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BARROS", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV106Flag2 = GXt_int5 ;
      GXt_int5 = AV108FlagCcs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV108FlagCcs = GXt_int5 ;
      GXt_int5 = AV100CtrlRec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRREP", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV100CtrlRec = GXt_int5 ;
      GXt_int5 = AV123Nalmcc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV123Nalmcc = GXt_int5 ;
      GXt_int5 = AV142TyTelas ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TYT", ""), GXv_int6) ;
      pcls014.this.GXt_int5 = GXv_int6[0] ;
      AV142TyTelas = GXt_int5 ;
      AV131RecNumInt = 0 ;
      AV127RecAcab = " " ;
      AV136RecVolprd = 0 ;
      /* Using cursor P055W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P055W2_A6039RecAcab[0] ;
         n6039RecAcab = P055W2_n6039RecAcab[0] ;
         A2805RecVolPrd = P055W2_A2805RecVolPrd[0] ;
         A4259RecTotKgs = P055W2_A4259RecTotKgs[0] ;
         A4260RecTotMts = P055W2_A4260RecTotMts[0] ;
         n4260RecTotMts = P055W2_n4260RecTotMts[0] ;
         A602MaqCod = P055W2_A602MaqCod[0] ;
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
      /* Using cursor P055W5 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3595BarMacCod = P055W5_A3595BarMacCod[0] ;
         A184BarMtr = P055W5_A184BarMtr[0] ;
         A870BarTotMtr = P055W5_A870BarTotMtr[0] ;
         A166BarKgm = P055W5_A166BarKgm[0] ;
         A219BarTotAgr = P055W5_A219BarTotAgr[0] ;
         A870BarTotMtr = P055W5_A870BarTotMtr[0] ;
         A219BarTotAgr = P055W5_A219BarTotAgr[0] ;
         A184BarMtr = P055W5_A184BarMtr[0] ;
         A166BarKgm = P055W5_A166BarKgm[0] ;
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
         /* Using cursor P055W6 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A122BarAgrPar = P055W6_A122BarAgrPar[0] ;
            A124BarAgrReo = P055W6_A124BarAgrReo[0] ;
            A119BarAgrCod = P055W6_A119BarAgrCod[0] ;
            Gx_msg = httpContext.getMessage( "Leyendo tabla BARAGR ", "") + GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int7[0] = A119BarAgrCod ;
            GXv_int6[0] = A124BarAgrReo ;
            GXv_char3[0] = A122BarAgrPar ;
            GXv_decimal8[0] = AV99CosPro ;
            GXv_decimal9[0] = AV98CosAny ;
            GXv_char2[0] = AV119MaqCod ;
            GXv_int10[0] = AV71Anyadi ;
            GXv_char11[0] = AV93CieCerAny ;
            new app.pcls022(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_decimal8, GXv_decimal9, GXv_char2, GXv_int10, GXv_char11) ;
            pcls014.this.A396EmprCod = GXv_char4[0] ;
            pcls014.this.A119BarAgrCod = GXv_int7[0] ;
            pcls014.this.A124BarAgrReo = GXv_int6[0] ;
            pcls014.this.A122BarAgrPar = GXv_char3[0] ;
            pcls014.this.AV99CosPro = GXv_decimal8[0] ;
            pcls014.this.AV98CosAny = GXv_decimal9[0] ;
            pcls014.this.AV119MaqCod = GXv_char2[0] ;
            pcls014.this.AV71Anyadi = GXv_int10[0] ;
            pcls014.this.AV93CieCerAny = GXv_char11[0] ;
            AV117Kilos = DecimalUtil.doubleToDec(0) ;
            GXv_char11[0] = A396EmprCod ;
            GXv_int7[0] = A119BarAgrCod ;
            GXv_int6[0] = A124BarAgrReo ;
            GXv_char4[0] = A122BarAgrPar ;
            GXv_decimal9[0] = AV117Kilos ;
            new app.pkilos(remoteHandle, context).execute( GXv_char11, GXv_int7, GXv_int6, GXv_char4, GXv_decimal9) ;
            pcls014.this.A396EmprCod = GXv_char11[0] ;
            pcls014.this.A119BarAgrCod = GXv_int7[0] ;
            pcls014.this.A124BarAgrReo = GXv_int6[0] ;
            pcls014.this.A122BarAgrPar = GXv_char4[0] ;
            pcls014.this.AV117Kilos = GXv_decimal9[0] ;
            AV122Metros = DecimalUtil.doubleToDec(0) ;
            GXv_char11[0] = A396EmprCod ;
            GXv_int7[0] = A119BarAgrCod ;
            GXv_int6[0] = A124BarAgrReo ;
            GXv_char4[0] = A122BarAgrPar ;
            GXv_decimal9[0] = AV122Metros ;
            new app.pmetros(remoteHandle, context).execute( GXv_char11, GXv_int7, GXv_int6, GXv_char4, GXv_decimal9) ;
            pcls014.this.A396EmprCod = GXv_char11[0] ;
            pcls014.this.A119BarAgrCod = GXv_int7[0] ;
            pcls014.this.A124BarAgrReo = GXv_int6[0] ;
            pcls014.this.A122BarAgrPar = GXv_char4[0] ;
            pcls014.this.AV122Metros = GXv_decimal9[0] ;
            AV133RecTotKgs = ((AV133RecTotKgs.doubleValue()>0) ? AV133RecTotKgs : A812RecTotKgm) ;
            AV135RecTotMts = ((AV135RecTotMts.doubleValue()>0) ? AV135RecTotMts : A871RecTotMtr) ;
            AV132RecTotKgm = ((AV115KGSREA==1) ? AV133RecTotKgs : A812RecTotKgm) ;
            AV134RecTotMtr = ((AV115KGSREA==1) ? AV135RecTotMts : A871RecTotMtr) ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133RecTotKgs)==0) )
            {
               if ( AV133RecTotKgs.doubleValue() == 0 )
               {
                  AV88BarCosPD1 = GXutil.roundDecimal( AV117Kilos.multiply(AV87BarCosPD).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV80BarCosAD1 = GXutil.roundDecimal( AV117Kilos.multiply(AV79BarCosAD).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV78BarCosAA1 = GXutil.roundDecimal( AV117Kilos.multiply(AV77BarCosAA).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV86BarCosPA1 = GXutil.roundDecimal( AV117Kilos.multiply(AV85BarCosPA).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV84BarCosCol1 = GXutil.roundDecimal( AV117Kilos.multiply(AV83BarCosCol).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV82BarCosAnc1 = GXutil.roundDecimal( AV117Kilos.multiply(AV81BarCosAnc).divide(AV132RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
               }
               else
               {
                  if ( AV117Kilos.doubleValue() == 0 )
                  {
                     AV117Kilos = AV133RecTotKgs ;
                  }
                  AV88BarCosPD1 = GXutil.roundDecimal( AV117Kilos.multiply(AV87BarCosPD).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV80BarCosAD1 = GXutil.roundDecimal( AV117Kilos.multiply(AV79BarCosAD).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV78BarCosAA1 = GXutil.roundDecimal( AV117Kilos.multiply(AV77BarCosAA).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV86BarCosPA1 = GXutil.roundDecimal( AV117Kilos.multiply(AV85BarCosPA).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV84BarCosCol1 = GXutil.roundDecimal( AV117Kilos.multiply(AV83BarCosCol).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV82BarCosAnc1 = GXutil.roundDecimal( AV117Kilos.multiply(AV81BarCosAnc).divide(AV133RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
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
               AV128RecKgm = AV117Kilos.multiply(AV132RecTotKgm).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
            }
            if ( A871RecTotMtr.doubleValue() > 0 )
            {
               AV130RecMtr = AV122Metros.multiply(AV134RecTotMtr).divide(A871RecTotMtr, 18, java.math.RoundingMode.DOWN) ;
            }
            Gx_msg = httpContext.getMessage( "Go Pcls012", "") + httpContext.getMessage( "Leyendo tabla BARAGR ", "") + GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
            GXv_char11[0] = A396EmprCod ;
            GXv_int7[0] = A119BarAgrCod ;
            GXv_int6[0] = A124BarAgrReo ;
            GXv_char4[0] = A122BarAgrPar ;
            GXv_decimal9[0] = AV88BarCosPD1 ;
            GXv_decimal8[0] = AV80BarCosAD1 ;
            GXv_decimal12[0] = AV78BarCosAA1 ;
            GXv_decimal13[0] = AV86BarCosPA1 ;
            GXv_decimal14[0] = AV84BarCosCol1 ;
            GXv_decimal15[0] = AV82BarCosAnc1 ;
            GXv_char3[0] = AV73BarAgrLot ;
            GXv_int16[0] = AV131RecNumInt ;
            GXv_int10[0] = AV103Esttinnr ;
            GXv_char2[0] = AV127RecAcab ;
            GXv_int17[0] = AV129RecLinMaq ;
            GXv_int18[0] = AV136RecVolprd ;
            GXv_char19[0] = AV119MaqCod ;
            GXv_decimal20[0] = AV128RecKgm ;
            GXv_decimal21[0] = AV130RecMtr ;
            GXv_date22[0] = AV145FechaCierre ;
            new app.pcls012(remoteHandle, context).execute( GXv_char11, GXv_int7, GXv_int6, GXv_char4, GXv_decimal9, GXv_decimal8, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_char3, GXv_int16, GXv_int10, GXv_char2, GXv_int17, GXv_int18, GXv_char19, GXv_decimal20, GXv_decimal21, GXv_date22) ;
            pcls014.this.A396EmprCod = GXv_char11[0] ;
            pcls014.this.A119BarAgrCod = GXv_int7[0] ;
            pcls014.this.A124BarAgrReo = GXv_int6[0] ;
            pcls014.this.A122BarAgrPar = GXv_char4[0] ;
            pcls014.this.AV88BarCosPD1 = GXv_decimal9[0] ;
            pcls014.this.AV80BarCosAD1 = GXv_decimal8[0] ;
            pcls014.this.AV78BarCosAA1 = GXv_decimal12[0] ;
            pcls014.this.AV86BarCosPA1 = GXv_decimal13[0] ;
            pcls014.this.AV84BarCosCol1 = GXv_decimal14[0] ;
            pcls014.this.AV82BarCosAnc1 = GXv_decimal15[0] ;
            pcls014.this.AV73BarAgrLot = GXv_char3[0] ;
            pcls014.this.AV131RecNumInt = GXv_int16[0] ;
            pcls014.this.AV103Esttinnr = GXv_int10[0] ;
            pcls014.this.AV127RecAcab = GXv_char2[0] ;
            pcls014.this.AV129RecLinMaq = GXv_int17[0] ;
            pcls014.this.AV136RecVolprd = GXv_int18[0] ;
            pcls014.this.AV119MaqCod = GXv_char19[0] ;
            pcls014.this.AV128RecKgm = GXv_decimal20[0] ;
            pcls014.this.AV130RecMtr = GXv_decimal21[0] ;
            pcls014.this.AV145FechaCierre = GXv_date22[0] ;
            Gx_msg = httpContext.getMessage( "Return Pcls012", "") + httpContext.getMessage( "Leyendo tabla BARAGR ", "") + GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls014.this.A396EmprCod;
      this.aP1[0] = pcls014.this.A129BarCod;
      this.aP2[0] = pcls014.this.A132BarCodReo;
      this.aP3[0] = pcls014.this.A130BarCodPar;
      this.aP4[0] = pcls014.this.AV93CieCerAny;
      this.aP5[0] = pcls014.this.AV96Consumos;
      this.aP6[0] = pcls014.this.AV71Anyadi;
      this.aP7[0] = pcls014.this.A2804RecLinMaq;
      this.aP8[0] = pcls014.this.AV119MaqCod;
      this.aP9[0] = pcls014.this.AV140Tipo;
      this.aP10[0] = pcls014.this.AV94CierreAM;
      this.aP11[0] = pcls014.this.AV90Ca_diahora;
      this.aP12[0] = pcls014.this.AV91Cc_almcod;
      this.aP13[0] = pcls014.this.AV99CosPro;
      this.aP14[0] = pcls014.this.AV98CosAny;
      this.aP15[0] = pcls014.this.AV96Consumos;
      this.aP16[0] = pcls014.this.AV87BarCosPD;
      this.aP17[0] = pcls014.this.AV79BarCosAD;
      this.aP18[0] = pcls014.this.AV77BarCosAA;
      this.aP19[0] = pcls014.this.AV85BarCosPA;
      this.aP20[0] = pcls014.this.AV83BarCosCol;
      this.aP21[0] = pcls014.this.AV81BarCosAnc;
      this.aP22[0] = pcls014.this.Gx_msg;
      this.aP23[0] = pcls014.this.AV145FechaCierre;
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
      P055W2_A396EmprCod = new String[] {""} ;
      P055W2_A129BarCod = new int[1] ;
      P055W2_A132BarCodReo = new byte[1] ;
      P055W2_A130BarCodPar = new String[] {""} ;
      P055W2_A2804RecLinMaq = new short[1] ;
      P055W2_A6039RecAcab = new String[] {""} ;
      P055W2_n6039RecAcab = new boolean[] {false} ;
      P055W2_A2805RecVolPrd = new int[1] ;
      P055W2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055W2_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055W2_n4260RecTotMts = new boolean[] {false} ;
      P055W2_A602MaqCod = new String[] {""} ;
      A6039RecAcab = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      AV133RecTotKgs = DecimalUtil.ZERO ;
      AV135RecTotMts = DecimalUtil.ZERO ;
      P055W5_A396EmprCod = new String[] {""} ;
      P055W5_A129BarCod = new int[1] ;
      P055W5_A132BarCodReo = new byte[1] ;
      P055W5_A130BarCodPar = new String[] {""} ;
      P055W5_A3595BarMacCod = new int[1] ;
      P055W5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055W5_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055W5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055W5_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      AV73BarAgrLot = "" ;
      P055W6_A396EmprCod = new String[] {""} ;
      P055W6_A129BarCod = new int[1] ;
      P055W6_A132BarCodReo = new byte[1] ;
      P055W6_A130BarCodPar = new String[] {""} ;
      P055W6_A122BarAgrPar = new String[] {""} ;
      P055W6_A124BarAgrReo = new byte[1] ;
      P055W6_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      AV117Kilos = DecimalUtil.ZERO ;
      AV122Metros = DecimalUtil.ZERO ;
      AV132RecTotKgm = DecimalUtil.ZERO ;
      AV134RecTotMtr = DecimalUtil.ZERO ;
      AV88BarCosPD1 = DecimalUtil.ZERO ;
      AV80BarCosAD1 = DecimalUtil.ZERO ;
      AV78BarCosAA1 = DecimalUtil.ZERO ;
      AV86BarCosPA1 = DecimalUtil.ZERO ;
      AV84BarCosCol1 = DecimalUtil.ZERO ;
      AV82BarCosAnc1 = DecimalUtil.ZERO ;
      AV128RecKgm = DecimalUtil.ZERO ;
      AV130RecMtr = DecimalUtil.ZERO ;
      GXv_char11 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_int10 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new int[1] ;
      GXv_char19 = new String[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_date22 = new java.util.Date[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls014__default(),
         new Object[] {
             new Object[] {
            P055W2_A396EmprCod, P055W2_A129BarCod, P055W2_A132BarCodReo, P055W2_A130BarCodPar, P055W2_A2804RecLinMaq, P055W2_A6039RecAcab, P055W2_n6039RecAcab, P055W2_A2805RecVolPrd, P055W2_A4259RecTotKgs, P055W2_A4260RecTotMts,
            P055W2_n4260RecTotMts, P055W2_A602MaqCod
            }
            , new Object[] {
            P055W5_A396EmprCod, P055W5_A129BarCod, P055W5_A132BarCodReo, P055W5_A130BarCodPar, P055W5_A3595BarMacCod, P055W5_A184BarMtr, P055W5_A870BarTotMtr, P055W5_A166BarKgm, P055W5_A219BarTotAgr
            }
            , new Object[] {
            P055W6_A396EmprCod, P055W6_A129BarCod, P055W6_A132BarCodReo, P055W6_A130BarCodPar, P055W6_A122BarAgrPar, P055W6_A124BarAgrReo, P055W6_A119BarAgrCod
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
   private byte A124BarAgrReo ;
   private byte GXv_int6[] ;
   private short AV71Anyadi ;
   private short A2804RecLinMaq ;
   private short AV129RecLinMaq ;
   private short AV103Esttinnr ;
   private short GXv_int10[] ;
   private short GXv_int17[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV131RecNumInt ;
   private int AV136RecVolprd ;
   private int A2805RecVolPrd ;
   private int A3595BarMacCod ;
   private int A119BarAgrCod ;
   private int GXv_int7[] ;
   private int GXv_int16[] ;
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
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal AV117Kilos ;
   private java.math.BigDecimal AV122Metros ;
   private java.math.BigDecimal AV132RecTotKgm ;
   private java.math.BigDecimal AV134RecTotMtr ;
   private java.math.BigDecimal AV88BarCosPD1 ;
   private java.math.BigDecimal AV80BarCosAD1 ;
   private java.math.BigDecimal AV78BarCosAA1 ;
   private java.math.BigDecimal AV86BarCosPA1 ;
   private java.math.BigDecimal AV84BarCosCol1 ;
   private java.math.BigDecimal AV82BarCosAnc1 ;
   private java.math.BigDecimal AV128RecKgm ;
   private java.math.BigDecimal AV130RecMtr ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
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
   private String AV73BarAgrLot ;
   private String A122BarAgrPar ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char19[] ;
   private java.util.Date AV90Ca_diahora ;
   private java.util.Date AV145FechaCierre ;
   private java.util.Date AV104Fec_t ;
   private java.util.Date Gx_date ;
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
   private String[] P055W2_A396EmprCod ;
   private int[] P055W2_A129BarCod ;
   private byte[] P055W2_A132BarCodReo ;
   private String[] P055W2_A130BarCodPar ;
   private short[] P055W2_A2804RecLinMaq ;
   private String[] P055W2_A6039RecAcab ;
   private boolean[] P055W2_n6039RecAcab ;
   private int[] P055W2_A2805RecVolPrd ;
   private java.math.BigDecimal[] P055W2_A4259RecTotKgs ;
   private java.math.BigDecimal[] P055W2_A4260RecTotMts ;
   private boolean[] P055W2_n4260RecTotMts ;
   private String[] P055W2_A602MaqCod ;
   private String[] P055W5_A396EmprCod ;
   private int[] P055W5_A129BarCod ;
   private byte[] P055W5_A132BarCodReo ;
   private String[] P055W5_A130BarCodPar ;
   private int[] P055W5_A3595BarMacCod ;
   private java.math.BigDecimal[] P055W5_A184BarMtr ;
   private java.math.BigDecimal[] P055W5_A870BarTotMtr ;
   private java.math.BigDecimal[] P055W5_A166BarKgm ;
   private java.math.BigDecimal[] P055W5_A219BarTotAgr ;
   private String[] P055W6_A396EmprCod ;
   private int[] P055W6_A129BarCod ;
   private byte[] P055W6_A132BarCodReo ;
   private String[] P055W6_A130BarCodPar ;
   private String[] P055W6_A122BarAgrPar ;
   private byte[] P055W6_A124BarAgrReo ;
   private int[] P055W6_A119BarAgrCod ;
}

final  class pcls014__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055W2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecAcab, RecVolPrd, RecTotKgs, RecTotMts, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055W5", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarMacCod, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T2.BarTotMtr, 0) AS BarTotMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055W6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 2 :
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

