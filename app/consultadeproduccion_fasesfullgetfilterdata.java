package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_fasesfullgetfilterdata extends GXProcedure
{
   public consultadeproduccion_fasesfullgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_fasesfullgetfilterdata.class ), "" );
   }

   public consultadeproduccion_fasesfullgetfilterdata( int remoteHandle ,
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
      consultadeproduccion_fasesfullgetfilterdata.this.aP5 = new String[] {""};
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
      consultadeproduccion_fasesfullgetfilterdata.this.AV32DDOName = aP0;
      consultadeproduccion_fasesfullgetfilterdata.this.AV30SearchTxt = aP1;
      consultadeproduccion_fasesfullgetfilterdata.this.AV31SearchTxtTo = aP2;
      consultadeproduccion_fasesfullgetfilterdata.this.aP3 = aP3;
      consultadeproduccion_fasesfullgetfilterdata.this.aP4 = aP4;
      consultadeproduccion_fasesfullgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV43Session.getValue("ConsultadeProduccion_FasesFullGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultadeProduccion_FasesFullGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("ConsultadeProduccion_FasesFullGridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
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
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASPRI") == 0 )
         {
            AV55TFBarFasPri = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFBarFasPri_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49EmprCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV50BarCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV51BarCodReo = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV52BarCodPar = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV30SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV61Consultadeproduccion_fasesfullds_1_emprcod = AV49EmprCod ;
      AV62Consultadeproduccion_fasesfullds_2_barcod = AV50BarCod ;
      AV63Consultadeproduccion_fasesfullds_3_barcodreo = AV51BarCodReo ;
      AV64Consultadeproduccion_fasesfullds_4_barcodpar = AV52BarCodPar ;
      AV65Consultadeproduccion_fasesfullds_5_tfbarordlin = AV10TFBarOrdLin ;
      AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV67Consultadeproduccion_fasesfullds_7_tffascod = AV12TFFasCod ;
      AV68Consultadeproduccion_fasesfullds_8_tffascod_sel = AV13TFFasCod_Sel ;
      AV69Consultadeproduccion_fasesfullds_9_tffasdsc = AV14TFFasDsc ;
      AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV16TFMaqCodBis ;
      AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV18TFBarFasDTI ;
      AV74Consultadeproduccion_fasesfullds_14_tfbartierea = AV22TFBarTieRea ;
      AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV23TFBarTieRea_To ;
      AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV25TFBarFasEst_Sels ;
      AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV26TFBarFasKgm ;
      AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV28TFBarFasMtr ;
      AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV55TFBarFasPri ;
      AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV56TFBarFasPri_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                           Short.valueOf(AV65Consultadeproduccion_fasesfullds_5_tfbarordlin) ,
                                           Short.valueOf(AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to) ,
                                           AV68Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                           AV67Consultadeproduccion_fasesfullds_7_tffascod ,
                                           AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                           AV69Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                           AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                           AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                           AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                           AV74Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                           AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                           Integer.valueOf(AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels.size()) ,
                                           AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                           AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                           AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                           AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                           Byte.valueOf(AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri) ,
                                           Byte.valueOf(AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           A396EmprCod ,
                                           AV49EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           A130BarCodPar ,
                                           AV52BarCodPar ,
                                           AV61Consultadeproduccion_fasesfullds_1_emprcod ,
                                           Integer.valueOf(AV62Consultadeproduccion_fasesfullds_2_barcod) ,
                                           Byte.valueOf(AV63Consultadeproduccion_fasesfullds_3_barcodreo) ,
                                           AV64Consultadeproduccion_fasesfullds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV67Consultadeproduccion_fasesfullds_7_tffascod = GXutil.padr( GXutil.rtrim( AV67Consultadeproduccion_fasesfullds_7_tffascod), 8, "%") ;
      lV69Consultadeproduccion_fasesfullds_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Consultadeproduccion_fasesfullds_9_tffasdsc), 28, "%") ;
      lV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0A412 */
      pr_default.execute(0, new Object[] {AV61Consultadeproduccion_fasesfullds_1_emprcod, Integer.valueOf(AV62Consultadeproduccion_fasesfullds_2_barcod), Byte.valueOf(AV63Consultadeproduccion_fasesfullds_3_barcodreo), AV64Consultadeproduccion_fasesfullds_4_barcodpar, AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, Short.valueOf(AV65Consultadeproduccion_fasesfullds_5_tfbarordlin), Short.valueOf(AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to), lV67Consultadeproduccion_fasesfullds_7_tffascod, AV68Consultadeproduccion_fasesfullds_8_tffascod_sel, lV69Consultadeproduccion_fasesfullds_9_tffasdsc, AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel, lV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis, AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel, AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti, AV74Consultadeproduccion_fasesfullds_14_tfbartierea, AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to, AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm, AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to, AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr, AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to, Byte.valueOf(AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri), Byte.valueOf(AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA412 = false ;
         A396EmprCod = P0A412_A396EmprCod[0] ;
         A129BarCod = P0A412_A129BarCod[0] ;
         A132BarCodReo = P0A412_A132BarCodReo[0] ;
         A130BarCodPar = P0A412_A130BarCodPar[0] ;
         A457FasCod = P0A412_A457FasCod[0] ;
         A3836BarFasPri = P0A412_A3836BarFasPri[0] ;
         A3838BarFasMtr = P0A412_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0A412_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0A412_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0A412_n3837BarFasKgm[0] ;
         A153BarFasEst = P0A412_A153BarFasEst[0] ;
         A215BarTieRea = P0A412_A215BarTieRea[0] ;
         A4442BarFasDTI = P0A412_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0A412_n4442BarFasDTI[0] ;
         A603MaqCodBis = P0A412_A603MaqCodBis[0] ;
         A460FasDsc = P0A412_A460FasDsc[0] ;
         A194BarOrdLin = P0A412_A194BarOrdLin[0] ;
         A758ProCod = P0A412_A758ProCod[0] ;
         A460FasDsc = P0A412_A460FasDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A412_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A412_A129BarCod[0] == A129BarCod ) && ( P0A412_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0A412_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0A412_A457FasCod[0], A457FasCod) == 0 ) ) )
            {
               if (true) break;
            }
            brkA412 = false ;
            A194BarOrdLin = P0A412_A194BarOrdLin[0] ;
            A758ProCod = P0A412_A758ProCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brkA412 = true ;
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
         if ( ! brkA412 )
         {
            brkA412 = true ;
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
      AV61Consultadeproduccion_fasesfullds_1_emprcod = AV49EmprCod ;
      AV62Consultadeproduccion_fasesfullds_2_barcod = AV50BarCod ;
      AV63Consultadeproduccion_fasesfullds_3_barcodreo = AV51BarCodReo ;
      AV64Consultadeproduccion_fasesfullds_4_barcodpar = AV52BarCodPar ;
      AV65Consultadeproduccion_fasesfullds_5_tfbarordlin = AV10TFBarOrdLin ;
      AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV67Consultadeproduccion_fasesfullds_7_tffascod = AV12TFFasCod ;
      AV68Consultadeproduccion_fasesfullds_8_tffascod_sel = AV13TFFasCod_Sel ;
      AV69Consultadeproduccion_fasesfullds_9_tffasdsc = AV14TFFasDsc ;
      AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV16TFMaqCodBis ;
      AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV18TFBarFasDTI ;
      AV74Consultadeproduccion_fasesfullds_14_tfbartierea = AV22TFBarTieRea ;
      AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV23TFBarTieRea_To ;
      AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV25TFBarFasEst_Sels ;
      AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV26TFBarFasKgm ;
      AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV28TFBarFasMtr ;
      AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV55TFBarFasPri ;
      AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV56TFBarFasPri_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                           Short.valueOf(AV65Consultadeproduccion_fasesfullds_5_tfbarordlin) ,
                                           Short.valueOf(AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to) ,
                                           AV68Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                           AV67Consultadeproduccion_fasesfullds_7_tffascod ,
                                           AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                           AV69Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                           AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                           AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                           AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                           AV74Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                           AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                           Integer.valueOf(AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels.size()) ,
                                           AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                           AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                           AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                           AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                           Byte.valueOf(AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri) ,
                                           Byte.valueOf(AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           A396EmprCod ,
                                           AV49EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           A130BarCodPar ,
                                           AV52BarCodPar ,
                                           AV61Consultadeproduccion_fasesfullds_1_emprcod ,
                                           Integer.valueOf(AV62Consultadeproduccion_fasesfullds_2_barcod) ,
                                           Byte.valueOf(AV63Consultadeproduccion_fasesfullds_3_barcodreo) ,
                                           AV64Consultadeproduccion_fasesfullds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV67Consultadeproduccion_fasesfullds_7_tffascod = GXutil.padr( GXutil.rtrim( AV67Consultadeproduccion_fasesfullds_7_tffascod), 8, "%") ;
      lV69Consultadeproduccion_fasesfullds_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Consultadeproduccion_fasesfullds_9_tffasdsc), 28, "%") ;
      lV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0A413 */
      pr_default.execute(1, new Object[] {AV61Consultadeproduccion_fasesfullds_1_emprcod, Integer.valueOf(AV62Consultadeproduccion_fasesfullds_2_barcod), Byte.valueOf(AV63Consultadeproduccion_fasesfullds_3_barcodreo), AV64Consultadeproduccion_fasesfullds_4_barcodpar, AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, Short.valueOf(AV65Consultadeproduccion_fasesfullds_5_tfbarordlin), Short.valueOf(AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to), lV67Consultadeproduccion_fasesfullds_7_tffascod, AV68Consultadeproduccion_fasesfullds_8_tffascod_sel, lV69Consultadeproduccion_fasesfullds_9_tffasdsc, AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel, lV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis, AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel, AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti, AV74Consultadeproduccion_fasesfullds_14_tfbartierea, AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to, AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm, AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to, AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr, AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to, Byte.valueOf(AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri), Byte.valueOf(AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA414 = false ;
         A396EmprCod = P0A413_A396EmprCod[0] ;
         A129BarCod = P0A413_A129BarCod[0] ;
         A132BarCodReo = P0A413_A132BarCodReo[0] ;
         A130BarCodPar = P0A413_A130BarCodPar[0] ;
         A460FasDsc = P0A413_A460FasDsc[0] ;
         A3836BarFasPri = P0A413_A3836BarFasPri[0] ;
         A3838BarFasMtr = P0A413_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0A413_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0A413_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0A413_n3837BarFasKgm[0] ;
         A153BarFasEst = P0A413_A153BarFasEst[0] ;
         A215BarTieRea = P0A413_A215BarTieRea[0] ;
         A4442BarFasDTI = P0A413_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0A413_n4442BarFasDTI[0] ;
         A603MaqCodBis = P0A413_A603MaqCodBis[0] ;
         A457FasCod = P0A413_A457FasCod[0] ;
         A194BarOrdLin = P0A413_A194BarOrdLin[0] ;
         A758ProCod = P0A413_A758ProCod[0] ;
         A460FasDsc = P0A413_A460FasDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A413_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A413_A129BarCod[0] == A129BarCod ) && ( P0A413_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0A413_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0A413_A460FasDsc[0], A460FasDsc) == 0 ) ) )
            {
               if (true) break;
            }
            brkA414 = false ;
            A457FasCod = P0A413_A457FasCod[0] ;
            A194BarOrdLin = P0A413_A194BarOrdLin[0] ;
            A758ProCod = P0A413_A758ProCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brkA414 = true ;
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
         if ( ! brkA414 )
         {
            brkA414 = true ;
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
      AV61Consultadeproduccion_fasesfullds_1_emprcod = AV49EmprCod ;
      AV62Consultadeproduccion_fasesfullds_2_barcod = AV50BarCod ;
      AV63Consultadeproduccion_fasesfullds_3_barcodreo = AV51BarCodReo ;
      AV64Consultadeproduccion_fasesfullds_4_barcodpar = AV52BarCodPar ;
      AV65Consultadeproduccion_fasesfullds_5_tfbarordlin = AV10TFBarOrdLin ;
      AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV67Consultadeproduccion_fasesfullds_7_tffascod = AV12TFFasCod ;
      AV68Consultadeproduccion_fasesfullds_8_tffascod_sel = AV13TFFasCod_Sel ;
      AV69Consultadeproduccion_fasesfullds_9_tffasdsc = AV14TFFasDsc ;
      AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV16TFMaqCodBis ;
      AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV18TFBarFasDTI ;
      AV74Consultadeproduccion_fasesfullds_14_tfbartierea = AV22TFBarTieRea ;
      AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV23TFBarTieRea_To ;
      AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV25TFBarFasEst_Sels ;
      AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV26TFBarFasKgm ;
      AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV28TFBarFasMtr ;
      AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV55TFBarFasPri ;
      AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV56TFBarFasPri_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                           Short.valueOf(AV65Consultadeproduccion_fasesfullds_5_tfbarordlin) ,
                                           Short.valueOf(AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to) ,
                                           AV68Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                           AV67Consultadeproduccion_fasesfullds_7_tffascod ,
                                           AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                           AV69Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                           AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                           AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                           AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                           AV74Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                           AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                           Integer.valueOf(AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels.size()) ,
                                           AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                           AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                           AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                           AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                           Byte.valueOf(AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri) ,
                                           Byte.valueOf(AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           A396EmprCod ,
                                           AV49EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           A130BarCodPar ,
                                           AV52BarCodPar ,
                                           AV61Consultadeproduccion_fasesfullds_1_emprcod ,
                                           Integer.valueOf(AV62Consultadeproduccion_fasesfullds_2_barcod) ,
                                           Byte.valueOf(AV63Consultadeproduccion_fasesfullds_3_barcodreo) ,
                                           AV64Consultadeproduccion_fasesfullds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV67Consultadeproduccion_fasesfullds_7_tffascod = GXutil.padr( GXutil.rtrim( AV67Consultadeproduccion_fasesfullds_7_tffascod), 8, "%") ;
      lV69Consultadeproduccion_fasesfullds_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Consultadeproduccion_fasesfullds_9_tffasdsc), 28, "%") ;
      lV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0A414 */
      pr_default.execute(2, new Object[] {AV61Consultadeproduccion_fasesfullds_1_emprcod, Integer.valueOf(AV62Consultadeproduccion_fasesfullds_2_barcod), Byte.valueOf(AV63Consultadeproduccion_fasesfullds_3_barcodreo), AV64Consultadeproduccion_fasesfullds_4_barcodpar, AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, Short.valueOf(AV65Consultadeproduccion_fasesfullds_5_tfbarordlin), Short.valueOf(AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to), lV67Consultadeproduccion_fasesfullds_7_tffascod, AV68Consultadeproduccion_fasesfullds_8_tffascod_sel, lV69Consultadeproduccion_fasesfullds_9_tffasdsc, AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel, lV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis, AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel, AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti, AV74Consultadeproduccion_fasesfullds_14_tfbartierea, AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to, AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm, AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to, AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr, AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to, Byte.valueOf(AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri), Byte.valueOf(AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA416 = false ;
         A396EmprCod = P0A414_A396EmprCod[0] ;
         A129BarCod = P0A414_A129BarCod[0] ;
         A132BarCodReo = P0A414_A132BarCodReo[0] ;
         A130BarCodPar = P0A414_A130BarCodPar[0] ;
         A603MaqCodBis = P0A414_A603MaqCodBis[0] ;
         A3836BarFasPri = P0A414_A3836BarFasPri[0] ;
         A3838BarFasMtr = P0A414_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0A414_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0A414_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0A414_n3837BarFasKgm[0] ;
         A153BarFasEst = P0A414_A153BarFasEst[0] ;
         A215BarTieRea = P0A414_A215BarTieRea[0] ;
         A4442BarFasDTI = P0A414_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0A414_n4442BarFasDTI[0] ;
         A460FasDsc = P0A414_A460FasDsc[0] ;
         A457FasCod = P0A414_A457FasCod[0] ;
         A194BarOrdLin = P0A414_A194BarOrdLin[0] ;
         A758ProCod = P0A414_A758ProCod[0] ;
         A460FasDsc = P0A414_A460FasDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A414_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A414_A129BarCod[0] == A129BarCod ) && ( P0A414_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0A414_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0A414_A603MaqCodBis[0], A603MaqCodBis) == 0 ) ) )
            {
               if (true) break;
            }
            brkA416 = false ;
            A194BarOrdLin = P0A414_A194BarOrdLin[0] ;
            A758ProCod = P0A414_A758ProCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brkA416 = true ;
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
         if ( ! brkA416 )
         {
            brkA416 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadeproduccion_fasesfullgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = consultadeproduccion_fasesfullgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = consultadeproduccion_fasesfullgetfilterdata.this.AV41OptionIndexesJson;
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
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV16TFMaqCodBis = "" ;
      AV17TFMaqCodBis_Sel = "" ;
      AV18TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV22TFBarTieRea = DecimalUtil.ZERO ;
      AV23TFBarTieRea_To = DecimalUtil.ZERO ;
      AV24TFBarFasEst_SelsJson = "" ;
      AV25TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV26TFBarFasKgm = DecimalUtil.ZERO ;
      AV27TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV28TFBarFasMtr = DecimalUtil.ZERO ;
      AV29TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV49EmprCod = "" ;
      AV52BarCodPar = "" ;
      A457FasCod = "" ;
      AV61Consultadeproduccion_fasesfullds_1_emprcod = "" ;
      AV64Consultadeproduccion_fasesfullds_4_barcodpar = "" ;
      AV67Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      AV68Consultadeproduccion_fasesfullds_8_tffascod_sel = "" ;
      AV69Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel = "" ;
      AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = "" ;
      AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV74Consultadeproduccion_fasesfullds_14_tfbartierea = DecimalUtil.ZERO ;
      AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to = DecimalUtil.ZERO ;
      AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm = DecimalUtil.ZERO ;
      AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr = DecimalUtil.ZERO ;
      AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV67Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      lV69Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      lV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P0A412_A396EmprCod = new String[] {""} ;
      P0A412_A129BarCod = new int[1] ;
      P0A412_A132BarCodReo = new byte[1] ;
      P0A412_A130BarCodPar = new String[] {""} ;
      P0A412_A457FasCod = new String[] {""} ;
      P0A412_A3836BarFasPri = new byte[1] ;
      P0A412_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A412_n3838BarFasMtr = new boolean[] {false} ;
      P0A412_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A412_n3837BarFasKgm = new boolean[] {false} ;
      P0A412_A153BarFasEst = new byte[1] ;
      P0A412_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A412_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A412_n4442BarFasDTI = new boolean[] {false} ;
      P0A412_A603MaqCodBis = new String[] {""} ;
      P0A412_A460FasDsc = new String[] {""} ;
      P0A412_A194BarOrdLin = new short[1] ;
      P0A412_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV34Option = "" ;
      AV37OptionDesc = "" ;
      P0A413_A396EmprCod = new String[] {""} ;
      P0A413_A129BarCod = new int[1] ;
      P0A413_A132BarCodReo = new byte[1] ;
      P0A413_A130BarCodPar = new String[] {""} ;
      P0A413_A460FasDsc = new String[] {""} ;
      P0A413_A3836BarFasPri = new byte[1] ;
      P0A413_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A413_n3838BarFasMtr = new boolean[] {false} ;
      P0A413_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A413_n3837BarFasKgm = new boolean[] {false} ;
      P0A413_A153BarFasEst = new byte[1] ;
      P0A413_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A413_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A413_n4442BarFasDTI = new boolean[] {false} ;
      P0A413_A603MaqCodBis = new String[] {""} ;
      P0A413_A457FasCod = new String[] {""} ;
      P0A413_A194BarOrdLin = new short[1] ;
      P0A413_A758ProCod = new String[] {""} ;
      P0A414_A396EmprCod = new String[] {""} ;
      P0A414_A129BarCod = new int[1] ;
      P0A414_A132BarCodReo = new byte[1] ;
      P0A414_A130BarCodPar = new String[] {""} ;
      P0A414_A603MaqCodBis = new String[] {""} ;
      P0A414_A3836BarFasPri = new byte[1] ;
      P0A414_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A414_n3838BarFasMtr = new boolean[] {false} ;
      P0A414_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A414_n3837BarFasKgm = new boolean[] {false} ;
      P0A414_A153BarFasEst = new byte[1] ;
      P0A414_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A414_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A414_n4442BarFasDTI = new boolean[] {false} ;
      P0A414_A460FasDsc = new String[] {""} ;
      P0A414_A457FasCod = new String[] {""} ;
      P0A414_A194BarOrdLin = new short[1] ;
      P0A414_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_fasesfullgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A412_A396EmprCod, P0A412_A129BarCod, P0A412_A132BarCodReo, P0A412_A130BarCodPar, P0A412_A457FasCod, P0A412_A3836BarFasPri, P0A412_A3838BarFasMtr, P0A412_n3838BarFasMtr, P0A412_A3837BarFasKgm, P0A412_n3837BarFasKgm,
            P0A412_A153BarFasEst, P0A412_A215BarTieRea, P0A412_A4442BarFasDTI, P0A412_n4442BarFasDTI, P0A412_A603MaqCodBis, P0A412_A460FasDsc, P0A412_A194BarOrdLin, P0A412_A758ProCod
            }
            , new Object[] {
            P0A413_A396EmprCod, P0A413_A129BarCod, P0A413_A132BarCodReo, P0A413_A130BarCodPar, P0A413_A460FasDsc, P0A413_A3836BarFasPri, P0A413_A3838BarFasMtr, P0A413_n3838BarFasMtr, P0A413_A3837BarFasKgm, P0A413_n3837BarFasKgm,
            P0A413_A153BarFasEst, P0A413_A215BarTieRea, P0A413_A4442BarFasDTI, P0A413_n4442BarFasDTI, P0A413_A603MaqCodBis, P0A413_A457FasCod, P0A413_A194BarOrdLin, P0A413_A758ProCod
            }
            , new Object[] {
            P0A414_A396EmprCod, P0A414_A129BarCod, P0A414_A132BarCodReo, P0A414_A130BarCodPar, P0A414_A603MaqCodBis, P0A414_A3836BarFasPri, P0A414_A3838BarFasMtr, P0A414_n3838BarFasMtr, P0A414_A3837BarFasKgm, P0A414_n3837BarFasKgm,
            P0A414_A153BarFasEst, P0A414_A215BarTieRea, P0A414_A4442BarFasDTI, P0A414_n4442BarFasDTI, P0A414_A460FasDsc, P0A414_A457FasCod, P0A414_A194BarOrdLin, P0A414_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV55TFBarFasPri ;
   private byte AV56TFBarFasPri_To ;
   private byte AV51BarCodReo ;
   private byte AV63Consultadeproduccion_fasesfullds_3_barcodreo ;
   private byte AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri ;
   private byte AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte A132BarCodReo ;
   private short AV10TFBarOrdLin ;
   private short AV11TFBarOrdLin_To ;
   private short AV65Consultadeproduccion_fasesfullds_5_tfbarordlin ;
   private short AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV59GXV1 ;
   private int AV50BarCod ;
   private int AV62Consultadeproduccion_fasesfullds_2_barcod ;
   private int AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ;
   private int A129BarCod ;
   private long AV42count ;
   private java.math.BigDecimal AV22TFBarTieRea ;
   private java.math.BigDecimal AV23TFBarTieRea_To ;
   private java.math.BigDecimal AV26TFBarFasKgm ;
   private java.math.BigDecimal AV27TFBarFasKgm_To ;
   private java.math.BigDecimal AV28TFBarFasMtr ;
   private java.math.BigDecimal AV29TFBarFasMtr_To ;
   private java.math.BigDecimal AV74Consultadeproduccion_fasesfullds_14_tfbartierea ;
   private java.math.BigDecimal AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to ;
   private java.math.BigDecimal AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm ;
   private java.math.BigDecimal AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ;
   private java.math.BigDecimal AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr ;
   private java.math.BigDecimal AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV16TFMaqCodBis ;
   private String AV17TFMaqCodBis_Sel ;
   private String AV49EmprCod ;
   private String AV52BarCodPar ;
   private String A457FasCod ;
   private String AV61Consultadeproduccion_fasesfullds_1_emprcod ;
   private String AV64Consultadeproduccion_fasesfullds_4_barcodpar ;
   private String AV67Consultadeproduccion_fasesfullds_7_tffascod ;
   private String AV68Consultadeproduccion_fasesfullds_8_tffascod_sel ;
   private String AV69Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel ;
   private String AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ;
   private String scmdbuf ;
   private String lV67Consultadeproduccion_fasesfullds_7_tffascod ;
   private String lV69Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String lV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private java.util.Date AV18TFBarFasDTI ;
   private java.util.Date AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti ;
   private java.util.Date A4442BarFasDTI ;
   private boolean returnInSub ;
   private boolean brkA412 ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4442BarFasDTI ;
   private boolean brkA414 ;
   private boolean brkA416 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV24TFBarFasEst_SelsJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV34Option ;
   private String AV37OptionDesc ;
   private GXSimpleCollection<Byte> AV25TFBarFasEst_Sels ;
   private GXSimpleCollection<Byte> AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A412_A396EmprCod ;
   private int[] P0A412_A129BarCod ;
   private byte[] P0A412_A132BarCodReo ;
   private String[] P0A412_A130BarCodPar ;
   private String[] P0A412_A457FasCod ;
   private byte[] P0A412_A3836BarFasPri ;
   private java.math.BigDecimal[] P0A412_A3838BarFasMtr ;
   private boolean[] P0A412_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0A412_A3837BarFasKgm ;
   private boolean[] P0A412_n3837BarFasKgm ;
   private byte[] P0A412_A153BarFasEst ;
   private java.math.BigDecimal[] P0A412_A215BarTieRea ;
   private java.util.Date[] P0A412_A4442BarFasDTI ;
   private boolean[] P0A412_n4442BarFasDTI ;
   private String[] P0A412_A603MaqCodBis ;
   private String[] P0A412_A460FasDsc ;
   private short[] P0A412_A194BarOrdLin ;
   private String[] P0A412_A758ProCod ;
   private String[] P0A413_A396EmprCod ;
   private int[] P0A413_A129BarCod ;
   private byte[] P0A413_A132BarCodReo ;
   private String[] P0A413_A130BarCodPar ;
   private String[] P0A413_A460FasDsc ;
   private byte[] P0A413_A3836BarFasPri ;
   private java.math.BigDecimal[] P0A413_A3838BarFasMtr ;
   private boolean[] P0A413_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0A413_A3837BarFasKgm ;
   private boolean[] P0A413_n3837BarFasKgm ;
   private byte[] P0A413_A153BarFasEst ;
   private java.math.BigDecimal[] P0A413_A215BarTieRea ;
   private java.util.Date[] P0A413_A4442BarFasDTI ;
   private boolean[] P0A413_n4442BarFasDTI ;
   private String[] P0A413_A603MaqCodBis ;
   private String[] P0A413_A457FasCod ;
   private short[] P0A413_A194BarOrdLin ;
   private String[] P0A413_A758ProCod ;
   private String[] P0A414_A396EmprCod ;
   private int[] P0A414_A129BarCod ;
   private byte[] P0A414_A132BarCodReo ;
   private String[] P0A414_A130BarCodPar ;
   private String[] P0A414_A603MaqCodBis ;
   private byte[] P0A414_A3836BarFasPri ;
   private java.math.BigDecimal[] P0A414_A3838BarFasMtr ;
   private boolean[] P0A414_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0A414_A3837BarFasKgm ;
   private boolean[] P0A414_n3837BarFasKgm ;
   private byte[] P0A414_A153BarFasEst ;
   private java.math.BigDecimal[] P0A414_A215BarTieRea ;
   private java.util.Date[] P0A414_A4442BarFasDTI ;
   private boolean[] P0A414_n4442BarFasDTI ;
   private String[] P0A414_A460FasDsc ;
   private String[] P0A414_A457FasCod ;
   private short[] P0A414_A194BarOrdLin ;
   private String[] P0A414_A758ProCod ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class consultadeproduccion_fasesfullgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A412( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                          short AV65Consultadeproduccion_fasesfullds_5_tfbarordlin ,
                                          short AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to ,
                                          String AV68Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                          String AV67Consultadeproduccion_fasesfullds_7_tffascod ,
                                          String AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                          String AV69Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                          String AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                          String AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                          java.util.Date AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                          java.math.BigDecimal AV74Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                          java.math.BigDecimal AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                          int AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                          java.math.BigDecimal AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                          java.math.BigDecimal AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                          byte AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri ,
                                          byte AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          int A129BarCod ,
                                          int AV50BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV51BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodPar ,
                                          String AV61Consultadeproduccion_fasesfullds_1_emprcod ,
                                          int AV62Consultadeproduccion_fasesfullds_2_barcod ,
                                          byte AV63Consultadeproduccion_fasesfullds_3_barcodreo ,
                                          String AV64Consultadeproduccion_fasesfullds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[25];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis," ;
      scmdbuf += " T2.FasDsc, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV65Consultadeproduccion_fasesfullds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Consultadeproduccion_fasesfullds_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Consultadeproduccion_fasesfullds_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Consultadeproduccion_fasesfullds_14_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A413( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                          short AV65Consultadeproduccion_fasesfullds_5_tfbarordlin ,
                                          short AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to ,
                                          String AV68Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                          String AV67Consultadeproduccion_fasesfullds_7_tffascod ,
                                          String AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                          String AV69Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                          String AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                          String AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                          java.util.Date AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                          java.math.BigDecimal AV74Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                          java.math.BigDecimal AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                          int AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                          java.math.BigDecimal AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                          java.math.BigDecimal AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                          byte AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri ,
                                          byte AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          int A129BarCod ,
                                          int AV50BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV51BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodPar ,
                                          String AV61Consultadeproduccion_fasesfullds_1_emprcod ,
                                          int AV62Consultadeproduccion_fasesfullds_2_barcod ,
                                          byte AV63Consultadeproduccion_fasesfullds_3_barcodreo ,
                                          String AV64Consultadeproduccion_fasesfullds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[25];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis," ;
      scmdbuf += " T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV65Consultadeproduccion_fasesfullds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Consultadeproduccion_fasesfullds_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Consultadeproduccion_fasesfullds_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Consultadeproduccion_fasesfullds_14_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A414( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                          short AV65Consultadeproduccion_fasesfullds_5_tfbarordlin ,
                                          short AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to ,
                                          String AV68Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                          String AV67Consultadeproduccion_fasesfullds_7_tffascod ,
                                          String AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                          String AV69Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                          String AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                          String AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                          java.util.Date AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                          java.math.BigDecimal AV74Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                          java.math.BigDecimal AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                          int AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                          java.math.BigDecimal AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                          java.math.BigDecimal AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                          byte AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri ,
                                          byte AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          int A129BarCod ,
                                          int AV50BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV51BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV52BarCodPar ,
                                          String AV61Consultadeproduccion_fasesfullds_1_emprcod ,
                                          int AV62Consultadeproduccion_fasesfullds_2_barcod ,
                                          byte AV63Consultadeproduccion_fasesfullds_3_barcodreo ,
                                          String AV64Consultadeproduccion_fasesfullds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[25];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T2.FasDsc," ;
      scmdbuf += " T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV65Consultadeproduccion_fasesfullds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Consultadeproduccion_fasesfullds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Consultadeproduccion_fasesfullds_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Consultadeproduccion_fasesfullds_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Consultadeproduccion_fasesfullds_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Consultadeproduccion_fasesfullds_13_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Consultadeproduccion_fasesfullds_14_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Consultadeproduccion_fasesfullds_15_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Consultadeproduccion_fasesfullds_16_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Consultadeproduccion_fasesfullds_17_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consultadeproduccion_fasesfullds_19_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Consultadeproduccion_fasesfullds_21_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
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
                  return conditional_P0A412(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] );
            case 1 :
                  return conditional_P0A413(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] );
            case 2 :
                  return conditional_P0A414(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A412", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A413", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A414", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               ((String[]) buf[15])[0] = rslt.getString(13, 28);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 28);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               return;
      }
   }

}

