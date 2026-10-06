package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexipro3 extends GXProcedure
{
   public pexipro3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexipro3.class ), "" );
   }

   public pexipro3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
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
      pexipro3.this.aP21 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
      return aP21[0];
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
                        String[] aP20 ,
                        java.math.BigDecimal[] aP21 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
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
                             String[] aP20 ,
                             java.math.BigDecimal[] aP21 )
   {
      pexipro3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexipro3.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pexipro3.this.AV15Cantidad = aP2[0];
      this.aP2 = aP2;
      pexipro3.this.AV16UniMed = aP3[0];
      this.aP3 = aP3;
      pexipro3.this.AV17TotKil = aP4[0];
      this.aP4 = aP4;
      pexipro3.this.AV18BarVol = aP5[0];
      this.aP5 = aP5;
      pexipro3.this.AV19ValCos = aP6[0];
      this.aP6 = aP6;
      pexipro3.this.AV20LinRec = aP7[0];
      this.aP7 = aP7;
      pexipro3.this.AV21BarCod = aP8[0];
      this.aP8 = aP8;
      pexipro3.this.AV22BarCodReo = aP9[0];
      this.aP9 = aP9;
      pexipro3.this.AV23BarCodPar = aP10[0];
      this.aP10 = aP10;
      pexipro3.this.AV25Flag1 = aP11[0];
      this.aP11 = aP11;
      pexipro3.this.AV26Flag2 = aP12[0];
      this.aP12 = aP12;
      pexipro3.this.AV27UltRecLin = aP13[0];
      this.aP13 = aP13;
      pexipro3.this.AV28Linea = aP14[0];
      this.aP14 = aP14;
      pexipro3.this.AV29ExiCon = aP15[0];
      this.aP15 = aP15;
      pexipro3.this.AV30FlagComp = aP16[0];
      this.aP16 = aP16;
      pexipro3.this.AV51ProForNro = aP17[0];
      this.aP17 = aP17;
      pexipro3.this.AV52RecLinMaq = aP18[0];
      this.aP18 = aP18;
      pexipro3.this.AV54TanqueN = aP19[0];
      this.aP19 = aP19;
      pexipro3.this.AV56ProForDes = aP20[0];
      this.aP20 = aP20;
      pexipro3.this.AV74ForCan = aP21[0];
      this.aP21 = aP21;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV66FlagTintto = (byte)(0) ;
      GXv_int1[0] = AV72ExiSup ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXISUP", ""), GXv_int1) ;
      pexipro3.this.AV72ExiSup = GXv_int1[0] ;
      AV67Consumos = (byte)(0) ;
      GXv_int2[0] = AV67Consumos ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int2) ;
      pexipro3.this.AV67Consumos = (byte)((byte)(GXv_int2[0])) ;
      if ( (0==AV30FlagComp) )
      {
         AV27UltRecLin = (short)(AV20LinRec+10) ;
      }
      if ( AV16UniMed == 3 )
      {
         AV31CanTeo = AV15Cantidad.multiply(AV17TotKil).multiply(DecimalUtil.doubleToDec(AV19ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else
      {
         AV31CanTeo = AV15Cantidad.multiply(DecimalUtil.doubleToDec(AV18BarVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      AV47PrdCanFin = DecimalUtil.doubleToDec(0) ;
      AV48PrdCanAny = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01M02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A705PrdExiCC = P01M02_A705PrdExiCC[0] ;
         A704PrdExiAlm = P01M02_A704PrdExiAlm[0] ;
         A856ValCod = P01M02_A856ValCod[0] ;
         A685PrdCanRes = P01M02_A685PrdCanRes[0] ;
         A718PrdNom = P01M02_A718PrdNom[0] ;
         if ( AV67Consumos == 0 )
         {
            AV68Existencia = A705PrdExiCC ;
         }
         else
         {
            AV68Existencia = A704PrdExiAlm ;
         }
         AV71Parcial = (byte)(0) ;
         AV45Comp = GXutil.substring( A719PrdNum, 1, 1) ;
         if ( GXutil.strcmp(AV45Comp, "0") != 0 )
         {
            AV36Exist = (byte)(0) ;
            AV40Flag3 = (byte)(0) ;
            if ( A856ValCod != 3 )
            {
               AV32ExiRes = AV68Existencia.subtract(A685PrdCanRes) ;
               AV33CanRec = AV31CanTeo ;
               AV37PrdNum = A719PrdNum ;
               AV38PrdNom = A718PrdNom ;
               if ( DecimalUtil.compareTo(AV32ExiRes, AV31CanTeo) >= 0 )
               {
                  if ( AV26Flag2 == 1 )
                  {
                     GXv_char3[0] = A396EmprCod ;
                     GXv_char4[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV31CanTeo ;
                     new app.pactres(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5) ;
                     pexipro3.this.A396EmprCod = GXv_char3[0] ;
                     pexipro3.this.A719PrdNum = GXv_char4[0] ;
                     pexipro3.this.AV31CanTeo = GXv_decimal5[0] ;
                  }
                  /* Execute user subroutine: 'NEWRECETA' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               else
               {
                  if ( AV25Flag1 == 1 )
                  {
                     /* Execute user subroutine: 'ACTHDR' */
                     S121 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     AV34CanIns = AV31CanTeo ;
                     if ( AV32ExiRes.doubleValue() > 0 )
                     {
                        AV34CanIns = AV31CanTeo.subtract(AV32ExiRes) ;
                     }
                     AV35CanIns2 = AV34CanIns.multiply(DecimalUtil.doubleToDec(1000)) ;
                     AV31CanTeo = AV34CanIns ;
                     GXv_char4[0] = A396EmprCod ;
                     GXv_char3[0] = A719PrdNum ;
                     GXv_decimal5[0] = AV31CanTeo ;
                     GXv_int1[0] = AV73FaltaStk ;
                     new app.palttto(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5, GXv_int1) ;
                     pexipro3.this.A396EmprCod = GXv_char4[0] ;
                     pexipro3.this.A719PrdNum = GXv_char3[0] ;
                     pexipro3.this.AV31CanTeo = GXv_decimal5[0] ;
                     pexipro3.this.AV73FaltaStk = GXv_int1[0] ;
                     if ( AV73FaltaStk == 1 )
                     {
                        if ( AV26Flag2 == 1 )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_char3[0] = A719PrdNum ;
                           GXv_decimal5[0] = AV31CanTeo ;
                           new app.pactres(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                           pexipro3.this.A396EmprCod = GXv_char4[0] ;
                           pexipro3.this.A719PrdNum = GXv_char3[0] ;
                           pexipro3.this.AV31CanTeo = GXv_decimal5[0] ;
                        }
                        AV71Parcial = (byte)(1) ;
                        /* Execute user subroutine: 'NEWRECETA' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                     else
                     {
                        if ( AV32ExiRes.doubleValue() > 0 )
                        {
                           if ( AV26Flag2 == 1 )
                           {
                              GXv_char4[0] = A396EmprCod ;
                              GXv_char3[0] = A719PrdNum ;
                              GXv_decimal5[0] = AV32ExiRes ;
                              new app.pactres(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
                              pexipro3.this.A396EmprCod = GXv_char4[0] ;
                              pexipro3.this.A719PrdNum = GXv_char3[0] ;
                              pexipro3.this.AV32ExiRes = GXv_decimal5[0] ;
                           }
                           AV71Parcial = (byte)(1) ;
                           AV33CanRec = AV32ExiRes ;
                           /* Execute user subroutine: 'NEWRECETA' */
                           S111 ();
                           if ( returnInSub )
                           {
                              pr_default.close(0);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                        }
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_decimal5[0] = AV31CanTeo ;
                        GXv_int2[0] = AV21BarCod ;
                        GXv_int1[0] = AV22BarCodReo ;
                        GXv_char6[0] = AV23BarCodPar ;
                        GXv_int7[0] = AV20LinRec ;
                        GXv_int8[0] = AV16UniMed ;
                        GXv_int9[0] = AV36Exist ;
                        GXv_decimal10[0] = AV15Cantidad ;
                        GXv_int11[0] = AV26Flag2 ;
                        GXv_int12[0] = AV25Flag1 ;
                        GXv_int13[0] = AV28Linea ;
                        GXv_int14[0] = AV29ExiCon ;
                        GXv_int15[0] = AV51ProForNro ;
                        GXv_int16[0] = AV52RecLinMaq ;
                        GXv_int17[0] = AV54TanqueN ;
                        GXv_int18[0] = AV71Parcial ;
                        GXv_char19[0] = A718PrdNom ;
                        new app.pexialtt(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5, GXv_int2, GXv_int1, GXv_char6, GXv_int7, GXv_int8, GXv_int9, GXv_decimal10, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_int18, GXv_char19) ;
                        pexipro3.this.A396EmprCod = GXv_char4[0] ;
                        pexipro3.this.A719PrdNum = GXv_char3[0] ;
                        pexipro3.this.AV31CanTeo = GXv_decimal5[0] ;
                        pexipro3.this.AV21BarCod = GXv_int2[0] ;
                        pexipro3.this.AV22BarCodReo = GXv_int1[0] ;
                        pexipro3.this.AV23BarCodPar = GXv_char6[0] ;
                        pexipro3.this.AV20LinRec = GXv_int7[0] ;
                        pexipro3.this.AV16UniMed = GXv_int8[0] ;
                        pexipro3.this.AV36Exist = GXv_int9[0] ;
                        pexipro3.this.AV15Cantidad = GXv_decimal10[0] ;
                        pexipro3.this.AV26Flag2 = GXv_int11[0] ;
                        pexipro3.this.AV25Flag1 = GXv_int12[0] ;
                        pexipro3.this.AV28Linea = GXv_int13[0] ;
                        pexipro3.this.AV29ExiCon = GXv_int14[0] ;
                        pexipro3.this.AV51ProForNro = GXv_int15[0] ;
                        pexipro3.this.AV52RecLinMaq = GXv_int16[0] ;
                        pexipro3.this.AV54TanqueN = GXv_int17[0] ;
                        pexipro3.this.AV71Parcial = GXv_int18[0] ;
                        pexipro3.this.A718PrdNom = GXv_char19[0] ;
                     }
                  }
                  else
                  {
                     if ( AV26Flag2 == 1 )
                     {
                        GXv_char19[0] = A396EmprCod ;
                        GXv_char6[0] = A719PrdNum ;
                        GXv_decimal10[0] = AV31CanTeo ;
                        new app.pactres(remoteHandle, context).execute( GXv_char19, GXv_char6, GXv_decimal10) ;
                        pexipro3.this.A396EmprCod = GXv_char19[0] ;
                        pexipro3.this.A719PrdNum = GXv_char6[0] ;
                        pexipro3.this.AV31CanTeo = GXv_decimal10[0] ;
                     }
                     /* Execute user subroutine: 'NEWRECETA' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
               }
            }
            else
            {
               GXv_char19[0] = A396EmprCod ;
               GXv_char6[0] = A719PrdNum ;
               GXv_decimal10[0] = AV31CanTeo ;
               GXv_int2[0] = AV21BarCod ;
               GXv_int18[0] = AV22BarCodReo ;
               GXv_char4[0] = AV23BarCodPar ;
               GXv_int16[0] = AV20LinRec ;
               GXv_int17[0] = AV16UniMed ;
               GXv_int15[0] = AV36Exist ;
               GXv_decimal5[0] = AV15Cantidad ;
               GXv_int14[0] = AV26Flag2 ;
               GXv_int13[0] = AV25Flag1 ;
               GXv_int12[0] = AV28Linea ;
               GXv_int11[0] = AV29ExiCon ;
               GXv_int9[0] = AV51ProForNro ;
               GXv_int7[0] = AV52RecLinMaq ;
               GXv_int8[0] = AV54TanqueN ;
               GXv_int1[0] = AV71Parcial ;
               GXv_char3[0] = A718PrdNom ;
               new app.pexialtt(remoteHandle, context).execute( GXv_char19, GXv_char6, GXv_decimal10, GXv_int2, GXv_int18, GXv_char4, GXv_int16, GXv_int17, GXv_int15, GXv_decimal5, GXv_int14, GXv_int13, GXv_int12, GXv_int11, GXv_int9, GXv_int7, GXv_int8, GXv_int1, GXv_char3) ;
               pexipro3.this.A396EmprCod = GXv_char19[0] ;
               pexipro3.this.A719PrdNum = GXv_char6[0] ;
               pexipro3.this.AV31CanTeo = GXv_decimal10[0] ;
               pexipro3.this.AV21BarCod = GXv_int2[0] ;
               pexipro3.this.AV22BarCodReo = GXv_int18[0] ;
               pexipro3.this.AV23BarCodPar = GXv_char4[0] ;
               pexipro3.this.AV20LinRec = GXv_int16[0] ;
               pexipro3.this.AV16UniMed = GXv_int17[0] ;
               pexipro3.this.AV36Exist = GXv_int15[0] ;
               pexipro3.this.AV15Cantidad = GXv_decimal5[0] ;
               pexipro3.this.AV26Flag2 = GXv_int14[0] ;
               pexipro3.this.AV25Flag1 = GXv_int13[0] ;
               pexipro3.this.AV28Linea = GXv_int12[0] ;
               pexipro3.this.AV29ExiCon = GXv_int11[0] ;
               pexipro3.this.AV51ProForNro = GXv_int9[0] ;
               pexipro3.this.AV52RecLinMaq = GXv_int7[0] ;
               pexipro3.this.AV54TanqueN = GXv_int8[0] ;
               pexipro3.this.AV71Parcial = GXv_int1[0] ;
               pexipro3.this.A718PrdNom = GXv_char3[0] ;
            }
         }
         else
         {
            AV37PrdNum = A719PrdNum ;
            AV38PrdNom = A718PrdNom ;
            AV33CanRec = AV31CanTeo ;
            /* Execute user subroutine: 'NEWRECETA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'NEWRECETA' Routine */
      returnInSub = false ;
      AV20LinRec = (short)(AV20LinRec+10) ;
      /*
         INSERT RECORD ON TABLE TXPLRECET

      */
      A129BarCod = AV21BarCod ;
      A132BarCodReo = AV22BarCodReo ;
      A130BarCodPar = AV23BarCodPar ;
      A2804RecLinMaq = AV52RecLinMaq ;
      A1273RecLinPro = AV28Linea ;
      A811RecLin = AV20LinRec ;
      A872RecPrdNum = AV37PrdNum ;
      A875RecPrdDsc = AV38PrdNom ;
      A490ForPrdUMe = AV16UniMed ;
      n490ForPrdUMe = false ;
      A686PrdCant = AV33CanRec.multiply(DecimalUtil.doubleToDec(1000)) ;
      if ( DecimalUtil.compareTo(AV15Cantidad, AV74ForCan) == 0 )
      {
         A431FacCon = AV15Cantidad ;
      }
      else
      {
         A431FacCon = AV74ForCan ;
      }
      A719PrdNum = AV37PrdNum ;
      n719PrdNum = false ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A2394RecForNro = AV51ProForNro ;
      A3274RecPrdTnq = AV54TanqueN ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A4024RecMar = (byte)(0) ;
      if ( AV71Parcial == 1 )
      {
         A4024RecMar = (byte)(1) ;
      }
      A5527RecLinRea = httpContext.getMessage( "N", "") ;
      /* Using cursor P01M03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin), Boolean.valueOf(n719PrdNum), A719PrdNum, A872RecPrdNum, A875RecPrdDsc, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A431FacCon, A686PrdCant, A683PrdCanFin, A1797PrdCanAny, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), Byte.valueOf(A4024RecMar), A4576RecLinUsr, A4577RecPesFec, A5527RecLinRea});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
      if ( (pr_default.getStatus(1) == 1) )
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
      /* 'ACTHDR' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01M04 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV22BarCodReo), AV23BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexipro3.this.A396EmprCod;
      this.aP1[0] = pexipro3.this.A719PrdNum;
      this.aP2[0] = pexipro3.this.AV15Cantidad;
      this.aP3[0] = pexipro3.this.AV16UniMed;
      this.aP4[0] = pexipro3.this.AV17TotKil;
      this.aP5[0] = pexipro3.this.AV18BarVol;
      this.aP6[0] = pexipro3.this.AV19ValCos;
      this.aP7[0] = pexipro3.this.AV20LinRec;
      this.aP8[0] = pexipro3.this.AV21BarCod;
      this.aP9[0] = pexipro3.this.AV22BarCodReo;
      this.aP10[0] = pexipro3.this.AV23BarCodPar;
      this.aP11[0] = pexipro3.this.AV25Flag1;
      this.aP12[0] = pexipro3.this.AV26Flag2;
      this.aP13[0] = pexipro3.this.AV27UltRecLin;
      this.aP14[0] = pexipro3.this.AV28Linea;
      this.aP15[0] = pexipro3.this.AV29ExiCon;
      this.aP16[0] = pexipro3.this.AV30FlagComp;
      this.aP17[0] = pexipro3.this.AV51ProForNro;
      this.aP18[0] = pexipro3.this.AV52RecLinMaq;
      this.aP19[0] = pexipro3.this.AV54TanqueN;
      this.aP20[0] = pexipro3.this.AV56ProForDes;
      this.aP21[0] = pexipro3.this.AV74ForCan;
      Application.commitDataStores(context, remoteHandle, pr_default, "pexipro3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31CanTeo = DecimalUtil.ZERO ;
      AV47PrdCanFin = DecimalUtil.ZERO ;
      AV48PrdCanAny = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01M02_A396EmprCod = new String[] {""} ;
      P01M02_A719PrdNum = new String[] {""} ;
      P01M02_n719PrdNum = new boolean[] {false} ;
      P01M02_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01M02_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01M02_A856ValCod = new byte[1] ;
      P01M02_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01M02_A718PrdNom = new String[] {""} ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV68Existencia = DecimalUtil.ZERO ;
      AV45Comp = "" ;
      AV32ExiRes = DecimalUtil.ZERO ;
      AV33CanRec = DecimalUtil.ZERO ;
      AV37PrdNum = "" ;
      AV38PrdNom = "" ;
      AV34CanIns = DecimalUtil.ZERO ;
      AV35CanIns2 = DecimalUtil.ZERO ;
      GXv_char19 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int2 = new int[1] ;
      GXv_int18 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int16 = new short[1] ;
      GXv_int17 = new byte[1] ;
      GXv_int15 = new byte[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int7 = new short[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char3 = new String[1] ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A431FacCon = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A5527RecLinRea = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexipro3__default(),
         new Object[] {
             new Object[] {
            P01M02_A396EmprCod, P01M02_A719PrdNum, P01M02_A705PrdExiCC, P01M02_A704PrdExiAlm, P01M02_A856ValCod, P01M02_A685PrdCanRes, P01M02_A718PrdNom
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

   private byte AV16UniMed ;
   private byte AV22BarCodReo ;
   private byte AV25Flag1 ;
   private byte AV26Flag2 ;
   private byte AV28Linea ;
   private byte AV29ExiCon ;
   private byte AV30FlagComp ;
   private byte AV51ProForNro ;
   private byte AV54TanqueN ;
   private byte AV66FlagTintto ;
   private byte AV72ExiSup ;
   private byte AV67Consumos ;
   private byte A856ValCod ;
   private byte AV71Parcial ;
   private byte AV36Exist ;
   private byte AV40Flag3 ;
   private byte AV73FaltaStk ;
   private byte GXv_int18[] ;
   private byte GXv_int17[] ;
   private byte GXv_int15[] ;
   private byte GXv_int14[] ;
   private byte GXv_int13[] ;
   private byte GXv_int12[] ;
   private byte GXv_int11[] ;
   private byte GXv_int9[] ;
   private byte GXv_int8[] ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private short AV20LinRec ;
   private short AV27UltRecLin ;
   private short AV52RecLinMaq ;
   private short GXv_int16[] ;
   private short GXv_int7[] ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV18BarVol ;
   private int AV19ValCos ;
   private int AV21BarCod ;
   private int GXv_int2[] ;
   private int GX_INS410 ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15Cantidad ;
   private java.math.BigDecimal AV17TotKil ;
   private java.math.BigDecimal AV74ForCan ;
   private java.math.BigDecimal AV31CanTeo ;
   private java.math.BigDecimal AV47PrdCanFin ;
   private java.math.BigDecimal AV48PrdCanAny ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV68Existencia ;
   private java.math.BigDecimal AV32ExiRes ;
   private java.math.BigDecimal AV33CanRec ;
   private java.math.BigDecimal AV34CanIns ;
   private java.math.BigDecimal AV35CanIns2 ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV23BarCodPar ;
   private String AV56ProForDes ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String AV45Comp ;
   private String AV37PrdNum ;
   private String AV38PrdNom ;
   private String GXv_char19[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String A130BarCodPar ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A4576RecLinUsr ;
   private String A5527RecLinRea ;
   private String Gx_emsg ;
   private java.util.Date A4577RecPesFec ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n490ForPrdUMe ;
   private java.math.BigDecimal[] aP21 ;
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
   private String[] aP20 ;
   private IDataStoreProvider pr_default ;
   private String[] P01M02_A396EmprCod ;
   private String[] P01M02_A719PrdNum ;
   private boolean[] P01M02_n719PrdNum ;
   private java.math.BigDecimal[] P01M02_A705PrdExiCC ;
   private java.math.BigDecimal[] P01M02_A704PrdExiAlm ;
   private byte[] P01M02_A856ValCod ;
   private java.math.BigDecimal[] P01M02_A685PrdCanRes ;
   private String[] P01M02_A718PrdNom ;
}

final  class pexipro3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01M02", "SELECT EmprCod, PrdNum, PrdExiCC, PrdExiAlm, ValCod, PrdCanRes, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01M03", "INSERT INTO TXPLRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, PrdNum, RecPrdNum, RecPrdDsc, ForPrdUMe, FacCon, PrdCant, PrdCanFin, PrdCanAny, RecForNro, RecPrdTnq, RecMar, RecLinUsr, RecPesFec, RecLinRea, RecCanEns, RecSalMP, RecSalVol, RecLote, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecPrdDc2, PrdCantOrg, RecFabId, RecLotAlm, RecLoteFch, RecManAut) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P01M04", "UPDATE TXPBARCAD SET BarInci=9  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
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
               stmt.setString(21, (String)parms[22], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

