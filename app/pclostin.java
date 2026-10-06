package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclostin extends GXProcedure
{
   public pclostin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclostin.class ), "" );
   }

   public pclostin( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
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
                           java.util.Date[] aP11 )
   {
      pclostin.this.aP12 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
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
                        byte[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
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
                             byte[] aP12 )
   {
      pclostin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclostin.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pclostin.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pclostin.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pclostin.this.AV15CieCerAny = aP4[0];
      this.aP4 = aP4;
      pclostin.this.AV16Consumos = aP5[0];
      this.aP5 = aP5;
      pclostin.this.AV17Anyadi = aP6[0];
      this.aP6 = aP6;
      pclostin.this.A2804RecLinMaq = aP7[0];
      this.aP7 = aP7;
      pclostin.this.AV18MaqCod = aP8[0];
      this.aP8 = aP8;
      pclostin.this.AV19Tipo = aP9[0];
      this.aP9 = aP9;
      pclostin.this.AV85CierreAM = aP10[0];
      this.aP10 = aP10;
      pclostin.this.AV86Ca_diahora = aP11[0];
      this.aP11 = aP11;
      pclostin.this.AV87Cc_almcod = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV36EmprNom ;
      GXv_char3[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV34Station, GXv_char1, GXv_char2, GXv_char3) ;
      pclostin.this.A396EmprCod = GXv_char1[0] ;
      pclostin.this.AV36EmprNom = GXv_char2[0] ;
      pclostin.this.AV35UsurCod = GXv_char3[0] ;
      AV68Fec_t = Gx_date ;
      GXt_int4 = AV55FlagHisRet ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISRET", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV55FlagHisRet = GXt_int4 ;
      GXt_int4 = AV58Matizar ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MATIZA", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV58Matizar = GXt_int4 ;
      GXt_int4 = AV70NCLec ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV70NCLec = GXt_int4 ;
      GXt_int4 = AV77KGSREA ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KGSREA", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV77KGSREA = GXt_int4 ;
      GXt_int4 = AV29Flag ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOSIFI", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV29Flag = GXt_int4 ;
      GXt_int4 = AV37FlagFT ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECTIN", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV37FlagFT = GXt_int4 ;
      GXt_int4 = AV38FlagDia ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIARIO", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV38FlagDia = GXt_int4 ;
      GXt_int4 = AV66Ricoltex ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RICOLT", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV66Ricoltex = GXt_int4 ;
      GXt_int4 = AV67Vertex ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV67Vertex = GXt_int4 ;
      GXt_int4 = AV54FlagHss ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV54FlagHss = GXt_int4 ;
      GXt_int4 = AV30Flag2 ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BARROS", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV30Flag2 = GXt_int4 ;
      GXt_int4 = AV33FlagCcs ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV33FlagCcs = GXt_int4 ;
      GXt_int4 = AV74CtrlRec ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRREP", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV74CtrlRec = GXt_int4 ;
      GXt_int4 = AV88Nalmcc ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV88Nalmcc = GXt_int4 ;
      GXt_int4 = AV89TyTelas ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TYT", ""), GXv_int5) ;
      pclostin.this.GXt_int4 = GXv_int5[0] ;
      AV89TyTelas = GXt_int4 ;
      AV83PrdRect = "" ;
      /* Using cursor P03CB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(AV74CtrlRec)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P03CB2_A719PrdNum[0] ;
         n719PrdNum = P03CB2_n719PrdNum[0] ;
         A727PrdRec = P03CB2_A727PrdRec[0] ;
         A811RecLin = P03CB2_A811RecLin[0] ;
         A1273RecLinPro = P03CB2_A1273RecLinPro[0] ;
         A727PrdRec = P03CB2_A727PrdRec[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hay productos en recuento y el control está activo. No se puede cerrar la receta¡¡¡", ""));
            AV83PrdRect = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV83PrdRect, httpContext.getMessage( "S", "")) == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV58Matizar == 1 )
      {
         AV60Dia = (byte)(GXutil.day( AV68Fec_t)) ;
         AV61Mes = (byte)(GXutil.month( AV68Fec_t)) ;
         AV62Any = (short)(GXutil.year( AV68Fec_t)) ;
         AV64TipDefCod = (short)(0) ;
         AV65CodCausa = (short)(0) ;
         System.out.println( httpContext.getMessage( "Go PMAT001", "") );
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_int7[0] = AV59Lconti ;
         new app.pmat001(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int5, GXv_char2, GXv_int7) ;
         pclostin.this.A396EmprCod = GXv_char3[0] ;
         pclostin.this.A129BarCod = GXv_int6[0] ;
         pclostin.this.A132BarCodReo = GXv_int5[0] ;
         pclostin.this.A130BarCodPar = GXv_char2[0] ;
         pclostin.this.AV59Lconti = GXv_int7[0] ;
         System.out.println( httpContext.getMessage( "Return PMAT001", "") );
      }
      AV31FlagLR = (byte)(0) ;
      AV57RecNumInt = 0 ;
      AV71RecAcab = " " ;
      AV73RecVolprd = 0 ;
      /* Using cursor P03CB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6039RecAcab = P03CB3_A6039RecAcab[0] ;
         n6039RecAcab = P03CB3_n6039RecAcab[0] ;
         A2805RecVolPrd = P03CB3_A2805RecVolPrd[0] ;
         A4259RecTotKgs = P03CB3_A4259RecTotKgs[0] ;
         A4260RecTotMts = P03CB3_A4260RecTotMts[0] ;
         n4260RecTotMts = P03CB3_n4260RecTotMts[0] ;
         A602MaqCod = P03CB3_A602MaqCod[0] ;
         AV71RecAcab = A6039RecAcab ;
         AV72RecLinMaq = A2804RecLinMaq ;
         AV73RecVolprd = A2805RecVolPrd ;
         AV76RecTotKgs = A4259RecTotKgs ;
         AV80RecTotMts = A4260RecTotMts ;
         AV18MaqCod = A602MaqCod ;
         Gx_msg = httpContext.getMessage( "Hdr= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         /* Using cursor P03CB4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1273RecLinPro = P03CB4_A1273RecLinPro[0] ;
            AV31FlagLR = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV24CosPro = DecimalUtil.doubleToDec(0) ;
      AV25CosAny = DecimalUtil.doubleToDec(0) ;
      if ( ( AV30Flag2 == 1 ) && ( GXutil.strcmp(AV19Tipo, httpContext.getMessage( "A", "")) == 0 ) )
      {
         System.out.println( Gx_msg+httpContext.getMessage( "Go PCALBAR", "") );
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_decimal8[0] = AV24CosPro ;
         GXv_decimal9[0] = AV25CosAny ;
         GXv_int5[0] = AV16Consumos ;
         GXv_int10[0] = A2804RecLinMaq ;
         new app.pcalbar(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int7, GXv_char2, GXv_decimal8, GXv_decimal9, GXv_int5, GXv_int10) ;
         pclostin.this.A396EmprCod = GXv_char3[0] ;
         pclostin.this.A129BarCod = GXv_int6[0] ;
         pclostin.this.A132BarCodReo = GXv_int7[0] ;
         pclostin.this.A130BarCodPar = GXv_char2[0] ;
         pclostin.this.AV24CosPro = GXv_decimal8[0] ;
         pclostin.this.AV25CosAny = GXv_decimal9[0] ;
         pclostin.this.AV16Consumos = GXv_int5[0] ;
         pclostin.this.A2804RecLinMaq = GXv_int10[0] ;
         System.out.println( Gx_msg+httpContext.getMessage( "Return PCALBAR", "") );
      }
      else
      {
         System.out.println( Gx_msg+httpContext.getMessage( "Go PCALREC", "") );
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_decimal9[0] = AV24CosPro ;
         GXv_decimal8[0] = AV25CosAny ;
         GXv_int5[0] = AV16Consumos ;
         GXv_int10[0] = A2804RecLinMaq ;
         GXv_char1[0] = AV19Tipo ;
         new app.pcalrec(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int7, GXv_char2, GXv_decimal9, GXv_decimal8, GXv_int5, GXv_int10, GXv_char1) ;
         pclostin.this.A396EmprCod = GXv_char3[0] ;
         pclostin.this.A129BarCod = GXv_int6[0] ;
         pclostin.this.A132BarCodReo = GXv_int7[0] ;
         pclostin.this.A130BarCodPar = GXv_char2[0] ;
         pclostin.this.AV24CosPro = GXv_decimal9[0] ;
         pclostin.this.AV25CosAny = GXv_decimal8[0] ;
         pclostin.this.AV16Consumos = GXv_int5[0] ;
         pclostin.this.A2804RecLinMaq = GXv_int10[0] ;
         pclostin.this.AV19Tipo = GXv_char1[0] ;
         System.out.println( Gx_msg+httpContext.getMessage( "REturn PCALREC", "") );
         if ( AV38FlagDia == 1 )
         {
            System.out.println( Gx_msg+httpContext.getMessage( "Go PCOSDAB", "") );
            GXv_char3[0] = A396EmprCod ;
            GXv_int6[0] = A129BarCod ;
            GXv_int7[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            GXv_int10[0] = A2804RecLinMaq ;
            GXv_decimal9[0] = AV40BarCosPD ;
            GXv_decimal8[0] = AV41BarCosAD ;
            GXv_decimal11[0] = AV42BarCosAA ;
            GXv_decimal12[0] = AV43BarCosPA ;
            GXv_decimal13[0] = AV44BarCosCol ;
            GXv_decimal14[0] = AV45BarCosAnc ;
            new app.pcosdab(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int7, GXv_char2, GXv_int10, GXv_decimal9, GXv_decimal8, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_decimal14) ;
            pclostin.this.A396EmprCod = GXv_char3[0] ;
            pclostin.this.A129BarCod = GXv_int6[0] ;
            pclostin.this.A132BarCodReo = GXv_int7[0] ;
            pclostin.this.A130BarCodPar = GXv_char2[0] ;
            pclostin.this.A2804RecLinMaq = GXv_int10[0] ;
            pclostin.this.AV40BarCosPD = GXv_decimal9[0] ;
            pclostin.this.AV41BarCosAD = GXv_decimal8[0] ;
            pclostin.this.AV42BarCosAA = GXv_decimal11[0] ;
            pclostin.this.AV43BarCosPA = GXv_decimal12[0] ;
            pclostin.this.AV44BarCosCol = GXv_decimal13[0] ;
            pclostin.this.AV45BarCosAnc = GXv_decimal14[0] ;
            System.out.println( Gx_msg+httpContext.getMessage( "Return PCOSDAB", "") );
         }
      }
      if ( AV55FlagHisRet == 1 )
      {
         System.out.println( Gx_msg+httpContext.getMessage( "Go PHISREC2", "") );
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_int10[0] = A2804RecLinMaq ;
         GXv_decimal14[0] = AV40BarCosPD ;
         GXv_decimal13[0] = AV41BarCosAD ;
         GXv_decimal12[0] = AV42BarCosAA ;
         GXv_decimal11[0] = AV43BarCosPA ;
         GXv_decimal9[0] = AV44BarCosCol ;
         GXv_decimal8[0] = AV45BarCosAnc ;
         new app.phisrec2(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int7, GXv_char2, GXv_int10, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal9, GXv_decimal8) ;
         pclostin.this.A396EmprCod = GXv_char3[0] ;
         pclostin.this.A129BarCod = GXv_int6[0] ;
         pclostin.this.A132BarCodReo = GXv_int7[0] ;
         pclostin.this.A130BarCodPar = GXv_char2[0] ;
         pclostin.this.A2804RecLinMaq = GXv_int10[0] ;
         pclostin.this.AV40BarCosPD = GXv_decimal14[0] ;
         pclostin.this.AV41BarCosAD = GXv_decimal13[0] ;
         pclostin.this.AV42BarCosAA = GXv_decimal12[0] ;
         pclostin.this.AV43BarCosPA = GXv_decimal11[0] ;
         pclostin.this.AV44BarCosCol = GXv_decimal9[0] ;
         pclostin.this.AV45BarCosAnc = GXv_decimal8[0] ;
         System.out.println( Gx_msg+httpContext.getMessage( "Return PHISREC2", "") );
      }
      if ( AV33FlagCcs == 1 )
      {
         if ( GXutil.strcmp(AV85CierreAM, httpContext.getMessage( "A", "")) == 0 )
         {
            System.out.println( Gx_msg+httpContext.getMessage( "Go PCIECCSa", "") );
            GXv_char3[0] = A396EmprCod ;
            GXv_int6[0] = A129BarCod ;
            GXv_int7[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            GXv_int10[0] = A2804RecLinMaq ;
            GXv_char1[0] = AV35UsurCod ;
            GXv_dtime15[0] = AV86Ca_diahora ;
            GXv_int5[0] = AV87Cc_almcod ;
            new app.pcieccsa(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int7, GXv_char2, GXv_int10, GXv_char1, GXv_dtime15, GXv_int5) ;
            pclostin.this.A396EmprCod = GXv_char3[0] ;
            pclostin.this.A129BarCod = GXv_int6[0] ;
            pclostin.this.A132BarCodReo = GXv_int7[0] ;
            pclostin.this.A130BarCodPar = GXv_char2[0] ;
            pclostin.this.A2804RecLinMaq = GXv_int10[0] ;
            pclostin.this.AV35UsurCod = GXv_char1[0] ;
            pclostin.this.AV86Ca_diahora = GXv_dtime15[0] ;
            pclostin.this.AV87Cc_almcod = GXv_int5[0] ;
            System.out.println( Gx_msg+httpContext.getMessage( "Return PCIECCSa", "") );
         }
         else
         {
            System.out.println( Gx_msg+httpContext.getMessage( "Go PCIECCSm", "") );
            GXv_char3[0] = A396EmprCod ;
            GXv_int6[0] = A129BarCod ;
            GXv_int7[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            GXv_int10[0] = A2804RecLinMaq ;
            GXv_char1[0] = AV35UsurCod ;
            GXv_dtime15[0] = AV86Ca_diahora ;
            GXv_int5[0] = AV87Cc_almcod ;
            GXv_char16[0] = httpContext.getMessage( "T", "") ;
            new app.pcieccsm(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int7, GXv_char2, GXv_int10, GXv_char1, GXv_dtime15, GXv_int5, GXv_char16) ;
            pclostin.this.A396EmprCod = GXv_char3[0] ;
            pclostin.this.A129BarCod = GXv_int6[0] ;
            pclostin.this.A132BarCodReo = GXv_int7[0] ;
            pclostin.this.A130BarCodPar = GXv_char2[0] ;
            pclostin.this.A2804RecLinMaq = GXv_int10[0] ;
            pclostin.this.AV35UsurCod = GXv_char1[0] ;
            pclostin.this.AV86Ca_diahora = GXv_dtime15[0] ;
            pclostin.this.AV87Cc_almcod = GXv_int5[0] ;
            System.out.println( Gx_msg+httpContext.getMessage( "Return PCIECCSm", "") );
         }
      }
      if ( AV89TyTelas == 1 )
      {
         if ( AV70NCLec == 0 )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "pclostin");
         }
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV31FlagLR == 1 )
      {
         System.out.println( Gx_msg+httpContext.getMessage( " Read BARCAD", "") );
         /* Using cursor P03CB7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A3595BarMacCod = P03CB7_A3595BarMacCod[0] ;
            A148BarEstReo = P03CB7_A148BarEstReo[0] ;
            A141BarCosPro = P03CB7_A141BarCosPro[0] ;
            A140BarCosAny = P03CB7_A140BarCosAny[0] ;
            A180BarMaqCod = P03CB7_A180BarMaqCod[0] ;
            A2759BarMaqGru = P03CB7_A2759BarMaqGru[0] ;
            A189BarNumAny = P03CB7_A189BarNumAny[0] ;
            A2498BarPrdPes = P03CB7_A2498BarPrdPes[0] ;
            A3871BarFecCRe = P03CB7_A3871BarFecCRe[0] ;
            A2448BarFecEnR = P03CB7_A2448BarFecEnR[0] ;
            n2448BarFecEnR = P03CB7_n2448BarFecEnR[0] ;
            A184BarMtr = P03CB7_A184BarMtr[0] ;
            A870BarTotMtr = P03CB7_A870BarTotMtr[0] ;
            A166BarKgm = P03CB7_A166BarKgm[0] ;
            A219BarTotAgr = P03CB7_A219BarTotAgr[0] ;
            A870BarTotMtr = P03CB7_A870BarTotMtr[0] ;
            A219BarTotAgr = P03CB7_A219BarTotAgr[0] ;
            A184BarMtr = P03CB7_A184BarMtr[0] ;
            A166BarKgm = P03CB7_A166BarKgm[0] ;
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
            AV39BarAgrLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV57RecNumInt = A3595BarMacCod ;
            if ( AV38FlagDia == 1 )
            {
               AV76RecTotKgs = ((AV76RecTotKgs.doubleValue()>0) ? AV76RecTotKgs : A812RecTotKgm) ;
               AV80RecTotMts = ((AV80RecTotMts.doubleValue()>0) ? AV80RecTotMts : A871RecTotMtr) ;
               AV75RecTotKgm = ((AV77KGSREA==1) ? AV76RecTotKgs : A812RecTotKgm) ;
               AV81RecTotMtr = ((AV77KGSREA==1) ? AV80RecTotMts : A871RecTotMtr) ;
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76RecTotKgs)==0) )
               {
                  if ( AV76RecTotKgs.doubleValue() == 0 )
                  {
                     AV46BarCosPD1 = GXutil.roundDecimal( A166BarKgm.multiply(AV40BarCosPD).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV47BarCosAD1 = GXutil.roundDecimal( A166BarKgm.multiply(AV41BarCosAD).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV48BarCosAA1 = GXutil.roundDecimal( A166BarKgm.multiply(AV42BarCosAA).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV49BarCosPA1 = GXutil.roundDecimal( A166BarKgm.multiply(AV43BarCosPA).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV50BarCosCol1 = GXutil.roundDecimal( A166BarKgm.multiply(AV44BarCosCol).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV51BarCosAnc1 = GXutil.roundDecimal( A166BarKgm.multiply(AV45BarCosAnc).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                  }
                  else
                  {
                     if ( A166BarKgm.doubleValue() == 0 )
                     {
                        AV84BarKgm = AV76RecTotKgs ;
                     }
                     else
                     {
                        AV84BarKgm = A166BarKgm ;
                     }
                     AV46BarCosPD1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV40BarCosPD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV47BarCosAD1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV41BarCosAD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV48BarCosAA1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV42BarCosAA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV49BarCosPA1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV43BarCosPA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV50BarCosCol1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV44BarCosCol).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV51BarCosAnc1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV45BarCosAnc).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                  }
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
               AV78RecKgm = DecimalUtil.doubleToDec(0) ;
               AV79RecMtr = DecimalUtil.doubleToDec(0) ;
               if ( A812RecTotKgm.doubleValue() > 0 )
               {
                  AV78RecKgm = A166BarKgm.multiply(AV75RecTotKgm).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
               }
               if ( A871RecTotMtr.doubleValue() > 0 )
               {
                  AV79RecMtr = A184BarMtr.multiply(AV81RecTotMtr).divide(A871RecTotMtr, 18, java.math.RoundingMode.DOWN) ;
               }
               System.out.println( Gx_msg+httpContext.getMessage( "Go PESTTIN", "") );
               GXv_char16[0] = A396EmprCod ;
               GXv_int6[0] = A129BarCod ;
               GXv_int7[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_decimal14[0] = AV46BarCosPD1 ;
               GXv_decimal13[0] = AV47BarCosAD1 ;
               GXv_decimal12[0] = AV48BarCosAA1 ;
               GXv_decimal11[0] = AV49BarCosPA1 ;
               GXv_decimal9[0] = AV50BarCosCol1 ;
               GXv_decimal8[0] = AV51BarCosAnc1 ;
               GXv_char2[0] = AV39BarAgrLot ;
               GXv_int17[0] = AV57RecNumInt ;
               GXv_int10[0] = AV63Esttinnr ;
               GXv_char1[0] = AV71RecAcab ;
               GXv_int18[0] = AV72RecLinMaq ;
               GXv_int19[0] = AV73RecVolprd ;
               GXv_char20[0] = AV18MaqCod ;
               GXv_decimal21[0] = AV78RecKgm ;
               GXv_decimal22[0] = AV79RecMtr ;
               new app.pesttin(remoteHandle, context).execute( GXv_char16, GXv_int6, GXv_int7, GXv_char3, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal9, GXv_decimal8, GXv_char2, GXv_int17, GXv_int10, GXv_char1, GXv_int18, GXv_int19, GXv_char20, GXv_decimal21, GXv_decimal22) ;
               pclostin.this.A396EmprCod = GXv_char16[0] ;
               pclostin.this.A129BarCod = GXv_int6[0] ;
               pclostin.this.A132BarCodReo = GXv_int7[0] ;
               pclostin.this.A130BarCodPar = GXv_char3[0] ;
               pclostin.this.AV46BarCosPD1 = GXv_decimal14[0] ;
               pclostin.this.AV47BarCosAD1 = GXv_decimal13[0] ;
               pclostin.this.AV48BarCosAA1 = GXv_decimal12[0] ;
               pclostin.this.AV49BarCosPA1 = GXv_decimal11[0] ;
               pclostin.this.AV50BarCosCol1 = GXv_decimal9[0] ;
               pclostin.this.AV51BarCosAnc1 = GXv_decimal8[0] ;
               pclostin.this.AV39BarAgrLot = GXv_char2[0] ;
               pclostin.this.AV57RecNumInt = GXv_int17[0] ;
               pclostin.this.AV63Esttinnr = GXv_int10[0] ;
               pclostin.this.AV71RecAcab = GXv_char1[0] ;
               pclostin.this.AV72RecLinMaq = GXv_int18[0] ;
               pclostin.this.AV73RecVolprd = GXv_int19[0] ;
               pclostin.this.AV18MaqCod = GXv_char20[0] ;
               pclostin.this.AV78RecKgm = GXv_decimal21[0] ;
               pclostin.this.AV79RecMtr = GXv_decimal22[0] ;
               System.out.println( Gx_msg+httpContext.getMessage( "Return PESTTIN", "") );
               if ( ( AV67Vertex == 1 ) && ( AV66Ricoltex == 1 ) )
               {
                  GXv_char20[0] = A396EmprCod ;
                  GXv_int19[0] = A129BarCod ;
                  GXv_int7[0] = A132BarCodReo ;
                  GXv_char16[0] = A130BarCodPar ;
                  GXv_char3[0] = httpContext.getMessage( "CTI", "") ;
                  new app.pvxleepz(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_int7, GXv_char16, GXv_char3) ;
                  pclostin.this.A396EmprCod = GXv_char20[0] ;
                  pclostin.this.A129BarCod = GXv_int19[0] ;
                  pclostin.this.A132BarCodReo = GXv_int7[0] ;
                  pclostin.this.A130BarCodPar = GXv_char16[0] ;
               }
               if ( ( AV58Matizar == 1 ) && ( AV59Lconti == 1 ) )
               {
               }
            }
            /* Using cursor P03CB8 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A119BarAgrCod = P03CB8_A119BarAgrCod[0] ;
               A124BarAgrReo = P03CB8_A124BarAgrReo[0] ;
               A122BarAgrPar = P03CB8_A122BarAgrPar[0] ;
               System.out.println( Gx_msg+httpContext.getMessage( "Go PMODCOS.Agrupadas", "") );
               GXv_char20[0] = A396EmprCod ;
               GXv_int19[0] = A119BarAgrCod ;
               GXv_int7[0] = A124BarAgrReo ;
               GXv_char16[0] = A122BarAgrPar ;
               GXv_decimal22[0] = AV24CosPro ;
               GXv_decimal21[0] = AV25CosAny ;
               GXv_char3[0] = AV18MaqCod ;
               GXv_int18[0] = AV17Anyadi ;
               GXv_char2[0] = AV15CieCerAny ;
               new app.pmodcos(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_int7, GXv_char16, GXv_decimal22, GXv_decimal21, GXv_char3, GXv_int18, GXv_char2) ;
               pclostin.this.A396EmprCod = GXv_char20[0] ;
               pclostin.this.A119BarAgrCod = GXv_int19[0] ;
               pclostin.this.A124BarAgrReo = GXv_int7[0] ;
               pclostin.this.A122BarAgrPar = GXv_char16[0] ;
               pclostin.this.AV24CosPro = GXv_decimal22[0] ;
               pclostin.this.AV25CosAny = GXv_decimal21[0] ;
               pclostin.this.AV18MaqCod = GXv_char3[0] ;
               pclostin.this.AV17Anyadi = GXv_int18[0] ;
               pclostin.this.AV15CieCerAny = GXv_char2[0] ;
               if ( AV38FlagDia == 1 )
               {
                  AV52Kilos = DecimalUtil.doubleToDec(0) ;
                  GXv_char20[0] = A396EmprCod ;
                  GXv_int19[0] = A119BarAgrCod ;
                  GXv_int7[0] = A124BarAgrReo ;
                  GXv_char16[0] = A122BarAgrPar ;
                  GXv_decimal22[0] = AV52Kilos ;
                  new app.pkilos(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_int7, GXv_char16, GXv_decimal22) ;
                  pclostin.this.A396EmprCod = GXv_char20[0] ;
                  pclostin.this.A119BarAgrCod = GXv_int19[0] ;
                  pclostin.this.A124BarAgrReo = GXv_int7[0] ;
                  pclostin.this.A122BarAgrPar = GXv_char16[0] ;
                  pclostin.this.AV52Kilos = GXv_decimal22[0] ;
                  AV82Metros = DecimalUtil.doubleToDec(0) ;
                  GXv_char20[0] = A396EmprCod ;
                  GXv_int19[0] = A119BarAgrCod ;
                  GXv_int7[0] = A124BarAgrReo ;
                  GXv_char16[0] = A122BarAgrPar ;
                  GXv_decimal22[0] = AV82Metros ;
                  new app.pmetros(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_int7, GXv_char16, GXv_decimal22) ;
                  pclostin.this.A396EmprCod = GXv_char20[0] ;
                  pclostin.this.A119BarAgrCod = GXv_int19[0] ;
                  pclostin.this.A124BarAgrReo = GXv_int7[0] ;
                  pclostin.this.A122BarAgrPar = GXv_char16[0] ;
                  pclostin.this.AV82Metros = GXv_decimal22[0] ;
                  AV76RecTotKgs = ((AV76RecTotKgs.doubleValue()>0) ? AV76RecTotKgs : A812RecTotKgm) ;
                  AV80RecTotMts = ((AV80RecTotMts.doubleValue()>0) ? AV80RecTotMts : A871RecTotMtr) ;
                  AV75RecTotKgm = ((AV77KGSREA==1) ? AV76RecTotKgs : A812RecTotKgm) ;
                  AV81RecTotMtr = ((AV77KGSREA==1) ? AV80RecTotMts : A871RecTotMtr) ;
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76RecTotKgs)==0) )
                  {
                     if ( AV76RecTotKgs.doubleValue() == 0 )
                     {
                        AV46BarCosPD1 = GXutil.roundDecimal( AV52Kilos.multiply(AV40BarCosPD).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV47BarCosAD1 = GXutil.roundDecimal( AV52Kilos.multiply(AV41BarCosAD).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV48BarCosAA1 = GXutil.roundDecimal( AV52Kilos.multiply(AV42BarCosAA).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV49BarCosPA1 = GXutil.roundDecimal( AV52Kilos.multiply(AV43BarCosPA).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV50BarCosCol1 = GXutil.roundDecimal( AV52Kilos.multiply(AV44BarCosCol).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV51BarCosAnc1 = GXutil.roundDecimal( AV52Kilos.multiply(AV45BarCosAnc).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                     else
                     {
                        if ( AV52Kilos.doubleValue() == 0 )
                        {
                           AV52Kilos = AV76RecTotKgs ;
                        }
                        AV46BarCosPD1 = GXutil.roundDecimal( AV52Kilos.multiply(AV40BarCosPD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV47BarCosAD1 = GXutil.roundDecimal( AV52Kilos.multiply(AV41BarCosAD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV48BarCosAA1 = GXutil.roundDecimal( AV52Kilos.multiply(AV42BarCosAA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV49BarCosPA1 = GXutil.roundDecimal( AV52Kilos.multiply(AV43BarCosPA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV50BarCosCol1 = GXutil.roundDecimal( AV52Kilos.multiply(AV44BarCosCol).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV51BarCosAnc1 = GXutil.roundDecimal( AV52Kilos.multiply(AV45BarCosAnc).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
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
                  AV78RecKgm = DecimalUtil.doubleToDec(0) ;
                  AV79RecMtr = DecimalUtil.doubleToDec(0) ;
                  if ( A812RecTotKgm.doubleValue() > 0 )
                  {
                     AV78RecKgm = AV52Kilos.multiply(AV75RecTotKgm).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                  }
                  if ( A871RecTotMtr.doubleValue() > 0 )
                  {
                     AV79RecMtr = AV82Metros.multiply(AV81RecTotMtr).divide(A871RecTotMtr, 18, java.math.RoundingMode.DOWN) ;
                  }
                  System.out.println( Gx_msg+httpContext.getMessage( "Go PESTTIN.Agrupadas", "") );
                  GXv_char20[0] = A396EmprCod ;
                  GXv_int19[0] = A119BarAgrCod ;
                  GXv_int7[0] = A124BarAgrReo ;
                  GXv_char16[0] = A122BarAgrPar ;
                  GXv_decimal22[0] = AV46BarCosPD1 ;
                  GXv_decimal21[0] = AV47BarCosAD1 ;
                  GXv_decimal14[0] = AV48BarCosAA1 ;
                  GXv_decimal13[0] = AV49BarCosPA1 ;
                  GXv_decimal12[0] = AV50BarCosCol1 ;
                  GXv_decimal11[0] = AV51BarCosAnc1 ;
                  GXv_char3[0] = AV39BarAgrLot ;
                  GXv_int17[0] = AV57RecNumInt ;
                  GXv_int18[0] = AV63Esttinnr ;
                  GXv_char2[0] = AV71RecAcab ;
                  GXv_int10[0] = AV72RecLinMaq ;
                  GXv_int6[0] = AV73RecVolprd ;
                  GXv_char1[0] = AV18MaqCod ;
                  GXv_decimal9[0] = AV78RecKgm ;
                  GXv_decimal8[0] = AV79RecMtr ;
                  new app.pesttin(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_int7, GXv_char16, GXv_decimal22, GXv_decimal21, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_char3, GXv_int17, GXv_int18, GXv_char2, GXv_int10, GXv_int6, GXv_char1, GXv_decimal9, GXv_decimal8) ;
                  pclostin.this.A396EmprCod = GXv_char20[0] ;
                  pclostin.this.A119BarAgrCod = GXv_int19[0] ;
                  pclostin.this.A124BarAgrReo = GXv_int7[0] ;
                  pclostin.this.A122BarAgrPar = GXv_char16[0] ;
                  pclostin.this.AV46BarCosPD1 = GXv_decimal22[0] ;
                  pclostin.this.AV47BarCosAD1 = GXv_decimal21[0] ;
                  pclostin.this.AV48BarCosAA1 = GXv_decimal14[0] ;
                  pclostin.this.AV49BarCosPA1 = GXv_decimal13[0] ;
                  pclostin.this.AV50BarCosCol1 = GXv_decimal12[0] ;
                  pclostin.this.AV51BarCosAnc1 = GXv_decimal11[0] ;
                  pclostin.this.AV39BarAgrLot = GXv_char3[0] ;
                  pclostin.this.AV57RecNumInt = GXv_int17[0] ;
                  pclostin.this.AV63Esttinnr = GXv_int18[0] ;
                  pclostin.this.AV71RecAcab = GXv_char2[0] ;
                  pclostin.this.AV72RecLinMaq = GXv_int10[0] ;
                  pclostin.this.AV73RecVolprd = GXv_int6[0] ;
                  pclostin.this.AV18MaqCod = GXv_char1[0] ;
                  pclostin.this.AV78RecKgm = GXv_decimal9[0] ;
                  pclostin.this.AV79RecMtr = GXv_decimal8[0] ;
                  if ( ( AV67Vertex == 1 ) && ( AV66Ricoltex == 1 ) )
                  {
                     GXv_char20[0] = A396EmprCod ;
                     GXv_int19[0] = A119BarAgrCod ;
                     GXv_int7[0] = A124BarAgrReo ;
                     GXv_char16[0] = A122BarAgrPar ;
                     GXv_char3[0] = httpContext.getMessage( "CTI", "") ;
                     new app.pvxleepz(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_int7, GXv_char16, GXv_char3) ;
                     pclostin.this.A396EmprCod = GXv_char20[0] ;
                     pclostin.this.A119BarAgrCod = GXv_int19[0] ;
                     pclostin.this.A124BarAgrReo = GXv_int7[0] ;
                     pclostin.this.A122BarAgrPar = GXv_char16[0] ;
                  }
                  if ( ( AV58Matizar == 1 ) && ( AV59Lconti == 1 ) )
                  {
                  }
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( ( A148BarEstReo == 1 ) || ( GXutil.strcmp(AV15CieCerAny, httpContext.getMessage( "A", "")) == 0 ) )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) )
               {
                  A141BarCosPro = A141BarCosPro.add(GXutil.roundDecimal( A166BarKgm.multiply(AV24CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2)) ;
                  A140BarCosAny = A140BarCosAny.add(GXutil.roundDecimal( A166BarKgm.multiply(AV25CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2)) ;
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
                  A141BarCosPro = GXutil.roundDecimal( A166BarKgm.multiply(AV24CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                  A140BarCosAny = GXutil.roundDecimal( A166BarKgm.multiply(AV25CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
               }
               else
               {
                  A141BarCosPro = DecimalUtil.ZERO ;
                  A140BarCosAny = DecimalUtil.ZERO ;
               }
            }
            A180BarMaqCod = AV18MaqCod ;
            A2759BarMaqGru = GXutil.substring( AV18MaqCod, 1, 4) ;
            A189BarNumAny = AV17Anyadi ;
            A2498BarPrdPes = httpContext.getMessage( "N", "") ;
            A3871BarFecCRe = Gx_date ;
            if ( AV37FlagFT == 1 )
            {
               A2448BarFecEnR = Gx_date ;
               n2448BarFecEnR = false ;
            }
            if ( AV54FlagHss == 1 )
            {
            }
            /* Using cursor P03CB9 */
            pr_default.execute(5, new Object[] {A141BarCosPro, A140BarCosAny, A180BarMaqCod, A2759BarMaqGru, Short.valueOf(A189BarNumAny), A2498BarPrdPes, A3871BarFecCRe, Boolean.valueOf(n2448BarFecEnR), A2448BarFecEnR, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      System.out.println( Gx_msg+httpContext.getMessage( "Go pcldy07", "") );
      GXv_char20[0] = A396EmprCod ;
      GXv_int19[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char16[0] = A130BarCodPar ;
      GXv_int18[0] = A2804RecLinMaq ;
      new app.pcldy07(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_int7, GXv_char16, GXv_int18) ;
      pclostin.this.A396EmprCod = GXv_char20[0] ;
      pclostin.this.A129BarCod = GXv_int19[0] ;
      pclostin.this.A132BarCodReo = GXv_int7[0] ;
      pclostin.this.A130BarCodPar = GXv_char16[0] ;
      pclostin.this.A2804RecLinMaq = GXv_int18[0] ;
      System.out.println( Gx_msg+httpContext.getMessage( "Return pcldy07", "") );
      if ( AV70NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pclostin");
      }
      System.out.println( Gx_msg+httpContext.getMessage( "Go pcldy08", "") );
      GXv_char20[0] = A396EmprCod ;
      GXv_int19[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char16[0] = A130BarCodPar ;
      GXv_int18[0] = A2804RecLinMaq ;
      new app.pcldy06(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_int7, GXv_char16, GXv_int18) ;
      pclostin.this.A396EmprCod = GXv_char20[0] ;
      pclostin.this.A129BarCod = GXv_int19[0] ;
      pclostin.this.A132BarCodReo = GXv_int7[0] ;
      pclostin.this.A130BarCodPar = GXv_char16[0] ;
      pclostin.this.A2804RecLinMaq = GXv_int18[0] ;
      System.out.println( Gx_msg+httpContext.getMessage( "Return pcldy08", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclostin.this.A396EmprCod;
      this.aP1[0] = pclostin.this.A129BarCod;
      this.aP2[0] = pclostin.this.A132BarCodReo;
      this.aP3[0] = pclostin.this.A130BarCodPar;
      this.aP4[0] = pclostin.this.AV15CieCerAny;
      this.aP5[0] = pclostin.this.AV16Consumos;
      this.aP6[0] = pclostin.this.AV17Anyadi;
      this.aP7[0] = pclostin.this.A2804RecLinMaq;
      this.aP8[0] = pclostin.this.AV18MaqCod;
      this.aP9[0] = pclostin.this.AV19Tipo;
      this.aP10[0] = pclostin.this.AV85CierreAM;
      this.aP11[0] = pclostin.this.AV86Ca_diahora;
      this.aP12[0] = pclostin.this.AV87Cc_almcod;
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
      AV36EmprNom = "" ;
      AV35UsurCod = "" ;
      AV68Fec_t = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      AV83PrdRect = "" ;
      scmdbuf = "" ;
      P03CB2_A719PrdNum = new String[] {""} ;
      P03CB2_n719PrdNum = new boolean[] {false} ;
      P03CB2_A396EmprCod = new String[] {""} ;
      P03CB2_A129BarCod = new int[1] ;
      P03CB2_A132BarCodReo = new byte[1] ;
      P03CB2_A130BarCodPar = new String[] {""} ;
      P03CB2_A2804RecLinMaq = new short[1] ;
      P03CB2_A727PrdRec = new String[] {""} ;
      P03CB2_A811RecLin = new short[1] ;
      P03CB2_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      A727PrdRec = "" ;
      AV71RecAcab = "" ;
      P03CB3_A396EmprCod = new String[] {""} ;
      P03CB3_A129BarCod = new int[1] ;
      P03CB3_A132BarCodReo = new byte[1] ;
      P03CB3_A130BarCodPar = new String[] {""} ;
      P03CB3_A2804RecLinMaq = new short[1] ;
      P03CB3_A6039RecAcab = new String[] {""} ;
      P03CB3_n6039RecAcab = new boolean[] {false} ;
      P03CB3_A2805RecVolPrd = new int[1] ;
      P03CB3_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CB3_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CB3_n4260RecTotMts = new boolean[] {false} ;
      P03CB3_A602MaqCod = new String[] {""} ;
      A6039RecAcab = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      AV76RecTotKgs = DecimalUtil.ZERO ;
      AV80RecTotMts = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      P03CB4_A396EmprCod = new String[] {""} ;
      P03CB4_A129BarCod = new int[1] ;
      P03CB4_A132BarCodReo = new byte[1] ;
      P03CB4_A130BarCodPar = new String[] {""} ;
      P03CB4_A2804RecLinMaq = new short[1] ;
      P03CB4_A1273RecLinPro = new byte[1] ;
      AV24CosPro = DecimalUtil.ZERO ;
      AV25CosAny = DecimalUtil.ZERO ;
      AV40BarCosPD = DecimalUtil.ZERO ;
      AV41BarCosAD = DecimalUtil.ZERO ;
      AV42BarCosAA = DecimalUtil.ZERO ;
      AV43BarCosPA = DecimalUtil.ZERO ;
      AV44BarCosCol = DecimalUtil.ZERO ;
      AV45BarCosAnc = DecimalUtil.ZERO ;
      GXv_dtime15 = new java.util.Date[1] ;
      GXv_int5 = new byte[1] ;
      P03CB7_A396EmprCod = new String[] {""} ;
      P03CB7_A129BarCod = new int[1] ;
      P03CB7_A132BarCodReo = new byte[1] ;
      P03CB7_A130BarCodPar = new String[] {""} ;
      P03CB7_A3595BarMacCod = new int[1] ;
      P03CB7_A148BarEstReo = new byte[1] ;
      P03CB7_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CB7_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CB7_A180BarMaqCod = new String[] {""} ;
      P03CB7_A2759BarMaqGru = new String[] {""} ;
      P03CB7_A189BarNumAny = new short[1] ;
      P03CB7_A2498BarPrdPes = new String[] {""} ;
      P03CB7_A3871BarFecCRe = new java.util.Date[] {GXutil.nullDate()} ;
      P03CB7_A2448BarFecEnR = new java.util.Date[] {GXutil.nullDate()} ;
      P03CB7_n2448BarFecEnR = new boolean[] {false} ;
      P03CB7_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CB7_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CB7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CB7_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A180BarMaqCod = "" ;
      A2759BarMaqGru = "" ;
      A2498BarPrdPes = "" ;
      A3871BarFecCRe = GXutil.nullDate() ;
      A2448BarFecEnR = GXutil.nullDate() ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      AV39BarAgrLot = "" ;
      AV75RecTotKgm = DecimalUtil.ZERO ;
      AV81RecTotMtr = DecimalUtil.ZERO ;
      AV46BarCosPD1 = DecimalUtil.ZERO ;
      AV47BarCosAD1 = DecimalUtil.ZERO ;
      AV48BarCosAA1 = DecimalUtil.ZERO ;
      AV49BarCosPA1 = DecimalUtil.ZERO ;
      AV50BarCosCol1 = DecimalUtil.ZERO ;
      AV51BarCosAnc1 = DecimalUtil.ZERO ;
      AV84BarKgm = DecimalUtil.ZERO ;
      AV78RecKgm = DecimalUtil.ZERO ;
      AV79RecMtr = DecimalUtil.ZERO ;
      P03CB8_A396EmprCod = new String[] {""} ;
      P03CB8_A129BarCod = new int[1] ;
      P03CB8_A132BarCodReo = new byte[1] ;
      P03CB8_A130BarCodPar = new String[] {""} ;
      P03CB8_A119BarAgrCod = new int[1] ;
      P03CB8_A124BarAgrReo = new byte[1] ;
      P03CB8_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      AV52Kilos = DecimalUtil.ZERO ;
      AV82Metros = DecimalUtil.ZERO ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int17 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int6 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_int19 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char16 = new String[1] ;
      GXv_int18 = new short[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pclostin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pclostin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pclostin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclostin__default(),
         new Object[] {
             new Object[] {
            P03CB2_A719PrdNum, P03CB2_n719PrdNum, P03CB2_A396EmprCod, P03CB2_A129BarCod, P03CB2_A132BarCodReo, P03CB2_A130BarCodPar, P03CB2_A2804RecLinMaq, P03CB2_A727PrdRec, P03CB2_A811RecLin, P03CB2_A1273RecLinPro
            }
            , new Object[] {
            P03CB3_A396EmprCod, P03CB3_A129BarCod, P03CB3_A132BarCodReo, P03CB3_A130BarCodPar, P03CB3_A2804RecLinMaq, P03CB3_A6039RecAcab, P03CB3_n6039RecAcab, P03CB3_A2805RecVolPrd, P03CB3_A4259RecTotKgs, P03CB3_A4260RecTotMts,
            P03CB3_n4260RecTotMts, P03CB3_A602MaqCod
            }
            , new Object[] {
            P03CB4_A396EmprCod, P03CB4_A129BarCod, P03CB4_A132BarCodReo, P03CB4_A130BarCodPar, P03CB4_A2804RecLinMaq, P03CB4_A1273RecLinPro
            }
            , new Object[] {
            P03CB7_A396EmprCod, P03CB7_A129BarCod, P03CB7_A132BarCodReo, P03CB7_A130BarCodPar, P03CB7_A3595BarMacCod, P03CB7_A148BarEstReo, P03CB7_A141BarCosPro, P03CB7_A140BarCosAny, P03CB7_A180BarMaqCod, P03CB7_A2759BarMaqGru,
            P03CB7_A189BarNumAny, P03CB7_A2498BarPrdPes, P03CB7_A3871BarFecCRe, P03CB7_A2448BarFecEnR, P03CB7_n2448BarFecEnR, P03CB7_A184BarMtr, P03CB7_A870BarTotMtr, P03CB7_A166BarKgm, P03CB7_A219BarTotAgr
            }
            , new Object[] {
            P03CB8_A396EmprCod, P03CB8_A129BarCod, P03CB8_A132BarCodReo, P03CB8_A130BarCodPar, P03CB8_A119BarAgrCod, P03CB8_A124BarAgrReo, P03CB8_A122BarAgrPar
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
   private byte AV16Consumos ;
   private byte AV87Cc_almcod ;
   private byte AV55FlagHisRet ;
   private byte AV58Matizar ;
   private byte AV70NCLec ;
   private byte AV77KGSREA ;
   private byte AV29Flag ;
   private byte AV37FlagFT ;
   private byte AV38FlagDia ;
   private byte AV66Ricoltex ;
   private byte AV67Vertex ;
   private byte AV54FlagHss ;
   private byte AV30Flag2 ;
   private byte AV33FlagCcs ;
   private byte AV74CtrlRec ;
   private byte AV88Nalmcc ;
   private byte AV89TyTelas ;
   private byte GXt_int4 ;
   private byte A1273RecLinPro ;
   private byte AV60Dia ;
   private byte AV61Mes ;
   private byte AV59Lconti ;
   private byte AV31FlagLR ;
   private byte GXv_int5[] ;
   private byte A148BarEstReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int7[] ;
   private short AV17Anyadi ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV62Any ;
   private short AV64TipDefCod ;
   private short AV65CodCausa ;
   private short AV72RecLinMaq ;
   private short A189BarNumAny ;
   private short AV63Esttinnr ;
   private short GXv_int10[] ;
   private short GXv_int18[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV57RecNumInt ;
   private int AV73RecVolprd ;
   private int A2805RecVolPrd ;
   private int A3595BarMacCod ;
   private int A119BarAgrCod ;
   private int GXv_int17[] ;
   private int GXv_int6[] ;
   private int GXv_int19[] ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4260RecTotMts ;
   private java.math.BigDecimal AV76RecTotKgs ;
   private java.math.BigDecimal AV80RecTotMts ;
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
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal AV75RecTotKgm ;
   private java.math.BigDecimal AV81RecTotMtr ;
   private java.math.BigDecimal AV46BarCosPD1 ;
   private java.math.BigDecimal AV47BarCosAD1 ;
   private java.math.BigDecimal AV48BarCosAA1 ;
   private java.math.BigDecimal AV49BarCosPA1 ;
   private java.math.BigDecimal AV50BarCosCol1 ;
   private java.math.BigDecimal AV51BarCosAnc1 ;
   private java.math.BigDecimal AV84BarKgm ;
   private java.math.BigDecimal AV78RecKgm ;
   private java.math.BigDecimal AV79RecMtr ;
   private java.math.BigDecimal AV52Kilos ;
   private java.math.BigDecimal AV82Metros ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15CieCerAny ;
   private String AV18MaqCod ;
   private String AV19Tipo ;
   private String AV85CierreAM ;
   private String AV34Station ;
   private String AV36EmprNom ;
   private String AV35UsurCod ;
   private String AV83PrdRect ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A727PrdRec ;
   private String AV71RecAcab ;
   private String A6039RecAcab ;
   private String A602MaqCod ;
   private String Gx_msg ;
   private String A180BarMaqCod ;
   private String A2759BarMaqGru ;
   private String A2498BarPrdPes ;
   private String AV39BarAgrLot ;
   private String A122BarAgrPar ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char20[] ;
   private String GXv_char16[] ;
   private java.util.Date AV86Ca_diahora ;
   private java.util.Date GXv_dtime15[] ;
   private java.util.Date AV68Fec_t ;
   private java.util.Date Gx_date ;
   private java.util.Date A3871BarFecCRe ;
   private java.util.Date A2448BarFecEnR ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n4260RecTotMts ;
   private boolean n2448BarFecEnR ;
   private byte[] aP12 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P03CB2_A719PrdNum ;
   private boolean[] P03CB2_n719PrdNum ;
   private String[] P03CB2_A396EmprCod ;
   private int[] P03CB2_A129BarCod ;
   private byte[] P03CB2_A132BarCodReo ;
   private String[] P03CB2_A130BarCodPar ;
   private short[] P03CB2_A2804RecLinMaq ;
   private String[] P03CB2_A727PrdRec ;
   private short[] P03CB2_A811RecLin ;
   private byte[] P03CB2_A1273RecLinPro ;
   private String[] P03CB3_A396EmprCod ;
   private int[] P03CB3_A129BarCod ;
   private byte[] P03CB3_A132BarCodReo ;
   private String[] P03CB3_A130BarCodPar ;
   private short[] P03CB3_A2804RecLinMaq ;
   private String[] P03CB3_A6039RecAcab ;
   private boolean[] P03CB3_n6039RecAcab ;
   private int[] P03CB3_A2805RecVolPrd ;
   private java.math.BigDecimal[] P03CB3_A4259RecTotKgs ;
   private java.math.BigDecimal[] P03CB3_A4260RecTotMts ;
   private boolean[] P03CB3_n4260RecTotMts ;
   private String[] P03CB3_A602MaqCod ;
   private String[] P03CB4_A396EmprCod ;
   private int[] P03CB4_A129BarCod ;
   private byte[] P03CB4_A132BarCodReo ;
   private String[] P03CB4_A130BarCodPar ;
   private short[] P03CB4_A2804RecLinMaq ;
   private byte[] P03CB4_A1273RecLinPro ;
   private String[] P03CB7_A396EmprCod ;
   private int[] P03CB7_A129BarCod ;
   private byte[] P03CB7_A132BarCodReo ;
   private String[] P03CB7_A130BarCodPar ;
   private int[] P03CB7_A3595BarMacCod ;
   private byte[] P03CB7_A148BarEstReo ;
   private java.math.BigDecimal[] P03CB7_A141BarCosPro ;
   private java.math.BigDecimal[] P03CB7_A140BarCosAny ;
   private String[] P03CB7_A180BarMaqCod ;
   private String[] P03CB7_A2759BarMaqGru ;
   private short[] P03CB7_A189BarNumAny ;
   private String[] P03CB7_A2498BarPrdPes ;
   private java.util.Date[] P03CB7_A3871BarFecCRe ;
   private java.util.Date[] P03CB7_A2448BarFecEnR ;
   private boolean[] P03CB7_n2448BarFecEnR ;
   private java.math.BigDecimal[] P03CB7_A184BarMtr ;
   private java.math.BigDecimal[] P03CB7_A870BarTotMtr ;
   private java.math.BigDecimal[] P03CB7_A166BarKgm ;
   private java.math.BigDecimal[] P03CB7_A219BarTotAgr ;
   private String[] P03CB8_A396EmprCod ;
   private int[] P03CB8_A129BarCod ;
   private byte[] P03CB8_A132BarCodReo ;
   private String[] P03CB8_A130BarCodPar ;
   private int[] P03CB8_A119BarAgrCod ;
   private byte[] P03CB8_A124BarAgrReo ;
   private String[] P03CB8_A122BarAgrPar ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pclostin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pclostin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pclostin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pclostin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03CB2", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdRec, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (? = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03CB3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecAcab, RecVolPrd, RecTotKgs, RecTotMts, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03CB4", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03CB7", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarMacCod, T1.BarEstReo, T1.BarCosPro, T1.BarCosAny, T1.BarMaqCod, T1.BarMaqGru, T1.BarNumAny, T1.BarPrdPes, T1.BarFecCRe, T1.BarFecEnR, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T2.BarTotMtr, 0) AS BarTotMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03CB8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03CB9", "UPDATE TXPBARCAD SET BarCosPro=?, BarCosAny=?, BarMaqCod=?, BarMaqGru=?, BarNumAny=?, BarPrdPes=?, BarFecCRe=?, BarFecEnR=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 1 :
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
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 3 :
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
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 4);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setDate(7, (java.util.Date)parms[6]);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[8]);
               }
               stmt.setString(9, (String)parms[9], 3);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setString(12, (String)parms[12], 1);
               return;
      }
   }

}

