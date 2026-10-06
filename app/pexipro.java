package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexipro extends GXProcedure
{
   public pexipro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexipro.class ), "" );
   }

   public pexipro( int remoteHandle ,
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
      pexipro.this.aP20 = new String[] {""};
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
      pexipro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexipro.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pexipro.this.AV15Cantidad = aP2[0];
      this.aP2 = aP2;
      pexipro.this.AV16UniMed = aP3[0];
      this.aP3 = aP3;
      pexipro.this.AV17TotKil = aP4[0];
      this.aP4 = aP4;
      pexipro.this.AV18BarVol = aP5[0];
      this.aP5 = aP5;
      pexipro.this.AV19ValCos = aP6[0];
      this.aP6 = aP6;
      pexipro.this.AV20LinRec = aP7[0];
      this.aP7 = aP7;
      pexipro.this.AV21BarCod = aP8[0];
      this.aP8 = aP8;
      pexipro.this.AV22BarCodReo = aP9[0];
      this.aP9 = aP9;
      pexipro.this.AV23BarCodPar = aP10[0];
      this.aP10 = aP10;
      pexipro.this.AV25Flag1 = aP11[0];
      this.aP11 = aP11;
      pexipro.this.AV26Flag2 = aP12[0];
      this.aP12 = aP12;
      pexipro.this.AV27UltRecLin = aP13[0];
      this.aP13 = aP13;
      pexipro.this.AV28Linea = aP14[0];
      this.aP14 = aP14;
      pexipro.this.AV29ExiCon = aP15[0];
      this.aP15 = aP15;
      pexipro.this.AV30FlagComp = aP16[0];
      this.aP16 = aP16;
      pexipro.this.AV51ProForNro = aP17[0];
      this.aP17 = aP17;
      pexipro.this.AV52RecLinMaq = aP18[0];
      this.aP18 = aP18;
      pexipro.this.AV54TanqueN = aP19[0];
      this.aP19 = aP19;
      pexipro.this.AV56ProForDes = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV66FlagExiSup = (byte)(0) ;
      GXv_int1[0] = AV66FlagExiSup ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXISUP", ""), GXv_int1) ;
      pexipro.this.AV66FlagExiSup = GXv_int1[0] ;
      AV62FlagExiPro = (byte)(0) ;
      GXv_int1[0] = AV62FlagExiPro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXIPRO", ""), GXv_int1) ;
      pexipro.this.AV62FlagExiPro = GXv_int1[0] ;
      AV67Consumos = (byte)(0) ;
      GXv_int2[0] = AV67Consumos ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int2) ;
      pexipro.this.AV67Consumos = (byte)((byte)(GXv_int2[0])) ;
      if ( AV62FlagExiPro == 1 )
      {
         System.out.println( httpContext.getMessage( "Go PEXIPRO2", "") );
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_decimal5[0] = AV15Cantidad ;
         GXv_int1[0] = AV16UniMed ;
         GXv_decimal6[0] = AV17TotKil ;
         GXv_int2[0] = AV18BarVol ;
         GXv_int7[0] = AV19ValCos ;
         GXv_int8[0] = AV20LinRec ;
         GXv_int9[0] = AV21BarCod ;
         GXv_int10[0] = AV22BarCodReo ;
         GXv_char11[0] = AV23BarCodPar ;
         GXv_int12[0] = AV25Flag1 ;
         GXv_int13[0] = AV26Flag2 ;
         GXv_int14[0] = AV27UltRecLin ;
         GXv_int15[0] = AV28Linea ;
         GXv_int16[0] = AV29ExiCon ;
         GXv_int17[0] = AV30FlagComp ;
         GXv_int18[0] = AV51ProForNro ;
         GXv_int19[0] = AV52RecLinMaq ;
         GXv_int20[0] = AV54TanqueN ;
         GXv_char21[0] = AV56ProForDes ;
         new app.pexipro2(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5, GXv_int1, GXv_decimal6, GXv_int2, GXv_int7, GXv_int8, GXv_int9, GXv_int10, GXv_char11, GXv_int12, GXv_int13, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_int18, GXv_int19, GXv_int20, GXv_char21) ;
         pexipro.this.A396EmprCod = GXv_char3[0] ;
         pexipro.this.A719PrdNum = GXv_char4[0] ;
         pexipro.this.AV15Cantidad = GXv_decimal5[0] ;
         pexipro.this.AV16UniMed = GXv_int1[0] ;
         pexipro.this.AV17TotKil = GXv_decimal6[0] ;
         pexipro.this.AV18BarVol = GXv_int2[0] ;
         pexipro.this.AV19ValCos = GXv_int7[0] ;
         pexipro.this.AV20LinRec = GXv_int8[0] ;
         pexipro.this.AV21BarCod = GXv_int9[0] ;
         pexipro.this.AV22BarCodReo = GXv_int10[0] ;
         pexipro.this.AV23BarCodPar = GXv_char11[0] ;
         pexipro.this.AV25Flag1 = GXv_int12[0] ;
         pexipro.this.AV26Flag2 = GXv_int13[0] ;
         pexipro.this.AV27UltRecLin = GXv_int14[0] ;
         pexipro.this.AV28Linea = GXv_int15[0] ;
         pexipro.this.AV29ExiCon = GXv_int16[0] ;
         pexipro.this.AV30FlagComp = GXv_int17[0] ;
         pexipro.this.AV51ProForNro = GXv_int18[0] ;
         pexipro.this.AV52RecLinMaq = GXv_int19[0] ;
         pexipro.this.AV54TanqueN = GXv_int20[0] ;
         pexipro.this.AV56ProForDes = GXv_char21[0] ;
         System.out.println( httpContext.getMessage( "Return PEXIPRO2", "") );
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV66FlagExiSup == 1 )
      {
         AV69ForCan = AV15Cantidad ;
         GXv_char21[0] = A396EmprCod ;
         GXv_char11[0] = A719PrdNum ;
         GXv_decimal6[0] = AV15Cantidad ;
         GXv_int20[0] = AV16UniMed ;
         GXv_decimal5[0] = AV17TotKil ;
         GXv_int9[0] = AV18BarVol ;
         GXv_int7[0] = AV19ValCos ;
         GXv_int19[0] = AV20LinRec ;
         GXv_int2[0] = AV21BarCod ;
         GXv_int18[0] = AV22BarCodReo ;
         GXv_char4[0] = AV23BarCodPar ;
         GXv_int17[0] = AV25Flag1 ;
         GXv_int16[0] = AV26Flag2 ;
         GXv_int14[0] = AV27UltRecLin ;
         GXv_int15[0] = AV28Linea ;
         GXv_int13[0] = AV29ExiCon ;
         GXv_int12[0] = AV30FlagComp ;
         GXv_int10[0] = AV51ProForNro ;
         GXv_int8[0] = AV52RecLinMaq ;
         GXv_int1[0] = AV54TanqueN ;
         GXv_char3[0] = AV56ProForDes ;
         GXv_decimal22[0] = AV69ForCan ;
         new app.pexipro3(remoteHandle, context).execute( GXv_char21, GXv_char11, GXv_decimal6, GXv_int20, GXv_decimal5, GXv_int9, GXv_int7, GXv_int19, GXv_int2, GXv_int18, GXv_char4, GXv_int17, GXv_int16, GXv_int14, GXv_int15, GXv_int13, GXv_int12, GXv_int10, GXv_int8, GXv_int1, GXv_char3, GXv_decimal22) ;
         pexipro.this.A396EmprCod = GXv_char21[0] ;
         pexipro.this.A719PrdNum = GXv_char11[0] ;
         pexipro.this.AV15Cantidad = GXv_decimal6[0] ;
         pexipro.this.AV16UniMed = GXv_int20[0] ;
         pexipro.this.AV17TotKil = GXv_decimal5[0] ;
         pexipro.this.AV18BarVol = GXv_int9[0] ;
         pexipro.this.AV19ValCos = GXv_int7[0] ;
         pexipro.this.AV20LinRec = GXv_int19[0] ;
         pexipro.this.AV21BarCod = GXv_int2[0] ;
         pexipro.this.AV22BarCodReo = GXv_int18[0] ;
         pexipro.this.AV23BarCodPar = GXv_char4[0] ;
         pexipro.this.AV25Flag1 = GXv_int17[0] ;
         pexipro.this.AV26Flag2 = GXv_int16[0] ;
         pexipro.this.AV27UltRecLin = GXv_int14[0] ;
         pexipro.this.AV28Linea = GXv_int15[0] ;
         pexipro.this.AV29ExiCon = GXv_int13[0] ;
         pexipro.this.AV30FlagComp = GXv_int12[0] ;
         pexipro.this.AV51ProForNro = GXv_int10[0] ;
         pexipro.this.AV52RecLinMaq = GXv_int8[0] ;
         pexipro.this.AV54TanqueN = GXv_int1[0] ;
         pexipro.this.AV56ProForDes = GXv_char3[0] ;
         pexipro.this.AV69ForCan = GXv_decimal22[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV55FlagHSS = (byte)(0) ;
      GXv_int20[0] = AV55FlagHSS ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int20) ;
      pexipro.this.AV55FlagHSS = GXv_int20[0] ;
      AV57FlagMab = (byte)(0) ;
      GXv_int20[0] = AV57FlagMab ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int20) ;
      pexipro.this.AV57FlagMab = GXv_int20[0] ;
      AV72Pizarro = (byte)(0) ;
      GXv_int20[0] = AV72Pizarro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int20) ;
      pexipro.this.AV72Pizarro = GXv_int20[0] ;
      if ( AV72Pizarro == 1 )
      {
         /* Execute user subroutine: 'QUALMAQUINA' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV70Hidro = (byte)(0) ;
      GXv_int20[0] = AV70Hidro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int20) ;
      pexipro.this.AV70Hidro = GXv_int20[0] ;
      AV71Fidel = (byte)(0) ;
      GXv_int20[0] = AV71Fidel ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIDEL", ""), GXv_int20) ;
      pexipro.this.AV71Fidel = GXv_int20[0] ;
      if ( (0==AV30FlagComp) )
      {
         AV27UltRecLin = (short)(AV20LinRec+10) ;
      }
      AV79RecMar = (byte)(0) ;
      if ( AV16UniMed == 3 )
      {
         AV31CanTeo = AV15Cantidad.multiply(AV17TotKil).multiply(DecimalUtil.doubleToDec(AV19ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else
      {
         AV31CanTeo = AV15Cantidad.multiply(DecimalUtil.doubleToDec(AV18BarVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         if ( ( AV70Hidro == 1 ) || ( AV71Fidel == 1 ) )
         {
            if ( ( AV16UniMed == 2 ) && ( (AV31CanTeo.multiply(DecimalUtil.doubleToDec(1000))).doubleValue() < 100 ) )
            {
               AV31CanTeo = DecimalUtil.doubleToDec(100/ (double) (1000)) ;
            }
         }
      }
      AV47PrdCanFin = DecimalUtil.doubleToDec(0) ;
      AV48PrdCanAny = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P001Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A705PrdExiCC = P001Y2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P001Y2_A704PrdExiAlm[0] ;
         A856ValCod = P001Y2_A856ValCod[0] ;
         A685PrdCanRes = P001Y2_A685PrdCanRes[0] ;
         A718PrdNom = P001Y2_A718PrdNom[0] ;
         if ( AV67Consumos == 0 )
         {
            AV68Existencia = A705PrdExiCC ;
         }
         else
         {
            AV68Existencia = A704PrdExiAlm ;
         }
         AV45Comp = GXutil.substring( A719PrdNum, 1, 1) ;
         if ( GXutil.strcmp(AV45Comp, "0") != 0 )
         {
            AV36Exist = (byte)(0) ;
            AV40Flag3 = (byte)(0) ;
            if ( A856ValCod != 3 )
            {
               AV32ExiRes = AV68Existencia.subtract(A685PrdCanRes) ;
               if ( DecimalUtil.compareTo(AV32ExiRes, AV31CanTeo) >= 0 )
               {
                  if ( AV26Flag2 == 1 )
                  {
                     GXv_char21[0] = A396EmprCod ;
                     GXv_char11[0] = A719PrdNum ;
                     GXv_decimal22[0] = AV31CanTeo ;
                     new app.pactres(remoteHandle, context).execute( GXv_char21, GXv_char11, GXv_decimal22) ;
                     pexipro.this.A396EmprCod = GXv_char21[0] ;
                     pexipro.this.A719PrdNum = GXv_char11[0] ;
                     pexipro.this.AV31CanTeo = GXv_decimal22[0] ;
                  }
                  AV33CanRec = AV31CanTeo ;
               }
               else
               {
                  if ( AV26Flag2 == 1 )
                  {
                     if ( ( AV25Flag1 == 1 ) && (0==AV57FlagMab) )
                     {
                        GXv_char21[0] = A396EmprCod ;
                        GXv_char11[0] = A719PrdNum ;
                        GXv_decimal22[0] = AV32ExiRes ;
                        new app.pactres(remoteHandle, context).execute( GXv_char21, GXv_char11, GXv_decimal22) ;
                        pexipro.this.A396EmprCod = GXv_char21[0] ;
                        pexipro.this.A719PrdNum = GXv_char11[0] ;
                        pexipro.this.AV32ExiRes = GXv_decimal22[0] ;
                     }
                     else
                     {
                        GXv_char21[0] = A396EmprCod ;
                        GXv_char11[0] = A719PrdNum ;
                        GXv_decimal22[0] = AV31CanTeo ;
                        new app.pactres(remoteHandle, context).execute( GXv_char21, GXv_char11, GXv_decimal22) ;
                        pexipro.this.A396EmprCod = GXv_char21[0] ;
                        pexipro.this.A719PrdNum = GXv_char11[0] ;
                        pexipro.this.AV31CanTeo = GXv_decimal22[0] ;
                     }
                  }
                  if ( AV25Flag1 == 1 )
                  {
                     AV33CanRec = AV32ExiRes ;
                  }
                  else
                  {
                     AV33CanRec = AV31CanTeo ;
                  }
               }
               AV37PrdNum = A719PrdNum ;
               if ( ( ( AV33CanRec.doubleValue() > 0 ) || ( AV31CanTeo.doubleValue() == 0 ) ) && (0==AV30FlagComp) )
               {
                  AV38PrdNom = A718PrdNom ;
                  if ( DecimalUtil.compareTo(AV32ExiRes, AV31CanTeo) < 0 )
                  {
                     AV79RecMar = (byte)(1) ;
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
               if ( ( DecimalUtil.compareTo(AV33CanRec, AV31CanTeo) < 0 ) && ( AV25Flag1 == 1 ) )
               {
                  if ( AV32ExiRes.doubleValue() < 0 )
                  {
                     AV34CanIns = AV31CanTeo ;
                  }
                  else
                  {
                     AV34CanIns = AV31CanTeo.subtract(AV32ExiRes) ;
                  }
                  AV35CanIns2 = AV34CanIns.multiply(DecimalUtil.doubleToDec(1000)) ;
                  AV38PrdNom = GXutil.concat( httpContext.getMessage( "@Cantidad Insuf. ", ""), GXutil.str( AV35CanIns2, 11, 3), "") ;
                  AV33CanRec = DecimalUtil.doubleToDec(0) ;
                  AV79RecMar = (byte)(1) ;
                  /* Execute user subroutine: 'ACTHDR' */
                  S141 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
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
                  AV33CanRec = AV34CanIns ;
                  if ( AV29ExiCon == 1 )
                  {
                     AV44MesOrd = GXutil.concat( AV38PrdNom, httpContext.getMessage( " Producto :", ""), "") ;
                     AV44MesOrd = GXutil.concat( AV44MesOrd, AV37PrdNum, " ") ;
                     httpContext.GX_msglist.addItem(AV44MesOrd);
                  }
               }
               if ( DecimalUtil.compareTo(AV32ExiRes, AV31CanTeo) < 0 )
               {
                  if ( AV32ExiRes.doubleValue() != 0 )
                  {
                     AV31CanTeo = AV33CanRec ;
                  }
                  if ( AV25Flag1 == 1 )
                  {
                     if ( (0==AV57FlagMab) )
                     {
                        GXv_char21[0] = A396EmprCod ;
                        GXv_char11[0] = A719PrdNum ;
                        GXv_decimal22[0] = AV31CanTeo ;
                        GXv_int9[0] = AV21BarCod ;
                        GXv_int20[0] = AV22BarCodReo ;
                        GXv_char4[0] = AV23BarCodPar ;
                        GXv_int19[0] = AV20LinRec ;
                        GXv_int18[0] = AV16UniMed ;
                        GXv_int17[0] = AV36Exist ;
                        GXv_decimal6[0] = AV15Cantidad ;
                        GXv_int16[0] = AV26Flag2 ;
                        GXv_int15[0] = AV25Flag1 ;
                        GXv_int13[0] = AV28Linea ;
                        GXv_int12[0] = AV29ExiCon ;
                        GXv_int10[0] = AV51ProForNro ;
                        GXv_int14[0] = AV52RecLinMaq ;
                        GXv_int1[0] = AV54TanqueN ;
                        new app.pexialt(remoteHandle, context).execute( GXv_char21, GXv_char11, GXv_decimal22, GXv_int9, GXv_int20, GXv_char4, GXv_int19, GXv_int18, GXv_int17, GXv_decimal6, GXv_int16, GXv_int15, GXv_int13, GXv_int12, GXv_int10, GXv_int14, GXv_int1) ;
                        pexipro.this.A396EmprCod = GXv_char21[0] ;
                        pexipro.this.A719PrdNum = GXv_char11[0] ;
                        pexipro.this.AV31CanTeo = GXv_decimal22[0] ;
                        pexipro.this.AV21BarCod = GXv_int9[0] ;
                        pexipro.this.AV22BarCodReo = GXv_int20[0] ;
                        pexipro.this.AV23BarCodPar = GXv_char4[0] ;
                        pexipro.this.AV20LinRec = GXv_int19[0] ;
                        pexipro.this.AV16UniMed = GXv_int18[0] ;
                        pexipro.this.AV36Exist = GXv_int17[0] ;
                        pexipro.this.AV15Cantidad = GXv_decimal6[0] ;
                        pexipro.this.AV26Flag2 = GXv_int16[0] ;
                        pexipro.this.AV25Flag1 = GXv_int15[0] ;
                        pexipro.this.AV28Linea = GXv_int13[0] ;
                        pexipro.this.AV29ExiCon = GXv_int12[0] ;
                        pexipro.this.AV51ProForNro = GXv_int10[0] ;
                        pexipro.this.AV52RecLinMaq = GXv_int14[0] ;
                        pexipro.this.AV54TanqueN = GXv_int1[0] ;
                     }
                     else
                     {
                     }
                  }
               }
               else
               {
                  AV31CanTeo = AV31CanTeo.subtract(AV33CanRec) ;
               }
            }
            else
            {
               if ( AV25Flag1 == 1 )
               {
                  if ( (0==AV57FlagMab) )
                  {
                     GXv_char21[0] = A396EmprCod ;
                     GXv_char11[0] = A719PrdNum ;
                     GXv_decimal22[0] = AV31CanTeo ;
                     GXv_int9[0] = AV21BarCod ;
                     GXv_int20[0] = AV22BarCodReo ;
                     GXv_char4[0] = AV23BarCodPar ;
                     GXv_int19[0] = AV20LinRec ;
                     GXv_int18[0] = AV16UniMed ;
                     GXv_int17[0] = AV36Exist ;
                     GXv_decimal6[0] = AV15Cantidad ;
                     GXv_int16[0] = AV26Flag2 ;
                     GXv_int15[0] = AV25Flag1 ;
                     GXv_int13[0] = AV28Linea ;
                     GXv_int12[0] = AV29ExiCon ;
                     GXv_int10[0] = AV51ProForNro ;
                     GXv_int14[0] = AV52RecLinMaq ;
                     GXv_int1[0] = AV54TanqueN ;
                     new app.pexialt(remoteHandle, context).execute( GXv_char21, GXv_char11, GXv_decimal22, GXv_int9, GXv_int20, GXv_char4, GXv_int19, GXv_int18, GXv_int17, GXv_decimal6, GXv_int16, GXv_int15, GXv_int13, GXv_int12, GXv_int10, GXv_int14, GXv_int1) ;
                     pexipro.this.A396EmprCod = GXv_char21[0] ;
                     pexipro.this.A719PrdNum = GXv_char11[0] ;
                     pexipro.this.AV31CanTeo = GXv_decimal22[0] ;
                     pexipro.this.AV21BarCod = GXv_int9[0] ;
                     pexipro.this.AV22BarCodReo = GXv_int20[0] ;
                     pexipro.this.AV23BarCodPar = GXv_char4[0] ;
                     pexipro.this.AV20LinRec = GXv_int19[0] ;
                     pexipro.this.AV16UniMed = GXv_int18[0] ;
                     pexipro.this.AV36Exist = GXv_int17[0] ;
                     pexipro.this.AV15Cantidad = GXv_decimal6[0] ;
                     pexipro.this.AV26Flag2 = GXv_int16[0] ;
                     pexipro.this.AV25Flag1 = GXv_int15[0] ;
                     pexipro.this.AV28Linea = GXv_int13[0] ;
                     pexipro.this.AV29ExiCon = GXv_int12[0] ;
                     pexipro.this.AV51ProForNro = GXv_int10[0] ;
                     pexipro.this.AV52RecLinMaq = GXv_int14[0] ;
                     pexipro.this.AV54TanqueN = GXv_int1[0] ;
                  }
                  else
                  {
                  }
               }
               else
               {
                  AV37PrdNum = "" ;
                  AV38PrdNom = httpContext.getMessage( "ATENCION: ", "") + A719PrdNum + httpContext.getMessage( " SUPRIMIDO", "") ;
                  AV16UniMed = (byte)(0) ;
                  AV33CanRec = DecimalUtil.ZERO ;
                  AV15Cantidad = DecimalUtil.ZERO ;
                  AV54TanqueN = (byte)(0) ;
                  AV79RecMar = (byte)(1) ;
                  /* Execute user subroutine: 'ACTHDR' */
                  S141 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
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
      AV77ProdRep = (byte)(0) ;
      if ( AV72Pizarro == 1 )
      {
         /* Execute user subroutine: 'TROCAPRODUTOS' */
         S121 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'DETECTAPRODREP' */
         S131 ();
         if (returnInSub) return;
         if ( AV78MaqPrdAum != 0 )
         {
            AV15Cantidad = AV15Cantidad.add((AV15Cantidad.multiply(DecimalUtil.doubleToDec(AV78MaqPrdAum)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
            AV33CanRec = AV33CanRec.add((AV33CanRec.multiply(DecimalUtil.doubleToDec(AV78MaqPrdAum)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         }
      }
      if ( AV79RecMar == 1 )
      {
         /* Execute user subroutine: 'ACTHDR' */
         S141 ();
         if (returnInSub) return;
      }
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
      A431FacCon = AV15Cantidad ;
      A719PrdNum = AV37PrdNum ;
      n719PrdNum = false ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A2394RecForNro = AV51ProForNro ;
      A3274RecPrdTnq = AV54TanqueN ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A5527RecLinRea = httpContext.getMessage( "N", "") ;
      A4024RecMar = AV79RecMar ;
      A12710PrdCantOrg = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P001Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin), Boolean.valueOf(n719PrdNum), A719PrdNum, A872RecPrdNum, A875RecPrdDsc, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A431FacCon, A686PrdCant, A683PrdCanFin, A1797PrdCanAny, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), Byte.valueOf(A4024RecMar), A4576RecLinUsr, A4577RecPesFec, A5527RecLinRea, A12710PrdCantOrg});
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
      if ( AV77ProdRep == 1 )
      {
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'ACTHDR' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P001Y4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV22BarCodReo), AV23BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
   }

   public void S151( )
   {
      /* 'MAQUINA' Routine */
      returnInSub = false ;
      AV74MaqTinTip = GXutil.space( (short)(2)) ;
      /* Using cursor P001Y5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV73MaqCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A602MaqCod = P001Y5_A602MaqCod[0] ;
         A619MaqTinTip = P001Y5_A619MaqTinTip[0] ;
         n619MaqTinTip = P001Y5_n619MaqTinTip[0] ;
         AV74MaqTinTip = A619MaqTinTip ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'ALTERAPRODUTOS' Routine */
      returnInSub = false ;
      AV75RecPrdNumN = AV37PrdNum ;
      /* Using cursor P001Y6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV73MaqCod, AV37PrdNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A5525MaqPrdNum = P001Y6_A5525MaqPrdNum[0] ;
         A602MaqCod = P001Y6_A602MaqCod[0] ;
         A6307MaqPrdNumC = P001Y6_A6307MaqPrdNumC[0] ;
         n6307MaqPrdNumC = P001Y6_n6307MaqPrdNumC[0] ;
         A6872MaqPrdAum = P001Y6_A6872MaqPrdAum[0] ;
         n6872MaqPrdAum = P001Y6_n6872MaqPrdAum[0] ;
         AV75RecPrdNumN = A6307MaqPrdNumC ;
         AV78MaqPrdAum = A6872MaqPrdAum ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'QUALMAQUINA' Routine */
      returnInSub = false ;
      /* Using cursor P001Y7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV22BarCodReo), AV23BarCodPar, Short.valueOf(AV52RecLinMaq)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A2804RecLinMaq = P001Y7_A2804RecLinMaq[0] ;
         A130BarCodPar = P001Y7_A130BarCodPar[0] ;
         A132BarCodReo = P001Y7_A132BarCodReo[0] ;
         A129BarCod = P001Y7_A129BarCod[0] ;
         A602MaqCod = P001Y7_A602MaqCod[0] ;
         AV73MaqCod = A602MaqCod ;
         /* Execute user subroutine: 'MAQUINA' */
         S151 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'TROCAPRODUTOS' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.trim( AV74MaqTinTip), httpContext.getMessage( "C", "")) == 0 )
      {
         AV78MaqPrdAum = (short)(0) ;
         /* Execute user subroutine: 'ALTERAPRODUTOS' */
         S161 ();
         if (returnInSub) return;
         if ( GXutil.strcmp(AV75RecPrdNumN, AV37PrdNum) != 0 )
         {
            AV37PrdNum = AV75RecPrdNumN ;
         }
      }
   }

   public void S131( )
   {
      /* 'DETECTAPRODREP' Routine */
      returnInSub = false ;
      AV77ProdRep = (byte)(0) ;
      /* Using cursor P001Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV22BarCodReo), AV23BarCodPar, Short.valueOf(AV52RecLinMaq), Boolean.valueOf(n719PrdNum), A719PrdNum, AV37PrdNum, Byte.valueOf(AV51ProForNro)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A2394RecForNro = P001Y8_A2394RecForNro[0] ;
         A872RecPrdNum = P001Y8_A872RecPrdNum[0] ;
         A2804RecLinMaq = P001Y8_A2804RecLinMaq[0] ;
         A130BarCodPar = P001Y8_A130BarCodPar[0] ;
         A132BarCodReo = P001Y8_A132BarCodReo[0] ;
         A129BarCod = P001Y8_A129BarCod[0] ;
         A1273RecLinPro = P001Y8_A1273RecLinPro[0] ;
         A811RecLin = P001Y8_A811RecLin[0] ;
         Gx_emsg = httpContext.getMessage( "O produto ", "") + AV37PrdNum + " " + AV38PrdNom + httpContext.getMessage( " esta repetido na preparação nº ", "") + GXutil.str( AV51ProForNro, 2, 0) ;
         httpContext.GX_msglist.addItem(Gx_emsg);
         AV38PrdNom = httpContext.getMessage( "ERRO-PRODUTO REPETIDO", "") ;
         AV77ProdRep = (byte)(1) ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexipro.this.A396EmprCod;
      this.aP1[0] = pexipro.this.A719PrdNum;
      this.aP2[0] = pexipro.this.AV15Cantidad;
      this.aP3[0] = pexipro.this.AV16UniMed;
      this.aP4[0] = pexipro.this.AV17TotKil;
      this.aP5[0] = pexipro.this.AV18BarVol;
      this.aP6[0] = pexipro.this.AV19ValCos;
      this.aP7[0] = pexipro.this.AV20LinRec;
      this.aP8[0] = pexipro.this.AV21BarCod;
      this.aP9[0] = pexipro.this.AV22BarCodReo;
      this.aP10[0] = pexipro.this.AV23BarCodPar;
      this.aP11[0] = pexipro.this.AV25Flag1;
      this.aP12[0] = pexipro.this.AV26Flag2;
      this.aP13[0] = pexipro.this.AV27UltRecLin;
      this.aP14[0] = pexipro.this.AV28Linea;
      this.aP15[0] = pexipro.this.AV29ExiCon;
      this.aP16[0] = pexipro.this.AV30FlagComp;
      this.aP17[0] = pexipro.this.AV51ProForNro;
      this.aP18[0] = pexipro.this.AV52RecLinMaq;
      this.aP19[0] = pexipro.this.AV54TanqueN;
      this.aP20[0] = pexipro.this.AV56ProForDes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pexipro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV69ForCan = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_int2 = new int[1] ;
      GXv_int8 = new short[1] ;
      GXv_char3 = new String[1] ;
      AV31CanTeo = DecimalUtil.ZERO ;
      AV47PrdCanFin = DecimalUtil.ZERO ;
      AV48PrdCanAny = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P001Y2_A396EmprCod = new String[] {""} ;
      P001Y2_A719PrdNum = new String[] {""} ;
      P001Y2_n719PrdNum = new boolean[] {false} ;
      P001Y2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001Y2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001Y2_A856ValCod = new byte[1] ;
      P001Y2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001Y2_A718PrdNom = new String[] {""} ;
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
      AV44MesOrd = "" ;
      GXv_char21 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      GXv_int20 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXv_int18 = new byte[1] ;
      GXv_int17 = new byte[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int14 = new short[1] ;
      GXv_int1 = new byte[1] ;
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
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      AV74MaqTinTip = "" ;
      AV73MaqCod = "" ;
      P001Y5_A396EmprCod = new String[] {""} ;
      P001Y5_A602MaqCod = new String[] {""} ;
      P001Y5_A619MaqTinTip = new String[] {""} ;
      P001Y5_n619MaqTinTip = new boolean[] {false} ;
      A602MaqCod = "" ;
      A619MaqTinTip = "" ;
      AV75RecPrdNumN = "" ;
      P001Y6_A396EmprCod = new String[] {""} ;
      P001Y6_A5525MaqPrdNum = new String[] {""} ;
      P001Y6_A602MaqCod = new String[] {""} ;
      P001Y6_A6307MaqPrdNumC = new String[] {""} ;
      P001Y6_n6307MaqPrdNumC = new boolean[] {false} ;
      P001Y6_A6872MaqPrdAum = new short[1] ;
      P001Y6_n6872MaqPrdAum = new boolean[] {false} ;
      A5525MaqPrdNum = "" ;
      A6307MaqPrdNumC = "" ;
      P001Y7_A396EmprCod = new String[] {""} ;
      P001Y7_A2804RecLinMaq = new short[1] ;
      P001Y7_A130BarCodPar = new String[] {""} ;
      P001Y7_A132BarCodReo = new byte[1] ;
      P001Y7_A129BarCod = new int[1] ;
      P001Y7_A602MaqCod = new String[] {""} ;
      P001Y8_A396EmprCod = new String[] {""} ;
      P001Y8_A719PrdNum = new String[] {""} ;
      P001Y8_n719PrdNum = new boolean[] {false} ;
      P001Y8_A2394RecForNro = new byte[1] ;
      P001Y8_A872RecPrdNum = new String[] {""} ;
      P001Y8_A2804RecLinMaq = new short[1] ;
      P001Y8_A130BarCodPar = new String[] {""} ;
      P001Y8_A132BarCodReo = new byte[1] ;
      P001Y8_A129BarCod = new int[1] ;
      P001Y8_A1273RecLinPro = new byte[1] ;
      P001Y8_A811RecLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexipro__default(),
         new Object[] {
             new Object[] {
            P001Y2_A396EmprCod, P001Y2_A719PrdNum, P001Y2_A705PrdExiCC, P001Y2_A704PrdExiAlm, P001Y2_A856ValCod, P001Y2_A685PrdCanRes, P001Y2_A718PrdNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001Y5_A396EmprCod, P001Y5_A602MaqCod, P001Y5_A619MaqTinTip, P001Y5_n619MaqTinTip
            }
            , new Object[] {
            P001Y6_A396EmprCod, P001Y6_A5525MaqPrdNum, P001Y6_A602MaqCod, P001Y6_A6307MaqPrdNumC, P001Y6_n6307MaqPrdNumC, P001Y6_A6872MaqPrdAum, P001Y6_n6872MaqPrdAum
            }
            , new Object[] {
            P001Y7_A396EmprCod, P001Y7_A2804RecLinMaq, P001Y7_A130BarCodPar, P001Y7_A132BarCodReo, P001Y7_A129BarCod, P001Y7_A602MaqCod
            }
            , new Object[] {
            P001Y8_A396EmprCod, P001Y8_A719PrdNum, P001Y8_n719PrdNum, P001Y8_A2394RecForNro, P001Y8_A872RecPrdNum, P001Y8_A2804RecLinMaq, P001Y8_A130BarCodPar, P001Y8_A132BarCodReo, P001Y8_A129BarCod, P001Y8_A1273RecLinPro,
            P001Y8_A811RecLin
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
   private byte AV66FlagExiSup ;
   private byte AV62FlagExiPro ;
   private byte AV67Consumos ;
   private byte AV55FlagHSS ;
   private byte AV57FlagMab ;
   private byte AV72Pizarro ;
   private byte AV70Hidro ;
   private byte AV71Fidel ;
   private byte AV79RecMar ;
   private byte A856ValCod ;
   private byte AV36Exist ;
   private byte AV40Flag3 ;
   private byte GXv_int20[] ;
   private byte GXv_int18[] ;
   private byte GXv_int17[] ;
   private byte GXv_int16[] ;
   private byte GXv_int15[] ;
   private byte GXv_int13[] ;
   private byte GXv_int12[] ;
   private byte GXv_int10[] ;
   private byte GXv_int1[] ;
   private byte AV77ProdRep ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private short AV20LinRec ;
   private short AV27UltRecLin ;
   private short AV52RecLinMaq ;
   private short GXv_int8[] ;
   private short GXv_int19[] ;
   private short GXv_int14[] ;
   private short AV78MaqPrdAum ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private short A6872MaqPrdAum ;
   private int AV18BarVol ;
   private int AV19ValCos ;
   private int AV21BarCod ;
   private int GXv_int7[] ;
   private int GXv_int2[] ;
   private int GXv_int9[] ;
   private int GX_INS410 ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15Cantidad ;
   private java.math.BigDecimal AV17TotKil ;
   private java.math.BigDecimal AV69ForCan ;
   private java.math.BigDecimal GXv_decimal5[] ;
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
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A12710PrdCantOrg ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV23BarCodPar ;
   private String AV56ProForDes ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String AV45Comp ;
   private String AV37PrdNum ;
   private String AV38PrdNom ;
   private String AV44MesOrd ;
   private String GXv_char21[] ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String A130BarCodPar ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A4576RecLinUsr ;
   private String A5527RecLinRea ;
   private String Gx_emsg ;
   private String AV74MaqTinTip ;
   private String AV73MaqCod ;
   private String A602MaqCod ;
   private String A619MaqTinTip ;
   private String AV75RecPrdNumN ;
   private String A5525MaqPrdNum ;
   private String A6307MaqPrdNumC ;
   private java.util.Date A4577RecPesFec ;
   private boolean returnInSub ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n619MaqTinTip ;
   private boolean n6307MaqPrdNumC ;
   private boolean n6872MaqPrdAum ;
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
   private String[] P001Y2_A396EmprCod ;
   private String[] P001Y2_A719PrdNum ;
   private boolean[] P001Y2_n719PrdNum ;
   private java.math.BigDecimal[] P001Y2_A705PrdExiCC ;
   private java.math.BigDecimal[] P001Y2_A704PrdExiAlm ;
   private byte[] P001Y2_A856ValCod ;
   private java.math.BigDecimal[] P001Y2_A685PrdCanRes ;
   private String[] P001Y2_A718PrdNom ;
   private String[] P001Y5_A396EmprCod ;
   private String[] P001Y5_A602MaqCod ;
   private String[] P001Y5_A619MaqTinTip ;
   private boolean[] P001Y5_n619MaqTinTip ;
   private String[] P001Y6_A396EmprCod ;
   private String[] P001Y6_A5525MaqPrdNum ;
   private String[] P001Y6_A602MaqCod ;
   private String[] P001Y6_A6307MaqPrdNumC ;
   private boolean[] P001Y6_n6307MaqPrdNumC ;
   private short[] P001Y6_A6872MaqPrdAum ;
   private boolean[] P001Y6_n6872MaqPrdAum ;
   private String[] P001Y7_A396EmprCod ;
   private short[] P001Y7_A2804RecLinMaq ;
   private String[] P001Y7_A130BarCodPar ;
   private byte[] P001Y7_A132BarCodReo ;
   private int[] P001Y7_A129BarCod ;
   private String[] P001Y7_A602MaqCod ;
   private String[] P001Y8_A396EmprCod ;
   private String[] P001Y8_A719PrdNum ;
   private boolean[] P001Y8_n719PrdNum ;
   private byte[] P001Y8_A2394RecForNro ;
   private String[] P001Y8_A872RecPrdNum ;
   private short[] P001Y8_A2804RecLinMaq ;
   private String[] P001Y8_A130BarCodPar ;
   private byte[] P001Y8_A132BarCodReo ;
   private int[] P001Y8_A129BarCod ;
   private byte[] P001Y8_A1273RecLinPro ;
   private short[] P001Y8_A811RecLin ;
}

final  class pexipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001Y2", "SELECT EmprCod, PrdNum, PrdExiCC, PrdExiAlm, ValCod, PrdCanRes, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001Y3", "INSERT INTO TXPLRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, PrdNum, RecPrdNum, RecPrdDsc, ForPrdUMe, FacCon, PrdCant, PrdCanFin, PrdCanAny, RecForNro, RecPrdTnq, RecMar, RecLinUsr, RecPesFec, RecLinRea, PrdCantOrg, RecCanEns, RecSalMP, RecSalVol, RecLote, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecPrdDc2, RecFabId, RecLotAlm, RecLoteFch, RecManAut) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P001Y4", "UPDATE TXPBARCAD SET BarInci=9  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P001Y5", "SELECT EmprCod, MaqCod, MaqTinTip FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001Y6", "SELECT EmprCod, MaqPrdNum, MaqCod, MaqPrdNumC, MaqPrdAum FROM TXPMAQPRO WHERE (EmprCod = ?) AND (? like (rtrim(MaqCod) || '%')) AND (MaqPrdNum = ?) ORDER BY EmprCod, MaqCod, MaqPrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001Y7", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001Y8", "SELECT EmprCod, PrdNum, RecForNro, RecPrdNum, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecLinPro, RecLin FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (PrdNum = ?) AND (RecPrdNum = ?) AND (RecForNro = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
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
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[23], 3);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               stmt.setString(7, (String)parms[7], 6);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
      }
   }

}

