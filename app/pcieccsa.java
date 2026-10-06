package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcieccsa extends GXProcedure
{
   public pcieccsa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcieccsa.class ), "" );
   }

   public pcieccsa( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           String[] aP5 ,
                           java.util.Date[] aP6 )
   {
      pcieccsa.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        java.util.Date[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 ,
                             byte[] aP7 )
   {
      pcieccsa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcieccsa.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcieccsa.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcieccsa.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcieccsa.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcieccsa.this.AV10CCStkUsu = aP5[0];
      this.aP5 = aP5;
      pcieccsa.this.AV27Ca_diahora = aP6[0];
      this.aP6 = aP6;
      pcieccsa.this.AV29CC_AlmCod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV25NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      pcieccsa.this.GXt_int1 = GXv_int2[0] ;
      AV25NCLec = GXt_int1 ;
      AV19FlagPreMed = (byte)(0) ;
      GXv_int2[0] = AV19FlagPreMed ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int2) ;
      pcieccsa.this.AV19FlagPreMed = GXv_int2[0] ;
      GXt_int1 = AV20CieLote ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIELOT", ""), GXv_int2) ;
      pcieccsa.this.GXt_int1 = GXv_int2[0] ;
      AV20CieLote = GXt_int1 ;
      GXt_int1 = AV22CieCCo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIECCO", ""), GXv_int2) ;
      pcieccsa.this.GXt_int1 = GXv_int2[0] ;
      AV22CieCCo = GXt_int1 ;
      GXt_int1 = AV28Eliot ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int2) ;
      pcieccsa.this.GXt_int1 = GXv_int2[0] ;
      AV28Eliot = GXt_int1 ;
      GXt_int1 = AV30Nalmcc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int2) ;
      pcieccsa.this.GXt_int1 = GXv_int2[0] ;
      AV30Nalmcc = GXt_int1 ;
      AV9Fecha = GXutil.today( ) ;
      /* Using cursor P03BA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk3BA2 = false ;
         A718PrdNom = P03BA2_A718PrdNom[0] ;
         A707PrdFacCon = P03BA2_A707PrdFacCon[0] ;
         A1797PrdCanAny = P03BA2_A1797PrdCanAny[0] ;
         A686PrdCant = P03BA2_A686PrdCant[0] ;
         A719PrdNum = P03BA2_A719PrdNum[0] ;
         n719PrdNum = P03BA2_n719PrdNum[0] ;
         A5725RecLote = P03BA2_A5725RecLote[0] ;
         A724PrdPreAct = P03BA2_A724PrdPreAct[0] ;
         A726PrdPreMed = P03BA2_A726PrdPreMed[0] ;
         A811RecLin = P03BA2_A811RecLin[0] ;
         A209BarPri = P03BA2_A209BarPri[0] ;
         A1273RecLinPro = P03BA2_A1273RecLinPro[0] ;
         A718PrdNom = P03BA2_A718PrdNom[0] ;
         A707PrdFacCon = P03BA2_A707PrdFacCon[0] ;
         A724PrdPreAct = P03BA2_A724PrdPreAct[0] ;
         A726PrdPreMed = P03BA2_A726PrdPreMed[0] ;
         A209BarPri = P03BA2_A209BarPri[0] ;
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
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P03BA2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P03BA2_A129BarCod[0] == A129BarCod ) && ( P03BA2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P03BA2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P03BA2_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(P03BA2_A719PrdNum[0], A719PrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brk3BA2 = false ;
            A707PrdFacCon = P03BA2_A707PrdFacCon[0] ;
            A1797PrdCanAny = P03BA2_A1797PrdCanAny[0] ;
            A686PrdCant = P03BA2_A686PrdCant[0] ;
            A811RecLin = P03BA2_A811RecLin[0] ;
            A1273RecLinPro = P03BA2_A1273RecLinPro[0] ;
            A707PrdFacCon = P03BA2_A707PrdFacCon[0] ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
            {
               AV8CCStkCanS = AV8CCStkCanS.add((((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon))) ;
            }
            else
            {
               AV12PrdCant = AV12PrdCant.add(A686PrdCant) ;
               AV13PrdCanAny = AV13PrdCanAny.add(A1797PrdCanAny) ;
            }
            brk3BA2 = true ;
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
                  Gx_msg = httpContext.getMessage( "Go PNEWCCS. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Linea= ", "") + GXutil.str( A811RecLin, 4, 0) ;
                  System.out.println( Gx_msg );
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
                  GXv_char15[0] = httpContext.getMessage( "Cierre Tinturas Automatico", "") ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV9Fecha ;
                  new app.pnewccs(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_char7, GXv_char8, GXv_decimal9, GXv_int10, GXv_int2, GXv_char11, GXv_int12, GXv_char13, GXv_char14, GXv_char15, GXv_int16, GXv_decimal17, GXv_decimal18, GXv_date19) ;
                  pcieccsa.this.A396EmprCod = GXv_char3[0] ;
                  pcieccsa.this.A719PrdNum = GXv_char4[0] ;
                  pcieccsa.this.AV8CCStkCanS = GXv_decimal6[0] ;
                  pcieccsa.this.A209BarPri = GXv_char8[0] ;
                  pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
                  pcieccsa.this.A129BarCod = GXv_int10[0] ;
                  pcieccsa.this.A132BarCodReo = GXv_int2[0] ;
                  pcieccsa.this.A130BarCodPar = GXv_char11[0] ;
                  pcieccsa.this.AV10CCStkUsu = GXv_char14[0] ;
                  pcieccsa.this.AV9Fecha = GXv_date19[0] ;
                  if ( AV30Nalmcc == 1 )
                  {
                     GXv_char15[0] = A396EmprCod ;
                     GXv_char14[0] = A719PrdNum ;
                     GXv_decimal18[0] = AV8CCStkCanS ;
                     GXv_char13[0] = httpContext.getMessage( "SC", "") ;
                     GXv_decimal17[0] = AV14PrdPreAct ;
                     GXv_char11[0] = AV10CCStkUsu ;
                     GXv_char8[0] = httpContext.getMessage( "Cierre Tinturas Automatico", "") ;
                     GXv_dtime20[0] = AV27Ca_diahora ;
                     GXv_int2[0] = AV29CC_AlmCod ;
                     GXv_int12[0] = A129BarCod ;
                     GXv_int21[0] = A132BarCodReo ;
                     GXv_char7[0] = A130BarCodPar ;
                     new app.pccalm8(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_char13, GXv_decimal17, GXv_char11, GXv_char8, GXv_dtime20, GXv_int2, GXv_int12, GXv_int21, GXv_char7) ;
                     pcieccsa.this.A396EmprCod = GXv_char15[0] ;
                     pcieccsa.this.A719PrdNum = GXv_char14[0] ;
                     pcieccsa.this.AV8CCStkCanS = GXv_decimal18[0] ;
                     pcieccsa.this.AV14PrdPreAct = GXv_decimal17[0] ;
                     pcieccsa.this.AV10CCStkUsu = GXv_char11[0] ;
                     pcieccsa.this.AV27Ca_diahora = GXv_dtime20[0] ;
                     pcieccsa.this.AV29CC_AlmCod = GXv_int2[0] ;
                     pcieccsa.this.A129BarCod = GXv_int12[0] ;
                     pcieccsa.this.A132BarCodReo = GXv_int21[0] ;
                     pcieccsa.this.A130BarCodPar = GXv_char7[0] ;
                  }
               }
               else
               {
                  Gx_msg = httpContext.getMessage( "Go PNEWCC3. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Linea= ", "") + GXutil.str( A811RecLin, 4, 0) ;
                  System.out.println( Gx_msg );
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
                  GXv_char3[0] = httpContext.getMessage( "Cierre Tinturas Automatico", "") ;
                  GXv_int16[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV9Fecha ;
                  GXv_int22[0] = AV36Maqccocod ;
                  new app.pnewcc3(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int21, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int16, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int22) ;
                  pcieccsa.this.A396EmprCod = GXv_char15[0] ;
                  pcieccsa.this.A719PrdNum = GXv_char14[0] ;
                  pcieccsa.this.AV8CCStkCanS = GXv_decimal17[0] ;
                  pcieccsa.this.A209BarPri = GXv_char11[0] ;
                  pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
                  pcieccsa.this.A129BarCod = GXv_int12[0] ;
                  pcieccsa.this.A132BarCodReo = GXv_int21[0] ;
                  pcieccsa.this.A130BarCodPar = GXv_char8[0] ;
                  pcieccsa.this.AV10CCStkUsu = GXv_char4[0] ;
                  pcieccsa.this.AV9Fecha = GXv_date19[0] ;
                  pcieccsa.this.AV36Maqccocod = GXv_int22[0] ;
               }
            }
            else
            {
               if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) != 0 )
               {
                  Gx_msg = httpContext.getMessage( "Go PNEWCCSL. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Linea= ", "") + GXutil.str( A811RecLin, 4, 0) ;
                  System.out.println( Gx_msg );
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
                  GXv_char3[0] = httpContext.getMessage( "Cierre Tinturas Automatico", "") ;
                  GXv_int22[0] = (short)(0) ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date19[0] = AV9Fecha ;
                  GXv_char23[0] = AV21RecLote ;
                  new app.pnewccsl(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_decimal18, GXv_decimal17, GXv_char13, GXv_char11, GXv_decimal9, GXv_int12, GXv_int21, GXv_char8, GXv_int10, GXv_char7, GXv_char4, GXv_char3, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char23) ;
                  pcieccsa.this.A396EmprCod = GXv_char15[0] ;
                  pcieccsa.this.A719PrdNum = GXv_char14[0] ;
                  pcieccsa.this.AV8CCStkCanS = GXv_decimal17[0] ;
                  pcieccsa.this.A209BarPri = GXv_char11[0] ;
                  pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
                  pcieccsa.this.A129BarCod = GXv_int12[0] ;
                  pcieccsa.this.A132BarCodReo = GXv_int21[0] ;
                  pcieccsa.this.A130BarCodPar = GXv_char8[0] ;
                  pcieccsa.this.AV10CCStkUsu = GXv_char4[0] ;
                  pcieccsa.this.AV9Fecha = GXv_date19[0] ;
                  pcieccsa.this.AV21RecLote = GXv_char23[0] ;
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
         Gx_msg = httpContext.getMessage( "Insert TABLA CONSC. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Linea= ", "") + GXutil.str( A811RecLin, 4, 0) ;
         System.out.println( Gx_msg );
         /*
            INSERT RECORD ON TABLE TXPCONSC

         */
         W396EmprCod = A396EmprCod ;
         A8635Ca_DiaHora = AV27Ca_diahora ;
         A8638Ca_PrdNom = A718PrdNom ;
         n8638Ca_PrdNom = false ;
         A8634Ca_Prdnum = A719PrdNum ;
         if ( DecimalUtil.compareTo(AV8CCStkCanS, DecimalUtil.stringToDec("9999999.9999")) > 0 )
         {
            A8637Ca_Cant = DecimalUtil.stringToDec("9999999.9999") ;
            n8637Ca_Cant = false ;
         }
         else
         {
            A8637Ca_Cant = AV8CCStkCanS ;
            n8637Ca_Cant = false ;
         }
         if ( DecimalUtil.compareTo((AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))), DecimalUtil.stringToDec("9999999.999")) > 0 )
         {
            A8636Ca_Prdcant = DecimalUtil.stringToDec("9999999.999") ;
            n8636Ca_Prdcant = false ;
         }
         else
         {
            A8636Ca_Prdcant = AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
            n8636Ca_Prdcant = false ;
         }
         /* Using cursor P03BA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8638Ca_PrdNom), A8638Ca_PrdNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P03BA4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A396EmprCod = P03BA4_A396EmprCod[0] ;
               A8634Ca_Prdnum = P03BA4_A8634Ca_Prdnum[0] ;
               A8635Ca_DiaHora = P03BA4_A8635Ca_DiaHora[0] ;
               A8637Ca_Cant = P03BA4_A8637Ca_Cant[0] ;
               n8637Ca_Cant = P03BA4_n8637Ca_Cant[0] ;
               A8636Ca_Prdcant = P03BA4_A8636Ca_Prdcant[0] ;
               n8636Ca_Prdcant = P03BA4_n8636Ca_Prdcant[0] ;
               if ( DecimalUtil.compareTo((A8637Ca_Cant.add(AV8CCStkCanS)), DecimalUtil.stringToDec("9999999.9999")) > 0 )
               {
                  A8637Ca_Cant = DecimalUtil.stringToDec("9999999.9999") ;
                  n8637Ca_Cant = false ;
               }
               else
               {
                  A8637Ca_Cant = A8637Ca_Cant.add(AV8CCStkCanS) ;
                  n8637Ca_Cant = false ;
               }
               if ( DecimalUtil.compareTo((A8636Ca_Prdcant.add((AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))))), DecimalUtil.stringToDec("9999999.999")) > 0 )
               {
                  A8636Ca_Prdcant = DecimalUtil.stringToDec("9999999.999") ;
                  n8636Ca_Prdcant = false ;
               }
               else
               {
                  A8636Ca_Prdcant = A8636Ca_Prdcant.add(((AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))))) ;
                  n8636Ca_Prdcant = false ;
               }
               /* Using cursor P03BA5 */
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
         System.out.println( Gx_msg );
         A396EmprCod = W396EmprCod ;
         if ( ! brk3BA2 )
         {
            brk3BA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /* Using cursor P03BA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk3BA6 = false ;
         A2808RecLinMAL = P03BA6_A2808RecLinMAL[0] ;
         A718PrdNom = P03BA6_A718PrdNom[0] ;
         A707PrdFacCon = P03BA6_A707PrdFacCon[0] ;
         A1378PrdCFin = P03BA6_A1378PrdCFin[0] ;
         n1378PrdCFin = P03BA6_n1378PrdCFin[0] ;
         A719PrdNum = P03BA6_A719PrdNum[0] ;
         n719PrdNum = P03BA6_n719PrdNum[0] ;
         A724PrdPreAct = P03BA6_A724PrdPreAct[0] ;
         A726PrdPreMed = P03BA6_A726PrdPreMed[0] ;
         A209BarPri = P03BA6_A209BarPri[0] ;
         A5807LanyLote = P03BA6_A5807LanyLote[0] ;
         n5807LanyLote = P03BA6_n5807LanyLote[0] ;
         A1377RecNumAny = P03BA6_A1377RecNumAny[0] ;
         A718PrdNom = P03BA6_A718PrdNom[0] ;
         A707PrdFacCon = P03BA6_A707PrdFacCon[0] ;
         A724PrdPreAct = P03BA6_A724PrdPreAct[0] ;
         A726PrdPreMed = P03BA6_A726PrdPreMed[0] ;
         A209BarPri = P03BA6_A209BarPri[0] ;
         W396EmprCod = A396EmprCod ;
         AV8CCStkCanS = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P03BA6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P03BA6_A129BarCod[0] == A129BarCod ) && ( P03BA6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P03BA6_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P03BA6_A2808RecLinMAL[0] == A2808RecLinMAL ) && ( GXutil.strcmp(P03BA6_A719PrdNum[0], A719PrdNum) == 0 ) ) )
            {
               if (true) break;
            }
            brk3BA6 = false ;
            A707PrdFacCon = P03BA6_A707PrdFacCon[0] ;
            A1378PrdCFin = P03BA6_A1378PrdCFin[0] ;
            n1378PrdCFin = P03BA6_n1378PrdCFin[0] ;
            A1377RecNumAny = P03BA6_A1377RecNumAny[0] ;
            A707PrdFacCon = P03BA6_A707PrdFacCon[0] ;
            AV8CCStkCanS = AV8CCStkCanS.add((A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon)) ;
            brk3BA6 = true ;
            pr_default.readNext(4);
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
               Gx_msg = httpContext.getMessage( "Añadidas.Go PNEWCCS. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Producto=", "") + A719PrdNum ;
               System.out.println( Gx_msg );
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
               GXv_char4[0] = httpContext.getMessage( "C Tintura Añadidas Pc Ind Aut", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV9Fecha ;
               new app.pnewccs(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
               pcieccsa.this.A396EmprCod = GXv_char23[0] ;
               pcieccsa.this.A719PrdNum = GXv_char15[0] ;
               pcieccsa.this.AV8CCStkCanS = GXv_decimal17[0] ;
               pcieccsa.this.A209BarPri = GXv_char13[0] ;
               pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
               pcieccsa.this.A129BarCod = GXv_int12[0] ;
               pcieccsa.this.A132BarCodReo = GXv_int21[0] ;
               pcieccsa.this.A130BarCodPar = GXv_char11[0] ;
               pcieccsa.this.AV10CCStkUsu = GXv_char7[0] ;
               pcieccsa.this.AV9Fecha = GXv_date19[0] ;
               if ( AV30Nalmcc == 1 )
               {
                  GXv_char23[0] = A396EmprCod ;
                  GXv_char15[0] = A719PrdNum ;
                  GXv_decimal18[0] = AV8CCStkCanS ;
                  GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                  GXv_decimal17[0] = AV14PrdPreAct ;
                  GXv_char13[0] = AV10CCStkUsu ;
                  GXv_char11[0] = httpContext.getMessage( "C Tintura Añadidas Pc Ind Aut", "") ;
                  GXv_dtime20[0] = AV27Ca_diahora ;
                  GXv_int21[0] = AV29CC_AlmCod ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  new app.pccalm8(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
                  pcieccsa.this.A396EmprCod = GXv_char23[0] ;
                  pcieccsa.this.A719PrdNum = GXv_char15[0] ;
                  pcieccsa.this.AV8CCStkCanS = GXv_decimal18[0] ;
                  pcieccsa.this.AV14PrdPreAct = GXv_decimal17[0] ;
                  pcieccsa.this.AV10CCStkUsu = GXv_char13[0] ;
                  pcieccsa.this.AV27Ca_diahora = GXv_dtime20[0] ;
                  pcieccsa.this.AV29CC_AlmCod = GXv_int21[0] ;
                  pcieccsa.this.A129BarCod = GXv_int12[0] ;
                  pcieccsa.this.A132BarCodReo = GXv_int2[0] ;
                  pcieccsa.this.A130BarCodPar = GXv_char8[0] ;
               }
            }
            else
            {
               Gx_msg = httpContext.getMessage( "Añadidas.Go PNEWCC3. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( "P roducto=", "") + A719PrdNum ;
               System.out.println( Gx_msg );
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
               GXv_char4[0] = httpContext.getMessage( "C Tintura Añadidas Pc Ind Aut", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV9Fecha ;
               GXv_int16[0] = AV36Maqccocod ;
               new app.pnewcc3(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
               pcieccsa.this.A396EmprCod = GXv_char23[0] ;
               pcieccsa.this.A719PrdNum = GXv_char15[0] ;
               pcieccsa.this.AV8CCStkCanS = GXv_decimal17[0] ;
               pcieccsa.this.A209BarPri = GXv_char13[0] ;
               pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
               pcieccsa.this.A129BarCod = GXv_int12[0] ;
               pcieccsa.this.A132BarCodReo = GXv_int21[0] ;
               pcieccsa.this.A130BarCodPar = GXv_char11[0] ;
               pcieccsa.this.AV10CCStkUsu = GXv_char7[0] ;
               pcieccsa.this.AV9Fecha = GXv_date19[0] ;
               pcieccsa.this.AV36Maqccocod = GXv_int16[0] ;
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
            GXv_char4[0] = httpContext.getMessage( "C Tintura Añadidas Pc Ind Aut", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV9Fecha ;
            GXv_char3[0] = A5807LanyLote ;
            new app.pnewccsl(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_char3) ;
            pcieccsa.this.A396EmprCod = GXv_char23[0] ;
            pcieccsa.this.A719PrdNum = GXv_char15[0] ;
            pcieccsa.this.AV8CCStkCanS = GXv_decimal17[0] ;
            pcieccsa.this.A209BarPri = GXv_char13[0] ;
            pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
            pcieccsa.this.A129BarCod = GXv_int12[0] ;
            pcieccsa.this.A132BarCodReo = GXv_int21[0] ;
            pcieccsa.this.A130BarCodPar = GXv_char11[0] ;
            pcieccsa.this.AV10CCStkUsu = GXv_char7[0] ;
            pcieccsa.this.AV9Fecha = GXv_date19[0] ;
            pcieccsa.this.A5807LanyLote = GXv_char3[0] ;
         }
         Gx_msg = httpContext.getMessage( "Añadidas.Insert TABLA CONSC. ", "") + httpContext.getMessage( "Cerrando Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Producto=", "") + A719PrdNum ;
         System.out.println( Gx_msg );
         /*
            INSERT RECORD ON TABLE TXPCONSC

         */
         W396EmprCod = A396EmprCod ;
         A8635Ca_DiaHora = AV27Ca_diahora ;
         A8638Ca_PrdNom = A718PrdNom ;
         n8638Ca_PrdNom = false ;
         A8634Ca_Prdnum = A719PrdNum ;
         if ( DecimalUtil.compareTo(AV8CCStkCanS, DecimalUtil.stringToDec("9999999.9999")) > 0 )
         {
            A8637Ca_Cant = DecimalUtil.stringToDec("9999999.9999") ;
            n8637Ca_Cant = false ;
         }
         else
         {
            A8637Ca_Cant = AV8CCStkCanS ;
            n8637Ca_Cant = false ;
         }
         if ( DecimalUtil.compareTo((AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))), DecimalUtil.stringToDec("9999999.999")) > 0 )
         {
            A8636Ca_Prdcant = DecimalUtil.stringToDec("9999999.999") ;
            n8636Ca_Prdcant = false ;
         }
         else
         {
            A8636Ca_Prdcant = AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000)) ;
            n8636Ca_Prdcant = false ;
         }
         /* Using cursor P03BA7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora, Boolean.valueOf(n8636Ca_Prdcant), A8636Ca_Prdcant, Boolean.valueOf(n8637Ca_Cant), A8637Ca_Cant, Boolean.valueOf(n8638Ca_PrdNom), A8638Ca_PrdNom});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONSC");
         if ( (pr_default.getStatus(5) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P03BA8 */
            pr_default.execute(6, new Object[] {A396EmprCod, A8634Ca_Prdnum, A8635Ca_DiaHora});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A396EmprCod = P03BA8_A396EmprCod[0] ;
               A8634Ca_Prdnum = P03BA8_A8634Ca_Prdnum[0] ;
               A8635Ca_DiaHora = P03BA8_A8635Ca_DiaHora[0] ;
               A8637Ca_Cant = P03BA8_A8637Ca_Cant[0] ;
               n8637Ca_Cant = P03BA8_n8637Ca_Cant[0] ;
               A8636Ca_Prdcant = P03BA8_A8636Ca_Prdcant[0] ;
               n8636Ca_Prdcant = P03BA8_n8636Ca_Prdcant[0] ;
               if ( DecimalUtil.compareTo((A8637Ca_Cant.add(AV8CCStkCanS)), DecimalUtil.stringToDec("9999999.9999")) > 0 )
               {
                  A8637Ca_Cant = DecimalUtil.stringToDec("9999999.9999") ;
                  n8637Ca_Cant = false ;
               }
               else
               {
                  A8637Ca_Cant = A8637Ca_Cant.add(AV8CCStkCanS) ;
                  n8637Ca_Cant = false ;
               }
               if ( DecimalUtil.compareTo((A8636Ca_Prdcant.add((AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))))), DecimalUtil.stringToDec("9999999.999")) > 0 )
               {
                  A8636Ca_Prdcant = DecimalUtil.stringToDec("9999999.999") ;
                  n8636Ca_Prdcant = false ;
               }
               else
               {
                  A8636Ca_Prdcant = A8636Ca_Prdcant.add(((AV8CCStkCanS.multiply(DecimalUtil.doubleToDec(1000))))) ;
                  n8636Ca_Prdcant = false ;
               }
               /* Using cursor P03BA9 */
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
         System.out.println( Gx_msg );
         A396EmprCod = W396EmprCod ;
         if ( ! brk3BA6 )
         {
            brk3BA6 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
      /* Using cursor P03BA10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk3BA10 = false ;
         A707PrdFacCon = P03BA10_A707PrdFacCon[0] ;
         A726PrdPreMed = P03BA10_A726PrdPreMed[0] ;
         A2495BarDosUsa = P03BA10_A2495BarDosUsa[0] ;
         n2495BarDosUsa = P03BA10_n2495BarDosUsa[0] ;
         A719PrdNum = P03BA10_A719PrdNum[0] ;
         n719PrdNum = P03BA10_n719PrdNum[0] ;
         A724PrdPreAct = P03BA10_A724PrdPreAct[0] ;
         A209BarPri = P03BA10_A209BarPri[0] ;
         A2494BarDosPro = P03BA10_A2494BarDosPro[0] ;
         A707PrdFacCon = P03BA10_A707PrdFacCon[0] ;
         A726PrdPreMed = P03BA10_A726PrdPreMed[0] ;
         A724PrdPreAct = P03BA10_A724PrdPreAct[0] ;
         A209BarPri = P03BA10_A209BarPri[0] ;
         if ( A129BarCod != 99999999 )
         {
            AV8CCStkCanS = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P03BA10_A396EmprCod[0], A396EmprCod) == 0 ) && ( P03BA10_A129BarCod[0] == A129BarCod ) && ( P03BA10_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P03BA10_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               if ( ! ( ( GXutil.strcmp(P03BA10_A719PrdNum[0], A719PrdNum) == 0 ) ) )
               {
                  if (true) break;
               }
               brk3BA10 = false ;
               A707PrdFacCon = P03BA10_A707PrdFacCon[0] ;
               A726PrdPreMed = P03BA10_A726PrdPreMed[0] ;
               A2495BarDosUsa = P03BA10_A2495BarDosUsa[0] ;
               n2495BarDosUsa = P03BA10_n2495BarDosUsa[0] ;
               A2494BarDosPro = P03BA10_A2494BarDosPro[0] ;
               A707PrdFacCon = P03BA10_A707PrdFacCon[0] ;
               A726PrdPreMed = P03BA10_A726PrdPreMed[0] ;
               AV8CCStkCanS = AV8CCStkCanS.add((A2495BarDosUsa.multiply(A726PrdPreMed).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               brk3BA10 = true ;
               pr_default.readNext(8);
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
               GXv_char4[0] = httpContext.getMessage( "C Tinturas Dosificadora Aut.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV9Fecha ;
               new app.pnewccs(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
               pcieccsa.this.A396EmprCod = GXv_char23[0] ;
               pcieccsa.this.A719PrdNum = GXv_char15[0] ;
               pcieccsa.this.AV8CCStkCanS = GXv_decimal17[0] ;
               pcieccsa.this.A209BarPri = GXv_char13[0] ;
               pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
               pcieccsa.this.A129BarCod = GXv_int12[0] ;
               pcieccsa.this.A132BarCodReo = GXv_int21[0] ;
               pcieccsa.this.A130BarCodPar = GXv_char11[0] ;
               pcieccsa.this.AV10CCStkUsu = GXv_char7[0] ;
               pcieccsa.this.AV9Fecha = GXv_date19[0] ;
               if ( AV30Nalmcc == 1 )
               {
                  GXv_char23[0] = A396EmprCod ;
                  GXv_char15[0] = A719PrdNum ;
                  GXv_decimal18[0] = AV8CCStkCanS ;
                  GXv_char14[0] = httpContext.getMessage( "SC", "") ;
                  GXv_decimal17[0] = AV14PrdPreAct ;
                  GXv_char13[0] = AV10CCStkUsu ;
                  GXv_char11[0] = httpContext.getMessage( "C Tinturas Dosificadora Aut.", "") ;
                  GXv_dtime20[0] = AV27Ca_diahora ;
                  GXv_int21[0] = AV29CC_AlmCod ;
                  GXv_int12[0] = A129BarCod ;
                  GXv_int2[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  new app.pccalm8(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
                  pcieccsa.this.A396EmprCod = GXv_char23[0] ;
                  pcieccsa.this.A719PrdNum = GXv_char15[0] ;
                  pcieccsa.this.AV8CCStkCanS = GXv_decimal18[0] ;
                  pcieccsa.this.AV14PrdPreAct = GXv_decimal17[0] ;
                  pcieccsa.this.AV10CCStkUsu = GXv_char13[0] ;
                  pcieccsa.this.AV27Ca_diahora = GXv_dtime20[0] ;
                  pcieccsa.this.AV29CC_AlmCod = GXv_int21[0] ;
                  pcieccsa.this.A129BarCod = GXv_int12[0] ;
                  pcieccsa.this.A132BarCodReo = GXv_int2[0] ;
                  pcieccsa.this.A130BarCodPar = GXv_char8[0] ;
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
               GXv_char4[0] = httpContext.getMessage( "C Tinturas Dosificadora Aut.", "") ;
               GXv_int22[0] = (short)(0) ;
               GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date19[0] = AV9Fecha ;
               GXv_int16[0] = AV36Maqccocod ;
               new app.pnewcc3(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
               pcieccsa.this.A396EmprCod = GXv_char23[0] ;
               pcieccsa.this.A719PrdNum = GXv_char15[0] ;
               pcieccsa.this.AV8CCStkCanS = GXv_decimal17[0] ;
               pcieccsa.this.A209BarPri = GXv_char13[0] ;
               pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
               pcieccsa.this.A129BarCod = GXv_int12[0] ;
               pcieccsa.this.A132BarCodReo = GXv_int21[0] ;
               pcieccsa.this.A130BarCodPar = GXv_char11[0] ;
               pcieccsa.this.AV10CCStkUsu = GXv_char7[0] ;
               pcieccsa.this.AV9Fecha = GXv_date19[0] ;
               pcieccsa.this.AV36Maqccocod = GXv_int16[0] ;
            }
         }
         if ( ! brk3BA10 )
         {
            brk3BA10 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
      if ( AV25NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcieccsa");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUES' Routine */
      returnInSub = false ;
      /* Using cursor P03BA11 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV11PrdComCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A688PrdComCod = P03BA11_A688PrdComCod[0] ;
         A690PrdComFN = P03BA11_A690PrdComFN[0] ;
         A707PrdFacCon = P03BA11_A707PrdFacCon[0] ;
         A724PrdPreAct = P03BA11_A724PrdPreAct[0] ;
         A726PrdPreMed = P03BA11_A726PrdPreMed[0] ;
         A719PrdNum = P03BA11_A719PrdNum[0] ;
         n719PrdNum = P03BA11_n719PrdNum[0] ;
         A707PrdFacCon = P03BA11_A707PrdFacCon[0] ;
         A724PrdPreAct = P03BA11_A724PrdPreAct[0] ;
         A726PrdPreMed = P03BA11_A726PrdPreMed[0] ;
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
            GXv_char4[0] = httpContext.getMessage( "C Tinturas compuesto Aut.", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV9Fecha ;
            new app.pnewccs(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19) ;
            pcieccsa.this.A396EmprCod = GXv_char23[0] ;
            pcieccsa.this.A719PrdNum = GXv_char15[0] ;
            pcieccsa.this.AV8CCStkCanS = GXv_decimal17[0] ;
            pcieccsa.this.AV15BarPri = GXv_char13[0] ;
            pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
            pcieccsa.this.AV16BarCod = GXv_int12[0] ;
            pcieccsa.this.AV17BarCodReo = GXv_int21[0] ;
            pcieccsa.this.AV18BarCodPar = GXv_char11[0] ;
            pcieccsa.this.AV10CCStkUsu = GXv_char7[0] ;
            pcieccsa.this.AV9Fecha = GXv_date19[0] ;
            if ( AV30Nalmcc == 1 )
            {
               GXv_char23[0] = A396EmprCod ;
               GXv_char15[0] = A719PrdNum ;
               GXv_decimal18[0] = AV8CCStkCanS ;
               GXv_char14[0] = httpContext.getMessage( "SC", "") ;
               GXv_decimal17[0] = AV14PrdPreAct ;
               GXv_char13[0] = AV10CCStkUsu ;
               GXv_char11[0] = httpContext.getMessage( "C Tinturas compuesto Aut.", "") ;
               GXv_dtime20[0] = AV27Ca_diahora ;
               GXv_int21[0] = AV29CC_AlmCod ;
               GXv_int12[0] = AV16BarCod ;
               GXv_int2[0] = AV17BarCodReo ;
               GXv_char8[0] = AV18BarCodPar ;
               new app.pccalm8(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_char14, GXv_decimal17, GXv_char13, GXv_char11, GXv_dtime20, GXv_int21, GXv_int12, GXv_int2, GXv_char8) ;
               pcieccsa.this.A396EmprCod = GXv_char23[0] ;
               pcieccsa.this.A719PrdNum = GXv_char15[0] ;
               pcieccsa.this.AV8CCStkCanS = GXv_decimal18[0] ;
               pcieccsa.this.AV14PrdPreAct = GXv_decimal17[0] ;
               pcieccsa.this.AV10CCStkUsu = GXv_char13[0] ;
               pcieccsa.this.AV27Ca_diahora = GXv_dtime20[0] ;
               pcieccsa.this.AV29CC_AlmCod = GXv_int21[0] ;
               pcieccsa.this.AV16BarCod = GXv_int12[0] ;
               pcieccsa.this.AV17BarCodReo = GXv_int2[0] ;
               pcieccsa.this.AV18BarCodPar = GXv_char8[0] ;
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
            GXv_char4[0] = httpContext.getMessage( "C Tinturas compuesto Aut.", "") ;
            GXv_int22[0] = (short)(0) ;
            GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date19[0] = AV9Fecha ;
            GXv_int16[0] = AV36Maqccocod ;
            new app.pnewcc3(remoteHandle, context).execute( GXv_char23, GXv_char15, GXv_decimal18, GXv_decimal17, GXv_char14, GXv_char13, GXv_decimal9, GXv_int12, GXv_int21, GXv_char11, GXv_int10, GXv_char8, GXv_char7, GXv_char4, GXv_int22, GXv_decimal6, GXv_decimal5, GXv_date19, GXv_int16) ;
            pcieccsa.this.A396EmprCod = GXv_char23[0] ;
            pcieccsa.this.A719PrdNum = GXv_char15[0] ;
            pcieccsa.this.AV8CCStkCanS = GXv_decimal17[0] ;
            pcieccsa.this.AV15BarPri = GXv_char13[0] ;
            pcieccsa.this.AV14PrdPreAct = GXv_decimal9[0] ;
            pcieccsa.this.AV16BarCod = GXv_int12[0] ;
            pcieccsa.this.AV17BarCodReo = GXv_int21[0] ;
            pcieccsa.this.AV18BarCodPar = GXv_char11[0] ;
            pcieccsa.this.AV10CCStkUsu = GXv_char7[0] ;
            pcieccsa.this.AV9Fecha = GXv_date19[0] ;
            pcieccsa.this.AV36Maqccocod = GXv_int16[0] ;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S121( )
   {
      /* 'CCO' Routine */
      returnInSub = false ;
      /* Using cursor P03BA12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A602MaqCod = P03BA12_A602MaqCod[0] ;
         AV24MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      /* Using cursor P03BA13 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV24MaqCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A602MaqCod = P03BA13_A602MaqCod[0] ;
         A5100MaqCCoCod = P03BA13_A5100MaqCCoCod[0] ;
         n5100MaqCCoCod = P03BA13_n5100MaqCCoCod[0] ;
         AV36Maqccocod = A5100MaqCCoCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcieccsa.this.A396EmprCod;
      this.aP1[0] = pcieccsa.this.A129BarCod;
      this.aP2[0] = pcieccsa.this.A132BarCodReo;
      this.aP3[0] = pcieccsa.this.A130BarCodPar;
      this.aP4[0] = pcieccsa.this.A2804RecLinMaq;
      this.aP5[0] = pcieccsa.this.AV10CCStkUsu;
      this.aP6[0] = pcieccsa.this.AV27Ca_diahora;
      this.aP7[0] = pcieccsa.this.AV29CC_AlmCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Fecha = GXutil.nullDate() ;
      scmdbuf = "" ;
      P03BA2_A396EmprCod = new String[] {""} ;
      P03BA2_A129BarCod = new int[1] ;
      P03BA2_A132BarCodReo = new byte[1] ;
      P03BA2_A130BarCodPar = new String[] {""} ;
      P03BA2_A2804RecLinMaq = new short[1] ;
      P03BA2_A718PrdNom = new String[] {""} ;
      P03BA2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA2_A719PrdNum = new String[] {""} ;
      P03BA2_n719PrdNum = new boolean[] {false} ;
      P03BA2_A5725RecLote = new String[] {""} ;
      P03BA2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA2_A811RecLin = new short[1] ;
      P03BA2_A209BarPri = new String[] {""} ;
      P03BA2_A1273RecLinPro = new byte[1] ;
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
      Gx_msg = "" ;
      AV15BarPri = "" ;
      AV18BarCodPar = "" ;
      A8635Ca_DiaHora = GXutil.resetTime( GXutil.nullDate() );
      A8638Ca_PrdNom = "" ;
      A8634Ca_Prdnum = "" ;
      A8637Ca_Cant = DecimalUtil.ZERO ;
      A8636Ca_Prdcant = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P03BA4_A396EmprCod = new String[] {""} ;
      P03BA4_A8634Ca_Prdnum = new String[] {""} ;
      P03BA4_A8635Ca_DiaHora = new java.util.Date[] {GXutil.nullDate()} ;
      P03BA4_A8637Ca_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA4_n8637Ca_Cant = new boolean[] {false} ;
      P03BA4_A8636Ca_Prdcant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA4_n8636Ca_Prdcant = new boolean[] {false} ;
      P03BA6_A396EmprCod = new String[] {""} ;
      P03BA6_A129BarCod = new int[1] ;
      P03BA6_A132BarCodReo = new byte[1] ;
      P03BA6_A130BarCodPar = new String[] {""} ;
      P03BA6_A2808RecLinMAL = new short[1] ;
      P03BA6_A718PrdNom = new String[] {""} ;
      P03BA6_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA6_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA6_n1378PrdCFin = new boolean[] {false} ;
      P03BA6_A719PrdNum = new String[] {""} ;
      P03BA6_n719PrdNum = new boolean[] {false} ;
      P03BA6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA6_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA6_A209BarPri = new String[] {""} ;
      P03BA6_A5807LanyLote = new String[] {""} ;
      P03BA6_n5807LanyLote = new boolean[] {false} ;
      P03BA6_A1377RecNumAny = new byte[1] ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A5807LanyLote = "" ;
      GXv_char3 = new String[1] ;
      P03BA8_A396EmprCod = new String[] {""} ;
      P03BA8_A8634Ca_Prdnum = new String[] {""} ;
      P03BA8_A8635Ca_DiaHora = new java.util.Date[] {GXutil.nullDate()} ;
      P03BA8_A8637Ca_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA8_n8637Ca_Cant = new boolean[] {false} ;
      P03BA8_A8636Ca_Prdcant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA8_n8636Ca_Prdcant = new boolean[] {false} ;
      P03BA10_A396EmprCod = new String[] {""} ;
      P03BA10_A129BarCod = new int[1] ;
      P03BA10_A132BarCodReo = new byte[1] ;
      P03BA10_A130BarCodPar = new String[] {""} ;
      P03BA10_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA10_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA10_A2495BarDosUsa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA10_n2495BarDosUsa = new boolean[] {false} ;
      P03BA10_A719PrdNum = new String[] {""} ;
      P03BA10_n719PrdNum = new boolean[] {false} ;
      P03BA10_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA10_A209BarPri = new String[] {""} ;
      P03BA10_A2494BarDosPro = new String[] {""} ;
      A2495BarDosUsa = DecimalUtil.ZERO ;
      A2494BarDosPro = "" ;
      P03BA11_A396EmprCod = new String[] {""} ;
      P03BA11_A688PrdComCod = new String[] {""} ;
      P03BA11_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA11_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA11_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA11_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BA11_A719PrdNum = new String[] {""} ;
      P03BA11_n719PrdNum = new boolean[] {false} ;
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
      P03BA12_A396EmprCod = new String[] {""} ;
      P03BA12_A129BarCod = new int[1] ;
      P03BA12_A132BarCodReo = new byte[1] ;
      P03BA12_A130BarCodPar = new String[] {""} ;
      P03BA12_A2804RecLinMaq = new short[1] ;
      P03BA12_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV24MaqCod = "" ;
      P03BA13_A396EmprCod = new String[] {""} ;
      P03BA13_A602MaqCod = new String[] {""} ;
      P03BA13_A5100MaqCCoCod = new short[1] ;
      P03BA13_n5100MaqCCoCod = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pcieccsa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pcieccsa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pcieccsa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcieccsa__default(),
         new Object[] {
             new Object[] {
            P03BA2_A396EmprCod, P03BA2_A129BarCod, P03BA2_A132BarCodReo, P03BA2_A130BarCodPar, P03BA2_A2804RecLinMaq, P03BA2_A718PrdNom, P03BA2_A707PrdFacCon, P03BA2_A1797PrdCanAny, P03BA2_A686PrdCant, P03BA2_A719PrdNum,
            P03BA2_n719PrdNum, P03BA2_A5725RecLote, P03BA2_A724PrdPreAct, P03BA2_A726PrdPreMed, P03BA2_A811RecLin, P03BA2_A209BarPri, P03BA2_A1273RecLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            P03BA4_A396EmprCod, P03BA4_A8634Ca_Prdnum, P03BA4_A8635Ca_DiaHora, P03BA4_A8637Ca_Cant, P03BA4_n8637Ca_Cant, P03BA4_A8636Ca_Prdcant, P03BA4_n8636Ca_Prdcant
            }
            , new Object[] {
            }
            , new Object[] {
            P03BA6_A396EmprCod, P03BA6_A129BarCod, P03BA6_A132BarCodReo, P03BA6_A130BarCodPar, P03BA6_A2808RecLinMAL, P03BA6_A718PrdNom, P03BA6_A707PrdFacCon, P03BA6_A1378PrdCFin, P03BA6_n1378PrdCFin, P03BA6_A719PrdNum,
            P03BA6_A724PrdPreAct, P03BA6_A726PrdPreMed, P03BA6_A209BarPri, P03BA6_A5807LanyLote, P03BA6_n5807LanyLote, P03BA6_A1377RecNumAny
            }
            , new Object[] {
            }
            , new Object[] {
            P03BA8_A396EmprCod, P03BA8_A8634Ca_Prdnum, P03BA8_A8635Ca_DiaHora, P03BA8_A8637Ca_Cant, P03BA8_n8637Ca_Cant, P03BA8_A8636Ca_Prdcant, P03BA8_n8636Ca_Prdcant
            }
            , new Object[] {
            }
            , new Object[] {
            P03BA10_A396EmprCod, P03BA10_A129BarCod, P03BA10_A132BarCodReo, P03BA10_A130BarCodPar, P03BA10_A707PrdFacCon, P03BA10_A726PrdPreMed, P03BA10_A2495BarDosUsa, P03BA10_n2495BarDosUsa, P03BA10_A719PrdNum, P03BA10_A724PrdPreAct,
            P03BA10_A209BarPri, P03BA10_A2494BarDosPro
            }
            , new Object[] {
            P03BA11_A396EmprCod, P03BA11_A688PrdComCod, P03BA11_A690PrdComFN, P03BA11_A707PrdFacCon, P03BA11_A724PrdPreAct, P03BA11_A726PrdPreMed, P03BA11_A719PrdNum
            }
            , new Object[] {
            P03BA12_A396EmprCod, P03BA12_A129BarCod, P03BA12_A132BarCodReo, P03BA12_A130BarCodPar, P03BA12_A2804RecLinMaq, P03BA12_A602MaqCod
            }
            , new Object[] {
            P03BA13_A396EmprCod, P03BA13_A602MaqCod, P03BA13_A5100MaqCCoCod, P03BA13_n5100MaqCCoCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV29CC_AlmCod ;
   private byte AV25NCLec ;
   private byte AV19FlagPreMed ;
   private byte AV20CieLote ;
   private byte AV22CieCCo ;
   private byte AV28Eliot ;
   private byte AV30Nalmcc ;
   private byte GXt_int1 ;
   private byte A1273RecLinPro ;
   private byte AV17BarCodReo ;
   private byte A1377RecNumAny ;
   private byte GXv_int2[] ;
   private byte GXv_int21[] ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV36Maqccocod ;
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
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A5725RecLote ;
   private String A209BarPri ;
   private String W396EmprCod ;
   private String AV21RecLote ;
   private String AV11PrdComCod ;
   private String Gx_msg ;
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
   private java.util.Date AV27Ca_diahora ;
   private java.util.Date A8635Ca_DiaHora ;
   private java.util.Date GXv_dtime20[] ;
   private java.util.Date AV9Fecha ;
   private java.util.Date GXv_date19[] ;
   private boolean brk3BA2 ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n8638Ca_PrdNom ;
   private boolean n8637Ca_Cant ;
   private boolean n8636Ca_Prdcant ;
   private boolean brk3BA6 ;
   private boolean n1378PrdCFin ;
   private boolean n5807LanyLote ;
   private boolean brk3BA10 ;
   private boolean n2495BarDosUsa ;
   private boolean n5100MaqCCoCod ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P03BA2_A396EmprCod ;
   private int[] P03BA2_A129BarCod ;
   private byte[] P03BA2_A132BarCodReo ;
   private String[] P03BA2_A130BarCodPar ;
   private short[] P03BA2_A2804RecLinMaq ;
   private String[] P03BA2_A718PrdNom ;
   private java.math.BigDecimal[] P03BA2_A707PrdFacCon ;
   private java.math.BigDecimal[] P03BA2_A1797PrdCanAny ;
   private java.math.BigDecimal[] P03BA2_A686PrdCant ;
   private String[] P03BA2_A719PrdNum ;
   private boolean[] P03BA2_n719PrdNum ;
   private String[] P03BA2_A5725RecLote ;
   private java.math.BigDecimal[] P03BA2_A724PrdPreAct ;
   private java.math.BigDecimal[] P03BA2_A726PrdPreMed ;
   private short[] P03BA2_A811RecLin ;
   private String[] P03BA2_A209BarPri ;
   private byte[] P03BA2_A1273RecLinPro ;
   private String[] P03BA4_A396EmprCod ;
   private String[] P03BA4_A8634Ca_Prdnum ;
   private java.util.Date[] P03BA4_A8635Ca_DiaHora ;
   private java.math.BigDecimal[] P03BA4_A8637Ca_Cant ;
   private boolean[] P03BA4_n8637Ca_Cant ;
   private java.math.BigDecimal[] P03BA4_A8636Ca_Prdcant ;
   private boolean[] P03BA4_n8636Ca_Prdcant ;
   private String[] P03BA6_A396EmprCod ;
   private int[] P03BA6_A129BarCod ;
   private byte[] P03BA6_A132BarCodReo ;
   private String[] P03BA6_A130BarCodPar ;
   private short[] P03BA6_A2808RecLinMAL ;
   private String[] P03BA6_A718PrdNom ;
   private java.math.BigDecimal[] P03BA6_A707PrdFacCon ;
   private java.math.BigDecimal[] P03BA6_A1378PrdCFin ;
   private boolean[] P03BA6_n1378PrdCFin ;
   private String[] P03BA6_A719PrdNum ;
   private boolean[] P03BA6_n719PrdNum ;
   private java.math.BigDecimal[] P03BA6_A724PrdPreAct ;
   private java.math.BigDecimal[] P03BA6_A726PrdPreMed ;
   private String[] P03BA6_A209BarPri ;
   private String[] P03BA6_A5807LanyLote ;
   private boolean[] P03BA6_n5807LanyLote ;
   private byte[] P03BA6_A1377RecNumAny ;
   private String[] P03BA8_A396EmprCod ;
   private String[] P03BA8_A8634Ca_Prdnum ;
   private java.util.Date[] P03BA8_A8635Ca_DiaHora ;
   private java.math.BigDecimal[] P03BA8_A8637Ca_Cant ;
   private boolean[] P03BA8_n8637Ca_Cant ;
   private java.math.BigDecimal[] P03BA8_A8636Ca_Prdcant ;
   private boolean[] P03BA8_n8636Ca_Prdcant ;
   private String[] P03BA10_A396EmprCod ;
   private int[] P03BA10_A129BarCod ;
   private byte[] P03BA10_A132BarCodReo ;
   private String[] P03BA10_A130BarCodPar ;
   private java.math.BigDecimal[] P03BA10_A707PrdFacCon ;
   private java.math.BigDecimal[] P03BA10_A726PrdPreMed ;
   private java.math.BigDecimal[] P03BA10_A2495BarDosUsa ;
   private boolean[] P03BA10_n2495BarDosUsa ;
   private String[] P03BA10_A719PrdNum ;
   private boolean[] P03BA10_n719PrdNum ;
   private java.math.BigDecimal[] P03BA10_A724PrdPreAct ;
   private String[] P03BA10_A209BarPri ;
   private String[] P03BA10_A2494BarDosPro ;
   private String[] P03BA11_A396EmprCod ;
   private String[] P03BA11_A688PrdComCod ;
   private java.math.BigDecimal[] P03BA11_A690PrdComFN ;
   private java.math.BigDecimal[] P03BA11_A707PrdFacCon ;
   private java.math.BigDecimal[] P03BA11_A724PrdPreAct ;
   private java.math.BigDecimal[] P03BA11_A726PrdPreMed ;
   private String[] P03BA11_A719PrdNum ;
   private boolean[] P03BA11_n719PrdNum ;
   private String[] P03BA12_A396EmprCod ;
   private int[] P03BA12_A129BarCod ;
   private byte[] P03BA12_A132BarCodReo ;
   private String[] P03BA12_A130BarCodPar ;
   private short[] P03BA12_A2804RecLinMaq ;
   private String[] P03BA12_A602MaqCod ;
   private String[] P03BA13_A396EmprCod ;
   private String[] P03BA13_A602MaqCod ;
   private short[] P03BA13_A5100MaqCCoCod ;
   private boolean[] P03BA13_n5100MaqCCoCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcieccsa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcieccsa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcieccsa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcieccsa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03BA2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdNom, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.PrdNum, T1.RecLote, T2.PrdPreAct, T2.PrdPreMed, T1.RecLin, T3.BarPri, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03BA3", "INSERT INTO TXPCONSC(EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Prdcant, Ca_Cant, Ca_PrdNom) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P03BA4", "SELECT EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Cant, Ca_Prdcant FROM TXPCONSC WHERE EmprCod = ? and Ca_Prdnum = ? and Ca_DiaHora = ? ORDER BY EmprCod, Ca_Prdnum, Ca_DiaHora ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03BA5", "UPDATE TXPCONSC SET Ca_Cant=?, Ca_Prdcant=?  WHERE EmprCod = ? AND Ca_Prdnum = ? AND Ca_DiaHora = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P03BA6", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T2.PrdNom, T2.PrdFacCon, T1.PrdCFin, T1.PrdNum, T2.PrdPreAct, T2.PrdPreMed, T3.BarPri, T1.LanyLote, T1.RecNumAny FROM ((TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03BA7", "INSERT INTO TXPCONSC(EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Prdcant, Ca_Cant, Ca_PrdNom) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P03BA8", "SELECT EmprCod, Ca_Prdnum, Ca_DiaHora, Ca_Cant, Ca_Prdcant FROM TXPCONSC WHERE EmprCod = ? and Ca_Prdnum = ? and Ca_DiaHora = ? ORDER BY EmprCod, Ca_Prdnum, Ca_DiaHora ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03BA9", "UPDATE TXPCONSC SET Ca_Cant=?, Ca_Prdcant=?  WHERE EmprCod = ? AND Ca_Prdnum = ? AND Ca_DiaHora = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONSC")
         ,new ForEachCursor("P03BA10", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.PrdFacCon, T2.PrdPreMed, T1.BarDosUsa, T1.PrdNum, T2.PrdPreAct, T3.BarPri, T1.BarDosPro FROM ((TXPBARDOS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03BA11", "SELECT T1.EmprCod, T1.PrdComCod, T1.PrdComFN, T2.PrdFacCon, T2.PrdPreAct, T2.PrdPreMed, T1.PrdNum FROM (TXPLPRDCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03BA12", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03BA13", "SELECT EmprCod, MaqCod, MaqCCoCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
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

