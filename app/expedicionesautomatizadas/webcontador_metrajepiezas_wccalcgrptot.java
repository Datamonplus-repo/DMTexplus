package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webcontador_metrajepiezas_wccalcgrptot extends GXProcedure
{
   public webcontador_metrajepiezas_wccalcgrptot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webcontador_metrajepiezas_wccalcgrptot.class ), "" );
   }

   public webcontador_metrajepiezas_wccalcgrptot( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( byte aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             java.math.BigDecimal aP10 ,
                             java.math.BigDecimal aP11 ,
                             java.math.BigDecimal aP12 ,
                             java.math.BigDecimal aP13 ,
                             short aP14 ,
                             short aP15 ,
                             java.math.BigDecimal aP16 ,
                             java.math.BigDecimal aP17 ,
                             byte aP18 ,
                             byte aP19 ,
                             String aP20 ,
                             String aP21 ,
                             short aP22 ,
                             short aP23 ,
                             String aP24 ,
                             String aP25 ,
                             String[] aP26 ,
                             String[] aP27 )
   {
      webcontador_metrajepiezas_wccalcgrptot.this.aP28 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28);
      return aP28[0];
   }

   public void execute( byte aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        java.math.BigDecimal aP10 ,
                        java.math.BigDecimal aP11 ,
                        java.math.BigDecimal aP12 ,
                        java.math.BigDecimal aP13 ,
                        short aP14 ,
                        short aP15 ,
                        java.math.BigDecimal aP16 ,
                        java.math.BigDecimal aP17 ,
                        byte aP18 ,
                        byte aP19 ,
                        String aP20 ,
                        String aP21 ,
                        short aP22 ,
                        short aP23 ,
                        String aP24 ,
                        String aP25 ,
                        String[] aP26 ,
                        String[] aP27 ,
                        String[] aP28 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28);
   }

   private void execute_int( byte aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             java.math.BigDecimal aP10 ,
                             java.math.BigDecimal aP11 ,
                             java.math.BigDecimal aP12 ,
                             java.math.BigDecimal aP13 ,
                             short aP14 ,
                             short aP15 ,
                             java.math.BigDecimal aP16 ,
                             java.math.BigDecimal aP17 ,
                             byte aP18 ,
                             byte aP19 ,
                             String aP20 ,
                             String aP21 ,
                             short aP22 ,
                             short aP23 ,
                             String aP24 ,
                             String aP25 ,
                             String[] aP26 ,
                             String[] aP27 ,
                             String[] aP28 )
   {
      webcontador_metrajepiezas_wccalcgrptot.this.AV36GroupMetPieEst = aP0;
      webcontador_metrajepiezas_wccalcgrptot.this.AV10EmprCod = aP1;
      webcontador_metrajepiezas_wccalcgrptot.this.AV11BarCod = aP2;
      webcontador_metrajepiezas_wccalcgrptot.this.AV12BarCodReo = aP3;
      webcontador_metrajepiezas_wccalcgrptot.this.AV13BarCodPar = aP4;
      webcontador_metrajepiezas_wccalcgrptot.this.AV15FilterFullText = aP5;
      webcontador_metrajepiezas_wccalcgrptot.this.AV16TFMetTerCod = aP6;
      webcontador_metrajepiezas_wccalcgrptot.this.AV17TFMetTerCod_Sel = aP7;
      webcontador_metrajepiezas_wccalcgrptot.this.AV18TFMetPieCod = aP8;
      webcontador_metrajepiezas_wccalcgrptot.this.AV19TFMetPieCod_Sel = aP9;
      webcontador_metrajepiezas_wccalcgrptot.this.AV20TFMetPieKil = aP10;
      webcontador_metrajepiezas_wccalcgrptot.this.AV21TFMetPieKil_To = aP11;
      webcontador_metrajepiezas_wccalcgrptot.this.AV22TFMetPieMet = aP12;
      webcontador_metrajepiezas_wccalcgrptot.this.AV23TFMetPieMet_To = aP13;
      webcontador_metrajepiezas_wccalcgrptot.this.AV24TFMetPieAnc = aP14;
      webcontador_metrajepiezas_wccalcgrptot.this.AV25TFMetPieAnc_To = aP15;
      webcontador_metrajepiezas_wccalcgrptot.this.AV26TFMetPieMtD = aP16;
      webcontador_metrajepiezas_wccalcgrptot.this.AV27TFMetPieMtD_To = aP17;
      webcontador_metrajepiezas_wccalcgrptot.this.AV28TFMetPieEst = aP18;
      webcontador_metrajepiezas_wccalcgrptot.this.AV29TFMetPieEst_To = aP19;
      webcontador_metrajepiezas_wccalcgrptot.this.AV30TFMetPieObs = aP20;
      webcontador_metrajepiezas_wccalcgrptot.this.AV31TFMetPieObs_Sel = aP21;
      webcontador_metrajepiezas_wccalcgrptot.this.AV32TFMetPieDfUlt = aP22;
      webcontador_metrajepiezas_wccalcgrptot.this.AV33TFMetPieDfUlt_To = aP23;
      webcontador_metrajepiezas_wccalcgrptot.this.AV34TFBarUniMed = aP24;
      webcontador_metrajepiezas_wccalcgrptot.this.AV35TFBarUniMed_Sel = aP25;
      webcontador_metrajepiezas_wccalcgrptot.this.aP26 = aP26;
      webcontador_metrajepiezas_wccalcgrptot.this.aP27 = aP27;
      webcontador_metrajepiezas_wccalcgrptot.this.aP28 = aP28;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV48Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV10EmprCod ;
      AV49Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV11BarCod ;
      AV50Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV12BarCodReo ;
      AV51Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV13BarCodPar ;
      AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV16TFMetTerCod ;
      AV54Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV17TFMetTerCod_Sel ;
      AV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV18TFMetPieCod ;
      AV56Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV19TFMetPieCod_Sel ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV20TFMetPieKil ;
      AV58Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV21TFMetPieKil_To ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV22TFMetPieMet ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV23TFMetPieMet_To ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV24TFMetPieAnc ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV25TFMetPieAnc_To ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV26TFMetPieMtD ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV27TFMetPieMtD_To ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV28TFMetPieEst ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV29TFMetPieEst_To ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV30TFMetPieObs ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV31TFMetPieObs_Sel ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV32TFMetPieDfUlt ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV33TFMetPieDfUlt_To ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV34TFBarUniMed ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV35TFBarUniMed_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                           AV54Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                           AV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                           AV56Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                           AV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                           AV57Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                           AV58Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                           AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                           AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                           Short.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) ,
                                           Short.valueOf(AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) ,
                                           AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                           AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                           Byte.valueOf(AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) ,
                                           Byte.valueOf(AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                           AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                           Short.valueOf(AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) ,
                                           Short.valueOf(AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) ,
                                           AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                           AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4917MetPieObs ,
                                           Short.valueOf(A12994MetPieDfUl) ,
                                           A228BarUniMed ,
                                           A396EmprCod ,
                                           AV10EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV11BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV12BarCodReo) ,
                                           A130BarCodPar ,
                                           AV13BarCodPar ,
                                           Byte.valueOf(AV36GroupMetPieEst) ,
                                           AV48Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                           Integer.valueOf(AV49Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod) ,
                                           Byte.valueOf(AV50Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo) ,
                                           AV51Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod), 10, "%") ;
      lV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod), 9, "%") ;
      lV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = GXutil.concat( GXutil.rtrim( AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs), "%", "") ;
      lV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = GXutil.padr( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed), 1, "%") ;
      /* Using cursor P09AV2 */
      pr_default.execute(0, new Object[] {AV48Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, Integer.valueOf(AV49Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod), Byte.valueOf(AV50Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo), AV51Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV36GroupMetPieEst), lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod, AV54Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel, lV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod, AV56Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel, AV57Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil, AV58Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to, AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet, AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to, Short.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc), Short.valueOf(AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to), AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd, AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to, Byte.valueOf(AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest), Byte.valueOf(AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to), lV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel, Short.valueOf(AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult), Short.valueOf(AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to), lV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed, AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A228BarUniMed = P09AV2_A228BarUniMed[0] ;
         A12994MetPieDfUl = P09AV2_A12994MetPieDfUl[0] ;
         A4917MetPieObs = P09AV2_A4917MetPieObs[0] ;
         A2816MetPieEst = P09AV2_A2816MetPieEst[0] ;
         A4910MetPieMtD = P09AV2_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P09AV2_A6635MetPieAnc[0] ;
         A2815MetPieMet = P09AV2_A2815MetPieMet[0] ;
         A2814MetPieKil = P09AV2_A2814MetPieKil[0] ;
         A2813MetPieCod = P09AV2_A2813MetPieCod[0] ;
         A2809MetTerCod = P09AV2_A2809MetTerCod[0] ;
         A130BarCodPar = P09AV2_A130BarCodPar[0] ;
         A132BarCodReo = P09AV2_A132BarCodReo[0] ;
         A129BarCod = P09AV2_A129BarCod[0] ;
         A396EmprCod = P09AV2_A396EmprCod[0] ;
         A228BarUniMed = P09AV2_A228BarUniMed[0] ;
         AV44Count_GroupTotalizerNum = (long)(AV44Count_GroupTotalizerNum+1) ;
         AV39TotMetPieKil = A2814MetPieKil.add(AV39TotMetPieKil) ;
         AV41TotMetPieMet = A2815MetPieMet.add(AV41TotMetPieMet) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV38TotValueMetPieCod = GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44Count_GroupTotalizerNum), "Z,ZZZ,ZZZ,ZZ9")) ;
      AV40TotValueMetPieKil = GXutil.trim( localUtil.format( AV39TotMetPieKil, "ZZZZZ9.99")) ;
      AV42TotValueMetPieMet = GXutil.trim( localUtil.format( AV41TotMetPieMet, "ZZZZZ9.99")) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP26[0] = webcontador_metrajepiezas_wccalcgrptot.this.AV38TotValueMetPieCod;
      this.aP27[0] = webcontador_metrajepiezas_wccalcgrptot.this.AV40TotValueMetPieKil;
      this.aP28[0] = webcontador_metrajepiezas_wccalcgrptot.this.AV42TotValueMetPieMet;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38TotValueMetPieCod = "" ;
      AV40TotValueMetPieKil = "" ;
      AV42TotValueMetPieMet = "" ;
      AV48Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = "" ;
      AV51Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = "" ;
      AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = "" ;
      AV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = "" ;
      AV54Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = "" ;
      AV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = "" ;
      AV56Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = "" ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = DecimalUtil.ZERO ;
      AV58Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = DecimalUtil.ZERO ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = DecimalUtil.ZERO ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = DecimalUtil.ZERO ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = "" ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = "" ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = "" ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = "" ;
      scmdbuf = "" ;
      lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = "" ;
      lV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = "" ;
      lV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = "" ;
      lV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = "" ;
      lV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = "" ;
      A2809MetTerCod = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      A228BarUniMed = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09AV2_A228BarUniMed = new String[] {""} ;
      P09AV2_A12994MetPieDfUl = new short[1] ;
      P09AV2_A4917MetPieObs = new String[] {""} ;
      P09AV2_A2816MetPieEst = new byte[1] ;
      P09AV2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AV2_A6635MetPieAnc = new short[1] ;
      P09AV2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AV2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AV2_A2813MetPieCod = new String[] {""} ;
      P09AV2_A2809MetTerCod = new String[] {""} ;
      P09AV2_A130BarCodPar = new String[] {""} ;
      P09AV2_A132BarCodReo = new byte[1] ;
      P09AV2_A129BarCod = new int[1] ;
      P09AV2_A396EmprCod = new String[] {""} ;
      AV39TotMetPieKil = DecimalUtil.ZERO ;
      AV41TotMetPieMet = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webcontador_metrajepiezas_wccalcgrptot__default(),
         new Object[] {
             new Object[] {
            P09AV2_A228BarUniMed, P09AV2_A12994MetPieDfUl, P09AV2_A4917MetPieObs, P09AV2_A2816MetPieEst, P09AV2_A4910MetPieMtD, P09AV2_A6635MetPieAnc, P09AV2_A2815MetPieMet, P09AV2_A2814MetPieKil, P09AV2_A2813MetPieCod, P09AV2_A2809MetTerCod,
            P09AV2_A130BarCodPar, P09AV2_A132BarCodReo, P09AV2_A129BarCod, P09AV2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV36GroupMetPieEst ;
   private byte AV12BarCodReo ;
   private byte AV28TFMetPieEst ;
   private byte AV29TFMetPieEst_To ;
   private byte AV50Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ;
   private byte AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ;
   private byte AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ;
   private byte A2816MetPieEst ;
   private byte A132BarCodReo ;
   private short AV24TFMetPieAnc ;
   private short AV25TFMetPieAnc_To ;
   private short AV32TFMetPieDfUlt ;
   private short AV33TFMetPieDfUlt_To ;
   private short AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ;
   private short AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ;
   private short AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ;
   private short AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ;
   private short A6635MetPieAnc ;
   private short A12994MetPieDfUl ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int AV49Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ;
   private int A129BarCod ;
   private long AV44Count_GroupTotalizerNum ;
   private java.math.BigDecimal AV20TFMetPieKil ;
   private java.math.BigDecimal AV21TFMetPieKil_To ;
   private java.math.BigDecimal AV22TFMetPieMet ;
   private java.math.BigDecimal AV23TFMetPieMet_To ;
   private java.math.BigDecimal AV26TFMetPieMtD ;
   private java.math.BigDecimal AV27TFMetPieMtD_To ;
   private java.math.BigDecimal AV57Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ;
   private java.math.BigDecimal AV58Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ;
   private java.math.BigDecimal AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ;
   private java.math.BigDecimal AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ;
   private java.math.BigDecimal AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ;
   private java.math.BigDecimal AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal AV39TotMetPieKil ;
   private java.math.BigDecimal AV41TotMetPieMet ;
   private String AV10EmprCod ;
   private String AV13BarCodPar ;
   private String AV16TFMetTerCod ;
   private String AV17TFMetTerCod_Sel ;
   private String AV18TFMetPieCod ;
   private String AV19TFMetPieCod_Sel ;
   private String AV34TFBarUniMed ;
   private String AV35TFBarUniMed_Sel ;
   private String AV48Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ;
   private String AV51Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar ;
   private String AV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ;
   private String AV54Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ;
   private String AV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ;
   private String AV56Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ;
   private String AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ;
   private String AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ;
   private String scmdbuf ;
   private String lV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ;
   private String lV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ;
   private String lV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ;
   private String A2809MetTerCod ;
   private String A2813MetPieCod ;
   private String A228BarUniMed ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15FilterFullText ;
   private String AV30TFMetPieObs ;
   private String AV31TFMetPieObs_Sel ;
   private String AV38TotValueMetPieCod ;
   private String AV40TotValueMetPieKil ;
   private String AV42TotValueMetPieMet ;
   private String AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ;
   private String AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ;
   private String AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ;
   private String lV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ;
   private String lV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ;
   private String A4917MetPieObs ;
   private String[] aP28 ;
   private String[] aP26 ;
   private String[] aP27 ;
   private IDataStoreProvider pr_default ;
   private String[] P09AV2_A228BarUniMed ;
   private short[] P09AV2_A12994MetPieDfUl ;
   private String[] P09AV2_A4917MetPieObs ;
   private byte[] P09AV2_A2816MetPieEst ;
   private java.math.BigDecimal[] P09AV2_A4910MetPieMtD ;
   private short[] P09AV2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P09AV2_A2815MetPieMet ;
   private java.math.BigDecimal[] P09AV2_A2814MetPieKil ;
   private String[] P09AV2_A2813MetPieCod ;
   private String[] P09AV2_A2809MetTerCod ;
   private String[] P09AV2_A130BarCodPar ;
   private byte[] P09AV2_A132BarCodReo ;
   private int[] P09AV2_A129BarCod ;
   private String[] P09AV2_A396EmprCod ;
}

final  class webcontador_metrajepiezas_wccalcgrptot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09AV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                          String AV54Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                          String AV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                          String AV56Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                          String AV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV57Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                          java.math.BigDecimal AV58Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                          java.math.BigDecimal AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                          java.math.BigDecimal AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                          short AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ,
                                          short AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ,
                                          java.math.BigDecimal AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                          java.math.BigDecimal AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                          byte AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ,
                                          byte AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ,
                                          String AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                          String AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                          short AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ,
                                          short AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ,
                                          String AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                          String AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4917MetPieObs ,
                                          short A12994MetPieDfUl ,
                                          String A228BarUniMed ,
                                          String A396EmprCod ,
                                          String AV10EmprCod ,
                                          int A129BarCod ,
                                          int AV11BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV12BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV13BarCodPar ,
                                          byte AV36GroupMetPieEst ,
                                          String AV48Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                          int AV49Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                          byte AV50Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                          String AV51Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[39];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T2.BarUniMed, T1.MetPieDfUl, T1.MetPieObs, T1.MetPieEst, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet, T1.MetPieKil, T1.MetPieCod, T1.MetTerCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.MetPieCod) IS NULL AND NOT(T1.MetPieCod IS NULL)))");
      addWhere(sWhereString, "((T1.MetPieEst = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.MetPieEst = ?)");
      if ( ! (GXutil.strcmp("", AV52Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MetTerCod) like '%' || UPPER(?)) or ( UPPER(T1.MetPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieAnc,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMtD,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieEst,'90'), 2) like '%' || ?) or ( UPPER(T1.MetPieObs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfUl,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int1[9] = (byte)(1) ;
         GXv_int1[10] = (byte)(1) ;
         GXv_int1[11] = (byte)(1) ;
         GXv_int1[12] = (byte)(1) ;
         GXv_int1[13] = (byte)(1) ;
         GXv_int1[14] = (byte)(1) ;
         GXv_int1[15] = (byte)(1) ;
         GXv_int1[16] = (byte)(1) ;
         GXv_int1[17] = (byte)(1) ;
         GXv_int1[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV53Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int1[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetTerCod = ?)");
      }
      else
      {
         GXv_int1[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV55Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int1[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieCod = ?)");
      }
      else
      {
         GXv_int1[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil >= ?)");
      }
      else
      {
         GXv_int1[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil <= ?)");
      }
      else
      {
         GXv_int1[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet >= ?)");
      }
      else
      {
         GXv_int1[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet <= ?)");
      }
      else
      {
         GXv_int1[26] = (byte)(1) ;
      }
      if ( ! (0==AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc >= ?)");
      }
      else
      {
         GXv_int1[27] = (byte)(1) ;
      }
      if ( ! (0==AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc <= ?)");
      }
      else
      {
         GXv_int1[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD >= ?)");
      }
      else
      {
         GXv_int1[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD <= ?)");
      }
      else
      {
         GXv_int1[30] = (byte)(1) ;
      }
      if ( ! (0==AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) )
      {
         addWhere(sWhereString, "(T1.MetPieEst >= ?)");
      }
      else
      {
         GXv_int1[31] = (byte)(1) ;
      }
      if ( ! (0==AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(T1.MetPieEst <= ?)");
      }
      else
      {
         GXv_int1[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) && ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int1[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieObs = ?)");
      }
      else
      {
         GXv_int1[34] = (byte)(1) ;
      }
      if ( ! (0==AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl >= ?)");
      }
      else
      {
         GXv_int1[35] = (byte)(1) ;
      }
      if ( ! (0==AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl <= ?)");
      }
      else
      {
         GXv_int1[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int1[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int1[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P09AV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 10);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 9);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 9);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 1024);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 1024);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               return;
      }
   }

}

