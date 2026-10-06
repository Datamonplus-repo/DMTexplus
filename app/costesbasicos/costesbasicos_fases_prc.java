package app.costesbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class costesbasicos_fases_prc extends GXProcedure
{
   public costesbasicos_fases_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costesbasicos_fases_prc.class ), "" );
   }

   public costesbasicos_fases_prc( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      costesbasicos_fases_prc.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      costesbasicos_fases_prc.this.A396EmprCod = aP0;
      costesbasicos_fases_prc.this.A129BarCod = aP1;
      costesbasicos_fases_prc.this.A132BarCodReo = aP2;
      costesbasicos_fases_prc.this.A130BarCodPar = aP3;
      costesbasicos_fases_prc.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV10reoperados) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCHROR", ""), GXv_int2) ;
      costesbasicos_fases_prc.this.GXt_int1 = GXv_int2[0] ;
      AV10reoperados = GXt_int1 ;
      GXt_int1 = (byte)(AV23TasasEstandar) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TASSTD", ""), GXv_int2) ;
      costesbasicos_fases_prc.this.GXt_int1 = GXv_int2[0] ;
      AV23TasasEstandar = GXt_int1 ;
      GXt_int1 = (byte)(AV24Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      costesbasicos_fases_prc.this.GXt_int1 = GXv_int2[0] ;
      AV24Moda21 = GXt_int1 ;
      AV33CostesBasicos_Fases_SDT.clear();
      /* Using cursor P0ATG3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A228BarUniMed = P0ATG3_A228BarUniMed[0] ;
         A603MaqCodBis = P0ATG3_A603MaqCodBis[0] ;
         A215BarTieRea = P0ATG3_A215BarTieRea[0] ;
         A5719BarFasKgT = P0ATG3_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P0ATG3_n5719BarFasKgT[0] ;
         A3837BarFasKgm = P0ATG3_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0ATG3_n3837BarFasKgm[0] ;
         A5720BarFasMtT = P0ATG3_A5720BarFasMtT[0] ;
         n5720BarFasMtT = P0ATG3_n5720BarFasMtT[0] ;
         A3838BarFasMtr = P0ATG3_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0ATG3_n3838BarFasMtr[0] ;
         A216BarTieTeo = P0ATG3_A216BarTieTeo[0] ;
         A457FasCod = P0ATG3_A457FasCod[0] ;
         A252CliCod = P0ATG3_A252CliCod[0] ;
         n252CliCod = P0ATG3_n252CliCod[0] ;
         A212BarSer = P0ATG3_A212BarSer[0] ;
         A135BarColNom = P0ATG3_A135BarColNom[0] ;
         A136BarColNum = P0ATG3_A136BarColNum[0] ;
         A218BarTipCol = P0ATG3_A218BarTipCol[0] ;
         A217BarTipArt = P0ATG3_A217BarTipArt[0] ;
         n217BarTipArt = P0ATG3_n217BarTipArt[0] ;
         A150BarFacTin = P0ATG3_A150BarFacTin[0] ;
         A165BarHorIni = P0ATG3_A165BarHorIni[0] ;
         A164BarHorFin = P0ATG3_A164BarHorFin[0] ;
         A6173BarFasSec = P0ATG3_A6173BarFasSec[0] ;
         n6173BarFasSec = P0ATG3_n6173BarFasSec[0] ;
         A460FasDsc = P0ATG3_A460FasDsc[0] ;
         A194BarOrdLin = P0ATG3_A194BarOrdLin[0] ;
         A758ProCod = P0ATG3_A758ProCod[0] ;
         A166BarKgm = P0ATG3_A166BarKgm[0] ;
         A184BarMtr = P0ATG3_A184BarMtr[0] ;
         A460FasDsc = P0ATG3_A460FasDsc[0] ;
         A228BarUniMed = P0ATG3_A228BarUniMed[0] ;
         A252CliCod = P0ATG3_A252CliCod[0] ;
         n252CliCod = P0ATG3_n252CliCod[0] ;
         A212BarSer = P0ATG3_A212BarSer[0] ;
         A135BarColNom = P0ATG3_A135BarColNom[0] ;
         A136BarColNum = P0ATG3_A136BarColNum[0] ;
         A218BarTipCol = P0ATG3_A218BarTipCol[0] ;
         A217BarTipArt = P0ATG3_A217BarTipArt[0] ;
         n217BarTipArt = P0ATG3_n217BarTipArt[0] ;
         A166BarKgm = P0ATG3_A166BarKgm[0] ;
         A184BarMtr = P0ATG3_A184BarMtr[0] ;
         AV25BarCod = A129BarCod ;
         AV26BarCodReo = A132BarCodReo ;
         AV27BarCodPar = A130BarCodPar ;
         AV44BarUniMed = A228BarUniMed ;
         AV54Kgm = A166BarKgm ;
         AV55Mtr = A184BarMtr ;
         AV11MaqCod = A603MaqCodBis ;
         GXt_char3 = AV13maqDsc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char5[0] = AV11MaqCod ;
         GXv_char6[0] = GXt_char3 ;
         new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
         costesbasicos_fases_prc.this.A396EmprCod = GXv_char4[0] ;
         costesbasicos_fases_prc.this.AV11MaqCod = GXv_char5[0] ;
         costesbasicos_fases_prc.this.GXt_char3 = GXv_char6[0] ;
         AV13maqDsc = GXt_char3 ;
         AV75CosPrd = DecimalUtil.doubleToDec(0) ;
         AV35CosPrd1 = DecimalUtil.doubleToDec(0) ;
         AV45Coste_m = DecimalUtil.doubleToDec(0) ;
         AV36CostAgua = DecimalUtil.doubleToDec(0) ;
         AV37Costenergia = DecimalUtil.doubleToDec(0) ;
         AV38Costgas = DecimalUtil.doubleToDec(0) ;
         AV39Costmod = DecimalUtil.doubleToDec(0) ;
         AV40Costmoi = DecimalUtil.doubleToDec(0) ;
         AV41Costgi = DecimalUtil.doubleToDec(0) ;
         AV42Costadc = DecimalUtil.doubleToDec(0) ;
         AV43Costam = DecimalUtil.doubleToDec(0) ;
         AV46Coste_mAgua = DecimalUtil.doubleToDec(0) ;
         AV47Coste_menergia = DecimalUtil.doubleToDec(0) ;
         AV48Coste_mgas = DecimalUtil.doubleToDec(0) ;
         AV49Coste_mmod = DecimalUtil.doubleToDec(0) ;
         AV50Coste_mmoi = DecimalUtil.doubleToDec(0) ;
         AV51Coste_mgi = DecimalUtil.doubleToDec(0) ;
         AV52Coste_madc = DecimalUtil.doubleToDec(0) ;
         AV53Coste_mam = DecimalUtil.doubleToDec(0) ;
         AV12MaqCosMin = DecimalUtil.doubleToDec(0) ;
         AV14MaqMOD = DecimalUtil.doubleToDec(0) ;
         AV15MaqMOI = DecimalUtil.doubleToDec(0) ;
         AV16MaqEnerg = DecimalUtil.doubleToDec(0) ;
         AV17MaqGas = DecimalUtil.doubleToDec(0) ;
         AV18MaqAgua = DecimalUtil.doubleToDec(0) ;
         AV19MaqGI = DecimalUtil.doubleToDec(0) ;
         AV20MaqAdCent = DecimalUtil.doubleToDec(0) ;
         AV21MaqAmort = DecimalUtil.doubleToDec(0) ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int2[0] = A132BarCodReo ;
         GXv_char5[0] = A130BarCodPar ;
         GXv_int8[0] = A194BarOrdLin ;
         GXv_int9[0] = AV9Lhipro ;
         new app.prgtolhipro(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int2, GXv_char5, GXv_int8, GXv_int9) ;
         costesbasicos_fases_prc.this.A396EmprCod = GXv_char6[0] ;
         costesbasicos_fases_prc.this.A129BarCod = GXv_int7[0] ;
         costesbasicos_fases_prc.this.A132BarCodReo = GXv_int2[0] ;
         costesbasicos_fases_prc.this.A130BarCodPar = GXv_char5[0] ;
         costesbasicos_fases_prc.this.A194BarOrdLin = GXv_int8[0] ;
         costesbasicos_fases_prc.this.AV9Lhipro = GXv_int9[0] ;
         if ( ( ( AV9Lhipro == 1 ) && ( AV10reoperados == 1 ) ) || ( (0==AV10reoperados) ) )
         {
            /* Execute user subroutine: 'COSMIN' */
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
         }
         if ( AV30CosTiR == 0 )
         {
            AV31Min = (byte)(DecimalUtil.decToDouble((A215BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
            AV29Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV31Min) ;
            AV32BarTieRea = A215BarTieRea ;
         }
         else
         {
            /* Execute user subroutine: 'TIEREA' */
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
            AV32BarTieRea = DecimalUtil.doubleToDec(GXutil.Int( AV29Tiempo_m/ (double) (60))+(AV29Tiempo_m-(GXutil.Int( AV29Tiempo_m/ (double) (60))*60))/ (double) (100)) ;
         }
         AV35CosPrd1 = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV29Tiempo_m).multiply(AV12MaqCosMin)), 2) ;
         AV36CostAgua = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV29Tiempo_m).multiply(AV18MaqAgua)), 2) ;
         AV37Costenergia = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV29Tiempo_m).multiply(AV16MaqEnerg)), 2) ;
         AV38Costgas = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV29Tiempo_m).multiply(AV17MaqGas)), 2) ;
         AV39Costmod = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV29Tiempo_m).multiply(AV14MaqMOD)), 2) ;
         AV40Costmoi = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV29Tiempo_m).multiply(AV15MaqMOI)), 2) ;
         AV41Costgi = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV29Tiempo_m).multiply(AV19MaqGI)), 2) ;
         AV42Costadc = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV29Tiempo_m).multiply(AV20MaqAdCent)), 2) ;
         AV43Costam = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV29Tiempo_m).multiply(AV21MaqAmort)), 2) ;
         if ( GXutil.strcmp(GXutil.trim( AV22TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            if ( GXutil.strcmp(AV44BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV45Coste_m = GXutil.roundDecimal( (AV12MaqCosMin.multiply(AV54Kgm)), 2) ;
               AV46Coste_mAgua = GXutil.roundDecimal( (AV18MaqAgua.multiply(AV54Kgm)), 2) ;
               AV47Coste_menergia = GXutil.roundDecimal( (AV16MaqEnerg.multiply(AV54Kgm)), 2) ;
               AV48Coste_mgas = GXutil.roundDecimal( (AV17MaqGas.multiply(AV54Kgm)), 2) ;
               AV49Coste_mmod = GXutil.roundDecimal( (AV14MaqMOD.multiply(AV54Kgm)), 2) ;
               AV50Coste_mmoi = GXutil.roundDecimal( (AV15MaqMOI.multiply(AV54Kgm)), 2) ;
               AV51Coste_mgi = GXutil.roundDecimal( (AV19MaqGI.multiply(AV54Kgm)), 2) ;
               AV52Coste_madc = GXutil.roundDecimal( (AV20MaqAdCent.multiply(AV54Kgm)), 2) ;
               AV53Coste_mam = GXutil.roundDecimal( (AV21MaqAmort.multiply(AV54Kgm)), 2) ;
            }
            else
            {
               AV45Coste_m = GXutil.roundDecimal( (AV12MaqCosMin.multiply(AV55Mtr)), 2) ;
               AV46Coste_mAgua = GXutil.roundDecimal( (AV18MaqAgua.multiply(AV55Mtr)), 2) ;
               AV47Coste_menergia = GXutil.roundDecimal( (AV16MaqEnerg.multiply(AV55Mtr)), 2) ;
               AV48Coste_mgas = GXutil.roundDecimal( (AV17MaqGas.multiply(AV55Mtr)), 2) ;
               AV49Coste_mmod = GXutil.roundDecimal( (AV14MaqMOD.multiply(AV55Mtr)), 2) ;
               AV50Coste_mmoi = GXutil.roundDecimal( (AV15MaqMOI.multiply(AV55Mtr)), 2) ;
               AV51Coste_mgi = GXutil.roundDecimal( (AV19MaqGI.multiply(AV55Mtr)), 2) ;
               AV52Coste_madc = GXutil.roundDecimal( (AV20MaqAdCent.multiply(AV55Mtr)), 2) ;
               AV53Coste_mam = GXutil.roundDecimal( (AV21MaqAmort.multiply(AV55Mtr)), 2) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV44BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A5719BarFasKgT.doubleValue() > 0 )
               {
                  AV45Coste_m = (AV35CosPrd1.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV46Coste_mAgua = (AV36CostAgua.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV47Coste_menergia = (AV37Costenergia.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV48Coste_mgas = (AV38Costgas.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV49Coste_mmod = (AV39Costmod.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV50Coste_mmoi = (AV40Costmoi.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV51Coste_mgi = (AV41Costgi.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV52Coste_madc = (AV42Costadc.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV53Coste_mam = (AV43Costam.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV56Unidades = A3837BarFasKgm ;
                  AV57Unidadest = A5719BarFasKgT ;
               }
               else
               {
                  if ( AV54Kgm.doubleValue() > 0 )
                  {
                     AV45Coste_m = (AV35CosPrd1.multiply(AV54Kgm)).divide(AV54Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV46Coste_mAgua = (AV36CostAgua.multiply(AV54Kgm)).divide(AV54Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV47Coste_menergia = (AV37Costenergia.multiply(AV54Kgm)).divide(AV54Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV48Coste_mgas = (AV38Costgas.multiply(AV54Kgm)).divide(AV54Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV49Coste_mmod = (AV39Costmod.multiply(AV54Kgm)).divide(AV54Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV50Coste_mmoi = (AV40Costmoi.multiply(AV54Kgm)).divide(AV54Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV51Coste_mgi = (AV41Costgi.multiply(AV54Kgm)).divide(AV54Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV52Coste_madc = (AV42Costadc.multiply(AV54Kgm)).divide(AV54Kgm, 18, java.math.RoundingMode.DOWN) ;
                     AV53Coste_mam = (AV43Costam.multiply(AV54Kgm)).divide(AV54Kgm, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV45Coste_m = AV35CosPrd1 ;
                     AV46Coste_mAgua = AV36CostAgua ;
                     AV47Coste_menergia = AV37Costenergia ;
                     AV48Coste_mgas = AV38Costgas ;
                     AV49Coste_mmod = AV39Costmod ;
                     AV50Coste_mmoi = AV40Costmoi ;
                     AV51Coste_mgi = AV41Costgi ;
                     AV52Coste_madc = AV42Costadc ;
                     AV53Coste_mam = AV43Costam ;
                  }
                  AV56Unidades = AV54Kgm ;
                  AV57Unidadest = AV54Kgm ;
               }
            }
            else
            {
               if ( A5720BarFasMtT.doubleValue() > 0 )
               {
                  AV45Coste_m = (AV35CosPrd1.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV46Coste_mAgua = (AV36CostAgua.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV47Coste_menergia = (AV37Costenergia.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV48Coste_mgas = (AV38Costgas.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV49Coste_mmod = (AV39Costmod.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV50Coste_mmoi = (AV40Costmoi.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV51Coste_mgi = (AV41Costgi.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV52Coste_madc = (AV42Costadc.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV53Coste_mam = (AV43Costam.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV56Unidades = A3838BarFasMtr ;
                  AV57Unidadest = A5720BarFasMtT ;
               }
               else
               {
                  if ( AV55Mtr.doubleValue() > 0 )
                  {
                     AV45Coste_m = (AV35CosPrd1.multiply(AV55Mtr)).divide(AV55Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV46Coste_mAgua = (AV36CostAgua.multiply(AV55Mtr)).divide(AV55Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV47Coste_menergia = (AV37Costenergia.multiply(AV55Mtr)).divide(AV55Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV48Coste_mgas = (AV38Costgas.multiply(AV55Mtr)).divide(AV55Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV49Coste_mmod = (AV39Costmod.multiply(AV55Mtr)).divide(AV55Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV50Coste_mmoi = (AV40Costmoi.multiply(AV55Mtr)).divide(AV55Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV51Coste_mgi = (AV41Costgi.multiply(AV55Mtr)).divide(AV55Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV52Coste_madc = (AV42Costadc.multiply(AV55Mtr)).divide(AV55Mtr, 18, java.math.RoundingMode.DOWN) ;
                     AV53Coste_mam = (AV43Costam.multiply(AV55Mtr)).divide(AV55Mtr, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV45Coste_m = AV35CosPrd1 ;
                     AV46Coste_mAgua = AV36CostAgua ;
                     AV47Coste_menergia = AV37Costenergia ;
                     AV48Coste_mgas = AV38Costgas ;
                     AV49Coste_mmod = AV39Costmod ;
                     AV50Coste_mmoi = AV40Costmoi ;
                     AV51Coste_mgi = AV41Costgi ;
                     AV52Coste_madc = AV42Costadc ;
                     AV53Coste_mam = AV43Costam ;
                  }
                  AV56Unidades = AV55Mtr ;
                  AV57Unidadest = AV55Mtr ;
               }
            }
         }
         AV70TieTeo = A216BarTieTeo ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int9[0] = A132BarCodReo ;
         GXv_char5[0] = A130BarCodPar ;
         GXv_char4[0] = A457FasCod ;
         GXv_date10[0] = AV77fecteo ;
         GXv_decimal11[0] = AV74tteo ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char14[0] = "" ;
         GXv_char15[0] = A758ProCod ;
         GXv_char16[0] = A603MaqCodBis ;
         GXv_int17[0] = A252CliCod ;
         GXv_char18[0] = A212BarSer ;
         GXv_int19[0] = AV71hnd ;
         GXv_int2[0] = (byte)(AV72Sicsv) ;
         new app.ppla001(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int9, GXv_char5, GXv_char4, GXv_date10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_char14, GXv_char15, GXv_char16, GXv_int17, GXv_char18, GXv_int19, GXv_int2) ;
         costesbasicos_fases_prc.this.A396EmprCod = GXv_char6[0] ;
         costesbasicos_fases_prc.this.A129BarCod = GXv_int7[0] ;
         costesbasicos_fases_prc.this.A132BarCodReo = GXv_int9[0] ;
         costesbasicos_fases_prc.this.A130BarCodPar = GXv_char5[0] ;
         costesbasicos_fases_prc.this.A457FasCod = GXv_char4[0] ;
         costesbasicos_fases_prc.this.AV77fecteo = GXv_date10[0] ;
         costesbasicos_fases_prc.this.AV74tteo = GXv_decimal11[0] ;
         costesbasicos_fases_prc.this.A758ProCod = GXv_char15[0] ;
         costesbasicos_fases_prc.this.A603MaqCodBis = GXv_char16[0] ;
         costesbasicos_fases_prc.this.A252CliCod = GXv_int17[0] ;
         costesbasicos_fases_prc.this.A212BarSer = GXv_char18[0] ;
         costesbasicos_fases_prc.this.AV71hnd = (short)((short)(GXv_int19[0])) ;
         costesbasicos_fases_prc.this.AV72Sicsv = GXv_int2[0] ;
         AV73teotixfi = (short)(0) ;
         if ( AV24Moda21 == 1 )
         {
            GXv_char18[0] = A396EmprCod ;
            GXv_int17[0] = A252CliCod ;
            GXv_char16[0] = A212BarSer ;
            GXv_char15[0] = A135BarColNom ;
            GXv_int7[0] = A136BarColNum ;
            GXv_int9[0] = A218BarTipCol ;
            GXv_int20[0] = AV67Fornumcol ;
            new app.pfdnumcolor(remoteHandle, context).execute( GXv_char18, GXv_int17, GXv_char16, GXv_char15, GXv_int7, GXv_int9, GXv_int20) ;
            costesbasicos_fases_prc.this.A396EmprCod = GXv_char18[0] ;
            costesbasicos_fases_prc.this.A252CliCod = GXv_int17[0] ;
            costesbasicos_fases_prc.this.A212BarSer = GXv_char16[0] ;
            costesbasicos_fases_prc.this.A135BarColNom = GXv_char15[0] ;
            costesbasicos_fases_prc.this.A136BarColNum = GXv_int7[0] ;
            costesbasicos_fases_prc.this.A218BarTipCol = GXv_int9[0] ;
            costesbasicos_fases_prc.this.AV67Fornumcol = GXv_int20[0] ;
            AV68bartipart = A217BarTipArt ;
            /* Execute user subroutine: 'FAMILIA' */
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
            GXv_char18[0] = A396EmprCod ;
            GXv_int20[0] = AV67Fornumcol ;
            GXv_int8[0] = AV69Grdtipart ;
            GXv_int21[0] = AV73teotixfi ;
            new app.pteoftixfi(remoteHandle, context).execute( GXv_char18, GXv_int20, GXv_int8, GXv_int21) ;
            costesbasicos_fases_prc.this.A396EmprCod = GXv_char18[0] ;
            costesbasicos_fases_prc.this.AV67Fornumcol = GXv_int20[0] ;
            costesbasicos_fases_prc.this.AV69Grdtipart = GXv_int8[0] ;
            costesbasicos_fases_prc.this.AV73teotixfi = GXv_int21[0] ;
            AV73teotixfi = (short)(((GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", ""))==0) ? AV73teotixfi : 0)) ;
         }
         AV74tteo = ((GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", ""))==0)&&(AV24Moda21==1) ? DecimalUtil.doubleToDec(AV73teotixfi/ (double) (60)) : AV74tteo) ;
         AV75CosPrd = DecimalUtil.doubleToDec(0) ;
         AV76Coste_tm = DecimalUtil.doubleToDec(0) ;
         AV31Min = (byte)(DecimalUtil.decToDouble((AV70TieTeo.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV70TieTeo))))).multiply(DecimalUtil.doubleToDec(100)))) ;
         AV75CosPrd = GXutil.roundDecimal( (DecimalUtil.doubleToDec(((GXutil.Int( DecimalUtil.decToDouble(AV70TieTeo))*60)+AV31Min)).multiply(AV12MaqCosMin)), 2) ;
         if ( GXutil.strcmp(GXutil.trim( AV22TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            if ( GXutil.strcmp(AV44BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV76Coste_tm = GXutil.roundDecimal( (AV12MaqCosMin.multiply(AV54Kgm)), 2) ;
            }
            else
            {
               AV76Coste_tm = GXutil.roundDecimal( (AV12MaqCosMin.multiply(AV55Mtr)), 2) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV44BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A5719BarFasKgT.doubleValue() > 0 )
               {
                  AV76Coste_tm = (AV75CosPrd.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV76Coste_tm = AV75CosPrd ;
               }
            }
            else
            {
               if ( A5720BarFasMtT.doubleValue() > 0 )
               {
                  AV76Coste_tm = (AV75CosPrd.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV76Coste_tm = AV75CosPrd ;
               }
            }
         }
         AV58Ceros4 = "0000" ;
         AV59HorIni = GXutil.str( A165BarHorIni, 4, 0) ;
         AV59HorIni = GXutil.ltrim( GXutil.rtrim( AV59HorIni)) ;
         AV60LenVar = (short)(GXutil.len( AV59HorIni)) ;
         AV60LenVar = (short)(4-AV60LenVar) ;
         AV59HorIni = GXutil.substring( AV58Ceros4, 1, AV60LenVar) + AV59HorIni ;
         AV61HorIni_5 = GXutil.substring( AV59HorIni, 1, 2) + "." + GXutil.substring( AV59HorIni, 3, 2) ;
         AV62HorFin = GXutil.str( A164BarHorFin, 4, 0) ;
         AV62HorFin = GXutil.ltrim( GXutil.rtrim( AV62HorFin)) ;
         AV60LenVar = (short)(GXutil.len( AV62HorFin)) ;
         AV60LenVar = (short)(4-AV60LenVar) ;
         AV62HorFin = GXutil.substring( AV58Ceros4, 1, AV60LenVar) + AV62HorFin ;
         AV63HorFin_5 = GXutil.substring( AV62HorFin, 1, 2) + "." + GXutil.substring( AV62HorFin, 3, 2) ;
         AV34CostesBasicos_Fases_SDTItem = (app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)new app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem(remoteHandle, context);
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec( A6173BarFasSec );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin( A194BarOrdLin );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod( A457FasCod );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc( A460FasDsc );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod( AV11MaqCod );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc( AV13maqDsc );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades( AV56Unidades );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest( AV57Unidadest );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed( A228BarUniMed );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5( AV61HorIni_5 );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5( AV63HorFin_5 );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea( AV32BarTieRea );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo( AV70TieTeo );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo( AV74tteo );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin( AV12MaqCosMin );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m( AV45Coste_m );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm( AV76Coste_tm );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod( AV49Coste_mmod );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi( AV50Coste_mmoi );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia( AV47Coste_menergia );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas( AV48Coste_mgas );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua( AV46Coste_mAgua );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi( AV51Coste_mgi );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc( AV52Coste_madc );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam( AV53Coste_mam );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m( AV29Tiempo_m );
         AV34CostesBasicos_Fases_SDTItem.setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro( AV9Lhipro );
         AV33CostesBasicos_Fases_SDT.add(AV34CostesBasicos_Fases_SDTItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8CostesBasicos_Fases_SDTjson = AV33CostesBasicos_Fases_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'FAMILIA' Routine */
      returnInSub = false ;
      AV69Grdtipart = (short)(0) ;
      /* Using cursor P0ATG4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV68bartipart)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A829TipArtCod = P0ATG4_A829TipArtCod[0] ;
         A4364GrdTipArt = P0ATG4_A4364GrdTipArt[0] ;
         AV69Grdtipart = A4364GrdTipArt ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'COSMIN' Routine */
      returnInSub = false ;
      AV12MaqCosMin = DecimalUtil.doubleToDec(0) ;
      AV13maqDsc = "" ;
      AV14MaqMOD = DecimalUtil.doubleToDec(0) ;
      AV15MaqMOI = DecimalUtil.doubleToDec(0) ;
      AV16MaqEnerg = DecimalUtil.doubleToDec(0) ;
      AV17MaqGas = DecimalUtil.doubleToDec(0) ;
      AV18MaqAgua = DecimalUtil.doubleToDec(0) ;
      AV19MaqGI = DecimalUtil.doubleToDec(0) ;
      AV20MaqAdCent = DecimalUtil.doubleToDec(0) ;
      AV21MaqAmort = DecimalUtil.doubleToDec(0) ;
      AV22TipmaqCod = "" ;
      /* Using cursor P0ATG5 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV11MaqCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A602MaqCod = P0ATG5_A602MaqCod[0] ;
         A605MaqCosMin = P0ATG5_A605MaqCosMin[0] ;
         n605MaqCosMin = P0ATG5_n605MaqCosMin[0] ;
         A14533MaqAmort = P0ATG5_A14533MaqAmort[0] ;
         A14532MaqAdCent = P0ATG5_A14532MaqAdCent[0] ;
         A14531MaqGI = P0ATG5_A14531MaqGI[0] ;
         A11825MaqAgua = P0ATG5_A11825MaqAgua[0] ;
         n11825MaqAgua = P0ATG5_n11825MaqAgua[0] ;
         A11824MaqGas = P0ATG5_A11824MaqGas[0] ;
         n11824MaqGas = P0ATG5_n11824MaqGas[0] ;
         A11823MaqEnerg = P0ATG5_A11823MaqEnerg[0] ;
         n11823MaqEnerg = P0ATG5_n11823MaqEnerg[0] ;
         A11822MaqMOI = P0ATG5_A11822MaqMOI[0] ;
         n11822MaqMOI = P0ATG5_n11822MaqMOI[0] ;
         A11821MaqMOD = P0ATG5_A11821MaqMOD[0] ;
         n11821MaqMOD = P0ATG5_n11821MaqMOD[0] ;
         A606MaqDsc = P0ATG5_A606MaqDsc[0] ;
         n606MaqDsc = P0ATG5_n606MaqDsc[0] ;
         A1011TipMaqCod = P0ATG5_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0ATG5_n1011TipMaqCod[0] ;
         AV12MaqCosMin = ((AV23TasasEstandar>0) ? (A11821MaqMOD.add(A11822MaqMOI).add(A11823MaqEnerg).add(A11824MaqGas).add(A11825MaqAgua).add(A14531MaqGI).add(A14532MaqAdCent).add(A14533MaqAmort)) : A605MaqCosMin) ;
         AV13maqDsc = A606MaqDsc ;
         AV22TipmaqCod = A1011TipMaqCod ;
         if ( AV23TasasEstandar == 1 )
         {
            AV14MaqMOD = A11821MaqMOD ;
            AV15MaqMOI = A11822MaqMOI ;
            AV16MaqEnerg = A11823MaqEnerg ;
            AV17MaqGas = A11824MaqGas ;
            AV18MaqAgua = A11825MaqAgua ;
            AV19MaqGI = A14531MaqGI ;
            AV20MaqAdCent = A14532MaqAdCent ;
            AV21MaqAmort = A14533MaqAmort ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'TIEREA' Routine */
      returnInSub = false ;
      AV29Tiempo_m = 0 ;
      /* Using cursor P0ATG6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodReo), AV27BarCodPar, Short.valueOf(AV28BarOrdLin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A556HisProEst = P0ATG6_A556HisProEst[0] ;
         A656ParCod = P0ATG6_A656ParCod[0] ;
         n656ParCod = P0ATG6_n656ParCod[0] ;
         A194BarOrdLin = P0ATG6_A194BarOrdLin[0] ;
         A561HisProLin = P0ATG6_A561HisProLin[0] ;
         A558HisProFec = P0ATG6_A558HisProFec[0] ;
         A4440HisProDTI = P0ATG6_A4440HisProDTI[0] ;
         n4440HisProDTI = P0ATG6_n4440HisProDTI[0] ;
         A4441HisProDTF = P0ATG6_A4441HisProDTF[0] ;
         n4441HisProDTF = P0ATG6_n4441HisProDTF[0] ;
         A602MaqCod = P0ATG6_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV29Tiempo_m = (int)(AV29Tiempo_m+A5605HisProTr2) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP4[0] = costesbasicos_fases_prc.this.AV8CostesBasicos_Fases_SDTjson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8CostesBasicos_Fases_SDTjson = "" ;
      AV33CostesBasicos_Fases_SDT = new GXBaseCollection<app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem>(app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem.class, "CostesBasicos_Fases_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0ATG3_A396EmprCod = new String[] {""} ;
      P0ATG3_A129BarCod = new int[1] ;
      P0ATG3_A132BarCodReo = new byte[1] ;
      P0ATG3_A130BarCodPar = new String[] {""} ;
      P0ATG3_A228BarUniMed = new String[] {""} ;
      P0ATG3_A603MaqCodBis = new String[] {""} ;
      P0ATG3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG3_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG3_n5719BarFasKgT = new boolean[] {false} ;
      P0ATG3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG3_n3837BarFasKgm = new boolean[] {false} ;
      P0ATG3_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG3_n5720BarFasMtT = new boolean[] {false} ;
      P0ATG3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG3_n3838BarFasMtr = new boolean[] {false} ;
      P0ATG3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG3_A457FasCod = new String[] {""} ;
      P0ATG3_A252CliCod = new int[1] ;
      P0ATG3_n252CliCod = new boolean[] {false} ;
      P0ATG3_A212BarSer = new String[] {""} ;
      P0ATG3_A135BarColNom = new String[] {""} ;
      P0ATG3_A136BarColNum = new int[1] ;
      P0ATG3_A218BarTipCol = new byte[1] ;
      P0ATG3_A217BarTipArt = new short[1] ;
      P0ATG3_n217BarTipArt = new boolean[] {false} ;
      P0ATG3_A150BarFacTin = new String[] {""} ;
      P0ATG3_A165BarHorIni = new short[1] ;
      P0ATG3_A164BarHorFin = new short[1] ;
      P0ATG3_A6173BarFasSec = new String[] {""} ;
      P0ATG3_n6173BarFasSec = new boolean[] {false} ;
      P0ATG3_A460FasDsc = new String[] {""} ;
      P0ATG3_A194BarOrdLin = new short[1] ;
      P0ATG3_A758ProCod = new String[] {""} ;
      P0ATG3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A228BarUniMed = "" ;
      A603MaqCodBis = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A150BarFacTin = "" ;
      A6173BarFasSec = "" ;
      A460FasDsc = "" ;
      A758ProCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV27BarCodPar = "" ;
      AV44BarUniMed = "" ;
      AV54Kgm = DecimalUtil.ZERO ;
      AV55Mtr = DecimalUtil.ZERO ;
      AV11MaqCod = "" ;
      AV13maqDsc = "" ;
      GXt_char3 = "" ;
      AV75CosPrd = DecimalUtil.ZERO ;
      AV35CosPrd1 = DecimalUtil.ZERO ;
      AV45Coste_m = DecimalUtil.ZERO ;
      AV36CostAgua = DecimalUtil.ZERO ;
      AV37Costenergia = DecimalUtil.ZERO ;
      AV38Costgas = DecimalUtil.ZERO ;
      AV39Costmod = DecimalUtil.ZERO ;
      AV40Costmoi = DecimalUtil.ZERO ;
      AV41Costgi = DecimalUtil.ZERO ;
      AV42Costadc = DecimalUtil.ZERO ;
      AV43Costam = DecimalUtil.ZERO ;
      AV46Coste_mAgua = DecimalUtil.ZERO ;
      AV47Coste_menergia = DecimalUtil.ZERO ;
      AV48Coste_mgas = DecimalUtil.ZERO ;
      AV49Coste_mmod = DecimalUtil.ZERO ;
      AV50Coste_mmoi = DecimalUtil.ZERO ;
      AV51Coste_mgi = DecimalUtil.ZERO ;
      AV52Coste_madc = DecimalUtil.ZERO ;
      AV53Coste_mam = DecimalUtil.ZERO ;
      AV12MaqCosMin = DecimalUtil.ZERO ;
      AV14MaqMOD = DecimalUtil.ZERO ;
      AV15MaqMOI = DecimalUtil.ZERO ;
      AV16MaqEnerg = DecimalUtil.ZERO ;
      AV17MaqGas = DecimalUtil.ZERO ;
      AV18MaqAgua = DecimalUtil.ZERO ;
      AV19MaqGI = DecimalUtil.ZERO ;
      AV20MaqAdCent = DecimalUtil.ZERO ;
      AV21MaqAmort = DecimalUtil.ZERO ;
      AV32BarTieRea = DecimalUtil.ZERO ;
      AV22TipmaqCod = "" ;
      AV56Unidades = DecimalUtil.ZERO ;
      AV57Unidadest = DecimalUtil.ZERO ;
      AV70TieTeo = DecimalUtil.ZERO ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV77fecteo = GXutil.nullDate() ;
      GXv_date10 = new java.util.Date[1] ;
      AV74tteo = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char14 = new String[1] ;
      GXv_int19 = new long[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int17 = new int[1] ;
      GXv_char16 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char18 = new String[1] ;
      GXv_int20 = new int[1] ;
      GXv_int8 = new short[1] ;
      GXv_int21 = new short[1] ;
      AV76Coste_tm = DecimalUtil.ZERO ;
      AV58Ceros4 = "" ;
      AV59HorIni = "" ;
      AV61HorIni_5 = "" ;
      AV62HorFin = "" ;
      AV63HorFin_5 = "" ;
      AV34CostesBasicos_Fases_SDTItem = new app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem(remoteHandle, context);
      P0ATG4_A396EmprCod = new String[] {""} ;
      P0ATG4_A829TipArtCod = new short[1] ;
      P0ATG4_A4364GrdTipArt = new short[1] ;
      P0ATG5_A396EmprCod = new String[] {""} ;
      P0ATG5_A602MaqCod = new String[] {""} ;
      P0ATG5_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG5_n605MaqCosMin = new boolean[] {false} ;
      P0ATG5_A14533MaqAmort = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG5_A14532MaqAdCent = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG5_A14531MaqGI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG5_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG5_n11825MaqAgua = new boolean[] {false} ;
      P0ATG5_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG5_n11824MaqGas = new boolean[] {false} ;
      P0ATG5_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG5_n11823MaqEnerg = new boolean[] {false} ;
      P0ATG5_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG5_n11822MaqMOI = new boolean[] {false} ;
      P0ATG5_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATG5_n11821MaqMOD = new boolean[] {false} ;
      P0ATG5_A606MaqDsc = new String[] {""} ;
      P0ATG5_n606MaqDsc = new boolean[] {false} ;
      P0ATG5_A1011TipMaqCod = new String[] {""} ;
      P0ATG5_n1011TipMaqCod = new boolean[] {false} ;
      A602MaqCod = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A14533MaqAmort = DecimalUtil.ZERO ;
      A14532MaqAdCent = DecimalUtil.ZERO ;
      A14531MaqGI = DecimalUtil.ZERO ;
      A11825MaqAgua = DecimalUtil.ZERO ;
      A11824MaqGas = DecimalUtil.ZERO ;
      A11823MaqEnerg = DecimalUtil.ZERO ;
      A11822MaqMOI = DecimalUtil.ZERO ;
      A11821MaqMOD = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A1011TipMaqCod = "" ;
      P0ATG6_A396EmprCod = new String[] {""} ;
      P0ATG6_A556HisProEst = new byte[1] ;
      P0ATG6_A656ParCod = new short[1] ;
      P0ATG6_n656ParCod = new boolean[] {false} ;
      P0ATG6_A194BarOrdLin = new short[1] ;
      P0ATG6_A130BarCodPar = new String[] {""} ;
      P0ATG6_A132BarCodReo = new byte[1] ;
      P0ATG6_A129BarCod = new int[1] ;
      P0ATG6_A561HisProLin = new int[1] ;
      P0ATG6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATG6_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATG6_n4440HisProDTI = new boolean[] {false} ;
      P0ATG6_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATG6_n4441HisProDTF = new boolean[] {false} ;
      P0ATG6_A602MaqCod = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.costesbasicos_fases_prc__default(),
         new Object[] {
             new Object[] {
            P0ATG3_A396EmprCod, P0ATG3_A129BarCod, P0ATG3_A132BarCodReo, P0ATG3_A130BarCodPar, P0ATG3_A228BarUniMed, P0ATG3_A603MaqCodBis, P0ATG3_A215BarTieRea, P0ATG3_A5719BarFasKgT, P0ATG3_n5719BarFasKgT, P0ATG3_A3837BarFasKgm,
            P0ATG3_n3837BarFasKgm, P0ATG3_A5720BarFasMtT, P0ATG3_n5720BarFasMtT, P0ATG3_A3838BarFasMtr, P0ATG3_n3838BarFasMtr, P0ATG3_A216BarTieTeo, P0ATG3_A457FasCod, P0ATG3_A252CliCod, P0ATG3_n252CliCod, P0ATG3_A212BarSer,
            P0ATG3_A135BarColNom, P0ATG3_A136BarColNum, P0ATG3_A218BarTipCol, P0ATG3_A217BarTipArt, P0ATG3_n217BarTipArt, P0ATG3_A150BarFacTin, P0ATG3_A165BarHorIni, P0ATG3_A164BarHorFin, P0ATG3_A6173BarFasSec, P0ATG3_n6173BarFasSec,
            P0ATG3_A460FasDsc, P0ATG3_A194BarOrdLin, P0ATG3_A758ProCod, P0ATG3_A166BarKgm, P0ATG3_A184BarMtr
            }
            , new Object[] {
            P0ATG4_A396EmprCod, P0ATG4_A829TipArtCod, P0ATG4_A4364GrdTipArt
            }
            , new Object[] {
            P0ATG5_A396EmprCod, P0ATG5_A602MaqCod, P0ATG5_A605MaqCosMin, P0ATG5_n605MaqCosMin, P0ATG5_A14533MaqAmort, P0ATG5_A14532MaqAdCent, P0ATG5_A14531MaqGI, P0ATG5_A11825MaqAgua, P0ATG5_n11825MaqAgua, P0ATG5_A11824MaqGas,
            P0ATG5_n11824MaqGas, P0ATG5_A11823MaqEnerg, P0ATG5_n11823MaqEnerg, P0ATG5_A11822MaqMOI, P0ATG5_n11822MaqMOI, P0ATG5_A11821MaqMOD, P0ATG5_n11821MaqMOD, P0ATG5_A606MaqDsc, P0ATG5_n606MaqDsc, P0ATG5_A1011TipMaqCod,
            P0ATG5_n1011TipMaqCod
            }
            , new Object[] {
            P0ATG6_A396EmprCod, P0ATG6_A556HisProEst, P0ATG6_A656ParCod, P0ATG6_n656ParCod, P0ATG6_A194BarOrdLin, P0ATG6_A130BarCodPar, P0ATG6_A132BarCodReo, P0ATG6_A129BarCod, P0ATG6_A561HisProLin, P0ATG6_A558HisProFec,
            P0ATG6_A4440HisProDTI, P0ATG6_n4440HisProDTI, P0ATG6_A4441HisProDTF, P0ATG6_n4441HisProDTF, P0ATG6_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXt_int1 ;
   private byte A218BarTipCol ;
   private byte AV26BarCodReo ;
   private byte AV9Lhipro ;
   private byte AV30CosTiR ;
   private byte AV31Min ;
   private byte GXv_int2[] ;
   private byte GXv_int9[] ;
   private byte A556HisProEst ;
   private short AV10reoperados ;
   private short AV23TasasEstandar ;
   private short AV24Moda21 ;
   private short A217BarTipArt ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A194BarOrdLin ;
   private short AV71hnd ;
   private short AV72Sicsv ;
   private short AV73teotixfi ;
   private short AV68bartipart ;
   private short AV69Grdtipart ;
   private short GXv_int8[] ;
   private short GXv_int21[] ;
   private short AV60LenVar ;
   private short A829TipArtCod ;
   private short A4364GrdTipArt ;
   private short AV28BarOrdLin ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV25BarCod ;
   private int AV29Tiempo_m ;
   private int GXv_int17[] ;
   private int GXv_int7[] ;
   private int AV67Fornumcol ;
   private int GXv_int20[] ;
   private int A561HisProLin ;
   private long GXv_int19[] ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV54Kgm ;
   private java.math.BigDecimal AV55Mtr ;
   private java.math.BigDecimal AV75CosPrd ;
   private java.math.BigDecimal AV35CosPrd1 ;
   private java.math.BigDecimal AV45Coste_m ;
   private java.math.BigDecimal AV36CostAgua ;
   private java.math.BigDecimal AV37Costenergia ;
   private java.math.BigDecimal AV38Costgas ;
   private java.math.BigDecimal AV39Costmod ;
   private java.math.BigDecimal AV40Costmoi ;
   private java.math.BigDecimal AV41Costgi ;
   private java.math.BigDecimal AV42Costadc ;
   private java.math.BigDecimal AV43Costam ;
   private java.math.BigDecimal AV46Coste_mAgua ;
   private java.math.BigDecimal AV47Coste_menergia ;
   private java.math.BigDecimal AV48Coste_mgas ;
   private java.math.BigDecimal AV49Coste_mmod ;
   private java.math.BigDecimal AV50Coste_mmoi ;
   private java.math.BigDecimal AV51Coste_mgi ;
   private java.math.BigDecimal AV52Coste_madc ;
   private java.math.BigDecimal AV53Coste_mam ;
   private java.math.BigDecimal AV12MaqCosMin ;
   private java.math.BigDecimal AV14MaqMOD ;
   private java.math.BigDecimal AV15MaqMOI ;
   private java.math.BigDecimal AV16MaqEnerg ;
   private java.math.BigDecimal AV17MaqGas ;
   private java.math.BigDecimal AV18MaqAgua ;
   private java.math.BigDecimal AV19MaqGI ;
   private java.math.BigDecimal AV20MaqAdCent ;
   private java.math.BigDecimal AV21MaqAmort ;
   private java.math.BigDecimal AV32BarTieRea ;
   private java.math.BigDecimal AV56Unidades ;
   private java.math.BigDecimal AV57Unidadest ;
   private java.math.BigDecimal AV70TieTeo ;
   private java.math.BigDecimal AV74tteo ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal AV76Coste_tm ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A14533MaqAmort ;
   private java.math.BigDecimal A14532MaqAdCent ;
   private java.math.BigDecimal A14531MaqGI ;
   private java.math.BigDecimal A11825MaqAgua ;
   private java.math.BigDecimal A11824MaqGas ;
   private java.math.BigDecimal A11823MaqEnerg ;
   private java.math.BigDecimal A11822MaqMOI ;
   private java.math.BigDecimal A11821MaqMOD ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A228BarUniMed ;
   private String A603MaqCodBis ;
   private String A457FasCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A150BarFacTin ;
   private String A6173BarFasSec ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private String AV27BarCodPar ;
   private String AV44BarUniMed ;
   private String AV11MaqCod ;
   private String AV13maqDsc ;
   private String GXt_char3 ;
   private String AV22TipmaqCod ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char14[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String GXv_char18[] ;
   private String AV58Ceros4 ;
   private String AV59HorIni ;
   private String AV61HorIni_5 ;
   private String AV62HorFin ;
   private String AV63HorFin_5 ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A1011TipMaqCod ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV77fecteo ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date A558HisProFec ;
   private boolean n5719BarFasKgT ;
   private boolean n3837BarFasKgm ;
   private boolean n5720BarFasMtT ;
   private boolean n3838BarFasMtr ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n6173BarFasSec ;
   private boolean returnInSub ;
   private boolean n605MaqCosMin ;
   private boolean n11825MaqAgua ;
   private boolean n11824MaqGas ;
   private boolean n11823MaqEnerg ;
   private boolean n11822MaqMOI ;
   private boolean n11821MaqMOD ;
   private boolean n606MaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String AV8CostesBasicos_Fases_SDTjson ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATG3_A396EmprCod ;
   private int[] P0ATG3_A129BarCod ;
   private byte[] P0ATG3_A132BarCodReo ;
   private String[] P0ATG3_A130BarCodPar ;
   private String[] P0ATG3_A228BarUniMed ;
   private String[] P0ATG3_A603MaqCodBis ;
   private java.math.BigDecimal[] P0ATG3_A215BarTieRea ;
   private java.math.BigDecimal[] P0ATG3_A5719BarFasKgT ;
   private boolean[] P0ATG3_n5719BarFasKgT ;
   private java.math.BigDecimal[] P0ATG3_A3837BarFasKgm ;
   private boolean[] P0ATG3_n3837BarFasKgm ;
   private java.math.BigDecimal[] P0ATG3_A5720BarFasMtT ;
   private boolean[] P0ATG3_n5720BarFasMtT ;
   private java.math.BigDecimal[] P0ATG3_A3838BarFasMtr ;
   private boolean[] P0ATG3_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0ATG3_A216BarTieTeo ;
   private String[] P0ATG3_A457FasCod ;
   private int[] P0ATG3_A252CliCod ;
   private boolean[] P0ATG3_n252CliCod ;
   private String[] P0ATG3_A212BarSer ;
   private String[] P0ATG3_A135BarColNom ;
   private int[] P0ATG3_A136BarColNum ;
   private byte[] P0ATG3_A218BarTipCol ;
   private short[] P0ATG3_A217BarTipArt ;
   private boolean[] P0ATG3_n217BarTipArt ;
   private String[] P0ATG3_A150BarFacTin ;
   private short[] P0ATG3_A165BarHorIni ;
   private short[] P0ATG3_A164BarHorFin ;
   private String[] P0ATG3_A6173BarFasSec ;
   private boolean[] P0ATG3_n6173BarFasSec ;
   private String[] P0ATG3_A460FasDsc ;
   private short[] P0ATG3_A194BarOrdLin ;
   private String[] P0ATG3_A758ProCod ;
   private java.math.BigDecimal[] P0ATG3_A166BarKgm ;
   private java.math.BigDecimal[] P0ATG3_A184BarMtr ;
   private String[] P0ATG4_A396EmprCod ;
   private short[] P0ATG4_A829TipArtCod ;
   private short[] P0ATG4_A4364GrdTipArt ;
   private String[] P0ATG5_A396EmprCod ;
   private String[] P0ATG5_A602MaqCod ;
   private java.math.BigDecimal[] P0ATG5_A605MaqCosMin ;
   private boolean[] P0ATG5_n605MaqCosMin ;
   private java.math.BigDecimal[] P0ATG5_A14533MaqAmort ;
   private java.math.BigDecimal[] P0ATG5_A14532MaqAdCent ;
   private java.math.BigDecimal[] P0ATG5_A14531MaqGI ;
   private java.math.BigDecimal[] P0ATG5_A11825MaqAgua ;
   private boolean[] P0ATG5_n11825MaqAgua ;
   private java.math.BigDecimal[] P0ATG5_A11824MaqGas ;
   private boolean[] P0ATG5_n11824MaqGas ;
   private java.math.BigDecimal[] P0ATG5_A11823MaqEnerg ;
   private boolean[] P0ATG5_n11823MaqEnerg ;
   private java.math.BigDecimal[] P0ATG5_A11822MaqMOI ;
   private boolean[] P0ATG5_n11822MaqMOI ;
   private java.math.BigDecimal[] P0ATG5_A11821MaqMOD ;
   private boolean[] P0ATG5_n11821MaqMOD ;
   private String[] P0ATG5_A606MaqDsc ;
   private boolean[] P0ATG5_n606MaqDsc ;
   private String[] P0ATG5_A1011TipMaqCod ;
   private boolean[] P0ATG5_n1011TipMaqCod ;
   private String[] P0ATG6_A396EmprCod ;
   private byte[] P0ATG6_A556HisProEst ;
   private short[] P0ATG6_A656ParCod ;
   private boolean[] P0ATG6_n656ParCod ;
   private short[] P0ATG6_A194BarOrdLin ;
   private String[] P0ATG6_A130BarCodPar ;
   private byte[] P0ATG6_A132BarCodReo ;
   private int[] P0ATG6_A129BarCod ;
   private int[] P0ATG6_A561HisProLin ;
   private java.util.Date[] P0ATG6_A558HisProFec ;
   private java.util.Date[] P0ATG6_A4440HisProDTI ;
   private boolean[] P0ATG6_n4440HisProDTI ;
   private java.util.Date[] P0ATG6_A4441HisProDTF ;
   private boolean[] P0ATG6_n4441HisProDTF ;
   private String[] P0ATG6_A602MaqCod ;
   private GXBaseCollection<app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem> AV33CostesBasicos_Fases_SDT ;
   private app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem AV34CostesBasicos_Fases_SDTItem ;
}

final  class costesbasicos_fases_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATG3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarUniMed, T1.MaqCodBis, T1.BarTieRea, T1.BarFasKgT, T1.BarFasKgm, T1.BarFasMtT, T1.BarFasMtr, T1.BarTieTeo, T1.FasCod, T3.CliCod, T3.BarSer, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T3.BarTipArt, T1.BarFacTin, T1.BarHorIni, T1.BarHorFin, T1.BarFasSec, T2.FasDsc, T1.BarOrdLin, T1.ProCod, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarMtr, 0) AS BarMtr FROM (((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATG4", "SELECT EmprCod, TipArtCod, GrdTipArt FROM TXPGRDTI1 WHERE (EmprCod = ?) AND (TipArtCod = ?) ORDER BY EmprCod, GrdTipArt, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATG5", "SELECT EmprCod, MaqCod, MaqCosMin, MaqAmort, MaqAdCent, MaqGI, MaqAgua, MaqGas, MaqEnerg, MaqMOI, MaqMOD, MaqDsc, TipMaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATG6", "SELECT EmprCod, HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, HisProLin, HisProFec, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (ParCod = 0) AND (HisProEst = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[16])[0] = rslt.getString(13, 8);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((String[]) buf[20])[0] = rslt.getString(16, 13);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((byte[]) buf[22])[0] = rslt.getByte(18);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               ((short[]) buf[26])[0] = rslt.getShort(21);
               ((short[]) buf[27])[0] = rslt.getShort(22);
               ((String[]) buf[28])[0] = rslt.getString(23, 2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(24, 28);
               ((short[]) buf[31])[0] = rslt.getShort(25);
               ((String[]) buf[32])[0] = rslt.getString(26, 8);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(28,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 3 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

