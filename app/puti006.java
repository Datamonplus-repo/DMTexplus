package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class puti006 extends GXProcedure
{
   public puti006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( puti006.class ), "" );
   }

   public puti006( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           java.math.BigDecimal[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           java.math.BigDecimal[] aP8 ,
                           java.math.BigDecimal[] aP9 ,
                           java.math.BigDecimal[] aP10 ,
                           java.math.BigDecimal[] aP11 ,
                           java.math.BigDecimal[] aP12 ,
                           java.math.BigDecimal[] aP13 )
   {
      puti006.this.aP14 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        byte[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             byte[] aP14 )
   {
      puti006.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      puti006.this.AV51BarCod = aP1[0];
      this.aP1 = aP1;
      puti006.this.AV53BarCodReo = aP2[0];
      this.aP2 = aP2;
      puti006.this.AV52BarCodPar = aP3[0];
      this.aP3 = aP3;
      puti006.this.AV65BarUniMed = aP4[0];
      this.aP4 = aP4;
      puti006.this.AV58BarKgm = aP5[0];
      this.aP5 = aP5;
      puti006.this.AV59barMtr = aP6[0];
      this.aP6 = aP6;
      puti006.this.AV70Coste_f = aP7[0];
      this.aP7 = aP7;
      puti006.this.AV76Coste_teo = aP8[0];
      this.aP8 = aP8;
      puti006.this.AV146mAgua = aP9[0];
      this.aP9 = aP9;
      puti006.this.AV145menergia = aP10[0];
      this.aP10 = aP10;
      puti006.this.AV144mgas = aP11[0];
      this.aP11 = aP11;
      puti006.this.AV143mmod = aP12[0];
      this.aP12 = aP12;
      puti006.this.AV142mmoi = aP13[0];
      this.aP13 = aP13;
      puti006.this.AV153Traza = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV121TasasEstandar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TASSTD", ""), GXv_int2) ;
      puti006.this.GXt_int1 = GXv_int2[0] ;
      AV121TasasEstandar = GXt_int1 ;
      if ( AV153Traza == 1 )
      {
         AV147Nominf = GXutil.str( AV51BarCod, 8, 0) + "-" + GXutil.str( AV53BarCodReo, 1, 0) + AV52BarCodPar + "_" + GXutil.trim( AV162Pgmdesc) ;
         AV154Random = (int)(GXutil.random( )*10000) ;
         AV155Filename = GXutil.trim( AV147Nominf) + "-" + GXutil.trim( GXutil.str( AV154Random, 8, 0)) + ".csv" ;
         AV156TextFile.setSource( AV155Filename );
         AV156TextFile.create();
         /* Execute user subroutine: 'CHECKSTATUS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV156TextFile.openWrite("");
         /* Execute user subroutine: 'CHECKSTATUS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV159TextFileLine = httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Maquina", "") + ";" + httpContext.getMessage( "Tiempo Real(HHMM)", "") + ";" + httpContext.getMessage( "Minutos", "") + ";" + httpContext.getMessage( "Coste Minuto Maq", "") + ";" + httpContext.getMessage( "Coste MOD", "") + ";" + httpContext.getMessage( "Coste MOI", "") + ";" + httpContext.getMessage( "Coste Energ", "") + ";" + httpContext.getMessage( "Coste Gas", "") + ";" + httpContext.getMessage( "Coste Agua", "") + ";" ;
         AV159TextFileLine += httpContext.getMessage( "Unidad", "") + ";" + httpContext.getMessage( "Kilos", "") + ";" + httpContext.getMessage( "Kilos T", "") + ";" + httpContext.getMessage( "Metros", "") + ";" + httpContext.getMessage( "Metros T", "") + ";" + httpContext.getMessage( "Coste Mm", "") + ";" + httpContext.getMessage( "Coste Fab", "") ;
         if ( GXutil.len( AV159TextFileLine) > 0 )
         {
            AV156TextFile.writeLine(AV159TextFileLine);
         }
      }
      AV146mAgua = DecimalUtil.doubleToDec(0) ;
      AV145menergia = DecimalUtil.doubleToDec(0) ;
      AV144mgas = DecimalUtil.doubleToDec(0) ;
      AV143mmod = DecimalUtil.doubleToDec(0) ;
      AV142mmoi = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P051O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV51BarCod), Byte.valueOf(AV53BarCodReo), AV52BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P051O2_A130BarCodPar[0] ;
         A132BarCodReo = P051O2_A132BarCodReo[0] ;
         A129BarCod = P051O2_A129BarCod[0] ;
         A603MaqCodBis = P051O2_A603MaqCodBis[0] ;
         A215BarTieRea = P051O2_A215BarTieRea[0] ;
         A5719BarFasKgT = P051O2_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P051O2_n5719BarFasKgT[0] ;
         A3837BarFasKgm = P051O2_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P051O2_n3837BarFasKgm[0] ;
         A5720BarFasMtT = P051O2_A5720BarFasMtT[0] ;
         n5720BarFasMtT = P051O2_n5720BarFasMtT[0] ;
         A3838BarFasMtr = P051O2_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P051O2_n3838BarFasMtr[0] ;
         A165BarHorIni = P051O2_A165BarHorIni[0] ;
         A164BarHorFin = P051O2_A164BarHorFin[0] ;
         A150BarFacTin = P051O2_A150BarFacTin[0] ;
         A194BarOrdLin = P051O2_A194BarOrdLin[0] ;
         A758ProCod = P051O2_A758ProCod[0] ;
         AV82MaqCod = A603MaqCodBis ;
         AV69CosPrd = DecimalUtil.doubleToDec(0) ;
         AV118CosPrd1 = DecimalUtil.doubleToDec(0) ;
         AV71Coste_m = DecimalUtil.doubleToDec(0) ;
         AV123CostAgua = DecimalUtil.doubleToDec(0) ;
         AV134Costenergia = DecimalUtil.doubleToDec(0) ;
         AV136Costgas = DecimalUtil.doubleToDec(0) ;
         AV137Costmod = DecimalUtil.doubleToDec(0) ;
         AV138Costmoi = DecimalUtil.doubleToDec(0) ;
         AV129Coste_mAgua = DecimalUtil.doubleToDec(0) ;
         AV130Coste_menergia = DecimalUtil.doubleToDec(0) ;
         AV131Coste_mgas = DecimalUtil.doubleToDec(0) ;
         AV132Coste_mmod = DecimalUtil.doubleToDec(0) ;
         AV133Coste_mmoi = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'COSMIN' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV81CosTiR == 0 )
         {
            AV86Min = (byte)(DecimalUtil.decToDouble((A215BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
            AV94Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV86Min) ;
            AV63BarTieRea = A215BarTieRea ;
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
            AV63BarTieRea = DecimalUtil.doubleToDec(GXutil.Int( AV94Tiempo_m/ (double) (60))+(AV94Tiempo_m-(GXutil.Int( AV94Tiempo_m/ (double) (60))*60))/ (double) (100)) ;
         }
         AV118CosPrd1 = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV94Tiempo_m).multiply(AV83MaqCosMin)), 2) ;
         AV123CostAgua = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV94Tiempo_m).multiply(AV119MaqAgua)), 2) ;
         AV134Costenergia = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV94Tiempo_m).multiply(AV139MaqEnerg)), 2) ;
         AV136Costgas = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV94Tiempo_m).multiply(AV120MaqGas)), 2) ;
         AV137Costmod = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV94Tiempo_m).multiply(AV140MaqMOD)), 2) ;
         AV138Costmoi = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV94Tiempo_m).multiply(AV141MaqMOI)), 2) ;
         if ( GXutil.strcmp(GXutil.trim( AV96TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            if ( GXutil.strcmp(AV65BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV71Coste_m = GXutil.roundDecimal( (AV83MaqCosMin.multiply(AV58BarKgm)), 2) ;
               AV129Coste_mAgua = GXutil.roundDecimal( (AV119MaqAgua.multiply(AV58BarKgm)), 2) ;
               AV130Coste_menergia = GXutil.roundDecimal( (AV139MaqEnerg.multiply(AV58BarKgm)), 2) ;
               AV131Coste_mgas = GXutil.roundDecimal( (AV120MaqGas.multiply(AV58BarKgm)), 2) ;
               AV132Coste_mmod = GXutil.roundDecimal( (AV140MaqMOD.multiply(AV58BarKgm)), 2) ;
               AV133Coste_mmoi = GXutil.roundDecimal( (AV141MaqMOI.multiply(AV58BarKgm)), 2) ;
            }
            else
            {
               AV71Coste_m = GXutil.roundDecimal( (AV83MaqCosMin.multiply(AV59barMtr)), 2) ;
               AV129Coste_mAgua = GXutil.roundDecimal( (AV119MaqAgua.multiply(AV59barMtr)), 2) ;
               AV130Coste_menergia = GXutil.roundDecimal( (AV139MaqEnerg.multiply(AV59barMtr)), 2) ;
               AV131Coste_mgas = GXutil.roundDecimal( (AV120MaqGas.multiply(AV59barMtr)), 2) ;
               AV132Coste_mmod = GXutil.roundDecimal( (AV140MaqMOD.multiply(AV59barMtr)), 2) ;
               AV133Coste_mmoi = GXutil.roundDecimal( (AV141MaqMOI.multiply(AV59barMtr)), 2) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV65BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A5719BarFasKgT.doubleValue() > 0 )
               {
                  AV71Coste_m = (AV118CosPrd1.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV129Coste_mAgua = (AV123CostAgua.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV130Coste_menergia = (AV134Costenergia.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV131Coste_mgas = (AV136Costgas.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV132Coste_mmod = (AV137Costmod.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV133Coste_mmoi = (AV138Costmoi.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV105Unidades = A3837BarFasKgm ;
                  AV106Unidadest = A5719BarFasKgT ;
               }
               else
               {
                  if ( AV58BarKgm.doubleValue() > 0 )
                  {
                     AV71Coste_m = (AV118CosPrd1.multiply(AV58BarKgm)).divide(AV58BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV129Coste_mAgua = (AV123CostAgua.multiply(AV58BarKgm)).divide(AV58BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV130Coste_menergia = (AV134Costenergia.multiply(AV58BarKgm)).divide(AV58BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV131Coste_mgas = (AV136Costgas.multiply(AV58BarKgm)).divide(AV58BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV132Coste_mmod = (AV137Costmod.multiply(AV58BarKgm)).divide(AV58BarKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV133Coste_mmoi = (AV138Costmoi.multiply(AV58BarKgm)).divide(AV58BarKgm, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV71Coste_m = AV118CosPrd1 ;
                     AV129Coste_mAgua = AV123CostAgua ;
                     AV130Coste_menergia = AV134Costenergia ;
                     AV131Coste_mgas = AV136Costgas ;
                     AV132Coste_mmod = AV137Costmod ;
                     AV133Coste_mmoi = AV138Costmoi ;
                  }
                  AV105Unidades = AV58BarKgm ;
                  AV106Unidadest = AV58BarKgm ;
               }
            }
            else
            {
               if ( A5720BarFasMtT.doubleValue() > 0 )
               {
                  AV71Coste_m = (AV118CosPrd1.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV129Coste_mAgua = (AV123CostAgua.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV130Coste_menergia = (AV134Costenergia.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV131Coste_mgas = (AV136Costgas.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV132Coste_mmod = (AV137Costmod.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV133Coste_mmoi = (AV138Costmoi.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV105Unidades = A3838BarFasMtr ;
                  AV106Unidadest = A5720BarFasMtT ;
               }
               else
               {
                  if ( AV59barMtr.doubleValue() > 0 )
                  {
                     AV71Coste_m = (AV118CosPrd1.multiply(AV59barMtr)).divide(AV59barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV129Coste_mAgua = (AV123CostAgua.multiply(AV59barMtr)).divide(AV59barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV130Coste_menergia = (AV134Costenergia.multiply(AV59barMtr)).divide(AV59barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV131Coste_mgas = (AV136Costgas.multiply(AV59barMtr)).divide(AV59barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV132Coste_mmod = (AV137Costmod.multiply(AV59barMtr)).divide(AV59barMtr, 18, java.math.RoundingMode.DOWN) ;
                     AV133Coste_mmoi = (AV138Costmoi.multiply(AV59barMtr)).divide(AV59barMtr, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV71Coste_m = AV118CosPrd1 ;
                     AV129Coste_mAgua = AV123CostAgua ;
                     AV130Coste_menergia = AV134Costenergia ;
                     AV131Coste_mgas = AV136Costgas ;
                     AV132Coste_mmod = AV137Costmod ;
                     AV133Coste_mmoi = AV138Costmoi ;
                  }
                  AV105Unidades = AV59barMtr ;
                  AV106Unidadest = AV59barMtr ;
               }
            }
         }
         AV66Ceros4 = "0000" ;
         AV115HorIni = GXutil.str( A165BarHorIni, 4, 0) ;
         AV115HorIni = GXutil.ltrim( GXutil.rtrim( AV115HorIni)) ;
         AV117Lenvar = (short)(GXutil.len( AV115HorIni)) ;
         AV117Lenvar = (short)(4-AV117Lenvar) ;
         AV115HorIni = GXutil.substring( AV66Ceros4, 1, AV117Lenvar) + AV115HorIni ;
         AV116HorIni_5 = GXutil.substring( AV115HorIni, 1, 2) + "." + GXutil.substring( AV115HorIni, 3, 2) ;
         AV113HorFin = GXutil.str( A164BarHorFin, 4, 0) ;
         AV113HorFin = GXutil.ltrim( GXutil.rtrim( AV113HorFin)) ;
         AV117Lenvar = (short)(GXutil.len( AV113HorFin)) ;
         AV117Lenvar = (short)(4-AV117Lenvar) ;
         AV113HorFin = GXutil.substring( AV66Ceros4, 1, AV117Lenvar) + AV113HorFin ;
         AV114HorFin_5 = GXutil.substring( AV113HorFin, 1, 2) + "." + GXutil.substring( AV113HorFin, 3, 2) ;
         AV71Coste_m = ((AV121TasasEstandar==1) ? AV129Coste_mAgua.add(AV130Coste_menergia).add(AV131Coste_mgas).add(AV132Coste_mmod).add(AV133Coste_mmoi) : AV71Coste_m) ;
         if ( GXutil.strcmp(A150BarFacTin, "S") != 0 )
         {
            AV73Coste_p_k = DecimalUtil.doubleToDec(0) ;
            if ( AV58BarKgm.doubleValue() > 0 )
            {
               AV73Coste_p_k = AV71Coste_m.divide(AV58BarKgm, 18, java.math.RoundingMode.DOWN) ;
            }
         }
         else
         {
            AV73Coste_p_k = DecimalUtil.doubleToDec(0) ;
            if ( AV58BarKgm.doubleValue() > 0 )
            {
               AV73Coste_p_k = (AV71Coste_m.add(AV57BarCosPro).add(AV56BarCosAny)).divide(AV58BarKgm, 18, java.math.RoundingMode.DOWN) ;
            }
         }
         if ( AV71Coste_m.doubleValue() > 0 )
         {
            AV70Coste_f = AV70Coste_f.add(AV71Coste_m) ;
         }
         if ( AV77Coste_tm.doubleValue() > 0 )
         {
            AV76Coste_teo = AV76Coste_teo.add(AV77Coste_tm) ;
         }
         AV146mAgua = AV146mAgua.add(AV129Coste_mAgua) ;
         AV145menergia = AV145menergia.add(AV130Coste_menergia) ;
         AV144mgas = AV144mgas.add(AV131Coste_mgas) ;
         AV143mmod = AV143mmod.add(AV132Coste_mmod) ;
         AV142mmoi = AV142mmoi.add(AV133Coste_mmoi) ;
         if ( AV153Traza == 1 )
         {
            AV159TextFileLine = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + AV82MaqCod + ";" + GXutil.str( AV63BarTieRea, 5, 2) + ";" + GXutil.str( AV94Tiempo_m, 6, 0) + ";" + GXutil.str( AV83MaqCosMin, 10, 4) + ";" + GXutil.str( AV140MaqMOD, 10, 4) + ";" + GXutil.str( AV141MaqMOI, 10, 4) + ";" + GXutil.str( AV139MaqEnerg, 10, 4) + ";" ;
            AV159TextFileLine += GXutil.str( AV120MaqGas, 10, 4) + ";" + GXutil.str( AV119MaqAgua, 10, 4) + ";" + AV65BarUniMed + ";" + GXutil.str( A3837BarFasKgm, 9, 2) + ";" + GXutil.str( A5719BarFasKgT, 9, 2) + ";" + GXutil.str( A3838BarFasMtr, 9, 2) + ";" + GXutil.str( A5720BarFasMtT, 9, 2) + ";" + GXutil.str( AV71Coste_m, 10, 2) + ";" + GXutil.str( AV70Coste_f, 10, 2) ;
            if ( GXutil.len( AV159TextFileLine) > 0 )
            {
               AV156TextFile.writeLine(AV159TextFileLine);
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV153Traza == 1 )
      {
         AV156TextFile.close();
         /* Execute user subroutine: 'CHECKSTATUS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV156TextFile.getErrCode() == 0 )
         {
            if ( ! httpContext.isAjaxRequest( ) )
            {
               AV158HttpResponse.addHeader("Content-Type", "text/csv");
            }
            if ( ! httpContext.isAjaxRequest( ) )
            {
               AV158HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCSituacionProcesoQuimicoExportCSV.csv");
            }
            AV158HttpResponse.addFile(AV156TextFile.getAbsoluteName());
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'TIEPAR' Routine */
      returnInSub = false ;
      AV94Tiempo_m = 0 ;
      /* Using cursor P051O3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV51BarCod), Byte.valueOf(AV53BarCodReo), AV52BarCodPar, Short.valueOf(AV60BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A556HisProEst = P051O3_A556HisProEst[0] ;
         A656ParCod = P051O3_A656ParCod[0] ;
         n656ParCod = P051O3_n656ParCod[0] ;
         A194BarOrdLin = P051O3_A194BarOrdLin[0] ;
         A130BarCodPar = P051O3_A130BarCodPar[0] ;
         A132BarCodReo = P051O3_A132BarCodReo[0] ;
         A129BarCod = P051O3_A129BarCod[0] ;
         A561HisProLin = P051O3_A561HisProLin[0] ;
         A558HisProFec = P051O3_A558HisProFec[0] ;
         A4440HisProDTI = P051O3_A4440HisProDTI[0] ;
         n4440HisProDTI = P051O3_n4440HisProDTI[0] ;
         A4441HisProDTF = P051O3_A4441HisProDTF[0] ;
         n4441HisProDTF = P051O3_n4441HisProDTF[0] ;
         A602MaqCod = P051O3_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV94Tiempo_m = (int)(AV94Tiempo_m+A5605HisProTr2) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'TIEREA' Routine */
      returnInSub = false ;
      AV94Tiempo_m = 0 ;
      /* Using cursor P051O4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV51BarCod), Byte.valueOf(AV53BarCodReo), AV52BarCodPar, Short.valueOf(AV60BarOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A556HisProEst = P051O4_A556HisProEst[0] ;
         A656ParCod = P051O4_A656ParCod[0] ;
         n656ParCod = P051O4_n656ParCod[0] ;
         A194BarOrdLin = P051O4_A194BarOrdLin[0] ;
         A130BarCodPar = P051O4_A130BarCodPar[0] ;
         A132BarCodReo = P051O4_A132BarCodReo[0] ;
         A129BarCod = P051O4_A129BarCod[0] ;
         A561HisProLin = P051O4_A561HisProLin[0] ;
         A558HisProFec = P051O4_A558HisProFec[0] ;
         A4440HisProDTI = P051O4_A4440HisProDTI[0] ;
         n4440HisProDTI = P051O4_n4440HisProDTI[0] ;
         A4441HisProDTF = P051O4_A4441HisProDTF[0] ;
         n4441HisProDTF = P051O4_n4441HisProDTF[0] ;
         A602MaqCod = P051O4_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV94Tiempo_m = (int)(AV94Tiempo_m+(GXutil.Int( A5605HisProTr2))) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'COSMIN' Routine */
      returnInSub = false ;
      AV83MaqCosMin = DecimalUtil.doubleToDec(0) ;
      AV84maqDsc = "" ;
      AV140MaqMOD = DecimalUtil.doubleToDec(0) ;
      AV141MaqMOI = DecimalUtil.doubleToDec(0) ;
      AV139MaqEnerg = DecimalUtil.doubleToDec(0) ;
      AV120MaqGas = DecimalUtil.doubleToDec(0) ;
      AV119MaqAgua = DecimalUtil.doubleToDec(0) ;
      AV96TipmaqCod = "" ;
      /* Using cursor P051O5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV82MaqCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A602MaqCod = P051O5_A602MaqCod[0] ;
         A605MaqCosMin = P051O5_A605MaqCosMin[0] ;
         n605MaqCosMin = P051O5_n605MaqCosMin[0] ;
         A606MaqDsc = P051O5_A606MaqDsc[0] ;
         n606MaqDsc = P051O5_n606MaqDsc[0] ;
         A1011TipMaqCod = P051O5_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P051O5_n1011TipMaqCod[0] ;
         A11821MaqMOD = P051O5_A11821MaqMOD[0] ;
         n11821MaqMOD = P051O5_n11821MaqMOD[0] ;
         A11822MaqMOI = P051O5_A11822MaqMOI[0] ;
         n11822MaqMOI = P051O5_n11822MaqMOI[0] ;
         A11823MaqEnerg = P051O5_A11823MaqEnerg[0] ;
         n11823MaqEnerg = P051O5_n11823MaqEnerg[0] ;
         A11824MaqGas = P051O5_A11824MaqGas[0] ;
         n11824MaqGas = P051O5_n11824MaqGas[0] ;
         A11825MaqAgua = P051O5_A11825MaqAgua[0] ;
         n11825MaqAgua = P051O5_n11825MaqAgua[0] ;
         AV83MaqCosMin = ((AV121TasasEstandar>0) ? DecimalUtil.doubleToDec(0) : A605MaqCosMin) ;
         AV84maqDsc = A606MaqDsc ;
         AV96TipmaqCod = A1011TipMaqCod ;
         if ( AV121TasasEstandar == 1 )
         {
            AV140MaqMOD = A11821MaqMOD ;
            AV141MaqMOI = A11822MaqMOI ;
            AV139MaqEnerg = A11823MaqEnerg ;
            AV120MaqGas = A11824MaqGas ;
            AV119MaqAgua = A11825MaqAgua ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV156TextFile.getErrCode() != 0 )
      {
         AV155Filename = "" ;
         AV157ErrorMessage = AV156TextFile.getErrDescription() ;
         AV156TextFile.close();
         AV158HttpResponse.addString(AV157ErrorMessage);
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = puti006.this.A396EmprCod;
      this.aP1[0] = puti006.this.AV51BarCod;
      this.aP2[0] = puti006.this.AV53BarCodReo;
      this.aP3[0] = puti006.this.AV52BarCodPar;
      this.aP4[0] = puti006.this.AV65BarUniMed;
      this.aP5[0] = puti006.this.AV58BarKgm;
      this.aP6[0] = puti006.this.AV59barMtr;
      this.aP7[0] = puti006.this.AV70Coste_f;
      this.aP8[0] = puti006.this.AV76Coste_teo;
      this.aP9[0] = puti006.this.AV146mAgua;
      this.aP10[0] = puti006.this.AV145menergia;
      this.aP11[0] = puti006.this.AV144mgas;
      this.aP12[0] = puti006.this.AV143mmod;
      this.aP13[0] = puti006.this.AV142mmoi;
      this.aP14[0] = puti006.this.AV153Traza;
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
      AV147Nominf = "" ;
      AV162Pgmdesc = "" ;
      AV155Filename = "" ;
      AV156TextFile = new com.genexus.util.GXFile();
      AV159TextFileLine = "" ;
      scmdbuf = "" ;
      P051O2_A396EmprCod = new String[] {""} ;
      P051O2_A130BarCodPar = new String[] {""} ;
      P051O2_A132BarCodReo = new byte[1] ;
      P051O2_A129BarCod = new int[1] ;
      P051O2_A603MaqCodBis = new String[] {""} ;
      P051O2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O2_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O2_n5719BarFasKgT = new boolean[] {false} ;
      P051O2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O2_n3837BarFasKgm = new boolean[] {false} ;
      P051O2_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O2_n5720BarFasMtT = new boolean[] {false} ;
      P051O2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O2_n3838BarFasMtr = new boolean[] {false} ;
      P051O2_A165BarHorIni = new short[1] ;
      P051O2_A164BarHorFin = new short[1] ;
      P051O2_A150BarFacTin = new String[] {""} ;
      P051O2_A194BarOrdLin = new short[1] ;
      P051O2_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A603MaqCodBis = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      AV82MaqCod = "" ;
      AV69CosPrd = DecimalUtil.ZERO ;
      AV118CosPrd1 = DecimalUtil.ZERO ;
      AV71Coste_m = DecimalUtil.ZERO ;
      AV123CostAgua = DecimalUtil.ZERO ;
      AV134Costenergia = DecimalUtil.ZERO ;
      AV136Costgas = DecimalUtil.ZERO ;
      AV137Costmod = DecimalUtil.ZERO ;
      AV138Costmoi = DecimalUtil.ZERO ;
      AV129Coste_mAgua = DecimalUtil.ZERO ;
      AV130Coste_menergia = DecimalUtil.ZERO ;
      AV131Coste_mgas = DecimalUtil.ZERO ;
      AV132Coste_mmod = DecimalUtil.ZERO ;
      AV133Coste_mmoi = DecimalUtil.ZERO ;
      AV63BarTieRea = DecimalUtil.ZERO ;
      AV83MaqCosMin = DecimalUtil.ZERO ;
      AV119MaqAgua = DecimalUtil.ZERO ;
      AV139MaqEnerg = DecimalUtil.ZERO ;
      AV120MaqGas = DecimalUtil.ZERO ;
      AV140MaqMOD = DecimalUtil.ZERO ;
      AV141MaqMOI = DecimalUtil.ZERO ;
      AV96TipmaqCod = "" ;
      AV105Unidades = DecimalUtil.ZERO ;
      AV106Unidadest = DecimalUtil.ZERO ;
      AV66Ceros4 = "" ;
      AV115HorIni = "" ;
      AV116HorIni_5 = "" ;
      AV113HorFin = "" ;
      AV114HorFin_5 = "" ;
      AV73Coste_p_k = DecimalUtil.ZERO ;
      AV57BarCosPro = DecimalUtil.ZERO ;
      AV56BarCosAny = DecimalUtil.ZERO ;
      AV77Coste_tm = DecimalUtil.ZERO ;
      AV158HttpResponse = httpContext.getHttpResponse();
      P051O3_A396EmprCod = new String[] {""} ;
      P051O3_A556HisProEst = new byte[1] ;
      P051O3_A656ParCod = new short[1] ;
      P051O3_n656ParCod = new boolean[] {false} ;
      P051O3_A194BarOrdLin = new short[1] ;
      P051O3_A130BarCodPar = new String[] {""} ;
      P051O3_A132BarCodReo = new byte[1] ;
      P051O3_A129BarCod = new int[1] ;
      P051O3_A561HisProLin = new int[1] ;
      P051O3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P051O3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P051O3_n4440HisProDTI = new boolean[] {false} ;
      P051O3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P051O3_n4441HisProDTF = new boolean[] {false} ;
      P051O3_A602MaqCod = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      P051O4_A396EmprCod = new String[] {""} ;
      P051O4_A556HisProEst = new byte[1] ;
      P051O4_A656ParCod = new short[1] ;
      P051O4_n656ParCod = new boolean[] {false} ;
      P051O4_A194BarOrdLin = new short[1] ;
      P051O4_A130BarCodPar = new String[] {""} ;
      P051O4_A132BarCodReo = new byte[1] ;
      P051O4_A129BarCod = new int[1] ;
      P051O4_A561HisProLin = new int[1] ;
      P051O4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P051O4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P051O4_n4440HisProDTI = new boolean[] {false} ;
      P051O4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P051O4_n4441HisProDTF = new boolean[] {false} ;
      P051O4_A602MaqCod = new String[] {""} ;
      AV84maqDsc = "" ;
      P051O5_A396EmprCod = new String[] {""} ;
      P051O5_A602MaqCod = new String[] {""} ;
      P051O5_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O5_n605MaqCosMin = new boolean[] {false} ;
      P051O5_A606MaqDsc = new String[] {""} ;
      P051O5_n606MaqDsc = new boolean[] {false} ;
      P051O5_A1011TipMaqCod = new String[] {""} ;
      P051O5_n1011TipMaqCod = new boolean[] {false} ;
      P051O5_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O5_n11821MaqMOD = new boolean[] {false} ;
      P051O5_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O5_n11822MaqMOI = new boolean[] {false} ;
      P051O5_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O5_n11823MaqEnerg = new boolean[] {false} ;
      P051O5_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O5_n11824MaqGas = new boolean[] {false} ;
      P051O5_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P051O5_n11825MaqAgua = new boolean[] {false} ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A1011TipMaqCod = "" ;
      A11821MaqMOD = DecimalUtil.ZERO ;
      A11822MaqMOI = DecimalUtil.ZERO ;
      A11823MaqEnerg = DecimalUtil.ZERO ;
      A11824MaqGas = DecimalUtil.ZERO ;
      A11825MaqAgua = DecimalUtil.ZERO ;
      AV157ErrorMessage = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.puti006__default(),
         new Object[] {
             new Object[] {
            P051O2_A396EmprCod, P051O2_A130BarCodPar, P051O2_A132BarCodReo, P051O2_A129BarCod, P051O2_A603MaqCodBis, P051O2_A215BarTieRea, P051O2_A5719BarFasKgT, P051O2_n5719BarFasKgT, P051O2_A3837BarFasKgm, P051O2_n3837BarFasKgm,
            P051O2_A5720BarFasMtT, P051O2_n5720BarFasMtT, P051O2_A3838BarFasMtr, P051O2_n3838BarFasMtr, P051O2_A165BarHorIni, P051O2_A164BarHorFin, P051O2_A150BarFacTin, P051O2_A194BarOrdLin, P051O2_A758ProCod
            }
            , new Object[] {
            P051O3_A396EmprCod, P051O3_A556HisProEst, P051O3_A656ParCod, P051O3_n656ParCod, P051O3_A194BarOrdLin, P051O3_A130BarCodPar, P051O3_A132BarCodReo, P051O3_A129BarCod, P051O3_A561HisProLin, P051O3_A558HisProFec,
            P051O3_A4440HisProDTI, P051O3_n4440HisProDTI, P051O3_A4441HisProDTF, P051O3_n4441HisProDTF, P051O3_A602MaqCod
            }
            , new Object[] {
            P051O4_A396EmprCod, P051O4_A556HisProEst, P051O4_A656ParCod, P051O4_n656ParCod, P051O4_A194BarOrdLin, P051O4_A130BarCodPar, P051O4_A132BarCodReo, P051O4_A129BarCod, P051O4_A561HisProLin, P051O4_A558HisProFec,
            P051O4_A4440HisProDTI, P051O4_n4440HisProDTI, P051O4_A4441HisProDTF, P051O4_n4441HisProDTF, P051O4_A602MaqCod
            }
            , new Object[] {
            P051O5_A396EmprCod, P051O5_A602MaqCod, P051O5_A605MaqCosMin, P051O5_n605MaqCosMin, P051O5_A606MaqDsc, P051O5_n606MaqDsc, P051O5_A1011TipMaqCod, P051O5_n1011TipMaqCod, P051O5_A11821MaqMOD, P051O5_n11821MaqMOD,
            P051O5_A11822MaqMOI, P051O5_n11822MaqMOI, P051O5_A11823MaqEnerg, P051O5_n11823MaqEnerg, P051O5_A11824MaqGas, P051O5_n11824MaqGas, P051O5_A11825MaqAgua, P051O5_n11825MaqAgua
            }
         }
      );
      AV162Pgmdesc = httpContext.getMessage( "CalculoCosteFabricaRealyTerorico", "") ;
      /* GeneXus formulas. */
      AV162Pgmdesc = httpContext.getMessage( "CalculoCosteFabricaRealyTerorico", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV53BarCodReo ;
   private byte AV153Traza ;
   private byte AV121TasasEstandar ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte AV81CosTiR ;
   private byte AV86Min ;
   private byte A556HisProEst ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A194BarOrdLin ;
   private short AV117Lenvar ;
   private short AV60BarOrdLin ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short Gx_err ;
   private int AV51BarCod ;
   private int AV154Random ;
   private int A129BarCod ;
   private int AV94Tiempo_m ;
   private int A561HisProLin ;
   private java.math.BigDecimal AV58BarKgm ;
   private java.math.BigDecimal AV59barMtr ;
   private java.math.BigDecimal AV70Coste_f ;
   private java.math.BigDecimal AV76Coste_teo ;
   private java.math.BigDecimal AV146mAgua ;
   private java.math.BigDecimal AV145menergia ;
   private java.math.BigDecimal AV144mgas ;
   private java.math.BigDecimal AV143mmod ;
   private java.math.BigDecimal AV142mmoi ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV69CosPrd ;
   private java.math.BigDecimal AV118CosPrd1 ;
   private java.math.BigDecimal AV71Coste_m ;
   private java.math.BigDecimal AV123CostAgua ;
   private java.math.BigDecimal AV134Costenergia ;
   private java.math.BigDecimal AV136Costgas ;
   private java.math.BigDecimal AV137Costmod ;
   private java.math.BigDecimal AV138Costmoi ;
   private java.math.BigDecimal AV129Coste_mAgua ;
   private java.math.BigDecimal AV130Coste_menergia ;
   private java.math.BigDecimal AV131Coste_mgas ;
   private java.math.BigDecimal AV132Coste_mmod ;
   private java.math.BigDecimal AV133Coste_mmoi ;
   private java.math.BigDecimal AV63BarTieRea ;
   private java.math.BigDecimal AV83MaqCosMin ;
   private java.math.BigDecimal AV119MaqAgua ;
   private java.math.BigDecimal AV139MaqEnerg ;
   private java.math.BigDecimal AV120MaqGas ;
   private java.math.BigDecimal AV140MaqMOD ;
   private java.math.BigDecimal AV141MaqMOI ;
   private java.math.BigDecimal AV105Unidades ;
   private java.math.BigDecimal AV106Unidadest ;
   private java.math.BigDecimal AV73Coste_p_k ;
   private java.math.BigDecimal AV57BarCosPro ;
   private java.math.BigDecimal AV56BarCosAny ;
   private java.math.BigDecimal AV77Coste_tm ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A11821MaqMOD ;
   private java.math.BigDecimal A11822MaqMOI ;
   private java.math.BigDecimal A11823MaqEnerg ;
   private java.math.BigDecimal A11824MaqGas ;
   private java.math.BigDecimal A11825MaqAgua ;
   private String A396EmprCod ;
   private String AV52BarCodPar ;
   private String AV65BarUniMed ;
   private String AV147Nominf ;
   private String AV162Pgmdesc ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String AV82MaqCod ;
   private String AV96TipmaqCod ;
   private String AV66Ceros4 ;
   private String AV115HorIni ;
   private String AV116HorIni_5 ;
   private String AV113HorFin ;
   private String AV114HorFin_5 ;
   private String A602MaqCod ;
   private String AV84maqDsc ;
   private String A606MaqDsc ;
   private String A1011TipMaqCod ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n5719BarFasKgT ;
   private boolean n3837BarFasKgm ;
   private boolean n5720BarFasMtT ;
   private boolean n3838BarFasMtr ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n605MaqCosMin ;
   private boolean n606MaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n11821MaqMOD ;
   private boolean n11822MaqMOI ;
   private boolean n11823MaqEnerg ;
   private boolean n11824MaqGas ;
   private boolean n11825MaqAgua ;
   private String AV159TextFileLine ;
   private String AV155Filename ;
   private String AV157ErrorMessage ;
   private com.genexus.util.GXFile AV156TextFile ;
   private byte[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P051O2_A396EmprCod ;
   private String[] P051O2_A130BarCodPar ;
   private byte[] P051O2_A132BarCodReo ;
   private int[] P051O2_A129BarCod ;
   private String[] P051O2_A603MaqCodBis ;
   private java.math.BigDecimal[] P051O2_A215BarTieRea ;
   private java.math.BigDecimal[] P051O2_A5719BarFasKgT ;
   private boolean[] P051O2_n5719BarFasKgT ;
   private java.math.BigDecimal[] P051O2_A3837BarFasKgm ;
   private boolean[] P051O2_n3837BarFasKgm ;
   private java.math.BigDecimal[] P051O2_A5720BarFasMtT ;
   private boolean[] P051O2_n5720BarFasMtT ;
   private java.math.BigDecimal[] P051O2_A3838BarFasMtr ;
   private boolean[] P051O2_n3838BarFasMtr ;
   private short[] P051O2_A165BarHorIni ;
   private short[] P051O2_A164BarHorFin ;
   private String[] P051O2_A150BarFacTin ;
   private short[] P051O2_A194BarOrdLin ;
   private String[] P051O2_A758ProCod ;
   private String[] P051O3_A396EmprCod ;
   private byte[] P051O3_A556HisProEst ;
   private short[] P051O3_A656ParCod ;
   private boolean[] P051O3_n656ParCod ;
   private short[] P051O3_A194BarOrdLin ;
   private String[] P051O3_A130BarCodPar ;
   private byte[] P051O3_A132BarCodReo ;
   private int[] P051O3_A129BarCod ;
   private int[] P051O3_A561HisProLin ;
   private java.util.Date[] P051O3_A558HisProFec ;
   private java.util.Date[] P051O3_A4440HisProDTI ;
   private boolean[] P051O3_n4440HisProDTI ;
   private java.util.Date[] P051O3_A4441HisProDTF ;
   private boolean[] P051O3_n4441HisProDTF ;
   private String[] P051O3_A602MaqCod ;
   private String[] P051O4_A396EmprCod ;
   private byte[] P051O4_A556HisProEst ;
   private short[] P051O4_A656ParCod ;
   private boolean[] P051O4_n656ParCod ;
   private short[] P051O4_A194BarOrdLin ;
   private String[] P051O4_A130BarCodPar ;
   private byte[] P051O4_A132BarCodReo ;
   private int[] P051O4_A129BarCod ;
   private int[] P051O4_A561HisProLin ;
   private java.util.Date[] P051O4_A558HisProFec ;
   private java.util.Date[] P051O4_A4440HisProDTI ;
   private boolean[] P051O4_n4440HisProDTI ;
   private java.util.Date[] P051O4_A4441HisProDTF ;
   private boolean[] P051O4_n4441HisProDTF ;
   private String[] P051O4_A602MaqCod ;
   private String[] P051O5_A396EmprCod ;
   private String[] P051O5_A602MaqCod ;
   private java.math.BigDecimal[] P051O5_A605MaqCosMin ;
   private boolean[] P051O5_n605MaqCosMin ;
   private String[] P051O5_A606MaqDsc ;
   private boolean[] P051O5_n606MaqDsc ;
   private String[] P051O5_A1011TipMaqCod ;
   private boolean[] P051O5_n1011TipMaqCod ;
   private java.math.BigDecimal[] P051O5_A11821MaqMOD ;
   private boolean[] P051O5_n11821MaqMOD ;
   private java.math.BigDecimal[] P051O5_A11822MaqMOI ;
   private boolean[] P051O5_n11822MaqMOI ;
   private java.math.BigDecimal[] P051O5_A11823MaqEnerg ;
   private boolean[] P051O5_n11823MaqEnerg ;
   private java.math.BigDecimal[] P051O5_A11824MaqGas ;
   private boolean[] P051O5_n11824MaqGas ;
   private java.math.BigDecimal[] P051O5_A11825MaqAgua ;
   private boolean[] P051O5_n11825MaqAgua ;
   private com.genexus.internet.HttpResponse AV158HttpResponse ;
}

final  class puti006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P051O2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, MaqCodBis, BarTieRea, BarFasKgT, BarFasKgm, BarFasMtT, BarFasMtr, BarHorIni, BarHorFin, BarFacTin, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P051O3", "SELECT EmprCod, HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, HisProLin, HisProFec, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (ParCod = 0) AND (HisProEst = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P051O4", "SELECT EmprCod, HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, HisProLin, HisProFec, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (ParCod = 0) AND (HisProEst = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P051O5", "SELECT EmprCod, MaqCod, MaqCosMin, MaqDsc, TipMaqCod, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 1);
               ((short[]) buf[17])[0] = rslt.getShort(14);
               ((String[]) buf[18])[0] = rslt.getString(15, 8);
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 4);
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
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
      }
   }

}

