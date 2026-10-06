package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp02 extends GXProcedure
{
   public pdyrp02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp02.class ), "" );
   }

   public pdyrp02( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             int[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             byte[] aP12 ,
                             short[] aP13 ,
                             byte[] aP14 ,
                             byte[] aP15 ,
                             byte[] aP16 ,
                             byte[] aP17 ,
                             short[] aP18 ,
                             byte[] aP19 )
   {
      pdyrp02.this.aP20 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
      return aP20[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        int[] aP8 ,
                        byte[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        byte[] aP12 ,
                        short[] aP13 ,
                        byte[] aP14 ,
                        byte[] aP15 ,
                        byte[] aP16 ,
                        byte[] aP17 ,
                        short[] aP18 ,
                        byte[] aP19 ,
                        String[] aP20 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             int[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             byte[] aP12 ,
                             short[] aP13 ,
                             byte[] aP14 ,
                             byte[] aP15 ,
                             byte[] aP16 ,
                             byte[] aP17 ,
                             short[] aP18 ,
                             byte[] aP19 ,
                             String[] aP20 )
   {
      pdyrp02.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp02.this.AV153PrdNumPaso = aP1[0];
      this.aP1 = aP1;
      pdyrp02.this.AV82Cantidad = aP2[0];
      this.aP2 = aP2;
      pdyrp02.this.AV79UniMed = aP3[0];
      this.aP3 = aP3;
      pdyrp02.this.AV83TotKil = aP4[0];
      this.aP4 = aP4;
      pdyrp02.this.AV80BarVol = aP5[0];
      this.aP5 = aP5;
      pdyrp02.this.AV84ValCos = aP6[0];
      this.aP6 = aP6;
      pdyrp02.this.AV130LinRec = aP7[0];
      this.aP7 = aP7;
      pdyrp02.this.AV88BarCod = aP8[0];
      this.aP8 = aP8;
      pdyrp02.this.AV90BarCodReo = aP9[0];
      this.aP9 = aP9;
      pdyrp02.this.AV89BarCodPar = aP10[0];
      this.aP10 = aP10;
      pdyrp02.this.AV114Flag1 = aP11[0];
      this.aP11 = aP11;
      pdyrp02.this.AV115Flag2 = aP12[0];
      this.aP12 = aP12;
      pdyrp02.this.AV78UltRecLin = aP13[0];
      this.aP13 = aP13;
      pdyrp02.this.AV129Linea = aP14[0];
      this.aP14 = aP14;
      pdyrp02.this.AV109ExiCon = aP15[0];
      this.aP15 = aP15;
      pdyrp02.this.AV77FlagComp = aP16[0];
      this.aP16 = aP16;
      pdyrp02.this.AV161ProForNro = aP17[0];
      this.aP17 = aP17;
      pdyrp02.this.AV165RecLinMaq = aP18[0];
      this.aP18 = aP18;
      pdyrp02.this.AV173TanqueN = aP19[0];
      this.aP19 = aP19;
      pdyrp02.this.AV160ProForDes = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV103Consumos ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int2) ;
      pdyrp02.this.GXt_int1 = GXv_int2[0] ;
      AV103Consumos = (byte)(GXt_int1) ;
      GXt_int3 = AV178Validez12 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALI12", ""), GXv_int4) ;
      pdyrp02.this.GXt_int3 = GXv_int4[0] ;
      AV178Validez12 = GXt_int3 ;
      GXt_int3 = (byte)(AV183moda21) ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int4) ;
      pdyrp02.this.GXt_int3 = GXv_int4[0] ;
      AV183moda21 = GXt_int3 ;
      GXt_char5 = AV172Station ;
      GXv_char6[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      pdyrp02.this.GXt_char5 = GXv_char6[0] ;
      AV172Station = GXt_char5 ;
      GXv_char6[0] = A396EmprCod ;
      GXv_char7[0] = AV106Emprnom ;
      GXv_char8[0] = AV176Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV172Station, GXv_char6, GXv_char7, GXv_char8) ;
      pdyrp02.this.A396EmprCod = GXv_char6[0] ;
      pdyrp02.this.AV106Emprnom = GXv_char7[0] ;
      pdyrp02.this.AV176Usurcod = GXv_char8[0] ;
      AV78UltRecLin = (short)(((0==AV77FlagComp) ? AV130LinRec+10 : AV78UltRecLin)) ;
      if ( AV79UniMed == 3 )
      {
         AV81CanTeo = AV82Cantidad.multiply(AV83TotKil).multiply(DecimalUtil.doubleToDec(AV84ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else
      {
         AV81CanTeo = AV82Cantidad.multiply(DecimalUtil.doubleToDec(AV80BarVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      AV85FlagValCod = (byte)(0) ;
      /* Using cursor P098U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV153PrdNumPaso});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P098U2_A719PrdNum[0] ;
         n719PrdNum = P098U2_n719PrdNum[0] ;
         A718PrdNom = P098U2_A718PrdNom[0] ;
         A704PrdExiAlm = P098U2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P098U2_A705PrdExiCC[0] ;
         A856ValCod = P098U2_A856ValCod[0] ;
         A685PrdCanRes = P098U2_A685PrdCanRes[0] ;
         AV149PrdNomPaso = A718PrdNom ;
         AV113Existencia = ((AV103Consumos==0) ? A705PrdExiCC : A704PrdExiAlm) ;
         if ( ( A856ValCod == 3 ) || ( ( A856ValCod > 1 ) && ( AV140PrdAlS == 0 ) && ( AV178Validez12 == 0 ) ) || ( ( AV177Valcod > 2 ) && ( AV140PrdAlS == 0 ) && ( AV178Validez12 == 1 ) ) )
         {
            AV85FlagValCod = (byte)(1) ;
            if ( A856ValCod == 3 )
            {
               AV86FlagExis2 = (byte)(0) ;
            }
            else
            {
               AV152PrdNum2 = A719PrdNum ;
               GXv_char8[0] = A396EmprCod ;
               GXv_char7[0] = AV152PrdNum2 ;
               GXv_decimal9[0] = AV81CanTeo ;
               GXv_int4[0] = AV86FlagExis2 ;
               new app.pdyrp03(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_decimal9, GXv_int4) ;
               pdyrp02.this.A396EmprCod = GXv_char8[0] ;
               pdyrp02.this.AV152PrdNum2 = GXv_char7[0] ;
               pdyrp02.this.AV81CanTeo = GXv_decimal9[0] ;
               pdyrp02.this.AV86FlagExis2 = GXv_int4[0] ;
            }
            if ( AV86FlagExis2 == 0 )
            {
               AV150PrdNum = "" ;
               AV146PrdNom = httpContext.getMessage( "@ATENCION:", "") + A719PrdNum + httpContext.getMessage( "SUPRIMIDO", "") ;
               AV79UniMed = (byte)(0) ;
               AV97CanRec = DecimalUtil.ZERO ;
               AV82Cantidad = DecimalUtil.ZERO ;
               AV173TanqueN = (byte)(0) ;
               AV164RecAnyTie = (short)(1) ;
               /* Execute user subroutine: 'LRECET' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: 'BARCAD' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         else
         {
            AV102Comp = GXutil.substring( A719PrdNum, 1, 1) ;
            if ( GXutil.strcmp(AV102Comp, "0") != 0 )
            {
               AV110ExiRes = AV113Existencia.subtract(A685PrdCanRes) ;
               if ( DecimalUtil.compareTo(AV110ExiRes, AV81CanTeo) >= 0 )
               {
                  AV119FlagExis1 = (byte)(1) ;
               }
               else
               {
                  AV152PrdNum2 = A719PrdNum ;
                  GXv_char8[0] = A396EmprCod ;
                  GXv_char7[0] = AV152PrdNum2 ;
                  GXv_decimal9[0] = AV81CanTeo ;
                  GXv_int4[0] = AV86FlagExis2 ;
                  new app.pdyrp03(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_decimal9, GXv_int4) ;
                  pdyrp02.this.A396EmprCod = GXv_char8[0] ;
                  pdyrp02.this.AV152PrdNum2 = GXv_char7[0] ;
                  pdyrp02.this.AV81CanTeo = GXv_decimal9[0] ;
                  pdyrp02.this.AV86FlagExis2 = GXv_int4[0] ;
                  AV164RecAnyTie = (short)(0) ;
                  if ( AV86FlagExis2 == 0 )
                  {
                     AV119FlagExis1 = (byte)(1) ;
                     AV164RecAnyTie = (short)(1) ;
                  }
               }
            }
            else
            {
               AV150PrdNum = A719PrdNum ;
               AV146PrdNom = A718PrdNom ;
               AV97CanRec = AV81CanTeo ;
               AV164RecAnyTie = (short)(0) ;
               /* Execute user subroutine: 'LRECET' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               GXv_char8[0] = A396EmprCod ;
               GXv_char7[0] = AV150PrdNum ;
               GXv_decimal9[0] = AV81CanTeo ;
               GXv_int4[0] = AV79UniMed ;
               GXv_decimal10[0] = AV83TotKil ;
               GXv_int2[0] = AV80BarVol ;
               GXv_int11[0] = AV84ValCos ;
               new app.pdyrp04(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_decimal9, GXv_int4, GXv_decimal10, GXv_int2, GXv_int11) ;
               pdyrp02.this.A396EmprCod = GXv_char8[0] ;
               pdyrp02.this.AV150PrdNum = GXv_char7[0] ;
               pdyrp02.this.AV81CanTeo = GXv_decimal9[0] ;
               pdyrp02.this.AV79UniMed = GXv_int4[0] ;
               pdyrp02.this.AV83TotKil = GXv_decimal10[0] ;
               pdyrp02.this.AV80BarVol = GXv_int2[0] ;
               pdyrp02.this.AV84ValCos = GXv_int11[0] ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( ( AV85FlagValCod == 1 ) && ( AV86FlagExis2 == 0 ) ) || ( GXutil.strcmp(AV102Comp, "0") == 0 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV119FlagExis1 == 1 )
      {
         AV97CanRec = AV81CanTeo ;
         AV150PrdNum = AV153PrdNumPaso ;
         AV146PrdNom = AV149PrdNomPaso ;
         /* Execute user subroutine: 'LRECET' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV164RecAnyTie == 1 ) && ( GXutil.strcmp(AV146PrdNom, httpContext.getMessage( "AGUA", "")) != 0 ) )
         {
            /* Execute user subroutine: 'BARCAD' */
            S121 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         GXv_char8[0] = A396EmprCod ;
         GXv_char7[0] = AV153PrdNumPaso ;
         GXv_decimal10[0] = AV81CanTeo ;
         new app.pdyrp05(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_decimal10) ;
         pdyrp02.this.A396EmprCod = GXv_char8[0] ;
         pdyrp02.this.AV153PrdNumPaso = GXv_char7[0] ;
         pdyrp02.this.AV81CanTeo = GXv_decimal10[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV86FlagExis2 == 1 )
      {
         AV164RecAnyTie = (short)(0) ;
         /* Using cursor P098U3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV153PrdNumPaso});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P098U3_A719PrdNum[0] ;
            n719PrdNum = P098U3_n719PrdNum[0] ;
            A680PrdAltNum = P098U3_A680PrdAltNum[0] ;
            A678PrdAltFac = P098U3_A678PrdAltFac[0] ;
            A679PrdAltNom = P098U3_A679PrdAltNom[0] ;
            n679PrdAltNom = P098U3_n679PrdAltNom[0] ;
            A679PrdAltNom = P098U3_A679PrdAltNom[0] ;
            n679PrdAltNom = P098U3_n679PrdAltNom[0] ;
            AV150PrdNum = A680PrdAltNum ;
            GXv_char8[0] = A396EmprCod ;
            GXv_char7[0] = AV150PrdNum ;
            GXv_decimal10[0] = AV81CanTeo ;
            GXv_int4[0] = AV120FlagExis3 ;
            new app.pdyrp06(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_decimal10, GXv_int4) ;
            pdyrp02.this.A396EmprCod = GXv_char8[0] ;
            pdyrp02.this.AV150PrdNum = GXv_char7[0] ;
            pdyrp02.this.AV81CanTeo = GXv_decimal10[0] ;
            pdyrp02.this.AV120FlagExis3 = GXv_int4[0] ;
            if ( AV120FlagExis3 == 1 )
            {
               AV81CanTeo = AV81CanTeo.multiply(A678PrdAltFac) ;
               AV82Cantidad = AV82Cantidad.multiply(A678PrdAltFac) ;
               AV97CanRec = AV81CanTeo ;
               AV150PrdNum = A680PrdAltNum ;
               AV146PrdNom = A679PrdAltNom ;
               GXv_char8[0] = A396EmprCod ;
               GXv_char7[0] = A680PrdAltNum ;
               GXv_decimal10[0] = AV81CanTeo ;
               new app.pdyrp05(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_decimal10) ;
               pdyrp02.this.A396EmprCod = GXv_char8[0] ;
               pdyrp02.this.A680PrdAltNum = GXv_char7[0] ;
               pdyrp02.this.AV81CanTeo = GXv_decimal10[0] ;
               /* Execute user subroutine: 'LRECET' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LRECET' Routine */
      returnInSub = false ;
      AV130LinRec = (short)(AV130LinRec+10) ;
      AV145Prdlote = "" ;
      AV180RecLoteFch = GXutil.nullDate() ;
      GXv_char8[0] = AV145Prdlote ;
      GXv_int11[0] = AV162PrvNum ;
      GXv_char7[0] = AV147Prdnom2 ;
      GXv_date12[0] = AV180RecLoteFch ;
      GXv_int13[0] = AV181almprdid ;
      GXv_char6[0] = AV155Prdtip ;
      GXv_int14[0] = AV182PrdCantAtM ;
      new app.pdyrp035(remoteHandle, context).execute( A396EmprCod, AV150PrdNum, GXv_char8, GXv_int11, GXv_char7, GXv_date12, GXv_int13, GXv_char6, GXv_int14) ;
      pdyrp02.this.AV145Prdlote = GXv_char8[0] ;
      pdyrp02.this.AV162PrvNum = GXv_int11[0] ;
      pdyrp02.this.AV147Prdnom2 = GXv_char7[0] ;
      pdyrp02.this.AV180RecLoteFch = GXv_date12[0] ;
      pdyrp02.this.AV181almprdid = GXv_int13[0] ;
      pdyrp02.this.AV155Prdtip = GXv_char6[0] ;
      pdyrp02.this.AV182PrdCantAtM = GXv_int14[0] ;
      /*
         INSERT RECORD ON TABLE TXPLRECET

      */
      A129BarCod = AV88BarCod ;
      A132BarCodReo = AV90BarCodReo ;
      A130BarCodPar = AV89BarCodPar ;
      A2804RecLinMaq = AV165RecLinMaq ;
      A1273RecLinPro = AV129Linea ;
      A811RecLin = AV130LinRec ;
      A872RecPrdNum = AV150PrdNum ;
      A875RecPrdDsc = AV146PrdNom ;
      A490ForPrdUMe = AV79UniMed ;
      n490ForPrdUMe = false ;
      AV97CanRec = ((AV97CanRec.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV97CanRec) ;
      A686PrdCant = AV97CanRec.multiply(DecimalUtil.doubleToDec(1000)) ;
      A431FacCon = AV82Cantidad ;
      A719PrdNum = AV150PrdNum ;
      n719PrdNum = false ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A2394RecForNro = AV161ProForNro ;
      A3274RecPrdTnq = AV173TanqueN ;
      A4024RecMar = (byte)(((GXutil.strcmp(AV146PrdNom, httpContext.getMessage( "AGUA", ""))==0) ? 0 : AV164RecAnyTie)) ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A5422RecSalMP = AV167RecSalmP ;
      A5467RecSalVol = AV168RecSalVol ;
      A5527RecLinRea = httpContext.getMessage( "N", "") ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A8937RecAcc = AV163Recacc ;
      A5725RecLote = ((AV183moda21==1) ? " " : AV145Prdlote) ;
      A11708RecProv = AV162PrvNum ;
      A12641RecPrdDc2 = AV147Prdnom2 ;
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      A12717RecFabId = AV162PrvNum ;
      A13938RecLoteFch = AV180RecLoteFch ;
      A13937RecLotAlm = AV181almprdid ;
      AV155Prdtip = ((GXutil.strcmp(AV155Prdtip, httpContext.getMessage( "M", ""))==0) ? AV155Prdtip : (((AV97CanRec.multiply(DecimalUtil.doubleToDec(1000))).doubleValue()<AV182PrdCantAtM)&&(AV182PrdCantAtM>0) ? httpContext.getMessage( "M", "") : AV155Prdtip)) ;
      A14055RecManAut = AV155Prdtip ;
      /* Using cursor P098U4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin), Boolean.valueOf(n719PrdNum), A719PrdNum, A872RecPrdNum, A875RecPrdDsc, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A431FacCon, A686PrdCant, A683PrdCanFin, A1797PrdCanAny, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), Byte.valueOf(A4024RecMar), A4576RecLinUsr, A4577RecPesFec, Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, A5725RecLote, A8937RecAcc, A4900PrdCanMac, Integer.valueOf(A11708RecProv), A12641RecPrdDc2, A12710PrdCantOrg, Integer.valueOf(A12717RecFabId), Short.valueOf(A13937RecLotAlm), A13938RecLoteFch, A14055RecManAut});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public void S121( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P098U5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV88BarCod), Byte.valueOf(AV90BarCodReo), AV89BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp02.this.A396EmprCod;
      this.aP1[0] = pdyrp02.this.AV153PrdNumPaso;
      this.aP2[0] = pdyrp02.this.AV82Cantidad;
      this.aP3[0] = pdyrp02.this.AV79UniMed;
      this.aP4[0] = pdyrp02.this.AV83TotKil;
      this.aP5[0] = pdyrp02.this.AV80BarVol;
      this.aP6[0] = pdyrp02.this.AV84ValCos;
      this.aP7[0] = pdyrp02.this.AV130LinRec;
      this.aP8[0] = pdyrp02.this.AV88BarCod;
      this.aP9[0] = pdyrp02.this.AV90BarCodReo;
      this.aP10[0] = pdyrp02.this.AV89BarCodPar;
      this.aP11[0] = pdyrp02.this.AV114Flag1;
      this.aP12[0] = pdyrp02.this.AV115Flag2;
      this.aP13[0] = pdyrp02.this.AV78UltRecLin;
      this.aP14[0] = pdyrp02.this.AV129Linea;
      this.aP15[0] = pdyrp02.this.AV109ExiCon;
      this.aP16[0] = pdyrp02.this.AV77FlagComp;
      this.aP17[0] = pdyrp02.this.AV161ProForNro;
      this.aP18[0] = pdyrp02.this.AV165RecLinMaq;
      this.aP19[0] = pdyrp02.this.AV173TanqueN;
      this.aP20[0] = pdyrp02.this.AV160ProForDes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdyrp02");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV172Station = "" ;
      GXt_char5 = "" ;
      AV106Emprnom = "" ;
      AV176Usurcod = "" ;
      AV81CanTeo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P098U2_A396EmprCod = new String[] {""} ;
      P098U2_A719PrdNum = new String[] {""} ;
      P098U2_n719PrdNum = new boolean[] {false} ;
      P098U2_A718PrdNom = new String[] {""} ;
      P098U2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098U2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098U2_A856ValCod = new byte[1] ;
      P098U2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV149PrdNomPaso = "" ;
      AV113Existencia = DecimalUtil.ZERO ;
      AV152PrdNum2 = "" ;
      AV150PrdNum = "" ;
      AV146PrdNom = "" ;
      AV97CanRec = DecimalUtil.ZERO ;
      AV102Comp = "" ;
      AV110ExiRes = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int2 = new int[1] ;
      P098U3_A396EmprCod = new String[] {""} ;
      P098U3_A719PrdNum = new String[] {""} ;
      P098U3_n719PrdNum = new boolean[] {false} ;
      P098U3_A680PrdAltNum = new String[] {""} ;
      P098U3_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098U3_A679PrdAltNom = new String[] {""} ;
      P098U3_n679PrdAltNom = new boolean[] {false} ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A679PrdAltNom = "" ;
      GXv_int4 = new byte[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      AV145Prdlote = "" ;
      AV180RecLoteFch = GXutil.nullDate() ;
      GXv_char8 = new String[1] ;
      GXv_int11 = new int[1] ;
      AV147Prdnom2 = "" ;
      GXv_char7 = new String[1] ;
      GXv_date12 = new java.util.Date[1] ;
      GXv_int13 = new short[1] ;
      AV155Prdtip = "" ;
      GXv_char6 = new String[1] ;
      GXv_int14 = new short[1] ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A431FacCon = DecimalUtil.ZERO ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A5527RecLinRea = "" ;
      A8937RecAcc = "" ;
      AV163Recacc = "" ;
      A5725RecLote = "" ;
      A12641RecPrdDc2 = "" ;
      A13938RecLoteFch = GXutil.nullDate() ;
      A14055RecManAut = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp02__default(),
         new Object[] {
             new Object[] {
            P098U2_A396EmprCod, P098U2_A719PrdNum, P098U2_A718PrdNom, P098U2_A704PrdExiAlm, P098U2_A705PrdExiCC, P098U2_A856ValCod, P098U2_A685PrdCanRes
            }
            , new Object[] {
            P098U3_A396EmprCod, P098U3_A719PrdNum, P098U3_A680PrdAltNum, P098U3_A678PrdAltFac, P098U3_A679PrdAltNom, P098U3_n679PrdAltNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV79UniMed ;
   private byte AV90BarCodReo ;
   private byte AV114Flag1 ;
   private byte AV115Flag2 ;
   private byte AV129Linea ;
   private byte AV109ExiCon ;
   private byte AV77FlagComp ;
   private byte AV161ProForNro ;
   private byte AV173TanqueN ;
   private byte AV103Consumos ;
   private byte AV178Validez12 ;
   private byte GXt_int3 ;
   private byte AV85FlagValCod ;
   private byte A856ValCod ;
   private byte AV140PrdAlS ;
   private byte AV177Valcod ;
   private byte AV86FlagExis2 ;
   private byte AV119FlagExis1 ;
   private byte AV120FlagExis3 ;
   private byte GXv_int4[] ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private short AV130LinRec ;
   private short AV78UltRecLin ;
   private short AV165RecLinMaq ;
   private short AV183moda21 ;
   private short AV164RecAnyTie ;
   private short AV181almprdid ;
   private short GXv_int13[] ;
   private short AV182PrdCantAtM ;
   private short GXv_int14[] ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A5422RecSalMP ;
   private short AV167RecSalmP ;
   private short A13937RecLotAlm ;
   private short Gx_err ;
   private int AV80BarVol ;
   private int AV84ValCos ;
   private int AV88BarCod ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int AV162PrvNum ;
   private int GXv_int11[] ;
   private int GX_INS410 ;
   private int A129BarCod ;
   private int A5467RecSalVol ;
   private int AV168RecSalVol ;
   private int A11708RecProv ;
   private int A12717RecFabId ;
   private java.math.BigDecimal AV82Cantidad ;
   private java.math.BigDecimal AV83TotKil ;
   private java.math.BigDecimal AV81CanTeo ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV113Existencia ;
   private java.math.BigDecimal AV97CanRec ;
   private java.math.BigDecimal AV110ExiRes ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A4900PrdCanMac ;
   private java.math.BigDecimal A12710PrdCantOrg ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A431FacCon ;
   private String A396EmprCod ;
   private String AV153PrdNumPaso ;
   private String AV89BarCodPar ;
   private String AV160ProForDes ;
   private String AV172Station ;
   private String GXt_char5 ;
   private String AV106Emprnom ;
   private String AV176Usurcod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV149PrdNomPaso ;
   private String AV152PrdNum2 ;
   private String AV150PrdNum ;
   private String AV146PrdNom ;
   private String AV102Comp ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String A4576RecLinUsr ;
   private String AV145Prdlote ;
   private String GXv_char8[] ;
   private String AV147Prdnom2 ;
   private String GXv_char7[] ;
   private String AV155Prdtip ;
   private String GXv_char6[] ;
   private String A130BarCodPar ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A5527RecLinRea ;
   private String A8937RecAcc ;
   private String AV163Recacc ;
   private String A5725RecLote ;
   private String A12641RecPrdDc2 ;
   private String A14055RecManAut ;
   private String Gx_emsg ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date AV180RecLoteFch ;
   private java.util.Date GXv_date12[] ;
   private java.util.Date A13938RecLoteFch ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n679PrdAltNom ;
   private boolean n490ForPrdUMe ;
   private String[] aP20 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private int[] aP8 ;
   private byte[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private byte[] aP12 ;
   private short[] aP13 ;
   private byte[] aP14 ;
   private byte[] aP15 ;
   private byte[] aP16 ;
   private byte[] aP17 ;
   private short[] aP18 ;
   private byte[] aP19 ;
   private IDataStoreProvider pr_default ;
   private String[] P098U2_A396EmprCod ;
   private String[] P098U2_A719PrdNum ;
   private boolean[] P098U2_n719PrdNum ;
   private String[] P098U2_A718PrdNom ;
   private java.math.BigDecimal[] P098U2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P098U2_A705PrdExiCC ;
   private byte[] P098U2_A856ValCod ;
   private java.math.BigDecimal[] P098U2_A685PrdCanRes ;
   private String[] P098U3_A396EmprCod ;
   private String[] P098U3_A719PrdNum ;
   private boolean[] P098U3_n719PrdNum ;
   private String[] P098U3_A680PrdAltNum ;
   private java.math.BigDecimal[] P098U3_A678PrdAltFac ;
   private String[] P098U3_A679PrdAltNom ;
   private boolean[] P098U3_n679PrdAltNom ;
}

final  class pdyrp02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P098U2", "SELECT EmprCod, PrdNum, PrdNom, PrdExiAlm, PrdExiCC, ValCod, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098U3", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdAltNum, T1.PrdAltFac, COALESCE( T2.PrdNom, ' ') AS PrdAltNom FROM (TXPPRDALT T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P098U4", "INSERT INTO TXPLRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, PrdNum, RecPrdNum, RecPrdDsc, ForPrdUMe, FacCon, PrdCant, PrdCanFin, PrdCanAny, RecForNro, RecPrdTnq, RecMar, RecLinUsr, RecPesFec, RecSalMP, RecSalVol, RecLinRea, RecLote, RecAcc, PrdCanMac, RecProv, RecPrdDc2, PrdCantOrg, RecFabId, RecLotAlm, RecLoteFch, RecManAut, RecCanEns, RecPes, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P098U5", "UPDATE TXPBARCAD SET BarInci=9  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               stmt.setString(9, (String)parms[9], 6);
               stmt.setString(10, (String)parms[10], 26);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[12]).byteValue());
               }
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 5);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[14], 3);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[15], 3);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[16], 3);
               stmt.setByte(16, ((Number) parms[17]).byteValue());
               stmt.setByte(17, ((Number) parms[18]).byteValue());
               stmt.setByte(18, ((Number) parms[19]).byteValue());
               stmt.setString(19, (String)parms[20], 8);
               stmt.setDateTime(20, (java.util.Date)parms[21], false);
               stmt.setShort(21, ((Number) parms[22]).shortValue());
               stmt.setInt(22, ((Number) parms[23]).intValue());
               stmt.setString(23, (String)parms[24], 1);
               stmt.setString(24, (String)parms[25], 26);
               stmt.setString(25, (String)parms[26], 40);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[27], 3);
               stmt.setInt(27, ((Number) parms[28]).intValue());
               stmt.setString(28, (String)parms[29], 40);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[30], 3);
               stmt.setInt(30, ((Number) parms[31]).intValue());
               stmt.setShort(31, ((Number) parms[32]).shortValue());
               stmt.setDate(32, (java.util.Date)parms[33]);
               stmt.setString(33, (String)parms[34], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

