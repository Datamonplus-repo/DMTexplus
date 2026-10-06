package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcietin extends GXProcedure
{
   public pcietin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcietin.class ), "" );
   }

   public pcietin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      pcietin.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
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
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
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
                             String[] aP9 )
   {
      pcietin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcietin.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcietin.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcietin.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcietin.this.AV15CieCerAny = aP4[0];
      this.aP4 = aP4;
      pcietin.this.AV16Consumos = aP5[0];
      this.aP5 = aP5;
      pcietin.this.AV17Anyadi = aP6[0];
      this.aP6 = aP6;
      pcietin.this.A2804RecLinMaq = aP7[0];
      this.aP7 = aP7;
      pcietin.this.AV18MaqCod = aP8[0];
      this.aP8 = aP8;
      pcietin.this.AV19Tipo = aP9[0];
      this.aP9 = aP9;
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
      pcietin.this.A396EmprCod = GXv_char1[0] ;
      pcietin.this.AV36EmprNom = GXv_char2[0] ;
      pcietin.this.AV35UsurCod = GXv_char3[0] ;
      GXt_int4 = AV69JPF ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int5) ;
      pcietin.this.GXt_int4 = GXv_int5[0] ;
      AV69JPF = GXt_int4 ;
      AV68Fec_t = Gx_date ;
      GXt_int6 = AV88Cc_ALmcod ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "ALAUTT", "") ;
      GXv_int7[0] = GXt_int6 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int7) ;
      pcietin.this.A396EmprCod = GXv_char3[0] ;
      pcietin.this.GXt_int6 = GXv_int7[0] ;
      AV88Cc_ALmcod = (byte)(GXt_int6) ;
      if ( AV88Cc_ALmcod == 0 )
      {
         AV88Cc_ALmcod = (byte)(99) ;
      }
      GXt_int4 = AV85Clostin ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLOSTN", ""), GXv_int5) ;
      pcietin.this.GXt_int4 = GXv_int5[0] ;
      AV85Clostin = GXt_int4 ;
      if ( AV85Clostin == 1 )
      {
         AV87Ca_diahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
         System.out.println( httpContext.getMessage( "Go PCLOSTIN", "") );
         GXv_char3[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_char1[0] = AV15CieCerAny ;
         GXv_int8[0] = AV16Consumos ;
         GXv_int9[0] = AV17Anyadi ;
         GXv_int10[0] = A2804RecLinMaq ;
         GXv_char11[0] = AV18MaqCod ;
         GXv_char12[0] = AV19Tipo ;
         GXv_char13[0] = httpContext.getMessage( "M", "") ;
         GXv_dtime14[0] = AV87Ca_diahora ;
         GXv_int15[0] = AV88Cc_ALmcod ;
         new app.pclostin(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int5, GXv_char2, GXv_char1, GXv_int8, GXv_int9, GXv_int10, GXv_char11, GXv_char12, GXv_char13, GXv_dtime14, GXv_int15) ;
         pcietin.this.A396EmprCod = GXv_char3[0] ;
         pcietin.this.A129BarCod = GXv_int7[0] ;
         pcietin.this.A132BarCodReo = GXv_int5[0] ;
         pcietin.this.A130BarCodPar = GXv_char2[0] ;
         pcietin.this.AV15CieCerAny = GXv_char1[0] ;
         pcietin.this.AV16Consumos = GXv_int8[0] ;
         pcietin.this.AV17Anyadi = GXv_int9[0] ;
         pcietin.this.A2804RecLinMaq = GXv_int10[0] ;
         pcietin.this.AV18MaqCod = GXv_char11[0] ;
         pcietin.this.AV19Tipo = GXv_char12[0] ;
         pcietin.this.AV87Ca_diahora = GXv_dtime14[0] ;
         pcietin.this.AV88Cc_ALmcod = GXv_int15[0] ;
         System.out.println( httpContext.getMessage( "Return PCLOSTIN", "") );
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_int4 = AV55FlagHisRet ;
      GXv_int15[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISRET", ""), GXv_int15) ;
      pcietin.this.GXt_int4 = GXv_int15[0] ;
      AV55FlagHisRet = GXt_int4 ;
      GXt_int4 = AV58Matizar ;
      GXv_int15[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MATIZA", ""), GXv_int15) ;
      pcietin.this.GXt_int4 = GXv_int15[0] ;
      AV58Matizar = GXt_int4 ;
      GXt_int4 = AV70NCLec ;
      GXv_int15[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int15) ;
      pcietin.this.GXt_int4 = GXv_int15[0] ;
      AV70NCLec = GXt_int4 ;
      GXt_int4 = AV77KGSREA ;
      GXv_int15[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KGSREA", ""), GXv_int15) ;
      pcietin.this.GXt_int4 = GXv_int15[0] ;
      AV77KGSREA = GXt_int4 ;
      if ( AV58Matizar == 1 )
      {
         AV60Dia = (byte)(GXutil.day( AV68Fec_t)) ;
         AV61Mes = (byte)(GXutil.month( AV68Fec_t)) ;
         AV62Any = (short)(GXutil.year( AV68Fec_t)) ;
         AV64TipDefCod = (short)(0) ;
         AV65CodCausa = (short)(0) ;
         System.out.println( httpContext.getMessage( "Go PMAT001", "") );
         GXv_char13[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int15[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         GXv_int8[0] = AV59Lconti ;
         new app.pmat001(remoteHandle, context).execute( GXv_char13, GXv_int7, GXv_int15, GXv_char12, GXv_int8) ;
         pcietin.this.A396EmprCod = GXv_char13[0] ;
         pcietin.this.A129BarCod = GXv_int7[0] ;
         pcietin.this.A132BarCodReo = GXv_int15[0] ;
         pcietin.this.A130BarCodPar = GXv_char12[0] ;
         pcietin.this.AV59Lconti = GXv_int8[0] ;
         System.out.println( httpContext.getMessage( "Return PMAT001", "") );
      }
      if ( AV55FlagHisRet == 1 )
      {
         System.out.println( httpContext.getMessage( "Go PHISREC", "") );
         GXv_char13[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int15[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         GXv_int10[0] = A2804RecLinMaq ;
         new app.phisrec(remoteHandle, context).execute( GXv_char13, GXv_int7, GXv_int15, GXv_char12, GXv_int10) ;
         pcietin.this.A396EmprCod = GXv_char13[0] ;
         pcietin.this.A129BarCod = GXv_int7[0] ;
         pcietin.this.A132BarCodReo = GXv_int15[0] ;
         pcietin.this.A130BarCodPar = GXv_char12[0] ;
         pcietin.this.A2804RecLinMaq = GXv_int10[0] ;
         System.out.println( httpContext.getMessage( "Return PHISREC", "") );
      }
      AV31FlagLR = (byte)(0) ;
      AV57RecNumInt = 0 ;
      AV71RecAcab = " " ;
      AV73RecVolprd = 0 ;
      /* Using cursor P00482 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P00482_A6039RecAcab[0] ;
         n6039RecAcab = P00482_n6039RecAcab[0] ;
         A2805RecVolPrd = P00482_A2805RecVolPrd[0] ;
         A4259RecTotKgs = P00482_A4259RecTotKgs[0] ;
         A4260RecTotMts = P00482_A4260RecTotMts[0] ;
         n4260RecTotMts = P00482_n4260RecTotMts[0] ;
         A602MaqCod = P00482_A602MaqCod[0] ;
         AV71RecAcab = A6039RecAcab ;
         AV72RecLinMaq = A2804RecLinMaq ;
         AV73RecVolprd = A2805RecVolPrd ;
         AV76RecTotKgs = A4259RecTotKgs ;
         AV80RecTotMts = A4260RecTotMts ;
         AV18MaqCod = A602MaqCod ;
         /* Using cursor P00483 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1273RecLinPro = P00483_A1273RecLinPro[0] ;
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
      GXv_int15[0] = AV29Flag ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOSIFI", ""), GXv_int15) ;
      pcietin.this.AV29Flag = GXv_int15[0] ;
      GXv_int15[0] = AV37FlagFT ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECTIN", ""), GXv_int15) ;
      pcietin.this.AV37FlagFT = GXv_int15[0] ;
      GXv_int15[0] = AV38FlagDia ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIARIO", ""), GXv_int15) ;
      pcietin.this.AV38FlagDia = GXv_int15[0] ;
      GXt_int4 = AV66Ricoltex ;
      GXv_int15[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RICOLT", ""), GXv_int15) ;
      pcietin.this.GXt_int4 = GXv_int15[0] ;
      AV66Ricoltex = GXt_int4 ;
      GXt_int4 = AV67Vertex ;
      GXv_int15[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int15) ;
      pcietin.this.GXt_int4 = GXv_int15[0] ;
      AV67Vertex = GXt_int4 ;
      AV54FlagHss = (byte)(0) ;
      GXv_int15[0] = AV54FlagHss ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int15) ;
      pcietin.this.AV54FlagHss = GXv_int15[0] ;
      GXv_int15[0] = AV30Flag2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BARROS", ""), GXv_int15) ;
      pcietin.this.AV30Flag2 = GXv_int15[0] ;
      GXv_int15[0] = AV33FlagCcs ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int15) ;
      pcietin.this.AV33FlagCcs = GXv_int15[0] ;
      GXv_int15[0] = AV74CtrlRec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRREP", ""), GXv_int15) ;
      pcietin.this.AV74CtrlRec = GXv_int15[0] ;
      AV83PrdRect = "" ;
      /* Using cursor P00484 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(AV74CtrlRec)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P00484_A719PrdNum[0] ;
         n719PrdNum = P00484_n719PrdNum[0] ;
         A727PrdRec = P00484_A727PrdRec[0] ;
         A811RecLin = P00484_A811RecLin[0] ;
         A1273RecLinPro = P00484_A1273RecLinPro[0] ;
         A727PrdRec = P00484_A727PrdRec[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hay productos en recuento y el control está activo. No se puede cerrar la receta¡¡¡", ""));
            AV83PrdRect = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV83PrdRect, httpContext.getMessage( "S", "")) == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( AV30Flag2 == 1 ) && ( GXutil.strcmp(AV19Tipo, httpContext.getMessage( "A", "")) == 0 ) )
      {
         System.out.println( httpContext.getMessage( "Go PCALBAR", "") );
         GXv_char13[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int15[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         GXv_decimal16[0] = AV24CosPro ;
         GXv_decimal17[0] = AV25CosAny ;
         GXv_int8[0] = AV16Consumos ;
         GXv_int10[0] = A2804RecLinMaq ;
         new app.pcalbar(remoteHandle, context).execute( GXv_char13, GXv_int7, GXv_int15, GXv_char12, GXv_decimal16, GXv_decimal17, GXv_int8, GXv_int10) ;
         pcietin.this.A396EmprCod = GXv_char13[0] ;
         pcietin.this.A129BarCod = GXv_int7[0] ;
         pcietin.this.A132BarCodReo = GXv_int15[0] ;
         pcietin.this.A130BarCodPar = GXv_char12[0] ;
         pcietin.this.AV24CosPro = GXv_decimal16[0] ;
         pcietin.this.AV25CosAny = GXv_decimal17[0] ;
         pcietin.this.AV16Consumos = GXv_int8[0] ;
         pcietin.this.A2804RecLinMaq = GXv_int10[0] ;
         System.out.println( httpContext.getMessage( "Return PCALBAR", "") );
      }
      else
      {
         System.out.println( httpContext.getMessage( "Go PCALREC", "") );
         GXv_char13[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int15[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         GXv_decimal17[0] = AV24CosPro ;
         GXv_decimal16[0] = AV25CosAny ;
         GXv_int8[0] = AV16Consumos ;
         GXv_int10[0] = A2804RecLinMaq ;
         GXv_char11[0] = AV19Tipo ;
         new app.pcalrec(remoteHandle, context).execute( GXv_char13, GXv_int7, GXv_int15, GXv_char12, GXv_decimal17, GXv_decimal16, GXv_int8, GXv_int10, GXv_char11) ;
         pcietin.this.A396EmprCod = GXv_char13[0] ;
         pcietin.this.A129BarCod = GXv_int7[0] ;
         pcietin.this.A132BarCodReo = GXv_int15[0] ;
         pcietin.this.A130BarCodPar = GXv_char12[0] ;
         pcietin.this.AV24CosPro = GXv_decimal17[0] ;
         pcietin.this.AV25CosAny = GXv_decimal16[0] ;
         pcietin.this.AV16Consumos = GXv_int8[0] ;
         pcietin.this.A2804RecLinMaq = GXv_int10[0] ;
         pcietin.this.AV19Tipo = GXv_char11[0] ;
         System.out.println( httpContext.getMessage( "Return PCALREC", "") );
         if ( AV38FlagDia == 1 )
         {
            System.out.println( httpContext.getMessage( "Go PCOSDAB", "") );
            GXv_char13[0] = A396EmprCod ;
            GXv_int7[0] = A129BarCod ;
            GXv_int15[0] = A132BarCodReo ;
            GXv_char12[0] = A130BarCodPar ;
            GXv_int10[0] = A2804RecLinMaq ;
            GXv_decimal17[0] = AV40BarCosPD ;
            GXv_decimal16[0] = AV41BarCosAD ;
            GXv_decimal18[0] = AV42BarCosAA ;
            GXv_decimal19[0] = AV43BarCosPA ;
            GXv_decimal20[0] = AV44BarCosCol ;
            GXv_decimal21[0] = AV45BarCosAnc ;
            new app.pcosdab(remoteHandle, context).execute( GXv_char13, GXv_int7, GXv_int15, GXv_char12, GXv_int10, GXv_decimal17, GXv_decimal16, GXv_decimal18, GXv_decimal19, GXv_decimal20, GXv_decimal21) ;
            pcietin.this.A396EmprCod = GXv_char13[0] ;
            pcietin.this.A129BarCod = GXv_int7[0] ;
            pcietin.this.A132BarCodReo = GXv_int15[0] ;
            pcietin.this.A130BarCodPar = GXv_char12[0] ;
            pcietin.this.A2804RecLinMaq = GXv_int10[0] ;
            pcietin.this.AV40BarCosPD = GXv_decimal17[0] ;
            pcietin.this.AV41BarCosAD = GXv_decimal16[0] ;
            pcietin.this.AV42BarCosAA = GXv_decimal18[0] ;
            pcietin.this.AV43BarCosPA = GXv_decimal19[0] ;
            pcietin.this.AV44BarCosCol = GXv_decimal20[0] ;
            pcietin.this.AV45BarCosAnc = GXv_decimal21[0] ;
            System.out.println( httpContext.getMessage( "Return PCOSDAB", "") );
         }
      }
      if ( AV33FlagCcs == 1 )
      {
         System.out.println( httpContext.getMessage( "Go PCIECCS", "") );
         GXv_char13[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int15[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         GXv_int10[0] = A2804RecLinMaq ;
         GXv_char11[0] = AV35UsurCod ;
         new app.pcieccs(remoteHandle, context).execute( GXv_char13, GXv_int7, GXv_int15, GXv_char12, GXv_int10, GXv_char11) ;
         pcietin.this.A396EmprCod = GXv_char13[0] ;
         pcietin.this.A129BarCod = GXv_int7[0] ;
         pcietin.this.A132BarCodReo = GXv_int15[0] ;
         pcietin.this.A130BarCodPar = GXv_char12[0] ;
         pcietin.this.A2804RecLinMaq = GXv_int10[0] ;
         pcietin.this.AV35UsurCod = GXv_char11[0] ;
         System.out.println( httpContext.getMessage( "Return PCIECCS", "") );
      }
      if ( AV31FlagLR == 1 )
      {
         /* Using cursor P00485 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A3595BarMacCod = P00485_A3595BarMacCod[0] ;
            A148BarEstReo = P00485_A148BarEstReo[0] ;
            A141BarCosPro = P00485_A141BarCosPro[0] ;
            A140BarCosAny = P00485_A140BarCosAny[0] ;
            A180BarMaqCod = P00485_A180BarMaqCod[0] ;
            A2759BarMaqGru = P00485_A2759BarMaqGru[0] ;
            A189BarNumAny = P00485_A189BarNumAny[0] ;
            A2498BarPrdPes = P00485_A2498BarPrdPes[0] ;
            A3871BarFecCRe = P00485_A3871BarFecCRe[0] ;
            A2448BarFecEnR = P00485_A2448BarFecEnR[0] ;
            n2448BarFecEnR = P00485_n2448BarFecEnR[0] ;
            /* Using cursor P00486 */
            pr_default.execute(4, new Object[] {A396EmprCod});
            A3915EmpNumDec = P00486_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P00486_n3915EmpNumDec[0] ;
            /* Using cursor P00488 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            if ( (pr_default.getStatus(5) != 101) )
            {
               A870BarTotMtr = P00488_A870BarTotMtr[0] ;
               A219BarTotAgr = P00488_A219BarTotAgr[0] ;
            }
            else
            {
               A219BarTotAgr = DecimalUtil.doubleToDec(0) ;
               A870BarTotMtr = DecimalUtil.doubleToDec(0) ;
            }
            /* Using cursor P004810 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            if ( (pr_default.getStatus(6) != 101) )
            {
               A184BarMtr = P004810_A184BarMtr[0] ;
               A166BarKgm = P004810_A166BarKgm[0] ;
            }
            else
            {
               A166BarKgm = DecimalUtil.doubleToDec(0) ;
               A184BarMtr = DecimalUtil.doubleToDec(0) ;
            }
            if ( A870BarTotMtr.doubleValue() != 0 )
            {
               A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
            }
            else
            {
               A871RecTotMtr = A184BarMtr ;
            }
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
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
                  if ( A3915EmpNumDec == 0 )
                  {
                     if ( AV76RecTotKgs.doubleValue() == 0 )
                     {
                        AV46BarCosPD1 = A166BarKgm.multiply(AV40BarCosPD).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                        AV47BarCosAD1 = A166BarKgm.multiply(AV41BarCosAD).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                        AV48BarCosAA1 = A166BarKgm.multiply(AV42BarCosAA).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                        AV49BarCosPA1 = A166BarKgm.multiply(AV43BarCosPA).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                        AV50BarCosCol1 = A166BarKgm.multiply(AV44BarCosCol).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                        AV51BarCosAnc1 = A166BarKgm.multiply(AV45BarCosAnc).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
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
                        AV46BarCosPD1 = AV84BarKgm.multiply(AV40BarCosPD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                        AV47BarCosAD1 = AV84BarKgm.multiply(AV41BarCosAD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                        AV48BarCosAA1 = AV84BarKgm.multiply(AV42BarCosAA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                        AV49BarCosPA1 = AV84BarKgm.multiply(AV43BarCosPA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                        AV50BarCosCol1 = AV84BarKgm.multiply(AV44BarCosCol).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                        AV51BarCosAnc1 = AV84BarKgm.multiply(AV45BarCosAnc).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                     }
                  }
                  else
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
                        if ( AV84BarKgm.doubleValue() == 0 )
                        {
                           AV84BarKgm = AV76RecTotKgs ;
                        }
                        AV46BarCosPD1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV40BarCosPD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV47BarCosAD1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV41BarCosAD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV48BarCosAA1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV42BarCosAA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV49BarCosPA1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV43BarCosPA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV50BarCosCol1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV44BarCosCol).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                        AV51BarCosAnc1 = GXutil.roundDecimal( AV84BarKgm.multiply(AV45BarCosAnc).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
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
               Gx_msg = httpContext.getMessage( "Voy a Pesttin", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               System.out.println( Gx_msg );
               GXv_char13[0] = A396EmprCod ;
               GXv_int7[0] = A129BarCod ;
               GXv_int15[0] = A132BarCodReo ;
               GXv_char12[0] = A130BarCodPar ;
               GXv_decimal21[0] = AV46BarCosPD1 ;
               GXv_decimal20[0] = AV47BarCosAD1 ;
               GXv_decimal19[0] = AV48BarCosAA1 ;
               GXv_decimal18[0] = AV49BarCosPA1 ;
               GXv_decimal17[0] = AV50BarCosCol1 ;
               GXv_decimal16[0] = AV51BarCosAnc1 ;
               GXv_char11[0] = AV39BarAgrLot ;
               GXv_int22[0] = AV57RecNumInt ;
               GXv_int10[0] = AV63Esttinnr ;
               GXv_char3[0] = AV71RecAcab ;
               GXv_int9[0] = AV72RecLinMaq ;
               GXv_int23[0] = AV73RecVolprd ;
               GXv_char2[0] = AV18MaqCod ;
               GXv_decimal24[0] = AV78RecKgm ;
               GXv_decimal25[0] = AV79RecMtr ;
               new app.pesttin(remoteHandle, context).execute( GXv_char13, GXv_int7, GXv_int15, GXv_char12, GXv_decimal21, GXv_decimal20, GXv_decimal19, GXv_decimal18, GXv_decimal17, GXv_decimal16, GXv_char11, GXv_int22, GXv_int10, GXv_char3, GXv_int9, GXv_int23, GXv_char2, GXv_decimal24, GXv_decimal25) ;
               pcietin.this.A396EmprCod = GXv_char13[0] ;
               pcietin.this.A129BarCod = GXv_int7[0] ;
               pcietin.this.A132BarCodReo = GXv_int15[0] ;
               pcietin.this.A130BarCodPar = GXv_char12[0] ;
               pcietin.this.AV46BarCosPD1 = GXv_decimal21[0] ;
               pcietin.this.AV47BarCosAD1 = GXv_decimal20[0] ;
               pcietin.this.AV48BarCosAA1 = GXv_decimal19[0] ;
               pcietin.this.AV49BarCosPA1 = GXv_decimal18[0] ;
               pcietin.this.AV50BarCosCol1 = GXv_decimal17[0] ;
               pcietin.this.AV51BarCosAnc1 = GXv_decimal16[0] ;
               pcietin.this.AV39BarAgrLot = GXv_char11[0] ;
               pcietin.this.AV57RecNumInt = GXv_int22[0] ;
               pcietin.this.AV63Esttinnr = GXv_int10[0] ;
               pcietin.this.AV71RecAcab = GXv_char3[0] ;
               pcietin.this.AV72RecLinMaq = GXv_int9[0] ;
               pcietin.this.AV73RecVolprd = GXv_int23[0] ;
               pcietin.this.AV18MaqCod = GXv_char2[0] ;
               pcietin.this.AV78RecKgm = GXv_decimal24[0] ;
               pcietin.this.AV79RecMtr = GXv_decimal25[0] ;
               Gx_msg = httpContext.getMessage( "Vengo a Pesttin", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               System.out.println( Gx_msg );
               if ( ( AV67Vertex == 1 ) && ( AV66Ricoltex == 1 ) )
               {
                  GXv_char13[0] = A396EmprCod ;
                  GXv_int23[0] = A129BarCod ;
                  GXv_int15[0] = A132BarCodReo ;
                  GXv_char12[0] = A130BarCodPar ;
                  GXv_char11[0] = httpContext.getMessage( "CTI", "") ;
                  new app.pvxleepz(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int15, GXv_char12, GXv_char11) ;
                  pcietin.this.A396EmprCod = GXv_char13[0] ;
                  pcietin.this.A129BarCod = GXv_int23[0] ;
                  pcietin.this.A132BarCodReo = GXv_int15[0] ;
                  pcietin.this.A130BarCodPar = GXv_char12[0] ;
               }
               if ( ( AV58Matizar == 1 ) && ( AV59Lconti == 1 ) )
               {
               }
            }
            /* Using cursor P004811 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A119BarAgrCod = P004811_A119BarAgrCod[0] ;
               A124BarAgrReo = P004811_A124BarAgrReo[0] ;
               A122BarAgrPar = P004811_A122BarAgrPar[0] ;
               System.out.println( httpContext.getMessage( "Go PMODCOS", "") );
               GXv_char13[0] = A396EmprCod ;
               GXv_int23[0] = A119BarAgrCod ;
               GXv_int15[0] = A124BarAgrReo ;
               GXv_char12[0] = A122BarAgrPar ;
               GXv_decimal25[0] = AV24CosPro ;
               GXv_decimal24[0] = AV25CosAny ;
               GXv_char11[0] = AV18MaqCod ;
               GXv_int10[0] = AV17Anyadi ;
               GXv_char3[0] = AV15CieCerAny ;
               new app.pmodcos(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int15, GXv_char12, GXv_decimal25, GXv_decimal24, GXv_char11, GXv_int10, GXv_char3) ;
               pcietin.this.A396EmprCod = GXv_char13[0] ;
               pcietin.this.A119BarAgrCod = GXv_int23[0] ;
               pcietin.this.A124BarAgrReo = GXv_int15[0] ;
               pcietin.this.A122BarAgrPar = GXv_char12[0] ;
               pcietin.this.AV24CosPro = GXv_decimal25[0] ;
               pcietin.this.AV25CosAny = GXv_decimal24[0] ;
               pcietin.this.AV18MaqCod = GXv_char11[0] ;
               pcietin.this.AV17Anyadi = GXv_int10[0] ;
               pcietin.this.AV15CieCerAny = GXv_char3[0] ;
               System.out.println( httpContext.getMessage( "Return PMODCOS", "") );
               if ( AV38FlagDia == 1 )
               {
                  AV52Kilos = DecimalUtil.doubleToDec(0) ;
                  System.out.println( httpContext.getMessage( "Go PKILOS", "") );
                  GXv_char13[0] = A396EmprCod ;
                  GXv_int23[0] = A119BarAgrCod ;
                  GXv_int15[0] = A124BarAgrReo ;
                  GXv_char12[0] = A122BarAgrPar ;
                  GXv_decimal25[0] = AV52Kilos ;
                  new app.pkilos(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int15, GXv_char12, GXv_decimal25) ;
                  pcietin.this.A396EmprCod = GXv_char13[0] ;
                  pcietin.this.A119BarAgrCod = GXv_int23[0] ;
                  pcietin.this.A124BarAgrReo = GXv_int15[0] ;
                  pcietin.this.A122BarAgrPar = GXv_char12[0] ;
                  pcietin.this.AV52Kilos = GXv_decimal25[0] ;
                  System.out.println( httpContext.getMessage( "Return PKILOS", "") );
                  AV82Metros = DecimalUtil.doubleToDec(0) ;
                  System.out.println( httpContext.getMessage( "Go PMETROS", "") );
                  GXv_char13[0] = A396EmprCod ;
                  GXv_int23[0] = A119BarAgrCod ;
                  GXv_int15[0] = A124BarAgrReo ;
                  GXv_char12[0] = A122BarAgrPar ;
                  GXv_decimal25[0] = AV82Metros ;
                  new app.pmetros(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int15, GXv_char12, GXv_decimal25) ;
                  pcietin.this.A396EmprCod = GXv_char13[0] ;
                  pcietin.this.A119BarAgrCod = GXv_int23[0] ;
                  pcietin.this.A124BarAgrReo = GXv_int15[0] ;
                  pcietin.this.A122BarAgrPar = GXv_char12[0] ;
                  pcietin.this.AV82Metros = GXv_decimal25[0] ;
                  System.out.println( httpContext.getMessage( "Return PMETROS", "") );
                  AV76RecTotKgs = ((AV76RecTotKgs.doubleValue()>0) ? AV76RecTotKgs : A812RecTotKgm) ;
                  AV80RecTotMts = ((AV80RecTotMts.doubleValue()>0) ? AV80RecTotMts : A871RecTotMtr) ;
                  AV75RecTotKgm = ((AV77KGSREA==1) ? AV76RecTotKgs : A812RecTotKgm) ;
                  AV81RecTotMtr = ((AV77KGSREA==1) ? AV80RecTotMts : A871RecTotMtr) ;
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76RecTotKgs)==0) )
                  {
                     if ( A3915EmpNumDec == 0 )
                     {
                        if ( AV76RecTotKgs.doubleValue() == 0 )
                        {
                           AV46BarCosPD1 = AV52Kilos.multiply(AV40BarCosPD).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                           AV47BarCosAD1 = AV52Kilos.multiply(AV41BarCosAD).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                           AV48BarCosAA1 = AV52Kilos.multiply(AV42BarCosAA).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                           AV49BarCosPA1 = AV52Kilos.multiply(AV43BarCosPA).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                           AV50BarCosCol1 = AV52Kilos.multiply(AV44BarCosCol).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                           AV51BarCosAnc1 = AV52Kilos.multiply(AV45BarCosAnc).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                        }
                        else
                        {
                           if ( AV52Kilos.doubleValue() == 0 )
                           {
                              AV52Kilos = AV76RecTotKgs ;
                           }
                           AV46BarCosPD1 = AV52Kilos.multiply(AV40BarCosPD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                           AV47BarCosAD1 = AV52Kilos.multiply(AV41BarCosAD).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                           AV48BarCosAA1 = AV52Kilos.multiply(AV42BarCosAA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                           AV49BarCosPA1 = AV52Kilos.multiply(AV43BarCosPA).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                           AV50BarCosCol1 = AV52Kilos.multiply(AV44BarCosCol).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                           AV51BarCosAnc1 = AV52Kilos.multiply(AV45BarCosAnc).divide(AV76RecTotKgs, 18, java.math.RoundingMode.DOWN) ;
                        }
                     }
                     else
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
                  Gx_msg = httpContext.getMessage( "Voy a Pesttin.Agrupadas", "") + GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
                  System.out.println( Gx_msg );
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
                  System.out.println( httpContext.getMessage( "Voy a Pesttin.Agrupadas", "") );
                  GXv_char13[0] = A396EmprCod ;
                  GXv_int23[0] = A119BarAgrCod ;
                  GXv_int15[0] = A124BarAgrReo ;
                  GXv_char12[0] = A122BarAgrPar ;
                  GXv_decimal25[0] = AV46BarCosPD1 ;
                  GXv_decimal24[0] = AV47BarCosAD1 ;
                  GXv_decimal21[0] = AV48BarCosAA1 ;
                  GXv_decimal20[0] = AV49BarCosPA1 ;
                  GXv_decimal19[0] = AV50BarCosCol1 ;
                  GXv_decimal18[0] = AV51BarCosAnc1 ;
                  GXv_char11[0] = AV39BarAgrLot ;
                  GXv_int22[0] = AV57RecNumInt ;
                  GXv_int10[0] = AV63Esttinnr ;
                  GXv_char3[0] = AV71RecAcab ;
                  GXv_int9[0] = AV72RecLinMaq ;
                  GXv_int7[0] = AV73RecVolprd ;
                  GXv_char2[0] = AV18MaqCod ;
                  GXv_decimal17[0] = AV78RecKgm ;
                  GXv_decimal16[0] = AV79RecMtr ;
                  new app.pesttin(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int15, GXv_char12, GXv_decimal25, GXv_decimal24, GXv_decimal21, GXv_decimal20, GXv_decimal19, GXv_decimal18, GXv_char11, GXv_int22, GXv_int10, GXv_char3, GXv_int9, GXv_int7, GXv_char2, GXv_decimal17, GXv_decimal16) ;
                  pcietin.this.A396EmprCod = GXv_char13[0] ;
                  pcietin.this.A119BarAgrCod = GXv_int23[0] ;
                  pcietin.this.A124BarAgrReo = GXv_int15[0] ;
                  pcietin.this.A122BarAgrPar = GXv_char12[0] ;
                  pcietin.this.AV46BarCosPD1 = GXv_decimal25[0] ;
                  pcietin.this.AV47BarCosAD1 = GXv_decimal24[0] ;
                  pcietin.this.AV48BarCosAA1 = GXv_decimal21[0] ;
                  pcietin.this.AV49BarCosPA1 = GXv_decimal20[0] ;
                  pcietin.this.AV50BarCosCol1 = GXv_decimal19[0] ;
                  pcietin.this.AV51BarCosAnc1 = GXv_decimal18[0] ;
                  pcietin.this.AV39BarAgrLot = GXv_char11[0] ;
                  pcietin.this.AV57RecNumInt = GXv_int22[0] ;
                  pcietin.this.AV63Esttinnr = GXv_int10[0] ;
                  pcietin.this.AV71RecAcab = GXv_char3[0] ;
                  pcietin.this.AV72RecLinMaq = GXv_int9[0] ;
                  pcietin.this.AV73RecVolprd = GXv_int7[0] ;
                  pcietin.this.AV18MaqCod = GXv_char2[0] ;
                  pcietin.this.AV78RecKgm = GXv_decimal17[0] ;
                  pcietin.this.AV79RecMtr = GXv_decimal16[0] ;
                  System.out.println( httpContext.getMessage( "Vengo a Pesttin.Agrupadas", "") );
                  if ( ( AV67Vertex == 1 ) && ( AV66Ricoltex == 1 ) )
                  {
                     GXv_char13[0] = A396EmprCod ;
                     GXv_int23[0] = A119BarAgrCod ;
                     GXv_int15[0] = A124BarAgrReo ;
                     GXv_char12[0] = A122BarAgrPar ;
                     GXv_char11[0] = httpContext.getMessage( "CTI", "") ;
                     new app.pvxleepz(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int15, GXv_char12, GXv_char11) ;
                     pcietin.this.A396EmprCod = GXv_char13[0] ;
                     pcietin.this.A119BarAgrCod = GXv_int23[0] ;
                     pcietin.this.A124BarAgrReo = GXv_int15[0] ;
                     pcietin.this.A122BarAgrPar = GXv_char12[0] ;
                  }
                  if ( ( AV58Matizar == 1 ) && ( AV59Lconti == 1 ) )
                  {
                  }
               }
               pr_default.readNext(7);
            }
            pr_default.close(7);
            if ( ( A148BarEstReo == 1 ) || ( GXutil.strcmp(AV15CieCerAny, httpContext.getMessage( "A", "")) == 0 ) )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A812RecTotKgm)==0) )
               {
                  if ( A3915EmpNumDec == 0 )
                  {
                     A141BarCosPro = A141BarCosPro.add((A166BarKgm.multiply(AV24CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN))) ;
                     A140BarCosAny = A140BarCosAny.add((A166BarKgm.multiply(AV25CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN))) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        A141BarCosPro = A141BarCosPro.add(GXutil.roundDecimal( A166BarKgm.multiply(AV24CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2)) ;
                        A140BarCosAny = A140BarCosAny.add(GXutil.roundDecimal( A166BarKgm.multiply(AV25CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2)) ;
                     }
                  }
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
                  if ( A3915EmpNumDec == 0 )
                  {
                     A141BarCosPro = A166BarKgm.multiply(AV24CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     A140BarCosAny = A166BarKgm.multiply(AV25CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        A141BarCosPro = GXutil.roundDecimal( A166BarKgm.multiply(AV24CosPro).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                        A140BarCosAny = GXutil.roundDecimal( A166BarKgm.multiply(AV25CosAny).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                  }
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
            /* Using cursor P004812 */
            pr_default.execute(8, new Object[] {A141BarCosPro, A140BarCosAny, A180BarMaqCod, A2759BarMaqGru, Short.valueOf(A189BarNumAny), A2498BarPrdPes, A3871BarFecCRe, Boolean.valueOf(n2448BarFecEnR), A2448BarFecEnR, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         pr_default.close(4);
         pr_default.close(5);
         pr_default.close(6);
      }
      System.out.println( Gx_msg+httpContext.getMessage( "Go pcldy07", "") );
      GXv_char13[0] = A396EmprCod ;
      GXv_int23[0] = A129BarCod ;
      GXv_int15[0] = A132BarCodReo ;
      GXv_char12[0] = A130BarCodPar ;
      GXv_int10[0] = A2804RecLinMaq ;
      new app.pcldy07(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int15, GXv_char12, GXv_int10) ;
      pcietin.this.A396EmprCod = GXv_char13[0] ;
      pcietin.this.A129BarCod = GXv_int23[0] ;
      pcietin.this.A132BarCodReo = GXv_int15[0] ;
      pcietin.this.A130BarCodPar = GXv_char12[0] ;
      pcietin.this.A2804RecLinMaq = GXv_int10[0] ;
      System.out.println( Gx_msg+httpContext.getMessage( "Return pcldy07", "") );
      if ( AV70NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcietin");
      }
      System.out.println( Gx_msg+httpContext.getMessage( "Go pcldy08", "") );
      GXv_char13[0] = A396EmprCod ;
      GXv_int23[0] = A129BarCod ;
      GXv_int15[0] = A132BarCodReo ;
      GXv_char12[0] = A130BarCodPar ;
      GXv_int10[0] = A2804RecLinMaq ;
      new app.pcldy06(remoteHandle, context).execute( GXv_char13, GXv_int23, GXv_int15, GXv_char12, GXv_int10) ;
      pcietin.this.A396EmprCod = GXv_char13[0] ;
      pcietin.this.A129BarCod = GXv_int23[0] ;
      pcietin.this.A132BarCodReo = GXv_int15[0] ;
      pcietin.this.A130BarCodPar = GXv_char12[0] ;
      pcietin.this.A2804RecLinMaq = GXv_int10[0] ;
      System.out.println( Gx_msg+httpContext.getMessage( "Return pcldy08", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcietin.this.A396EmprCod;
      this.aP1[0] = pcietin.this.A129BarCod;
      this.aP2[0] = pcietin.this.A132BarCodReo;
      this.aP3[0] = pcietin.this.A130BarCodPar;
      this.aP4[0] = pcietin.this.AV15CieCerAny;
      this.aP5[0] = pcietin.this.AV16Consumos;
      this.aP6[0] = pcietin.this.AV17Anyadi;
      this.aP7[0] = pcietin.this.A2804RecLinMaq;
      this.aP8[0] = pcietin.this.AV18MaqCod;
      this.aP9[0] = pcietin.this.AV19Tipo;
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
      AV87Ca_diahora = GXutil.resetTime( GXutil.nullDate() );
      GXv_int5 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_dtime14 = new java.util.Date[1] ;
      AV71RecAcab = "" ;
      scmdbuf = "" ;
      P00482_A396EmprCod = new String[] {""} ;
      P00482_A129BarCod = new int[1] ;
      P00482_A132BarCodReo = new byte[1] ;
      P00482_A130BarCodPar = new String[] {""} ;
      P00482_A2804RecLinMaq = new short[1] ;
      P00482_A6039RecAcab = new String[] {""} ;
      P00482_n6039RecAcab = new boolean[] {false} ;
      P00482_A2805RecVolPrd = new int[1] ;
      P00482_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00482_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00482_n4260RecTotMts = new boolean[] {false} ;
      P00482_A602MaqCod = new String[] {""} ;
      A6039RecAcab = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      AV76RecTotKgs = DecimalUtil.ZERO ;
      AV80RecTotMts = DecimalUtil.ZERO ;
      P00483_A396EmprCod = new String[] {""} ;
      P00483_A129BarCod = new int[1] ;
      P00483_A132BarCodReo = new byte[1] ;
      P00483_A130BarCodPar = new String[] {""} ;
      P00483_A2804RecLinMaq = new short[1] ;
      P00483_A1273RecLinPro = new byte[1] ;
      AV24CosPro = DecimalUtil.ZERO ;
      AV25CosAny = DecimalUtil.ZERO ;
      AV83PrdRect = "" ;
      P00484_A719PrdNum = new String[] {""} ;
      P00484_n719PrdNum = new boolean[] {false} ;
      P00484_A396EmprCod = new String[] {""} ;
      P00484_A129BarCod = new int[1] ;
      P00484_A132BarCodReo = new byte[1] ;
      P00484_A130BarCodPar = new String[] {""} ;
      P00484_A2804RecLinMaq = new short[1] ;
      P00484_A727PrdRec = new String[] {""} ;
      P00484_A811RecLin = new short[1] ;
      P00484_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      A727PrdRec = "" ;
      GXv_int8 = new byte[1] ;
      AV40BarCosPD = DecimalUtil.ZERO ;
      AV41BarCosAD = DecimalUtil.ZERO ;
      AV42BarCosAA = DecimalUtil.ZERO ;
      AV43BarCosPA = DecimalUtil.ZERO ;
      AV44BarCosCol = DecimalUtil.ZERO ;
      AV45BarCosAnc = DecimalUtil.ZERO ;
      P00485_A396EmprCod = new String[] {""} ;
      P00485_A129BarCod = new int[1] ;
      P00485_A132BarCodReo = new byte[1] ;
      P00485_A130BarCodPar = new String[] {""} ;
      P00485_A3595BarMacCod = new int[1] ;
      P00485_A148BarEstReo = new byte[1] ;
      P00485_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00485_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00485_A180BarMaqCod = new String[] {""} ;
      P00485_A2759BarMaqGru = new String[] {""} ;
      P00485_A189BarNumAny = new short[1] ;
      P00485_A2498BarPrdPes = new String[] {""} ;
      P00485_A3871BarFecCRe = new java.util.Date[] {GXutil.nullDate()} ;
      P00485_A2448BarFecEnR = new java.util.Date[] {GXutil.nullDate()} ;
      P00485_n2448BarFecEnR = new boolean[] {false} ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A180BarMaqCod = "" ;
      A2759BarMaqGru = "" ;
      A2498BarPrdPes = "" ;
      A3871BarFecCRe = GXutil.nullDate() ;
      A2448BarFecEnR = GXutil.nullDate() ;
      P00486_A3915EmpNumDec = new byte[1] ;
      P00486_n3915EmpNumDec = new boolean[] {false} ;
      P00488_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00488_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      P004810_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004810_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
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
      Gx_msg = "" ;
      P004811_A396EmprCod = new String[] {""} ;
      P004811_A129BarCod = new int[1] ;
      P004811_A132BarCodReo = new byte[1] ;
      P004811_A130BarCodPar = new String[] {""} ;
      P004811_A119BarAgrCod = new int[1] ;
      P004811_A124BarAgrReo = new byte[1] ;
      P004811_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      AV52Kilos = DecimalUtil.ZERO ;
      AV82Metros = DecimalUtil.ZERO ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_int22 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_int7 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_char11 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int23 = new int[1] ;
      GXv_int15 = new byte[1] ;
      GXv_char12 = new String[1] ;
      GXv_int10 = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pcietin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pcietin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pcietin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pcietin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcietin__default(),
         new Object[] {
             new Object[] {
            P00482_A396EmprCod, P00482_A129BarCod, P00482_A132BarCodReo, P00482_A130BarCodPar, P00482_A2804RecLinMaq, P00482_A6039RecAcab, P00482_n6039RecAcab, P00482_A2805RecVolPrd, P00482_A4259RecTotKgs, P00482_A4260RecTotMts,
            P00482_n4260RecTotMts, P00482_A602MaqCod
            }
            , new Object[] {
            P00483_A396EmprCod, P00483_A129BarCod, P00483_A132BarCodReo, P00483_A130BarCodPar, P00483_A2804RecLinMaq, P00483_A1273RecLinPro
            }
            , new Object[] {
            P00484_A719PrdNum, P00484_n719PrdNum, P00484_A396EmprCod, P00484_A129BarCod, P00484_A132BarCodReo, P00484_A130BarCodPar, P00484_A2804RecLinMaq, P00484_A727PrdRec, P00484_A811RecLin, P00484_A1273RecLinPro
            }
            , new Object[] {
            P00485_A396EmprCod, P00485_A129BarCod, P00485_A132BarCodReo, P00485_A130BarCodPar, P00485_A3595BarMacCod, P00485_A148BarEstReo, P00485_A141BarCosPro, P00485_A140BarCosAny, P00485_A180BarMaqCod, P00485_A2759BarMaqGru,
            P00485_A189BarNumAny, P00485_A2498BarPrdPes, P00485_A3871BarFecCRe, P00485_A2448BarFecEnR, P00485_n2448BarFecEnR
            }
            , new Object[] {
            P00486_A3915EmpNumDec, P00486_n3915EmpNumDec
            }
            , new Object[] {
            P00488_A870BarTotMtr, P00488_A219BarTotAgr
            }
            , new Object[] {
            P004810_A184BarMtr, P004810_A166BarKgm
            }
            , new Object[] {
            P004811_A396EmprCod, P004811_A129BarCod, P004811_A132BarCodReo, P004811_A130BarCodPar, P004811_A119BarAgrCod, P004811_A124BarAgrReo, P004811_A122BarAgrPar
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
   private byte AV69JPF ;
   private byte AV88Cc_ALmcod ;
   private byte AV85Clostin ;
   private byte GXv_int5[] ;
   private byte AV55FlagHisRet ;
   private byte AV58Matizar ;
   private byte AV70NCLec ;
   private byte AV77KGSREA ;
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
   private byte GXt_int4 ;
   private byte AV54FlagHss ;
   private byte AV30Flag2 ;
   private byte AV33FlagCcs ;
   private byte AV74CtrlRec ;
   private byte GXv_int8[] ;
   private byte A148BarEstReo ;
   private byte A3915EmpNumDec ;
   private byte A124BarAgrReo ;
   private byte GXv_int15[] ;
   private short AV17Anyadi ;
   private short A2804RecLinMaq ;
   private short AV62Any ;
   private short AV64TipDefCod ;
   private short AV65CodCausa ;
   private short AV72RecLinMaq ;
   private short A811RecLin ;
   private short A189BarNumAny ;
   private short AV63Esttinnr ;
   private short GXv_int9[] ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXt_int6 ;
   private int AV57RecNumInt ;
   private int AV73RecVolprd ;
   private int A2805RecVolPrd ;
   private int A3595BarMacCod ;
   private int A119BarAgrCod ;
   private int GXv_int22[] ;
   private int GXv_int7[] ;
   private int GXv_int23[] ;
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
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal A812RecTotKgm ;
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
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15CieCerAny ;
   private String AV18MaqCod ;
   private String AV19Tipo ;
   private String AV34Station ;
   private String AV36EmprNom ;
   private String AV35UsurCod ;
   private String GXv_char1[] ;
   private String AV71RecAcab ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A602MaqCod ;
   private String AV83PrdRect ;
   private String A719PrdNum ;
   private String A727PrdRec ;
   private String A180BarMaqCod ;
   private String A2759BarMaqGru ;
   private String A2498BarPrdPes ;
   private String AV39BarAgrLot ;
   private String Gx_msg ;
   private String A122BarAgrPar ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private java.util.Date AV87Ca_diahora ;
   private java.util.Date GXv_dtime14[] ;
   private java.util.Date AV68Fec_t ;
   private java.util.Date Gx_date ;
   private java.util.Date A3871BarFecCRe ;
   private java.util.Date A2448BarFecEnR ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n4260RecTotMts ;
   private boolean n719PrdNum ;
   private boolean n2448BarFecEnR ;
   private boolean n3915EmpNumDec ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private short[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00482_A396EmprCod ;
   private int[] P00482_A129BarCod ;
   private byte[] P00482_A132BarCodReo ;
   private String[] P00482_A130BarCodPar ;
   private short[] P00482_A2804RecLinMaq ;
   private String[] P00482_A6039RecAcab ;
   private boolean[] P00482_n6039RecAcab ;
   private int[] P00482_A2805RecVolPrd ;
   private java.math.BigDecimal[] P00482_A4259RecTotKgs ;
   private java.math.BigDecimal[] P00482_A4260RecTotMts ;
   private boolean[] P00482_n4260RecTotMts ;
   private String[] P00482_A602MaqCod ;
   private String[] P00483_A396EmprCod ;
   private int[] P00483_A129BarCod ;
   private byte[] P00483_A132BarCodReo ;
   private String[] P00483_A130BarCodPar ;
   private short[] P00483_A2804RecLinMaq ;
   private byte[] P00483_A1273RecLinPro ;
   private String[] P00484_A719PrdNum ;
   private boolean[] P00484_n719PrdNum ;
   private String[] P00484_A396EmprCod ;
   private int[] P00484_A129BarCod ;
   private byte[] P00484_A132BarCodReo ;
   private String[] P00484_A130BarCodPar ;
   private short[] P00484_A2804RecLinMaq ;
   private String[] P00484_A727PrdRec ;
   private short[] P00484_A811RecLin ;
   private byte[] P00484_A1273RecLinPro ;
   private String[] P00485_A396EmprCod ;
   private int[] P00485_A129BarCod ;
   private byte[] P00485_A132BarCodReo ;
   private String[] P00485_A130BarCodPar ;
   private int[] P00485_A3595BarMacCod ;
   private byte[] P00485_A148BarEstReo ;
   private java.math.BigDecimal[] P00485_A141BarCosPro ;
   private java.math.BigDecimal[] P00485_A140BarCosAny ;
   private String[] P00485_A180BarMaqCod ;
   private String[] P00485_A2759BarMaqGru ;
   private short[] P00485_A189BarNumAny ;
   private String[] P00485_A2498BarPrdPes ;
   private java.util.Date[] P00485_A3871BarFecCRe ;
   private java.util.Date[] P00485_A2448BarFecEnR ;
   private boolean[] P00485_n2448BarFecEnR ;
   private byte[] P00486_A3915EmpNumDec ;
   private boolean[] P00486_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00488_A870BarTotMtr ;
   private java.math.BigDecimal[] P00488_A219BarTotAgr ;
   private java.math.BigDecimal[] P004810_A184BarMtr ;
   private java.math.BigDecimal[] P004810_A166BarKgm ;
   private String[] P004811_A396EmprCod ;
   private int[] P004811_A129BarCod ;
   private byte[] P004811_A132BarCodReo ;
   private String[] P004811_A130BarCodPar ;
   private int[] P004811_A119BarAgrCod ;
   private byte[] P004811_A124BarAgrReo ;
   private String[] P004811_A122BarAgrPar ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcietin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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
      return "MODA21";
   }

}

final  class pcietin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcietin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcietin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcietin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00482", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecAcab, RecVolPrd, RecTotKgs, RecTotMts, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00483", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00484", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdRec, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (? = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00485", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarMacCod, BarEstReo, BarCosPro, BarCosAny, BarMaqCod, BarMaqGru, BarNumAny, BarPrdPes, BarFecCRe, BarFecEnR FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)  FOR UPDATE OF BarCosPro, BarCosAny, BarMaqCod, BarMaqGru, BarNumAny, BarPrdPes, BarFecCRe, BarFecEnR NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00486", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00488", "SELECT COALESCE( T1.BarTotMtr, 0) AS BarTotMtr, COALESCE( T1.BarTotAgr, 0) AS BarTotAgr FROM (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004810", "SELECT COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004811", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P004812", "UPDATE TXPBARCAD SET BarCosPro=?, BarCosAny=?, BarMaqCod=?, BarMaqGru=?, BarNumAny=?, BarPrdPes=?, BarFecCRe=?, BarFecEnR=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 2 :
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
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 7 :
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
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

