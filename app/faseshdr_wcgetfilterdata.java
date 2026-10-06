package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class faseshdr_wcgetfilterdata extends GXProcedure
{
   public faseshdr_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( faseshdr_wcgetfilterdata.class ), "" );
   }

   public faseshdr_wcgetfilterdata( int remoteHandle ,
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
      faseshdr_wcgetfilterdata.this.aP5 = new String[] {""};
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
      faseshdr_wcgetfilterdata.this.AV32DDOName = aP0;
      faseshdr_wcgetfilterdata.this.AV30SearchTxt = aP1;
      faseshdr_wcgetfilterdata.this.AV31SearchTxtTo = aP2;
      faseshdr_wcgetfilterdata.this.aP3 = aP3;
      faseshdr_wcgetfilterdata.this.aP4 = aP4;
      faseshdr_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_MAQCODBIS") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODBISOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("FasesHDR_WCGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FasesHDR_WCGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("FasesHDR_WCGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV10TFBarOrdLin = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarOrdLin_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV16TFMaqCodBis = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV17TFMaqCodBis_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV18TFBarFasDTI = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTF") == 0 )
         {
            AV20TFBarFasDTF = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV22TFBarTieRea = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFBarTieRea_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV24TFBarFasEst_SelsJson = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV25TFBarFasEst_Sels.fromJSonString(AV24TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV26TFBarFasKgm = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFBarFasKgm_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV28TFBarFasMtr = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarFasMtr_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49Emprcod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV50Barcod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV51Barcodreo = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV52Barcodpar = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV30SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV57Faseshdr_wcds_1_emprcod = AV49Emprcod ;
      AV58Faseshdr_wcds_2_barcod = AV50Barcod ;
      AV59Faseshdr_wcds_3_barcodreo = AV51Barcodreo ;
      AV60Faseshdr_wcds_4_barcodpar = AV52Barcodpar ;
      AV61Faseshdr_wcds_5_filterfulltext = AV48FilterFullText ;
      AV62Faseshdr_wcds_6_tfbarordlin = AV10TFBarOrdLin ;
      AV63Faseshdr_wcds_7_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV64Faseshdr_wcds_8_tffascod = AV12TFFasCod ;
      AV65Faseshdr_wcds_9_tffascod_sel = AV13TFFasCod_Sel ;
      AV66Faseshdr_wcds_10_tffasdsc = AV14TFFasDsc ;
      AV67Faseshdr_wcds_11_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV68Faseshdr_wcds_12_tfmaqcodbis = AV16TFMaqCodBis ;
      AV69Faseshdr_wcds_13_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV70Faseshdr_wcds_14_tfbarfasdti = AV18TFBarFasDTI ;
      AV71Faseshdr_wcds_15_tfbarfasdtf = AV20TFBarFasDTF ;
      AV72Faseshdr_wcds_16_tfbartierea = AV22TFBarTieRea ;
      AV73Faseshdr_wcds_17_tfbartierea_to = AV23TFBarTieRea_To ;
      AV74Faseshdr_wcds_18_tfbarfasest_sels = AV25TFBarFasEst_Sels ;
      AV75Faseshdr_wcds_19_tfbarfaskgm = AV26TFBarFasKgm ;
      AV76Faseshdr_wcds_20_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV77Faseshdr_wcds_21_tfbarfasmtr = AV28TFBarFasMtr ;
      AV78Faseshdr_wcds_22_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV74Faseshdr_wcds_18_tfbarfasest_sels ,
                                           AV61Faseshdr_wcds_5_filterfulltext ,
                                           Short.valueOf(AV62Faseshdr_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV63Faseshdr_wcds_7_tfbarordlin_to) ,
                                           AV65Faseshdr_wcds_9_tffascod_sel ,
                                           AV64Faseshdr_wcds_8_tffascod ,
                                           AV67Faseshdr_wcds_11_tffasdsc_sel ,
                                           AV66Faseshdr_wcds_10_tffasdsc ,
                                           AV69Faseshdr_wcds_13_tfmaqcodbis_sel ,
                                           AV68Faseshdr_wcds_12_tfmaqcodbis ,
                                           AV70Faseshdr_wcds_14_tfbarfasdti ,
                                           AV71Faseshdr_wcds_15_tfbarfasdtf ,
                                           AV72Faseshdr_wcds_16_tfbartierea ,
                                           AV73Faseshdr_wcds_17_tfbartierea_to ,
                                           Integer.valueOf(AV74Faseshdr_wcds_18_tfbarfasest_sels.size()) ,
                                           AV75Faseshdr_wcds_19_tfbarfaskgm ,
                                           AV76Faseshdr_wcds_20_tfbarfaskgm_to ,
                                           AV77Faseshdr_wcds_21_tfbarfasmtr ,
                                           AV78Faseshdr_wcds_22_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52Barcodpar ,
                                           AV57Faseshdr_wcds_1_emprcod ,
                                           Integer.valueOf(AV58Faseshdr_wcds_2_barcod) ,
                                           Byte.valueOf(AV59Faseshdr_wcds_3_barcodreo) ,
                                           AV60Faseshdr_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor P08UN2 */
      pr_default.execute(0, new Object[] {AV57Faseshdr_wcds_1_emprcod, Integer.valueOf(AV58Faseshdr_wcds_2_barcod), Byte.valueOf(AV59Faseshdr_wcds_3_barcodreo), AV60Faseshdr_wcds_4_barcodpar, AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8UN2 = false ;
         A396EmprCod = P08UN2_A396EmprCod[0] ;
         A129BarCod = P08UN2_A129BarCod[0] ;
         A132BarCodReo = P08UN2_A132BarCodReo[0] ;
         A130BarCodPar = P08UN2_A130BarCodPar[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08UN2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08UN2_A129BarCod[0] == A129BarCod ) && ( P08UN2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P08UN2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brk8UN2 = false ;
            AV42count = (long)(AV42count+1) ;
            brk8UN2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV34Option = A457FasCod ;
            AV37OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV35Options.add(AV34Option, 0);
            AV38OptionsDesc.add(AV37OptionDesc, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8UN2 )
         {
            brk8UN2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV30SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      AV57Faseshdr_wcds_1_emprcod = AV49Emprcod ;
      AV58Faseshdr_wcds_2_barcod = AV50Barcod ;
      AV59Faseshdr_wcds_3_barcodreo = AV51Barcodreo ;
      AV60Faseshdr_wcds_4_barcodpar = AV52Barcodpar ;
      AV61Faseshdr_wcds_5_filterfulltext = AV48FilterFullText ;
      AV62Faseshdr_wcds_6_tfbarordlin = AV10TFBarOrdLin ;
      AV63Faseshdr_wcds_7_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV64Faseshdr_wcds_8_tffascod = AV12TFFasCod ;
      AV65Faseshdr_wcds_9_tffascod_sel = AV13TFFasCod_Sel ;
      AV66Faseshdr_wcds_10_tffasdsc = AV14TFFasDsc ;
      AV67Faseshdr_wcds_11_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV68Faseshdr_wcds_12_tfmaqcodbis = AV16TFMaqCodBis ;
      AV69Faseshdr_wcds_13_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV70Faseshdr_wcds_14_tfbarfasdti = AV18TFBarFasDTI ;
      AV71Faseshdr_wcds_15_tfbarfasdtf = AV20TFBarFasDTF ;
      AV72Faseshdr_wcds_16_tfbartierea = AV22TFBarTieRea ;
      AV73Faseshdr_wcds_17_tfbartierea_to = AV23TFBarTieRea_To ;
      AV74Faseshdr_wcds_18_tfbarfasest_sels = AV25TFBarFasEst_Sels ;
      AV75Faseshdr_wcds_19_tfbarfaskgm = AV26TFBarFasKgm ;
      AV76Faseshdr_wcds_20_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV77Faseshdr_wcds_21_tfbarfasmtr = AV28TFBarFasMtr ;
      AV78Faseshdr_wcds_22_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV74Faseshdr_wcds_18_tfbarfasest_sels ,
                                           AV61Faseshdr_wcds_5_filterfulltext ,
                                           Short.valueOf(AV62Faseshdr_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV63Faseshdr_wcds_7_tfbarordlin_to) ,
                                           AV65Faseshdr_wcds_9_tffascod_sel ,
                                           AV64Faseshdr_wcds_8_tffascod ,
                                           AV67Faseshdr_wcds_11_tffasdsc_sel ,
                                           AV66Faseshdr_wcds_10_tffasdsc ,
                                           AV69Faseshdr_wcds_13_tfmaqcodbis_sel ,
                                           AV68Faseshdr_wcds_12_tfmaqcodbis ,
                                           AV70Faseshdr_wcds_14_tfbarfasdti ,
                                           AV71Faseshdr_wcds_15_tfbarfasdtf ,
                                           AV72Faseshdr_wcds_16_tfbartierea ,
                                           AV73Faseshdr_wcds_17_tfbartierea_to ,
                                           Integer.valueOf(AV74Faseshdr_wcds_18_tfbarfasest_sels.size()) ,
                                           AV75Faseshdr_wcds_19_tfbarfaskgm ,
                                           AV76Faseshdr_wcds_20_tfbarfaskgm_to ,
                                           AV77Faseshdr_wcds_21_tfbarfasmtr ,
                                           AV78Faseshdr_wcds_22_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52Barcodpar ,
                                           AV57Faseshdr_wcds_1_emprcod ,
                                           Integer.valueOf(AV58Faseshdr_wcds_2_barcod) ,
                                           Byte.valueOf(AV59Faseshdr_wcds_3_barcodreo) ,
                                           AV60Faseshdr_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor P08UN3 */
      pr_default.execute(1, new Object[] {AV57Faseshdr_wcds_1_emprcod, Integer.valueOf(AV58Faseshdr_wcds_2_barcod), Byte.valueOf(AV59Faseshdr_wcds_3_barcodreo), AV60Faseshdr_wcds_4_barcodpar, AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8UN4 = false ;
         A396EmprCod = P08UN3_A396EmprCod[0] ;
         A129BarCod = P08UN3_A129BarCod[0] ;
         A132BarCodReo = P08UN3_A132BarCodReo[0] ;
         A130BarCodPar = P08UN3_A130BarCodPar[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08UN3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08UN3_A129BarCod[0] == A129BarCod ) && ( P08UN3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P08UN3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brk8UN4 = false ;
            AV42count = (long)(AV42count+1) ;
            brk8UN4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV34Option = A460FasDsc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8UN4 )
         {
            brk8UN4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqCodBis = AV30SearchTxt ;
      AV17TFMaqCodBis_Sel = "" ;
      AV57Faseshdr_wcds_1_emprcod = AV49Emprcod ;
      AV58Faseshdr_wcds_2_barcod = AV50Barcod ;
      AV59Faseshdr_wcds_3_barcodreo = AV51Barcodreo ;
      AV60Faseshdr_wcds_4_barcodpar = AV52Barcodpar ;
      AV61Faseshdr_wcds_5_filterfulltext = AV48FilterFullText ;
      AV62Faseshdr_wcds_6_tfbarordlin = AV10TFBarOrdLin ;
      AV63Faseshdr_wcds_7_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV64Faseshdr_wcds_8_tffascod = AV12TFFasCod ;
      AV65Faseshdr_wcds_9_tffascod_sel = AV13TFFasCod_Sel ;
      AV66Faseshdr_wcds_10_tffasdsc = AV14TFFasDsc ;
      AV67Faseshdr_wcds_11_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV68Faseshdr_wcds_12_tfmaqcodbis = AV16TFMaqCodBis ;
      AV69Faseshdr_wcds_13_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV70Faseshdr_wcds_14_tfbarfasdti = AV18TFBarFasDTI ;
      AV71Faseshdr_wcds_15_tfbarfasdtf = AV20TFBarFasDTF ;
      AV72Faseshdr_wcds_16_tfbartierea = AV22TFBarTieRea ;
      AV73Faseshdr_wcds_17_tfbartierea_to = AV23TFBarTieRea_To ;
      AV74Faseshdr_wcds_18_tfbarfasest_sels = AV25TFBarFasEst_Sels ;
      AV75Faseshdr_wcds_19_tfbarfaskgm = AV26TFBarFasKgm ;
      AV76Faseshdr_wcds_20_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV77Faseshdr_wcds_21_tfbarfasmtr = AV28TFBarFasMtr ;
      AV78Faseshdr_wcds_22_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV74Faseshdr_wcds_18_tfbarfasest_sels ,
                                           AV61Faseshdr_wcds_5_filterfulltext ,
                                           Short.valueOf(AV62Faseshdr_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV63Faseshdr_wcds_7_tfbarordlin_to) ,
                                           AV65Faseshdr_wcds_9_tffascod_sel ,
                                           AV64Faseshdr_wcds_8_tffascod ,
                                           AV67Faseshdr_wcds_11_tffasdsc_sel ,
                                           AV66Faseshdr_wcds_10_tffasdsc ,
                                           AV69Faseshdr_wcds_13_tfmaqcodbis_sel ,
                                           AV68Faseshdr_wcds_12_tfmaqcodbis ,
                                           AV70Faseshdr_wcds_14_tfbarfasdti ,
                                           AV71Faseshdr_wcds_15_tfbarfasdtf ,
                                           AV72Faseshdr_wcds_16_tfbartierea ,
                                           AV73Faseshdr_wcds_17_tfbartierea_to ,
                                           Integer.valueOf(AV74Faseshdr_wcds_18_tfbarfasest_sels.size()) ,
                                           AV75Faseshdr_wcds_19_tfbarfaskgm ,
                                           AV76Faseshdr_wcds_20_tfbarfaskgm_to ,
                                           AV77Faseshdr_wcds_21_tfbarfasmtr ,
                                           AV78Faseshdr_wcds_22_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV49Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51Barcodreo) ,
                                           A130BarCodPar ,
                                           AV52Barcodpar ,
                                           AV57Faseshdr_wcds_1_emprcod ,
                                           Integer.valueOf(AV58Faseshdr_wcds_2_barcod) ,
                                           Byte.valueOf(AV59Faseshdr_wcds_3_barcodreo) ,
                                           AV60Faseshdr_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor P08UN4 */
      pr_default.execute(2, new Object[] {AV57Faseshdr_wcds_1_emprcod, Integer.valueOf(AV58Faseshdr_wcds_2_barcod), Byte.valueOf(AV59Faseshdr_wcds_3_barcodreo), AV60Faseshdr_wcds_4_barcodpar, AV49Emprcod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV52Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8UN6 = false ;
         A396EmprCod = P08UN4_A396EmprCod[0] ;
         A129BarCod = P08UN4_A129BarCod[0] ;
         A132BarCodReo = P08UN4_A132BarCodReo[0] ;
         A130BarCodPar = P08UN4_A130BarCodPar[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08UN4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08UN4_A129BarCod[0] == A129BarCod ) && ( P08UN4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P08UN4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brk8UN6 = false ;
            AV42count = (long)(AV42count+1) ;
            brk8UN6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
         {
            AV34Option = A603MaqCodBis ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8UN6 )
         {
            brk8UN6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = faseshdr_wcgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = faseshdr_wcgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = faseshdr_wcgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV16TFMaqCodBis = "" ;
      AV17TFMaqCodBis_Sel = "" ;
      AV18TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV20TFBarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      AV22TFBarTieRea = DecimalUtil.ZERO ;
      AV23TFBarTieRea_To = DecimalUtil.ZERO ;
      AV24TFBarFasEst_SelsJson = "" ;
      AV25TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV26TFBarFasKgm = DecimalUtil.ZERO ;
      AV27TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV28TFBarFasMtr = DecimalUtil.ZERO ;
      AV29TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV49Emprcod = "" ;
      AV52Barcodpar = "" ;
      A457FasCod = "" ;
      AV57Faseshdr_wcds_1_emprcod = "" ;
      AV60Faseshdr_wcds_4_barcodpar = "" ;
      AV61Faseshdr_wcds_5_filterfulltext = "" ;
      AV64Faseshdr_wcds_8_tffascod = "" ;
      AV65Faseshdr_wcds_9_tffascod_sel = "" ;
      AV66Faseshdr_wcds_10_tffasdsc = "" ;
      AV67Faseshdr_wcds_11_tffasdsc_sel = "" ;
      AV68Faseshdr_wcds_12_tfmaqcodbis = "" ;
      AV69Faseshdr_wcds_13_tfmaqcodbis_sel = "" ;
      AV70Faseshdr_wcds_14_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV71Faseshdr_wcds_15_tfbarfasdtf = GXutil.resetTime( GXutil.nullDate() );
      AV72Faseshdr_wcds_16_tfbartierea = DecimalUtil.ZERO ;
      AV73Faseshdr_wcds_17_tfbartierea_to = DecimalUtil.ZERO ;
      AV74Faseshdr_wcds_18_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV75Faseshdr_wcds_19_tfbarfaskgm = DecimalUtil.ZERO ;
      AV76Faseshdr_wcds_20_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV77Faseshdr_wcds_21_tfbarfasmtr = DecimalUtil.ZERO ;
      AV78Faseshdr_wcds_22_tfbarfasmtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P08UN2_A396EmprCod = new String[] {""} ;
      P08UN2_A129BarCod = new int[1] ;
      P08UN2_A132BarCodReo = new byte[1] ;
      P08UN2_A130BarCodPar = new String[] {""} ;
      AV34Option = "" ;
      AV37OptionDesc = "" ;
      P08UN3_A396EmprCod = new String[] {""} ;
      P08UN3_A129BarCod = new int[1] ;
      P08UN3_A132BarCodReo = new byte[1] ;
      P08UN3_A130BarCodPar = new String[] {""} ;
      P08UN4_A396EmprCod = new String[] {""} ;
      P08UN4_A129BarCod = new int[1] ;
      P08UN4_A132BarCodReo = new byte[1] ;
      P08UN4_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.faseshdr_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08UN2_A396EmprCod, P08UN2_A129BarCod, P08UN2_A132BarCodReo, P08UN2_A130BarCodPar
            }
            , new Object[] {
            P08UN3_A396EmprCod, P08UN3_A129BarCod, P08UN3_A132BarCodReo, P08UN3_A130BarCodPar
            }
            , new Object[] {
            P08UN4_A396EmprCod, P08UN4_A129BarCod, P08UN4_A132BarCodReo, P08UN4_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV51Barcodreo ;
   private byte AV59Faseshdr_wcds_3_barcodreo ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private short AV10TFBarOrdLin ;
   private short AV11TFBarOrdLin_To ;
   private short AV62Faseshdr_wcds_6_tfbarordlin ;
   private short AV63Faseshdr_wcds_7_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV50Barcod ;
   private int AV58Faseshdr_wcds_2_barcod ;
   private int AV74Faseshdr_wcds_18_tfbarfasest_sels_size ;
   private int A129BarCod ;
   private long AV42count ;
   private java.math.BigDecimal AV22TFBarTieRea ;
   private java.math.BigDecimal AV23TFBarTieRea_To ;
   private java.math.BigDecimal AV26TFBarFasKgm ;
   private java.math.BigDecimal AV27TFBarFasKgm_To ;
   private java.math.BigDecimal AV28TFBarFasMtr ;
   private java.math.BigDecimal AV29TFBarFasMtr_To ;
   private java.math.BigDecimal AV72Faseshdr_wcds_16_tfbartierea ;
   private java.math.BigDecimal AV73Faseshdr_wcds_17_tfbartierea_to ;
   private java.math.BigDecimal AV75Faseshdr_wcds_19_tfbarfaskgm ;
   private java.math.BigDecimal AV76Faseshdr_wcds_20_tfbarfaskgm_to ;
   private java.math.BigDecimal AV77Faseshdr_wcds_21_tfbarfasmtr ;
   private java.math.BigDecimal AV78Faseshdr_wcds_22_tfbarfasmtr_to ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV16TFMaqCodBis ;
   private String AV17TFMaqCodBis_Sel ;
   private String AV49Emprcod ;
   private String AV52Barcodpar ;
   private String A457FasCod ;
   private String AV57Faseshdr_wcds_1_emprcod ;
   private String AV60Faseshdr_wcds_4_barcodpar ;
   private String AV64Faseshdr_wcds_8_tffascod ;
   private String AV65Faseshdr_wcds_9_tffascod_sel ;
   private String AV66Faseshdr_wcds_10_tffasdsc ;
   private String AV67Faseshdr_wcds_11_tffasdsc_sel ;
   private String AV68Faseshdr_wcds_12_tfmaqcodbis ;
   private String AV69Faseshdr_wcds_13_tfmaqcodbis_sel ;
   private String scmdbuf ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.util.Date AV18TFBarFasDTI ;
   private java.util.Date AV20TFBarFasDTF ;
   private java.util.Date AV70Faseshdr_wcds_14_tfbarfasdti ;
   private java.util.Date AV71Faseshdr_wcds_15_tfbarfasdtf ;
   private boolean returnInSub ;
   private boolean brk8UN2 ;
   private boolean brk8UN4 ;
   private boolean brk8UN6 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV24TFBarFasEst_SelsJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV61Faseshdr_wcds_5_filterfulltext ;
   private String AV34Option ;
   private String AV37OptionDesc ;
   private GXSimpleCollection<Byte> AV25TFBarFasEst_Sels ;
   private GXSimpleCollection<Byte> AV74Faseshdr_wcds_18_tfbarfasest_sels ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08UN2_A396EmprCod ;
   private int[] P08UN2_A129BarCod ;
   private byte[] P08UN2_A132BarCodReo ;
   private String[] P08UN2_A130BarCodPar ;
   private String[] P08UN3_A396EmprCod ;
   private int[] P08UN3_A129BarCod ;
   private byte[] P08UN3_A132BarCodReo ;
   private String[] P08UN3_A130BarCodPar ;
   private String[] P08UN4_A396EmprCod ;
   private int[] P08UN4_A129BarCod ;
   private byte[] P08UN4_A132BarCodReo ;
   private String[] P08UN4_A130BarCodPar ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class faseshdr_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08UN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV74Faseshdr_wcds_18_tfbarfasest_sels ,
                                          String AV61Faseshdr_wcds_5_filterfulltext ,
                                          short AV62Faseshdr_wcds_6_tfbarordlin ,
                                          short AV63Faseshdr_wcds_7_tfbarordlin_to ,
                                          String AV65Faseshdr_wcds_9_tffascod_sel ,
                                          String AV64Faseshdr_wcds_8_tffascod ,
                                          String AV67Faseshdr_wcds_11_tffasdsc_sel ,
                                          String AV66Faseshdr_wcds_10_tffasdsc ,
                                          String AV69Faseshdr_wcds_13_tfmaqcodbis_sel ,
                                          String AV68Faseshdr_wcds_12_tfmaqcodbis ,
                                          java.util.Date AV70Faseshdr_wcds_14_tfbarfasdti ,
                                          java.util.Date AV71Faseshdr_wcds_15_tfbarfasdtf ,
                                          java.math.BigDecimal AV72Faseshdr_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV73Faseshdr_wcds_17_tfbartierea_to ,
                                          int AV74Faseshdr_wcds_18_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV75Faseshdr_wcds_19_tfbarfaskgm ,
                                          java.math.BigDecimal AV76Faseshdr_wcds_20_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV77Faseshdr_wcds_21_tfbarfasmtr ,
                                          java.math.BigDecimal AV78Faseshdr_wcds_22_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52Barcodpar ,
                                          String AV57Faseshdr_wcds_1_emprcod ,
                                          int AV58Faseshdr_wcds_2_barcod ,
                                          byte AV59Faseshdr_wcds_3_barcodreo ,
                                          String AV60Faseshdr_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08UN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV74Faseshdr_wcds_18_tfbarfasest_sels ,
                                          String AV61Faseshdr_wcds_5_filterfulltext ,
                                          short AV62Faseshdr_wcds_6_tfbarordlin ,
                                          short AV63Faseshdr_wcds_7_tfbarordlin_to ,
                                          String AV65Faseshdr_wcds_9_tffascod_sel ,
                                          String AV64Faseshdr_wcds_8_tffascod ,
                                          String AV67Faseshdr_wcds_11_tffasdsc_sel ,
                                          String AV66Faseshdr_wcds_10_tffasdsc ,
                                          String AV69Faseshdr_wcds_13_tfmaqcodbis_sel ,
                                          String AV68Faseshdr_wcds_12_tfmaqcodbis ,
                                          java.util.Date AV70Faseshdr_wcds_14_tfbarfasdti ,
                                          java.util.Date AV71Faseshdr_wcds_15_tfbarfasdtf ,
                                          java.math.BigDecimal AV72Faseshdr_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV73Faseshdr_wcds_17_tfbartierea_to ,
                                          int AV74Faseshdr_wcds_18_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV75Faseshdr_wcds_19_tfbarfaskgm ,
                                          java.math.BigDecimal AV76Faseshdr_wcds_20_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV77Faseshdr_wcds_21_tfbarfasmtr ,
                                          java.math.BigDecimal AV78Faseshdr_wcds_22_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52Barcodpar ,
                                          String AV57Faseshdr_wcds_1_emprcod ,
                                          int AV58Faseshdr_wcds_2_barcod ,
                                          byte AV59Faseshdr_wcds_3_barcodreo ,
                                          String AV60Faseshdr_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[8];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08UN4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV74Faseshdr_wcds_18_tfbarfasest_sels ,
                                          String AV61Faseshdr_wcds_5_filterfulltext ,
                                          short AV62Faseshdr_wcds_6_tfbarordlin ,
                                          short AV63Faseshdr_wcds_7_tfbarordlin_to ,
                                          String AV65Faseshdr_wcds_9_tffascod_sel ,
                                          String AV64Faseshdr_wcds_8_tffascod ,
                                          String AV67Faseshdr_wcds_11_tffasdsc_sel ,
                                          String AV66Faseshdr_wcds_10_tffasdsc ,
                                          String AV69Faseshdr_wcds_13_tfmaqcodbis_sel ,
                                          String AV68Faseshdr_wcds_12_tfmaqcodbis ,
                                          java.util.Date AV70Faseshdr_wcds_14_tfbarfasdti ,
                                          java.util.Date AV71Faseshdr_wcds_15_tfbarfasdtf ,
                                          java.math.BigDecimal AV72Faseshdr_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV73Faseshdr_wcds_17_tfbartierea_to ,
                                          int AV74Faseshdr_wcds_18_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV75Faseshdr_wcds_19_tfbarfaskgm ,
                                          java.math.BigDecimal AV76Faseshdr_wcds_20_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV77Faseshdr_wcds_21_tfbarfasmtr ,
                                          java.math.BigDecimal AV78Faseshdr_wcds_22_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV49Emprcod ,
                                          int A129BarCod ,
                                          int AV50Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV51Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV52Barcodpar ,
                                          String AV57Faseshdr_wcds_1_emprcod ,
                                          int AV58Faseshdr_wcds_2_barcod ,
                                          byte AV59Faseshdr_wcds_3_barcodreo ,
                                          String AV60Faseshdr_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[8];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P08UN2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] );
            case 1 :
                  return conditional_P08UN3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] );
            case 2 :
                  return conditional_P08UN4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08UN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08UN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08UN4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               return;
      }
   }

}

