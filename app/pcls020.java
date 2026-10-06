package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls020 extends GXProcedure
{
   public pcls020( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls020.class ), "" );
   }

   public pcls020( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     short[] aP4 ,
                                     String[] aP5 ,
                                     java.util.Date[] aP6 ,
                                     byte[] aP7 ,
                                     String[] aP8 )
   {
      pcls020.this.aP9 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        java.util.Date[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        java.util.Date[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             java.util.Date[] aP9 )
   {
      pcls020.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls020.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcls020.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls020.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls020.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcls020.this.AV40CCStkUsu = aP5[0];
      this.aP5 = aP5;
      pcls020.this.AV36Ca_DiaHora = aP6[0];
      this.aP6 = aP6;
      pcls020.this.AV37CC_almcod = aP7[0];
      this.aP7 = aP7;
      pcls020.this.AV54Tipo = aP8[0];
      this.aP8 = aP8;
      pcls020.this.AV44Fecha = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV53Text_c = httpContext.getMessage( "Cierre Tintura", "") ;
      if ( GXutil.strcmp(AV54Tipo, httpContext.getMessage( "A", "")) == 0 )
      {
         AV53Text_c = httpContext.getMessage( "Cierre Acabado", "") ;
      }
      GXt_int1 = AV45FlagPreMed ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int2) ;
      pcls020.this.GXt_int1 = GXv_int2[0] ;
      AV45FlagPreMed = GXt_int1 ;
      GXt_int1 = AV42CieLote ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIELOT", ""), GXv_int2) ;
      pcls020.this.GXt_int1 = GXv_int2[0] ;
      AV42CieLote = GXt_int1 ;
      GXt_int1 = AV41CieCCo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIECCO", ""), GXv_int2) ;
      pcls020.this.GXt_int1 = GXv_int2[0] ;
      AV41CieCCo = GXt_int1 ;
      GXt_int1 = AV43Eliot ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int2) ;
      pcls020.this.GXt_int1 = GXv_int2[0] ;
      AV43Eliot = GXt_int1 ;
      GXt_int1 = (byte)(AV56Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      pcls020.this.GXt_int1 = GXv_int2[0] ;
      AV56Moda21 = GXt_int1 ;
      /* Using cursor P05622 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5622 = false ;
         A718PrdNom = P05622_A718PrdNom[0] ;
         A707PrdFacCon = P05622_A707PrdFacCon[0] ;
         A1797PrdCanAny = P05622_A1797PrdCanAny[0] ;
         A686PrdCant = P05622_A686PrdCant[0] ;
         A719PrdNum = P05622_A719PrdNum[0] ;
         n719PrdNum = P05622_n719PrdNum[0] ;
         A5725RecLote = P05622_A5725RecLote[0] ;
         A724PrdPreAct = P05622_A724PrdPreAct[0] ;
         A726PrdPreMed = P05622_A726PrdPreMed[0] ;
         A209BarPri = P05622_A209BarPri[0] ;
         A1273RecLinPro = P05622_A1273RecLinPro[0] ;
         A811RecLin = P05622_A811RecLin[0] ;
         A718PrdNom = P05622_A718PrdNom[0] ;
         A707PrdFacCon = P05622_A707PrdFacCon[0] ;
         A724PrdPreAct = P05622_A724PrdPreAct[0] ;
         A726PrdPreMed = P05622_A726PrdPreMed[0] ;
         A209BarPri = P05622_A209BarPri[0] ;
         W396EmprCod = A396EmprCod ;
         /* Execute user subroutine: 'CCO' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV39CCStkCanS = DecimalUtil.doubleToDec(0) ;
         AV52RecLote = A5725RecLote ;
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
         {
            AV50PrdComCod = A719PrdNum ;
            AV49PrdCant = DecimalUtil.doubleToDec(0) ;
            AV48PrdCanAny = DecimalUtil.doubleToDec(0) ;
         }
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05622_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05622_A129BarCod[0] == A129BarCod ) && ( P05622_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P05622_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P05622_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P05622_A719PrdNum[0], A719PrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brk5622 = false ;
            A707PrdFacCon = P05622_A707PrdFacCon[0] ;
            A1797PrdCanAny = P05622_A1797PrdCanAny[0] ;
            A686PrdCant = P05622_A686PrdCant[0] ;
            A1273RecLinPro = P05622_A1273RecLinPro[0] ;
            A811RecLin = P05622_A811RecLin[0] ;
            A707PrdFacCon = P05622_A707PrdFacCon[0] ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
            {
               AV39CCStkCanS = AV39CCStkCanS.add((((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon))) ;
            }
            else
            {
               AV49PrdCant = AV49PrdCant.add(A686PrdCant) ;
               AV48PrdCanAny = AV48PrdCanAny.add(A1797PrdCanAny) ;
            }
            brk5622 = true ;
            pr_default.readNext(0);
         }
         AV51PrdPreAct = A724PrdPreAct ;
         if ( AV45FlagPreMed == 1 )
         {
            AV51PrdPreAct = A726PrdPreMed ;
         }
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
         {
            if ( AV42CieLote == 0 )
            {
               if ( AV41CieCCo == 0 )
               {
                  GXv_char3[0] = A396EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal6[0] = AV39CCStkCanS ;
                  GXv_char7[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char8[0] = A209BarPri ;
                  GXv_decimal9[0] = AV51PrdPreAct ;
                  GXv_int10[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char11[0] = A130BarCodPar ;
                  GXv_int12[0] = 0 ;
                  GXv_char13[0] = " " ;
                  GXv_char14[0] = AV40CCStkUsu ;
                  GXv_char15[0] = AV53Text_c ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV44Fecha ;
                  new app.pcls015(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_char7, GXv_char8, GXv_decimal9, GXv_int10, GXv_int2, GXv_char11, GXv_int12, GXv_char13, GXv_char14, GXv_char15, GXv_int16, GXv_decimal17, GXv_decimal18, GXv_date19) ;
                  pcls020.this.A396EmprCod = GXv_char3[0] ;
                  pcls020.this.A719PrdNum = GXv_char4[0] ;
                  pcls020.this.AV39CCStkCanS = GXv_decimal6[0] ;
                  pcls020.this.A209BarPri = GXv_char8[0] ;
                  pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
                  pcls020.this.A129BarCod = GXv_int10[0] ;
                  pcls020.this.A132BarCodReo = GXv_int2[0] ;
                  pcls020.this.A130BarCodPar = GXv_char11[0] ;
                  pcls020.this.AV40CCStkUsu = GXv_char14[0] ;
                  pcls020.this.AV53Text_c = GXv_char15[0] ;
                  pcls020.this.AV44Fecha = GXv_date19[0] ;
                  if ( AV43Eliot == 1 )
                  {
                     GXv_char15[0] = A396EmprCod ;
                     GXv_char14[0] = A719PrdNum ;
                     GXv_decimal18[0] = AV39CCStkCanS ;
                     GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                     GXv_decimal17[0] = AV51PrdPreAct ;
                     GXv_char11[0] = AV40CCStkUsu ;
                     GXv_char8[0] = AV53Text_c ;
                     GXv_dtime20[0] = AV36Ca_DiaHora ;
                     GXv_int2[0] = AV37CC_almcod ;
                     GXv_int12[0] = A129BarCod ;
                     GXv_int21[0] = A132BarCodReo ;
                     GXv_char7[0] = A130BarCodPar ;
                     new app.pcls016(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_char13, GXv_decimal17, GXv_char11, GXv_char8, GXv_dtime20, GXv_int2, GXv_int12, GXv_int21, GXv_char7) ;
                     pcls020.this.A396EmprCod = GXv_char15[0] ;
                     pcls020.this.A719PrdNum = GXv_char14[0] ;
                     pcls020.this.AV39CCStkCanS = GXv_decimal18[0] ;
                     pcls020.this.AV51PrdPreAct = GXv_decimal17[0] ;
                     pcls020.this.AV40CCStkUsu = GXv_char11[0] ;
                     pcls020.this.AV53Text_c = GXv_char8[0] ;
                     pcls020.this.AV36Ca_DiaHora = GXv_dtime20[0] ;
                     pcls020.this.AV37CC_almcod = GXv_int2[0] ;
                     pcls020.this.A129BarCod = GXv_int12[0] ;
                     pcls020.this.A132BarCodReo = GXv_int21[0] ;
                     pcls020.this.A130BarCodPar = GXv_char7[0] ;
                  }
               }
               else
               {
                  GXv_char15[0] = A396EmprCod ;
                  GXv_char14[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV39CCStkCanS ;
                  GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char11[0] = A209BarPri ;
                  GXv_decimal9[0] = AV51PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int21[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char7[0] = " " ;
                  GXv_char4[0] = AV40CCStkUsu ;
                  GXv_char3[0] = AV53Text_c ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV44Fecha ;
                  GXv_int22[0] = AV55MaqCCoCod ;
                  new app.pcls017(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int21, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int16, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int22) ;
                  pcls020.this.A396EmprCod = GXv_char15[0] ;
                  pcls020.this.A719PrdNum = GXv_char14[0] ;
                  pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
                  pcls020.this.A209BarPri = GXv_char11[0] ;
                  pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
                  pcls020.this.A129BarCod = GXv_int12[0] ;
                  pcls020.this.A132BarCodReo = GXv_int21[0] ;
                  pcls020.this.A130BarCodPar = GXv_char8[0] ;
                  pcls020.this.AV40CCStkUsu = GXv_char4[0] ;
                  pcls020.this.AV53Text_c = GXv_char3[0] ;
                  pcls020.this.AV44Fecha = GXv_date19[0] ;
                  pcls020.this.AV55MaqCCoCod = GXv_int22[0] ;
               }
            }
            else
            {
               if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) != 0 )
               {
                  Gx_msg = httpContext.getMessage( "Go PCLs018.Producto=", "") + A719PrdNum + " " + httpContext.getMessage( "Cantidad=", "") + GXutil.str( AV39CCStkCanS, 12, 4) ;
                  GXv_char15[0] = A396EmprCod ;
                  GXv_char14[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV39CCStkCanS ;
                  GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char11[0] = A209BarPri ;
                  GXv_decimal9[0] = AV51PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int21[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char7[0] = " " ;
                  GXv_char4[0] = AV40CCStkUsu ;
                  GXv_char3[0] = AV53Text_c ;
                  GXv_int22[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV44Fecha ;
                  GXv_char23[0] = AV52RecLote ;
                  new app.pcls018(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int21, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char23) ;
                  pcls020.this.A396EmprCod = GXv_char15[0] ;
                  pcls020.this.A719PrdNum = GXv_char14[0] ;
                  pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
                  pcls020.this.A209BarPri = GXv_char11[0] ;
                  pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
                  pcls020.this.A129BarCod = GXv_int12[0] ;
                  pcls020.this.A132BarCodReo = GXv_int21[0] ;
                  pcls020.this.A130BarCodPar = GXv_char8[0] ;
                  pcls020.this.AV40CCStkUsu = GXv_char4[0] ;
                  pcls020.this.AV53Text_c = GXv_char3[0] ;
                  pcls020.this.AV44Fecha = GXv_date19[0] ;
                  pcls020.this.AV52RecLote = GXv_char23[0] ;
                  Gx_msg = httpContext.getMessage( "Return PCLs018.Producto=", "") + A719PrdNum + " " + httpContext.getMessage( "Cantidad=", "") + GXutil.str( AV39CCStkCanS, 12, 4) ;
               }
            }
         }
         else
         {
            AV35BarPri = A209BarPri ;
            AV32BarCod = A129BarCod ;
            AV34BarCodReo = A132BarCodReo ;
            AV33BarCodPar = A130BarCodPar ;
            /* Execute user subroutine: 'COMPUES' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         Gx_msg = httpContext.getMessage( "Alta CONSC.Producto=", "") + A719PrdNum + " " + httpContext.getMessage( "Cantidad=", "") + GXutil.str( AV39CCStkCanS, 12, 4) ;
         /*
            INSERT RECORD ON TABLE TXPCONSC

         */
         W396EmprCod = A396EmprCod ;
         A8635Ca_DiaHora = AV36Ca_DiaHora ;
         A8638Ca_PrdNom = GXutil.trim( A718PrdNom) ;
         n8638Ca_PrdNom = false ;
         A8634Ca_Prdnum = A719PrdNum ;
         A8637Ca_Cant = AV39CCStkCanS ;
         n8637Ca_Cant = false ;
         A8636Ca_Prdcant = AV39CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
         n8636Ca_Prdcant = false ;
         /* Using cursor P05623 */
         pr_default.execute(1, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8638Ca_PrdNom), A8638Ca_PrdNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n8636Ca_Prdcant = false ;
            n8637Ca_Cant = false ;
            /* Optimized UPDATE. */
            /* Using cursor P05624 */
            pr_default.execute(2, new Object[] {AV39CCStkCanS, AV39CCStkCanS, A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         if ( ! brk5622 )
         {
            brk5622 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      if ( AV56Moda21 == 1 )
      {
         /* Using cursor P05625 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            brk5626 = false ;
            A2808RecLinMAL = P05625_A2808RecLinMAL[0] ;
            A707PrdFacCon = P05625_A707PrdFacCon[0] ;
            A1378PrdCFin = P05625_A1378PrdCFin[0] ;
            n1378PrdCFin = P05625_n1378PrdCFin[0] ;
            A5807LanyLote = P05625_A5807LanyLote[0] ;
            n5807LanyLote = P05625_n5807LanyLote[0] ;
            A719PrdNum = P05625_A719PrdNum[0] ;
            n719PrdNum = P05625_n719PrdNum[0] ;
            A724PrdPreAct = P05625_A724PrdPreAct[0] ;
            A726PrdPreMed = P05625_A726PrdPreMed[0] ;
            A209BarPri = P05625_A209BarPri[0] ;
            A1377RecNumAny = P05625_A1377RecNumAny[0] ;
            A707PrdFacCon = P05625_A707PrdFacCon[0] ;
            A724PrdPreAct = P05625_A724PrdPreAct[0] ;
            A726PrdPreMed = P05625_A726PrdPreMed[0] ;
            A209BarPri = P05625_A209BarPri[0] ;
            AV39CCStkCanS = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P05625_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05625_A129BarCod[0] == A129BarCod ) && ( P05625_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P05625_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               if ( ! ( ( P05625_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(P05625_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(P05625_A5807LanyLote[0], A5807LanyLote) == 0 ) ) )
               {
                  if (true) break;
               }
               brk5626 = false ;
               A707PrdFacCon = P05625_A707PrdFacCon[0] ;
               A1378PrdCFin = P05625_A1378PrdCFin[0] ;
               n1378PrdCFin = P05625_n1378PrdCFin[0] ;
               A1377RecNumAny = P05625_A1377RecNumAny[0] ;
               A707PrdFacCon = P05625_A707PrdFacCon[0] ;
               AV39CCStkCanS = AV39CCStkCanS.add((A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon)) ;
               brk5626 = true ;
               pr_default.readNext(3);
            }
            AV51PrdPreAct = A724PrdPreAct ;
            if ( AV45FlagPreMed == 1 )
            {
               AV51PrdPreAct = A726PrdPreMed ;
            }
            AV53Text_c = httpContext.getMessage( "Cierre Tint Añadidas Pc Ind.", "") ;
            GXv_char23[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV39CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = A209BarPri ;
            GXv_decimal9[0] = AV51PrdPreAct ;
            GXv_int12[0] = A129BarCod ;
            GXv_int21[0] = A132BarCodReo ;
            GXv_char11[0] = A130BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV40CCStkUsu ;
            GXv_char4[0] = AV53Text_c ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV44Fecha ;
            GXv_char3[0] = A5807LanyLote ;
            new app.pcls018(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char3) ;
            pcls020.this.A396EmprCod = GXv_char23[0] ;
            pcls020.this.A719PrdNum = GXv_char15[0] ;
            pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
            pcls020.this.A209BarPri = GXv_char13[0] ;
            pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
            pcls020.this.A129BarCod = GXv_int12[0] ;
            pcls020.this.A132BarCodReo = GXv_int21[0] ;
            pcls020.this.A130BarCodPar = GXv_char11[0] ;
            pcls020.this.AV40CCStkUsu = GXv_char7[0] ;
            pcls020.this.AV53Text_c = GXv_char4[0] ;
            pcls020.this.AV44Fecha = GXv_date19[0] ;
            pcls020.this.A5807LanyLote = GXv_char3[0] ;
            if ( ! brk5626 )
            {
               brk5626 = true ;
               pr_default.readNext(3);
            }
         }
         pr_default.close(3);
      }
      else
      {
         /* Using cursor P05626 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            brk5628 = false ;
            A2808RecLinMAL = P05626_A2808RecLinMAL[0] ;
            A718PrdNom = P05626_A718PrdNom[0] ;
            A707PrdFacCon = P05626_A707PrdFacCon[0] ;
            A1378PrdCFin = P05626_A1378PrdCFin[0] ;
            n1378PrdCFin = P05626_n1378PrdCFin[0] ;
            A719PrdNum = P05626_A719PrdNum[0] ;
            n719PrdNum = P05626_n719PrdNum[0] ;
            A724PrdPreAct = P05626_A724PrdPreAct[0] ;
            A726PrdPreMed = P05626_A726PrdPreMed[0] ;
            A209BarPri = P05626_A209BarPri[0] ;
            A5807LanyLote = P05626_A5807LanyLote[0] ;
            n5807LanyLote = P05626_n5807LanyLote[0] ;
            A1377RecNumAny = P05626_A1377RecNumAny[0] ;
            A718PrdNom = P05626_A718PrdNom[0] ;
            A707PrdFacCon = P05626_A707PrdFacCon[0] ;
            A724PrdPreAct = P05626_A724PrdPreAct[0] ;
            A726PrdPreMed = P05626_A726PrdPreMed[0] ;
            A209BarPri = P05626_A209BarPri[0] ;
            W396EmprCod = A396EmprCod ;
            AV39CCStkCanS = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P05626_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05626_A129BarCod[0] == A129BarCod ) && ( P05626_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P05626_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               if ( ! ( ( P05626_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(P05626_A719PrdNum[0], A719PrdNum) == 0 ) ) )
               {
                  if (true) break;
               }
               brk5628 = false ;
               A707PrdFacCon = P05626_A707PrdFacCon[0] ;
               A1378PrdCFin = P05626_A1378PrdCFin[0] ;
               n1378PrdCFin = P05626_n1378PrdCFin[0] ;
               A1377RecNumAny = P05626_A1377RecNumAny[0] ;
               A707PrdFacCon = P05626_A707PrdFacCon[0] ;
               AV39CCStkCanS = AV39CCStkCanS.add((A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon)) ;
               brk5628 = true ;
               pr_default.readNext(4);
            }
            AV51PrdPreAct = A724PrdPreAct ;
            if ( AV45FlagPreMed == 1 )
            {
               AV51PrdPreAct = A726PrdPreMed ;
            }
            AV53Text_c = httpContext.getMessage( "Cierre Tint Añadidas Pc Ind.", "") ;
            if ( AV42CieLote == 0 )
            {
               if ( AV41CieCCo == 0 )
               {
                  GXv_char23[0] = A396EmprCod ;
                  GXv_char15[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV39CCStkCanS ;
                  GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char13[0] = A209BarPri ;
                  GXv_decimal9[0] = AV51PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int21[0] = A132BarCodReo ;
                  GXv_char11[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char8[0] = " " ;
                  GXv_char7[0] = AV40CCStkUsu ;
                  GXv_char4[0] = AV53Text_c ;
                  GXv_int22[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV44Fecha ;
                  new app.pcls015(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
                  pcls020.this.A396EmprCod = GXv_char23[0] ;
                  pcls020.this.A719PrdNum = GXv_char15[0] ;
                  pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
                  pcls020.this.A209BarPri = GXv_char13[0] ;
                  pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
                  pcls020.this.A129BarCod = GXv_int12[0] ;
                  pcls020.this.A132BarCodReo = GXv_int21[0] ;
                  pcls020.this.A130BarCodPar = GXv_char11[0] ;
                  pcls020.this.AV40CCStkUsu = GXv_char7[0] ;
                  pcls020.this.AV53Text_c = GXv_char4[0] ;
                  pcls020.this.AV44Fecha = GXv_date19[0] ;
                  if ( AV43Eliot == 1 )
                  {
                     GXv_char23[0] = A396EmprCod ;
                     GXv_char15[0] = A719PrdNum ;
                     GXv_decimal18[0] = AV39CCStkCanS ;
                     GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                     GXv_decimal17[0] = AV51PrdPreAct ;
                     GXv_char13[0] = AV40CCStkUsu ;
                     GXv_char11[0] = AV53Text_c ;
                     GXv_dtime20[0] = AV36Ca_DiaHora ;
                     GXv_int21[0] = AV37CC_almcod ;
                     GXv_int12[0] = A129BarCod ;
                     GXv_int2[0] = A132BarCodReo ;
                     GXv_char8[0] = A130BarCodPar ;
                     new app.pcls016(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
                     pcls020.this.A396EmprCod = GXv_char23[0] ;
                     pcls020.this.A719PrdNum = GXv_char15[0] ;
                     pcls020.this.AV39CCStkCanS = GXv_decimal18[0] ;
                     pcls020.this.AV51PrdPreAct = GXv_decimal17[0] ;
                     pcls020.this.AV40CCStkUsu = GXv_char13[0] ;
                     pcls020.this.AV53Text_c = GXv_char11[0] ;
                     pcls020.this.AV36Ca_DiaHora = GXv_dtime20[0] ;
                     pcls020.this.AV37CC_almcod = GXv_int21[0] ;
                     pcls020.this.A129BarCod = GXv_int12[0] ;
                     pcls020.this.A132BarCodReo = GXv_int2[0] ;
                     pcls020.this.A130BarCodPar = GXv_char8[0] ;
                  }
               }
               else
               {
                  GXv_char23[0] = A396EmprCod ;
                  GXv_char15[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV39CCStkCanS ;
                  GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char13[0] = A209BarPri ;
                  GXv_decimal9[0] = AV51PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int21[0] = A132BarCodReo ;
                  GXv_char11[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char8[0] = " " ;
                  GXv_char7[0] = AV40CCStkUsu ;
                  GXv_char4[0] = AV53Text_c ;
                  GXv_int22[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV44Fecha ;
                  GXv_int16[0] = AV55MaqCCoCod ;
                  new app.pcls017(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
                  pcls020.this.A396EmprCod = GXv_char23[0] ;
                  pcls020.this.A719PrdNum = GXv_char15[0] ;
                  pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
                  pcls020.this.A209BarPri = GXv_char13[0] ;
                  pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
                  pcls020.this.A129BarCod = GXv_int12[0] ;
                  pcls020.this.A132BarCodReo = GXv_int21[0] ;
                  pcls020.this.A130BarCodPar = GXv_char11[0] ;
                  pcls020.this.AV40CCStkUsu = GXv_char7[0] ;
                  pcls020.this.AV53Text_c = GXv_char4[0] ;
                  pcls020.this.AV44Fecha = GXv_date19[0] ;
                  pcls020.this.AV55MaqCCoCod = GXv_int16[0] ;
               }
            }
            else
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV39CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV51PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV40CCStkUsu ;
               GXv_char4[0] = AV53Text_c ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV44Fecha ;
               GXv_char3[0] = A5807LanyLote ;
               new app.pcls018(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char3) ;
               pcls020.this.A396EmprCod = GXv_char23[0] ;
               pcls020.this.A719PrdNum = GXv_char15[0] ;
               pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
               pcls020.this.A209BarPri = GXv_char13[0] ;
               pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
               pcls020.this.A129BarCod = GXv_int12[0] ;
               pcls020.this.A132BarCodReo = GXv_int21[0] ;
               pcls020.this.A130BarCodPar = GXv_char11[0] ;
               pcls020.this.AV40CCStkUsu = GXv_char7[0] ;
               pcls020.this.AV53Text_c = GXv_char4[0] ;
               pcls020.this.AV44Fecha = GXv_date19[0] ;
               pcls020.this.A5807LanyLote = GXv_char3[0] ;
            }
            /*
               INSERT RECORD ON TABLE TXPCONSC

            */
            W396EmprCod = A396EmprCod ;
            A8635Ca_DiaHora = AV36Ca_DiaHora ;
            A8638Ca_PrdNom = GXutil.trim( A718PrdNom) ;
            n8638Ca_PrdNom = false ;
            A8634Ca_Prdnum = A719PrdNum ;
            A8637Ca_Cant = AV39CCStkCanS ;
            n8637Ca_Cant = false ;
            A8636Ca_Prdcant = AV39CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
            n8636Ca_Prdcant = false ;
            /* Using cursor P05627 */
            pr_default.execute(5, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8638Ca_PrdNom), A8638Ca_PrdNom});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
            if ( (pr_default.getStatus(5) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               n8636Ca_Prdcant = false ;
               n8637Ca_Cant = false ;
               /* Optimized UPDATE. */
               /* Using cursor P05628 */
               pr_default.execute(6, new Object[] {AV39CCStkCanS, AV39CCStkCanS, A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
               /* End optimized UPDATE. */
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            if ( ! brk5628 )
            {
               brk5628 = true ;
               pr_default.readNext(4);
            }
         }
         pr_default.close(4);
      }
      /* Using cursor P05629 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk56212 = false ;
         A707PrdFacCon = P05629_A707PrdFacCon[0] ;
         A726PrdPreMed = P05629_A726PrdPreMed[0] ;
         A2495BarDosUsa = P05629_A2495BarDosUsa[0] ;
         n2495BarDosUsa = P05629_n2495BarDosUsa[0] ;
         A719PrdNum = P05629_A719PrdNum[0] ;
         n719PrdNum = P05629_n719PrdNum[0] ;
         A724PrdPreAct = P05629_A724PrdPreAct[0] ;
         A209BarPri = P05629_A209BarPri[0] ;
         A2494BarDosPro = P05629_A2494BarDosPro[0] ;
         A707PrdFacCon = P05629_A707PrdFacCon[0] ;
         A726PrdPreMed = P05629_A726PrdPreMed[0] ;
         A724PrdPreAct = P05629_A724PrdPreAct[0] ;
         A209BarPri = P05629_A209BarPri[0] ;
         if ( A129BarCod != 99999999 )
         {
            AV39CCStkCanS = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P05629_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05629_A129BarCod[0] == A129BarCod ) && ( P05629_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P05629_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               if ( ! ( ( GXutil.strcmp(P05629_A719PrdNum[0], A719PrdNum) == 0 ) ) )
               {
                  if (true) break;
               }
               brk56212 = false ;
               A707PrdFacCon = P05629_A707PrdFacCon[0] ;
               A726PrdPreMed = P05629_A726PrdPreMed[0] ;
               A2495BarDosUsa = P05629_A2495BarDosUsa[0] ;
               n2495BarDosUsa = P05629_n2495BarDosUsa[0] ;
               A2494BarDosPro = P05629_A2494BarDosPro[0] ;
               A707PrdFacCon = P05629_A707PrdFacCon[0] ;
               A726PrdPreMed = P05629_A726PrdPreMed[0] ;
               AV39CCStkCanS = AV39CCStkCanS.add((A2495BarDosUsa.multiply(A726PrdPreMed).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               brk56212 = true ;
               pr_default.readNext(7);
            }
            AV51PrdPreAct = A724PrdPreAct ;
            if ( AV45FlagPreMed == 1 )
            {
               AV51PrdPreAct = A726PrdPreMed ;
            }
            if ( AV41CieCCo == 0 )
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV39CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV51PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV40CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Dosificadora.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV44Fecha ;
               new app.pcls015(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
               pcls020.this.A396EmprCod = GXv_char23[0] ;
               pcls020.this.A719PrdNum = GXv_char15[0] ;
               pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
               pcls020.this.A209BarPri = GXv_char13[0] ;
               pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
               pcls020.this.A129BarCod = GXv_int12[0] ;
               pcls020.this.A132BarCodReo = GXv_int21[0] ;
               pcls020.this.A130BarCodPar = GXv_char11[0] ;
               pcls020.this.AV40CCStkUsu = GXv_char7[0] ;
               pcls020.this.AV44Fecha = GXv_date19[0] ;
               if ( AV43Eliot == 1 )
               {
                  GXv_char23[0] = A396EmprCod ;
                  GXv_char15[0] = A719PrdNum ;
                  GXv_decimal18[0] = AV39CCStkCanS ;
                  GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                  GXv_decimal17[0] = AV51PrdPreAct ;
                  GXv_char13[0] = AV40CCStkUsu ;
                  GXv_char11[0] = httpContext.getMessage( "Cierre Tinturas Dosificadora.", "") ;
                  GXv_dtime20[0] = AV36Ca_DiaHora ;
                  GXv_int21[0] = AV37CC_almcod ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  new app.pcls016(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
                  pcls020.this.A396EmprCod = GXv_char23[0] ;
                  pcls020.this.A719PrdNum = GXv_char15[0] ;
                  pcls020.this.AV39CCStkCanS = GXv_decimal18[0] ;
                  pcls020.this.AV51PrdPreAct = GXv_decimal17[0] ;
                  pcls020.this.AV40CCStkUsu = GXv_char13[0] ;
                  pcls020.this.AV36Ca_DiaHora = GXv_dtime20[0] ;
                  pcls020.this.AV37CC_almcod = GXv_int21[0] ;
                  pcls020.this.A129BarCod = GXv_int12[0] ;
                  pcls020.this.A132BarCodReo = GXv_int2[0] ;
                  pcls020.this.A130BarCodPar = GXv_char8[0] ;
               }
            }
            else
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV39CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV51PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV40CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Dosificadora.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV44Fecha ;
               GXv_int16[0] = AV55MaqCCoCod ;
               new app.pcls017(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
               pcls020.this.A396EmprCod = GXv_char23[0] ;
               pcls020.this.A719PrdNum = GXv_char15[0] ;
               pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
               pcls020.this.A209BarPri = GXv_char13[0] ;
               pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
               pcls020.this.A129BarCod = GXv_int12[0] ;
               pcls020.this.A132BarCodReo = GXv_int21[0] ;
               pcls020.this.A130BarCodPar = GXv_char11[0] ;
               pcls020.this.AV40CCStkUsu = GXv_char7[0] ;
               pcls020.this.AV44Fecha = GXv_date19[0] ;
               pcls020.this.AV55MaqCCoCod = GXv_int16[0] ;
            }
         }
         if ( ! brk56212 )
         {
            brk56212 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUES' Routine */
      returnInSub = false ;
      /* Using cursor P056210 */
      pr_default.execute(8, new Object[] {A396EmprCod, AV50PrdComCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A688PrdComCod = P056210_A688PrdComCod[0] ;
         A690PrdComFN = P056210_A690PrdComFN[0] ;
         A707PrdFacCon = P056210_A707PrdFacCon[0] ;
         A724PrdPreAct = P056210_A724PrdPreAct[0] ;
         A726PrdPreMed = P056210_A726PrdPreMed[0] ;
         A719PrdNum = P056210_A719PrdNum[0] ;
         n719PrdNum = P056210_n719PrdNum[0] ;
         A707PrdFacCon = P056210_A707PrdFacCon[0] ;
         A724PrdPreAct = P056210_A724PrdPreAct[0] ;
         A726PrdPreMed = P056210_A726PrdPreMed[0] ;
         AV39CCStkCanS = ((AV49PrdCant.add(AV48PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         AV51PrdPreAct = A724PrdPreAct ;
         if ( AV45FlagPreMed == 1 )
         {
            AV51PrdPreAct = A726PrdPreMed ;
         }
         if ( AV41CieCCo == 0 )
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV39CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = AV35BarPri ;
            GXv_decimal9[0] = AV51PrdPreAct ;
            GXv_int12[0] = AV32BarCod ;
            GXv_int21[0] = AV34BarCodReo ;
            GXv_char11[0] = AV33BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV40CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas desglose compuesto", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV44Fecha ;
            new app.pcls015(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
            pcls020.this.A396EmprCod = GXv_char23[0] ;
            pcls020.this.A719PrdNum = GXv_char15[0] ;
            pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
            pcls020.this.AV35BarPri = GXv_char13[0] ;
            pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
            pcls020.this.AV32BarCod = GXv_int12[0] ;
            pcls020.this.AV34BarCodReo = GXv_int21[0] ;
            pcls020.this.AV33BarCodPar = GXv_char11[0] ;
            pcls020.this.AV40CCStkUsu = GXv_char7[0] ;
            pcls020.this.AV44Fecha = GXv_date19[0] ;
            if ( AV43Eliot == 1 )
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = AV39CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_decimal17[0] = AV51PrdPreAct ;
               GXv_char13[0] = AV40CCStkUsu ;
               GXv_char11[0] = httpContext.getMessage( "Cierre Tinturas desglose compuesto", "") ;
               GXv_dtime20[0] = AV36Ca_DiaHora ;
               GXv_int21[0] = AV37CC_almcod ;
               GXv_int12[0] = AV32BarCod ;
               GXv_int2[0] = AV34BarCodReo ;
               GXv_char8[0] = AV33BarCodPar ;
               new app.pcls016(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
               pcls020.this.A396EmprCod = GXv_char23[0] ;
               pcls020.this.A719PrdNum = GXv_char15[0] ;
               pcls020.this.AV39CCStkCanS = GXv_decimal18[0] ;
               pcls020.this.AV51PrdPreAct = GXv_decimal17[0] ;
               pcls020.this.AV40CCStkUsu = GXv_char13[0] ;
               pcls020.this.AV36Ca_DiaHora = GXv_dtime20[0] ;
               pcls020.this.AV37CC_almcod = GXv_int21[0] ;
               pcls020.this.AV32BarCod = GXv_int12[0] ;
               pcls020.this.AV34BarCodReo = GXv_int2[0] ;
               pcls020.this.AV33BarCodPar = GXv_char8[0] ;
            }
         }
         else
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV39CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = AV35BarPri ;
            GXv_decimal9[0] = AV51PrdPreAct ;
            GXv_int12[0] = AV32BarCod ;
            GXv_int21[0] = AV34BarCodReo ;
            GXv_char11[0] = AV33BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV40CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas desglose compuesto", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV44Fecha ;
            GXv_int16[0] = AV55MaqCCoCod ;
            new app.pcls017(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
            pcls020.this.A396EmprCod = GXv_char23[0] ;
            pcls020.this.A719PrdNum = GXv_char15[0] ;
            pcls020.this.AV39CCStkCanS = GXv_decimal17[0] ;
            pcls020.this.AV35BarPri = GXv_char13[0] ;
            pcls020.this.AV51PrdPreAct = GXv_decimal9[0] ;
            pcls020.this.AV32BarCod = GXv_int12[0] ;
            pcls020.this.AV34BarCodReo = GXv_int21[0] ;
            pcls020.this.AV33BarCodPar = GXv_char11[0] ;
            pcls020.this.AV40CCStkUsu = GXv_char7[0] ;
            pcls020.this.AV44Fecha = GXv_date19[0] ;
            pcls020.this.AV55MaqCCoCod = GXv_int16[0] ;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S121( )
   {
      /* 'CCO' Routine */
      returnInSub = false ;
      /* Using cursor P056211 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A602MaqCod = P056211_A602MaqCod[0] ;
         AV46MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      /* Using cursor P056212 */
      pr_default.execute(10, new Object[] {A396EmprCod, AV46MaqCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A602MaqCod = P056212_A602MaqCod[0] ;
         A5100MaqCCoCod = P056212_A5100MaqCCoCod[0] ;
         n5100MaqCCoCod = P056212_n5100MaqCCoCod[0] ;
         AV55MaqCCoCod = A5100MaqCCoCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls020.this.A396EmprCod;
      this.aP1[0] = pcls020.this.A129BarCod;
      this.aP2[0] = pcls020.this.A132BarCodReo;
      this.aP3[0] = pcls020.this.A130BarCodPar;
      this.aP4[0] = pcls020.this.A2804RecLinMaq;
      this.aP5[0] = pcls020.this.AV40CCStkUsu;
      this.aP6[0] = pcls020.this.AV36Ca_DiaHora;
      this.aP7[0] = pcls020.this.AV37CC_almcod;
      this.aP8[0] = pcls020.this.AV54Tipo;
      this.aP9[0] = pcls020.this.AV44Fecha;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV53Text_c = "" ;
      scmdbuf = "" ;
      P05622_A396EmprCod = new String[] {""} ;
      P05622_A129BarCod = new int[1] ;
      P05622_A132BarCodReo = new byte[1] ;
      P05622_A130BarCodPar = new String[] {""} ;
      P05622_A2804RecLinMaq = new short[1] ;
      P05622_A718PrdNom = new String[] {""} ;
      P05622_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05622_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05622_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05622_A719PrdNum = new String[] {""} ;
      P05622_n719PrdNum = new boolean[] {false} ;
      P05622_A5725RecLote = new String[] {""} ;
      P05622_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05622_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05622_A209BarPri = new String[] {""} ;
      P05622_A1273RecLinPro = new byte[1] ;
      P05622_A811RecLin = new short[1] ;
      A718PrdNom = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A5725RecLote = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A209BarPri = "" ;
      W396EmprCod = "" ;
      AV39CCStkCanS = DecimalUtil.ZERO ;
      AV52RecLote = "" ;
      AV50PrdComCod = "" ;
      AV49PrdCant = DecimalUtil.ZERO ;
      AV48PrdCanAny = DecimalUtil.ZERO ;
      AV51PrdPreAct = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV35BarPri = "" ;
      AV33BarCodPar = "" ;
      A8635Ca_DiaHora = GXutil.resetTime( GXutil.nullDate() );
      A8638Ca_PrdNom = "" ;
      A8634Ca_Prdnum = "" ;
      A8637Ca_Cant = DecimalUtil.ZERO ;
      A8636Ca_Prdcant = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P05625_A396EmprCod = new String[] {""} ;
      P05625_A129BarCod = new int[1] ;
      P05625_A132BarCodReo = new byte[1] ;
      P05625_A130BarCodPar = new String[] {""} ;
      P05625_A2808RecLinMAL = new short[1] ;
      P05625_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05625_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05625_n1378PrdCFin = new boolean[] {false} ;
      P05625_A5807LanyLote = new String[] {""} ;
      P05625_n5807LanyLote = new boolean[] {false} ;
      P05625_A719PrdNum = new String[] {""} ;
      P05625_n719PrdNum = new boolean[] {false} ;
      P05625_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05625_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05625_A209BarPri = new String[] {""} ;
      P05625_A1377RecNumAny = new byte[1] ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A5807LanyLote = "" ;
      P05626_A396EmprCod = new String[] {""} ;
      P05626_A129BarCod = new int[1] ;
      P05626_A132BarCodReo = new byte[1] ;
      P05626_A130BarCodPar = new String[] {""} ;
      P05626_A2808RecLinMAL = new short[1] ;
      P05626_A718PrdNom = new String[] {""} ;
      P05626_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05626_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05626_n1378PrdCFin = new boolean[] {false} ;
      P05626_A719PrdNum = new String[] {""} ;
      P05626_n719PrdNum = new boolean[] {false} ;
      P05626_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05626_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05626_A209BarPri = new String[] {""} ;
      P05626_A5807LanyLote = new String[] {""} ;
      P05626_n5807LanyLote = new boolean[] {false} ;
      P05626_A1377RecNumAny = new byte[1] ;
      GXv_char3 = new String[1] ;
      P05629_A396EmprCod = new String[] {""} ;
      P05629_A129BarCod = new int[1] ;
      P05629_A132BarCodReo = new byte[1] ;
      P05629_A130BarCodPar = new String[] {""} ;
      P05629_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05629_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05629_A2495BarDosUsa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05629_n2495BarDosUsa = new boolean[] {false} ;
      P05629_A719PrdNum = new String[] {""} ;
      P05629_n719PrdNum = new boolean[] {false} ;
      P05629_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05629_A209BarPri = new String[] {""} ;
      P05629_A2494BarDosPro = new String[] {""} ;
      A2495BarDosUsa = DecimalUtil.ZERO ;
      A2494BarDosPro = "" ;
      P056210_A396EmprCod = new String[] {""} ;
      P056210_A688PrdComCod = new String[] {""} ;
      P056210_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056210_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056210_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056210_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056210_A719PrdNum = new String[] {""} ;
      P056210_n719PrdNum = new boolean[] {false} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      GXv_dtime20 = new java.util.Date[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char23 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int12 = new int[1] ;
      GXv_int21 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int22 = new short[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_int16 = new short[1] ;
      P056211_A396EmprCod = new String[] {""} ;
      P056211_A129BarCod = new int[1] ;
      P056211_A132BarCodReo = new byte[1] ;
      P056211_A130BarCodPar = new String[] {""} ;
      P056211_A2804RecLinMaq = new short[1] ;
      P056211_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV46MaqCod = "" ;
      P056212_A396EmprCod = new String[] {""} ;
      P056212_A602MaqCod = new String[] {""} ;
      P056212_A5100MaqCCoCod = new short[1] ;
      P056212_n5100MaqCCoCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls020__default(),
         new Object[] {
             new Object[] {
            P05622_A396EmprCod, P05622_A129BarCod, P05622_A132BarCodReo, P05622_A130BarCodPar, P05622_A2804RecLinMaq, P05622_A718PrdNom, P05622_A707PrdFacCon, P05622_A1797PrdCanAny, P05622_A686PrdCant, P05622_A719PrdNum,
            P05622_n719PrdNum, P05622_A5725RecLote, P05622_A724PrdPreAct, P05622_A726PrdPreMed, P05622_A209BarPri, P05622_A1273RecLinPro, P05622_A811RecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05625_A396EmprCod, P05625_A129BarCod, P05625_A132BarCodReo, P05625_A130BarCodPar, P05625_A2808RecLinMAL, P05625_A707PrdFacCon, P05625_A1378PrdCFin, P05625_n1378PrdCFin, P05625_A5807LanyLote, P05625_n5807LanyLote,
            P05625_A719PrdNum, P05625_A724PrdPreAct, P05625_A726PrdPreMed, P05625_A209BarPri, P05625_A1377RecNumAny
            }
            , new Object[] {
            P05626_A396EmprCod, P05626_A129BarCod, P05626_A132BarCodReo, P05626_A130BarCodPar, P05626_A2808RecLinMAL, P05626_A718PrdNom, P05626_A707PrdFacCon, P05626_A1378PrdCFin, P05626_n1378PrdCFin, P05626_A719PrdNum,
            P05626_A724PrdPreAct, P05626_A726PrdPreMed, P05626_A209BarPri, P05626_A5807LanyLote, P05626_n5807LanyLote, P05626_A1377RecNumAny
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05629_A396EmprCod, P05629_A129BarCod, P05629_A132BarCodReo, P05629_A130BarCodPar, P05629_A707PrdFacCon, P05629_A726PrdPreMed, P05629_A2495BarDosUsa, P05629_n2495BarDosUsa, P05629_A719PrdNum, P05629_A724PrdPreAct,
            P05629_A209BarPri, P05629_A2494BarDosPro
            }
            , new Object[] {
            P056210_A396EmprCod, P056210_A688PrdComCod, P056210_A690PrdComFN, P056210_A707PrdFacCon, P056210_A724PrdPreAct, P056210_A726PrdPreMed, P056210_A719PrdNum
            }
            , new Object[] {
            P056211_A396EmprCod, P056211_A129BarCod, P056211_A132BarCodReo, P056211_A130BarCodPar, P056211_A2804RecLinMaq, P056211_A602MaqCod
            }
            , new Object[] {
            P056212_A396EmprCod, P056212_A602MaqCod, P056212_A5100MaqCCoCod, P056212_n5100MaqCCoCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV37CC_almcod ;
   private byte AV45FlagPreMed ;
   private byte AV42CieLote ;
   private byte AV41CieCCo ;
   private byte AV43Eliot ;
   private byte GXt_int1 ;
   private byte A1273RecLinPro ;
   private byte AV34BarCodReo ;
   private byte A1377RecNumAny ;
   private byte GXv_int2[] ;
   private byte GXv_int21[] ;
   private short A2804RecLinMaq ;
   private short AV56Moda21 ;
   private short A811RecLin ;
   private short AV55MaqCCoCod ;
   private short Gx_err ;
   private short A2808RecLinMAL ;
   private short GXv_int22[] ;
   private short GXv_int16[] ;
   private short A5100MaqCCoCod ;
   private int A129BarCod ;
   private int AV32BarCod ;
   private int GX_INS1182 ;
   private int GXv_int12[] ;
   private int GXv_int10[] ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV39CCStkCanS ;
   private java.math.BigDecimal AV49PrdCant ;
   private java.math.BigDecimal AV48PrdCanAny ;
   private java.math.BigDecimal AV51PrdPreAct ;
   private java.math.BigDecimal A8637Ca_Cant ;
   private java.math.BigDecimal A8636Ca_Prdcant ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A2495BarDosUsa ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV40CCStkUsu ;
   private String AV54Tipo ;
   private String AV53Text_c ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A5725RecLote ;
   private String A209BarPri ;
   private String W396EmprCod ;
   private String AV52RecLote ;
   private String AV50PrdComCod ;
   private String Gx_msg ;
   private String AV35BarPri ;
   private String AV33BarCodPar ;
   private String A8638Ca_PrdNom ;
   private String A8634Ca_Prdnum ;
   private String Gx_emsg ;
   private String A5807LanyLote ;
   private String GXv_char3[] ;
   private String A2494BarDosPro ;
   private String A688PrdComCod ;
   private String GXv_char23[] ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String A602MaqCod ;
   private String AV46MaqCod ;
   private java.util.Date AV36Ca_DiaHora ;
   private java.util.Date A8635Ca_DiaHora ;
   private java.util.Date GXv_dtime20[] ;
   private java.util.Date AV44Fecha ;
   private java.util.Date GXv_date19[] ;
   private boolean brk5622 ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n8638Ca_PrdNom ;
   private boolean n8637Ca_Cant ;
   private boolean n8636Ca_Prdcant ;
   private boolean brk5626 ;
   private boolean n1378PrdCFin ;
   private boolean n5807LanyLote ;
   private boolean brk5628 ;
   private boolean brk56212 ;
   private boolean n2495BarDosUsa ;
   private boolean n5100MaqCCoCod ;
   private java.util.Date[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private java.util.Date[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P05622_A396EmprCod ;
   private int[] P05622_A129BarCod ;
   private byte[] P05622_A132BarCodReo ;
   private String[] P05622_A130BarCodPar ;
   private short[] P05622_A2804RecLinMaq ;
   private String[] P05622_A718PrdNom ;
   private java.math.BigDecimal[] P05622_A707PrdFacCon ;
   private java.math.BigDecimal[] P05622_A1797PrdCanAny ;
   private java.math.BigDecimal[] P05622_A686PrdCant ;
   private String[] P05622_A719PrdNum ;
   private boolean[] P05622_n719PrdNum ;
   private String[] P05622_A5725RecLote ;
   private java.math.BigDecimal[] P05622_A724PrdPreAct ;
   private java.math.BigDecimal[] P05622_A726PrdPreMed ;
   private String[] P05622_A209BarPri ;
   private byte[] P05622_A1273RecLinPro ;
   private short[] P05622_A811RecLin ;
   private String[] P05625_A396EmprCod ;
   private int[] P05625_A129BarCod ;
   private byte[] P05625_A132BarCodReo ;
   private String[] P05625_A130BarCodPar ;
   private short[] P05625_A2808RecLinMAL ;
   private java.math.BigDecimal[] P05625_A707PrdFacCon ;
   private java.math.BigDecimal[] P05625_A1378PrdCFin ;
   private boolean[] P05625_n1378PrdCFin ;
   private String[] P05625_A5807LanyLote ;
   private boolean[] P05625_n5807LanyLote ;
   private String[] P05625_A719PrdNum ;
   private boolean[] P05625_n719PrdNum ;
   private java.math.BigDecimal[] P05625_A724PrdPreAct ;
   private java.math.BigDecimal[] P05625_A726PrdPreMed ;
   private String[] P05625_A209BarPri ;
   private byte[] P05625_A1377RecNumAny ;
   private String[] P05626_A396EmprCod ;
   private int[] P05626_A129BarCod ;
   private byte[] P05626_A132BarCodReo ;
   private String[] P05626_A130BarCodPar ;
   private short[] P05626_A2808RecLinMAL ;
   private String[] P05626_A718PrdNom ;
   private java.math.BigDecimal[] P05626_A707PrdFacCon ;
   private java.math.BigDecimal[] P05626_A1378PrdCFin ;
   private boolean[] P05626_n1378PrdCFin ;
   private String[] P05626_A719PrdNum ;
   private boolean[] P05626_n719PrdNum ;
   private java.math.BigDecimal[] P05626_A724PrdPreAct ;
   private java.math.BigDecimal[] P05626_A726PrdPreMed ;
   private String[] P05626_A209BarPri ;
   private String[] P05626_A5807LanyLote ;
   private boolean[] P05626_n5807LanyLote ;
   private byte[] P05626_A1377RecNumAny ;
   private String[] P05629_A396EmprCod ;
   private int[] P05629_A129BarCod ;
   private byte[] P05629_A132BarCodReo ;
   private String[] P05629_A130BarCodPar ;
   private java.math.BigDecimal[] P05629_A707PrdFacCon ;
   private java.math.BigDecimal[] P05629_A726PrdPreMed ;
   private java.math.BigDecimal[] P05629_A2495BarDosUsa ;
   private boolean[] P05629_n2495BarDosUsa ;
   private String[] P05629_A719PrdNum ;
   private boolean[] P05629_n719PrdNum ;
   private java.math.BigDecimal[] P05629_A724PrdPreAct ;
   private String[] P05629_A209BarPri ;
   private String[] P05629_A2494BarDosPro ;
   private String[] P056210_A396EmprCod ;
   private String[] P056210_A688PrdComCod ;
   private java.math.BigDecimal[] P056210_A690PrdComFN ;
   private java.math.BigDecimal[] P056210_A707PrdFacCon ;
   private java.math.BigDecimal[] P056210_A724PrdPreAct ;
   private java.math.BigDecimal[] P056210_A726PrdPreMed ;
   private String[] P056210_A719PrdNum ;
   private boolean[] P056210_n719PrdNum ;
   private String[] P056211_A396EmprCod ;
   private int[] P056211_A129BarCod ;
   private byte[] P056211_A132BarCodReo ;
   private String[] P056211_A130BarCodPar ;
   private short[] P056211_A2804RecLinMaq ;
   private String[] P056211_A602MaqCod ;
   private String[] P056212_A396EmprCod ;
   private String[] P056212_A602MaqCod ;
   private short[] P056212_A5100MaqCCoCod ;
   private boolean[] P056212_n5100MaqCCoCod ;
}

final  class pcls020__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05622", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdNom, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.PrdNum, T1.RecLote, T2.PrdPreAct, T2.PrdPreMed, T3.BarPri, T1.RecLinPro, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05623", "INSERT INTO TXPCONSC(EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Prdcant, Ca_Cant, Ca_PrdNom) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new UpdateCursor("P05624", "UPDATE TXPCONSC SET Ca_Prdcant=Ca_Prdcant + ( ( ? * CAST(1000 AS NUMERIC(22,10)))), Ca_Cant=Ca_Cant + ?  WHERE EmprCod = ? and Ca_Prdnum = ? and Ca_DiaHora = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P05625", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T2.PrdFacCon, T1.PrdCFin, T1.LanyLote, T1.PrdNum, T2.PrdPreAct, T2.PrdPreMed, T3.BarPri, T1.RecNumAny FROM ((TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum, T1.LanyLote ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05626", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T2.PrdNom, T2.PrdFacCon, T1.PrdCFin, T1.PrdNum, T2.PrdPreAct, T2.PrdPreMed, T3.BarPri, T1.LanyLote, T1.RecNumAny FROM ((TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum, T1.LanyLote ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05627", "INSERT INTO TXPCONSC(EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Prdcant, Ca_Cant, Ca_PrdNom) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new UpdateCursor("P05628", "UPDATE TXPCONSC SET Ca_Prdcant=Ca_Prdcant + ( ( ? * CAST(1000 AS NUMERIC(22,10)))), Ca_Cant=Ca_Cant + ?  WHERE EmprCod = ? and Ca_Prdnum = ? and Ca_DiaHora = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P05629", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.PrdFacCon, T2.PrdPreMed, T1.BarDosUsa, T1.PrdNum, T2.PrdPreAct, T3.BarPri, T1.BarDosPro FROM ((TXPBARDOS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056210", "SELECT T1.EmprCod, T1.PrdComCod, T1.PrdComFN, T2.PrdFacCon, T2.PrdPreAct, T2.PrdPreMed, T1.PrdNum FROM (TXPLPRDCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056211", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056212", "SELECT EmprCod, MaqCod, MaqCCoCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 3);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 4);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 26);
               }
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 3);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 4);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 26);
               }
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

