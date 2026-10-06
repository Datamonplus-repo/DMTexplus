package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls000 extends GXProcedure
{
   public pcls000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls000.class ), "" );
   }

   public pcls000( int remoteHandle ,
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
      pcls000.this.aP8 = new String[] {""};
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
      pcls000.this.AV51EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls000.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcls000.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls000.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls000.this.AV48CosPro = aP4[0];
      this.aP4 = aP4;
      pcls000.this.AV46CosAny = aP5[0];
      this.aP5 = aP5;
      pcls000.this.AV45Consumos = aP6[0];
      this.aP6 = aP6;
      pcls000.this.A2804RecLinMaq = aP7[0];
      this.aP7 = aP7;
      pcls000.this.AV70Tipo = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV56Flag2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV51EmprCod, "038001", GXv_int2) ;
      pcls000.this.GXt_int1 = GXv_int2[0] ;
      AV56Flag2 = GXt_int1 ;
      GXt_int1 = AV59FlagBros ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV51EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int2) ;
      pcls000.this.GXt_int1 = GXv_int2[0] ;
      AV59FlagBros = GXt_int1 ;
      GXt_int1 = AV60FlagDia ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV51EmprCod, httpContext.getMessage( "DIARIO", ""), GXv_int2) ;
      pcls000.this.GXt_int1 = GXv_int2[0] ;
      AV60FlagDia = GXt_int1 ;
      GXt_int1 = AV55F_precio2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV51EmprCod, httpContext.getMessage( "PRECI2", ""), GXv_int2) ;
      pcls000.this.GXt_int1 = GXv_int2[0] ;
      AV55F_precio2 = GXt_int1 ;
      GXt_int1 = AV63FRebAut ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV51EmprCod, httpContext.getMessage( "REBAUT", ""), GXv_int2) ;
      pcls000.this.GXt_int1 = GXv_int2[0] ;
      AV63FRebAut = GXt_int1 ;
      GXt_int1 = AV61FlagExiNeg ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV51EmprCod, httpContext.getMessage( "EXINEG", ""), GXv_int2) ;
      pcls000.this.GXt_int1 = GXv_int2[0] ;
      AV61FlagExiNeg = GXt_int1 ;
      GXt_int1 = AV43CCNeg ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV51EmprCod, httpContext.getMessage( "CCNEG", ""), GXv_int2) ;
      pcls000.this.GXt_int1 = GXv_int2[0] ;
      AV43CCNeg = GXt_int1 ;
      GXt_int1 = AV44CieLote ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV51EmprCod, httpContext.getMessage( "CIELOT", ""), GXv_int2) ;
      pcls000.this.GXt_int1 = GXv_int2[0] ;
      AV44CieLote = GXt_int1 ;
      GXt_int1 = AV57Flag3 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV51EmprCod, httpContext.getMessage( "CIERRE", ""), GXv_int2) ;
      pcls000.this.GXt_int1 = GXv_int2[0] ;
      AV57Flag3 = GXt_int1 ;
      /* Using cursor P055J2 */
      pr_default.execute(0, new Object[] {AV51EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P055J2_A396EmprCod[0] ;
         A3915EmpNumDec = P055J2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P055J2_n3915EmpNumDec[0] ;
         AV50EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV52EntLotN = " " ;
      /* Using cursor P055J4 */
      pr_default.execute(1, new Object[] {AV51EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P055J4_A719PrdNum[0] ;
         n719PrdNum = P055J4_n719PrdNum[0] ;
         A396EmprCod = P055J4_A396EmprCod[0] ;
         A228BarUniMed = P055J4_A228BarUniMed[0] ;
         A217BarTipArt = P055J4_A217BarTipArt[0] ;
         n217BarTipArt = P055J4_n217BarTipArt[0] ;
         A724PrdPreAct = P055J4_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P055J4_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P055J4_A707PrdFacCon[0] ;
         A1797PrdCanAny = P055J4_A1797PrdCanAny[0] ;
         A686PrdCant = P055J4_A686PrdCant[0] ;
         A705PrdExiCC = P055J4_A705PrdExiCC[0] ;
         A5527RecLinRea = P055J4_A5527RecLinRea[0] ;
         A704PrdExiAlm = P055J4_A704PrdExiAlm[0] ;
         A718PrdNom = P055J4_A718PrdNom[0] ;
         A683PrdCanFin = P055J4_A683PrdCanFin[0] ;
         A3915EmpNumDec = P055J4_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P055J4_n3915EmpNumDec[0] ;
         A811RecLin = P055J4_A811RecLin[0] ;
         A1273RecLinPro = P055J4_A1273RecLinPro[0] ;
         A166BarKgm = P055J4_A166BarKgm[0] ;
         A184BarMtr = P055J4_A184BarMtr[0] ;
         A3915EmpNumDec = P055J4_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P055J4_n3915EmpNumDec[0] ;
         A724PrdPreAct = P055J4_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P055J4_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P055J4_A707PrdFacCon[0] ;
         A705PrdExiCC = P055J4_A705PrdExiCC[0] ;
         A704PrdExiAlm = P055J4_A704PrdExiAlm[0] ;
         A718PrdNom = P055J4_A718PrdNom[0] ;
         A228BarUniMed = P055J4_A228BarUniMed[0] ;
         A217BarTipArt = P055J4_A217BarTipArt[0] ;
         n217BarTipArt = P055J4_n217BarTipArt[0] ;
         A166BarKgm = P055J4_A166BarKgm[0] ;
         A184BarMtr = P055J4_A184BarMtr[0] ;
         AV40BarKgm = A166BarKgm ;
         AV41BarMtr = A184BarMtr ;
         AV75UniMed = A228BarUniMed ;
         AV42BarTipArt = A217BarTipArt ;
         AV69PrdPreAct = ((AV55F_precio2==1)&&(A5255PrdPreAc2.doubleValue()>0) ? A5255PrdPreAc2 : A724PrdPreAct) ;
         AV54Exis = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         if ( (0==AV57Flag3) || ( GXutil.strcmp(AV70Tipo, httpContext.getMessage( "M", "")) == 0 ) )
         {
            if ( AV45Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV54Exis).doubleValue() < 0 ) && ( AV61FlagExiNeg == 0 ) )
               {
                  if ( AV43CCNeg == 0 )
                  {
                     GXv_char3[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls001(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char3[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
                  else
                  {
                     GXv_char4[0] = AV51EmprCod ;
                     GXv_char3[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls002(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char4[0] ;
                     pcls000.this.A719PrdNum = GXv_char3[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
               }
               else
               {
                  GXv_char4[0] = AV51EmprCod ;
                  GXv_char3[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV54Exis ;
                  new app.pcls002(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                  pcls000.this.AV51EmprCod = GXv_char4[0] ;
                  pcls000.this.A719PrdNum = GXv_char3[0] ;
                  pcls000.this.AV54Exis = GXv_decimal5[0] ;
               }
            }
            else
            {
               if ( ( ( AV63FRebAut == 1 ) && ( GXutil.strcmp(A5527RecLinRea, httpContext.getMessage( "N", "")) == 0 ) ) || ( AV63FRebAut == 0 ) )
               {
                  if ( A704PrdExiAlm.subtract(AV54Exis).doubleValue() < 0 )
                  {
                     if ( AV61FlagExiNeg == 0 )
                     {
                        GXv_char4[0] = AV51EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        new app.pcls003(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                        pcls000.this.AV51EmprCod = GXv_char4[0] ;
                        pcls000.this.A719PrdNum = GXv_char3[0] ;
                     }
                     else
                     {
                        GXv_char4[0] = AV51EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_decimal5[0] = AV54Exis ;
                        new app.pcls004(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                        pcls000.this.AV51EmprCod = GXv_char4[0] ;
                        pcls000.this.A719PrdNum = GXv_char3[0] ;
                        pcls000.this.AV54Exis = GXv_decimal5[0] ;
                     }
                  }
                  else
                  {
                     Gx_msg = httpContext.getMessage( "2.Go PCLS004 ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + A719PrdNum + " " + GXutil.trim( A718PrdNom) + " " + GXutil.trim( GXutil.str( AV54Exis, 12, 4)) ;
                     GXv_char4[0] = AV51EmprCod ;
                     GXv_char3[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls004(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char4[0] ;
                     pcls000.this.A719PrdNum = GXv_char3[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
               }
               GXv_char4[0] = AV51EmprCod ;
               GXv_char3[0] = A719PrdNum ;
               GXv_decimal5[0] = AV54Exis ;
               GXv_char6[0] = AV52EntLotN ;
               new app.pcls005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5, GXv_char6) ;
               pcls000.this.AV51EmprCod = GXv_char4[0] ;
               pcls000.this.A719PrdNum = GXv_char3[0] ;
               pcls000.this.AV54Exis = GXv_decimal5[0] ;
               pcls000.this.AV52EntLotN = GXv_char6[0] ;
            }
            if ( ! (0==AV56Flag2) )
            {
               AV66PrdCanFin = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A683PrdCanFin)==0) ? A686PrdCant : A683PrdCanFin) ;
               if ( ( ( AV63FRebAut == 1 ) && ( GXutil.strcmp(A5527RecLinRea, httpContext.getMessage( "N", "")) == 0 ) ) || ( AV63FRebAut == 0 ) )
               {
                  GXv_char6[0] = AV51EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV66PrdCanFin ;
                  new app.pcls006(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                  pcls000.this.AV51EmprCod = GXv_char6[0] ;
                  pcls000.this.A719PrdNum = GXv_char4[0] ;
                  pcls000.this.AV66PrdCanFin = GXv_decimal5[0] ;
               }
            }
         }
         else
         {
            if ( AV45Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV54Exis).doubleValue() < 0 ) && ( AV61FlagExiNeg == 0 ) )
               {
                  if ( AV43CCNeg == 0 )
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls001(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV51EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV54Exis ;
                  new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                  pcls000.this.AV51EmprCod = GXv_char6[0] ;
                  pcls000.this.A719PrdNum = GXv_char4[0] ;
                  pcls000.this.AV54Exis = GXv_decimal5[0] ;
               }
            }
            else
            {
               GXv_char6[0] = AV51EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal5[0] = AV54Exis ;
               GXv_char3[0] = AV52EntLotN ;
               new app.pcls005(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5, GXv_char3) ;
               pcls000.this.AV51EmprCod = GXv_char6[0] ;
               pcls000.this.A719PrdNum = GXv_char4[0] ;
               pcls000.this.AV54Exis = GXv_decimal5[0] ;
               pcls000.this.AV52EntLotN = GXv_char3[0] ;
            }
         }
         if ( A3915EmpNumDec == 0 )
         {
            AV49CosPro2 = AV49CosPro2.add((A686PrdCant.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            AV47CosAny2 = AV47CosAny2.add((A1797PrdCanAny.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV49CosPro2 = AV49CosPro2.add((A686PrdCant.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               AV47CosAny2 = AV47CosAny2.add((A1797PrdCanAny.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P055J5 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P055J5_A719PrdNum[0] ;
         n719PrdNum = P055J5_n719PrdNum[0] ;
         A686PrdCant = P055J5_A686PrdCant[0] ;
         A1797PrdCanAny = P055J5_A1797PrdCanAny[0] ;
         A683PrdCanFin = P055J5_A683PrdCanFin[0] ;
         A811RecLin = P055J5_A811RecLin[0] ;
         A1273RecLinPro = P055J5_A1273RecLinPro[0] ;
         A396EmprCod = P055J5_A396EmprCod[0] ;
         AV68PrdComCod = A719PrdNum ;
         AV67PrdCant = A686PrdCant ;
         AV65PrdCanAny = A1797PrdCanAny ;
         AV66PrdCanFin = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A683PrdCanFin)==0) ? A686PrdCant : A683PrdCanFin) ;
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
      /* Using cursor P055J6 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2808RecLinMAL = P055J6_A2808RecLinMAL[0] ;
         A719PrdNum = P055J6_A719PrdNum[0] ;
         n719PrdNum = P055J6_n719PrdNum[0] ;
         A724PrdPreAct = P055J6_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P055J6_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P055J6_A707PrdFacCon[0] ;
         A1378PrdCFin = P055J6_A1378PrdCFin[0] ;
         n1378PrdCFin = P055J6_n1378PrdCFin[0] ;
         A705PrdExiCC = P055J6_A705PrdExiCC[0] ;
         A704PrdExiAlm = P055J6_A704PrdExiAlm[0] ;
         A718PrdNom = P055J6_A718PrdNom[0] ;
         A3915EmpNumDec = P055J6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P055J6_n3915EmpNumDec[0] ;
         A1377RecNumAny = P055J6_A1377RecNumAny[0] ;
         A396EmprCod = P055J6_A396EmprCod[0] ;
         A3915EmpNumDec = P055J6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P055J6_n3915EmpNumDec[0] ;
         A724PrdPreAct = P055J6_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P055J6_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P055J6_A707PrdFacCon[0] ;
         A705PrdExiCC = P055J6_A705PrdExiCC[0] ;
         A704PrdExiAlm = P055J6_A704PrdExiAlm[0] ;
         A718PrdNom = P055J6_A718PrdNom[0] ;
         AV69PrdPreAct = ((AV55F_precio2==1)&&(A5255PrdPreAc2.doubleValue()>0) ? A5255PrdPreAc2 : A724PrdPreAct) ;
         AV54Exis = (A1378PrdCFin.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         if ( (0==AV57Flag3) || ( GXutil.strcmp(AV70Tipo, httpContext.getMessage( "M", "")) == 0 ) )
         {
            if ( AV45Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV54Exis).doubleValue() < 0 ) && ( AV61FlagExiNeg == 0 ) )
               {
                  if ( AV43CCNeg == 0 )
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls001(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV51EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV54Exis ;
                  new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                  pcls000.this.AV51EmprCod = GXv_char6[0] ;
                  pcls000.this.A719PrdNum = GXv_char4[0] ;
                  pcls000.this.AV54Exis = GXv_decimal5[0] ;
               }
            }
            else
            {
               if ( A704PrdExiAlm.subtract(AV54Exis).doubleValue() < 0 )
               {
                  if ( AV61FlagExiNeg == 0 )
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     new app.pcls003(remoteHandle, context).execute( GXv_char6, GXv_char4) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls004(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
               }
               else
               {
                  Gx_msg = httpContext.getMessage( "2.Go PCLS004 ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + A719PrdNum + " " + GXutil.trim( A718PrdNom) + " " + GXutil.trim( GXutil.str( AV54Exis, 12, 4)) ;
                  GXv_char6[0] = AV51EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV54Exis ;
                  new app.pcls004(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                  pcls000.this.AV51EmprCod = GXv_char6[0] ;
                  pcls000.this.A719PrdNum = GXv_char4[0] ;
                  pcls000.this.AV54Exis = GXv_decimal5[0] ;
               }
               GXv_char6[0] = AV51EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal5[0] = AV54Exis ;
               GXv_char3[0] = AV52EntLotN ;
               new app.pcls005(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5, GXv_char3) ;
               pcls000.this.AV51EmprCod = GXv_char6[0] ;
               pcls000.this.A719PrdNum = GXv_char4[0] ;
               pcls000.this.AV54Exis = GXv_decimal5[0] ;
               pcls000.this.AV52EntLotN = GXv_char3[0] ;
            }
         }
         else
         {
            if ( AV45Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV54Exis).doubleValue() < 0 ) && ( AV61FlagExiNeg == 0 ) )
               {
                  if ( AV43CCNeg == 0 )
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls001(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV51EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV54Exis ;
                  new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                  pcls000.this.AV51EmprCod = GXv_char6[0] ;
                  pcls000.this.A719PrdNum = GXv_char4[0] ;
                  pcls000.this.AV54Exis = GXv_decimal5[0] ;
               }
            }
            else
            {
               GXv_char6[0] = AV51EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal5[0] = AV54Exis ;
               GXv_char3[0] = AV52EntLotN ;
               new app.pcls005(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5, GXv_char3) ;
               pcls000.this.AV51EmprCod = GXv_char6[0] ;
               pcls000.this.A719PrdNum = GXv_char4[0] ;
               pcls000.this.AV54Exis = GXv_decimal5[0] ;
               pcls000.this.AV52EntLotN = GXv_char3[0] ;
            }
         }
         if ( A3915EmpNumDec == 0 )
         {
            AV47CosAny2 = AV47CosAny2.add((A1378PrdCFin.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV47CosAny2 = AV47CosAny2.add((A1378PrdCFin.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV50EmpNumDec == 2 )
      {
         AV46CosAny = GXutil.roundDecimal( AV47CosAny2, 2) ;
         AV48CosPro = GXutil.roundDecimal( AV49CosPro2, 2) ;
      }
      else
      {
         if ( AV50EmpNumDec == 0 )
         {
            AV46CosAny = AV47CosAny2 ;
            AV48CosPro = AV49CosPro2 ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUEST' Routine */
      returnInSub = false ;
      /* Using cursor P055J7 */
      pr_default.execute(4, new Object[] {AV68PrdComCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A688PrdComCod = P055J7_A688PrdComCod[0] ;
         A724PrdPreAct = P055J7_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P055J7_A5255PrdPreAc2[0] ;
         A690PrdComFN = P055J7_A690PrdComFN[0] ;
         A707PrdFacCon = P055J7_A707PrdFacCon[0] ;
         A705PrdExiCC = P055J7_A705PrdExiCC[0] ;
         A3915EmpNumDec = P055J7_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P055J7_n3915EmpNumDec[0] ;
         A719PrdNum = P055J7_A719PrdNum[0] ;
         n719PrdNum = P055J7_n719PrdNum[0] ;
         A396EmprCod = P055J7_A396EmprCod[0] ;
         A3915EmpNumDec = P055J7_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P055J7_n3915EmpNumDec[0] ;
         A724PrdPreAct = P055J7_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P055J7_A5255PrdPreAc2[0] ;
         A707PrdFacCon = P055J7_A707PrdFacCon[0] ;
         A705PrdExiCC = P055J7_A705PrdExiCC[0] ;
         AV69PrdPreAct = ((AV55F_precio2==1)&&(A5255PrdPreAc2.doubleValue()>0) ? A5255PrdPreAc2 : A724PrdPreAct) ;
         AV54Exis = ((AV67PrdCant.add(AV65PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         if ( (0==AV57Flag3) || ( GXutil.strcmp(AV70Tipo, httpContext.getMessage( "M", "")) == 0 ) )
         {
            if ( AV45Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV54Exis).doubleValue() < 0 ) && ( AV61FlagExiNeg == 0 ) )
               {
                  if ( AV43CCNeg == 0 )
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls001(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV54Exis ;
                     new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal5[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV51EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV54Exis ;
                  new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                  pcls000.this.AV51EmprCod = GXv_char6[0] ;
                  pcls000.this.A719PrdNum = GXv_char4[0] ;
                  pcls000.this.AV54Exis = GXv_decimal5[0] ;
               }
            }
            else
            {
               if ( AV61FlagExiNeg == 0 )
               {
                  GXv_char6[0] = AV51EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  new app.pcls003(remoteHandle, context).execute( GXv_char6, GXv_char4) ;
                  pcls000.this.AV51EmprCod = GXv_char6[0] ;
                  pcls000.this.A719PrdNum = GXv_char4[0] ;
               }
               else
               {
                  GXv_char6[0] = AV51EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = AV54Exis ;
                  new app.pcls004(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5) ;
                  pcls000.this.AV51EmprCod = GXv_char6[0] ;
                  pcls000.this.A719PrdNum = GXv_char4[0] ;
                  pcls000.this.AV54Exis = GXv_decimal5[0] ;
               }
               GXv_char6[0] = AV51EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal5[0] = AV54Exis ;
               GXv_char3[0] = AV52EntLotN ;
               new app.pcls005(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5, GXv_char3) ;
               pcls000.this.AV51EmprCod = GXv_char6[0] ;
               pcls000.this.A719PrdNum = GXv_char4[0] ;
               pcls000.this.AV54Exis = GXv_decimal5[0] ;
               pcls000.this.AV52EntLotN = GXv_char3[0] ;
            }
            if ( ! (0==AV56Flag2) )
            {
               GXv_char6[0] = AV51EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal5[0] = AV66PrdCanFin ;
               GXv_decimal7[0] = A690PrdComFN ;
               new app.pcls007(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal5, GXv_decimal7) ;
               pcls000.this.AV51EmprCod = GXv_char6[0] ;
               pcls000.this.A719PrdNum = GXv_char4[0] ;
               pcls000.this.AV66PrdCanFin = GXv_decimal5[0] ;
               pcls000.this.A690PrdComFN = GXv_decimal7[0] ;
            }
         }
         else
         {
            if ( AV45Consumos == 0 )
            {
               if ( ( A705PrdExiCC.subtract(AV54Exis).doubleValue() < 0 ) && ( AV61FlagExiNeg == 0 ) )
               {
                  if ( AV43CCNeg == 0 )
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal7[0] = AV54Exis ;
                     new app.pcls001(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal7) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal7[0] ;
                  }
                  else
                  {
                     GXv_char6[0] = AV51EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal7[0] = AV54Exis ;
                     new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal7) ;
                     pcls000.this.AV51EmprCod = GXv_char6[0] ;
                     pcls000.this.A719PrdNum = GXv_char4[0] ;
                     pcls000.this.AV54Exis = GXv_decimal7[0] ;
                  }
               }
               else
               {
                  GXv_char6[0] = AV51EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal7[0] = AV54Exis ;
                  new app.pcls002(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal7) ;
                  pcls000.this.AV51EmprCod = GXv_char6[0] ;
                  pcls000.this.A719PrdNum = GXv_char4[0] ;
                  pcls000.this.AV54Exis = GXv_decimal7[0] ;
               }
            }
            else
            {
               GXv_char6[0] = AV51EmprCod ;
               GXv_char4[0] = A719PrdNum ;
               GXv_decimal7[0] = AV54Exis ;
               GXv_char3[0] = AV52EntLotN ;
               new app.pcls005(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_decimal7, GXv_char3) ;
               pcls000.this.AV51EmprCod = GXv_char6[0] ;
               pcls000.this.A719PrdNum = GXv_char4[0] ;
               pcls000.this.AV54Exis = GXv_decimal7[0] ;
               pcls000.this.AV52EntLotN = GXv_char3[0] ;
            }
         }
         if ( A3915EmpNumDec == 0 )
         {
            AV49CosPro2 = AV49CosPro2.add((AV67PrdCant.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            AV47CosAny2 = AV47CosAny2.add((AV65PrdCanAny.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV49CosPro2 = AV49CosPro2.add((AV67PrdCant.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               AV47CosAny2 = AV47CosAny2.add((AV65PrdCanAny.multiply(AV69PrdPreAct).multiply(A707PrdFacCon)).multiply((A690PrdComFN.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls000.this.AV51EmprCod;
      this.aP1[0] = pcls000.this.A129BarCod;
      this.aP2[0] = pcls000.this.A132BarCodReo;
      this.aP3[0] = pcls000.this.A130BarCodPar;
      this.aP4[0] = pcls000.this.AV48CosPro;
      this.aP5[0] = pcls000.this.AV46CosAny;
      this.aP6[0] = pcls000.this.AV45Consumos;
      this.aP7[0] = pcls000.this.A2804RecLinMaq;
      this.aP8[0] = pcls000.this.AV70Tipo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P055J2_A396EmprCod = new String[] {""} ;
      P055J2_A3915EmpNumDec = new byte[1] ;
      P055J2_n3915EmpNumDec = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV52EntLotN = "" ;
      P055J4_A129BarCod = new int[1] ;
      P055J4_A132BarCodReo = new byte[1] ;
      P055J4_A130BarCodPar = new String[] {""} ;
      P055J4_A2804RecLinMaq = new short[1] ;
      P055J4_A719PrdNum = new String[] {""} ;
      P055J4_n719PrdNum = new boolean[] {false} ;
      P055J4_A396EmprCod = new String[] {""} ;
      P055J4_A228BarUniMed = new String[] {""} ;
      P055J4_A217BarTipArt = new short[1] ;
      P055J4_n217BarTipArt = new boolean[] {false} ;
      P055J4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J4_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J4_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J4_A5527RecLinRea = new String[] {""} ;
      P055J4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J4_A718PrdNom = new String[] {""} ;
      P055J4_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J4_A3915EmpNumDec = new byte[1] ;
      P055J4_n3915EmpNumDec = new boolean[] {false} ;
      P055J4_A811RecLin = new short[1] ;
      P055J4_A1273RecLinPro = new byte[1] ;
      P055J4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV40BarKgm = DecimalUtil.ZERO ;
      AV41BarMtr = DecimalUtil.ZERO ;
      AV75UniMed = "" ;
      AV69PrdPreAct = DecimalUtil.ZERO ;
      AV54Exis = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV66PrdCanFin = DecimalUtil.ZERO ;
      AV49CosPro2 = DecimalUtil.ZERO ;
      AV47CosAny2 = DecimalUtil.ZERO ;
      P055J5_A129BarCod = new int[1] ;
      P055J5_A132BarCodReo = new byte[1] ;
      P055J5_A130BarCodPar = new String[] {""} ;
      P055J5_A2804RecLinMaq = new short[1] ;
      P055J5_A719PrdNum = new String[] {""} ;
      P055J5_n719PrdNum = new boolean[] {false} ;
      P055J5_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J5_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J5_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J5_A811RecLin = new short[1] ;
      P055J5_A1273RecLinPro = new byte[1] ;
      P055J5_A396EmprCod = new String[] {""} ;
      AV68PrdComCod = "" ;
      AV67PrdCant = DecimalUtil.ZERO ;
      AV65PrdCanAny = DecimalUtil.ZERO ;
      P055J6_A129BarCod = new int[1] ;
      P055J6_A132BarCodReo = new byte[1] ;
      P055J6_A130BarCodPar = new String[] {""} ;
      P055J6_A2808RecLinMAL = new short[1] ;
      P055J6_A719PrdNum = new String[] {""} ;
      P055J6_n719PrdNum = new boolean[] {false} ;
      P055J6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J6_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J6_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J6_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J6_n1378PrdCFin = new boolean[] {false} ;
      P055J6_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J6_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J6_A718PrdNom = new String[] {""} ;
      P055J6_A3915EmpNumDec = new byte[1] ;
      P055J6_n3915EmpNumDec = new boolean[] {false} ;
      P055J6_A1377RecNumAny = new byte[1] ;
      P055J6_A396EmprCod = new String[] {""} ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      P055J7_A688PrdComCod = new String[] {""} ;
      P055J7_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J7_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J7_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J7_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J7_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055J7_A3915EmpNumDec = new byte[1] ;
      P055J7_n3915EmpNumDec = new boolean[] {false} ;
      P055J7_A719PrdNum = new String[] {""} ;
      P055J7_n719PrdNum = new boolean[] {false} ;
      P055J7_A396EmprCod = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_char6 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls000__default(),
         new Object[] {
             new Object[] {
            P055J2_A396EmprCod, P055J2_A3915EmpNumDec, P055J2_n3915EmpNumDec
            }
            , new Object[] {
            P055J4_A129BarCod, P055J4_A132BarCodReo, P055J4_A130BarCodPar, P055J4_A2804RecLinMaq, P055J4_A719PrdNum, P055J4_n719PrdNum, P055J4_A396EmprCod, P055J4_A228BarUniMed, P055J4_A217BarTipArt, P055J4_n217BarTipArt,
            P055J4_A724PrdPreAct, P055J4_A5255PrdPreAc2, P055J4_A707PrdFacCon, P055J4_A1797PrdCanAny, P055J4_A686PrdCant, P055J4_A705PrdExiCC, P055J4_A5527RecLinRea, P055J4_A704PrdExiAlm, P055J4_A718PrdNom, P055J4_A683PrdCanFin,
            P055J4_A3915EmpNumDec, P055J4_n3915EmpNumDec, P055J4_A811RecLin, P055J4_A1273RecLinPro, P055J4_A166BarKgm, P055J4_A184BarMtr
            }
            , new Object[] {
            P055J5_A129BarCod, P055J5_A132BarCodReo, P055J5_A130BarCodPar, P055J5_A2804RecLinMaq, P055J5_A719PrdNum, P055J5_n719PrdNum, P055J5_A686PrdCant, P055J5_A1797PrdCanAny, P055J5_A683PrdCanFin, P055J5_A811RecLin,
            P055J5_A1273RecLinPro, P055J5_A396EmprCod
            }
            , new Object[] {
            P055J6_A129BarCod, P055J6_A132BarCodReo, P055J6_A130BarCodPar, P055J6_A2808RecLinMAL, P055J6_A719PrdNum, P055J6_A724PrdPreAct, P055J6_A5255PrdPreAc2, P055J6_A707PrdFacCon, P055J6_A1378PrdCFin, P055J6_n1378PrdCFin,
            P055J6_A705PrdExiCC, P055J6_A704PrdExiAlm, P055J6_A718PrdNom, P055J6_A3915EmpNumDec, P055J6_n3915EmpNumDec, P055J6_A1377RecNumAny, P055J6_A396EmprCod
            }
            , new Object[] {
            P055J7_A688PrdComCod, P055J7_A724PrdPreAct, P055J7_A5255PrdPreAc2, P055J7_A690PrdComFN, P055J7_A707PrdFacCon, P055J7_A705PrdExiCC, P055J7_A3915EmpNumDec, P055J7_n3915EmpNumDec, P055J7_A719PrdNum, P055J7_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV45Consumos ;
   private byte AV56Flag2 ;
   private byte AV59FlagBros ;
   private byte AV60FlagDia ;
   private byte AV55F_precio2 ;
   private byte AV63FRebAut ;
   private byte AV61FlagExiNeg ;
   private byte AV43CCNeg ;
   private byte AV44CieLote ;
   private byte AV57Flag3 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A3915EmpNumDec ;
   private byte AV50EmpNumDec ;
   private byte A1273RecLinPro ;
   private byte A1377RecNumAny ;
   private short A2804RecLinMaq ;
   private short A217BarTipArt ;
   private short A811RecLin ;
   private short AV42BarTipArt ;
   private short A2808RecLinMAL ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV48CosPro ;
   private java.math.BigDecimal AV46CosAny ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV40BarKgm ;
   private java.math.BigDecimal AV41BarMtr ;
   private java.math.BigDecimal AV69PrdPreAct ;
   private java.math.BigDecimal AV54Exis ;
   private java.math.BigDecimal AV66PrdCanFin ;
   private java.math.BigDecimal AV49CosPro2 ;
   private java.math.BigDecimal AV47CosAny2 ;
   private java.math.BigDecimal AV67PrdCant ;
   private java.math.BigDecimal AV65PrdCanAny ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String AV51EmprCod ;
   private String A130BarCodPar ;
   private String AV70Tipo ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV52EntLotN ;
   private String A719PrdNum ;
   private String A228BarUniMed ;
   private String A5527RecLinRea ;
   private String A718PrdNom ;
   private String AV75UniMed ;
   private String Gx_msg ;
   private String AV68PrdComCod ;
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
   private String[] P055J2_A396EmprCod ;
   private byte[] P055J2_A3915EmpNumDec ;
   private boolean[] P055J2_n3915EmpNumDec ;
   private int[] P055J4_A129BarCod ;
   private byte[] P055J4_A132BarCodReo ;
   private String[] P055J4_A130BarCodPar ;
   private short[] P055J4_A2804RecLinMaq ;
   private String[] P055J4_A719PrdNum ;
   private boolean[] P055J4_n719PrdNum ;
   private String[] P055J4_A396EmprCod ;
   private String[] P055J4_A228BarUniMed ;
   private short[] P055J4_A217BarTipArt ;
   private boolean[] P055J4_n217BarTipArt ;
   private java.math.BigDecimal[] P055J4_A724PrdPreAct ;
   private java.math.BigDecimal[] P055J4_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P055J4_A707PrdFacCon ;
   private java.math.BigDecimal[] P055J4_A1797PrdCanAny ;
   private java.math.BigDecimal[] P055J4_A686PrdCant ;
   private java.math.BigDecimal[] P055J4_A705PrdExiCC ;
   private String[] P055J4_A5527RecLinRea ;
   private java.math.BigDecimal[] P055J4_A704PrdExiAlm ;
   private String[] P055J4_A718PrdNom ;
   private java.math.BigDecimal[] P055J4_A683PrdCanFin ;
   private byte[] P055J4_A3915EmpNumDec ;
   private boolean[] P055J4_n3915EmpNumDec ;
   private short[] P055J4_A811RecLin ;
   private byte[] P055J4_A1273RecLinPro ;
   private java.math.BigDecimal[] P055J4_A166BarKgm ;
   private java.math.BigDecimal[] P055J4_A184BarMtr ;
   private int[] P055J5_A129BarCod ;
   private byte[] P055J5_A132BarCodReo ;
   private String[] P055J5_A130BarCodPar ;
   private short[] P055J5_A2804RecLinMaq ;
   private String[] P055J5_A719PrdNum ;
   private boolean[] P055J5_n719PrdNum ;
   private java.math.BigDecimal[] P055J5_A686PrdCant ;
   private java.math.BigDecimal[] P055J5_A1797PrdCanAny ;
   private java.math.BigDecimal[] P055J5_A683PrdCanFin ;
   private short[] P055J5_A811RecLin ;
   private byte[] P055J5_A1273RecLinPro ;
   private String[] P055J5_A396EmprCod ;
   private int[] P055J6_A129BarCod ;
   private byte[] P055J6_A132BarCodReo ;
   private String[] P055J6_A130BarCodPar ;
   private short[] P055J6_A2808RecLinMAL ;
   private String[] P055J6_A719PrdNum ;
   private boolean[] P055J6_n719PrdNum ;
   private java.math.BigDecimal[] P055J6_A724PrdPreAct ;
   private java.math.BigDecimal[] P055J6_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P055J6_A707PrdFacCon ;
   private java.math.BigDecimal[] P055J6_A1378PrdCFin ;
   private boolean[] P055J6_n1378PrdCFin ;
   private java.math.BigDecimal[] P055J6_A705PrdExiCC ;
   private java.math.BigDecimal[] P055J6_A704PrdExiAlm ;
   private String[] P055J6_A718PrdNom ;
   private byte[] P055J6_A3915EmpNumDec ;
   private boolean[] P055J6_n3915EmpNumDec ;
   private byte[] P055J6_A1377RecNumAny ;
   private String[] P055J6_A396EmprCod ;
   private String[] P055J7_A688PrdComCod ;
   private java.math.BigDecimal[] P055J7_A724PrdPreAct ;
   private java.math.BigDecimal[] P055J7_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P055J7_A690PrdComFN ;
   private java.math.BigDecimal[] P055J7_A707PrdFacCon ;
   private java.math.BigDecimal[] P055J7_A705PrdExiCC ;
   private byte[] P055J7_A3915EmpNumDec ;
   private boolean[] P055J7_n3915EmpNumDec ;
   private String[] P055J7_A719PrdNum ;
   private boolean[] P055J7_n719PrdNum ;
   private String[] P055J7_A396EmprCod ;
}

final  class pcls000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055J2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055J4", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdNum, T1.EmprCod, T4.BarUniMed, T4.BarTipArt, T3.PrdPreAct, T3.PrdPreAc2, T3.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T3.PrdExiCC, T1.RecLinRea, T3.PrdExiAlm, T3.PrdNom, T1.PrdCanFin, T2.EmpNumDec, T1.RecLin, T1.RecLinPro, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarMtr, 0) AS BarMtr FROM ((((TXPLRECET T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) AND (SUBSTR(T1.PrdNum, 1, 1) <> '0') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P055J5", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, PrdNum, PrdCant, PrdCanAny, PrdCanFin, RecLin, RecLinPro, EmprCod FROM TXPLRECET WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (RecLinMaq = ?) AND (Not (rtrim(PrdNum) IS NULL AND NOT(PrdNum IS NULL))) AND (SUBSTR(PrdNum, 1, 1) = '0') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P055J6", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum, T3.PrdPreAct, T3.PrdPreAc2, T3.PrdFacCon, T1.PrdCFin, T3.PrdExiCC, T3.PrdExiAlm, T3.PrdNom, T2.EmpNumDec, T1.RecNumAny, T1.EmprCod FROM ((TXPLANYAD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) AND (T1.RecLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P055J7", "SELECT T1.PrdComCod, T3.PrdPreAct, T3.PrdPreAc2, T1.PrdComFN, T3.PrdFacCon, T3.PrdExiCC, T2.EmpNumDec, T1.PrdNum, T1.EmprCod FROM ((TXPLPRDCO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE T1.PrdComCod = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,3);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,4);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,4);
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,3);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((byte[]) buf[23])[0] = rslt.getByte(21);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,2);
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
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 6);
               return;
      }
   }

}

