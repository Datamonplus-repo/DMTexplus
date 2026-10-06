package app.costesbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class costesbasicos_00 extends GXProcedure
{
   public costesbasicos_00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costesbasicos_00.class ), "" );
   }

   public costesbasicos_00( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        java.math.BigDecimal[] aP17 ,
                        byte aP18 ,
                        byte aP19 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             byte aP18 ,
                             byte aP19 )
   {
      costesbasicos_00.this.A396EmprCod = aP0;
      costesbasicos_00.this.AV8BarCod = aP1;
      costesbasicos_00.this.AV10BarCodReo = aP2;
      costesbasicos_00.this.AV9BarCodPar = aP3;
      costesbasicos_00.this.AV22BarUniMed = aP4;
      costesbasicos_00.this.AV15BarKgm = aP5;
      costesbasicos_00.this.AV16barMtr = aP6;
      costesbasicos_00.this.aP7 = aP7;
      costesbasicos_00.this.aP8 = aP8;
      costesbasicos_00.this.aP9 = aP9;
      costesbasicos_00.this.aP10 = aP10;
      costesbasicos_00.this.aP11 = aP11;
      costesbasicos_00.this.aP12 = aP12;
      costesbasicos_00.this.aP13 = aP13;
      costesbasicos_00.this.aP14 = aP14;
      costesbasicos_00.this.aP15 = aP15;
      costesbasicos_00.this.aP16 = aP16;
      costesbasicos_00.this.aP17 = aP17;
      costesbasicos_00.this.AV110Traza = aP18;
      costesbasicos_00.this.AV121reoperados = aP19;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV78TasasEstandar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TASSTD", ""), GXv_int2) ;
      costesbasicos_00.this.GXt_int1 = GXv_int2[0] ;
      AV78TasasEstandar = GXt_int1 ;
      GXt_int3 = AV122valorTasasEstandar ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "TASSTD", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      costesbasicos_00.this.A396EmprCod = GXv_char4[0] ;
      costesbasicos_00.this.GXt_int3 = GXv_int6[0] ;
      AV122valorTasasEstandar = (short)(GXt_int3) ;
      AV103mAgua = DecimalUtil.doubleToDec(0) ;
      AV102menergia = DecimalUtil.doubleToDec(0) ;
      AV101mgas = DecimalUtil.doubleToDec(0) ;
      AV100mmod = DecimalUtil.doubleToDec(0) ;
      AV99mmoi = DecimalUtil.doubleToDec(0) ;
      AV120costeoperario = DecimalUtil.doubleToDec(0) ;
      Gx_msg = httpContext.getMessage( "UTI006", "") ;
      /* Using cursor P0AT92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0AT92_A130BarCodPar[0] ;
         A132BarCodReo = P0AT92_A132BarCodReo[0] ;
         A129BarCod = P0AT92_A129BarCod[0] ;
         A4443BarFasDTF = P0AT92_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AT92_n4443BarFasDTF[0] ;
         A603MaqCodBis = P0AT92_A603MaqCodBis[0] ;
         A215BarTieRea = P0AT92_A215BarTieRea[0] ;
         A5719BarFasKgT = P0AT92_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P0AT92_n5719BarFasKgT[0] ;
         A3837BarFasKgm = P0AT92_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AT92_n3837BarFasKgm[0] ;
         A5720BarFasMtT = P0AT92_A5720BarFasMtT[0] ;
         n5720BarFasMtT = P0AT92_n5720BarFasMtT[0] ;
         A3838BarFasMtr = P0AT92_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AT92_n3838BarFasMtr[0] ;
         A165BarHorIni = P0AT92_A165BarHorIni[0] ;
         A164BarHorFin = P0AT92_A164BarHorFin[0] ;
         A150BarFacTin = P0AT92_A150BarFacTin[0] ;
         A216BarTieTeo = P0AT92_A216BarTieTeo[0] ;
         A194BarOrdLin = P0AT92_A194BarOrdLin[0] ;
         A758ProCod = P0AT92_A758ProCod[0] ;
         AV123MqCAnyo = (short)(GXutil.year( A4443BarFasDTF)) ;
         AV124MqCmes = (byte)(GXutil.month( A4443BarFasDTF)) ;
         AV17BarOrdLin = A194BarOrdLin ;
         /* Execute user subroutine: 'COSTEOPERARIO' */
         S141 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char5[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int2[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int7[0] = A194BarOrdLin ;
         GXv_int8[0] = AV137Lhipro ;
         new app.prgtolhipro(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int2, GXv_char4, GXv_int7, GXv_int8) ;
         costesbasicos_00.this.A396EmprCod = GXv_char5[0] ;
         costesbasicos_00.this.A129BarCod = GXv_int6[0] ;
         costesbasicos_00.this.A132BarCodReo = GXv_int2[0] ;
         costesbasicos_00.this.A130BarCodPar = GXv_char4[0] ;
         costesbasicos_00.this.A194BarOrdLin = GXv_int7[0] ;
         costesbasicos_00.this.AV137Lhipro = GXv_int8[0] ;
         AV39MaqCod = A603MaqCodBis ;
         AV26CosPrd = DecimalUtil.doubleToDec(0) ;
         AV75CosPrd1 = DecimalUtil.doubleToDec(0) ;
         AV28Coste_m = DecimalUtil.doubleToDec(0) ;
         AV80CostAgua = DecimalUtil.doubleToDec(0) ;
         AV91Costenergia = DecimalUtil.doubleToDec(0) ;
         AV93Costgas = DecimalUtil.doubleToDec(0) ;
         AV94Costmod = DecimalUtil.doubleToDec(0) ;
         AV95Costmoi = DecimalUtil.doubleToDec(0) ;
         AV130Costgi = DecimalUtil.doubleToDec(0) ;
         AV131Costadc = DecimalUtil.doubleToDec(0) ;
         AV132Costam = DecimalUtil.doubleToDec(0) ;
         AV86Coste_mAgua = DecimalUtil.doubleToDec(0) ;
         AV87Coste_menergia = DecimalUtil.doubleToDec(0) ;
         AV88Coste_mgas = DecimalUtil.doubleToDec(0) ;
         AV89Coste_mmod = DecimalUtil.doubleToDec(0) ;
         AV90Coste_mmoi = DecimalUtil.doubleToDec(0) ;
         AV133Coste_mgi = DecimalUtil.doubleToDec(0) ;
         AV134Coste_madc = DecimalUtil.doubleToDec(0) ;
         AV135Coste_mam = DecimalUtil.doubleToDec(0) ;
         if ( ( ( AV137Lhipro == 1 ) && ( AV121reoperados == 1 ) ) || ( (0==AV121reoperados) ) )
         {
            /* Execute user subroutine: 'COSMIN' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV136minutos = (short)(0) ;
         if ( AV38CosTiR == 0 )
         {
            AV43Min = (byte)(DecimalUtil.decToDouble((A215BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
            AV51Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV43Min) ;
            AV20BarTieRea = A215BarTieRea ;
            AV136minutos = (short)(AV51Tiempo_m) ;
         }
         else
         {
            /* Execute user subroutine: 'TIEREA' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV20BarTieRea = DecimalUtil.doubleToDec(GXutil.Int( AV51Tiempo_m/ (double) (60))+(AV51Tiempo_m-(GXutil.Int( AV51Tiempo_m/ (double) (60))*60))/ (double) (100)) ;
            AV136minutos = (short)(AV51Tiempo_m) ;
         }
         AV75CosPrd1 = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV51Tiempo_m).multiply(AV40MaqCosMin)), 2) ;
         AV80CostAgua = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV51Tiempo_m).multiply(AV76MaqAgua)), 2) ;
         AV91Costenergia = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV51Tiempo_m).multiply(AV96MaqEnerg)), 2) ;
         AV93Costgas = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV51Tiempo_m).multiply(AV77MaqGas)), 2) ;
         AV94Costmod = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV51Tiempo_m).multiply(AV97MaqMOD)), 2) ;
         AV95Costmoi = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV51Tiempo_m).multiply(AV98MaqMOI)), 2) ;
         AV130Costgi = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV51Tiempo_m).multiply(AV125MaqGI)), 2) ;
         AV131Costadc = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV51Tiempo_m).multiply(AV126MaqAdCent)), 2) ;
         AV132Costam = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV51Tiempo_m).multiply(AV127MaqAmort)), 2) ;
         if ( GXutil.strcmp(GXutil.trim( AV53TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            if ( GXutil.strcmp(AV22BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV28Coste_m = GXutil.roundDecimal( (AV40MaqCosMin.multiply(AV15BarKgm)), 2) ;
               AV86Coste_mAgua = GXutil.roundDecimal( (AV76MaqAgua.multiply(AV15BarKgm)), 2) ;
               AV87Coste_menergia = GXutil.roundDecimal( (AV96MaqEnerg.multiply(AV15BarKgm)), 2) ;
               AV88Coste_mgas = GXutil.roundDecimal( (AV77MaqGas.multiply(AV15BarKgm)), 2) ;
               AV89Coste_mmod = GXutil.roundDecimal( (AV97MaqMOD.multiply(AV15BarKgm)), 2) ;
               AV90Coste_mmoi = GXutil.roundDecimal( (AV98MaqMOI.multiply(AV15BarKgm)), 2) ;
               AV133Coste_mgi = GXutil.roundDecimal( (AV125MaqGI.multiply(AV15BarKgm)), 2) ;
               AV134Coste_madc = GXutil.roundDecimal( (AV126MaqAdCent.multiply(AV15BarKgm)), 2) ;
               AV135Coste_mam = GXutil.roundDecimal( (AV127MaqAmort.multiply(AV15BarKgm)), 2) ;
            }
            else
            {
               AV28Coste_m = GXutil.roundDecimal( (AV40MaqCosMin.multiply(AV16barMtr)), 2) ;
               AV86Coste_mAgua = GXutil.roundDecimal( (AV76MaqAgua.multiply(AV16barMtr)), 2) ;
               AV87Coste_menergia = GXutil.roundDecimal( (AV96MaqEnerg.multiply(AV16barMtr)), 2) ;
               AV88Coste_mgas = GXutil.roundDecimal( (AV77MaqGas.multiply(AV16barMtr)), 2) ;
               AV89Coste_mmod = GXutil.roundDecimal( (AV97MaqMOD.multiply(AV16barMtr)), 2) ;
               AV90Coste_mmoi = GXutil.roundDecimal( (AV98MaqMOI.multiply(AV16barMtr)), 2) ;
               AV133Coste_mgi = GXutil.roundDecimal( (AV125MaqGI.multiply(AV16barMtr)), 2) ;
               AV134Coste_madc = GXutil.roundDecimal( (AV126MaqAdCent.multiply(AV16barMtr)), 2) ;
               AV135Coste_mam = GXutil.roundDecimal( (AV127MaqAmort.multiply(AV16barMtr)), 2) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV22BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A5719BarFasKgT.doubleValue() > 0 )
               {
                  AV28Coste_m = (AV75CosPrd1.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV86Coste_mAgua = (AV80CostAgua.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV87Coste_menergia = (AV91Costenergia.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV88Coste_mgas = (AV93Costgas.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV89Coste_mmod = (AV94Costmod.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV90Coste_mmoi = (AV95Costmoi.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV133Coste_mgi = (AV130Costgi.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV134Coste_madc = (AV131Costadc.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV135Coste_mam = (AV132Costam.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV62Unidades = A3837BarFasKgm ;
                  AV63Unidadest = A5719BarFasKgT ;
               }
               else
               {
                  if ( AV15BarKgm.doubleValue() > 0 )
                  {
                     AV28Coste_m = (AV75CosPrd1.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV86Coste_mAgua = (AV80CostAgua.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV87Coste_menergia = (AV91Costenergia.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV88Coste_mgas = (AV93Costgas.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV89Coste_mmod = (AV94Costmod.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV90Coste_mmoi = (AV95Costmoi.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV133Coste_mgi = (AV130Costgi.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV134Coste_madc = (AV131Costadc.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV135Coste_mam = (AV132Costam.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV28Coste_m = AV75CosPrd1 ;
                     AV86Coste_mAgua = AV80CostAgua ;
                     AV87Coste_menergia = AV91Costenergia ;
                     AV88Coste_mgas = AV93Costgas ;
                     AV89Coste_mmod = AV94Costmod ;
                     AV90Coste_mmoi = AV95Costmoi ;
                     AV133Coste_mgi = AV130Costgi ;
                     AV134Coste_madc = AV131Costadc ;
                     AV135Coste_mam = AV132Costam ;
                  }
                  AV62Unidades = AV15BarKgm ;
                  AV63Unidadest = AV15BarKgm ;
               }
            }
            else
            {
               if ( A5720BarFasMtT.doubleValue() > 0 )
               {
                  AV28Coste_m = (AV75CosPrd1.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV86Coste_mAgua = (AV80CostAgua.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV87Coste_menergia = (AV91Costenergia.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV88Coste_mgas = (AV93Costgas.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV89Coste_mmod = (AV94Costmod.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV90Coste_mmoi = (AV95Costmoi.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV133Coste_mgi = (AV130Costgi.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV134Coste_madc = (AV131Costadc.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV135Coste_mam = (AV132Costam.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV62Unidades = A3838BarFasMtr ;
                  AV63Unidadest = A5720BarFasMtT ;
               }
               else
               {
                  if ( AV16barMtr.doubleValue() > 0 )
                  {
                     AV28Coste_m = (AV75CosPrd1.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV86Coste_mAgua = (AV80CostAgua.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV87Coste_menergia = (AV91Costenergia.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV88Coste_mgas = (AV93Costgas.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV89Coste_mmod = (AV94Costmod.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV90Coste_mmoi = (AV95Costmoi.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV133Coste_mgi = (AV130Costgi.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV134Coste_madc = (AV131Costadc.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV135Coste_mam = (AV132Costam.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV28Coste_m = AV75CosPrd1 ;
                     AV86Coste_mAgua = AV80CostAgua ;
                     AV87Coste_menergia = AV91Costenergia ;
                     AV88Coste_mgas = AV93Costgas ;
                     AV89Coste_mmod = AV94Costmod ;
                     AV90Coste_mmoi = AV95Costmoi ;
                     AV133Coste_mgi = AV130Costgi ;
                     AV134Coste_madc = AV131Costadc ;
                     AV135Coste_mam = AV132Costam ;
                  }
                  AV62Unidades = AV16barMtr ;
                  AV63Unidadest = AV16barMtr ;
               }
            }
         }
         AV23Ceros4 = "0000" ;
         AV72HorIni = GXutil.str( A165BarHorIni, 4, 0) ;
         AV72HorIni = GXutil.ltrim( GXutil.rtrim( AV72HorIni)) ;
         AV74Lenvar = (short)(GXutil.len( AV72HorIni)) ;
         AV74Lenvar = (short)(4-AV74Lenvar) ;
         AV72HorIni = GXutil.substring( AV23Ceros4, 1, AV74Lenvar) + AV72HorIni ;
         AV73HorIni_5 = GXutil.substring( AV72HorIni, 1, 2) + "." + GXutil.substring( AV72HorIni, 3, 2) ;
         AV70HorFin = GXutil.str( A164BarHorFin, 4, 0) ;
         AV70HorFin = GXutil.ltrim( GXutil.rtrim( AV70HorFin)) ;
         AV74Lenvar = (short)(GXutil.len( AV70HorFin)) ;
         AV74Lenvar = (short)(4-AV74Lenvar) ;
         AV70HorFin = GXutil.substring( AV23Ceros4, 1, AV74Lenvar) + AV70HorFin ;
         AV71HorFin_5 = GXutil.substring( AV70HorFin, 1, 2) + "." + GXutil.substring( AV70HorFin, 3, 2) ;
         AV28Coste_m = ((AV78TasasEstandar==1) ? (AV86Coste_mAgua.add(AV87Coste_menergia).add(AV88Coste_mgas).add(AV89Coste_mmod).add(AV90Coste_mmoi).add(AV133Coste_mgi).add(AV134Coste_madc).add(AV135Coste_mam)) : AV28Coste_m) ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) != 0 )
         {
            AV30Coste_p_k = DecimalUtil.doubleToDec(0) ;
            if ( AV15BarKgm.doubleValue() > 0 )
            {
               AV30Coste_p_k = AV28Coste_m.divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
            }
         }
         else
         {
            AV30Coste_p_k = DecimalUtil.doubleToDec(0) ;
            if ( AV15BarKgm.doubleValue() > 0 )
            {
               AV30Coste_p_k = (AV28Coste_m.add(AV14BarCosPro).add(AV13BarCosAny)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
            }
         }
         if ( AV28Coste_m.doubleValue() > 0 )
         {
            AV27Coste_f = AV27Coste_f.add(AV28Coste_m) ;
         }
         AV52TieTeo = A216BarTieTeo ;
         AV34Coste_tm = DecimalUtil.doubleToDec(0) ;
         AV43Min = (byte)(DecimalUtil.decToDouble((AV52TieTeo.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV52TieTeo))))).multiply(DecimalUtil.doubleToDec(100)))) ;
         AV26CosPrd = GXutil.roundDecimal( (DecimalUtil.doubleToDec(((GXutil.Int( DecimalUtil.decToDouble(AV52TieTeo))*60)+AV43Min)).multiply(AV40MaqCosMin)), 2) ;
         if ( GXutil.strcmp(GXutil.trim( AV53TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            if ( GXutil.strcmp(AV22BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV34Coste_tm = GXutil.roundDecimal( (AV40MaqCosMin.multiply(AV15BarKgm)), 2) ;
            }
            else
            {
               AV34Coste_tm = GXutil.roundDecimal( (AV40MaqCosMin.multiply(AV16barMtr)), 2) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV22BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A5719BarFasKgT.doubleValue() > 0 )
               {
                  AV34Coste_tm = (AV26CosPrd.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV34Coste_tm = AV26CosPrd ;
               }
            }
            else
            {
               if ( A5720BarFasMtT.doubleValue() > 0 )
               {
                  AV34Coste_tm = (AV26CosPrd.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV34Coste_tm = AV26CosPrd ;
               }
            }
         }
         if ( AV34Coste_tm.doubleValue() > 0 )
         {
            AV33Coste_teo = AV33Coste_teo.add(AV34Coste_tm) ;
         }
         AV103mAgua = AV103mAgua.add(AV86Coste_mAgua) ;
         AV102menergia = AV102menergia.add(AV87Coste_menergia) ;
         AV101mgas = AV101mgas.add(AV88Coste_mgas) ;
         AV100mmod = AV100mmod.add(AV89Coste_mmod) ;
         AV99mmoi = AV99mmoi.add(AV90Coste_mmoi) ;
         AV119mgi = AV119mgi.add(AV133Coste_mgi) ;
         AV117madc = AV117madc.add(AV134Coste_madc) ;
         AV118mam = AV118mam.add(AV135Coste_mam) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'TIEPAR' Routine */
      returnInSub = false ;
      AV51Tiempo_m = 0 ;
      /* Using cursor P0AT93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, Short.valueOf(AV17BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A556HisProEst = P0AT93_A556HisProEst[0] ;
         A656ParCod = P0AT93_A656ParCod[0] ;
         n656ParCod = P0AT93_n656ParCod[0] ;
         A194BarOrdLin = P0AT93_A194BarOrdLin[0] ;
         A130BarCodPar = P0AT93_A130BarCodPar[0] ;
         A132BarCodReo = P0AT93_A132BarCodReo[0] ;
         A129BarCod = P0AT93_A129BarCod[0] ;
         A561HisProLin = P0AT93_A561HisProLin[0] ;
         A558HisProFec = P0AT93_A558HisProFec[0] ;
         A4440HisProDTI = P0AT93_A4440HisProDTI[0] ;
         n4440HisProDTI = P0AT93_n4440HisProDTI[0] ;
         A4441HisProDTF = P0AT93_A4441HisProDTF[0] ;
         n4441HisProDTF = P0AT93_n4441HisProDTF[0] ;
         A602MaqCod = P0AT93_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV51Tiempo_m = (int)(AV51Tiempo_m+A5605HisProTr2) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'TIEREA' Routine */
      returnInSub = false ;
      AV51Tiempo_m = 0 ;
      /* Using cursor P0AT94 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, Short.valueOf(AV17BarOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A556HisProEst = P0AT94_A556HisProEst[0] ;
         A656ParCod = P0AT94_A656ParCod[0] ;
         n656ParCod = P0AT94_n656ParCod[0] ;
         A194BarOrdLin = P0AT94_A194BarOrdLin[0] ;
         A130BarCodPar = P0AT94_A130BarCodPar[0] ;
         A132BarCodReo = P0AT94_A132BarCodReo[0] ;
         A129BarCod = P0AT94_A129BarCod[0] ;
         A561HisProLin = P0AT94_A561HisProLin[0] ;
         A558HisProFec = P0AT94_A558HisProFec[0] ;
         A4440HisProDTI = P0AT94_A4440HisProDTI[0] ;
         n4440HisProDTI = P0AT94_n4440HisProDTI[0] ;
         A4441HisProDTF = P0AT94_A4441HisProDTF[0] ;
         n4441HisProDTF = P0AT94_n4441HisProDTF[0] ;
         A602MaqCod = P0AT94_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV51Tiempo_m = (int)(AV51Tiempo_m+A5605HisProTr2) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'COSMIN' Routine */
      returnInSub = false ;
      AV40MaqCosMin = DecimalUtil.doubleToDec(0) ;
      AV41maqDsc = "" ;
      AV97MaqMOD = DecimalUtil.doubleToDec(0) ;
      AV98MaqMOI = DecimalUtil.doubleToDec(0) ;
      AV96MaqEnerg = DecimalUtil.doubleToDec(0) ;
      AV77MaqGas = DecimalUtil.doubleToDec(0) ;
      AV76MaqAgua = DecimalUtil.doubleToDec(0) ;
      AV125MaqGI = DecimalUtil.doubleToDec(0) ;
      AV126MaqAdCent = DecimalUtil.doubleToDec(0) ;
      AV127MaqAmort = DecimalUtil.doubleToDec(0) ;
      AV53TipmaqCod = "" ;
      /* Using cursor P0AT95 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV39MaqCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A602MaqCod = P0AT95_A602MaqCod[0] ;
         A606MaqDsc = P0AT95_A606MaqDsc[0] ;
         n606MaqDsc = P0AT95_n606MaqDsc[0] ;
         A1011TipMaqCod = P0AT95_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0AT95_n1011TipMaqCod[0] ;
         A11821MaqMOD = P0AT95_A11821MaqMOD[0] ;
         n11821MaqMOD = P0AT95_n11821MaqMOD[0] ;
         A11822MaqMOI = P0AT95_A11822MaqMOI[0] ;
         n11822MaqMOI = P0AT95_n11822MaqMOI[0] ;
         A11823MaqEnerg = P0AT95_A11823MaqEnerg[0] ;
         n11823MaqEnerg = P0AT95_n11823MaqEnerg[0] ;
         A11824MaqGas = P0AT95_A11824MaqGas[0] ;
         n11824MaqGas = P0AT95_n11824MaqGas[0] ;
         A11825MaqAgua = P0AT95_A11825MaqAgua[0] ;
         n11825MaqAgua = P0AT95_n11825MaqAgua[0] ;
         A14531MaqGI = P0AT95_A14531MaqGI[0] ;
         A14532MaqAdCent = P0AT95_A14532MaqAdCent[0] ;
         A14533MaqAmort = P0AT95_A14533MaqAmort[0] ;
         A605MaqCosMin = P0AT95_A605MaqCosMin[0] ;
         n605MaqCosMin = P0AT95_n605MaqCosMin[0] ;
         AV41maqDsc = A606MaqDsc ;
         AV53TipmaqCod = A1011TipMaqCod ;
         if ( AV78TasasEstandar == 1 )
         {
            AV97MaqMOD = A11821MaqMOD ;
            AV98MaqMOI = A11822MaqMOI ;
            AV96MaqEnerg = A11823MaqEnerg ;
            AV77MaqGas = A11824MaqGas ;
            AV76MaqAgua = A11825MaqAgua ;
            AV125MaqGI = A14531MaqGI ;
            AV126MaqAdCent = A14532MaqAdCent ;
            AV127MaqAmort = A14533MaqAmort ;
            if ( AV122valorTasasEstandar == 1 )
            {
               /* Using cursor P0AT96 */
               pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(AV123MqCAnyo), Byte.valueOf(AV124MqCmes)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A14530MqCMes = P0AT96_A14530MqCMes[0] ;
                  A14529MqCAnyo = P0AT96_A14529MqCAnyo[0] ;
                  A14535MqCMod = P0AT96_A14535MqCMod[0] ;
                  n14535MqCMod = P0AT96_n14535MqCMod[0] ;
                  A14536MqCMoi = P0AT96_A14536MqCMoi[0] ;
                  n14536MqCMoi = P0AT96_n14536MqCMoi[0] ;
                  A14537MqCEner = P0AT96_A14537MqCEner[0] ;
                  n14537MqCEner = P0AT96_n14537MqCEner[0] ;
                  A14538MqCGas = P0AT96_A14538MqCGas[0] ;
                  n14538MqCGas = P0AT96_n14538MqCGas[0] ;
                  A14539MqCAgua = P0AT96_A14539MqCAgua[0] ;
                  n14539MqCAgua = P0AT96_n14539MqCAgua[0] ;
                  A14543MqCgi = P0AT96_A14543MqCgi[0] ;
                  n14543MqCgi = P0AT96_n14543MqCgi[0] ;
                  A14540MqCAdCt = P0AT96_A14540MqCAdCt[0] ;
                  n14540MqCAdCt = P0AT96_n14540MqCAdCt[0] ;
                  A14541MqCAmo = P0AT96_A14541MqCAmo[0] ;
                  n14541MqCAmo = P0AT96_n14541MqCAmo[0] ;
                  AV97MaqMOD = A14535MqCMod ;
                  AV98MaqMOI = A14536MqCMoi ;
                  AV96MaqEnerg = A14537MqCEner ;
                  AV77MaqGas = A14538MqCGas ;
                  AV76MaqAgua = A14539MqCAgua ;
                  AV125MaqGI = A14543MqCgi ;
                  AV126MaqAdCent = A14540MqCAdCt ;
                  AV127MaqAmort = A14541MqCAmo ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(4);
            }
         }
         AV40MaqCosMin = ((AV78TasasEstandar>0) ? (AV97MaqMOD.add(AV98MaqMOI).add(AV96MaqEnerg).add(AV77MaqGas).add(AV76MaqAgua).add(AV125MaqGI).add(AV126MaqAdCent).add(AV127MaqAmort)) : A605MaqCosMin) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S141( )
   {
      /* 'COSTEOPERARIO' Routine */
      returnInSub = false ;
      /* Using cursor P0AT97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, Short.valueOf(AV17BarOrdLin)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A556HisProEst = P0AT97_A556HisProEst[0] ;
         A656ParCod = P0AT97_A656ParCod[0] ;
         n656ParCod = P0AT97_n656ParCod[0] ;
         A194BarOrdLin = P0AT97_A194BarOrdLin[0] ;
         A130BarCodPar = P0AT97_A130BarCodPar[0] ;
         A132BarCodReo = P0AT97_A132BarCodReo[0] ;
         A129BarCod = P0AT97_A129BarCod[0] ;
         A561HisProLin = P0AT97_A561HisProLin[0] ;
         A558HisProFec = P0AT97_A558HisProFec[0] ;
         A503GruOpeCod = P0AT97_A503GruOpeCod[0] ;
         A4440HisProDTI = P0AT97_A4440HisProDTI[0] ;
         n4440HisProDTI = P0AT97_n4440HisProDTI[0] ;
         A4441HisProDTF = P0AT97_A4441HisProDTF[0] ;
         n4441HisProDTF = P0AT97_n4441HisProDTF[0] ;
         A602MaqCod = P0AT97_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV128GruOpeCod = A503GruOpeCod ;
         /* Execute user subroutine: 'OPERARIO' */
         S157 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         AV120costeoperario = AV120costeoperario.add((DecimalUtil.doubleToDec((A5605HisProTr2/ (double) (60))).multiply(AV129OpePreHor))) ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S157( )
   {
      /* 'OPERARIO' Routine */
      returnInSub = false ;
      AV129OpePreHor = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AT98 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV128GruOpeCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A652OpeCod = P0AT98_A652OpeCod[0] ;
         A2505OpePreHor = P0AT98_A2505OpePreHor[0] ;
         n2505OpePreHor = P0AT98_n2505OpePreHor[0] ;
         AV129OpePreHor = A2505OpePreHor ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP7[0] = costesbasicos_00.this.AV27Coste_f;
      this.aP8[0] = costesbasicos_00.this.AV33Coste_teo;
      this.aP9[0] = costesbasicos_00.this.AV103mAgua;
      this.aP10[0] = costesbasicos_00.this.AV102menergia;
      this.aP11[0] = costesbasicos_00.this.AV101mgas;
      this.aP12[0] = costesbasicos_00.this.AV100mmod;
      this.aP13[0] = costesbasicos_00.this.AV99mmoi;
      this.aP14[0] = costesbasicos_00.this.AV117madc;
      this.aP15[0] = costesbasicos_00.this.AV118mam;
      this.aP16[0] = costesbasicos_00.this.AV119mgi;
      this.aP17[0] = costesbasicos_00.this.AV120costeoperario;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Coste_f = DecimalUtil.ZERO ;
      AV33Coste_teo = DecimalUtil.ZERO ;
      AV103mAgua = DecimalUtil.ZERO ;
      AV102menergia = DecimalUtil.ZERO ;
      AV101mgas = DecimalUtil.ZERO ;
      AV100mmod = DecimalUtil.ZERO ;
      AV99mmoi = DecimalUtil.ZERO ;
      AV117madc = DecimalUtil.ZERO ;
      AV118mam = DecimalUtil.ZERO ;
      AV119mgi = DecimalUtil.ZERO ;
      AV120costeoperario = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      P0AT92_A396EmprCod = new String[] {""} ;
      P0AT92_A130BarCodPar = new String[] {""} ;
      P0AT92_A132BarCodReo = new byte[1] ;
      P0AT92_A129BarCod = new int[1] ;
      P0AT92_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT92_n4443BarFasDTF = new boolean[] {false} ;
      P0AT92_A603MaqCodBis = new String[] {""} ;
      P0AT92_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT92_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT92_n5719BarFasKgT = new boolean[] {false} ;
      P0AT92_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT92_n3837BarFasKgm = new boolean[] {false} ;
      P0AT92_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT92_n5720BarFasMtT = new boolean[] {false} ;
      P0AT92_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT92_n3838BarFasMtr = new boolean[] {false} ;
      P0AT92_A165BarHorIni = new short[1] ;
      P0AT92_A164BarHorFin = new short[1] ;
      P0AT92_A150BarFacTin = new String[] {""} ;
      P0AT92_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT92_A194BarOrdLin = new short[1] ;
      P0AT92_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A603MaqCodBis = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A150BarFacTin = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_int8 = new byte[1] ;
      AV39MaqCod = "" ;
      AV26CosPrd = DecimalUtil.ZERO ;
      AV75CosPrd1 = DecimalUtil.ZERO ;
      AV28Coste_m = DecimalUtil.ZERO ;
      AV80CostAgua = DecimalUtil.ZERO ;
      AV91Costenergia = DecimalUtil.ZERO ;
      AV93Costgas = DecimalUtil.ZERO ;
      AV94Costmod = DecimalUtil.ZERO ;
      AV95Costmoi = DecimalUtil.ZERO ;
      AV130Costgi = DecimalUtil.ZERO ;
      AV131Costadc = DecimalUtil.ZERO ;
      AV132Costam = DecimalUtil.ZERO ;
      AV86Coste_mAgua = DecimalUtil.ZERO ;
      AV87Coste_menergia = DecimalUtil.ZERO ;
      AV88Coste_mgas = DecimalUtil.ZERO ;
      AV89Coste_mmod = DecimalUtil.ZERO ;
      AV90Coste_mmoi = DecimalUtil.ZERO ;
      AV133Coste_mgi = DecimalUtil.ZERO ;
      AV134Coste_madc = DecimalUtil.ZERO ;
      AV135Coste_mam = DecimalUtil.ZERO ;
      AV20BarTieRea = DecimalUtil.ZERO ;
      AV40MaqCosMin = DecimalUtil.ZERO ;
      AV76MaqAgua = DecimalUtil.ZERO ;
      AV96MaqEnerg = DecimalUtil.ZERO ;
      AV77MaqGas = DecimalUtil.ZERO ;
      AV97MaqMOD = DecimalUtil.ZERO ;
      AV98MaqMOI = DecimalUtil.ZERO ;
      AV125MaqGI = DecimalUtil.ZERO ;
      AV126MaqAdCent = DecimalUtil.ZERO ;
      AV127MaqAmort = DecimalUtil.ZERO ;
      AV53TipmaqCod = "" ;
      AV62Unidades = DecimalUtil.ZERO ;
      AV63Unidadest = DecimalUtil.ZERO ;
      AV23Ceros4 = "" ;
      AV72HorIni = "" ;
      AV73HorIni_5 = "" ;
      AV70HorFin = "" ;
      AV71HorFin_5 = "" ;
      AV30Coste_p_k = DecimalUtil.ZERO ;
      AV14BarCosPro = DecimalUtil.ZERO ;
      AV13BarCosAny = DecimalUtil.ZERO ;
      AV52TieTeo = DecimalUtil.ZERO ;
      AV34Coste_tm = DecimalUtil.ZERO ;
      P0AT93_A396EmprCod = new String[] {""} ;
      P0AT93_A556HisProEst = new byte[1] ;
      P0AT93_A656ParCod = new short[1] ;
      P0AT93_n656ParCod = new boolean[] {false} ;
      P0AT93_A194BarOrdLin = new short[1] ;
      P0AT93_A130BarCodPar = new String[] {""} ;
      P0AT93_A132BarCodReo = new byte[1] ;
      P0AT93_A129BarCod = new int[1] ;
      P0AT93_A561HisProLin = new int[1] ;
      P0AT93_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT93_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT93_n4440HisProDTI = new boolean[] {false} ;
      P0AT93_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT93_n4441HisProDTF = new boolean[] {false} ;
      P0AT93_A602MaqCod = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      P0AT94_A396EmprCod = new String[] {""} ;
      P0AT94_A556HisProEst = new byte[1] ;
      P0AT94_A656ParCod = new short[1] ;
      P0AT94_n656ParCod = new boolean[] {false} ;
      P0AT94_A194BarOrdLin = new short[1] ;
      P0AT94_A130BarCodPar = new String[] {""} ;
      P0AT94_A132BarCodReo = new byte[1] ;
      P0AT94_A129BarCod = new int[1] ;
      P0AT94_A561HisProLin = new int[1] ;
      P0AT94_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT94_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT94_n4440HisProDTI = new boolean[] {false} ;
      P0AT94_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT94_n4441HisProDTF = new boolean[] {false} ;
      P0AT94_A602MaqCod = new String[] {""} ;
      AV41maqDsc = "" ;
      P0AT95_A396EmprCod = new String[] {""} ;
      P0AT95_A602MaqCod = new String[] {""} ;
      P0AT95_A606MaqDsc = new String[] {""} ;
      P0AT95_n606MaqDsc = new boolean[] {false} ;
      P0AT95_A1011TipMaqCod = new String[] {""} ;
      P0AT95_n1011TipMaqCod = new boolean[] {false} ;
      P0AT95_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT95_n11821MaqMOD = new boolean[] {false} ;
      P0AT95_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT95_n11822MaqMOI = new boolean[] {false} ;
      P0AT95_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT95_n11823MaqEnerg = new boolean[] {false} ;
      P0AT95_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT95_n11824MaqGas = new boolean[] {false} ;
      P0AT95_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT95_n11825MaqAgua = new boolean[] {false} ;
      P0AT95_A14531MaqGI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT95_A14532MaqAdCent = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT95_A14533MaqAmort = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT95_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT95_n605MaqCosMin = new boolean[] {false} ;
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
      P0AT96_A396EmprCod = new String[] {""} ;
      P0AT96_A602MaqCod = new String[] {""} ;
      P0AT96_A14530MqCMes = new byte[1] ;
      P0AT96_A14529MqCAnyo = new short[1] ;
      P0AT96_A14535MqCMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT96_n14535MqCMod = new boolean[] {false} ;
      P0AT96_A14536MqCMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT96_n14536MqCMoi = new boolean[] {false} ;
      P0AT96_A14537MqCEner = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT96_n14537MqCEner = new boolean[] {false} ;
      P0AT96_A14538MqCGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT96_n14538MqCGas = new boolean[] {false} ;
      P0AT96_A14539MqCAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT96_n14539MqCAgua = new boolean[] {false} ;
      P0AT96_A14543MqCgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT96_n14543MqCgi = new boolean[] {false} ;
      P0AT96_A14540MqCAdCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT96_n14540MqCAdCt = new boolean[] {false} ;
      P0AT96_A14541MqCAmo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT96_n14541MqCAmo = new boolean[] {false} ;
      A14535MqCMod = DecimalUtil.ZERO ;
      A14536MqCMoi = DecimalUtil.ZERO ;
      A14537MqCEner = DecimalUtil.ZERO ;
      A14538MqCGas = DecimalUtil.ZERO ;
      A14539MqCAgua = DecimalUtil.ZERO ;
      A14543MqCgi = DecimalUtil.ZERO ;
      A14540MqCAdCt = DecimalUtil.ZERO ;
      A14541MqCAmo = DecimalUtil.ZERO ;
      P0AT97_A396EmprCod = new String[] {""} ;
      P0AT97_A556HisProEst = new byte[1] ;
      P0AT97_A656ParCod = new short[1] ;
      P0AT97_n656ParCod = new boolean[] {false} ;
      P0AT97_A194BarOrdLin = new short[1] ;
      P0AT97_A130BarCodPar = new String[] {""} ;
      P0AT97_A132BarCodReo = new byte[1] ;
      P0AT97_A129BarCod = new int[1] ;
      P0AT97_A561HisProLin = new int[1] ;
      P0AT97_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT97_A503GruOpeCod = new int[1] ;
      P0AT97_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT97_n4440HisProDTI = new boolean[] {false} ;
      P0AT97_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT97_n4441HisProDTF = new boolean[] {false} ;
      P0AT97_A602MaqCod = new String[] {""} ;
      AV129OpePreHor = DecimalUtil.ZERO ;
      P0AT98_A396EmprCod = new String[] {""} ;
      P0AT98_A652OpeCod = new int[1] ;
      P0AT98_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT98_n2505OpePreHor = new boolean[] {false} ;
      A2505OpePreHor = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.costesbasicos_00__default(),
         new Object[] {
             new Object[] {
            P0AT92_A396EmprCod, P0AT92_A130BarCodPar, P0AT92_A132BarCodReo, P0AT92_A129BarCod, P0AT92_A4443BarFasDTF, P0AT92_n4443BarFasDTF, P0AT92_A603MaqCodBis, P0AT92_A215BarTieRea, P0AT92_A5719BarFasKgT, P0AT92_n5719BarFasKgT,
            P0AT92_A3837BarFasKgm, P0AT92_n3837BarFasKgm, P0AT92_A5720BarFasMtT, P0AT92_n5720BarFasMtT, P0AT92_A3838BarFasMtr, P0AT92_n3838BarFasMtr, P0AT92_A165BarHorIni, P0AT92_A164BarHorFin, P0AT92_A150BarFacTin, P0AT92_A216BarTieTeo,
            P0AT92_A194BarOrdLin, P0AT92_A758ProCod
            }
            , new Object[] {
            P0AT93_A396EmprCod, P0AT93_A556HisProEst, P0AT93_A656ParCod, P0AT93_n656ParCod, P0AT93_A194BarOrdLin, P0AT93_A130BarCodPar, P0AT93_A132BarCodReo, P0AT93_A129BarCod, P0AT93_A561HisProLin, P0AT93_A558HisProFec,
            P0AT93_A4440HisProDTI, P0AT93_n4440HisProDTI, P0AT93_A4441HisProDTF, P0AT93_n4441HisProDTF, P0AT93_A602MaqCod
            }
            , new Object[] {
            P0AT94_A396EmprCod, P0AT94_A556HisProEst, P0AT94_A656ParCod, P0AT94_n656ParCod, P0AT94_A194BarOrdLin, P0AT94_A130BarCodPar, P0AT94_A132BarCodReo, P0AT94_A129BarCod, P0AT94_A561HisProLin, P0AT94_A558HisProFec,
            P0AT94_A4440HisProDTI, P0AT94_n4440HisProDTI, P0AT94_A4441HisProDTF, P0AT94_n4441HisProDTF, P0AT94_A602MaqCod
            }
            , new Object[] {
            P0AT95_A396EmprCod, P0AT95_A602MaqCod, P0AT95_A606MaqDsc, P0AT95_n606MaqDsc, P0AT95_A1011TipMaqCod, P0AT95_n1011TipMaqCod, P0AT95_A11821MaqMOD, P0AT95_n11821MaqMOD, P0AT95_A11822MaqMOI, P0AT95_n11822MaqMOI,
            P0AT95_A11823MaqEnerg, P0AT95_n11823MaqEnerg, P0AT95_A11824MaqGas, P0AT95_n11824MaqGas, P0AT95_A11825MaqAgua, P0AT95_n11825MaqAgua, P0AT95_A14531MaqGI, P0AT95_A14532MaqAdCent, P0AT95_A14533MaqAmort, P0AT95_A605MaqCosMin,
            P0AT95_n605MaqCosMin
            }
            , new Object[] {
            P0AT96_A396EmprCod, P0AT96_A602MaqCod, P0AT96_A14530MqCMes, P0AT96_A14529MqCAnyo, P0AT96_A14535MqCMod, P0AT96_n14535MqCMod, P0AT96_A14536MqCMoi, P0AT96_n14536MqCMoi, P0AT96_A14537MqCEner, P0AT96_n14537MqCEner,
            P0AT96_A14538MqCGas, P0AT96_n14538MqCGas, P0AT96_A14539MqCAgua, P0AT96_n14539MqCAgua, P0AT96_A14543MqCgi, P0AT96_n14543MqCgi, P0AT96_A14540MqCAdCt, P0AT96_n14540MqCAdCt, P0AT96_A14541MqCAmo, P0AT96_n14541MqCAmo
            }
            , new Object[] {
            P0AT97_A396EmprCod, P0AT97_A556HisProEst, P0AT97_A656ParCod, P0AT97_n656ParCod, P0AT97_A194BarOrdLin, P0AT97_A130BarCodPar, P0AT97_A132BarCodReo, P0AT97_A129BarCod, P0AT97_A561HisProLin, P0AT97_A558HisProFec,
            P0AT97_A503GruOpeCod, P0AT97_A4440HisProDTI, P0AT97_n4440HisProDTI, P0AT97_A4441HisProDTF, P0AT97_n4441HisProDTF, P0AT97_A602MaqCod
            }
            , new Object[] {
            P0AT98_A396EmprCod, P0AT98_A652OpeCod, P0AT98_A2505OpePreHor, P0AT98_n2505OpePreHor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte AV110Traza ;
   private byte AV121reoperados ;
   private byte AV78TasasEstandar ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte AV124MqCmes ;
   private byte GXv_int2[] ;
   private byte AV137Lhipro ;
   private byte GXv_int8[] ;
   private byte AV38CosTiR ;
   private byte AV43Min ;
   private byte A556HisProEst ;
   private byte A14530MqCMes ;
   private short AV122valorTasasEstandar ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A194BarOrdLin ;
   private short AV123MqCAnyo ;
   private short AV17BarOrdLin ;
   private short GXv_int7[] ;
   private short AV136minutos ;
   private short AV74Lenvar ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short A14529MqCAnyo ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int GXt_int3 ;
   private int A129BarCod ;
   private int GXv_int6[] ;
   private int AV51Tiempo_m ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int AV128GruOpeCod ;
   private int A652OpeCod ;
   private java.math.BigDecimal AV15BarKgm ;
   private java.math.BigDecimal AV16barMtr ;
   private java.math.BigDecimal AV27Coste_f ;
   private java.math.BigDecimal AV33Coste_teo ;
   private java.math.BigDecimal AV103mAgua ;
   private java.math.BigDecimal AV102menergia ;
   private java.math.BigDecimal AV101mgas ;
   private java.math.BigDecimal AV100mmod ;
   private java.math.BigDecimal AV99mmoi ;
   private java.math.BigDecimal AV117madc ;
   private java.math.BigDecimal AV118mam ;
   private java.math.BigDecimal AV119mgi ;
   private java.math.BigDecimal AV120costeoperario ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal AV26CosPrd ;
   private java.math.BigDecimal AV75CosPrd1 ;
   private java.math.BigDecimal AV28Coste_m ;
   private java.math.BigDecimal AV80CostAgua ;
   private java.math.BigDecimal AV91Costenergia ;
   private java.math.BigDecimal AV93Costgas ;
   private java.math.BigDecimal AV94Costmod ;
   private java.math.BigDecimal AV95Costmoi ;
   private java.math.BigDecimal AV130Costgi ;
   private java.math.BigDecimal AV131Costadc ;
   private java.math.BigDecimal AV132Costam ;
   private java.math.BigDecimal AV86Coste_mAgua ;
   private java.math.BigDecimal AV87Coste_menergia ;
   private java.math.BigDecimal AV88Coste_mgas ;
   private java.math.BigDecimal AV89Coste_mmod ;
   private java.math.BigDecimal AV90Coste_mmoi ;
   private java.math.BigDecimal AV133Coste_mgi ;
   private java.math.BigDecimal AV134Coste_madc ;
   private java.math.BigDecimal AV135Coste_mam ;
   private java.math.BigDecimal AV20BarTieRea ;
   private java.math.BigDecimal AV40MaqCosMin ;
   private java.math.BigDecimal AV76MaqAgua ;
   private java.math.BigDecimal AV96MaqEnerg ;
   private java.math.BigDecimal AV77MaqGas ;
   private java.math.BigDecimal AV97MaqMOD ;
   private java.math.BigDecimal AV98MaqMOI ;
   private java.math.BigDecimal AV125MaqGI ;
   private java.math.BigDecimal AV126MaqAdCent ;
   private java.math.BigDecimal AV127MaqAmort ;
   private java.math.BigDecimal AV62Unidades ;
   private java.math.BigDecimal AV63Unidadest ;
   private java.math.BigDecimal AV30Coste_p_k ;
   private java.math.BigDecimal AV14BarCosPro ;
   private java.math.BigDecimal AV13BarCosAny ;
   private java.math.BigDecimal AV52TieTeo ;
   private java.math.BigDecimal AV34Coste_tm ;
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
   private java.math.BigDecimal AV129OpePreHor ;
   private java.math.BigDecimal A2505OpePreHor ;
   private String A396EmprCod ;
   private String AV9BarCodPar ;
   private String AV22BarUniMed ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String AV39MaqCod ;
   private String AV53TipmaqCod ;
   private String AV23Ceros4 ;
   private String AV72HorIni ;
   private String AV73HorIni_5 ;
   private String AV70HorFin ;
   private String AV71HorFin_5 ;
   private String A602MaqCod ;
   private String AV41maqDsc ;
   private String A606MaqDsc ;
   private String A1011TipMaqCod ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean n4443BarFasDTF ;
   private boolean n5719BarFasKgT ;
   private boolean n3837BarFasKgm ;
   private boolean n5720BarFasMtT ;
   private boolean n3838BarFasMtr ;
   private boolean returnInSub ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
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
   private boolean n2505OpePreHor ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private java.math.BigDecimal[] aP17 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AT92_A396EmprCod ;
   private String[] P0AT92_A130BarCodPar ;
   private byte[] P0AT92_A132BarCodReo ;
   private int[] P0AT92_A129BarCod ;
   private java.util.Date[] P0AT92_A4443BarFasDTF ;
   private boolean[] P0AT92_n4443BarFasDTF ;
   private String[] P0AT92_A603MaqCodBis ;
   private java.math.BigDecimal[] P0AT92_A215BarTieRea ;
   private java.math.BigDecimal[] P0AT92_A5719BarFasKgT ;
   private boolean[] P0AT92_n5719BarFasKgT ;
   private java.math.BigDecimal[] P0AT92_A3837BarFasKgm ;
   private boolean[] P0AT92_n3837BarFasKgm ;
   private java.math.BigDecimal[] P0AT92_A5720BarFasMtT ;
   private boolean[] P0AT92_n5720BarFasMtT ;
   private java.math.BigDecimal[] P0AT92_A3838BarFasMtr ;
   private boolean[] P0AT92_n3838BarFasMtr ;
   private short[] P0AT92_A165BarHorIni ;
   private short[] P0AT92_A164BarHorFin ;
   private String[] P0AT92_A150BarFacTin ;
   private java.math.BigDecimal[] P0AT92_A216BarTieTeo ;
   private short[] P0AT92_A194BarOrdLin ;
   private String[] P0AT92_A758ProCod ;
   private String[] P0AT93_A396EmprCod ;
   private byte[] P0AT93_A556HisProEst ;
   private short[] P0AT93_A656ParCod ;
   private boolean[] P0AT93_n656ParCod ;
   private short[] P0AT93_A194BarOrdLin ;
   private String[] P0AT93_A130BarCodPar ;
   private byte[] P0AT93_A132BarCodReo ;
   private int[] P0AT93_A129BarCod ;
   private int[] P0AT93_A561HisProLin ;
   private java.util.Date[] P0AT93_A558HisProFec ;
   private java.util.Date[] P0AT93_A4440HisProDTI ;
   private boolean[] P0AT93_n4440HisProDTI ;
   private java.util.Date[] P0AT93_A4441HisProDTF ;
   private boolean[] P0AT93_n4441HisProDTF ;
   private String[] P0AT93_A602MaqCod ;
   private String[] P0AT94_A396EmprCod ;
   private byte[] P0AT94_A556HisProEst ;
   private short[] P0AT94_A656ParCod ;
   private boolean[] P0AT94_n656ParCod ;
   private short[] P0AT94_A194BarOrdLin ;
   private String[] P0AT94_A130BarCodPar ;
   private byte[] P0AT94_A132BarCodReo ;
   private int[] P0AT94_A129BarCod ;
   private int[] P0AT94_A561HisProLin ;
   private java.util.Date[] P0AT94_A558HisProFec ;
   private java.util.Date[] P0AT94_A4440HisProDTI ;
   private boolean[] P0AT94_n4440HisProDTI ;
   private java.util.Date[] P0AT94_A4441HisProDTF ;
   private boolean[] P0AT94_n4441HisProDTF ;
   private String[] P0AT94_A602MaqCod ;
   private String[] P0AT95_A396EmprCod ;
   private String[] P0AT95_A602MaqCod ;
   private String[] P0AT95_A606MaqDsc ;
   private boolean[] P0AT95_n606MaqDsc ;
   private String[] P0AT95_A1011TipMaqCod ;
   private boolean[] P0AT95_n1011TipMaqCod ;
   private java.math.BigDecimal[] P0AT95_A11821MaqMOD ;
   private boolean[] P0AT95_n11821MaqMOD ;
   private java.math.BigDecimal[] P0AT95_A11822MaqMOI ;
   private boolean[] P0AT95_n11822MaqMOI ;
   private java.math.BigDecimal[] P0AT95_A11823MaqEnerg ;
   private boolean[] P0AT95_n11823MaqEnerg ;
   private java.math.BigDecimal[] P0AT95_A11824MaqGas ;
   private boolean[] P0AT95_n11824MaqGas ;
   private java.math.BigDecimal[] P0AT95_A11825MaqAgua ;
   private boolean[] P0AT95_n11825MaqAgua ;
   private java.math.BigDecimal[] P0AT95_A14531MaqGI ;
   private java.math.BigDecimal[] P0AT95_A14532MaqAdCent ;
   private java.math.BigDecimal[] P0AT95_A14533MaqAmort ;
   private java.math.BigDecimal[] P0AT95_A605MaqCosMin ;
   private boolean[] P0AT95_n605MaqCosMin ;
   private String[] P0AT96_A396EmprCod ;
   private String[] P0AT96_A602MaqCod ;
   private byte[] P0AT96_A14530MqCMes ;
   private short[] P0AT96_A14529MqCAnyo ;
   private java.math.BigDecimal[] P0AT96_A14535MqCMod ;
   private boolean[] P0AT96_n14535MqCMod ;
   private java.math.BigDecimal[] P0AT96_A14536MqCMoi ;
   private boolean[] P0AT96_n14536MqCMoi ;
   private java.math.BigDecimal[] P0AT96_A14537MqCEner ;
   private boolean[] P0AT96_n14537MqCEner ;
   private java.math.BigDecimal[] P0AT96_A14538MqCGas ;
   private boolean[] P0AT96_n14538MqCGas ;
   private java.math.BigDecimal[] P0AT96_A14539MqCAgua ;
   private boolean[] P0AT96_n14539MqCAgua ;
   private java.math.BigDecimal[] P0AT96_A14543MqCgi ;
   private boolean[] P0AT96_n14543MqCgi ;
   private java.math.BigDecimal[] P0AT96_A14540MqCAdCt ;
   private boolean[] P0AT96_n14540MqCAdCt ;
   private java.math.BigDecimal[] P0AT96_A14541MqCAmo ;
   private boolean[] P0AT96_n14541MqCAmo ;
   private String[] P0AT97_A396EmprCod ;
   private byte[] P0AT97_A556HisProEst ;
   private short[] P0AT97_A656ParCod ;
   private boolean[] P0AT97_n656ParCod ;
   private short[] P0AT97_A194BarOrdLin ;
   private String[] P0AT97_A130BarCodPar ;
   private byte[] P0AT97_A132BarCodReo ;
   private int[] P0AT97_A129BarCod ;
   private int[] P0AT97_A561HisProLin ;
   private java.util.Date[] P0AT97_A558HisProFec ;
   private int[] P0AT97_A503GruOpeCod ;
   private java.util.Date[] P0AT97_A4440HisProDTI ;
   private boolean[] P0AT97_n4440HisProDTI ;
   private java.util.Date[] P0AT97_A4441HisProDTF ;
   private boolean[] P0AT97_n4441HisProDTF ;
   private String[] P0AT97_A602MaqCod ;
   private String[] P0AT98_A396EmprCod ;
   private int[] P0AT98_A652OpeCod ;
   private java.math.BigDecimal[] P0AT98_A2505OpePreHor ;
   private boolean[] P0AT98_n2505OpePreHor ;
}

final  class costesbasicos_00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AT92", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFasDTF, MaqCodBis, BarTieRea, BarFasKgT, BarFasKgm, BarFasMtT, BarFasMtr, BarHorIni, BarHorFin, BarFacTin, BarTieTeo, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AT93", "SELECT EmprCod, HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, HisProLin, HisProFec, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (HisProEst > 0) AND (BarOrdLin = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AT94", "SELECT EmprCod, HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, HisProLin, HisProFec, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (HisProEst > 0) AND (BarOrdLin = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AT95", "SELECT EmprCod, MaqCod, MaqDsc, TipMaqCod, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqGI, MaqAdCent, MaqAmort, MaqCosMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AT96", "SELECT EmprCod, MaqCod, MqCMes, MqCAnyo, MqCMod, MqCMoi, MqCEner, MqCGas, MqCAgua, MqCgi, MqCAdCt, MqCAmo FROM TXPMAQCOS WHERE EmprCod = ? and MaqCod = ? and MqCAnyo = ? and MqCMes = ? ORDER BY EmprCod, MaqCod, MqCAnyo, MqCMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AT97", "SELECT EmprCod, HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, HisProLin, HisProFec, GruOpeCod, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (HisProEst > 0) AND (BarOrdLin = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AT98", "SELECT EmprCod, OpeCod, OpePreHor FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
            case 4 :
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
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
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

