package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexipro2 extends GXProcedure
{
   public pexipro2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexipro2.class ), "" );
   }

   public pexipro2( int remoteHandle ,
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
      pexipro2.this.aP20 = new String[] {""};
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
      pexipro2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexipro2.this.AV67PrdNumPaso = aP1[0];
      this.aP1 = aP1;
      pexipro2.this.AV15Cantidad = aP2[0];
      this.aP2 = aP2;
      pexipro2.this.AV16UniMed = aP3[0];
      this.aP3 = aP3;
      pexipro2.this.AV17TotKil = aP4[0];
      this.aP4 = aP4;
      pexipro2.this.AV18BarVol = aP5[0];
      this.aP5 = aP5;
      pexipro2.this.AV19ValCos = aP6[0];
      this.aP6 = aP6;
      pexipro2.this.AV20LinRec = aP7[0];
      this.aP7 = aP7;
      pexipro2.this.AV21BarCod = aP8[0];
      this.aP8 = aP8;
      pexipro2.this.AV22BarCodReo = aP9[0];
      this.aP9 = aP9;
      pexipro2.this.AV23BarCodPar = aP10[0];
      this.aP10 = aP10;
      pexipro2.this.AV25Flag1 = aP11[0];
      this.aP11 = aP11;
      pexipro2.this.AV26Flag2 = aP12[0];
      this.aP12 = aP12;
      pexipro2.this.AV27UltRecLin = aP13[0];
      this.aP13 = aP13;
      pexipro2.this.AV28Linea = aP14[0];
      this.aP14 = aP14;
      pexipro2.this.AV29ExiCon = aP15[0];
      this.aP15 = aP15;
      pexipro2.this.AV30FlagComp = aP16[0];
      this.aP16 = aP16;
      pexipro2.this.AV51ProForNro = aP17[0];
      this.aP17 = aP17;
      pexipro2.this.AV52RecLinMaq = aP18[0];
      this.aP18 = aP18;
      pexipro2.this.AV54TanqueN = aP19[0];
      this.aP19 = aP19;
      pexipro2.this.AV56ProForDes = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV55FlagHSS ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV55FlagHSS = GXt_int1 ;
      GXt_int1 = AV57FlagMab ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV57FlagMab = GXt_int1 ;
      GXt_int1 = AV78Pizarro ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV78Pizarro = GXt_int1 ;
      GXt_int1 = AV84Jpf ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV84Jpf = GXt_int1 ;
      GXt_int1 = AV85MaqAm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAQAMO", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV85MaqAm = GXt_int1 ;
      GXt_int3 = AV97ValSal ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "BRINE", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pexipro2.this.A396EmprCod = GXv_char4[0] ;
      pexipro2.this.GXt_int3 = GXv_int6[0] ;
      AV97ValSal = GXt_int3 ;
      GXt_int1 = AV92PrdAlS ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRDALS", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV92PrdAlS = GXt_int1 ;
      GXt_int3 = AV90Consumos ;
      GXv_int6[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int6) ;
      pexipro2.this.GXt_int3 = GXv_int6[0] ;
      AV90Consumos = (byte)(GXt_int3) ;
      GXt_int1 = AV108Validez12 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALI12", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV108Validez12 = GXt_int1 ;
      GXt_int1 = AV109carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV109carvema = GXt_int1 ;
      GXt_int1 = AV111Forzar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALTPRD", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV111Forzar = GXt_int1 ;
      GXt_int1 = AV114Lote01 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "01LOTE", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV114Lote01 = GXt_int1 ;
      GXt_int1 = AV117Etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STKETM", ""), GXv_int2) ;
      pexipro2.this.GXt_int1 = GXv_int2[0] ;
      AV117Etm = GXt_int1 ;
      GXt_char7 = AV102Station ;
      GXv_char5[0] = GXt_char7 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      pexipro2.this.GXt_char7 = GXv_char5[0] ;
      AV102Station = GXt_char7 ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = AV104Emprnom ;
      GXv_char8[0] = AV103Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV102Station, GXv_char5, GXv_char4, GXv_char8) ;
      pexipro2.this.A396EmprCod = GXv_char5[0] ;
      pexipro2.this.AV104Emprnom = GXv_char4[0] ;
      pexipro2.this.AV103Usurcod = GXv_char8[0] ;
      /* Execute user subroutine: 'MAQAM' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( (0==AV30FlagComp) )
      {
         AV27UltRecLin = (short)(AV20LinRec+10) ;
      }
      if ( AV16UniMed == 3 )
      {
         AV31CanTeo = AV15Cantidad.multiply(AV17TotKil).multiply(DecimalUtil.doubleToDec(AV19ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else if ( AV16UniMed == 4 )
      {
         /* Execute user subroutine: 'HDR' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31CanTeo = AV15Cantidad.multiply(AV105BarMtr).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else if ( AV16UniMed == 5 )
      {
         /* Execute user subroutine: 'HDR' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV31CanTeo = AV15Cantidad.multiply((AV105BarMtr.multiply(DecimalUtil.doubleToDec(AV106BarAncCru1)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else if ( AV16UniMed == 6 )
      {
         AV31CanTeo = AV15Cantidad.multiply(DecimalUtil.doubleToDec(AV18BarVol)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      }
      else
      {
         AV31CanTeo = AV15Cantidad.multiply(DecimalUtil.doubleToDec(AV18BarVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      if ( ( ( AV16UniMed == 2 ) || ( AV16UniMed == 1 ) ) && ( AV18BarVol < 0 ) )
      {
         AV31CanTeo = DecimalUtil.doubleToDec(0) ;
      }
      AV47PrdCanFin = DecimalUtil.doubleToDec(0) ;
      AV48PrdCanAny = DecimalUtil.doubleToDec(0) ;
      AV66FlagValCod = (byte)(0) ;
      AV99Prdsal = httpContext.getMessage( "N", "") ;
      if ( AV111Forzar == 1 )
      {
         AV112Numveces = (short)(0) ;
         /* Using cursor P010N2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV67PrdNumPaso});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A719PrdNum = P010N2_A719PrdNum[0] ;
            n719PrdNum = P010N2_n719PrdNum[0] ;
            A11718PrdAltCam = P010N2_A11718PrdAltCam[0] ;
            A680PrdAltNum = P010N2_A680PrdAltNum[0] ;
            if ( A11718PrdAltCam == 1 )
            {
               AV112Numveces = (short)(AV112Numveces+1) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      if ( ( AV111Forzar == 1 ) && ( AV112Numveces == 1 ) )
      {
         AV68RecAnyTie = (short)(0) ;
         /* Using cursor P010N3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV67PrdNumPaso});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P010N3_A719PrdNum[0] ;
            n719PrdNum = P010N3_n719PrdNum[0] ;
            A11718PrdAltCam = P010N3_A11718PrdAltCam[0] ;
            A678PrdAltFac = P010N3_A678PrdAltFac[0] ;
            A680PrdAltNum = P010N3_A680PrdAltNum[0] ;
            A679PrdAltNom = P010N3_A679PrdAltNom[0] ;
            n679PrdAltNom = P010N3_n679PrdAltNom[0] ;
            A679PrdAltNom = P010N3_A679PrdAltNom[0] ;
            n679PrdAltNom = P010N3_n679PrdAltNom[0] ;
            if ( A11718PrdAltCam == 1 )
            {
               AV31CanTeo = AV31CanTeo.multiply(A678PrdAltFac) ;
               AV15Cantidad = AV15Cantidad.multiply(A678PrdAltFac) ;
               AV33CanRec = AV31CanTeo ;
               AV37PrdNum = A680PrdAltNum ;
               AV38PrdNom = A679PrdAltNom ;
               GXv_char8[0] = A396EmprCod ;
               GXv_char5[0] = A680PrdAltNum ;
               GXv_decimal9[0] = AV31CanTeo ;
               new app.pactres(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal9) ;
               pexipro2.this.A396EmprCod = GXv_char8[0] ;
               pexipro2.this.A680PrdAltNum = GXv_char5[0] ;
               pexipro2.this.AV31CanTeo = GXv_decimal9[0] ;
               /* Execute user subroutine: 'NEWRECETA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV113Inc_obs = httpContext.getMessage( "Contador ALTPRD activo", "") + GXutil.newLine( ) ;
               AV113Inc_obs += httpContext.getMessage( "Producto ", "") + AV67PrdNumPaso + httpContext.getMessage( " se cambia por ", "") + AV37PrdNum + GXutil.newLine( ) ;
               AV113Inc_obs += httpContext.getMessage( "Factor correccion= ", "") + GXutil.str( A678PrdAltFac, 7, 4) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV122Pgmname, AV103Usurcod, AV102Station, AV113Inc_obs, AV21BarCod, AV22BarCodReo, AV23BarCodPar) ;
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
      else
      {
         /* Using cursor P010N4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV67PrdNumPaso});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A719PrdNum = P010N4_A719PrdNum[0] ;
            n719PrdNum = P010N4_n719PrdNum[0] ;
            A718PrdNom = P010N4_A718PrdNom[0] ;
            A8936PrdSal = P010N4_A8936PrdSal[0] ;
            A1643PrdTip = P010N4_A1643PrdTip[0] ;
            A704PrdExiAlm = P010N4_A704PrdExiAlm[0] ;
            A705PrdExiCC = P010N4_A705PrdExiCC[0] ;
            A856ValCod = P010N4_A856ValCod[0] ;
            A685PrdCanRes = P010N4_A685PrdCanRes[0] ;
            A8895PrdAltAct = P010N4_A8895PrdAltAct[0] ;
            n8895PrdAltAct = P010N4_n8895PrdAltAct[0] ;
            A732PrdStkMinU = P010N4_A732PrdStkMinU[0] ;
            AV69PrdNomPaso = A718PrdNom ;
            AV99Prdsal = A8936PrdSal ;
            AV107Prdtip = A1643PrdTip ;
            AV91Existencia = ((AV90Consumos==0) ? A705PrdExiCC : A704PrdExiAlm) ;
            if ( ( A856ValCod == 3 ) || ( ( A856ValCod > 1 ) && ( AV92PrdAlS == 0 ) && ( AV108Validez12 == 0 ) ) || ( ( AV100Valcod > 2 ) && ( AV92PrdAlS == 0 ) && ( AV108Validez12 == 1 ) ) )
            {
               AV66FlagValCod = (byte)(1) ;
               if ( A856ValCod == 3 )
               {
                  AV65FlagExis2 = (byte)(0) ;
               }
               else
               {
                  AV70PrdNum2 = A719PrdNum ;
                  GXv_char8[0] = A396EmprCod ;
                  GXv_char5[0] = AV70PrdNum2 ;
                  GXv_decimal9[0] = AV31CanTeo ;
                  GXv_int2[0] = AV65FlagExis2 ;
                  new app.pexialt2(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal9, GXv_int2) ;
                  pexipro2.this.A396EmprCod = GXv_char8[0] ;
                  pexipro2.this.AV70PrdNum2 = GXv_char5[0] ;
                  pexipro2.this.AV31CanTeo = GXv_decimal9[0] ;
                  pexipro2.this.AV65FlagExis2 = GXv_int2[0] ;
               }
               if ( AV65FlagExis2 == 0 )
               {
                  AV37PrdNum = "" ;
                  AV38PrdNom = httpContext.getMessage( "@ATENCION:", "") + A719PrdNum + httpContext.getMessage( "SUPRIMIDO", "") ;
                  AV16UniMed = (byte)(0) ;
                  AV33CanRec = DecimalUtil.ZERO ;
                  AV15Cantidad = DecimalUtil.ZERO ;
                  AV54TanqueN = (byte)(0) ;
                  AV68RecAnyTie = (short)(1) ;
                  /* Execute user subroutine: 'NEWRECETA' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  /* Execute user subroutine: 'ACTHDR' */
                  S141 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
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
               AV45Comp = GXutil.substring( A719PrdNum, 1, 1) ;
               if ( GXutil.strcmp(AV45Comp, "0") != 0 )
               {
                  AV32ExiRes = AV91Existencia.subtract(A685PrdCanRes) ;
                  if ( AV92PrdAlS == 0 )
                  {
                     if ( DecimalUtil.compareTo(AV32ExiRes, AV31CanTeo) >= 0 )
                     {
                        AV64FlagExis1 = (byte)(1) ;
                     }
                     else
                     {
                        AV70PrdNum2 = A719PrdNum ;
                        GXv_char8[0] = A396EmprCod ;
                        GXv_char5[0] = AV70PrdNum2 ;
                        GXv_decimal9[0] = AV31CanTeo ;
                        GXv_int2[0] = AV65FlagExis2 ;
                        new app.pexialt2(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal9, GXv_int2) ;
                        pexipro2.this.A396EmprCod = GXv_char8[0] ;
                        pexipro2.this.AV70PrdNum2 = GXv_char5[0] ;
                        pexipro2.this.AV31CanTeo = GXv_decimal9[0] ;
                        pexipro2.this.AV65FlagExis2 = GXv_int2[0] ;
                        Gx_msg = httpContext.getMessage( "No hay cantidad, busco alternativos, &PrdNum2 = ", "") + AV70PrdNum2 + httpContext.getMessage( "&FlagExis2 = ", "") + GXutil.str( AV65FlagExis2, 1, 0) ;
                        AV68RecAnyTie = (short)(0) ;
                        if ( AV65FlagExis2 == 0 )
                        {
                           AV64FlagExis1 = (byte)(1) ;
                           AV68RecAnyTie = (short)(1) ;
                        }
                     }
                  }
                  else
                  {
                     AV64FlagExis1 = (byte)(((DecimalUtil.compareTo(AV32ExiRes, AV31CanTeo)>=0)&&(A856ValCod>1) ? 1 : 0)) ;
                     AV93BuscoAlt = (byte)(((A8895PrdAltAct==1) ? ((AV64FlagExis1==1) ? 0 : 1) : 1)) ;
                     if ( AV93BuscoAlt == 1 )
                     {
                        AV70PrdNum2 = A719PrdNum ;
                        AV94CanTeo2 = AV31CanTeo ;
                        AV95Cantidad2 = AV15Cantidad ;
                        GXt_int1 = AV65FlagExis2 ;
                        GXv_char8[0] = A396EmprCod ;
                        GXv_char5[0] = AV70PrdNum2 ;
                        GXv_decimal9[0] = AV94CanTeo2 ;
                        GXv_decimal10[0] = AV95Cantidad2 ;
                        GXv_int2[0] = A8895PrdAltAct ;
                        GXv_int11[0] = GXt_int1 ;
                        new app.pexialts(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal9, GXv_decimal10, GXv_int2, GXv_int11) ;
                        pexipro2.this.A396EmprCod = GXv_char8[0] ;
                        pexipro2.this.AV70PrdNum2 = GXv_char5[0] ;
                        pexipro2.this.AV94CanTeo2 = GXv_decimal9[0] ;
                        pexipro2.this.AV95Cantidad2 = GXv_decimal10[0] ;
                        pexipro2.this.A8895PrdAltAct = GXv_int2[0] ;
                        pexipro2.this.GXt_int1 = GXv_int11[0] ;
                        AV65FlagExis2 = GXt_int1 ;
                        if ( AV65FlagExis2 == 1 )
                        {
                           AV31CanTeo = AV94CanTeo2 ;
                           AV15Cantidad = AV95Cantidad2 ;
                           AV67PrdNumPaso = AV70PrdNum2 ;
                           GXt_char7 = AV69PrdNomPaso ;
                           GXv_char8[0] = A396EmprCod ;
                           GXv_char5[0] = AV70PrdNum2 ;
                           GXv_char4[0] = GXt_char7 ;
                           new app.pprddsc(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_char4) ;
                           pexipro2.this.A396EmprCod = GXv_char8[0] ;
                           pexipro2.this.AV70PrdNum2 = GXv_char5[0] ;
                           pexipro2.this.GXt_char7 = GXv_char4[0] ;
                           AV69PrdNomPaso = GXt_char7 ;
                        }
                        else
                        {
                           if ( AV64FlagExis1 == 0 )
                           {
                              AV67PrdNumPaso = A719PrdNum ;
                              AV69PrdNomPaso = httpContext.getMessage( "@ATENCION:", "") + A719PrdNum + httpContext.getMessage( " SIN STOCK", "") ;
                           }
                        }
                        AV64FlagExis1 = (byte)(1) ;
                        AV65FlagExis2 = (byte)(0) ;
                     }
                  }
                  if ( AV117Etm == 1 )
                  {
                     AV68RecAnyTie = (short)(((AV117Etm==0) ? AV68RecAnyTie : ((A732PrdStkMinU.doubleValue()>0)&&(DecimalUtil.compareTo((AV91Existencia.subtract((A685PrdCanRes.add(AV31CanTeo)))), A732PrdStkMinU)<=0) ? 1 : AV68RecAnyTie))) ;
                  }
               }
               else
               {
                  AV37PrdNum = A719PrdNum ;
                  AV38PrdNom = A718PrdNom ;
                  AV33CanRec = AV31CanTeo ;
                  AV68RecAnyTie = (short)(0) ;
                  /* Execute user subroutine: 'NEWRECETA' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  GXv_char8[0] = A396EmprCod ;
                  GXv_char5[0] = AV37PrdNum ;
                  GXv_decimal10[0] = AV31CanTeo ;
                  GXv_int11[0] = AV16UniMed ;
                  GXv_decimal9[0] = AV17TotKil ;
                  GXv_int6[0] = AV18BarVol ;
                  GXv_int12[0] = AV19ValCos ;
                  new app.prescom(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal10, GXv_int11, GXv_decimal9, GXv_int6, GXv_int12) ;
                  pexipro2.this.A396EmprCod = GXv_char8[0] ;
                  pexipro2.this.AV37PrdNum = GXv_char5[0] ;
                  pexipro2.this.AV31CanTeo = GXv_decimal10[0] ;
                  pexipro2.this.AV16UniMed = GXv_int11[0] ;
                  pexipro2.this.AV17TotKil = GXv_decimal9[0] ;
                  pexipro2.this.AV18BarVol = GXv_int6[0] ;
                  pexipro2.this.AV19ValCos = GXv_int12[0] ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      if ( ( ( AV66FlagValCod == 1 ) && ( AV65FlagExis2 == 0 ) ) || ( GXutil.strcmp(AV45Comp, "0") == 0 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV64FlagExis1 == 1 )
      {
         AV33CanRec = AV31CanTeo ;
         AV37PrdNum = AV67PrdNumPaso ;
         AV38PrdNom = AV69PrdNomPaso ;
         if ( ( AV55FlagHSS == 1 ) && ! (GXutil.strcmp("", AV56ProForDes)==0) && ( ( GXutil.strcmp(AV37PrdNum, "100000") < 0 ) || ( GXutil.strcmp(AV37PrdNum, "999999") == 0 ) ) )
         {
            AV38PrdNom = AV56ProForDes ;
         }
         /* Execute user subroutine: 'NEWRECETA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV68RecAnyTie == 1 ) && ( GXutil.strcmp(AV38PrdNom, httpContext.getMessage( "AGUA", "")) != 0 ) )
         {
            /* Execute user subroutine: 'ACTHDR' */
            S141 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         GXv_char8[0] = A396EmprCod ;
         GXv_char5[0] = AV67PrdNumPaso ;
         GXv_decimal10[0] = AV31CanTeo ;
         new app.pactres(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal10) ;
         pexipro2.this.A396EmprCod = GXv_char8[0] ;
         pexipro2.this.AV67PrdNumPaso = GXv_char5[0] ;
         pexipro2.this.AV31CanTeo = GXv_decimal10[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV65FlagExis2 == 1 )
      {
         AV68RecAnyTie = (short)(0) ;
         /* Using cursor P010N5 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV67PrdNumPaso});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A719PrdNum = P010N5_A719PrdNum[0] ;
            n719PrdNum = P010N5_n719PrdNum[0] ;
            A680PrdAltNum = P010N5_A680PrdAltNum[0] ;
            A678PrdAltFac = P010N5_A678PrdAltFac[0] ;
            A679PrdAltNom = P010N5_A679PrdAltNom[0] ;
            n679PrdAltNom = P010N5_n679PrdAltNom[0] ;
            A679PrdAltNom = P010N5_A679PrdAltNom[0] ;
            n679PrdAltNom = P010N5_n679PrdAltNom[0] ;
            AV37PrdNum = A680PrdAltNum ;
            GXv_char8[0] = A396EmprCod ;
            GXv_char5[0] = AV37PrdNum ;
            GXv_decimal10[0] = AV31CanTeo ;
            GXv_int11[0] = AV71FlagExis3 ;
            new app.pexialt3(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal10, GXv_int11) ;
            pexipro2.this.A396EmprCod = GXv_char8[0] ;
            pexipro2.this.AV37PrdNum = GXv_char5[0] ;
            pexipro2.this.AV31CanTeo = GXv_decimal10[0] ;
            pexipro2.this.AV71FlagExis3 = GXv_int11[0] ;
            if ( AV71FlagExis3 == 1 )
            {
               AV31CanTeo = AV31CanTeo.multiply(A678PrdAltFac) ;
               AV15Cantidad = AV15Cantidad.multiply(A678PrdAltFac) ;
               AV33CanRec = AV31CanTeo ;
               AV37PrdNum = A680PrdAltNum ;
               AV38PrdNom = A679PrdAltNom ;
               GXv_char8[0] = A396EmprCod ;
               GXv_char5[0] = A680PrdAltNum ;
               GXv_decimal10[0] = AV31CanTeo ;
               new app.pactres(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal10) ;
               pexipro2.this.A396EmprCod = GXv_char8[0] ;
               pexipro2.this.A680PrdAltNum = GXv_char5[0] ;
               pexipro2.this.AV31CanTeo = GXv_decimal10[0] ;
               /* Execute user subroutine: 'NEWRECETA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'NEWRECETA' Routine */
      returnInSub = false ;
      AV20LinRec = (short)(AV20LinRec+10) ;
      /* Execute user subroutine: 'SAL_MUERA' */
      S121 ();
      if (returnInSub) return;
      if ( ( AV84Jpf == 1 ) && ( ( AV85MaqAm == 1 ) && ( GXutil.strcmp(AV88MaqTipmaq, httpContext.getMessage( "A", "")) == 0 ) ) || ( ( AV85MaqAm == 1 ) && ( GXutil.strcmp(AV88MaqTipmaq, httpContext.getMessage( "A", "")) != 0 ) && ( GXutil.strcmp(AV107Prdtip, httpContext.getMessage( "M", "")) == 0 ) ) )
      {
         /* Execute user subroutine: 'DENSIDAD' */
         S131 ();
         if (returnInSub) return;
      }
      AV83ProdRep = (byte)(0) ;
      if ( ( GXutil.strcmp(AV96BarSalm, httpContext.getMessage( "S", "")) == 0 ) && ( AV97ValSal > 0 ) && ( GXutil.strcmp(AV99Prdsal, httpContext.getMessage( "S", "")) == 0 ) )
      {
         GXv_char8[0] = A396EmprCod ;
         GXv_char5[0] = AV37PrdNum ;
         GXv_char4[0] = AV38PrdNom ;
         GXv_decimal10[0] = AV33CanRec ;
         GXv_int12[0] = AV18BarVol ;
         GXv_int13[0] = AV76RecSalmP ;
         GXv_int6[0] = AV77RecSalVol ;
         GXv_int11[0] = AV16UniMed ;
         GXv_decimal9[0] = AV15Cantidad ;
         GXv_int14[0] = AV97ValSal ;
         GXv_char15[0] = AV98Recacc ;
         GXv_int2[0] = AV100Valcod ;
         GXv_int16[0] = (byte)(AV68RecAnyTie) ;
         GXv_char17[0] = AV67PrdNumPaso ;
         new app.pbrenin(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_char4, GXv_decimal10, GXv_int12, GXv_int13, GXv_int6, GXv_int11, GXv_decimal9, GXv_int14, GXv_char15, GXv_int2, GXv_int16, GXv_char17) ;
         pexipro2.this.A396EmprCod = GXv_char8[0] ;
         pexipro2.this.AV37PrdNum = GXv_char5[0] ;
         pexipro2.this.AV38PrdNom = GXv_char4[0] ;
         pexipro2.this.AV33CanRec = GXv_decimal10[0] ;
         pexipro2.this.AV18BarVol = GXv_int12[0] ;
         pexipro2.this.AV76RecSalmP = GXv_int13[0] ;
         pexipro2.this.AV77RecSalVol = GXv_int6[0] ;
         pexipro2.this.AV16UniMed = GXv_int11[0] ;
         pexipro2.this.AV15Cantidad = GXv_decimal9[0] ;
         pexipro2.this.AV97ValSal = GXv_int14[0] ;
         pexipro2.this.AV98Recacc = GXv_char15[0] ;
         pexipro2.this.AV100Valcod = GXv_int2[0] ;
         pexipro2.this.AV68RecAnyTie = GXv_int16[0] ;
         pexipro2.this.AV67PrdNumPaso = GXv_char17[0] ;
         if ( AV100Valcod == 9 )
         {
            AV101Texto_i = httpContext.getMessage( "El sistema ha intentado aplicar cambio de Sal Solida a Liquida", "") + GXutil.newLine( ) + httpContext.getMessage( "pero no encontro el producto marcado como Sal Muera=S", "") + GXutil.newLine( ) + httpContext.getMessage( "Dejo el producto Solido", "") + GXutil.newLine( ) + httpContext.getMessage( "Incidencia en creacion de receta de teñido =", "") + GXutil.str( AV21BarCod, 8, 0) + "-" + GXutil.str( AV22BarCodReo, 1, 0) + AV23BarCodPar + GXutil.newLine( ) + httpContext.getMessage( "RecLinmaq =", "") + GXutil.str( AV52RecLinMaq, 4, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV122Pgmname, AV103Usurcod, AV102Station, AV101Texto_i, AV21BarCod, AV22BarCodReo, AV23BarCodPar) ;
         }
      }
      Gx_msg = httpContext.getMessage( "Pexipro2.Begin New,Hdr=", "") + GXutil.str( AV21BarCod, 8, 0) + "-" + GXutil.str( AV22BarCodReo, 1, 0) + AV23BarCodPar + httpContext.getMessage( "Producto=", "") + AV37PrdNum ;
      System.out.println( Gx_msg );
      AV110Prdlote = " " ;
      if ( ( AV109carvema == 1 ) || ( AV114Lote01 == 1 ) )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_char15[0] = AV37PrdNum ;
         GXv_char8[0] = AV110Prdlote ;
         GXv_int14[0] = AV115PrvNum ;
         GXv_char5[0] = AV116Prdnom2 ;
         new app.ploteproducto(remoteHandle, context).execute( GXv_char17, GXv_char15, GXv_char8, GXv_int14, GXv_char5) ;
         pexipro2.this.A396EmprCod = GXv_char17[0] ;
         pexipro2.this.AV37PrdNum = GXv_char15[0] ;
         pexipro2.this.AV110Prdlote = GXv_char8[0] ;
         pexipro2.this.AV115PrvNum = GXv_int14[0] ;
         pexipro2.this.AV116Prdnom2 = GXv_char5[0] ;
      }
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
      if ( AV33CanRec.doubleValue() < 0 )
      {
         AV33CanRec = DecimalUtil.doubleToDec(0) ;
      }
      A686PrdCant = AV33CanRec.multiply(DecimalUtil.doubleToDec(1000)) ;
      A431FacCon = AV15Cantidad ;
      if ( ( AV84Jpf == 1 ) && ( ( AV85MaqAm == 1 ) && ( GXutil.strcmp(AV88MaqTipmaq, httpContext.getMessage( "A", "")) == 0 ) && ( AV89PRDDENSS.doubleValue() > 0 ) ) || ( ( AV85MaqAm == 1 ) && ( GXutil.strcmp(AV88MaqTipmaq, httpContext.getMessage( "A", "")) != 0 ) && ( AV89PRDDENSS.doubleValue() > 0 ) && ( GXutil.strcmp(AV107Prdtip, httpContext.getMessage( "M", "")) == 0 ) ) )
      {
         A686PrdCant = A686PrdCant.divide(AV89PRDDENSS, 18, java.math.RoundingMode.DOWN) ;
         A490ForPrdUMe = (byte)(2) ;
         n490ForPrdUMe = false ;
         A431FacCon = AV15Cantidad.divide(AV89PRDDENSS, 18, java.math.RoundingMode.DOWN) ;
      }
      A719PrdNum = AV37PrdNum ;
      n719PrdNum = false ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A2394RecForNro = AV51ProForNro ;
      A3274RecPrdTnq = AV54TanqueN ;
      if ( GXutil.strcmp(AV38PrdNom, httpContext.getMessage( "AGUA", "")) == 0 )
      {
         A4024RecMar = (byte)(0) ;
      }
      else
      {
         A4024RecMar = (byte)(AV68RecAnyTie) ;
      }
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A5422RecSalMP = AV76RecSalmP ;
      A5467RecSalVol = AV77RecSalVol ;
      A5527RecLinRea = httpContext.getMessage( "N", "") ;
      A4900PrdCanMac = DecimalUtil.doubleToDec(0) ;
      if ( ( AV84Jpf == 1 ) && ( ( AV85MaqAm == 1 ) && ( GXutil.strcmp(AV88MaqTipmaq, httpContext.getMessage( "A", "")) == 0 ) ) || ( ( AV85MaqAm == 1 ) && ( GXutil.strcmp(AV88MaqTipmaq, httpContext.getMessage( "A", "")) != 0 ) && ( GXutil.strcmp(AV107Prdtip, httpContext.getMessage( "M", "")) == 0 ) ) )
      {
         A4900PrdCanMac = AV89PRDDENSS ;
      }
      A8937RecAcc = AV98Recacc ;
      A5725RecLote = AV110Prdlote ;
      A11708RecProv = AV115PrvNum ;
      A12641RecPrdDc2 = AV116Prdnom2 ;
      A12710PrdCantOrg = DecimalUtil.doubleToDec(0) ;
      A12717RecFabId = AV115PrvNum ;
      /* Using cursor P010N6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin), Boolean.valueOf(n719PrdNum), A719PrdNum, A872RecPrdNum, A875RecPrdDsc, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A431FacCon, A686PrdCant, A683PrdCanFin, A1797PrdCanAny, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), Byte.valueOf(A4024RecMar), A4576RecLinUsr, A4577RecPesFec, Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, A5725RecLote, A8937RecAcc, A4900PrdCanMac, Integer.valueOf(A11708RecProv), A12641RecPrdDc2, A12710PrdCantOrg, Integer.valueOf(A12717RecFabId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
      if ( (pr_default.getStatus(4) == 1) )
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
      Gx_msg = httpContext.getMessage( "Pexipro2.End New,Hdr=", "") + GXutil.str( AV21BarCod, 8, 0) + "-" + GXutil.str( AV22BarCodReo, 1, 0) + AV23BarCodPar + httpContext.getMessage( "Producto=", "") + AV37PrdNum ;
      System.out.println( Gx_msg );
   }

   public void S121( )
   {
      /* 'SAL_MUERA' Routine */
      returnInSub = false ;
      AV76RecSalmP = (short)(0) ;
      AV77RecSalVol = 0 ;
      GXv_char17[0] = A396EmprCod ;
      GXv_char15[0] = AV37PrdNum ;
      GXv_int14[0] = AV21BarCod ;
      GXv_int16[0] = AV22BarCodReo ;
      GXv_char8[0] = AV23BarCodPar ;
      GXv_int13[0] = AV52RecLinMaq ;
      GXv_decimal10[0] = AV33CanRec ;
      GXv_int12[0] = AV18BarVol ;
      GXv_int18[0] = AV76RecSalmP ;
      GXv_int6[0] = AV77RecSalVol ;
      GXv_decimal9[0] = AV17TotKil ;
      new app.psalmuera(remoteHandle, context).execute( GXv_char17, GXv_char15, GXv_int14, GXv_int16, GXv_char8, GXv_int13, GXv_decimal10, GXv_int12, GXv_int18, GXv_int6, GXv_decimal9) ;
      pexipro2.this.A396EmprCod = GXv_char17[0] ;
      pexipro2.this.AV37PrdNum = GXv_char15[0] ;
      pexipro2.this.AV21BarCod = GXv_int14[0] ;
      pexipro2.this.AV22BarCodReo = GXv_int16[0] ;
      pexipro2.this.AV23BarCodPar = GXv_char8[0] ;
      pexipro2.this.AV52RecLinMaq = GXv_int13[0] ;
      pexipro2.this.AV33CanRec = GXv_decimal10[0] ;
      pexipro2.this.AV18BarVol = GXv_int12[0] ;
      pexipro2.this.AV76RecSalmP = GXv_int18[0] ;
      pexipro2.this.AV77RecSalVol = GXv_int6[0] ;
      pexipro2.this.AV17TotKil = GXv_decimal9[0] ;
   }

   public void S141( )
   {
      /* 'ACTHDR' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P010N7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV22BarCodReo), AV23BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
   }

   public void S151( )
   {
      /* 'MAQAM' Routine */
      returnInSub = false ;
      GXt_char7 = AV86TERMICOD ;
      GXv_char17[0] = GXt_char7 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char17) ;
      pexipro2.this.GXt_char7 = GXv_char17[0] ;
      AV86TERMICOD = GXt_char7 ;
      /* Using cursor P010N8 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV86TERMICOD, Integer.valueOf(AV21BarCod), Byte.valueOf(AV22BarCodReo), AV23BarCodPar, Short.valueOf(AV52RecLinMaq)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A2794BarLinMaq = P010N8_A2794BarLinMaq[0] ;
         A130BarCodPar = P010N8_A130BarCodPar[0] ;
         A132BarCodReo = P010N8_A132BarCodReo[0] ;
         A129BarCod = P010N8_A129BarCod[0] ;
         A2792TermiCod = P010N8_A2792TermiCod[0] ;
         A2795BarMaqPrf = P010N8_A2795BarMaqPrf[0] ;
         n2795BarMaqPrf = P010N8_n2795BarMaqPrf[0] ;
         A8935BarSalM = P010N8_A8935BarSalM[0] ;
         n8935BarSalM = P010N8_n8935BarSalM[0] ;
         AV87BARMAQPRF = A2795BarMaqPrf ;
         AV96BarSalm = A8935BarSalM ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      /* Execute user subroutine: 'MAQUIN' */
      S161 ();
      if (returnInSub) return;
   }

   public void S161( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV88MaqTipmaq = httpContext.getMessage( "N", "") ;
      /* Using cursor P010N9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV87BARMAQPRF});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A602MaqCod = P010N9_A602MaqCod[0] ;
         A3601MaqTipMaq = P010N9_A3601MaqTipMaq[0] ;
         n3601MaqTipMaq = P010N9_n3601MaqTipMaq[0] ;
         AV88MaqTipmaq = A3601MaqTipMaq ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S131( )
   {
      /* 'DENSIDAD' Routine */
      returnInSub = false ;
      AV89PRDDENSS = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P010N10 */
      pr_default.execute(8, new Object[] {A396EmprCod, AV37PrdNum});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A719PrdNum = P010N10_A719PrdNum[0] ;
         n719PrdNum = P010N10_n719PrdNum[0] ;
         A5416PrdDensS = P010N10_A5416PrdDensS[0] ;
         AV89PRDDENSS = A5416PrdDensS ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S171( )
   {
      /* 'HDR' Routine */
      returnInSub = false ;
      /* Using cursor P010N12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV22BarCodReo), AV23BarCodPar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A130BarCodPar = P010N12_A130BarCodPar[0] ;
         A132BarCodReo = P010N12_A132BarCodReo[0] ;
         A129BarCod = P010N12_A129BarCod[0] ;
         A127BarAncCru1 = P010N12_A127BarAncCru1[0] ;
         A184BarMtr = P010N12_A184BarMtr[0] ;
         n184BarMtr = P010N12_n184BarMtr[0] ;
         A184BarMtr = P010N12_A184BarMtr[0] ;
         n184BarMtr = P010N12_n184BarMtr[0] ;
         AV105BarMtr = A184BarMtr ;
         AV106BarAncCru1 = A127BarAncCru1 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexipro2.this.A396EmprCod;
      this.aP1[0] = pexipro2.this.AV67PrdNumPaso;
      this.aP2[0] = pexipro2.this.AV15Cantidad;
      this.aP3[0] = pexipro2.this.AV16UniMed;
      this.aP4[0] = pexipro2.this.AV17TotKil;
      this.aP5[0] = pexipro2.this.AV18BarVol;
      this.aP6[0] = pexipro2.this.AV19ValCos;
      this.aP7[0] = pexipro2.this.AV20LinRec;
      this.aP8[0] = pexipro2.this.AV21BarCod;
      this.aP9[0] = pexipro2.this.AV22BarCodReo;
      this.aP10[0] = pexipro2.this.AV23BarCodPar;
      this.aP11[0] = pexipro2.this.AV25Flag1;
      this.aP12[0] = pexipro2.this.AV26Flag2;
      this.aP13[0] = pexipro2.this.AV27UltRecLin;
      this.aP14[0] = pexipro2.this.AV28Linea;
      this.aP15[0] = pexipro2.this.AV29ExiCon;
      this.aP16[0] = pexipro2.this.AV30FlagComp;
      this.aP17[0] = pexipro2.this.AV51ProForNro;
      this.aP18[0] = pexipro2.this.AV52RecLinMaq;
      this.aP19[0] = pexipro2.this.AV54TanqueN;
      this.aP20[0] = pexipro2.this.AV56ProForDes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pexipro2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV102Station = "" ;
      AV104Emprnom = "" ;
      AV103Usurcod = "" ;
      AV31CanTeo = DecimalUtil.ZERO ;
      AV105BarMtr = DecimalUtil.ZERO ;
      AV47PrdCanFin = DecimalUtil.ZERO ;
      AV48PrdCanAny = DecimalUtil.ZERO ;
      AV99Prdsal = "" ;
      scmdbuf = "" ;
      P010N2_A396EmprCod = new String[] {""} ;
      P010N2_A719PrdNum = new String[] {""} ;
      P010N2_n719PrdNum = new boolean[] {false} ;
      P010N2_A11718PrdAltCam = new byte[1] ;
      P010N2_A680PrdAltNum = new String[] {""} ;
      A719PrdNum = "" ;
      A680PrdAltNum = "" ;
      P010N3_A396EmprCod = new String[] {""} ;
      P010N3_A719PrdNum = new String[] {""} ;
      P010N3_n719PrdNum = new boolean[] {false} ;
      P010N3_A11718PrdAltCam = new byte[1] ;
      P010N3_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010N3_A680PrdAltNum = new String[] {""} ;
      P010N3_A679PrdAltNom = new String[] {""} ;
      P010N3_n679PrdAltNom = new boolean[] {false} ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A679PrdAltNom = "" ;
      AV33CanRec = DecimalUtil.ZERO ;
      AV37PrdNum = "" ;
      AV38PrdNom = "" ;
      AV113Inc_obs = "" ;
      AV122Pgmname = "" ;
      P010N4_A396EmprCod = new String[] {""} ;
      P010N4_A719PrdNum = new String[] {""} ;
      P010N4_n719PrdNum = new boolean[] {false} ;
      P010N4_A718PrdNom = new String[] {""} ;
      P010N4_A8936PrdSal = new String[] {""} ;
      P010N4_A1643PrdTip = new String[] {""} ;
      P010N4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010N4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010N4_A856ValCod = new byte[1] ;
      P010N4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010N4_A8895PrdAltAct = new byte[1] ;
      P010N4_n8895PrdAltAct = new boolean[] {false} ;
      P010N4_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A718PrdNom = "" ;
      A8936PrdSal = "" ;
      A1643PrdTip = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      AV69PrdNomPaso = "" ;
      AV107Prdtip = "" ;
      AV91Existencia = DecimalUtil.ZERO ;
      AV70PrdNum2 = "" ;
      AV45Comp = "" ;
      AV32ExiRes = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV94CanTeo2 = DecimalUtil.ZERO ;
      AV95Cantidad2 = DecimalUtil.ZERO ;
      P010N5_A396EmprCod = new String[] {""} ;
      P010N5_A719PrdNum = new String[] {""} ;
      P010N5_n719PrdNum = new boolean[] {false} ;
      P010N5_A680PrdAltNum = new String[] {""} ;
      P010N5_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010N5_A679PrdAltNom = new String[] {""} ;
      P010N5_n679PrdAltNom = new boolean[] {false} ;
      AV88MaqTipmaq = "" ;
      AV96BarSalm = "" ;
      GXv_char4 = new String[1] ;
      GXv_int11 = new byte[1] ;
      AV98Recacc = "" ;
      GXv_int2 = new byte[1] ;
      AV101Texto_i = "" ;
      AV110Prdlote = "" ;
      AV116Prdnom2 = "" ;
      GXv_char5 = new String[1] ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A431FacCon = DecimalUtil.ZERO ;
      AV89PRDDENSS = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A5527RecLinRea = "" ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A8937RecAcc = "" ;
      A5725RecLote = "" ;
      A12641RecPrdDc2 = "" ;
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      GXv_char15 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int12 = new int[1] ;
      GXv_int18 = new short[1] ;
      GXv_int6 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV86TERMICOD = "" ;
      GXt_char7 = "" ;
      GXv_char17 = new String[1] ;
      P010N8_A396EmprCod = new String[] {""} ;
      P010N8_A2794BarLinMaq = new short[1] ;
      P010N8_A130BarCodPar = new String[] {""} ;
      P010N8_A132BarCodReo = new byte[1] ;
      P010N8_A129BarCod = new int[1] ;
      P010N8_A2792TermiCod = new String[] {""} ;
      P010N8_A2795BarMaqPrf = new String[] {""} ;
      P010N8_n2795BarMaqPrf = new boolean[] {false} ;
      P010N8_A8935BarSalM = new String[] {""} ;
      P010N8_n8935BarSalM = new boolean[] {false} ;
      A2792TermiCod = "" ;
      A2795BarMaqPrf = "" ;
      A8935BarSalM = "" ;
      AV87BARMAQPRF = "" ;
      P010N9_A396EmprCod = new String[] {""} ;
      P010N9_A602MaqCod = new String[] {""} ;
      P010N9_A3601MaqTipMaq = new String[] {""} ;
      P010N9_n3601MaqTipMaq = new boolean[] {false} ;
      A602MaqCod = "" ;
      A3601MaqTipMaq = "" ;
      P010N10_A396EmprCod = new String[] {""} ;
      P010N10_A719PrdNum = new String[] {""} ;
      P010N10_n719PrdNum = new boolean[] {false} ;
      P010N10_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      P010N12_A396EmprCod = new String[] {""} ;
      P010N12_A130BarCodPar = new String[] {""} ;
      P010N12_A132BarCodReo = new byte[1] ;
      P010N12_A129BarCod = new int[1] ;
      P010N12_A127BarAncCru1 = new short[1] ;
      P010N12_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010N12_n184BarMtr = new boolean[] {false} ;
      A184BarMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexipro2__default(),
         new Object[] {
             new Object[] {
            P010N2_A396EmprCod, P010N2_A719PrdNum, P010N2_A11718PrdAltCam, P010N2_A680PrdAltNum
            }
            , new Object[] {
            P010N3_A396EmprCod, P010N3_A719PrdNum, P010N3_A11718PrdAltCam, P010N3_A678PrdAltFac, P010N3_A680PrdAltNum, P010N3_A679PrdAltNom, P010N3_n679PrdAltNom
            }
            , new Object[] {
            P010N4_A396EmprCod, P010N4_A719PrdNum, P010N4_A718PrdNom, P010N4_A8936PrdSal, P010N4_A1643PrdTip, P010N4_A704PrdExiAlm, P010N4_A705PrdExiCC, P010N4_A856ValCod, P010N4_A685PrdCanRes, P010N4_A8895PrdAltAct,
            P010N4_n8895PrdAltAct, P010N4_A732PrdStkMinU
            }
            , new Object[] {
            P010N5_A396EmprCod, P010N5_A719PrdNum, P010N5_A680PrdAltNum, P010N5_A678PrdAltFac, P010N5_A679PrdAltNom, P010N5_n679PrdAltNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P010N8_A396EmprCod, P010N8_A2794BarLinMaq, P010N8_A130BarCodPar, P010N8_A132BarCodReo, P010N8_A129BarCod, P010N8_A2792TermiCod, P010N8_A2795BarMaqPrf, P010N8_n2795BarMaqPrf, P010N8_A8935BarSalM, P010N8_n8935BarSalM
            }
            , new Object[] {
            P010N9_A396EmprCod, P010N9_A602MaqCod, P010N9_A3601MaqTipMaq, P010N9_n3601MaqTipMaq
            }
            , new Object[] {
            P010N10_A396EmprCod, P010N10_A719PrdNum, P010N10_A5416PrdDensS
            }
            , new Object[] {
            P010N12_A396EmprCod, P010N12_A130BarCodPar, P010N12_A132BarCodReo, P010N12_A129BarCod, P010N12_A127BarAncCru1, P010N12_A184BarMtr, P010N12_n184BarMtr
            }
         }
      );
      AV122Pgmname = "PEXIPRO2" ;
      /* GeneXus formulas. */
      AV122Pgmname = "PEXIPRO2" ;
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
   private byte AV55FlagHSS ;
   private byte AV57FlagMab ;
   private byte AV78Pizarro ;
   private byte AV84Jpf ;
   private byte AV85MaqAm ;
   private byte AV92PrdAlS ;
   private byte AV90Consumos ;
   private byte AV108Validez12 ;
   private byte AV109carvema ;
   private byte AV111Forzar ;
   private byte AV114Lote01 ;
   private byte AV117Etm ;
   private byte AV66FlagValCod ;
   private byte A11718PrdAltCam ;
   private byte A856ValCod ;
   private byte A8895PrdAltAct ;
   private byte AV100Valcod ;
   private byte AV65FlagExis2 ;
   private byte AV64FlagExis1 ;
   private byte AV93BuscoAlt ;
   private byte GXt_int1 ;
   private byte AV71FlagExis3 ;
   private byte AV83ProdRep ;
   private byte GXv_int11[] ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private byte GXv_int16[] ;
   private short AV20LinRec ;
   private short AV27UltRecLin ;
   private short AV52RecLinMaq ;
   private short AV106BarAncCru1 ;
   private short AV112Numveces ;
   private short AV68RecAnyTie ;
   private short AV76RecSalmP ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A5422RecSalMP ;
   private short Gx_err ;
   private short GXv_int13[] ;
   private short GXv_int18[] ;
   private short A2794BarLinMaq ;
   private short A127BarAncCru1 ;
   private int AV18BarVol ;
   private int AV19ValCos ;
   private int AV21BarCod ;
   private int AV97ValSal ;
   private int GXt_int3 ;
   private int AV77RecSalVol ;
   private int AV115PrvNum ;
   private int GX_INS410 ;
   private int A129BarCod ;
   private int A5467RecSalVol ;
   private int A11708RecProv ;
   private int A12717RecFabId ;
   private int GXv_int14[] ;
   private int GXv_int12[] ;
   private int GXv_int6[] ;
   private java.math.BigDecimal AV15Cantidad ;
   private java.math.BigDecimal AV17TotKil ;
   private java.math.BigDecimal AV31CanTeo ;
   private java.math.BigDecimal AV105BarMtr ;
   private java.math.BigDecimal AV47PrdCanFin ;
   private java.math.BigDecimal AV48PrdCanAny ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal AV33CanRec ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal AV91Existencia ;
   private java.math.BigDecimal AV32ExiRes ;
   private java.math.BigDecimal AV94CanTeo2 ;
   private java.math.BigDecimal AV95Cantidad2 ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal AV89PRDDENSS ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A4900PrdCanMac ;
   private java.math.BigDecimal A12710PrdCantOrg ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String AV67PrdNumPaso ;
   private String AV23BarCodPar ;
   private String AV56ProForDes ;
   private String AV102Station ;
   private String AV104Emprnom ;
   private String AV103Usurcod ;
   private String AV99Prdsal ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String AV37PrdNum ;
   private String AV38PrdNom ;
   private String AV122Pgmname ;
   private String A718PrdNom ;
   private String A8936PrdSal ;
   private String A1643PrdTip ;
   private String AV69PrdNomPaso ;
   private String AV107Prdtip ;
   private String AV70PrdNum2 ;
   private String AV45Comp ;
   private String Gx_msg ;
   private String AV88MaqTipmaq ;
   private String AV96BarSalm ;
   private String GXv_char4[] ;
   private String AV98Recacc ;
   private String AV110Prdlote ;
   private String AV116Prdnom2 ;
   private String GXv_char5[] ;
   private String A130BarCodPar ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A4576RecLinUsr ;
   private String A5527RecLinRea ;
   private String A8937RecAcc ;
   private String A5725RecLote ;
   private String A12641RecPrdDc2 ;
   private String Gx_emsg ;
   private String GXv_char15[] ;
   private String GXv_char8[] ;
   private String AV86TERMICOD ;
   private String GXt_char7 ;
   private String GXv_char17[] ;
   private String A2792TermiCod ;
   private String A2795BarMaqPrf ;
   private String A8935BarSalM ;
   private String AV87BARMAQPRF ;
   private String A602MaqCod ;
   private String A3601MaqTipMaq ;
   private java.util.Date A4577RecPesFec ;
   private boolean returnInSub ;
   private boolean n719PrdNum ;
   private boolean n679PrdAltNom ;
   private boolean n8895PrdAltAct ;
   private boolean n490ForPrdUMe ;
   private boolean n2795BarMaqPrf ;
   private boolean n8935BarSalM ;
   private boolean n3601MaqTipMaq ;
   private boolean n184BarMtr ;
   private String AV101Texto_i ;
   private String AV113Inc_obs ;
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
   private String[] P010N2_A396EmprCod ;
   private String[] P010N2_A719PrdNum ;
   private boolean[] P010N2_n719PrdNum ;
   private byte[] P010N2_A11718PrdAltCam ;
   private String[] P010N2_A680PrdAltNum ;
   private String[] P010N3_A396EmprCod ;
   private String[] P010N3_A719PrdNum ;
   private boolean[] P010N3_n719PrdNum ;
   private byte[] P010N3_A11718PrdAltCam ;
   private java.math.BigDecimal[] P010N3_A678PrdAltFac ;
   private String[] P010N3_A680PrdAltNum ;
   private String[] P010N3_A679PrdAltNom ;
   private boolean[] P010N3_n679PrdAltNom ;
   private String[] P010N4_A396EmprCod ;
   private String[] P010N4_A719PrdNum ;
   private boolean[] P010N4_n719PrdNum ;
   private String[] P010N4_A718PrdNom ;
   private String[] P010N4_A8936PrdSal ;
   private String[] P010N4_A1643PrdTip ;
   private java.math.BigDecimal[] P010N4_A704PrdExiAlm ;
   private java.math.BigDecimal[] P010N4_A705PrdExiCC ;
   private byte[] P010N4_A856ValCod ;
   private java.math.BigDecimal[] P010N4_A685PrdCanRes ;
   private byte[] P010N4_A8895PrdAltAct ;
   private boolean[] P010N4_n8895PrdAltAct ;
   private java.math.BigDecimal[] P010N4_A732PrdStkMinU ;
   private String[] P010N5_A396EmprCod ;
   private String[] P010N5_A719PrdNum ;
   private boolean[] P010N5_n719PrdNum ;
   private String[] P010N5_A680PrdAltNum ;
   private java.math.BigDecimal[] P010N5_A678PrdAltFac ;
   private String[] P010N5_A679PrdAltNom ;
   private boolean[] P010N5_n679PrdAltNom ;
   private String[] P010N8_A396EmprCod ;
   private short[] P010N8_A2794BarLinMaq ;
   private String[] P010N8_A130BarCodPar ;
   private byte[] P010N8_A132BarCodReo ;
   private int[] P010N8_A129BarCod ;
   private String[] P010N8_A2792TermiCod ;
   private String[] P010N8_A2795BarMaqPrf ;
   private boolean[] P010N8_n2795BarMaqPrf ;
   private String[] P010N8_A8935BarSalM ;
   private boolean[] P010N8_n8935BarSalM ;
   private String[] P010N9_A396EmprCod ;
   private String[] P010N9_A602MaqCod ;
   private String[] P010N9_A3601MaqTipMaq ;
   private boolean[] P010N9_n3601MaqTipMaq ;
   private String[] P010N10_A396EmprCod ;
   private String[] P010N10_A719PrdNum ;
   private boolean[] P010N10_n719PrdNum ;
   private java.math.BigDecimal[] P010N10_A5416PrdDensS ;
   private String[] P010N12_A396EmprCod ;
   private String[] P010N12_A130BarCodPar ;
   private byte[] P010N12_A132BarCodReo ;
   private int[] P010N12_A129BarCod ;
   private short[] P010N12_A127BarAncCru1 ;
   private java.math.BigDecimal[] P010N12_A184BarMtr ;
   private boolean[] P010N12_n184BarMtr ;
}

final  class pexipro2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P010N2", "SELECT EmprCod, PrdNum, PrdAltCam, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P010N3", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdAltCam, T1.PrdAltFac, T1.PrdAltNum, COALESCE( T2.PrdNom, ' ') AS PrdAltNom FROM (TXPPRDALT T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P010N4", "SELECT EmprCod, PrdNum, PrdNom, PrdSal, PrdTip, PrdExiAlm, PrdExiCC, ValCod, PrdCanRes, PrdAltAct, PrdStkMinU FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P010N5", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdAltNum, T1.PrdAltFac, COALESCE( T2.PrdNom, ' ') AS PrdAltNom FROM (TXPPRDALT T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P010N6", "INSERT INTO TXPLRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, PrdNum, RecPrdNum, RecPrdDsc, ForPrdUMe, FacCon, PrdCant, PrdCanFin, PrdCanAny, RecForNro, RecPrdTnq, RecMar, RecLinUsr, RecPesFec, RecSalMP, RecSalVol, RecLinRea, RecLote, RecAcc, PrdCanMac, RecProv, RecPrdDc2, PrdCantOrg, RecFabId, RecCanEns, RecPes, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, RecLotAlm, RecLoteFch, RecManAut) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P010N7", "UPDATE TXPBARCAD SET BarInci=9  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P010N8", "SELECT EmprCod, BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, BarMaqPrf, BarSalM FROM TXPBARMAQ WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P010N9", "SELECT EmprCod, MaqCod, MaqTipMaq FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P010N10", "SELECT EmprCod, PrdNum, PrdDensS FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P010N12", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAncCru1, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               return;
      }
   }

}

