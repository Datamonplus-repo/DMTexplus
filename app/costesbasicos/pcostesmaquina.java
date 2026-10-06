package app.costesbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcostesmaquina extends GXProcedure
{
   public pcostesmaquina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcostesmaquina.class ), "" );
   }

   public pcostesmaquina( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 ,
                                           String aP4 ,
                                           short aP5 ,
                                           byte aP6 ,
                                           byte aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           java.math.BigDecimal[] aP9 ,
                                           java.math.BigDecimal[] aP10 ,
                                           String[] aP11 ,
                                           String[] aP12 ,
                                           java.math.BigDecimal[] aP13 ,
                                           short[] aP14 ,
                                           java.math.BigDecimal[] aP15 ,
                                           java.math.BigDecimal[] aP16 ,
                                           java.math.BigDecimal[] aP17 ,
                                           java.math.BigDecimal[] aP18 ,
                                           java.math.BigDecimal[] aP19 ,
                                           java.math.BigDecimal[] aP20 ,
                                           java.math.BigDecimal[] aP21 ,
                                           java.math.BigDecimal[] aP22 ,
                                           java.math.BigDecimal[] aP23 ,
                                           java.math.BigDecimal[] aP24 ,
                                           java.math.BigDecimal[] aP25 ,
                                           java.math.BigDecimal[] aP26 ,
                                           java.math.BigDecimal[] aP27 ,
                                           int[] aP28 ,
                                           byte[] aP29 )
   {
      pcostesmaquina.this.aP30 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30);
      return aP30[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        byte aP6 ,
                        byte aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        short[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        java.math.BigDecimal[] aP17 ,
                        java.math.BigDecimal[] aP18 ,
                        java.math.BigDecimal[] aP19 ,
                        java.math.BigDecimal[] aP20 ,
                        java.math.BigDecimal[] aP21 ,
                        java.math.BigDecimal[] aP22 ,
                        java.math.BigDecimal[] aP23 ,
                        java.math.BigDecimal[] aP24 ,
                        java.math.BigDecimal[] aP25 ,
                        java.math.BigDecimal[] aP26 ,
                        java.math.BigDecimal[] aP27 ,
                        int[] aP28 ,
                        byte[] aP29 ,
                        java.math.BigDecimal[] aP30 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             byte aP6 ,
                             byte aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             short[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             java.math.BigDecimal[] aP19 ,
                             java.math.BigDecimal[] aP20 ,
                             java.math.BigDecimal[] aP21 ,
                             java.math.BigDecimal[] aP22 ,
                             java.math.BigDecimal[] aP23 ,
                             java.math.BigDecimal[] aP24 ,
                             java.math.BigDecimal[] aP25 ,
                             java.math.BigDecimal[] aP26 ,
                             java.math.BigDecimal[] aP27 ,
                             int[] aP28 ,
                             byte[] aP29 ,
                             java.math.BigDecimal[] aP30 )
   {
      pcostesmaquina.this.AV8EmprCod = aP0;
      pcostesmaquina.this.AV9BarCod = aP1;
      pcostesmaquina.this.AV10BarCodReo = aP2;
      pcostesmaquina.this.AV11BarCodPar = aP3;
      pcostesmaquina.this.AV110procod = aP4;
      pcostesmaquina.this.AV15BarOrdLin = aP5;
      pcostesmaquina.this.AV80CosTiR = aP6;
      pcostesmaquina.this.AV73reoperados = aP7;
      pcostesmaquina.this.aP8 = aP8;
      pcostesmaquina.this.aP9 = aP9;
      pcostesmaquina.this.aP10 = aP10;
      pcostesmaquina.this.aP11 = aP11;
      pcostesmaquina.this.aP12 = aP12;
      pcostesmaquina.this.aP13 = aP13;
      pcostesmaquina.this.aP14 = aP14;
      pcostesmaquina.this.aP15 = aP15;
      pcostesmaquina.this.aP16 = aP16;
      pcostesmaquina.this.aP17 = aP17;
      pcostesmaquina.this.aP18 = aP18;
      pcostesmaquina.this.aP19 = aP19;
      pcostesmaquina.this.aP20 = aP20;
      pcostesmaquina.this.aP21 = aP21;
      pcostesmaquina.this.aP22 = aP22;
      pcostesmaquina.this.aP23 = aP23;
      pcostesmaquina.this.aP24 = aP24;
      pcostesmaquina.this.aP25 = aP25;
      pcostesmaquina.this.aP26 = aP26;
      pcostesmaquina.this.aP27 = aP27;
      pcostesmaquina.this.aP28 = aP28;
      pcostesmaquina.this.aP29 = aP29;
      pcostesmaquina.this.aP30 = aP30;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV109TasasEstandar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TASSTD", ""), GXv_int2) ;
      pcostesmaquina.this.GXt_int1 = GXv_int2[0] ;
      AV109TasasEstandar = GXt_int1 ;
      GXt_int3 = AV113valorTasasEstandar ;
      GXv_char4[0] = AV8EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "TASSTD", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pcostesmaquina.this.AV8EmprCod = GXv_char4[0] ;
      pcostesmaquina.this.GXt_int3 = GXv_int6[0] ;
      AV113valorTasasEstandar = (byte)(GXt_int3) ;
      /* Using cursor P0ATK3 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar, AV110procod, Short.valueOf(AV15BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P0ATK3_A194BarOrdLin[0] ;
         A758ProCod = P0ATK3_A758ProCod[0] ;
         A130BarCodPar = P0ATK3_A130BarCodPar[0] ;
         A132BarCodReo = P0ATK3_A132BarCodReo[0] ;
         A129BarCod = P0ATK3_A129BarCod[0] ;
         A396EmprCod = P0ATK3_A396EmprCod[0] ;
         A457FasCod = P0ATK3_A457FasCod[0] ;
         A603MaqCodBis = P0ATK3_A603MaqCodBis[0] ;
         A4443BarFasDTF = P0ATK3_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0ATK3_n4443BarFasDTF[0] ;
         A460FasDsc = P0ATK3_A460FasDsc[0] ;
         A228BarUniMed = P0ATK3_A228BarUniMed[0] ;
         A3837BarFasKgm = P0ATK3_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0ATK3_n3837BarFasKgm[0] ;
         A5719BarFasKgT = P0ATK3_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P0ATK3_n5719BarFasKgT[0] ;
         A6173BarFasSec = P0ATK3_A6173BarFasSec[0] ;
         n6173BarFasSec = P0ATK3_n6173BarFasSec[0] ;
         A5168FasPreMC = P0ATK3_A5168FasPreMC[0] ;
         n5168FasPreMC = P0ATK3_n5168FasPreMC[0] ;
         A215BarTieRea = P0ATK3_A215BarTieRea[0] ;
         A5720BarFasMtT = P0ATK3_A5720BarFasMtT[0] ;
         n5720BarFasMtT = P0ATK3_n5720BarFasMtT[0] ;
         A3838BarFasMtr = P0ATK3_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0ATK3_n3838BarFasMtr[0] ;
         A216BarTieTeo = P0ATK3_A216BarTieTeo[0] ;
         A252CliCod = P0ATK3_A252CliCod[0] ;
         n252CliCod = P0ATK3_n252CliCod[0] ;
         A212BarSer = P0ATK3_A212BarSer[0] ;
         A135BarColNom = P0ATK3_A135BarColNom[0] ;
         A136BarColNum = P0ATK3_A136BarColNum[0] ;
         A218BarTipCol = P0ATK3_A218BarTipCol[0] ;
         A217BarTipArt = P0ATK3_A217BarTipArt[0] ;
         n217BarTipArt = P0ATK3_n217BarTipArt[0] ;
         A150BarFacTin = P0ATK3_A150BarFacTin[0] ;
         A165BarHorIni = P0ATK3_A165BarHorIni[0] ;
         A164BarHorFin = P0ATK3_A164BarHorFin[0] ;
         A166BarKgm = P0ATK3_A166BarKgm[0] ;
         A184BarMtr = P0ATK3_A184BarMtr[0] ;
         A228BarUniMed = P0ATK3_A228BarUniMed[0] ;
         A252CliCod = P0ATK3_A252CliCod[0] ;
         n252CliCod = P0ATK3_n252CliCod[0] ;
         A212BarSer = P0ATK3_A212BarSer[0] ;
         A135BarColNom = P0ATK3_A135BarColNom[0] ;
         A136BarColNum = P0ATK3_A136BarColNum[0] ;
         A218BarTipCol = P0ATK3_A218BarTipCol[0] ;
         A217BarTipArt = P0ATK3_A217BarTipArt[0] ;
         n217BarTipArt = P0ATK3_n217BarTipArt[0] ;
         A166BarKgm = P0ATK3_A166BarKgm[0] ;
         A184BarMtr = P0ATK3_A184BarMtr[0] ;
         A460FasDsc = P0ATK3_A460FasDsc[0] ;
         A5168FasPreMC = P0ATK3_A5168FasPreMC[0] ;
         n5168FasPreMC = P0ATK3_n5168FasPreMC[0] ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int2[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int7[0] = A194BarOrdLin ;
         GXv_int8[0] = AV12Lhipro ;
         new app.prgtolhipro(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int2, GXv_char4, GXv_int7, GXv_int8) ;
         pcostesmaquina.this.A396EmprCod = GXv_char5[0] ;
         pcostesmaquina.this.A129BarCod = GXv_int6[0] ;
         pcostesmaquina.this.A132BarCodReo = GXv_int2[0] ;
         pcostesmaquina.this.A130BarCodPar = GXv_char4[0] ;
         pcostesmaquina.this.A194BarOrdLin = GXv_int7[0] ;
         pcostesmaquina.this.AV12Lhipro = GXv_int8[0] ;
         /* Execute user subroutine: 'COSTEOPERARIO' */
         S141 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV13fascod = A457FasCod ;
         AV14MaqCod = A603MaqCodBis ;
         AV111MqCAnyo = (short)(GXutil.year( A4443BarFasDTF)) ;
         AV112MqCmes = (byte)(GXutil.month( A4443BarFasDTF)) ;
         AV16FasDsc = A460FasDsc ;
         AV17BarUniMed = A228BarUniMed ;
         AV18Kgm = A166BarKgm ;
         AV19Mtr = A184BarMtr ;
         AV20Barfaskgm = A3837BarFasKgm ;
         AV21Barfaskgt = A5719BarFasKgT ;
         AV22BarFasSec = A6173BarFasSec ;
         AV23FasPreMC = A5168FasPreMC ;
         AV25CosPrd = DecimalUtil.doubleToDec(0) ;
         AV26cosprd1 = DecimalUtil.doubleToDec(0) ;
         AV39Coste_m = DecimalUtil.doubleToDec(0) ;
         AV28CostAgua = DecimalUtil.doubleToDec(0) ;
         AV91Costenergia = DecimalUtil.doubleToDec(0) ;
         AV78Costgas = DecimalUtil.doubleToDec(0) ;
         AV81Costmod = DecimalUtil.doubleToDec(0) ;
         AV82Costmoi = DecimalUtil.doubleToDec(0) ;
         AV79Costgi = DecimalUtil.doubleToDec(0) ;
         AV27Costadc = DecimalUtil.doubleToDec(0) ;
         AV29Costam = DecimalUtil.doubleToDec(0) ;
         AV41Coste_mAgua = DecimalUtil.doubleToDec(0) ;
         AV43Coste_menergia = DecimalUtil.doubleToDec(0) ;
         AV44Coste_mgas = DecimalUtil.doubleToDec(0) ;
         AV46Coste_mmod = DecimalUtil.doubleToDec(0) ;
         AV47Coste_mmoi = DecimalUtil.doubleToDec(0) ;
         AV45Coste_mgi = DecimalUtil.doubleToDec(0) ;
         AV40Coste_madc = DecimalUtil.doubleToDec(0) ;
         AV42Coste_mam = DecimalUtil.doubleToDec(0) ;
         AV63MaqCosMin = DecimalUtil.doubleToDec(0) ;
         GXt_char9 = AV64maqDsc ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = AV14MaqCod ;
         GXv_char10[0] = GXt_char9 ;
         new app.pmaqdsc(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char10) ;
         pcostesmaquina.this.A396EmprCod = GXv_char5[0] ;
         pcostesmaquina.this.AV14MaqCod = GXv_char4[0] ;
         pcostesmaquina.this.GXt_char9 = GXv_char10[0] ;
         AV64maqDsc = GXt_char9 ;
         AV65MaqMOD = DecimalUtil.doubleToDec(0) ;
         AV66MaqMOI = DecimalUtil.doubleToDec(0) ;
         AV67MaqEnerg = DecimalUtil.doubleToDec(0) ;
         AV68MaqGas = DecimalUtil.doubleToDec(0) ;
         AV69MaqAgua = DecimalUtil.doubleToDec(0) ;
         AV70MaqGI = DecimalUtil.doubleToDec(0) ;
         AV71MaqAdCent = DecimalUtil.doubleToDec(0) ;
         AV72MaqAmort = DecimalUtil.doubleToDec(0) ;
         if ( ( ( AV12Lhipro == 1 ) && ( AV73reoperados == 1 ) ) || ( (0==AV73reoperados) ) )
         {
            /* Execute user subroutine: 'COSMIN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( AV80CosTiR == 0 )
         {
            AV85Min = (byte)(DecimalUtil.decToDouble((A215BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
            AV86Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV85Min) ;
            AV84BarTieRea = A215BarTieRea ;
         }
         else
         {
            /* Execute user subroutine: 'TIEREA' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV84BarTieRea = DecimalUtil.doubleToDec(GXutil.Int( AV86Tiempo_m/ (double) (60))+(AV86Tiempo_m-(GXutil.Int( AV86Tiempo_m/ (double) (60))*60))/ (double) (100)) ;
         }
         AV26cosprd1 = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV86Tiempo_m).multiply(AV63MaqCosMin)), 2) ;
         AV28CostAgua = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV86Tiempo_m).multiply(AV69MaqAgua)), 2) ;
         AV91Costenergia = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV86Tiempo_m).multiply(AV67MaqEnerg)), 2) ;
         AV78Costgas = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV86Tiempo_m).multiply(AV68MaqGas)), 2) ;
         AV81Costmod = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV86Tiempo_m).multiply(AV65MaqMOD)), 2) ;
         AV82Costmoi = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV86Tiempo_m).multiply(AV66MaqMOI)), 2) ;
         AV79Costgi = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV86Tiempo_m).multiply(AV70MaqGI)), 2) ;
         AV27Costadc = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV86Tiempo_m).multiply(AV71MaqAdCent)), 2) ;
         AV29Costam = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV86Tiempo_m).multiply(AV72MaqAmort)), 2) ;
         if ( GXutil.strcmp(GXutil.trim( AV102TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            if ( GXutil.strcmp(AV17BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV39Coste_m = GXutil.roundDecimal( (AV63MaqCosMin.multiply(AV18Kgm)), 2) ;
               AV41Coste_mAgua = GXutil.roundDecimal( (AV69MaqAgua.multiply(AV18Kgm)), 2) ;
               AV43Coste_menergia = GXutil.roundDecimal( (AV67MaqEnerg.multiply(AV18Kgm)), 2) ;
               AV44Coste_mgas = GXutil.roundDecimal( (AV68MaqGas.multiply(AV18Kgm)), 2) ;
               AV46Coste_mmod = GXutil.roundDecimal( (AV65MaqMOD.multiply(AV18Kgm)), 2) ;
               AV47Coste_mmoi = GXutil.roundDecimal( (AV66MaqMOI.multiply(AV18Kgm)), 2) ;
               AV45Coste_mgi = GXutil.roundDecimal( (AV70MaqGI.multiply(AV18Kgm)), 2) ;
               AV40Coste_madc = GXutil.roundDecimal( (AV71MaqAdCent.multiply(AV18Kgm)), 2) ;
               AV42Coste_mam = GXutil.roundDecimal( (AV72MaqAmort.multiply(AV18Kgm)), 2) ;
            }
            else
            {
               AV39Coste_m = GXutil.roundDecimal( (AV63MaqCosMin.multiply(AV19Mtr)), 2) ;
               AV41Coste_mAgua = GXutil.roundDecimal( (AV69MaqAgua.multiply(AV19Mtr)), 2) ;
               AV43Coste_menergia = GXutil.roundDecimal( (AV67MaqEnerg.multiply(AV19Mtr)), 2) ;
               AV44Coste_mgas = GXutil.roundDecimal( (AV68MaqGas.multiply(AV19Mtr)), 2) ;
               AV46Coste_mmod = GXutil.roundDecimal( (AV65MaqMOD.multiply(AV19Mtr)), 2) ;
               AV47Coste_mmoi = GXutil.roundDecimal( (AV66MaqMOI.multiply(AV19Mtr)), 2) ;
               AV45Coste_mgi = GXutil.roundDecimal( (AV70MaqGI.multiply(AV19Mtr)), 2) ;
               AV40Coste_madc = GXutil.roundDecimal( (AV71MaqAdCent.multiply(AV19Mtr)), 2) ;
               AV42Coste_mam = GXutil.roundDecimal( (AV72MaqAmort.multiply(AV19Mtr)), 2) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV17BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A5719BarFasKgT.doubleValue() > 0 )
               {
                  AV39Coste_m = (AV26cosprd1.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV41Coste_mAgua = (AV28CostAgua.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV43Coste_menergia = (AV91Costenergia.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV44Coste_mgas = (AV78Costgas.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV46Coste_mmod = (AV81Costmod.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV47Coste_mmoi = (AV82Costmoi.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV45Coste_mgi = (AV79Costgi.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV40Coste_madc = (AV27Costadc.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV42Coste_mam = (AV29Costam.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV104Unidades = A3837BarFasKgm ;
                  AV105Unidadest = A5719BarFasKgT ;
               }
               else
               {
                  if ( AV18Kgm.doubleValue() > 0 )
                  {
                     AV39Coste_m = (AV26cosprd1.multiply(AV18Kgm)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV41Coste_mAgua = (AV28CostAgua.multiply(AV18Kgm)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV43Coste_menergia = (AV91Costenergia.multiply(AV18Kgm)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV44Coste_mgas = (AV78Costgas.multiply(AV18Kgm)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV46Coste_mmod = (AV81Costmod.multiply(AV18Kgm)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV47Coste_mmoi = (AV82Costmoi.multiply(AV18Kgm)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV45Coste_mgi = (AV79Costgi.multiply(AV18Kgm)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV40Coste_madc = (AV27Costadc.multiply(AV18Kgm)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV42Coste_mam = (AV29Costam.multiply(AV18Kgm)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV39Coste_m = AV26cosprd1 ;
                     AV41Coste_mAgua = AV28CostAgua ;
                     AV43Coste_menergia = AV91Costenergia ;
                     AV44Coste_mgas = AV78Costgas ;
                     AV46Coste_mmod = AV81Costmod ;
                     AV47Coste_mmoi = AV82Costmoi ;
                     AV45Coste_mgi = AV79Costgi ;
                     AV40Coste_madc = AV27Costadc ;
                     AV42Coste_mam = AV29Costam ;
                  }
                  AV104Unidades = AV18Kgm ;
                  AV105Unidadest = AV18Kgm ;
               }
            }
            else
            {
               if ( A5720BarFasMtT.doubleValue() > 0 )
               {
                  AV39Coste_m = (AV26cosprd1.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV41Coste_mAgua = (AV28CostAgua.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV43Coste_menergia = (AV91Costenergia.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV44Coste_mgas = (AV78Costgas.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV46Coste_mmod = (AV81Costmod.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV47Coste_mmoi = (AV82Costmoi.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV45Coste_mgi = (AV79Costgi.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV40Coste_madc = (AV27Costadc.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV42Coste_mam = (AV29Costam.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV104Unidades = A3838BarFasMtr ;
                  AV105Unidadest = A5720BarFasMtT ;
               }
               else
               {
                  if ( AV19Mtr.doubleValue() > 0 )
                  {
                     AV39Coste_m = (AV26cosprd1.multiply(AV19Mtr)).divide(AV19Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV41Coste_mAgua = (AV28CostAgua.multiply(AV19Mtr)).divide(AV19Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV43Coste_menergia = (AV91Costenergia.multiply(AV19Mtr)).divide(AV19Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV44Coste_mgas = (AV78Costgas.multiply(AV19Mtr)).divide(AV19Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV46Coste_mmod = (AV81Costmod.multiply(AV19Mtr)).divide(AV19Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV47Coste_mmoi = (AV82Costmoi.multiply(AV19Mtr)).divide(AV19Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV45Coste_mgi = (AV79Costgi.multiply(AV19Mtr)).divide(AV19Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV40Coste_madc = (AV27Costadc.multiply(AV19Mtr)).divide(AV19Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV42Coste_mam = (AV29Costam.multiply(AV19Mtr)).divide(AV19Mtr, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV39Coste_m = AV26cosprd1 ;
                     AV41Coste_mAgua = AV28CostAgua ;
                     AV43Coste_menergia = AV91Costenergia ;
                     AV44Coste_mgas = AV78Costgas ;
                     AV46Coste_mmod = AV81Costmod ;
                     AV47Coste_mmoi = AV82Costmoi ;
                     AV45Coste_mgi = AV79Costgi ;
                     AV40Coste_madc = AV27Costadc ;
                     AV42Coste_mam = AV29Costam ;
                  }
                  AV104Unidades = AV19Mtr ;
                  AV105Unidadest = AV19Mtr ;
               }
            }
         }
         AV101TieTeo = A216BarTieTeo ;
         GXv_char10[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int8[0] = A132BarCodReo ;
         GXv_char5[0] = A130BarCodPar ;
         GXv_char4[0] = A457FasCod ;
         GXv_date11[0] = AV92fecteo ;
         GXv_decimal12[0] = AV103tteo ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char15[0] = "" ;
         GXv_char16[0] = A758ProCod ;
         GXv_char17[0] = A603MaqCodBis ;
         GXv_int18[0] = A252CliCod ;
         GXv_char19[0] = A212BarSer ;
         GXv_int20[0] = AV95hnd ;
         GXv_int2[0] = AV108Sicsv ;
         new app.ppla001(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_int8, GXv_char5, GXv_char4, GXv_date11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_char15, GXv_char16, GXv_char17, GXv_int18, GXv_char19, GXv_int20, GXv_int2) ;
         pcostesmaquina.this.A396EmprCod = GXv_char10[0] ;
         pcostesmaquina.this.A129BarCod = GXv_int6[0] ;
         pcostesmaquina.this.A132BarCodReo = GXv_int8[0] ;
         pcostesmaquina.this.A130BarCodPar = GXv_char5[0] ;
         pcostesmaquina.this.A457FasCod = GXv_char4[0] ;
         pcostesmaquina.this.AV92fecteo = GXv_date11[0] ;
         pcostesmaquina.this.AV103tteo = GXv_decimal12[0] ;
         pcostesmaquina.this.A758ProCod = GXv_char16[0] ;
         pcostesmaquina.this.A603MaqCodBis = GXv_char17[0] ;
         pcostesmaquina.this.A252CliCod = GXv_int18[0] ;
         pcostesmaquina.this.A212BarSer = GXv_char19[0] ;
         pcostesmaquina.this.AV95hnd = GXv_int20[0] ;
         pcostesmaquina.this.AV108Sicsv = GXv_int2[0] ;
         AV100teotixfi = (short)(0) ;
         if ( AV107Moda21 == 1 )
         {
            GXv_char19[0] = A396EmprCod ;
            GXv_int18[0] = A252CliCod ;
            GXv_char17[0] = A212BarSer ;
            GXv_char16[0] = A135BarColNom ;
            GXv_int6[0] = A136BarColNum ;
            GXv_int8[0] = A218BarTipCol ;
            GXv_int21[0] = AV93Fornumcol ;
            new app.pfdnumcolor(remoteHandle, context).execute( GXv_char19, GXv_int18, GXv_char17, GXv_char16, GXv_int6, GXv_int8, GXv_int21) ;
            pcostesmaquina.this.A396EmprCod = GXv_char19[0] ;
            pcostesmaquina.this.A252CliCod = GXv_int18[0] ;
            pcostesmaquina.this.A212BarSer = GXv_char17[0] ;
            pcostesmaquina.this.A135BarColNom = GXv_char16[0] ;
            pcostesmaquina.this.A136BarColNum = GXv_int6[0] ;
            pcostesmaquina.this.A218BarTipCol = GXv_int8[0] ;
            pcostesmaquina.this.AV93Fornumcol = GXv_int21[0] ;
            AV89bartipart = A217BarTipArt ;
            /* Execute user subroutine: 'FAMILIA' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            GXv_char19[0] = A396EmprCod ;
            GXv_int21[0] = AV93Fornumcol ;
            GXv_int7[0] = AV94GrdTipArt ;
            GXv_int22[0] = AV100teotixfi ;
            new app.pteoftixfi(remoteHandle, context).execute( GXv_char19, GXv_int21, GXv_int7, GXv_int22) ;
            pcostesmaquina.this.A396EmprCod = GXv_char19[0] ;
            pcostesmaquina.this.AV93Fornumcol = GXv_int21[0] ;
            pcostesmaquina.this.AV94GrdTipArt = GXv_int7[0] ;
            pcostesmaquina.this.AV100teotixfi = GXv_int22[0] ;
            AV100teotixfi = (short)(((GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", ""))==0) ? AV100teotixfi : 0)) ;
         }
         AV103tteo = ((GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", ""))==0)&&(AV107Moda21==1) ? DecimalUtil.doubleToDec(AV100teotixfi/ (double) (60)) : AV103tteo) ;
         AV25CosPrd = DecimalUtil.doubleToDec(0) ;
         AV53Coste_tm = DecimalUtil.doubleToDec(0) ;
         AV85Min = (byte)(DecimalUtil.decToDouble((AV101TieTeo.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV101TieTeo))))).multiply(DecimalUtil.doubleToDec(100)))) ;
         AV25CosPrd = GXutil.roundDecimal( (DecimalUtil.doubleToDec(((GXutil.Int( DecimalUtil.decToDouble(AV101TieTeo))*60)+AV85Min)).multiply(AV63MaqCosMin)), 2) ;
         if ( GXutil.strcmp(GXutil.trim( AV102TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            if ( GXutil.strcmp(AV17BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV53Coste_tm = GXutil.roundDecimal( (AV63MaqCosMin.multiply(AV18Kgm)), 2) ;
            }
            else
            {
               AV53Coste_tm = GXutil.roundDecimal( (AV63MaqCosMin.multiply(AV19Mtr)), 2) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV17BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A5719BarFasKgT.doubleValue() > 0 )
               {
                  AV53Coste_tm = (AV25CosPrd.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV53Coste_tm = AV25CosPrd ;
               }
            }
            else
            {
               if ( A5720BarFasMtT.doubleValue() > 0 )
               {
                  AV53Coste_tm = (AV25CosPrd.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV53Coste_tm = AV25CosPrd ;
               }
            }
         }
         AV90Ceros4 = "0000" ;
         AV98HorIni = GXutil.str( A165BarHorIni, 4, 0) ;
         AV98HorIni = GXutil.ltrim( GXutil.rtrim( AV98HorIni)) ;
         AV106Lenvar = (short)(GXutil.len( AV98HorIni)) ;
         AV106Lenvar = (short)(4-AV106Lenvar) ;
         AV98HorIni = GXutil.substring( AV90Ceros4, 1, AV106Lenvar) + AV98HorIni ;
         AV99HorIni_5 = GXutil.substring( AV98HorIni, 1, 2) + "." + GXutil.substring( AV98HorIni, 3, 2) ;
         AV96HorFin = GXutil.str( A164BarHorFin, 4, 0) ;
         AV96HorFin = GXutil.ltrim( GXutil.rtrim( AV96HorFin)) ;
         AV106Lenvar = (short)(GXutil.len( AV96HorFin)) ;
         AV106Lenvar = (short)(4-AV106Lenvar) ;
         AV96HorFin = GXutil.substring( AV90Ceros4, 1, AV106Lenvar) + AV96HorFin ;
         AV97HorFin_5 = GXutil.substring( AV96HorFin, 1, 2) + "." + GXutil.substring( AV96HorFin, 3, 2) ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) != 0 )
         {
            AV49Coste_p_k = DecimalUtil.doubleToDec(0) ;
            if ( AV18Kgm.doubleValue() > 0 )
            {
               AV49Coste_p_k = AV39Coste_m.divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
            }
         }
         else
         {
            AV49Coste_p_k = DecimalUtil.doubleToDec(0) ;
            if ( AV18Kgm.doubleValue() > 0 )
            {
               AV49Coste_p_k = (AV39Coste_m.add(AV88BarCosPro).add(AV87BarCosAny)).divide(AV18Kgm, 18, java.math.RoundingMode.DOWN) ;
            }
         }
         AV39Coste_m = AV39Coste_m.add(AV114costeoperario) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'COSMIN' Routine */
      returnInSub = false ;
      AV63MaqCosMin = DecimalUtil.doubleToDec(0) ;
      AV64maqDsc = "" ;
      AV65MaqMOD = DecimalUtil.doubleToDec(0) ;
      AV66MaqMOI = DecimalUtil.doubleToDec(0) ;
      AV67MaqEnerg = DecimalUtil.doubleToDec(0) ;
      AV68MaqGas = DecimalUtil.doubleToDec(0) ;
      AV69MaqAgua = DecimalUtil.doubleToDec(0) ;
      AV70MaqGI = DecimalUtil.doubleToDec(0) ;
      AV71MaqAdCent = DecimalUtil.doubleToDec(0) ;
      AV72MaqAmort = DecimalUtil.doubleToDec(0) ;
      AV102TipmaqCod = "" ;
      /* Using cursor P0ATK4 */
      pr_default.execute(1, new Object[] {AV8EmprCod, AV14MaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P0ATK4_A602MaqCod[0] ;
         A396EmprCod = P0ATK4_A396EmprCod[0] ;
         A606MaqDsc = P0ATK4_A606MaqDsc[0] ;
         n606MaqDsc = P0ATK4_n606MaqDsc[0] ;
         A1011TipMaqCod = P0ATK4_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0ATK4_n1011TipMaqCod[0] ;
         A11821MaqMOD = P0ATK4_A11821MaqMOD[0] ;
         n11821MaqMOD = P0ATK4_n11821MaqMOD[0] ;
         A11822MaqMOI = P0ATK4_A11822MaqMOI[0] ;
         n11822MaqMOI = P0ATK4_n11822MaqMOI[0] ;
         A11823MaqEnerg = P0ATK4_A11823MaqEnerg[0] ;
         n11823MaqEnerg = P0ATK4_n11823MaqEnerg[0] ;
         A11824MaqGas = P0ATK4_A11824MaqGas[0] ;
         n11824MaqGas = P0ATK4_n11824MaqGas[0] ;
         A11825MaqAgua = P0ATK4_A11825MaqAgua[0] ;
         n11825MaqAgua = P0ATK4_n11825MaqAgua[0] ;
         A14531MaqGI = P0ATK4_A14531MaqGI[0] ;
         A14532MaqAdCent = P0ATK4_A14532MaqAdCent[0] ;
         A14533MaqAmort = P0ATK4_A14533MaqAmort[0] ;
         A605MaqCosMin = P0ATK4_A605MaqCosMin[0] ;
         n605MaqCosMin = P0ATK4_n605MaqCosMin[0] ;
         AV64maqDsc = A606MaqDsc ;
         AV102TipmaqCod = A1011TipMaqCod ;
         if ( AV109TasasEstandar == 1 )
         {
            AV65MaqMOD = A11821MaqMOD ;
            AV66MaqMOI = A11822MaqMOI ;
            AV67MaqEnerg = A11823MaqEnerg ;
            AV68MaqGas = A11824MaqGas ;
            AV69MaqAgua = A11825MaqAgua ;
            AV70MaqGI = A14531MaqGI ;
            AV71MaqAdCent = A14532MaqAdCent ;
            AV72MaqAmort = A14533MaqAmort ;
            if ( AV113valorTasasEstandar == 1 )
            {
               /* Using cursor P0ATK5 */
               pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(AV111MqCAnyo), Byte.valueOf(AV112MqCmes)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A14530MqCMes = P0ATK5_A14530MqCMes[0] ;
                  A14529MqCAnyo = P0ATK5_A14529MqCAnyo[0] ;
                  A14535MqCMod = P0ATK5_A14535MqCMod[0] ;
                  n14535MqCMod = P0ATK5_n14535MqCMod[0] ;
                  A14536MqCMoi = P0ATK5_A14536MqCMoi[0] ;
                  n14536MqCMoi = P0ATK5_n14536MqCMoi[0] ;
                  A14537MqCEner = P0ATK5_A14537MqCEner[0] ;
                  n14537MqCEner = P0ATK5_n14537MqCEner[0] ;
                  A14538MqCGas = P0ATK5_A14538MqCGas[0] ;
                  n14538MqCGas = P0ATK5_n14538MqCGas[0] ;
                  A14539MqCAgua = P0ATK5_A14539MqCAgua[0] ;
                  n14539MqCAgua = P0ATK5_n14539MqCAgua[0] ;
                  A14543MqCgi = P0ATK5_A14543MqCgi[0] ;
                  n14543MqCgi = P0ATK5_n14543MqCgi[0] ;
                  A14540MqCAdCt = P0ATK5_A14540MqCAdCt[0] ;
                  n14540MqCAdCt = P0ATK5_n14540MqCAdCt[0] ;
                  A14541MqCAmo = P0ATK5_A14541MqCAmo[0] ;
                  n14541MqCAmo = P0ATK5_n14541MqCAmo[0] ;
                  AV65MaqMOD = A14535MqCMod ;
                  AV66MaqMOI = A14536MqCMoi ;
                  AV67MaqEnerg = A14537MqCEner ;
                  AV68MaqGas = A14538MqCGas ;
                  AV69MaqAgua = A14539MqCAgua ;
                  AV70MaqGI = A14543MqCgi ;
                  AV71MaqAdCent = A14540MqCAdCt ;
                  AV72MaqAmort = A14541MqCAmo ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
            }
         }
         AV63MaqCosMin = ((AV109TasasEstandar>0) ? (AV65MaqMOD.add(AV66MaqMOI).add(AV67MaqEnerg).add(AV68MaqGas).add(AV69MaqAgua).add(AV70MaqGI).add(AV71MaqAdCent).add(AV72MaqAmort)) : A605MaqCosMin) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'TIEREA' Routine */
      returnInSub = false ;
      AV86Tiempo_m = 0 ;
      /* Using cursor P0ATK6 */
      pr_default.execute(3, new Object[] {AV8EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar, Short.valueOf(AV15BarOrdLin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A556HisProEst = P0ATK6_A556HisProEst[0] ;
         A656ParCod = P0ATK6_A656ParCod[0] ;
         n656ParCod = P0ATK6_n656ParCod[0] ;
         A194BarOrdLin = P0ATK6_A194BarOrdLin[0] ;
         A130BarCodPar = P0ATK6_A130BarCodPar[0] ;
         A132BarCodReo = P0ATK6_A132BarCodReo[0] ;
         A129BarCod = P0ATK6_A129BarCod[0] ;
         A396EmprCod = P0ATK6_A396EmprCod[0] ;
         A561HisProLin = P0ATK6_A561HisProLin[0] ;
         A558HisProFec = P0ATK6_A558HisProFec[0] ;
         A4440HisProDTI = P0ATK6_A4440HisProDTI[0] ;
         n4440HisProDTI = P0ATK6_n4440HisProDTI[0] ;
         A4441HisProDTF = P0ATK6_A4441HisProDTF[0] ;
         n4441HisProDTF = P0ATK6_n4441HisProDTF[0] ;
         A602MaqCod = P0ATK6_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV86Tiempo_m = (int)(AV86Tiempo_m+A5605HisProTr2) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S131( )
   {
      /* 'FAMILIA' Routine */
      returnInSub = false ;
      AV94GrdTipArt = (short)(0) ;
      /* Using cursor P0ATK7 */
      pr_default.execute(4, new Object[] {AV8EmprCod, Short.valueOf(AV89bartipart)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A829TipArtCod = P0ATK7_A829TipArtCod[0] ;
         A396EmprCod = P0ATK7_A396EmprCod[0] ;
         A4364GrdTipArt = P0ATK7_A4364GrdTipArt[0] ;
         AV94GrdTipArt = A4364GrdTipArt ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S141( )
   {
      /* 'COSTEOPERARIO' Routine */
      returnInSub = false ;
      AV114costeoperario = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0ATK8 */
      pr_default.execute(5, new Object[] {AV8EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar, Short.valueOf(AV15BarOrdLin)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A556HisProEst = P0ATK8_A556HisProEst[0] ;
         A656ParCod = P0ATK8_A656ParCod[0] ;
         n656ParCod = P0ATK8_n656ParCod[0] ;
         A194BarOrdLin = P0ATK8_A194BarOrdLin[0] ;
         A130BarCodPar = P0ATK8_A130BarCodPar[0] ;
         A132BarCodReo = P0ATK8_A132BarCodReo[0] ;
         A129BarCod = P0ATK8_A129BarCod[0] ;
         A396EmprCod = P0ATK8_A396EmprCod[0] ;
         A561HisProLin = P0ATK8_A561HisProLin[0] ;
         A558HisProFec = P0ATK8_A558HisProFec[0] ;
         A503GruOpeCod = P0ATK8_A503GruOpeCod[0] ;
         A4440HisProDTI = P0ATK8_A4440HisProDTI[0] ;
         n4440HisProDTI = P0ATK8_n4440HisProDTI[0] ;
         A4441HisProDTF = P0ATK8_A4441HisProDTF[0] ;
         n4441HisProDTF = P0ATK8_n4441HisProDTF[0] ;
         A602MaqCod = P0ATK8_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV116gruopecod = A503GruOpeCod ;
         /* Execute user subroutine: 'OPERARIO' */
         S157 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         AV114costeoperario = AV114costeoperario.add((DecimalUtil.doubleToDec((A5605HisProTr2/ (double) (60))).multiply(AV115OpePreHor))) ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S157( )
   {
      /* 'OPERARIO' Routine */
      returnInSub = false ;
      AV115OpePreHor = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0ATK9 */
      pr_default.execute(6, new Object[] {AV8EmprCod, Integer.valueOf(AV116gruopecod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A652OpeCod = P0ATK9_A652OpeCod[0] ;
         A396EmprCod = P0ATK9_A396EmprCod[0] ;
         A2505OpePreHor = P0ATK9_A2505OpePreHor[0] ;
         n2505OpePreHor = P0ATK9_n2505OpePreHor[0] ;
         AV115OpePreHor = A2505OpePreHor ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP8[0] = pcostesmaquina.this.AV63MaqCosMin;
      this.aP9[0] = pcostesmaquina.this.AV103tteo;
      this.aP10[0] = pcostesmaquina.this.AV49Coste_p_k;
      this.aP11[0] = pcostesmaquina.this.AV97HorFin_5;
      this.aP12[0] = pcostesmaquina.this.AV99HorIni_5;
      this.aP13[0] = pcostesmaquina.this.AV53Coste_tm;
      this.aP14[0] = pcostesmaquina.this.AV100teotixfi;
      this.aP15[0] = pcostesmaquina.this.AV101TieTeo;
      this.aP16[0] = pcostesmaquina.this.AV104Unidades;
      this.aP17[0] = pcostesmaquina.this.AV105Unidadest;
      this.aP18[0] = pcostesmaquina.this.AV42Coste_mam;
      this.aP19[0] = pcostesmaquina.this.AV40Coste_madc;
      this.aP20[0] = pcostesmaquina.this.AV45Coste_mgi;
      this.aP21[0] = pcostesmaquina.this.AV47Coste_mmoi;
      this.aP22[0] = pcostesmaquina.this.AV46Coste_mmod;
      this.aP23[0] = pcostesmaquina.this.AV44Coste_mgas;
      this.aP24[0] = pcostesmaquina.this.AV43Coste_menergia;
      this.aP25[0] = pcostesmaquina.this.AV41Coste_mAgua;
      this.aP26[0] = pcostesmaquina.this.AV39Coste_m;
      this.aP27[0] = pcostesmaquina.this.AV84BarTieRea;
      this.aP28[0] = pcostesmaquina.this.AV86Tiempo_m;
      this.aP29[0] = pcostesmaquina.this.AV12Lhipro;
      this.aP30[0] = pcostesmaquina.this.AV114costeoperario;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV63MaqCosMin = DecimalUtil.ZERO ;
      AV103tteo = DecimalUtil.ZERO ;
      AV49Coste_p_k = DecimalUtil.ZERO ;
      AV97HorFin_5 = "" ;
      AV99HorIni_5 = "" ;
      AV53Coste_tm = DecimalUtil.ZERO ;
      AV101TieTeo = DecimalUtil.ZERO ;
      AV104Unidades = DecimalUtil.ZERO ;
      AV105Unidadest = DecimalUtil.ZERO ;
      AV42Coste_mam = DecimalUtil.ZERO ;
      AV40Coste_madc = DecimalUtil.ZERO ;
      AV45Coste_mgi = DecimalUtil.ZERO ;
      AV47Coste_mmoi = DecimalUtil.ZERO ;
      AV46Coste_mmod = DecimalUtil.ZERO ;
      AV44Coste_mgas = DecimalUtil.ZERO ;
      AV43Coste_menergia = DecimalUtil.ZERO ;
      AV41Coste_mAgua = DecimalUtil.ZERO ;
      AV39Coste_m = DecimalUtil.ZERO ;
      AV84BarTieRea = DecimalUtil.ZERO ;
      AV114costeoperario = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ATK3_A194BarOrdLin = new short[1] ;
      P0ATK3_A758ProCod = new String[] {""} ;
      P0ATK3_A130BarCodPar = new String[] {""} ;
      P0ATK3_A132BarCodReo = new byte[1] ;
      P0ATK3_A129BarCod = new int[1] ;
      P0ATK3_A396EmprCod = new String[] {""} ;
      P0ATK3_A457FasCod = new String[] {""} ;
      P0ATK3_A603MaqCodBis = new String[] {""} ;
      P0ATK3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATK3_n4443BarFasDTF = new boolean[] {false} ;
      P0ATK3_A460FasDsc = new String[] {""} ;
      P0ATK3_A228BarUniMed = new String[] {""} ;
      P0ATK3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK3_n3837BarFasKgm = new boolean[] {false} ;
      P0ATK3_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK3_n5719BarFasKgT = new boolean[] {false} ;
      P0ATK3_A6173BarFasSec = new String[] {""} ;
      P0ATK3_n6173BarFasSec = new boolean[] {false} ;
      P0ATK3_A5168FasPreMC = new short[1] ;
      P0ATK3_n5168FasPreMC = new boolean[] {false} ;
      P0ATK3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK3_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK3_n5720BarFasMtT = new boolean[] {false} ;
      P0ATK3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK3_n3838BarFasMtr = new boolean[] {false} ;
      P0ATK3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK3_A252CliCod = new int[1] ;
      P0ATK3_n252CliCod = new boolean[] {false} ;
      P0ATK3_A212BarSer = new String[] {""} ;
      P0ATK3_A135BarColNom = new String[] {""} ;
      P0ATK3_A136BarColNum = new int[1] ;
      P0ATK3_A218BarTipCol = new byte[1] ;
      P0ATK3_A217BarTipArt = new short[1] ;
      P0ATK3_n217BarTipArt = new boolean[] {false} ;
      P0ATK3_A150BarFacTin = new String[] {""} ;
      P0ATK3_A165BarHorIni = new short[1] ;
      P0ATK3_A164BarHorFin = new short[1] ;
      P0ATK3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A460FasDsc = "" ;
      A228BarUniMed = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A6173BarFasSec = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A150BarFacTin = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV13fascod = "" ;
      AV14MaqCod = "" ;
      AV16FasDsc = "" ;
      AV17BarUniMed = "" ;
      AV18Kgm = DecimalUtil.ZERO ;
      AV19Mtr = DecimalUtil.ZERO ;
      AV20Barfaskgm = DecimalUtil.ZERO ;
      AV21Barfaskgt = DecimalUtil.ZERO ;
      AV22BarFasSec = "" ;
      AV25CosPrd = DecimalUtil.ZERO ;
      AV26cosprd1 = DecimalUtil.ZERO ;
      AV28CostAgua = DecimalUtil.ZERO ;
      AV91Costenergia = DecimalUtil.ZERO ;
      AV78Costgas = DecimalUtil.ZERO ;
      AV81Costmod = DecimalUtil.ZERO ;
      AV82Costmoi = DecimalUtil.ZERO ;
      AV79Costgi = DecimalUtil.ZERO ;
      AV27Costadc = DecimalUtil.ZERO ;
      AV29Costam = DecimalUtil.ZERO ;
      AV64maqDsc = "" ;
      GXt_char9 = "" ;
      AV65MaqMOD = DecimalUtil.ZERO ;
      AV66MaqMOI = DecimalUtil.ZERO ;
      AV67MaqEnerg = DecimalUtil.ZERO ;
      AV68MaqGas = DecimalUtil.ZERO ;
      AV69MaqAgua = DecimalUtil.ZERO ;
      AV70MaqGI = DecimalUtil.ZERO ;
      AV71MaqAdCent = DecimalUtil.ZERO ;
      AV72MaqAmort = DecimalUtil.ZERO ;
      AV102TipmaqCod = "" ;
      GXv_char10 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV92fecteo = GXutil.nullDate() ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char15 = new String[1] ;
      GXv_int20 = new long[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int18 = new int[1] ;
      GXv_char17 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char19 = new String[1] ;
      GXv_int21 = new int[1] ;
      GXv_int7 = new short[1] ;
      GXv_int22 = new short[1] ;
      AV90Ceros4 = "" ;
      AV98HorIni = "" ;
      AV96HorFin = "" ;
      AV88BarCosPro = DecimalUtil.ZERO ;
      AV87BarCosAny = DecimalUtil.ZERO ;
      P0ATK4_A602MaqCod = new String[] {""} ;
      P0ATK4_A396EmprCod = new String[] {""} ;
      P0ATK4_A606MaqDsc = new String[] {""} ;
      P0ATK4_n606MaqDsc = new boolean[] {false} ;
      P0ATK4_A1011TipMaqCod = new String[] {""} ;
      P0ATK4_n1011TipMaqCod = new boolean[] {false} ;
      P0ATK4_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK4_n11821MaqMOD = new boolean[] {false} ;
      P0ATK4_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK4_n11822MaqMOI = new boolean[] {false} ;
      P0ATK4_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK4_n11823MaqEnerg = new boolean[] {false} ;
      P0ATK4_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK4_n11824MaqGas = new boolean[] {false} ;
      P0ATK4_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK4_n11825MaqAgua = new boolean[] {false} ;
      P0ATK4_A14531MaqGI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK4_A14532MaqAdCent = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK4_A14533MaqAmort = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK4_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK4_n605MaqCosMin = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A1011TipMaqCod = "" ;
      A11821MaqMOD = DecimalUtil.ZERO ;
      A11822MaqMOI = DecimalUtil.ZERO ;
      A11823MaqEnerg = DecimalUtil.ZERO ;
      A11824MaqGas = DecimalUtil.ZERO ;
      A11825MaqAgua = DecimalUtil.ZERO ;
      A14531MaqGI = DecimalUtil.ZERO ;
      A14532MaqAdCent = DecimalUtil.ZERO ;
      A14533MaqAmort = DecimalUtil.ZERO ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      P0ATK5_A396EmprCod = new String[] {""} ;
      P0ATK5_A602MaqCod = new String[] {""} ;
      P0ATK5_A14530MqCMes = new byte[1] ;
      P0ATK5_A14529MqCAnyo = new short[1] ;
      P0ATK5_A14535MqCMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK5_n14535MqCMod = new boolean[] {false} ;
      P0ATK5_A14536MqCMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK5_n14536MqCMoi = new boolean[] {false} ;
      P0ATK5_A14537MqCEner = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK5_n14537MqCEner = new boolean[] {false} ;
      P0ATK5_A14538MqCGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK5_n14538MqCGas = new boolean[] {false} ;
      P0ATK5_A14539MqCAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK5_n14539MqCAgua = new boolean[] {false} ;
      P0ATK5_A14543MqCgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK5_n14543MqCgi = new boolean[] {false} ;
      P0ATK5_A14540MqCAdCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK5_n14540MqCAdCt = new boolean[] {false} ;
      P0ATK5_A14541MqCAmo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK5_n14541MqCAmo = new boolean[] {false} ;
      A14535MqCMod = DecimalUtil.ZERO ;
      A14536MqCMoi = DecimalUtil.ZERO ;
      A14537MqCEner = DecimalUtil.ZERO ;
      A14538MqCGas = DecimalUtil.ZERO ;
      A14539MqCAgua = DecimalUtil.ZERO ;
      A14543MqCgi = DecimalUtil.ZERO ;
      A14540MqCAdCt = DecimalUtil.ZERO ;
      A14541MqCAmo = DecimalUtil.ZERO ;
      P0ATK6_A556HisProEst = new byte[1] ;
      P0ATK6_A656ParCod = new short[1] ;
      P0ATK6_n656ParCod = new boolean[] {false} ;
      P0ATK6_A194BarOrdLin = new short[1] ;
      P0ATK6_A130BarCodPar = new String[] {""} ;
      P0ATK6_A132BarCodReo = new byte[1] ;
      P0ATK6_A129BarCod = new int[1] ;
      P0ATK6_A396EmprCod = new String[] {""} ;
      P0ATK6_A561HisProLin = new int[1] ;
      P0ATK6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATK6_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATK6_n4440HisProDTI = new boolean[] {false} ;
      P0ATK6_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATK6_n4441HisProDTF = new boolean[] {false} ;
      P0ATK6_A602MaqCod = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      P0ATK7_A829TipArtCod = new short[1] ;
      P0ATK7_A396EmprCod = new String[] {""} ;
      P0ATK7_A4364GrdTipArt = new short[1] ;
      P0ATK8_A556HisProEst = new byte[1] ;
      P0ATK8_A656ParCod = new short[1] ;
      P0ATK8_n656ParCod = new boolean[] {false} ;
      P0ATK8_A194BarOrdLin = new short[1] ;
      P0ATK8_A130BarCodPar = new String[] {""} ;
      P0ATK8_A132BarCodReo = new byte[1] ;
      P0ATK8_A129BarCod = new int[1] ;
      P0ATK8_A396EmprCod = new String[] {""} ;
      P0ATK8_A561HisProLin = new int[1] ;
      P0ATK8_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATK8_A503GruOpeCod = new int[1] ;
      P0ATK8_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATK8_n4440HisProDTI = new boolean[] {false} ;
      P0ATK8_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATK8_n4441HisProDTF = new boolean[] {false} ;
      P0ATK8_A602MaqCod = new String[] {""} ;
      AV115OpePreHor = DecimalUtil.ZERO ;
      P0ATK9_A652OpeCod = new int[1] ;
      P0ATK9_A396EmprCod = new String[] {""} ;
      P0ATK9_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATK9_n2505OpePreHor = new boolean[] {false} ;
      A2505OpePreHor = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.pcostesmaquina__default(),
         new Object[] {
             new Object[] {
            P0ATK3_A194BarOrdLin, P0ATK3_A758ProCod, P0ATK3_A130BarCodPar, P0ATK3_A132BarCodReo, P0ATK3_A129BarCod, P0ATK3_A396EmprCod, P0ATK3_A457FasCod, P0ATK3_A603MaqCodBis, P0ATK3_A4443BarFasDTF, P0ATK3_n4443BarFasDTF,
            P0ATK3_A460FasDsc, P0ATK3_A228BarUniMed, P0ATK3_A3837BarFasKgm, P0ATK3_n3837BarFasKgm, P0ATK3_A5719BarFasKgT, P0ATK3_n5719BarFasKgT, P0ATK3_A6173BarFasSec, P0ATK3_n6173BarFasSec, P0ATK3_A5168FasPreMC, P0ATK3_n5168FasPreMC,
            P0ATK3_A215BarTieRea, P0ATK3_A5720BarFasMtT, P0ATK3_n5720BarFasMtT, P0ATK3_A3838BarFasMtr, P0ATK3_n3838BarFasMtr, P0ATK3_A216BarTieTeo, P0ATK3_A252CliCod, P0ATK3_n252CliCod, P0ATK3_A212BarSer, P0ATK3_A135BarColNom,
            P0ATK3_A136BarColNum, P0ATK3_A218BarTipCol, P0ATK3_A217BarTipArt, P0ATK3_n217BarTipArt, P0ATK3_A150BarFacTin, P0ATK3_A165BarHorIni, P0ATK3_A164BarHorFin, P0ATK3_A166BarKgm, P0ATK3_A184BarMtr
            }
            , new Object[] {
            P0ATK4_A602MaqCod, P0ATK4_A396EmprCod, P0ATK4_A606MaqDsc, P0ATK4_n606MaqDsc, P0ATK4_A1011TipMaqCod, P0ATK4_n1011TipMaqCod, P0ATK4_A11821MaqMOD, P0ATK4_n11821MaqMOD, P0ATK4_A11822MaqMOI, P0ATK4_n11822MaqMOI,
            P0ATK4_A11823MaqEnerg, P0ATK4_n11823MaqEnerg, P0ATK4_A11824MaqGas, P0ATK4_n11824MaqGas, P0ATK4_A11825MaqAgua, P0ATK4_n11825MaqAgua, P0ATK4_A14531MaqGI, P0ATK4_A14532MaqAdCent, P0ATK4_A14533MaqAmort, P0ATK4_A605MaqCosMin,
            P0ATK4_n605MaqCosMin
            }
            , new Object[] {
            P0ATK5_A396EmprCod, P0ATK5_A602MaqCod, P0ATK5_A14530MqCMes, P0ATK5_A14529MqCAnyo, P0ATK5_A14535MqCMod, P0ATK5_n14535MqCMod, P0ATK5_A14536MqCMoi, P0ATK5_n14536MqCMoi, P0ATK5_A14537MqCEner, P0ATK5_n14537MqCEner,
            P0ATK5_A14538MqCGas, P0ATK5_n14538MqCGas, P0ATK5_A14539MqCAgua, P0ATK5_n14539MqCAgua, P0ATK5_A14543MqCgi, P0ATK5_n14543MqCgi, P0ATK5_A14540MqCAdCt, P0ATK5_n14540MqCAdCt, P0ATK5_A14541MqCAmo, P0ATK5_n14541MqCAmo
            }
            , new Object[] {
            P0ATK6_A556HisProEst, P0ATK6_A656ParCod, P0ATK6_n656ParCod, P0ATK6_A194BarOrdLin, P0ATK6_A130BarCodPar, P0ATK6_A132BarCodReo, P0ATK6_A129BarCod, P0ATK6_A396EmprCod, P0ATK6_A561HisProLin, P0ATK6_A558HisProFec,
            P0ATK6_A4440HisProDTI, P0ATK6_n4440HisProDTI, P0ATK6_A4441HisProDTF, P0ATK6_n4441HisProDTF, P0ATK6_A602MaqCod
            }
            , new Object[] {
            P0ATK7_A829TipArtCod, P0ATK7_A396EmprCod, P0ATK7_A4364GrdTipArt
            }
            , new Object[] {
            P0ATK8_A556HisProEst, P0ATK8_A656ParCod, P0ATK8_n656ParCod, P0ATK8_A194BarOrdLin, P0ATK8_A130BarCodPar, P0ATK8_A132BarCodReo, P0ATK8_A129BarCod, P0ATK8_A396EmprCod, P0ATK8_A561HisProLin, P0ATK8_A558HisProFec,
            P0ATK8_A503GruOpeCod, P0ATK8_A4440HisProDTI, P0ATK8_n4440HisProDTI, P0ATK8_A4441HisProDTF, P0ATK8_n4441HisProDTF, P0ATK8_A602MaqCod
            }
            , new Object[] {
            P0ATK9_A652OpeCod, P0ATK9_A396EmprCod, P0ATK9_A2505OpePreHor, P0ATK9_n2505OpePreHor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte AV80CosTiR ;
   private byte AV73reoperados ;
   private byte AV12Lhipro ;
   private byte AV109TasasEstandar ;
   private byte GXt_int1 ;
   private byte AV113valorTasasEstandar ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV112MqCmes ;
   private byte AV85Min ;
   private byte AV108Sicsv ;
   private byte GXv_int2[] ;
   private byte AV107Moda21 ;
   private byte GXv_int8[] ;
   private byte A14530MqCMes ;
   private byte A556HisProEst ;
   private short AV15BarOrdLin ;
   private short AV100teotixfi ;
   private short A194BarOrdLin ;
   private short A5168FasPreMC ;
   private short A217BarTipArt ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short AV111MqCAnyo ;
   private short AV23FasPreMC ;
   private short AV89bartipart ;
   private short AV94GrdTipArt ;
   private short GXv_int7[] ;
   private short GXv_int22[] ;
   private short AV106Lenvar ;
   private short A14529MqCAnyo ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short A829TipArtCod ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int AV86Tiempo_m ;
   private int GXt_int3 ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int18[] ;
   private int GXv_int6[] ;
   private int AV93Fornumcol ;
   private int GXv_int21[] ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int AV116gruopecod ;
   private int A652OpeCod ;
   private long AV95hnd ;
   private long GXv_int20[] ;
   private java.math.BigDecimal AV63MaqCosMin ;
   private java.math.BigDecimal AV103tteo ;
   private java.math.BigDecimal AV49Coste_p_k ;
   private java.math.BigDecimal AV53Coste_tm ;
   private java.math.BigDecimal AV101TieTeo ;
   private java.math.BigDecimal AV104Unidades ;
   private java.math.BigDecimal AV105Unidadest ;
   private java.math.BigDecimal AV42Coste_mam ;
   private java.math.BigDecimal AV40Coste_madc ;
   private java.math.BigDecimal AV45Coste_mgi ;
   private java.math.BigDecimal AV47Coste_mmoi ;
   private java.math.BigDecimal AV46Coste_mmod ;
   private java.math.BigDecimal AV44Coste_mgas ;
   private java.math.BigDecimal AV43Coste_menergia ;
   private java.math.BigDecimal AV41Coste_mAgua ;
   private java.math.BigDecimal AV39Coste_m ;
   private java.math.BigDecimal AV84BarTieRea ;
   private java.math.BigDecimal AV114costeoperario ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV18Kgm ;
   private java.math.BigDecimal AV19Mtr ;
   private java.math.BigDecimal AV20Barfaskgm ;
   private java.math.BigDecimal AV21Barfaskgt ;
   private java.math.BigDecimal AV25CosPrd ;
   private java.math.BigDecimal AV26cosprd1 ;
   private java.math.BigDecimal AV28CostAgua ;
   private java.math.BigDecimal AV91Costenergia ;
   private java.math.BigDecimal AV78Costgas ;
   private java.math.BigDecimal AV81Costmod ;
   private java.math.BigDecimal AV82Costmoi ;
   private java.math.BigDecimal AV79Costgi ;
   private java.math.BigDecimal AV27Costadc ;
   private java.math.BigDecimal AV29Costam ;
   private java.math.BigDecimal AV65MaqMOD ;
   private java.math.BigDecimal AV66MaqMOI ;
   private java.math.BigDecimal AV67MaqEnerg ;
   private java.math.BigDecimal AV68MaqGas ;
   private java.math.BigDecimal AV69MaqAgua ;
   private java.math.BigDecimal AV70MaqGI ;
   private java.math.BigDecimal AV71MaqAdCent ;
   private java.math.BigDecimal AV72MaqAmort ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal AV88BarCosPro ;
   private java.math.BigDecimal AV87BarCosAny ;
   private java.math.BigDecimal A11821MaqMOD ;
   private java.math.BigDecimal A11822MaqMOI ;
   private java.math.BigDecimal A11823MaqEnerg ;
   private java.math.BigDecimal A11824MaqGas ;
   private java.math.BigDecimal A11825MaqAgua ;
   private java.math.BigDecimal A14531MaqGI ;
   private java.math.BigDecimal A14532MaqAdCent ;
   private java.math.BigDecimal A14533MaqAmort ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A14535MqCMod ;
   private java.math.BigDecimal A14536MqCMoi ;
   private java.math.BigDecimal A14537MqCEner ;
   private java.math.BigDecimal A14538MqCGas ;
   private java.math.BigDecimal A14539MqCAgua ;
   private java.math.BigDecimal A14543MqCgi ;
   private java.math.BigDecimal A14540MqCAdCt ;
   private java.math.BigDecimal A14541MqCAmo ;
   private java.math.BigDecimal AV115OpePreHor ;
   private java.math.BigDecimal A2505OpePreHor ;
   private String AV8EmprCod ;
   private String AV11BarCodPar ;
   private String AV110procod ;
   private String AV97HorFin_5 ;
   private String AV99HorIni_5 ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String A228BarUniMed ;
   private String A6173BarFasSec ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A150BarFacTin ;
   private String AV13fascod ;
   private String AV14MaqCod ;
   private String AV16FasDsc ;
   private String AV17BarUniMed ;
   private String AV22BarFasSec ;
   private String AV64maqDsc ;
   private String GXt_char9 ;
   private String AV102TipmaqCod ;
   private String GXv_char10[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char15[] ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String GXv_char19[] ;
   private String AV90Ceros4 ;
   private String AV98HorIni ;
   private String AV96HorFin ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A1011TipMaqCod ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV92fecteo ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date A558HisProFec ;
   private boolean n4443BarFasDTF ;
   private boolean n3837BarFasKgm ;
   private boolean n5719BarFasKgT ;
   private boolean n6173BarFasSec ;
   private boolean n5168FasPreMC ;
   private boolean n5720BarFasMtT ;
   private boolean n3838BarFasMtr ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n606MaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n11821MaqMOD ;
   private boolean n11822MaqMOI ;
   private boolean n11823MaqEnerg ;
   private boolean n11824MaqGas ;
   private boolean n11825MaqAgua ;
   private boolean n605MaqCosMin ;
   private boolean n14535MqCMod ;
   private boolean n14536MqCMoi ;
   private boolean n14537MqCEner ;
   private boolean n14538MqCGas ;
   private boolean n14539MqCAgua ;
   private boolean n14543MqCgi ;
   private boolean n14540MqCAdCt ;
   private boolean n14541MqCAmo ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n2505OpePreHor ;
   private java.math.BigDecimal[] aP30 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private short[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private java.math.BigDecimal[] aP17 ;
   private java.math.BigDecimal[] aP18 ;
   private java.math.BigDecimal[] aP19 ;
   private java.math.BigDecimal[] aP20 ;
   private java.math.BigDecimal[] aP21 ;
   private java.math.BigDecimal[] aP22 ;
   private java.math.BigDecimal[] aP23 ;
   private java.math.BigDecimal[] aP24 ;
   private java.math.BigDecimal[] aP25 ;
   private java.math.BigDecimal[] aP26 ;
   private java.math.BigDecimal[] aP27 ;
   private int[] aP28 ;
   private byte[] aP29 ;
   private IDataStoreProvider pr_default ;
   private short[] P0ATK3_A194BarOrdLin ;
   private String[] P0ATK3_A758ProCod ;
   private String[] P0ATK3_A130BarCodPar ;
   private byte[] P0ATK3_A132BarCodReo ;
   private int[] P0ATK3_A129BarCod ;
   private String[] P0ATK3_A396EmprCod ;
   private String[] P0ATK3_A457FasCod ;
   private String[] P0ATK3_A603MaqCodBis ;
   private java.util.Date[] P0ATK3_A4443BarFasDTF ;
   private boolean[] P0ATK3_n4443BarFasDTF ;
   private String[] P0ATK3_A460FasDsc ;
   private String[] P0ATK3_A228BarUniMed ;
   private java.math.BigDecimal[] P0ATK3_A3837BarFasKgm ;
   private boolean[] P0ATK3_n3837BarFasKgm ;
   private java.math.BigDecimal[] P0ATK3_A5719BarFasKgT ;
   private boolean[] P0ATK3_n5719BarFasKgT ;
   private String[] P0ATK3_A6173BarFasSec ;
   private boolean[] P0ATK3_n6173BarFasSec ;
   private short[] P0ATK3_A5168FasPreMC ;
   private boolean[] P0ATK3_n5168FasPreMC ;
   private java.math.BigDecimal[] P0ATK3_A215BarTieRea ;
   private java.math.BigDecimal[] P0ATK3_A5720BarFasMtT ;
   private boolean[] P0ATK3_n5720BarFasMtT ;
   private java.math.BigDecimal[] P0ATK3_A3838BarFasMtr ;
   private boolean[] P0ATK3_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0ATK3_A216BarTieTeo ;
   private int[] P0ATK3_A252CliCod ;
   private boolean[] P0ATK3_n252CliCod ;
   private String[] P0ATK3_A212BarSer ;
   private String[] P0ATK3_A135BarColNom ;
   private int[] P0ATK3_A136BarColNum ;
   private byte[] P0ATK3_A218BarTipCol ;
   private short[] P0ATK3_A217BarTipArt ;
   private boolean[] P0ATK3_n217BarTipArt ;
   private String[] P0ATK3_A150BarFacTin ;
   private short[] P0ATK3_A165BarHorIni ;
   private short[] P0ATK3_A164BarHorFin ;
   private java.math.BigDecimal[] P0ATK3_A166BarKgm ;
   private java.math.BigDecimal[] P0ATK3_A184BarMtr ;
   private String[] P0ATK4_A602MaqCod ;
   private String[] P0ATK4_A396EmprCod ;
   private String[] P0ATK4_A606MaqDsc ;
   private boolean[] P0ATK4_n606MaqDsc ;
   private String[] P0ATK4_A1011TipMaqCod ;
   private boolean[] P0ATK4_n1011TipMaqCod ;
   private java.math.BigDecimal[] P0ATK4_A11821MaqMOD ;
   private boolean[] P0ATK4_n11821MaqMOD ;
   private java.math.BigDecimal[] P0ATK4_A11822MaqMOI ;
   private boolean[] P0ATK4_n11822MaqMOI ;
   private java.math.BigDecimal[] P0ATK4_A11823MaqEnerg ;
   private boolean[] P0ATK4_n11823MaqEnerg ;
   private java.math.BigDecimal[] P0ATK4_A11824MaqGas ;
   private boolean[] P0ATK4_n11824MaqGas ;
   private java.math.BigDecimal[] P0ATK4_A11825MaqAgua ;
   private boolean[] P0ATK4_n11825MaqAgua ;
   private java.math.BigDecimal[] P0ATK4_A14531MaqGI ;
   private java.math.BigDecimal[] P0ATK4_A14532MaqAdCent ;
   private java.math.BigDecimal[] P0ATK4_A14533MaqAmort ;
   private java.math.BigDecimal[] P0ATK4_A605MaqCosMin ;
   private boolean[] P0ATK4_n605MaqCosMin ;
   private String[] P0ATK5_A396EmprCod ;
   private String[] P0ATK5_A602MaqCod ;
   private byte[] P0ATK5_A14530MqCMes ;
   private short[] P0ATK5_A14529MqCAnyo ;
   private java.math.BigDecimal[] P0ATK5_A14535MqCMod ;
   private boolean[] P0ATK5_n14535MqCMod ;
   private java.math.BigDecimal[] P0ATK5_A14536MqCMoi ;
   private boolean[] P0ATK5_n14536MqCMoi ;
   private java.math.BigDecimal[] P0ATK5_A14537MqCEner ;
   private boolean[] P0ATK5_n14537MqCEner ;
   private java.math.BigDecimal[] P0ATK5_A14538MqCGas ;
   private boolean[] P0ATK5_n14538MqCGas ;
   private java.math.BigDecimal[] P0ATK5_A14539MqCAgua ;
   private boolean[] P0ATK5_n14539MqCAgua ;
   private java.math.BigDecimal[] P0ATK5_A14543MqCgi ;
   private boolean[] P0ATK5_n14543MqCgi ;
   private java.math.BigDecimal[] P0ATK5_A14540MqCAdCt ;
   private boolean[] P0ATK5_n14540MqCAdCt ;
   private java.math.BigDecimal[] P0ATK5_A14541MqCAmo ;
   private boolean[] P0ATK5_n14541MqCAmo ;
   private byte[] P0ATK6_A556HisProEst ;
   private short[] P0ATK6_A656ParCod ;
   private boolean[] P0ATK6_n656ParCod ;
   private short[] P0ATK6_A194BarOrdLin ;
   private String[] P0ATK6_A130BarCodPar ;
   private byte[] P0ATK6_A132BarCodReo ;
   private int[] P0ATK6_A129BarCod ;
   private String[] P0ATK6_A396EmprCod ;
   private int[] P0ATK6_A561HisProLin ;
   private java.util.Date[] P0ATK6_A558HisProFec ;
   private java.util.Date[] P0ATK6_A4440HisProDTI ;
   private boolean[] P0ATK6_n4440HisProDTI ;
   private java.util.Date[] P0ATK6_A4441HisProDTF ;
   private boolean[] P0ATK6_n4441HisProDTF ;
   private String[] P0ATK6_A602MaqCod ;
   private short[] P0ATK7_A829TipArtCod ;
   private String[] P0ATK7_A396EmprCod ;
   private short[] P0ATK7_A4364GrdTipArt ;
   private byte[] P0ATK8_A556HisProEst ;
   private short[] P0ATK8_A656ParCod ;
   private boolean[] P0ATK8_n656ParCod ;
   private short[] P0ATK8_A194BarOrdLin ;
   private String[] P0ATK8_A130BarCodPar ;
   private byte[] P0ATK8_A132BarCodReo ;
   private int[] P0ATK8_A129BarCod ;
   private String[] P0ATK8_A396EmprCod ;
   private int[] P0ATK8_A561HisProLin ;
   private java.util.Date[] P0ATK8_A558HisProFec ;
   private int[] P0ATK8_A503GruOpeCod ;
   private java.util.Date[] P0ATK8_A4440HisProDTI ;
   private boolean[] P0ATK8_n4440HisProDTI ;
   private java.util.Date[] P0ATK8_A4441HisProDTF ;
   private boolean[] P0ATK8_n4441HisProDTF ;
   private String[] P0ATK8_A602MaqCod ;
   private int[] P0ATK9_A652OpeCod ;
   private String[] P0ATK9_A396EmprCod ;
   private java.math.BigDecimal[] P0ATK9_A2505OpePreHor ;
   private boolean[] P0ATK9_n2505OpePreHor ;
}

final  class pcostesmaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATK3", "SELECT T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.FasCod, T1.MaqCodBis, T1.BarFasDTF, T4.FasDsc, T2.BarUniMed, T1.BarFasKgm, T1.BarFasKgT, T1.BarFasSec, T4.FasPreMC, T1.BarTieRea, T1.BarFasMtT, T1.BarFasMtr, T1.BarTieTeo, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T2.BarTipArt, T1.BarFacTin, T1.BarHorIni, T1.BarHorFin, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr FROM (((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATK4", "SELECT MaqCod, EmprCod, MaqDsc, TipMaqCod, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqGI, MaqAdCent, MaqAmort, MaqCosMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATK5", "SELECT EmprCod, MaqCod, MqCMes, MqCAnyo, MqCMod, MqCMoi, MqCEner, MqCGas, MqCAgua, MqCgi, MqCAdCt, MqCAmo FROM TXPMAQCOS WHERE EmprCod = ? and MaqCod = ? and MqCAnyo = ? and MqCMes = ? ORDER BY EmprCod, MaqCod, MqCAnyo, MqCMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATK6", "SELECT HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, HisProLin, HisProFec, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (HisProEst > 0) AND (BarOrdLin = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATK7", "SELECT TipArtCod, EmprCod, GrdTipArt FROM TXPGRDTI1 WHERE (EmprCod = ?) AND (TipArtCod = ?) ORDER BY EmprCod, GrdTipArt, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATK8", "SELECT HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, HisProLin, HisProFec, GruOpeCod, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (HisProEst > 0) AND (BarOrdLin = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATK9", "SELECT OpeCod, EmprCod, OpePreHor FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 28);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(19,2);
               ((int[]) buf[26])[0] = rslt.getInt(20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(21, 16);
               ((String[]) buf[29])[0] = rslt.getString(22, 13);
               ((int[]) buf[30])[0] = rslt.getInt(23);
               ((byte[]) buf[31])[0] = rslt.getByte(24);
               ((short[]) buf[32])[0] = rslt.getShort(25);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(26, 1);
               ((short[]) buf[35])[0] = rslt.getShort(27);
               ((short[]) buf[36])[0] = rslt.getShort(28);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(30,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,4);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               return;
      }
   }

}

