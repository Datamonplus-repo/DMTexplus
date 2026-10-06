package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partesdeproduccionlector_wcgetfilterdata extends GXProcedure
{
   public partesdeproduccionlector_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partesdeproduccionlector_wcgetfilterdata.class ), "" );
   }

   public partesdeproduccionlector_wcgetfilterdata( int remoteHandle ,
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
      partesdeproduccionlector_wcgetfilterdata.this.aP5 = new String[] {""};
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
      partesdeproduccionlector_wcgetfilterdata.this.AV44DDOName = aP0;
      partesdeproduccionlector_wcgetfilterdata.this.AV42SearchTxt = aP1;
      partesdeproduccionlector_wcgetfilterdata.this.AV43SearchTxtTo = aP2;
      partesdeproduccionlector_wcgetfilterdata.this.aP3 = aP3;
      partesdeproduccionlector_wcgetfilterdata.this.aP4 = aP4;
      partesdeproduccionlector_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV47Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_FASE") == 0 )
      {
         /* Execute user subroutine: 'LOADFASEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_FASEDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASEDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_HISPROF") == 0 )
      {
         /* Execute user subroutine: 'LOADHISPROFOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_HISPROLOT") == 0 )
      {
         /* Execute user subroutine: 'LOADHISPROLOTOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_PARCODNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPARCODNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV48OptionsJson = AV47Options.toJSonString(false) ;
      AV51OptionsDescJson = AV50OptionsDesc.toJSonString(false) ;
      AV53OptionIndexesJson = AV52OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV55Session.getValue("LectorOptico.PartesdeProduccionLector_WCGridState"), "") == 0 )
      {
         AV57GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "LectorOptico.PartesdeProduccionLector_WCGridState"), null, null);
      }
      else
      {
         AV57GridState.fromxml(AV55Session.getValue("LectorOptico.PartesdeProduccionLector_WCGridState"), null, null);
      }
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV58GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV16TFHisProLin = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFHisProLin_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV18TFBarNHdr = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV19TFBarNHdr_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV20TFGruOpeCod = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFGruOpeCod_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV22TFBarOrdLin = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFBarOrdLin_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV24TFFase = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV25TFFase_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV64TFFaseDsc = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV65TFFaseDsc_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV26TFHisProDTI = localUtil.ctot( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV28TFHisProDTF = localUtil.ctot( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV30TFHisProF = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV31TFHisProF_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV32TFHisProTur = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFHisProTur_To = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV34TFHisProKgr = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFHisProKgr_To = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV36TFHisProMtr = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFHisProMtr_To = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV38TFHisProNpzs = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFHisProNpzs_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT") == 0 )
         {
            AV66TFHisProLot = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT_SEL") == 0 )
         {
            AV67TFHisProLot_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV40TFParCodNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV41TFParCodNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTR2") == 0 )
         {
            AV68TFHisProTr2 = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFHisProTr2_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV61Emprcod = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV62Maqcod = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC") == 0 )
         {
            AV63HisProfec = localUtil.ctod( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarNHdr = AV42SearchTxt ;
      AV19TFBarNHdr_Sel = "" ;
      AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV16TFHisProLin ;
      AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV17TFHisProLin_To ;
      AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV18TFBarNHdr ;
      AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV20TFGruOpeCod ;
      AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV21TFGruOpeCod_To ;
      AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV22TFBarOrdLin ;
      AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV23TFBarOrdLin_To ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV24TFFase ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV25TFFase_Sel ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV64TFFaseDsc ;
      AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV65TFFaseDsc_Sel ;
      AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV26TFHisProDTI ;
      AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV28TFHisProDTF ;
      AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV30TFHisProF ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV31TFHisProF_Sel ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV32TFHisProTur ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV33TFHisProTur_To ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV34TFHisProKgr ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV35TFHisProKgr_To ;
      AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV36TFHisProMtr ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV37TFHisProMtr_To ;
      AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV38TFHisProNpzs ;
      AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV39TFHisProNpzs_To ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV66TFHisProLot ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV67TFHisProLot_Sel ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV40TFParCodNom ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV41TFParCodNom_Sel ;
      AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV68TFHisProTr2 ;
      AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV69TFHisProTr2_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                           Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                           AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                           AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                           Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                           Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                           Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                           AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                           AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                           AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                           AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                           AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                           AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                           Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                           Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                           AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                           AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                           AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                           AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                           Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                           Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                           AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                           AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                           AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                           AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                           Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                           Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A3610HisProLot ,
                                           A867ParCodNom ,
                                           AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                           AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                           A7258FaseDsc ,
                                           AV61Emprcod ,
                                           AV62Maqcod ,
                                           AV63HisProfec ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A558HisProFec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
      lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
      lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
      lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
      lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P096L2 */
      pr_default.execute(0, new Object[] {AV61Emprcod, AV62Maqcod, AV63HisProfec, Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A656ParCod = P096L2_A656ParCod[0] ;
         n656ParCod = P096L2_n656ParCod[0] ;
         A558HisProFec = P096L2_A558HisProFec[0] ;
         A602MaqCod = P096L2_A602MaqCod[0] ;
         A867ParCodNom = P096L2_A867ParCodNom[0] ;
         n867ParCodNom = P096L2_n867ParCodNom[0] ;
         A3610HisProLot = P096L2_A3610HisProLot[0] ;
         A4714HisProNpzs = P096L2_A4714HisProNpzs[0] ;
         A1526HisProMtr = P096L2_A1526HisProMtr[0] ;
         A1525HisProKgr = P096L2_A1525HisProKgr[0] ;
         A566HisProTur = P096L2_A566HisProTur[0] ;
         A557HisProF = P096L2_A557HisProF[0] ;
         A194BarOrdLin = P096L2_A194BarOrdLin[0] ;
         A503GruOpeCod = P096L2_A503GruOpeCod[0] ;
         A561HisProLin = P096L2_A561HisProLin[0] ;
         A130BarCodPar = P096L2_A130BarCodPar[0] ;
         A132BarCodReo = P096L2_A132BarCodReo[0] ;
         A129BarCod = P096L2_A129BarCod[0] ;
         A461Fase = P096L2_A461Fase[0] ;
         A396EmprCod = P096L2_A396EmprCod[0] ;
         A4440HisProDTI = P096L2_A4440HisProDTI[0] ;
         n4440HisProDTI = P096L2_n4440HisProDTI[0] ;
         A4441HisProDTF = P096L2_A4441HisProDTF[0] ;
         n4441HisProDTF = P096L2_n4441HisProDTF[0] ;
         A867ParCodNom = P096L2_A867ParCodNom[0] ;
         n867ParCodNom = P096L2_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         GXt_char2 = A7258FaseDsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         partesdeproduccionlector_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A7258FaseDsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
               {
                  AV46Option = A13696BarNHdr ;
                  AV45InsertIndex = 1 ;
                  while ( ( AV45InsertIndex <= AV47Options.size() ) && ( GXutil.strcmp((String)AV47Options.elementAt(-1+AV45InsertIndex), AV46Option) < 0 ) )
                  {
                     AV45InsertIndex = (int)(AV45InsertIndex+1) ;
                  }
                  if ( ( AV45InsertIndex <= AV47Options.size() ) && ( GXutil.strcmp((String)AV47Options.elementAt(-1+AV45InsertIndex), AV46Option) == 0 ) )
                  {
                     AV54count = GXutil.lval( (String)AV52OptionIndexes.elementAt(-1+AV45InsertIndex)) ;
                     AV54count = (long)(AV54count+1) ;
                     AV52OptionIndexes.removeItem(AV45InsertIndex);
                     AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), AV45InsertIndex);
                  }
                  else
                  {
                     AV47Options.add(AV46Option, AV45InsertIndex);
                     AV52OptionIndexes.add("1", AV45InsertIndex);
                  }
               }
               if ( AV47Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASEOPTIONS' Routine */
      returnInSub = false ;
      AV24TFFase = AV42SearchTxt ;
      AV25TFFase_Sel = "" ;
      AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV16TFHisProLin ;
      AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV17TFHisProLin_To ;
      AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV18TFBarNHdr ;
      AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV20TFGruOpeCod ;
      AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV21TFGruOpeCod_To ;
      AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV22TFBarOrdLin ;
      AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV23TFBarOrdLin_To ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV24TFFase ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV25TFFase_Sel ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV64TFFaseDsc ;
      AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV65TFFaseDsc_Sel ;
      AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV26TFHisProDTI ;
      AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV28TFHisProDTF ;
      AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV30TFHisProF ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV31TFHisProF_Sel ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV32TFHisProTur ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV33TFHisProTur_To ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV34TFHisProKgr ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV35TFHisProKgr_To ;
      AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV36TFHisProMtr ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV37TFHisProMtr_To ;
      AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV38TFHisProNpzs ;
      AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV39TFHisProNpzs_To ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV66TFHisProLot ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV67TFHisProLot_Sel ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV40TFParCodNom ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV41TFParCodNom_Sel ;
      AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV68TFHisProTr2 ;
      AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV69TFHisProTr2_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                           Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                           AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                           AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                           Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                           Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                           Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                           AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                           AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                           AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                           AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                           AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                           AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                           Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                           Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                           AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                           AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                           AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                           AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                           Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                           Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                           AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                           AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                           AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                           AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                           Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                           Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A3610HisProLot ,
                                           A867ParCodNom ,
                                           AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                           AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                           A7258FaseDsc ,
                                           A602MaqCod ,
                                           AV62Maqcod ,
                                           A558HisProFec ,
                                           AV63HisProfec ,
                                           AV61Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
      lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
      lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
      lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
      lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P096L3 */
      pr_default.execute(1, new Object[] {AV61Emprcod, AV62Maqcod, AV63HisProfec, Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk96L3 = false ;
         A656ParCod = P096L3_A656ParCod[0] ;
         n656ParCod = P096L3_n656ParCod[0] ;
         A558HisProFec = P096L3_A558HisProFec[0] ;
         A602MaqCod = P096L3_A602MaqCod[0] ;
         A867ParCodNom = P096L3_A867ParCodNom[0] ;
         n867ParCodNom = P096L3_n867ParCodNom[0] ;
         A3610HisProLot = P096L3_A3610HisProLot[0] ;
         A4714HisProNpzs = P096L3_A4714HisProNpzs[0] ;
         A1526HisProMtr = P096L3_A1526HisProMtr[0] ;
         A1525HisProKgr = P096L3_A1525HisProKgr[0] ;
         A566HisProTur = P096L3_A566HisProTur[0] ;
         A557HisProF = P096L3_A557HisProF[0] ;
         A194BarOrdLin = P096L3_A194BarOrdLin[0] ;
         A503GruOpeCod = P096L3_A503GruOpeCod[0] ;
         A561HisProLin = P096L3_A561HisProLin[0] ;
         A130BarCodPar = P096L3_A130BarCodPar[0] ;
         A132BarCodReo = P096L3_A132BarCodReo[0] ;
         A129BarCod = P096L3_A129BarCod[0] ;
         A461Fase = P096L3_A461Fase[0] ;
         A396EmprCod = P096L3_A396EmprCod[0] ;
         A4440HisProDTI = P096L3_A4440HisProDTI[0] ;
         n4440HisProDTI = P096L3_n4440HisProDTI[0] ;
         A4441HisProDTF = P096L3_A4441HisProDTF[0] ;
         n4441HisProDTF = P096L3_n4441HisProDTF[0] ;
         A867ParCodNom = P096L3_A867ParCodNom[0] ;
         n867ParCodNom = P096L3_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         GXt_char2 = A7258FaseDsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         partesdeproduccionlector_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A7258FaseDsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV54count = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P096L3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P096L3_A461Fase[0], A461Fase) == 0 ) )
               {
                  brk96L3 = false ;
                  A558HisProFec = P096L3_A558HisProFec[0] ;
                  A602MaqCod = P096L3_A602MaqCod[0] ;
                  A561HisProLin = P096L3_A561HisProLin[0] ;
                  AV54count = (long)(AV54count+1) ;
                  brk96L3 = true ;
                  pr_default.readNext(1);
               }
               if ( ! (GXutil.strcmp("", A461Fase)==0) )
               {
                  AV46Option = A461Fase ;
                  AV47Options.add(AV46Option, 0);
                  AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV47Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk96L3 )
         {
            brk96L3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFASEDSCOPTIONS' Routine */
      returnInSub = false ;
      AV64TFFaseDsc = AV42SearchTxt ;
      AV65TFFaseDsc_Sel = "" ;
      AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV16TFHisProLin ;
      AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV17TFHisProLin_To ;
      AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV18TFBarNHdr ;
      AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV20TFGruOpeCod ;
      AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV21TFGruOpeCod_To ;
      AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV22TFBarOrdLin ;
      AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV23TFBarOrdLin_To ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV24TFFase ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV25TFFase_Sel ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV64TFFaseDsc ;
      AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV65TFFaseDsc_Sel ;
      AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV26TFHisProDTI ;
      AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV28TFHisProDTF ;
      AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV30TFHisProF ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV31TFHisProF_Sel ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV32TFHisProTur ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV33TFHisProTur_To ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV34TFHisProKgr ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV35TFHisProKgr_To ;
      AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV36TFHisProMtr ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV37TFHisProMtr_To ;
      AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV38TFHisProNpzs ;
      AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV39TFHisProNpzs_To ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV66TFHisProLot ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV67TFHisProLot_Sel ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV40TFParCodNom ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV41TFParCodNom_Sel ;
      AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV68TFHisProTr2 ;
      AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV69TFHisProTr2_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                           Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                           AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                           AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                           Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                           Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                           Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                           AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                           AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                           AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                           AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                           AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                           AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                           Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                           Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                           AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                           AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                           AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                           AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                           Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                           Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                           AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                           AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                           AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                           AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                           Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                           Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A3610HisProLot ,
                                           A867ParCodNom ,
                                           AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                           AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                           A7258FaseDsc ,
                                           AV61Emprcod ,
                                           AV62Maqcod ,
                                           AV63HisProfec ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A558HisProFec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
      lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
      lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
      lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
      lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P096L4 */
      pr_default.execute(2, new Object[] {AV61Emprcod, AV62Maqcod, AV63HisProfec, Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A656ParCod = P096L4_A656ParCod[0] ;
         n656ParCod = P096L4_n656ParCod[0] ;
         A558HisProFec = P096L4_A558HisProFec[0] ;
         A602MaqCod = P096L4_A602MaqCod[0] ;
         A867ParCodNom = P096L4_A867ParCodNom[0] ;
         n867ParCodNom = P096L4_n867ParCodNom[0] ;
         A3610HisProLot = P096L4_A3610HisProLot[0] ;
         A4714HisProNpzs = P096L4_A4714HisProNpzs[0] ;
         A1526HisProMtr = P096L4_A1526HisProMtr[0] ;
         A1525HisProKgr = P096L4_A1525HisProKgr[0] ;
         A566HisProTur = P096L4_A566HisProTur[0] ;
         A557HisProF = P096L4_A557HisProF[0] ;
         A194BarOrdLin = P096L4_A194BarOrdLin[0] ;
         A503GruOpeCod = P096L4_A503GruOpeCod[0] ;
         A561HisProLin = P096L4_A561HisProLin[0] ;
         A130BarCodPar = P096L4_A130BarCodPar[0] ;
         A132BarCodReo = P096L4_A132BarCodReo[0] ;
         A129BarCod = P096L4_A129BarCod[0] ;
         A461Fase = P096L4_A461Fase[0] ;
         A396EmprCod = P096L4_A396EmprCod[0] ;
         A4440HisProDTI = P096L4_A4440HisProDTI[0] ;
         n4440HisProDTI = P096L4_n4440HisProDTI[0] ;
         A4441HisProDTF = P096L4_A4441HisProDTF[0] ;
         n4441HisProDTF = P096L4_n4441HisProDTF[0] ;
         A867ParCodNom = P096L4_A867ParCodNom[0] ;
         n867ParCodNom = P096L4_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         GXt_char2 = A7258FaseDsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         partesdeproduccionlector_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A7258FaseDsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( ! (GXutil.strcmp("", A7258FaseDsc)==0) )
               {
                  AV46Option = A7258FaseDsc ;
                  AV45InsertIndex = 1 ;
                  while ( ( AV45InsertIndex <= AV47Options.size() ) && ( GXutil.strcmp((String)AV47Options.elementAt(-1+AV45InsertIndex), AV46Option) < 0 ) )
                  {
                     AV45InsertIndex = (int)(AV45InsertIndex+1) ;
                  }
                  if ( ( AV45InsertIndex <= AV47Options.size() ) && ( GXutil.strcmp((String)AV47Options.elementAt(-1+AV45InsertIndex), AV46Option) == 0 ) )
                  {
                     AV54count = GXutil.lval( (String)AV52OptionIndexes.elementAt(-1+AV45InsertIndex)) ;
                     AV54count = (long)(AV54count+1) ;
                     AV52OptionIndexes.removeItem(AV45InsertIndex);
                     AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), AV45InsertIndex);
                  }
                  else
                  {
                     AV47Options.add(AV46Option, AV45InsertIndex);
                     AV52OptionIndexes.add("1", AV45InsertIndex);
                  }
               }
               if ( AV47Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADHISPROFOPTIONS' Routine */
      returnInSub = false ;
      AV30TFHisProF = AV42SearchTxt ;
      AV31TFHisProF_Sel = "" ;
      AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV16TFHisProLin ;
      AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV17TFHisProLin_To ;
      AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV18TFBarNHdr ;
      AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV20TFGruOpeCod ;
      AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV21TFGruOpeCod_To ;
      AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV22TFBarOrdLin ;
      AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV23TFBarOrdLin_To ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV24TFFase ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV25TFFase_Sel ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV64TFFaseDsc ;
      AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV65TFFaseDsc_Sel ;
      AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV26TFHisProDTI ;
      AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV28TFHisProDTF ;
      AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV30TFHisProF ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV31TFHisProF_Sel ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV32TFHisProTur ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV33TFHisProTur_To ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV34TFHisProKgr ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV35TFHisProKgr_To ;
      AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV36TFHisProMtr ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV37TFHisProMtr_To ;
      AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV38TFHisProNpzs ;
      AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV39TFHisProNpzs_To ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV66TFHisProLot ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV67TFHisProLot_Sel ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV40TFParCodNom ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV41TFParCodNom_Sel ;
      AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV68TFHisProTr2 ;
      AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV69TFHisProTr2_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                           Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                           AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                           AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                           Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                           Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                           Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                           AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                           AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                           AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                           AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                           AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                           AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                           Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                           Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                           AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                           AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                           AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                           AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                           Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                           Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                           AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                           AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                           AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                           AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                           Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                           Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A3610HisProLot ,
                                           A867ParCodNom ,
                                           AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                           AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                           A7258FaseDsc ,
                                           A396EmprCod ,
                                           AV61Emprcod ,
                                           A602MaqCod ,
                                           AV62Maqcod ,
                                           A558HisProFec ,
                                           AV63HisProfec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
      lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
      lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
      lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
      lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P096L5 */
      pr_default.execute(3, new Object[] {AV61Emprcod, AV62Maqcod, AV63HisProfec, Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk96L6 = false ;
         A656ParCod = P096L5_A656ParCod[0] ;
         n656ParCod = P096L5_n656ParCod[0] ;
         A602MaqCod = P096L5_A602MaqCod[0] ;
         A558HisProFec = P096L5_A558HisProFec[0] ;
         A557HisProF = P096L5_A557HisProF[0] ;
         A867ParCodNom = P096L5_A867ParCodNom[0] ;
         n867ParCodNom = P096L5_n867ParCodNom[0] ;
         A3610HisProLot = P096L5_A3610HisProLot[0] ;
         A4714HisProNpzs = P096L5_A4714HisProNpzs[0] ;
         A1526HisProMtr = P096L5_A1526HisProMtr[0] ;
         A1525HisProKgr = P096L5_A1525HisProKgr[0] ;
         A566HisProTur = P096L5_A566HisProTur[0] ;
         A194BarOrdLin = P096L5_A194BarOrdLin[0] ;
         A503GruOpeCod = P096L5_A503GruOpeCod[0] ;
         A561HisProLin = P096L5_A561HisProLin[0] ;
         A130BarCodPar = P096L5_A130BarCodPar[0] ;
         A132BarCodReo = P096L5_A132BarCodReo[0] ;
         A129BarCod = P096L5_A129BarCod[0] ;
         A461Fase = P096L5_A461Fase[0] ;
         A396EmprCod = P096L5_A396EmprCod[0] ;
         A4440HisProDTI = P096L5_A4440HisProDTI[0] ;
         n4440HisProDTI = P096L5_n4440HisProDTI[0] ;
         A4441HisProDTF = P096L5_A4441HisProDTF[0] ;
         n4441HisProDTF = P096L5_n4441HisProDTF[0] ;
         A867ParCodNom = P096L5_A867ParCodNom[0] ;
         n867ParCodNom = P096L5_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         GXt_char2 = A7258FaseDsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         partesdeproduccionlector_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A7258FaseDsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV54count = 0 ;
               while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P096L5_A557HisProF[0], A557HisProF) == 0 ) )
               {
                  brk96L6 = false ;
                  A602MaqCod = P096L5_A602MaqCod[0] ;
                  A558HisProFec = P096L5_A558HisProFec[0] ;
                  A561HisProLin = P096L5_A561HisProLin[0] ;
                  A396EmprCod = P096L5_A396EmprCod[0] ;
                  AV54count = (long)(AV54count+1) ;
                  brk96L6 = true ;
                  pr_default.readNext(3);
               }
               if ( ! (GXutil.strcmp("", A557HisProF)==0) )
               {
                  AV46Option = A557HisProF ;
                  AV49OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A557HisProF, "@!"))) ;
                  AV47Options.add(AV46Option, 0);
                  AV50OptionsDesc.add(AV49OptionDesc, 0);
                  AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV47Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk96L6 )
         {
            brk96L6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADHISPROLOTOPTIONS' Routine */
      returnInSub = false ;
      AV66TFHisProLot = AV42SearchTxt ;
      AV67TFHisProLot_Sel = "" ;
      AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV16TFHisProLin ;
      AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV17TFHisProLin_To ;
      AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV18TFBarNHdr ;
      AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV20TFGruOpeCod ;
      AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV21TFGruOpeCod_To ;
      AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV22TFBarOrdLin ;
      AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV23TFBarOrdLin_To ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV24TFFase ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV25TFFase_Sel ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV64TFFaseDsc ;
      AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV65TFFaseDsc_Sel ;
      AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV26TFHisProDTI ;
      AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV28TFHisProDTF ;
      AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV30TFHisProF ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV31TFHisProF_Sel ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV32TFHisProTur ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV33TFHisProTur_To ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV34TFHisProKgr ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV35TFHisProKgr_To ;
      AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV36TFHisProMtr ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV37TFHisProMtr_To ;
      AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV38TFHisProNpzs ;
      AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV39TFHisProNpzs_To ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV66TFHisProLot ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV67TFHisProLot_Sel ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV40TFParCodNom ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV41TFParCodNom_Sel ;
      AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV68TFHisProTr2 ;
      AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV69TFHisProTr2_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                           Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                           AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                           AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                           Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                           Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                           Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                           AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                           AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                           AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                           AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                           AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                           AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                           Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                           Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                           AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                           AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                           AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                           AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                           Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                           Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                           AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                           AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                           AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                           AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                           Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                           Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A3610HisProLot ,
                                           A867ParCodNom ,
                                           AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                           AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                           A7258FaseDsc ,
                                           A396EmprCod ,
                                           AV61Emprcod ,
                                           A602MaqCod ,
                                           AV62Maqcod ,
                                           A558HisProFec ,
                                           AV63HisProfec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
      lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
      lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
      lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
      lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P096L6 */
      pr_default.execute(4, new Object[] {AV61Emprcod, AV62Maqcod, AV63HisProfec, Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk96L8 = false ;
         A656ParCod = P096L6_A656ParCod[0] ;
         n656ParCod = P096L6_n656ParCod[0] ;
         A602MaqCod = P096L6_A602MaqCod[0] ;
         A558HisProFec = P096L6_A558HisProFec[0] ;
         A3610HisProLot = P096L6_A3610HisProLot[0] ;
         A867ParCodNom = P096L6_A867ParCodNom[0] ;
         n867ParCodNom = P096L6_n867ParCodNom[0] ;
         A4714HisProNpzs = P096L6_A4714HisProNpzs[0] ;
         A1526HisProMtr = P096L6_A1526HisProMtr[0] ;
         A1525HisProKgr = P096L6_A1525HisProKgr[0] ;
         A566HisProTur = P096L6_A566HisProTur[0] ;
         A557HisProF = P096L6_A557HisProF[0] ;
         A194BarOrdLin = P096L6_A194BarOrdLin[0] ;
         A503GruOpeCod = P096L6_A503GruOpeCod[0] ;
         A561HisProLin = P096L6_A561HisProLin[0] ;
         A130BarCodPar = P096L6_A130BarCodPar[0] ;
         A132BarCodReo = P096L6_A132BarCodReo[0] ;
         A129BarCod = P096L6_A129BarCod[0] ;
         A461Fase = P096L6_A461Fase[0] ;
         A396EmprCod = P096L6_A396EmprCod[0] ;
         A4440HisProDTI = P096L6_A4440HisProDTI[0] ;
         n4440HisProDTI = P096L6_n4440HisProDTI[0] ;
         A4441HisProDTF = P096L6_A4441HisProDTF[0] ;
         n4441HisProDTF = P096L6_n4441HisProDTF[0] ;
         A867ParCodNom = P096L6_A867ParCodNom[0] ;
         n867ParCodNom = P096L6_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         GXt_char2 = A7258FaseDsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         partesdeproduccionlector_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A7258FaseDsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV54count = 0 ;
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P096L6_A3610HisProLot[0], A3610HisProLot) == 0 ) )
               {
                  brk96L8 = false ;
                  A602MaqCod = P096L6_A602MaqCod[0] ;
                  A558HisProFec = P096L6_A558HisProFec[0] ;
                  A561HisProLin = P096L6_A561HisProLin[0] ;
                  A396EmprCod = P096L6_A396EmprCod[0] ;
                  AV54count = (long)(AV54count+1) ;
                  brk96L8 = true ;
                  pr_default.readNext(4);
               }
               if ( ! (GXutil.strcmp("", A3610HisProLot)==0) )
               {
                  AV46Option = A3610HisProLot ;
                  AV47Options.add(AV46Option, 0);
                  AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV47Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk96L8 )
         {
            brk96L8 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPARCODNOMOPTIONS' Routine */
      returnInSub = false ;
      AV40TFParCodNom = AV42SearchTxt ;
      AV41TFParCodNom_Sel = "" ;
      AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV16TFHisProLin ;
      AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV17TFHisProLin_To ;
      AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV18TFBarNHdr ;
      AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV20TFGruOpeCod ;
      AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV21TFGruOpeCod_To ;
      AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV22TFBarOrdLin ;
      AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV23TFBarOrdLin_To ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV24TFFase ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV25TFFase_Sel ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV64TFFaseDsc ;
      AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV65TFFaseDsc_Sel ;
      AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV26TFHisProDTI ;
      AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV28TFHisProDTF ;
      AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV30TFHisProF ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV31TFHisProF_Sel ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV32TFHisProTur ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV33TFHisProTur_To ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV34TFHisProKgr ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV35TFHisProKgr_To ;
      AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV36TFHisProMtr ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV37TFHisProMtr_To ;
      AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV38TFHisProNpzs ;
      AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV39TFHisProNpzs_To ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV66TFHisProLot ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV67TFHisProLot_Sel ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV40TFParCodNom ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV41TFParCodNom_Sel ;
      AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV68TFHisProTr2 ;
      AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV69TFHisProTr2_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                           Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                           AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                           AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                           Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                           Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                           Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                           AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                           AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                           AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                           AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                           AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                           AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                           Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                           Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                           AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                           AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                           AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                           AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                           Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                           Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                           AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                           AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                           AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                           AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                           Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                           Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A3610HisProLot ,
                                           A867ParCodNom ,
                                           AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                           AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                           A7258FaseDsc ,
                                           A396EmprCod ,
                                           AV61Emprcod ,
                                           A602MaqCod ,
                                           AV62Maqcod ,
                                           A558HisProFec ,
                                           AV63HisProfec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
      lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
      lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
      lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
      lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P096L7 */
      pr_default.execute(5, new Object[] {AV61Emprcod, AV62Maqcod, AV63HisProfec, Integer.valueOf(AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk96L10 = false ;
         A656ParCod = P096L7_A656ParCod[0] ;
         n656ParCod = P096L7_n656ParCod[0] ;
         A602MaqCod = P096L7_A602MaqCod[0] ;
         A558HisProFec = P096L7_A558HisProFec[0] ;
         A867ParCodNom = P096L7_A867ParCodNom[0] ;
         n867ParCodNom = P096L7_n867ParCodNom[0] ;
         A3610HisProLot = P096L7_A3610HisProLot[0] ;
         A4714HisProNpzs = P096L7_A4714HisProNpzs[0] ;
         A1526HisProMtr = P096L7_A1526HisProMtr[0] ;
         A1525HisProKgr = P096L7_A1525HisProKgr[0] ;
         A566HisProTur = P096L7_A566HisProTur[0] ;
         A557HisProF = P096L7_A557HisProF[0] ;
         A194BarOrdLin = P096L7_A194BarOrdLin[0] ;
         A503GruOpeCod = P096L7_A503GruOpeCod[0] ;
         A561HisProLin = P096L7_A561HisProLin[0] ;
         A130BarCodPar = P096L7_A130BarCodPar[0] ;
         A132BarCodReo = P096L7_A132BarCodReo[0] ;
         A129BarCod = P096L7_A129BarCod[0] ;
         A461Fase = P096L7_A461Fase[0] ;
         A396EmprCod = P096L7_A396EmprCod[0] ;
         A4440HisProDTI = P096L7_A4440HisProDTI[0] ;
         n4440HisProDTI = P096L7_n4440HisProDTI[0] ;
         A4441HisProDTF = P096L7_A4441HisProDTF[0] ;
         n4441HisProDTF = P096L7_n4441HisProDTF[0] ;
         A867ParCodNom = P096L7_A867ParCodNom[0] ;
         n867ParCodNom = P096L7_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         GXt_char2 = A7258FaseDsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         partesdeproduccionlector_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A7258FaseDsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV54count = 0 ;
               while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P096L7_A867ParCodNom[0], A867ParCodNom) == 0 ) )
               {
                  brk96L10 = false ;
                  A656ParCod = P096L7_A656ParCod[0] ;
                  n656ParCod = P096L7_n656ParCod[0] ;
                  A602MaqCod = P096L7_A602MaqCod[0] ;
                  A558HisProFec = P096L7_A558HisProFec[0] ;
                  A561HisProLin = P096L7_A561HisProLin[0] ;
                  A396EmprCod = P096L7_A396EmprCod[0] ;
                  AV54count = (long)(AV54count+1) ;
                  brk96L10 = true ;
                  pr_default.readNext(5);
               }
               if ( ! (GXutil.strcmp("", A867ParCodNom)==0) )
               {
                  AV46Option = A867ParCodNom ;
                  AV47Options.add(AV46Option, 0);
                  AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV47Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk96L10 )
         {
            brk96L10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = partesdeproduccionlector_wcgetfilterdata.this.AV48OptionsJson;
      this.aP4[0] = partesdeproduccionlector_wcgetfilterdata.this.AV51OptionsDescJson;
      this.aP5[0] = partesdeproduccionlector_wcgetfilterdata.this.AV53OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48OptionsJson = "" ;
      AV51OptionsDescJson = "" ;
      AV53OptionIndexesJson = "" ;
      AV47Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV55Session = httpContext.getWebSession();
      AV57GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV58GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV18TFBarNHdr = "" ;
      AV19TFBarNHdr_Sel = "" ;
      AV24TFFase = "" ;
      AV25TFFase_Sel = "" ;
      AV64TFFaseDsc = "" ;
      AV65TFFaseDsc_Sel = "" ;
      AV26TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV28TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV30TFHisProF = "" ;
      AV31TFHisProF_Sel = "" ;
      AV34TFHisProKgr = DecimalUtil.ZERO ;
      AV35TFHisProKgr_To = DecimalUtil.ZERO ;
      AV36TFHisProMtr = DecimalUtil.ZERO ;
      AV37TFHisProMtr_To = DecimalUtil.ZERO ;
      AV66TFHisProLot = "" ;
      AV67TFHisProLot_Sel = "" ;
      AV40TFParCodNom = "" ;
      AV41TFParCodNom_Sel = "" ;
      AV61Emprcod = "" ;
      AV62Maqcod = "" ;
      AV63HisProfec = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = "" ;
      AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = "" ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = "" ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = "" ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = "" ;
      AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = "" ;
      AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = "" ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = "" ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = "" ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = "" ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = "" ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = "" ;
      lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase = "" ;
      lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = "" ;
      lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = "" ;
      lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = "" ;
      A130BarCodPar = "" ;
      A461Fase = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A3610HisProLot = "" ;
      A867ParCodNom = "" ;
      A7258FaseDsc = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      P096L2_A656ParCod = new short[1] ;
      P096L2_n656ParCod = new boolean[] {false} ;
      P096L2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P096L2_A602MaqCod = new String[] {""} ;
      P096L2_A867ParCodNom = new String[] {""} ;
      P096L2_n867ParCodNom = new boolean[] {false} ;
      P096L2_A3610HisProLot = new String[] {""} ;
      P096L2_A4714HisProNpzs = new short[1] ;
      P096L2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L2_A566HisProTur = new byte[1] ;
      P096L2_A557HisProF = new String[] {""} ;
      P096L2_A194BarOrdLin = new short[1] ;
      P096L2_A503GruOpeCod = new int[1] ;
      P096L2_A561HisProLin = new int[1] ;
      P096L2_A130BarCodPar = new String[] {""} ;
      P096L2_A132BarCodReo = new byte[1] ;
      P096L2_A129BarCod = new int[1] ;
      P096L2_A461Fase = new String[] {""} ;
      P096L2_A396EmprCod = new String[] {""} ;
      P096L2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P096L2_n4440HisProDTI = new boolean[] {false} ;
      P096L2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P096L2_n4441HisProDTF = new boolean[] {false} ;
      AV46Option = "" ;
      P096L3_A656ParCod = new short[1] ;
      P096L3_n656ParCod = new boolean[] {false} ;
      P096L3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P096L3_A602MaqCod = new String[] {""} ;
      P096L3_A867ParCodNom = new String[] {""} ;
      P096L3_n867ParCodNom = new boolean[] {false} ;
      P096L3_A3610HisProLot = new String[] {""} ;
      P096L3_A4714HisProNpzs = new short[1] ;
      P096L3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L3_A566HisProTur = new byte[1] ;
      P096L3_A557HisProF = new String[] {""} ;
      P096L3_A194BarOrdLin = new short[1] ;
      P096L3_A503GruOpeCod = new int[1] ;
      P096L3_A561HisProLin = new int[1] ;
      P096L3_A130BarCodPar = new String[] {""} ;
      P096L3_A132BarCodReo = new byte[1] ;
      P096L3_A129BarCod = new int[1] ;
      P096L3_A461Fase = new String[] {""} ;
      P096L3_A396EmprCod = new String[] {""} ;
      P096L3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P096L3_n4440HisProDTI = new boolean[] {false} ;
      P096L3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P096L3_n4441HisProDTF = new boolean[] {false} ;
      P096L4_A656ParCod = new short[1] ;
      P096L4_n656ParCod = new boolean[] {false} ;
      P096L4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P096L4_A602MaqCod = new String[] {""} ;
      P096L4_A867ParCodNom = new String[] {""} ;
      P096L4_n867ParCodNom = new boolean[] {false} ;
      P096L4_A3610HisProLot = new String[] {""} ;
      P096L4_A4714HisProNpzs = new short[1] ;
      P096L4_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L4_A566HisProTur = new byte[1] ;
      P096L4_A557HisProF = new String[] {""} ;
      P096L4_A194BarOrdLin = new short[1] ;
      P096L4_A503GruOpeCod = new int[1] ;
      P096L4_A561HisProLin = new int[1] ;
      P096L4_A130BarCodPar = new String[] {""} ;
      P096L4_A132BarCodReo = new byte[1] ;
      P096L4_A129BarCod = new int[1] ;
      P096L4_A461Fase = new String[] {""} ;
      P096L4_A396EmprCod = new String[] {""} ;
      P096L4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P096L4_n4440HisProDTI = new boolean[] {false} ;
      P096L4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P096L4_n4441HisProDTF = new boolean[] {false} ;
      P096L5_A656ParCod = new short[1] ;
      P096L5_n656ParCod = new boolean[] {false} ;
      P096L5_A602MaqCod = new String[] {""} ;
      P096L5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P096L5_A557HisProF = new String[] {""} ;
      P096L5_A867ParCodNom = new String[] {""} ;
      P096L5_n867ParCodNom = new boolean[] {false} ;
      P096L5_A3610HisProLot = new String[] {""} ;
      P096L5_A4714HisProNpzs = new short[1] ;
      P096L5_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L5_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L5_A566HisProTur = new byte[1] ;
      P096L5_A194BarOrdLin = new short[1] ;
      P096L5_A503GruOpeCod = new int[1] ;
      P096L5_A561HisProLin = new int[1] ;
      P096L5_A130BarCodPar = new String[] {""} ;
      P096L5_A132BarCodReo = new byte[1] ;
      P096L5_A129BarCod = new int[1] ;
      P096L5_A461Fase = new String[] {""} ;
      P096L5_A396EmprCod = new String[] {""} ;
      P096L5_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P096L5_n4440HisProDTI = new boolean[] {false} ;
      P096L5_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P096L5_n4441HisProDTF = new boolean[] {false} ;
      AV49OptionDesc = "" ;
      P096L6_A656ParCod = new short[1] ;
      P096L6_n656ParCod = new boolean[] {false} ;
      P096L6_A602MaqCod = new String[] {""} ;
      P096L6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P096L6_A3610HisProLot = new String[] {""} ;
      P096L6_A867ParCodNom = new String[] {""} ;
      P096L6_n867ParCodNom = new boolean[] {false} ;
      P096L6_A4714HisProNpzs = new short[1] ;
      P096L6_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L6_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L6_A566HisProTur = new byte[1] ;
      P096L6_A557HisProF = new String[] {""} ;
      P096L6_A194BarOrdLin = new short[1] ;
      P096L6_A503GruOpeCod = new int[1] ;
      P096L6_A561HisProLin = new int[1] ;
      P096L6_A130BarCodPar = new String[] {""} ;
      P096L6_A132BarCodReo = new byte[1] ;
      P096L6_A129BarCod = new int[1] ;
      P096L6_A461Fase = new String[] {""} ;
      P096L6_A396EmprCod = new String[] {""} ;
      P096L6_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P096L6_n4440HisProDTI = new boolean[] {false} ;
      P096L6_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P096L6_n4441HisProDTF = new boolean[] {false} ;
      P096L7_A656ParCod = new short[1] ;
      P096L7_n656ParCod = new boolean[] {false} ;
      P096L7_A602MaqCod = new String[] {""} ;
      P096L7_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P096L7_A867ParCodNom = new String[] {""} ;
      P096L7_n867ParCodNom = new boolean[] {false} ;
      P096L7_A3610HisProLot = new String[] {""} ;
      P096L7_A4714HisProNpzs = new short[1] ;
      P096L7_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L7_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096L7_A566HisProTur = new byte[1] ;
      P096L7_A557HisProF = new String[] {""} ;
      P096L7_A194BarOrdLin = new short[1] ;
      P096L7_A503GruOpeCod = new int[1] ;
      P096L7_A561HisProLin = new int[1] ;
      P096L7_A130BarCodPar = new String[] {""} ;
      P096L7_A132BarCodReo = new byte[1] ;
      P096L7_A129BarCod = new int[1] ;
      P096L7_A461Fase = new String[] {""} ;
      P096L7_A396EmprCod = new String[] {""} ;
      P096L7_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P096L7_n4440HisProDTI = new boolean[] {false} ;
      P096L7_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P096L7_n4441HisProDTF = new boolean[] {false} ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.partesdeproduccionlector_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P096L2_A656ParCod, P096L2_n656ParCod, P096L2_A558HisProFec, P096L2_A602MaqCod, P096L2_A867ParCodNom, P096L2_n867ParCodNom, P096L2_A3610HisProLot, P096L2_A4714HisProNpzs, P096L2_A1526HisProMtr, P096L2_A1525HisProKgr,
            P096L2_A566HisProTur, P096L2_A557HisProF, P096L2_A194BarOrdLin, P096L2_A503GruOpeCod, P096L2_A561HisProLin, P096L2_A130BarCodPar, P096L2_A132BarCodReo, P096L2_A129BarCod, P096L2_A461Fase, P096L2_A396EmprCod,
            P096L2_A4440HisProDTI, P096L2_n4440HisProDTI, P096L2_A4441HisProDTF, P096L2_n4441HisProDTF
            }
            , new Object[] {
            P096L3_A656ParCod, P096L3_n656ParCod, P096L3_A558HisProFec, P096L3_A602MaqCod, P096L3_A867ParCodNom, P096L3_n867ParCodNom, P096L3_A3610HisProLot, P096L3_A4714HisProNpzs, P096L3_A1526HisProMtr, P096L3_A1525HisProKgr,
            P096L3_A566HisProTur, P096L3_A557HisProF, P096L3_A194BarOrdLin, P096L3_A503GruOpeCod, P096L3_A561HisProLin, P096L3_A130BarCodPar, P096L3_A132BarCodReo, P096L3_A129BarCod, P096L3_A461Fase, P096L3_A396EmprCod,
            P096L3_A4440HisProDTI, P096L3_n4440HisProDTI, P096L3_A4441HisProDTF, P096L3_n4441HisProDTF
            }
            , new Object[] {
            P096L4_A656ParCod, P096L4_n656ParCod, P096L4_A558HisProFec, P096L4_A602MaqCod, P096L4_A867ParCodNom, P096L4_n867ParCodNom, P096L4_A3610HisProLot, P096L4_A4714HisProNpzs, P096L4_A1526HisProMtr, P096L4_A1525HisProKgr,
            P096L4_A566HisProTur, P096L4_A557HisProF, P096L4_A194BarOrdLin, P096L4_A503GruOpeCod, P096L4_A561HisProLin, P096L4_A130BarCodPar, P096L4_A132BarCodReo, P096L4_A129BarCod, P096L4_A461Fase, P096L4_A396EmprCod,
            P096L4_A4440HisProDTI, P096L4_n4440HisProDTI, P096L4_A4441HisProDTF, P096L4_n4441HisProDTF
            }
            , new Object[] {
            P096L5_A656ParCod, P096L5_n656ParCod, P096L5_A602MaqCod, P096L5_A558HisProFec, P096L5_A557HisProF, P096L5_A867ParCodNom, P096L5_n867ParCodNom, P096L5_A3610HisProLot, P096L5_A4714HisProNpzs, P096L5_A1526HisProMtr,
            P096L5_A1525HisProKgr, P096L5_A566HisProTur, P096L5_A194BarOrdLin, P096L5_A503GruOpeCod, P096L5_A561HisProLin, P096L5_A130BarCodPar, P096L5_A132BarCodReo, P096L5_A129BarCod, P096L5_A461Fase, P096L5_A396EmprCod,
            P096L5_A4440HisProDTI, P096L5_n4440HisProDTI, P096L5_A4441HisProDTF, P096L5_n4441HisProDTF
            }
            , new Object[] {
            P096L6_A656ParCod, P096L6_n656ParCod, P096L6_A602MaqCod, P096L6_A558HisProFec, P096L6_A3610HisProLot, P096L6_A867ParCodNom, P096L6_n867ParCodNom, P096L6_A4714HisProNpzs, P096L6_A1526HisProMtr, P096L6_A1525HisProKgr,
            P096L6_A566HisProTur, P096L6_A557HisProF, P096L6_A194BarOrdLin, P096L6_A503GruOpeCod, P096L6_A561HisProLin, P096L6_A130BarCodPar, P096L6_A132BarCodReo, P096L6_A129BarCod, P096L6_A461Fase, P096L6_A396EmprCod,
            P096L6_A4440HisProDTI, P096L6_n4440HisProDTI, P096L6_A4441HisProDTF, P096L6_n4441HisProDTF
            }
            , new Object[] {
            P096L7_A656ParCod, P096L7_n656ParCod, P096L7_A602MaqCod, P096L7_A558HisProFec, P096L7_A867ParCodNom, P096L7_n867ParCodNom, P096L7_A3610HisProLot, P096L7_A4714HisProNpzs, P096L7_A1526HisProMtr, P096L7_A1525HisProKgr,
            P096L7_A566HisProTur, P096L7_A557HisProF, P096L7_A194BarOrdLin, P096L7_A503GruOpeCod, P096L7_A561HisProLin, P096L7_A130BarCodPar, P096L7_A132BarCodReo, P096L7_A129BarCod, P096L7_A461Fase, P096L7_A396EmprCod,
            P096L7_A4440HisProDTI, P096L7_n4440HisProDTI, P096L7_A4441HisProDTF, P096L7_n4441HisProDTF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32TFHisProTur ;
   private byte AV33TFHisProTur_To ;
   private byte AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ;
   private byte AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private short AV22TFBarOrdLin ;
   private short AV23TFBarOrdLin_To ;
   private short AV38TFHisProNpzs ;
   private short AV39TFHisProNpzs_To ;
   private short AV68TFHisProTr2 ;
   private short AV69TFHisProTr2_To ;
   private short AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ;
   private short AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ;
   private short AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ;
   private short AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ;
   private short AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ;
   private short AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short Gx_err ;
   private int AV72GXV1 ;
   private int AV16TFHisProLin ;
   private int AV17TFHisProLin_To ;
   private int AV20TFGruOpeCod ;
   private int AV21TFGruOpeCod_To ;
   private int AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ;
   private int AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ;
   private int AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ;
   private int AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int AV45InsertIndex ;
   private long AV54count ;
   private java.math.BigDecimal AV34TFHisProKgr ;
   private java.math.BigDecimal AV35TFHisProKgr_To ;
   private java.math.BigDecimal AV36TFHisProMtr ;
   private java.math.BigDecimal AV37TFHisProMtr_To ;
   private java.math.BigDecimal AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ;
   private java.math.BigDecimal AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ;
   private java.math.BigDecimal AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV18TFBarNHdr ;
   private String AV19TFBarNHdr_Sel ;
   private String AV24TFFase ;
   private String AV25TFFase_Sel ;
   private String AV64TFFaseDsc ;
   private String AV65TFFaseDsc_Sel ;
   private String AV30TFHisProF ;
   private String AV31TFHisProF_Sel ;
   private String AV66TFHisProLot ;
   private String AV67TFHisProLot_Sel ;
   private String AV40TFParCodNom ;
   private String AV41TFParCodNom_Sel ;
   private String AV61Emprcod ;
   private String AV62Maqcod ;
   private String A13696BarNHdr ;
   private String AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ;
   private String AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ;
   private String AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ;
   private String AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ;
   private String AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ;
   private String AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ;
   private String AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ;
   private String AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ;
   private String AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ;
   private String AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ;
   private String AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ;
   private String AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ;
   private String lV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ;
   private String lV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ;
   private String lV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ;
   private String lV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ;
   private String A130BarCodPar ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A3610HisProLot ;
   private String A867ParCodNom ;
   private String A7258FaseDsc ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV26TFHisProDTI ;
   private java.util.Date AV28TFHisProDTF ;
   private java.util.Date AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ;
   private java.util.Date AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV63HisProfec ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean brk96L3 ;
   private boolean brk96L6 ;
   private boolean brk96L8 ;
   private boolean brk96L10 ;
   private String AV48OptionsJson ;
   private String AV51OptionsDescJson ;
   private String AV53OptionIndexesJson ;
   private String AV44DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV46Option ;
   private String AV49OptionDesc ;
   private com.genexus.webpanels.WebSession AV55Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P096L2_A656ParCod ;
   private boolean[] P096L2_n656ParCod ;
   private java.util.Date[] P096L2_A558HisProFec ;
   private String[] P096L2_A602MaqCod ;
   private String[] P096L2_A867ParCodNom ;
   private boolean[] P096L2_n867ParCodNom ;
   private String[] P096L2_A3610HisProLot ;
   private short[] P096L2_A4714HisProNpzs ;
   private java.math.BigDecimal[] P096L2_A1526HisProMtr ;
   private java.math.BigDecimal[] P096L2_A1525HisProKgr ;
   private byte[] P096L2_A566HisProTur ;
   private String[] P096L2_A557HisProF ;
   private short[] P096L2_A194BarOrdLin ;
   private int[] P096L2_A503GruOpeCod ;
   private int[] P096L2_A561HisProLin ;
   private String[] P096L2_A130BarCodPar ;
   private byte[] P096L2_A132BarCodReo ;
   private int[] P096L2_A129BarCod ;
   private String[] P096L2_A461Fase ;
   private String[] P096L2_A396EmprCod ;
   private java.util.Date[] P096L2_A4440HisProDTI ;
   private boolean[] P096L2_n4440HisProDTI ;
   private java.util.Date[] P096L2_A4441HisProDTF ;
   private boolean[] P096L2_n4441HisProDTF ;
   private short[] P096L3_A656ParCod ;
   private boolean[] P096L3_n656ParCod ;
   private java.util.Date[] P096L3_A558HisProFec ;
   private String[] P096L3_A602MaqCod ;
   private String[] P096L3_A867ParCodNom ;
   private boolean[] P096L3_n867ParCodNom ;
   private String[] P096L3_A3610HisProLot ;
   private short[] P096L3_A4714HisProNpzs ;
   private java.math.BigDecimal[] P096L3_A1526HisProMtr ;
   private java.math.BigDecimal[] P096L3_A1525HisProKgr ;
   private byte[] P096L3_A566HisProTur ;
   private String[] P096L3_A557HisProF ;
   private short[] P096L3_A194BarOrdLin ;
   private int[] P096L3_A503GruOpeCod ;
   private int[] P096L3_A561HisProLin ;
   private String[] P096L3_A130BarCodPar ;
   private byte[] P096L3_A132BarCodReo ;
   private int[] P096L3_A129BarCod ;
   private String[] P096L3_A461Fase ;
   private String[] P096L3_A396EmprCod ;
   private java.util.Date[] P096L3_A4440HisProDTI ;
   private boolean[] P096L3_n4440HisProDTI ;
   private java.util.Date[] P096L3_A4441HisProDTF ;
   private boolean[] P096L3_n4441HisProDTF ;
   private short[] P096L4_A656ParCod ;
   private boolean[] P096L4_n656ParCod ;
   private java.util.Date[] P096L4_A558HisProFec ;
   private String[] P096L4_A602MaqCod ;
   private String[] P096L4_A867ParCodNom ;
   private boolean[] P096L4_n867ParCodNom ;
   private String[] P096L4_A3610HisProLot ;
   private short[] P096L4_A4714HisProNpzs ;
   private java.math.BigDecimal[] P096L4_A1526HisProMtr ;
   private java.math.BigDecimal[] P096L4_A1525HisProKgr ;
   private byte[] P096L4_A566HisProTur ;
   private String[] P096L4_A557HisProF ;
   private short[] P096L4_A194BarOrdLin ;
   private int[] P096L4_A503GruOpeCod ;
   private int[] P096L4_A561HisProLin ;
   private String[] P096L4_A130BarCodPar ;
   private byte[] P096L4_A132BarCodReo ;
   private int[] P096L4_A129BarCod ;
   private String[] P096L4_A461Fase ;
   private String[] P096L4_A396EmprCod ;
   private java.util.Date[] P096L4_A4440HisProDTI ;
   private boolean[] P096L4_n4440HisProDTI ;
   private java.util.Date[] P096L4_A4441HisProDTF ;
   private boolean[] P096L4_n4441HisProDTF ;
   private short[] P096L5_A656ParCod ;
   private boolean[] P096L5_n656ParCod ;
   private String[] P096L5_A602MaqCod ;
   private java.util.Date[] P096L5_A558HisProFec ;
   private String[] P096L5_A557HisProF ;
   private String[] P096L5_A867ParCodNom ;
   private boolean[] P096L5_n867ParCodNom ;
   private String[] P096L5_A3610HisProLot ;
   private short[] P096L5_A4714HisProNpzs ;
   private java.math.BigDecimal[] P096L5_A1526HisProMtr ;
   private java.math.BigDecimal[] P096L5_A1525HisProKgr ;
   private byte[] P096L5_A566HisProTur ;
   private short[] P096L5_A194BarOrdLin ;
   private int[] P096L5_A503GruOpeCod ;
   private int[] P096L5_A561HisProLin ;
   private String[] P096L5_A130BarCodPar ;
   private byte[] P096L5_A132BarCodReo ;
   private int[] P096L5_A129BarCod ;
   private String[] P096L5_A461Fase ;
   private String[] P096L5_A396EmprCod ;
   private java.util.Date[] P096L5_A4440HisProDTI ;
   private boolean[] P096L5_n4440HisProDTI ;
   private java.util.Date[] P096L5_A4441HisProDTF ;
   private boolean[] P096L5_n4441HisProDTF ;
   private short[] P096L6_A656ParCod ;
   private boolean[] P096L6_n656ParCod ;
   private String[] P096L6_A602MaqCod ;
   private java.util.Date[] P096L6_A558HisProFec ;
   private String[] P096L6_A3610HisProLot ;
   private String[] P096L6_A867ParCodNom ;
   private boolean[] P096L6_n867ParCodNom ;
   private short[] P096L6_A4714HisProNpzs ;
   private java.math.BigDecimal[] P096L6_A1526HisProMtr ;
   private java.math.BigDecimal[] P096L6_A1525HisProKgr ;
   private byte[] P096L6_A566HisProTur ;
   private String[] P096L6_A557HisProF ;
   private short[] P096L6_A194BarOrdLin ;
   private int[] P096L6_A503GruOpeCod ;
   private int[] P096L6_A561HisProLin ;
   private String[] P096L6_A130BarCodPar ;
   private byte[] P096L6_A132BarCodReo ;
   private int[] P096L6_A129BarCod ;
   private String[] P096L6_A461Fase ;
   private String[] P096L6_A396EmprCod ;
   private java.util.Date[] P096L6_A4440HisProDTI ;
   private boolean[] P096L6_n4440HisProDTI ;
   private java.util.Date[] P096L6_A4441HisProDTF ;
   private boolean[] P096L6_n4441HisProDTF ;
   private short[] P096L7_A656ParCod ;
   private boolean[] P096L7_n656ParCod ;
   private String[] P096L7_A602MaqCod ;
   private java.util.Date[] P096L7_A558HisProFec ;
   private String[] P096L7_A867ParCodNom ;
   private boolean[] P096L7_n867ParCodNom ;
   private String[] P096L7_A3610HisProLot ;
   private short[] P096L7_A4714HisProNpzs ;
   private java.math.BigDecimal[] P096L7_A1526HisProMtr ;
   private java.math.BigDecimal[] P096L7_A1525HisProKgr ;
   private byte[] P096L7_A566HisProTur ;
   private String[] P096L7_A557HisProF ;
   private short[] P096L7_A194BarOrdLin ;
   private int[] P096L7_A503GruOpeCod ;
   private int[] P096L7_A561HisProLin ;
   private String[] P096L7_A130BarCodPar ;
   private byte[] P096L7_A132BarCodReo ;
   private int[] P096L7_A129BarCod ;
   private String[] P096L7_A461Fase ;
   private String[] P096L7_A396EmprCod ;
   private java.util.Date[] P096L7_A4440HisProDTI ;
   private boolean[] P096L7_n4440HisProDTI ;
   private java.util.Date[] P096L7_A4441HisProDTF ;
   private boolean[] P096L7_n4441HisProDTF ;
   private GXSimpleCollection<String> AV47Options ;
   private GXSimpleCollection<String> AV50OptionsDesc ;
   private GXSimpleCollection<String> AV52OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV57GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV58GridStateFilterValue ;
}

final  class partesdeproduccionlector_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P096L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          String AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String AV61Emprcod ,
                                          String AV62Maqcod ,
                                          java.util.Date AV63HisProfec ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[31];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T1.HisProFec, T1.MaqCod, T2.ParCodNom, T1.HisProLot, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.BarOrdLin, T1.GruOpeCod," ;
      scmdbuf += " T1.HisProLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( ! (0==AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P096L3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          String AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String A602MaqCod ,
                                          String AV62Maqcod ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date AV63HisProfec ,
                                          String AV61Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[31];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T1.HisProFec, T1.MaqCod, T2.ParCodNom, T1.HisProLot, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.BarOrdLin, T1.GruOpeCod," ;
      scmdbuf += " T1.HisProLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MaqCod = ?)");
      addWhere(sWhereString, "(T1.HisProFec = ?)");
      if ( ! (0==AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Fase, T1.MaqCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P096L4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          String AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String AV61Emprcod ,
                                          String AV62Maqcod ,
                                          java.util.Date AV63HisProfec ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[31];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T1.HisProFec, T1.MaqCod, T2.ParCodNom, T1.HisProLot, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.BarOrdLin, T1.GruOpeCod," ;
      scmdbuf += " T1.HisProLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( ! (0==AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P096L5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          String AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String A396EmprCod ,
                                          String AV61Emprcod ,
                                          String A602MaqCod ,
                                          String AV62Maqcod ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date AV63HisProfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[31];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T1.MaqCod, T1.HisProFec, T1.HisProF, T2.ParCodNom, T1.HisProLot, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.BarOrdLin, T1.GruOpeCod," ;
      scmdbuf += " T1.HisProLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MaqCod = ?)");
      addWhere(sWhereString, "(T1.HisProFec = ?)");
      if ( ! (0==AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (0==AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HisProF" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P096L6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          String AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String A396EmprCod ,
                                          String AV61Emprcod ,
                                          String A602MaqCod ,
                                          String AV62Maqcod ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date AV63HisProfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[31];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T1.MaqCod, T1.HisProFec, T1.HisProLot, T2.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.BarOrdLin, T1.GruOpeCod," ;
      scmdbuf += " T1.HisProLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MaqCod = ?)");
      addWhere(sWhereString, "(T1.HisProFec = ?)");
      if ( ! (0==AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (0==AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (0==AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (0==AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HisProLot" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P096L7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          String AV85Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV84Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String A396EmprCod ,
                                          String AV61Emprcod ,
                                          String A602MaqCod ,
                                          String AV62Maqcod ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date AV63HisProfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[31];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T1.MaqCod, T1.HisProFec, T2.ParCodNom, T1.HisProLot, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.BarOrdLin, T1.GruOpeCod," ;
      scmdbuf += " T1.HisProLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MaqCod = ?)");
      addWhere(sWhereString, "(T1.HisProFec = ?)");
      if ( ! (0==AV74Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV76Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV79Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV80Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV81Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV82Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV86Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV88Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV90Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV91Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV98Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV102Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV103Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.ParCodNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P096L2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] );
            case 1 :
                  return conditional_P096L3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 2 :
                  return conditional_P096L4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] );
            case 3 :
                  return conditional_P096L5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (java.util.Date)dynConstraints[52] );
            case 4 :
                  return conditional_P096L6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (java.util.Date)dynConstraints[52] );
            case 5 :
                  return conditional_P096L7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (java.util.Date)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P096L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096L3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096L4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096L5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096L6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096L7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
      }
   }

}

