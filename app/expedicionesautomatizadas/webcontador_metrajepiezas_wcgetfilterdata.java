package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webcontador_metrajepiezas_wcgetfilterdata extends GXProcedure
{
   public webcontador_metrajepiezas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webcontador_metrajepiezas_wcgetfilterdata.class ), "" );
   }

   public webcontador_metrajepiezas_wcgetfilterdata( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      webcontador_metrajepiezas_wcgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      webcontador_metrajepiezas_wcgetfilterdata.this.AV42DDOName = aP0;
      webcontador_metrajepiezas_wcgetfilterdata.this.AV43SearchTxt = aP1;
      webcontador_metrajepiezas_wcgetfilterdata.this.AV44SearchTxtTo = aP2;
      webcontador_metrajepiezas_wcgetfilterdata.this.aP3 = aP3;
      webcontador_metrajepiezas_wcgetfilterdata.this.aP4 = aP4;
      webcontador_metrajepiezas_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_METTERCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMETTERCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_METPIECOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIECODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_METPIEOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIEOBSOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_BARUNIMED") == 0 )
      {
         /* Execute user subroutine: 'LOADBARUNIMEDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV45OptionsJson = AV32Options.toJSonString(false) ;
      AV46OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV35OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCGridState"), null, null);
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV10TFMetTerCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV11TFMetTerCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV12TFMetPieCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV13TFMetPieCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV14TFMetPieKil = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFMetPieKil_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV16TFMetPieMet = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFMetPieMet_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV18TFMetPieAnc = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMetPieAnc_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMTD") == 0 )
         {
            AV20TFMetPieMtD = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFMetPieMtD_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEEST") == 0 )
         {
            AV22TFMetPieEst = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFMetPieEst_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEOBS") == 0 )
         {
            AV24TFMetPieObs = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEOBS_SEL") == 0 )
         {
            AV25TFMetPieObs_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFULT") == 0 )
         {
            AV26TFMetPieDfUlt = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFMetPieDfUlt_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED") == 0 )
         {
            AV28TFBarUniMed = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED_SEL") == 0 )
         {
            AV29TFBarUniMed_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49EmprCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV50BarCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV51BarCodReo = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV52BarCodPar = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPECOD") == 0 )
         {
            AV53OpeCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMETTERCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMetTerCod = AV43SearchTxt ;
      AV11TFMetTerCod_Sel = "" ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV49EmprCod ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV50BarCod ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV51BarCodReo ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV52BarCodPar ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV48FilterFullText ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV10TFMetTerCod ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV12TFMetPieCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV14TFMetPieKil ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV15TFMetPieKil_To ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV16TFMetPieMet ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV17TFMetPieMet_To ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV18TFMetPieAnc ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV20TFMetPieMtD ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV21TFMetPieMtD_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV22TFMetPieEst ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV23TFMetPieEst_To ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV24TFMetPieObs ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV25TFMetPieObs_Sel ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV26TFMetPieDfUlt ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV27TFMetPieDfUlt_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV28TFBarUniMed ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV29TFBarUniMed_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                           AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                           AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                           AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                           AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                           AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                           AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                           Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) ,
                                           Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) ,
                                           AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                           AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                           Byte.valueOf(AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) ,
                                           Byte.valueOf(AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) ,
                                           AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                           AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                           Short.valueOf(AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) ,
                                           Short.valueOf(AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) ,
                                           AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                           AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
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
                                           AV49EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           A130BarCodPar ,
                                           AV52BarCodPar ,
                                           AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                           Integer.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod) ,
                                           Byte.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo) ,
                                           AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod), 10, "%") ;
      lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod), 9, "%") ;
      lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = GXutil.concat( GXutil.rtrim( AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs), "%", "") ;
      lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = GXutil.padr( GXutil.rtrim( AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed), 1, "%") ;
      /* Using cursor P09AP2 */
      pr_default.execute(0, new Object[] {AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, Integer.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod), Byte.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo), AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel, lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to, Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc), Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to), AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to, Byte.valueOf(AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest), Byte.valueOf(AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to), lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs, AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel, Short.valueOf(AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult), Short.valueOf(AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to), lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed, AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9AP2 = false ;
         A396EmprCod = P09AP2_A396EmprCod[0] ;
         A129BarCod = P09AP2_A129BarCod[0] ;
         A132BarCodReo = P09AP2_A132BarCodReo[0] ;
         A130BarCodPar = P09AP2_A130BarCodPar[0] ;
         A2809MetTerCod = P09AP2_A2809MetTerCod[0] ;
         A2816MetPieEst = P09AP2_A2816MetPieEst[0] ;
         A228BarUniMed = P09AP2_A228BarUniMed[0] ;
         A12994MetPieDfUl = P09AP2_A12994MetPieDfUl[0] ;
         A4917MetPieObs = P09AP2_A4917MetPieObs[0] ;
         A4910MetPieMtD = P09AP2_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P09AP2_A6635MetPieAnc[0] ;
         A2815MetPieMet = P09AP2_A2815MetPieMet[0] ;
         A2814MetPieKil = P09AP2_A2814MetPieKil[0] ;
         A2813MetPieCod = P09AP2_A2813MetPieCod[0] ;
         A228BarUniMed = P09AP2_A228BarUniMed[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09AP2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09AP2_A129BarCod[0] == A129BarCod ) && ( P09AP2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09AP2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09AP2_A2816MetPieEst[0] == A2816MetPieEst ) && ( GXutil.strcmp(P09AP2_A2809MetTerCod[0], A2809MetTerCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk9AP2 = false ;
            A2813MetPieCod = P09AP2_A2813MetPieCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9AP2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2809MetTerCod)==0) )
         {
            AV31Option = A2809MetTerCod ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9AP2 )
         {
            brk9AP2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMETPIECODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMetPieCod = AV43SearchTxt ;
      AV13TFMetPieCod_Sel = "" ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV49EmprCod ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV50BarCod ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV51BarCodReo ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV52BarCodPar ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV48FilterFullText ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV10TFMetTerCod ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV12TFMetPieCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV14TFMetPieKil ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV15TFMetPieKil_To ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV16TFMetPieMet ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV17TFMetPieMet_To ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV18TFMetPieAnc ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV20TFMetPieMtD ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV21TFMetPieMtD_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV22TFMetPieEst ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV23TFMetPieEst_To ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV24TFMetPieObs ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV25TFMetPieObs_Sel ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV26TFMetPieDfUlt ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV27TFMetPieDfUlt_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV28TFBarUniMed ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV29TFBarUniMed_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                           AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                           AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                           AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                           AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                           AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                           AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                           Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) ,
                                           Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) ,
                                           AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                           AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                           Byte.valueOf(AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) ,
                                           Byte.valueOf(AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) ,
                                           AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                           AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                           Short.valueOf(AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) ,
                                           Short.valueOf(AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) ,
                                           AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                           AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
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
                                           AV49EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           A130BarCodPar ,
                                           AV52BarCodPar ,
                                           AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                           Integer.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod) ,
                                           Byte.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo) ,
                                           AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod), 10, "%") ;
      lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod), 9, "%") ;
      lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = GXutil.concat( GXutil.rtrim( AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs), "%", "") ;
      lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = GXutil.padr( GXutil.rtrim( AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed), 1, "%") ;
      /* Using cursor P09AP3 */
      pr_default.execute(1, new Object[] {AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, Integer.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod), Byte.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo), AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel, lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to, Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc), Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to), AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to, Byte.valueOf(AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest), Byte.valueOf(AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to), lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs, AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel, Short.valueOf(AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult), Short.valueOf(AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to), lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed, AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9AP4 = false ;
         A396EmprCod = P09AP3_A396EmprCod[0] ;
         A129BarCod = P09AP3_A129BarCod[0] ;
         A132BarCodReo = P09AP3_A132BarCodReo[0] ;
         A130BarCodPar = P09AP3_A130BarCodPar[0] ;
         A2813MetPieCod = P09AP3_A2813MetPieCod[0] ;
         A2816MetPieEst = P09AP3_A2816MetPieEst[0] ;
         A228BarUniMed = P09AP3_A228BarUniMed[0] ;
         A12994MetPieDfUl = P09AP3_A12994MetPieDfUl[0] ;
         A4917MetPieObs = P09AP3_A4917MetPieObs[0] ;
         A4910MetPieMtD = P09AP3_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P09AP3_A6635MetPieAnc[0] ;
         A2815MetPieMet = P09AP3_A2815MetPieMet[0] ;
         A2814MetPieKil = P09AP3_A2814MetPieKil[0] ;
         A2809MetTerCod = P09AP3_A2809MetTerCod[0] ;
         A228BarUniMed = P09AP3_A228BarUniMed[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09AP3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09AP3_A129BarCod[0] == A129BarCod ) && ( P09AP3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09AP3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09AP3_A2816MetPieEst[0] == A2816MetPieEst ) && ( GXutil.strcmp(P09AP3_A2813MetPieCod[0], A2813MetPieCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk9AP4 = false ;
            A2809MetTerCod = P09AP3_A2809MetTerCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9AP4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2813MetPieCod)==0) )
         {
            AV31Option = A2813MetPieCod ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9AP4 )
         {
            brk9AP4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMETPIEOBSOPTIONS' Routine */
      returnInSub = false ;
      AV24TFMetPieObs = AV43SearchTxt ;
      AV25TFMetPieObs_Sel = "" ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV49EmprCod ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV50BarCod ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV51BarCodReo ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV52BarCodPar ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV48FilterFullText ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV10TFMetTerCod ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV12TFMetPieCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV14TFMetPieKil ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV15TFMetPieKil_To ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV16TFMetPieMet ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV17TFMetPieMet_To ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV18TFMetPieAnc ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV20TFMetPieMtD ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV21TFMetPieMtD_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV22TFMetPieEst ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV23TFMetPieEst_To ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV24TFMetPieObs ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV25TFMetPieObs_Sel ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV26TFMetPieDfUlt ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV27TFMetPieDfUlt_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV28TFBarUniMed ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV29TFBarUniMed_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                           AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                           AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                           AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                           AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                           AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                           AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                           Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) ,
                                           Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) ,
                                           AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                           AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                           Byte.valueOf(AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) ,
                                           Byte.valueOf(AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) ,
                                           AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                           AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                           Short.valueOf(AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) ,
                                           Short.valueOf(AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) ,
                                           AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                           AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
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
                                           AV49EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           A130BarCodPar ,
                                           AV52BarCodPar ,
                                           AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                           Integer.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod) ,
                                           Byte.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo) ,
                                           AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod), 10, "%") ;
      lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod), 9, "%") ;
      lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = GXutil.concat( GXutil.rtrim( AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs), "%", "") ;
      lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = GXutil.padr( GXutil.rtrim( AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed), 1, "%") ;
      /* Using cursor P09AP4 */
      pr_default.execute(2, new Object[] {AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, Integer.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod), Byte.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo), AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel, lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to, Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc), Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to), AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to, Byte.valueOf(AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest), Byte.valueOf(AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to), lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs, AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel, Short.valueOf(AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult), Short.valueOf(AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to), lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed, AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9AP6 = false ;
         A396EmprCod = P09AP4_A396EmprCod[0] ;
         A129BarCod = P09AP4_A129BarCod[0] ;
         A132BarCodReo = P09AP4_A132BarCodReo[0] ;
         A130BarCodPar = P09AP4_A130BarCodPar[0] ;
         A4917MetPieObs = P09AP4_A4917MetPieObs[0] ;
         A2816MetPieEst = P09AP4_A2816MetPieEst[0] ;
         A228BarUniMed = P09AP4_A228BarUniMed[0] ;
         A12994MetPieDfUl = P09AP4_A12994MetPieDfUl[0] ;
         A4910MetPieMtD = P09AP4_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P09AP4_A6635MetPieAnc[0] ;
         A2815MetPieMet = P09AP4_A2815MetPieMet[0] ;
         A2814MetPieKil = P09AP4_A2814MetPieKil[0] ;
         A2813MetPieCod = P09AP4_A2813MetPieCod[0] ;
         A2809MetTerCod = P09AP4_A2809MetTerCod[0] ;
         A228BarUniMed = P09AP4_A228BarUniMed[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09AP4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09AP4_A129BarCod[0] == A129BarCod ) && ( P09AP4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09AP4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09AP4_A2816MetPieEst[0] == A2816MetPieEst ) && ( GXutil.strcmp(P09AP4_A4917MetPieObs[0], A4917MetPieObs) == 0 ) ) )
            {
               if (true) break;
            }
            brk9AP6 = false ;
            A2813MetPieCod = P09AP4_A2813MetPieCod[0] ;
            A2809MetTerCod = P09AP4_A2809MetTerCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9AP6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4917MetPieObs)==0) )
         {
            AV31Option = A4917MetPieObs ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9AP6 )
         {
            brk9AP6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARUNIMEDOPTIONS' Routine */
      returnInSub = false ;
      AV28TFBarUniMed = AV43SearchTxt ;
      AV29TFBarUniMed_Sel = "" ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV49EmprCod ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV50BarCod ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV51BarCodReo ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV52BarCodPar ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV48FilterFullText ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV10TFMetTerCod ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV12TFMetPieCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV14TFMetPieKil ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV15TFMetPieKil_To ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV16TFMetPieMet ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV17TFMetPieMet_To ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV18TFMetPieAnc ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV20TFMetPieMtD ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV21TFMetPieMtD_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV22TFMetPieEst ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV23TFMetPieEst_To ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV24TFMetPieObs ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV25TFMetPieObs_Sel ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV26TFMetPieDfUlt ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV27TFMetPieDfUlt_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV28TFBarUniMed ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV29TFBarUniMed_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                           AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                           AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                           AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                           AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                           AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                           AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                           Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) ,
                                           Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) ,
                                           AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                           AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                           Byte.valueOf(AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) ,
                                           Byte.valueOf(AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) ,
                                           AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                           AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                           Short.valueOf(AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) ,
                                           Short.valueOf(AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) ,
                                           AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                           AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
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
                                           AV49EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           A130BarCodPar ,
                                           AV52BarCodPar ,
                                           AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                           Integer.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod) ,
                                           Byte.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo) ,
                                           AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod), 10, "%") ;
      lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod), 9, "%") ;
      lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = GXutil.concat( GXutil.rtrim( AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs), "%", "") ;
      lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = GXutil.padr( GXutil.rtrim( AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed), 1, "%") ;
      /* Using cursor P09AP5 */
      pr_default.execute(3, new Object[] {AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, Integer.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod), Byte.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo), AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel, lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to, Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc), Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to), AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to, Byte.valueOf(AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest), Byte.valueOf(AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to), lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs, AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel, Short.valueOf(AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult), Short.valueOf(AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to), lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed, AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9AP8 = false ;
         A396EmprCod = P09AP5_A396EmprCod[0] ;
         A129BarCod = P09AP5_A129BarCod[0] ;
         A132BarCodReo = P09AP5_A132BarCodReo[0] ;
         A130BarCodPar = P09AP5_A130BarCodPar[0] ;
         A228BarUniMed = P09AP5_A228BarUniMed[0] ;
         A2816MetPieEst = P09AP5_A2816MetPieEst[0] ;
         A12994MetPieDfUl = P09AP5_A12994MetPieDfUl[0] ;
         A4917MetPieObs = P09AP5_A4917MetPieObs[0] ;
         A4910MetPieMtD = P09AP5_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P09AP5_A6635MetPieAnc[0] ;
         A2815MetPieMet = P09AP5_A2815MetPieMet[0] ;
         A2814MetPieKil = P09AP5_A2814MetPieKil[0] ;
         A2813MetPieCod = P09AP5_A2813MetPieCod[0] ;
         A2809MetTerCod = P09AP5_A2809MetTerCod[0] ;
         A228BarUniMed = P09AP5_A228BarUniMed[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09AP5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09AP5_A129BarCod[0] == A129BarCod ) && ( P09AP5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09AP5_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P09AP5_A2816MetPieEst[0] == A2816MetPieEst ) && ( GXutil.strcmp(P09AP5_A228BarUniMed[0], A228BarUniMed) == 0 ) ) )
            {
               if (true) break;
            }
            brk9AP8 = false ;
            A2813MetPieCod = P09AP5_A2813MetPieCod[0] ;
            A2809MetTerCod = P09AP5_A2809MetTerCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9AP8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A228BarUniMed)==0) )
         {
            AV31Option = A228BarUniMed ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A228BarUniMed, "@!"))) ;
            AV32Options.add(AV31Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9AP8 )
         {
            brk9AP8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webcontador_metrajepiezas_wcgetfilterdata.this.AV45OptionsJson;
      this.aP4[0] = webcontador_metrajepiezas_wcgetfilterdata.this.AV46OptionsDescJson;
      this.aP5[0] = webcontador_metrajepiezas_wcgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV45OptionsJson = "" ;
      AV46OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV10TFMetTerCod = "" ;
      AV11TFMetTerCod_Sel = "" ;
      AV12TFMetPieCod = "" ;
      AV13TFMetPieCod_Sel = "" ;
      AV14TFMetPieKil = DecimalUtil.ZERO ;
      AV15TFMetPieKil_To = DecimalUtil.ZERO ;
      AV16TFMetPieMet = DecimalUtil.ZERO ;
      AV17TFMetPieMet_To = DecimalUtil.ZERO ;
      AV20TFMetPieMtD = DecimalUtil.ZERO ;
      AV21TFMetPieMtD_To = DecimalUtil.ZERO ;
      AV24TFMetPieObs = "" ;
      AV25TFMetPieObs_Sel = "" ;
      AV28TFBarUniMed = "" ;
      AV29TFBarUniMed_Sel = "" ;
      AV49EmprCod = "" ;
      AV52BarCodPar = "" ;
      A2809MetTerCod = "" ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = "" ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = "" ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = "" ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = "" ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = "" ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = "" ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = "" ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = DecimalUtil.ZERO ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = DecimalUtil.ZERO ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = DecimalUtil.ZERO ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = DecimalUtil.ZERO ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = "" ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = "" ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = "" ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = "" ;
      scmdbuf = "" ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = "" ;
      lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = "" ;
      lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = "" ;
      lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = "" ;
      lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      A228BarUniMed = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09AP2_A396EmprCod = new String[] {""} ;
      P09AP2_A129BarCod = new int[1] ;
      P09AP2_A132BarCodReo = new byte[1] ;
      P09AP2_A130BarCodPar = new String[] {""} ;
      P09AP2_A2809MetTerCod = new String[] {""} ;
      P09AP2_A2816MetPieEst = new byte[1] ;
      P09AP2_A228BarUniMed = new String[] {""} ;
      P09AP2_A12994MetPieDfUl = new short[1] ;
      P09AP2_A4917MetPieObs = new String[] {""} ;
      P09AP2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP2_A6635MetPieAnc = new short[1] ;
      P09AP2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP2_A2813MetPieCod = new String[] {""} ;
      AV31Option = "" ;
      P09AP3_A396EmprCod = new String[] {""} ;
      P09AP3_A129BarCod = new int[1] ;
      P09AP3_A132BarCodReo = new byte[1] ;
      P09AP3_A130BarCodPar = new String[] {""} ;
      P09AP3_A2813MetPieCod = new String[] {""} ;
      P09AP3_A2816MetPieEst = new byte[1] ;
      P09AP3_A228BarUniMed = new String[] {""} ;
      P09AP3_A12994MetPieDfUl = new short[1] ;
      P09AP3_A4917MetPieObs = new String[] {""} ;
      P09AP3_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP3_A6635MetPieAnc = new short[1] ;
      P09AP3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP3_A2809MetTerCod = new String[] {""} ;
      P09AP4_A396EmprCod = new String[] {""} ;
      P09AP4_A129BarCod = new int[1] ;
      P09AP4_A132BarCodReo = new byte[1] ;
      P09AP4_A130BarCodPar = new String[] {""} ;
      P09AP4_A4917MetPieObs = new String[] {""} ;
      P09AP4_A2816MetPieEst = new byte[1] ;
      P09AP4_A228BarUniMed = new String[] {""} ;
      P09AP4_A12994MetPieDfUl = new short[1] ;
      P09AP4_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP4_A6635MetPieAnc = new short[1] ;
      P09AP4_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP4_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP4_A2813MetPieCod = new String[] {""} ;
      P09AP4_A2809MetTerCod = new String[] {""} ;
      P09AP5_A396EmprCod = new String[] {""} ;
      P09AP5_A129BarCod = new int[1] ;
      P09AP5_A132BarCodReo = new byte[1] ;
      P09AP5_A130BarCodPar = new String[] {""} ;
      P09AP5_A228BarUniMed = new String[] {""} ;
      P09AP5_A2816MetPieEst = new byte[1] ;
      P09AP5_A12994MetPieDfUl = new short[1] ;
      P09AP5_A4917MetPieObs = new String[] {""} ;
      P09AP5_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP5_A6635MetPieAnc = new short[1] ;
      P09AP5_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP5_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AP5_A2813MetPieCod = new String[] {""} ;
      P09AP5_A2809MetTerCod = new String[] {""} ;
      AV33OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webcontador_metrajepiezas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09AP2_A396EmprCod, P09AP2_A129BarCod, P09AP2_A132BarCodReo, P09AP2_A130BarCodPar, P09AP2_A2809MetTerCod, P09AP2_A2816MetPieEst, P09AP2_A228BarUniMed, P09AP2_A12994MetPieDfUl, P09AP2_A4917MetPieObs, P09AP2_A4910MetPieMtD,
            P09AP2_A6635MetPieAnc, P09AP2_A2815MetPieMet, P09AP2_A2814MetPieKil, P09AP2_A2813MetPieCod
            }
            , new Object[] {
            P09AP3_A396EmprCod, P09AP3_A129BarCod, P09AP3_A132BarCodReo, P09AP3_A130BarCodPar, P09AP3_A2813MetPieCod, P09AP3_A2816MetPieEst, P09AP3_A228BarUniMed, P09AP3_A12994MetPieDfUl, P09AP3_A4917MetPieObs, P09AP3_A4910MetPieMtD,
            P09AP3_A6635MetPieAnc, P09AP3_A2815MetPieMet, P09AP3_A2814MetPieKil, P09AP3_A2809MetTerCod
            }
            , new Object[] {
            P09AP4_A396EmprCod, P09AP4_A129BarCod, P09AP4_A132BarCodReo, P09AP4_A130BarCodPar, P09AP4_A4917MetPieObs, P09AP4_A2816MetPieEst, P09AP4_A228BarUniMed, P09AP4_A12994MetPieDfUl, P09AP4_A4910MetPieMtD, P09AP4_A6635MetPieAnc,
            P09AP4_A2815MetPieMet, P09AP4_A2814MetPieKil, P09AP4_A2813MetPieCod, P09AP4_A2809MetTerCod
            }
            , new Object[] {
            P09AP5_A396EmprCod, P09AP5_A129BarCod, P09AP5_A132BarCodReo, P09AP5_A130BarCodPar, P09AP5_A228BarUniMed, P09AP5_A2816MetPieEst, P09AP5_A12994MetPieDfUl, P09AP5_A4917MetPieObs, P09AP5_A4910MetPieMtD, P09AP5_A6635MetPieAnc,
            P09AP5_A2815MetPieMet, P09AP5_A2814MetPieKil, P09AP5_A2813MetPieCod, P09AP5_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFMetPieEst ;
   private byte AV23TFMetPieEst_To ;
   private byte AV51BarCodReo ;
   private byte AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ;
   private byte AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ;
   private byte AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ;
   private byte A2816MetPieEst ;
   private byte A132BarCodReo ;
   private short AV18TFMetPieAnc ;
   private short AV19TFMetPieAnc_To ;
   private short AV26TFMetPieDfUlt ;
   private short AV27TFMetPieDfUlt_To ;
   private short AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ;
   private short AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ;
   private short AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ;
   private short AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ;
   private short A6635MetPieAnc ;
   private short A12994MetPieDfUl ;
   private short Gx_err ;
   private int AV57GXV1 ;
   private int AV50BarCod ;
   private int AV53OpeCod ;
   private int AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ;
   private int A129BarCod ;
   private long AV36count ;
   private java.math.BigDecimal AV14TFMetPieKil ;
   private java.math.BigDecimal AV15TFMetPieKil_To ;
   private java.math.BigDecimal AV16TFMetPieMet ;
   private java.math.BigDecimal AV17TFMetPieMet_To ;
   private java.math.BigDecimal AV20TFMetPieMtD ;
   private java.math.BigDecimal AV21TFMetPieMtD_To ;
   private java.math.BigDecimal AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ;
   private java.math.BigDecimal AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ;
   private java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ;
   private java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ;
   private java.math.BigDecimal AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ;
   private java.math.BigDecimal AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private String AV10TFMetTerCod ;
   private String AV11TFMetTerCod_Sel ;
   private String AV12TFMetPieCod ;
   private String AV13TFMetPieCod_Sel ;
   private String AV28TFBarUniMed ;
   private String AV29TFBarUniMed_Sel ;
   private String AV49EmprCod ;
   private String AV52BarCodPar ;
   private String A2809MetTerCod ;
   private String AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ;
   private String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar ;
   private String AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ;
   private String AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ;
   private String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ;
   private String AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ;
   private String AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ;
   private String AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ;
   private String scmdbuf ;
   private String lV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ;
   private String lV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ;
   private String lV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ;
   private String A2813MetPieCod ;
   private String A228BarUniMed ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9AP2 ;
   private boolean brk9AP4 ;
   private boolean brk9AP6 ;
   private boolean brk9AP8 ;
   private String AV45OptionsJson ;
   private String AV46OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV43SearchTxt ;
   private String AV44SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV24TFMetPieObs ;
   private String AV25TFMetPieObs_Sel ;
   private String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ;
   private String AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ;
   private String AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ;
   private String lV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ;
   private String lV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ;
   private String A4917MetPieObs ;
   private String AV31Option ;
   private String AV33OptionDesc ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09AP2_A396EmprCod ;
   private int[] P09AP2_A129BarCod ;
   private byte[] P09AP2_A132BarCodReo ;
   private String[] P09AP2_A130BarCodPar ;
   private String[] P09AP2_A2809MetTerCod ;
   private byte[] P09AP2_A2816MetPieEst ;
   private String[] P09AP2_A228BarUniMed ;
   private short[] P09AP2_A12994MetPieDfUl ;
   private String[] P09AP2_A4917MetPieObs ;
   private java.math.BigDecimal[] P09AP2_A4910MetPieMtD ;
   private short[] P09AP2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P09AP2_A2815MetPieMet ;
   private java.math.BigDecimal[] P09AP2_A2814MetPieKil ;
   private String[] P09AP2_A2813MetPieCod ;
   private String[] P09AP3_A396EmprCod ;
   private int[] P09AP3_A129BarCod ;
   private byte[] P09AP3_A132BarCodReo ;
   private String[] P09AP3_A130BarCodPar ;
   private String[] P09AP3_A2813MetPieCod ;
   private byte[] P09AP3_A2816MetPieEst ;
   private String[] P09AP3_A228BarUniMed ;
   private short[] P09AP3_A12994MetPieDfUl ;
   private String[] P09AP3_A4917MetPieObs ;
   private java.math.BigDecimal[] P09AP3_A4910MetPieMtD ;
   private short[] P09AP3_A6635MetPieAnc ;
   private java.math.BigDecimal[] P09AP3_A2815MetPieMet ;
   private java.math.BigDecimal[] P09AP3_A2814MetPieKil ;
   private String[] P09AP3_A2809MetTerCod ;
   private String[] P09AP4_A396EmprCod ;
   private int[] P09AP4_A129BarCod ;
   private byte[] P09AP4_A132BarCodReo ;
   private String[] P09AP4_A130BarCodPar ;
   private String[] P09AP4_A4917MetPieObs ;
   private byte[] P09AP4_A2816MetPieEst ;
   private String[] P09AP4_A228BarUniMed ;
   private short[] P09AP4_A12994MetPieDfUl ;
   private java.math.BigDecimal[] P09AP4_A4910MetPieMtD ;
   private short[] P09AP4_A6635MetPieAnc ;
   private java.math.BigDecimal[] P09AP4_A2815MetPieMet ;
   private java.math.BigDecimal[] P09AP4_A2814MetPieKil ;
   private String[] P09AP4_A2813MetPieCod ;
   private String[] P09AP4_A2809MetTerCod ;
   private String[] P09AP5_A396EmprCod ;
   private int[] P09AP5_A129BarCod ;
   private byte[] P09AP5_A132BarCodReo ;
   private String[] P09AP5_A130BarCodPar ;
   private String[] P09AP5_A228BarUniMed ;
   private byte[] P09AP5_A2816MetPieEst ;
   private short[] P09AP5_A12994MetPieDfUl ;
   private String[] P09AP5_A4917MetPieObs ;
   private java.math.BigDecimal[] P09AP5_A4910MetPieMtD ;
   private short[] P09AP5_A6635MetPieAnc ;
   private java.math.BigDecimal[] P09AP5_A2815MetPieMet ;
   private java.math.BigDecimal[] P09AP5_A2814MetPieKil ;
   private String[] P09AP5_A2813MetPieCod ;
   private String[] P09AP5_A2809MetTerCod ;
   private GXSimpleCollection<String> AV32Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV35OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class webcontador_metrajepiezas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09AP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                          String AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                          String AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                          String AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                          String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                          java.math.BigDecimal AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                          java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                          java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                          short AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ,
                                          short AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ,
                                          java.math.BigDecimal AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                          java.math.BigDecimal AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                          byte AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ,
                                          byte AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ,
                                          String AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                          String AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                          short AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ,
                                          short AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ,
                                          String AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                          String AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
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
                                          String AV49EmprCod ,
                                          int A129BarCod ,
                                          int AV50BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV51BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodPar ,
                                          String AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                          int AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                          byte AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                          String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[38];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetTerCod, T1.MetPieEst, T2.BarUniMed, T1.MetPieDfUl, T1.MetPieObs, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet," ;
      scmdbuf += " T1.MetPieKil, T1.MetPieCod FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.MetPieCod) IS NULL AND NOT(T1.MetPieCod IS NULL)))");
      addWhere(sWhereString, "((T1.MetPieEst = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MetTerCod) like '%' || UPPER(?)) or ( UPPER(T1.MetPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieAnc,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMtD,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieEst,'90'), 2) like '%' || ?) or ( UPPER(T1.MetPieObs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfUl,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetTerCod = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieCod = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) )
      {
         addWhere(sWhereString, "(T1.MetPieEst >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(T1.MetPieEst <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) && ( ! (GXutil.strcmp("", AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieObs = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetTerCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09AP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                          String AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                          String AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                          String AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                          String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                          java.math.BigDecimal AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                          java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                          java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                          short AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ,
                                          short AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ,
                                          java.math.BigDecimal AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                          java.math.BigDecimal AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                          byte AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ,
                                          byte AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ,
                                          String AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                          String AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                          short AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ,
                                          short AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ,
                                          String AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                          String AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
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
                                          String AV49EmprCod ,
                                          int A129BarCod ,
                                          int AV50BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV51BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodPar ,
                                          String AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                          int AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                          byte AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                          String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[38];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieEst, T2.BarUniMed, T1.MetPieDfUl, T1.MetPieObs, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet," ;
      scmdbuf += " T1.MetPieKil, T1.MetTerCod FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.MetPieCod) IS NULL AND NOT(T1.MetPieCod IS NULL)))");
      addWhere(sWhereString, "((T1.MetPieEst = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MetTerCod) like '%' || UPPER(?)) or ( UPPER(T1.MetPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieAnc,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMtD,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieEst,'90'), 2) like '%' || ?) or ( UPPER(T1.MetPieObs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfUl,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
         GXv_int4[16] = (byte)(1) ;
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetTerCod = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieCod = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) )
      {
         addWhere(sWhereString, "(T1.MetPieEst >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(T1.MetPieEst <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) && ( ! (GXutil.strcmp("", AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieObs = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl <= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09AP4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                          String AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                          String AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                          String AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                          String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                          java.math.BigDecimal AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                          java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                          java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                          short AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ,
                                          short AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ,
                                          java.math.BigDecimal AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                          java.math.BigDecimal AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                          byte AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ,
                                          byte AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ,
                                          String AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                          String AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                          short AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ,
                                          short AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ,
                                          String AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                          String AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
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
                                          String AV49EmprCod ,
                                          int A129BarCod ,
                                          int AV50BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV51BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodPar ,
                                          String AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                          int AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                          byte AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                          String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[38];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieObs, T1.MetPieEst, T2.BarUniMed, T1.MetPieDfUl, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet, T1.MetPieKil," ;
      scmdbuf += " T1.MetPieCod, T1.MetTerCod FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.MetPieCod) IS NULL AND NOT(T1.MetPieCod IS NULL)))");
      addWhere(sWhereString, "((T1.MetPieEst = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MetTerCod) like '%' || UPPER(?)) or ( UPPER(T1.MetPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieAnc,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMtD,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieEst,'90'), 2) like '%' || ?) or ( UPPER(T1.MetPieObs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfUl,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetTerCod = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieCod = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) )
      {
         addWhere(sWhereString, "(T1.MetPieEst >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(T1.MetPieEst <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) && ( ! (GXutil.strcmp("", AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieObs = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieObs" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09AP5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                          String AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                          String AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                          String AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                          String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                          java.math.BigDecimal AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                          java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                          java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                          short AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ,
                                          short AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ,
                                          java.math.BigDecimal AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                          java.math.BigDecimal AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                          byte AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ,
                                          byte AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ,
                                          String AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                          String AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                          short AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ,
                                          short AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ,
                                          String AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                          String AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
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
                                          String AV49EmprCod ,
                                          int A129BarCod ,
                                          int AV50BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV51BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodPar ,
                                          String AV59Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                          int AV60Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                          byte AV61Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                          String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[38];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarUniMed, T1.MetPieEst, T1.MetPieDfUl, T1.MetPieObs, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet, T1.MetPieKil," ;
      scmdbuf += " T1.MetPieCod, T1.MetTerCod FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.MetPieCod) IS NULL AND NOT(T1.MetPieCod IS NULL)))");
      addWhere(sWhereString, "((T1.MetPieEst = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MetTerCod) like '%' || UPPER(?)) or ( UPPER(T1.MetPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieAnc,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMtD,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieEst,'90'), 2) like '%' || ?) or ( UPPER(T1.MetPieObs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfUl,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV64Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetTerCod = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV66Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieCod = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV76Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) )
      {
         addWhere(sWhereString, "(T1.MetPieEst >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV77Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(T1.MetPieEst <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) && ( ! (GXutil.strcmp("", AV78Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieObs = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV80Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV81Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T2.BarUniMed" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09AP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
            case 1 :
                  return conditional_P09AP3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
            case 2 :
                  return conditional_P09AP4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
            case 3 :
                  return conditional_P09AP5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AP4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AP5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 9);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 9);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 9);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 9);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 1024);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 1024);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 9);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 9);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 1024);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 1024);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 9);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 9);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 1024);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 1024);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 9);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 9);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 1024);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 1024);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               return;
      }
   }

}

