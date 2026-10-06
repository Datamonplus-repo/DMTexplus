package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recuperodatoscostesmaquina extends GXProcedure
{
   public recuperodatoscostesmaquina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuperodatoscostesmaquina.class ), "" );
   }

   public recuperodatoscostesmaquina( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           String[] aP7 ,
                                           String[] aP8 ,
                                           String[] aP9 ,
                                           int[] aP10 ,
                                           String[] aP11 ,
                                           byte[] aP12 ,
                                           java.math.BigDecimal[] aP13 ,
                                           java.math.BigDecimal[] aP14 ,
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
                                           int[] aP27 ,
                                           String[] aP28 ,
                                           String[] aP29 ,
                                           java.math.BigDecimal[] aP30 ,
                                           java.math.BigDecimal[] aP31 ,
                                           java.math.BigDecimal[] aP32 )
   {
      recuperodatoscostesmaquina.this.aP33 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33);
      return aP33[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        byte[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
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
                        int[] aP27 ,
                        String[] aP28 ,
                        String[] aP29 ,
                        java.math.BigDecimal[] aP30 ,
                        java.math.BigDecimal[] aP31 ,
                        java.math.BigDecimal[] aP32 ,
                        java.math.BigDecimal[] aP33 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             byte[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
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
                             int[] aP27 ,
                             String[] aP28 ,
                             String[] aP29 ,
                             java.math.BigDecimal[] aP30 ,
                             java.math.BigDecimal[] aP31 ,
                             java.math.BigDecimal[] aP32 ,
                             java.math.BigDecimal[] aP33 )
   {
      recuperodatoscostesmaquina.this.AV96EmprCod = aP0[0];
      this.aP0 = aP0;
      recuperodatoscostesmaquina.this.AV12Barcod = aP1[0];
      this.aP1 = aP1;
      recuperodatoscostesmaquina.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      recuperodatoscostesmaquina.this.AV14BarCodPar = aP3[0];
      this.aP3 = aP3;
      recuperodatoscostesmaquina.this.AV41BarUniMed = aP4[0];
      this.aP4 = aP4;
      recuperodatoscostesmaquina.this.AV127Kgm = aP5[0];
      this.aP5 = aP5;
      recuperodatoscostesmaquina.this.AV173Mtr = aP6[0];
      this.aP6 = aP6;
      recuperodatoscostesmaquina.this.AV157MaqCod = aP7[0];
      this.aP7 = aP7;
      recuperodatoscostesmaquina.this.AV100fascod = aP8[0];
      this.aP8 = aP8;
      recuperodatoscostesmaquina.this.AV232ProCod = aP9[0];
      this.aP9 = aP9;
      recuperodatoscostesmaquina.this.AV44clicod = aP10[0];
      this.aP10 = aP10;
      recuperodatoscostesmaquina.this.AV36BarSer = aP11[0];
      this.aP11 = aP11;
      recuperodatoscostesmaquina.this.AV198TasasEstandar = aP12[0];
      this.aP12 = aP12;
      recuperodatoscostesmaquina.this.AV38BarTieRea = aP13[0];
      this.aP13 = aP13;
      recuperodatoscostesmaquina.this.AV233BarTieTeo = aP14[0];
      this.aP14 = aP14;
      recuperodatoscostesmaquina.this.AV24Barfaskgm = aP15[0];
      this.aP15 = aP15;
      recuperodatoscostesmaquina.this.AV25Barfaskgt = aP16[0];
      this.aP16 = aP16;
      recuperodatoscostesmaquina.this.AV230barfasmtt = aP17[0];
      this.aP17 = aP17;
      recuperodatoscostesmaquina.this.AV231barfasmtr = aP18[0];
      this.aP18 = aP18;
      recuperodatoscostesmaquina.this.aP19 = aP19;
      recuperodatoscostesmaquina.this.aP20 = aP20;
      recuperodatoscostesmaquina.this.aP21 = aP21;
      recuperodatoscostesmaquina.this.aP22 = aP22;
      recuperodatoscostesmaquina.this.aP23 = aP23;
      recuperodatoscostesmaquina.this.aP24 = aP24;
      recuperodatoscostesmaquina.this.aP25 = aP25;
      recuperodatoscostesmaquina.this.aP26 = aP26;
      recuperodatoscostesmaquina.this.aP27 = aP27;
      recuperodatoscostesmaquina.this.aP28 = aP28;
      recuperodatoscostesmaquina.this.aP29 = aP29;
      recuperodatoscostesmaquina.this.aP30 = aP30;
      recuperodatoscostesmaquina.this.aP31 = aP31;
      recuperodatoscostesmaquina.this.aP32 = aP32;
      recuperodatoscostesmaquina.this.aP33 = aP33;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV89CosTiR ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV96EmprCod, httpContext.getMessage( "COSTIR", ""), GXv_int2) ;
      recuperodatoscostesmaquina.this.GXt_int1 = GXv_int2[0] ;
      AV89CosTiR = GXt_int1 ;
      AV52CosPrd = DecimalUtil.ZERO ;
      AV53cosprd1 = DecimalUtil.ZERO ;
      AV61Coste_m = DecimalUtil.ZERO ;
      AV54CostAgua = DecimalUtil.ZERO ;
      AV80Costenergia = DecimalUtil.doubleToDec(0) ;
      AV88Costgas = DecimalUtil.ZERO ;
      AV90Costmod = DecimalUtil.ZERO ;
      AV91Costmoi = DecimalUtil.ZERO ;
      AV62Coste_mAgua = DecimalUtil.ZERO ;
      AV63Coste_menergia = DecimalUtil.ZERO ;
      AV64Coste_mgas = DecimalUtil.ZERO ;
      AV65Coste_mmod = DecimalUtil.ZERO ;
      AV66Coste_mmoi = DecimalUtil.ZERO ;
      /* Execute user subroutine: 'COSMIN' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( (0==AV89CosTiR) )
      {
         AV168Min = (byte)(DecimalUtil.decToDouble((AV38BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV38BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
         AV200Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(AV38BarTieRea))*60)+AV168Min) ;
      }
      else
      {
         /* Execute user subroutine: 'TIEREA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV38BarTieRea = DecimalUtil.doubleToDec(GXutil.Int( AV200Tiempo_m/ (double) (60))+(AV200Tiempo_m-(GXutil.Int( AV200Tiempo_m/ (double) (60))*60))/ (double) (100)) ;
      }
      AV53cosprd1 = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV200Tiempo_m).multiply(AV159MaqCosMin)), 2) ;
      AV54CostAgua = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV200Tiempo_m).multiply(AV156MaqAgua)), 2) ;
      AV80Costenergia = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV200Tiempo_m).multiply(AV161MaqEnerg)), 2) ;
      AV88Costgas = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV200Tiempo_m).multiply(AV162MaqGas)), 2) ;
      AV90Costmod = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV200Tiempo_m).multiply(AV163MaqMOD)), 2) ;
      AV91Costmoi = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV200Tiempo_m).multiply(AV164MaqMOI)), 2) ;
      if ( GXutil.strcmp(GXutil.trim( AV203TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
      {
         if ( GXutil.strcmp(AV41BarUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            AV61Coste_m = GXutil.roundDecimal( (AV159MaqCosMin.multiply(AV127Kgm)), 2) ;
            AV62Coste_mAgua = GXutil.roundDecimal( (AV156MaqAgua.multiply(AV127Kgm)), 2) ;
            AV63Coste_menergia = GXutil.roundDecimal( (AV161MaqEnerg.multiply(AV127Kgm)), 2) ;
            AV64Coste_mgas = GXutil.roundDecimal( (AV162MaqGas.multiply(AV127Kgm)), 2) ;
            AV65Coste_mmod = GXutil.roundDecimal( (AV163MaqMOD.multiply(AV127Kgm)), 2) ;
            AV66Coste_mmoi = GXutil.roundDecimal( (AV164MaqMOI.multiply(AV127Kgm)), 2) ;
         }
         else
         {
            AV61Coste_m = GXutil.roundDecimal( (AV159MaqCosMin.multiply(AV173Mtr)), 2) ;
            AV62Coste_mAgua = GXutil.roundDecimal( (AV156MaqAgua.multiply(AV173Mtr)), 2) ;
            AV63Coste_menergia = GXutil.roundDecimal( (AV161MaqEnerg.multiply(AV173Mtr)), 2) ;
            AV64Coste_mgas = GXutil.roundDecimal( (AV162MaqGas.multiply(AV173Mtr)), 2) ;
            AV65Coste_mmod = GXutil.roundDecimal( (AV163MaqMOD.multiply(AV173Mtr)), 2) ;
            AV66Coste_mmoi = GXutil.roundDecimal( (AV164MaqMOI.multiply(AV173Mtr)), 2) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(AV41BarUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            if ( AV25Barfaskgt.doubleValue() > 0 )
            {
               AV61Coste_m = (AV53cosprd1.multiply(AV24Barfaskgm)).divide(AV25Barfaskgt, 18, java.math.RoundingMode.DOWN) ;
               AV62Coste_mAgua = (AV54CostAgua.multiply(AV24Barfaskgm)).divide(AV25Barfaskgt, 18, java.math.RoundingMode.DOWN) ;
               AV63Coste_menergia = (AV80Costenergia.multiply(AV24Barfaskgm)).divide(AV25Barfaskgt, 18, java.math.RoundingMode.DOWN) ;
               AV64Coste_mgas = (AV88Costgas.multiply(AV24Barfaskgm)).divide(AV25Barfaskgt, 18, java.math.RoundingMode.DOWN) ;
               AV65Coste_mmod = (AV90Costmod.multiply(AV24Barfaskgm)).divide(AV25Barfaskgt, 18, java.math.RoundingMode.DOWN) ;
               AV66Coste_mmoi = (AV91Costmoi.multiply(AV24Barfaskgm)).divide(AV25Barfaskgt, 18, java.math.RoundingMode.DOWN) ;
               AV220Unidades = AV24Barfaskgm ;
               AV221Unidadest = AV25Barfaskgt ;
            }
            else
            {
               if ( AV127Kgm.doubleValue() > 0 )
               {
                  AV61Coste_m = (AV53cosprd1.multiply(AV127Kgm)).divide(AV127Kgm, 18, java.math.RoundingMode.DOWN) ;
                  AV62Coste_mAgua = (AV54CostAgua.multiply(AV127Kgm)).divide(AV127Kgm, 18, java.math.RoundingMode.DOWN) ;
                  AV63Coste_menergia = (AV80Costenergia.multiply(AV127Kgm)).divide(AV127Kgm, 18, java.math.RoundingMode.DOWN) ;
                  AV64Coste_mgas = (AV88Costgas.multiply(AV127Kgm)).divide(AV127Kgm, 18, java.math.RoundingMode.DOWN) ;
                  AV65Coste_mmod = (AV90Costmod.multiply(AV127Kgm)).divide(AV127Kgm, 18, java.math.RoundingMode.DOWN) ;
                  AV66Coste_mmoi = (AV91Costmoi.multiply(AV127Kgm)).divide(AV127Kgm, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV61Coste_m = AV53cosprd1 ;
                  AV62Coste_mAgua = AV54CostAgua ;
                  AV63Coste_menergia = AV80Costenergia ;
                  AV64Coste_mgas = AV88Costgas ;
                  AV65Coste_mmod = AV90Costmod ;
                  AV66Coste_mmoi = AV91Costmoi ;
               }
               AV220Unidades = AV127Kgm ;
               AV221Unidadest = AV127Kgm ;
            }
         }
         else
         {
            if ( AV230barfasmtt.doubleValue() > 0 )
            {
               AV61Coste_m = (AV53cosprd1.multiply(AV231barfasmtr)).divide(AV230barfasmtt, 18, java.math.RoundingMode.DOWN) ;
               AV62Coste_mAgua = (AV54CostAgua.multiply(AV231barfasmtr)).divide(AV230barfasmtt, 18, java.math.RoundingMode.DOWN) ;
               AV63Coste_menergia = (AV80Costenergia.multiply(AV231barfasmtr)).divide(AV230barfasmtt, 18, java.math.RoundingMode.DOWN) ;
               AV64Coste_mgas = (AV88Costgas.multiply(AV231barfasmtr)).divide(AV230barfasmtt, 18, java.math.RoundingMode.DOWN) ;
               AV65Coste_mmod = (AV90Costmod.multiply(AV231barfasmtr)).divide(AV230barfasmtt, 18, java.math.RoundingMode.DOWN) ;
               AV66Coste_mmoi = (AV91Costmoi.multiply(AV231barfasmtr)).divide(AV230barfasmtt, 18, java.math.RoundingMode.DOWN) ;
               AV220Unidades = AV231barfasmtr ;
               AV221Unidadest = AV230barfasmtt ;
            }
            else
            {
               if ( AV173Mtr.doubleValue() > 0 )
               {
                  AV61Coste_m = (AV53cosprd1.multiply(AV173Mtr)).divide(AV173Mtr, 18, java.math.RoundingMode.DOWN) ;
                  AV62Coste_mAgua = (AV54CostAgua.multiply(AV173Mtr)).divide(AV173Mtr, 18, java.math.RoundingMode.DOWN) ;
                  AV63Coste_menergia = (AV80Costenergia.multiply(AV173Mtr)).divide(AV173Mtr, 18, java.math.RoundingMode.DOWN) ;
                  AV64Coste_mgas = (AV88Costgas.multiply(AV173Mtr)).divide(AV173Mtr, 18, java.math.RoundingMode.DOWN) ;
                  AV65Coste_mmod = (AV90Costmod.multiply(AV173Mtr)).divide(AV173Mtr, 18, java.math.RoundingMode.DOWN) ;
                  AV66Coste_mmoi = (AV91Costmoi.multiply(AV173Mtr)).divide(AV173Mtr, 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV61Coste_m = AV53cosprd1 ;
                  AV62Coste_mAgua = AV54CostAgua ;
                  AV63Coste_menergia = AV80Costenergia ;
                  AV64Coste_mgas = AV88Costgas ;
                  AV65Coste_mmod = AV90Costmod ;
                  AV66Coste_mmoi = AV91Costmoi ;
               }
               AV220Unidades = AV173Mtr ;
               AV221Unidadest = AV173Mtr ;
            }
         }
      }
      AV201TieTeo = AV233BarTieTeo ;
      GXv_char3[0] = AV96EmprCod ;
      GXv_int4[0] = AV12Barcod ;
      GXv_int2[0] = AV16BarCodReo ;
      GXv_char5[0] = AV14BarCodPar ;
      GXv_char6[0] = AV100fascod ;
      GXv_date7[0] = AV108fecteo ;
      GXv_decimal8[0] = AV214tteo ;
      GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char11[0] = "" ;
      GXv_char12[0] = AV232ProCod ;
      GXv_char13[0] = AV157MaqCod ;
      GXv_int14[0] = AV44clicod ;
      GXv_char15[0] = AV36BarSer ;
      GXv_int16[0] = AV119hnd ;
      GXv_int17[0] = AV188Sicsv ;
      new app.ppla001(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_char6, GXv_date7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_char11, GXv_char12, GXv_char13, GXv_int14, GXv_char15, GXv_int16, GXv_int17) ;
      recuperodatoscostesmaquina.this.AV96EmprCod = GXv_char3[0] ;
      recuperodatoscostesmaquina.this.AV12Barcod = GXv_int4[0] ;
      recuperodatoscostesmaquina.this.AV16BarCodReo = GXv_int2[0] ;
      recuperodatoscostesmaquina.this.AV14BarCodPar = GXv_char5[0] ;
      recuperodatoscostesmaquina.this.AV100fascod = GXv_char6[0] ;
      recuperodatoscostesmaquina.this.AV108fecteo = GXv_date7[0] ;
      recuperodatoscostesmaquina.this.AV214tteo = GXv_decimal8[0] ;
      recuperodatoscostesmaquina.this.AV232ProCod = GXv_char12[0] ;
      recuperodatoscostesmaquina.this.AV157MaqCod = GXv_char13[0] ;
      recuperodatoscostesmaquina.this.AV44clicod = GXv_int14[0] ;
      recuperodatoscostesmaquina.this.AV36BarSer = GXv_char15[0] ;
      recuperodatoscostesmaquina.this.AV119hnd = GXv_int16[0] ;
      recuperodatoscostesmaquina.this.AV188Sicsv = GXv_int17[0] ;
      AV52CosPrd = DecimalUtil.ZERO ;
      AV72Coste_tm = DecimalUtil.ZERO ;
      AV168Min = (byte)(DecimalUtil.decToDouble((AV201TieTeo.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV201TieTeo))))).multiply(DecimalUtil.doubleToDec(100)))) ;
      AV52CosPrd = GXutil.roundDecimal( (DecimalUtil.doubleToDec(((GXutil.Int( DecimalUtil.decToDouble(AV201TieTeo))*60)+AV168Min)).multiply(AV159MaqCosMin)), 2) ;
      if ( GXutil.strcmp(GXutil.trim( AV203TipmaqCod), "EXT") == 0 )
      {
         if ( GXutil.strcmp(AV41BarUniMed, "K") == 0 )
         {
            AV72Coste_tm = GXutil.roundDecimal( (AV159MaqCosMin.multiply(AV127Kgm)), 2) ;
         }
         else
         {
            AV72Coste_tm = GXutil.roundDecimal( (AV159MaqCosMin.multiply(AV173Mtr)), 2) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(AV41BarUniMed, "K") == 0 )
         {
            if ( A5719BarFasKgT.doubleValue() > 0 )
            {
               AV72Coste_tm = (AV52CosPrd.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV72Coste_tm = AV52CosPrd ;
            }
         }
         else
         {
            if ( A5720BarFasMtT.doubleValue() > 0 )
            {
               AV72Coste_tm = (AV52CosPrd.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV72Coste_tm = AV52CosPrd ;
            }
         }
      }
      AV43Ceros4 = "0000" ;
      AV122HorIni = GXutil.str( A165BarHorIni, 4, 0) ;
      AV122HorIni = GXutil.ltrim( GXutil.rtrim( AV122HorIni)) ;
      AV132Lenvar = (short)(GXutil.len( AV122HorIni)) ;
      AV132Lenvar = (short)(4-AV132Lenvar) ;
      AV122HorIni = GXutil.substring( AV43Ceros4, 1, AV132Lenvar) + AV122HorIni ;
      AV123HorIni_5 = GXutil.substring( AV122HorIni, 1, 2) + "." + GXutil.substring( AV122HorIni, 3, 2) ;
      AV120HorFin = GXutil.str( A164BarHorFin, 4, 0) ;
      AV120HorFin = GXutil.ltrim( GXutil.rtrim( AV120HorFin)) ;
      AV132Lenvar = (short)(GXutil.len( AV120HorFin)) ;
      AV132Lenvar = (short)(4-AV132Lenvar) ;
      AV120HorFin = GXutil.substring( AV43Ceros4, 1, AV132Lenvar) + AV120HorFin ;
      AV121HorFin_5 = GXutil.substring( AV120HorFin, 1, 2) + "." + GXutil.substring( AV120HorFin, 3, 2) ;
      if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) != 0 )
      {
         AV68Coste_p_k = DecimalUtil.doubleToDec(0) ;
         if ( AV127Kgm.doubleValue() > 0 )
         {
            AV68Coste_p_k = AV61Coste_m.divide(AV127Kgm, 18, java.math.RoundingMode.DOWN) ;
         }
      }
      else
      {
         AV68Coste_p_k = DecimalUtil.doubleToDec(0) ;
         if ( AV127Kgm.doubleValue() > 0 )
         {
            AV68Coste_p_k = (AV61Coste_m.add(AV21BarCosPro).add(AV20BarCosAny)).divide(AV127Kgm, 18, java.math.RoundingMode.DOWN) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'TIEREA' Routine */
      returnInSub = false ;
      AV200Tiempo_m = 0 ;
      /* Using cursor P093I2 */
      pr_default.execute(0, new Object[] {AV96EmprCod, Integer.valueOf(AV12Barcod), Byte.valueOf(AV16BarCodReo), AV14BarCodPar, Short.valueOf(AV32BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A556HisProEst = P093I2_A556HisProEst[0] ;
         A656ParCod = P093I2_A656ParCod[0] ;
         n656ParCod = P093I2_n656ParCod[0] ;
         A194BarOrdLin = P093I2_A194BarOrdLin[0] ;
         A130BarCodPar = P093I2_A130BarCodPar[0] ;
         A132BarCodReo = P093I2_A132BarCodReo[0] ;
         A129BarCod = P093I2_A129BarCod[0] ;
         A396EmprCod = P093I2_A396EmprCod[0] ;
         A561HisProLin = P093I2_A561HisProLin[0] ;
         A558HisProFec = P093I2_A558HisProFec[0] ;
         A4440HisProDTI = P093I2_A4440HisProDTI[0] ;
         n4440HisProDTI = P093I2_n4440HisProDTI[0] ;
         A4441HisProDTF = P093I2_A4441HisProDTF[0] ;
         n4441HisProDTF = P093I2_n4441HisProDTF[0] ;
         A602MaqCod = P093I2_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV200Tiempo_m = (int)(AV200Tiempo_m+(GXutil.Int( A5605HisProTr2))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'COSMIN' Routine */
      returnInSub = false ;
      AV159MaqCosMin = DecimalUtil.ZERO ;
      AV160maqDsc = "" ;
      AV163MaqMOD = DecimalUtil.doubleToDec(0) ;
      AV164MaqMOI = DecimalUtil.doubleToDec(0) ;
      AV161MaqEnerg = DecimalUtil.doubleToDec(0) ;
      AV162MaqGas = DecimalUtil.doubleToDec(0) ;
      AV156MaqAgua = DecimalUtil.doubleToDec(0) ;
      AV203TipmaqCod = "" ;
      /* Using cursor P093I3 */
      pr_default.execute(1, new Object[] {AV96EmprCod, AV157MaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P093I3_A602MaqCod[0] ;
         A396EmprCod = P093I3_A396EmprCod[0] ;
         A605MaqCosMin = P093I3_A605MaqCosMin[0] ;
         n605MaqCosMin = P093I3_n605MaqCosMin[0] ;
         A11825MaqAgua = P093I3_A11825MaqAgua[0] ;
         n11825MaqAgua = P093I3_n11825MaqAgua[0] ;
         A11824MaqGas = P093I3_A11824MaqGas[0] ;
         n11824MaqGas = P093I3_n11824MaqGas[0] ;
         A11823MaqEnerg = P093I3_A11823MaqEnerg[0] ;
         n11823MaqEnerg = P093I3_n11823MaqEnerg[0] ;
         A11822MaqMOI = P093I3_A11822MaqMOI[0] ;
         n11822MaqMOI = P093I3_n11822MaqMOI[0] ;
         A11821MaqMOD = P093I3_A11821MaqMOD[0] ;
         n11821MaqMOD = P093I3_n11821MaqMOD[0] ;
         A606MaqDsc = P093I3_A606MaqDsc[0] ;
         n606MaqDsc = P093I3_n606MaqDsc[0] ;
         A1011TipMaqCod = P093I3_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P093I3_n1011TipMaqCod[0] ;
         AV159MaqCosMin = ((AV198TasasEstandar>0) ? (A11821MaqMOD.add(A11822MaqMOI).add(A11823MaqEnerg).add(A11824MaqGas).add(A11825MaqAgua)) : A605MaqCosMin) ;
         AV160maqDsc = A606MaqDsc ;
         AV203TipmaqCod = A1011TipMaqCod ;
         if ( AV198TasasEstandar == 1 )
         {
            AV163MaqMOD = A11821MaqMOD ;
            AV164MaqMOI = A11822MaqMOI ;
            AV161MaqEnerg = A11823MaqEnerg ;
            AV162MaqGas = A11824MaqGas ;
            AV156MaqAgua = A11825MaqAgua ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = recuperodatoscostesmaquina.this.AV96EmprCod;
      this.aP1[0] = recuperodatoscostesmaquina.this.AV12Barcod;
      this.aP2[0] = recuperodatoscostesmaquina.this.AV16BarCodReo;
      this.aP3[0] = recuperodatoscostesmaquina.this.AV14BarCodPar;
      this.aP4[0] = recuperodatoscostesmaquina.this.AV41BarUniMed;
      this.aP5[0] = recuperodatoscostesmaquina.this.AV127Kgm;
      this.aP6[0] = recuperodatoscostesmaquina.this.AV173Mtr;
      this.aP7[0] = recuperodatoscostesmaquina.this.AV157MaqCod;
      this.aP8[0] = recuperodatoscostesmaquina.this.AV100fascod;
      this.aP9[0] = recuperodatoscostesmaquina.this.AV232ProCod;
      this.aP10[0] = recuperodatoscostesmaquina.this.AV44clicod;
      this.aP11[0] = recuperodatoscostesmaquina.this.AV36BarSer;
      this.aP12[0] = recuperodatoscostesmaquina.this.AV198TasasEstandar;
      this.aP13[0] = recuperodatoscostesmaquina.this.AV38BarTieRea;
      this.aP14[0] = recuperodatoscostesmaquina.this.AV233BarTieTeo;
      this.aP15[0] = recuperodatoscostesmaquina.this.AV24Barfaskgm;
      this.aP16[0] = recuperodatoscostesmaquina.this.AV25Barfaskgt;
      this.aP17[0] = recuperodatoscostesmaquina.this.AV230barfasmtt;
      this.aP18[0] = recuperodatoscostesmaquina.this.AV231barfasmtr;
      this.aP19[0] = recuperodatoscostesmaquina.this.AV61Coste_m;
      this.aP20[0] = recuperodatoscostesmaquina.this.AV72Coste_tm;
      this.aP21[0] = recuperodatoscostesmaquina.this.AV159MaqCosMin;
      this.aP22[0] = recuperodatoscostesmaquina.this.AV65Coste_mmod;
      this.aP23[0] = recuperodatoscostesmaquina.this.AV66Coste_mmoi;
      this.aP24[0] = recuperodatoscostesmaquina.this.AV63Coste_menergia;
      this.aP25[0] = recuperodatoscostesmaquina.this.AV64Coste_mgas;
      this.aP26[0] = recuperodatoscostesmaquina.this.AV62Coste_mAgua;
      this.aP27[0] = recuperodatoscostesmaquina.this.AV200Tiempo_m;
      this.aP28[0] = recuperodatoscostesmaquina.this.AV123HorIni_5;
      this.aP29[0] = recuperodatoscostesmaquina.this.AV121HorFin_5;
      this.aP30[0] = recuperodatoscostesmaquina.this.AV214tteo;
      this.aP31[0] = recuperodatoscostesmaquina.this.AV220Unidades;
      this.aP32[0] = recuperodatoscostesmaquina.this.AV221Unidadest;
      this.aP33[0] = recuperodatoscostesmaquina.this.AV68Coste_p_k;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV61Coste_m = DecimalUtil.ZERO ;
      AV72Coste_tm = DecimalUtil.ZERO ;
      AV159MaqCosMin = DecimalUtil.ZERO ;
      AV65Coste_mmod = DecimalUtil.ZERO ;
      AV66Coste_mmoi = DecimalUtil.ZERO ;
      AV63Coste_menergia = DecimalUtil.ZERO ;
      AV64Coste_mgas = DecimalUtil.ZERO ;
      AV62Coste_mAgua = DecimalUtil.ZERO ;
      AV123HorIni_5 = "" ;
      AV121HorFin_5 = "" ;
      AV214tteo = DecimalUtil.ZERO ;
      AV220Unidades = DecimalUtil.ZERO ;
      AV221Unidadest = DecimalUtil.ZERO ;
      AV68Coste_p_k = DecimalUtil.ZERO ;
      AV52CosPrd = DecimalUtil.ZERO ;
      AV53cosprd1 = DecimalUtil.ZERO ;
      AV54CostAgua = DecimalUtil.ZERO ;
      AV80Costenergia = DecimalUtil.ZERO ;
      AV88Costgas = DecimalUtil.ZERO ;
      AV90Costmod = DecimalUtil.ZERO ;
      AV91Costmoi = DecimalUtil.ZERO ;
      AV156MaqAgua = DecimalUtil.ZERO ;
      AV161MaqEnerg = DecimalUtil.ZERO ;
      AV162MaqGas = DecimalUtil.ZERO ;
      AV163MaqMOD = DecimalUtil.ZERO ;
      AV164MaqMOI = DecimalUtil.ZERO ;
      AV203TipmaqCod = "" ;
      AV201TieTeo = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV108fecteo = GXutil.nullDate() ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_char15 = new String[1] ;
      GXv_int16 = new long[1] ;
      GXv_int17 = new byte[1] ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      AV43Ceros4 = "" ;
      AV122HorIni = "" ;
      AV120HorFin = "" ;
      A150BarFacTin = "" ;
      AV21BarCosPro = DecimalUtil.ZERO ;
      AV20BarCosAny = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P093I2_A556HisProEst = new byte[1] ;
      P093I2_A656ParCod = new short[1] ;
      P093I2_n656ParCod = new boolean[] {false} ;
      P093I2_A194BarOrdLin = new short[1] ;
      P093I2_A130BarCodPar = new String[] {""} ;
      P093I2_A132BarCodReo = new byte[1] ;
      P093I2_A129BarCod = new int[1] ;
      P093I2_A396EmprCod = new String[] {""} ;
      P093I2_A561HisProLin = new int[1] ;
      P093I2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P093I2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P093I2_n4440HisProDTI = new boolean[] {false} ;
      P093I2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P093I2_n4441HisProDTF = new boolean[] {false} ;
      P093I2_A602MaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      AV160maqDsc = "" ;
      P093I3_A602MaqCod = new String[] {""} ;
      P093I3_A396EmprCod = new String[] {""} ;
      P093I3_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093I3_n605MaqCosMin = new boolean[] {false} ;
      P093I3_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093I3_n11825MaqAgua = new boolean[] {false} ;
      P093I3_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093I3_n11824MaqGas = new boolean[] {false} ;
      P093I3_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093I3_n11823MaqEnerg = new boolean[] {false} ;
      P093I3_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093I3_n11822MaqMOI = new boolean[] {false} ;
      P093I3_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093I3_n11821MaqMOD = new boolean[] {false} ;
      P093I3_A606MaqDsc = new String[] {""} ;
      P093I3_n606MaqDsc = new boolean[] {false} ;
      P093I3_A1011TipMaqCod = new String[] {""} ;
      P093I3_n1011TipMaqCod = new boolean[] {false} ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A11825MaqAgua = DecimalUtil.ZERO ;
      A11824MaqGas = DecimalUtil.ZERO ;
      A11823MaqEnerg = DecimalUtil.ZERO ;
      A11822MaqMOI = DecimalUtil.ZERO ;
      A11821MaqMOD = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A1011TipMaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuperodatoscostesmaquina__default(),
         new Object[] {
             new Object[] {
            P093I2_A556HisProEst, P093I2_A656ParCod, P093I2_n656ParCod, P093I2_A194BarOrdLin, P093I2_A130BarCodPar, P093I2_A132BarCodReo, P093I2_A129BarCod, P093I2_A396EmprCod, P093I2_A561HisProLin, P093I2_A558HisProFec,
            P093I2_A4440HisProDTI, P093I2_n4440HisProDTI, P093I2_A4441HisProDTF, P093I2_n4441HisProDTF, P093I2_A602MaqCod
            }
            , new Object[] {
            P093I3_A602MaqCod, P093I3_A396EmprCod, P093I3_A605MaqCosMin, P093I3_n605MaqCosMin, P093I3_A11825MaqAgua, P093I3_n11825MaqAgua, P093I3_A11824MaqGas, P093I3_n11824MaqGas, P093I3_A11823MaqEnerg, P093I3_n11823MaqEnerg,
            P093I3_A11822MaqMOI, P093I3_n11822MaqMOI, P093I3_A11821MaqMOD, P093I3_n11821MaqMOD, P093I3_A606MaqDsc, P093I3_n606MaqDsc, P093I3_A1011TipMaqCod, P093I3_n1011TipMaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV198TasasEstandar ;
   private byte AV89CosTiR ;
   private byte GXt_int1 ;
   private byte AV168Min ;
   private byte GXv_int2[] ;
   private byte AV188Sicsv ;
   private byte GXv_int17[] ;
   private byte A556HisProEst ;
   private byte A132BarCodReo ;
   private short A165BarHorIni ;
   private short AV132Lenvar ;
   private short A164BarHorFin ;
   private short AV32BarOrdLin ;
   private short A656ParCod ;
   private short A194BarOrdLin ;
   private short A5605HisProTr2 ;
   private short Gx_err ;
   private int AV12Barcod ;
   private int AV44clicod ;
   private int AV200Tiempo_m ;
   private int GXv_int4[] ;
   private int GXv_int14[] ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private long AV119hnd ;
   private long GXv_int16[] ;
   private java.math.BigDecimal AV127Kgm ;
   private java.math.BigDecimal AV173Mtr ;
   private java.math.BigDecimal AV38BarTieRea ;
   private java.math.BigDecimal AV233BarTieTeo ;
   private java.math.BigDecimal AV24Barfaskgm ;
   private java.math.BigDecimal AV25Barfaskgt ;
   private java.math.BigDecimal AV230barfasmtt ;
   private java.math.BigDecimal AV231barfasmtr ;
   private java.math.BigDecimal AV61Coste_m ;
   private java.math.BigDecimal AV72Coste_tm ;
   private java.math.BigDecimal AV159MaqCosMin ;
   private java.math.BigDecimal AV65Coste_mmod ;
   private java.math.BigDecimal AV66Coste_mmoi ;
   private java.math.BigDecimal AV63Coste_menergia ;
   private java.math.BigDecimal AV64Coste_mgas ;
   private java.math.BigDecimal AV62Coste_mAgua ;
   private java.math.BigDecimal AV214tteo ;
   private java.math.BigDecimal AV220Unidades ;
   private java.math.BigDecimal AV221Unidadest ;
   private java.math.BigDecimal AV68Coste_p_k ;
   private java.math.BigDecimal AV52CosPrd ;
   private java.math.BigDecimal AV53cosprd1 ;
   private java.math.BigDecimal AV54CostAgua ;
   private java.math.BigDecimal AV80Costenergia ;
   private java.math.BigDecimal AV88Costgas ;
   private java.math.BigDecimal AV90Costmod ;
   private java.math.BigDecimal AV91Costmoi ;
   private java.math.BigDecimal AV156MaqAgua ;
   private java.math.BigDecimal AV161MaqEnerg ;
   private java.math.BigDecimal AV162MaqGas ;
   private java.math.BigDecimal AV163MaqMOD ;
   private java.math.BigDecimal AV164MaqMOI ;
   private java.math.BigDecimal AV201TieTeo ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV21BarCosPro ;
   private java.math.BigDecimal AV20BarCosAny ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A11825MaqAgua ;
   private java.math.BigDecimal A11824MaqGas ;
   private java.math.BigDecimal A11823MaqEnerg ;
   private java.math.BigDecimal A11822MaqMOI ;
   private java.math.BigDecimal A11821MaqMOD ;
   private String AV96EmprCod ;
   private String AV14BarCodPar ;
   private String AV41BarUniMed ;
   private String AV157MaqCod ;
   private String AV100fascod ;
   private String AV232ProCod ;
   private String AV36BarSer ;
   private String AV123HorIni_5 ;
   private String AV121HorFin_5 ;
   private String AV203TipmaqCod ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char15[] ;
   private String AV43Ceros4 ;
   private String AV122HorIni ;
   private String AV120HorFin ;
   private String A150BarFacTin ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV160maqDsc ;
   private String A606MaqDsc ;
   private String A1011TipMaqCod ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV108fecteo ;
   private java.util.Date GXv_date7[] ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n605MaqCosMin ;
   private boolean n11825MaqAgua ;
   private boolean n11824MaqGas ;
   private boolean n11823MaqEnerg ;
   private boolean n11822MaqMOI ;
   private boolean n11821MaqMOD ;
   private boolean n606MaqDsc ;
   private boolean n1011TipMaqCod ;
   private java.math.BigDecimal[] aP33 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private byte[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
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
   private int[] aP27 ;
   private String[] aP28 ;
   private String[] aP29 ;
   private java.math.BigDecimal[] aP30 ;
   private java.math.BigDecimal[] aP31 ;
   private java.math.BigDecimal[] aP32 ;
   private IDataStoreProvider pr_default ;
   private byte[] P093I2_A556HisProEst ;
   private short[] P093I2_A656ParCod ;
   private boolean[] P093I2_n656ParCod ;
   private short[] P093I2_A194BarOrdLin ;
   private String[] P093I2_A130BarCodPar ;
   private byte[] P093I2_A132BarCodReo ;
   private int[] P093I2_A129BarCod ;
   private String[] P093I2_A396EmprCod ;
   private int[] P093I2_A561HisProLin ;
   private java.util.Date[] P093I2_A558HisProFec ;
   private java.util.Date[] P093I2_A4440HisProDTI ;
   private boolean[] P093I2_n4440HisProDTI ;
   private java.util.Date[] P093I2_A4441HisProDTF ;
   private boolean[] P093I2_n4441HisProDTF ;
   private String[] P093I2_A602MaqCod ;
   private String[] P093I3_A602MaqCod ;
   private String[] P093I3_A396EmprCod ;
   private java.math.BigDecimal[] P093I3_A605MaqCosMin ;
   private boolean[] P093I3_n605MaqCosMin ;
   private java.math.BigDecimal[] P093I3_A11825MaqAgua ;
   private boolean[] P093I3_n11825MaqAgua ;
   private java.math.BigDecimal[] P093I3_A11824MaqGas ;
   private boolean[] P093I3_n11824MaqGas ;
   private java.math.BigDecimal[] P093I3_A11823MaqEnerg ;
   private boolean[] P093I3_n11823MaqEnerg ;
   private java.math.BigDecimal[] P093I3_A11822MaqMOI ;
   private boolean[] P093I3_n11822MaqMOI ;
   private java.math.BigDecimal[] P093I3_A11821MaqMOD ;
   private boolean[] P093I3_n11821MaqMOD ;
   private String[] P093I3_A606MaqDsc ;
   private boolean[] P093I3_n606MaqDsc ;
   private String[] P093I3_A1011TipMaqCod ;
   private boolean[] P093I3_n1011TipMaqCod ;
}

final  class recuperodatoscostesmaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093I2", "SELECT HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, HisProLin, HisProFec, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND ((ParCod = 0)) AND (BarOrdLin = ?) AND (HisProEst = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093I3", "SELECT MaqCod, EmprCod, MaqCosMin, MaqAgua, MaqGas, MaqEnerg, MaqMOI, MaqMOD, MaqDsc, TipMaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 4);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

