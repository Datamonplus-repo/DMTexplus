package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalrec extends GXProcedure
{
   public pcalrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalrec.class ), "" );
   }

   public pcalrec( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 )
   {
      pcalrec.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      pcalrec.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalrec.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcalrec.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcalrec.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcalrec.this.AV16CosPro = aP4[0];
      this.aP4 = aP4;
      pcalrec.this.AV17CosAny = aP5[0];
      this.aP5 = aP5;
      pcalrec.this.AV18Consumos = aP6[0];
      this.aP6 = aP6;
      pcalrec.this.A2804RecLinMaq = aP7[0];
      this.aP7 = aP7;
      pcalrec.this.AV19Tipo = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV21Flag2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "038001", GXv_int1) ;
      pcalrec.this.AV21Flag2 = GXv_int1[0] ;
      AV28FlagBros = (byte)(0) ;
      GXv_int1[0] = AV28FlagBros ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int1) ;
      pcalrec.this.AV28FlagBros = GXv_int1[0] ;
      AV29FlagDia = (byte)(0) ;
      GXv_int1[0] = AV29FlagDia ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "DIARIO", ""), GXv_int1) ;
      pcalrec.this.AV29FlagDia = GXv_int1[0] ;
      AV38FlagMB = (byte)(0) ;
      GXv_int1[0] = AV38FlagMB ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int1) ;
      pcalrec.this.AV38FlagMB = GXv_int1[0] ;
      AV43F_precio2 = (byte)(0) ;
      GXv_int1[0] = AV43F_precio2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PRECI2", ""), GXv_int1) ;
      pcalrec.this.AV43F_precio2 = GXv_int1[0] ;
      AV45FRebAut = (byte)(0) ;
      GXv_int1[0] = AV45FRebAut ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "REBAUT", ""), GXv_int1) ;
      pcalrec.this.AV45FRebAut = GXv_int1[0] ;
      AV46FlagExiNeg = (byte)(0) ;
      GXv_int1[0] = AV46FlagExiNeg ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "EXINEG", ""), GXv_int1) ;
      pcalrec.this.AV46FlagExiNeg = GXv_int1[0] ;
      GXt_int2 = AV48CCNeg ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CCNEG", ""), GXv_int1) ;
      pcalrec.this.GXt_int2 = GXv_int1[0] ;
      AV48CCNeg = GXt_int2 ;
      GXt_int2 = AV50CieLote ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CIELOT", ""), GXv_int1) ;
      pcalrec.this.GXt_int2 = GXv_int1[0] ;
      AV50CieLote = GXt_int2 ;
      GXv_int1[0] = AV26Flag3 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CIERRE", ""), GXv_int1) ;
      pcalrec.this.AV26Flag3 = GXv_int1[0] ;
      /* Using cursor P00492 */
      pr_default.execute(0, new Object[] {AV15EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00492_A396EmprCod[0] ;
         A3915EmpNumDec = P00492_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00492_n3915EmpNumDec[0] ;
         AV37EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV49EntLotN = " " ;
      /* Using cursor P00494 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P00494_A719PrdNum[0] ;
         n719PrdNum = P00494_n719PrdNum[0] ;
         A228BarUniMed = P00494_A228BarUniMed[0] ;
         A217BarTipArt = P00494_A217BarTipArt[0] ;
         n217BarTipArt = P00494_n217BarTipArt[0] ;
         A724PrdPreAct = P00494_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00494_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00494_A707PrdFacCon[0] ;
         A1797PrdCanAny = P00494_A1797PrdCanAny[0] ;
         A686PrdCant = P00494_A686PrdCant[0] ;
         A705PrdExiCC = P00494_A705PrdExiCC[0] ;
         A5527RecLinRea = P00494_A5527RecLinRea[0] ;
         A704PrdExiAlm = P00494_A704PrdExiAlm[0] ;
         A718PrdNom = P00494_A718PrdNom[0] ;
         A683PrdCanFin = P00494_A683PrdCanFin[0] ;
         A726PrdPreMed = P00494_A726PrdPreMed[0] ;
         A3915EmpNumDec = P00494_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00494_n3915EmpNumDec[0] ;
         A811RecLin = P00494_A811RecLin[0] ;
         A1273RecLinPro = P00494_A1273RecLinPro[0] ;
         A396EmprCod = P00494_A396EmprCod[0] ;
         A166BarKgm = P00494_A166BarKgm[0] ;
         A184BarMtr = P00494_A184BarMtr[0] ;
         A3915EmpNumDec = P00494_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00494_n3915EmpNumDec[0] ;
         A724PrdPreAct = P00494_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00494_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00494_A707PrdFacCon[0] ;
         A705PrdExiCC = P00494_A705PrdExiCC[0] ;
         A704PrdExiAlm = P00494_A704PrdExiAlm[0] ;
         A718PrdNom = P00494_A718PrdNom[0] ;
         A726PrdPreMed = P00494_A726PrdPreMed[0] ;
         A228BarUniMed = P00494_A228BarUniMed[0] ;
         A217BarTipArt = P00494_A217BarTipArt[0] ;
         n217BarTipArt = P00494_n217BarTipArt[0] ;
         A166BarKgm = P00494_A166BarKgm[0] ;
         A184BarMtr = P00494_A184BarMtr[0] ;
         AV30BarKgm = A166BarKgm ;
         AV31BarMtr = A184BarMtr ;
         AV32UniMed = A228BarUniMed ;
         AV33BarTipArt = A217BarTipArt ;
         AV44PrdPreAct = A724PrdPreAct ;
         if ( ( AV43F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
         {
            AV44PrdPreAct = A5255PrdPreAc2 ;
         }
         AV20Exis = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         if ( (0==AV26Flag3) || ( GXutil.strcmp(AV19Tipo, httpContext.getMessage( "M", "")) == 0 ) )
         {
            if ( AV18Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV20Exis).doubleValue() < 0 ) && ( AV46FlagExiNeg == 0 ) )
               {
                  if ( AV48CCNeg == 0 )
                  {
                     System.out.println( httpContext.getMessage( "Go PACTCC0", "") );
                     GXv_char3[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV20Exis ;
                     new app.pactcc0(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5) ;
                     pcalrec.this.AV15EmprCod = GXv_char3[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal5[0] ;
                     System.out.println( httpContext.getMessage( "Return PACTCC0", "") );
                  }
                  else
                  {
                     System.out.println( httpContext.getMessage( "1.Go PACTCC", "") );
                     GXv_char4[0] = AV15EmprCod ;
                     GXv_char3[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV20Exis ;
                     new app.pactcc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                     pcalrec.this.AV15EmprCod = GXv_char4[0] ;
                     pcalrec.this.A719PrdNum = GXv_char3[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal5[0] ;
                     System.out.println( httpContext.getMessage( "1.Return PACTCC", "") );
                  }
               }
               else
               {
                  System.out.println( httpContext.getMessage( "2.Go PACTCC", "") );
                  GXv_char4[0] = AV15EmprCod ;
                  GXv_char3[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV20Exis ;
                  new app.pactcc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                  pcalrec.this.AV15EmprCod = GXv_char4[0] ;
                  pcalrec.this.A719PrdNum = GXv_char3[0] ;
                  pcalrec.this.AV20Exis = GXv_decimal5[0] ;
                  System.out.println( httpContext.getMessage( "2.Return PACTCC", "") );
               }
            }
            else
            {
               if ( ( ( AV45FRebAut == 1 ) && ( GXutil.strcmp(A5527RecLinRea, httpContext.getMessage( "N", "")) == 0 ) ) || ( AV45FRebAut == 0 ) )
               {
                  if ( A704PrdExiAlm.subtract(AV20Exis).doubleValue() < 0 )
                  {
                     if ( AV46FlagExiNeg == 0 )
                     {
                        System.out.println( httpContext.getMessage( "Go PACTALM0", "") );
                        GXv_char4[0] = AV15EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        new app.pactalm0(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                        pcalrec.this.AV15EmprCod = GXv_char4[0] ;
                        pcalrec.this.A719PrdNum = GXv_char3[0] ;
                        System.out.println( httpContext.getMessage( "Return PACTALM0", "") );
                     }
                     else
                     {
                        System.out.println( httpContext.getMessage( "1.Go PACTALM", "") );
                        GXv_char4[0] = AV15EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_decimal5[0] = AV20Exis ;
                        new app.pactalm(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                        pcalrec.this.AV15EmprCod = GXv_char4[0] ;
                        pcalrec.this.A719PrdNum = GXv_char3[0] ;
                        pcalrec.this.AV20Exis = GXv_decimal5[0] ;
                        System.out.println( httpContext.getMessage( "2.Return PACTALM", "") );
                     }
                  }
                  else
                  {
                     Gx_msg = httpContext.getMessage( "2.Go PACTALM ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + A719PrdNum + " " + GXutil.trim( A718PrdNom) + " " + GXutil.trim( GXutil.str( AV20Exis, 12, 4)) ;
                     System.out.println( Gx_msg );
                     GXv_char4[0] = AV15EmprCod ;
                     GXv_char3[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV20Exis ;
                     new app.pactalm(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                     pcalrec.this.AV15EmprCod = GXv_char4[0] ;
                     pcalrec.this.A719PrdNum = GXv_char3[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal5[0] ;
                     System.out.println( httpContext.getMessage( "2.Return PACTALM", "") );
                  }
               }
               System.out.println( httpContext.getMessage( "Go PALMTIN", "") );
               GXv_char4[0] = A396EmprCod ;
               GXv_char3[0] = A719PrdNum ;
               GXv_decimal5[0] = AV20Exis ;
               GXv_char6[0] = AV49EntLotN ;
               new app.palmtin(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5, GXv_char6) ;
               pcalrec.this.A396EmprCod = GXv_char4[0] ;
               pcalrec.this.A719PrdNum = GXv_char3[0] ;
               pcalrec.this.AV20Exis = GXv_decimal5[0] ;
               pcalrec.this.AV49EntLotN = GXv_char6[0] ;
               System.out.println( httpContext.getMessage( "Return PALMTIN", "") );
            }
            if ( ! (0==AV21Flag2) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A683PrdCanFin)==0) )
               {
                  AV25PrdCanFin = A686PrdCant ;
               }
               else
               {
                  AV25PrdCanFin = A683PrdCanFin ;
               }
               if ( AV38FlagMB == 1 )
               {
                  AV25PrdCanFin = A686PrdCant.add(A1797PrdCanAny) ;
               }
               if ( ( ( AV45FRebAut == 1 ) && ( GXutil.strcmp(A5527RecLinRea, httpContext.getMessage( "N", "")) == 0 ) ) || ( AV45FRebAut == 0 ) )
               {
                  System.out.println( httpContext.getMessage( "Go PACTRES2", "") );
                  GXv_char6[0] = AV15EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV25PrdCanFin ;
                  new app.pactres2(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                  pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                  pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  pcalrec.this.AV25PrdCanFin = GXv_decimal5[0] ;
                  System.out.println( httpContext.getMessage( "Return PACTRES2", "") );
               }
            }
            if ( AV29FlagDia == 1 )
            {
               System.out.println( httpContext.getMessage( "Go PALMDAB", "") );
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_char3[0] = A228BarUniMed ;
               GXv_decimal5[0] = A166BarKgm ;
               GXv_decimal7[0] = A184BarMtr ;
               GXv_int8[0] = A217BarTipArt ;
               GXv_decimal9[0] = AV20Exis ;
               new app.palmdab(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_char3, GXv_decimal5, GXv_decimal7, GXv_int8, GXv_decimal9) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.A228BarUniMed = GXv_char3[0] ;
               pcalrec.this.A166BarKgm = GXv_decimal5[0] ;
               pcalrec.this.A184BarMtr = GXv_decimal7[0] ;
               pcalrec.this.A217BarTipArt = GXv_int8[0] ;
               pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               System.out.println( httpContext.getMessage( "Return PALMDAB", "") );
            }
         }
         else
         {
            if ( AV18Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV20Exis).doubleValue() < 0 ) && ( AV46FlagExiNeg == 0 ) )
               {
                  if ( AV48CCNeg == 0 )
                  {
                     System.out.println( httpContext.getMessage( "2.Go PACTCC0", "") );
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc0(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                     System.out.println( httpContext.getMessage( "2.Return PACTCC0", "") );
                  }
                  else
                  {
                     System.out.println( httpContext.getMessage( "3.Go PACTCC", "") );
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                     System.out.println( httpContext.getMessage( "3.Return PACTCC", "") );
                  }
               }
               else
               {
                  System.out.println( httpContext.getMessage( "4.Go PACTCC", "") );
                  GXv_char6[0] = AV15EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal9[0] = AV20Exis ;
                  new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                  pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                  pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  System.out.println( httpContext.getMessage( "4.Return PACTCC", "") );
               }
            }
            else
            {
               System.out.println( httpContext.getMessage( "2.Go PALMTIN", "") );
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal9[0] = AV20Exis ;
               GXv_char3[0] = AV49EntLotN ;
               new app.palmtin(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9, GXv_char3) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               pcalrec.this.AV49EntLotN = GXv_char3[0] ;
               System.out.println( httpContext.getMessage( "2.Return PALMTIN", "") );
            }
            if ( AV29FlagDia == 1 )
            {
               System.out.println( httpContext.getMessage( "2.Go PALMDAB", "") );
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_char3[0] = A228BarUniMed ;
               GXv_decimal9[0] = A166BarKgm ;
               GXv_decimal7[0] = A184BarMtr ;
               GXv_int8[0] = A217BarTipArt ;
               GXv_decimal5[0] = AV20Exis ;
               new app.palmdab(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_char3, GXv_decimal9, GXv_decimal7, GXv_int8, GXv_decimal5) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.A228BarUniMed = GXv_char3[0] ;
               pcalrec.this.A166BarKgm = GXv_decimal9[0] ;
               pcalrec.this.A184BarMtr = GXv_decimal7[0] ;
               pcalrec.this.A217BarTipArt = GXv_int8[0] ;
               pcalrec.this.AV20Exis = GXv_decimal5[0] ;
               System.out.println( httpContext.getMessage( "2.Return PALMDAB", "") );
            }
         }
         if ( AV38FlagMB == 1 )
         {
            AV39TotCant = GXutil.roundDecimal( (A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)), 4) ;
            AV40TotPro = GXutil.roundDecimal( (AV39TotCant.multiply(A726PrdPreMed).multiply(A707PrdFacCon)), 2) ;
            AV16CosPro = GXutil.roundDecimal( AV16CosPro.add(AV40TotPro), 2) ;
            AV41TotCanR = GXutil.roundDecimal( (A1797PrdCanAny.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)), 4) ;
            AV42TotAny = GXutil.roundDecimal( (AV41TotCanR.multiply(A726PrdPreMed).multiply(A707PrdFacCon)), 2) ;
            AV17CosAny = GXutil.roundDecimal( AV17CosAny.add(AV42TotAny), 2) ;
         }
         else
         {
            if ( A3915EmpNumDec == 0 )
            {
               AV35CosPro2 = AV35CosPro2.add((A686PrdCant.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               AV36CosAny2 = AV36CosAny2.add((A1797PrdCanAny.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV35CosPro2 = AV35CosPro2.add((A686PrdCant.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV36CosAny2 = AV36CosAny2.add((A1797PrdCanAny.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P00495 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P00495_A719PrdNum[0] ;
         n719PrdNum = P00495_n719PrdNum[0] ;
         A686PrdCant = P00495_A686PrdCant[0] ;
         A1797PrdCanAny = P00495_A1797PrdCanAny[0] ;
         A683PrdCanFin = P00495_A683PrdCanFin[0] ;
         A811RecLin = P00495_A811RecLin[0] ;
         A1273RecLinPro = P00495_A1273RecLinPro[0] ;
         A396EmprCod = P00495_A396EmprCod[0] ;
         AV22PrdComCod = A719PrdNum ;
         AV23PrdCant = A686PrdCant ;
         AV24PrdCanAny = A1797PrdCanAny ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A683PrdCanFin)==0) )
         {
            AV25PrdCanFin = A686PrdCant ;
         }
         else
         {
            AV25PrdCanFin = A683PrdCanFin ;
         }
         if ( AV38FlagMB == 1 )
         {
            AV25PrdCanFin = A686PrdCant.add(A1797PrdCanAny) ;
         }
         /* Execute user subroutine: 'COMPUEST' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P00497 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2808RecLinMAL = P00497_A2808RecLinMAL[0] ;
         A719PrdNum = P00497_A719PrdNum[0] ;
         n719PrdNum = P00497_n719PrdNum[0] ;
         A724PrdPreAct = P00497_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00497_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00497_A707PrdFacCon[0] ;
         A1378PrdCFin = P00497_A1378PrdCFin[0] ;
         n1378PrdCFin = P00497_n1378PrdCFin[0] ;
         A705PrdExiCC = P00497_A705PrdExiCC[0] ;
         A704PrdExiAlm = P00497_A704PrdExiAlm[0] ;
         A228BarUniMed = P00497_A228BarUniMed[0] ;
         A217BarTipArt = P00497_A217BarTipArt[0] ;
         n217BarTipArt = P00497_n217BarTipArt[0] ;
         A3915EmpNumDec = P00497_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00497_n3915EmpNumDec[0] ;
         A1377RecNumAny = P00497_A1377RecNumAny[0] ;
         A396EmprCod = P00497_A396EmprCod[0] ;
         A166BarKgm = P00497_A166BarKgm[0] ;
         A184BarMtr = P00497_A184BarMtr[0] ;
         A3915EmpNumDec = P00497_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00497_n3915EmpNumDec[0] ;
         A724PrdPreAct = P00497_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00497_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00497_A707PrdFacCon[0] ;
         A705PrdExiCC = P00497_A705PrdExiCC[0] ;
         A704PrdExiAlm = P00497_A704PrdExiAlm[0] ;
         A228BarUniMed = P00497_A228BarUniMed[0] ;
         A217BarTipArt = P00497_A217BarTipArt[0] ;
         n217BarTipArt = P00497_n217BarTipArt[0] ;
         A166BarKgm = P00497_A166BarKgm[0] ;
         A184BarMtr = P00497_A184BarMtr[0] ;
         AV44PrdPreAct = A724PrdPreAct ;
         if ( ( AV43F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
         {
            AV44PrdPreAct = A5255PrdPreAc2 ;
         }
         AV20Exis = (A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         if ( (0==AV26Flag3) || ( GXutil.strcmp(AV19Tipo, httpContext.getMessage( "M", "")) == 0 ) )
         {
            if ( AV18Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV20Exis).doubleValue() < 0 ) && ( AV46FlagExiNeg == 0 ) )
               {
                  if ( AV48CCNeg == 0 )
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc0(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV15EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal9[0] = AV20Exis ;
                  new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                  pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                  pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               }
            }
            else
            {
               if ( A704PrdExiAlm.subtract(AV20Exis).doubleValue() < 0 )
               {
                  if ( AV46FlagExiNeg == 0 )
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     new app.pactalm0(remoteHandle, context).execute( GXv_char6, GXv_char4) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactalm(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV15EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal9[0] = AV20Exis ;
                  new app.pactalm(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                  pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                  pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               }
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal9[0] = AV20Exis ;
               GXv_char3[0] = AV49EntLotN ;
               new app.palmtin(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9, GXv_char3) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               pcalrec.this.AV49EntLotN = GXv_char3[0] ;
            }
            if ( AV29FlagDia == 1 )
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_char3[0] = A228BarUniMed ;
               GXv_decimal9[0] = A166BarKgm ;
               GXv_decimal7[0] = A184BarMtr ;
               GXv_int8[0] = A217BarTipArt ;
               GXv_decimal5[0] = AV20Exis ;
               new app.palmdab(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_char3, GXv_decimal9, GXv_decimal7, GXv_int8, GXv_decimal5) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.A228BarUniMed = GXv_char3[0] ;
               pcalrec.this.A166BarKgm = GXv_decimal9[0] ;
               pcalrec.this.A184BarMtr = GXv_decimal7[0] ;
               pcalrec.this.A217BarTipArt = GXv_int8[0] ;
               pcalrec.this.AV20Exis = GXv_decimal5[0] ;
            }
         }
         else
         {
            if ( AV18Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV20Exis).doubleValue() < 0 ) && ( AV46FlagExiNeg == 0 ) )
               {
                  if ( AV48CCNeg == 0 )
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc0(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV15EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal9[0] = AV20Exis ;
                  new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                  pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                  pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               }
            }
            else
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal9[0] = AV20Exis ;
               GXv_char3[0] = AV49EntLotN ;
               new app.palmtin(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9, GXv_char3) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               pcalrec.this.AV49EntLotN = GXv_char3[0] ;
            }
            if ( AV29FlagDia == 1 )
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_char3[0] = A228BarUniMed ;
               GXv_decimal9[0] = A166BarKgm ;
               GXv_decimal7[0] = A184BarMtr ;
               GXv_int8[0] = A217BarTipArt ;
               GXv_decimal5[0] = AV20Exis ;
               new app.palmdab(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_char3, GXv_decimal9, GXv_decimal7, GXv_int8, GXv_decimal5) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.A228BarUniMed = GXv_char3[0] ;
               pcalrec.this.A166BarKgm = GXv_decimal9[0] ;
               pcalrec.this.A184BarMtr = GXv_decimal7[0] ;
               pcalrec.this.A217BarTipArt = GXv_int8[0] ;
               pcalrec.this.AV20Exis = GXv_decimal5[0] ;
            }
         }
         if ( A3915EmpNumDec == 0 )
         {
            AV36CosAny2 = AV36CosAny2.add((A1378PrdCFin.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV36CosAny2 = AV36CosAny2.add((A1378PrdCFin.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV38FlagMB == 0 )
      {
         if ( AV37EmpNumDec == 2 )
         {
            AV17CosAny = GXutil.roundDecimal( AV36CosAny2, 2) ;
            AV16CosPro = GXutil.roundDecimal( AV35CosPro2, 2) ;
         }
         else
         {
            if ( AV37EmpNumDec == 0 )
            {
               AV17CosAny = AV36CosAny2 ;
               AV16CosPro = AV35CosPro2 ;
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUEST' Routine */
      returnInSub = false ;
      /* Using cursor P00498 */
      pr_default.execute(4, new Object[] {AV15EmprCod, AV22PrdComCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A688PrdComCod = P00498_A688PrdComCod[0] ;
         A724PrdPreAct = P00498_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00498_A5255PrdPreAc2[0] ;
         A690PrdComFN = P00498_A690PrdComFN[0] ;
         A707PrdFacCon = P00498_A707PrdFacCon[0] ;
         A705PrdExiCC = P00498_A705PrdExiCC[0] ;
         A704PrdExiAlm = P00498_A704PrdExiAlm[0] ;
         A726PrdPreMed = P00498_A726PrdPreMed[0] ;
         A3915EmpNumDec = P00498_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00498_n3915EmpNumDec[0] ;
         A719PrdNum = P00498_A719PrdNum[0] ;
         n719PrdNum = P00498_n719PrdNum[0] ;
         A396EmprCod = P00498_A396EmprCod[0] ;
         A3915EmpNumDec = P00498_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00498_n3915EmpNumDec[0] ;
         A724PrdPreAct = P00498_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00498_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P00498_A707PrdFacCon[0] ;
         A705PrdExiCC = P00498_A705PrdExiCC[0] ;
         A704PrdExiAlm = P00498_A704PrdExiAlm[0] ;
         A726PrdPreMed = P00498_A726PrdPreMed[0] ;
         AV44PrdPreAct = A724PrdPreAct ;
         if ( ( AV43F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
         {
            AV44PrdPreAct = A5255PrdPreAc2 ;
         }
         AV20Exis = ((AV23PrdCant.add(AV24PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         if ( (0==AV26Flag3) || ( GXutil.strcmp(AV19Tipo, httpContext.getMessage( "M", "")) == 0 ) )
         {
            if ( AV18Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV20Exis).doubleValue() < 0 ) && ( AV46FlagExiNeg == 0 ) )
               {
                  if ( AV48CCNeg == 0 )
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc0(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV15EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal9[0] = AV20Exis ;
                  new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                  pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                  pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               }
            }
            else
            {
               if ( A704PrdExiAlm.subtract(AV20Exis).doubleValue() < 0 )
               {
                  if ( AV46FlagExiNeg == 0 )
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     new app.pactalm0(remoteHandle, context).execute( GXv_char6, GXv_char4) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactalm(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV15EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal9[0] = AV20Exis ;
                  new app.pactalm(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                  pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                  pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               }
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal9[0] = AV20Exis ;
               GXv_char3[0] = AV49EntLotN ;
               new app.palmtin(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9, GXv_char3) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               pcalrec.this.AV49EntLotN = GXv_char3[0] ;
            }
            if ( ! (0==AV21Flag2) )
            {
               GXv_char6[0] = AV15EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal9[0] = AV25PrdCanFin ;
               GXv_decimal7[0] = A690PrdComFN ;
               new app.pactres3(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9, GXv_decimal7) ;
               pcalrec.this.AV15EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.AV25PrdCanFin = GXv_decimal9[0] ;
               pcalrec.this.A690PrdComFN = GXv_decimal7[0] ;
            }
            if ( AV29FlagDia == 1 )
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_char3[0] = AV32UniMed ;
               GXv_decimal9[0] = AV30BarKgm ;
               GXv_decimal7[0] = AV31BarMtr ;
               GXv_int8[0] = AV33BarTipArt ;
               GXv_decimal5[0] = AV20Exis ;
               new app.palmdab(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_char3, GXv_decimal9, GXv_decimal7, GXv_int8, GXv_decimal5) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.AV32UniMed = GXv_char3[0] ;
               pcalrec.this.AV30BarKgm = GXv_decimal9[0] ;
               pcalrec.this.AV31BarMtr = GXv_decimal7[0] ;
               pcalrec.this.AV33BarTipArt = GXv_int8[0] ;
               pcalrec.this.AV20Exis = GXv_decimal5[0] ;
            }
         }
         else
         {
            if ( AV18Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV20Exis).doubleValue() < 0 ) && ( AV46FlagExiNeg == 0 ) )
               {
                  if ( AV48CCNeg == 0 )
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc0(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV15EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal9[0] = AV20Exis ;
                     new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                     pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                     pcalrec.this.A719PrdNum = GXv_char4[0] ;
                     pcalrec.this.AV20Exis = GXv_decimal9[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV15EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal9[0] = AV20Exis ;
                  new app.pactcc(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9) ;
                  pcalrec.this.AV15EmprCod = GXv_char6[0] ;
                  pcalrec.this.A719PrdNum = GXv_char4[0] ;
                  pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               }
            }
            else
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal9[0] = AV20Exis ;
               GXv_char3[0] = AV49EntLotN ;
               new app.palmtin(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal9, GXv_char3) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.AV20Exis = GXv_decimal9[0] ;
               pcalrec.this.AV49EntLotN = GXv_char3[0] ;
            }
            if ( AV29FlagDia == 1 )
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_char3[0] = AV32UniMed ;
               GXv_decimal9[0] = AV30BarKgm ;
               GXv_decimal7[0] = AV31BarMtr ;
               GXv_int8[0] = AV33BarTipArt ;
               GXv_decimal5[0] = AV20Exis ;
               new app.palmdab(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_char3, GXv_decimal9, GXv_decimal7, GXv_int8, GXv_decimal5) ;
               pcalrec.this.A396EmprCod = GXv_char6[0] ;
               pcalrec.this.A719PrdNum = GXv_char4[0] ;
               pcalrec.this.AV32UniMed = GXv_char3[0] ;
               pcalrec.this.AV30BarKgm = GXv_decimal9[0] ;
               pcalrec.this.AV31BarMtr = GXv_decimal7[0] ;
               pcalrec.this.AV33BarTipArt = GXv_int8[0] ;
               pcalrec.this.AV20Exis = GXv_decimal5[0] ;
            }
         }
         if ( AV38FlagMB == 1 )
         {
            AV39TotCant = GXutil.roundDecimal( (AV23PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)), 4) ;
            AV40TotPro = GXutil.roundDecimal( (AV39TotCant.multiply(A726PrdPreMed).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 2) ;
            AV16CosPro = GXutil.roundDecimal( AV16CosPro.add(AV40TotPro), 2) ;
            AV41TotCanR = GXutil.roundDecimal( (AV24PrdCanAny.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)), 4) ;
            AV42TotAny = GXutil.roundDecimal( (AV41TotCanR.multiply(A726PrdPreMed).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 2) ;
            AV17CosAny = GXutil.roundDecimal( AV17CosAny.add(AV42TotAny), 2) ;
         }
         else
         {
            if ( A3915EmpNumDec == 0 )
            {
               AV35CosPro2 = AV35CosPro2.add((AV23PrdCant.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               AV36CosAny2 = AV36CosAny2.add((AV24PrdCanAny.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV35CosPro2 = AV35CosPro2.add((AV23PrdCant.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV36CosAny2 = AV36CosAny2.add((AV24PrdCanAny.multiply(AV44PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalrec.this.AV15EmprCod;
      this.aP1[0] = pcalrec.this.A129BarCod;
      this.aP2[0] = pcalrec.this.A132BarCodReo;
      this.aP3[0] = pcalrec.this.A130BarCodPar;
      this.aP4[0] = pcalrec.this.AV16CosPro;
      this.aP5[0] = pcalrec.this.AV17CosAny;
      this.aP6[0] = pcalrec.this.AV18Consumos;
      this.aP7[0] = pcalrec.this.A2804RecLinMaq;
      this.aP8[0] = pcalrec.this.AV19Tipo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00492_A396EmprCod = new String[] {""} ;
      P00492_A3915EmpNumDec = new byte[1] ;
      P00492_n3915EmpNumDec = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV49EntLotN = "" ;
      P00494_A129BarCod = new int[1] ;
      P00494_A132BarCodReo = new byte[1] ;
      P00494_A130BarCodPar = new String[] {""} ;
      P00494_A2804RecLinMaq = new short[1] ;
      P00494_A719PrdNum = new String[] {""} ;
      P00494_n719PrdNum = new boolean[] {false} ;
      P00494_A228BarUniMed = new String[] {""} ;
      P00494_A217BarTipArt = new short[1] ;
      P00494_n217BarTipArt = new boolean[] {false} ;
      P00494_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A5527RecLinRea = new String[] {""} ;
      P00494_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A718PrdNom = new String[] {""} ;
      P00494_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A3915EmpNumDec = new byte[1] ;
      P00494_n3915EmpNumDec = new boolean[] {false} ;
      P00494_A811RecLin = new short[1] ;
      P00494_A1273RecLinPro = new byte[1] ;
      P00494_A396EmprCod = new String[] {""} ;
      P00494_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00494_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A228BarUniMed = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A5527RecLinRea = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV30BarKgm = DecimalUtil.ZERO ;
      AV31BarMtr = DecimalUtil.ZERO ;
      AV32UniMed = "" ;
      AV44PrdPreAct = DecimalUtil.ZERO ;
      AV20Exis = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV25PrdCanFin = DecimalUtil.ZERO ;
      AV39TotCant = DecimalUtil.ZERO ;
      AV40TotPro = DecimalUtil.ZERO ;
      AV41TotCanR = DecimalUtil.ZERO ;
      AV42TotAny = DecimalUtil.ZERO ;
      AV35CosPro2 = DecimalUtil.ZERO ;
      AV36CosAny2 = DecimalUtil.ZERO ;
      P00495_A129BarCod = new int[1] ;
      P00495_A132BarCodReo = new byte[1] ;
      P00495_A130BarCodPar = new String[] {""} ;
      P00495_A2804RecLinMaq = new short[1] ;
      P00495_A719PrdNum = new String[] {""} ;
      P00495_n719PrdNum = new boolean[] {false} ;
      P00495_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00495_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00495_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00495_A811RecLin = new short[1] ;
      P00495_A1273RecLinPro = new byte[1] ;
      P00495_A396EmprCod = new String[] {""} ;
      AV22PrdComCod = "" ;
      AV23PrdCant = DecimalUtil.ZERO ;
      AV24PrdCanAny = DecimalUtil.ZERO ;
      P00497_A129BarCod = new int[1] ;
      P00497_A132BarCodReo = new byte[1] ;
      P00497_A130BarCodPar = new String[] {""} ;
      P00497_A2808RecLinMAL = new short[1] ;
      P00497_A719PrdNum = new String[] {""} ;
      P00497_n719PrdNum = new boolean[] {false} ;
      P00497_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00497_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00497_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00497_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00497_n1378PrdCFin = new boolean[] {false} ;
      P00497_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00497_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00497_A228BarUniMed = new String[] {""} ;
      P00497_A217BarTipArt = new short[1] ;
      P00497_n217BarTipArt = new boolean[] {false} ;
      P00497_A3915EmpNumDec = new byte[1] ;
      P00497_n3915EmpNumDec = new boolean[] {false} ;
      P00497_A1377RecNumAny = new byte[1] ;
      P00497_A396EmprCod = new String[] {""} ;
      P00497_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00497_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      P00498_A688PrdComCod = new String[] {""} ;
      P00498_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00498_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00498_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00498_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00498_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00498_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00498_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00498_A3915EmpNumDec = new byte[1] ;
      P00498_n3915EmpNumDec = new boolean[] {false} ;
      P00498_A719PrdNum = new String[] {""} ;
      P00498_n719PrdNum = new boolean[] {false} ;
      P00498_A396EmprCod = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      GXv_char6 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new short[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalrec__default(),
         new Object[] {
             new Object[] {
            P00492_A396EmprCod, P00492_A3915EmpNumDec, P00492_n3915EmpNumDec
            }
            , new Object[] {
            P00494_A129BarCod, P00494_A132BarCodReo, P00494_A130BarCodPar, P00494_A2804RecLinMaq, P00494_A719PrdNum, P00494_n719PrdNum, P00494_A228BarUniMed, P00494_A217BarTipArt, P00494_n217BarTipArt, P00494_A724PrdPreAct,
            P00494_A5255PrdPreAc2, P00494_A707PrdFacCon, P00494_A1797PrdCanAny, P00494_A686PrdCant, P00494_A705PrdExiCC, P00494_A5527RecLinRea, P00494_A704PrdExiAlm, P00494_A718PrdNom, P00494_A683PrdCanFin, P00494_A726PrdPreMed,
            P00494_A3915EmpNumDec, P00494_n3915EmpNumDec, P00494_A811RecLin, P00494_A1273RecLinPro, P00494_A396EmprCod, P00494_A166BarKgm, P00494_A184BarMtr
            }
            , new Object[] {
            P00495_A129BarCod, P00495_A132BarCodReo, P00495_A130BarCodPar, P00495_A2804RecLinMaq, P00495_A719PrdNum, P00495_n719PrdNum, P00495_A686PrdCant, P00495_A1797PrdCanAny, P00495_A683PrdCanFin, P00495_A811RecLin,
            P00495_A1273RecLinPro, P00495_A396EmprCod
            }
            , new Object[] {
            P00497_A129BarCod, P00497_A132BarCodReo, P00497_A130BarCodPar, P00497_A2808RecLinMAL, P00497_A719PrdNum, P00497_A724PrdPreAct, P00497_A5255PrdPreAc2, P00497_A707PrdFacCon, P00497_A1378PrdCFin, P00497_n1378PrdCFin,
            P00497_A705PrdExiCC, P00497_A704PrdExiAlm, P00497_A228BarUniMed, P00497_A217BarTipArt, P00497_n217BarTipArt, P00497_A3915EmpNumDec, P00497_n3915EmpNumDec, P00497_A1377RecNumAny, P00497_A396EmprCod, P00497_A166BarKgm,
            P00497_A184BarMtr
            }
            , new Object[] {
            P00498_A688PrdComCod, P00498_A724PrdPreAct, P00498_A5255PrdPreAc2, P00498_A690PrdComFN, P00498_A707PrdFacCon, P00498_A705PrdExiCC, P00498_A704PrdExiAlm, P00498_A726PrdPreMed, P00498_A3915EmpNumDec, P00498_n3915EmpNumDec,
            P00498_A719PrdNum, P00498_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18Consumos ;
   private byte AV21Flag2 ;
   private byte AV28FlagBros ;
   private byte AV29FlagDia ;
   private byte AV38FlagMB ;
   private byte AV43F_precio2 ;
   private byte AV45FRebAut ;
   private byte AV46FlagExiNeg ;
   private byte AV48CCNeg ;
   private byte AV50CieLote ;
   private byte GXt_int2 ;
   private byte AV26Flag3 ;
   private byte GXv_int1[] ;
   private byte A3915EmpNumDec ;
   private byte AV37EmpNumDec ;
   private byte A1273RecLinPro ;
   private byte A1377RecNumAny ;
   private short A2804RecLinMaq ;
   private short A217BarTipArt ;
   private short A811RecLin ;
   private short AV33BarTipArt ;
   private short A2808RecLinMAL ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV16CosPro ;
   private java.math.BigDecimal AV17CosAny ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV30BarKgm ;
   private java.math.BigDecimal AV31BarMtr ;
   private java.math.BigDecimal AV44PrdPreAct ;
   private java.math.BigDecimal AV20Exis ;
   private java.math.BigDecimal AV25PrdCanFin ;
   private java.math.BigDecimal AV39TotCant ;
   private java.math.BigDecimal AV40TotPro ;
   private java.math.BigDecimal AV41TotCanR ;
   private java.math.BigDecimal AV42TotAny ;
   private java.math.BigDecimal AV35CosPro2 ;
   private java.math.BigDecimal AV36CosAny2 ;
   private java.math.BigDecimal AV23PrdCant ;
   private java.math.BigDecimal AV24PrdCanAny ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String AV15EmprCod ;
   private String A130BarCodPar ;
   private String AV19Tipo ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV49EntLotN ;
   private String A719PrdNum ;
   private String A228BarUniMed ;
   private String A5527RecLinRea ;
   private String A718PrdNom ;
   private String AV32UniMed ;
   private String Gx_msg ;
   private String AV22PrdComCod ;
   private String A688PrdComCod ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean n3915EmpNumDec ;
   private boolean n719PrdNum ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n1378PrdCFin ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00492_A396EmprCod ;
   private byte[] P00492_A3915EmpNumDec ;
   private boolean[] P00492_n3915EmpNumDec ;
   private int[] P00494_A129BarCod ;
   private byte[] P00494_A132BarCodReo ;
   private String[] P00494_A130BarCodPar ;
   private short[] P00494_A2804RecLinMaq ;
   private String[] P00494_A719PrdNum ;
   private boolean[] P00494_n719PrdNum ;
   private String[] P00494_A228BarUniMed ;
   private short[] P00494_A217BarTipArt ;
   private boolean[] P00494_n217BarTipArt ;
   private java.math.BigDecimal[] P00494_A724PrdPreAct ;
   private java.math.BigDecimal[] P00494_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P00494_A707PrdFacCon ;
   private java.math.BigDecimal[] P00494_A1797PrdCanAny ;
   private java.math.BigDecimal[] P00494_A686PrdCant ;
   private java.math.BigDecimal[] P00494_A705PrdExiCC ;
   private String[] P00494_A5527RecLinRea ;
   private java.math.BigDecimal[] P00494_A704PrdExiAlm ;
   private String[] P00494_A718PrdNom ;
   private java.math.BigDecimal[] P00494_A683PrdCanFin ;
   private java.math.BigDecimal[] P00494_A726PrdPreMed ;
   private byte[] P00494_A3915EmpNumDec ;
   private boolean[] P00494_n3915EmpNumDec ;
   private short[] P00494_A811RecLin ;
   private byte[] P00494_A1273RecLinPro ;
   private String[] P00494_A396EmprCod ;
   private java.math.BigDecimal[] P00494_A166BarKgm ;
   private java.math.BigDecimal[] P00494_A184BarMtr ;
   private int[] P00495_A129BarCod ;
   private byte[] P00495_A132BarCodReo ;
   private String[] P00495_A130BarCodPar ;
   private short[] P00495_A2804RecLinMaq ;
   private String[] P00495_A719PrdNum ;
   private boolean[] P00495_n719PrdNum ;
   private java.math.BigDecimal[] P00495_A686PrdCant ;
   private java.math.BigDecimal[] P00495_A1797PrdCanAny ;
   private java.math.BigDecimal[] P00495_A683PrdCanFin ;
   private short[] P00495_A811RecLin ;
   private byte[] P00495_A1273RecLinPro ;
   private String[] P00495_A396EmprCod ;
   private int[] P00497_A129BarCod ;
   private byte[] P00497_A132BarCodReo ;
   private String[] P00497_A130BarCodPar ;
   private short[] P00497_A2808RecLinMAL ;
   private String[] P00497_A719PrdNum ;
   private boolean[] P00497_n719PrdNum ;
   private java.math.BigDecimal[] P00497_A724PrdPreAct ;
   private java.math.BigDecimal[] P00497_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P00497_A707PrdFacCon ;
   private java.math.BigDecimal[] P00497_A1378PrdCFin ;
   private boolean[] P00497_n1378PrdCFin ;
   private java.math.BigDecimal[] P00497_A705PrdExiCC ;
   private java.math.BigDecimal[] P00497_A704PrdExiAlm ;
   private String[] P00497_A228BarUniMed ;
   private short[] P00497_A217BarTipArt ;
   private boolean[] P00497_n217BarTipArt ;
   private byte[] P00497_A3915EmpNumDec ;
   private boolean[] P00497_n3915EmpNumDec ;
   private byte[] P00497_A1377RecNumAny ;
   private String[] P00497_A396EmprCod ;
   private java.math.BigDecimal[] P00497_A166BarKgm ;
   private java.math.BigDecimal[] P00497_A184BarMtr ;
   private String[] P00498_A688PrdComCod ;
   private java.math.BigDecimal[] P00498_A724PrdPreAct ;
   private java.math.BigDecimal[] P00498_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P00498_A690PrdComFN ;
   private java.math.BigDecimal[] P00498_A707PrdFacCon ;
   private java.math.BigDecimal[] P00498_A705PrdExiCC ;
   private java.math.BigDecimal[] P00498_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00498_A726PrdPreMed ;
   private byte[] P00498_A3915EmpNumDec ;
   private boolean[] P00498_n3915EmpNumDec ;
   private String[] P00498_A719PrdNum ;
   private boolean[] P00498_n719PrdNum ;
   private String[] P00498_A396EmprCod ;
}

final  class pcalrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00492", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00494", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum, T4.BarUniMed, T4.BarTipArt, T3.PrdPreAct, T3.PrdPreAc2, T3.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T3.PrdExiCC, T1.RecLinRea, T3.PrdExiAlm, T3.PrdNom, T1.PrdCanFin, T3.PrdPreMed, T2.EmpNumDec, T1.RecLin, T1.RecLinPro, T1.EmprCod, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarMtr, 0) AS BarMtr FROM ((((TXPLRECET T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) AND (SUBSTR(T1.PrdNum, 1, 1) <> '0') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00495", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, PrdNum, PrdCant, PrdCanAny, PrdCanFin, RecLin, RecLinPro, EmprCod FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (Not (rtrim(PrdNum) IS NULL AND NOT(PrdNum IS NULL))) AND (SUBSTR(PrdNum, 1, 1) = '0') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00497", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum, T3.PrdPreAct, T3.PrdPreAc2, T3.PrdFacCon, T1.PrdCFin, T3.PrdExiCC, T3.PrdExiAlm, T4.BarUniMed, T4.BarTipArt, T2.EmpNumDec, T1.RecNumAny, T1.EmprCod, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarMtr, 0) AS BarMtr FROM ((((TXPLANYAD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00498", "SELECT T1.PrdComCod, T3.PrdPreAct, T3.PrdPreAc2, T1.PrdComFN, T3.PrdFacCon, T3.PrdExiCC, T3.PrdExiAlm, T3.PrdPreMed, T2.EmpNumDec, T1.PrdNum, T1.EmprCod FROM ((TXPLPRDCO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdComCod = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,4);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,4);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,3);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,5);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((byte[]) buf[23])[0] = rslt.getByte(21);
               ((String[]) buf[24])[0] = rslt.getString(22, 3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(24,2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 3);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

