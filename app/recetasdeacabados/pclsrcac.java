package app.recetasdeacabados ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclsrcac extends GXProcedure
{
   public pclsrcac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclsrcac.class ), "" );
   }

   public pclsrcac( int remoteHandle ,
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
      pclsrcac.this.aP9 = new java.util.Date[] {GXutil.nullDate()};
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
      pclsrcac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclsrcac.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pclsrcac.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pclsrcac.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pclsrcac.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pclsrcac.this.AV10CCStkUsu = aP5[0];
      this.aP5 = aP5;
      pclsrcac.this.AV26Ca_DiaHora = aP6[0];
      this.aP6 = aP6;
      pclsrcac.this.AV28CC_almcod = aP7[0];
      this.aP7 = aP7;
      pclsrcac.this.AV29Tipo = aP8[0];
      this.aP8 = aP8;
      pclsrcac.this.AV9Fecha = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30Text_c = httpContext.getMessage( "Cierre Tintura", "") ;
      if ( GXutil.strcmp(AV29Tipo, httpContext.getMessage( "A", "")) == 0 )
      {
         AV30Text_c = httpContext.getMessage( "Cierre Acabado", "") ;
      }
      GXt_int1 = AV25Nclec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      pclsrcac.this.GXt_int1 = GXv_int2[0] ;
      AV25Nclec = GXt_int1 ;
      AV19FlagPreMed = (byte)(0) ;
      GXv_int2[0] = AV19FlagPreMed ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int2) ;
      pclsrcac.this.AV19FlagPreMed = GXv_int2[0] ;
      GXt_int1 = AV20CieLote ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIELOT", ""), GXv_int2) ;
      pclsrcac.this.GXt_int1 = GXv_int2[0] ;
      AV20CieLote = GXt_int1 ;
      GXt_int1 = AV22CieCCo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIECCO", ""), GXv_int2) ;
      pclsrcac.this.GXt_int1 = GXv_int2[0] ;
      AV22CieCCo = GXt_int1 ;
      GXt_int1 = AV27Eliot ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int2) ;
      pclsrcac.this.GXt_int1 = GXv_int2[0] ;
      AV27Eliot = GXt_int1 ;
      /* Using cursor P0A6K2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA6K2 = false ;
         A718PrdNom = P0A6K2_A718PrdNom[0] ;
         A707PrdFacCon = P0A6K2_A707PrdFacCon[0] ;
         A1797PrdCanAny = P0A6K2_A1797PrdCanAny[0] ;
         A686PrdCant = P0A6K2_A686PrdCant[0] ;
         A719PrdNum = P0A6K2_A719PrdNum[0] ;
         n719PrdNum = P0A6K2_n719PrdNum[0] ;
         A5725RecLote = P0A6K2_A5725RecLote[0] ;
         A724PrdPreAct = P0A6K2_A724PrdPreAct[0] ;
         A726PrdPreMed = P0A6K2_A726PrdPreMed[0] ;
         A209BarPri = P0A6K2_A209BarPri[0] ;
         A1273RecLinPro = P0A6K2_A1273RecLinPro[0] ;
         A811RecLin = P0A6K2_A811RecLin[0] ;
         A718PrdNom = P0A6K2_A718PrdNom[0] ;
         A707PrdFacCon = P0A6K2_A707PrdFacCon[0] ;
         A724PrdPreAct = P0A6K2_A724PrdPreAct[0] ;
         A726PrdPreMed = P0A6K2_A726PrdPreMed[0] ;
         A209BarPri = P0A6K2_A209BarPri[0] ;
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
         AV8CCStkCanS = DecimalUtil.doubleToDec(0) ;
         AV21RecLote = A5725RecLote ;
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
         {
            AV11PrdComCod = A719PrdNum ;
            AV12PrdCant = DecimalUtil.doubleToDec(0) ;
            AV13PrdCanAny = DecimalUtil.doubleToDec(0) ;
         }
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A6K2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A6K2_A129BarCod[0] == A129BarCod ) && ( P0A6K2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0A6K2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P0A6K2_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P0A6K2_A719PrdNum[0], A719PrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brkA6K2 = false ;
            A707PrdFacCon = P0A6K2_A707PrdFacCon[0] ;
            A1797PrdCanAny = P0A6K2_A1797PrdCanAny[0] ;
            A686PrdCant = P0A6K2_A686PrdCant[0] ;
            A1273RecLinPro = P0A6K2_A1273RecLinPro[0] ;
            A811RecLin = P0A6K2_A811RecLin[0] ;
            A707PrdFacCon = P0A6K2_A707PrdFacCon[0] ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
            {
               AV8CCStkCanS = AV8CCStkCanS.add((((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon))) ;
            }
            else
            {
               AV12PrdCant = AV12PrdCant.add(A686PrdCant) ;
               AV13PrdCanAny = AV13PrdCanAny.add(A1797PrdCanAny) ;
            }
            brkA6K2 = true ;
            pr_default.readNext(0);
         }
         AV14PrdPreAct = A724PrdPreAct ;
         if ( AV19FlagPreMed == 1 )
         {
            AV14PrdPreAct = A726PrdPreMed ;
         }
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
         {
            if ( AV20CieLote == 0 )
            {
               if ( AV22CieCCo == 0 )
               {
                  GXv_char3[0] = A396EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal6[0] = AV8CCStkCanS ;
                  GXv_char7[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char8[0] = A209BarPri ;
                  GXv_decimal9[0] = AV14PrdPreAct ;
                  GXv_int10[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char11[0] = A130BarCodPar ;
                  GXv_int12[0] = 0 ;
                  GXv_char13[0] = " " ;
                  GXv_char14[0] = AV10CCStkUsu ;
                  GXv_char15[0] = AV30Text_c ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV9Fecha ;
                  new app.pnewccs(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_char7, GXv_char8, GXv_decimal9, GXv_int10, GXv_int2, GXv_char11, GXv_int12, GXv_char13, GXv_char14, GXv_char15, GXv_int16, GXv_decimal17, GXv_decimal18, GXv_date19) ;
                  pclsrcac.this.A396EmprCod = GXv_char3[0] ;
                  pclsrcac.this.A719PrdNum = GXv_char4[0] ;
                  pclsrcac.this.AV8CCStkCanS = GXv_decimal6[0] ;
                  pclsrcac.this.A209BarPri = GXv_char8[0] ;
                  pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
                  pclsrcac.this.A129BarCod = GXv_int10[0] ;
                  pclsrcac.this.A132BarCodReo = GXv_int2[0] ;
                  pclsrcac.this.A130BarCodPar = GXv_char11[0] ;
                  pclsrcac.this.AV10CCStkUsu = GXv_char14[0] ;
                  pclsrcac.this.AV30Text_c = GXv_char15[0] ;
                  pclsrcac.this.AV9Fecha = GXv_date19[0] ;
                  if ( AV27Eliot == 1 )
                  {
                     GXv_char15[0] = A396EmprCod ;
                     GXv_char14[0] = A719PrdNum ;
                     GXv_decimal18[0] = AV8CCStkCanS ;
                     GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                     GXv_decimal17[0] = AV14PrdPreAct ;
                     GXv_char11[0] = AV10CCStkUsu ;
                     GXv_char8[0] = AV30Text_c ;
                     GXv_dtime20[0] = AV26Ca_DiaHora ;
                     GXv_int2[0] = AV28CC_almcod ;
                     GXv_int12[0] = A129BarCod ;
                     GXv_int21[0] = A132BarCodReo ;
                     GXv_char7[0] = A130BarCodPar ;
                     new app.pccalm8(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_char13, GXv_decimal17, GXv_char11, GXv_char8, GXv_dtime20, GXv_int2, GXv_int12, GXv_int21, GXv_char7) ;
                     pclsrcac.this.A396EmprCod = GXv_char15[0] ;
                     pclsrcac.this.A719PrdNum = GXv_char14[0] ;
                     pclsrcac.this.AV8CCStkCanS = GXv_decimal18[0] ;
                     pclsrcac.this.AV14PrdPreAct = GXv_decimal17[0] ;
                     pclsrcac.this.AV10CCStkUsu = GXv_char11[0] ;
                     pclsrcac.this.AV30Text_c = GXv_char8[0] ;
                     pclsrcac.this.AV26Ca_DiaHora = GXv_dtime20[0] ;
                     pclsrcac.this.AV28CC_almcod = GXv_int2[0] ;
                     pclsrcac.this.A129BarCod = GXv_int12[0] ;
                     pclsrcac.this.A132BarCodReo = GXv_int21[0] ;
                     pclsrcac.this.A130BarCodPar = GXv_char7[0] ;
                  }
               }
               else
               {
                  GXv_char15[0] = A396EmprCod ;
                  GXv_char14[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV8CCStkCanS ;
                  GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char11[0] = A209BarPri ;
                  GXv_decimal9[0] = AV14PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int21[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char7[0] = " " ;
                  GXv_char4[0] = AV10CCStkUsu ;
                  GXv_char3[0] = AV30Text_c ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV9Fecha ;
                  GXv_int22[0] = AV31MaqCCoCod ;
                  new app.pnewcc3(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int21, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int16, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int22) ;
                  pclsrcac.this.A396EmprCod = GXv_char15[0] ;
                  pclsrcac.this.A719PrdNum = GXv_char14[0] ;
                  pclsrcac.this.AV8CCStkCanS = GXv_decimal17[0] ;
                  pclsrcac.this.A209BarPri = GXv_char11[0] ;
                  pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
                  pclsrcac.this.A129BarCod = GXv_int12[0] ;
                  pclsrcac.this.A132BarCodReo = GXv_int21[0] ;
                  pclsrcac.this.A130BarCodPar = GXv_char8[0] ;
                  pclsrcac.this.AV10CCStkUsu = GXv_char4[0] ;
                  pclsrcac.this.AV30Text_c = GXv_char3[0] ;
                  pclsrcac.this.AV9Fecha = GXv_date19[0] ;
                  pclsrcac.this.AV31MaqCCoCod = GXv_int22[0] ;
               }
            }
            else
            {
               if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) != 0 )
               {
                  GXv_char15[0] = A396EmprCod ;
                  GXv_char14[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV8CCStkCanS ;
                  GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char11[0] = A209BarPri ;
                  GXv_decimal9[0] = AV14PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int21[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char7[0] = " " ;
                  GXv_char4[0] = AV10CCStkUsu ;
                  GXv_char3[0] = AV30Text_c ;
                  GXv_int22[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV9Fecha ;
                  GXv_char23[0] = AV21RecLote ;
                  new app.pnewccsl(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int21, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char23) ;
                  pclsrcac.this.A396EmprCod = GXv_char15[0] ;
                  pclsrcac.this.A719PrdNum = GXv_char14[0] ;
                  pclsrcac.this.AV8CCStkCanS = GXv_decimal17[0] ;
                  pclsrcac.this.A209BarPri = GXv_char11[0] ;
                  pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
                  pclsrcac.this.A129BarCod = GXv_int12[0] ;
                  pclsrcac.this.A132BarCodReo = GXv_int21[0] ;
                  pclsrcac.this.A130BarCodPar = GXv_char8[0] ;
                  pclsrcac.this.AV10CCStkUsu = GXv_char4[0] ;
                  pclsrcac.this.AV30Text_c = GXv_char3[0] ;
                  pclsrcac.this.AV9Fecha = GXv_date19[0] ;
                  pclsrcac.this.AV21RecLote = GXv_char23[0] ;
               }
            }
         }
         else
         {
            AV15BarPri = A209BarPri ;
            AV16BarCod = A129BarCod ;
            AV17BarCodReo = A132BarCodReo ;
            AV18BarCodPar = A130BarCodPar ;
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
         /*
            INSERT RECORD ON TABLE TXPCONSC

         */
         W396EmprCod = A396EmprCod ;
         A8635Ca_DiaHora = AV26Ca_DiaHora ;
         A8638Ca_PrdNom = A718PrdNom ;
         n8638Ca_PrdNom = false ;
         A8634Ca_Prdnum = A719PrdNum ;
         A8637Ca_Cant = AV8CCStkCanS ;
         n8637Ca_Cant = false ;
         A8636Ca_Prdcant = AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
         n8636Ca_Prdcant = false ;
         /* Using cursor P0A6K3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8638Ca_PrdNom), A8638Ca_PrdNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n8636Ca_Prdcant = false ;
            n8637Ca_Cant = false ;
            /* Optimized UPDATE. */
            /* Using cursor P0A6K4 */
            pr_default.execute(2, new Object[] {AV8CCStkCanS, AV8CCStkCanS, A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
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
         if ( ! brkA6K2 )
         {
            brkA6K2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /* Using cursor P0A6K5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA6K6 = false ;
         A2808RecLinMAL = P0A6K5_A2808RecLinMAL[0] ;
         A718PrdNom = P0A6K5_A718PrdNom[0] ;
         A707PrdFacCon = P0A6K5_A707PrdFacCon[0] ;
         A1378PrdCFin = P0A6K5_A1378PrdCFin[0] ;
         n1378PrdCFin = P0A6K5_n1378PrdCFin[0] ;
         A719PrdNum = P0A6K5_A719PrdNum[0] ;
         n719PrdNum = P0A6K5_n719PrdNum[0] ;
         A724PrdPreAct = P0A6K5_A724PrdPreAct[0] ;
         A726PrdPreMed = P0A6K5_A726PrdPreMed[0] ;
         A209BarPri = P0A6K5_A209BarPri[0] ;
         A5807LanyLote = P0A6K5_A5807LanyLote[0] ;
         n5807LanyLote = P0A6K5_n5807LanyLote[0] ;
         A1377RecNumAny = P0A6K5_A1377RecNumAny[0] ;
         A718PrdNom = P0A6K5_A718PrdNom[0] ;
         A707PrdFacCon = P0A6K5_A707PrdFacCon[0] ;
         A724PrdPreAct = P0A6K5_A724PrdPreAct[0] ;
         A726PrdPreMed = P0A6K5_A726PrdPreMed[0] ;
         A209BarPri = P0A6K5_A209BarPri[0] ;
         W396EmprCod = A396EmprCod ;
         AV8CCStkCanS = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A6K5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A6K5_A129BarCod[0] == A129BarCod ) && ( P0A6K5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0A6K5_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P0A6K5_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(P0A6K5_A719PrdNum[0], A719PrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brkA6K6 = false ;
            A707PrdFacCon = P0A6K5_A707PrdFacCon[0] ;
            A1378PrdCFin = P0A6K5_A1378PrdCFin[0] ;
            n1378PrdCFin = P0A6K5_n1378PrdCFin[0] ;
            A1377RecNumAny = P0A6K5_A1377RecNumAny[0] ;
            A707PrdFacCon = P0A6K5_A707PrdFacCon[0] ;
            AV8CCStkCanS = AV8CCStkCanS.add((A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon)) ;
            brkA6K6 = true ;
            pr_default.readNext(3);
         }
         AV14PrdPreAct = A724PrdPreAct ;
         if ( AV19FlagPreMed == 1 )
         {
            AV14PrdPreAct = A726PrdPreMed ;
         }
         if ( AV20CieLote == 0 )
         {
            if ( AV22CieCCo == 0 )
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV8CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV14PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV10CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Añadidas Pc Ind.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV9Fecha ;
               new app.pnewccs(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
               pclsrcac.this.A396EmprCod = GXv_char23[0] ;
               pclsrcac.this.A719PrdNum = GXv_char15[0] ;
               pclsrcac.this.AV8CCStkCanS = GXv_decimal17[0] ;
               pclsrcac.this.A209BarPri = GXv_char13[0] ;
               pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
               pclsrcac.this.A129BarCod = GXv_int12[0] ;
               pclsrcac.this.A132BarCodReo = GXv_int21[0] ;
               pclsrcac.this.A130BarCodPar = GXv_char11[0] ;
               pclsrcac.this.AV10CCStkUsu = GXv_char7[0] ;
               pclsrcac.this.AV9Fecha = GXv_date19[0] ;
               if ( AV27Eliot == 1 )
               {
                  GXv_char23[0] = A396EmprCod ;
                  GXv_char15[0] = A719PrdNum ;
                  GXv_decimal18[0] = AV8CCStkCanS ;
                  GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                  GXv_decimal17[0] = AV14PrdPreAct ;
                  GXv_char13[0] = AV10CCStkUsu ;
                  GXv_char11[0] = httpContext.getMessage( "Cierre Tinturas Añadidas Pc Ind.", "") ;
                  GXv_dtime20[0] = AV26Ca_DiaHora ;
                  GXv_int21[0] = AV28CC_almcod ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  new app.pccalm8(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
                  pclsrcac.this.A396EmprCod = GXv_char23[0] ;
                  pclsrcac.this.A719PrdNum = GXv_char15[0] ;
                  pclsrcac.this.AV8CCStkCanS = GXv_decimal18[0] ;
                  pclsrcac.this.AV14PrdPreAct = GXv_decimal17[0] ;
                  pclsrcac.this.AV10CCStkUsu = GXv_char13[0] ;
                  pclsrcac.this.AV26Ca_DiaHora = GXv_dtime20[0] ;
                  pclsrcac.this.AV28CC_almcod = GXv_int21[0] ;
                  pclsrcac.this.A129BarCod = GXv_int12[0] ;
                  pclsrcac.this.A132BarCodReo = GXv_int2[0] ;
                  pclsrcac.this.A130BarCodPar = GXv_char8[0] ;
               }
            }
            else
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV8CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV14PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV10CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Añadidas Pc Ind.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV9Fecha ;
               GXv_int16[0] = AV31MaqCCoCod ;
               new app.pnewcc3(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
               pclsrcac.this.A396EmprCod = GXv_char23[0] ;
               pclsrcac.this.A719PrdNum = GXv_char15[0] ;
               pclsrcac.this.AV8CCStkCanS = GXv_decimal17[0] ;
               pclsrcac.this.A209BarPri = GXv_char13[0] ;
               pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
               pclsrcac.this.A129BarCod = GXv_int12[0] ;
               pclsrcac.this.A132BarCodReo = GXv_int21[0] ;
               pclsrcac.this.A130BarCodPar = GXv_char11[0] ;
               pclsrcac.this.AV10CCStkUsu = GXv_char7[0] ;
               pclsrcac.this.AV9Fecha = GXv_date19[0] ;
               pclsrcac.this.AV31MaqCCoCod = GXv_int16[0] ;
            }
         }
         else
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV8CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = A209BarPri ;
            GXv_decimal9[0] = AV14PrdPreAct ;
            GXv_int12[0] = A129BarCod ;
            GXv_int21[0] = A132BarCodReo ;
            GXv_char11[0] = A130BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV10CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Añadidas Pc Ind.", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV9Fecha ;
            GXv_char3[0] = A5807LanyLote ;
            new app.pnewccsl(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char3) ;
            pclsrcac.this.A396EmprCod = GXv_char23[0] ;
            pclsrcac.this.A719PrdNum = GXv_char15[0] ;
            pclsrcac.this.AV8CCStkCanS = GXv_decimal17[0] ;
            pclsrcac.this.A209BarPri = GXv_char13[0] ;
            pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
            pclsrcac.this.A129BarCod = GXv_int12[0] ;
            pclsrcac.this.A132BarCodReo = GXv_int21[0] ;
            pclsrcac.this.A130BarCodPar = GXv_char11[0] ;
            pclsrcac.this.AV10CCStkUsu = GXv_char7[0] ;
            pclsrcac.this.AV9Fecha = GXv_date19[0] ;
            pclsrcac.this.A5807LanyLote = GXv_char3[0] ;
         }
         /*
            INSERT RECORD ON TABLE TXPCONSC

         */
         W396EmprCod = A396EmprCod ;
         A8635Ca_DiaHora = AV26Ca_DiaHora ;
         A8638Ca_PrdNom = A718PrdNom ;
         n8638Ca_PrdNom = false ;
         A8634Ca_Prdnum = A719PrdNum ;
         A8637Ca_Cant = AV8CCStkCanS ;
         n8637Ca_Cant = false ;
         A8636Ca_Prdcant = AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
         n8636Ca_Prdcant = false ;
         /* Using cursor P0A6K6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8638Ca_PrdNom), A8638Ca_PrdNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n8636Ca_Prdcant = false ;
            n8637Ca_Cant = false ;
            /* Optimized UPDATE. */
            /* Using cursor P0A6K7 */
            pr_default.execute(5, new Object[] {AV8CCStkCanS, AV8CCStkCanS, A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
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
         if ( ! brkA6K6 )
         {
            brkA6K6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
      /* Using cursor P0A6K8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkA6K10 = false ;
         A707PrdFacCon = P0A6K8_A707PrdFacCon[0] ;
         A726PrdPreMed = P0A6K8_A726PrdPreMed[0] ;
         A2495BarDosUsa = P0A6K8_A2495BarDosUsa[0] ;
         n2495BarDosUsa = P0A6K8_n2495BarDosUsa[0] ;
         A719PrdNum = P0A6K8_A719PrdNum[0] ;
         n719PrdNum = P0A6K8_n719PrdNum[0] ;
         A724PrdPreAct = P0A6K8_A724PrdPreAct[0] ;
         A209BarPri = P0A6K8_A209BarPri[0] ;
         A2494BarDosPro = P0A6K8_A2494BarDosPro[0] ;
         A707PrdFacCon = P0A6K8_A707PrdFacCon[0] ;
         A726PrdPreMed = P0A6K8_A726PrdPreMed[0] ;
         A724PrdPreAct = P0A6K8_A724PrdPreAct[0] ;
         A209BarPri = P0A6K8_A209BarPri[0] ;
         if ( A129BarCod != 99999999 )
         {
            AV8CCStkCanS = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0A6K8_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A6K8_A129BarCod[0] == A129BarCod ) && ( P0A6K8_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0A6K8_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               if ( ! ( ( GXutil.strcmp(P0A6K8_A719PrdNum[0], A719PrdNum) == 0 ) ) )
               {
                  if (true) break;
               }
               brkA6K10 = false ;
               A707PrdFacCon = P0A6K8_A707PrdFacCon[0] ;
               A726PrdPreMed = P0A6K8_A726PrdPreMed[0] ;
               A2495BarDosUsa = P0A6K8_A2495BarDosUsa[0] ;
               n2495BarDosUsa = P0A6K8_n2495BarDosUsa[0] ;
               A2494BarDosPro = P0A6K8_A2494BarDosPro[0] ;
               A707PrdFacCon = P0A6K8_A707PrdFacCon[0] ;
               A726PrdPreMed = P0A6K8_A726PrdPreMed[0] ;
               AV8CCStkCanS = AV8CCStkCanS.add((A2495BarDosUsa.multiply(A726PrdPreMed).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               brkA6K10 = true ;
               pr_default.readNext(6);
            }
            AV14PrdPreAct = A724PrdPreAct ;
            if ( AV19FlagPreMed == 1 )
            {
               AV14PrdPreAct = A726PrdPreMed ;
            }
            if ( AV22CieCCo == 0 )
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV8CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV14PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV10CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Dosificadora.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV9Fecha ;
               new app.pnewccs(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
               pclsrcac.this.A396EmprCod = GXv_char23[0] ;
               pclsrcac.this.A719PrdNum = GXv_char15[0] ;
               pclsrcac.this.AV8CCStkCanS = GXv_decimal17[0] ;
               pclsrcac.this.A209BarPri = GXv_char13[0] ;
               pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
               pclsrcac.this.A129BarCod = GXv_int12[0] ;
               pclsrcac.this.A132BarCodReo = GXv_int21[0] ;
               pclsrcac.this.A130BarCodPar = GXv_char11[0] ;
               pclsrcac.this.AV10CCStkUsu = GXv_char7[0] ;
               pclsrcac.this.AV9Fecha = GXv_date19[0] ;
               if ( AV27Eliot == 1 )
               {
                  GXv_char23[0] = A396EmprCod ;
                  GXv_char15[0] = A719PrdNum ;
                  GXv_decimal18[0] = AV8CCStkCanS ;
                  GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                  GXv_decimal17[0] = AV14PrdPreAct ;
                  GXv_char13[0] = AV10CCStkUsu ;
                  GXv_char11[0] = httpContext.getMessage( "Cierre Tinturas Dosificadora.", "") ;
                  GXv_dtime20[0] = AV26Ca_DiaHora ;
                  GXv_int21[0] = AV28CC_almcod ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  new app.pccalm8(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
                  pclsrcac.this.A396EmprCod = GXv_char23[0] ;
                  pclsrcac.this.A719PrdNum = GXv_char15[0] ;
                  pclsrcac.this.AV8CCStkCanS = GXv_decimal18[0] ;
                  pclsrcac.this.AV14PrdPreAct = GXv_decimal17[0] ;
                  pclsrcac.this.AV10CCStkUsu = GXv_char13[0] ;
                  pclsrcac.this.AV26Ca_DiaHora = GXv_dtime20[0] ;
                  pclsrcac.this.AV28CC_almcod = GXv_int21[0] ;
                  pclsrcac.this.A129BarCod = GXv_int12[0] ;
                  pclsrcac.this.A132BarCodReo = GXv_int2[0] ;
                  pclsrcac.this.A130BarCodPar = GXv_char8[0] ;
               }
            }
            else
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV8CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV14PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int21[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV10CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Dosificadora.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV9Fecha ;
               GXv_int16[0] = AV31MaqCCoCod ;
               new app.pnewcc3(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
               pclsrcac.this.A396EmprCod = GXv_char23[0] ;
               pclsrcac.this.A719PrdNum = GXv_char15[0] ;
               pclsrcac.this.AV8CCStkCanS = GXv_decimal17[0] ;
               pclsrcac.this.A209BarPri = GXv_char13[0] ;
               pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
               pclsrcac.this.A129BarCod = GXv_int12[0] ;
               pclsrcac.this.A132BarCodReo = GXv_int21[0] ;
               pclsrcac.this.A130BarCodPar = GXv_char11[0] ;
               pclsrcac.this.AV10CCStkUsu = GXv_char7[0] ;
               pclsrcac.this.AV9Fecha = GXv_date19[0] ;
               pclsrcac.this.AV31MaqCCoCod = GXv_int16[0] ;
            }
         }
         if ( ! brkA6K10 )
         {
            brkA6K10 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
      if ( AV25Nclec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recetasdeacabados.pclsrcac");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUES' Routine */
      returnInSub = false ;
      /* Using cursor P0A6K9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV11PrdComCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A688PrdComCod = P0A6K9_A688PrdComCod[0] ;
         A690PrdComFN = P0A6K9_A690PrdComFN[0] ;
         A707PrdFacCon = P0A6K9_A707PrdFacCon[0] ;
         A724PrdPreAct = P0A6K9_A724PrdPreAct[0] ;
         A726PrdPreMed = P0A6K9_A726PrdPreMed[0] ;
         A719PrdNum = P0A6K9_A719PrdNum[0] ;
         n719PrdNum = P0A6K9_n719PrdNum[0] ;
         A707PrdFacCon = P0A6K9_A707PrdFacCon[0] ;
         A724PrdPreAct = P0A6K9_A724PrdPreAct[0] ;
         A726PrdPreMed = P0A6K9_A726PrdPreMed[0] ;
         AV8CCStkCanS = ((AV12PrdCant.add(AV13PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         AV14PrdPreAct = A724PrdPreAct ;
         if ( AV19FlagPreMed == 1 )
         {
            AV14PrdPreAct = A726PrdPreMed ;
         }
         if ( AV22CieCCo == 0 )
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV8CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = AV15BarPri ;
            GXv_decimal9[0] = AV14PrdPreAct ;
            GXv_int12[0] = AV16BarCod ;
            GXv_int21[0] = AV17BarCodReo ;
            GXv_char11[0] = AV18BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV10CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas desglose compuesto", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV9Fecha ;
            new app.pnewccs(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
            pclsrcac.this.A396EmprCod = GXv_char23[0] ;
            pclsrcac.this.A719PrdNum = GXv_char15[0] ;
            pclsrcac.this.AV8CCStkCanS = GXv_decimal17[0] ;
            pclsrcac.this.AV15BarPri = GXv_char13[0] ;
            pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
            pclsrcac.this.AV16BarCod = GXv_int12[0] ;
            pclsrcac.this.AV17BarCodReo = GXv_int21[0] ;
            pclsrcac.this.AV18BarCodPar = GXv_char11[0] ;
            pclsrcac.this.AV10CCStkUsu = GXv_char7[0] ;
            pclsrcac.this.AV9Fecha = GXv_date19[0] ;
            if ( AV27Eliot == 1 )
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = AV8CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_decimal17[0] = AV14PrdPreAct ;
               GXv_char13[0] = AV10CCStkUsu ;
               GXv_char11[0] = httpContext.getMessage( "Cierre Tinturas desglose compuesto", "") ;
               GXv_dtime20[0] = AV26Ca_DiaHora ;
               GXv_int21[0] = AV28CC_almcod ;
               GXv_int12[0] = AV16BarCod ;
               GXv_int2[0] = AV17BarCodReo ;
               GXv_char8[0] = AV18BarCodPar ;
               new app.pccalm8(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
               pclsrcac.this.A396EmprCod = GXv_char23[0] ;
               pclsrcac.this.A719PrdNum = GXv_char15[0] ;
               pclsrcac.this.AV8CCStkCanS = GXv_decimal18[0] ;
               pclsrcac.this.AV14PrdPreAct = GXv_decimal17[0] ;
               pclsrcac.this.AV10CCStkUsu = GXv_char13[0] ;
               pclsrcac.this.AV26Ca_DiaHora = GXv_dtime20[0] ;
               pclsrcac.this.AV28CC_almcod = GXv_int21[0] ;
               pclsrcac.this.AV16BarCod = GXv_int12[0] ;
               pclsrcac.this.AV17BarCodReo = GXv_int2[0] ;
               pclsrcac.this.AV18BarCodPar = GXv_char8[0] ;
            }
         }
         else
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV8CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = AV15BarPri ;
            GXv_decimal9[0] = AV14PrdPreAct ;
            GXv_int12[0] = AV16BarCod ;
            GXv_int21[0] = AV17BarCodReo ;
            GXv_char11[0] = AV18BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV10CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas desglose compuesto", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV9Fecha ;
            GXv_int16[0] = AV31MaqCCoCod ;
            new app.pnewcc3(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
            pclsrcac.this.A396EmprCod = GXv_char23[0] ;
            pclsrcac.this.A719PrdNum = GXv_char15[0] ;
            pclsrcac.this.AV8CCStkCanS = GXv_decimal17[0] ;
            pclsrcac.this.AV15BarPri = GXv_char13[0] ;
            pclsrcac.this.AV14PrdPreAct = GXv_decimal9[0] ;
            pclsrcac.this.AV16BarCod = GXv_int12[0] ;
            pclsrcac.this.AV17BarCodReo = GXv_int21[0] ;
            pclsrcac.this.AV18BarCodPar = GXv_char11[0] ;
            pclsrcac.this.AV10CCStkUsu = GXv_char7[0] ;
            pclsrcac.this.AV9Fecha = GXv_date19[0] ;
            pclsrcac.this.AV31MaqCCoCod = GXv_int16[0] ;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S121( )
   {
      /* 'CCO' Routine */
      returnInSub = false ;
      /* Using cursor P0A6K10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A602MaqCod = P0A6K10_A602MaqCod[0] ;
         AV24MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      /* Using cursor P0A6K11 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV24MaqCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A602MaqCod = P0A6K11_A602MaqCod[0] ;
         A5100MaqCCoCod = P0A6K11_A5100MaqCCoCod[0] ;
         n5100MaqCCoCod = P0A6K11_n5100MaqCCoCod[0] ;
         AV31MaqCCoCod = A5100MaqCCoCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclsrcac.this.A396EmprCod;
      this.aP1[0] = pclsrcac.this.A129BarCod;
      this.aP2[0] = pclsrcac.this.A132BarCodReo;
      this.aP3[0] = pclsrcac.this.A130BarCodPar;
      this.aP4[0] = pclsrcac.this.A2804RecLinMaq;
      this.aP5[0] = pclsrcac.this.AV10CCStkUsu;
      this.aP6[0] = pclsrcac.this.AV26Ca_DiaHora;
      this.aP7[0] = pclsrcac.this.AV28CC_almcod;
      this.aP8[0] = pclsrcac.this.AV29Tipo;
      this.aP9[0] = pclsrcac.this.AV9Fecha;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30Text_c = "" ;
      scmdbuf = "" ;
      P0A6K2_A396EmprCod = new String[] {""} ;
      P0A6K2_A129BarCod = new int[1] ;
      P0A6K2_A132BarCodReo = new byte[1] ;
      P0A6K2_A130BarCodPar = new String[] {""} ;
      P0A6K2_A2804RecLinMaq = new short[1] ;
      P0A6K2_A718PrdNom = new String[] {""} ;
      P0A6K2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K2_A719PrdNum = new String[] {""} ;
      P0A6K2_n719PrdNum = new boolean[] {false} ;
      P0A6K2_A5725RecLote = new String[] {""} ;
      P0A6K2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K2_A209BarPri = new String[] {""} ;
      P0A6K2_A1273RecLinPro = new byte[1] ;
      P0A6K2_A811RecLin = new short[1] ;
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
      AV8CCStkCanS = DecimalUtil.ZERO ;
      AV21RecLote = "" ;
      AV11PrdComCod = "" ;
      AV12PrdCant = DecimalUtil.ZERO ;
      AV13PrdCanAny = DecimalUtil.ZERO ;
      AV14PrdPreAct = DecimalUtil.ZERO ;
      AV15BarPri = "" ;
      AV18BarCodPar = "" ;
      A8635Ca_DiaHora = GXutil.resetTime( GXutil.nullDate() );
      A8638Ca_PrdNom = "" ;
      A8634Ca_Prdnum = "" ;
      A8637Ca_Cant = DecimalUtil.ZERO ;
      A8636Ca_Prdcant = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P0A6K5_A396EmprCod = new String[] {""} ;
      P0A6K5_A129BarCod = new int[1] ;
      P0A6K5_A132BarCodReo = new byte[1] ;
      P0A6K5_A130BarCodPar = new String[] {""} ;
      P0A6K5_A2808RecLinMAL = new short[1] ;
      P0A6K5_A718PrdNom = new String[] {""} ;
      P0A6K5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K5_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K5_n1378PrdCFin = new boolean[] {false} ;
      P0A6K5_A719PrdNum = new String[] {""} ;
      P0A6K5_n719PrdNum = new boolean[] {false} ;
      P0A6K5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K5_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K5_A209BarPri = new String[] {""} ;
      P0A6K5_A5807LanyLote = new String[] {""} ;
      P0A6K5_n5807LanyLote = new boolean[] {false} ;
      P0A6K5_A1377RecNumAny = new byte[1] ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A5807LanyLote = "" ;
      GXv_char3 = new String[1] ;
      P0A6K8_A396EmprCod = new String[] {""} ;
      P0A6K8_A129BarCod = new int[1] ;
      P0A6K8_A132BarCodReo = new byte[1] ;
      P0A6K8_A130BarCodPar = new String[] {""} ;
      P0A6K8_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K8_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K8_A2495BarDosUsa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K8_n2495BarDosUsa = new boolean[] {false} ;
      P0A6K8_A719PrdNum = new String[] {""} ;
      P0A6K8_n719PrdNum = new boolean[] {false} ;
      P0A6K8_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K8_A209BarPri = new String[] {""} ;
      P0A6K8_A2494BarDosPro = new String[] {""} ;
      A2495BarDosUsa = DecimalUtil.ZERO ;
      A2494BarDosPro = "" ;
      P0A6K9_A396EmprCod = new String[] {""} ;
      P0A6K9_A688PrdComCod = new String[] {""} ;
      P0A6K9_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K9_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K9_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K9_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6K9_A719PrdNum = new String[] {""} ;
      P0A6K9_n719PrdNum = new boolean[] {false} ;
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
      P0A6K10_A396EmprCod = new String[] {""} ;
      P0A6K10_A129BarCod = new int[1] ;
      P0A6K10_A132BarCodReo = new byte[1] ;
      P0A6K10_A130BarCodPar = new String[] {""} ;
      P0A6K10_A2804RecLinMaq = new short[1] ;
      P0A6K10_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV24MaqCod = "" ;
      P0A6K11_A396EmprCod = new String[] {""} ;
      P0A6K11_A602MaqCod = new String[] {""} ;
      P0A6K11_A5100MaqCCoCod = new short[1] ;
      P0A6K11_n5100MaqCCoCod = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pclsrcac__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pclsrcac__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pclsrcac__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pclsrcac__default(),
         new Object[] {
             new Object[] {
            P0A6K2_A396EmprCod, P0A6K2_A129BarCod, P0A6K2_A132BarCodReo, P0A6K2_A130BarCodPar, P0A6K2_A2804RecLinMaq, P0A6K2_A718PrdNom, P0A6K2_A707PrdFacCon, P0A6K2_A1797PrdCanAny, P0A6K2_A686PrdCant, P0A6K2_A719PrdNum,
            P0A6K2_n719PrdNum, P0A6K2_A5725RecLote, P0A6K2_A724PrdPreAct, P0A6K2_A726PrdPreMed, P0A6K2_A209BarPri, P0A6K2_A1273RecLinPro, P0A6K2_A811RecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0A6K5_A396EmprCod, P0A6K5_A129BarCod, P0A6K5_A132BarCodReo, P0A6K5_A130BarCodPar, P0A6K5_A2808RecLinMAL, P0A6K5_A718PrdNom, P0A6K5_A707PrdFacCon, P0A6K5_A1378PrdCFin, P0A6K5_n1378PrdCFin, P0A6K5_A719PrdNum,
            P0A6K5_A724PrdPreAct, P0A6K5_A726PrdPreMed, P0A6K5_A209BarPri, P0A6K5_A5807LanyLote, P0A6K5_n5807LanyLote, P0A6K5_A1377RecNumAny
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0A6K8_A396EmprCod, P0A6K8_A129BarCod, P0A6K8_A132BarCodReo, P0A6K8_A130BarCodPar, P0A6K8_A707PrdFacCon, P0A6K8_A726PrdPreMed, P0A6K8_A2495BarDosUsa, P0A6K8_n2495BarDosUsa, P0A6K8_A719PrdNum, P0A6K8_A724PrdPreAct,
            P0A6K8_A209BarPri, P0A6K8_A2494BarDosPro
            }
            , new Object[] {
            P0A6K9_A396EmprCod, P0A6K9_A688PrdComCod, P0A6K9_A690PrdComFN, P0A6K9_A707PrdFacCon, P0A6K9_A724PrdPreAct, P0A6K9_A726PrdPreMed, P0A6K9_A719PrdNum
            }
            , new Object[] {
            P0A6K10_A396EmprCod, P0A6K10_A129BarCod, P0A6K10_A132BarCodReo, P0A6K10_A130BarCodPar, P0A6K10_A2804RecLinMaq, P0A6K10_A602MaqCod
            }
            , new Object[] {
            P0A6K11_A396EmprCod, P0A6K11_A602MaqCod, P0A6K11_A5100MaqCCoCod, P0A6K11_n5100MaqCCoCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV28CC_almcod ;
   private byte AV25Nclec ;
   private byte AV19FlagPreMed ;
   private byte AV20CieLote ;
   private byte AV22CieCCo ;
   private byte AV27Eliot ;
   private byte GXt_int1 ;
   private byte A1273RecLinPro ;
   private byte AV17BarCodReo ;
   private byte A1377RecNumAny ;
   private byte GXv_int2[] ;
   private byte GXv_int21[] ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV31MaqCCoCod ;
   private short Gx_err ;
   private short A2808RecLinMAL ;
   private short GXv_int22[] ;
   private short GXv_int16[] ;
   private short A5100MaqCCoCod ;
   private int A129BarCod ;
   private int AV16BarCod ;
   private int GX_INS1182 ;
   private int GXv_int12[] ;
   private int GXv_int10[] ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV8CCStkCanS ;
   private java.math.BigDecimal AV12PrdCant ;
   private java.math.BigDecimal AV13PrdCanAny ;
   private java.math.BigDecimal AV14PrdPreAct ;
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
   private String AV10CCStkUsu ;
   private String AV29Tipo ;
   private String AV30Text_c ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A5725RecLote ;
   private String A209BarPri ;
   private String W396EmprCod ;
   private String AV21RecLote ;
   private String AV11PrdComCod ;
   private String AV15BarPri ;
   private String AV18BarCodPar ;
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
   private String AV24MaqCod ;
   private java.util.Date AV26Ca_DiaHora ;
   private java.util.Date A8635Ca_DiaHora ;
   private java.util.Date GXv_dtime20[] ;
   private java.util.Date AV9Fecha ;
   private java.util.Date GXv_date19[] ;
   private boolean brkA6K2 ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n8638Ca_PrdNom ;
   private boolean n8637Ca_Cant ;
   private boolean n8636Ca_Prdcant ;
   private boolean brkA6K6 ;
   private boolean n1378PrdCFin ;
   private boolean n5807LanyLote ;
   private boolean brkA6K10 ;
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
   private String[] P0A6K2_A396EmprCod ;
   private int[] P0A6K2_A129BarCod ;
   private byte[] P0A6K2_A132BarCodReo ;
   private String[] P0A6K2_A130BarCodPar ;
   private short[] P0A6K2_A2804RecLinMaq ;
   private String[] P0A6K2_A718PrdNom ;
   private java.math.BigDecimal[] P0A6K2_A707PrdFacCon ;
   private java.math.BigDecimal[] P0A6K2_A1797PrdCanAny ;
   private java.math.BigDecimal[] P0A6K2_A686PrdCant ;
   private String[] P0A6K2_A719PrdNum ;
   private boolean[] P0A6K2_n719PrdNum ;
   private String[] P0A6K2_A5725RecLote ;
   private java.math.BigDecimal[] P0A6K2_A724PrdPreAct ;
   private java.math.BigDecimal[] P0A6K2_A726PrdPreMed ;
   private String[] P0A6K2_A209BarPri ;
   private byte[] P0A6K2_A1273RecLinPro ;
   private short[] P0A6K2_A811RecLin ;
   private String[] P0A6K5_A396EmprCod ;
   private int[] P0A6K5_A129BarCod ;
   private byte[] P0A6K5_A132BarCodReo ;
   private String[] P0A6K5_A130BarCodPar ;
   private short[] P0A6K5_A2808RecLinMAL ;
   private String[] P0A6K5_A718PrdNom ;
   private java.math.BigDecimal[] P0A6K5_A707PrdFacCon ;
   private java.math.BigDecimal[] P0A6K5_A1378PrdCFin ;
   private boolean[] P0A6K5_n1378PrdCFin ;
   private String[] P0A6K5_A719PrdNum ;
   private boolean[] P0A6K5_n719PrdNum ;
   private java.math.BigDecimal[] P0A6K5_A724PrdPreAct ;
   private java.math.BigDecimal[] P0A6K5_A726PrdPreMed ;
   private String[] P0A6K5_A209BarPri ;
   private String[] P0A6K5_A5807LanyLote ;
   private boolean[] P0A6K5_n5807LanyLote ;
   private byte[] P0A6K5_A1377RecNumAny ;
   private String[] P0A6K8_A396EmprCod ;
   private int[] P0A6K8_A129BarCod ;
   private byte[] P0A6K8_A132BarCodReo ;
   private String[] P0A6K8_A130BarCodPar ;
   private java.math.BigDecimal[] P0A6K8_A707PrdFacCon ;
   private java.math.BigDecimal[] P0A6K8_A726PrdPreMed ;
   private java.math.BigDecimal[] P0A6K8_A2495BarDosUsa ;
   private boolean[] P0A6K8_n2495BarDosUsa ;
   private String[] P0A6K8_A719PrdNum ;
   private boolean[] P0A6K8_n719PrdNum ;
   private java.math.BigDecimal[] P0A6K8_A724PrdPreAct ;
   private String[] P0A6K8_A209BarPri ;
   private String[] P0A6K8_A2494BarDosPro ;
   private String[] P0A6K9_A396EmprCod ;
   private String[] P0A6K9_A688PrdComCod ;
   private java.math.BigDecimal[] P0A6K9_A690PrdComFN ;
   private java.math.BigDecimal[] P0A6K9_A707PrdFacCon ;
   private java.math.BigDecimal[] P0A6K9_A724PrdPreAct ;
   private java.math.BigDecimal[] P0A6K9_A726PrdPreMed ;
   private String[] P0A6K9_A719PrdNum ;
   private boolean[] P0A6K9_n719PrdNum ;
   private String[] P0A6K10_A396EmprCod ;
   private int[] P0A6K10_A129BarCod ;
   private byte[] P0A6K10_A132BarCodReo ;
   private String[] P0A6K10_A130BarCodPar ;
   private short[] P0A6K10_A2804RecLinMaq ;
   private String[] P0A6K10_A602MaqCod ;
   private String[] P0A6K11_A396EmprCod ;
   private String[] P0A6K11_A602MaqCod ;
   private short[] P0A6K11_A5100MaqCCoCod ;
   private boolean[] P0A6K11_n5100MaqCCoCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pclsrcac__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pclsrcac__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pclsrcac__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pclsrcac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6K2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdNom, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.PrdNum, T1.RecLote, T2.PrdPreAct, T2.PrdPreMed, T3.BarPri, T1.RecLinPro, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A6K3", "INSERT INTO TXPCONSC(EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Prdcant, Ca_Cant, Ca_PrdNom) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new UpdateCursor("P0A6K4", "UPDATE TXPCONSC SET Ca_Prdcant=Ca_Prdcant + ( ( ? * CAST(1000 AS NUMERIC(22,10)))), Ca_Cant=Ca_Cant + ?  WHERE EmprCod = ? and Ca_Prdnum = ? and Ca_DiaHora = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P0A6K5", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T2.PrdNom, T2.PrdFacCon, T1.PrdCFin, T1.PrdNum, T2.PrdPreAct, T2.PrdPreMed, T3.BarPri, T1.LanyLote, T1.RecNumAny FROM ((TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A6K6", "INSERT INTO TXPCONSC(EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Prdcant, Ca_Cant, Ca_PrdNom) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new UpdateCursor("P0A6K7", "UPDATE TXPCONSC SET Ca_Prdcant=Ca_Prdcant + ( ( ? * CAST(1000 AS NUMERIC(22,10)))), Ca_Cant=Ca_Cant + ?  WHERE EmprCod = ? and Ca_Prdnum = ? and Ca_DiaHora = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P0A6K8", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.PrdFacCon, T2.PrdPreMed, T1.BarDosUsa, T1.PrdNum, T2.PrdPreAct, T3.BarPri, T1.BarDosPro FROM ((TXPBARDOS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6K9", "SELECT T1.EmprCod, T1.PrdComCod, T1.PrdComFN, T2.PrdFacCon, T2.PrdPreAct, T2.PrdPreMed, T1.PrdNum FROM (TXPLPRDCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6K10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A6K11", "SELECT EmprCod, MaqCod, MaqCCoCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
            case 6 :
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
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 9 :
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
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

