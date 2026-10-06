package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcieccs extends GXProcedure
{
   public pcieccs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcieccs.class ), "" );
   }

   public pcieccs( int remoteHandle ,
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
      pcieccs.this.aP5 = new String[] {""};
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
      pcieccs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcieccs.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcieccs.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcieccs.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcieccs.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcieccs.this.AV29CCStkUsu = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV44Nclec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      pcieccs.this.GXt_int1 = GXv_int2[0] ;
      AV44Nclec = GXt_int1 ;
      AV38FlagPreMed = (byte)(0) ;
      GXv_int2[0] = AV38FlagPreMed ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int2) ;
      pcieccs.this.AV38FlagPreMed = GXv_int2[0] ;
      GXt_int1 = AV39CieLote ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIELOT", ""), GXv_int2) ;
      pcieccs.this.GXt_int1 = GXv_int2[0] ;
      AV39CieLote = GXt_int1 ;
      GXt_int1 = AV41CieCCo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIECCO", ""), GXv_int2) ;
      pcieccs.this.GXt_int1 = GXv_int2[0] ;
      AV41CieCCo = GXt_int1 ;
      AV28Fecha = GXutil.today( ) ;
      /* Using cursor P00MQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkMQ2 = false ;
         A707PrdFacCon = P00MQ2_A707PrdFacCon[0] ;
         A1797PrdCanAny = P00MQ2_A1797PrdCanAny[0] ;
         A686PrdCant = P00MQ2_A686PrdCant[0] ;
         A719PrdNum = P00MQ2_A719PrdNum[0] ;
         n719PrdNum = P00MQ2_n719PrdNum[0] ;
         A5725RecLote = P00MQ2_A5725RecLote[0] ;
         A724PrdPreAct = P00MQ2_A724PrdPreAct[0] ;
         A726PrdPreMed = P00MQ2_A726PrdPreMed[0] ;
         A209BarPri = P00MQ2_A209BarPri[0] ;
         A1273RecLinPro = P00MQ2_A1273RecLinPro[0] ;
         A811RecLin = P00MQ2_A811RecLin[0] ;
         A707PrdFacCon = P00MQ2_A707PrdFacCon[0] ;
         A724PrdPreAct = P00MQ2_A724PrdPreAct[0] ;
         A726PrdPreMed = P00MQ2_A726PrdPreMed[0] ;
         A209BarPri = P00MQ2_A209BarPri[0] ;
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
         AV27CCStkCanS = DecimalUtil.doubleToDec(0) ;
         AV40RecLote = A5725RecLote ;
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
         {
            AV30PrdComCod = A719PrdNum ;
            AV31PrdCant = DecimalUtil.doubleToDec(0) ;
            AV32PrdCanAny = DecimalUtil.doubleToDec(0) ;
         }
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00MQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00MQ2_A129BarCod[0] == A129BarCod ) && ( P00MQ2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P00MQ2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P00MQ2_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P00MQ2_A719PrdNum[0], A719PrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brkMQ2 = false ;
            A707PrdFacCon = P00MQ2_A707PrdFacCon[0] ;
            A1797PrdCanAny = P00MQ2_A1797PrdCanAny[0] ;
            A686PrdCant = P00MQ2_A686PrdCant[0] ;
            A1273RecLinPro = P00MQ2_A1273RecLinPro[0] ;
            A811RecLin = P00MQ2_A811RecLin[0] ;
            A707PrdFacCon = P00MQ2_A707PrdFacCon[0] ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
            {
               AV27CCStkCanS = AV27CCStkCanS.add((((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon))) ;
            }
            else
            {
               AV31PrdCant = AV31PrdCant.add(A686PrdCant) ;
               AV32PrdCanAny = AV32PrdCanAny.add(A1797PrdCanAny) ;
            }
            brkMQ2 = true ;
            pr_default.readNext(0);
         }
         AV33PrdPreAct = A724PrdPreAct ;
         if ( AV38FlagPreMed == 1 )
         {
            AV33PrdPreAct = A726PrdPreMed ;
         }
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
         {
            if ( AV39CieLote == 0 )
            {
               if ( AV41CieCCo == 0 )
               {
                  GXv_char3[0] = A396EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal6[0] = AV27CCStkCanS ;
                  GXv_char7[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char8[0] = A209BarPri ;
                  GXv_decimal9[0] = AV33PrdPreAct ;
                  GXv_int10[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char11[0] = A130BarCodPar ;
                  GXv_int12[0] = 0 ;
                  GXv_char13[0] = " " ;
                  GXv_char14[0] = AV29CCStkUsu ;
                  GXv_char15[0] = httpContext.getMessage( "Cierre Tinturas", "") ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV28Fecha ;
                  new app.pnewccs(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_char7, GXv_char8, GXv_decimal9, GXv_int10, GXv_int2, GXv_char11, GXv_int12, GXv_char13, GXv_char14, GXv_char15, GXv_int16, GXv_decimal17, GXv_decimal18, GXv_date19) ;
                  pcieccs.this.A396EmprCod = GXv_char3[0] ;
                  pcieccs.this.A719PrdNum = GXv_char4[0] ;
                  pcieccs.this.AV27CCStkCanS = GXv_decimal6[0] ;
                  pcieccs.this.A209BarPri = GXv_char8[0] ;
                  pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
                  pcieccs.this.A129BarCod = GXv_int10[0] ;
                  pcieccs.this.A132BarCodReo = GXv_int2[0] ;
                  pcieccs.this.A130BarCodPar = GXv_char11[0] ;
                  pcieccs.this.AV29CCStkUsu = GXv_char14[0] ;
                  pcieccs.this.AV28Fecha = GXv_date19[0] ;
               }
               else
               {
                  GXv_char15[0] = A396EmprCod ;
                  GXv_char14[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV27CCStkCanS ;
                  GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char11[0] = A209BarPri ;
                  GXv_decimal9[0] = AV33PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char7[0] = " " ;
                  GXv_char4[0] = AV29CCStkUsu ;
                  GXv_char3[0] = httpContext.getMessage( "Cierre Tinturas", "") ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV28Fecha ;
                  GXv_int20[0] = AV49Maqccocod ;
                  new app.pnewcc3(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int2, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int16, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int20) ;
                  pcieccs.this.A396EmprCod = GXv_char15[0] ;
                  pcieccs.this.A719PrdNum = GXv_char14[0] ;
                  pcieccs.this.AV27CCStkCanS = GXv_decimal17[0] ;
                  pcieccs.this.A209BarPri = GXv_char11[0] ;
                  pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
                  pcieccs.this.A129BarCod = GXv_int12[0] ;
                  pcieccs.this.A132BarCodReo = GXv_int2[0] ;
                  pcieccs.this.A130BarCodPar = GXv_char8[0] ;
                  pcieccs.this.AV29CCStkUsu = GXv_char4[0] ;
                  pcieccs.this.AV28Fecha = GXv_date19[0] ;
                  pcieccs.this.AV49Maqccocod = GXv_int20[0] ;
               }
            }
            else
            {
               if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) != 0 )
               {
                  GXv_char15[0] = A396EmprCod ;
                  GXv_char14[0] = A719PrdNum ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal17[0] = AV27CCStkCanS ;
                  GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                  GXv_char11[0] = A209BarPri ;
                  GXv_decimal9[0] = AV33PrdPreAct ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  GXv_int10[0] = 0 ;
                  GXv_char7[0] = " " ;
                  GXv_char4[0] = AV29CCStkUsu ;
                  GXv_char3[0] = httpContext.getMessage( "Cierre Tinturas", "") ;
                  GXv_int20[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV28Fecha ;
                  GXv_char21[0] = AV40RecLote ;
                  new app.pnewccsl(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int2, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int20, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char21) ;
                  pcieccs.this.A396EmprCod = GXv_char15[0] ;
                  pcieccs.this.A719PrdNum = GXv_char14[0] ;
                  pcieccs.this.AV27CCStkCanS = GXv_decimal17[0] ;
                  pcieccs.this.A209BarPri = GXv_char11[0] ;
                  pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
                  pcieccs.this.A129BarCod = GXv_int12[0] ;
                  pcieccs.this.A132BarCodReo = GXv_int2[0] ;
                  pcieccs.this.A130BarCodPar = GXv_char8[0] ;
                  pcieccs.this.AV29CCStkUsu = GXv_char4[0] ;
                  pcieccs.this.AV28Fecha = GXv_date19[0] ;
                  pcieccs.this.AV40RecLote = GXv_char21[0] ;
               }
            }
         }
         else
         {
            AV34BarPri = A209BarPri ;
            AV35BarCod = A129BarCod ;
            AV36BarCodReo = A132BarCodReo ;
            AV37BarCodPar = A130BarCodPar ;
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
         if ( ! brkMQ2 )
         {
            brkMQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /* Using cursor P00MQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkMQ4 = false ;
         A2808RecLinMAL = P00MQ3_A2808RecLinMAL[0] ;
         A707PrdFacCon = P00MQ3_A707PrdFacCon[0] ;
         A1378PrdCFin = P00MQ3_A1378PrdCFin[0] ;
         n1378PrdCFin = P00MQ3_n1378PrdCFin[0] ;
         A719PrdNum = P00MQ3_A719PrdNum[0] ;
         n719PrdNum = P00MQ3_n719PrdNum[0] ;
         A724PrdPreAct = P00MQ3_A724PrdPreAct[0] ;
         A726PrdPreMed = P00MQ3_A726PrdPreMed[0] ;
         A209BarPri = P00MQ3_A209BarPri[0] ;
         A5807LanyLote = P00MQ3_A5807LanyLote[0] ;
         n5807LanyLote = P00MQ3_n5807LanyLote[0] ;
         A1377RecNumAny = P00MQ3_A1377RecNumAny[0] ;
         A707PrdFacCon = P00MQ3_A707PrdFacCon[0] ;
         A724PrdPreAct = P00MQ3_A724PrdPreAct[0] ;
         A726PrdPreMed = P00MQ3_A726PrdPreMed[0] ;
         A209BarPri = P00MQ3_A209BarPri[0] ;
         AV27CCStkCanS = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P00MQ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00MQ3_A129BarCod[0] == A129BarCod ) && ( P00MQ3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P00MQ3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P00MQ3_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(P00MQ3_A719PrdNum[0], A719PrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brkMQ4 = false ;
            A707PrdFacCon = P00MQ3_A707PrdFacCon[0] ;
            A1378PrdCFin = P00MQ3_A1378PrdCFin[0] ;
            n1378PrdCFin = P00MQ3_n1378PrdCFin[0] ;
            A1377RecNumAny = P00MQ3_A1377RecNumAny[0] ;
            A707PrdFacCon = P00MQ3_A707PrdFacCon[0] ;
            AV27CCStkCanS = AV27CCStkCanS.add((A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon)) ;
            brkMQ4 = true ;
            pr_default.readNext(1);
         }
         AV33PrdPreAct = A724PrdPreAct ;
         if ( AV38FlagPreMed == 1 )
         {
            AV33PrdPreAct = A726PrdPreMed ;
         }
         if ( AV39CieLote == 0 )
         {
            if ( AV41CieCCo == 0 )
            {
               GXv_char21[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV27CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV33PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int2[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV29CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Añadidas Pc Ind.", "") ;
               GXv_int20[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV28Fecha ;
               new app.pnewccs(remoteHandle, context).execute( GXv_char21, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int2, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int20, GXv_decimal6, GXv_decimal5, GXv_date19) ;
               pcieccs.this.A396EmprCod = GXv_char21[0] ;
               pcieccs.this.A719PrdNum = GXv_char15[0] ;
               pcieccs.this.AV27CCStkCanS = GXv_decimal17[0] ;
               pcieccs.this.A209BarPri = GXv_char13[0] ;
               pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
               pcieccs.this.A129BarCod = GXv_int12[0] ;
               pcieccs.this.A132BarCodReo = GXv_int2[0] ;
               pcieccs.this.A130BarCodPar = GXv_char11[0] ;
               pcieccs.this.AV29CCStkUsu = GXv_char7[0] ;
               pcieccs.this.AV28Fecha = GXv_date19[0] ;
            }
            else
            {
               GXv_char21[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV27CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV33PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int2[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV29CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Añadidas Pc Ind.", "") ;
               GXv_int20[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV28Fecha ;
               GXv_int16[0] = AV49Maqccocod ;
               new app.pnewcc3(remoteHandle, context).execute( GXv_char21, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int2, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int20, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
               pcieccs.this.A396EmprCod = GXv_char21[0] ;
               pcieccs.this.A719PrdNum = GXv_char15[0] ;
               pcieccs.this.AV27CCStkCanS = GXv_decimal17[0] ;
               pcieccs.this.A209BarPri = GXv_char13[0] ;
               pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
               pcieccs.this.A129BarCod = GXv_int12[0] ;
               pcieccs.this.A132BarCodReo = GXv_int2[0] ;
               pcieccs.this.A130BarCodPar = GXv_char11[0] ;
               pcieccs.this.AV29CCStkUsu = GXv_char7[0] ;
               pcieccs.this.AV28Fecha = GXv_date19[0] ;
               pcieccs.this.AV49Maqccocod = GXv_int16[0] ;
            }
         }
         else
         {
            GXv_char21[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV27CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = A209BarPri ;
            GXv_decimal9[0] = AV33PrdPreAct ;
            GXv_int12[0] = A129BarCod ;
            GXv_int2[0] = A132BarCodReo ;
            GXv_char11[0] = A130BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV29CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Añadidas Pc Ind.", "") ;
            GXv_int20[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV28Fecha ;
            GXv_char3[0] = A5807LanyLote ;
            new app.pnewccsl(remoteHandle, context).execute( GXv_char21, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int2, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int20, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char3) ;
            pcieccs.this.A396EmprCod = GXv_char21[0] ;
            pcieccs.this.A719PrdNum = GXv_char15[0] ;
            pcieccs.this.AV27CCStkCanS = GXv_decimal17[0] ;
            pcieccs.this.A209BarPri = GXv_char13[0] ;
            pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
            pcieccs.this.A129BarCod = GXv_int12[0] ;
            pcieccs.this.A132BarCodReo = GXv_int2[0] ;
            pcieccs.this.A130BarCodPar = GXv_char11[0] ;
            pcieccs.this.AV29CCStkUsu = GXv_char7[0] ;
            pcieccs.this.AV28Fecha = GXv_date19[0] ;
            pcieccs.this.A5807LanyLote = GXv_char3[0] ;
         }
         if ( ! brkMQ4 )
         {
            brkMQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      /* Using cursor P00MQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkMQ6 = false ;
         A707PrdFacCon = P00MQ4_A707PrdFacCon[0] ;
         A726PrdPreMed = P00MQ4_A726PrdPreMed[0] ;
         A2495BarDosUsa = P00MQ4_A2495BarDosUsa[0] ;
         n2495BarDosUsa = P00MQ4_n2495BarDosUsa[0] ;
         A719PrdNum = P00MQ4_A719PrdNum[0] ;
         n719PrdNum = P00MQ4_n719PrdNum[0] ;
         A724PrdPreAct = P00MQ4_A724PrdPreAct[0] ;
         A209BarPri = P00MQ4_A209BarPri[0] ;
         A2494BarDosPro = P00MQ4_A2494BarDosPro[0] ;
         A707PrdFacCon = P00MQ4_A707PrdFacCon[0] ;
         A726PrdPreMed = P00MQ4_A726PrdPreMed[0] ;
         A724PrdPreAct = P00MQ4_A724PrdPreAct[0] ;
         A209BarPri = P00MQ4_A209BarPri[0] ;
         if ( A129BarCod != 99999999 )
         {
            AV27CCStkCanS = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P00MQ4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00MQ4_A129BarCod[0] == A129BarCod ) && ( P00MQ4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P00MQ4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               if ( ! ( ( GXutil.strcmp(P00MQ4_A719PrdNum[0], A719PrdNum) == 0 ) ) )
               {
                  if (true) break;
               }
               brkMQ6 = false ;
               A707PrdFacCon = P00MQ4_A707PrdFacCon[0] ;
               A726PrdPreMed = P00MQ4_A726PrdPreMed[0] ;
               A2495BarDosUsa = P00MQ4_A2495BarDosUsa[0] ;
               n2495BarDosUsa = P00MQ4_n2495BarDosUsa[0] ;
               A2494BarDosPro = P00MQ4_A2494BarDosPro[0] ;
               A707PrdFacCon = P00MQ4_A707PrdFacCon[0] ;
               A726PrdPreMed = P00MQ4_A726PrdPreMed[0] ;
               AV27CCStkCanS = AV27CCStkCanS.add((A2495BarDosUsa.multiply(A726PrdPreMed).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               brkMQ6 = true ;
               pr_default.readNext(2);
            }
            AV33PrdPreAct = A724PrdPreAct ;
            if ( AV38FlagPreMed == 1 )
            {
               AV33PrdPreAct = A726PrdPreMed ;
            }
            if ( AV41CieCCo == 0 )
            {
               GXv_char21[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV27CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV33PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int2[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV29CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Dosificadora.", "") ;
               GXv_int20[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV28Fecha ;
               new app.pnewccs(remoteHandle, context).execute( GXv_char21, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int2, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int20, GXv_decimal6, GXv_decimal5, GXv_date19) ;
               pcieccs.this.A396EmprCod = GXv_char21[0] ;
               pcieccs.this.A719PrdNum = GXv_char15[0] ;
               pcieccs.this.AV27CCStkCanS = GXv_decimal17[0] ;
               pcieccs.this.A209BarPri = GXv_char13[0] ;
               pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
               pcieccs.this.A129BarCod = GXv_int12[0] ;
               pcieccs.this.A132BarCodReo = GXv_int2[0] ;
               pcieccs.this.A130BarCodPar = GXv_char11[0] ;
               pcieccs.this.AV29CCStkUsu = GXv_char7[0] ;
               pcieccs.this.AV28Fecha = GXv_date19[0] ;
            }
            else
            {
               GXv_char21[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal17[0] = AV27CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_char13[0] = A209BarPri ;
               GXv_decimal9[0] = AV33PrdPreAct ;
               GXv_int12[0] = A129BarCod ;
               GXv_int2[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_int10[0] = 0 ;
               GXv_char8[0] = " " ;
               GXv_char7[0] = AV29CCStkUsu ;
               GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas Dosificadora.", "") ;
               GXv_int20[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV28Fecha ;
               GXv_int16[0] = AV49Maqccocod ;
               new app.pnewcc3(remoteHandle, context).execute( GXv_char21, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int2, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int20, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
               pcieccs.this.A396EmprCod = GXv_char21[0] ;
               pcieccs.this.A719PrdNum = GXv_char15[0] ;
               pcieccs.this.AV27CCStkCanS = GXv_decimal17[0] ;
               pcieccs.this.A209BarPri = GXv_char13[0] ;
               pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
               pcieccs.this.A129BarCod = GXv_int12[0] ;
               pcieccs.this.A132BarCodReo = GXv_int2[0] ;
               pcieccs.this.A130BarCodPar = GXv_char11[0] ;
               pcieccs.this.AV29CCStkUsu = GXv_char7[0] ;
               pcieccs.this.AV28Fecha = GXv_date19[0] ;
               pcieccs.this.AV49Maqccocod = GXv_int16[0] ;
            }
         }
         if ( ! brkMQ6 )
         {
            brkMQ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
      if ( AV44Nclec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcieccs");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUES' Routine */
      returnInSub = false ;
      /* Using cursor P00MQ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV30PrdComCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A688PrdComCod = P00MQ5_A688PrdComCod[0] ;
         A690PrdComFN = P00MQ5_A690PrdComFN[0] ;
         A707PrdFacCon = P00MQ5_A707PrdFacCon[0] ;
         A724PrdPreAct = P00MQ5_A724PrdPreAct[0] ;
         A726PrdPreMed = P00MQ5_A726PrdPreMed[0] ;
         A719PrdNum = P00MQ5_A719PrdNum[0] ;
         n719PrdNum = P00MQ5_n719PrdNum[0] ;
         A707PrdFacCon = P00MQ5_A707PrdFacCon[0] ;
         A724PrdPreAct = P00MQ5_A724PrdPreAct[0] ;
         A726PrdPreMed = P00MQ5_A726PrdPreMed[0] ;
         AV27CCStkCanS = ((AV31PrdCant.add(AV32PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         AV33PrdPreAct = A724PrdPreAct ;
         if ( AV38FlagPreMed == 1 )
         {
            AV33PrdPreAct = A726PrdPreMed ;
         }
         if ( AV41CieCCo == 0 )
         {
            GXv_char21[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV27CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = AV34BarPri ;
            GXv_decimal9[0] = AV33PrdPreAct ;
            GXv_int12[0] = AV35BarCod ;
            GXv_int2[0] = AV36BarCodReo ;
            GXv_char11[0] = AV37BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV29CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas desglose compuesto", "") ;
            GXv_int20[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV28Fecha ;
            new app.pnewccs(remoteHandle, context).execute( GXv_char21, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int2, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int20, GXv_decimal6, GXv_decimal5, GXv_date19) ;
            pcieccs.this.A396EmprCod = GXv_char21[0] ;
            pcieccs.this.A719PrdNum = GXv_char15[0] ;
            pcieccs.this.AV27CCStkCanS = GXv_decimal17[0] ;
            pcieccs.this.AV34BarPri = GXv_char13[0] ;
            pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
            pcieccs.this.AV35BarCod = GXv_int12[0] ;
            pcieccs.this.AV36BarCodReo = GXv_int2[0] ;
            pcieccs.this.AV37BarCodPar = GXv_char11[0] ;
            pcieccs.this.AV29CCStkUsu = GXv_char7[0] ;
            pcieccs.this.AV28Fecha = GXv_date19[0] ;
         }
         else
         {
            GXv_char21[0] = A396EmprCod ;
            GXv_char15[0] = A719PrdNum ;
            GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal17[0] = AV27CCStkCanS ;
            GXv_char14[0] = httpContext.getMessage( "SC", "") ;
            GXv_char13[0] = AV34BarPri ;
            GXv_decimal9[0] = AV33PrdPreAct ;
            GXv_int12[0] = AV35BarCod ;
            GXv_int2[0] = AV36BarCodReo ;
            GXv_char11[0] = AV37BarCodPar ;
            GXv_int10[0] = 0 ;
            GXv_char8[0] = " " ;
            GXv_char7[0] = AV29CCStkUsu ;
            GXv_char4[0] = httpContext.getMessage( "Cierre Tinturas desglose compuesto", "") ;
            GXv_int20[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV28Fecha ;
            GXv_int16[0] = AV49Maqccocod ;
            new app.pnewcc3(remoteHandle, context).execute( GXv_char21, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int2, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int20, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
            pcieccs.this.A396EmprCod = GXv_char21[0] ;
            pcieccs.this.A719PrdNum = GXv_char15[0] ;
            pcieccs.this.AV27CCStkCanS = GXv_decimal17[0] ;
            pcieccs.this.AV34BarPri = GXv_char13[0] ;
            pcieccs.this.AV33PrdPreAct = GXv_decimal9[0] ;
            pcieccs.this.AV35BarCod = GXv_int12[0] ;
            pcieccs.this.AV36BarCodReo = GXv_int2[0] ;
            pcieccs.this.AV37BarCodPar = GXv_char11[0] ;
            pcieccs.this.AV29CCStkUsu = GXv_char7[0] ;
            pcieccs.this.AV28Fecha = GXv_date19[0] ;
            pcieccs.this.AV49Maqccocod = GXv_int16[0] ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'CCO' Routine */
      returnInSub = false ;
      /* Using cursor P00MQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = P00MQ6_A602MaqCod[0] ;
         AV43MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      /* Using cursor P00MQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV43MaqCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A602MaqCod = P00MQ7_A602MaqCod[0] ;
         A5100MaqCCoCod = P00MQ7_A5100MaqCCoCod[0] ;
         n5100MaqCCoCod = P00MQ7_n5100MaqCCoCod[0] ;
         AV49Maqccocod = A5100MaqCCoCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcieccs.this.A396EmprCod;
      this.aP1[0] = pcieccs.this.A129BarCod;
      this.aP2[0] = pcieccs.this.A132BarCodReo;
      this.aP3[0] = pcieccs.this.A130BarCodPar;
      this.aP4[0] = pcieccs.this.A2804RecLinMaq;
      this.aP5[0] = pcieccs.this.AV29CCStkUsu;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28Fecha = GXutil.nullDate() ;
      scmdbuf = "" ;
      P00MQ2_A396EmprCod = new String[] {""} ;
      P00MQ2_A129BarCod = new int[1] ;
      P00MQ2_A132BarCodReo = new byte[1] ;
      P00MQ2_A130BarCodPar = new String[] {""} ;
      P00MQ2_A2804RecLinMaq = new short[1] ;
      P00MQ2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ2_A719PrdNum = new String[] {""} ;
      P00MQ2_n719PrdNum = new boolean[] {false} ;
      P00MQ2_A5725RecLote = new String[] {""} ;
      P00MQ2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ2_A209BarPri = new String[] {""} ;
      P00MQ2_A1273RecLinPro = new byte[1] ;
      P00MQ2_A811RecLin = new short[1] ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A5725RecLote = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A209BarPri = "" ;
      AV27CCStkCanS = DecimalUtil.ZERO ;
      AV40RecLote = "" ;
      AV30PrdComCod = "" ;
      AV31PrdCant = DecimalUtil.ZERO ;
      AV32PrdCanAny = DecimalUtil.ZERO ;
      AV33PrdPreAct = DecimalUtil.ZERO ;
      AV34BarPri = "" ;
      AV37BarCodPar = "" ;
      P00MQ3_A396EmprCod = new String[] {""} ;
      P00MQ3_A129BarCod = new int[1] ;
      P00MQ3_A132BarCodReo = new byte[1] ;
      P00MQ3_A130BarCodPar = new String[] {""} ;
      P00MQ3_A2808RecLinMAL = new short[1] ;
      P00MQ3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ3_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ3_n1378PrdCFin = new boolean[] {false} ;
      P00MQ3_A719PrdNum = new String[] {""} ;
      P00MQ3_n719PrdNum = new boolean[] {false} ;
      P00MQ3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ3_A209BarPri = new String[] {""} ;
      P00MQ3_A5807LanyLote = new String[] {""} ;
      P00MQ3_n5807LanyLote = new boolean[] {false} ;
      P00MQ3_A1377RecNumAny = new byte[1] ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A5807LanyLote = "" ;
      GXv_char3 = new String[1] ;
      P00MQ4_A396EmprCod = new String[] {""} ;
      P00MQ4_A129BarCod = new int[1] ;
      P00MQ4_A132BarCodReo = new byte[1] ;
      P00MQ4_A130BarCodPar = new String[] {""} ;
      P00MQ4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ4_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ4_A2495BarDosUsa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ4_n2495BarDosUsa = new boolean[] {false} ;
      P00MQ4_A719PrdNum = new String[] {""} ;
      P00MQ4_n719PrdNum = new boolean[] {false} ;
      P00MQ4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ4_A209BarPri = new String[] {""} ;
      P00MQ4_A2494BarDosPro = new String[] {""} ;
      A2495BarDosUsa = DecimalUtil.ZERO ;
      A2494BarDosPro = "" ;
      P00MQ5_A396EmprCod = new String[] {""} ;
      P00MQ5_A688PrdComCod = new String[] {""} ;
      P00MQ5_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ5_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MQ5_A719PrdNum = new String[] {""} ;
      P00MQ5_n719PrdNum = new boolean[] {false} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      GXv_char21 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int12 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int20 = new short[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_int16 = new short[1] ;
      P00MQ6_A396EmprCod = new String[] {""} ;
      P00MQ6_A129BarCod = new int[1] ;
      P00MQ6_A132BarCodReo = new byte[1] ;
      P00MQ6_A130BarCodPar = new String[] {""} ;
      P00MQ6_A2804RecLinMaq = new short[1] ;
      P00MQ6_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV43MaqCod = "" ;
      P00MQ7_A396EmprCod = new String[] {""} ;
      P00MQ7_A602MaqCod = new String[] {""} ;
      P00MQ7_A5100MaqCCoCod = new short[1] ;
      P00MQ7_n5100MaqCCoCod = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pcieccs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pcieccs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pcieccs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcieccs__default(),
         new Object[] {
             new Object[] {
            P00MQ2_A396EmprCod, P00MQ2_A129BarCod, P00MQ2_A132BarCodReo, P00MQ2_A130BarCodPar, P00MQ2_A2804RecLinMaq, P00MQ2_A707PrdFacCon, P00MQ2_A1797PrdCanAny, P00MQ2_A686PrdCant, P00MQ2_A719PrdNum, P00MQ2_n719PrdNum,
            P00MQ2_A5725RecLote, P00MQ2_A724PrdPreAct, P00MQ2_A726PrdPreMed, P00MQ2_A209BarPri, P00MQ2_A1273RecLinPro, P00MQ2_A811RecLin
            }
            , new Object[] {
            P00MQ3_A396EmprCod, P00MQ3_A129BarCod, P00MQ3_A132BarCodReo, P00MQ3_A130BarCodPar, P00MQ3_A2808RecLinMAL, P00MQ3_A707PrdFacCon, P00MQ3_A1378PrdCFin, P00MQ3_n1378PrdCFin, P00MQ3_A719PrdNum, P00MQ3_A724PrdPreAct,
            P00MQ3_A726PrdPreMed, P00MQ3_A209BarPri, P00MQ3_A5807LanyLote, P00MQ3_n5807LanyLote, P00MQ3_A1377RecNumAny
            }
            , new Object[] {
            P00MQ4_A396EmprCod, P00MQ4_A129BarCod, P00MQ4_A132BarCodReo, P00MQ4_A130BarCodPar, P00MQ4_A707PrdFacCon, P00MQ4_A726PrdPreMed, P00MQ4_A2495BarDosUsa, P00MQ4_n2495BarDosUsa, P00MQ4_A719PrdNum, P00MQ4_A724PrdPreAct,
            P00MQ4_A209BarPri, P00MQ4_A2494BarDosPro
            }
            , new Object[] {
            P00MQ5_A396EmprCod, P00MQ5_A688PrdComCod, P00MQ5_A690PrdComFN, P00MQ5_A707PrdFacCon, P00MQ5_A724PrdPreAct, P00MQ5_A726PrdPreMed, P00MQ5_A719PrdNum
            }
            , new Object[] {
            P00MQ6_A396EmprCod, P00MQ6_A129BarCod, P00MQ6_A132BarCodReo, P00MQ6_A130BarCodPar, P00MQ6_A2804RecLinMaq, P00MQ6_A602MaqCod
            }
            , new Object[] {
            P00MQ7_A396EmprCod, P00MQ7_A602MaqCod, P00MQ7_A5100MaqCCoCod, P00MQ7_n5100MaqCCoCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV44Nclec ;
   private byte AV38FlagPreMed ;
   private byte AV39CieLote ;
   private byte AV41CieCCo ;
   private byte GXt_int1 ;
   private byte A1273RecLinPro ;
   private byte AV36BarCodReo ;
   private byte A1377RecNumAny ;
   private byte GXv_int2[] ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV49Maqccocod ;
   private short A2808RecLinMAL ;
   private short GXv_int20[] ;
   private short GXv_int16[] ;
   private short A5100MaqCCoCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV35BarCod ;
   private int GXv_int12[] ;
   private int GXv_int10[] ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV27CCStkCanS ;
   private java.math.BigDecimal AV31PrdCant ;
   private java.math.BigDecimal AV32PrdCanAny ;
   private java.math.BigDecimal AV33PrdPreAct ;
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
   private String AV29CCStkUsu ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A5725RecLote ;
   private String A209BarPri ;
   private String AV40RecLote ;
   private String AV30PrdComCod ;
   private String AV34BarPri ;
   private String AV37BarCodPar ;
   private String A5807LanyLote ;
   private String GXv_char3[] ;
   private String A2494BarDosPro ;
   private String A688PrdComCod ;
   private String GXv_char21[] ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String A602MaqCod ;
   private String AV43MaqCod ;
   private java.util.Date AV28Fecha ;
   private java.util.Date GXv_date19[] ;
   private boolean brkMQ2 ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean brkMQ4 ;
   private boolean n1378PrdCFin ;
   private boolean n5807LanyLote ;
   private boolean brkMQ6 ;
   private boolean n2495BarDosUsa ;
   private boolean n5100MaqCCoCod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00MQ2_A396EmprCod ;
   private int[] P00MQ2_A129BarCod ;
   private byte[] P00MQ2_A132BarCodReo ;
   private String[] P00MQ2_A130BarCodPar ;
   private short[] P00MQ2_A2804RecLinMaq ;
   private java.math.BigDecimal[] P00MQ2_A707PrdFacCon ;
   private java.math.BigDecimal[] P00MQ2_A1797PrdCanAny ;
   private java.math.BigDecimal[] P00MQ2_A686PrdCant ;
   private String[] P00MQ2_A719PrdNum ;
   private boolean[] P00MQ2_n719PrdNum ;
   private String[] P00MQ2_A5725RecLote ;
   private java.math.BigDecimal[] P00MQ2_A724PrdPreAct ;
   private java.math.BigDecimal[] P00MQ2_A726PrdPreMed ;
   private String[] P00MQ2_A209BarPri ;
   private byte[] P00MQ2_A1273RecLinPro ;
   private short[] P00MQ2_A811RecLin ;
   private String[] P00MQ3_A396EmprCod ;
   private int[] P00MQ3_A129BarCod ;
   private byte[] P00MQ3_A132BarCodReo ;
   private String[] P00MQ3_A130BarCodPar ;
   private short[] P00MQ3_A2808RecLinMAL ;
   private java.math.BigDecimal[] P00MQ3_A707PrdFacCon ;
   private java.math.BigDecimal[] P00MQ3_A1378PrdCFin ;
   private boolean[] P00MQ3_n1378PrdCFin ;
   private String[] P00MQ3_A719PrdNum ;
   private boolean[] P00MQ3_n719PrdNum ;
   private java.math.BigDecimal[] P00MQ3_A724PrdPreAct ;
   private java.math.BigDecimal[] P00MQ3_A726PrdPreMed ;
   private String[] P00MQ3_A209BarPri ;
   private String[] P00MQ3_A5807LanyLote ;
   private boolean[] P00MQ3_n5807LanyLote ;
   private byte[] P00MQ3_A1377RecNumAny ;
   private String[] P00MQ4_A396EmprCod ;
   private int[] P00MQ4_A129BarCod ;
   private byte[] P00MQ4_A132BarCodReo ;
   private String[] P00MQ4_A130BarCodPar ;
   private java.math.BigDecimal[] P00MQ4_A707PrdFacCon ;
   private java.math.BigDecimal[] P00MQ4_A726PrdPreMed ;
   private java.math.BigDecimal[] P00MQ4_A2495BarDosUsa ;
   private boolean[] P00MQ4_n2495BarDosUsa ;
   private String[] P00MQ4_A719PrdNum ;
   private boolean[] P00MQ4_n719PrdNum ;
   private java.math.BigDecimal[] P00MQ4_A724PrdPreAct ;
   private String[] P00MQ4_A209BarPri ;
   private String[] P00MQ4_A2494BarDosPro ;
   private String[] P00MQ5_A396EmprCod ;
   private String[] P00MQ5_A688PrdComCod ;
   private java.math.BigDecimal[] P00MQ5_A690PrdComFN ;
   private java.math.BigDecimal[] P00MQ5_A707PrdFacCon ;
   private java.math.BigDecimal[] P00MQ5_A724PrdPreAct ;
   private java.math.BigDecimal[] P00MQ5_A726PrdPreMed ;
   private String[] P00MQ5_A719PrdNum ;
   private boolean[] P00MQ5_n719PrdNum ;
   private String[] P00MQ6_A396EmprCod ;
   private int[] P00MQ6_A129BarCod ;
   private byte[] P00MQ6_A132BarCodReo ;
   private String[] P00MQ6_A130BarCodPar ;
   private short[] P00MQ6_A2804RecLinMaq ;
   private String[] P00MQ6_A602MaqCod ;
   private String[] P00MQ7_A396EmprCod ;
   private String[] P00MQ7_A602MaqCod ;
   private short[] P00MQ7_A5100MaqCCoCod ;
   private boolean[] P00MQ7_n5100MaqCCoCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcieccs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcieccs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcieccs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcieccs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00MQ2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.PrdNum, T1.RecLote, T2.PrdPreAct, T2.PrdPreMed, T3.BarPri, T1.RecLinPro, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00MQ3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T2.PrdFacCon, T1.PrdCFin, T1.PrdNum, T2.PrdPreAct, T2.PrdPreMed, T3.BarPri, T1.LanyLote, T1.RecNumAny FROM ((TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00MQ4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.PrdFacCon, T2.PrdPreMed, T1.BarDosUsa, T1.PrdNum, T2.PrdPreAct, T3.BarPri, T1.BarDosPro FROM ((TXPBARDOS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00MQ5", "SELECT T1.EmprCod, T1.PrdComCod, T1.PrdComFN, T2.PrdFacCon, T2.PrdPreAct, T2.PrdPreMed, T1.PrdNum FROM (TXPLPRDCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00MQ6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00MQ7", "SELECT EmprCod, MaqCod, MaqCCoCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               return;
            case 2 :
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
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 5 :
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
               stmt.setString(2, (String)parms[1], 6);
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
               return;
      }
   }

}

