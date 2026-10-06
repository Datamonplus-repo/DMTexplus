package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcpartesproduccionmaquinagetfilterdata extends GXProcedure
{
   public wcpartesproduccionmaquinagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcpartesproduccionmaquinagetfilterdata.class ), "" );
   }

   public wcpartesproduccionmaquinagetfilterdata( int remoteHandle ,
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
      wcpartesproduccionmaquinagetfilterdata.this.aP5 = new String[] {""};
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
      wcpartesproduccionmaquinagetfilterdata.this.AV44DDOName = aP0;
      wcpartesproduccionmaquinagetfilterdata.this.AV42SearchTxt = aP1;
      wcpartesproduccionmaquinagetfilterdata.this.AV43SearchTxtTo = aP2;
      wcpartesproduccionmaquinagetfilterdata.this.aP3 = aP3;
      wcpartesproduccionmaquinagetfilterdata.this.aP4 = aP4;
      wcpartesproduccionmaquinagetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S161 ();
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
         S171 ();
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
         S181 ();
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
      if ( GXutil.strcmp(AV55Session.getValue("WCPartesProduccionMaquinaGridState"), "") == 0 )
      {
         AV57GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCPartesProduccionMaquinaGridState"), null, null);
      }
      else
      {
         AV57GridState.fromxml(AV55Session.getValue("WCPartesProduccionMaquinaGridState"), null, null);
      }
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV58GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV69FilterFullText = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "HISPROFEC") == 0 )
         {
            AV62HisProFec = localUtil.ctod( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV63HisProFec_To = localUtil.ctod( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV12TFHisProFec = localUtil.ctod( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV14TFGruOpeCod = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFGruOpeCod_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV67TFBarNHdr = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV68TFBarNHdr_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV20TFCliNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV21TFCliNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV22TFBarSer = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV23TFBarSer_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV24TFBarSerDsc = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV25TFBarSerDsc_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV26TFBarColNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV27TFBarColNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV28TFFase = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV29TFFase_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV30TFFaseDsc = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV31TFFaseDsc_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV32TFHisProKgr = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFHisProKgr_To = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV34TFHisProMtr = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFHisProMtr_To = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV36TFHisProTur = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFHisProTur_To = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV38TFHisProDTI = localUtil.ctot( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV40TFHisProDTF = localUtil.ctot( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTR2") == 0 )
         {
            AV65TFHisProTr2 = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFHisProTr2_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV64Emprcod = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV60MaqCod = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQDSC") == 0 )
         {
            AV61MaqDsc = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV67TFBarNHdr = AV42SearchTxt ;
      AV68TFBarNHdr_Sel = "" ;
      AV74Wcpartesproduccionmaquinads_1_emprcod = AV64Emprcod ;
      AV75Wcpartesproduccionmaquinads_2_maqcod = AV60MaqCod ;
      AV76Wcpartesproduccionmaquinads_3_maqdsc = AV61MaqDsc ;
      AV77Wcpartesproduccionmaquinads_4_filterfulltext = AV69FilterFullText ;
      AV78Wcpartesproduccionmaquinads_5_hisprofec = AV62HisProFec ;
      AV79Wcpartesproduccionmaquinads_6_hisprofec_to = AV63HisProFec_To ;
      AV80Wcpartesproduccionmaquinads_7_tfhisprofec = AV12TFHisProFec ;
      AV81Wcpartesproduccionmaquinads_8_tfgruopecod = AV14TFGruOpeCod ;
      AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV15TFGruOpeCod_To ;
      AV83Wcpartesproduccionmaquinads_10_tfbarnhdr = AV67TFBarNHdr ;
      AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV68TFBarNHdr_Sel ;
      AV85Wcpartesproduccionmaquinads_12_tfclicod = AV18TFCliCod ;
      AV86Wcpartesproduccionmaquinads_13_tfclicod_to = AV19TFCliCod_To ;
      AV87Wcpartesproduccionmaquinads_14_tfclinom = AV20TFCliNom ;
      AV88Wcpartesproduccionmaquinads_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV89Wcpartesproduccionmaquinads_16_tfbarser = AV22TFBarSer ;
      AV90Wcpartesproduccionmaquinads_17_tfbarser_sel = AV23TFBarSer_Sel ;
      AV91Wcpartesproduccionmaquinads_18_tfbarserdsc = AV24TFBarSerDsc ;
      AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV93Wcpartesproduccionmaquinads_20_tfbarcolnom = AV26TFBarColNom ;
      AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV95Wcpartesproduccionmaquinads_22_tffase = AV28TFFase ;
      AV96Wcpartesproduccionmaquinads_23_tffase_sel = AV29TFFase_Sel ;
      AV97Wcpartesproduccionmaquinads_24_tffasedsc = AV30TFFaseDsc ;
      AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV31TFFaseDsc_Sel ;
      AV99Wcpartesproduccionmaquinads_26_tfhisprokgr = AV32TFHisProKgr ;
      AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV33TFHisProKgr_To ;
      AV101Wcpartesproduccionmaquinads_28_tfhispromtr = AV34TFHisProMtr ;
      AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV35TFHisProMtr_To ;
      AV103Wcpartesproduccionmaquinads_30_tfhisprotur = AV36TFHisProTur ;
      AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV37TFHisProTur_To ;
      AV105Wcpartesproduccionmaquinads_32_tfhisprodti = AV38TFHisProDTI ;
      AV106Wcpartesproduccionmaquinads_33_tfhisprodtf = AV40TFHisProDTF ;
      AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV65TFHisProTr2 ;
      AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV66TFHisProTr2_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV81Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV85Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV86Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV95Wcpartesproduccionmaquinads_22_tffase ,
                                           AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV103Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV107Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           A606MaqDsc ,
                                           AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                           AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                           A396EmprCod ,
                                           A602MaqCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV97Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor P08DJ2 */
      pr_default.execute(0, new Object[] {AV74Wcpartesproduccionmaquinads_1_emprcod, AV75Wcpartesproduccionmaquinads_2_maqcod, AV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV77Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV77Wcpartesproduccionmaquinads_4_filterfulltext, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV97Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV97Wcpartesproduccionmaquinads_24_tffasedsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV76Wcpartesproduccionmaquinads_3_maqdsc, AV78Wcpartesproduccionmaquinads_5_hisprofec, AV79Wcpartesproduccionmaquinads_6_hisprofec_to, AV80Wcpartesproduccionmaquinads_7_tfhisprofec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A558HisProFec = P08DJ2_A558HisProFec[0] ;
         A606MaqDsc = P08DJ2_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ2_n606MaqDsc[0] ;
         A602MaqCod = P08DJ2_A602MaqCod[0] ;
         A396EmprCod = P08DJ2_A396EmprCod[0] ;
         A606MaqDsc = P08DJ2_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ2_n606MaqDsc[0] ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCliNom = AV42SearchTxt ;
      AV21TFCliNom_Sel = "" ;
      AV74Wcpartesproduccionmaquinads_1_emprcod = AV64Emprcod ;
      AV75Wcpartesproduccionmaquinads_2_maqcod = AV60MaqCod ;
      AV76Wcpartesproduccionmaquinads_3_maqdsc = AV61MaqDsc ;
      AV77Wcpartesproduccionmaquinads_4_filterfulltext = AV69FilterFullText ;
      AV78Wcpartesproduccionmaquinads_5_hisprofec = AV62HisProFec ;
      AV79Wcpartesproduccionmaquinads_6_hisprofec_to = AV63HisProFec_To ;
      AV80Wcpartesproduccionmaquinads_7_tfhisprofec = AV12TFHisProFec ;
      AV81Wcpartesproduccionmaquinads_8_tfgruopecod = AV14TFGruOpeCod ;
      AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV15TFGruOpeCod_To ;
      AV83Wcpartesproduccionmaquinads_10_tfbarnhdr = AV67TFBarNHdr ;
      AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV68TFBarNHdr_Sel ;
      AV85Wcpartesproduccionmaquinads_12_tfclicod = AV18TFCliCod ;
      AV86Wcpartesproduccionmaquinads_13_tfclicod_to = AV19TFCliCod_To ;
      AV87Wcpartesproduccionmaquinads_14_tfclinom = AV20TFCliNom ;
      AV88Wcpartesproduccionmaquinads_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV89Wcpartesproduccionmaquinads_16_tfbarser = AV22TFBarSer ;
      AV90Wcpartesproduccionmaquinads_17_tfbarser_sel = AV23TFBarSer_Sel ;
      AV91Wcpartesproduccionmaquinads_18_tfbarserdsc = AV24TFBarSerDsc ;
      AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV93Wcpartesproduccionmaquinads_20_tfbarcolnom = AV26TFBarColNom ;
      AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV95Wcpartesproduccionmaquinads_22_tffase = AV28TFFase ;
      AV96Wcpartesproduccionmaquinads_23_tffase_sel = AV29TFFase_Sel ;
      AV97Wcpartesproduccionmaquinads_24_tffasedsc = AV30TFFaseDsc ;
      AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV31TFFaseDsc_Sel ;
      AV99Wcpartesproduccionmaquinads_26_tfhisprokgr = AV32TFHisProKgr ;
      AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV33TFHisProKgr_To ;
      AV101Wcpartesproduccionmaquinads_28_tfhispromtr = AV34TFHisProMtr ;
      AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV35TFHisProMtr_To ;
      AV103Wcpartesproduccionmaquinads_30_tfhisprotur = AV36TFHisProTur ;
      AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV37TFHisProTur_To ;
      AV105Wcpartesproduccionmaquinads_32_tfhisprodti = AV38TFHisProDTI ;
      AV106Wcpartesproduccionmaquinads_33_tfhisprodtf = AV40TFHisProDTF ;
      AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV65TFHisProTr2 ;
      AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV66TFHisProTr2_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV81Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV85Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV86Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV95Wcpartesproduccionmaquinads_22_tffase ,
                                           AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV103Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV107Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                           AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A606MaqDsc } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV97Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor P08DJ3 */
      pr_default.execute(1, new Object[] {AV74Wcpartesproduccionmaquinads_1_emprcod, AV75Wcpartesproduccionmaquinads_2_maqcod, AV76Wcpartesproduccionmaquinads_3_maqdsc, AV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV77Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV77Wcpartesproduccionmaquinads_4_filterfulltext, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV97Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV97Wcpartesproduccionmaquinads_24_tffasedsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV78Wcpartesproduccionmaquinads_5_hisprofec, AV79Wcpartesproduccionmaquinads_6_hisprofec_to, AV80Wcpartesproduccionmaquinads_7_tfhisprofec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8DJ3 = false ;
         A602MaqCod = P08DJ3_A602MaqCod[0] ;
         A606MaqDsc = P08DJ3_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ3_n606MaqDsc[0] ;
         A558HisProFec = P08DJ3_A558HisProFec[0] ;
         A396EmprCod = P08DJ3_A396EmprCod[0] ;
         A606MaqDsc = P08DJ3_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ3_n606MaqDsc[0] ;
         W606MaqDsc = A606MaqDsc ;
         n606MaqDsc = false ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08DJ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08DJ3_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(P08DJ3_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8DJ3 = false ;
            A558HisProFec = P08DJ3_A558HisProFec[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8DJ3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV46Option = A279CliNom ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A606MaqDsc = W606MaqDsc ;
         n606MaqDsc = false ;
         if ( ! brk8DJ3 )
         {
            brk8DJ3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarSer = AV42SearchTxt ;
      AV23TFBarSer_Sel = "" ;
      AV74Wcpartesproduccionmaquinads_1_emprcod = AV64Emprcod ;
      AV75Wcpartesproduccionmaquinads_2_maqcod = AV60MaqCod ;
      AV76Wcpartesproduccionmaquinads_3_maqdsc = AV61MaqDsc ;
      AV77Wcpartesproduccionmaquinads_4_filterfulltext = AV69FilterFullText ;
      AV78Wcpartesproduccionmaquinads_5_hisprofec = AV62HisProFec ;
      AV79Wcpartesproduccionmaquinads_6_hisprofec_to = AV63HisProFec_To ;
      AV80Wcpartesproduccionmaquinads_7_tfhisprofec = AV12TFHisProFec ;
      AV81Wcpartesproduccionmaquinads_8_tfgruopecod = AV14TFGruOpeCod ;
      AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV15TFGruOpeCod_To ;
      AV83Wcpartesproduccionmaquinads_10_tfbarnhdr = AV67TFBarNHdr ;
      AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV68TFBarNHdr_Sel ;
      AV85Wcpartesproduccionmaquinads_12_tfclicod = AV18TFCliCod ;
      AV86Wcpartesproduccionmaquinads_13_tfclicod_to = AV19TFCliCod_To ;
      AV87Wcpartesproduccionmaquinads_14_tfclinom = AV20TFCliNom ;
      AV88Wcpartesproduccionmaquinads_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV89Wcpartesproduccionmaquinads_16_tfbarser = AV22TFBarSer ;
      AV90Wcpartesproduccionmaquinads_17_tfbarser_sel = AV23TFBarSer_Sel ;
      AV91Wcpartesproduccionmaquinads_18_tfbarserdsc = AV24TFBarSerDsc ;
      AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV93Wcpartesproduccionmaquinads_20_tfbarcolnom = AV26TFBarColNom ;
      AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV95Wcpartesproduccionmaquinads_22_tffase = AV28TFFase ;
      AV96Wcpartesproduccionmaquinads_23_tffase_sel = AV29TFFase_Sel ;
      AV97Wcpartesproduccionmaquinads_24_tffasedsc = AV30TFFaseDsc ;
      AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV31TFFaseDsc_Sel ;
      AV99Wcpartesproduccionmaquinads_26_tfhisprokgr = AV32TFHisProKgr ;
      AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV33TFHisProKgr_To ;
      AV101Wcpartesproduccionmaquinads_28_tfhispromtr = AV34TFHisProMtr ;
      AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV35TFHisProMtr_To ;
      AV103Wcpartesproduccionmaquinads_30_tfhisprotur = AV36TFHisProTur ;
      AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV37TFHisProTur_To ;
      AV105Wcpartesproduccionmaquinads_32_tfhisprodti = AV38TFHisProDTI ;
      AV106Wcpartesproduccionmaquinads_33_tfhisprodtf = AV40TFHisProDTF ;
      AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV65TFHisProTr2 ;
      AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV66TFHisProTr2_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV81Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV85Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV86Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV95Wcpartesproduccionmaquinads_22_tffase ,
                                           AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV103Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV107Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                           AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A606MaqDsc } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV97Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor P08DJ4 */
      pr_default.execute(2, new Object[] {AV74Wcpartesproduccionmaquinads_1_emprcod, AV75Wcpartesproduccionmaquinads_2_maqcod, AV76Wcpartesproduccionmaquinads_3_maqdsc, AV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV77Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV77Wcpartesproduccionmaquinads_4_filterfulltext, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV97Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV97Wcpartesproduccionmaquinads_24_tffasedsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV78Wcpartesproduccionmaquinads_5_hisprofec, AV79Wcpartesproduccionmaquinads_6_hisprofec_to, AV80Wcpartesproduccionmaquinads_7_tfhisprofec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8DJ5 = false ;
         A602MaqCod = P08DJ4_A602MaqCod[0] ;
         A606MaqDsc = P08DJ4_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ4_n606MaqDsc[0] ;
         A558HisProFec = P08DJ4_A558HisProFec[0] ;
         A396EmprCod = P08DJ4_A396EmprCod[0] ;
         A606MaqDsc = P08DJ4_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ4_n606MaqDsc[0] ;
         W606MaqDsc = A606MaqDsc ;
         n606MaqDsc = false ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08DJ4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08DJ4_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(P08DJ4_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8DJ5 = false ;
            A558HisProFec = P08DJ4_A558HisProFec[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8DJ5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV46Option = A212BarSer ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A606MaqDsc = W606MaqDsc ;
         n606MaqDsc = false ;
         if ( ! brk8DJ5 )
         {
            brk8DJ5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarSerDsc = AV42SearchTxt ;
      AV25TFBarSerDsc_Sel = "" ;
      AV74Wcpartesproduccionmaquinads_1_emprcod = AV64Emprcod ;
      AV75Wcpartesproduccionmaquinads_2_maqcod = AV60MaqCod ;
      AV76Wcpartesproduccionmaquinads_3_maqdsc = AV61MaqDsc ;
      AV77Wcpartesproduccionmaquinads_4_filterfulltext = AV69FilterFullText ;
      AV78Wcpartesproduccionmaquinads_5_hisprofec = AV62HisProFec ;
      AV79Wcpartesproduccionmaquinads_6_hisprofec_to = AV63HisProFec_To ;
      AV80Wcpartesproduccionmaquinads_7_tfhisprofec = AV12TFHisProFec ;
      AV81Wcpartesproduccionmaquinads_8_tfgruopecod = AV14TFGruOpeCod ;
      AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV15TFGruOpeCod_To ;
      AV83Wcpartesproduccionmaquinads_10_tfbarnhdr = AV67TFBarNHdr ;
      AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV68TFBarNHdr_Sel ;
      AV85Wcpartesproduccionmaquinads_12_tfclicod = AV18TFCliCod ;
      AV86Wcpartesproduccionmaquinads_13_tfclicod_to = AV19TFCliCod_To ;
      AV87Wcpartesproduccionmaquinads_14_tfclinom = AV20TFCliNom ;
      AV88Wcpartesproduccionmaquinads_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV89Wcpartesproduccionmaquinads_16_tfbarser = AV22TFBarSer ;
      AV90Wcpartesproduccionmaquinads_17_tfbarser_sel = AV23TFBarSer_Sel ;
      AV91Wcpartesproduccionmaquinads_18_tfbarserdsc = AV24TFBarSerDsc ;
      AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV93Wcpartesproduccionmaquinads_20_tfbarcolnom = AV26TFBarColNom ;
      AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV95Wcpartesproduccionmaquinads_22_tffase = AV28TFFase ;
      AV96Wcpartesproduccionmaquinads_23_tffase_sel = AV29TFFase_Sel ;
      AV97Wcpartesproduccionmaquinads_24_tffasedsc = AV30TFFaseDsc ;
      AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV31TFFaseDsc_Sel ;
      AV99Wcpartesproduccionmaquinads_26_tfhisprokgr = AV32TFHisProKgr ;
      AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV33TFHisProKgr_To ;
      AV101Wcpartesproduccionmaquinads_28_tfhispromtr = AV34TFHisProMtr ;
      AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV35TFHisProMtr_To ;
      AV103Wcpartesproduccionmaquinads_30_tfhisprotur = AV36TFHisProTur ;
      AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV37TFHisProTur_To ;
      AV105Wcpartesproduccionmaquinads_32_tfhisprodti = AV38TFHisProDTI ;
      AV106Wcpartesproduccionmaquinads_33_tfhisprodtf = AV40TFHisProDTF ;
      AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV65TFHisProTr2 ;
      AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV66TFHisProTr2_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV81Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV85Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV86Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV95Wcpartesproduccionmaquinads_22_tffase ,
                                           AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV103Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV107Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                           AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A606MaqDsc } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV97Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor P08DJ5 */
      pr_default.execute(3, new Object[] {AV74Wcpartesproduccionmaquinads_1_emprcod, AV75Wcpartesproduccionmaquinads_2_maqcod, AV76Wcpartesproduccionmaquinads_3_maqdsc, AV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV77Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV77Wcpartesproduccionmaquinads_4_filterfulltext, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV97Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV97Wcpartesproduccionmaquinads_24_tffasedsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV78Wcpartesproduccionmaquinads_5_hisprofec, AV79Wcpartesproduccionmaquinads_6_hisprofec_to, AV80Wcpartesproduccionmaquinads_7_tfhisprofec});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8DJ7 = false ;
         A602MaqCod = P08DJ5_A602MaqCod[0] ;
         A606MaqDsc = P08DJ5_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ5_n606MaqDsc[0] ;
         A558HisProFec = P08DJ5_A558HisProFec[0] ;
         A396EmprCod = P08DJ5_A396EmprCod[0] ;
         A606MaqDsc = P08DJ5_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ5_n606MaqDsc[0] ;
         W606MaqDsc = A606MaqDsc ;
         n606MaqDsc = false ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08DJ5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08DJ5_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(P08DJ5_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8DJ7 = false ;
            A558HisProFec = P08DJ5_A558HisProFec[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8DJ7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV46Option = A1652BarSerDsc ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A606MaqDsc = W606MaqDsc ;
         n606MaqDsc = false ;
         if ( ! brk8DJ7 )
         {
            brk8DJ7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFBarColNom = AV42SearchTxt ;
      AV27TFBarColNom_Sel = "" ;
      AV74Wcpartesproduccionmaquinads_1_emprcod = AV64Emprcod ;
      AV75Wcpartesproduccionmaquinads_2_maqcod = AV60MaqCod ;
      AV76Wcpartesproduccionmaquinads_3_maqdsc = AV61MaqDsc ;
      AV77Wcpartesproduccionmaquinads_4_filterfulltext = AV69FilterFullText ;
      AV78Wcpartesproduccionmaquinads_5_hisprofec = AV62HisProFec ;
      AV79Wcpartesproduccionmaquinads_6_hisprofec_to = AV63HisProFec_To ;
      AV80Wcpartesproduccionmaquinads_7_tfhisprofec = AV12TFHisProFec ;
      AV81Wcpartesproduccionmaquinads_8_tfgruopecod = AV14TFGruOpeCod ;
      AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV15TFGruOpeCod_To ;
      AV83Wcpartesproduccionmaquinads_10_tfbarnhdr = AV67TFBarNHdr ;
      AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV68TFBarNHdr_Sel ;
      AV85Wcpartesproduccionmaquinads_12_tfclicod = AV18TFCliCod ;
      AV86Wcpartesproduccionmaquinads_13_tfclicod_to = AV19TFCliCod_To ;
      AV87Wcpartesproduccionmaquinads_14_tfclinom = AV20TFCliNom ;
      AV88Wcpartesproduccionmaquinads_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV89Wcpartesproduccionmaquinads_16_tfbarser = AV22TFBarSer ;
      AV90Wcpartesproduccionmaquinads_17_tfbarser_sel = AV23TFBarSer_Sel ;
      AV91Wcpartesproduccionmaquinads_18_tfbarserdsc = AV24TFBarSerDsc ;
      AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV93Wcpartesproduccionmaquinads_20_tfbarcolnom = AV26TFBarColNom ;
      AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV95Wcpartesproduccionmaquinads_22_tffase = AV28TFFase ;
      AV96Wcpartesproduccionmaquinads_23_tffase_sel = AV29TFFase_Sel ;
      AV97Wcpartesproduccionmaquinads_24_tffasedsc = AV30TFFaseDsc ;
      AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV31TFFaseDsc_Sel ;
      AV99Wcpartesproduccionmaquinads_26_tfhisprokgr = AV32TFHisProKgr ;
      AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV33TFHisProKgr_To ;
      AV101Wcpartesproduccionmaquinads_28_tfhispromtr = AV34TFHisProMtr ;
      AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV35TFHisProMtr_To ;
      AV103Wcpartesproduccionmaquinads_30_tfhisprotur = AV36TFHisProTur ;
      AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV37TFHisProTur_To ;
      AV105Wcpartesproduccionmaquinads_32_tfhisprodti = AV38TFHisProDTI ;
      AV106Wcpartesproduccionmaquinads_33_tfhisprodtf = AV40TFHisProDTF ;
      AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV65TFHisProTr2 ;
      AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV66TFHisProTr2_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV81Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV85Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV86Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV95Wcpartesproduccionmaquinads_22_tffase ,
                                           AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV103Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV107Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                           AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A606MaqDsc } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV97Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor P08DJ6 */
      pr_default.execute(4, new Object[] {AV74Wcpartesproduccionmaquinads_1_emprcod, AV75Wcpartesproduccionmaquinads_2_maqcod, AV76Wcpartesproduccionmaquinads_3_maqdsc, AV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV77Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV77Wcpartesproduccionmaquinads_4_filterfulltext, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV97Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV97Wcpartesproduccionmaquinads_24_tffasedsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV78Wcpartesproduccionmaquinads_5_hisprofec, AV79Wcpartesproduccionmaquinads_6_hisprofec_to, AV80Wcpartesproduccionmaquinads_7_tfhisprofec});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8DJ9 = false ;
         A602MaqCod = P08DJ6_A602MaqCod[0] ;
         A606MaqDsc = P08DJ6_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ6_n606MaqDsc[0] ;
         A558HisProFec = P08DJ6_A558HisProFec[0] ;
         A396EmprCod = P08DJ6_A396EmprCod[0] ;
         A606MaqDsc = P08DJ6_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ6_n606MaqDsc[0] ;
         W606MaqDsc = A606MaqDsc ;
         n606MaqDsc = false ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08DJ6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08DJ6_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(P08DJ6_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8DJ9 = false ;
            A558HisProFec = P08DJ6_A558HisProFec[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8DJ9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV46Option = A135BarColNom ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A606MaqDsc = W606MaqDsc ;
         n606MaqDsc = false ;
         if ( ! brk8DJ9 )
         {
            brk8DJ9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFASEOPTIONS' Routine */
      returnInSub = false ;
      AV28TFFase = AV42SearchTxt ;
      AV29TFFase_Sel = "" ;
      AV74Wcpartesproduccionmaquinads_1_emprcod = AV64Emprcod ;
      AV75Wcpartesproduccionmaquinads_2_maqcod = AV60MaqCod ;
      AV76Wcpartesproduccionmaquinads_3_maqdsc = AV61MaqDsc ;
      AV77Wcpartesproduccionmaquinads_4_filterfulltext = AV69FilterFullText ;
      AV78Wcpartesproduccionmaquinads_5_hisprofec = AV62HisProFec ;
      AV79Wcpartesproduccionmaquinads_6_hisprofec_to = AV63HisProFec_To ;
      AV80Wcpartesproduccionmaquinads_7_tfhisprofec = AV12TFHisProFec ;
      AV81Wcpartesproduccionmaquinads_8_tfgruopecod = AV14TFGruOpeCod ;
      AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV15TFGruOpeCod_To ;
      AV83Wcpartesproduccionmaquinads_10_tfbarnhdr = AV67TFBarNHdr ;
      AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV68TFBarNHdr_Sel ;
      AV85Wcpartesproduccionmaquinads_12_tfclicod = AV18TFCliCod ;
      AV86Wcpartesproduccionmaquinads_13_tfclicod_to = AV19TFCliCod_To ;
      AV87Wcpartesproduccionmaquinads_14_tfclinom = AV20TFCliNom ;
      AV88Wcpartesproduccionmaquinads_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV89Wcpartesproduccionmaquinads_16_tfbarser = AV22TFBarSer ;
      AV90Wcpartesproduccionmaquinads_17_tfbarser_sel = AV23TFBarSer_Sel ;
      AV91Wcpartesproduccionmaquinads_18_tfbarserdsc = AV24TFBarSerDsc ;
      AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV93Wcpartesproduccionmaquinads_20_tfbarcolnom = AV26TFBarColNom ;
      AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV95Wcpartesproduccionmaquinads_22_tffase = AV28TFFase ;
      AV96Wcpartesproduccionmaquinads_23_tffase_sel = AV29TFFase_Sel ;
      AV97Wcpartesproduccionmaquinads_24_tffasedsc = AV30TFFaseDsc ;
      AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV31TFFaseDsc_Sel ;
      AV99Wcpartesproduccionmaquinads_26_tfhisprokgr = AV32TFHisProKgr ;
      AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV33TFHisProKgr_To ;
      AV101Wcpartesproduccionmaquinads_28_tfhispromtr = AV34TFHisProMtr ;
      AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV35TFHisProMtr_To ;
      AV103Wcpartesproduccionmaquinads_30_tfhisprotur = AV36TFHisProTur ;
      AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV37TFHisProTur_To ;
      AV105Wcpartesproduccionmaquinads_32_tfhisprodti = AV38TFHisProDTI ;
      AV106Wcpartesproduccionmaquinads_33_tfhisprodtf = AV40TFHisProDTF ;
      AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV65TFHisProTr2 ;
      AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV66TFHisProTr2_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV81Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV85Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV86Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV95Wcpartesproduccionmaquinads_22_tffase ,
                                           AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV103Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV107Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                           AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A606MaqDsc } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV97Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor P08DJ7 */
      pr_default.execute(5, new Object[] {AV74Wcpartesproduccionmaquinads_1_emprcod, AV75Wcpartesproduccionmaquinads_2_maqcod, AV76Wcpartesproduccionmaquinads_3_maqdsc, AV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV77Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV77Wcpartesproduccionmaquinads_4_filterfulltext, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV97Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV97Wcpartesproduccionmaquinads_24_tffasedsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV78Wcpartesproduccionmaquinads_5_hisprofec, AV79Wcpartesproduccionmaquinads_6_hisprofec_to, AV80Wcpartesproduccionmaquinads_7_tfhisprofec});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8DJ11 = false ;
         A602MaqCod = P08DJ7_A602MaqCod[0] ;
         A606MaqDsc = P08DJ7_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ7_n606MaqDsc[0] ;
         A558HisProFec = P08DJ7_A558HisProFec[0] ;
         A396EmprCod = P08DJ7_A396EmprCod[0] ;
         A606MaqDsc = P08DJ7_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ7_n606MaqDsc[0] ;
         W606MaqDsc = A606MaqDsc ;
         n606MaqDsc = false ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08DJ7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08DJ7_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(P08DJ7_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8DJ11 = false ;
            A558HisProFec = P08DJ7_A558HisProFec[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8DJ11 = true ;
            pr_default.readNext(5);
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
         A606MaqDsc = W606MaqDsc ;
         n606MaqDsc = false ;
         if ( ! brk8DJ11 )
         {
            brk8DJ11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADFASEDSCOPTIONS' Routine */
      returnInSub = false ;
      AV30TFFaseDsc = AV42SearchTxt ;
      AV31TFFaseDsc_Sel = "" ;
      AV74Wcpartesproduccionmaquinads_1_emprcod = AV64Emprcod ;
      AV75Wcpartesproduccionmaquinads_2_maqcod = AV60MaqCod ;
      AV76Wcpartesproduccionmaquinads_3_maqdsc = AV61MaqDsc ;
      AV77Wcpartesproduccionmaquinads_4_filterfulltext = AV69FilterFullText ;
      AV78Wcpartesproduccionmaquinads_5_hisprofec = AV62HisProFec ;
      AV79Wcpartesproduccionmaquinads_6_hisprofec_to = AV63HisProFec_To ;
      AV80Wcpartesproduccionmaquinads_7_tfhisprofec = AV12TFHisProFec ;
      AV81Wcpartesproduccionmaquinads_8_tfgruopecod = AV14TFGruOpeCod ;
      AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV15TFGruOpeCod_To ;
      AV83Wcpartesproduccionmaquinads_10_tfbarnhdr = AV67TFBarNHdr ;
      AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV68TFBarNHdr_Sel ;
      AV85Wcpartesproduccionmaquinads_12_tfclicod = AV18TFCliCod ;
      AV86Wcpartesproduccionmaquinads_13_tfclicod_to = AV19TFCliCod_To ;
      AV87Wcpartesproduccionmaquinads_14_tfclinom = AV20TFCliNom ;
      AV88Wcpartesproduccionmaquinads_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV89Wcpartesproduccionmaquinads_16_tfbarser = AV22TFBarSer ;
      AV90Wcpartesproduccionmaquinads_17_tfbarser_sel = AV23TFBarSer_Sel ;
      AV91Wcpartesproduccionmaquinads_18_tfbarserdsc = AV24TFBarSerDsc ;
      AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV93Wcpartesproduccionmaquinads_20_tfbarcolnom = AV26TFBarColNom ;
      AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV95Wcpartesproduccionmaquinads_22_tffase = AV28TFFase ;
      AV96Wcpartesproduccionmaquinads_23_tffase_sel = AV29TFFase_Sel ;
      AV97Wcpartesproduccionmaquinads_24_tffasedsc = AV30TFFaseDsc ;
      AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV31TFFaseDsc_Sel ;
      AV99Wcpartesproduccionmaquinads_26_tfhisprokgr = AV32TFHisProKgr ;
      AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV33TFHisProKgr_To ;
      AV101Wcpartesproduccionmaquinads_28_tfhispromtr = AV34TFHisProMtr ;
      AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV35TFHisProMtr_To ;
      AV103Wcpartesproduccionmaquinads_30_tfhisprotur = AV36TFHisProTur ;
      AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV37TFHisProTur_To ;
      AV105Wcpartesproduccionmaquinads_32_tfhisprodti = AV38TFHisProDTI ;
      AV106Wcpartesproduccionmaquinads_33_tfhisprodtf = AV40TFHisProDTF ;
      AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV65TFHisProTr2 ;
      AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV66TFHisProTr2_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV81Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV85Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV86Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV95Wcpartesproduccionmaquinads_22_tffase ,
                                           AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV103Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV107Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           A606MaqDsc ,
                                           AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                           AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                           A396EmprCod ,
                                           A602MaqCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV97Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV97Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor P08DJ8 */
      pr_default.execute(6, new Object[] {AV74Wcpartesproduccionmaquinads_1_emprcod, AV75Wcpartesproduccionmaquinads_2_maqcod, AV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV77Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV77Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV77Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV77Wcpartesproduccionmaquinads_4_filterfulltext, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV97Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV97Wcpartesproduccionmaquinads_24_tffasedsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV76Wcpartesproduccionmaquinads_3_maqdsc, AV78Wcpartesproduccionmaquinads_5_hisprofec, AV79Wcpartesproduccionmaquinads_6_hisprofec_to, AV80Wcpartesproduccionmaquinads_7_tfhisprofec});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A558HisProFec = P08DJ8_A558HisProFec[0] ;
         A606MaqDsc = P08DJ8_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ8_n606MaqDsc[0] ;
         A602MaqCod = P08DJ8_A602MaqCod[0] ;
         A396EmprCod = P08DJ8_A396EmprCod[0] ;
         A606MaqDsc = P08DJ8_A606MaqDsc[0] ;
         n606MaqDsc = P08DJ8_n606MaqDsc[0] ;
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
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcpartesproduccionmaquinagetfilterdata.this.AV48OptionsJson;
      this.aP4[0] = wcpartesproduccionmaquinagetfilterdata.this.AV51OptionsDescJson;
      this.aP5[0] = wcpartesproduccionmaquinagetfilterdata.this.AV53OptionIndexesJson;
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
      AV69FilterFullText = "" ;
      AV62HisProFec = GXutil.nullDate() ;
      AV63HisProFec_To = GXutil.nullDate() ;
      AV12TFHisProFec = GXutil.nullDate() ;
      AV67TFBarNHdr = "" ;
      AV68TFBarNHdr_Sel = "" ;
      AV20TFCliNom = "" ;
      AV21TFCliNom_Sel = "" ;
      AV22TFBarSer = "" ;
      AV23TFBarSer_Sel = "" ;
      AV24TFBarSerDsc = "" ;
      AV25TFBarSerDsc_Sel = "" ;
      AV26TFBarColNom = "" ;
      AV27TFBarColNom_Sel = "" ;
      AV28TFFase = "" ;
      AV29TFFase_Sel = "" ;
      AV30TFFaseDsc = "" ;
      AV31TFFaseDsc_Sel = "" ;
      AV32TFHisProKgr = DecimalUtil.ZERO ;
      AV33TFHisProKgr_To = DecimalUtil.ZERO ;
      AV34TFHisProMtr = DecimalUtil.ZERO ;
      AV35TFHisProMtr_To = DecimalUtil.ZERO ;
      AV38TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV40TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV64Emprcod = "" ;
      AV60MaqCod = "" ;
      AV61MaqDsc = "" ;
      A13696BarNHdr = "" ;
      AV74Wcpartesproduccionmaquinads_1_emprcod = "" ;
      AV75Wcpartesproduccionmaquinads_2_maqcod = "" ;
      AV76Wcpartesproduccionmaquinads_3_maqdsc = "" ;
      AV77Wcpartesproduccionmaquinads_4_filterfulltext = "" ;
      AV78Wcpartesproduccionmaquinads_5_hisprofec = GXutil.nullDate() ;
      AV79Wcpartesproduccionmaquinads_6_hisprofec_to = GXutil.nullDate() ;
      AV80Wcpartesproduccionmaquinads_7_tfhisprofec = GXutil.nullDate() ;
      AV83Wcpartesproduccionmaquinads_10_tfbarnhdr = "" ;
      AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = "" ;
      AV87Wcpartesproduccionmaquinads_14_tfclinom = "" ;
      AV88Wcpartesproduccionmaquinads_15_tfclinom_sel = "" ;
      AV89Wcpartesproduccionmaquinads_16_tfbarser = "" ;
      AV90Wcpartesproduccionmaquinads_17_tfbarser_sel = "" ;
      AV91Wcpartesproduccionmaquinads_18_tfbarserdsc = "" ;
      AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = "" ;
      AV93Wcpartesproduccionmaquinads_20_tfbarcolnom = "" ;
      AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = "" ;
      AV95Wcpartesproduccionmaquinads_22_tffase = "" ;
      AV96Wcpartesproduccionmaquinads_23_tffase_sel = "" ;
      AV97Wcpartesproduccionmaquinads_24_tffasedsc = "" ;
      AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel = "" ;
      AV99Wcpartesproduccionmaquinads_26_tfhisprokgr = DecimalUtil.ZERO ;
      AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV101Wcpartesproduccionmaquinads_28_tfhispromtr = DecimalUtil.ZERO ;
      AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to = DecimalUtil.ZERO ;
      AV105Wcpartesproduccionmaquinads_32_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV106Wcpartesproduccionmaquinads_33_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      lV77Wcpartesproduccionmaquinads_4_filterfulltext = "" ;
      lV97Wcpartesproduccionmaquinads_24_tffasedsc = "" ;
      scmdbuf = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A461Fase = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A7258FaseDsc = "" ;
      A606MaqDsc = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P08DJ2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DJ2_A606MaqDsc = new String[] {""} ;
      P08DJ2_n606MaqDsc = new boolean[] {false} ;
      P08DJ2_A602MaqCod = new String[] {""} ;
      P08DJ2_A396EmprCod = new String[] {""} ;
      AV46Option = "" ;
      P08DJ3_A602MaqCod = new String[] {""} ;
      P08DJ3_A606MaqDsc = new String[] {""} ;
      P08DJ3_n606MaqDsc = new boolean[] {false} ;
      P08DJ3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DJ3_A396EmprCod = new String[] {""} ;
      W606MaqDsc = "" ;
      P08DJ4_A602MaqCod = new String[] {""} ;
      P08DJ4_A606MaqDsc = new String[] {""} ;
      P08DJ4_n606MaqDsc = new boolean[] {false} ;
      P08DJ4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DJ4_A396EmprCod = new String[] {""} ;
      P08DJ5_A602MaqCod = new String[] {""} ;
      P08DJ5_A606MaqDsc = new String[] {""} ;
      P08DJ5_n606MaqDsc = new boolean[] {false} ;
      P08DJ5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DJ5_A396EmprCod = new String[] {""} ;
      P08DJ6_A602MaqCod = new String[] {""} ;
      P08DJ6_A606MaqDsc = new String[] {""} ;
      P08DJ6_n606MaqDsc = new boolean[] {false} ;
      P08DJ6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DJ6_A396EmprCod = new String[] {""} ;
      P08DJ7_A602MaqCod = new String[] {""} ;
      P08DJ7_A606MaqDsc = new String[] {""} ;
      P08DJ7_n606MaqDsc = new boolean[] {false} ;
      P08DJ7_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DJ7_A396EmprCod = new String[] {""} ;
      P08DJ8_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DJ8_A606MaqDsc = new String[] {""} ;
      P08DJ8_n606MaqDsc = new boolean[] {false} ;
      P08DJ8_A602MaqCod = new String[] {""} ;
      P08DJ8_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcpartesproduccionmaquinagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08DJ2_A558HisProFec, P08DJ2_A606MaqDsc, P08DJ2_n606MaqDsc, P08DJ2_A602MaqCod, P08DJ2_A396EmprCod
            }
            , new Object[] {
            P08DJ3_A602MaqCod, P08DJ3_A606MaqDsc, P08DJ3_n606MaqDsc, P08DJ3_A558HisProFec, P08DJ3_A396EmprCod
            }
            , new Object[] {
            P08DJ4_A602MaqCod, P08DJ4_A606MaqDsc, P08DJ4_n606MaqDsc, P08DJ4_A558HisProFec, P08DJ4_A396EmprCod
            }
            , new Object[] {
            P08DJ5_A602MaqCod, P08DJ5_A606MaqDsc, P08DJ5_n606MaqDsc, P08DJ5_A558HisProFec, P08DJ5_A396EmprCod
            }
            , new Object[] {
            P08DJ6_A602MaqCod, P08DJ6_A606MaqDsc, P08DJ6_n606MaqDsc, P08DJ6_A558HisProFec, P08DJ6_A396EmprCod
            }
            , new Object[] {
            P08DJ7_A602MaqCod, P08DJ7_A606MaqDsc, P08DJ7_n606MaqDsc, P08DJ7_A558HisProFec, P08DJ7_A396EmprCod
            }
            , new Object[] {
            P08DJ8_A558HisProFec, P08DJ8_A606MaqDsc, P08DJ8_n606MaqDsc, P08DJ8_A602MaqCod, P08DJ8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV36TFHisProTur ;
   private byte AV37TFHisProTur_To ;
   private byte AV103Wcpartesproduccionmaquinads_30_tfhisprotur ;
   private byte AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private short AV65TFHisProTr2 ;
   private short AV66TFHisProTr2_To ;
   private short AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 ;
   private short AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to ;
   private short A5605HisProTr2 ;
   private short Gx_err ;
   private int AV72GXV1 ;
   private int AV14TFGruOpeCod ;
   private int AV15TFGruOpeCod_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV81Wcpartesproduccionmaquinads_8_tfgruopecod ;
   private int AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to ;
   private int AV85Wcpartesproduccionmaquinads_12_tfclicod ;
   private int AV86Wcpartesproduccionmaquinads_13_tfclicod_to ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV45InsertIndex ;
   private long AV54count ;
   private java.math.BigDecimal AV32TFHisProKgr ;
   private java.math.BigDecimal AV33TFHisProKgr_To ;
   private java.math.BigDecimal AV34TFHisProMtr ;
   private java.math.BigDecimal AV35TFHisProMtr_To ;
   private java.math.BigDecimal AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ;
   private java.math.BigDecimal AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ;
   private java.math.BigDecimal AV101Wcpartesproduccionmaquinads_28_tfhispromtr ;
   private java.math.BigDecimal AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV67TFBarNHdr ;
   private String AV68TFBarNHdr_Sel ;
   private String AV20TFCliNom ;
   private String AV21TFCliNom_Sel ;
   private String AV22TFBarSer ;
   private String AV23TFBarSer_Sel ;
   private String AV24TFBarSerDsc ;
   private String AV25TFBarSerDsc_Sel ;
   private String AV26TFBarColNom ;
   private String AV27TFBarColNom_Sel ;
   private String AV28TFFase ;
   private String AV29TFFase_Sel ;
   private String AV30TFFaseDsc ;
   private String AV31TFFaseDsc_Sel ;
   private String AV64Emprcod ;
   private String AV60MaqCod ;
   private String AV61MaqDsc ;
   private String A13696BarNHdr ;
   private String AV74Wcpartesproduccionmaquinads_1_emprcod ;
   private String AV75Wcpartesproduccionmaquinads_2_maqcod ;
   private String AV76Wcpartesproduccionmaquinads_3_maqdsc ;
   private String AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ;
   private String AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ;
   private String AV87Wcpartesproduccionmaquinads_14_tfclinom ;
   private String AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ;
   private String AV89Wcpartesproduccionmaquinads_16_tfbarser ;
   private String AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ;
   private String AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ;
   private String AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ;
   private String AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ;
   private String AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ;
   private String AV95Wcpartesproduccionmaquinads_22_tffase ;
   private String AV96Wcpartesproduccionmaquinads_23_tffase_sel ;
   private String AV97Wcpartesproduccionmaquinads_24_tffasedsc ;
   private String AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ;
   private String lV97Wcpartesproduccionmaquinads_24_tffasedsc ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String A606MaqDsc ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String W606MaqDsc ;
   private java.util.Date AV38TFHisProDTI ;
   private java.util.Date AV40TFHisProDTF ;
   private java.util.Date AV105Wcpartesproduccionmaquinads_32_tfhisprodti ;
   private java.util.Date AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ;
   private java.util.Date AV62HisProFec ;
   private java.util.Date AV63HisProFec_To ;
   private java.util.Date AV12TFHisProFec ;
   private java.util.Date AV78Wcpartesproduccionmaquinads_5_hisprofec ;
   private java.util.Date AV79Wcpartesproduccionmaquinads_6_hisprofec_to ;
   private java.util.Date AV80Wcpartesproduccionmaquinads_7_tfhisprofec ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n606MaqDsc ;
   private boolean brk8DJ3 ;
   private boolean brk8DJ5 ;
   private boolean brk8DJ7 ;
   private boolean brk8DJ9 ;
   private boolean brk8DJ11 ;
   private String AV48OptionsJson ;
   private String AV51OptionsDescJson ;
   private String AV53OptionIndexesJson ;
   private String AV44DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV69FilterFullText ;
   private String AV77Wcpartesproduccionmaquinads_4_filterfulltext ;
   private String lV77Wcpartesproduccionmaquinads_4_filterfulltext ;
   private String AV46Option ;
   private com.genexus.webpanels.WebSession AV55Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08DJ2_A558HisProFec ;
   private String[] P08DJ2_A606MaqDsc ;
   private boolean[] P08DJ2_n606MaqDsc ;
   private String[] P08DJ2_A602MaqCod ;
   private String[] P08DJ2_A396EmprCod ;
   private String[] P08DJ3_A602MaqCod ;
   private String[] P08DJ3_A606MaqDsc ;
   private boolean[] P08DJ3_n606MaqDsc ;
   private java.util.Date[] P08DJ3_A558HisProFec ;
   private String[] P08DJ3_A396EmprCod ;
   private String[] P08DJ4_A602MaqCod ;
   private String[] P08DJ4_A606MaqDsc ;
   private boolean[] P08DJ4_n606MaqDsc ;
   private java.util.Date[] P08DJ4_A558HisProFec ;
   private String[] P08DJ4_A396EmprCod ;
   private String[] P08DJ5_A602MaqCod ;
   private String[] P08DJ5_A606MaqDsc ;
   private boolean[] P08DJ5_n606MaqDsc ;
   private java.util.Date[] P08DJ5_A558HisProFec ;
   private String[] P08DJ5_A396EmprCod ;
   private String[] P08DJ6_A602MaqCod ;
   private String[] P08DJ6_A606MaqDsc ;
   private boolean[] P08DJ6_n606MaqDsc ;
   private java.util.Date[] P08DJ6_A558HisProFec ;
   private String[] P08DJ6_A396EmprCod ;
   private String[] P08DJ7_A602MaqCod ;
   private String[] P08DJ7_A606MaqDsc ;
   private boolean[] P08DJ7_n606MaqDsc ;
   private java.util.Date[] P08DJ7_A558HisProFec ;
   private String[] P08DJ7_A396EmprCod ;
   private java.util.Date[] P08DJ8_A558HisProFec ;
   private String[] P08DJ8_A606MaqDsc ;
   private boolean[] P08DJ8_n606MaqDsc ;
   private String[] P08DJ8_A602MaqCod ;
   private String[] P08DJ8_A396EmprCod ;
   private GXSimpleCollection<String> AV47Options ;
   private GXSimpleCollection<String> AV50OptionsDesc ;
   private GXSimpleCollection<String> AV52OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV57GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV58GridStateFilterValue ;
}

final  class wcpartesproduccionmaquinagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV81Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV85Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV86Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV95Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV103Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String A606MaqDsc ,
                                          String AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[40];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T2.MaqDsc, T1.MaqCod, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(T2.MaqDsc = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08DJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV81Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV85Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV86Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV95Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV103Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                          String AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[40];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T2.MaqDsc, T1.HisProFec, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T2.MaqDsc = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08DJ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV81Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV85Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV86Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV95Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV103Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                          String AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[40];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T2.MaqDsc, T1.HisProFec, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T2.MaqDsc = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08DJ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV81Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV85Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV86Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV95Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV103Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                          String AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[40];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T2.MaqDsc, T1.HisProFec, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T2.MaqDsc = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08DJ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV81Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV85Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV86Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV95Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV103Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                          String AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[40];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T2.MaqDsc, T1.HisProFec, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T2.MaqDsc = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08DJ7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV81Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV85Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV86Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV95Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV103Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                          String AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[40];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T2.MaqDsc, T1.HisProFec, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T2.MaqDsc = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08DJ8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV78Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV79Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV80Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV81Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV82Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV84Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV83Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV85Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV86Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV88Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV87Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV90Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV89Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV92Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV91Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV94Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV93Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV96Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV95Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV99Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV100Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV101Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV102Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV103Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV104Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV105Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV106Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV107Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV108Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String AV77Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV98Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV97Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String A606MaqDsc ,
                                          String AV76Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String AV74Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV75Wcpartesproduccionmaquinads_2_maqcod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[40];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T2.MaqDsc, T1.MaqCod, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(T2.MaqDsc = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
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
                  return conditional_P08DJ2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 1 :
                  return conditional_P08DJ3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 2 :
                  return conditional_P08DJ4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 3 :
                  return conditional_P08DJ5(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 4 :
                  return conditional_P08DJ6(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 5 :
                  return conditional_P08DJ7(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 6 :
                  return conditional_P08DJ8(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DJ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DJ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DJ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DJ7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DJ8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 28);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 28);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 28);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 28);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 28);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 28);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
      }
   }

}

