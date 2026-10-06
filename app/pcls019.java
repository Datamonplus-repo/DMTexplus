package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls019 extends GXProcedure
{
   public pcls019( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls019.class ), "" );
   }

   public pcls019( int remoteHandle ,
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
                                     byte[] aP7 )
   {
      pcls019.this.aP8 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        java.util.Date[] aP6 ,
                        byte[] aP7 ,
                        java.util.Date[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 ,
                             byte[] aP7 ,
                             java.util.Date[] aP8 )
   {
      pcls019.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls019.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcls019.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls019.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls019.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcls019.this.AV16CCStkUsu = aP5[0];
      this.aP5 = aP5;
      pcls019.this.AV12Ca_diahora = aP6[0];
      this.aP6 = aP6;
      pcls019.this.AV13CC_AlmCod = aP7[0];
      this.aP7 = aP7;
      pcls019.this.AV20Fecha = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV22FlagPreMed ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int2) ;
      pcls019.this.GXt_int1 = GXv_int2[0] ;
      AV22FlagPreMed = GXt_int1 ;
      GXt_int1 = AV18CieLote ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIELOT", ""), GXv_int2) ;
      pcls019.this.GXt_int1 = GXv_int2[0] ;
      AV18CieLote = GXt_int1 ;
      GXt_int1 = AV17CieCCo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIECCO", ""), GXv_int2) ;
      pcls019.this.GXt_int1 = GXv_int2[0] ;
      AV17CieCCo = GXt_int1 ;
      GXt_int1 = AV19Eliot ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int2) ;
      pcls019.this.GXt_int1 = GXv_int2[0] ;
      AV19Eliot = GXt_int1 ;
      GXt_int1 = AV24Nalmcc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int2) ;
      pcls019.this.GXt_int1 = GXv_int2[0] ;
      AV24Nalmcc = GXt_int1 ;
      /* Using cursor P05612 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5612 = false ;
         A718PrdNom = P05612_A718PrdNom[0] ;
         A707PrdFacCon = P05612_A707PrdFacCon[0] ;
         A1797PrdCanAny = P05612_A1797PrdCanAny[0] ;
         A686PrdCant = P05612_A686PrdCant[0] ;
         A719PrdNum = P05612_A719PrdNum[0] ;
         n719PrdNum = P05612_n719PrdNum[0] ;
         A5725RecLote = P05612_A5725RecLote[0] ;
         A724PrdPreAct = P05612_A724PrdPreAct[0] ;
         A726PrdPreMed = P05612_A726PrdPreMed[0] ;
         A811RecLin = P05612_A811RecLin[0] ;
         A209BarPri = P05612_A209BarPri[0] ;
         A1273RecLinPro = P05612_A1273RecLinPro[0] ;
         A718PrdNom = P05612_A718PrdNom[0] ;
         A707PrdFacCon = P05612_A707PrdFacCon[0] ;
         A724PrdPreAct = P05612_A724PrdPreAct[0] ;
         A726PrdPreMed = P05612_A726PrdPreMed[0] ;
         A209BarPri = P05612_A209BarPri[0] ;
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
         AV15CCStkCanS = DecimalUtil.doubleToDec(0) ;
         AV30RecLote = A5725RecLote ;
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
         {
            AV28PrdComCod = A719PrdNum ;
            AV27PrdCant = DecimalUtil.doubleToDec(0) ;
            AV26PrdCanAny = DecimalUtil.doubleToDec(0) ;
         }
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05612_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05612_A129BarCod[0] == A129BarCod ) && ( P05612_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P05612_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P05612_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P05612_A719PrdNum[0], A719PrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brk5612 = false ;
            A707PrdFacCon = P05612_A707PrdFacCon[0] ;
            A1797PrdCanAny = P05612_A1797PrdCanAny[0] ;
            A686PrdCant = P05612_A686PrdCant[0] ;
            A811RecLin = P05612_A811RecLin[0] ;
            A1273RecLinPro = P05612_A1273RecLinPro[0] ;
            A707PrdFacCon = P05612_A707PrdFacCon[0] ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
            {
               AV15CCStkCanS = AV15CCStkCanS.add((((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon))) ;
            }
            else
            {
               AV27PrdCant = AV27PrdCant.add(A686PrdCant) ;
               AV26PrdCanAny = AV26PrdCanAny.add(A1797PrdCanAny) ;
            }
            brk5612 = true ;
            pr_default.readNext(0);
         }
         AV29PrdPreAct = A724PrdPreAct ;
         if ( AV22FlagPreMed == 1 )
         {
            AV29PrdPreAct = A726PrdPreMed ;
         }
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
         {
            if ( AV18CieLote == 0 )
            {
               if ( AV17CieCCo == 0 )
               {
                  Gx_msg = httpContext.getMessage( "Go pcls015. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Linea= ", "") + GXutil.str( A811RecLin, 4, 0) ;
                  GXv_char3[0] = A396EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal6[0] = AV15CCStkCanS ;
                  GXv_char7[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char8[0] = A209BarPri ;
                  GXv_decimal9[0] = AV29PrdPreAct ;
                  GXv_int10[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char11[0] = A130BarCodPar ;
                  GXv_int12[0] = 0 ;
                  GXv_char13[0] = " " ;
                  GXv_char14[0] = AV16CCStkUsu ;
                  GXv_char15[0] = httpContext.getMessage( "Cierre Tinturas Automatico", "") ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV20Fecha ;
                  new app.pcls015(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_char7, GXv_char8, GXv_decimal9, GXv_int10, GXv_int2, GXv_char11, GXv_int12, GXv_char13, GXv_char14, GXv_char15, GXv_int16, GXv_decimal17, GXv_decimal18, GXv_date19) ;
                  pcls019.this.A396EmprCod = GXv_char3[0] ;
                  pcls019.this.A719PrdNum = GXv_char4[0] ;
                  pcls019.this.AV15CCStkCanS = GXv_decimal6[0] ;
                  pcls019.this.A209BarPri = GXv_char8[0] ;
                  pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
                  pcls019.this.A129BarCod = GXv_int10[0] ;
                  pcls019.this.A132BarCodReo = GXv_int2[0] ;
                  pcls019.this.A130BarCodPar = GXv_char11[0] ;
                  pcls019.this.AV16CCStkUsu = GXv_char14[0] ;
                  pcls019.this.AV20Fecha = GXv_date19[0] ;
                  if ( AV24Nalmcc == 1 )
                  {
                     GXv_char15[0] = A396EmprCod ;
                     GXv_char14[0] = A719PrdNum ;
                     GXv_decimal18[0] = AV15CCStkCanS ;
                     GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                     GXv_decimal17[0] = AV29PrdPreAct ;
                     GXv_char11[0] = AV16CCStkUsu ;
                     GXv_char8[0] = httpContext.getMessage( "Cierre Tinturas Automatico", "") ;
                     GXv_dtime20[0] = AV12Ca_diahora ;
                     GXv_int2[0] = AV13CC_AlmCod ;
                     GXv_int12[0] = A129BarCod ;
                     GXv_int21[0] = A132BarCodReo ;
                     GXv_char7[0] = A130BarCodPar ;
                     new app.pcls016(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_char13, GXv_decimal17, GXv_char11, GXv_char8, GXv_dtime20, GXv_int2, GXv_int12, GXv_int21, GXv_char7) ;
                     pcls019.this.A396EmprCod = GXv_char15[0] ;
                     pcls019.this.A719PrdNum = GXv_char14[0] ;
                     pcls019.this.AV15CCStkCanS = GXv_decimal18[0] ;
                     pcls019.this.AV29PrdPreAct = GXv_decimal17[0] ;
                     pcls019.this.AV16CCStkUsu = GXv_char11[0] ;
                     pcls019.this.AV12Ca_diahora = GXv_dtime20[0] ;
                     pcls019.this.AV13CC_AlmCod = GXv_int2[0] ;
                     pcls019.this.A129BarCod = GXv_int12[0] ;
                     pcls019.this.A132BarCodReo = GXv_int21[0] ;
                     pcls019.this.A130BarCodPar = GXv_char7[0] ;
                  }
               }
               else
               {
                  Gx_msg = httpContext.getMessage( "Go pcls017. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Linea= ", "") + GXutil.str( A811RecLin, 4, 0) ;
                  GXv_char15[0] = A396EmprCod ;
                  GXv_char14[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV15CCStkCanS ;
                  GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char11[0] = A209BarPri ;
                  GXv_decimal9[0] = AV29PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int21[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char7[0] = " " ;
                  GXv_char4[0] = AV16CCStkUsu ;
                  GXv_char3[0] = httpContext.getMessage( "Cierre Tinturas Automatico", "") ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV20Fecha ;
                  GXv_int22[0] = AV37Maqccocod ;
                  new app.pcls017(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int21, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int16, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int22) ;
                  pcls019.this.A396EmprCod = GXv_char15[0] ;
                  pcls019.this.A719PrdNum = GXv_char14[0] ;
                  pcls019.this.AV15CCStkCanS = GXv_decimal17[0] ;
                  pcls019.this.A209BarPri = GXv_char11[0] ;
                  pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
                  pcls019.this.A129BarCod = GXv_int12[0] ;
                  pcls019.this.A132BarCodReo = GXv_int21[0] ;
                  pcls019.this.A130BarCodPar = GXv_char8[0] ;
                  pcls019.this.AV16CCStkUsu = GXv_char4[0] ;
                  pcls019.this.AV20Fecha = GXv_date19[0] ;
                  pcls019.this.AV37Maqccocod = GXv_int22[0] ;
               }
            }
            else
            {
               if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) != 0 )
               {
                  Gx_msg = httpContext.getMessage( "Go pcls018. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Linea= ", "") + GXutil.str( A811RecLin, 4, 0) ;
                  GXv_char15[0] = A396EmprCod ;
                  GXv_char14[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV15CCStkCanS ;
                  GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char11[0] = A209BarPri ;
                  GXv_decimal9[0] = AV29PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int21[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char7[0] = " " ;
                  GXv_char4[0] = AV16CCStkUsu ;
                  GXv_char3[0] = httpContext.getMessage( "Cierre Tinturas Automatico", "") ;
                  GXv_int22[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV20Fecha ;
                  GXv_char23[0] = AV30RecLote ;
                  new app.pcls018(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int21, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char23) ;
                  pcls019.this.A396EmprCod = GXv_char15[0] ;
                  pcls019.this.A719PrdNum = GXv_char14[0] ;
                  pcls019.this.AV15CCStkCanS = GXv_decimal17[0] ;
                  pcls019.this.A209BarPri = GXv_char11[0] ;
                  pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
                  pcls019.this.A129BarCod = GXv_int12[0] ;
                  pcls019.this.A132BarCodReo = GXv_int21[0] ;
                  pcls019.this.A130BarCodPar = GXv_char8[0] ;
                  pcls019.this.AV16CCStkUsu = GXv_char4[0] ;
                  pcls019.this.AV20Fecha = GXv_date19[0] ;
                  pcls019.this.AV30RecLote = GXv_char23[0] ;
               }
            }
         }
         else
         {
            AV11BarPri = A209BarPri ;
            AV8BarCod = A129BarCod ;
            AV10BarCodReo = A132BarCodReo ;
            AV9BarCodPar = A130BarCodPar ;
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
         Gx_msg = httpContext.getMessage( "Insert TABLA CONSC. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Linea= ", "") + GXutil.str( A811RecLin, 4, 0) ;
         /*
            INSERT RECORD ON TABLE TXPCONSC

         */
         W396EmprCod = A396EmprCod ;
         A8635Ca_DiaHora = AV12Ca_diahora ;
         A8638Ca_PrdNom = A718PrdNom ;
         n8638Ca_PrdNom = false ;
         A8634Ca_Prdnum = A719PrdNum ;
         if ( DecimalUtil.compareTo(AV15CCStkCanS, DecimalUtil.stringToDec("9999999.9999")) > 0 )
         {
            A8637Ca_Cant = DecimalUtil.stringToDec("9999999.9999") ;
            n8637Ca_Cant = false ;
         }
         else
         {
            A8637Ca_Cant = AV15CCStkCanS ;
            n8637Ca_Cant = false ;
         }
         if ( DecimalUtil.compareTo((AV15CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))), DecimalUtil.stringToDec("9999999.999")) > 0 )
         {
            A8636Ca_Prdcant = DecimalUtil.stringToDec("9999999.999") ;
            n8636Ca_Prdcant = false ;
         }
         else
         {
            A8636Ca_Prdcant = AV15CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
            n8636Ca_Prdcant = false ;
         }
         /* Using cursor P05613 */
         pr_default.execute(1, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8638Ca_PrdNom), A8638Ca_PrdNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P05614 */
            pr_default.execute(2, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A396EmprCod = P05614_A396EmprCod[0] ;
               A8634Ca_Prdnum = P05614_A8634Ca_Prdnum[0] ;
               A8635Ca_DiaHora = P05614_A8635Ca_DiaHora[0] ;
               A8637Ca_Cant = P05614_A8637Ca_Cant[0] ;
               n8637Ca_Cant = P05614_n8637Ca_Cant[0] ;
               A8636Ca_Prdcant = P05614_A8636Ca_Prdcant[0] ;
               n8636Ca_Prdcant = P05614_n8636Ca_Prdcant[0] ;
               if ( DecimalUtil.compareTo((A8637Ca_Cant.add(AV15CCStkCanS)), DecimalUtil.stringToDec("9999999.9999")) > 0 )
               {
                  A8637Ca_Cant = DecimalUtil.stringToDec("9999999.9999") ;
                  n8637Ca_Cant = false ;
               }
               else
               {
                  A8637Ca_Cant = A8637Ca_Cant.add(AV15CCStkCanS) ;
                  n8637Ca_Cant = false ;
               }
               if ( DecimalUtil.compareTo((A8636Ca_Prdcant.add((AV15CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))))), DecimalUtil.stringToDec("9999999.999")) > 0 )
               {
                  A8636Ca_Prdcant = DecimalUtil.stringToDec("9999999.999") ;
                  n8636Ca_Prdcant = false ;
               }
               else
               {
                  A8636Ca_Prdcant = A8636Ca_Prdcant.add(((AV15CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))))) ;
                  n8636Ca_Prdcant = false ;
               }
               /* Using cursor P05615 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         Gx_msg = httpContext.getMessage( "Fin Insert TABLA CONSC. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Linea= ", "") + GXutil.str( A811RecLin, 4, 0) ;
         A396EmprCod = W396EmprCod ;
         if ( ! brk5612 )
         {
            brk5612 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /* Using cursor P05616 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk5616 = false ;
         A2808RecLinMAL = P05616_A2808RecLinMAL[0] ;
         A718PrdNom = P05616_A718PrdNom[0] ;
         A707PrdFacCon = P05616_A707PrdFacCon[0] ;
         A1378PrdCFin = P05616_A1378PrdCFin[0] ;
         n1378PrdCFin = P05616_n1378PrdCFin[0] ;
         A719PrdNum = P05616_A719PrdNum[0] ;
         n719PrdNum = P05616_n719PrdNum[0] ;
         A724PrdPreAct = P05616_A724PrdPreAct[0] ;
         A726PrdPreMed = P05616_A726PrdPreMed[0] ;
         A4578LanyUsr = P05616_A4578LanyUsr[0] ;
         n4578LanyUsr = P05616_n4578LanyUsr[0] ;
         A209BarPri = P05616_A209BarPri[0] ;
         A5807LanyLote = P05616_A5807LanyLote[0] ;
         n5807LanyLote = P05616_n5807LanyLote[0] ;
         A1377RecNumAny = P05616_A1377RecNumAny[0] ;
         A718PrdNom = P05616_A718PrdNom[0] ;
         A707PrdFacCon = P05616_A707PrdFacCon[0] ;
         A724PrdPreAct = P05616_A724PrdPreAct[0] ;
         A726PrdPreMed = P05616_A726PrdPreMed[0] ;
         A209BarPri = P05616_A209BarPri[0] ;
         W396EmprCod = A396EmprCod ;
         AV15CCStkCanS = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P05616_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05616_A129BarCod[0] == A129BarCod ) && ( P05616_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P05616_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P05616_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(P05616_A719PrdNum[0], A719PrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brk5616 = false ;
            A707PrdFacCon = P05616_A707PrdFacCon[0] ;
            A1378PrdCFin = P05616_A1378PrdCFin[0] ;
            n1378PrdCFin = P05616_n1378PrdCFin[0] ;
            A1377RecNumAny = P05616_A1377RecNumAny[0] ;
            A707PrdFacCon = P05616_A707PrdFacCon[0] ;
            AV15CCStkCanS = AV15CCStkCanS.add((A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon)) ;
            brk5616 = true ;
            pr_default.readNext(4);
         }
         AV29PrdPreAct = A724PrdPreAct ;
         if ( AV22FlagPreMed == 1 )
         {
            AV29PrdPreAct = A726PrdPreMed ;
         }
         AV31CCstkdsc = ((GXutil.strcmp(A4578LanyUsr, httpContext.getMessage( "OrgtxMAN", ""))==0) ? httpContext.getMessage( "C Tinte Consumos Man Orgatex", "") : httpContext.getMessage( "C Tintura Añadidas Pc Ind Aut", "")) ;
         if ( AV18CieLote == 0 )
         {
            if ( AV17CieCCo == 0 )
            {
               Gx_msg = httpContext.getMessage( "Añadidas.Go PNEWCCS. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Producto=", "") + A719PrdNum ;
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV15CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV29PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV16CCStkUsu ;
               GXv_char4[0] = AV31CCstkdsc ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV20Fecha ;
               new app.pcls015(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
               pcls019.this.A396EmprCod = GXv_char23[0] ;
               pcls019.this.A719PrdNum = GXv_char15[0] ;
               pcls019.this.AV15CCStkCanS = GXv_decimal17[0] ;
               pcls019.this.A209BarPri = GXv_char13[0] ;
               pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
               pcls019.this.A129BarCod = GXv_int12[0] ;
               pcls019.this.A132BarCodReo = GXv_int21[0] ;
               pcls019.this.A130BarCodPar = GXv_char11[0] ;
               pcls019.this.AV16CCStkUsu = GXv_char7[0] ;
               pcls019.this.AV31CCstkdsc = GXv_char4[0] ;
               pcls019.this.AV20Fecha = GXv_date19[0] ;
               if ( AV24Nalmcc == 1 )
               {
                  GXv_char23[0] = A396EmprCod ;
                  GXv_char15[0] = A719PrdNum ;
                  GXv_decimal18[0] = AV15CCStkCanS ;
                  GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                  GXv_decimal17[0] = AV29PrdPreAct ;
                  GXv_char13[0] = AV16CCStkUsu ;
                  GXv_char11[0] = AV31CCstkdsc ;
                  GXv_dtime20[0] = AV12Ca_diahora ;
                  GXv_int21[0] = AV13CC_AlmCod ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  new app.pcls016(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
                  pcls019.this.A396EmprCod = GXv_char23[0] ;
                  pcls019.this.A719PrdNum = GXv_char15[0] ;
                  pcls019.this.AV15CCStkCanS = GXv_decimal18[0] ;
                  pcls019.this.AV29PrdPreAct = GXv_decimal17[0] ;
                  pcls019.this.AV16CCStkUsu = GXv_char13[0] ;
                  pcls019.this.AV31CCstkdsc = GXv_char11[0] ;
                  pcls019.this.AV12Ca_diahora = GXv_dtime20[0] ;
                  pcls019.this.AV13CC_AlmCod = GXv_int21[0] ;
                  pcls019.this.A129BarCod = GXv_int12[0] ;
                  pcls019.this.A132BarCodReo = GXv_int2[0] ;
                  pcls019.this.A130BarCodPar = GXv_char8[0] ;
               }
            }
            else
            {
               Gx_msg = httpContext.getMessage( "Añadidas.Go PNEWCC3. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( "P roducto=", "") + A719PrdNum ;
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV15CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV29PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV16CCStkUsu ;
               GXv_char4[0] = AV31CCstkdsc ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV20Fecha ;
               GXv_int16[0] = AV37Maqccocod ;
               new app.pcls017(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
               pcls019.this.A396EmprCod = GXv_char23[0] ;
               pcls019.this.A719PrdNum = GXv_char15[0] ;
               pcls019.this.AV15CCStkCanS = GXv_decimal17[0] ;
               pcls019.this.A209BarPri = GXv_char13[0] ;
               pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
               pcls019.this.A129BarCod = GXv_int12[0] ;
               pcls019.this.A132BarCodReo = GXv_int21[0] ;
               pcls019.this.A130BarCodPar = GXv_char11[0] ;
               pcls019.this.AV16CCStkUsu = GXv_char7[0] ;
               pcls019.this.AV31CCstkdsc = GXv_char4[0] ;
               pcls019.this.AV20Fecha = GXv_date19[0] ;
               pcls019.this.AV37Maqccocod = GXv_int16[0] ;
            }
         }
         else
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV15CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = A209BarPri ;
            GXv_decimal9[0] = AV29PrdPreAct ;
            GXv_int12[0] = A129BarCod ;
            GXv_int21[0] = A132BarCodReo ;
            GXv_char11[0] = A130BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV16CCStkUsu ;
            GXv_char4[0] = AV31CCstkdsc ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV20Fecha ;
            GXv_char3[0] = A5807LanyLote ;
            new app.pcls018(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char3) ;
            pcls019.this.A396EmprCod = GXv_char23[0] ;
            pcls019.this.A719PrdNum = GXv_char15[0] ;
            pcls019.this.AV15CCStkCanS = GXv_decimal17[0] ;
            pcls019.this.A209BarPri = GXv_char13[0] ;
            pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
            pcls019.this.A129BarCod = GXv_int12[0] ;
            pcls019.this.A132BarCodReo = GXv_int21[0] ;
            pcls019.this.A130BarCodPar = GXv_char11[0] ;
            pcls019.this.AV16CCStkUsu = GXv_char7[0] ;
            pcls019.this.AV31CCstkdsc = GXv_char4[0] ;
            pcls019.this.AV20Fecha = GXv_date19[0] ;
            pcls019.this.A5807LanyLote = GXv_char3[0] ;
         }
         Gx_msg = httpContext.getMessage( "Añadidas.Insert TABLA CONSC. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Producto=", "") + A719PrdNum ;
         /*
            INSERT RECORD ON TABLE TXPCONSC

         */
         W396EmprCod = A396EmprCod ;
         A8635Ca_DiaHora = AV12Ca_diahora ;
         A8638Ca_PrdNom = A718PrdNom ;
         n8638Ca_PrdNom = false ;
         A8634Ca_Prdnum = A719PrdNum ;
         if ( DecimalUtil.compareTo(AV15CCStkCanS, DecimalUtil.stringToDec("9999999.9999")) > 0 )
         {
            A8637Ca_Cant = DecimalUtil.stringToDec("9999999.9999") ;
            n8637Ca_Cant = false ;
         }
         else
         {
            A8637Ca_Cant = AV15CCStkCanS ;
            n8637Ca_Cant = false ;
         }
         if ( DecimalUtil.compareTo((AV15CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))), DecimalUtil.stringToDec("9999999.999")) > 0 )
         {
            A8636Ca_Prdcant = DecimalUtil.stringToDec("9999999.999") ;
            n8636Ca_Prdcant = false ;
         }
         else
         {
            A8636Ca_Prdcant = AV15CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
            n8636Ca_Prdcant = false ;
         }
         /* Using cursor P05617 */
         pr_default.execute(5, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8638Ca_PrdNom), A8638Ca_PrdNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
         if ( (pr_default.getStatus(5) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P05618 */
            pr_default.execute(6, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A396EmprCod = P05618_A396EmprCod[0] ;
               A8634Ca_Prdnum = P05618_A8634Ca_Prdnum[0] ;
               A8635Ca_DiaHora = P05618_A8635Ca_DiaHora[0] ;
               A8637Ca_Cant = P05618_A8637Ca_Cant[0] ;
               n8637Ca_Cant = P05618_n8637Ca_Cant[0] ;
               A8636Ca_Prdcant = P05618_A8636Ca_Prdcant[0] ;
               n8636Ca_Prdcant = P05618_n8636Ca_Prdcant[0] ;
               if ( DecimalUtil.compareTo((A8637Ca_Cant.add(AV15CCStkCanS)), DecimalUtil.stringToDec("9999999.9999")) > 0 )
               {
                  A8637Ca_Cant = DecimalUtil.stringToDec("9999999.9999") ;
                  n8637Ca_Cant = false ;
               }
               else
               {
                  A8637Ca_Cant = A8637Ca_Cant.add(AV15CCStkCanS) ;
                  n8637Ca_Cant = false ;
               }
               if ( DecimalUtil.compareTo((A8636Ca_Prdcant.add((AV15CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))))), DecimalUtil.stringToDec("9999999.999")) > 0 )
               {
                  A8636Ca_Prdcant = DecimalUtil.stringToDec("9999999.999") ;
                  n8636Ca_Prdcant = false ;
               }
               else
               {
                  A8636Ca_Prdcant = A8636Ca_Prdcant.add(((AV15CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))))) ;
                  n8636Ca_Prdcant = false ;
               }
               /* Using cursor P05619 */
               pr_default.execute(7, new Object[] {Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         Gx_msg = httpContext.getMessage( "Añadidas.Fin Insert TABLA CONSC. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Producto=", "") + A719PrdNum ;
         A396EmprCod = W396EmprCod ;
         if ( ! brk5616 )
         {
            brk5616 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
      /* Using cursor P056110 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk56110 = false ;
         A707PrdFacCon = P056110_A707PrdFacCon[0] ;
         A726PrdPreMed = P056110_A726PrdPreMed[0] ;
         A2495BarDosUsa = P056110_A2495BarDosUsa[0] ;
         n2495BarDosUsa = P056110_n2495BarDosUsa[0] ;
         A719PrdNum = P056110_A719PrdNum[0] ;
         n719PrdNum = P056110_n719PrdNum[0] ;
         A724PrdPreAct = P056110_A724PrdPreAct[0] ;
         A209BarPri = P056110_A209BarPri[0] ;
         A2494BarDosPro = P056110_A2494BarDosPro[0] ;
         A707PrdFacCon = P056110_A707PrdFacCon[0] ;
         A726PrdPreMed = P056110_A726PrdPreMed[0] ;
         A724PrdPreAct = P056110_A724PrdPreAct[0] ;
         A209BarPri = P056110_A209BarPri[0] ;
         if ( A129BarCod != 99999999 )
         {
            AV15CCStkCanS = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P056110_A396EmprCod[0], A396EmprCod) == 0 ) && ( P056110_A129BarCod[0] == A129BarCod ) && ( P056110_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P056110_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               if ( ! ( ( GXutil.strcmp(P056110_A719PrdNum[0], A719PrdNum) == 0 ) ) )
               {
                  if (true) break;
               }
               brk56110 = false ;
               A707PrdFacCon = P056110_A707PrdFacCon[0] ;
               A726PrdPreMed = P056110_A726PrdPreMed[0] ;
               A2495BarDosUsa = P056110_A2495BarDosUsa[0] ;
               n2495BarDosUsa = P056110_n2495BarDosUsa[0] ;
               A2494BarDosPro = P056110_A2494BarDosPro[0] ;
               A707PrdFacCon = P056110_A707PrdFacCon[0] ;
               A726PrdPreMed = P056110_A726PrdPreMed[0] ;
               AV15CCStkCanS = AV15CCStkCanS.add((A2495BarDosUsa.multiply(A726PrdPreMed).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               brk56110 = true ;
               pr_default.readNext(8);
            }
            AV29PrdPreAct = A724PrdPreAct ;
            if ( AV22FlagPreMed == 1 )
            {
               AV29PrdPreAct = A726PrdPreMed ;
            }
            if ( AV17CieCCo == 0 )
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV15CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV29PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV16CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "C Tinturas Dosificadora Aut.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV20Fecha ;
               new app.pcls015(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
               pcls019.this.A396EmprCod = GXv_char23[0] ;
               pcls019.this.A719PrdNum = GXv_char15[0] ;
               pcls019.this.AV15CCStkCanS = GXv_decimal17[0] ;
               pcls019.this.A209BarPri = GXv_char13[0] ;
               pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
               pcls019.this.A129BarCod = GXv_int12[0] ;
               pcls019.this.A132BarCodReo = GXv_int21[0] ;
               pcls019.this.A130BarCodPar = GXv_char11[0] ;
               pcls019.this.AV16CCStkUsu = GXv_char7[0] ;
               pcls019.this.AV20Fecha = GXv_date19[0] ;
               if ( AV24Nalmcc == 1 )
               {
                  GXv_char23[0] = A396EmprCod ;
                  GXv_char15[0] = A719PrdNum ;
                  GXv_decimal18[0] = AV15CCStkCanS ;
                  GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                  GXv_decimal17[0] = AV29PrdPreAct ;
                  GXv_char13[0] = AV16CCStkUsu ;
                  GXv_char11[0] = httpContext.getMessage( "C Tinturas Dosificadora Aut.", "") ;
                  GXv_dtime20[0] = AV12Ca_diahora ;
                  GXv_int21[0] = AV13CC_AlmCod ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  new app.pcls016(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
                  pcls019.this.A396EmprCod = GXv_char23[0] ;
                  pcls019.this.A719PrdNum = GXv_char15[0] ;
                  pcls019.this.AV15CCStkCanS = GXv_decimal18[0] ;
                  pcls019.this.AV29PrdPreAct = GXv_decimal17[0] ;
                  pcls019.this.AV16CCStkUsu = GXv_char13[0] ;
                  pcls019.this.AV12Ca_diahora = GXv_dtime20[0] ;
                  pcls019.this.AV13CC_AlmCod = GXv_int21[0] ;
                  pcls019.this.A129BarCod = GXv_int12[0] ;
                  pcls019.this.A132BarCodReo = GXv_int2[0] ;
                  pcls019.this.A130BarCodPar = GXv_char8[0] ;
               }
            }
            else
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV15CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV29PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV16CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "C Tinturas Dosificadora Aut.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV20Fecha ;
               GXv_int16[0] = AV37Maqccocod ;
               new app.pcls017(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
               pcls019.this.A396EmprCod = GXv_char23[0] ;
               pcls019.this.A719PrdNum = GXv_char15[0] ;
               pcls019.this.AV15CCStkCanS = GXv_decimal17[0] ;
               pcls019.this.A209BarPri = GXv_char13[0] ;
               pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
               pcls019.this.A129BarCod = GXv_int12[0] ;
               pcls019.this.A132BarCodReo = GXv_int21[0] ;
               pcls019.this.A130BarCodPar = GXv_char11[0] ;
               pcls019.this.AV16CCStkUsu = GXv_char7[0] ;
               pcls019.this.AV20Fecha = GXv_date19[0] ;
               pcls019.this.AV37Maqccocod = GXv_int16[0] ;
            }
         }
         if ( ! brk56110 )
         {
            brk56110 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUES' Routine */
      returnInSub = false ;
      /* Using cursor P056111 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV28PrdComCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A688PrdComCod = P056111_A688PrdComCod[0] ;
         A690PrdComFN = P056111_A690PrdComFN[0] ;
         A707PrdFacCon = P056111_A707PrdFacCon[0] ;
         A724PrdPreAct = P056111_A724PrdPreAct[0] ;
         A726PrdPreMed = P056111_A726PrdPreMed[0] ;
         A719PrdNum = P056111_A719PrdNum[0] ;
         n719PrdNum = P056111_n719PrdNum[0] ;
         A707PrdFacCon = P056111_A707PrdFacCon[0] ;
         A724PrdPreAct = P056111_A724PrdPreAct[0] ;
         A726PrdPreMed = P056111_A726PrdPreMed[0] ;
         AV15CCStkCanS = ((AV27PrdCant.add(AV26PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         AV29PrdPreAct = A724PrdPreAct ;
         if ( AV22FlagPreMed == 1 )
         {
            AV29PrdPreAct = A726PrdPreMed ;
         }
         if ( AV17CieCCo == 0 )
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV15CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = AV11BarPri ;
            GXv_decimal9[0] = AV29PrdPreAct ;
            GXv_int12[0] = AV8BarCod ;
            GXv_int21[0] = AV10BarCodReo ;
            GXv_char11[0] = AV9BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV16CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "C Tinturas compuesto Aut.", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV20Fecha ;
            new app.pcls015(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
            pcls019.this.A396EmprCod = GXv_char23[0] ;
            pcls019.this.A719PrdNum = GXv_char15[0] ;
            pcls019.this.AV15CCStkCanS = GXv_decimal17[0] ;
            pcls019.this.AV11BarPri = GXv_char13[0] ;
            pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
            pcls019.this.AV8BarCod = GXv_int12[0] ;
            pcls019.this.AV10BarCodReo = GXv_int21[0] ;
            pcls019.this.AV9BarCodPar = GXv_char11[0] ;
            pcls019.this.AV16CCStkUsu = GXv_char7[0] ;
            pcls019.this.AV20Fecha = GXv_date19[0] ;
            if ( AV24Nalmcc == 1 )
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = AV15CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_decimal17[0] = AV29PrdPreAct ;
               GXv_char13[0] = AV16CCStkUsu ;
               GXv_char11[0] = httpContext.getMessage( "C Tinturas compuesto Aut.", "") ;
               GXv_dtime20[0] = AV12Ca_diahora ;
               GXv_int21[0] = AV13CC_AlmCod ;
               GXv_int12[0] = AV8BarCod ;
               GXv_int2[0] = AV10BarCodReo ;
               GXv_char8[0] = AV9BarCodPar ;
               new app.pcls016(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
               pcls019.this.A396EmprCod = GXv_char23[0] ;
               pcls019.this.A719PrdNum = GXv_char15[0] ;
               pcls019.this.AV15CCStkCanS = GXv_decimal18[0] ;
               pcls019.this.AV29PrdPreAct = GXv_decimal17[0] ;
               pcls019.this.AV16CCStkUsu = GXv_char13[0] ;
               pcls019.this.AV12Ca_diahora = GXv_dtime20[0] ;
               pcls019.this.AV13CC_AlmCod = GXv_int21[0] ;
               pcls019.this.AV8BarCod = GXv_int12[0] ;
               pcls019.this.AV10BarCodReo = GXv_int2[0] ;
               pcls019.this.AV9BarCodPar = GXv_char8[0] ;
            }
         }
         else
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV15CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = AV11BarPri ;
            GXv_decimal9[0] = AV29PrdPreAct ;
            GXv_int12[0] = AV8BarCod ;
            GXv_int21[0] = AV10BarCodReo ;
            GXv_char11[0] = AV9BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV16CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "C Tinturas compuesto Aut.", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV20Fecha ;
            GXv_int16[0] = AV37Maqccocod ;
            new app.pcls017(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
            pcls019.this.A396EmprCod = GXv_char23[0] ;
            pcls019.this.A719PrdNum = GXv_char15[0] ;
            pcls019.this.AV15CCStkCanS = GXv_decimal17[0] ;
            pcls019.this.AV11BarPri = GXv_char13[0] ;
            pcls019.this.AV29PrdPreAct = GXv_decimal9[0] ;
            pcls019.this.AV8BarCod = GXv_int12[0] ;
            pcls019.this.AV10BarCodReo = GXv_int21[0] ;
            pcls019.this.AV9BarCodPar = GXv_char11[0] ;
            pcls019.this.AV16CCStkUsu = GXv_char7[0] ;
            pcls019.this.AV20Fecha = GXv_date19[0] ;
            pcls019.this.AV37Maqccocod = GXv_int16[0] ;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S121( )
   {
      /* 'CCO' Routine */
      returnInSub = false ;
      /* Using cursor P056112 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A602MaqCod = P056112_A602MaqCod[0] ;
         AV23MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      /* Using cursor P056113 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV23MaqCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A602MaqCod = P056113_A602MaqCod[0] ;
         A5100MaqCCoCod = P056113_A5100MaqCCoCod[0] ;
         n5100MaqCCoCod = P056113_n5100MaqCCoCod[0] ;
         AV37Maqccocod = A5100MaqCCoCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls019.this.A396EmprCod;
      this.aP1[0] = pcls019.this.A129BarCod;
      this.aP2[0] = pcls019.this.A132BarCodReo;
      this.aP3[0] = pcls019.this.A130BarCodPar;
      this.aP4[0] = pcls019.this.A2804RecLinMaq;
      this.aP5[0] = pcls019.this.AV16CCStkUsu;
      this.aP6[0] = pcls019.this.AV12Ca_diahora;
      this.aP7[0] = pcls019.this.AV13CC_AlmCod;
      this.aP8[0] = pcls019.this.AV20Fecha;
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
      P05612_A396EmprCod = new String[] {""} ;
      P05612_A129BarCod = new int[1] ;
      P05612_A132BarCodReo = new byte[1] ;
      P05612_A130BarCodPar = new String[] {""} ;
      P05612_A2804RecLinMaq = new short[1] ;
      P05612_A718PrdNom = new String[] {""} ;
      P05612_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05612_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05612_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05612_A719PrdNum = new String[] {""} ;
      P05612_n719PrdNum = new boolean[] {false} ;
      P05612_A5725RecLote = new String[] {""} ;
      P05612_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05612_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05612_A811RecLin = new short[1] ;
      P05612_A209BarPri = new String[] {""} ;
      P05612_A1273RecLinPro = new byte[1] ;
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
      AV15CCStkCanS = DecimalUtil.ZERO ;
      AV30RecLote = "" ;
      AV28PrdComCod = "" ;
      AV27PrdCant = DecimalUtil.ZERO ;
      AV26PrdCanAny = DecimalUtil.ZERO ;
      AV29PrdPreAct = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV11BarPri = "" ;
      AV9BarCodPar = "" ;
      A8635Ca_DiaHora = GXutil.resetTime( GXutil.nullDate() );
      A8638Ca_PrdNom = "" ;
      A8634Ca_Prdnum = "" ;
      A8637Ca_Cant = DecimalUtil.ZERO ;
      A8636Ca_Prdcant = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P05614_A396EmprCod = new String[] {""} ;
      P05614_A8634Ca_Prdnum = new String[] {""} ;
      P05614_A8635Ca_DiaHora = new java.util.Date[] {GXutil.nullDate()} ;
      P05614_A8637Ca_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05614_n8637Ca_Cant = new boolean[] {false} ;
      P05614_A8636Ca_Prdcant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05614_n8636Ca_Prdcant = new boolean[] {false} ;
      P05616_A396EmprCod = new String[] {""} ;
      P05616_A129BarCod = new int[1] ;
      P05616_A132BarCodReo = new byte[1] ;
      P05616_A130BarCodPar = new String[] {""} ;
      P05616_A2808RecLinMAL = new short[1] ;
      P05616_A718PrdNom = new String[] {""} ;
      P05616_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05616_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05616_n1378PrdCFin = new boolean[] {false} ;
      P05616_A719PrdNum = new String[] {""} ;
      P05616_n719PrdNum = new boolean[] {false} ;
      P05616_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05616_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05616_A4578LanyUsr = new String[] {""} ;
      P05616_n4578LanyUsr = new boolean[] {false} ;
      P05616_A209BarPri = new String[] {""} ;
      P05616_A5807LanyLote = new String[] {""} ;
      P05616_n5807LanyLote = new boolean[] {false} ;
      P05616_A1377RecNumAny = new byte[1] ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A5807LanyLote = "" ;
      AV31CCstkdsc = "" ;
      GXv_char3 = new String[1] ;
      P05618_A396EmprCod = new String[] {""} ;
      P05618_A8634Ca_Prdnum = new String[] {""} ;
      P05618_A8635Ca_DiaHora = new java.util.Date[] {GXutil.nullDate()} ;
      P05618_A8637Ca_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05618_n8637Ca_Cant = new boolean[] {false} ;
      P05618_A8636Ca_Prdcant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05618_n8636Ca_Prdcant = new boolean[] {false} ;
      P056110_A396EmprCod = new String[] {""} ;
      P056110_A129BarCod = new int[1] ;
      P056110_A132BarCodReo = new byte[1] ;
      P056110_A130BarCodPar = new String[] {""} ;
      P056110_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056110_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056110_A2495BarDosUsa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056110_n2495BarDosUsa = new boolean[] {false} ;
      P056110_A719PrdNum = new String[] {""} ;
      P056110_n719PrdNum = new boolean[] {false} ;
      P056110_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056110_A209BarPri = new String[] {""} ;
      P056110_A2494BarDosPro = new String[] {""} ;
      A2495BarDosUsa = DecimalUtil.ZERO ;
      A2494BarDosPro = "" ;
      P056111_A396EmprCod = new String[] {""} ;
      P056111_A688PrdComCod = new String[] {""} ;
      P056111_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056111_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056111_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056111_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056111_A719PrdNum = new String[] {""} ;
      P056111_n719PrdNum = new boolean[] {false} ;
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
      P056112_A396EmprCod = new String[] {""} ;
      P056112_A129BarCod = new int[1] ;
      P056112_A132BarCodReo = new byte[1] ;
      P056112_A130BarCodPar = new String[] {""} ;
      P056112_A2804RecLinMaq = new short[1] ;
      P056112_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV23MaqCod = "" ;
      P056113_A396EmprCod = new String[] {""} ;
      P056113_A602MaqCod = new String[] {""} ;
      P056113_A5100MaqCCoCod = new short[1] ;
      P056113_n5100MaqCCoCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls019__default(),
         new Object[] {
             new Object[] {
            P05612_A396EmprCod, P05612_A129BarCod, P05612_A132BarCodReo, P05612_A130BarCodPar, P05612_A2804RecLinMaq, P05612_A718PrdNom, P05612_A707PrdFacCon, P05612_A1797PrdCanAny, P05612_A686PrdCant, P05612_A719PrdNum,
            P05612_n719PrdNum, P05612_A5725RecLote, P05612_A724PrdPreAct, P05612_A726PrdPreMed, P05612_A811RecLin, P05612_A209BarPri, P05612_A1273RecLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            P05614_A396EmprCod, P05614_A8634Ca_Prdnum, P05614_A8635Ca_DiaHora, P05614_A8637Ca_Cant, P05614_n8637Ca_Cant, P05614_A8636Ca_Prdcant, P05614_n8636Ca_Prdcant
            }
            , new Object[] {
            }
            , new Object[] {
            P05616_A396EmprCod, P05616_A129BarCod, P05616_A132BarCodReo, P05616_A130BarCodPar, P05616_A2808RecLinMAL, P05616_A718PrdNom, P05616_A707PrdFacCon, P05616_A1378PrdCFin, P05616_n1378PrdCFin, P05616_A719PrdNum,
            P05616_A724PrdPreAct, P05616_A726PrdPreMed, P05616_A4578LanyUsr, P05616_n4578LanyUsr, P05616_A209BarPri, P05616_A5807LanyLote, P05616_n5807LanyLote, P05616_A1377RecNumAny
            }
            , new Object[] {
            }
            , new Object[] {
            P05618_A396EmprCod, P05618_A8634Ca_Prdnum, P05618_A8635Ca_DiaHora, P05618_A8637Ca_Cant, P05618_n8637Ca_Cant, P05618_A8636Ca_Prdcant, P05618_n8636Ca_Prdcant
            }
            , new Object[] {
            }
            , new Object[] {
            P056110_A396EmprCod, P056110_A129BarCod, P056110_A132BarCodReo, P056110_A130BarCodPar, P056110_A707PrdFacCon, P056110_A726PrdPreMed, P056110_A2495BarDosUsa, P056110_n2495BarDosUsa, P056110_A719PrdNum, P056110_A724PrdPreAct,
            P056110_A209BarPri, P056110_A2494BarDosPro
            }
            , new Object[] {
            P056111_A396EmprCod, P056111_A688PrdComCod, P056111_A690PrdComFN, P056111_A707PrdFacCon, P056111_A724PrdPreAct, P056111_A726PrdPreMed, P056111_A719PrdNum
            }
            , new Object[] {
            P056112_A396EmprCod, P056112_A129BarCod, P056112_A132BarCodReo, P056112_A130BarCodPar, P056112_A2804RecLinMaq, P056112_A602MaqCod
            }
            , new Object[] {
            P056113_A396EmprCod, P056113_A602MaqCod, P056113_A5100MaqCCoCod, P056113_n5100MaqCCoCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13CC_AlmCod ;
   private byte AV22FlagPreMed ;
   private byte AV18CieLote ;
   private byte AV17CieCCo ;
   private byte AV19Eliot ;
   private byte AV24Nalmcc ;
   private byte GXt_int1 ;
   private byte A1273RecLinPro ;
   private byte AV10BarCodReo ;
   private byte A1377RecNumAny ;
   private byte GXv_int2[] ;
   private byte GXv_int21[] ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV37Maqccocod ;
   private short Gx_err ;
   private short A2808RecLinMAL ;
   private short GXv_int22[] ;
   private short GXv_int16[] ;
   private short A5100MaqCCoCod ;
   private int A129BarCod ;
   private int AV8BarCod ;
   private int GX_INS1182 ;
   private int GXv_int12[] ;
   private int GXv_int10[] ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV15CCStkCanS ;
   private java.math.BigDecimal AV27PrdCant ;
   private java.math.BigDecimal AV26PrdCanAny ;
   private java.math.BigDecimal AV29PrdPreAct ;
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
   private String AV16CCStkUsu ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A5725RecLote ;
   private String A209BarPri ;
   private String W396EmprCod ;
   private String AV30RecLote ;
   private String AV28PrdComCod ;
   private String Gx_msg ;
   private String AV11BarPri ;
   private String AV9BarCodPar ;
   private String A8638Ca_PrdNom ;
   private String A8634Ca_Prdnum ;
   private String Gx_emsg ;
   private String A4578LanyUsr ;
   private String A5807LanyLote ;
   private String AV31CCstkdsc ;
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
   private String AV23MaqCod ;
   private java.util.Date AV12Ca_diahora ;
   private java.util.Date A8635Ca_DiaHora ;
   private java.util.Date GXv_dtime20[] ;
   private java.util.Date AV20Fecha ;
   private java.util.Date GXv_date19[] ;
   private boolean brk5612 ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n8638Ca_PrdNom ;
   private boolean n8637Ca_Cant ;
   private boolean n8636Ca_Prdcant ;
   private boolean brk5616 ;
   private boolean n1378PrdCFin ;
   private boolean n4578LanyUsr ;
   private boolean n5807LanyLote ;
   private boolean brk56110 ;
   private boolean n2495BarDosUsa ;
   private boolean n5100MaqCCoCod ;
   private java.util.Date[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private java.util.Date[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05612_A396EmprCod ;
   private int[] P05612_A129BarCod ;
   private byte[] P05612_A132BarCodReo ;
   private String[] P05612_A130BarCodPar ;
   private short[] P05612_A2804RecLinMaq ;
   private String[] P05612_A718PrdNom ;
   private java.math.BigDecimal[] P05612_A707PrdFacCon ;
   private java.math.BigDecimal[] P05612_A1797PrdCanAny ;
   private java.math.BigDecimal[] P05612_A686PrdCant ;
   private String[] P05612_A719PrdNum ;
   private boolean[] P05612_n719PrdNum ;
   private String[] P05612_A5725RecLote ;
   private java.math.BigDecimal[] P05612_A724PrdPreAct ;
   private java.math.BigDecimal[] P05612_A726PrdPreMed ;
   private short[] P05612_A811RecLin ;
   private String[] P05612_A209BarPri ;
   private byte[] P05612_A1273RecLinPro ;
   private String[] P05614_A396EmprCod ;
   private String[] P05614_A8634Ca_Prdnum ;
   private java.util.Date[] P05614_A8635Ca_DiaHora ;
   private java.math.BigDecimal[] P05614_A8637Ca_Cant ;
   private boolean[] P05614_n8637Ca_Cant ;
   private java.math.BigDecimal[] P05614_A8636Ca_Prdcant ;
   private boolean[] P05614_n8636Ca_Prdcant ;
   private String[] P05616_A396EmprCod ;
   private int[] P05616_A129BarCod ;
   private byte[] P05616_A132BarCodReo ;
   private String[] P05616_A130BarCodPar ;
   private short[] P05616_A2808RecLinMAL ;
   private String[] P05616_A718PrdNom ;
   private java.math.BigDecimal[] P05616_A707PrdFacCon ;
   private java.math.BigDecimal[] P05616_A1378PrdCFin ;
   private boolean[] P05616_n1378PrdCFin ;
   private String[] P05616_A719PrdNum ;
   private boolean[] P05616_n719PrdNum ;
   private java.math.BigDecimal[] P05616_A724PrdPreAct ;
   private java.math.BigDecimal[] P05616_A726PrdPreMed ;
   private String[] P05616_A4578LanyUsr ;
   private boolean[] P05616_n4578LanyUsr ;
   private String[] P05616_A209BarPri ;
   private String[] P05616_A5807LanyLote ;
   private boolean[] P05616_n5807LanyLote ;
   private byte[] P05616_A1377RecNumAny ;
   private String[] P05618_A396EmprCod ;
   private String[] P05618_A8634Ca_Prdnum ;
   private java.util.Date[] P05618_A8635Ca_DiaHora ;
   private java.math.BigDecimal[] P05618_A8637Ca_Cant ;
   private boolean[] P05618_n8637Ca_Cant ;
   private java.math.BigDecimal[] P05618_A8636Ca_Prdcant ;
   private boolean[] P05618_n8636Ca_Prdcant ;
   private String[] P056110_A396EmprCod ;
   private int[] P056110_A129BarCod ;
   private byte[] P056110_A132BarCodReo ;
   private String[] P056110_A130BarCodPar ;
   private java.math.BigDecimal[] P056110_A707PrdFacCon ;
   private java.math.BigDecimal[] P056110_A726PrdPreMed ;
   private java.math.BigDecimal[] P056110_A2495BarDosUsa ;
   private boolean[] P056110_n2495BarDosUsa ;
   private String[] P056110_A719PrdNum ;
   private boolean[] P056110_n719PrdNum ;
   private java.math.BigDecimal[] P056110_A724PrdPreAct ;
   private String[] P056110_A209BarPri ;
   private String[] P056110_A2494BarDosPro ;
   private String[] P056111_A396EmprCod ;
   private String[] P056111_A688PrdComCod ;
   private java.math.BigDecimal[] P056111_A690PrdComFN ;
   private java.math.BigDecimal[] P056111_A707PrdFacCon ;
   private java.math.BigDecimal[] P056111_A724PrdPreAct ;
   private java.math.BigDecimal[] P056111_A726PrdPreMed ;
   private String[] P056111_A719PrdNum ;
   private boolean[] P056111_n719PrdNum ;
   private String[] P056112_A396EmprCod ;
   private int[] P056112_A129BarCod ;
   private byte[] P056112_A132BarCodReo ;
   private String[] P056112_A130BarCodPar ;
   private short[] P056112_A2804RecLinMaq ;
   private String[] P056112_A602MaqCod ;
   private String[] P056113_A396EmprCod ;
   private String[] P056113_A602MaqCod ;
   private short[] P056113_A5100MaqCCoCod ;
   private boolean[] P056113_n5100MaqCCoCod ;
}

final  class pcls019__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05612", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdNom, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.PrdNum, T1.RecLote, T2.PrdPreAct, T2.PrdPreMed, T1.RecLin, T3.BarPri, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05613", "INSERT INTO TXPCONSC(EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Prdcant, Ca_Cant, Ca_PrdNom) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P05614", "SELECT EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Cant, Ca_Prdcant FROM TXPCONSC WHERE EmprCod = ? and Ca_Prdnum = ? and Ca_DiaHora = ? ORDER BY EmprCod, Ca_Prdnum, Ca_DiaHora ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05615", "UPDATE TXPCONSC SET Ca_Cant=?, Ca_Prdcant=?  WHERE EmprCod = ? AND Ca_Prdnum = ? AND Ca_DiaHora = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P05616", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T2.PrdNom, T2.PrdFacCon, T1.PrdCFin, T1.PrdNum, T2.PrdPreAct, T2.PrdPreMed, T1.LanyUsr, T3.BarPri, T1.LanyLote, T1.RecNumAny FROM ((TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05617", "INSERT INTO TXPCONSC(EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Prdcant, Ca_Cant, Ca_PrdNom) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P05618", "SELECT EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Cant, Ca_Prdcant FROM TXPCONSC WHERE EmprCod = ? and Ca_Prdnum = ? and Ca_DiaHora = ? ORDER BY EmprCod, Ca_Prdnum, Ca_DiaHora ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05619", "UPDATE TXPCONSC SET Ca_Cant=?, Ca_Prdcant=?  WHERE EmprCod = ? AND Ca_Prdnum = ? AND Ca_DiaHora = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P056110", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.PrdFacCon, T2.PrdPreMed, T1.BarDosUsa, T1.PrdNum, T2.PrdPreAct, T3.BarPri, T1.BarDosPro FROM ((TXPBARDOS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056111", "SELECT T1.EmprCod, T1.PrdComCod, T1.PrdComFN, T2.PrdFacCon, T2.PrdPreAct, T2.PrdPreMed, T1.PrdNum FROM (TXPLPRDCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056112", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056113", "SELECT EmprCod, MaqCod, MaqCCoCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 8 :
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
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 11 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 6);
               stmt.setDateTime(5, (java.util.Date)parms[6], false);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 6);
               stmt.setDateTime(5, (java.util.Date)parms[6], false);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

